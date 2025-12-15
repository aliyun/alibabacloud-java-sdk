// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20240730;

import com.aliyun.tea.*;
import com.aliyun.ehpc20240730.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ehpc", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>The ECS instances must meet the following requirements:</p>
     * <ul>
     * <li>The ECS instances do not belong to any E-HPC cluster.</li>
     * <li>The ECS instances reside in the same virtual private cloud (VPC) as the cluster.</li>
     * <li>The ECS instances are in the Stopped state.
     * Take of the following limits:</li>
     * <li>You can specify multiple instance IDs to add them at a time. However, the instances must be of the same type.</li>
     * <li>When an instance is added to the cluster, <a href="https://help.aliyun.com/zh/ecs/user-guide/re-initialize-a-system-disk">the system disk is reset</a> by using the image specified by the input parameters.</li>
     * <li>If the instance has data disks, they are not automatically created and mounted after the instance is added.</li>
     * <li>The hostname of the instance remains the same. Therefore, you must ensure that the hostname of the instance to be added is different from the hostname of an existing node in the cluster.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds Elastic Compute Service (ECS) instances as compute nodes to Elastic High Performance Computing (E-HPC) clusters.</p>
     * 
     * @param tmpReq AttachNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachNodesResponse
     */
    public AttachNodesResponse attachNodesWithOptions(AttachNodesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AttachNodesShrinkRequest request = new AttachNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.computeNode)) {
            request.computeNodeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.computeNode, "ComputeNode", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.computeNodeShrink)) {
            query.put("ComputeNode", request.computeNodeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachNodes"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachNodesResponse());
    }

    /**
     * <b>description</b> :
     * <p>The ECS instances must meet the following requirements:</p>
     * <ul>
     * <li>The ECS instances do not belong to any E-HPC cluster.</li>
     * <li>The ECS instances reside in the same virtual private cloud (VPC) as the cluster.</li>
     * <li>The ECS instances are in the Stopped state.
     * Take of the following limits:</li>
     * <li>You can specify multiple instance IDs to add them at a time. However, the instances must be of the same type.</li>
     * <li>When an instance is added to the cluster, <a href="https://help.aliyun.com/zh/ecs/user-guide/re-initialize-a-system-disk">the system disk is reset</a> by using the image specified by the input parameters.</li>
     * <li>If the instance has data disks, they are not automatically created and mounted after the instance is added.</li>
     * <li>The hostname of the instance remains the same. Therefore, you must ensure that the hostname of the instance to be added is different from the hostname of an existing node in the cluster.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds Elastic Compute Service (ECS) instances as compute nodes to Elastic High Performance Computing (E-HPC) clusters.</p>
     * 
     * @param request AttachNodesRequest
     * @return AttachNodesResponse
     */
    public AttachNodesResponse attachNodes(AttachNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachNodesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The file system that you want to attach must be created in advance in the same virtual private cloud (VPC) as the destination cluster. For more information, see <a href="https://help.aliyun.com/document_detail/27530.html">Create a file system</a> and <a href="https://help.aliyun.com/document_detail/27531.html">Manage mount targets</a>.</li>
     * <li>E-HPC clusters support Apsara File Storage NAS file systems.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches shared storage to an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param tmpReq AttachSharedStoragesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachSharedStoragesResponse
     */
    public AttachSharedStoragesResponse attachSharedStoragesWithOptions(AttachSharedStoragesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AttachSharedStoragesShrinkRequest request = new AttachSharedStoragesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sharedStorages)) {
            request.sharedStoragesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sharedStorages, "SharedStorages", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharedStoragesShrink)) {
            query.put("SharedStorages", request.sharedStoragesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachSharedStorages"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachSharedStoragesResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The file system that you want to attach must be created in advance in the same virtual private cloud (VPC) as the destination cluster. For more information, see <a href="https://help.aliyun.com/document_detail/27530.html">Create a file system</a> and <a href="https://help.aliyun.com/document_detail/27531.html">Manage mount targets</a>.</li>
     * <li>E-HPC clusters support Apsara File Storage NAS file systems.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Attaches shared storage to an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request AttachSharedStoragesRequest
     * @return AttachSharedStoragesResponse
     */
    public AttachSharedStoragesResponse attachSharedStorages(AttachSharedStoragesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachSharedStoragesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you call this operation, make sure that you are familiar with the billing and pricing of E-HPC. For more information, see <a href="https://help.aliyun.com/document_detail/2842985.html">Overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a pay-as-you-go or subscription Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param tmpReq CreateClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateClusterShrinkRequest request = new CreateClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.additionalPackages)) {
            request.additionalPackagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.additionalPackages, "AdditionalPackages", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addons)) {
            request.addonsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addons, "Addons", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clusterCredentials)) {
            request.clusterCredentialsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clusterCredentials, "ClusterCredentials", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clusterCustomConfiguration)) {
            request.clusterCustomConfigurationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clusterCustomConfiguration, "ClusterCustomConfiguration", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.manager)) {
            request.managerShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.manager, "Manager", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queues)) {
            request.queuesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queues, "Queues", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sharedStorages)) {
            request.sharedStoragesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sharedStorages, "SharedStorages", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.additionalPackagesShrink)) {
            query.put("AdditionalPackages", request.additionalPackagesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addonsShrink)) {
            query.put("Addons", request.addonsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            query.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterCategory)) {
            query.put("ClusterCategory", request.clusterCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterCredentialsShrink)) {
            query.put("ClusterCredentials", request.clusterCredentialsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterCustomConfigurationShrink)) {
            query.put("ClusterCustomConfiguration", request.clusterCustomConfigurationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterDescription)) {
            query.put("ClusterDescription", request.clusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterMode)) {
            query.put("ClusterMode", request.clusterMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterVSwitchId)) {
            query.put("ClusterVSwitchId", request.clusterVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterVpcId)) {
            query.put("ClusterVpcId", request.clusterVpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            query.put("DeletionProtection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isEnterpriseSecurityGroup)) {
            query.put("IsEnterpriseSecurityGroup", request.isEnterpriseSecurityGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerShrink)) {
            query.put("Manager", request.managerShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCoreCount)) {
            query.put("MaxCoreCount", request.maxCoreCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCount)) {
            query.put("MaxCount", request.maxCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queuesShrink)) {
            query.put("Queues", request.queuesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharedStoragesShrink)) {
            query.put("SharedStorages", request.sharedStoragesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2024-07-30"),
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
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you call this operation, make sure that you are familiar with the billing and pricing of E-HPC. For more information, see <a href="https://help.aliyun.com/document_detail/2842985.html">Overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a pay-as-you-go or subscription Elastic High Performance Computing (E-HPC) cluster.</p>
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
     * <p>Before you call this operation, make sure that you understand the billing and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of E-HPC.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a job for a cluster.</p>
     * 
     * @param tmpReq CreateJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobResponse
     */
    public CreateJobResponse createJobWithOptions(CreateJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateJobShrinkRequest request = new CreateJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobSpec)) {
            request.jobSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobSpec, "JobSpec", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobSpecShrink)) {
            query.put("JobSpec", request.jobSpecShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJob"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you understand the billing and <a href="https://www.aliyun.com/price/product#/ecs/detail">pricing</a> of E-HPC.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a job for a cluster.</p>
     * 
     * @param request CreateJobRequest
     * @return CreateJobResponse
     */
    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * 
     * <b>summary</b> : 
     * <p>Creates compute nodes for an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param tmpReq CreateNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNodesResponse
     */
    public CreateNodesResponse createNodesWithOptions(CreateNodesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateNodesShrinkRequest request = new CreateNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.computeNode)) {
            request.computeNodeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.computeNode, "ComputeNode", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.computeNodeShrink)) {
            query.put("ComputeNode", request.computeNodeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.count)) {
            query.put("Count", request.count);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deploymentSetId)) {
            query.put("DeploymentSetId", request.deploymentSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HPCInterConnect)) {
            query.put("HPCInterConnect", request.HPCInterConnect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostnamePrefix)) {
            query.put("HostnamePrefix", request.hostnamePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostnameSuffix)) {
            query.put("HostnameSuffix", request.hostnameSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keepAlive)) {
            query.put("KeepAlive", request.keepAlive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRole)) {
            query.put("RamRole", request.ramRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedNodePoolId)) {
            query.put("ReservedNodePoolId", request.reservedNodePoolId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNodes"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNodesResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * 
     * <b>summary</b> : 
     * <p>Creates compute nodes for an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request CreateNodesRequest
     * @return CreateNodesResponse
     */
    public CreateNodesResponse createNodes(CreateNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a queue for an Enterprise High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param tmpReq CreateQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateQueueResponse
     */
    public CreateQueueResponse createQueueWithOptions(CreateQueueRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateQueueShrinkRequest request = new CreateQueueShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queue)) {
            request.queueShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queue, "Queue", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueShrink)) {
            query.put("Queue", request.queueShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateQueue"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateQueueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a queue for an Enterprise High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request CreateQueueRequest
     * @return CreateQueueResponse
     */
    public CreateQueueResponse createQueue(CreateQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createQueueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds users to an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param tmpReq CreateUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUsersResponse
     */
    public CreateUsersResponse createUsersWithOptions(CreateUsersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUsersShrinkRequest request = new CreateUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.user)) {
            request.userShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.user, "User", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userShrink)) {
            query.put("User", request.userShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUsers"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds users to an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request CreateUsersRequest
     * @return CreateUsersResponse
     */
    public CreateUsersResponse createUsers(CreateUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Make sure that data of the cluster to be deleted is backed up before you call this operation.</p>
     * <blockquote>
     * <p>After a cluster is released, you cannot restore the data stored in the cluster. Exercise caution when you release a cluster.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Releases an Enterprise High Performance Computing (E-HPC) cluster.</p>
     * 
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCluster"),
            new TeaPair("version", "2024-07-30"),
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
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Make sure that data of the cluster to be deleted is backed up before you call this operation.</p>
     * <blockquote>
     * <p>After a cluster is released, you cannot restore the data stored in the cluster. Exercise caution when you release a cluster.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Releases an Enterprise High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request DeleteClusterRequest
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteCluster(DeleteClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you delete a compute node, we recommend that you export all job data from the node to prevent data loss.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes compute nodes from an Enterprise High Performance Computing (E-HPC) cluster at a time.</p>
     * 
     * @param tmpReq DeleteNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNodesResponse
     */
    public DeleteNodesResponse deleteNodesWithOptions(DeleteNodesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteNodesShrinkRequest request = new DeleteNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNodes"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNodesResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you delete a compute node, we recommend that you export all job data from the node to prevent data loss.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes compute nodes from an Enterprise High Performance Computing (E-HPC) cluster at a time.</p>
     * 
     * @param request DeleteNodesRequest
     * @return DeleteNodesResponse
     */
    public DeleteNodesResponse deleteNodes(DeleteNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNodesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you delete a queue, you must delete all compute nodes in the queue.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes queues from an Enterprise High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param tmpReq DeleteQueuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQueuesResponse
     */
    public DeleteQueuesResponse deleteQueuesWithOptions(DeleteQueuesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteQueuesShrinkRequest request = new DeleteQueuesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queueNames)) {
            request.queueNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queueNames, "QueueNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueNamesShrink)) {
            query.put("QueueNames", request.queueNamesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQueues"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQueuesResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you delete a queue, you must delete all compute nodes in the queue.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes queues from an Enterprise High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request DeleteQueuesRequest
     * @return DeleteQueuesResponse
     */
    public DeleteQueuesResponse deleteQueues(DeleteQueuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQueuesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes users from a cluster.</p>
     * 
     * @param tmpReq DeleteUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUsersResponse
     */
    public DeleteUsersResponse deleteUsersWithOptions(DeleteUsersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteUsersShrinkRequest request = new DeleteUsersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.user)) {
            request.userShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.user, "User", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUsers"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes users from a cluster.</p>
     * 
     * @param request DeleteUsersRequest
     * @return DeleteUsersResponse
     */
    public DeleteUsersResponse deleteUsers(DeleteUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an addon template.</p>
     * 
     * @param request DescribeAddonTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAddonTemplateResponse
     */
    public DescribeAddonTemplateResponse describeAddonTemplateWithOptions(DescribeAddonTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonName)) {
            query.put("AddonName", request.addonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addonVersion)) {
            query.put("AddonVersion", request.addonVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAddonTemplate"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAddonTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an addon template.</p>
     * 
     * @param request DescribeAddonTemplateRequest
     * @return DescribeAddonTemplateResponse
     */
    public DescribeAddonTemplateResponse describeAddonTemplate(DescribeAddonTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAddonTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unmounts shared storage from the mount directory of a cluster.</p>
     * 
     * @param tmpReq DetachSharedStoragesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachSharedStoragesResponse
     */
    public DetachSharedStoragesResponse detachSharedStoragesWithOptions(DetachSharedStoragesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DetachSharedStoragesShrinkRequest request = new DetachSharedStoragesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.sharedStorages)) {
            request.sharedStoragesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.sharedStorages, "SharedStorages", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sharedStoragesShrink)) {
            query.put("SharedStorages", request.sharedStoragesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachSharedStorages"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachSharedStoragesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unmounts shared storage from the mount directory of a cluster.</p>
     * 
     * @param request DetachSharedStoragesRequest
     * @return DetachSharedStoragesResponse
     */
    public DetachSharedStoragesResponse detachSharedStorages(DetachSharedStoragesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachSharedStoragesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an installed addon.</p>
     * 
     * @param request GetAddonRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAddonResponse
     */
    public GetAddonResponse getAddonWithOptions(GetAddonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonId)) {
            query.put("AddonId", request.addonId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAddon"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAddonResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an installed addon.</p>
     * 
     * @param request GetAddonRequest
     * @return GetAddonResponse
     */
    public GetAddonResponse getAddon(GetAddonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAddonWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about an Elastic High Performance Computing (E-HPC) cluster.</p>
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCluster"),
            new TeaPair("version", "2024-07-30"),
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
     * <p>Queries information about an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request GetClusterRequest
     * @return GetClusterResponse
     */
    public GetClusterResponse getCluster(GetClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query logs based on a request ID. Logs for specific actions can be queried thanks to an Action-Stage-Method three-layer log splitting structure.</p>
     * 
     * @param request GetCommonLogDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCommonLogDetailResponse
     */
    public GetCommonLogDetailResponse getCommonLogDetailWithOptions(GetCommonLogDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hiddenProcess)) {
            query.put("HiddenProcess", request.hiddenProcess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRequestId)) {
            query.put("LogRequestId", request.logRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("To", request.to);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCommonLogDetail"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCommonLogDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query logs based on a request ID. Logs for specific actions can be queried thanks to an Action-Stage-Method three-layer log splitting structure.</p>
     * 
     * @param request GetCommonLogDetailRequest
     * @return GetCommonLogDetailResponse
     */
    public GetCommonLogDetailResponse getCommonLogDetail(GetCommonLogDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCommonLogDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a job.</p>
     * 
     * @param request GetJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobResponse
     */
    public GetJobResponse getJobWithOptions(GetJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJob"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of a job.</p>
     * 
     * @param request GetJobRequest
     * @return GetJobResponse
     */
    public GetJobResponse getJob(GetJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Currently, only Slurm and PBS Pro schedulers for Standard Edition clusters are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the output logs of a job, including standard output logs and error output logs.</p>
     * 
     * @param request GetJobLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobLogResponse
     */
    public GetJobLogResponse getJobLogWithOptions(GetJobLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logType)) {
            query.put("LogType", request.logType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobLog"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobLogResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Currently, only Slurm and PBS Pro schedulers for Standard Edition clusters are supported.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the output logs of a job, including standard output logs and error output logs.</p>
     * 
     * @param request GetJobLogRequest
     * @return GetJobLogResponse
     */
    public GetJobLogResponse getJobLog(GetJobLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getJobLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a queue in an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request GetQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueueResponse
     */
    public GetQueueResponse getQueueWithOptions(GetQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueName)) {
            query.put("QueueName", request.queueName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueue"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a queue in an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request GetQueueRequest
     * @return GetQueueResponse
     */
    public GetQueueResponse getQueue(GetQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getQueueWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items when you call this operation:</p>
     * <ul>
     * <li>The cluster must be in the <code>Running</code> state.</li>
     * <li>Clusters fall into two types:<ul>
     * <li>Regular clusters on Alibaba Cloud Public Cloud</li>
     * <li>Managed clusters on Alibaba Cloud Public Cloud</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Installs an addon.</p>
     * 
     * @param request InstallAddonRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallAddonResponse
     */
    public InstallAddonResponse installAddonWithOptions(InstallAddonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonName)) {
            query.put("AddonName", request.addonName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.addonVersion)) {
            query.put("AddonVersion", request.addonVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcesSpec)) {
            query.put("ResourcesSpec", request.resourcesSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.servicesSpec)) {
            query.put("ServicesSpec", request.servicesSpec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallAddon"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallAddonResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items when you call this operation:</p>
     * <ul>
     * <li>The cluster must be in the <code>Running</code> state.</li>
     * <li>Clusters fall into two types:<ul>
     * <li>Regular clusters on Alibaba Cloud Public Cloud</li>
     * <li>Managed clusters on Alibaba Cloud Public Cloud</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Installs an addon.</p>
     * 
     * @param request InstallAddonRequest
     * @return InstallAddonResponse
     */
    public InstallAddonResponse installAddon(InstallAddonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installAddonWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <p>When calling this interface, please note the following:</p>
     * <ul>
     * <li>The cluster status must be <code>Running</code>. </li>
     * <li>If the cluster series is <code>Serverless</code>, ensure that there is at least one login node or compute node in the cluster; otherwise, software cannot be added to the target cluster.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Install software for the specified cluster.</p>
     * 
     * @param tmpReq InstallSoftwaresRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallSoftwaresResponse
     */
    public InstallSoftwaresResponse installSoftwaresWithOptions(InstallSoftwaresRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        InstallSoftwaresShrinkRequest request = new InstallSoftwaresShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.additionalPackages)) {
            request.additionalPackagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.additionalPackages, "AdditionalPackages", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallSoftwares"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallSoftwaresResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <p>When calling this interface, please note the following:</p>
     * <ul>
     * <li>The cluster status must be <code>Running</code>. </li>
     * <li>If the cluster series is <code>Serverless</code>, ensure that there is at least one login node or compute node in the cluster; otherwise, software cannot be added to the target cluster.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Install software for the specified cluster.</p>
     * 
     * @param request InstallSoftwaresRequest
     * @return InstallSoftwaresResponse
     */
    public InstallSoftwaresResponse installSoftwares(InstallSoftwaresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installSoftwaresWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries supported addon templates.</p>
     * 
     * @param request ListAddonTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAddonTemplatesResponse
     */
    public ListAddonTemplatesResponse listAddonTemplatesWithOptions(ListAddonTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonNames)) {
            query.put("AddonNames", request.addonNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterCategory)) {
            query.put("ClusterCategory", request.clusterCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAddonTemplates"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAddonTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries supported addon templates.</p>
     * 
     * @param request ListAddonTemplatesRequest
     * @return ListAddonTemplatesResponse
     */
    public ListAddonTemplatesResponse listAddonTemplates(ListAddonTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAddonTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries installed addons of an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param tmpReq ListAddonsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAddonsResponse
     */
    public ListAddonsResponse listAddonsWithOptions(ListAddonsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAddonsShrinkRequest request = new ListAddonsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.addonIds)) {
            request.addonIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.addonIds, "AddonIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonIdsShrink)) {
            query.put("AddonIds", request.addonIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAddons"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAddonsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries installed addons of an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request ListAddonsRequest
     * @return ListAddonsResponse
     */
    public ListAddonsResponse listAddons(ListAddonsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAddonsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the file systems that can be attached in a region.</p>
     * 
     * @param request ListAvailableFileSystemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAvailableFileSystemsResponse
     */
    public ListAvailableFileSystemsResponse listAvailableFileSystemsWithOptions(ListAvailableFileSystemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvailableFileSystems"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableFileSystemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the file systems that can be attached in a region.</p>
     * 
     * @param request ListAvailableFileSystemsRequest
     * @return ListAvailableFileSystemsResponse
     */
    public ListAvailableFileSystemsResponse listAvailableFileSystems(ListAvailableFileSystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAvailableFileSystemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries images that are available for Elastic High Performance Computing (E-HPC) clusters.</p>
     * 
     * @param tmpReq ListAvailableImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAvailableImagesResponse
     */
    public ListAvailableImagesResponse listAvailableImagesWithOptions(ListAvailableImagesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAvailableImagesShrinkRequest request = new ListAvailableImagesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.directoryService)) {
            request.directoryServiceShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.directoryService, "DirectoryService", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scheduler)) {
            request.schedulerShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scheduler, "Scheduler", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvailableImages"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries images that are available for Elastic High Performance Computing (E-HPC) clusters.</p>
     * 
     * @param request ListAvailableImagesRequest
     * @return ListAvailableImagesResponse
     */
    public ListAvailableImagesResponse listAvailableImages(ListAvailableImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAvailableImagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all clusters of a user in each region.</p>
     * 
     * @param tmpReq ListClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClustersResponse
     */
    public ListClustersResponse listClustersWithOptions(ListClustersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListClustersShrinkRequest request = new ListClustersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clusterIds)) {
            request.clusterIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clusterIds, "ClusterIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clusterNames)) {
            request.clusterNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clusterNames, "ClusterNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterIdsShrink)) {
            query.put("ClusterIds", request.clusterIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterNamesShrink)) {
            query.put("ClusterNames", request.clusterNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2024-07-30"),
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
     * <p>Queries all clusters of a user in each region.</p>
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
     * <p>Queries the logs of a cluster that are generated within a time range.</p>
     * 
     * @param tmpReq ListCommonLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCommonLogsResponse
     */
    public ListCommonLogsResponse listCommonLogsWithOptions(ListCommonLogsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCommonLogsShrinkRequest request = new ListCommonLogsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actionName)) {
            request.actionNameShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actionName, "ActionName", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionNameShrink)) {
            query.put("ActionName", request.actionNameShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.actionStatus)) {
            query.put("ActionStatus", request.actionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isReverse)) {
            query.put("IsReverse", request.isReverse);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logRequestId)) {
            query.put("LogRequestId", request.logRequestId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logType)) {
            query.put("LogType", request.logType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operatorUid)) {
            query.put("OperatorUid", request.operatorUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            query.put("To", request.to);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCommonLogs"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCommonLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the logs of a cluster that are generated within a time range.</p>
     * 
     * @param request ListCommonLogsRequest
     * @return ListCommonLogsResponse
     */
    public ListCommonLogsResponse listCommonLogs(ListCommonLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCommonLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the installed software of a cluster.</p>
     * 
     * @param request ListInstalledSoftwaresRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstalledSoftwaresResponse
     */
    public ListInstalledSoftwaresResponse listInstalledSoftwaresWithOptions(ListInstalledSoftwaresRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstalledSoftwares"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstalledSoftwaresResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the installed software of a cluster.</p>
     * 
     * @param request ListInstalledSoftwaresRequest
     * @return ListInstalledSoftwaresResponse
     */
    public ListInstalledSoftwaresResponse listInstalledSoftwares(ListInstalledSoftwaresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstalledSoftwaresWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the jobs in a cluster.</p>
     * 
     * @param tmpReq ListJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobsWithOptions(ListJobsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListJobsShrinkRequest request = new ListJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobFilter)) {
            request.jobFilterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobFilter, "JobFilter", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobFilterShrink)) {
            query.put("JobFilter", request.jobFilterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobs"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the jobs in a cluster.</p>
     * 
     * @param request ListJobsRequest
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobs(ListJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the nodes of an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param tmpReq ListNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodesWithOptions(ListNodesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListNodesShrinkRequest request = new ListNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hostnames)) {
            request.hostnamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hostnames, "Hostnames", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.privateIpAddress)) {
            request.privateIpAddressShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.privateIpAddress, "PrivateIpAddress", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queueNames)) {
            request.queueNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queueNames, "QueueNames", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.status)) {
            request.statusShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.status, "Status", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostnamesShrink)) {
            query.put("Hostnames", request.hostnamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddressShrink)) {
            query.put("PrivateIpAddress", request.privateIpAddressShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueNamesShrink)) {
            query.put("QueueNames", request.queueNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sequence)) {
            query.put("Sequence", request.sequence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusShrink)) {
            query.put("Status", request.statusShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2024-07-30"),
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
     * <p>Queries the nodes of an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request ListNodesRequest
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodes(ListNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries queues in an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param tmpReq ListQueuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQueuesResponse
     */
    public ListQueuesResponse listQueuesWithOptions(ListQueuesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListQueuesShrinkRequest request = new ListQueuesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queueNames)) {
            request.queueNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queueNames, "QueueNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueNamesShrink)) {
            query.put("QueueNames", request.queueNamesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueues"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueuesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries queues in an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request ListQueuesRequest
     * @return ListQueuesResponse
     */
    public ListQueuesResponse listQueues(ListQueuesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listQueuesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询产品支持的地域列表。</p>
     * 
     * @param request ListRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(ListRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specCode)) {
            query.put("SpecCode", request.specCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询产品支持的地域列表。</p>
     * 
     * @param request ListRegionsRequest
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions(ListRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the shared storage that is attached to a cluster.</p>
     * 
     * @param request ListSharedStoragesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSharedStoragesResponse
     */
    public ListSharedStoragesResponse listSharedStoragesWithOptions(ListSharedStoragesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemType)) {
            query.put("FileSystemType", request.fileSystemType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSharedStorages"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSharedStoragesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the shared storage that is attached to a cluster.</p>
     * 
     * @param request ListSharedStoragesRequest
     * @return ListSharedStoragesResponse
     */
    public ListSharedStoragesResponse listSharedStorages(ListSharedStoragesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSharedStoragesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the software that can be installed in an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request ListSoftwaresRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSoftwaresResponse
     */
    public ListSoftwaresResponse listSoftwaresWithOptions(ListSoftwaresRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSoftwares"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSoftwaresResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the software that can be installed in an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request ListSoftwaresRequest
     * @return ListSoftwaresResponse
     */
    public ListSoftwaresResponse listSoftwares(ListSoftwaresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSoftwaresWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the users of a cluster.</p>
     * 
     * @param request ListUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the users of a cluster.</p>
     * 
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops uncompleted jobs in a batch in an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param tmpReq StopJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopJobsResponse
     */
    public StopJobsResponse stopJobsWithOptions(StopJobsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StopJobsShrinkRequest request = new StopJobsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.jobIds)) {
            request.jobIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.jobIds, "JobIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobIdsShrink)) {
            query.put("JobIds", request.jobIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopJobs"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops uncompleted jobs in a batch in an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request StopJobsRequest
     * @return StopJobsResponse
     */
    public StopJobsResponse stopJobs(StopJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items when you call this operation:</p>
     * <ul>
     * <li>The cluster must be in the <code>Running</code> state.</li>
     * <li>Clusters fall into the following types:<ul>
     * <li>Regular clusters on Alibaba Cloud Public Cloud</li>
     * <li>Managed clusters on Alibaba Cloud Public Cloud</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uninstalls an addon.</p>
     * 
     * @param request UnInstallAddonRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnInstallAddonResponse
     */
    public UnInstallAddonResponse unInstallAddonWithOptions(UnInstallAddonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addonId)) {
            query.put("AddonId", request.addonId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnInstallAddon"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnInstallAddonResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Take note of the following items when you call this operation:</p>
     * <ul>
     * <li>The cluster must be in the <code>Running</code> state.</li>
     * <li>Clusters fall into the following types:<ul>
     * <li>Regular clusters on Alibaba Cloud Public Cloud</li>
     * <li>Managed clusters on Alibaba Cloud Public Cloud</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uninstalls an addon.</p>
     * 
     * @param request UnInstallAddonRequest
     * @return UnInstallAddonResponse
     */
    public UnInstallAddonResponse unInstallAddon(UnInstallAddonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unInstallAddonWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <p>When calling this interface, please note:
     * The cluster status must be <code>Running</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Uninstalls software systems from an Enterprise High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param tmpReq UninstallSoftwaresRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallSoftwaresResponse
     */
    public UninstallSoftwaresResponse uninstallSoftwaresWithOptions(UninstallSoftwaresRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UninstallSoftwaresShrinkRequest request = new UninstallSoftwaresShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.additionalPackages)) {
            request.additionalPackagesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.additionalPackages, "AdditionalPackages", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallSoftwares"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallSoftwaresResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Interface Description</h2>
     * <p>When calling this interface, please note:
     * The cluster status must be <code>Running</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Uninstalls software systems from an Enterprise High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request UninstallSoftwaresRequest
     * @return UninstallSoftwaresResponse
     */
    public UninstallSoftwaresResponse uninstallSoftwares(UninstallSoftwaresRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uninstallSoftwaresWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the basic information of a specified cluster.</p>
     * 
     * @param tmpReq UpdateClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClusterResponse
     */
    public UpdateClusterResponse updateClusterWithOptions(UpdateClusterRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateClusterShrinkRequest request = new UpdateClusterShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.clusterCustomConfiguration)) {
            request.clusterCustomConfigurationShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.clusterCustomConfiguration, "ClusterCustomConfiguration", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.monitorSpec)) {
            request.monitorSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.monitorSpec, "MonitorSpec", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.schedulerSpec)) {
            request.schedulerSpecShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.schedulerSpec, "SchedulerSpec", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientVersion)) {
            query.put("ClientVersion", request.clientVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterCustomConfigurationShrink)) {
            query.put("ClusterCustomConfiguration", request.clusterCustomConfigurationShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterDescription)) {
            query.put("ClusterDescription", request.clusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterName)) {
            query.put("ClusterName", request.clusterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            query.put("DeletionProtection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableScaleIn)) {
            query.put("EnableScaleIn", request.enableScaleIn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableScaleOut)) {
            query.put("EnableScaleOut", request.enableScaleOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.growInterval)) {
            query.put("GrowInterval", request.growInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleInterval)) {
            query.put("IdleInterval", request.idleInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCoreCount)) {
            query.put("MaxCoreCount", request.maxCoreCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxCount)) {
            query.put("MaxCount", request.maxCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.monitorSpecShrink)) {
            query.put("MonitorSpec", request.monitorSpecShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulerSpecShrink)) {
            query.put("SchedulerSpec", request.schedulerSpecShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCluster"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modify the basic information of a specified cluster.</p>
     * 
     * @param request UpdateClusterRequest
     * @return UpdateClusterResponse
     */
    public UpdateClusterResponse updateCluster(UpdateClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you delete a compute node, we recommend that you export all job data from the node to prevent data loss.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configurations of compute nodes in an Enterprise High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param tmpReq UpdateNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateNodesResponse
     */
    public UpdateNodesResponse updateNodesWithOptions(UpdateNodesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateNodesShrinkRequest request = new UpdateNodesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instances)) {
            request.instancesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instances, "Instances", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instancesShrink)) {
            query.put("Instances", request.instancesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateNodes"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateNodesResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Usage notes</h2>
     * <p>Before you delete a compute node, we recommend that you export all job data from the node to prevent data loss.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configurations of compute nodes in an Enterprise High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request UpdateNodesRequest
     * @return UpdateNodesResponse
     */
    public UpdateNodesResponse updateNodes(UpdateNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a queue in an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param tmpReq UpdateQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQueueResponse
     */
    public UpdateQueueResponse updateQueueWithOptions(UpdateQueueRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateQueueShrinkRequest request = new UpdateQueueShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.queue)) {
            request.queueShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.queue, "Queue", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queueShrink)) {
            query.put("Queue", request.queueShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQueue"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQueueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a queue in an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request UpdateQueueRequest
     * @return UpdateQueueResponse
     */
    public UpdateQueueResponse updateQueue(UpdateQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQueueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of a user in an Elastic High Performance Computing (E-HPC) cluster, including the user group and password.</p>
     * 
     * @param request UpdateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.group)) {
            query.put("Group", request.group);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2024-07-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information of a user in an Elastic High Performance Computing (E-HPC) cluster, including the user group and password.</p>
     * 
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }
}
