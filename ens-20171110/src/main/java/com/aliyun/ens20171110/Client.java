// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110;

import com.aliyun.tea.*;
import com.aliyun.ens20171110.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("ens", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Associates a network access control list (ACL) with a network.</p>
     * 
     * @param request AccosicateNetworkAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AccosicateNetworkAclResponse
     */
    public AccosicateNetworkAclResponse accosicateNetworkAclWithOptions(AccosicateNetworkAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkAclId)) {
            query.put("NetworkAclId", request.networkAclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AccosicateNetworkAcl"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AccosicateNetworkAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates a network access control list (ACL) with a network.</p>
     * 
     * @param request AccosicateNetworkAclRequest
     * @return AccosicateNetworkAclResponse
     */
    public AccosicateNetworkAclResponse accosicateNetworkAcl(AccosicateNetworkAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.accosicateNetworkAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds backend servers.</p>
     * 
     * @param tmpReq AddBackendServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddBackendServersResponse
     */
    public AddBackendServersResponse addBackendServersWithOptions(AddBackendServersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddBackendServersShrinkRequest request = new AddBackendServersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.backendServers)) {
            request.backendServersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.backendServers, "BackendServers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendServersShrink)) {
            query.put("BackendServers", request.backendServersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddBackendServers"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddBackendServersResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds backend servers.</p>
     * 
     * @param request AddBackendServersRequest
     * @return AddBackendServersResponse
     */
    public AddBackendServersResponse addBackendServers(AddBackendServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBackendServersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures Network Address Translation (NAT) rules for an instance. This operation is an asynchronous API operation. For more information about the configurations, see the API documentation of GetDeviceInternetPort.</p>
     * 
     * @param request AddDeviceInternetPortRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDeviceInternetPortResponse
     */
    public AddDeviceInternetPortResponse addDeviceInternetPortWithOptions(AddDeviceInternetPortRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDeviceInternetPort"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDeviceInternetPortResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures Network Address Translation (NAT) rules for an instance. This operation is an asynchronous API operation. For more information about the configurations, see the API documentation of GetDeviceInternetPort.</p>
     * 
     * @param request AddDeviceInternetPortRequest
     * @return AddDeviceInternetPortResponse
     */
    public AddDeviceInternetPortResponse addDeviceInternetPort(AddDeviceInternetPortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDeviceInternetPortWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Usage notes</h1>
     * <ul>
     * <li>You can call this operation up to 100 times per second.</li>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * <li>Internal networks and IPv4 addresses are not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds an IPv6 network interface controller (NIC). A public IP address is automatically assigned at the same time.</p>
     * 
     * @param request AddNetworkInterfaceToInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddNetworkInterfaceToInstanceResponse
     */
    public AddNetworkInterfaceToInstanceResponse addNetworkInterfaceToInstanceWithOptions(AddNetworkInterfaceToInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoStart)) {
            query.put("AutoStart", request.autoStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networks)) {
            query.put("Networks", request.networks);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddNetworkInterfaceToInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddNetworkInterfaceToInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Usage notes</h1>
     * <ul>
     * <li>You can call this operation up to 100 times per second.</li>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * <li>Internal networks and IPv4 addresses are not supported.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds an IPv6 network interface controller (NIC). A public IP address is automatically assigned at the same time.</p>
     * 
     * @param request AddNetworkInterfaceToInstanceRequest
     * @return AddNetworkInterfaceToInstanceResponse
     */
    public AddNetworkInterfaceToInstanceResponse addNetworkInterfaceToInstance(AddNetworkInterfaceToInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addNetworkInterfaceToInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an elastic IP address (EIP) to a Source Network Address Translation (SNAT) entry.</p>
     * 
     * @param request AddSnatIpForSnatEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddSnatIpForSnatEntryResponse
     */
    public AddSnatIpForSnatEntryResponse addSnatIpForSnatEntryWithOptions(AddSnatIpForSnatEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.snatEntryId)) {
            query.put("SnatEntryId", request.snatEntryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snatIp)) {
            query.put("SnatIp", request.snatIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddSnatIpForSnatEntry"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddSnatIpForSnatEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds an elastic IP address (EIP) to a Source Network Address Translation (SNAT) entry.</p>
     * 
     * @param request AddSnatIpForSnatEntryRequest
     * @return AddSnatIpForSnatEntryResponse
     */
    public AddSnatIpForSnatEntryResponse addSnatIpForSnatEntry(AddSnatIpForSnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addSnatIpForSnatEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Assigns secondary private IP addresses to an elastic network interface (ENI).</p>
     * 
     * @param request AssignPrivateIpAddressesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssignPrivateIpAddressesResponse
     */
    public AssignPrivateIpAddressesResponse assignPrivateIpAddressesWithOptions(AssignPrivateIpAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceId)) {
            query.put("NetworkInterfaceId", request.networkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignPrivateIpAddresses"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssignPrivateIpAddressesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Assigns secondary private IP addresses to an elastic network interface (ENI).</p>
     * 
     * @param request AssignPrivateIpAddressesRequest
     * @return AssignPrivateIpAddressesResponse
     */
    public AssignPrivateIpAddressesResponse assignPrivateIpAddresses(AssignPrivateIpAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignPrivateIpAddressesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates an elastic IP address (EIP) with a cloud resource that is deployed in the same region.</p>
     * 
     * @param request AssociateEnsEipAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateEnsEipAddressResponse
     */
    public AssociateEnsEipAddressResponse associateEnsEipAddressWithOptions(AssociateEnsEipAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allocationId)) {
            query.put("AllocationId", request.allocationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standby)) {
            query.put("Standby", request.standby);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateEnsEipAddress"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateEnsEipAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Associates an elastic IP address (EIP) with a cloud resource that is deployed in the same region.</p>
     * 
     * @param request AssociateEnsEipAddressRequest
     * @return AssociateEnsEipAddressResponse
     */
    public AssociateEnsEipAddressResponse associateEnsEipAddress(AssociateEnsEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateEnsEipAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Attaches a disk to an Edge Node Service (ENS) instance.</p>
     * 
     * @param request AttachDiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachDiskResponse
     */
    public AttachDiskResponse attachDiskWithOptions(AttachDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteWithInstance)) {
            query.put("DeleteWithInstance", request.deleteWithInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachDisk"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachDiskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Attaches a disk to an Edge Node Service (ENS) instance.</p>
     * 
     * @param request AttachDiskRequest
     * @return AttachDiskResponse
     */
    public AttachDiskResponse attachDisk(AttachDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDiskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Usage notes</h1>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * <li>After you execute the command, the instance restarts loading.</li>
     * <li>Limits: The instance has at least two vCPUs and 4 GB memory. An image of CentOS 7.4 or later is required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds an Edge Node Service (ENS) instance to Container Service for Kubernetes (ACK).</p>
     * 
     * @param request AttachEnsInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachEnsInstancesResponse
     */
    public AttachEnsInstancesResponse attachEnsInstancesWithOptions(AttachEnsInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scripts)) {
            query.put("Scripts", request.scripts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachEnsInstances"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachEnsInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <h1><a href="#"></a>Usage notes</h1>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * <li>After you execute the command, the instance restarts loading.</li>
     * <li>Limits: The instance has at least two vCPUs and 4 GB memory. An image of CentOS 7.4 or later is required.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Adds an Edge Node Service (ENS) instance to Container Service for Kubernetes (ACK).</p>
     * 
     * @param request AttachEnsInstancesRequest
     * @return AttachEnsInstancesResponse
     */
    public AttachEnsInstancesResponse attachEnsInstances(AttachEnsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachEnsInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an inbound security group rule. This operation allows or denies the inbound traffic from other devices to instances in the security group.</p>
     * 
     * @param request AuthorizeSecurityGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeSecurityGroupResponse
     */
    public AuthorizeSecurityGroupResponse authorizeSecurityGroupWithOptions(AuthorizeSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipProtocol)) {
            query.put("IpProtocol", request.ipProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRange)) {
            query.put("PortRange", request.portRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidrIp)) {
            query.put("SourceCidrIp", request.sourceCidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePortRange)) {
            query.put("SourcePortRange", request.sourcePortRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeSecurityGroup"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeSecurityGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an inbound security group rule. This operation allows or denies the inbound traffic from other devices to instances in the security group.</p>
     * 
     * @param request AuthorizeSecurityGroupRequest
     * @return AuthorizeSecurityGroupResponse
     */
    public AuthorizeSecurityGroupResponse authorizeSecurityGroup(AuthorizeSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeSecurityGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In the security group-related API documents, outbound traffic refers to the traffic that is sent by the source device and received at the destination device.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an outbound security group rule. This operation allows or denies the outbound traffic from the instances in the security group to other devices.</p>
     * 
     * @param request AuthorizeSecurityGroupEgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AuthorizeSecurityGroupEgressResponse
     */
    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgressWithOptions(AuthorizeSecurityGroupEgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destCidrIp)) {
            query.put("DestCidrIp", request.destCidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipProtocol)) {
            query.put("IpProtocol", request.ipProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRange)) {
            query.put("PortRange", request.portRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePortRange)) {
            query.put("SourcePortRange", request.sourcePortRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AuthorizeSecurityGroupEgress"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AuthorizeSecurityGroupEgressResponse());
    }

    /**
     * <b>description</b> :
     * <p>In the security group-related API documents, outbound traffic refers to the traffic that is sent by the source device and received at the destination device.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an outbound security group rule. This operation allows or denies the outbound traffic from the instances in the security group to other devices.</p>
     * 
     * @param request AuthorizeSecurityGroupEgressRequest
     * @return AuthorizeSecurityGroupEgressResponse
     */
    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeSecurityGroupEgressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>清理分发数据</p>
     * 
     * @param request CleanDistDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CleanDistDataResponse
     */
    public CleanDistDataResponse cleanDistDataWithOptions(CleanDistDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataName)) {
            query.put("DataName", request.dataName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataVersion)) {
            query.put("DataVersion", request.dataVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CleanDistData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CleanDistDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>清理分发数据</p>
     * 
     * @param request CleanDistDataRequest
     * @return CleanDistDataResponse
     */
    public CleanDistDataResponse cleanDistData(CleanDistDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cleanDistDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Copies a shared data group (SDG) across nodes.</p>
     * 
     * @param tmpReq CopySDGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopySDGResponse
     */
    public CopySDGResponse copySDGWithOptions(CopySDGRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CopySDGShrinkRequest request = new CopySDGShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.destinationRegionIds)) {
            request.destinationRegionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.destinationRegionIds, "DestinationRegionIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopySDG"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopySDGResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Copies a shared data group (SDG) across nodes.</p>
     * 
     * @param request CopySDGRequest
     * @return CopySDGResponse
     */
    public CopySDGResponse copySDG(CopySDGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copySDGWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Copies a snapshot.</p>
     * 
     * @param tmpReq CopySnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopySnapshotResponse
     */
    public CopySnapshotResponse copySnapshotWithOptions(CopySnapshotRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CopySnapshotShrinkRequest request = new CopySnapshotShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.destinationRegionIds)) {
            request.destinationRegionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.destinationRegionIds, "DestinationRegionIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegionIdsShrink)) {
            query.put("DestinationRegionIds", request.destinationRegionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationSnapshotDescription)) {
            query.put("DestinationSnapshotDescription", request.destinationSnapshotDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationSnapshotName)) {
            query.put("DestinationSnapshotName", request.destinationSnapshotName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopySnapshot"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopySnapshotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Copies a snapshot.</p>
     * 
     * @param request CopySnapshotRequest
     * @return CopySnapshotResponse
     */
    public CopySnapshotResponse copySnapshot(CopySnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copySnapshotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an ARM server.</p>
     * 
     * @param request CreateARMServerInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateARMServerInstancesResponse
     */
    public CreateARMServerInstancesResponse createARMServerInstancesWithOptions(CreateARMServerInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoUseCoupon)) {
            query.put("AutoUseCoupon", request.autoUseCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.frequency)) {
            query.put("Frequency", request.frequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nameSpace)) {
            query.put("NameSpace", request.nameSpace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resolution)) {
            query.put("Resolution", request.resolution);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverName)) {
            query.put("ServerName", request.serverName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverType)) {
            query.put("ServerType", request.serverType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateARMServerInstances"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateARMServerInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an ARM server.</p>
     * 
     * @param request CreateARMServerInstancesRequest
     * @return CreateARMServerInstancesResponse
     */
    public CreateARMServerInstancesResponse createARMServerInstances(CreateARMServerInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createARMServerInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an edge application that allows you to manage Edge Node Service (ENS) nodes in containers, bare metal instances, and virtual machines.</p>
     * 
     * @param request CreateApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplicationWithOptions(CreateApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            query.put("Template", request.template);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApplication"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an edge application that allows you to manage Edge Node Service (ENS) nodes in containers, bare metal instances, and virtual machines.</p>
     * 
     * @param request CreateApplicationRequest
     * @return CreateApplicationResponse
     */
    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a classic network</p>
     * 
     * @param request CreateClassicNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClassicNetworkResponse
     */
    public CreateClassicNetworkResponse createClassicNetworkWithOptions(CreateClassicNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkName)) {
            query.put("NetworkName", request.networkName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClassicNetwork"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClassicNetworkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a classic network</p>
     * 
     * @param request CreateClassicNetworkRequest
     * @return CreateClassicNetworkResponse
     */
    public CreateClassicNetworkResponse createClassicNetwork(CreateClassicNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClassicNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a pay-as-you-go or subscription data disk.</p>
     * 
     * @param request CreateDiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDiskResponse
     */
    public CreateDiskResponse createDiskWithOptions(CreateDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskName)) {
            query.put("DiskName", request.diskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encrypted)) {
            query.put("Encrypted", request.encrypted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.KMSKeyId)) {
            query.put("KMSKeyId", request.KMSKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDisk"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDiskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a pay-as-you-go or subscription data disk.</p>
     * 
     * @param request CreateDiskRequest
     * @return CreateDiskResponse
     */
    public CreateDiskResponse createDisk(CreateDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDiskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 5,000 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 50 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Applies for an elastic IP address (EIP).</p>
     * 
     * @param request CreateEipInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEipInstanceResponse
     */
    public CreateEipInstanceResponse createEipInstanceWithOptions(CreateEipInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEipInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEipInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 5,000 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 50 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Applies for an elastic IP address (EIP).</p>
     * 
     * @param request CreateEipInstanceRequest
     * @return CreateEipInstanceResponse
     */
    public CreateEipInstanceResponse createEipInstance(CreateEipInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEipInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom route entry.</p>
     * 
     * @param request CreateEnsRouteEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnsRouteEntryResponse
     */
    public CreateEnsRouteEntryResponse createEnsRouteEntryWithOptions(CreateEnsRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            query.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHopId)) {
            query.put("NextHopId", request.nextHopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHopType)) {
            query.put("NextHopType", request.nextHopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeEntryName)) {
            query.put("RouteEntryName", request.routeEntryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeTableId)) {
            query.put("RouteTableId", request.routeTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnsRouteEntry"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnsRouteEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom route entry.</p>
     * 
     * @param request CreateEnsRouteEntryRequest
     * @return CreateEnsRouteEntryResponse
     */
    public CreateEnsRouteEntryResponse createEnsRouteEntry(CreateEnsRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnsRouteEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建售卖约束</p>
     * 
     * @param tmpReq CreateEnsSaleControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnsSaleControlResponse
     */
    public CreateEnsSaleControlResponse createEnsSaleControlWithOptions(CreateEnsSaleControlRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateEnsSaleControlShrinkRequest request = new CreateEnsSaleControlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.saleControls)) {
            request.saleControlsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.saleControls, "SaleControls", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUidAccount)) {
            query.put("AliUidAccount", request.aliUidAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAccount)) {
            query.put("CustomAccount", request.customAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleControlsShrink)) {
            query.put("SaleControls", request.saleControlsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnsSaleControl"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnsSaleControlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建售卖约束</p>
     * 
     * @param request CreateEnsSaleControlRequest
     * @return CreateEnsSaleControlResponse
     */
    public CreateEnsSaleControlResponse createEnsSaleControl(CreateEnsSaleControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnsSaleControlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an edge service.</p>
     * 
     * @param request CreateEnsServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEnsServiceResponse
     */
    public CreateEnsServiceResponse createEnsServiceWithOptions(CreateEnsServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensServiceId)) {
            query.put("EnsServiceId", request.ensServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEnsService"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEnsServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an edge service.</p>
     * 
     * @param request CreateEnsServiceRequest
     * @return CreateEnsServiceResponse
     */
    public CreateEnsServiceResponse createEnsService(CreateEnsServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnsServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an edge private network (EPN) instance.</p>
     * 
     * @param request CreateEpnInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateEpnInstanceResponse
     */
    public CreateEpnInstanceResponse createEpnInstanceWithOptions(CreateEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceName)) {
            query.put("EPNInstanceName", request.EPNInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceType)) {
            query.put("EPNInstanceType", request.EPNInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetMaxBandwidthOut)) {
            query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkingModel)) {
            query.put("NetworkingModel", request.networkingModel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateEpnInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an edge private network (EPN) instance.</p>
     * 
     * @param request CreateEpnInstanceRequest
     * @return CreateEpnInstanceResponse
     */
    public CreateEpnInstanceResponse createEpnInstance(CreateEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEpnInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Network Attached Storage (NAS) file system.</p>
     * 
     * @param tmpReq CreateFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFileSystemResponse
     */
    public CreateFileSystemResponse createFileSystemWithOptions(CreateFileSystemRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFileSystemShrinkRequest request = new CreateFileSystemShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderDetails)) {
            request.orderDetailsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderDetails, "OrderDetails", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFileSystem"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFileSystemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Network Attached Storage (NAS) file system.</p>
     * 
     * @param request CreateFileSystemRequest
     * @return CreateFileSystemResponse
     */
    public CreateFileSystemResponse createFileSystem(CreateFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a Destination Network Address Translation (DNAT) entry to a DNAT table.</p>
     * 
     * @param request CreateForwardEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateForwardEntryResponse
     */
    public CreateForwardEntryResponse createForwardEntryWithOptions(CreateForwardEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalIp)) {
            query.put("ExternalIp", request.externalIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalPort)) {
            query.put("ExternalPort", request.externalPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardEntryName)) {
            query.put("ForwardEntryName", request.forwardEntryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckPort)) {
            query.put("HealthCheckPort", request.healthCheckPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internalIp)) {
            query.put("InternalIp", request.internalIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internalPort)) {
            query.put("InternalPort", request.internalPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipProtocol)) {
            query.put("IpProtocol", request.ipProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyExternalIp)) {
            query.put("StandbyExternalIp", request.standbyExternalIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateForwardEntry"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateForwardEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a Destination Network Address Translation (DNAT) entry to a DNAT table.</p>
     * 
     * @param request CreateForwardEntryRequest
     * @return CreateForwardEntryResponse
     */
    public CreateForwardEntryResponse createForwardEntry(CreateForwardEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createForwardEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image from an instance.</p>
     * 
     * @param request CreateImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateImageResponse
     */
    public CreateImageResponse createImageWithOptions(CreateImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteAfterImageUpload)) {
            query.put("DeleteAfterImageUpload", request.deleteAfterImageUpload);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateImage"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an image from an instance.</p>
     * 
     * @param request CreateImageRequest
     * @return CreateImageResponse
     */
    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>We recommend that you increase the request time because instance creation is an asynchronous operation. If the return code of the API operation is 0, it indicates that the request is successful, but does not indicate that the instance is created. If the request is successful, an instance ID is returned. You can check whether the instance is created based on the instance ID.</li>
     * <li>InvalidUserData.NotInWhiteList operation restriction: You can create an instance only if you are in the whitelist in which members have the purchase permissions. Otherwise, an error is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstanceWithOptions(CreateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewPeriod)) {
            query.put("AutoRenewPeriod", request.autoRenewPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipType)) {
            query.put("IpType", request.ipType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordInherit)) {
            query.put("PasswordInherit", request.passwordInherit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paymentType)) {
            query.put("PaymentType", request.paymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIpIdentification)) {
            query.put("PublicIpIdentification", request.publicIpIdentification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quantity)) {
            query.put("Quantity", request.quantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueSuffix)) {
            query.put("UniqueSuffix", request.uniqueSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDisk)) {
            query.put("DataDisk", request.dataDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDisk)) {
            query.put("SystemDisk", request.systemDisk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10 times per second per account.</p>
     * <ul>
     * <li>We recommend that you increase the request time because instance creation is an asynchronous operation. If the return code of the API operation is 0, it indicates that the request is successful, but does not indicate that the instance is created. If the request is successful, an instance ID is returned. You can check whether the instance is created based on the instance ID.</li>
     * <li>InvalidUserData.NotInWhiteList operation restriction: You can create an instance only if you are in the whitelist in which members have the purchase permissions. Otherwise, an error is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an instance.</p>
     * 
     * @param request CreateInstanceRequest
     * @return CreateInstanceResponse
     */
    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>调用CreateInstanceOpsTask来针对一个实例或实例运维组发起运维任务</p>
     * 
     * @param tmpReq CreateInstanceActiveOpsTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateInstanceActiveOpsTaskResponse
     */
    public CreateInstanceActiveOpsTaskResponse createInstanceActiveOpsTaskWithOptions(CreateInstanceActiveOpsTaskRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateInstanceActiveOpsTaskShrinkRequest request = new CreateInstanceActiveOpsTaskShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateInstanceActiveOpsTask"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateInstanceActiveOpsTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>调用CreateInstanceOpsTask来针对一个实例或实例运维组发起运维任务</p>
     * 
     * @param request CreateInstanceActiveOpsTaskRequest
     * @return CreateInstanceActiveOpsTaskResponse
     */
    public CreateInstanceActiveOpsTaskResponse createInstanceActiveOpsTask(CreateInstanceActiveOpsTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceActiveOpsTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>An SSH key pair consists of a public key and a private key. ENS stores the public key and returns the unencrypted private key that is PEM-encoded in the PKCS#8 format. You must securely lock away the private key.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an SSH key pair.</p>
     * 
     * @param request CreateKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateKeyPairResponse
     */
    public CreateKeyPairResponse createKeyPairWithOptions(CreateKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateKeyPair"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateKeyPairResponse());
    }

    /**
     * <b>description</b> :
     * <p>An SSH key pair consists of a public key and a private key. ENS stores the public key and returns the unencrypted private key that is PEM-encoded in the PKCS#8 format. You must securely lock away the private key.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an SSH key pair.</p>
     * 
     * @param request CreateKeyPairRequest
     * @return CreateKeyPairResponse
     */
    public CreateKeyPairResponse createKeyPair(CreateKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an Edge Load Balancer (ELB) instance.</p>
     * 
     * @param request CreateLoadBalancerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadBalancerResponse
     */
    public CreateLoadBalancerResponse createLoadBalancerWithOptions(CreateLoadBalancerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerName)) {
            query.put("LoadBalancerName", request.loadBalancerName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerSpec)) {
            query.put("LoadBalancerSpec", request.loadBalancerSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkId)) {
            query.put("NetworkId", request.networkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancer"),
            new TeaPair("version", "2017-11-10"),
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
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an Edge Load Balancer (ELB) instance.</p>
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
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an HTTP listener.</p>
     * 
     * @param request CreateLoadBalancerHTTPListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadBalancerHTTPListenerResponse
     */
    public CreateLoadBalancerHTTPListenerResponse createLoadBalancerHTTPListenerWithOptions(CreateLoadBalancerHTTPListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardPort)) {
            query.put("ForwardPort", request.forwardPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheck)) {
            query.put("HealthCheck", request.healthCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckDomain)) {
            query.put("HealthCheckDomain", request.healthCheckDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckMethod)) {
            query.put("HealthCheckMethod", request.healthCheckMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTimeout)) {
            query.put("HealthCheckTimeout", request.healthCheckTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            query.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            query.put("IdleTimeout", request.idleTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerForward)) {
            query.put("ListenerForward", request.listenerForward);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestTimeout)) {
            query.put("RequestTimeout", request.requestTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor)) {
            query.put("XForwardedFor", request.XForwardedFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancerHTTPListener"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerHTTPListenerResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an HTTP listener.</p>
     * 
     * @param request CreateLoadBalancerHTTPListenerRequest
     * @return CreateLoadBalancerHTTPListenerResponse
     */
    public CreateLoadBalancerHTTPListenerResponse createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerHTTPListenerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an HTTPS listener.</p>
     * 
     * @param request CreateLoadBalancerHTTPSListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadBalancerHTTPSListenerResponse
     */
    public CreateLoadBalancerHTTPSListenerResponse createLoadBalancerHTTPSListenerWithOptions(CreateLoadBalancerHTTPSListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cookie)) {
            query.put("Cookie", request.cookie);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cookieTimeout)) {
            query.put("CookieTimeout", request.cookieTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardPort)) {
            query.put("ForwardPort", request.forwardPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheck)) {
            query.put("HealthCheck", request.healthCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckDomain)) {
            query.put("HealthCheckDomain", request.healthCheckDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckMethod)) {
            query.put("HealthCheckMethod", request.healthCheckMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTimeout)) {
            query.put("HealthCheckTimeout", request.healthCheckTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            query.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            query.put("IdleTimeout", request.idleTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerForward)) {
            query.put("ListenerForward", request.listenerForward);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestTimeout)) {
            query.put("RequestTimeout", request.requestTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificateId)) {
            query.put("ServerCertificateId", request.serverCertificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stickySessionType)) {
            query.put("StickySessionType", request.stickySessionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancerHTTPSListener"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerHTTPSListenerResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an HTTPS listener.</p>
     * 
     * @param request CreateLoadBalancerHTTPSListenerRequest
     * @return CreateLoadBalancerHTTPSListenerResponse
     */
    public CreateLoadBalancerHTTPSListenerResponse createLoadBalancerHTTPSListener(CreateLoadBalancerHTTPSListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerHTTPSListenerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Transmission Control Protocol (TCP) listener.</p>
     * 
     * @param request CreateLoadBalancerTCPListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadBalancerTCPListenerResponse
     */
    public CreateLoadBalancerTCPListenerResponse createLoadBalancerTCPListenerWithOptions(CreateLoadBalancerTCPListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendServerPort)) {
            query.put("BackendServerPort", request.backendServerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipTransmit)) {
            query.put("EipTransmit", request.eipTransmit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.establishedTimeout)) {
            query.put("EstablishedTimeout", request.establishedTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectTimeout)) {
            query.put("HealthCheckConnectTimeout", request.healthCheckConnectTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckDomain)) {
            query.put("HealthCheckDomain", request.healthCheckDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckType)) {
            query.put("HealthCheckType", request.healthCheckType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            query.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.persistenceTimeout)) {
            query.put("PersistenceTimeout", request.persistenceTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancerTCPListener"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerTCPListenerResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Transmission Control Protocol (TCP) listener.</p>
     * 
     * @param request CreateLoadBalancerTCPListenerRequest
     * @return CreateLoadBalancerTCPListenerResponse
     */
    public CreateLoadBalancerTCPListenerResponse createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerTCPListenerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a User Datagram Protocol (UDP) listener.</p>
     * 
     * @param request CreateLoadBalancerUDPListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLoadBalancerUDPListenerResponse
     */
    public CreateLoadBalancerUDPListenerResponse createLoadBalancerUDPListenerWithOptions(CreateLoadBalancerUDPListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendServerPort)) {
            query.put("BackendServerPort", request.backendServerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipTransmit)) {
            query.put("EipTransmit", request.eipTransmit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectTimeout)) {
            query.put("HealthCheckConnectTimeout", request.healthCheckConnectTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckExp)) {
            query.put("HealthCheckExp", request.healthCheckExp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckReq)) {
            query.put("HealthCheckReq", request.healthCheckReq);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLoadBalancerUDPListener"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLoadBalancerUDPListenerResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a User Datagram Protocol (UDP) listener.</p>
     * 
     * @param request CreateLoadBalancerUDPListenerRequest
     * @return CreateLoadBalancerUDPListenerResponse
     */
    public CreateLoadBalancerUDPListenerResponse createLoadBalancerUDPListener(CreateLoadBalancerUDPListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerUDPListenerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Precautions</h2>
     * <p>After you call this operation, a mount target is not immediately created. Therefore, we recommend that you call the DescribeMountTargets operation to query the status of the mount target. If the mount target is in the Active state, you can then mount the file system. Otherwise, the file system may fail to be mounted.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a mount target.</p>
     * 
     * @param request CreateMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMountTargetResponse
     */
    public CreateMountTargetResponse createMountTargetWithOptions(CreateMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountTargetName)) {
            query.put("MountTargetName", request.mountTargetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netWorkId)) {
            query.put("NetWorkId", request.netWorkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMountTarget"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a>Precautions</h2>
     * <p>After you call this operation, a mount target is not immediately created. Therefore, we recommend that you call the DescribeMountTargets operation to query the status of the mount target. If the mount target is in the Active state, you can then mount the file system. Otherwise, the file system may fail to be mounted.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a mount target.</p>
     * 
     * @param request CreateMountTargetRequest
     * @return CreateMountTargetResponse
     */
    public CreateMountTargetResponse createMountTarget(CreateMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a network address translation (NAT) gateway.</p>
     * 
     * @param request CreateNatGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNatGatewayResponse
     */
    public CreateNatGatewayResponse createNatGatewayWithOptions(CreateNatGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkId)) {
            query.put("NetworkId", request.networkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNatGateway"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNatGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a network address translation (NAT) gateway.</p>
     * 
     * @param request CreateNatGatewayRequest
     * @return CreateNatGatewayResponse
     */
    public CreateNatGatewayResponse createNatGateway(CreateNatGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNatGatewayWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a virtual private cloud (VPC).</p>
     * 
     * @param request CreateNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetworkResponse
     */
    public CreateNetworkResponse createNetworkWithOptions(CreateNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkName)) {
            query.put("NetworkName", request.networkName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetwork"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a virtual private cloud (VPC).</p>
     * 
     * @param request CreateNetworkRequest
     * @return CreateNetworkResponse
     */
    public CreateNetworkResponse createNetwork(CreateNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a network access control list (ACL).</p>
     * 
     * @param request CreateNetworkAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetworkAclResponse
     */
    public CreateNetworkAclResponse createNetworkAclWithOptions(CreateNetworkAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAclName)) {
            query.put("NetworkAclName", request.networkAclName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetworkAcl"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a network access control list (ACL).</p>
     * 
     * @param request CreateNetworkAclRequest
     * @return CreateNetworkAclResponse
     */
    public CreateNetworkAclResponse createNetworkAcl(CreateNetworkAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a network access control list (ACL) rule.</p>
     * 
     * @param request CreateNetworkAclEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNetworkAclEntryResponse
     */
    public CreateNetworkAclEntryResponse createNetworkAclEntryWithOptions(CreateNetworkAclEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            query.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAclEntryName)) {
            query.put("NetworkAclEntryName", request.networkAclEntryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkAclId)) {
            query.put("NetworkAclId", request.networkAclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRange)) {
            query.put("PortRange", request.portRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateNetworkAclEntry"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNetworkAclEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a network access control list (ACL) rule.</p>
     * 
     * @param request CreateNetworkAclEntryRequest
     * @return CreateNetworkAclEntryResponse
     */
    public CreateNetworkAclEntryResponse createNetworkAclEntry(CreateNetworkAclEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkAclEntryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * <p>After you create an SDG, you must call the <a href="https://help.aliyun.com/document_detail/608126.html">SaveSDG</a> operation to save the SDG. Otherwise, the SDG is unavailable.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a shared data group (SDG) by using a specific device.</p>
     * 
     * @param request CreateSDGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSDGResponse
     */
    public CreateSDGResponse createSDGWithOptions(CreateSDGRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSDG"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSDGResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * <p>After you create an SDG, you must call the <a href="https://help.aliyun.com/document_detail/608126.html">SaveSDG</a> operation to save the SDG. Otherwise, the SDG is unavailable.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a shared data group (SDG) by using a specific device.</p>
     * 
     * @param request CreateSDGRequest
     * @return CreateSDGResponse
     */
    public CreateSDGResponse createSDG(CreateSDGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSDGWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a security group.</p>
     * 
     * @param request CreateSecurityGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSecurityGroupResponse
     */
    public CreateSecurityGroupResponse createSecurityGroupWithOptions(CreateSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupName)) {
            query.put("SecurityGroupName", request.securityGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSecurityGroup"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSecurityGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a security group.</p>
     * 
     * @param request CreateSecurityGroupRequest
     * @return CreateSecurityGroupResponse
     */
    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecurityGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a snapshot.</p>
     * 
     * @param request CreateSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshotWithOptions(CreateSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            query.put("SnapshotName", request.snapshotName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSnapshot"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSnapshotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a snapshot.</p>
     * 
     * @param request CreateSnapshotRequest
     * @return CreateSnapshotResponse
     */
    public CreateSnapshotResponse createSnapshot(CreateSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a source network address translation (SNAT) entry to a specified SNAT table.</p>
     * 
     * @param request CreateSnatEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSnatEntryResponse
     */
    public CreateSnatEntryResponse createSnatEntryWithOptions(CreateSnatEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snatEntryName)) {
            query.put("SnatEntryName", request.snatEntryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snatIp)) {
            query.put("SnatIp", request.snatIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCIDR)) {
            query.put("SourceCIDR", request.sourceCIDR);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceNetworkId)) {
            query.put("SourceNetworkId", request.sourceNetworkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceVSwitchId)) {
            query.put("SourceVSwitchId", request.sourceVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbySnatIp)) {
            query.put("StandbySnatIp", request.standbySnatIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSnatEntry"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSnatEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Adds a source network address translation (SNAT) entry to a specified SNAT table.</p>
     * 
     * @param request CreateSnatEntryRequest
     * @return CreateSnatEntryResponse
     */
    public CreateSnatEntryResponse createSnatEntry(CreateSnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSnatEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a vSwitch.</p>
     * 
     * @param request CreateVSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVSwitchResponse
     */
    public CreateVSwitchResponse createVSwitchWithOptions(CreateVSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidrBlock)) {
            query.put("CidrBlock", request.cidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkId)) {
            query.put("NetworkId", request.networkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchName)) {
            query.put("VSwitchName", request.vSwitchName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVSwitch"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVSwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a vSwitch.</p>
     * 
     * @param request CreateVSwitchRequest
     * @return CreateVSwitchResponse
     */
    public CreateVSwitchResponse createVSwitch(CreateVSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases all containers and resource instances related to a specific application in an asynchronous manner.</p>
     * 
     * @param request DeleteApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplicationWithOptions(DeleteApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApplication"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases all containers and resource instances related to a specific application in an asynchronous manner.</p>
     * 
     * @param request DeleteApplicationRequest
     * @return DeleteApplicationResponse
     */
    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only the Alibaba Cloud Account ID owner of a bucket can delete the bucket from the account.</p>
     * <ul>
     * <li>You cannot delete buckets that store objects. You can only delete empty buckets.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a bucket.</p>
     * 
     * @param request DeleteBucketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBucketResponse
     */
    public DeleteBucketResponse deleteBucketWithOptions(DeleteBucketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucket"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBucketResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only the Alibaba Cloud Account ID owner of a bucket can delete the bucket from the account.</p>
     * <ul>
     * <li>You cannot delete buckets that store objects. You can only delete empty buckets.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a bucket.</p>
     * 
     * @param request DeleteBucketRequest
     * @return DeleteBucketResponse
     */
    public DeleteBucketResponse deleteBucket(DeleteBucketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBucketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the lifecycle rules for objects in a bucket.</p>
     * 
     * @param request DeleteBucketLifecycleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBucketLifecycleResponse
     */
    public DeleteBucketLifecycleResponse deleteBucketLifecycleWithOptions(DeleteBucketLifecycleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBucketLifecycle"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBucketLifecycleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the lifecycle rules for objects in a bucket.</p>
     * 
     * @param request DeleteBucketLifecycleRequest
     * @return DeleteBucketLifecycleResponse
     */
    public DeleteBucketLifecycleResponse deleteBucketLifecycle(DeleteBucketLifecycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBucketLifecycleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes Network Address Translation (NAT) rules for a server or container based on the ID.</p>
     * 
     * @param request DeleteDeviceInternetPortRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDeviceInternetPortResponse
     */
    public DeleteDeviceInternetPortResponse deleteDeviceInternetPortWithOptions(DeleteDeviceInternetPortRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDeviceInternetPort"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDeviceInternetPortResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes Network Address Translation (NAT) rules for a server or container based on the ID.</p>
     * 
     * @param request DeleteDeviceInternetPortRequest
     * @return DeleteDeviceInternetPortResponse
     */
    public DeleteDeviceInternetPortResponse deleteDeviceInternetPort(DeleteDeviceInternetPortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeviceInternetPortWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you release a disk, the disk must be in the Available state.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a disk.</p>
     * 
     * @param request DeleteDiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDiskResponse
     */
    public DeleteDiskResponse deleteDiskWithOptions(DeleteDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDisk"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDiskResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you release a disk, the disk must be in the Available state.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a disk.</p>
     * 
     * @param request DeleteDiskRequest
     * @return DeleteDiskResponse
     */
    public DeleteDiskResponse deleteDisk(DeleteDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDiskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom route entry.</p>
     * 
     * @param request DeleteEnsRouteEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnsRouteEntryResponse
     */
    public DeleteEnsRouteEntryResponse deleteEnsRouteEntryWithOptions(DeleteEnsRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.routeEntryId)) {
            query.put("RouteEntryId", request.routeEntryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnsRouteEntry"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnsRouteEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom route entry.</p>
     * 
     * @param request DeleteEnsRouteEntryRequest
     * @return DeleteEnsRouteEntryResponse
     */
    public DeleteEnsRouteEntryResponse deleteEnsRouteEntry(DeleteEnsRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnsRouteEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除售卖约束的条件约束</p>
     * 
     * @param tmpReq DeleteEnsSaleConditionControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnsSaleConditionControlResponse
     */
    public DeleteEnsSaleConditionControlResponse deleteEnsSaleConditionControlWithOptions(DeleteEnsSaleConditionControlRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteEnsSaleConditionControlShrinkRequest request = new DeleteEnsSaleConditionControlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.saleControls)) {
            request.saleControlsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.saleControls, "SaleControls", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUidAccount)) {
            query.put("AliUidAccount", request.aliUidAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAccount)) {
            query.put("CustomAccount", request.customAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleControlsShrink)) {
            query.put("SaleControls", request.saleControlsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnsSaleConditionControl"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnsSaleConditionControlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除售卖约束的条件约束</p>
     * 
     * @param request DeleteEnsSaleConditionControlRequest
     * @return DeleteEnsSaleConditionControlResponse
     */
    public DeleteEnsSaleConditionControlResponse deleteEnsSaleConditionControl(DeleteEnsSaleConditionControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnsSaleConditionControlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除售卖约束基础约束</p>
     * 
     * @param tmpReq DeleteEnsSaleControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEnsSaleControlResponse
     */
    public DeleteEnsSaleControlResponse deleteEnsSaleControlWithOptions(DeleteEnsSaleControlRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteEnsSaleControlShrinkRequest request = new DeleteEnsSaleControlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.saleControls)) {
            request.saleControlsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.saleControls, "SaleControls", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUidAccount)) {
            query.put("AliUidAccount", request.aliUidAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAccount)) {
            query.put("CustomAccount", request.customAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleControlsShrink)) {
            query.put("SaleControls", request.saleControlsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEnsSaleControl"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEnsSaleControlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除售卖约束基础约束</p>
     * 
     * @param request DeleteEnsSaleControlRequest
     * @return DeleteEnsSaleControlResponse
     */
    public DeleteEnsSaleControlResponse deleteEnsSaleControl(DeleteEnsSaleControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnsSaleControlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can delete an EPN instance only when the instance group information is empty.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an edge private network (EPN) instance.</p>
     * 
     * @param request DeleteEpnInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteEpnInstanceResponse
     */
    public DeleteEpnInstanceResponse deleteEpnInstanceWithOptions(DeleteEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceId)) {
            query.put("EPNInstanceId", request.EPNInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteEpnInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can delete an EPN instance only when the instance group information is empty.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an edge private network (EPN) instance.</p>
     * 
     * @param request DeleteEpnInstanceRequest
     * @return DeleteEpnInstanceResponse
     */
    public DeleteEpnInstanceResponse deleteEpnInstance(DeleteEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEpnInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Network Attached Storage (NAS) file system.</p>
     * 
     * @param request DeleteFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFileSystemResponse
     */
    public DeleteFileSystemResponse deleteFileSystemWithOptions(DeleteFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFileSystem"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFileSystemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Network Attached Storage (NAS) file system.</p>
     * 
     * @param request DeleteFileSystemRequest
     * @return DeleteFileSystemResponse
     */
    public DeleteFileSystemResponse deleteFileSystem(DeleteFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Destination Network Address Translation (DNAT) entry from a specified DNAT table.</p>
     * 
     * @param request DeleteForwardEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteForwardEntryResponse
     */
    public DeleteForwardEntryResponse deleteForwardEntryWithOptions(DeleteForwardEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forwardEntryId)) {
            query.put("ForwardEntryId", request.forwardEntryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteForwardEntry"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteForwardEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Destination Network Address Translation (DNAT) entry from a specified DNAT table.</p>
     * 
     * @param request DeleteForwardEntryRequest
     * @return DeleteForwardEntryResponse
     */
    public DeleteForwardEntryResponse deleteForwardEntry(DeleteForwardEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteForwardEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom image.</p>
     * 
     * @param request DeleteImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteImageResponse
     */
    public DeleteImageResponse deleteImageWithOptions(DeleteImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteImage"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a custom image.</p>
     * 
     * @param request DeleteImageRequest
     * @return DeleteImageResponse
     */
    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After you delete an SSH key pair, you can no longer query the key pair by calling the DescribeKeyPairs operation.</p>
     * <ul>
     * <li>If you delete an SSH key pair that is bound to an Edge Node Service (ENS) instance, ENS no longer stores the SSH key pair. However, you can still use the key pair to access the instance. When you call the DescribeInstance operation to query instance information, no other information but the name of the key pair (<strong>KeyPairName</strong>) is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes SSH key pairs.</p>
     * 
     * @param request DeleteKeyPairsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteKeyPairsResponse
     */
    public DeleteKeyPairsResponse deleteKeyPairsWithOptions(DeleteKeyPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairId)) {
            query.put("KeyPairId", request.keyPairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteKeyPairs"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteKeyPairsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  After you delete an SSH key pair, you can no longer query the key pair by calling the DescribeKeyPairs operation.</p>
     * <ul>
     * <li>If you delete an SSH key pair that is bound to an Edge Node Service (ENS) instance, ENS no longer stores the SSH key pair. However, you can still use the key pair to access the instance. When you call the DescribeInstance operation to query instance information, no other information but the name of the key pair (<strong>KeyPairName</strong>) is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes SSH key pairs.</p>
     * 
     * @param request DeleteKeyPairsRequest
     * @return DeleteKeyPairsResponse
     */
    public DeleteKeyPairsResponse deleteKeyPairs(DeleteKeyPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKeyPairsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a listener.</p>
     * 
     * @param request DeleteLoadBalancerListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLoadBalancerListenerResponse
     */
    public DeleteLoadBalancerListenerResponse deleteLoadBalancerListenerWithOptions(DeleteLoadBalancerListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLoadBalancerListener"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLoadBalancerListenerResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes a listener.</p>
     * 
     * @param request DeleteLoadBalancerListenerRequest
     * @return DeleteLoadBalancerListenerResponse
     */
    public DeleteLoadBalancerListenerResponse deleteLoadBalancerListener(DeleteLoadBalancerListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLoadBalancerListenerWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you delete a mount target, the mount target cannot be restored. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a mount target.</p>
     * 
     * @param request DeleteMountTargetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMountTargetResponse
     */
    public DeleteMountTargetResponse deleteMountTargetWithOptions(DeleteMountTargetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountTargetName)) {
            query.put("MountTargetName", request.mountTargetName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMountTarget"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMountTargetResponse());
    }

    /**
     * <b>description</b> :
     * <p>After you delete a mount target, the mount target cannot be restored. Proceed with caution.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a mount target.</p>
     * 
     * @param request DeleteMountTargetRequest
     * @return DeleteMountTargetResponse
     */
    public DeleteMountTargetResponse deleteMountTarget(DeleteMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMountTargetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an Internet network address translation (NAT) gateway.</p>
     * 
     * @param request DeleteNatGatewayRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNatGatewayResponse
     */
    public DeleteNatGatewayResponse deleteNatGatewayWithOptions(DeleteNatGatewayRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNatGateway"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNatGatewayResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an Internet network address translation (NAT) gateway.</p>
     * 
     * @param request DeleteNatGatewayRequest
     * @return DeleteNatGatewayResponse
     */
    public DeleteNatGatewayResponse deleteNatGateway(DeleteNatGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNatGatewayWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a virtual private cloud (VPC).</p>
     * 
     * @param request DeleteNetworkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetworkResponse
     */
    public DeleteNetworkResponse deleteNetworkWithOptions(DeleteNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkId)) {
            query.put("NetworkId", request.networkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetwork"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a virtual private cloud (VPC).</p>
     * 
     * @param request DeleteNetworkRequest
     * @return DeleteNetworkResponse
     */
    public DeleteNetworkResponse deleteNetwork(DeleteNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a network access control list (ACL).</p>
     * 
     * @param request DeleteNetworkAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetworkAclResponse
     */
    public DeleteNetworkAclResponse deleteNetworkAclWithOptions(DeleteNetworkAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkAclId)) {
            query.put("NetworkAclId", request.networkAclId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetworkAcl"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a network access control list (ACL).</p>
     * 
     * @param request DeleteNetworkAclRequest
     * @return DeleteNetworkAclResponse
     */
    public DeleteNetworkAclResponse deleteNetworkAcl(DeleteNetworkAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a network access control list (ACL) rule.</p>
     * 
     * @param request DeleteNetworkAclEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNetworkAclEntryResponse
     */
    public DeleteNetworkAclEntryResponse deleteNetworkAclEntryWithOptions(DeleteNetworkAclEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkAclEntryId)) {
            query.put("NetworkAclEntryId", request.networkAclEntryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteNetworkAclEntry"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNetworkAclEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a network access control list (ACL) rule.</p>
     * 
     * @param request DeleteNetworkAclEntryRequest
     * @return DeleteNetworkAclEntryResponse
     */
    public DeleteNetworkAclEntryResponse deleteNetworkAclEntry(DeleteNetworkAclEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkAclEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an object.</p>
     * 
     * @param request DeleteObjectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteObjectResponse
     */
    public DeleteObjectResponse deleteObjectWithOptions(DeleteObjectRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectKey)) {
            query.put("ObjectKey", request.objectKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteObject"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteObjectResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an object.</p>
     * 
     * @param request DeleteObjectRequest
     * @return DeleteObjectResponse
     */
    public DeleteObjectResponse deleteObject(DeleteObjectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteObjectWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * <p>If all the SDGs corresponding to the original disk are deleted, the original disk is automatically cleared.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a shared data group (SDG).</p>
     * 
     * @param tmpReq DeleteSDGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSDGResponse
     */
    public DeleteSDGResponse deleteSDGWithOptions(DeleteSDGRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteSDGShrinkRequest request = new DeleteSDGShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.SDGId)) {
            request.SDGIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.SDGId, "SDGId", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SDGIdShrink)) {
            query.put("SDGId", request.SDGIdShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSDG"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSDGResponse());
    }

    /**
     * <b>description</b> :
     * <h2><a href="#"></a></h2>
     * <p>If all the SDGs corresponding to the original disk are deleted, the original disk is automatically cleared.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a shared data group (SDG).</p>
     * 
     * @param request DeleteSDGRequest
     * @return DeleteSDGResponse
     */
    public DeleteSDGResponse deleteSDG(DeleteSDGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSDGWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a security group, make sure that no instances exist in the security group.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a security group.</p>
     * 
     * @param request DeleteSecurityGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecurityGroupResponse
     */
    public DeleteSecurityGroupResponse deleteSecurityGroupWithOptions(DeleteSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecurityGroup"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a security group, make sure that no instances exist in the security group.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a security group.</p>
     * 
     * @param request DeleteSecurityGroupRequest
     * @return DeleteSecurityGroupResponse
     */
    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a snapshot.</p>
     * 
     * @param request DeleteSnapshotRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshotWithOptions(DeleteSnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnapshot"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnapshotResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a snapshot.</p>
     * 
     * @param request DeleteSnapshotRequest
     * @return DeleteSnapshotResponse
     */
    public DeleteSnapshotResponse deleteSnapshot(DeleteSnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnapshotWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a source network address translation (SNAT) entry from a specified SNAT table.</p>
     * 
     * @param request DeleteSnatEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSnatEntryResponse
     */
    public DeleteSnatEntryResponse deleteSnatEntryWithOptions(DeleteSnatEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.snatEntryId)) {
            query.put("SnatEntryId", request.snatEntryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnatEntry"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnatEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a source network address translation (SNAT) entry from a specified SNAT table.</p>
     * 
     * @param request DeleteSnatEntryRequest
     * @return DeleteSnatEntryResponse
     */
    public DeleteSnatEntryResponse deleteSnatEntry(DeleteSnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnatEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an elastic IP address (EIP) from a source network address translation (SNAT) entry.</p>
     * 
     * @param request DeleteSnatIpForSnatEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSnatIpForSnatEntryResponse
     */
    public DeleteSnatIpForSnatEntryResponse deleteSnatIpForSnatEntryWithOptions(DeleteSnatIpForSnatEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.snatEntryId)) {
            query.put("SnatEntryId", request.snatEntryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snatIp)) {
            query.put("SnatIp", request.snatIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSnatIpForSnatEntry"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSnatIpForSnatEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an elastic IP address (EIP) from a source network address translation (SNAT) entry.</p>
     * 
     * @param request DeleteSnatIpForSnatEntryRequest
     * @return DeleteSnatIpForSnatEntryResponse
     */
    public DeleteSnatIpForSnatEntryResponse deleteSnatIpForSnatEntry(DeleteSnatIpForSnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnatIpForSnatEntryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a vSwitch, make sure that no instances exist in the vSwitch.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a vSwitch.</p>
     * 
     * @param request DeleteVSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVSwitchResponse
     */
    public DeleteVSwitchResponse deleteVSwitchWithOptions(DeleteVSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVSwitch"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVSwitchResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you delete a vSwitch, make sure that no instances exist in the vSwitch.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a vSwitch.</p>
     * 
     * @param request DeleteVSwitchRequest
     * @return DeleteVSwitchResponse
     */
    public DeleteVSwitchResponse deleteVSwitch(DeleteVSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVSwitchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>部署SDG到计算实例</p>
     * 
     * @param tmpReq DeployInstanceSDGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployInstanceSDGResponse
     */
    public DeployInstanceSDGResponse deployInstanceSDGWithOptions(DeployInstanceSDGRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeployInstanceSDGShrinkRequest request = new DeployInstanceSDGShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deploymentType)) {
            query.put("DeploymentType", request.deploymentType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SDGId)) {
            query.put("SDGId", request.SDGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployInstanceSDG"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployInstanceSDGResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>部署SDG到计算实例</p>
     * 
     * @param request DeployInstanceSDGRequest
     * @return DeployInstanceSDGResponse
     */
    public DeployInstanceSDGResponse deployInstanceSDG(DeployInstanceSDGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployInstanceSDGWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deploys shared data groups (SDGs).</p>
     * 
     * @param tmpReq DeploySDGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeploySDGResponse
     */
    public DeploySDGResponse deploySDGWithOptions(DeploySDGRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeploySDGShrinkRequest request = new DeploySDGShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeploySDG"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeploySDGResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deploys shared data groups (SDGs).</p>
     * 
     * @param request DeploySDGRequest
     * @return DeploySDGResponse
     */
    public DeploySDGResponse deploySDG(DeploySDGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deploySDGWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about images of the Android in Container (AIC) instance.</p>
     * 
     * @param request DescribeAICImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAICImagesResponse
     */
    public DescribeAICImagesResponse describeAICImagesWithOptions(DescribeAICImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageType)) {
            query.put("ImageType", request.imageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageUrl)) {
            query.put("ImageUrl", request.imageUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDate)) {
            query.put("MaxDate", request.maxDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDate)) {
            query.put("MinDate", request.minDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAICImages"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAICImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about images of the Android in Container (AIC) instance.</p>
     * 
     * @param request DescribeAICImagesRequest
     * @return DescribeAICImagesResponse
     */
    public DescribeAICImagesResponse describeAICImages(DescribeAICImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAICImagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about ARM servers and Android in Container (AIC) instances.</p>
     * 
     * @param tmpReq DescribeARMServerInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeARMServerInstancesResponse
     */
    public DescribeARMServerInstancesResponse describeARMServerInstancesWithOptions(DescribeARMServerInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeARMServerInstancesShrinkRequest request = new DescribeARMServerInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.AICSpecs)) {
            request.AICSpecsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.AICSpecs, "AICSpecs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ensRegionIds)) {
            request.ensRegionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ensRegionIds, "EnsRegionIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serverIds)) {
            request.serverIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serverIds, "ServerIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serverSpecs)) {
            request.serverSpecsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serverSpecs, "ServerSpecs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.states)) {
            request.statesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.states, "States", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeARMServerInstances"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeARMServerInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about ARM servers and Android in Container (AIC) instances.</p>
     * 
     * @param request DescribeARMServerInstancesRequest
     * @return DescribeARMServerInstancesResponse
     */
    public DescribeARMServerInstancesResponse describeARMServerInstances(DescribeARMServerInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeARMServerInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the basic properties, resources, and container status of an application.</p>
     * 
     * @param request DescribeApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationResponse
     */
    public DescribeApplicationResponse describeApplicationWithOptions(DescribeApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appVersions)) {
            query.put("AppVersions", request.appVersions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outDetailStatParams)) {
            query.put("OutDetailStatParams", request.outDetailStatParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSelector)) {
            query.put("ResourceSelector", request.resourceSelector);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplication"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the basic properties, resources, and container status of an application.</p>
     * 
     * @param request DescribeApplicationRequest
     * @return DescribeApplicationResponse
     */
    public DescribeApplicationResponse describeApplication(DescribeApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the total quota of resources and the resource usage in different region levels. You can perform resource scale-out based on this information.</p>
     * 
     * @param request DescribeApplicationResourceSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApplicationResourceSummaryResponse
     */
    public DescribeApplicationResourceSummaryResponse describeApplicationResourceSummaryWithOptions(DescribeApplicationResourceSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApplicationResourceSummary"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApplicationResourceSummaryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the total quota of resources and the resource usage in different region levels. You can perform resource scale-out based on this information.</p>
     * 
     * @param request DescribeApplicationResourceSummaryRequest
     * @return DescribeApplicationResourceSummaryResponse
     */
    public DescribeApplicationResourceSummaryResponse describeApplicationResourceSummary(DescribeApplicationResourceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationResourceSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resources that can be created.</p>
     * 
     * @param request DescribeAvailableResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAvailableResourceResponse
     */
    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableResource"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resources that can be created.</p>
     * @return DescribeAvailableResourceResponse
     */
    public DescribeAvailableResourceResponse describeAvailableResource() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableResourceWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of resources that you can purchase when you create an instance.</p>
     * 
     * @param request DescribeAvailableResourceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAvailableResourceInfoResponse
     */
    public DescribeAvailableResourceInfoResponse describeAvailableResourceInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableResourceInfo"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableResourceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of resources that you can purchase when you create an instance.</p>
     * @return DescribeAvailableResourceInfoResponse
     */
    public DescribeAvailableResourceInfoResponse describeAvailableResourceInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableResourceInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available bandwidth metering methods.</p>
     * 
     * @param request DescribeBandWithdChargeTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBandWithdChargeTypeResponse
     */
    public DescribeBandWithdChargeTypeResponse describeBandWithdChargeTypeWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBandWithdChargeType"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBandWithdChargeTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available bandwidth metering methods.</p>
     * @return DescribeBandWithdChargeTypeResponse
     */
    public DescribeBandWithdChargeTypeResponse describeBandWithdChargeType() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBandWithdChargeTypeWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metering method for the bandwidth.</p>
     * 
     * @param request DescribeBandwitdhByInternetChargeTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBandwitdhByInternetChargeTypeResponse
     */
    public DescribeBandwitdhByInternetChargeTypeResponse describeBandwitdhByInternetChargeTypeWithOptions(DescribeBandwitdhByInternetChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBandwitdhByInternetChargeType"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBandwitdhByInternetChargeTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metering method for the bandwidth.</p>
     * 
     * @param request DescribeBandwitdhByInternetChargeTypeRequest
     * @return DescribeBandwitdhByInternetChargeTypeResponse
     */
    public DescribeBandwitdhByInternetChargeTypeResponse describeBandwitdhByInternetChargeType(DescribeBandwitdhByInternetChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBandwitdhByInternetChargeTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available resources in a region.</p>
     * 
     * @param request DescribeCloudDiskAvailableResourceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudDiskAvailableResourceInfoResponse
     */
    public DescribeCloudDiskAvailableResourceInfoResponse describeCloudDiskAvailableResourceInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudDiskAvailableResourceInfo"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudDiskAvailableResourceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available resources in a region.</p>
     * @return DescribeCloudDiskAvailableResourceInfoResponse
     */
    public DescribeCloudDiskAvailableResourceInfoResponse describeCloudDiskAvailableResourceInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudDiskAvailableResourceInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of resources that you can purchase when you create an instance.</p>
     * 
     * @param request DescribeCloudDiskTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCloudDiskTypesResponse
     */
    public DescribeCloudDiskTypesResponse describeCloudDiskTypesWithOptions(DescribeCloudDiskTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCloudDiskTypes"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCloudDiskTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of resources that you can purchase when you create an instance.</p>
     * 
     * @param request DescribeCloudDiskTypesRequest
     * @return DescribeCloudDiskTypesResponse
     */
    public DescribeCloudDiskTypesResponse describeCloudDiskTypes(DescribeCloudDiskTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudDiskTypesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the results of creating an instance.</p>
     * 
     * @param request DescribeCreatePrePaidInstanceResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCreatePrePaidInstanceResultResponse
     */
    public DescribeCreatePrePaidInstanceResultResponse describeCreatePrePaidInstanceResultWithOptions(DescribeCreatePrePaidInstanceResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCreatePrePaidInstanceResult"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCreatePrePaidInstanceResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the results of creating an instance.</p>
     * 
     * @param request DescribeCreatePrePaidInstanceResultRequest
     * @return DescribeCreatePrePaidInstanceResultResponse
     */
    public DescribeCreatePrePaidInstanceResultResponse describeCreatePrePaidInstanceResult(DescribeCreatePrePaidInstanceResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCreatePrePaidInstanceResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the distribution status of data files on edge instances of an application.</p>
     * 
     * @param tmpReq DescribeDataDistResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataDistResultResponse
     */
    public DescribeDataDistResultResponse describeDataDistResultWithOptions(DescribeDataDistResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeDataDistResultShrinkRequest request = new DescribeDataDistResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ensRegionIds)) {
            request.ensRegionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ensRegionIds, "EnsRegionIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataNames)) {
            query.put("DataNames", request.dataNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataVersions)) {
            query.put("DataVersions", request.dataVersions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionIdsShrink)) {
            query.put("EnsRegionIds", request.ensRegionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDate)) {
            query.put("MaxDate", request.maxDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDate)) {
            query.put("MinDate", request.minDate);
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
            new TeaPair("action", "DescribeDataDistResult"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataDistResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the distribution status of data files on edge instances of an application.</p>
     * 
     * @param request DescribeDataDistResultRequest
     * @return DescribeDataDistResultResponse
     */
    public DescribeDataDistResultResponse describeDataDistResult(DescribeDataDistResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataDistResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the download URLs of application data on file servers and returns the file servers on which data is pushed.</p>
     * 
     * @param request DescribeDataDownloadURLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataDownloadURLResponse
     */
    public DescribeDataDownloadURLResponse describeDataDownloadURLWithOptions(DescribeDataDownloadURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataDownloadURL"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataDownloadURLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the download URLs of application data on file servers and returns the file servers on which data is pushed.</p>
     * 
     * @param request DescribeDataDownloadURLRequest
     * @return DescribeDataDownloadURLResponse
     */
    public DescribeDataDownloadURLResponse describeDataDownloadURL(DescribeDataDownloadURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataDownloadURLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the push status of application data files on Edge Node Service (ENS) nodes.</p>
     * 
     * @param request DescribeDataPushResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataPushResultResponse
     */
    public DescribeDataPushResultResponse describeDataPushResultWithOptions(DescribeDataPushResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataNames)) {
            query.put("DataNames", request.dataNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataVersions)) {
            query.put("DataVersions", request.dataVersions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDate)) {
            query.put("MaxDate", request.maxDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDate)) {
            query.put("MinDate", request.minDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIds)) {
            query.put("RegionIds", request.regionIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataPushResult"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataPushResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the push status of application data files on Edge Node Service (ENS) nodes.</p>
     * 
     * @param request DescribeDataPushResultRequest
     * @return DescribeDataPushResultResponse
     */
    public DescribeDataPushResultResponse describeDataPushResult(DescribeDataPushResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataPushResultWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the properties of instances and virtual devices in a specific edge application.</p>
     * 
     * @param request DescribeDeviceServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDeviceServiceResponse
     */
    public DescribeDeviceServiceResponse describeDeviceServiceWithOptions(DescribeDeviceServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDeviceService"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDeviceServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the properties of instances and virtual devices in a specific edge application.</p>
     * 
     * @param request DescribeDeviceServiceRequest
     * @return DescribeDeviceServiceResponse
     */
    public DescribeDeviceServiceResponse describeDeviceService(DescribeDeviceServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more disks.</p>
     * 
     * @param request DescribeDisksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDisksResponse
     */
    public DescribeDisksResponse describeDisksWithOptions(DescribeDisksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskChargeType)) {
            query.put("DiskChargeType", request.diskChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskIds)) {
            query.put("DiskIds", request.diskIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskName)) {
            query.put("DiskName", request.diskName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskType)) {
            query.put("DiskType", request.diskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionIds)) {
            query.put("EnsRegionIds", request.ensRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByParams)) {
            query.put("OrderByParams", request.orderByParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDisks"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDisksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about one or more disks.</p>
     * 
     * @param request DescribeDisksRequest
     * @return DescribeDisksResponse
     */
    public DescribeDisksResponse describeDisks(DescribeDisksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDisksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the properties of elastic IP addresses (EIPs).</p>
     * 
     * @param request DescribeEipAddressesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEipAddressesResponse
     */
    public DescribeEipAddressesResponse describeEipAddressesWithOptions(DescribeEipAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eips)) {
            query.put("Eips", request.eips);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEipAddresses"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEipAddressesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the properties of elastic IP addresses (EIPs).</p>
     * 
     * @param request DescribeEipAddressesRequest
     * @return DescribeEipAddressesResponse
     */
    public DescribeEipAddressesResponse describeEipAddresses(DescribeEipAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEipAddressesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of resources that you can purchase when you create an instance.</p>
     * 
     * @param request DescribeElbAvailableResourceInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeElbAvailableResourceInfoResponse
     */
    public DescribeElbAvailableResourceInfoResponse describeElbAvailableResourceInfoWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElbAvailableResourceInfo"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElbAvailableResourceInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of resources that you can purchase when you create an instance.</p>
     * @return DescribeElbAvailableResourceInfoResponse
     */
    public DescribeElbAvailableResourceInfoResponse describeElbAvailableResourceInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElbAvailableResourceInfoWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>描述商品code</p>
     * 
     * @param request DescribeEnsCommodityCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnsCommodityCodeResponse
     */
    public DescribeEnsCommodityCodeResponse describeEnsCommodityCodeWithOptions(DescribeEnsCommodityCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsCommodityCode"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsCommodityCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>描述商品code</p>
     * 
     * @param request DescribeEnsCommodityCodeRequest
     * @return DescribeEnsCommodityCodeResponse
     */
    public DescribeEnsCommodityCodeResponse describeEnsCommodityCode(DescribeEnsCommodityCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsCommodityCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取模块code</p>
     * 
     * @param request DescribeEnsCommodityModuleCodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnsCommodityModuleCodeResponse
     */
    public DescribeEnsCommodityModuleCodeResponse describeEnsCommodityModuleCodeWithOptions(DescribeEnsCommodityModuleCodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            query.put("ModuleCode", request.moduleCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsCommodityModuleCode"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsCommodityModuleCodeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取模块code</p>
     * 
     * @param request DescribeEnsCommodityModuleCodeRequest
     * @return DescribeEnsCommodityModuleCodeResponse
     */
    public DescribeEnsCommodityModuleCodeResponse describeEnsCommodityModuleCode(DescribeEnsCommodityModuleCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsCommodityModuleCodeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries elastic IP addresses (EIPs).</p>
     * 
     * @param request DescribeEnsEipAddressesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnsEipAddressesResponse
     */
    public DescribeEnsEipAddressesResponse describeEnsEipAddressesWithOptions(DescribeEnsEipAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allocationId)) {
            query.put("AllocationId", request.allocationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associatedInstanceId)) {
            query.put("AssociatedInstanceId", request.associatedInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.associatedInstanceType)) {
            query.put("AssociatedInstanceType", request.associatedInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipAddress)) {
            query.put("EipAddress", request.eipAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipName)) {
            query.put("EipName", request.eipName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standby)) {
            query.put("Standby", request.standby);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsEipAddresses"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsEipAddressesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries elastic IP addresses (EIPs).</p>
     * 
     * @param request DescribeEnsEipAddressesRequest
     * @return DescribeEnsEipAddressesResponse
     */
    public DescribeEnsEipAddressesResponse describeEnsEipAddresses(DescribeEnsEipAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsEipAddressesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regions in which ENS resources can be created.</p>
     * 
     * @param request DescribeEnsNetDistrictRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnsNetDistrictResponse
     */
    public DescribeEnsNetDistrictResponse describeEnsNetDistrictWithOptions(DescribeEnsNetDistrictRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.netDistrictCode)) {
            query.put("NetDistrictCode", request.netDistrictCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netLevelCode)) {
            query.put("NetLevelCode", request.netLevelCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsNetDistrict"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsNetDistrictResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries regions in which ENS resources can be created.</p>
     * 
     * @param request DescribeEnsNetDistrictRequest
     * @return DescribeEnsNetDistrictResponse
     */
    public DescribeEnsNetDistrictResponse describeEnsNetDistrict(DescribeEnsNetDistrictRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsNetDistrictWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the supported network levels.</p>
     * 
     * @param request DescribeEnsNetLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnsNetLevelResponse
     */
    public DescribeEnsNetLevelResponse describeEnsNetLevelWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsNetLevel"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsNetLevelResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the supported network levels.</p>
     * @return DescribeEnsNetLevelResponse
     */
    public DescribeEnsNetLevelResponse describeEnsNetLevel() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsNetLevelWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about ISPs and number of ISPs in an area.</p>
     * 
     * @param request DescribeEnsNetSaleDistrictRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnsNetSaleDistrictResponse
     */
    public DescribeEnsNetSaleDistrictResponse describeEnsNetSaleDistrictWithOptions(DescribeEnsNetSaleDistrictRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.netDistrictCode)) {
            query.put("NetDistrictCode", request.netDistrictCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netLevelCode)) {
            query.put("NetLevelCode", request.netLevelCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsNetSaleDistrict"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsNetSaleDistrictResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about ISPs and number of ISPs in an area.</p>
     * 
     * @param request DescribeEnsNetSaleDistrictRequest
     * @return DescribeEnsNetSaleDistrictResponse
     */
    public DescribeEnsNetSaleDistrictResponse describeEnsNetSaleDistrict(DescribeEnsNetSaleDistrictRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsNetSaleDistrictWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether an edge node supports IPv6.</p>
     * 
     * @param request DescribeEnsRegionIdIpv6InfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnsRegionIdIpv6InfoResponse
     */
    public DescribeEnsRegionIdIpv6InfoResponse describeEnsRegionIdIpv6InfoWithOptions(DescribeEnsRegionIdIpv6InfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsRegionIdIpv6Info"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsRegionIdIpv6InfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether an edge node supports IPv6.</p>
     * 
     * @param request DescribeEnsRegionIdIpv6InfoRequest
     * @return DescribeEnsRegionIdIpv6InfoResponse
     */
    public DescribeEnsRegionIdIpv6InfoResponse describeEnsRegionIdIpv6Info(DescribeEnsRegionIdIpv6InfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsRegionIdIpv6InfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries node resources.</p>
     * 
     * @param request DescribeEnsRegionIdResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnsRegionIdResourceResponse
     */
    public DescribeEnsRegionIdResourceResponse describeEnsRegionIdResourceWithOptions(DescribeEnsRegionIdResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByParams)) {
            query.put("OrderByParams", request.orderByParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsRegionIdResource"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsRegionIdResourceResponse());
    }

    /**
     * <b>description</b> :
     * <hr>
     * 
     * <b>summary</b> : 
     * <p>Queries node resources.</p>
     * 
     * @param request DescribeEnsRegionIdResourceRequest
     * @return DescribeEnsRegionIdResourceResponse
     */
    public DescribeEnsRegionIdResourceResponse describeEnsRegionIdResource(DescribeEnsRegionIdResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsRegionIdResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Edge Node Service (ENS) nodes that you can use.</p>
     * 
     * @param request DescribeEnsRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnsRegionsResponse
     */
    public DescribeEnsRegionsResponse describeEnsRegionsWithOptions(DescribeEnsRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsRegions"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsRegionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Edge Node Service (ENS) nodes that you can use.</p>
     * 
     * @param request DescribeEnsRegionsRequest
     * @return DescribeEnsRegionsResponse
     */
    public DescribeEnsRegionsResponse describeEnsRegions(DescribeEnsRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the usage summary of ENS virtual machines (VMs), disks, and networks.</p>
     * 
     * @param request DescribeEnsResourceUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnsResourceUsageResponse
     */
    public DescribeEnsResourceUsageResponse describeEnsResourceUsageWithOptions(DescribeEnsResourceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsResourceUsage"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsResourceUsageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the usage summary of ENS virtual machines (VMs), disks, and networks.</p>
     * 
     * @param request DescribeEnsResourceUsageRequest
     * @return DescribeEnsResourceUsageResponse
     */
    public DescribeEnsResourceUsageResponse describeEnsResourceUsage(DescribeEnsResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsResourceUsageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries route entries.</p>
     * 
     * @param request DescribeEnsRouteEntryListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnsRouteEntryListResponse
     */
    public DescribeEnsRouteEntryListResponse describeEnsRouteEntryListWithOptions(DescribeEnsRouteEntryListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            query.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHopId)) {
            query.put("NextHopId", request.nextHopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHopType)) {
            query.put("NextHopType", request.nextHopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeEntryId)) {
            query.put("RouteEntryId", request.routeEntryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeEntryName)) {
            query.put("RouteEntryName", request.routeEntryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeEntryType)) {
            query.put("RouteEntryType", request.routeEntryType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeTableId)) {
            query.put("RouteTableId", request.routeTableId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsRouteEntryList"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsRouteEntryListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries route entries.</p>
     * 
     * @param request DescribeEnsRouteEntryListRequest
     * @return DescribeEnsRouteEntryListResponse
     */
    public DescribeEnsRouteEntryListResponse describeEnsRouteEntryList(DescribeEnsRouteEntryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsRouteEntryListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>展示配置的售卖约束信息</p>
     * 
     * @param request DescribeEnsSaleControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnsSaleControlResponse
     */
    public DescribeEnsSaleControlResponse describeEnsSaleControlWithOptions(DescribeEnsSaleControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUidAccount)) {
            query.put("AliUidAccount", request.aliUidAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAccount)) {
            query.put("CustomAccount", request.customAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            query.put("ModuleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsSaleControl"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsSaleControlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>展示配置的售卖约束信息</p>
     * 
     * @param request DescribeEnsSaleControlRequest
     * @return DescribeEnsSaleControlResponse
     */
    public DescribeEnsSaleControlResponse describeEnsSaleControl(DescribeEnsSaleControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsSaleControlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取可用资源</p>
     * 
     * @param request DescribeEnsSaleControlAvailableResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnsSaleControlAvailableResourceResponse
     */
    public DescribeEnsSaleControlAvailableResourceResponse describeEnsSaleControlAvailableResourceWithOptions(DescribeEnsSaleControlAvailableResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAccount)) {
            query.put("CustomAccount", request.customAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsSaleControlAvailableResource"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsSaleControlAvailableResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取可用资源</p>
     * 
     * @param request DescribeEnsSaleControlAvailableResourceRequest
     * @return DescribeEnsSaleControlAvailableResourceResponse
     */
    public DescribeEnsSaleControlAvailableResourceResponse describeEnsSaleControlAvailableResource(DescribeEnsSaleControlAvailableResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsSaleControlAvailableResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取售卖约束库存</p>
     * 
     * @param request DescribeEnsSaleControlStockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnsSaleControlStockResponse
     */
    public DescribeEnsSaleControlStockResponse describeEnsSaleControlStockWithOptions(DescribeEnsSaleControlStockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUidAccount)) {
            query.put("AliUidAccount", request.aliUidAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAccount)) {
            query.put("CustomAccount", request.customAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleCode)) {
            query.put("ModuleCode", request.moduleCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnsSaleControlStock"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnsSaleControlStockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取售卖约束库存</p>
     * 
     * @param request DescribeEnsSaleControlStockRequest
     * @return DescribeEnsSaleControlStockResponse
     */
    public DescribeEnsSaleControlStockResponse describeEnsSaleControlStock(DescribeEnsSaleControlStockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsSaleControlStockWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the EPN bandwidth usage.</p>
     * 
     * @param request DescribeEpnBandWidthDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEpnBandWidthDataResponse
     */
    public DescribeEpnBandWidthDataResponse describeEpnBandWidthDataWithOptions(DescribeEpnBandWidthDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceId)) {
            query.put("EPNInstanceId", request.EPNInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkingModel)) {
            query.put("NetworkingModel", request.networkingModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEpnBandWidthData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEpnBandWidthDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the EPN bandwidth usage.</p>
     * 
     * @param request DescribeEpnBandWidthDataRequest
     * @return DescribeEpnBandWidthDataResponse
     */
    public DescribeEpnBandWidthDataResponse describeEpnBandWidthData(DescribeEpnBandWidthDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnBandWidthDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metering method of the EPN bandwidth within a time period.</p>
     * 
     * @param request DescribeEpnBandwitdhByInternetChargeTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEpnBandwitdhByInternetChargeTypeResponse
     */
    public DescribeEpnBandwitdhByInternetChargeTypeResponse describeEpnBandwitdhByInternetChargeTypeWithOptions(DescribeEpnBandwitdhByInternetChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkingModel)) {
            query.put("NetworkingModel", request.networkingModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEpnBandwitdhByInternetChargeType"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEpnBandwitdhByInternetChargeTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metering method of the EPN bandwidth within a time period.</p>
     * 
     * @param request DescribeEpnBandwitdhByInternetChargeTypeRequest
     * @return DescribeEpnBandwitdhByInternetChargeTypeResponse
     */
    public DescribeEpnBandwitdhByInternetChargeTypeResponse describeEpnBandwitdhByInternetChargeType(DescribeEpnBandwitdhByInternetChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnBandwitdhByInternetChargeTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In internal networking mode, the value of Instances is empty in the response. In public networking mode, the value of VSwitches is empty in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries networking information about an EPN instance.</p>
     * 
     * @param request DescribeEpnInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEpnInstanceAttributeResponse
     */
    public DescribeEpnInstanceAttributeResponse describeEpnInstanceAttributeWithOptions(DescribeEpnInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceId)) {
            query.put("EPNInstanceId", request.EPNInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEpnInstanceAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEpnInstanceAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>In internal networking mode, the value of Instances is empty in the response. In public networking mode, the value of VSwitches is empty in the response.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries networking information about an EPN instance.</p>
     * 
     * @param request DescribeEpnInstanceAttributeRequest
     * @return DescribeEpnInstanceAttributeResponse
     */
    public DescribeEpnInstanceAttributeResponse describeEpnInstanceAttribute(DescribeEpnInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries EPN instances.</p>
     * 
     * @param request DescribeEpnInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEpnInstancesResponse
     */
    public DescribeEpnInstancesResponse describeEpnInstancesWithOptions(DescribeEpnInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceId)) {
            query.put("EPNInstanceId", request.EPNInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceName)) {
            query.put("EPNInstanceName", request.EPNInstanceName);
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
            new TeaPair("action", "DescribeEpnInstances"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEpnInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries EPN instances.</p>
     * 
     * @param request DescribeEpnInstancesRequest
     * @return DescribeEpnInstancesResponse
     */
    public DescribeEpnInstancesResponse describeEpnInstances(DescribeEpnInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metering data of the edge private network (EPN).</p>
     * 
     * @param request DescribeEpnMeasurementDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEpnMeasurementDataResponse
     */
    public DescribeEpnMeasurementDataResponse describeEpnMeasurementDataWithOptions(DescribeEpnMeasurementDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEpnMeasurementData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEpnMeasurementDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metering data of the edge private network (EPN).</p>
     * 
     * @param request DescribeEpnMeasurementDataRequest
     * @return DescribeEpnMeasurementDataResponse
     */
    public DescribeEpnMeasurementDataResponse describeEpnMeasurementData(DescribeEpnMeasurementDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnMeasurementDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query information about all custom images in your account. The information include the image properties, image export status, and the Object Storage Service (OSS) download links.</p>
     * <ul>
     * <li>Empty strings are returned for images that are not exported.</li>
     * <li>The download links may become invalid if you delete objects in OSS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the export result of an image.</p>
     * 
     * @param request DescribeExportImageInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExportImageInfoResponse
     */
    public DescribeExportImageInfoResponse describeExportImageInfoWithOptions(DescribeExportImageInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
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
            new TeaPair("action", "DescribeExportImageInfo"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExportImageInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to query information about all custom images in your account. The information include the image properties, image export status, and the Object Storage Service (OSS) download links.</p>
     * <ul>
     * <li>Empty strings are returned for images that are not exported.</li>
     * <li>The download links may become invalid if you delete objects in OSS.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the export result of an image.</p>
     * 
     * @param request DescribeExportImageInfoRequest
     * @return DescribeExportImageInfoResponse
     */
    public DescribeExportImageInfoResponse describeExportImageInfo(DescribeExportImageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExportImageInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the export status of an image.</p>
     * 
     * @param request DescribeExportImageStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExportImageStatusResponse
     */
    public DescribeExportImageStatusResponse describeExportImageStatusWithOptions(DescribeExportImageStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExportImageStatus"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExportImageStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the export status of an image.</p>
     * 
     * @param request DescribeExportImageStatusRequest
     * @return DescribeExportImageStatusResponse
     */
    public DescribeExportImageStatusResponse describeExportImageStatus(DescribeExportImageStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExportImageStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about file systems.</p>
     * 
     * @param request DescribeFileSystemsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeFileSystemsResponse
     */
    public DescribeFileSystemsResponse describeFileSystemsWithOptions(DescribeFileSystemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeFileSystems"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeFileSystemsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about file systems.</p>
     * 
     * @param request DescribeFileSystemsRequest
     * @return DescribeFileSystemsResponse
     */
    public DescribeFileSystemsResponse describeFileSystems(DescribeFileSystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFileSystemsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Destination Network Address Translation (DNAT) entries that you created.</p>
     * 
     * @param request DescribeForwardTableEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeForwardTableEntriesResponse
     */
    public DescribeForwardTableEntriesResponse describeForwardTableEntriesWithOptions(DescribeForwardTableEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.externalIp)) {
            query.put("ExternalIp", request.externalIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardEntryId)) {
            query.put("ForwardEntryId", request.forwardEntryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardEntryName)) {
            query.put("ForwardEntryName", request.forwardEntryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internalIp)) {
            query.put("InternalIp", request.internalIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipProtocol)) {
            query.put("IpProtocol", request.ipProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.natGatewayId)) {
            query.put("NatGatewayId", request.natGatewayId);
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
            new TeaPair("action", "DescribeForwardTableEntries"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeForwardTableEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Destination Network Address Translation (DNAT) entries that you created.</p>
     * 
     * @param request DescribeForwardTableEntriesRequest
     * @return DescribeForwardTableEntriesResponse
     */
    public DescribeForwardTableEntriesResponse describeForwardTableEntries(DescribeForwardTableEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeForwardTableEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available images.</p>
     * 
     * @param request DescribeImageInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImageInfosResponse
     */
    public DescribeImageInfosResponse describeImageInfosWithOptions(DescribeImageInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.osType)) {
            query.put("OsType", request.osType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImageInfos"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available images.</p>
     * 
     * @param request DescribeImageInfosRequest
     * @return DescribeImageInfosResponse
     */
    public DescribeImageInfosResponse describeImageInfos(DescribeImageInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageInfosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the accounts with which you share an image specified by the ImageId parameter.</p>
     * 
     * @param request DescribeImageSharePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImageSharePermissionResponse
     */
    public DescribeImageSharePermissionResponse describeImageSharePermissionWithOptions(DescribeImageSharePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliyunId)) {
            query.put("AliyunId", request.aliyunId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
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
            new TeaPair("action", "DescribeImageSharePermission"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImageSharePermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the accounts with which you share an image specified by the ImageId parameter.</p>
     * 
     * @param request DescribeImageSharePermissionRequest
     * @return DescribeImageSharePermissionResponse
     */
    public DescribeImageSharePermissionResponse describeImageSharePermission(DescribeImageSharePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageSharePermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available images.</p>
     * 
     * @param request DescribeImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeImagesResponse
     */
    public DescribeImagesResponse describeImagesWithOptions(DescribeImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeImages"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries available images.</p>
     * 
     * @param request DescribeImagesRequest
     * @return DescribeImagesResponse
     */
    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query whether auto-renewal is enabled for an instance.</p>
     * 
     * @param request DescribeInstanceAutoRenewAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceAutoRenewAttributeResponse
     */
    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeWithOptions(DescribeInstanceAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceAutoRenewAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceAutoRenewAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query whether auto-renewal is enabled for an instance.</p>
     * 
     * @param request DescribeInstanceAutoRenewAttributeRequest
     * @return DescribeInstanceAutoRenewAttributeResponse
     */
    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the vCPU and memory usage of an instance.</p>
     * 
     * @param request DescribeInstanceMonitorDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceMonitorDataResponse
     */
    public DescribeInstanceMonitorDataResponse describeInstanceMonitorDataWithOptions(DescribeInstanceMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceMonitorData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceMonitorDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the vCPU and memory usage of an instance.</p>
     * 
     * @param request DescribeInstanceMonitorDataRequest
     * @return DescribeInstanceMonitorDataResponse
     */
    public DescribeInstanceMonitorDataResponse describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceMonitorDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the instance specifications that you can purchase.</p>
     * 
     * @param request DescribeInstanceSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceSpecResponse
     */
    public DescribeInstanceSpecResponse describeInstanceSpecWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceSpec"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceSpecResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the instance specifications that you can purchase.</p>
     * @return DescribeInstanceSpecResponse
     */
    public DescribeInstanceSpecResponse describeInstanceSpec() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSpecWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of instance types.</p>
     * 
     * @param request DescribeInstanceTypesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceTypesResponse
     */
    public DescribeInstanceTypesResponse describeInstanceTypesWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceTypes"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceTypesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of instance types.</p>
     * @return DescribeInstanceTypesResponse
     */
    public DescribeInstanceTypesResponse describeInstanceTypes() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceTypesWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Virtual Network Computing (VNC) URL of an Edge Node Service (ENS) instance.</p>
     * 
     * @param request DescribeInstanceVncUrlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstanceVncUrlResponse
     */
    public DescribeInstanceVncUrlResponse describeInstanceVncUrlWithOptions(DescribeInstanceVncUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstanceVncUrl"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstanceVncUrlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Virtual Network Computing (VNC) URL of an Edge Node Service (ENS) instance.</p>
     * 
     * @param request DescribeInstanceVncUrlRequest
     * @return DescribeInstanceVncUrlResponse
     */
    public DescribeInstanceVncUrlResponse describeInstanceVncUrl(DescribeInstanceVncUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceVncUrlWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 800 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per user.</li>
     * <li>You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are included in the filter conditions. However, if InstanceIds is set to an empty JSON array, it is regarded as a valid filter condition and an empty result is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of one or more Edge Node Service (ENS) instances.</p>
     * 
     * @param tmpReq DescribeInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeInstancesShrinkRequest request = new DescribeInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tags)) {
            request.tagsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tags, "Tags", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionIds)) {
            query.put("EnsRegionIds", request.ensRegionIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensServiceId)) {
            query.put("EnsServiceId", request.ensServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceResourceType)) {
            query.put("InstanceResourceType", request.instanceResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.intranetIp)) {
            query.put("IntranetIp", request.intranetIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkId)) {
            query.put("NetworkId", request.networkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByParams)) {
            query.put("OrderByParams", request.orderByParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagsShrink)) {
            query.put("Tags", request.tagsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInstances"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 800 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 100 times per second per user.</li>
     * <li>You can specify multiple request parameters to be queried. Specified parameters are evaluated by using the AND operator. Only the specified parameters are included in the filter conditions. However, if InstanceIds is set to an empty JSON array, it is regarded as a valid filter condition and an empty result is returned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of one or more Edge Node Service (ENS) instances.</p>
     * 
     * @param request DescribeInstancesRequest
     * @return DescribeInstancesResponse
     */
    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more key pairs.</p>
     * 
     * @param request DescribeKeyPairsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeKeyPairsResponse
     */
    public DescribeKeyPairsResponse describeKeyPairsWithOptions(DescribeKeyPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairId)) {
            query.put("KeyPairId", request.keyPairId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
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
            new TeaPair("action", "DescribeKeyPairs"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKeyPairsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries one or more key pairs.</p>
     * 
     * @param request DescribeKeyPairsRequest
     * @return DescribeKeyPairsResponse
     */
    public DescribeKeyPairsResponse describeKeyPairs(DescribeKeyPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKeyPairsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries detailed information about an Edge Load Balancer (ELB) instance.</p>
     * 
     * @param request DescribeLoadBalancerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoadBalancerAttributeResponse
     */
    public DescribeLoadBalancerAttributeResponse describeLoadBalancerAttributeWithOptions(DescribeLoadBalancerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries detailed information about an Edge Load Balancer (ELB) instance.</p>
     * 
     * @param request DescribeLoadBalancerAttributeRequest
     * @return DescribeLoadBalancerAttributeResponse
     */
    public DescribeLoadBalancerAttributeResponse describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration of an HTTP listener.</p>
     * 
     * @param request DescribeLoadBalancerHTTPListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoadBalancerHTTPListenerAttributeResponse
     */
    public DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttributeWithOptions(DescribeLoadBalancerHTTPListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancerHTTPListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerHTTPListenerAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration of an HTTP listener.</p>
     * 
     * @param request DescribeLoadBalancerHTTPListenerAttributeRequest
     * @return DescribeLoadBalancerHTTPListenerAttributeResponse
     */
    public DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerHTTPListenerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of an HTTPS listener.</p>
     * 
     * @param request DescribeLoadBalancerHTTPSListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoadBalancerHTTPSListenerAttributeResponse
     */
    public DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttributeWithOptions(DescribeLoadBalancerHTTPSListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancerHTTPSListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerHTTPSListenerAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of an HTTPS listener.</p>
     * 
     * @param request DescribeLoadBalancerHTTPSListenerAttributeRequest
     * @return DescribeLoadBalancerHTTPSListenerAttributeResponse
     */
    public DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttribute(DescribeLoadBalancerHTTPSListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerHTTPSListenerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of an Edge Load Balancer (ELB) instance.</p>
     * 
     * @param request DescribeLoadBalancerSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoadBalancerSpecResponse
     */
    public DescribeLoadBalancerSpecResponse describeLoadBalancerSpecWithOptions(DescribeLoadBalancerSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancerSpec"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerSpecResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of an Edge Load Balancer (ELB) instance.</p>
     * 
     * @param request DescribeLoadBalancerSpecRequest
     * @return DescribeLoadBalancerSpecResponse
     */
    public DescribeLoadBalancerSpecResponse describeLoadBalancerSpec(DescribeLoadBalancerSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerSpecWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of a Transmission Control Protocol (TCP) listener.</p>
     * 
     * @param request DescribeLoadBalancerTCPListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoadBalancerTCPListenerAttributeResponse
     */
    public DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttributeWithOptions(DescribeLoadBalancerTCPListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancerTCPListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerTCPListenerAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configurations of a Transmission Control Protocol (TCP) listener.</p>
     * 
     * @param request DescribeLoadBalancerTCPListenerAttributeRequest
     * @return DescribeLoadBalancerTCPListenerAttributeResponse
     */
    public DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerTCPListenerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration of a User Datagram Protocol (UDP) listener.</p>
     * 
     * @param request DescribeLoadBalancerUDPListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoadBalancerUDPListenerAttributeResponse
     */
    public DescribeLoadBalancerUDPListenerAttributeResponse describeLoadBalancerUDPListenerAttributeWithOptions(DescribeLoadBalancerUDPListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancerUDPListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancerUDPListenerAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration of a User Datagram Protocol (UDP) listener.</p>
     * 
     * @param request DescribeLoadBalancerUDPListenerAttributeRequest
     * @return DescribeLoadBalancerUDPListenerAttributeResponse
     */
    public DescribeLoadBalancerUDPListenerAttributeResponse describeLoadBalancerUDPListenerAttribute(DescribeLoadBalancerUDPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerUDPListenerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries Edge Load Balancer (ELB) instances.</p>
     * 
     * @param request DescribeLoadBalancersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLoadBalancersResponse
     */
    public DescribeLoadBalancersResponse describeLoadBalancersWithOptions(DescribeLoadBalancersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLoadBalancers"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLoadBalancersResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries Edge Load Balancer (ELB) instances.</p>
     * 
     * @param request DescribeLoadBalancersRequest
     * @return DescribeLoadBalancersResponse
     */
    public DescribeLoadBalancersResponse describeLoadBalancers(DescribeLoadBalancersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metering data of the user.</p>
     * 
     * @param request DescribeMeasurementDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMeasurementDataResponse
     */
    public DescribeMeasurementDataResponse describeMeasurementDataWithOptions(DescribeMeasurementDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMeasurementData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMeasurementDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the metering data of the user.</p>
     * 
     * @param request DescribeMeasurementDataRequest
     * @return DescribeMeasurementDataResponse
     */
    public DescribeMeasurementDataResponse describeMeasurementData(DescribeMeasurementDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMeasurementDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about mount targets.</p>
     * 
     * @param request DescribeMountTargetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMountTargetsResponse
     */
    public DescribeMountTargetsResponse describeMountTargetsWithOptions(DescribeMountTargetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mountTargetName)) {
            query.put("MountTargetName", request.mountTargetName);
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
            new TeaPair("action", "DescribeMountTargets"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMountTargetsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about mount targets.</p>
     * 
     * @param request DescribeMountTargetsRequest
     * @return DescribeMountTargetsResponse
     */
    public DescribeMountTargetsResponse describeMountTargets(DescribeMountTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMountTargetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>根据筛选条件获取指定NC属性和资源量信息</p>
     * 
     * @param request DescribeNCInformationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNCInformationResponse
     */
    public DescribeNCInformationResponse describeNCInformationWithOptions(DescribeNCInformationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNCInformation"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNCInformationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>根据筛选条件获取指定NC属性和资源量信息</p>
     * 
     * @param request DescribeNCInformationRequest
     * @return DescribeNCInformationResponse
     */
    public DescribeNCInformationResponse describeNCInformation(DescribeNCInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNCInformationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries created Network Address Translation (NAT) gateways.</p>
     * 
     * @param request DescribeNatGatewaysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNatGatewaysResponse
     */
    public DescribeNatGatewaysResponse describeNatGatewaysWithOptions(DescribeNatGatewaysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNatGateways"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNatGatewaysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries created Network Address Translation (NAT) gateways.</p>
     * 
     * @param request DescribeNatGatewaysRequest
     * @return DescribeNatGatewaysResponse
     */
    public DescribeNatGatewaysResponse describeNatGateways(DescribeNatGatewaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNatGatewaysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries network access control lists (ACLs).</p>
     * 
     * @param request DescribeNetworkAclsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetworkAclsResponse
     */
    public DescribeNetworkAclsResponse describeNetworkAclsWithOptions(DescribeNetworkAclsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkAcls"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkAclsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries network access control lists (ACLs).</p>
     * 
     * @param request DescribeNetworkAclsRequest
     * @return DescribeNetworkAclsResponse
     */
    public DescribeNetworkAclsResponse describeNetworkAcls(DescribeNetworkAclsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkAclsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration of a specified network.</p>
     * 
     * @param request DescribeNetworkAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetworkAttributeResponse
     */
    public DescribeNetworkAttributeResponse describeNetworkAttributeWithOptions(DescribeNetworkAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkId)) {
            query.put("NetworkId", request.networkId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration of a specified network.</p>
     * 
     * @param request DescribeNetworkAttributeRequest
     * @return DescribeNetworkAttributeResponse
     */
    public DescribeNetworkAttributeResponse describeNetworkAttribute(DescribeNetworkAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Elastic Network Interfaces (ENIs).</p>
     * 
     * @param request DescribeNetworkInterfacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetworkInterfacesResponse
     */
    public DescribeNetworkInterfacesResponse describeNetworkInterfacesWithOptions(DescribeNetworkInterfacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkId)) {
            query.put("NetworkId", request.networkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceId)) {
            query.put("NetworkInterfaceId", request.networkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceName)) {
            query.put("NetworkInterfaceName", request.networkInterfaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryIpAddress)) {
            query.put("PrimaryIpAddress", request.primaryIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNetworkInterfaces"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworkInterfacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Elastic Network Interfaces (ENIs).</p>
     * 
     * @param request DescribeNetworkInterfacesRequest
     * @return DescribeNetworkInterfacesResponse
     */
    public DescribeNetworkInterfacesResponse describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkInterfacesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the network list.</p>
     * 
     * @param request DescribeNetworksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNetworksResponse
     */
    public DescribeNetworksResponse describeNetworksWithOptions(DescribeNetworksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkId)) {
            query.put("NetworkId", request.networkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkName)) {
            query.put("NetworkName", request.networkName);
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
            new TeaPair("action", "DescribeNetworks"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNetworksResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Query the network list.</p>
     * 
     * @param request DescribeNetworksRequest
     * @return DescribeNetworksResponse
     */
    public DescribeNetworksResponse describeNetworks(DescribeNetworksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of resources that you can purchase.</p>
     * 
     * @param request DescribePrePaidInstanceStockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePrePaidInstanceStockResponse
     */
    public DescribePrePaidInstanceStockResponse describePrePaidInstanceStockWithOptions(DescribePrePaidInstanceStockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataDiskSize)) {
            query.put("DataDiskSize", request.dataDiskSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSpec)) {
            query.put("InstanceSpec", request.instanceSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskSize)) {
            query.put("SystemDiskSize", request.systemDiskSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrePaidInstanceStock"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePrePaidInstanceStockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of resources that you can purchase.</p>
     * 
     * @param request DescribePrePaidInstanceStockRequest
     * @return DescribePrePaidInstanceStockResponse
     */
    public DescribePrePaidInstanceStockResponse describePrePaidInstanceStock(DescribePrePaidInstanceStockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePrePaidInstanceStockWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the most recent price of an Edge Node Service (ENS) instance.</p>
     * 
     * @param tmpReq DescribePriceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePriceResponse
     */
    public DescribePriceResponse describePriceWithOptions(DescribePriceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribePriceShrinkRequest request = new DescribePriceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataDisks)) {
            request.dataDisksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataDisks, "DataDisks", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataDisksShrink)) {
            query.put("DataDisks", request.dataDisksShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quantity)) {
            query.put("Quantity", request.quantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDisk)) {
            query.put("DataDisk", request.dataDisk);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDisk)) {
            query.put("SystemDisk", request.systemDisk);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePrice"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePriceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the most recent price of an Edge Node Service (ENS) instance.</p>
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
     * <p>Queries information about the Internet service providers (ISPs) of edge nodes.</p>
     * 
     * @param request DescribeRegionIspsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionIspsResponse
     */
    public DescribeRegionIspsResponse describeRegionIspsWithOptions(DescribeRegionIspsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegionIsps"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionIspsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about the Internet service providers (ISPs) of edge nodes.</p>
     * 
     * @param request DescribeRegionIspsRequest
     * @return DescribeRegionIspsResponse
     */
    public DescribeRegionIspsResponse describeRegionIsps(DescribeRegionIspsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionIspsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取区域节点资源量信息</p>
     * 
     * @param request DescribeRegionResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionResourceResponse
     */
    public DescribeRegionResourceResponse describeRegionResourceWithOptions(DescribeRegionResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegionResource"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取区域节点资源量信息</p>
     * 
     * @param request DescribeRegionResourceRequest
     * @return DescribeRegionResourceResponse
     */
    public DescribeRegionResourceResponse describeRegionResource(DescribeRegionResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of resources that you can purchase.</p>
     * 
     * @param request DescribeReservedResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeReservedResourceResponse
     */
    public DescribeReservedResourceResponse describeReservedResourceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeReservedResource"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeReservedResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the specifications of resources that you can purchase.</p>
     * @return DescribeReservedResourceResponse
     */
    public DescribeReservedResourceResponse describeReservedResource() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeReservedResourceWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源状态变化时间线</p>
     * 
     * @param request DescribeResourceTimelineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceTimelineResponse
     */
    public DescribeResourceTimelineResponse describeResourceTimelineWithOptions(DescribeResourceTimelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceTimeline"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceTimelineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源状态变化时间线</p>
     * 
     * @param request DescribeResourceTimelineRequest
     * @return DescribeResourceTimelineResponse
     */
    public DescribeResourceTimelineResponse describeResourceTimeline(DescribeResourceTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceTimelineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询SDG信息</p>
     * 
     * @param tmpReq DescribeSDGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSDGResponse
     */
    public DescribeSDGResponse describeSDGWithOptions(DescribeSDGRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSDGShrinkRequest request = new DescribeSDGShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.SDGIds)) {
            request.SDGIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.SDGIds, "SDGIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SDGIdsShrink)) {
            query.put("SDGIds", request.SDGIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSDG"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSDGResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询SDG信息</p>
     * 
     * @param request DescribeSDGRequest
     * @return DescribeSDGResponse
     */
    public DescribeSDGResponse describeSDG(DescribeSDGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSDGWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the deployment status of the shared data group (SDG).</p>
     * 
     * @param request DescribeSDGDeploymentStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSDGDeploymentStatusResponse
     */
    public DescribeSDGDeploymentStatusResponse describeSDGDeploymentStatusWithOptions(DescribeSDGDeploymentStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSDGDeploymentStatus"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSDGDeploymentStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the deployment status of the shared data group (SDG).</p>
     * 
     * @param request DescribeSDGDeploymentStatusRequest
     * @return DescribeSDGDeploymentStatusResponse
     */
    public DescribeSDGDeploymentStatusResponse describeSDGDeploymentStatus(DescribeSDGDeploymentStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSDGDeploymentStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about created shared data groups (SDGs).</p>
     * 
     * @param tmpReq DescribeSDGsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSDGsResponse
     */
    public DescribeSDGsResponse describeSDGsWithOptions(DescribeSDGsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeSDGsShrinkRequest request = new DescribeSDGsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.SDGIds)) {
            request.SDGIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.SDGIds, "SDGIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SDGIdsShrink)) {
            query.put("SDGIds", request.SDGIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSDGs"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSDGsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about created shared data groups (SDGs).</p>
     * 
     * @param request DescribeSDGsRequest
     * @return DescribeSDGsResponse
     */
    public DescribeSDGsResponse describeSDGs(DescribeSDGsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSDGsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rules of a security group.</p>
     * 
     * @param request DescribeSecurityGroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityGroupAttributeResponse
     */
    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttributeWithOptions(DescribeSecurityGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityGroupAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityGroupAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rules of a security group.</p>
     * 
     * @param request DescribeSecurityGroupAttributeRequest
     * @return DescribeSecurityGroupAttributeResponse
     */
    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityGroupAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details about created security groups.</p>
     * 
     * @param request DescribeSecurityGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityGroupsResponse
     */
    public DescribeSecurityGroupsResponse describeSecurityGroupsWithOptions(DescribeSecurityGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupName)) {
            query.put("SecurityGroupName", request.securityGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityGroups"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries details about created security groups.</p>
     * 
     * @param request DescribeSecurityGroupsRequest
     * @return DescribeSecurityGroupsResponse
     */
    public DescribeSecurityGroupsResponse describeSecurityGroups(DescribeSecurityGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries custom images.</p>
     * 
     * @param request DescribeSelfImagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSelfImagesResponse
     */
    public DescribeSelfImagesResponse describeSelfImagesWithOptions(DescribeSelfImagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSelfImages"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSelfImagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries custom images.</p>
     * 
     * @param request DescribeSelfImagesRequest
     * @return DescribeSelfImagesResponse
     */
    public DescribeSelfImagesResponse describeSelfImages(DescribeSelfImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSelfImagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeServcieSchedule to query the real-time status of the instance device or container that is being occupied by the UUID.</p>
     * 
     * @param request DescribeServcieScheduleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeServcieScheduleResponse
     */
    public DescribeServcieScheduleResponse describeServcieScheduleWithOptions(DescribeServcieScheduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podConfigName)) {
            query.put("PodConfigName", request.podConfigName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeServcieSchedule"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeServcieScheduleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>You can call the DescribeServcieSchedule to query the real-time status of the instance device or container that is being occupied by the UUID.</p>
     * 
     * @param request DescribeServcieScheduleRequest
     * @return DescribeServcieScheduleResponse
     */
    public DescribeServcieScheduleResponse describeServcieSchedule(DescribeServcieScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServcieScheduleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about snapshots.</p>
     * 
     * @param request DescribeSnapshotsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSnapshotsResponse
     */
    public DescribeSnapshotsResponse describeSnapshotsWithOptions(DescribeSnapshotsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnapshots"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnapshotsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about snapshots.</p>
     * 
     * @param request DescribeSnapshotsRequest
     * @return DescribeSnapshotsResponse
     */
    public DescribeSnapshotsResponse describeSnapshots(DescribeSnapshotsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnapshotsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specific source network address translation (SNAT) entry.</p>
     * 
     * @param request DescribeSnatAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSnatAttributeResponse
     */
    public DescribeSnatAttributeResponse describeSnatAttributeWithOptions(DescribeSnatAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.snatEntryId)) {
            query.put("SnatEntryId", request.snatEntryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnatAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnatAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specific source network address translation (SNAT) entry.</p>
     * 
     * @param request DescribeSnatAttributeRequest
     * @return DescribeSnatAttributeResponse
     */
    public DescribeSnatAttributeResponse describeSnatAttribute(DescribeSnatAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnatAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries source network address translation (SNAT) entries.</p>
     * 
     * @param request DescribeSnatTableEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSnatTableEntriesResponse
     */
    public DescribeSnatTableEntriesResponse describeSnatTableEntriesWithOptions(DescribeSnatTableEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSnatTableEntries"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSnatTableEntriesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries source network address translation (SNAT) entries.</p>
     * 
     * @param request DescribeSnatTableEntriesRequest
     * @return DescribeSnatTableEntriesResponse
     */
    public DescribeSnatTableEntriesResponse describeSnatTableEntries(DescribeSnatTableEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnatTableEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the bandwidth that you use within a specified period of time.</p>
     * 
     * @param request DescribeUserBandWidthDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserBandWidthDataResponse
     */
    public DescribeUserBandWidthDataResponse describeUserBandWidthDataWithOptions(DescribeUserBandWidthDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isp)) {
            query.put("Isp", request.isp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserBandWidthData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserBandWidthDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the bandwidth that you use within a specified period of time.</p>
     * 
     * @param request DescribeUserBandWidthDataRequest
     * @return DescribeUserBandWidthDataResponse
     */
    public DescribeUserBandWidthDataResponse describeUserBandWidthData(DescribeUserBandWidthDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserBandWidthDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about available vSwitches.</p>
     * 
     * @param request DescribeVSwitchesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeVSwitchesResponse
     */
    public DescribeVSwitchesResponse describeVSwitchesWithOptions(DescribeVSwitchesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkId)) {
            query.put("NetworkId", request.networkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderByParams)) {
            query.put("OrderByParams", request.orderByParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchName)) {
            query.put("VSwitchName", request.vSwitchName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeVSwitches"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeVSwitchesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about available vSwitches.</p>
     * 
     * @param request DescribeVSwitchesRequest
     * @return DescribeVSwitchesResponse
     */
    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches a pay-as-you-go data disk or a system disk from an Elastic Compute Service (ECS) instance.</p>
     * 
     * @param request DetachDiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachDiskResponse
     */
    public DetachDiskResponse detachDiskWithOptions(DetachDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachDisk"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachDiskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Detaches a pay-as-you-go data disk or a system disk from an Elastic Compute Service (ECS) instance.</p>
     * 
     * @param request DetachDiskRequest
     * @return DetachDiskResponse
     */
    public DetachDiskResponse detachDisk(DetachDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachDiskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Distributes pushed data to the Edge Node Service (ENS) instances of the application. You can specify multiple canary release policies, decompress files, and restart containers.</p>
     * 
     * @param request DistApplicationDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DistApplicationDataResponse
     */
    public DistApplicationDataResponse distApplicationDataWithOptions(DistApplicationDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.distStrategy)) {
            query.put("DistStrategy", request.distStrategy);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DistApplicationData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DistApplicationDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Distributes pushed data to the Edge Node Service (ENS) instances of the application. You can specify multiple canary release policies, decompress files, and restart containers.</p>
     * 
     * @param request DistApplicationDataRequest
     * @return DistApplicationDataResponse
     */
    public DistApplicationDataResponse distApplicationData(DistApplicationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.distApplicationDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Exports billing details within a specific time range.</p>
     * 
     * @param request ExportBillDetailDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportBillDetailDataResponse
     */
    public ExportBillDetailDataResponse exportBillDetailDataWithOptions(ExportBillDetailDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportBillDetailData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportBillDetailDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Exports billing details within a specific time range.</p>
     * 
     * @param request ExportBillDetailDataRequest
     * @return ExportBillDetailDataResponse
     */
    public ExportBillDetailDataResponse exportBillDetailData(ExportBillDetailDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportBillDetailDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Exports a custom image to an Object Storage Service (OSS) bucket in the same region.</p>
     * 
     * @param request ExportImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportImageResponse
     */
    public ExportImageResponse exportImageWithOptions(ExportImageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSSBucket)) {
            query.put("OSSBucket", request.OSSBucket);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSSPrefix)) {
            query.put("OSSPrefix", request.OSSPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.OSSRegionId)) {
            query.put("OSSRegionId", request.OSSRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportImage"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Exports a custom image to an Object Storage Service (OSS) bucket in the same region.</p>
     * 
     * @param request ExportImageRequest
     * @return ExportImageResponse
     */
    public ExportImageResponse exportImage(ExportImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Exports the metering data within a specific time range.</p>
     * 
     * @param request ExportMeasurementDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExportMeasurementDataResponse
     */
    public ExportMeasurementDataResponse exportMeasurementDataWithOptions(ExportMeasurementDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExportMeasurementData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportMeasurementDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Exports the metering data within a specific time range.</p>
     * 
     * @param request ExportMeasurementDataRequest
     * @return ExportMeasurementDataResponse
     */
    public ExportMeasurementDataResponse exportMeasurementData(ExportMeasurementDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportMeasurementDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the access control list (ACL) of a bucket.</p>
     * 
     * @param request GetBucketAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBucketAclResponse
     */
    public GetBucketAclResponse getBucketAclWithOptions(GetBucketAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketAcl"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBucketAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the access control list (ACL) of a bucket.</p>
     * 
     * @param request GetBucketAclRequest
     * @return GetBucketAclResponse
     */
    public GetBucketAclResponse getBucketAcl(GetBucketAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBucketAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a bucket.</p>
     * 
     * @param request GetBucketInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBucketInfoResponse
     */
    public GetBucketInfoResponse getBucketInfoWithOptions(GetBucketInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketInfo"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBucketInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the detailed information about a bucket.</p>
     * 
     * @param request GetBucketInfoRequest
     * @return GetBucketInfoResponse
     */
    public GetBucketInfoResponse getBucketInfo(GetBucketInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBucketInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries lifecycle rules.</p>
     * 
     * @param request GetBucketLifecycleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetBucketLifecycleResponse
     */
    public GetBucketLifecycleResponse getBucketLifecycleWithOptions(GetBucketLifecycleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBucketLifecycle"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBucketLifecycleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries lifecycle rules.</p>
     * 
     * @param request GetBucketLifecycleRequest
     * @return GetBucketLifecycleResponse
     */
    public GetBucketLifecycleResponse getBucketLifecycle(GetBucketLifecycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBucketLifecycleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the network address translation (NAT) rule details of a device such as a server or container by its ID.</p>
     * 
     * @param request GetDeviceInternetPortRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDeviceInternetPortResponse
     */
    public GetDeviceInternetPortResponse getDeviceInternetPortWithOptions(GetDeviceInternetPortRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDeviceInternetPort"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDeviceInternetPortResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the network address translation (NAT) rule details of a device such as a server or container by its ID.</p>
     * 
     * @param request GetDeviceInternetPortRequest
     * @return GetDeviceInternetPortResponse
     */
    public GetDeviceInternetPortResponse getDeviceInternetPort(GetDeviceInternetPortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceInternetPortWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the storage usage in the previous billing cycle and the cumulative number of calls in this month.</p>
     * 
     * @param request GetOssStorageAndAccByBucketsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssStorageAndAccByBucketsResponse
     */
    public GetOssStorageAndAccByBucketsResponse getOssStorageAndAccByBucketsWithOptions(GetOssStorageAndAccByBucketsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssStorageAndAccByBuckets"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssStorageAndAccByBucketsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the storage usage in the previous billing cycle and the cumulative number of calls in this month.</p>
     * 
     * @param request GetOssStorageAndAccByBucketsRequest
     * @return GetOssStorageAndAccByBucketsResponse
     */
    public GetOssStorageAndAccByBucketsResponse getOssStorageAndAccByBuckets(GetOssStorageAndAccByBucketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssStorageAndAccByBucketsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The query and aggregation granularity of bandwidth and storage usage cannot exceed one day. Data aggregation is to collect the maximum values of usage data within a period of time.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage and bandwidth usage within a specific time range.</p>
     * 
     * @param request GetOssUsageDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOssUsageDataResponse
     */
    public GetOssUsageDataResponse getOssUsageDataWithOptions(GetOssUsageDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOssUsageData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOssUsageDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>The query and aggregation granularity of bandwidth and storage usage cannot exceed one day. Data aggregation is to collect the maximum values of usage data within a period of time.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage and bandwidth usage within a specific time range.</p>
     * 
     * @param request GetOssUsageDataRequest
     * @return GetOssUsageDataResponse
     */
    public GetOssUsageDataResponse getOssUsageData(GetOssUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssUsageDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  After the key pair is imported, ENS stores the public key. You must securely store the private key.</p>
     * <ul>
     * <li>The key pair can be only in the ssh-rsa format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports the public key of a Rivest–Shamir–Adleman (RSA)-encrypted key pair that is generated by a third-party tool.</p>
     * 
     * @param request ImportKeyPairRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ImportKeyPairResponse
     */
    public ImportKeyPairResponse importKeyPairWithOptions(ImportKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKeyBody)) {
            query.put("PublicKeyBody", request.publicKeyBody);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ImportKeyPair"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ImportKeyPairResponse());
    }

    /**
     * <b>description</b> :
     * <p>  After the key pair is imported, ENS stores the public key. You must securely store the private key.</p>
     * <ul>
     * <li>The key pair can be only in the ssh-rsa format.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Imports the public key of a Rivest–Shamir–Adleman (RSA)-encrypted key pair that is generated by a third-party tool.</p>
     * 
     * @param request ImportKeyPairRequest
     * @return ImportKeyPairResponse
     */
    public ImportKeyPairResponse importKeyPair(ImportKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importKeyPairWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Assigns public IP addresses to an EPN instance.</p>
     * 
     * @param request JoinPublicIpsToEpnInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return JoinPublicIpsToEpnInstanceResponse
     */
    public JoinPublicIpsToEpnInstanceResponse joinPublicIpsToEpnInstanceWithOptions(JoinPublicIpsToEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceId)) {
            query.put("EPNInstanceId", request.EPNInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceInfos)) {
            query.put("InstanceInfos", request.instanceInfos);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinPublicIpsToEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinPublicIpsToEpnInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Assigns public IP addresses to an EPN instance.</p>
     * 
     * @param request JoinPublicIpsToEpnInstanceRequest
     * @return JoinPublicIpsToEpnInstanceResponse
     */
    public JoinPublicIpsToEpnInstanceResponse joinPublicIpsToEpnInstance(JoinPublicIpsToEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinPublicIpsToEpnInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to add an instance to a security group, make sure that the instance is in the Stopped or Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds an Edge Node Service (ENS) instance to a specified security group.</p>
     * 
     * @param request JoinSecurityGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return JoinSecurityGroupResponse
     */
    public JoinSecurityGroupResponse joinSecurityGroupWithOptions(JoinSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceId)) {
            query.put("NetworkInterfaceId", request.networkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinSecurityGroup"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinSecurityGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation to add an instance to a security group, make sure that the instance is in the Stopped or Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds an Edge Node Service (ENS) instance to a specified security group.</p>
     * 
     * @param request JoinSecurityGroupRequest
     * @return JoinSecurityGroupResponse
     */
    public JoinSecurityGroupResponse joinSecurityGroup(JoinSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinSecurityGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>For internal connections, instances that are associated with a vSwitch automatically take effect. For public connections such as intelligent acceleration, you need to manually add the instances.</p>
     * 
     * @param request JoinVSwitchesToEpnInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return JoinVSwitchesToEpnInstanceResponse
     */
    public JoinVSwitchesToEpnInstanceResponse joinVSwitchesToEpnInstanceWithOptions(JoinVSwitchesToEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceId)) {
            query.put("EPNInstanceId", request.EPNInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchesInfo)) {
            query.put("VSwitchesInfo", request.vSwitchesInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "JoinVSwitchesToEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new JoinVSwitchesToEpnInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>For internal connections, instances that are associated with a vSwitch automatically take effect. For public connections such as intelligent acceleration, you need to manually add the instances.</p>
     * 
     * @param request JoinVSwitchesToEpnInstanceRequest
     * @return JoinVSwitchesToEpnInstanceResponse
     */
    public JoinVSwitchesToEpnInstanceResponse joinVSwitchesToEpnInstance(JoinVSwitchesToEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinVSwitchesToEpnInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you remove an instance from a security group, the instance must be in the Stopped or Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes an instance from a security group.</p>
     * 
     * @param request LeaveSecurityGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LeaveSecurityGroupResponse
     */
    public LeaveSecurityGroupResponse leaveSecurityGroupWithOptions(LeaveSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceId)) {
            query.put("NetworkInterfaceId", request.networkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LeaveSecurityGroup"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LeaveSecurityGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you remove an instance from a security group, the instance must be in the Stopped or Running state.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes an instance from a security group.</p>
     * 
     * @param request LeaveSecurityGroupRequest
     * @return LeaveSecurityGroupResponse
     */
    public LeaveSecurityGroupResponse leaveSecurityGroup(LeaveSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.leaveSecurityGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the created applications.</p>
     * 
     * @param request ListApplicationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplicationsWithOptions(ListApplicationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appVersions)) {
            query.put("AppVersions", request.appVersions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterNames)) {
            query.put("ClusterNames", request.clusterNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.level)) {
            query.put("Level", request.level);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxDate)) {
            query.put("MaxDate", request.maxDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDate)) {
            query.put("MinDate", request.minDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outAppInfoParams)) {
            query.put("OutAppInfoParams", request.outAppInfoParams);
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
            new TeaPair("action", "ListApplications"),
            new TeaPair("version", "2017-11-10"),
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
     * <b>summary</b> : 
     * <p>Queries the created applications.</p>
     * 
     * @param request ListApplicationsRequest
     * @return ListApplicationsResponse
     */
    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all buckets of a user.</p>
     * 
     * @param request ListBucketsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBucketsResponse
     */
    public ListBucketsResponse listBucketsWithOptions(ListBucketsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("Prefix", request.prefix);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBuckets"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBucketsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries all buckets of a user.</p>
     * 
     * @param request ListBucketsRequest
     * @return ListBucketsResponse
     */
    public ListBucketsResponse listBuckets(ListBucketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBucketsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all objects in a bucket.</p>
     * 
     * @param request ListObjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListObjectsResponse
     */
    public ListObjectsResponse listObjectsWithOptions(ListObjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.continuationToken)) {
            query.put("ContinuationToken", request.continuationToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encodingType)) {
            query.put("EncodingType", request.encodingType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxKeys)) {
            query.put("MaxKeys", request.maxKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("Prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startAfter)) {
            query.put("StartAfter", request.startAfter);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListObjects"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListObjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all objects in a bucket.</p>
     * 
     * @param request ListObjectsRequest
     * @return ListObjectsResponse
     */
    public ListObjectsResponse listObjects(ListObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listObjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询资源标签</p>
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
            new TeaPair("version", "2017-11-10"),
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
     * <p>查询资源标签</p>
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
     * <p>Modifies the name, description, and peak bandwidth of a specified elastic IP address (EIP).</p>
     * 
     * @param request ModifyEnsEipAddressAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyEnsEipAddressAttributeResponse
     */
    public ModifyEnsEipAddressAttributeResponse modifyEnsEipAddressAttributeWithOptions(ModifyEnsEipAddressAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allocationId)) {
            query.put("AllocationId", request.allocationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEnsEipAddressAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEnsEipAddressAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the name, description, and peak bandwidth of a specified elastic IP address (EIP).</p>
     * 
     * @param request ModifyEnsEipAddressAttributeRequest
     * @return ModifyEnsEipAddressAttributeResponse
     */
    public ModifyEnsEipAddressAttributeResponse modifyEnsEipAddressAttribute(ModifyEnsEipAddressAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEnsEipAddressAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an Edge Private Network (EPN) instance.</p>
     * 
     * @param request ModifyEpnInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyEpnInstanceResponse
     */
    public ModifyEpnInstanceResponse modifyEpnInstanceWithOptions(ModifyEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceId)) {
            query.put("EPNInstanceId", request.EPNInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceName)) {
            query.put("EPNInstanceName", request.EPNInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetMaxBandwidthOut)) {
            query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkingModel)) {
            query.put("NetworkingModel", request.networkingModel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEpnInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an Edge Private Network (EPN) instance.</p>
     * 
     * @param request ModifyEpnInstanceRequest
     * @return ModifyEpnInstanceResponse
     */
    public ModifyEpnInstanceResponse modifyEpnInstance(ModifyEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEpnInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a file system.</p>
     * 
     * @param request ModifyFileSystemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyFileSystemResponse
     */
    public ModifyFileSystemResponse modifyFileSystemWithOptions(ModifyFileSystemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSystemId)) {
            query.put("FileSystemId", request.fileSystemId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyFileSystem"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyFileSystemResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a file system.</p>
     * 
     * @param request ModifyFileSystemRequest
     * @return ModifyFileSystemResponse
     */
    public ModifyFileSystemResponse modifyFileSystem(ModifyFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFileSystemWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a Destination Network Address Translation (DNAT) rule.</p>
     * 
     * @param request ModifyForwardEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyForwardEntryResponse
     */
    public ModifyForwardEntryResponse modifyForwardEntryWithOptions(ModifyForwardEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forwardEntryId)) {
            query.put("ForwardEntryId", request.forwardEntryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forwardEntryName)) {
            query.put("ForwardEntryName", request.forwardEntryName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckPort)) {
            query.put("HealthCheckPort", request.healthCheckPort);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyForwardEntry"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyForwardEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a Destination Network Address Translation (DNAT) rule.</p>
     * 
     * @param request ModifyForwardEntryRequest
     * @return ModifyForwardEntryResponse
     */
    public ModifyForwardEntryResponse modifyForwardEntry(ModifyForwardEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyForwardEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the image attributes.</p>
     * 
     * @param request ModifyImageAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyImageAttributeResponse
     */
    public ModifyImageAttributeResponse modifyImageAttributeWithOptions(ModifyImageAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyImageAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyImageAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the image attributes.</p>
     * 
     * @param request ModifyImageAttributeRequest
     * @return ModifyImageAttributeResponse
     */
    public ModifyImageAttributeResponse modifyImageAttribute(ModifyImageAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyImageAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Shares or unshares an image.</p>
     * 
     * @param request ModifyImageSharePermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyImageSharePermissionResponse
     */
    public ModifyImageSharePermissionResponse modifyImageSharePermissionWithOptions(ModifyImageSharePermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addAccounts)) {
            query.put("AddAccounts", request.addAccounts);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.removeAccounts)) {
            query.put("RemoveAccounts", request.removeAccounts);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyImageSharePermission"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyImageSharePermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Shares or unshares an image.</p>
     * 
     * @param request ModifyImageSharePermissionRequest
     * @return ModifyImageSharePermissionResponse
     */
    public ModifyImageSharePermissionResponse modifyImageSharePermission(ModifyImageSharePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyImageSharePermissionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  If an instance is in the Starting state, you cannot reset the password of the instance.</p>
     * <ul>
     * <li>When the instance is in the Running state, you cannot change the password of the instance.</li>
     * <li>After resetting the password, you must Restart the instance in the ECS console or call the RebootInstance operation to validate the modifications. The restart operation within the instance does not validate the modifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the attributes of an instance, such as the name and the password.</p>
     * 
     * @param request ModifyInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceAttributeResponse
     */
    public ModifyInstanceAttributeResponse modifyInstanceAttributeWithOptions(ModifyInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  If an instance is in the Starting state, you cannot reset the password of the instance.</p>
     * <ul>
     * <li>When the instance is in the Running state, you cannot change the password of the instance.</li>
     * <li>After resetting the password, you must Restart the instance in the ECS console or call the RebootInstance operation to validate the modifications. The restart operation within the instance does not validate the modifications.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the attributes of an instance, such as the name and the password.</p>
     * 
     * @param request ModifyInstanceAttributeRequest
     * @return ModifyInstanceAttributeResponse
     */
    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures auto-renewal for instances.</p>
     * 
     * @param request ModifyInstanceAutoRenewAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceAutoRenewAttributeResponse
     */
    public ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttributeWithOptions(ModifyInstanceAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.renewalStatus)) {
            query.put("RenewalStatus", request.renewalStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceAutoRenewAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceAutoRenewAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures auto-renewal for instances.</p>
     * 
     * @param request ModifyInstanceAutoRenewAttributeRequest
     * @return ModifyInstanceAutoRenewAttributeResponse
     */
    public ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and pricing of ENS.
     * The instances must be in the Running or Stopped state, and you have no overdue payments for them.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the billing method of Edge Node Service (ENS) instances. You can switch between the pay-as-you-go and subscription billing methods for instances. You can also change the billing method for disks that you created with pay-as-you-go instances to subscription.</p>
     * 
     * @param tmpReq ModifyInstanceChargeTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceChargeTypeResponse
     */
    public ModifyInstanceChargeTypeResponse modifyInstanceChargeTypeWithOptions(ModifyInstanceChargeTypeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyInstanceChargeTypeShrinkRequest request = new ModifyInstanceChargeTypeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoPay)) {
            query.put("AutoPay", request.autoPay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeDataDisks)) {
            query.put("IncludeDataDisks", request.includeDataDisks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstanceChargeType"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceChargeTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>Before you call this operation, make sure that you fully understand the billing methods and pricing of ENS.
     * The instances must be in the Running or Stopped state, and you have no overdue payments for them.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the billing method of Edge Node Service (ENS) instances. You can switch between the pay-as-you-go and subscription billing methods for instances. You can also change the billing method for disks that you created with pay-as-you-go instances to subscription.</p>
     * 
     * @param request ModifyInstanceChargeTypeRequest
     * @return ModifyInstanceChargeTypeResponse
     */
    public ModifyInstanceChargeTypeResponse modifyInstanceChargeType(ModifyInstanceChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceChargeTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about an Edge Load Balancer (ELB) instance.</p>
     * 
     * @param request ModifyLoadBalancerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLoadBalancerAttributeResponse
     */
    public ModifyLoadBalancerAttributeResponse modifyLoadBalancerAttributeWithOptions(ModifyLoadBalancerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerName)) {
            query.put("LoadBalancerName", request.loadBalancerName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLoadBalancerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLoadBalancerAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about an Edge Load Balancer (ELB) instance.</p>
     * 
     * @param request ModifyLoadBalancerAttributeRequest
     * @return ModifyLoadBalancerAttributeResponse
     */
    public ModifyLoadBalancerAttributeResponse modifyLoadBalancerAttribute(ModifyLoadBalancerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLoadBalancerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the network information.</p>
     * 
     * @param request ModifyNetworkAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyNetworkAttributeResponse
     */
    public ModifyNetworkAttributeResponse modifyNetworkAttributeWithOptions(ModifyNetworkAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkId)) {
            query.put("NetworkId", request.networkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkName)) {
            query.put("NetworkName", request.networkName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyNetworkAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyNetworkAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the network information.</p>
     * 
     * @param request ModifyNetworkAttributeRequest
     * @return ModifyNetworkAttributeResponse
     */
    public ModifyNetworkAttributeResponse modifyNetworkAttribute(ModifyNetworkAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNetworkAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades or downgrades the instance type of a subscription Edge Node Service (ENS) instance. The new instance type takes effect for the remaining lifecycle of the instance.</p>
     * 
     * @param request ModifyPrepayInstanceSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPrepayInstanceSpecResponse
     */
    public ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpecWithOptions(ModifyPrepayInstanceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPrepayInstanceSpec"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPrepayInstanceSpecResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades or downgrades the instance type of a subscription Edge Node Service (ENS) instance. The new instance type takes effect for the remaining lifecycle of the instance.</p>
     * 
     * @param request ModifyPrepayInstanceSpecRequest
     * @return ModifyPrepayInstanceSpecResponse
     */
    public ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPrepayInstanceSpecWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about a security group.</p>
     * 
     * @param request ModifySecurityGroupAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySecurityGroupAttributeResponse
     */
    public ModifySecurityGroupAttributeResponse modifySecurityGroupAttributeWithOptions(ModifySecurityGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupName)) {
            query.put("SecurityGroupName", request.securityGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecurityGroupAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecurityGroupAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the information about a security group.</p>
     * 
     * @param request ModifySecurityGroupAttributeRequest
     * @return ModifySecurityGroupAttributeResponse
     */
    public ModifySecurityGroupAttributeResponse modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityGroupAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about a snapshot.</p>
     * 
     * @param request ModifySnapshotAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySnapshotAttributeResponse
     */
    public ModifySnapshotAttributeResponse modifySnapshotAttributeWithOptions(ModifySnapshotAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotName)) {
            query.put("SnapshotName", request.snapshotName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySnapshotAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySnapshotAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about a snapshot.</p>
     * 
     * @param request ModifySnapshotAttributeRequest
     * @return ModifySnapshotAttributeResponse
     */
    public ModifySnapshotAttributeResponse modifySnapshotAttribute(ModifySnapshotAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySnapshotAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies information about a vSwitch.</p>
     * 
     * @param request ModifyVSwitchAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVSwitchAttributeResponse
     */
    public ModifyVSwitchAttributeResponse modifyVSwitchAttributeWithOptions(ModifyVSwitchAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchName)) {
            query.put("VSwitchName", request.vSwitchName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVSwitchAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVSwitchAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 5 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies information about a vSwitch.</p>
     * 
     * @param request ModifyVSwitchAttributeRequest
     * @return ModifyVSwitchAttributeResponse
     */
    public ModifyVSwitchAttributeResponse modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVSwitchAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>节点及AIC的命名空间粒度预热SDG</p>
     * 
     * @param tmpReq PreloadRegionSDGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreloadRegionSDGResponse
     */
    public PreloadRegionSDGResponse preloadRegionSDGWithOptions(PreloadRegionSDGRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        PreloadRegionSDGShrinkRequest request = new PreloadRegionSDGShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.destinationRegionIds)) {
            request.destinationRegionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.destinationRegionIds, "DestinationRegionIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.namespaces)) {
            request.namespacesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.namespaces, "Namespaces", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegionIdsShrink)) {
            query.put("DestinationRegionIds", request.destinationRegionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacesShrink)) {
            query.put("Namespaces", request.namespacesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.redundantNum)) {
            query.put("RedundantNum", request.redundantNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SDGId)) {
            query.put("SDGId", request.SDGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreloadRegionSDG"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreloadRegionSDGResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>节点及AIC的命名空间粒度预热SDG</p>
     * 
     * @param request PreloadRegionSDGRequest
     * @return PreloadRegionSDGResponse
     */
    public PreloadRegionSDGResponse preloadRegionSDG(PreloadRegionSDGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preloadRegionSDGWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Pushes the business or service data of an application to file servers.</p>
     * 
     * @param request PushApplicationDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PushApplicationDataResponse
     */
    public PushApplicationDataResponse pushApplicationDataWithOptions(PushApplicationDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            query.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pushStrategy)) {
            query.put("PushStrategy", request.pushStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PushApplicationData"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PushApplicationDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Pushes the business or service data of an application to file servers.</p>
     * 
     * @param request PushApplicationDataRequest
     * @return PushApplicationDataResponse
     */
    public PushApplicationDataResponse pushApplicationData(PushApplicationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushApplicationDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an EOS bucket.</p>
     * 
     * @param request PutBucketRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutBucketResponse
     */
    public PutBucketResponse putBucketWithOptions(PutBucketRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketAcl)) {
            body.put("BucketAcl", request.bucketAcl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            body.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            body.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dispatchScope)) {
            body.put("DispatchScope", request.dispatchScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            body.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicalBucketType)) {
            body.put("LogicalBucketType", request.logicalBucketType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucket"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutBucketResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an EOS bucket.</p>
     * 
     * @param request PutBucketRequest
     * @return PutBucketResponse
     */
    public PutBucketResponse putBucket(PutBucketRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putBucketWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the access control list (ACL) of a bucket.</p>
     * 
     * @param request PutBucketAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutBucketAclResponse
     */
    public PutBucketAclResponse putBucketAclWithOptions(PutBucketAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bucketAcl)) {
            query.put("BucketAcl", request.bucketAcl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketAcl"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutBucketAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the access control list (ACL) of a bucket.</p>
     * 
     * @param request PutBucketAclRequest
     * @return PutBucketAclResponse
     */
    public PutBucketAclResponse putBucketAcl(PutBucketAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putBucketAclWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can configure up to 1,000 rules.</p>
     * <ul>
     * <li>If an object meets multiple rules, the rule that has the earliest expiration time prevails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures lifecycle rules for objects.</p>
     * 
     * @param request PutBucketLifecycleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutBucketLifecycleResponse
     */
    public PutBucketLifecycleResponse putBucketLifecycleWithOptions(PutBucketLifecycleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowSameActionOverlap)) {
            query.put("AllowSameActionOverlap", request.allowSameActionOverlap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bucketName)) {
            query.put("BucketName", request.bucketName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createdBeforeDate)) {
            query.put("CreatedBeforeDate", request.createdBeforeDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expirationDays)) {
            query.put("ExpirationDays", request.expirationDays);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prefix)) {
            query.put("Prefix", request.prefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutBucketLifecycle"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutBucketLifecycleResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can configure up to 1,000 rules.</p>
     * <ul>
     * <li>If an object meets multiple rules, the rule that has the earliest expiration time prevails.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Configures lifecycle rules for objects.</p>
     * 
     * @param request PutBucketLifecycleRequest
     * @return PutBucketLifecycleResponse
     */
    public PutBucketLifecycleResponse putBucketLifecycle(PutBucketLifecycleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putBucketLifecycleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Initializes a disk.</p>
     * 
     * @param request ReInitDiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReInitDiskResponse
     */
    public ReInitDiskResponse reInitDiskWithOptions(ReInitDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReInitDisk"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReInitDiskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Initializes a disk.</p>
     * 
     * @param request ReInitDiskRequest
     * @return ReInitDiskResponse
     */
    public ReInitDiskResponse reInitDisk(ReInitDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reInitDiskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts an Android in Container (AIC) instance.</p>
     * 
     * @param tmpReq RebootAICInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootAICInstanceResponse
     */
    public RebootAICInstanceResponse rebootAICInstanceWithOptions(RebootAICInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RebootAICInstanceShrinkRequest request = new RebootAICInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootAICInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootAICInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts an Android in Container (AIC) instance.</p>
     * 
     * @param request RebootAICInstanceRequest
     * @return RebootAICInstanceResponse
     */
    public RebootAICInstanceResponse rebootAICInstance(RebootAICInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootAICInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Reboots an Android in Container (AIC) server.</p>
     * 
     * @param request RebootARMServerInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootARMServerInstanceResponse
     */
    public RebootARMServerInstanceResponse rebootARMServerInstanceWithOptions(RebootARMServerInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootARMServerInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootARMServerInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Reboots an Android in Container (AIC) server.</p>
     * 
     * @param request RebootARMServerInstanceRequest
     * @return RebootARMServerInstanceResponse
     */
    public RebootARMServerInstanceResponse rebootARMServerInstance(RebootARMServerInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootARMServerInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Only instances that are in the Running state can be restarted.</p>
     * <ul>
     * <li>If the operation is successful, the status of the instance becomes Starting.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reboots an instance.</p>
     * 
     * @param request RebootInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootInstanceResponse
     */
    public RebootInstanceResponse rebootInstanceWithOptions(RebootInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceStop)) {
            query.put("ForceStop", request.forceStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Only instances that are in the Running state can be restarted.</p>
     * <ul>
     * <li>If the operation is successful, the status of the instance becomes Starting.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Reboots an instance.</p>
     * 
     * @param request RebootInstanceRequest
     * @return RebootInstanceResponse
     */
    public RebootInstanceResponse rebootInstance(RebootInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>选择批量实例进行重启操作</p>
     * 
     * @param tmpReq RebootInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebootInstancesResponse
     */
    public RebootInstancesResponse rebootInstancesWithOptions(RebootInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RebootInstancesShrinkRequest request = new RebootInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebootInstances"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebootInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>选择批量实例进行重启操作</p>
     * 
     * @param request RebootInstancesRequest
     * @return RebootInstancesResponse
     */
    public RebootInstancesResponse rebootInstances(RebootInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Recovers an Android in Container (AIC) instance on the server.</p>
     * 
     * @param request RecoverAICInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RecoverAICInstanceResponse
     */
    public RecoverAICInstanceResponse recoverAICInstanceWithOptions(RecoverAICInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RecoverAICInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RecoverAICInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Recovers an Android in Container (AIC) instance on the server.</p>
     * 
     * @param request RecoverAICInstanceRequest
     * @return RecoverAICInstanceResponse
     */
    public RecoverAICInstanceResponse recoverAICInstance(RecoverAICInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recoverAICInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets an instance based on specific parameters.</p>
     * 
     * @param request ReinitInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReinitInstanceResponse
     */
    public ReinitInstanceResponse reinitInstanceWithOptions(ReinitInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            body.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReinitInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReinitInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets an instance based on specific parameters.</p>
     * 
     * @param request ReinitInstanceRequest
     * @return ReinitInstanceResponse
     */
    public ReinitInstanceResponse reinitInstance(ReinitInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reinitInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>选择批量实例进行重置操作</p>
     * 
     * @param tmpReq ReinitInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReinitInstancesResponse
     */
    public ReinitInstancesResponse reinitInstancesWithOptions(ReinitInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ReinitInstancesShrinkRequest request = new ReinitInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReinitInstances"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReinitInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>选择批量实例进行重置操作</p>
     * 
     * @param request ReinitInstancesRequest
     * @return ReinitInstancesResponse
     */
    public ReinitInstancesResponse reinitInstances(ReinitInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reinitInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases an Android in Container (AIC) instance from the server.</p>
     * 
     * @param request ReleaseAICInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseAICInstanceResponse
     */
    public ReleaseAICInstanceResponse releaseAICInstanceWithOptions(ReleaseAICInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serverId)) {
            query.put("ServerId", request.serverId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseAICInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseAICInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases an Android in Container (AIC) instance from the server.</p>
     * 
     * @param request ReleaseAICInstanceRequest
     * @return ReleaseAICInstanceResponse
     */
    public ReleaseAICInstanceResponse releaseAICInstance(ReleaseAICInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseAICInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases an ARM server.</p>
     * 
     * @param request ReleaseARMServerInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseARMServerInstanceResponse
     */
    public ReleaseARMServerInstanceResponse releaseARMServerInstanceWithOptions(ReleaseARMServerInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseARMServerInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseARMServerInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases an ARM server.</p>
     * 
     * @param request ReleaseARMServerInstanceRequest
     * @return ReleaseARMServerInstanceResponse
     */
    public ReleaseARMServerInstanceResponse releaseARMServerInstance(ReleaseARMServerInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseARMServerInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10,000 times per second per account.</p>
     * <ul>
     * <li>The maximum number of times that each user can call this operation per second is 50.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Releases an instance.</p>
     * 
     * @param request ReleaseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstanceWithOptions(ReleaseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 10,000 times per second per account.</p>
     * <ul>
     * <li>The maximum number of times that each user can call this operation per second is 50.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Releases an instance.</p>
     * 
     * @param request ReleaseInstanceRequest
     * @return ReleaseInstanceResponse
     */
    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a pay-as-you-go instance.</p>
     * 
     * @param request ReleasePostPaidInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleasePostPaidInstanceResponse
     */
    public ReleasePostPaidInstanceResponse releasePostPaidInstanceWithOptions(ReleasePostPaidInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleasePostPaidInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleasePostPaidInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a pay-as-you-go instance.</p>
     * 
     * @param request ReleasePostPaidInstanceRequest
     * @return ReleasePostPaidInstanceResponse
     */
    public ReleasePostPaidInstanceResponse releasePostPaidInstance(ReleasePostPaidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releasePostPaidInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Call ReleasePrePaidInstance to delete a subscription instance.</p>
     * 
     * @param request ReleasePrePaidInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleasePrePaidInstanceResponse
     */
    public ReleasePrePaidInstanceResponse releasePrePaidInstanceWithOptions(ReleasePrePaidInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleasePrePaidInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleasePrePaidInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Call ReleasePrePaidInstance to delete a subscription instance.</p>
     * 
     * @param request ReleasePrePaidInstanceRequest
     * @return ReleasePrePaidInstanceResponse
     */
    public ReleasePrePaidInstanceResponse releasePrePaidInstance(ReleasePrePaidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releasePrePaidInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes backend servers.</p>
     * 
     * @param tmpReq RemoveBackendServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveBackendServersResponse
     */
    public RemoveBackendServersResponse removeBackendServersWithOptions(RemoveBackendServersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveBackendServersShrinkRequest request = new RemoveBackendServersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.backendServers)) {
            request.backendServersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.backendServers, "BackendServers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendServersShrink)) {
            query.put("BackendServers", request.backendServersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveBackendServers"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveBackendServersResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Removes backend servers.</p>
     * 
     * @param request RemoveBackendServersRequest
     * @return RemoveBackendServersResponse
     */
    public RemoveBackendServersResponse removeBackendServers(RemoveBackendServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeBackendServersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>移除计算实例上已挂载的SDG</p>
     * 
     * @param tmpReq RemoveInstanceSDGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveInstanceSDGResponse
     */
    public RemoveInstanceSDGResponse removeInstanceSDGWithOptions(RemoveInstanceSDGRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveInstanceSDGShrinkRequest request = new RemoveInstanceSDGShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveInstanceSDG"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveInstanceSDGResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>移除计算实例上已挂载的SDG</p>
     * 
     * @param request RemoveInstanceSDGRequest
     * @return RemoveInstanceSDGResponse
     */
    public RemoveInstanceSDGResponse removeInstanceSDG(RemoveInstanceSDGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeInstanceSDGWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes IP addresses from an edge private network (EPN) instance.</p>
     * 
     * @param request RemovePublicIpsFromEpnInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemovePublicIpsFromEpnInstanceResponse
     */
    public RemovePublicIpsFromEpnInstanceResponse removePublicIpsFromEpnInstanceWithOptions(RemovePublicIpsFromEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceId)) {
            query.put("EPNInstanceId", request.EPNInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceInfos)) {
            query.put("InstanceInfos", request.instanceInfos);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemovePublicIpsFromEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemovePublicIpsFromEpnInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes IP addresses from an edge private network (EPN) instance.</p>
     * 
     * @param request RemovePublicIpsFromEpnInstanceRequest
     * @return RemovePublicIpsFromEpnInstanceResponse
     */
    public RemovePublicIpsFromEpnInstanceResponse removePublicIpsFromEpnInstance(RemovePublicIpsFromEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePublicIpsFromEpnInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes shared data groups (SDGs) that are deployed on instances.</p>
     * 
     * @param tmpReq RemoveSDGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveSDGResponse
     */
    public RemoveSDGResponse removeSDGWithOptions(RemoveSDGRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RemoveSDGShrinkRequest request = new RemoveSDGShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveSDG"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveSDGResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes shared data groups (SDGs) that are deployed on instances.</p>
     * 
     * @param request RemoveSDGRequest
     * @return RemoveSDGResponse
     */
    public RemoveSDGResponse removeSDG(RemoveSDGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeSDGWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the networking information. This operation is applicable only for instances that reside in the internal network.</p>
     * 
     * @param request RemoveVSwitchesFromEpnInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveVSwitchesFromEpnInstanceResponse
     */
    public RemoveVSwitchesFromEpnInstanceResponse removeVSwitchesFromEpnInstanceWithOptions(RemoveVSwitchesFromEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceId)) {
            query.put("EPNInstanceId", request.EPNInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchesInfo)) {
            query.put("VSwitchesInfo", request.vSwitchesInfo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveVSwitchesFromEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveVSwitchesFromEpnInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes the networking information. This operation is applicable only for instances that reside in the internal network.</p>
     * 
     * @param request RemoveVSwitchesFromEpnInstanceRequest
     * @return RemoveVSwitchesFromEpnInstanceResponse
     */
    public RemoveVSwitchesFromEpnInstanceResponse removeVSwitchesFromEpnInstance(RemoveVSwitchesFromEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeVSwitchesFromEpnInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a subscription Android in Container (AIC) instance.</p>
     * 
     * @param request RenewARMServerInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewARMServerInstanceResponse
     */
    public RenewARMServerInstanceResponse renewARMServerInstanceWithOptions(RenewARMServerInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewARMServerInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewARMServerInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a subscription Android in Container (AIC) instance.</p>
     * 
     * @param request RenewARMServerInstanceRequest
     * @return RenewARMServerInstanceResponse
     */
    public RenewARMServerInstanceResponse renewARMServerInstance(RenewARMServerInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewARMServerInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a subscription instance.</p>
     * 
     * @param request RenewInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstanceWithOptions(RenewInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Renews a subscription instance.</p>
     * 
     * @param request RenewInstanceRequest
     * @return RenewInstanceResponse
     */
    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Scales resources in an asynchronous manner and deploys or releases the container.</p>
     * 
     * @param request RescaleApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RescaleApplicationResponse
     */
    public RescaleApplicationResponse rescaleApplicationWithOptions(RescaleApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rescaleLevel)) {
            query.put("RescaleLevel", request.rescaleLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rescaleType)) {
            query.put("RescaleType", request.rescaleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSelector)) {
            query.put("ResourceSelector", request.resourceSelector);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toAppVersion)) {
            query.put("ToAppVersion", request.toAppVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RescaleApplication"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RescaleApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Scales resources in an asynchronous manner and deploys or releases the container.</p>
     * 
     * @param request RescaleApplicationRequest
     * @return RescaleApplicationResponse
     */
    public RescaleApplicationResponse rescaleApplication(RescaleApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rescaleApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Scales out a bare metal device.</p>
     * 
     * @param request RescaleDeviceServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RescaleDeviceServiceResponse
     */
    public RescaleDeviceServiceResponse rescaleDeviceServiceWithOptions(RescaleDeviceServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipType)) {
            query.put("IpType", request.ipType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rescaleLevel)) {
            query.put("RescaleLevel", request.rescaleLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rescaleType)) {
            query.put("RescaleType", request.rescaleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSpec)) {
            query.put("ResourceSpec", request.resourceSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceInfo)) {
            body.put("ResourceInfo", request.resourceInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceSelector)) {
            body.put("ResourceSelector", request.resourceSelector);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RescaleDeviceService"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RescaleDeviceServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Scales out a bare metal device.</p>
     * 
     * @param request RescaleDeviceServiceRequest
     * @return RescaleDeviceServiceResponse
     */
    public RescaleDeviceServiceResponse rescaleDeviceService(RescaleDeviceServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rescaleDeviceServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets an Android in Container (AIC) instance.</p>
     * 
     * @param request ResetAICInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAICInstanceResponse
     */
    public ResetAICInstanceResponse resetAICInstanceWithOptions(ResetAICInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAICInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAICInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets an Android in Container (AIC) instance.</p>
     * 
     * @param request ResetAICInstanceRequest
     * @return ResetAICInstanceResponse
     */
    public ResetAICInstanceResponse resetAICInstance(ResetAICInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAICInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets an instance including its image.</p>
     * 
     * @param request ResetDeviceInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetDeviceInstanceResponse
     */
    public ResetDeviceInstanceResponse resetDeviceInstanceWithOptions(ResetDeviceInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetDeviceInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetDeviceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets an instance including its image.</p>
     * 
     * @param request ResetDeviceInstanceRequest
     * @return ResetDeviceInstanceResponse
     */
    public ResetDeviceInstanceResponse resetDeviceInstance(ResetDeviceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetDeviceInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The disk must be in the In Use (In_Use) or Unattached (Available) state.</li>
     * <li>The instance to which the disk is attached must be in the Stopped (Stopped) state. You can call the <strong>StopInstance</strong> operation to stop an instance.</li>
     * <li>The snapshot specified by the SnapshotId parameter must be created from the disk specified by the DiskId parameter.</li>
     * <li>When you call the <strong>DescribeInstance</strong> operation to query instance information, if the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code> for an instance, the instance is locked for security reasons and you cannot perform operations on the instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rolls back a disk by using a snapshot.</p>
     * 
     * @param request ResetDiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetDiskResponse
     */
    public ResetDiskResponse resetDiskWithOptions(ResetDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snapshotId)) {
            query.put("SnapshotId", request.snapshotId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetDisk"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetDiskResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation, take note of the following items:</p>
     * <ul>
     * <li>The disk must be in the In Use (In_Use) or Unattached (Available) state.</li>
     * <li>The instance to which the disk is attached must be in the Stopped (Stopped) state. You can call the <strong>StopInstance</strong> operation to stop an instance.</li>
     * <li>The snapshot specified by the SnapshotId parameter must be created from the disk specified by the DiskId parameter.</li>
     * <li>When you call the <strong>DescribeInstance</strong> operation to query instance information, if the response contains <code>{&quot;OperationLocks&quot;: {&quot;LockReason&quot; : &quot;security&quot;}}</code> for an instance, the instance is locked for security reasons and you cannot perform operations on the instance.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Rolls back a disk by using a snapshot.</p>
     * 
     * @param request ResetDiskRequest
     * @return ResetDiskResponse
     */
    public ResetDiskResponse resetDisk(ResetDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetDiskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resizes a pay-as-you-go disk that you purchase.</p>
     * 
     * @param request ResizeDiskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResizeDiskResponse
     */
    public ResizeDiskResponse resizeDiskWithOptions(ResizeDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newSize)) {
            query.put("NewSize", request.newSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResizeDisk"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResizeDiskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resizes a pay-as-you-go disk that you purchase.</p>
     * 
     * @param request ResizeDiskRequest
     * @return ResizeDiskResponse
     */
    public ResizeDiskResponse resizeDisk(ResizeDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resizeDiskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts applications deployed on an instance and returns the restart results in a synchronous manner.</p>
     * 
     * @param request RestartDeviceInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartDeviceInstanceResponse
     */
    public RestartDeviceInstanceResponse restartDeviceInstanceWithOptions(RestartDeviceInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartDeviceInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartDeviceInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Restarts applications deployed on an instance and returns the restart results in a synchronous manner.</p>
     * 
     * @param request RestartDeviceInstanceRequest
     * @return RestartDeviceInstanceResponse
     */
    public RestartDeviceInstanceResponse restartDeviceInstance(RestartDeviceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDeviceInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  In the security group-related API documents, inbound traffic refers to the traffic sent by the source and received by the destination.</p>
     * <ul>
     * <li>You can determine an inbound security group rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.</li>
     * <li>You can specify one or more of the following parameters to remove access control for a CIDR block: IpProtocol, PortRange, Policy, and SourceCidrIp.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an inbound security group rule. After the rule is deleted, the access control implemented by the rule is removed.</p>
     * 
     * @param request RevokeSecurityGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeSecurityGroupResponse
     */
    public RevokeSecurityGroupResponse revokeSecurityGroupWithOptions(RevokeSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipProtocol)) {
            query.put("IpProtocol", request.ipProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRange)) {
            query.put("PortRange", request.portRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidrIp)) {
            query.put("SourceCidrIp", request.sourceCidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePortRange)) {
            query.put("SourcePortRange", request.sourcePortRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeSecurityGroup"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeSecurityGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>  In the security group-related API documents, inbound traffic refers to the traffic sent by the source and received by the destination.</p>
     * <ul>
     * <li>You can determine an inbound security group rule by specifying one of the following groups of parameters. You cannot determine a security group rule by specifying only one parameter.</li>
     * <li>You can specify one or more of the following parameters to remove access control for a CIDR block: IpProtocol, PortRange, Policy, and SourceCidrIp.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an inbound security group rule. After the rule is deleted, the access control implemented by the rule is removed.</p>
     * 
     * @param request RevokeSecurityGroupRequest
     * @return RevokeSecurityGroupResponse
     */
    public RevokeSecurityGroupResponse revokeSecurityGroup(RevokeSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeSecurityGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> In the security group-related API documents, outbound traffic refers to the traffic sent by the source and received by the destination.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes an outbound security group rule. After the rule is deleted, the access control implemented by the rule is removed.</p>
     * 
     * @param request RevokeSecurityGroupEgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeSecurityGroupEgressResponse
     */
    public RevokeSecurityGroupEgressResponse revokeSecurityGroupEgressWithOptions(RevokeSecurityGroupEgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destCidrIp)) {
            query.put("DestCidrIp", request.destCidrIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipProtocol)) {
            query.put("IpProtocol", request.ipProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portRange)) {
            query.put("PortRange", request.portRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourcePortRange)) {
            query.put("SourcePortRange", request.sourcePortRange);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeSecurityGroupEgress"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeSecurityGroupEgressResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> In the security group-related API documents, outbound traffic refers to the traffic sent by the source and received by the destination.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deletes an outbound security group rule. After the rule is deleted, the access control implemented by the rule is removed.</p>
     * 
     * @param request RevokeSecurityGroupEgressRequest
     * @return RevokeSecurityGroupEgressResponse
     */
    public RevokeSecurityGroupEgressResponse revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeSecurityGroupEgressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Rolls back the container version of a specific application.</p>
     * 
     * @param request RollbackApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RollbackApplicationResponse
     */
    public RollbackApplicationResponse rollbackApplicationWithOptions(RollbackApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromAppVersion)) {
            query.put("FromAppVersion", request.fromAppVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toAppVersion)) {
            query.put("ToAppVersion", request.toAppVersion);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RollbackApplication"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RollbackApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Rolls back the container version of a specific application.</p>
     * 
     * @param request RollbackApplicationRequest
     * @return RollbackApplicationResponse
     */
    public RollbackApplicationResponse rollbackApplication(RollbackApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackApplicationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates one or more pay-as-you-go or subscription Edge Node Service (ENS) instances.</p>
     * 
     * @param tmpReq RunInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunInstancesResponse
     */
    public RunInstancesResponse runInstancesWithOptions(RunInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RunInstancesShrinkRequest request = new RunInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dataDisk)) {
            request.dataDiskShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dataDisk, "DataDisk", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.systemDisk)) {
            request.systemDiskShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.systemDisk, "SystemDisk", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoReleaseTime)) {
            query.put("AutoReleaseTime", request.autoReleaseTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoUseCoupon)) {
            query.put("AutoUseCoupon", request.autoUseCoupon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.billingCycle)) {
            query.put("BillingCycle", request.billingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.carrier)) {
            query.put("Carrier", request.carrier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataDiskShrink)) {
            query.put("DataDisk", request.dataDiskShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeStrategy)) {
            query.put("InstanceChargeStrategy", request.instanceChargeStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            query.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetChargeType)) {
            query.put("InternetChargeType", request.internetChargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.internetMaxBandwidthOut)) {
            query.put("InternetMaxBandwidthOut", request.internetMaxBandwidthOut);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipType)) {
            query.put("IpType", request.ipType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netDistrictCode)) {
            query.put("NetDistrictCode", request.netDistrictCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netWorkId)) {
            query.put("NetWorkId", request.netWorkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.passwordInherit)) {
            query.put("PasswordInherit", request.passwordInherit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.periodUnit)) {
            query.put("PeriodUnit", request.periodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicIpIdentification)) {
            query.put("PublicIpIdentification", request.publicIpIdentification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleAreaLevel)) {
            query.put("ScheduleAreaLevel", request.scheduleAreaLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulingPriceStrategy)) {
            query.put("SchedulingPriceStrategy", request.schedulingPriceStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulingStrategy)) {
            query.put("SchedulingStrategy", request.schedulingStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityId)) {
            query.put("SecurityId", request.securityId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spotStrategy)) {
            query.put("SpotStrategy", request.spotStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskShrink)) {
            query.put("SystemDisk", request.systemDiskShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueSuffix)) {
            query.put("UniqueSuffix", request.uniqueSuffix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userData)) {
            query.put("UserData", request.userData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunInstances"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates one or more pay-as-you-go or subscription Edge Node Service (ENS) instances.</p>
     * 
     * @param request RunInstancesRequest
     * @return RunInstancesResponse
     */
    public RunInstancesResponse runInstances(RunInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Schedules the nearest idle resources including instances and pods for your device based on the user ID and IP address and initializes the virtual environment.</p>
     * 
     * @param request RunServiceScheduleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunServiceScheduleResponse
     */
    public RunServiceScheduleResponse runServiceScheduleWithOptions(RunServiceScheduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.directorys)) {
            query.put("Directorys", request.directorys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.podConfigName)) {
            query.put("PodConfigName", request.podConfigName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preLockedTimeout)) {
            query.put("PreLockedTimeout", request.preLockedTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleStrategy)) {
            query.put("ScheduleStrategy", request.scheduleStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceAction)) {
            query.put("ServiceAction", request.serviceAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceCommands)) {
            query.put("ServiceCommands", request.serviceCommands);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuid)) {
            query.put("Uuid", request.uuid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunServiceSchedule"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunServiceScheduleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Schedules the nearest idle resources including instances and pods for your device based on the user ID and IP address and initializes the virtual environment.</p>
     * 
     * @param request RunServiceScheduleRequest
     * @return RunServiceScheduleResponse
     */
    public RunServiceScheduleResponse runServiceSchedule(RunServiceScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runServiceScheduleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Saves the disk of a specific device as a shared data group (SDG).</p>
     * 
     * @param request SaveSDGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SaveSDGResponse
     */
    public SaveSDGResponse saveSDGWithOptions(SaveSDGRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SaveSDG"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SaveSDGResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Saves the disk of a specific device as a shared data group (SDG).</p>
     * 
     * @param request SaveSDGRequest
     * @return SaveSDGResponse
     */
    public SaveSDGResponse saveSDG(SaveSDGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.saveSDGWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the weights of backend servers.</p>
     * 
     * @param tmpReq SetBackendServersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetBackendServersResponse
     */
    public SetBackendServersResponse setBackendServersWithOptions(SetBackendServersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetBackendServersShrinkRequest request = new SetBackendServersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.backendServers)) {
            request.backendServersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.backendServers, "BackendServers", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backendServersShrink)) {
            query.put("BackendServers", request.backendServersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetBackendServers"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetBackendServersResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per account.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Sets the weights of backend servers.</p>
     * 
     * @param request SetBackendServersRequest
     * @return SetBackendServersResponse
     */
    public SetBackendServersResponse setBackendServers(SetBackendServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setBackendServersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of an HTTP listener.</p>
     * 
     * @param request SetLoadBalancerHTTPListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoadBalancerHTTPListenerAttributeResponse
     */
    public SetLoadBalancerHTTPListenerAttributeResponse setLoadBalancerHTTPListenerAttributeWithOptions(SetLoadBalancerHTTPListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheck)) {
            query.put("HealthCheck", request.healthCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckDomain)) {
            query.put("HealthCheckDomain", request.healthCheckDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckMethod)) {
            query.put("HealthCheckMethod", request.healthCheckMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTimeout)) {
            query.put("HealthCheckTimeout", request.healthCheckTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            query.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            query.put("IdleTimeout", request.idleTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestTimeout)) {
            query.put("RequestTimeout", request.requestTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.XForwardedFor)) {
            query.put("XForwardedFor", request.XForwardedFor);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoadBalancerHTTPListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerHTTPListenerAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of an HTTP listener.</p>
     * 
     * @param request SetLoadBalancerHTTPListenerAttributeRequest
     * @return SetLoadBalancerHTTPListenerAttributeResponse
     */
    public SetLoadBalancerHTTPListenerAttributeResponse setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerHTTPListenerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of an HTTPS listener.</p>
     * 
     * @param request SetLoadBalancerHTTPSListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoadBalancerHTTPSListenerAttributeResponse
     */
    public SetLoadBalancerHTTPSListenerAttributeResponse setLoadBalancerHTTPSListenerAttributeWithOptions(SetLoadBalancerHTTPSListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheck)) {
            query.put("HealthCheck", request.healthCheck);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckDomain)) {
            query.put("HealthCheckDomain", request.healthCheckDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckMethod)) {
            query.put("HealthCheckMethod", request.healthCheckMethod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckTimeout)) {
            query.put("HealthCheckTimeout", request.healthCheckTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            query.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTimeout)) {
            query.put("IdleTimeout", request.idleTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.requestTimeout)) {
            query.put("RequestTimeout", request.requestTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverCertificateId)) {
            query.put("ServerCertificateId", request.serverCertificateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoadBalancerHTTPSListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerHTTPSListenerAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of an HTTPS listener.</p>
     * 
     * @param request SetLoadBalancerHTTPSListenerAttributeRequest
     * @return SetLoadBalancerHTTPSListenerAttributeResponse
     */
    public SetLoadBalancerHTTPSListenerAttributeResponse setLoadBalancerHTTPSListenerAttribute(SetLoadBalancerHTTPSListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerHTTPSListenerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the status of an Edge Load Balancer (ELB) instance.</p>
     * 
     * @param request SetLoadBalancerStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoadBalancerStatusResponse
     */
    public SetLoadBalancerStatusResponse setLoadBalancerStatusWithOptions(SetLoadBalancerStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerStatus)) {
            query.put("LoadBalancerStatus", request.loadBalancerStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoadBalancerStatus"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the status of an Edge Load Balancer (ELB) instance.</p>
     * 
     * @param request SetLoadBalancerStatusRequest
     * @return SetLoadBalancerStatusResponse
     */
    public SetLoadBalancerStatusResponse setLoadBalancerStatus(SetLoadBalancerStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a TCP listener.</p>
     * 
     * @param request SetLoadBalancerTCPListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoadBalancerTCPListenerAttributeResponse
     */
    public SetLoadBalancerTCPListenerAttributeResponse setLoadBalancerTCPListenerAttributeWithOptions(SetLoadBalancerTCPListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipTransmit)) {
            query.put("EipTransmit", request.eipTransmit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.establishedTimeout)) {
            query.put("EstablishedTimeout", request.establishedTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectTimeout)) {
            query.put("HealthCheckConnectTimeout", request.healthCheckConnectTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckDomain)) {
            query.put("HealthCheckDomain", request.healthCheckDomain);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckHttpCode)) {
            query.put("HealthCheckHttpCode", request.healthCheckHttpCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckType)) {
            query.put("HealthCheckType", request.healthCheckType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckURI)) {
            query.put("HealthCheckURI", request.healthCheckURI);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.persistenceTimeout)) {
            query.put("PersistenceTimeout", request.persistenceTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoadBalancerTCPListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerTCPListenerAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a TCP listener.</p>
     * 
     * @param request SetLoadBalancerTCPListenerAttributeRequest
     * @return SetLoadBalancerTCPListenerAttributeResponse
     */
    public SetLoadBalancerTCPListenerAttributeResponse setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerTCPListenerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a UDP listener.</p>
     * 
     * @param request SetLoadBalancerUDPListenerAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetLoadBalancerUDPListenerAttributeResponse
     */
    public SetLoadBalancerUDPListenerAttributeResponse setLoadBalancerUDPListenerAttributeWithOptions(SetLoadBalancerUDPListenerAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eipTransmit)) {
            query.put("EipTransmit", request.eipTransmit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectPort)) {
            query.put("HealthCheckConnectPort", request.healthCheckConnectPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckConnectTimeout)) {
            query.put("HealthCheckConnectTimeout", request.healthCheckConnectTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckExp)) {
            query.put("HealthCheckExp", request.healthCheckExp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckInterval)) {
            query.put("HealthCheckInterval", request.healthCheckInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthCheckReq)) {
            query.put("HealthCheckReq", request.healthCheckReq);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.healthyThreshold)) {
            query.put("HealthyThreshold", request.healthyThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduler)) {
            query.put("Scheduler", request.scheduler);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unhealthyThreshold)) {
            query.put("UnhealthyThreshold", request.unhealthyThreshold);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetLoadBalancerUDPListenerAttribute"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetLoadBalancerUDPListenerAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>You can call this operation up to 100 times per second per account.</li>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a UDP listener.</p>
     * 
     * @param request SetLoadBalancerUDPListenerAttributeRequest
     * @return SetLoadBalancerUDPListenerAttributeResponse
     */
    public SetLoadBalancerUDPListenerAttributeResponse setLoadBalancerUDPListenerAttribute(SetLoadBalancerUDPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerUDPListenerAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an edge network instance.</p>
     * 
     * @param request StartEpnInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartEpnInstanceResponse
     */
    public StartEpnInstanceResponse startEpnInstanceWithOptions(StartEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceId)) {
            query.put("EPNInstanceId", request.EPNInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartEpnInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an edge network instance.</p>
     * 
     * @param request StartEpnInstanceRequest
     * @return StartEpnInstanceResponse
     */
    public StartEpnInstanceResponse startEpnInstance(StartEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startEpnInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call the operation only when the instance is in the Stopped state.</p>
     * <ul>
     * <li>If the operation is successful, the status of the instance becomes Starting.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Starts an instance.</p>
     * 
     * @param request StartInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstanceWithOptions(StartInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call the operation only when the instance is in the Stopped state.</p>
     * <ul>
     * <li>If the operation is successful, the status of the instance becomes Starting.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Starts an instance.</p>
     * 
     * @param request StartInstanceRequest
     * @return StartInstanceResponse
     */
    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>选择批量实例进行启动操作</p>
     * 
     * @param tmpReq StartInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartInstancesResponse
     */
    public StartInstancesResponse startInstancesWithOptions(StartInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StartInstancesShrinkRequest request = new StartInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartInstances"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>选择批量实例进行启动操作</p>
     * 
     * @param request StartInstancesRequest
     * @return StartInstancesResponse
     */
    public StartInstancesResponse startInstances(StartInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a listener.</p>
     * 
     * @param request StartLoadBalancerListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartLoadBalancerListenerResponse
     */
    public StartLoadBalancerListenerResponse startLoadBalancerListenerWithOptions(StartLoadBalancerListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartLoadBalancerListener"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartLoadBalancerListenerResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables a listener.</p>
     * 
     * @param request StartLoadBalancerListenerRequest
     * @return StartLoadBalancerListenerResponse
     */
    public StartLoadBalancerListenerResponse startLoadBalancerListener(StartLoadBalancerListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startLoadBalancerListenerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts the elastic IP address (EIP) specified in a source network address translation (SNAT) entry.</p>
     * 
     * @param request StartSnatIpForSnatEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSnatIpForSnatEntryResponse
     */
    public StartSnatIpForSnatEntryResponse startSnatIpForSnatEntryWithOptions(StartSnatIpForSnatEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.snatEntryId)) {
            query.put("SnatEntryId", request.snatEntryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snatIp)) {
            query.put("SnatIp", request.snatIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSnatIpForSnatEntry"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSnatIpForSnatEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts the elastic IP address (EIP) specified in a source network address translation (SNAT) entry.</p>
     * 
     * @param request StartSnatIpForSnatEntryRequest
     * @return StartSnatIpForSnatEntryResponse
     */
    public StartSnatIpForSnatEntryResponse startSnatIpForSnatEntry(StartSnatIpForSnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSnatIpForSnatEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Stops an EPN instance.</p>
     * 
     * @param request StopEpnInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopEpnInstanceResponse
     */
    public StopEpnInstanceResponse stopEpnInstanceWithOptions(StopEpnInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.EPNInstanceId)) {
            query.put("EPNInstanceId", request.EPNInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopEpnInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopEpnInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Stops an EPN instance.</p>
     * 
     * @param request StopEpnInstanceRequest
     * @return StopEpnInstanceResponse
     */
    public StopEpnInstanceResponse stopEpnInstance(StopEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopEpnInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to stop instances that are only in the Running state.</p>
     * <ul>
     * <li>If the call is successful, the state of the instance becomes Stopping.</li>
     * <li>Once the instance is stopped, the state of the instance becomes Stopped.</li>
     * <li>Force stop is supported, which is equivalent to power-off. Data that is not written to disks on the instance may be lost.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops an instance.</p>
     * 
     * @param request StopInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceStop)) {
            query.put("ForceStop", request.forceStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstance"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to stop instances that are only in the Running state.</p>
     * <ul>
     * <li>If the call is successful, the state of the instance becomes Stopping.</li>
     * <li>Once the instance is stopped, the state of the instance becomes Stopped.</li>
     * <li>Force stop is supported, which is equivalent to power-off. Data that is not written to disks on the instance may be lost.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Stops an instance.</p>
     * 
     * @param request StopInstanceRequest
     * @return StopInstanceResponse
     */
    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>选择批量实例进行停止操作</p>
     * 
     * @param tmpReq StopInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopInstancesResponse
     */
    public StopInstancesResponse stopInstancesWithOptions(StopInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        StopInstancesShrinkRequest request = new StopInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIdsShrink)) {
            query.put("InstanceIds", request.instanceIdsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopInstances"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopInstancesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>选择批量实例进行停止操作</p>
     * 
     * @param request StopInstancesRequest
     * @return StopInstancesResponse
     */
    public StopInstancesResponse stopInstances(StopInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a listener.</p>
     * 
     * @param request StopLoadBalancerListenerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopLoadBalancerListenerResponse
     */
    public StopLoadBalancerListenerResponse stopLoadBalancerListenerWithOptions(StopLoadBalancerListenerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.listenerPort)) {
            query.put("ListenerPort", request.listenerPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.listenerProtocol)) {
            query.put("ListenerProtocol", request.listenerProtocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.loadBalancerId)) {
            query.put("LoadBalancerId", request.loadBalancerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopLoadBalancerListener"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopLoadBalancerListenerResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation up to 100 times per second per account.</p>
     * <ul>
     * <li>You can call this operation up to 10 times per second per user.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables a listener.</p>
     * 
     * @param request StopLoadBalancerListenerRequest
     * @return StopLoadBalancerListenerResponse
     */
    public StopLoadBalancerListenerResponse stopLoadBalancerListener(StopLoadBalancerListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopLoadBalancerListenerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an elastic IP address (EIP) in a source network address translation (SNAT) entry.</p>
     * 
     * @param request StopSnatIpForSnatEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopSnatIpForSnatEntryResponse
     */
    public StopSnatIpForSnatEntryResponse stopSnatIpForSnatEntryWithOptions(StopSnatIpForSnatEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.snatEntryId)) {
            query.put("SnatEntryId", request.snatEntryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.snatIp)) {
            query.put("SnatIp", request.snatIp);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopSnatIpForSnatEntry"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopSnatIpForSnatEntryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables an elastic IP address (EIP) in a source network address translation (SNAT) entry.</p>
     * 
     * @param request StopSnatIpForSnatEntryRequest
     * @return StopSnatIpForSnatEntryResponse
     */
    public StopSnatIpForSnatEntryResponse stopSnatIpForSnatEntry(StopSnatIpForSnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopSnatIpForSnatEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>资源打用户标签</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("version", "2017-11-10"),
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
     * <p>资源打用户标签</p>
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
     * <p>Disassociates an elastic IP address (EIP) from an instance.</p>
     * 
     * @param request UnAssociateEnsEipAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnAssociateEnsEipAddressResponse
     */
    public UnAssociateEnsEipAddressResponse unAssociateEnsEipAddressWithOptions(UnAssociateEnsEipAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allocationId)) {
            query.put("AllocationId", request.allocationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnAssociateEnsEipAddress"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnAssociateEnsEipAddressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates an elastic IP address (EIP) from an instance.</p>
     * 
     * @param request UnAssociateEnsEipAddressRequest
     * @return UnAssociateEnsEipAddressResponse
     */
    public UnAssociateEnsEipAddressResponse unAssociateEnsEipAddress(UnAssociateEnsEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unAssociateEnsEipAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unassigns secondary private IP addresses from an elastic network interface (ENI).</p>
     * 
     * @param request UnassignPrivateIpAddressesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnassignPrivateIpAddressesResponse
     */
    public UnassignPrivateIpAddressesResponse unassignPrivateIpAddressesWithOptions(UnassignPrivateIpAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceId)) {
            query.put("NetworkInterfaceId", request.networkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnassignPrivateIpAddresses"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnassignPrivateIpAddressesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unassigns secondary private IP addresses from an elastic network interface (ENI).</p>
     * 
     * @param request UnassignPrivateIpAddressesRequest
     * @return UnassignPrivateIpAddressesResponse
     */
    public UnassignPrivateIpAddressesResponse unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassignPrivateIpAddressesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a network access control list (ACL) from a network.</p>
     * 
     * @param request UnassociateNetworkAclRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnassociateNetworkAclResponse
     */
    public UnassociateNetworkAclResponse unassociateNetworkAclWithOptions(UnassociateNetworkAclRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkAclId)) {
            query.put("NetworkAclId", request.networkAclId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resource)) {
            query.put("Resource", request.resource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnassociateNetworkAcl"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnassociateNetworkAclResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disassociates a network access control list (ACL) from a network.</p>
     * 
     * @param request UnassociateNetworkAclRequest
     * @return UnassociateNetworkAclResponse
     */
    public UnassociateNetworkAclResponse unassociateNetworkAcl(UnassociateNetworkAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassociateNetworkAclWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>释放预热的节点及AIC的命名空间粒度SDG</p>
     * 
     * @param tmpReq UnloadRegionSDGRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnloadRegionSDGResponse
     */
    public UnloadRegionSDGResponse unloadRegionSDGWithOptions(UnloadRegionSDGRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UnloadRegionSDGShrinkRequest request = new UnloadRegionSDGShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.destinationRegionIds)) {
            request.destinationRegionIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.destinationRegionIds, "DestinationRegionIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.namespaces)) {
            request.namespacesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.namespaces, "Namespaces", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationRegionIdsShrink)) {
            query.put("DestinationRegionIds", request.destinationRegionIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacesShrink)) {
            query.put("Namespaces", request.namespacesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SDGId)) {
            query.put("SDGId", request.SDGId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnloadRegionSDG"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnloadRegionSDGResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>释放预热的节点及AIC的命名空间粒度SDG</p>
     * 
     * @param request UnloadRegionSDGRequest
     * @return UnloadRegionSDGResponse
     */
    public UnloadRegionSDGResponse unloadRegionSDG(UnloadRegionSDGRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unloadRegionSDGWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>资源去除用户标签</p>
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
            new TeaPair("version", "2017-11-10"),
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
     * <p>资源去除用户标签</p>
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
     * <p>修改售卖约束</p>
     * 
     * @param tmpReq UpdateEnsSaleControlRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateEnsSaleControlResponse
     */
    public UpdateEnsSaleControlResponse updateEnsSaleControlWithOptions(UpdateEnsSaleControlRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateEnsSaleControlShrinkRequest request = new UpdateEnsSaleControlShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.saleControls)) {
            request.saleControlsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.saleControls, "SaleControls", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUidAccount)) {
            query.put("AliUidAccount", request.aliUidAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.customAccount)) {
            query.put("CustomAccount", request.customAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.saleControlsShrink)) {
            query.put("SaleControls", request.saleControlsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEnsSaleControl"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateEnsSaleControlResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改售卖约束</p>
     * 
     * @param request UpdateEnsSaleControlRequest
     * @return UpdateEnsSaleControlResponse
     */
    public UpdateEnsSaleControlResponse updateEnsSaleControl(UpdateEnsSaleControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEnsSaleControlWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the image of an Android in Container (AIC) instance.</p>
     * 
     * @param tmpReq UpgradeAICInstanceImageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeAICInstanceImageResponse
     */
    public UpgradeAICInstanceImageResponse upgradeAICInstanceImageWithOptions(UpgradeAICInstanceImageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpgradeAICInstanceImageShrinkRequest request = new UpgradeAICInstanceImageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serverIds)) {
            request.serverIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serverIds, "ServerIds", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeAICInstanceImage"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeAICInstanceImageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the image of an Android in Container (AIC) instance.</p>
     * 
     * @param request UpgradeAICInstanceImageRequest
     * @return UpgradeAICInstanceImageResponse
     */
    public UpgradeAICInstanceImageResponse upgradeAICInstanceImage(UpgradeAICInstanceImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeAICInstanceImageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the container in an asynchronous manner. You can configure multiple canary release policies.</p>
     * 
     * @param request UpgradeApplicationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeApplicationResponse
     */
    public UpgradeApplicationResponse upgradeApplicationWithOptions(UpgradeApplicationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.template)) {
            query.put("Template", request.template);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeout)) {
            query.put("Timeout", request.timeout);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeApplication"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeApplicationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the container in an asynchronous manner. You can configure multiple canary release policies.</p>
     * 
     * @param request UpgradeApplicationRequest
     * @return UpgradeApplicationResponse
     */
    public UpgradeApplicationResponse upgradeApplication(UpgradeApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeApplicationWithOptions(request, runtime);
    }
}
