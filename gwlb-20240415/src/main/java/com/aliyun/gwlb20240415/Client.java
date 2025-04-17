// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gwlb20240415;

import com.aliyun.tea.*;
import com.aliyun.gwlb20240415.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("gwlb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p><em>AddServersToServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.</p>
     * <ol>
     * <li>You can call the ListServerGroups operation to query the status of the server group.</li>
     * </ol>
     * <ul>
     * <li>If the server group is in the <strong>Configuring</strong> state, the server group is being modified.</li>
     * <li>If the server group is in the <strong>Available</strong> state, the server group is running.</li>
     * </ul>
     * <ol start="2">
     * <li>You can call the ListServerGroupServers operation to query the status of the backend server.</li>
     * </ol>
     * <ul>
     * <li>If the backend server is in the <strong>Adding</strong> state, the backend server is being added to the server group.</li>
     * <li>If the backend server is in the <strong>Available</strong> state, the server is running.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds backend servers to the server group of a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request AddServersToServerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddServersToServerGroupResponse
     */
    public AddServersToServerGroupResponse addServersToServerGroupWithOptions(AddServersToServerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            body.put("ServerGroupId", request.serverGroupId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.servers)) {
            bodyFlat.put("Servers", request.servers);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddServersToServerGroup"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddServersToServerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>AddServersToServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.</p>
     * <ol>
     * <li>You can call the ListServerGroups operation to query the status of the server group.</li>
     * </ol>
     * <ul>
     * <li>If the server group is in the <strong>Configuring</strong> state, the server group is being modified.</li>
     * <li>If the server group is in the <strong>Available</strong> state, the server group is running.</li>
     * </ul>
     * <ol start="2">
     * <li>You can call the ListServerGroupServers operation to query the status of the backend server.</li>
     * </ol>
     * <ul>
     * <li>If the backend server is in the <strong>Adding</strong> state, the backend server is being added to the server group.</li>
     * <li>If the backend server is in the <strong>Available</strong> state, the server is running.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds backend servers to the server group of a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request AddServersToServerGroupRequest
     * @return AddServersToServerGroupResponse
     */
    public AddServersToServerGroupResponse addServersToServerGroup(AddServersToServerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addServersToServerGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>CreateListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>GetListenerAttribute</strong> operation to query the status of the task.</p>
     * <ul>
     * <li>If the listener is in the <strong>Provisioning</strong> state, the listener is being created.</li>
     * <li>If the listener is in the <strong>Running</strong> state, the listener is running.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a listener for a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request CreateListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateListenerResponse
     */
    public CreateListenerResponse createListenerWithOptions(CreateListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerDescription)) {
            body.put("ListenerDescription", request.listenerDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            body.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            body.put("ServerGroupId", request.serverGroupId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateListener"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateListenerResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>CreateListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>GetListenerAttribute</strong> operation to query the status of the task.</p>
     * <ul>
     * <li>If the listener is in the <strong>Provisioning</strong> state, the listener is being created.</li>
     * <li>If the listener is in the <strong>Running</strong> state, the listener is running.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a listener for a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request CreateListenerRequest
     * @return CreateListenerResponse
     */
    public CreateListenerResponse createListener(CreateListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createListenerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/2806160.html">pricing</a> of GWLB before calling this operation</em>*.</p>
     * <ul>
     * <li>When you create a GWLB instance, the service-linked role AliyunServiceRoleForGwlb is automatically created.</li>
     * <li>CreateLoadBalancer is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the GetLoadBalancerAttribute operation to query the status of a GWLB instance.<ul>
     * <li>If the GWLB instance is in the Provisioning state, the GWLB instance is being created.</li>
     * <li>If the GWLB instance is in the Active state, the GWLB instance is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request CreateLoadBalancerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadBalancerResponse
     */
    public CreateLoadBalancerResponse createLoadBalancerWithOptions(CreateLoadBalancerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressIpVersion)) {
            body.put("AddressIpVersion", request.addressIpVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerName)) {
            body.put("LoadBalancerName", request.loadBalancerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneMappings)) {
            bodyFlat.put("ZoneMappings", request.zoneMappings);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancer"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/2806160.html">pricing</a> of GWLB before calling this operation</em>*.</p>
     * <ul>
     * <li>When you create a GWLB instance, the service-linked role AliyunServiceRoleForGwlb is automatically created.</li>
     * <li>CreateLoadBalancer is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the GetLoadBalancerAttribute operation to query the status of a GWLB instance.<ul>
     * <li>If the GWLB instance is in the Provisioning state, the GWLB instance is being created.</li>
     * <li>If the GWLB instance is in the Active state, the GWLB instance is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request CreateLoadBalancerRequest
     * @return CreateLoadBalancerResponse
     */
    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>CreateServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListServerGroups operation to query the status of the task.</p>
     * <ul>
     * <li>If the server group is in the <strong>Creating</strong> state, it indicates that the server group is being created.</li>
     * <li>If the server group is in the <strong>Available</strong> state, it indicates that the server group is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a server group for a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request CreateServerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServerGroupResponse
     */
    public CreateServerGroupResponse createServerGroupWithOptions(CreateServerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionDrainConfig)) {
            bodyFlat.put("ConnectionDrainConfig", request.connectionDrainConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConfig)) {
            bodyFlat.put("HealthCheckConfig", request.healthCheckConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            body.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            body.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverFailoverMode)) {
            body.put("ServerFailoverMode", request.serverFailoverMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupName)) {
            body.put("ServerGroupName", request.serverGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupType)) {
            body.put("ServerGroupType", request.serverGroupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateServerGroup"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>CreateServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListServerGroups operation to query the status of the task.</p>
     * <ul>
     * <li>If the server group is in the <strong>Creating</strong> state, it indicates that the server group is being created.</li>
     * <li>If the server group is in the <strong>Available</strong> state, it indicates that the server group is created.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a server group for a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request CreateServerGroupRequest
     * @return CreateServerGroupResponse
     */
    public CreateServerGroupResponse createServerGroup(CreateServerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServerGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>GetListenerAttribute</strong> operation to query the status of the task.</p>
     * <ul>
     * <li>If the listener is in the <strong>Deleting</strong> state, the listener is being deleted.</li>
     * <li>If the listener cannot be found, the listener is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a listener from a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request DeleteListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteListenerResponse
     */
    public DeleteListenerResponse deleteListenerWithOptions(DeleteListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            body.put("ListenerId", request.listenerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteListener"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteListenerResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>DeleteListener</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>GetListenerAttribute</strong> operation to query the status of the task.</p>
     * <ul>
     * <li>If the listener is in the <strong>Deleting</strong> state, the listener is being deleted.</li>
     * <li>If the listener cannot be found, the listener is deleted.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a listener from a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request DeleteListenerRequest
     * @return DeleteListenerResponse
     */
    public DeleteListenerResponse deleteListener(DeleteListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteListenerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request DeleteLoadBalancerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLoadBalancerResponse
     */
    public DeleteLoadBalancerResponse deleteLoadBalancerWithOptions(DeleteLoadBalancerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            body.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLoadBalancer"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLoadBalancerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request DeleteLoadBalancerRequest
     * @return DeleteLoadBalancerResponse
     */
    public DeleteLoadBalancerResponse deleteLoadBalancer(DeleteLoadBalancerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLoadBalancerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete server groups that are not associated with listeners.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a server group from a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request DeleteServerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteServerGroupResponse
     */
    public DeleteServerGroupResponse deleteServerGroupWithOptions(DeleteServerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            body.put("ServerGroupId", request.serverGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteServerGroup"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteServerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can delete server groups that are not associated with listeners.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a server group from a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request DeleteServerGroupRequest
     * @return DeleteServerGroupResponse
     */
    public DeleteServerGroupResponse deleteServerGroup(DeleteServerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteServerGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the most recent region list of Gateway Load Balancer (GWLB).</p>
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
            new TeaPair("version", "2024-04-15"),
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
     * <p>Queries the most recent region list of Gateway Load Balancer (GWLB).</p>
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
     * <p>Queries the most recent zone list of Gateway Load Balancer (GWLB).</p>
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
            new TeaPair("version", "2024-04-15"),
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
     * <p>Queries the most recent zone list of Gateway Load Balancer (GWLB).</p>
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
     * <p>Queries the details of a Gateway Load Balancer (GWLB) listener.</p>
     * 
     * @param request GetListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetListenerAttributeResponse
     */
    public GetListenerAttributeResponse getListenerAttributeWithOptions(GetListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            body.put("ListenerId", request.listenerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetListenerAttribute"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetListenerAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Gateway Load Balancer (GWLB) listener.</p>
     * 
     * @param request GetListenerAttributeRequest
     * @return GetListenerAttributeResponse
     */
    public GetListenerAttributeResponse getListenerAttribute(GetListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getListenerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the health check status of a Gateway Load Balancer (GWLB) listener.</p>
     * 
     * @param request GetListenerHealthStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetListenerHealthStatusResponse
     */
    public GetListenerHealthStatusResponse getListenerHealthStatusWithOptions(GetListenerHealthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            bodyFlat.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            body.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            body.put("Skip", request.skip);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetListenerHealthStatus"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetListenerHealthStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the health check status of a Gateway Load Balancer (GWLB) listener.</p>
     * 
     * @param request GetListenerHealthStatusRequest
     * @return GetListenerHealthStatusResponse
     */
    public GetListenerHealthStatusResponse getListenerHealthStatus(GetListenerHealthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getListenerHealthStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request GetLoadBalancerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLoadBalancerAttributeResponse
     */
    public GetLoadBalancerAttributeResponse getLoadBalancerAttributeWithOptions(GetLoadBalancerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            body.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLoadBalancerAttribute"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLoadBalancerAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request GetLoadBalancerAttributeRequest
     * @return GetLoadBalancerAttributeResponse
     */
    public GetLoadBalancerAttributeResponse getLoadBalancerAttribute(GetLoadBalancerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLoadBalancerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Gateway Load Balancer (GWLB) listeners.</p>
     * 
     * @param request ListListenersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListListenersResponse
     */
    public ListListenersResponse listListenersWithOptions(ListListenersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerIds)) {
            bodyFlat.put("ListenerIds", request.listenerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerIds)) {
            bodyFlat.put("LoadBalancerIds", request.loadBalancerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            body.put("Skip", request.skip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListListeners"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListListenersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Gateway Load Balancer (GWLB) listeners.</p>
     * 
     * @param request ListListenersRequest
     * @return ListListenersResponse
     */
    public ListListenersResponse listListeners(ListListenersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listListenersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Gateway Load Balancer (GWLB) instances.</p>
     * 
     * @param request ListLoadBalancersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLoadBalancersResponse
     */
    public ListLoadBalancersResponse listLoadBalancersWithOptions(ListLoadBalancersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressIpVersion)) {
            body.put("AddressIpVersion", request.addressIpVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerBusinessStatus)) {
            body.put("LoadBalancerBusinessStatus", request.loadBalancerBusinessStatus);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerIds)) {
            bodyFlat.put("LoadBalancerIds", request.loadBalancerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerNames)) {
            bodyFlat.put("LoadBalancerNames", request.loadBalancerNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerStatus)) {
            body.put("LoadBalancerStatus", request.loadBalancerStatus);
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

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            body.put("Skip", request.skip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMode)) {
            body.put("TrafficMode", request.trafficMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcIds)) {
            bodyFlat.put("VpcIds", request.vpcIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneIds)) {
            bodyFlat.put("ZoneIds", request.zoneIds);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLoadBalancers"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLoadBalancersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Gateway Load Balancer (GWLB) instances.</p>
     * 
     * @param request ListLoadBalancersRequest
     * @return ListLoadBalancersResponse
     */
    public ListLoadBalancersResponse listLoadBalancers(ListLoadBalancersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLoadBalancersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the server groups of a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request ListServerGroupServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServerGroupServersResponse
     */
    public ListServerGroupServersResponse listServerGroupServersWithOptions(ListServerGroupServersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            body.put("ServerGroupId", request.serverGroupId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serverIds)) {
            bodyFlat.put("ServerIds", request.serverIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverIps)) {
            bodyFlat.put("ServerIps", request.serverIps);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            body.put("Skip", request.skip);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServerGroupServers"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServerGroupServersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the server groups of a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request ListServerGroupServersRequest
     * @return ListServerGroupServersResponse
     */
    public ListServerGroupServersResponse listServerGroupServers(ListServerGroupServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServerGroupServersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the server groups of a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request ListServerGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListServerGroupsResponse
     */
    public ListServerGroupsResponse listServerGroupsWithOptions(ListServerGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupIds)) {
            bodyFlat.put("ServerGroupIds", request.serverGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupNames)) {
            bodyFlat.put("ServerGroupNames", request.serverGroupNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupType)) {
            body.put("ServerGroupType", request.serverGroupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skip)) {
            body.put("Skip", request.skip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListServerGroups"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListServerGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the server groups of a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request ListServerGroupsRequest
     * @return ListServerGroupsResponse
     */
    public ListServerGroupsResponse listServerGroups(ListServerGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listServerGroupsWithOptions(request, runtime);
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
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            body.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            bodyFlat.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2024-04-15"),
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
     * <p>Changes the resource group to which a specified cloud resource belongs.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroupWithOptions(MoveResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            body.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveResourceGroup"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which a specified cloud resource belongs.</p>
     * 
     * @param request MoveResourceGroupRequest
     * @return MoveResourceGroupResponse
     */
    public MoveResourceGroupResponse moveResourceGroup(MoveResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>RemoveServersFromServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.</p>
     * <ol>
     * <li>You can call the ListServerGroups operation to query the status of a server group.<ul>
     * <li>If the server group is in the <strong>Configuring</strong> state, the server group is being modified.</li>
     * <li>If the server group is in the <strong>Available</strong> state, the server group is running.</li>
     * </ul>
     * </li>
     * <li>You can call the ListServerGroupServers operation to query the status of a backend server.<ul>
     * <li>If the backend server is in the <strong>Removing</strong> state, the backend server is being removed from the server group.</li>
     * <li>If the backend server cannot be found, the backend server is no longer in the server group.<blockquote>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>If connection draining id enabled (<strong>ConnectionDrainEnabled</strong> set to true) for the server group of the backend server, the backend server that you remove enters the <strong>Removing</strong> state before entering the <strong>Draining</strong> state. When the connection draining timeout period (<strong>ConnectionDrainTimeout</strong>) ends, the backend server is removed from the server group.</li>
     * <li>You can add the backend server to the server group again before the connection draining timeout period ends. In this case, the status of the backend server changes from <strong>Draining</strong> to <strong>Adding</strong>. After the backend server is added to the server group, the backend server enters the <strong>Available</strong> state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes backend servers from the server group of a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request RemoveServersFromServerGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveServersFromServerGroupResponse
     */
    public RemoveServersFromServerGroupResponse removeServersFromServerGroupWithOptions(RemoveServersFromServerGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            body.put("ServerGroupId", request.serverGroupId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.servers)) {
            bodyFlat.put("Servers", request.servers);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveServersFromServerGroup"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveServersFromServerGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>RemoveServersFromServerGroup</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background.</p>
     * <ol>
     * <li>You can call the ListServerGroups operation to query the status of a server group.<ul>
     * <li>If the server group is in the <strong>Configuring</strong> state, the server group is being modified.</li>
     * <li>If the server group is in the <strong>Available</strong> state, the server group is running.</li>
     * </ul>
     * </li>
     * <li>You can call the ListServerGroupServers operation to query the status of a backend server.<ul>
     * <li>If the backend server is in the <strong>Removing</strong> state, the backend server is being removed from the server group.</li>
     * <li>If the backend server cannot be found, the backend server is no longer in the server group.<blockquote>
     * </blockquote>
     * </li>
     * </ul>
     * </li>
     * </ol>
     * <ul>
     * <li>If connection draining id enabled (<strong>ConnectionDrainEnabled</strong> set to true) for the server group of the backend server, the backend server that you remove enters the <strong>Removing</strong> state before entering the <strong>Draining</strong> state. When the connection draining timeout period (<strong>ConnectionDrainTimeout</strong>) ends, the backend server is removed from the server group.</li>
     * <li>You can add the backend server to the server group again before the connection draining timeout period ends. In this case, the status of the backend server changes from <strong>Draining</strong> to <strong>Adding</strong>. After the backend server is added to the server group, the backend server enters the <strong>Available</strong> state.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes backend servers from the server group of a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request RemoveServersFromServerGroupRequest
     * @return RemoveServersFromServerGroupResponse
     */
    public RemoveServersFromServerGroupResponse removeServersFromServerGroup(RemoveServersFromServerGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeServersFromServerGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and adds tags to resources.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            bodyFlat.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            bodyFlat.put("Tag", request.tag);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2024-04-15"),
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
     * <p>Creates and adds tags to resources.</p>
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
     * <p>Removes tags from resources.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            body.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            bodyFlat.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            bodyFlat.put("TagKey", request.tagKey);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2024-04-15"),
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
     * <p>Removes tags from resources.</p>
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
     * <p><em>UpdateListenerAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>GetListenerAttribute</strong> operation to query the status of a listener.</p>
     * <ul>
     * <li>If the listener is in the <strong>Configuring</strong> state, the listener is being modified.</li>
     * <li>If the listener is in the <strong>Running</strong> state, the listener is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the configurations of a Gateway Load Balancer (GWLB) listener.</p>
     * 
     * @param request UpdateListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateListenerAttributeResponse
     */
    public UpdateListenerAttributeResponse updateListenerAttributeWithOptions(UpdateListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerDescription)) {
            body.put("ListenerDescription", request.listenerDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerId)) {
            body.put("ListenerId", request.listenerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            body.put("ServerGroupId", request.serverGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateListenerAttribute"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateListenerAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateListenerAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the <strong>GetListenerAttribute</strong> operation to query the status of a listener.</p>
     * <ul>
     * <li>If the listener is in the <strong>Configuring</strong> state, the listener is being modified.</li>
     * <li>If the listener is in the <strong>Running</strong> state, the listener is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the configurations of a Gateway Load Balancer (GWLB) listener.</p>
     * 
     * @param request UpdateListenerAttributeRequest
     * @return UpdateListenerAttributeResponse
     */
    public UpdateListenerAttributeResponse updateListenerAttribute(UpdateListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateListenerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  UpdateLoadBalancerAttribute is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the GetLoadBalancerAttribute operation to query the status of the GWLB instance.
     *     *   If the GWLB instance is in the Configuring state, the GWLB instance is being modified.
     *     *   If the GWLB instance is in the Active state, the GWLB instance is modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the attributes of a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request UpdateLoadBalancerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLoadBalancerAttributeResponse
     */
    public UpdateLoadBalancerAttributeResponse updateLoadBalancerAttributeWithOptions(UpdateLoadBalancerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            body.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerName)) {
            body.put("LoadBalancerName", request.loadBalancerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.trafficMode)) {
            body.put("TrafficMode", request.trafficMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLoadBalancerAttribute"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLoadBalancerAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  UpdateLoadBalancerAttribute is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the GetLoadBalancerAttribute operation to query the status of the GWLB instance.
     *     *   If the GWLB instance is in the Configuring state, the GWLB instance is being modified.
     *     *   If the GWLB instance is in the Active state, the GWLB instance is modified.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the attributes of a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request UpdateLoadBalancerAttributeRequest
     * @return UpdateLoadBalancerAttributeResponse
     */
    public UpdateLoadBalancerAttributeResponse updateLoadBalancerAttribute(UpdateLoadBalancerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLoadBalancerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/2806160.html">pricing</a> of GWLB before calling this operation</em>*.
     * UpdateLoadBalancerZones is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the GetLoadBalancerAttribute operation to query the status of the GWLB instance.</p>
     * <ul>
     * <li>If the GWLB instance is in the Configuring state, the GWLB instance is being modified.</li>
     * <li>If the GWLB instance is in the Active state, the GWLB instance is modified.<blockquote>
     * <p> Before you call this operation, make sure that all zone parameters, including the current zones and the zones that you want to add, are specified. If you do not specify the current zones, the current zones are deleted. You can call the GetLoadBalancerAttribute operation to query the current zones of a GWLB instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the zones of a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request UpdateLoadBalancerZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLoadBalancerZonesResponse
     */
    public UpdateLoadBalancerZonesResponse updateLoadBalancerZonesWithOptions(UpdateLoadBalancerZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            body.put("LoadBalancerId", request.loadBalancerId);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.zoneMappings)) {
            bodyFlat.put("ZoneMappings", request.zoneMappings);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLoadBalancerZones"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLoadBalancerZonesResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Make sure that you fully understand the billing methods and <a href="https://help.aliyun.com/document_detail/2806160.html">pricing</a> of GWLB before calling this operation</em>*.
     * UpdateLoadBalancerZones is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the GetLoadBalancerAttribute operation to query the status of the GWLB instance.</p>
     * <ul>
     * <li>If the GWLB instance is in the Configuring state, the GWLB instance is being modified.</li>
     * <li>If the GWLB instance is in the Active state, the GWLB instance is modified.<blockquote>
     * <p> Before you call this operation, make sure that all zone parameters, including the current zones and the zones that you want to add, are specified. If you do not specify the current zones, the current zones are deleted. You can call the GetLoadBalancerAttribute operation to query the current zones of a GWLB instance.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the zones of a Gateway Load Balancer (GWLB) instance.</p>
     * 
     * @param request UpdateLoadBalancerZonesRequest
     * @return UpdateLoadBalancerZonesResponse
     */
    public UpdateLoadBalancerZonesResponse updateLoadBalancerZones(UpdateLoadBalancerZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLoadBalancerZonesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateServerGroupAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListServerGroups operation to query the status of the task.</p>
     * <ul>
     * <li>If the server group is in the <strong>Configuring</strong> state, the configuration of the server group is being modified.</li>
     * <li>If the server group is in the <strong>Available</strong> state, the configuration of the server group is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the attributes of a server group.</p>
     * 
     * @param request UpdateServerGroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateServerGroupAttributeResponse
     */
    public UpdateServerGroupAttributeResponse updateServerGroupAttributeWithOptions(UpdateServerGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionDrainConfig)) {
            bodyFlat.put("ConnectionDrainConfig", request.connectionDrainConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConfig)) {
            bodyFlat.put("HealthCheckConfig", request.healthCheckConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            body.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverFailoverMode)) {
            body.put("ServerFailoverMode", request.serverFailoverMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupId)) {
            body.put("ServerGroupId", request.serverGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverGroupName)) {
            body.put("ServerGroupName", request.serverGroupName);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateServerGroupAttribute"),
            new TeaPair("version", "2024-04-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateServerGroupAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>UpdateServerGroupAttribute</em>* is an asynchronous operation. After a request is sent, the system returns a request ID and runs the task in the background. You can call the ListServerGroups operation to query the status of the task.</p>
     * <ul>
     * <li>If the server group is in the <strong>Configuring</strong> state, the configuration of the server group is being modified.</li>
     * <li>If the server group is in the <strong>Available</strong> state, the configuration of the server group is modified.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates the attributes of a server group.</p>
     * 
     * @param request UpdateServerGroupAttributeRequest
     * @return UpdateServerGroupAttributeResponse
     */
    public UpdateServerGroupAttributeResponse updateServerGroupAttribute(UpdateServerGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServerGroupAttributeWithOptions(request, runtime);
    }
}
