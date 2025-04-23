// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412;

import com.aliyun.tea.*;
import com.aliyun.ehpc20180412.models.*;

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
     * <p>  The compute nodes to be added are in the Stopped state.</p>
     * <ul>
     * <li>After the compute nodes are added to the cluster, the operating systems of the nodes are replaced with the operating system specified by the ImageId parameter.</li>
     * <li>The hosts of the compute nodes must be different from those of the existing compute nodes in the cluster. Otherwise, the add operation fails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more existing ECS instances as compute nodes to a specified cluster.</p>
     * 
     * @param request AddExistedNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddExistedNodesResponse
     */
    public AddExistedNodesResponse addExistedNodesWithOptions(AddExistedNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddExistedNodes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddExistedNodesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The compute nodes to be added are in the Stopped state.</p>
     * <ul>
     * <li>After the compute nodes are added to the cluster, the operating systems of the nodes are replaced with the operating system specified by the ImageId parameter.</li>
     * <li>The hosts of the compute nodes must be different from those of the existing compute nodes in the cluster. Otherwise, the add operation fails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more existing ECS instances as compute nodes to a specified cluster.</p>
     * 
     * @param request AddExistedNodesRequest
     * @return AddExistedNodesResponse
     */
    public AddExistedNodesResponse addExistedNodes(AddExistedNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addExistedNodesWithOptions(request, runtime);
    }

    /**
     * @param request AddLocalNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddLocalNodesResponse
     */
    public AddLocalNodesResponse addLocalNodesWithOptions(AddLocalNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddLocalNodes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddLocalNodesResponse());
    }

    /**
     * @param request AddLocalNodesRequest
     * @return AddLocalNodesResponse
     */
    public AddLocalNodesResponse addLocalNodes(AddLocalNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLocalNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds one or more compute nodes to an E-HPC cluster.</p>
     * 
     * @param request AddNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddNodesResponse
     */
    public AddNodesResponse addNodesWithOptions(AddNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddNodes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds one or more compute nodes to an E-HPC cluster.</p>
     * 
     * @param request AddNodesRequest
     * @return AddNodesResponse
     */
    public AddNodesResponse addNodes(AddNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a queue for a cluster.</p>
     * 
     * @param request AddQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddQueueResponse
     */
    public AddQueueResponse addQueueWithOptions(AddQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddQueue"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddQueueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a queue for a cluster.</p>
     * 
     * @param request AddQueueRequest
     * @return AddQueueResponse
     */
    public AddQueueResponse addQueue(AddQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addQueueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a cluster to a security group.</p>
     * 
     * @param request AddSecurityGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSecurityGroupResponse
     */
    public AddSecurityGroupResponse addSecurityGroupWithOptions(AddSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSecurityGroup"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSecurityGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a cluster to a security group.</p>
     * 
     * @param request AddSecurityGroupRequest
     * @return AddSecurityGroupResponse
     */
    public AddSecurityGroupResponse addSecurityGroup(AddSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSecurityGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds users to a cluster.</p>
     * 
     * @param request AddUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddUsersResponse
     */
    public AddUsersResponse addUsersWithOptions(AddUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddUsers"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds users to a cluster.</p>
     * 
     * @param request AddUsersRequest
     * @return AddUsersResponse
     */
    public AddUsersResponse addUsers(AddUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addUsersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Description</h2>
     * <p>You can call the ApplyNodes operation to specify the number of compute nodes, the number of vCPUs, and the memory size when you add nodes to a cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds pay-as-you-go or preemptible compute nodes to a cluster.</p>
     * 
     * @param request ApplyNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyNodesResponse
     */
    public ApplyNodesResponse applyNodesWithOptions(ApplyNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyNodes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyNodesResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Description</h2>
     * <p>You can call the ApplyNodes operation to specify the number of compute nodes, the number of vCPUs, and the memory size when you add nodes to a cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds pay-as-you-go or preemptible compute nodes to a cluster.</p>
     * 
     * @param request ApplyNodesRequest
     * @return ApplyNodesResponse
     */
    public ApplyNodesResponse applyNodes(ApplyNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyNodesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you create an Elastic High Performance Computing (E-HPC) cluster, you are charged for the cluster resources that you use. We recommend that you learn about the billing methods of E-HPC in advance. For more information, see <a href="https://help.aliyun.com/document_detail/57844.html">Billing overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a pay-as-you-go or subscription E-HPC cluster.</p>
     * 
     * @param request CreateClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClusterResponse
     */
    public CreateClusterResponse createClusterWithOptions(CreateClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCluster"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you create an Elastic High Performance Computing (E-HPC) cluster, you are charged for the cluster resources that you use. We recommend that you learn about the billing methods of E-HPC in advance. For more information, see <a href="https://help.aliyun.com/document_detail/57844.html">Billing overview</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a pay-as-you-go or subscription E-HPC cluster.</p>
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
     * <p>Creates a hybrid cloud cluster.</p>
     * 
     * @param request CreateHybridClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHybridClusterResponse
     */
    public CreateHybridClusterResponse createHybridClusterWithOptions(CreateHybridClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHybridCluster"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHybridClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a hybrid cloud cluster.</p>
     * 
     * @param request CreateHybridClusterRequest
     * @return CreateHybridClusterResponse
     */
    public CreateHybridClusterResponse createHybridCluster(CreateHybridClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHybridClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a job file.</p>
     * 
     * @param request CreateJobFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobFileResponse
     */
    public CreateJobFileResponse createJobFileWithOptions(CreateJobFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJobFile"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a job file.</p>
     * 
     * @param request CreateJobFileRequest
     * @return CreateJobFileResponse
     */
    public CreateJobFileResponse createJobFile(CreateJobFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createJobFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a job template.</p>
     * 
     * @param request CreateJobTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJobTemplateResponse
     */
    public CreateJobTemplateResponse createJobTemplateWithOptions(CreateJobTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJobTemplate"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJobTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a job template.</p>
     * 
     * @param request CreateJobTemplateRequest
     * @return CreateJobTemplateResponse
     */
    public CreateJobTemplateResponse createJobTemplate(CreateJobTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createJobTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a cluster is released, the pay-as-you-go nodes and the subscription nodes that are expired are automatically released. The subscription nodes that are expired are retained. If you need to release subscription nodes that are not expired, change the billing method to pay-as-you-go. Before you release a cluster, make sure that you no longer use the cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a cluster.</p>
     * 
     * @param request DeleteClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClusterResponse
     */
    public DeleteClusterResponse deleteClusterWithOptions(DeleteClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCluster"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>After a cluster is released, the pay-as-you-go nodes and the subscription nodes that are expired are automatically released. The subscription nodes that are expired are retained. If you need to release subscription nodes that are not expired, change the billing method to pay-as-you-go. Before you release a cluster, make sure that you no longer use the cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a cluster.</p>
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
     * <p>Deletes job templates.</p>
     * 
     * @param request DeleteJobTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteJobTemplatesResponse
     */
    public DeleteJobTemplatesResponse deleteJobTemplatesWithOptions(DeleteJobTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJobTemplates"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes job templates.</p>
     * 
     * @param request DeleteJobTemplatesRequest
     * @return DeleteJobTemplatesResponse
     */
    public DeleteJobTemplatesResponse deleteJobTemplates(DeleteJobTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteJobTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes jobs from a cluster.</p>
     * 
     * @param request DeleteJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteJobsResponse
     */
    public DeleteJobsResponse deleteJobsWithOptions(DeleteJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJobs"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes jobs from a cluster.</p>
     * 
     * @param request DeleteJobsRequest
     * @return DeleteJobsResponse
     */
    public DeleteJobsResponse deleteJobs(DeleteJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a compute node, we recommend that you export all job data from the node to prevent data loss.</p>
     * 
     * @param request DeleteNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNodesResponse
     */
    public DeleteNodesResponse deleteNodesWithOptions(DeleteNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNodes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNodesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a compute node, we recommend that you export all job data from the node to prevent data loss.</p>
     * 
     * @param request DeleteNodesRequest
     * @return DeleteNodesResponse
     */
    public DeleteNodesResponse deleteNodes(DeleteNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNodesWithOptions(request, runtime);
    }

    /**
     * @param request DeleteQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteQueueResponse
     */
    public DeleteQueueResponse deleteQueueWithOptions(DeleteQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteQueue"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteQueueResponse());
    }

    /**
     * @param request DeleteQueueRequest
     * @return DeleteQueueResponse
     */
    public DeleteQueueResponse deleteQueue(DeleteQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteQueueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a cluster from a specified security group.</p>
     * 
     * @param request DeleteSecurityGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecurityGroupResponse
     */
    public DeleteSecurityGroupResponse deleteSecurityGroupWithOptions(DeleteSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecurityGroup"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes a cluster from a specified security group.</p>
     * 
     * @param request DeleteSecurityGroupRequest
     * @return DeleteSecurityGroupResponse
     */
    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you delete a user, only its information is deleted. The files stored in the /home directory for the user are retained. For example, if you delete a user named user1, the files in the <code>/home/user1/</code> directory of the cluster are not deleted. However, a deleted user cannot be recovered. Even if you create another user that has the same name, the data retained for the deleted user is not reused.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes users from a cluster.</p>
     * 
     * @param request DeleteUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUsersResponse
     */
    public DeleteUsersResponse deleteUsersWithOptions(DeleteUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUsers"),
            new TeaPair("version", "2018-04-12"),
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
     * <b>description</b> :
     * <p>If you delete a user, only its information is deleted. The files stored in the /home directory for the user are retained. For example, if you delete a user named user1, the files in the <code>/home/user1/</code> directory of the cluster are not deleted. However, a deleted user cannot be recovered. Even if you create another user that has the same name, the data retained for the deleted user is not reused.</p>
     * 
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
     * <p>Queries the auto scaling settings of a cluster.</p>
     * 
     * @param request DescribeAutoScaleConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoScaleConfigResponse
     */
    public DescribeAutoScaleConfigResponse describeAutoScaleConfigWithOptions(DescribeAutoScaleConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoScaleConfig"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoScaleConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the auto scaling settings of a cluster.</p>
     * 
     * @param request DescribeAutoScaleConfigRequest
     * @return DescribeAutoScaleConfigResponse
     */
    public DescribeAutoScaleConfigResponse describeAutoScaleConfig(DescribeAutoScaleConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoScaleConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a cluster.</p>
     * 
     * @param request DescribeClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterResponse
     */
    public DescribeClusterResponse describeClusterWithOptions(DescribeClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCluster"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a cluster.</p>
     * 
     * @param request DescribeClusterRequest
     * @return DescribeClusterResponse
     */
    public DescribeClusterResponse describeCluster(DescribeClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the base images of Elastic High Performance Computing (E-HPC).</p>
     * 
     * @param request DescribeEstackImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEstackImageResponse
     */
    public DescribeEstackImageResponse describeEstackImageWithOptions(DescribeEstackImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEstackImage"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEstackImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the base images of Elastic High Performance Computing (E-HPC).</p>
     * 
     * @param request DescribeEstackImageRequest
     * @return DescribeEstackImageResponse
     */
    public DescribeEstackImageResponse describeEstackImage(DescribeEstackImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEstackImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the price of an Alibaba Cloud Marketplace image.</p>
     * 
     * @param request DescribeImagePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImagePriceResponse
     */
    public DescribeImagePriceResponse describeImagePriceWithOptions(DescribeImagePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImagePrice"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImagePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the price of an Alibaba Cloud Marketplace image.</p>
     * 
     * @param request DescribeImagePriceRequest
     * @return DescribeImagePriceResponse
     */
    public DescribeImagePriceResponse describeImagePrice(DescribeImagePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImagePriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a job in an E-HPC cluster.</p>
     * 
     * @param request DescribeJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobResponse
     */
    public DescribeJobResponse describeJobWithOptions(DescribeJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJob"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a job in an E-HPC cluster.</p>
     * 
     * @param request DescribeJobRequest
     * @return DescribeJobResponse
     */
    public DescribeJobResponse describeJob(DescribeJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the pricing information of a cluster.</p>
     * 
     * @param request DescribePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePriceResponse
     */
    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrice"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the pricing information of a cluster.</p>
     * 
     * @param request DescribePriceRequest
     * @return DescribePriceResponse
     */
    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a serverless job by job ID or subtask ID (array job). You can specify only a single job ID or a single subtask ID at a time.</p>
     * 
     * @param request DescribeServerlessJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServerlessJobsResponse
     */
    public DescribeServerlessJobsResponse describeServerlessJobsWithOptions(DescribeServerlessJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServerlessJobs"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServerlessJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a serverless job by job ID or subtask ID (array job). You can specify only a single job ID or a single subtask ID at a time.</p>
     * 
     * @param request DescribeServerlessJobsRequest
     * @return DescribeServerlessJobsResponse
     */
    public DescribeServerlessJobsResponse describeServerlessJobs(DescribeServerlessJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServerlessJobsWithOptions(request, runtime);
    }

    /**
     * @param request EditJobTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditJobTemplateResponse
     */
    public EditJobTemplateResponse editJobTemplateWithOptions(EditJobTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditJobTemplate"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditJobTemplateResponse());
    }

    /**
     * @param request EditJobTemplateRequest
     * @return EditJobTemplateResponse
     */
    public EditJobTemplateResponse editJobTemplate(EditJobTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editJobTemplateWithOptions(request, runtime);
    }

    /**
     * @param request GetAccountingReportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAccountingReportResponse
     */
    public GetAccountingReportResponse getAccountingReportWithOptions(GetAccountingReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAccountingReport"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAccountingReportResponse());
    }

    /**
     * @param request GetAccountingReportRequest
     * @return GetAccountingReportResponse
     */
    public GetAccountingReportResponse getAccountingReport(GetAccountingReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAccountingReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the auto scaling settings of a cluster.</p>
     * 
     * @param request GetAutoScaleConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutoScaleConfigResponse
     */
    public GetAutoScaleConfigResponse getAutoScaleConfigWithOptions(GetAutoScaleConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoScaleConfig"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoScaleConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the auto scaling settings of a cluster.</p>
     * 
     * @param request GetAutoScaleConfigRequest
     * @return GetAutoScaleConfigResponse
     */
    public GetAutoScaleConfigResponse getAutoScaleConfig(GetAutoScaleConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoScaleConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Reads performance metrics (CloudMetrics) logs of E-HPC.</p>
     * 
     * @param request GetCloudMetricLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCloudMetricLogsResponse
     */
    public GetCloudMetricLogsResponse getCloudMetricLogsWithOptions(GetCloudMetricLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCloudMetricLogs"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCloudMetricLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Reads performance metrics (CloudMetrics) logs of E-HPC.</p>
     * 
     * @param request GetCloudMetricLogsRequest
     * @return GetCloudMetricLogsResponse
     */
    public GetCloudMetricLogsResponse getCloudMetricLogs(GetCloudMetricLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCloudMetricLogsWithOptions(request, runtime);
    }

    /**
     * @param request GetCloudMetricProfilingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCloudMetricProfilingResponse
     */
    public GetCloudMetricProfilingResponse getCloudMetricProfilingWithOptions(GetCloudMetricProfilingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCloudMetricProfiling"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCloudMetricProfilingResponse());
    }

    /**
     * @param request GetCloudMetricProfilingRequest
     * @return GetCloudMetricProfilingResponse
     */
    public GetCloudMetricProfilingResponse getCloudMetricProfiling(GetCloudMetricProfilingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCloudMetricProfilingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of the NAS file system mounted to a specified cluster.</p>
     * 
     * @param request GetClusterVolumesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClusterVolumesResponse
     */
    public GetClusterVolumesResponse getClusterVolumesWithOptions(GetClusterVolumesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClusterVolumes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClusterVolumesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of the NAS file system mounted to a specified cluster.</p>
     * 
     * @param request GetClusterVolumesRequest
     * @return GetClusterVolumesResponse
     */
    public GetClusterVolumesResponse getClusterVolumes(GetClusterVolumesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClusterVolumesWithOptions(request, runtime);
    }

    /**
     * @param request GetHybridClusterConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetHybridClusterConfigResponse
     */
    public GetHybridClusterConfigResponse getHybridClusterConfigWithOptions(GetHybridClusterConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetHybridClusterConfig"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetHybridClusterConfigResponse());
    }

    /**
     * @param request GetHybridClusterConfigRequest
     * @return GetHybridClusterConfigResponse
     */
    public GetHybridClusterConfigResponse getHybridClusterConfig(GetHybridClusterConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHybridClusterConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether hyper-threading can be enabled or disabled for an instance type.</p>
     * 
     * @param request GetIfEcsTypeSupportHtConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIfEcsTypeSupportHtConfigResponse
     */
    public GetIfEcsTypeSupportHtConfigResponse getIfEcsTypeSupportHtConfigWithOptions(GetIfEcsTypeSupportHtConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIfEcsTypeSupportHtConfig"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIfEcsTypeSupportHtConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether hyper-threading can be enabled or disabled for an instance type.</p>
     * 
     * @param request GetIfEcsTypeSupportHtConfigRequest
     * @return GetIfEcsTypeSupportHtConfigResponse
     */
    public GetIfEcsTypeSupportHtConfigResponse getIfEcsTypeSupportHtConfig(GetIfEcsTypeSupportHtConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIfEcsTypeSupportHtConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>实时查询任务的输出日志</p>
     * 
     * @param request GetJobLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetJobLogResponse
     */
    public GetJobLogResponse getJobLogWithOptions(GetJobLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetJobLog"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetJobLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实时查询任务的输出日志</p>
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
     * <p>Queries the post-processing scripts of a cluster.</p>
     * 
     * @param request GetPostScriptsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPostScriptsResponse
     */
    public GetPostScriptsResponse getPostScriptsWithOptions(GetPostScriptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPostScripts"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPostScriptsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the post-processing scripts of a cluster.</p>
     * 
     * @param request GetPostScriptsRequest
     * @return GetPostScriptsResponse
     */
    public GetPostScriptsResponse getPostScripts(GetPostScriptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPostScriptsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the scheduler settings of a cluster.</p>
     * 
     * @param request GetSchedulerInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSchedulerInfoResponse
     */
    public GetSchedulerInfoResponse getSchedulerInfoWithOptions(GetSchedulerInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSchedulerInfo"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSchedulerInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the scheduler settings of a cluster.</p>
     * 
     * @param request GetSchedulerInfoRequest
     * @return GetSchedulerInfoResponse
     */
    public GetSchedulerInfoResponse getSchedulerInfo(GetSchedulerInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSchedulerInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the VNC service in a cluster.</p>
     * 
     * @param request GetVisualServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVisualServiceStatusResponse
     */
    public GetVisualServiceStatusResponse getVisualServiceStatusWithOptions(GetVisualServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVisualServiceStatus"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetVisualServiceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of the VNC service in a cluster.</p>
     * 
     * @param request GetVisualServiceStatusRequest
     * @return GetVisualServiceStatusResponse
     */
    public GetVisualServiceStatusResponse getVisualServiceStatus(GetVisualServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVisualServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service-linked role for Elastic High Performance Computing (E-HPC). A service-linked role is required for you to use E-HPC.</p>
     * 
     * @param request InitializeEHPCRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitializeEHPCResponse
     */
    public InitializeEHPCResponse initializeEHPCWithOptions(InitializeEHPCRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitializeEHPC"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitializeEHPCResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service-linked role for Elastic High Performance Computing (E-HPC). A service-linked role is required for you to use E-HPC.</p>
     * 
     * @param request InitializeEHPCRequest
     * @return InitializeEHPCResponse
     */
    public InitializeEHPCResponse initializeEHPC(InitializeEHPCRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initializeEHPCWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Installs software in a cluster.</p>
     * 
     * @param request InstallSoftwareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InstallSoftwareResponse
     */
    public InstallSoftwareResponse installSoftwareWithOptions(InstallSoftwareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InstallSoftware"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InstallSoftwareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Installs software in a cluster.</p>
     * 
     * @param request InstallSoftwareRequest
     * @return InstallSoftwareResponse
     */
    public InstallSoftwareResponse installSoftware(InstallSoftwareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.installSoftwareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Runs interactive commands in a cluster node.</p>
     * 
     * @param request InvokeShellCommandRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InvokeShellCommandResponse
     */
    public InvokeShellCommandResponse invokeShellCommandWithOptions(InvokeShellCommandRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InvokeShellCommand"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InvokeShellCommandResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Runs interactive commands in a cluster node.</p>
     * 
     * @param request InvokeShellCommandRequest
     * @return InvokeShellCommandResponse
     */
    public InvokeShellCommandResponse invokeShellCommand(InvokeShellCommandRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.invokeShellCommandWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available Elastic Compute Service (ECS) instance types.</p>
     * 
     * @param request ListAvailableEcsTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAvailableEcsTypesResponse
     */
    public ListAvailableEcsTypesResponse listAvailableEcsTypesWithOptions(ListAvailableEcsTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAvailableEcsTypes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAvailableEcsTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available Elastic Compute Service (ECS) instance types.</p>
     * 
     * @param request ListAvailableEcsTypesRequest
     * @return ListAvailableEcsTypesResponse
     */
    public ListAvailableEcsTypesResponse listAvailableEcsTypes(ListAvailableEcsTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAvailableEcsTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the profiling history of a cluster.</p>
     * 
     * @param request ListCloudMetricProfilingsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCloudMetricProfilingsResponse
     */
    public ListCloudMetricProfilingsResponse listCloudMetricProfilingsWithOptions(ListCloudMetricProfilingsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCloudMetricProfilings"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCloudMetricProfilingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the profiling history of a cluster.</p>
     * 
     * @param request ListCloudMetricProfilingsRequest
     * @return ListCloudMetricProfilingsResponse
     */
    public ListCloudMetricProfilingsResponse listCloudMetricProfilings(ListCloudMetricProfilingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCloudMetricProfilingsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the operation logs of a cluster within the last three days.</p>
     * 
     * @param request ListClusterLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClusterLogsResponse
     */
    public ListClusterLogsResponse listClusterLogsWithOptions(ListClusterLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusterLogs"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClusterLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the operation logs of a cluster within the last three days.</p>
     * 
     * @param request ListClusterLogsRequest
     * @return ListClusterLogsResponse
     */
    public ListClusterLogsResponse listClusterLogs(ListClusterLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClusterLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of clusters in all regions within an account.</p>
     * 
     * @param request ListClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClustersResponse
     */
    public ListClustersResponse listClustersWithOptions(ListClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClusters"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of clusters in all regions within an account.</p>
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
     * <p>Queries the list of cluster metadata.</p>
     * 
     * @param request ListClustersMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClustersMetaResponse
     */
    public ListClustersMetaResponse listClustersMetaWithOptions(ListClustersMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClustersMeta"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClustersMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of cluster metadata.</p>
     * 
     * @param request ListClustersMetaRequest
     * @return ListClustersMetaResponse
     */
    public ListClustersMetaResponse listClustersMeta(ListClustersMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClustersMetaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the interactive commands in a specified cluster.</p>
     * 
     * @param request ListCommandsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCommandsResponse
     */
    public ListCommandsResponse listCommandsWithOptions(ListCommandsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCommands"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCommandsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the interactive commands in a specified cluster.</p>
     * 
     * @param request ListCommandsRequest
     * @return ListCommandsResponse
     */
    public ListCommandsResponse listCommands(ListCommandsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCommandsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of community images.</p>
     * 
     * @param request ListCommunityImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCommunityImagesResponse
     */
    public ListCommunityImagesResponse listCommunityImagesWithOptions(ListCommunityImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCommunityImages"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCommunityImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of community images.</p>
     * 
     * @param request ListCommunityImagesRequest
     * @return ListCommunityImagesResponse
     */
    public ListCommunityImagesResponse listCommunityImages(ListCommunityImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCommunityImagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about Cloud Paralleled File System (CPFS) and its mount targets.</p>
     * 
     * @param request ListCpfsFileSystemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCpfsFileSystemsResponse
     */
    public ListCpfsFileSystemsResponse listCpfsFileSystemsWithOptions(ListCpfsFileSystemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCpfsFileSystems"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCpfsFileSystemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about Cloud Paralleled File System (CPFS) and its mount targets.</p>
     * 
     * @param request ListCpfsFileSystemsRequest
     * @return ListCpfsFileSystemsResponse
     */
    public ListCpfsFileSystemsResponse listCpfsFileSystems(ListCpfsFileSystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCpfsFileSystemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the latest version number of the cluster client (ehpcutil).</p>
     * 
     * @param request ListCurrentClientVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCurrentClientVersionResponse
     */
    public ListCurrentClientVersionResponse listCurrentClientVersionWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCurrentClientVersion"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCurrentClientVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Query the latest version number of the cluster client (ehpcutil).</p>
     * @return ListCurrentClientVersionResponse
     */
    public ListCurrentClientVersionResponse listCurrentClientVersion() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCurrentClientVersionWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries custom images and shared images supported by Elastic High Performance Computing (E-HPC).</p>
     * 
     * @param request ListCustomImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCustomImagesResponse
     */
    public ListCustomImagesResponse listCustomImagesWithOptions(ListCustomImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCustomImages"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCustomImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries custom images and shared images supported by Elastic High Performance Computing (E-HPC).</p>
     * 
     * @param request ListCustomImagesRequest
     * @return ListCustomImagesResponse
     */
    public ListCustomImagesResponse listCustomImages(ListCustomImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCustomImagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries file systems and mount targets.</p>
     * 
     * @param request ListFileSystemWithMountTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFileSystemWithMountTargetsResponse
     */
    public ListFileSystemWithMountTargetsResponse listFileSystemWithMountTargetsWithOptions(ListFileSystemWithMountTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFileSystemWithMountTargets"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFileSystemWithMountTargetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries file systems and mount targets.</p>
     * 
     * @param request ListFileSystemWithMountTargetsRequest
     * @return ListFileSystemWithMountTargetsResponse
     */
    public ListFileSystemWithMountTargetsResponse listFileSystemWithMountTargets(ListFileSystemWithMountTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFileSystemWithMountTargetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of images that can be installed in a cluster.</p>
     * 
     * @param request ListImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListImagesResponse
     */
    public ListImagesResponse listImagesWithOptions(ListImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListImages"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of images that can be installed in a cluster.</p>
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
     * <p>Queries the software that is installed in a cluster.</p>
     * 
     * @param request ListInstalledSoftwareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstalledSoftwareResponse
     */
    public ListInstalledSoftwareResponse listInstalledSoftwareWithOptions(ListInstalledSoftwareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstalledSoftware"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstalledSoftwareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the software that is installed in a cluster.</p>
     * 
     * @param request ListInstalledSoftwareRequest
     * @return ListInstalledSoftwareResponse
     */
    public ListInstalledSoftwareResponse listInstalledSoftware(ListInstalledSoftwareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstalledSoftwareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result of an interactive command in a cluster.</p>
     * 
     * @param request ListInvocationResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInvocationResultsResponse
     */
    public ListInvocationResultsResponse listInvocationResultsWithOptions(ListInvocationResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInvocationResults"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInvocationResultsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the result of an interactive command in a cluster.</p>
     * 
     * @param request ListInvocationResultsRequest
     * @return ListInvocationResultsResponse
     */
    public ListInvocationResultsResponse listInvocationResults(ListInvocationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInvocationResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of an interactive command.</p>
     * 
     * @param request ListInvocationStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInvocationStatusResponse
     */
    public ListInvocationStatusResponse listInvocationStatusWithOptions(ListInvocationStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInvocationStatus"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInvocationStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of an interactive command.</p>
     * 
     * @param request ListInvocationStatusRequest
     * @return ListInvocationStatusResponse
     */
    public ListInvocationStatusResponse listInvocationStatus(ListInvocationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInvocationStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of job templates.</p>
     * 
     * @param request ListJobTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobTemplatesResponse
     */
    public ListJobTemplatesResponse listJobTemplatesWithOptions(ListJobTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobTemplates"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of job templates.</p>
     * 
     * @param request ListJobTemplatesRequest
     * @return ListJobTemplatesResponse
     */
    public ListJobTemplatesResponse listJobTemplates(ListJobTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of jobs in a cluster.</p>
     * 
     * @param request ListJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsResponse
     */
    public ListJobsResponse listJobsWithOptions(ListJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobs"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of jobs in a cluster.</p>
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
     * <p>Queries the details of a specified job.</p>
     * 
     * @param request ListJobsWithFiltersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListJobsWithFiltersResponse
     */
    public ListJobsWithFiltersResponse listJobsWithFiltersWithOptions(ListJobsWithFiltersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListJobsWithFilters"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListJobsWithFiltersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified job.</p>
     * 
     * @param request ListJobsWithFiltersRequest
     * @return ListJobsWithFiltersResponse
     */
    public ListJobsWithFiltersResponse listJobsWithFilters(ListJobsWithFiltersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listJobsWithFiltersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of nodes in a cluster.</p>
     * 
     * @param request ListNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesResponse
     */
    public ListNodesResponse listNodesWithOptions(ListNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of nodes in a cluster.</p>
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
     * <p>Queries the node information of a single cluster within an Alibaba Cloud account by queue.</p>
     * 
     * @param request ListNodesByQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesByQueueResponse
     */
    public ListNodesByQueueResponse listNodesByQueueWithOptions(ListNodesByQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodesByQueue"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesByQueueResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the node information of a single cluster within an Alibaba Cloud account by queue.</p>
     * 
     * @param request ListNodesByQueueRequest
     * @return ListNodesByQueueResponse
     */
    public ListNodesByQueueResponse listNodesByQueue(ListNodesByQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesByQueueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of all nodes in a specified cluster on one page.</p>
     * 
     * @param request ListNodesNoPagingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodesNoPagingResponse
     */
    public ListNodesNoPagingResponse listNodesNoPagingWithOptions(ListNodesNoPagingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodesNoPaging"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodesNoPagingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information of all nodes in a specified cluster on one page.</p>
     * 
     * @param request ListNodesNoPagingRequest
     * @return ListNodesNoPagingResponse
     */
    public ListNodesNoPagingResponse listNodesNoPaging(ListNodesNoPagingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodesNoPagingWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Elastic Compute Service (ECS) instance types recommended by Elastic High Performance Computing (E-HPC).</p>
     * 
     * @param request ListPreferredEcsTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPreferredEcsTypesResponse
     */
    public ListPreferredEcsTypesResponse listPreferredEcsTypesWithOptions(ListPreferredEcsTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPreferredEcsTypes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPreferredEcsTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Elastic Compute Service (ECS) instance types recommended by Elastic High Performance Computing (E-HPC).</p>
     * 
     * @param request ListPreferredEcsTypesRequest
     * @return ListPreferredEcsTypesResponse
     */
    public ListPreferredEcsTypesResponse listPreferredEcsTypes(ListPreferredEcsTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPreferredEcsTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the queues of a specified cluster.</p>
     * 
     * @param request ListQueuesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListQueuesResponse
     */
    public ListQueuesResponse listQueuesWithOptions(ListQueuesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueues"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueuesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the queues of a specified cluster.</p>
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
     * <p>Queries a list of regions where Elastic High Performance Computing (E-HPC) is supported.</p>
     * 
     * @param request ListRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of regions where Elastic High Performance Computing (E-HPC) is supported.</p>
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRegionsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the security groups that are assigned to an E-HPC cluster.</p>
     * 
     * @param request ListSecurityGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSecurityGroupsResponse
     */
    public ListSecurityGroupsResponse listSecurityGroupsWithOptions(ListSecurityGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSecurityGroups"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSecurityGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the security groups that are assigned to an E-HPC cluster.</p>
     * 
     * @param request ListSecurityGroupsRequest
     * @return ListSecurityGroupsResponse
     */
    public ListSecurityGroupsResponse listSecurityGroups(ListSecurityGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSecurityGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of serverless jobs based on filter conditions.</p>
     * 
     * @param request ListServerlessJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServerlessJobsResponse
     */
    public ListServerlessJobsResponse listServerlessJobsWithOptions(ListServerlessJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobNames)) {
            query.put("JobNames", request.jobNames);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startOrder)) {
            query.put("StartOrder", request.startOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submitOrder)) {
            query.put("SubmitOrder", request.submitOrder);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submitTimeEnd)) {
            query.put("SubmitTimeEnd", request.submitTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.submitTimeStart)) {
            query.put("SubmitTimeStart", request.submitTimeStart);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServerlessJobs"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServerlessJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of serverless jobs based on filter conditions.</p>
     * 
     * @param request ListServerlessJobsRequest
     * @return ListServerlessJobsResponse
     */
    public ListServerlessJobsResponse listServerlessJobs(ListServerlessJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServerlessJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of software that can be installed in a cluster.</p>
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
            new TeaPair("version", "2018-04-12"),
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
     * <p>Queries the list of software that can be installed in a cluster.</p>
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
     * <p>Queries the tags that are attached to a specified resource.</p>
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
            new TeaPair("version", "2018-04-12"),
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
     * <p>Queries the tags that are attached to a specified resource.</p>
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
     * <p>For some asynchronous API operations such as AddNodes, the system immediately returns a result without waiting for the node to be created if the request succeeds. In this case, you can use the TaskId returned by the asynchronous API operation to query the result of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the response of an asynchronous API operation for a cluster.</p>
     * 
     * @param request ListTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasksWithOptions(ListTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasks"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>For some asynchronous API operations such as AddNodes, the system immediately returns a result without waiting for the node to be created if the request succeeds. In this case, you can use the TaskId returned by the asynchronous API operation to query the result of the task.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the response of an asynchronous API operation for a cluster.</p>
     * 
     * @param request ListTasksRequest
     * @return ListTasksResponse
     */
    public ListTasksResponse listTasks(ListTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the latest version to which the client (ehpcutil) in a cluster can be updated and historical update records of the client.</p>
     * 
     * @param request ListUpgradeClientsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUpgradeClientsResponse
     */
    public ListUpgradeClientsResponse listUpgradeClientsWithOptions(ListUpgradeClientsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUpgradeClients"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUpgradeClientsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the latest version to which the client (ehpcutil) in a cluster can be updated and historical update records of the client.</p>
     * 
     * @param request ListUpgradeClientsRequest
     * @return ListUpgradeClientsResponse
     */
    public ListUpgradeClientsResponse listUpgradeClients(ListUpgradeClientsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUpgradeClientsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all users of a cluster.</p>
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
            new TeaPair("version", "2018-04-12"),
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
     * <p>Queries all users of a cluster.</p>
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
     * <p>Queries the users in a cluster.</p>
     * 
     * @param request ListUsersAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersAsyncResponse
     */
    public ListUsersAsyncResponse listUsersAsyncWithOptions(ListUsersAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsersAsync"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersAsyncResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the users in a cluster.</p>
     * 
     * @param request ListUsersAsyncRequest
     * @return ListUsersAsyncResponse
     */
    public ListUsersAsyncResponse listUsersAsync(ListUsersAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersAsyncWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the file systems mounted on Elastic High Performance Computing (E-HPC) clusters.</p>
     * 
     * @param request ListVolumesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVolumesResponse
     */
    public ListVolumesResponse listVolumesWithOptions(ListVolumesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVolumes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListVolumesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the file systems mounted on Elastic High Performance Computing (E-HPC) clusters.</p>
     * 
     * @param request ListVolumesRequest
     * @return ListVolumesResponse
     */
    public ListVolumesResponse listVolumes(ListVolumesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVolumesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/87126.html">DescribeCluster</a> operation to query details of the selected cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the basic information of a cluster, including the name, description, and image.</p>
     * 
     * @param request ModifyClusterAttributesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyClusterAttributesResponse
     */
    public ModifyClusterAttributesResponse modifyClusterAttributesWithOptions(ModifyClusterAttributesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterAttributes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterAttributesResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>Before you call this operation, you can call the <a href="https://help.aliyun.com/document_detail/87126.html">DescribeCluster</a> operation to query details of the selected cluster.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the basic information of a cluster, including the name, description, and image.</p>
     * 
     * @param request ModifyClusterAttributesRequest
     * @return ModifyClusterAttributesResponse
     */
    public ModifyClusterAttributesResponse modifyClusterAttributes(ModifyClusterAttributesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyClusterAttributesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the user group to which users belong.</p>
     * 
     * @param request ModifyUserGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserGroupsResponse
     */
    public ModifyUserGroupsResponse modifyUserGroupsWithOptions(ModifyUserGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserGroups"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the user group to which users belong.</p>
     * 
     * @param request ModifyUserGroupsRequest
     * @return ModifyUserGroupsResponse
     */
    public ModifyUserGroupsResponse modifyUserGroups(ModifyUserGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the passwords of users.</p>
     * 
     * @param request ModifyUserPasswordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserPasswordsResponse
     */
    public ModifyUserPasswordsResponse modifyUserPasswordsWithOptions(ModifyUserPasswordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserPasswords"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserPasswordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the passwords of users.</p>
     * 
     * @param request ModifyUserPasswordsRequest
     * @return ModifyUserPasswordsResponse
     */
    public ModifyUserPasswordsResponse modifyUserPasswords(ModifyUserPasswordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserPasswordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Sets a password that you can use to remotely connect to a visualization service in a cluster over the virtual network console (VNC).</p>
     * 
     * @param request ModifyVisualServicePasswdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVisualServicePasswdResponse
     */
    public ModifyVisualServicePasswdResponse modifyVisualServicePasswdWithOptions(ModifyVisualServicePasswdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVisualServicePasswd"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVisualServicePasswdResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Sets a password that you can use to remotely connect to a visualization service in a cluster over the virtual network console (VNC).</p>
     * 
     * @param request ModifyVisualServicePasswdRequest
     * @return ModifyVisualServicePasswdResponse
     */
    public ModifyVisualServicePasswdResponse modifyVisualServicePasswd(ModifyVisualServicePasswdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVisualServicePasswdWithOptions(request, runtime);
    }

    /**
     * @param request PullImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PullImageResponse
     */
    public PullImageResponse pullImageWithOptions(PullImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PullImage"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PullImageResponse());
    }

    /**
     * @param request PullImageRequest
     * @return PullImageResponse
     */
    public PullImageResponse pullImage(PullImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pullImageWithOptions(request, runtime);
    }

    /**
     * @param request QueryServicePackAndPriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryServicePackAndPriceResponse
     */
    public QueryServicePackAndPriceResponse queryServicePackAndPriceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryServicePackAndPrice"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryServicePackAndPriceResponse());
    }

    /**
     * @return QueryServicePackAndPriceResponse
     */
    public QueryServicePackAndPriceResponse queryServicePackAndPrice() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryServicePackAndPriceWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to reset and restore a cluster only when the cluster is in the Exception state. You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the ID and status of a cluster. We recommend that you export all job data before you restore a cluster. When you reset and restore a cluster, take note of the following impacts:</p>
     * <ul>
     * <li>The system disks of all nodes are changed. By default, new system disks are configured based on the settings that you specified when the cluster was created.</li>
     * <li>The data on the system disks and data disks of all cluster nodes is lost. The data includes user information, job information, scheduler queue information, and configuration data of auto-scaling queues. However, the data on File Storage NAS file systems is retained.</li>
     * <li>The self-managed queues in the cluster are deleted. All nodes are retained and migrated to the default queue of the cluster.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Resets and restores a cluster.</p>
     * 
     * @param request RecoverClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecoverClusterResponse
     */
    public RecoverClusterResponse recoverClusterWithOptions(RecoverClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecoverCluster"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecoverClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call the operation to reset and restore a cluster only when the cluster is in the Exception state. You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the ID and status of a cluster. We recommend that you export all job data before you restore a cluster. When you reset and restore a cluster, take note of the following impacts:</p>
     * <ul>
     * <li>The system disks of all nodes are changed. By default, new system disks are configured based on the settings that you specified when the cluster was created.</li>
     * <li>The data on the system disks and data disks of all cluster nodes is lost. The data includes user information, job information, scheduler queue information, and configuration data of auto-scaling queues. However, the data on File Storage NAS file systems is retained.</li>
     * <li>The self-managed queues in the cluster are deleted. All nodes are retained and migrated to the default queue of the cluster.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Resets and restores a cluster.</p>
     * 
     * @param request RecoverClusterRequest
     * @return RecoverClusterResponse
     */
    public RecoverClusterResponse recoverCluster(RecoverClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recoverClusterWithOptions(request, runtime);
    }

    /**
     * @param request RerunJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RerunJobsResponse
     */
    public RerunJobsResponse rerunJobsWithOptions(RerunJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RerunJobs"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RerunJobsResponse());
    }

    /**
     * @param request RerunJobsRequest
     * @return RerunJobsResponse
     */
    public RerunJobsResponse rerunJobs(RerunJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rerunJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After a node is reset, the operating system and software return to their initial states. To ensure that jobs run as expected, we recommend that you do not reset running nodes unless you need to perform crash recovery.</p>
     * 
     * @param request ResetNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetNodesResponse
     */
    public ResetNodesResponse resetNodesWithOptions(ResetNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetNodes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetNodesResponse());
    }

    /**
     * <b>description</b> :
     * <p>After a node is reset, the operating system and software return to their initial states. To ensure that jobs run as expected, we recommend that you do not reset running nodes unless you need to perform crash recovery.</p>
     * 
     * @param request ResetNodesRequest
     * @return ResetNodesResponse
     */
    public ResetNodesResponse resetNodes(ResetNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts the profiling process of a cluster.</p>
     * 
     * @param request RunCloudMetricProfilingRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunCloudMetricProfilingResponse
     */
    public RunCloudMetricProfilingResponse runCloudMetricProfilingWithOptions(RunCloudMetricProfilingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCloudMetricProfiling"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunCloudMetricProfilingResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts the profiling process of a cluster.</p>
     * 
     * @param request RunCloudMetricProfilingRequest
     * @return RunCloudMetricProfilingResponse
     */
    public RunCloudMetricProfilingResponse runCloudMetricProfiling(RunCloudMetricProfilingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runCloudMetricProfilingWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>If the settings in the Queue Configuration section are different from the settings in the Global Configurations section, the former prevails.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures the auto scaling settings of a cluster.</p>
     * 
     * @param request SetAutoScaleConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetAutoScaleConfigResponse
     */
    public SetAutoScaleConfigResponse setAutoScaleConfigWithOptions(SetAutoScaleConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetAutoScaleConfig"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetAutoScaleConfigResponse());
    }

    /**
     * <b>description</b> :
     * <h2>Usage notes</h2>
     * <p>If the settings in the Queue Configuration section are different from the settings in the Global Configurations section, the former prevails.</p>
     * 
     * <b>summary</b> : 
     * <p>Configures the auto scaling settings of a cluster.</p>
     * 
     * @param request SetAutoScaleConfigRequest
     * @return SetAutoScaleConfigResponse
     */
    public SetAutoScaleConfigResponse setAutoScaleConfig(SetAutoScaleConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setAutoScaleConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the post-processing scripts of a cluster.</p>
     * 
     * @param request SetPostScriptsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetPostScriptsResponse
     */
    public SetPostScriptsResponse setPostScriptsWithOptions(SetPostScriptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetPostScripts"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetPostScriptsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the post-processing scripts of a cluster.</p>
     * 
     * @param request SetPostScriptsRequest
     * @return SetPostScriptsResponse
     */
    public SetPostScriptsResponse setPostScripts(SetPostScriptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setPostScriptsWithOptions(request, runtime);
    }

    /**
     * @param request SetQueueRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetQueueResponse
     */
    public SetQueueResponse setQueueWithOptions(SetQueueRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetQueue"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetQueueResponse());
    }

    /**
     * @param request SetQueueRequest
     * @return SetQueueResponse
     */
    public SetQueueResponse setQueue(SetQueueRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setQueueWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the scheduler settings of a cluster.</p>
     * 
     * @param request SetSchedulerInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSchedulerInfoResponse
     */
    public SetSchedulerInfoResponse setSchedulerInfoWithOptions(SetSchedulerInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSchedulerInfo"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSchedulerInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the scheduler settings of a cluster.</p>
     * 
     * @param request SetSchedulerInfoRequest
     * @return SetSchedulerInfoResponse
     */
    public SetSchedulerInfoResponse setSchedulerInfo(SetSchedulerInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSchedulerInfoWithOptions(request, runtime);
    }

    /**
     * @param request StartClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartClusterResponse
     */
    public StartClusterResponse startClusterWithOptions(StartClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartCluster"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartClusterResponse());
    }

    /**
     * @param request StartClusterRequest
     * @return StartClusterResponse
     */
    public StartClusterResponse startCluster(StartClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startClusterWithOptions(request, runtime);
    }

    /**
     * @param request StartNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartNodesResponse
     */
    public StartNodesResponse startNodesWithOptions(StartNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartNodes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartNodesResponse());
    }

    /**
     * @param request StartNodesRequest
     * @return StartNodesResponse
     */
    public StartNodesResponse startNodes(StartNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts the Virtual Network Console (VNC) Remote visualization service in a specified cluster.</p>
     * 
     * @param request StartVisualServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartVisualServiceResponse
     */
    public StartVisualServiceResponse startVisualServiceWithOptions(StartVisualServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartVisualService"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartVisualServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts the Virtual Network Console (VNC) Remote visualization service in a specified cluster.</p>
     * 
     * @param request StartVisualServiceRequest
     * @return StartVisualServiceResponse
     */
    public StartVisualServiceResponse startVisualService(StartVisualServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startVisualServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you stop a subscription compute node, its billing is not affected. If you stop a pay-as-you-go compute node for which you have enabled the <em>economical mode</em>, you are no longer charged for its computing resources. For more information, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a cluster.</p>
     * 
     * @param request StopClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopClusterResponse
     */
    public StopClusterResponse stopClusterWithOptions(StopClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopCluster"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you stop a subscription compute node, its billing is not affected. If you stop a pay-as-you-go compute node for which you have enabled the <em>economical mode</em>, you are no longer charged for its computing resources. For more information, see <a href="https://help.aliyun.com/document_detail/63353.html">Economical mode</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Stops a cluster.</p>
     * 
     * @param request StopClusterRequest
     * @return StopClusterResponse
     */
    public StopClusterResponse stopCluster(StopClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopClusterWithOptions(request, runtime);
    }

    /**
     * @param request StopJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopJobsResponse
     */
    public StopJobsResponse stopJobsWithOptions(StopJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopJobs"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopJobsResponse());
    }

    /**
     * @param request StopJobsRequest
     * @return StopJobsResponse
     */
    public StopJobsResponse stopJobs(StopJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopJobsWithOptions(request, runtime);
    }

    /**
     * @param request StopNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopNodesResponse
     */
    public StopNodesResponse stopNodesWithOptions(StopNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopNodes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopNodesResponse());
    }

    /**
     * @param request StopNodesRequest
     * @return StopNodesResponse
     */
    public StopNodesResponse stopNodes(StopNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops Serverless jobs in a cluster based on job IDs or subtask IDs (array jobs). If you specify the job ID of an array job, all subtasks in the job are stopped.</p>
     * 
     * @param request StopServerlessJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopServerlessJobsResponse
     */
    public StopServerlessJobsResponse stopServerlessJobsWithOptions(StopServerlessJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobIds)) {
            query.put("JobIds", request.jobIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopServerlessJobs"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopServerlessJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops Serverless jobs in a cluster based on job IDs or subtask IDs (array jobs). If you specify the job ID of an array job, all subtasks in the job are stopped.</p>
     * 
     * @param request StopServerlessJobsRequest
     * @return StopServerlessJobsResponse
     */
    public StopServerlessJobsResponse stopServerlessJobs(StopServerlessJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopServerlessJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops the remote visualization service of Virtual Network Console (VNC) in a cluster.</p>
     * 
     * @param request StopVisualServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopVisualServiceResponse
     */
    public StopVisualServiceResponse stopVisualServiceWithOptions(StopVisualServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopVisualService"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopVisualServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops the remote visualization service of Virtual Network Console (VNC) in a cluster.</p>
     * 
     * @param request StopVisualServiceRequest
     * @return StopVisualServiceResponse
     */
    public StopVisualServiceResponse stopVisualService(StopVisualServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopVisualServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The ID of the request.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a job in a cluster.</p>
     * 
     * @param request SubmitJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitJobResponse
     */
    public SubmitJobResponse submitJobWithOptions(SubmitJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitJob"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>The ID of the request.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits a job in a cluster.</p>
     * 
     * @param request SubmitJobRequest
     * @return SubmitJobResponse
     */
    public SubmitJobResponse submitJob(SubmitJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a serverless job to an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param tmpReq SubmitServerlessJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitServerlessJobResponse
     */
    public SubmitServerlessJobResponse submitServerlessJobWithOptions(SubmitServerlessJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SubmitServerlessJobShrinkRequest request = new SubmitServerlessJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.arrayProperties)) {
            request.arrayPropertiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.arrayProperties, "ArrayProperties", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.container)) {
            request.containerShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.container, "Container", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dependsOn)) {
            request.dependsOnShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dependsOn, "DependsOn", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceType)) {
            request.instanceTypeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceType, "InstanceType", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.retryStrategy)) {
            request.retryStrategyShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.retryStrategy, "RetryStrategy", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vSwitchId)) {
            request.vSwitchIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vSwitchId, "VSwitchId", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arrayPropertiesShrink)) {
            query.put("ArrayProperties", request.arrayPropertiesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerShrink)) {
            query.put("Container", request.containerShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cpu)) {
            query.put("Cpu", request.cpu);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dependsOnShrink)) {
            query.put("DependsOn", request.dependsOnShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ephemeralStorage)) {
            query.put("EphemeralStorage", request.ephemeralStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceTypeShrink)) {
            query.put("InstanceType", request.instanceTypeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobPriority)) {
            query.put("JobPriority", request.jobPriority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memory)) {
            query.put("Memory", request.memory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramRoleName)) {
            query.put("RamRoleName", request.ramRoleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.retryStrategyShrink)) {
            query.put("RetryStrategy", request.retryStrategyShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotPriceLimit)) {
            query.put("SpotPriceLimit", request.spotPriceLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotStrategy)) {
            query.put("SpotStrategy", request.spotStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchIdShrink)) {
            query.put("VSwitchId", request.vSwitchIdShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitServerlessJob"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitServerlessJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits a serverless job to an Elastic High Performance Computing (E-HPC) cluster.</p>
     * 
     * @param request SubmitServerlessJobRequest
     * @return SubmitServerlessJobResponse
     */
    public SubmitServerlessJobResponse submitServerlessJob(SubmitServerlessJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitServerlessJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronizes local cluster users to a hybrid cloud cluster in hybrid-cloud proxy mode.</p>
     * 
     * @param request SyncUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncUsersResponse
     */
    public SyncUsersResponse syncUsersWithOptions(SyncUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncUsers"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Synchronizes local cluster users to a hybrid cloud cluster in hybrid-cloud proxy mode.</p>
     * 
     * @param request SyncUsersRequest
     * @return SyncUsersResponse
     */
    public SyncUsersResponse syncUsers(SyncUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncUsersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates tags and attach the tags to a specified resource.</p>
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
            new TeaPair("version", "2018-04-12"),
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
     * <p>Creates tags and attach the tags to a specified resource.</p>
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
     * <p>Removes tags from a specified resource.</p>
     * 
     * @param request UnTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnTagResourcesResponse
     */
    public UnTagResourcesResponse unTagResourcesWithOptions(UnTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "UnTagResources"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from a specified resource.</p>
     * 
     * @param request UnTagResourcesRequest
     * @return UnTagResourcesResponse
     */
    public UnTagResourcesResponse unTagResources(UnTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uninstalls software from a cluster.</p>
     * 
     * @param request UninstallSoftwareRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UninstallSoftwareResponse
     */
    public UninstallSoftwareResponse uninstallSoftwareWithOptions(UninstallSoftwareRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UninstallSoftware"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UninstallSoftwareResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uninstalls software from a cluster.</p>
     * 
     * @param request UninstallSoftwareRequest
     * @return UninstallSoftwareResponse
     */
    public UninstallSoftwareResponse uninstallSoftware(UninstallSoftwareRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uninstallSoftwareWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Mount new storage resources to a cluster.</p>
     * 
     * @param request UpdateClusterVolumesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClusterVolumesResponse
     */
    public UpdateClusterVolumesResponse updateClusterVolumesWithOptions(UpdateClusterVolumesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClusterVolumes"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClusterVolumesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Mount new storage resources to a cluster.</p>
     * 
     * @param request UpdateClusterVolumesRequest
     * @return UpdateClusterVolumesResponse
     */
    public UpdateClusterVolumesResponse updateClusterVolumes(UpdateClusterVolumesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClusterVolumesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you update the resource group, the nodes that you add by scaling out the cluster are automatically included in the resource group.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the resource group information and the instance types of compute nodes for a queue of a cluster.</p>
     * 
     * @param request UpdateQueueConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateQueueConfigResponse
     */
    public UpdateQueueConfigResponse updateQueueConfigWithOptions(UpdateQueueConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateQueueConfig"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateQueueConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you update the resource group, the nodes that you add by scaling out the cluster are automatically included in the resource group.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the resource group information and the instance types of compute nodes for a queue of a cluster.</p>
     * 
     * @param request UpdateQueueConfigRequest
     * @return UpdateQueueConfigResponse
     */
    public UpdateQueueConfigResponse updateQueueConfig(UpdateQueueConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateQueueConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the client (ehpcutil) in a cluster to a new version.</p>
     * 
     * @param request UpgradeClientRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeClientResponse
     */
    public UpgradeClientResponse upgradeClientWithOptions(UpgradeClientRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeClient"),
            new TeaPair("version", "2018-04-12"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeClientResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the client (ehpcutil) in a cluster to a new version.</p>
     * 
     * @param request UpgradeClientRequest
     * @return UpgradeClientResponse
     */
    public UpgradeClientResponse upgradeClient(UpgradeClientRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeClientWithOptions(request, runtime);
    }
}
