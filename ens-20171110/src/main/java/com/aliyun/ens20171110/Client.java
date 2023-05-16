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

    public AccosicateNetworkAclResponse accosicateNetworkAcl(AccosicateNetworkAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.accosicateNetworkAclWithOptions(request, runtime);
    }

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

    public AddBackendServersResponse addBackendServers(AddBackendServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addBackendServersWithOptions(request, runtime);
    }

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

    public AddDeviceInternetPortResponse addDeviceInternetPort(AddDeviceInternetPortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDeviceInternetPortWithOptions(request, runtime);
    }

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

    public AddNetworkInterfaceToInstanceResponse addNetworkInterfaceToInstance(AddNetworkInterfaceToInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addNetworkInterfaceToInstanceWithOptions(request, runtime);
    }

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

    public AssignPrivateIpAddressesResponse assignPrivateIpAddresses(AssignPrivateIpAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignPrivateIpAddressesWithOptions(request, runtime);
    }

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

    public AssociateEnsEipAddressResponse associateEnsEipAddress(AssociateEnsEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateEnsEipAddressWithOptions(request, runtime);
    }

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

    public AttachDiskResponse attachDisk(AttachDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachDiskWithOptions(request, runtime);
    }

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

    public AttachEnsInstancesResponse attachEnsInstances(AttachEnsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachEnsInstancesWithOptions(request, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public AuthorizeSecurityGroupResponse authorizeSecurityGroup(AuthorizeSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeSecurityGroupWithOptions(request, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public AuthorizeSecurityGroupEgressResponse authorizeSecurityGroupEgress(AuthorizeSecurityGroupEgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.authorizeSecurityGroupEgressWithOptions(request, runtime);
    }

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

    public CleanDistDataResponse cleanDistData(CleanDistDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cleanDistDataWithOptions(request, runtime);
    }

    public CreateARMServerInstancesResponse createARMServerInstancesWithOptions(CreateARMServerInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.amount)) {
            query.put("Amount", request.amount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
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

    public CreateARMServerInstancesResponse createARMServerInstances(CreateARMServerInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createARMServerInstancesWithOptions(request, runtime);
    }

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

    public CreateApplicationResponse createApplication(CreateApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApplicationWithOptions(request, runtime);
    }

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

    public CreateClassicNetworkResponse createClassicNetwork(CreateClassicNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClassicNetworkWithOptions(request, runtime);
    }

    public CreateDiskResponse createDiskWithOptions(CreateDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.category)) {
            query.put("Category", request.category);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceChargeType)) {
            query.put("InstanceChargeType", request.instanceChargeType);
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

    public CreateDiskResponse createDisk(CreateDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDiskWithOptions(request, runtime);
    }

    public CreateEipInstanceResponse createEipInstanceWithOptions(CreateEipInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            query.put("Bandwidth", request.bandwidth);
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

    public CreateEipInstanceResponse createEipInstance(CreateEipInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEipInstanceWithOptions(request, runtime);
    }

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

    public CreateEnsRouteEntryResponse createEnsRouteEntry(CreateEnsRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnsRouteEntryWithOptions(request, runtime);
    }

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

    public CreateEnsSaleControlResponse createEnsSaleControl(CreateEnsSaleControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnsSaleControlWithOptions(request, runtime);
    }

    public CreateEnsServiceResponse createEnsServiceWithOptions(CreateEnsServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensServiceId)) {
            query.put("EnsServiceId", request.ensServiceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public CreateEnsServiceResponse createEnsService(CreateEnsServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEnsServiceWithOptions(request, runtime);
    }

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

    public CreateEpnInstanceResponse createEpnInstance(CreateEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEpnInstanceWithOptions(request, runtime);
    }

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

    public CreateFileSystemResponse createFileSystem(CreateFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFileSystemWithOptions(request, runtime);
    }

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

    public CreateForwardEntryResponse createForwardEntry(CreateForwardEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createForwardEntryWithOptions(request, runtime);
    }

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

    public CreateImageResponse createImage(CreateImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createImageWithOptions(request, runtime);
    }

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

    public CreateInstanceResponse createInstance(CreateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceWithOptions(request, runtime);
    }

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

    public CreateInstanceActiveOpsTaskResponse createInstanceActiveOpsTask(CreateInstanceActiveOpsTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceActiveOpsTaskWithOptions(request, runtime);
    }

    public CreateKeyPairResponse createKeyPairWithOptions(CreateKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public CreateKeyPairResponse createKeyPair(CreateKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createKeyPairWithOptions(request, runtime);
    }

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

    public CreateLoadBalancerResponse createLoadBalancer(CreateLoadBalancerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerWithOptions(request, runtime);
    }

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

    public CreateLoadBalancerHTTPListenerResponse createLoadBalancerHTTPListener(CreateLoadBalancerHTTPListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerHTTPListenerWithOptions(request, runtime);
    }

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

    public CreateLoadBalancerHTTPSListenerResponse createLoadBalancerHTTPSListener(CreateLoadBalancerHTTPSListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerHTTPSListenerWithOptions(request, runtime);
    }

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

    public CreateLoadBalancerTCPListenerResponse createLoadBalancerTCPListener(CreateLoadBalancerTCPListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerTCPListenerWithOptions(request, runtime);
    }

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

    public CreateLoadBalancerUDPListenerResponse createLoadBalancerUDPListener(CreateLoadBalancerUDPListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLoadBalancerUDPListenerWithOptions(request, runtime);
    }

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

    public CreateMountTargetResponse createMountTarget(CreateMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMountTargetWithOptions(request, runtime);
    }

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

    public CreateNatGatewayResponse createNatGateway(CreateNatGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNatGatewayWithOptions(request, runtime);
    }

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

    public CreateNetworkResponse createNetwork(CreateNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkWithOptions(request, runtime);
    }

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

    public CreateNetworkAclResponse createNetworkAcl(CreateNetworkAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkAclWithOptions(request, runtime);
    }

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

    public CreateNetworkAclEntryResponse createNetworkAclEntry(CreateNetworkAclEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNetworkAclEntryWithOptions(request, runtime);
    }

    public CreateSecurityGroupResponse createSecurityGroupWithOptions(CreateSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupName)) {
            query.put("SecurityGroupName", request.securityGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public CreateSecurityGroupResponse createSecurityGroup(CreateSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSecurityGroupWithOptions(request, runtime);
    }

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

    public CreateSnatEntryResponse createSnatEntry(CreateSnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSnatEntryWithOptions(request, runtime);
    }

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

    public CreateVSwitchResponse createVSwitch(CreateVSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVSwitchWithOptions(request, runtime);
    }

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

    public DeleteApplicationResponse deleteApplication(DeleteApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApplicationWithOptions(request, runtime);
    }

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

    public DeleteDeviceInternetPortResponse deleteDeviceInternetPort(DeleteDeviceInternetPortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDeviceInternetPortWithOptions(request, runtime);
    }

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

    public DeleteDiskResponse deleteDisk(DeleteDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDiskWithOptions(request, runtime);
    }

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

    public DeleteEnsRouteEntryResponse deleteEnsRouteEntry(DeleteEnsRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnsRouteEntryWithOptions(request, runtime);
    }

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

    public DeleteEnsSaleConditionControlResponse deleteEnsSaleConditionControl(DeleteEnsSaleConditionControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnsSaleConditionControlWithOptions(request, runtime);
    }

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

    public DeleteEnsSaleControlResponse deleteEnsSaleControl(DeleteEnsSaleControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEnsSaleControlWithOptions(request, runtime);
    }

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

    public DeleteEpnInstanceResponse deleteEpnInstance(DeleteEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteEpnInstanceWithOptions(request, runtime);
    }

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

    public DeleteFileSystemResponse deleteFileSystem(DeleteFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteFileSystemWithOptions(request, runtime);
    }

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

    public DeleteForwardEntryResponse deleteForwardEntry(DeleteForwardEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteForwardEntryWithOptions(request, runtime);
    }

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

    public DeleteImageResponse deleteImage(DeleteImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteImageWithOptions(request, runtime);
    }

    public DeleteKeyPairsResponse deleteKeyPairsWithOptions(DeleteKeyPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DeleteKeyPairsResponse deleteKeyPairs(DeleteKeyPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteKeyPairsWithOptions(request, runtime);
    }

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

    public DeleteLoadBalancerListenerResponse deleteLoadBalancerListener(DeleteLoadBalancerListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLoadBalancerListenerWithOptions(request, runtime);
    }

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

    public DeleteMountTargetResponse deleteMountTarget(DeleteMountTargetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMountTargetWithOptions(request, runtime);
    }

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

    public DeleteNatGatewayResponse deleteNatGateway(DeleteNatGatewayRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNatGatewayWithOptions(request, runtime);
    }

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

    public DeleteNetworkResponse deleteNetwork(DeleteNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkWithOptions(request, runtime);
    }

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

    public DeleteNetworkAclResponse deleteNetworkAcl(DeleteNetworkAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkAclWithOptions(request, runtime);
    }

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

    public DeleteNetworkAclEntryResponse deleteNetworkAclEntry(DeleteNetworkAclEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNetworkAclEntryWithOptions(request, runtime);
    }

    public DeleteSecurityGroupResponse deleteSecurityGroupWithOptions(DeleteSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DeleteSecurityGroupResponse deleteSecurityGroup(DeleteSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityGroupWithOptions(request, runtime);
    }

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

    public DeleteSnatEntryResponse deleteSnatEntry(DeleteSnatEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSnatEntryWithOptions(request, runtime);
    }

    public DeleteVSwitchResponse deleteVSwitchWithOptions(DeleteVSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DeleteVSwitchResponse deleteVSwitch(DeleteVSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVSwitchWithOptions(request, runtime);
    }

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

    public DescribeAICImagesResponse describeAICImages(DescribeAICImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAICImagesWithOptions(request, runtime);
    }

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

    public DescribeARMServerInstancesResponse describeARMServerInstances(DescribeARMServerInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeARMServerInstancesWithOptions(request, runtime);
    }

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

    public DescribeApplicationResponse describeApplication(DescribeApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationWithOptions(request, runtime);
    }

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

    public DescribeApplicationResourceSummaryResponse describeApplicationResourceSummary(DescribeApplicationResourceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApplicationResourceSummaryWithOptions(request, runtime);
    }

    public DescribeAvailableResourceResponse describeAvailableResourceWithOptions(DescribeAvailableResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
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

    public DescribeAvailableResourceResponse describeAvailableResource(DescribeAvailableResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableResourceWithOptions(request, runtime);
    }

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

    public DescribeAvailableResourceInfoResponse describeAvailableResourceInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableResourceInfoWithOptions(runtime);
    }

    public DescribeBandWithdChargeTypeResponse describeBandWithdChargeTypeWithOptions(DescribeBandWithdChargeTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
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

    public DescribeBandWithdChargeTypeResponse describeBandWithdChargeType(DescribeBandWithdChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBandWithdChargeTypeWithOptions(request, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeBandwitdhByInternetChargeTypeResponse describeBandwitdhByInternetChargeType(DescribeBandwitdhByInternetChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBandwitdhByInternetChargeTypeWithOptions(request, runtime);
    }

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

    public DescribeCloudDiskAvailableResourceInfoResponse describeCloudDiskAvailableResourceInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudDiskAvailableResourceInfoWithOptions(runtime);
    }

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

    public DescribeCloudDiskTypesResponse describeCloudDiskTypes(DescribeCloudDiskTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCloudDiskTypesWithOptions(request, runtime);
    }

    public DescribeCreatePrePaidInstanceResultResponse describeCreatePrePaidInstanceResultWithOptions(DescribeCreatePrePaidInstanceResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeCreatePrePaidInstanceResultResponse describeCreatePrePaidInstanceResult(DescribeCreatePrePaidInstanceResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCreatePrePaidInstanceResultWithOptions(request, runtime);
    }

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

    public DescribeDataDistResultResponse describeDataDistResult(DescribeDataDistResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataDistResultWithOptions(request, runtime);
    }

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

    public DescribeDataDownloadURLResponse describeDataDownloadURL(DescribeDataDownloadURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataDownloadURLWithOptions(request, runtime);
    }

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

    public DescribeDataPushResultResponse describeDataPushResult(DescribeDataPushResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataPushResultWithOptions(request, runtime);
    }

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

    public DescribeDeviceServiceResponse describeDeviceService(DescribeDeviceServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDeviceServiceWithOptions(request, runtime);
    }

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

    public DescribeDisksResponse describeDisks(DescribeDisksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDisksWithOptions(request, runtime);
    }

    public DescribeEipAddressesResponse describeEipAddressesWithOptions(DescribeEipAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.eips)) {
            query.put("Eips", request.eips);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeEipAddressesResponse describeEipAddresses(DescribeEipAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEipAddressesWithOptions(request, runtime);
    }

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

    public DescribeElbAvailableResourceInfoResponse describeElbAvailableResourceInfo() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElbAvailableResourceInfoWithOptions(runtime);
    }

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

    public DescribeEnsCommodityCodeResponse describeEnsCommodityCode(DescribeEnsCommodityCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsCommodityCodeWithOptions(request, runtime);
    }

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

    public DescribeEnsCommodityModuleCodeResponse describeEnsCommodityModuleCode(DescribeEnsCommodityModuleCodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsCommodityModuleCodeWithOptions(request, runtime);
    }

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

    public DescribeEnsEipAddressesResponse describeEnsEipAddresses(DescribeEnsEipAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsEipAddressesWithOptions(request, runtime);
    }

    public DescribeEnsNetDistrictResponse describeEnsNetDistrictWithOptions(DescribeEnsNetDistrictRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.netDistrictCode)) {
            query.put("NetDistrictCode", request.netDistrictCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netLevelCode)) {
            query.put("NetLevelCode", request.netLevelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeEnsNetDistrictResponse describeEnsNetDistrict(DescribeEnsNetDistrictRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsNetDistrictWithOptions(request, runtime);
    }

    public DescribeEnsNetLevelResponse describeEnsNetLevelWithOptions(DescribeEnsNetLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
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

    public DescribeEnsNetLevelResponse describeEnsNetLevel(DescribeEnsNetLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsNetLevelWithOptions(request, runtime);
    }

    public DescribeEnsNetSaleDistrictResponse describeEnsNetSaleDistrictWithOptions(DescribeEnsNetSaleDistrictRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.netDistrictCode)) {
            query.put("NetDistrictCode", request.netDistrictCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netLevelCode)) {
            query.put("NetLevelCode", request.netLevelCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeEnsNetSaleDistrictResponse describeEnsNetSaleDistrict(DescribeEnsNetSaleDistrictRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsNetSaleDistrictWithOptions(request, runtime);
    }

    public DescribeEnsRegionIdIpv6InfoResponse describeEnsRegionIdIpv6InfoWithOptions(DescribeEnsRegionIdIpv6InfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ensRegionId)) {
            query.put("EnsRegionId", request.ensRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeEnsRegionIdIpv6InfoResponse describeEnsRegionIdIpv6Info(DescribeEnsRegionIdIpv6InfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsRegionIdIpv6InfoWithOptions(request, runtime);
    }

    /**
      * ****
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
      * ****
      *
      * @param request DescribeEnsRegionIdResourceRequest
      * @return DescribeEnsRegionIdResourceResponse
     */
    public DescribeEnsRegionIdResourceResponse describeEnsRegionIdResource(DescribeEnsRegionIdResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsRegionIdResourceWithOptions(request, runtime);
    }

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

    public DescribeEnsRegionsResponse describeEnsRegions(DescribeEnsRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsRegionsWithOptions(request, runtime);
    }

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

    public DescribeEnsResourceUsageResponse describeEnsResourceUsage(DescribeEnsResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsResourceUsageWithOptions(request, runtime);
    }

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

    public DescribeEnsRouteEntryListResponse describeEnsRouteEntryList(DescribeEnsRouteEntryListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsRouteEntryListWithOptions(request, runtime);
    }

    public DescribeEnsSaleControlResponse describeEnsSaleControlWithOptions(DescribeEnsSaleControlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUidAccount)) {
            query.put("AliUidAccount", request.aliUidAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
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

    public DescribeEnsSaleControlResponse describeEnsSaleControl(DescribeEnsSaleControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsSaleControlWithOptions(request, runtime);
    }

    public DescribeEnsSaleControlAvailableResourceResponse describeEnsSaleControlAvailableResourceWithOptions(DescribeEnsSaleControlAvailableResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
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

    public DescribeEnsSaleControlAvailableResourceResponse describeEnsSaleControlAvailableResource(DescribeEnsSaleControlAvailableResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsSaleControlAvailableResourceWithOptions(request, runtime);
    }

    public DescribeEnsSaleControlStockResponse describeEnsSaleControlStockWithOptions(DescribeEnsSaleControlStockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aliUidAccount)) {
            query.put("AliUidAccount", request.aliUidAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.commodityCode)) {
            query.put("CommodityCode", request.commodityCode);
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

    public DescribeEnsSaleControlStockResponse describeEnsSaleControlStock(DescribeEnsSaleControlStockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnsSaleControlStockWithOptions(request, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeEpnBandWidthDataResponse describeEpnBandWidthData(DescribeEpnBandWidthDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnBandWidthDataWithOptions(request, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeEpnBandwitdhByInternetChargeTypeResponse describeEpnBandwitdhByInternetChargeType(DescribeEpnBandwitdhByInternetChargeTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnBandwitdhByInternetChargeTypeWithOptions(request, runtime);
    }

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

    public DescribeEpnInstanceAttributeResponse describeEpnInstanceAttribute(DescribeEpnInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnInstanceAttributeWithOptions(request, runtime);
    }

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

    public DescribeEpnInstancesResponse describeEpnInstances(DescribeEpnInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnInstancesWithOptions(request, runtime);
    }

    public DescribeEpnMeasurementDataResponse describeEpnMeasurementDataWithOptions(DescribeEpnMeasurementDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeEpnMeasurementDataResponse describeEpnMeasurementData(DescribeEpnMeasurementDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEpnMeasurementDataWithOptions(request, runtime);
    }

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

    public DescribeExportImageInfoResponse describeExportImageInfo(DescribeExportImageInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExportImageInfoWithOptions(request, runtime);
    }

    public DescribeExportImageStatusResponse describeExportImageStatusWithOptions(DescribeExportImageStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeExportImageStatusResponse describeExportImageStatus(DescribeExportImageStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExportImageStatusWithOptions(request, runtime);
    }

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

    public DescribeFileSystemsResponse describeFileSystems(DescribeFileSystemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFileSystemsWithOptions(request, runtime);
    }

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

    public DescribeForwardTableEntriesResponse describeForwardTableEntries(DescribeForwardTableEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeForwardTableEntriesWithOptions(request, runtime);
    }

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

    public DescribeImageInfosResponse describeImageInfos(DescribeImageInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageInfosWithOptions(request, runtime);
    }

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

    public DescribeImageSharePermissionResponse describeImageSharePermission(DescribeImageSharePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImageSharePermissionWithOptions(request, runtime);
    }

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

    public DescribeImagesResponse describeImages(DescribeImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeImagesWithOptions(request, runtime);
    }

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttributeWithOptions(DescribeInstanceAutoRenewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceIds)) {
            query.put("InstanceIds", request.instanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeInstanceAutoRenewAttributeResponse describeInstanceAutoRenewAttribute(DescribeInstanceAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeInstanceMonitorDataResponse describeInstanceMonitorData(DescribeInstanceMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceMonitorDataWithOptions(request, runtime);
    }

    public DescribeInstanceSpecResponse describeInstanceSpecWithOptions(DescribeInstanceSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
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

    public DescribeInstanceSpecResponse describeInstanceSpec(DescribeInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSpecWithOptions(request, runtime);
    }

    public DescribeInstanceTypesResponse describeInstanceTypesWithOptions(DescribeInstanceTypesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
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

    public DescribeInstanceTypesResponse describeInstanceTypes(DescribeInstanceTypesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceTypesWithOptions(request, runtime);
    }

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

    public DescribeInstanceVncUrlResponse describeInstanceVncUrl(DescribeInstanceVncUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceVncUrlWithOptions(request, runtime);
    }

    public DescribeInstancesResponse describeInstancesWithOptions(DescribeInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
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

    public DescribeInstancesResponse describeInstances(DescribeInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstancesWithOptions(request, runtime);
    }

    public DescribeKeyPairsResponse describeKeyPairsWithOptions(DescribeKeyPairsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeKeyPairsResponse describeKeyPairs(DescribeKeyPairsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKeyPairsWithOptions(request, runtime);
    }

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

    public DescribeLoadBalancerAttributeResponse describeLoadBalancerAttribute(DescribeLoadBalancerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerAttributeWithOptions(request, runtime);
    }

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

    public DescribeLoadBalancerHTTPListenerAttributeResponse describeLoadBalancerHTTPListenerAttribute(DescribeLoadBalancerHTTPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerHTTPListenerAttributeWithOptions(request, runtime);
    }

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

    public DescribeLoadBalancerHTTPSListenerAttributeResponse describeLoadBalancerHTTPSListenerAttribute(DescribeLoadBalancerHTTPSListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerHTTPSListenerAttributeWithOptions(request, runtime);
    }

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

    public DescribeLoadBalancerSpecResponse describeLoadBalancerSpec(DescribeLoadBalancerSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerSpecWithOptions(request, runtime);
    }

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

    public DescribeLoadBalancerTCPListenerAttributeResponse describeLoadBalancerTCPListenerAttribute(DescribeLoadBalancerTCPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerTCPListenerAttributeWithOptions(request, runtime);
    }

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

    public DescribeLoadBalancerUDPListenerAttributeResponse describeLoadBalancerUDPListenerAttribute(DescribeLoadBalancerUDPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancerUDPListenerAttributeWithOptions(request, runtime);
    }

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

    public DescribeLoadBalancersResponse describeLoadBalancers(DescribeLoadBalancersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLoadBalancersWithOptions(request, runtime);
    }

    public DescribeMeasurementDataResponse describeMeasurementDataWithOptions(DescribeMeasurementDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeMeasurementDataResponse describeMeasurementData(DescribeMeasurementDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMeasurementDataWithOptions(request, runtime);
    }

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

    public DescribeMountTargetsResponse describeMountTargets(DescribeMountTargetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMountTargetsWithOptions(request, runtime);
    }

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

    public DescribeNCInformationResponse describeNCInformation(DescribeNCInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNCInformationWithOptions(request, runtime);
    }

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

    public DescribeNatGatewaysResponse describeNatGateways(DescribeNatGatewaysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNatGatewaysWithOptions(request, runtime);
    }

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

    public DescribeNetworkAclsResponse describeNetworkAcls(DescribeNetworkAclsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkAclsWithOptions(request, runtime);
    }

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

    public DescribeNetworkAttributeResponse describeNetworkAttribute(DescribeNetworkAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkAttributeWithOptions(request, runtime);
    }

    public DescribeNetworkInterfacesResponse describeNetworkInterfacesWithOptions(DescribeNetworkInterfacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.primaryIpAddress)) {
            query.put("PrimaryIpAddress", request.primaryIpAddress);
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

    public DescribeNetworkInterfacesResponse describeNetworkInterfaces(DescribeNetworkInterfacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworkInterfacesWithOptions(request, runtime);
    }

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

    public DescribeNetworksResponse describeNetworks(DescribeNetworksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNetworksWithOptions(request, runtime);
    }

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

    public DescribePrePaidInstanceStockResponse describePrePaidInstanceStock(DescribePrePaidInstanceStockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePrePaidInstanceStockWithOptions(request, runtime);
    }

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

    public DescribePriceResponse describePrice(DescribePriceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePriceWithOptions(request, runtime);
    }

    public DescribeRegionBandwidthQuotaResponse describeRegionBandwidthQuotaWithOptions(DescribeRegionBandwidthQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegionBandwidthQuota"),
            new TeaPair("version", "2017-11-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionBandwidthQuotaResponse());
    }

    public DescribeRegionBandwidthQuotaResponse describeRegionBandwidthQuota(DescribeRegionBandwidthQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionBandwidthQuotaWithOptions(request, runtime);
    }

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

    public DescribeRegionIspsResponse describeRegionIsps(DescribeRegionIspsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionIspsWithOptions(request, runtime);
    }

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

    public DescribeRegionResourceResponse describeRegionResource(DescribeRegionResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionResourceWithOptions(request, runtime);
    }

    public DescribeReservedResourceResponse describeReservedResourceWithOptions(DescribeReservedResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
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

    public DescribeReservedResourceResponse describeReservedResource(DescribeReservedResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeReservedResourceWithOptions(request, runtime);
    }

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

    public DescribeResourceTimelineResponse describeResourceTimeline(DescribeResourceTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceTimelineWithOptions(request, runtime);
    }

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

    public DescribeSecurityGroupAttributeResponse describeSecurityGroupAttribute(DescribeSecurityGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityGroupAttributeWithOptions(request, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeSecurityGroupsResponse describeSecurityGroups(DescribeSecurityGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityGroupsWithOptions(request, runtime);
    }

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

    public DescribeSelfImagesResponse describeSelfImages(DescribeSelfImagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSelfImagesWithOptions(request, runtime);
    }

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

    public DescribeServcieScheduleResponse describeServcieSchedule(DescribeServcieScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeServcieScheduleWithOptions(request, runtime);
    }

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

    public DescribeSnatTableEntriesResponse describeSnatTableEntries(DescribeSnatTableEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSnatTableEntriesWithOptions(request, runtime);
    }

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

    public DescribeUserBandWidthDataResponse describeUserBandWidthData(DescribeUserBandWidthDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserBandWidthDataWithOptions(request, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public DescribeVSwitchesResponse describeVSwitches(DescribeVSwitchesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeVSwitchesWithOptions(request, runtime);
    }

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

    public DetachDiskResponse detachDisk(DetachDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachDiskWithOptions(request, runtime);
    }

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

    public DistApplicationDataResponse distApplicationData(DistApplicationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.distApplicationDataWithOptions(request, runtime);
    }

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

    public ExportBillDetailDataResponse exportBillDetailData(ExportBillDetailDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportBillDetailDataWithOptions(request, runtime);
    }

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

    public ExportImageResponse exportImage(ExportImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportImageWithOptions(request, runtime);
    }

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

    public ExportMeasurementDataResponse exportMeasurementData(ExportMeasurementDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exportMeasurementDataWithOptions(request, runtime);
    }

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

    public GetDeviceInternetPortResponse getDeviceInternetPort(GetDeviceInternetPortRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDeviceInternetPortWithOptions(request, runtime);
    }

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

    public GetOssStorageAndAccByBucketsResponse getOssStorageAndAccByBuckets(GetOssStorageAndAccByBucketsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssStorageAndAccByBucketsWithOptions(request, runtime);
    }

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

    public GetOssUsageDataResponse getOssUsageData(GetOssUsageDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOssUsageDataWithOptions(request, runtime);
    }

    public ImportKeyPairResponse importKeyPairWithOptions(ImportKeyPairRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyPairName)) {
            query.put("KeyPairName", request.keyPairName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publicKeyBody)) {
            query.put("PublicKeyBody", request.publicKeyBody);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public ImportKeyPairResponse importKeyPair(ImportKeyPairRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importKeyPairWithOptions(request, runtime);
    }

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

    public JoinPublicIpsToEpnInstanceResponse joinPublicIpsToEpnInstance(JoinPublicIpsToEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinPublicIpsToEpnInstanceWithOptions(request, runtime);
    }

    public JoinSecurityGroupResponse joinSecurityGroupWithOptions(JoinSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

    public JoinSecurityGroupResponse joinSecurityGroup(JoinSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinSecurityGroupWithOptions(request, runtime);
    }

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

    public JoinVSwitchesToEpnInstanceResponse joinVSwitchesToEpnInstance(JoinVSwitchesToEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinVSwitchesToEpnInstanceWithOptions(request, runtime);
    }

    public LeaveSecurityGroupResponse leaveSecurityGroupWithOptions(LeaveSecurityGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            query.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public LeaveSecurityGroupResponse leaveSecurityGroup(LeaveSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.leaveSecurityGroupWithOptions(request, runtime);
    }

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

    public ListApplicationsResponse listApplications(ListApplicationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApplicationsWithOptions(request, runtime);
    }

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

    public ModifyEnsEipAddressAttributeResponse modifyEnsEipAddressAttribute(ModifyEnsEipAddressAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEnsEipAddressAttributeWithOptions(request, runtime);
    }

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

    public ModifyEpnInstanceResponse modifyEpnInstance(ModifyEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEpnInstanceWithOptions(request, runtime);
    }

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

    public ModifyFileSystemResponse modifyFileSystem(ModifyFileSystemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyFileSystemWithOptions(request, runtime);
    }

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

    public ModifyForwardEntryResponse modifyForwardEntry(ModifyForwardEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyForwardEntryWithOptions(request, runtime);
    }

    public ModifyImageAttributeResponse modifyImageAttributeWithOptions(ModifyImageAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageName)) {
            query.put("ImageName", request.imageName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.product)) {
            query.put("product", request.product);
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

    public ModifyImageAttributeResponse modifyImageAttribute(ModifyImageAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyImageAttributeWithOptions(request, runtime);
    }

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

    public ModifyImageSharePermissionResponse modifyImageSharePermission(ModifyImageSharePermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyImageSharePermissionWithOptions(request, runtime);
    }

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

    public ModifyInstanceAttributeResponse modifyInstanceAttribute(ModifyInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAttributeWithOptions(request, runtime);
    }

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

    public ModifyInstanceAutoRenewAttributeResponse modifyInstanceAutoRenewAttribute(ModifyInstanceAutoRenewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceAutoRenewAttributeWithOptions(request, runtime);
    }

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

    public ModifyLoadBalancerAttributeResponse modifyLoadBalancerAttribute(ModifyLoadBalancerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLoadBalancerAttributeWithOptions(request, runtime);
    }

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

    public ModifyNetworkAttributeResponse modifyNetworkAttribute(ModifyNetworkAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyNetworkAttributeWithOptions(request, runtime);
    }

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

    public ModifyPrepayInstanceSpecResponse modifyPrepayInstanceSpec(ModifyPrepayInstanceSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPrepayInstanceSpecWithOptions(request, runtime);
    }

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

    public ModifySecurityGroupAttributeResponse modifySecurityGroupAttribute(ModifySecurityGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityGroupAttributeWithOptions(request, runtime);
    }

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

    public ModifyVSwitchAttributeResponse modifyVSwitchAttribute(ModifyVSwitchAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVSwitchAttributeWithOptions(request, runtime);
    }

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

    public PushApplicationDataResponse pushApplicationData(PushApplicationDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pushApplicationDataWithOptions(request, runtime);
    }

    public ReInitDiskResponse reInitDiskWithOptions(ReInitDiskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diskId)) {
            query.put("DiskId", request.diskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imageId)) {
            query.put("ImageId", request.imageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public ReInitDiskResponse reInitDisk(ReInitDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reInitDiskWithOptions(request, runtime);
    }

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

    public RebootAICInstanceResponse rebootAICInstance(RebootAICInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootAICInstanceWithOptions(request, runtime);
    }

    public RebootARMServerInstanceResponse rebootARMServerInstanceWithOptions(RebootARMServerInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RebootARMServerInstanceShrinkRequest request = new RebootARMServerInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.serverIds)) {
            request.serverIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.serverIds, "ServerIds", "json");
        }

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

    public RebootARMServerInstanceResponse rebootARMServerInstance(RebootARMServerInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootARMServerInstanceWithOptions(request, runtime);
    }

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

    public RebootInstanceResponse rebootInstance(RebootInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootInstanceWithOptions(request, runtime);
    }

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

    public RebootInstancesResponse rebootInstances(RebootInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebootInstancesWithOptions(request, runtime);
    }

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

    public RecoverAICInstanceResponse recoverAICInstance(RecoverAICInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.recoverAICInstanceWithOptions(request, runtime);
    }

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

    public ReinitInstanceResponse reinitInstance(ReinitInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reinitInstanceWithOptions(request, runtime);
    }

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

    public ReinitInstancesResponse reinitInstances(ReinitInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reinitInstancesWithOptions(request, runtime);
    }

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

    public ReleaseAICInstanceResponse releaseAICInstance(ReleaseAICInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseAICInstanceWithOptions(request, runtime);
    }

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

    public ReleaseARMServerInstanceResponse releaseARMServerInstance(ReleaseARMServerInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseARMServerInstanceWithOptions(request, runtime);
    }

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

    public ReleaseInstanceResponse releaseInstance(ReleaseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstanceWithOptions(request, runtime);
    }

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

    public ReleasePostPaidInstanceResponse releasePostPaidInstance(ReleasePostPaidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releasePostPaidInstanceWithOptions(request, runtime);
    }

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

    public ReleasePrePaidInstanceResponse releasePrePaidInstance(ReleasePrePaidInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releasePrePaidInstanceWithOptions(request, runtime);
    }

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

    public RemoveBackendServersResponse removeBackendServers(RemoveBackendServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeBackendServersWithOptions(request, runtime);
    }

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

    public RemovePublicIpsFromEpnInstanceResponse removePublicIpsFromEpnInstance(RemovePublicIpsFromEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removePublicIpsFromEpnInstanceWithOptions(request, runtime);
    }

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

    public RemoveVSwitchesFromEpnInstanceResponse removeVSwitchesFromEpnInstance(RemoveVSwitchesFromEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeVSwitchesFromEpnInstanceWithOptions(request, runtime);
    }

    public RenewARMServerInstanceResponse renewARMServerInstanceWithOptions(RenewARMServerInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

    public RenewARMServerInstanceResponse renewARMServerInstance(RenewARMServerInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewARMServerInstanceWithOptions(request, runtime);
    }

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

    public RenewInstanceResponse renewInstance(RenewInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewInstanceWithOptions(request, runtime);
    }

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

    public RescaleApplicationResponse rescaleApplication(RescaleApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rescaleApplicationWithOptions(request, runtime);
    }

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

    public RescaleDeviceServiceResponse rescaleDeviceService(RescaleDeviceServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rescaleDeviceServiceWithOptions(request, runtime);
    }

    public ResetAICInstanceResponse resetAICInstanceWithOptions(ResetAICInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ResetAICInstanceShrinkRequest request = new ResetAICInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceIds)) {
            request.instanceIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceIds, "InstanceIds", "json");
        }

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

    public ResetAICInstanceResponse resetAICInstance(ResetAICInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAICInstanceWithOptions(request, runtime);
    }

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

    public ResetDeviceInstanceResponse resetDeviceInstance(ResetDeviceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetDeviceInstanceWithOptions(request, runtime);
    }

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

    public ResetDiskResponse resetDisk(ResetDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetDiskWithOptions(request, runtime);
    }

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

    public ResizeDiskResponse resizeDisk(ResizeDiskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resizeDiskWithOptions(request, runtime);
    }

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

    public RestartDeviceInstanceResponse restartDeviceInstance(RestartDeviceInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDeviceInstanceWithOptions(request, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public RevokeSecurityGroupResponse revokeSecurityGroup(RevokeSecurityGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeSecurityGroupWithOptions(request, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public RevokeSecurityGroupEgressResponse revokeSecurityGroupEgress(RevokeSecurityGroupEgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeSecurityGroupEgressWithOptions(request, runtime);
    }

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

    public RollbackApplicationResponse rollbackApplication(RollbackApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackApplicationWithOptions(request, runtime);
    }

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

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenew)) {
            query.put("AutoRenew", request.autoRenew);
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

        if (!com.aliyun.teautil.Common.isUnset(request.systemDiskShrink)) {
            query.put("SystemDisk", request.systemDiskShrink);
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

    public RunInstancesResponse runInstances(RunInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runInstancesWithOptions(request, runtime);
    }

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

    public RunServiceScheduleResponse runServiceSchedule(RunServiceScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.runServiceScheduleWithOptions(request, runtime);
    }

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

    public SetBackendServersResponse setBackendServers(SetBackendServersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setBackendServersWithOptions(request, runtime);
    }

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

    public SetLoadBalancerHTTPListenerAttributeResponse setLoadBalancerHTTPListenerAttribute(SetLoadBalancerHTTPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerHTTPListenerAttributeWithOptions(request, runtime);
    }

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

    public SetLoadBalancerHTTPSListenerAttributeResponse setLoadBalancerHTTPSListenerAttribute(SetLoadBalancerHTTPSListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerHTTPSListenerAttributeWithOptions(request, runtime);
    }

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

    public SetLoadBalancerStatusResponse setLoadBalancerStatus(SetLoadBalancerStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerStatusWithOptions(request, runtime);
    }

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

    public SetLoadBalancerTCPListenerAttributeResponse setLoadBalancerTCPListenerAttribute(SetLoadBalancerTCPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerTCPListenerAttributeWithOptions(request, runtime);
    }

    /**
      * @deprecated
      *
      * @param request SetLoadBalancerUDPListenerAttributeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return SetLoadBalancerUDPListenerAttributeResponse
     */
    // Deprecated
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
      * @deprecated
      *
      * @param request SetLoadBalancerUDPListenerAttributeRequest
      * @return SetLoadBalancerUDPListenerAttributeResponse
     */
    // Deprecated
    public SetLoadBalancerUDPListenerAttributeResponse setLoadBalancerUDPListenerAttribute(SetLoadBalancerUDPListenerAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setLoadBalancerUDPListenerAttributeWithOptions(request, runtime);
    }

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

    public StartEpnInstanceResponse startEpnInstance(StartEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startEpnInstanceWithOptions(request, runtime);
    }

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

    public StartInstanceResponse startInstance(StartInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstanceWithOptions(request, runtime);
    }

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

    public StartInstancesResponse startInstances(StartInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startInstancesWithOptions(request, runtime);
    }

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

    public StartLoadBalancerListenerResponse startLoadBalancerListener(StartLoadBalancerListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startLoadBalancerListenerWithOptions(request, runtime);
    }

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

    public StopEpnInstanceResponse stopEpnInstance(StopEpnInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopEpnInstanceWithOptions(request, runtime);
    }

    public StopInstanceResponse stopInstanceWithOptions(StopInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.forceStop)) {
            query.put("ForceStop", request.forceStop);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.version)) {
            query.put("Version", request.version);
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

    public StopInstanceResponse stopInstance(StopInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstanceWithOptions(request, runtime);
    }

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

    public StopInstancesResponse stopInstances(StopInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopInstancesWithOptions(request, runtime);
    }

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

    public StopLoadBalancerListenerResponse stopLoadBalancerListener(StopLoadBalancerListenerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopLoadBalancerListenerWithOptions(request, runtime);
    }

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

    public UnAssociateEnsEipAddressResponse unAssociateEnsEipAddress(UnAssociateEnsEipAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unAssociateEnsEipAddressWithOptions(request, runtime);
    }

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

    public UnassignPrivateIpAddressesResponse unassignPrivateIpAddresses(UnassignPrivateIpAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassignPrivateIpAddressesWithOptions(request, runtime);
    }

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

    public UnassociateNetworkAclResponse unassociateNetworkAcl(UnassociateNetworkAclRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassociateNetworkAclWithOptions(request, runtime);
    }

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

    public UpdateEnsSaleControlResponse updateEnsSaleControl(UpdateEnsSaleControlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateEnsSaleControlWithOptions(request, runtime);
    }

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

    public UpgradeAICInstanceImageResponse upgradeAICInstanceImage(UpgradeAICInstanceImageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeAICInstanceImageWithOptions(request, runtime);
    }

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

    public UpgradeApplicationResponse upgradeApplication(UpgradeApplicationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeApplicationWithOptions(request, runtime);
    }
}
