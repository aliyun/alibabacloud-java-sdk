// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530;

import com.aliyun.tea.*;
import com.aliyun.eflo20220530.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("eflo", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Apply for a secondary private IP address for the specified Lingjun Elastic Network Interface.</p>
     * <ul>
     * <li>If the PrivateIp field is empty, a secondary private IP address is automatically assigned and the unique identifier of the IP address is returned.</li>
     * <li>You can use the GetLeniPrivateIpAddress or ListLeniPrivateIpAddresses interface to check whether the secondary private IP address is assigned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Apply for a secondary private IP address for the current Lingjun Elastic Network Interface. You can automatically assign a secondary private IP address.</p>
     * 
     * @param request AssignLeniPrivateIpAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssignLeniPrivateIpAddressResponse
     */
    public AssignLeniPrivateIpAddressResponse assignLeniPrivateIpAddressWithOptions(AssignLeniPrivateIpAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticNetworkInterfaceId)) {
            body.put("ElasticNetworkInterfaceId", request.elasticNetworkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            body.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignLeniPrivateIpAddress"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AssignLeniPrivateIpAddressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AssignLeniPrivateIpAddressResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Apply for a secondary private IP address for the specified Lingjun Elastic Network Interface.</p>
     * <ul>
     * <li>If the PrivateIp field is empty, a secondary private IP address is automatically assigned and the unique identifier of the IP address is returned.</li>
     * <li>You can use the GetLeniPrivateIpAddress or ListLeniPrivateIpAddresses interface to check whether the secondary private IP address is assigned.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Apply for a secondary private IP address for the current Lingjun Elastic Network Interface. You can automatically assign a secondary private IP address.</p>
     * 
     * @param request AssignLeniPrivateIpAddressRequest
     * @return AssignLeniPrivateIpAddressResponse
     */
    public AssignLeniPrivateIpAddressResponse assignLeniPrivateIpAddress(AssignLeniPrivateIpAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignLeniPrivateIpAddressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Apply for secondary private IP addresses</p>
     * </blockquote>
     * <ul>
     * <li>By default, each network interface controller can apply for three secondary private IP addresses. If the quota is exceeded, contact the administrator.</li>
     * <li>The secondary private IP address is allocated from the Lingjun subnet to which the current network interface controller belongs. The first address and the last two addresses belong to reserved addresses and do not participate in the allocation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Applies for a private secondary IP address for the current LNI. You can also call this operation to assign a secondary MAC address to the current LNI.</p>
     * 
     * @param request AssignPrivateIpAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssignPrivateIpAddressResponse
     */
    public AssignPrivateIpAddressResponse assignPrivateIpAddressWithOptions(AssignPrivateIpAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.assignMac)) {
            body.put("AssignMac", request.assignMac);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceId)) {
            body.put("NetworkInterfaceId", request.networkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            body.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipConfig)) {
            body.put("SkipConfig", request.skipConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subnetId)) {
            body.put("SubnetId", request.subnetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssignPrivateIpAddress"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AssignPrivateIpAddressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AssignPrivateIpAddressResponse());
        }

    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Apply for secondary private IP addresses</p>
     * </blockquote>
     * <ul>
     * <li>By default, each network interface controller can apply for three secondary private IP addresses. If the quota is exceeded, contact the administrator.</li>
     * <li>The secondary private IP address is allocated from the Lingjun subnet to which the current network interface controller belongs. The first address and the last two addresses belong to reserved addresses and do not participate in the allocation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Applies for a private secondary IP address for the current LNI. You can also call this operation to assign a secondary MAC address to the current LNI.</p>
     * 
     * @param request AssignPrivateIpAddressRequest
     * @return AssignPrivateIpAddressResponse
     */
    public AssignPrivateIpAddressResponse assignPrivateIpAddress(AssignPrivateIpAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.assignPrivateIpAddressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> <strong>Add a CIDR block</strong></p>
     * </blockquote>
     * <ul>
     * <li>The CIDR block cannot start with 0. The subnet mask must be 8 to 28 bits in length.</li>
     * <li>The secondary IPv4 CIDR block must not overlap with the primary IPv4 CIDR block of the Lingjun CIDR block and the added secondary IPv4 CIDR block.</li>
     * <li>You cannot use 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 as the CIDR block of Lingjun. Example: In the Lingjun CIDR block whose primary IPv4 CIDR block is 192.168.0.0/16, you cannot add the following CIDR blocks as additional IPv4 CIDR blocks. The CIDR block that is in the same range as 192.168.0.0/16. A CIDR block that is larger than 192.168.0.0/16. Example: 192.168.0.0/8. A CIDR block that is smaller than 192.168.0.0/16. Example: 192.168.0.0/24.</li>
     * <li>By default, each tenant can create three additional CIDR blocks in each region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>When the VPD primary network segment address is not enough to allocate, you can choose to create an additional network segment as the additional network segment of the VPD primary network segment.</p>
     * 
     * @param request AssociateVpdCidrBlockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AssociateVpdCidrBlockResponse
     */
    public AssociateVpdCidrBlockResponse associateVpdCidrBlockWithOptions(AssociateVpdCidrBlockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryCidrBlock)) {
            body.put("SecondaryCidrBlock", request.secondaryCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AssociateVpdCidrBlock"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AssociateVpdCidrBlockResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AssociateVpdCidrBlockResponse());
        }

    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> <strong>Add a CIDR block</strong></p>
     * </blockquote>
     * <ul>
     * <li>The CIDR block cannot start with 0. The subnet mask must be 8 to 28 bits in length.</li>
     * <li>The secondary IPv4 CIDR block must not overlap with the primary IPv4 CIDR block of the Lingjun CIDR block and the added secondary IPv4 CIDR block.</li>
     * <li>You cannot use 100.64.0.0/10, 224.0.0.0/4, 127.0.0.0/8, or 169.254.0.0/16 as the CIDR block of Lingjun. Example: In the Lingjun CIDR block whose primary IPv4 CIDR block is 192.168.0.0/16, you cannot add the following CIDR blocks as additional IPv4 CIDR blocks. The CIDR block that is in the same range as 192.168.0.0/16. A CIDR block that is larger than 192.168.0.0/16. Example: 192.168.0.0/8. A CIDR block that is smaller than 192.168.0.0/16. Example: 192.168.0.0/24.</li>
     * <li>By default, each tenant can create three additional CIDR blocks in each region.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>When the VPD primary network segment address is not enough to allocate, you can choose to create an additional network segment as the additional network segment of the VPD primary network segment.</p>
     * 
     * @param request AssociateVpdCidrBlockRequest
     * @return AssociateVpdCidrBlockResponse
     */
    public AssociateVpdCidrBlockResponse associateVpdCidrBlock(AssociateVpdCidrBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.associateVpdCidrBlockWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This interface is an asynchronous interface. You need to use the query interface to wait for the Lingjun Elastic Network Interface to reach the available state.</p>
     * 
     * <b>summary</b> : 
     * <p>Lingjun ENI is bound to NC.</p>
     * 
     * @param request AttachElasticNetworkInterfaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachElasticNetworkInterfaceResponse
     */
    public AttachElasticNetworkInterfaceResponse attachElasticNetworkInterfaceWithOptions(AttachElasticNetworkInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticNetworkInterfaceId)) {
            body.put("ElasticNetworkInterfaceId", request.elasticNetworkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachElasticNetworkInterface"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new AttachElasticNetworkInterfaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new AttachElasticNetworkInterfaceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This interface is an asynchronous interface. You need to use the query interface to wait for the Lingjun Elastic Network Interface to reach the available state.</p>
     * 
     * <b>summary</b> : 
     * <p>Lingjun ENI is bound to NC.</p>
     * 
     * @param request AttachElasticNetworkInterfaceRequest
     * @return AttachElasticNetworkInterfaceResponse
     */
    public AttachElasticNetworkInterfaceResponse attachElasticNetworkInterface(AttachElasticNetworkInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachElasticNetworkInterfaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an LENI.</p>
     * 
     * @param request CreateElasticNetworkInterfaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateElasticNetworkInterfaceResponse
     */
    public CreateElasticNetworkInterfaceResponse createElasticNetworkInterfaceWithOptions(CreateElasticNetworkInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableJumboFrame)) {
            body.put("EnableJumboFrame", request.enableJumboFrame);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            body.put("SecurityGroupId", request.securityGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            body.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateElasticNetworkInterface"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateElasticNetworkInterfaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateElasticNetworkInterfaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Creates an LENI.</p>
     * 
     * @param request CreateElasticNetworkInterfaceRequest
     * @return CreateElasticNetworkInterfaceResponse
     */
    public CreateElasticNetworkInterfaceResponse createElasticNetworkInterface(CreateElasticNetworkInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createElasticNetworkInterfaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a Lingjun HUB, note that:</p>
     * <ul>
     * <li>Make sure that you have sufficient Lingjun HUB quota.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the system will return the ID of a Lingjun HUB. At this time, the Lingjun HUB instance may not be created yet, and the system background creation task is still in progress. You can call the ListErs or GetEr operation to query the status of the Lingjun HUB.<ul>
     * <li>If the status of the Lingjun HUB is Executing, it indicates that it is being created.</li>
     * <li>If the status of the Lingjun HUB is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a Lingjun HUB.</p>
     * 
     * @param request CreateErRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateErResponse
     */
    public CreateErResponse createErWithOptions(CreateErRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erName)) {
            body.put("ErName", request.erName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterZoneId)) {
            body.put("MasterZoneId", request.masterZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateEr"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateErResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateErResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a Lingjun HUB, note that:</p>
     * <ul>
     * <li>Make sure that you have sufficient Lingjun HUB quota.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the system will return the ID of a Lingjun HUB. At this time, the Lingjun HUB instance may not be created yet, and the system background creation task is still in progress. You can call the ListErs or GetEr operation to query the status of the Lingjun HUB.<ul>
     * <li>If the status of the Lingjun HUB is Executing, it indicates that it is being created.</li>
     * <li>If the status of the Lingjun HUB is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a Lingjun HUB.</p>
     * 
     * @param request CreateErRequest
     * @return CreateErResponse
     */
    public CreateErResponse createEr(CreateErRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createErWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a network instance connection, note that:</p>
     * <ul>
     * <li>Make sure that you have created a Lingjun HUB instance.</li>
     * <li>Make sure that you have sufficient quota for network instance connections.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the system returns the ID of the network instance connection. In this case, the network instance connection may not be created yet, and the system is still creating the network instance in the background. You can query the connection status of a network instance by ListErAttachments or GetErAttachment:<ul>
     * <li>If the connection status of the network instance is Executing, the network instance is being created.</li>
     * <li>If the connection status of the network instance is Available, the network instance is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a network instance connection.</p>
     * 
     * @param request CreateErAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateErAttachmentResponse
     */
    public CreateErAttachmentResponse createErAttachmentWithOptions(CreateErAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoReceiveAllRoute)) {
            body.put("AutoReceiveAllRoute", request.autoReceiveAllRoute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erAttachmentName)) {
            body.put("ErAttachmentName", request.erAttachmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTenantId)) {
            body.put("ResourceTenantId", request.resourceTenantId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateErAttachment"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateErAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateErAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a network instance connection, note that:</p>
     * <ul>
     * <li>Make sure that you have created a Lingjun HUB instance.</li>
     * <li>Make sure that you have sufficient quota for network instance connections.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the system returns the ID of the network instance connection. In this case, the network instance connection may not be created yet, and the system is still creating the network instance in the background. You can query the connection status of a network instance by ListErAttachments or GetErAttachment:<ul>
     * <li>If the connection status of the network instance is Executing, the network instance is being created.</li>
     * <li>If the connection status of the network instance is Available, the network instance is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a network instance connection.</p>
     * 
     * @param request CreateErAttachmentRequest
     * @return CreateErAttachmentResponse
     */
    public CreateErAttachmentResponse createErAttachment(CreateErAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createErAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a routing policy, note that:</p>
     * <ul>
     * <li>Make sure that you have created a Lingjun HUB instance.</li>
     * <li>Make sure that you have created a network instance connection.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the system returns the ID of the routing policy. In this case, the routing policy instance may not be created yet, and the system background creation task is still in progress. You can use ListErRouteMaps or GetErRouteMap to query the status of a routing policy.<ul>
     * <li>If the status of the routing policy is Execute, the system is creating the instance.</li>
     * <li>If the status of the routing policy is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Users can use this API to create routing policy by specifying the network instance connection under Lingjun HUB.</p>
     * 
     * @param request CreateErRouteMapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateErRouteMapResponse
     */
    public CreateErRouteMapResponse createErRouteMapWithOptions(CreateErRouteMapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            body.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receptionInstanceId)) {
            body.put("ReceptionInstanceId", request.receptionInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receptionInstanceOwner)) {
            body.put("ReceptionInstanceOwner", request.receptionInstanceOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receptionInstanceType)) {
            body.put("ReceptionInstanceType", request.receptionInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeMapAction)) {
            body.put("RouteMapAction", request.routeMapAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeMapNum)) {
            body.put("RouteMapNum", request.routeMapNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transmissionInstanceId)) {
            body.put("TransmissionInstanceId", request.transmissionInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transmissionInstanceOwner)) {
            body.put("TransmissionInstanceOwner", request.transmissionInstanceOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transmissionInstanceType)) {
            body.put("TransmissionInstanceType", request.transmissionInstanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateErRouteMap"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateErRouteMapResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateErRouteMapResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a routing policy, note that:</p>
     * <ul>
     * <li>Make sure that you have created a Lingjun HUB instance.</li>
     * <li>Make sure that you have created a network instance connection.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the system returns the ID of the routing policy. In this case, the routing policy instance may not be created yet, and the system background creation task is still in progress. You can use ListErRouteMaps or GetErRouteMap to query the status of a routing policy.<ul>
     * <li>If the status of the routing policy is Execute, the system is creating the instance.</li>
     * <li>If the status of the routing policy is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Users can use this API to create routing policy by specifying the network instance connection under Lingjun HUB.</p>
     * 
     * @param request CreateErRouteMapRequest
     * @return CreateErRouteMapResponse
     */
    public CreateErRouteMapResponse createErRouteMap(CreateErRouteMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createErRouteMapWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a Lingjun subnet, note that:</p>
     * <ul>
     * <li>You have created a Lingjun CIDR block.</li>
     * <li>Only one network segment can be specified for a Lingjun subnet.</li>
     * <li>The network segment cannot be modified after the Lingjun subnet is created.</li>
     * <li>Make sure that you have sufficient Lingjun subnet quota.</li>
     * <li>This interface is an asynchronous interface. After calling this interface, the system will return the ID of a Lingjun subnet. At this time, the Lingjun network segment may not be created yet, and the system background creation task is still in progress. You can call the ListSubnets or GetSubnet operation to query the status of the CIDR block of Lingjun.<ul>
     * <li>If the status of the Lingjun subnet is Executed, it indicates that it is being created.</li>
     * <li>If the status of the Lingjun subnet is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Users can use this API to create a Lingjun subnet under the Lingjun network segment.</p>
     * 
     * @param request CreateSubnetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSubnetResponse
     */
    public CreateSubnetResponse createSubnetWithOptions(CreateSubnetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidr)) {
            body.put("Cidr", request.cidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subnetName)) {
            body.put("SubnetName", request.subnetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSubnet"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSubnetResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateSubnetResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a Lingjun subnet, note that:</p>
     * <ul>
     * <li>You have created a Lingjun CIDR block.</li>
     * <li>Only one network segment can be specified for a Lingjun subnet.</li>
     * <li>The network segment cannot be modified after the Lingjun subnet is created.</li>
     * <li>Make sure that you have sufficient Lingjun subnet quota.</li>
     * <li>This interface is an asynchronous interface. After calling this interface, the system will return the ID of a Lingjun subnet. At this time, the Lingjun network segment may not be created yet, and the system background creation task is still in progress. You can call the ListSubnets or GetSubnet operation to query the status of the CIDR block of Lingjun.<ul>
     * <li>If the status of the Lingjun subnet is Executed, it indicates that it is being created.</li>
     * <li>If the status of the Lingjun subnet is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Users can use this API to create a Lingjun subnet under the Lingjun network segment.</p>
     * 
     * @param request CreateSubnetRequest
     * @return CreateSubnetResponse
     */
    public CreateSubnetResponse createSubnet(CreateSubnetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSubnetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a Lingjun connection, note that:</p>
     * <ul>
     * <li>When you specify the vccId parameter, the system will configure the purchased Lingjun connection for you. When the default vccId parameter is set, the system will automatically place an order and configure the Lingjun connection for you.</li>
     * <li>Make sure that you have called the InitializeVcc operation to grant permissions.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the system will return the Lingjun connection ID, but the Lingjun connection instance may not be created yet, and the system background creation task is still in progress. You can call the ListVccs or GetVcc operation to query the status of the Lingjun connection.<ul>
     * <li>If the status of the Lingjun connection is Executed, the Lingjun connection is being created.</li>
     * <li>If the status of the Lingjun connection is Available, the Lingjun connection is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can create a Lingjun connection to connect Lingjun network environment and Alibaba Cloud network environment.</p>
     * 
     * @param request CreateVccRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVccResponse
     */
    public CreateVccResponse createVccWithOptions(CreateVccRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accessCouldService)) {
            body.put("AccessCouldService", request.accessCouldService);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            body.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgpAsn)) {
            body.put("BgpAsn", request.bgpAsn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bgpCidr)) {
            body.put("BgpCidr", request.bgpCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            body.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenOwnerId)) {
            body.put("CenOwnerId", request.cenOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionType)) {
            body.put("ConnectionType", request.connectionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            body.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccId)) {
            body.put("VccId", request.vccId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccName)) {
            body.put("VccName", request.vccName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVcc"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVccResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateVccResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a Lingjun connection, note that:</p>
     * <ul>
     * <li>When you specify the vccId parameter, the system will configure the purchased Lingjun connection for you. When the default vccId parameter is set, the system will automatically place an order and configure the Lingjun connection for you.</li>
     * <li>Make sure that you have called the InitializeVcc operation to grant permissions.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the system will return the Lingjun connection ID, but the Lingjun connection instance may not be created yet, and the system background creation task is still in progress. You can call the ListVccs or GetVcc operation to query the status of the Lingjun connection.<ul>
     * <li>If the status of the Lingjun connection is Executed, the Lingjun connection is being created.</li>
     * <li>If the status of the Lingjun connection is Available, the Lingjun connection is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>You can create a Lingjun connection to connect Lingjun network environment and Alibaba Cloud network environment.</p>
     * 
     * @param request CreateVccRequest
     * @return CreateVccResponse
     */
    public CreateVccResponse createVcc(CreateVccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVccWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create cross-account authorization for Lingjun HUB, note that:</p>
     * <ul>
     * <li>Make sure that the Alibaba Cloud ID and Lingjun HUB instance that you want to authorize are correct.</li>
     * <li>If you authorize the account of the other party, the account of the other party can load your local network instance to its Lingjun HUB, and the other party\&quot;s network will be connected to your network. Please proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Users can use this API to connect Lingjun instance to the Lingjun HUB instance of the target account. After authorization, the target account can be associated with your Lingjun connection by using the authorized Lingjun HUB instance.</p>
     * 
     * @param request CreateVccGrantRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVccGrantRuleResponse
     */
    public CreateVccGrantRuleResponse createVccGrantRuleWithOptions(CreateVccGrantRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantTenantId)) {
            body.put("GrantTenantId", request.grantTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVccGrantRule"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVccGrantRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateVccGrantRuleResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create cross-account authorization for Lingjun HUB, note that:</p>
     * <ul>
     * <li>Make sure that the Alibaba Cloud ID and Lingjun HUB instance that you want to authorize are correct.</li>
     * <li>If you authorize the account of the other party, the account of the other party can load your local network instance to its Lingjun HUB, and the other party\&quot;s network will be connected to your network. Please proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Users can use this API to connect Lingjun instance to the Lingjun HUB instance of the target account. After authorization, the target account can be associated with your Lingjun connection by using the authorized Lingjun HUB instance.</p>
     * 
     * @param request CreateVccGrantRuleRequest
     * @return CreateVccGrantRuleResponse
     */
    public CreateVccGrantRuleResponse createVccGrantRule(CreateVccGrantRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVccGrantRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a VBR route entry, take note of the following items:</p>
     * <ul>
     * <li>After you call this operation, static route entries and BGP network announcements are created on the VBR to which the Lingjun connection belongs.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the VBR static route entry may not be created yet, and the system still creates the static route entry in the background. You can query the status of VBR static route entries by ListVccRouteEntries or GetVccRouteEntry:<ul>
     * <li>If the VBR static route entry is in the Executing state, it indicates that it is being created.</li>
     * <li>If the status of the VBR static route entry is Available, the VBR is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a Lingjun connection route entry.</p>
     * 
     * @param request CreateVccRouteEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVccRouteEntryResponse
     */
    public CreateVccRouteEntryResponse createVccRouteEntryWithOptions(CreateVccRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            body.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccId)) {
            body.put("VccId", request.vccId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVccRouteEntry"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVccRouteEntryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateVccRouteEntryResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a VBR route entry, take note of the following items:</p>
     * <ul>
     * <li>After you call this operation, static route entries and BGP network announcements are created on the VBR to which the Lingjun connection belongs.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the VBR static route entry may not be created yet, and the system still creates the static route entry in the background. You can query the status of VBR static route entries by ListVccRouteEntries or GetVccRouteEntry:<ul>
     * <li>If the VBR static route entry is in the Executing state, it indicates that it is being created.</li>
     * <li>If the status of the VBR static route entry is Available, the VBR is created.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a Lingjun connection route entry.</p>
     * 
     * @param request CreateVccRouteEntryRequest
     * @return CreateVccRouteEntryResponse
     */
    public CreateVccRouteEntryResponse createVccRouteEntry(CreateVccRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVccRouteEntryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a CIDR block for Lingjun, take note of the following:</p>
     * <ul>
     * <li>A Lingjun network segment can specify an additional network segment in addition to a main network segment.</li>
     * <li>After the Lingjun network segment is created, the network segment cannot be modified.</li>
     * <li>Make sure that you have a sufficient quota of Lingjun CIDR blocks.</li>
     * <li>This interface is an asynchronous interface. After calling this interface, the system will return the ID of a Lingjun network segment. At this time, the Lingjun network segment may not be created yet, and the system background creation task is still in progress. You can call the ListVpds or GetVpd operation to query the status of the CIDR block of Lingjun.<ul>
     * <li>If the status of the Lingjun CIDR block is Executed, the CIDR block is being created.</li>
     * <li>If the status of the Lingjun CIDR block is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a private Lingjun CIDR block. This CIDR block has an independent network environment.</p>
     * 
     * @param request CreateVpdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVpdResponse
     */
    public CreateVpdResponse createVpdWithOptions(CreateVpdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cidr)) {
            body.put("Cidr", request.cidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subnets)) {
            body.put("Subnets", request.subnets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdName)) {
            body.put("VpdName", request.vpdName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpd"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpdResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateVpdResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create a CIDR block for Lingjun, take note of the following:</p>
     * <ul>
     * <li>A Lingjun network segment can specify an additional network segment in addition to a main network segment.</li>
     * <li>After the Lingjun network segment is created, the network segment cannot be modified.</li>
     * <li>Make sure that you have a sufficient quota of Lingjun CIDR blocks.</li>
     * <li>This interface is an asynchronous interface. After calling this interface, the system will return the ID of a Lingjun network segment. At this time, the Lingjun network segment may not be created yet, and the system background creation task is still in progress. You can call the ListVpds or GetVpd operation to query the status of the CIDR block of Lingjun.<ul>
     * <li>If the status of the Lingjun CIDR block is Executed, the CIDR block is being created.</li>
     * <li>If the status of the Lingjun CIDR block is Available, the creation is successful.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Create a private Lingjun CIDR block. This CIDR block has an independent network environment.</p>
     * 
     * @param request CreateVpdRequest
     * @return CreateVpdResponse
     */
    public CreateVpdResponse createVpd(CreateVpdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create cross-account authorization for Lingjun HUB, note that:</p>
     * <ul>
     * <li>Make sure that the Alibaba Cloud ID and Lingjun HUB instance that you want to authorize are correct.</li>
     * <li>If you authorize the account of the other party, the account of the other party can load your local network instance to its Lingjun HUB, and the other party\&quot;s network will be connected to your network. Please proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Users can use this API to authorize Lingjun HUB instances of the target account. After authorization, the target account can be associated with your Lingjun CIDR block by using the authorized Lingjun HUB instance.</p>
     * 
     * @param request CreateVpdGrantRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVpdGrantRuleResponse
     */
    public CreateVpdGrantRuleResponse createVpdGrantRuleWithOptions(CreateVpdGrantRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantTenantId)) {
            body.put("GrantTenantId", request.grantTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVpdGrantRule"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVpdGrantRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new CreateVpdGrantRuleResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to create cross-account authorization for Lingjun HUB, note that:</p>
     * <ul>
     * <li>Make sure that the Alibaba Cloud ID and Lingjun HUB instance that you want to authorize are correct.</li>
     * <li>If you authorize the account of the other party, the account of the other party can load your local network instance to its Lingjun HUB, and the other party\&quot;s network will be connected to your network. Please proceed with caution.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Users can use this API to authorize Lingjun HUB instances of the target account. After authorization, the target account can be associated with your Lingjun CIDR block by using the authorized Lingjun HUB instance.</p>
     * 
     * @param request CreateVpdGrantRuleRequest
     * @return CreateVpdGrantRuleResponse
     */
    public CreateVpdGrantRuleResponse createVpdGrantRule(CreateVpdGrantRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVpdGrantRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Lingjun Elastic Network Interface. After deletion, all relevant data will be lost and cannot be recovered. Please operate with caution.</p>
     * 
     * @param request DeleteElasticNetworkInterfaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteElasticNetworkInterfaceResponse
     */
    public DeleteElasticNetworkInterfaceResponse deleteElasticNetworkInterfaceWithOptions(DeleteElasticNetworkInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticNetworkInterfaceId)) {
            body.put("ElasticNetworkInterfaceId", request.elasticNetworkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteElasticNetworkInterface"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteElasticNetworkInterfaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteElasticNetworkInterfaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Delete Lingjun Elastic Network Interface. After deletion, all relevant data will be lost and cannot be recovered. Please operate with caution.</p>
     * 
     * @param request DeleteElasticNetworkInterfaceRequest
     * @return DeleteElasticNetworkInterfaceResponse
     */
    public DeleteElasticNetworkInterfaceResponse deleteElasticNetworkInterface(DeleteElasticNetworkInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteElasticNetworkInterfaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete the Lingjun HUB, note that:</p>
     * <ul>
     * <li>Before you delete the instance, make sure that no network instance is connected to the Lingjun HUB instance.</li>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the Lingjun HUB instance may not be deleted, and the system background deletion task is still in progress. You can call the ListErs or GetEr operation to query the deletion status of the Lingjun HUB.<ul>
     * <li>If the status of the Lingjun HUB is Deleting, the Lingjun HUB instance is being deleted.</li>
     * <li>If no Lingjun HUB instance is recorded, the Lingjun HUB instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>After you delete a Lingjun HUB instance, the related data is lost and cannot be recovered.</p>
     * 
     * @param request DeleteErRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteErResponse
     */
    public DeleteErResponse deleteErWithOptions(DeleteErRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteEr"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteErResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteErResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete the Lingjun HUB, note that:</p>
     * <ul>
     * <li>Before you delete the instance, make sure that no network instance is connected to the Lingjun HUB instance.</li>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the Lingjun HUB instance may not be deleted, and the system background deletion task is still in progress. You can call the ListErs or GetEr operation to query the deletion status of the Lingjun HUB.<ul>
     * <li>If the status of the Lingjun HUB is Deleting, the Lingjun HUB instance is being deleted.</li>
     * <li>If no Lingjun HUB instance is recorded, the Lingjun HUB instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>After you delete a Lingjun HUB instance, the related data is lost and cannot be recovered.</p>
     * 
     * @param request DeleteErRequest
     * @return DeleteErResponse
     */
    public DeleteErResponse deleteEr(DeleteErRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteErWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a network instance connection, take note of the following:</p>
     * <ul>
     * <li>Before you delete the instance, make sure that no routing policy exists under the network instance connection instance.</li>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the network instance that is connected to the instance may not be deleted. The system still deletes the instance in the background. You can call the ListErAttachments or GetErAttachment to query the deletion status of network instance connections:<ul>
     * <li>If the status of the network instance connection is Deleting, the network instance connection is being deleted.</li>
     * <li>If there is no connection record for the network instance, the connection to the network instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>If you delete a network instance that is connected to an instance, the related data is lost and cannot be recovered.</p>
     * 
     * @param request DeleteErAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteErAttachmentResponse
     */
    public DeleteErAttachmentResponse deleteErAttachmentWithOptions(DeleteErAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erAttachmentId)) {
            body.put("ErAttachmentId", request.erAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteErAttachment"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteErAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteErAttachmentResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a network instance connection, take note of the following:</p>
     * <ul>
     * <li>Before you delete the instance, make sure that no routing policy exists under the network instance connection instance.</li>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the network instance that is connected to the instance may not be deleted. The system still deletes the instance in the background. You can call the ListErAttachments or GetErAttachment to query the deletion status of network instance connections:<ul>
     * <li>If the status of the network instance connection is Deleting, the network instance connection is being deleted.</li>
     * <li>If there is no connection record for the network instance, the connection to the network instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>If you delete a network instance that is connected to an instance, the related data is lost and cannot be recovered.</p>
     * 
     * @param request DeleteErAttachmentRequest
     * @return DeleteErAttachmentResponse
     */
    public DeleteErAttachmentResponse deleteErAttachment(DeleteErAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteErAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a routing policy, note that:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the routing policy instance may not be deleted yet, and the system background deletion task is still in progress. You can call the ListErRouteMaps or GetErRouteMap operation to query the deletion status of a routing policy.<ul>
     * <li>If the routing policy is in the Deleting state, the routing policy instance is being deleted.</li>
     * <li>If no routing policy instance is recorded, the routing policy instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>If you delete a routing policy instance, the related data is lost and cannot be recovered.</p>
     * 
     * @param request DeleteErRouteMapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteErRouteMapResponse
     */
    public DeleteErRouteMapResponse deleteErRouteMapWithOptions(DeleteErRouteMapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erRouteMapIds)) {
            body.put("ErRouteMapIds", request.erRouteMapIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteErRouteMap"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteErRouteMapResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteErRouteMapResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a routing policy, note that:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the routing policy instance may not be deleted yet, and the system background deletion task is still in progress. You can call the ListErRouteMaps or GetErRouteMap operation to query the deletion status of a routing policy.<ul>
     * <li>If the routing policy is in the Deleting state, the routing policy instance is being deleted.</li>
     * <li>If no routing policy instance is recorded, the routing policy instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>If you delete a routing policy instance, the related data is lost and cannot be recovered.</p>
     * 
     * @param request DeleteErRouteMapRequest
     * @return DeleteErRouteMapResponse
     */
    public DeleteErRouteMapResponse deleteErRouteMap(DeleteErRouteMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteErRouteMapWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a Lingjun subnet, note that:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the Lingjun subnet instance may not be deleted, and the system background deletion task is still in progress. You can call the ListSubnets or GetSubnet operation to query the deletion status of the subnet.<ul>
     * <li>If the status of the Lingjun subnet is Deleting, the Lingjun subnet instance is being deleted.</li>
     * <li>If there is no record of the Lingjun subnet instance, the Lingjun subnet instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>If you delete a Lingjun subnet instance, the related data is lost and cannot be recovered.</p>
     * 
     * @param request DeleteSubnetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSubnetResponse
     */
    public DeleteSubnetResponse deleteSubnetWithOptions(DeleteSubnetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subnetId)) {
            body.put("SubnetId", request.subnetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSubnet"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSubnetResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteSubnetResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a Lingjun subnet, note that:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the Lingjun subnet instance may not be deleted, and the system background deletion task is still in progress. You can call the ListSubnets or GetSubnet operation to query the deletion status of the subnet.<ul>
     * <li>If the status of the Lingjun subnet is Deleting, the Lingjun subnet instance is being deleted.</li>
     * <li>If there is no record of the Lingjun subnet instance, the Lingjun subnet instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>If you delete a Lingjun subnet instance, the related data is lost and cannot be recovered.</p>
     * 
     * @param request DeleteSubnetRequest
     * @return DeleteSubnetResponse
     */
    public DeleteSubnetResponse deleteSubnet(DeleteSubnetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSubnetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>If you delete a Lingjun HUB cross-account authorization that is connected to Lingjun, the related data is lost and cannot be recovered.</p>
     * 
     * @param request DeleteVccGrantRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVccGrantRuleResponse
     */
    public DeleteVccGrantRuleResponse deleteVccGrantRuleWithOptions(DeleteVccGrantRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantRuleId)) {
            body.put("GrantRuleId", request.grantRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVccGrantRule"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVccGrantRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteVccGrantRuleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>If you delete a Lingjun HUB cross-account authorization that is connected to Lingjun, the related data is lost and cannot be recovered.</p>
     * 
     * @param request DeleteVccGrantRuleRequest
     * @return DeleteVccGrantRuleResponse
     */
    public DeleteVccGrantRuleResponse deleteVccGrantRule(DeleteVccGrantRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVccGrantRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a VBR static route entry, note that:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the VBR static route entries may not be deleted. The system still deletes the VBR static route entries in the background. You can call the ListVccRouteEntries or GetVccRouteEntry to query the deletion status of VBR static route entries:<ul>
     * <li>If the VBR static route entry is in the Deleting state, the VBR static route entry is being deleted.</li>
     * <li>If no VBR static route entry instance is recorded, the VBR static route entry instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Delete a Lingjun connection route entry.</p>
     * 
     * @param request DeleteVccRouteEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVccRouteEntryResponse
     */
    public DeleteVccRouteEntryResponse deleteVccRouteEntryWithOptions(DeleteVccRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            body.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccId)) {
            body.put("VccId", request.vccId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccRouteEntryId)) {
            body.put("VccRouteEntryId", request.vccRouteEntryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVccRouteEntry"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVccRouteEntryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteVccRouteEntryResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a VBR static route entry, note that:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>This operation is an asynchronous operation. After you call this operation, the VBR static route entries may not be deleted. The system still deletes the VBR static route entries in the background. You can call the ListVccRouteEntries or GetVccRouteEntry to query the deletion status of VBR static route entries:<ul>
     * <li>If the VBR static route entry is in the Deleting state, the VBR static route entry is being deleted.</li>
     * <li>If no VBR static route entry instance is recorded, the VBR static route entry instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Delete a Lingjun connection route entry.</p>
     * 
     * @param request DeleteVccRouteEntryRequest
     * @return DeleteVccRouteEntryResponse
     */
    public DeleteVccRouteEntryResponse deleteVccRouteEntry(DeleteVccRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVccRouteEntryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a Lingjun CIDR block, take note of the following items:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>Before deleting, make sure that all Lingjun subnet instances under the Lingjun CIDR block have been deleted.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the Lingjun network segment instance may not be deleted, and the system background deletion task is still in progress. You can call the ListVpds or GetVpd operation to query the deletion status of the CIDR block.<ul>
     * <li>If the status of the Lingjun CIDR block is Deleting, the Lingjun CIDR block is being deleted.</li>
     * <li>If there is no record of the Lingjun CIDR block instance, the Lingjun CIDR block instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>After you delete a Lingjun CIDR block, the related data is lost and cannot be recovered.</p>
     * 
     * @param request DeleteVpdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVpdResponse
     */
    public DeleteVpdResponse deleteVpdWithOptions(DeleteVpdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpd"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpdResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteVpdResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>When you call this operation to delete a Lingjun CIDR block, take note of the following items:</p>
     * <ul>
     * <li>After deletion, all related data is lost and cannot be recovered. Exercise caution when performing this operation.</li>
     * <li>Before deleting, make sure that all Lingjun subnet instances under the Lingjun CIDR block have been deleted.</li>
     * <li>This interface is an asynchronous interface. After this interface is called, the Lingjun network segment instance may not be deleted, and the system background deletion task is still in progress. You can call the ListVpds or GetVpd operation to query the deletion status of the CIDR block.<ul>
     * <li>If the status of the Lingjun CIDR block is Deleting, the Lingjun CIDR block is being deleted.</li>
     * <li>If there is no record of the Lingjun CIDR block instance, the Lingjun CIDR block instance has been deleted.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>After you delete a Lingjun CIDR block, the related data is lost and cannot be recovered.</p>
     * 
     * @param request DeleteVpdRequest
     * @return DeleteVpdResponse
     */
    public DeleteVpdResponse deleteVpd(DeleteVpdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the Lingjun HUB cross-account authorization for a Lingjun CIDR block. After the deletion, the related data is lost and cannot be recovered.</p>
     * 
     * @param request DeleteVpdGrantRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVpdGrantRuleResponse
     */
    public DeleteVpdGrantRuleResponse deleteVpdGrantRuleWithOptions(DeleteVpdGrantRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantRuleId)) {
            body.put("GrantRuleId", request.grantRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantTenantId)) {
            body.put("GrantTenantId", request.grantTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteVpdGrantRule"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVpdGrantRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DeleteVpdGrantRuleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Delete the Lingjun HUB cross-account authorization for a Lingjun CIDR block. After the deletion, the related data is lost and cannot be recovered.</p>
     * 
     * @param request DeleteVpdGrantRuleRequest
     * @return DeleteVpdGrantRuleResponse
     */
    public DeleteVpdGrantRuleResponse deleteVpdGrantRule(DeleteVpdGrantRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVpdGrantRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query whether a user account has a <strong>AliyunServiceRoleForEfloVcc</strong> role.</p>
     * <blockquote>
     * <p> If you do not have a <strong>AliyunServiceRoleForEfloVcc</strong> role, you need to use the initializeVcc interface to complete authorization, otherwise users will not be able to use Lingjun to connect to the product.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Query whether the user has the SLR role-AliyunServiceRoleForEfloVcc required for Lingjun connection.</p>
     * 
     * @param request DescribeSlrRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSlrResponse
     */
    public DescribeSlrResponse describeSlrWithOptions(DescribeSlrRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSlr"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSlrResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DescribeSlrResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query whether a user account has a <strong>AliyunServiceRoleForEfloVcc</strong> role.</p>
     * <blockquote>
     * <p> If you do not have a <strong>AliyunServiceRoleForEfloVcc</strong> role, you need to use the initializeVcc interface to complete authorization, otherwise users will not be able to use Lingjun to connect to the product.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Query whether the user has the SLR role-AliyunServiceRoleForEfloVcc required for Lingjun connection.</p>
     * 
     * @param request DescribeSlrRequest
     * @return DescribeSlrResponse
     */
    public DescribeSlrResponse describeSlr(DescribeSlrRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSlrWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This interface is an asynchronous interface, and you need to use the query interface to wait for the Lingjun Elastic Network Interface to reach the unbound state.</p>
     * 
     * <b>summary</b> : 
     * <p>Unbind Lingjun ENI from NC.</p>
     * 
     * @param request DetachElasticNetworkInterfaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachElasticNetworkInterfaceResponse
     */
    public DetachElasticNetworkInterfaceResponse detachElasticNetworkInterfaceWithOptions(DetachElasticNetworkInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticNetworkInterfaceId)) {
            body.put("ElasticNetworkInterfaceId", request.elasticNetworkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachElasticNetworkInterface"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new DetachElasticNetworkInterfaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new DetachElasticNetworkInterfaceResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This interface is an asynchronous interface, and you need to use the query interface to wait for the Lingjun Elastic Network Interface to reach the unbound state.</p>
     * 
     * <b>summary</b> : 
     * <p>Unbind Lingjun ENI from NC.</p>
     * 
     * @param request DetachElasticNetworkInterfaceRequest
     * @return DetachElasticNetworkInterfaceResponse
     */
    public DetachElasticNetworkInterfaceResponse detachElasticNetworkInterface(DetachElasticNetworkInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachElasticNetworkInterfaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Users can use this API to query the destination CIDR block of the source policy instance when creating a routing strategy.</p>
     * 
     * @param request GetDestinationCidrBlockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDestinationCidrBlockResponse
     */
    public GetDestinationCidrBlockResponse getDestinationCidrBlockWithOptions(GetDestinationCidrBlockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDestinationCidrBlock"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetDestinationCidrBlockResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetDestinationCidrBlockResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Users can use this API to query the destination CIDR block of the source policy instance when creating a routing strategy.</p>
     * 
     * @param request GetDestinationCidrBlockRequest
     * @return GetDestinationCidrBlockResponse
     */
    public GetDestinationCidrBlockResponse getDestinationCidrBlock(GetDestinationCidrBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDestinationCidrBlockWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an LENI.</p>
     * 
     * @param request GetElasticNetworkInterfaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetElasticNetworkInterfaceResponse
     */
    public GetElasticNetworkInterfaceResponse getElasticNetworkInterfaceWithOptions(GetElasticNetworkInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticNetworkInterfaceId)) {
            body.put("ElasticNetworkInterfaceId", request.elasticNetworkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetElasticNetworkInterface"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetElasticNetworkInterfaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetElasticNetworkInterfaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of an LENI.</p>
     * 
     * @param request GetElasticNetworkInterfaceRequest
     * @return GetElasticNetworkInterfaceResponse
     */
    public GetElasticNetworkInterfaceResponse getElasticNetworkInterface(GetElasticNetworkInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getElasticNetworkInterfaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Lingjun HUB.</p>
     * 
     * @param request GetErRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetErResponse
     */
    public GetErResponse getErWithOptions(GetErRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEr"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetErResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetErResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Lingjun HUB.</p>
     * 
     * @param request GetErRequest
     * @return GetErResponse
     */
    public GetErResponse getEr(GetErRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getErWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries network instance connections.</p>
     * 
     * @param request GetErAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetErAttachmentResponse
     */
    public GetErAttachmentResponse getErAttachmentWithOptions(GetErAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erAttachmentId)) {
            body.put("ErAttachmentId", request.erAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetErAttachment"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetErAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetErAttachmentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries network instance connections.</p>
     * 
     * @param request GetErAttachmentRequest
     * @return GetErAttachmentResponse
     */
    public GetErAttachmentResponse getErAttachment(GetErAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getErAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of Lingjun HUB route entries.</p>
     * 
     * @param request GetErRouteEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetErRouteEntryResponse
     */
    public GetErRouteEntryResponse getErRouteEntryWithOptions(GetErRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erRouteEntryId)) {
            body.put("ErRouteEntryId", request.erRouteEntryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetErRouteEntry"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetErRouteEntryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetErRouteEntryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of Lingjun HUB route entries.</p>
     * 
     * @param request GetErRouteEntryRequest
     * @return GetErRouteEntryResponse
     */
    public GetErRouteEntryResponse getErRouteEntry(GetErRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getErRouteEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>query lingjun hub routing policy details.</p>
     * 
     * @param request GetErRouteMapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetErRouteMapResponse
     */
    public GetErRouteMapResponse getErRouteMapWithOptions(GetErRouteMapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erRouteMapId)) {
            body.put("ErRouteMapId", request.erRouteMapId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetErRouteMap"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetErRouteMapResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetErRouteMapResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>query lingjun hub routing policy details.</p>
     * 
     * @param request GetErRouteMapRequest
     * @return GetErRouteMapResponse
     */
    public GetErRouteMapResponse getErRouteMap(GetErRouteMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getErRouteMapWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the physical topology information of Lingjun network interface controller and Lingjun nodes under VPD.</p>
     * 
     * @param request GetFabricTopologyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFabricTopologyResponse
     */
    public GetFabricTopologyResponse getFabricTopologyWithOptions(GetFabricTopologyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lniIds)) {
            body.put("LniIds", request.lniIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeIds)) {
            body.put("NodeIds", request.nodeIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFabricTopology"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetFabricTopologyResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetFabricTopologyResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Query the physical topology information of Lingjun network interface controller and Lingjun nodes under VPD.</p>
     * 
     * @param request GetFabricTopologyRequest
     * @return GetFabricTopologyResponse
     */
    public GetFabricTopologyResponse getFabricTopology(GetFabricTopologyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getFabricTopologyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of the secondary private IP address of a specified Lingjun Elastic Network Interface.</p>
     * 
     * @param request GetLeniPrivateIpAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLeniPrivateIpAddressResponse
     */
    public GetLeniPrivateIpAddressResponse getLeniPrivateIpAddressWithOptions(GetLeniPrivateIpAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticNetworkInterfaceId)) {
            body.put("ElasticNetworkInterfaceId", request.elasticNetworkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipName)) {
            body.put("IpName", request.ipName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLeniPrivateIpAddress"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetLeniPrivateIpAddressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetLeniPrivateIpAddressResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details of the secondary private IP address of a specified Lingjun Elastic Network Interface.</p>
     * 
     * @param request GetLeniPrivateIpAddressRequest
     * @return GetLeniPrivateIpAddressResponse
     */
    public GetLeniPrivateIpAddressResponse getLeniPrivateIpAddress(GetLeniPrivateIpAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLeniPrivateIpAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details about the secondary private IP address.</p>
     * 
     * @param request GetLniPrivateIpAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLniPrivateIpAddressResponse
     */
    public GetLniPrivateIpAddressResponse getLniPrivateIpAddressWithOptions(GetLniPrivateIpAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ipName)) {
            body.put("IpName", request.ipName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceId)) {
            body.put("NetworkInterfaceId", request.networkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLniPrivateIpAddress"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetLniPrivateIpAddressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetLniPrivateIpAddressResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the details about the secondary private IP address.</p>
     * 
     * @param request GetLniPrivateIpAddressRequest
     * @return GetLniPrivateIpAddressResponse
     */
    public GetLniPrivateIpAddressResponse getLniPrivateIpAddress(GetLniPrivateIpAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLniPrivateIpAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about an LNI.</p>
     * 
     * @param request GetNetworkInterfaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNetworkInterfaceResponse
     */
    public GetNetworkInterfaceResponse getNetworkInterfaceWithOptions(GetNetworkInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceId)) {
            body.put("NetworkInterfaceId", request.networkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subnetId)) {
            body.put("SubnetId", request.subnetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNetworkInterface"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetNetworkInterfaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetNetworkInterfaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries information about an LNI.</p>
     * 
     * @param request GetNetworkInterfaceRequest
     * @return GetNetworkInterfaceResponse
     */
    public GetNetworkInterfaceResponse getNetworkInterface(GetNetworkInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNetworkInterfaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the network information of a node.</p>
     * 
     * @param request GetNodeInfoForPodRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetNodeInfoForPodResponse
     */
    public GetNodeInfoForPodResponse getNodeInfoForPodWithOptions(GetNodeInfoForPodRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetNodeInfoForPod"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetNodeInfoForPodResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetNodeInfoForPodResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the network information of a node.</p>
     * 
     * @param request GetNodeInfoForPodRequest
     * @return GetNodeInfoForPodResponse
     */
    public GetNodeInfoForPodResponse getNodeInfoForPod(GetNodeInfoForPodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getNodeInfoForPodWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Lingjun subnet, including the type, CIDR block, instance ID, instance status, and number of NCs.</p>
     * 
     * @param request GetSubnetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSubnetResponse
     */
    public GetSubnetResponse getSubnetWithOptions(GetSubnetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subnetId)) {
            body.put("SubnetId", request.subnetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSubnet"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetSubnetResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetSubnetResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Lingjun subnet, including the type, CIDR block, instance ID, instance status, and number of NCs.</p>
     * 
     * @param request GetSubnetRequest
     * @return GetSubnetResponse
     */
    public GetSubnetResponse getSubnet(GetSubnetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSubnetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Lingjun connection, including the specification, Express Connect circuit access port type, instance status, bandwidth, and BGP CIDR block.</p>
     * 
     * @param request GetVccRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVccResponse
     */
    public GetVccResponse getVccWithOptions(GetVccRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePage)) {
            body.put("EnablePage", request.enablePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccId)) {
            body.put("VccId", request.vccId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVcc"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetVccResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetVccResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Lingjun connection, including the specification, Express Connect circuit access port type, instance status, bandwidth, and BGP CIDR block.</p>
     * 
     * @param request GetVccRequest
     * @return GetVccResponse
     */
    public GetVccResponse getVcc(GetVccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVccWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of cross-account resource authorization for a Lingjun connection, including the authorized tenant ID, Lingjun HUB instance ID, and network instance ID.</p>
     * 
     * @param request GetVccGrantRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVccGrantRuleResponse
     */
    public GetVccGrantRuleResponse getVccGrantRuleWithOptions(GetVccGrantRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantRuleId)) {
            body.put("GrantRuleId", request.grantRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantTenantId)) {
            body.put("GrantTenantId", request.grantTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVccGrantRule"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetVccGrantRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetVccGrantRuleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of cross-account resource authorization for a Lingjun connection, including the authorized tenant ID, Lingjun HUB instance ID, and network instance ID.</p>
     * 
     * @param request GetVccGrantRuleRequest
     * @return GetVccGrantRuleResponse
     */
    public GetVccGrantRuleResponse getVccGrantRule(GetVccGrantRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVccGrantRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries route entries.</p>
     * 
     * @param request GetVccRouteEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVccRouteEntryResponse
     */
    public GetVccRouteEntryResponse getVccRouteEntryWithOptions(GetVccRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccId)) {
            body.put("VccId", request.vccId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccRouteEntryId)) {
            body.put("VccRouteEntryId", request.vccRouteEntryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVccRouteEntry"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetVccRouteEntryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetVccRouteEntryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries route entries.</p>
     * 
     * @param request GetVccRouteEntryRequest
     * @return GetVccRouteEntryResponse
     */
    public GetVccRouteEntryResponse getVccRouteEntry(GetVccRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVccRouteEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Lingjun CIDR block, including the status of the Lingjun CIDR block, the CIDR block, the number of subnets and NCs.</p>
     * 
     * @param request GetVpdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVpdResponse
     */
    public GetVpdResponse getVpdWithOptions(GetVpdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVpd"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetVpdResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetVpdResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Lingjun CIDR block, including the status of the Lingjun CIDR block, the CIDR block, the number of subnets and NCs.</p>
     * 
     * @param request GetVpdRequest
     * @return GetVpdResponse
     */
    public GetVpdResponse getVpd(GetVpdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVpdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of cross-account resource authorization for a Lingjun CIDR block, including the authorized tenant ID, Lingjun HUB instance ID, and network instance ID.</p>
     * 
     * @param request GetVpdGrantRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVpdGrantRuleResponse
     */
    public GetVpdGrantRuleResponse getVpdGrantRuleWithOptions(GetVpdGrantRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantRuleId)) {
            body.put("GrantRuleId", request.grantRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantTenantId)) {
            body.put("GrantTenantId", request.grantTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVpdGrantRule"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetVpdGrantRuleResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetVpdGrantRuleResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of cross-account resource authorization for a Lingjun CIDR block, including the authorized tenant ID, Lingjun HUB instance ID, and network instance ID.</p>
     * 
     * @param request GetVpdGrantRuleRequest
     * @return GetVpdGrantRuleResponse
     */
    public GetVpdGrantRuleResponse getVpdGrantRule(GetVpdGrantRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVpdGrantRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries route entries.</p>
     * 
     * @param request GetVpdRouteEntryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetVpdRouteEntryResponse
     */
    public GetVpdRouteEntryResponse getVpdRouteEntryWithOptions(GetVpdRouteEntryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdRouteEntryId)) {
            body.put("VpdRouteEntryId", request.vpdRouteEntryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetVpdRouteEntry"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new GetVpdRouteEntryResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new GetVpdRouteEntryResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries route entries.</p>
     * 
     * @param request GetVpdRouteEntryRequest
     * @return GetVpdRouteEntryResponse
     */
    public GetVpdRouteEntryResponse getVpdRouteEntry(GetVpdRouteEntryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getVpdRouteEntryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Initialize the Lingjun connection and authorize Intelligent Computing Lingjun to create an SLR in your account.</p>
     * 
     * @param request InitializeVccRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitializeVccResponse
     */
    public InitializeVccResponse initializeVccWithOptions(InitializeVccRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InitializeVcc"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new InitializeVccResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new InitializeVccResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Initialize the Lingjun connection and authorize Intelligent Computing Lingjun to create an SLR in your account.</p>
     * 
     * @param request InitializeVccRequest
     * @return InitializeVccResponse
     */
    public InitializeVccResponse initializeVcc(InitializeVccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initializeVccWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the LENIs that are associated with a Lingjun node.</p>
     * 
     * @param request ListElasticNetworkInterfacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListElasticNetworkInterfacesResponse
     */
    public ListElasticNetworkInterfacesResponse listElasticNetworkInterfacesWithOptions(ListElasticNetworkInterfacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticNetworkInterfaceId)) {
            body.put("ElasticNetworkInterfaceId", request.elasticNetworkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            body.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            body.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            body.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListElasticNetworkInterfaces"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListElasticNetworkInterfacesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListElasticNetworkInterfacesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the LENIs that are associated with a Lingjun node.</p>
     * 
     * @param request ListElasticNetworkInterfacesRequest
     * @return ListElasticNetworkInterfacesResponse
     */
    public ListElasticNetworkInterfacesResponse listElasticNetworkInterfaces(ListElasticNetworkInterfacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listElasticNetworkInterfacesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries network instance connections.</p>
     * 
     * @param request ListErAttachmentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListErAttachmentsResponse
     */
    public ListErAttachmentsResponse listErAttachmentsWithOptions(ListErAttachmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoReceiveAllRoute)) {
            body.put("AutoReceiveAllRoute", request.autoReceiveAllRoute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePage)) {
            body.put("EnablePage", request.enablePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erAttachmentId)) {
            body.put("ErAttachmentId", request.erAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erAttachmentName)) {
            body.put("ErAttachmentName", request.erAttachmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTenantId)) {
            body.put("ResourceTenantId", request.resourceTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListErAttachments"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListErAttachmentsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListErAttachmentsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries network instance connections.</p>
     * 
     * @param request ListErAttachmentsRequest
     * @return ListErAttachmentsResponse
     */
    public ListErAttachmentsResponse listErAttachments(ListErAttachmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listErAttachmentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route entries of the Lingjun HUB.</p>
     * 
     * @param request ListErRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListErRouteEntriesResponse
     */
    public ListErRouteEntriesResponse listErRouteEntriesWithOptions(ListErRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            body.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePage)) {
            body.put("EnablePage", request.enablePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreDetailedRouteEntry)) {
            body.put("IgnoreDetailedRouteEntry", request.ignoreDetailedRouteEntry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHopId)) {
            body.put("NextHopId", request.nextHopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHopType)) {
            body.put("NextHopType", request.nextHopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeType)) {
            body.put("RouteType", request.routeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListErRouteEntries"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListErRouteEntriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListErRouteEntriesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route entries of the Lingjun HUB.</p>
     * 
     * @param request ListErRouteEntriesRequest
     * @return ListErRouteEntriesResponse
     */
    public ListErRouteEntriesResponse listErRouteEntries(ListErRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listErRouteEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Routing policies are queried.</p>
     * 
     * @param request ListErRouteMapsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListErRouteMapsResponse
     */
    public ListErRouteMapsResponse listErRouteMapsWithOptions(ListErRouteMapsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            body.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePage)) {
            body.put("EnablePage", request.enablePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erRouteMapId)) {
            body.put("ErRouteMapId", request.erRouteMapId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erRouteMapNum)) {
            body.put("ErRouteMapNum", request.erRouteMapNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receptionInstanceId)) {
            body.put("ReceptionInstanceId", request.receptionInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receptionInstanceName)) {
            body.put("ReceptionInstanceName", request.receptionInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.receptionInstanceType)) {
            body.put("ReceptionInstanceType", request.receptionInstanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeMapAction)) {
            body.put("RouteMapAction", request.routeMapAction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transmissionInstanceId)) {
            body.put("TransmissionInstanceId", request.transmissionInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transmissionInstanceName)) {
            body.put("TransmissionInstanceName", request.transmissionInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.transmissionInstanceType)) {
            body.put("TransmissionInstanceType", request.transmissionInstanceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListErRouteMaps"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListErRouteMapsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListErRouteMapsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Routing policies are queried.</p>
     * 
     * @param request ListErRouteMapsRequest
     * @return ListErRouteMapsResponse
     */
    public ListErRouteMapsResponse listErRouteMaps(ListErRouteMapsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listErRouteMapsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Lingjun HUB.</p>
     * 
     * @param request ListErsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListErsResponse
     */
    public ListErsResponse listErsWithOptions(ListErsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enablePage)) {
            body.put("EnablePage", request.enablePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erName)) {
            body.put("ErName", request.erName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterZoneId)) {
            body.put("MasterZoneId", request.masterZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListErs"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListErsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListErsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Lingjun HUB.</p>
     * 
     * @param request ListErsRequest
     * @return ListErsResponse
     */
    public ListErsResponse listErs(ListErsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listErsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the GPU node list of a specified GPU node whose communication distance does not exceed the specified NCD.</p>
     * 
     * @param request ListInstancesByNcdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesByNcdResponse
     */
    public ListInstancesByNcdResponse listInstancesByNcdWithOptions(ListInstancesByNcdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxNcd)) {
            body.put("MaxNcd", request.maxNcd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstancesByNcd"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesByNcdResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListInstancesByNcdResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the GPU node list of a specified GPU node whose communication distance does not exceed the specified NCD.</p>
     * 
     * @param request ListInstancesByNcdRequest
     * @return ListInstancesByNcdResponse
     */
    public ListInstancesByNcdResponse listInstancesByNcd(ListInstancesByNcdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesByNcdWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of secondary private IP addresses of Lingjun Elastic Network Interface.</p>
     * 
     * @param request ListLeniPrivateIpAddressesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLeniPrivateIpAddressesResponse
     */
    public ListLeniPrivateIpAddressesResponse listLeniPrivateIpAddressesWithOptions(ListLeniPrivateIpAddressesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.elasticNetworkInterfaceId)) {
            body.put("ElasticNetworkInterfaceId", request.elasticNetworkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipName)) {
            body.put("IpName", request.ipName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            body.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLeniPrivateIpAddresses"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListLeniPrivateIpAddressesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListLeniPrivateIpAddressesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of secondary private IP addresses of Lingjun Elastic Network Interface.</p>
     * 
     * @param request ListLeniPrivateIpAddressesRequest
     * @return ListLeniPrivateIpAddressesResponse
     */
    public ListLeniPrivateIpAddressesResponse listLeniPrivateIpAddresses(ListLeniPrivateIpAddressesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLeniPrivateIpAddressesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of secondary private IP addresses of Lingjun network interface controller.</p>
     * 
     * @param request ListLniPrivateIpAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLniPrivateIpAddressResponse
     */
    public ListLniPrivateIpAddressResponse listLniPrivateIpAddressWithOptions(ListLniPrivateIpAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePage)) {
            body.put("EnablePage", request.enablePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            body.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipName)) {
            body.put("IpName", request.ipName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceId)) {
            body.put("NetworkInterfaceId", request.networkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLniPrivateIpAddress"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListLniPrivateIpAddressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListLniPrivateIpAddressResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the list of secondary private IP addresses of Lingjun network interface controller.</p>
     * 
     * @param request ListLniPrivateIpAddressRequest
     * @return ListLniPrivateIpAddressResponse
     */
    public ListLniPrivateIpAddressResponse listLniPrivateIpAddress(ListLniPrivateIpAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLniPrivateIpAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Lingjun network interfaces (LNIs).</p>
     * 
     * @param request ListNetworkInterfacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNetworkInterfacesResponse
     */
    public ListNetworkInterfacesResponse listNetworkInterfacesWithOptions(ListNetworkInterfacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enablePage)) {
            body.put("EnablePage", request.enablePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            body.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceId)) {
            body.put("NetworkInterfaceId", request.networkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subnetId)) {
            body.put("SubnetId", request.subnetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNetworkInterfaces"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListNetworkInterfacesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListNetworkInterfacesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries Lingjun network interfaces (LNIs).</p>
     * 
     * @param request ListNetworkInterfacesRequest
     * @return ListNetworkInterfacesResponse
     */
    public ListNetworkInterfacesResponse listNetworkInterfaces(ListNetworkInterfacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNetworkInterfacesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries node network information.</p>
     * 
     * @param request ListNodeInfosForPodRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNodeInfosForPodResponse
     */
    public ListNodeInfosForPodResponse listNodeInfosForPodWithOptions(ListNodeInfosForPodRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            body.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            body.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListNodeInfosForPod"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListNodeInfosForPodResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListNodeInfosForPodResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries node network information.</p>
     * 
     * @param request ListNodeInfosForPodRequest
     * @return ListNodeInfosForPodResponse
     */
    public ListNodeInfosForPodResponse listNodeInfosForPod(ListNodeInfosForPodRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNodeInfosForPodWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the details of one or more Lingjun subnets, including the Lingjun subnet type, network address segment, and instance ID of the Lingjun CIDR block.</p>
     * 
     * @param request ListSubnetsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSubnetsResponse
     */
    public ListSubnetsResponse listSubnetsWithOptions(ListSubnetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enablePage)) {
            body.put("EnablePage", request.enablePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subnetId)) {
            body.put("SubnetId", request.subnetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subnetName)) {
            body.put("SubnetName", request.subnetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSubnets"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListSubnetsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListSubnetsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>You can call this operation to query the details of one or more Lingjun subnets, including the Lingjun subnet type, network address segment, and instance ID of the Lingjun CIDR block.</p>
     * 
     * @param request ListSubnetsRequest
     * @return ListSubnetsResponse
     */
    public ListSubnetsResponse listSubnets(ListSubnetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSubnetsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the traffic rate of a Lingjun connection.</p>
     * 
     * @param request ListVccFlowInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVccFlowInfosResponse
     */
    public ListVccFlowInfosResponse listVccFlowInfosWithOptions(ListVccFlowInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.direction)) {
            body.put("Direction", request.direction);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            body.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricName)) {
            body.put("MetricName", request.metricName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.to)) {
            body.put("To", request.to);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccId)) {
            body.put("VccId", request.vccId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVccFlowInfos"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListVccFlowInfosResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListVccFlowInfosResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the traffic rate of a Lingjun connection.</p>
     * 
     * @param request ListVccFlowInfosRequest
     * @return ListVccFlowInfosResponse
     */
    public ListVccFlowInfosResponse listVccFlowInfos(ListVccFlowInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVccFlowInfosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Lingjun connection authorization, including the authorized tenant ID, region, and Lingjun HUB instance information.</p>
     * 
     * @param request ListVccGrantRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVccGrantRulesResponse
     */
    public ListVccGrantRulesResponse listVccGrantRulesWithOptions(ListVccGrantRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enablePage)) {
            body.put("EnablePage", request.enablePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forSelect)) {
            body.put("ForSelect", request.forSelect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantRuleId)) {
            body.put("GrantRuleId", request.grantRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantTenantId)) {
            body.put("GrantTenantId", request.grantTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVccGrantRules"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListVccGrantRulesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListVccGrantRulesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a Lingjun connection authorization, including the authorized tenant ID, region, and Lingjun HUB instance information.</p>
     * 
     * @param request ListVccGrantRulesRequest
     * @return ListVccGrantRulesResponse
     */
    public ListVccGrantRulesResponse listVccGrantRules(ListVccGrantRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVccGrantRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries Lingjun connection route entries.</p>
     * 
     * @param request ListVccRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVccRouteEntriesResponse
     */
    public ListVccRouteEntriesResponse listVccRouteEntriesWithOptions(ListVccRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            body.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePage)) {
            body.put("EnablePage", request.enablePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreDetailedRouteEntry)) {
            body.put("IgnoreDetailedRouteEntry", request.ignoreDetailedRouteEntry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHopId)) {
            body.put("NextHopId", request.nextHopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHopType)) {
            body.put("NextHopType", request.nextHopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeType)) {
            body.put("RouteType", request.routeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccId)) {
            body.put("VccId", request.vccId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdRouteEntryId)) {
            body.put("VpdRouteEntryId", request.vpdRouteEntryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVccRouteEntries"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListVccRouteEntriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListVccRouteEntriesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries Lingjun connection route entries.</p>
     * 
     * @param request ListVccRouteEntriesRequest
     * @return ListVccRouteEntriesResponse
     */
    public ListVccRouteEntriesResponse listVccRouteEntries(ListVccRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVccRouteEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>query the details of one or more lingjun connections, including the specification, Express Connect circuit access port type, instance status, bandwidth, and bgp network segment.</p>
     * 
     * @param request ListVccsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVccsResponse
     */
    public ListVccsResponse listVccsWithOptions(ListVccsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            body.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cenId)) {
            body.put("CenId", request.cenId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePage)) {
            body.put("EnablePage", request.enablePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exStatus)) {
            body.put("ExStatus", request.exStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterErId)) {
            body.put("FilterErId", request.filterErId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccId)) {
            body.put("VccId", request.vccId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            body.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVccs"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListVccsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListVccsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>query the details of one or more lingjun connections, including the specification, Express Connect circuit access port type, instance status, bandwidth, and bgp network segment.</p>
     * 
     * @param request ListVccsRequest
     * @return ListVccsResponse
     */
    public ListVccsResponse listVccs(ListVccsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVccsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of one or more route entries in the CIDR block of Lingjun, including the route type, route entry status, destination CIDR block, and instance information of the next route entry.</p>
     * 
     * @param request ListVpdGrantRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpdGrantRulesResponse
     */
    public ListVpdGrantRulesResponse listVpdGrantRulesWithOptions(ListVpdGrantRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enablePage)) {
            body.put("EnablePage", request.enablePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forSelect)) {
            body.put("ForSelect", request.forSelect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantRuleId)) {
            body.put("GrantRuleId", request.grantRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantTenantId)) {
            body.put("GrantTenantId", request.grantTenantId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceName)) {
            body.put("InstanceName", request.instanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpdGrantRules"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpdGrantRulesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListVpdGrantRulesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of one or more route entries in the CIDR block of Lingjun, including the route type, route entry status, destination CIDR block, and instance information of the next route entry.</p>
     * 
     * @param request ListVpdGrantRulesRequest
     * @return ListVpdGrantRulesResponse
     */
    public ListVpdGrantRulesResponse listVpdGrantRules(ListVpdGrantRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVpdGrantRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route entries of the Lingjun CIDR block.</p>
     * 
     * @param request ListVpdRouteEntriesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpdRouteEntriesResponse
     */
    public ListVpdRouteEntriesResponse listVpdRouteEntriesWithOptions(ListVpdRouteEntriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.destinationCidrBlock)) {
            body.put("DestinationCidrBlock", request.destinationCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enablePage)) {
            body.put("EnablePage", request.enablePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreDetailedRouteEntry)) {
            body.put("IgnoreDetailedRouteEntry", request.ignoreDetailedRouteEntry);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHopId)) {
            body.put("NextHopId", request.nextHopId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextHopType)) {
            body.put("NextHopType", request.nextHopType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeType)) {
            body.put("RouteType", request.routeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdRouteEntryId)) {
            body.put("VpdRouteEntryId", request.vpdRouteEntryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpdRouteEntries"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpdRouteEntriesResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListVpdRouteEntriesResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the route entries of the Lingjun CIDR block.</p>
     * 
     * @param request ListVpdRouteEntriesRequest
     * @return ListVpdRouteEntriesResponse
     */
    public ListVpdRouteEntriesResponse listVpdRouteEntries(ListVpdRouteEntriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVpdRouteEntriesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of one or more Lingjun CIDR blocks, including the status of Lingjun CIDR blocks, Cidr addresses, service CIDR blocks, and Subnet.</p>
     * 
     * @param request ListVpdsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListVpdsResponse
     */
    public ListVpdsResponse listVpdsWithOptions(ListVpdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enablePage)) {
            body.put("EnablePage", request.enablePage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterErId)) {
            body.put("FilterErId", request.filterErId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forSelect)) {
            body.put("ForSelect", request.forSelect);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            body.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            body.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdName)) {
            body.put("VpdName", request.vpdName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withDependence)) {
            body.put("WithDependence", request.withDependence);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.withoutVcc)) {
            body.put("WithoutVcc", request.withoutVcc);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListVpds"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new ListVpdsResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new ListVpdsResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of one or more Lingjun CIDR blocks, including the status of Lingjun CIDR blocks, Cidr addresses, service CIDR blocks, and Subnet.</p>
     * 
     * @param request ListVpdsRequest
     * @return ListVpdsResponse
     */
    public ListVpdsResponse listVpds(ListVpdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVpdsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Query the network communication distance (Network Communication Distance,NCD) between instances (Lingjun node, Lingjun network interface controller).</p>
     * 
     * @param request QueryInstanceNcdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryInstanceNcdResponse
     */
    public QueryInstanceNcdResponse queryInstanceNcdWithOptions(QueryInstanceNcdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId1)) {
            body.put("InstanceId1", request.instanceId1);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId2)) {
            body.put("InstanceId2", request.instanceId2);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            body.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryInstanceNcd"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new QueryInstanceNcdResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new QueryInstanceNcdResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Query the network communication distance (Network Communication Distance,NCD) between instances (Lingjun node, Lingjun network interface controller).</p>
     * 
     * @param request QueryInstanceNcdRequest
     * @return QueryInstanceNcdResponse
     */
    public QueryInstanceNcdResponse queryInstanceNcd(QueryInstanceNcdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryInstanceNcdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only unsubscribable for Lingjun connections in the prepayment status.</p>
     * 
     * <b>summary</b> : 
     * <p>Unsubscribe inactive Lingjun connection</p>
     * 
     * @param request RefundVccRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefundVccResponse
     */
    public RefundVccResponse refundVccWithOptions(RefundVccRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccId)) {
            body.put("VccId", request.vccId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundVcc"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RefundVccResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RefundVccResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>Only unsubscribable for Lingjun connections in the prepayment status.</p>
     * 
     * <b>summary</b> : 
     * <p>Unsubscribe inactive Lingjun connection</p>
     * 
     * @param request RefundVccRequest
     * @return RefundVccResponse
     */
    public RefundVccResponse refundVcc(RefundVccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refundVccWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation allows the user to retry the operation if the Lingjun connection creation and deletion processes fail. Only the Lingjun connection in the creation failure and deletion failure state can be retried</p>
     * 
     * <b>summary</b> : 
     * <p>Retry trying to create /delete a Lingjun connection.</p>
     * 
     * @param request RetryVccRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryVccResponse
     */
    public RetryVccResponse retryVccWithOptions(RetryVccRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccId)) {
            body.put("VccId", request.vccId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryVcc"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new RetryVccResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new RetryVccResponse());
        }

    }

    /**
     * <b>description</b> :
     * <p>This operation allows the user to retry the operation if the Lingjun connection creation and deletion processes fail. Only the Lingjun connection in the creation failure and deletion failure state can be retried</p>
     * 
     * <b>summary</b> : 
     * <p>Retry trying to create /delete a Lingjun connection.</p>
     * 
     * @param request RetryVccRequest
     * @return RetryVccResponse
     */
    public RetryVccResponse retryVcc(RetryVccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryVccWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an assigned secondary private IP address.</p>
     * 
     * @param request UnAssignPrivateIpAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnAssignPrivateIpAddressResponse
     */
    public UnAssignPrivateIpAddressResponse unAssignPrivateIpAddressWithOptions(UnAssignPrivateIpAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipName)) {
            body.put("IpName", request.ipName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkInterfaceId)) {
            body.put("NetworkInterfaceId", request.networkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            body.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subnetId)) {
            body.put("SubnetId", request.subnetId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnAssignPrivateIpAddress"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UnAssignPrivateIpAddressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UnAssignPrivateIpAddressResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Deletes an assigned secondary private IP address.</p>
     * 
     * @param request UnAssignPrivateIpAddressRequest
     * @return UnAssignPrivateIpAddressResponse
     */
    public UnAssignPrivateIpAddressResponse unAssignPrivateIpAddress(UnAssignPrivateIpAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unAssignPrivateIpAddressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning</strong> If the attached CIDR block has Lingjun subnet resources, you must delete the dependent resources before you can delete the attached CIDR block.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This function can be used to delete the additional network segment of VPD.</p>
     * 
     * @param request UnAssociateVpdCidrBlockRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnAssociateVpdCidrBlockResponse
     */
    public UnAssociateVpdCidrBlockResponse unAssociateVpdCidrBlockWithOptions(UnAssociateVpdCidrBlockRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryCidrBlock)) {
            body.put("SecondaryCidrBlock", request.secondaryCidrBlock);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnAssociateVpdCidrBlock"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UnAssociateVpdCidrBlockResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UnAssociateVpdCidrBlockResponse());
        }

    }

    /**
     * <b>description</b> :
     * <ul>
     * <li><strong>Warning</strong> If the attached CIDR block has Lingjun subnet resources, you must delete the dependent resources before you can delete the attached CIDR block.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>This function can be used to delete the additional network segment of VPD.</p>
     * 
     * @param request UnAssociateVpdCidrBlockRequest
     * @return UnAssociateVpdCidrBlockResponse
     */
    public UnAssociateVpdCidrBlockResponse unAssociateVpdCidrBlock(UnAssociateVpdCidrBlockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unAssociateVpdCidrBlockWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete the assigned secondary private IP address of Lingjun Elastic Network Interface.</p>
     * 
     * @param request UnassignLeniPrivateIpAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnassignLeniPrivateIpAddressResponse
     */
    public UnassignLeniPrivateIpAddressResponse unassignLeniPrivateIpAddressWithOptions(UnassignLeniPrivateIpAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticNetworkInterfaceId)) {
            body.put("ElasticNetworkInterfaceId", request.elasticNetworkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipName)) {
            body.put("IpName", request.ipName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnassignLeniPrivateIpAddress"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UnassignLeniPrivateIpAddressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UnassignLeniPrivateIpAddressResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Delete the assigned secondary private IP address of Lingjun Elastic Network Interface.</p>
     * 
     * @param request UnassignLeniPrivateIpAddressRequest
     * @return UnassignLeniPrivateIpAddressResponse
     */
    public UnassignLeniPrivateIpAddressResponse unassignLeniPrivateIpAddress(UnassignLeniPrivateIpAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unassignLeniPrivateIpAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update Lingjun Elastic Network Interface information.</p>
     * 
     * @param request UpdateElasticNetworkInterfaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateElasticNetworkInterfaceResponse
     */
    public UpdateElasticNetworkInterfaceResponse updateElasticNetworkInterfaceWithOptions(UpdateElasticNetworkInterfaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticNetworkInterfaceId)) {
            body.put("ElasticNetworkInterfaceId", request.elasticNetworkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroupId)) {
            body.put("SecurityGroupId", request.securityGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateElasticNetworkInterface"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateElasticNetworkInterfaceResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateElasticNetworkInterfaceResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Update Lingjun Elastic Network Interface information.</p>
     * 
     * @param request UpdateElasticNetworkInterfaceRequest
     * @return UpdateElasticNetworkInterfaceResponse
     */
    public UpdateElasticNetworkInterfaceResponse updateElasticNetworkInterface(UpdateElasticNetworkInterfaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateElasticNetworkInterfaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updated Lingjun HUB.</p>
     * 
     * @param request UpdateErRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateErResponse
     */
    public UpdateErResponse updateErWithOptions(UpdateErRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erName)) {
            body.put("ErName", request.erName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateEr"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateErResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateErResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updated Lingjun HUB.</p>
     * 
     * @param request UpdateErRequest
     * @return UpdateErResponse
     */
    public UpdateErResponse updateEr(UpdateErRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateErWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a network instance connection.</p>
     * 
     * @param request UpdateErAttachmentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateErAttachmentResponse
     */
    public UpdateErAttachmentResponse updateErAttachmentWithOptions(UpdateErAttachmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.erAttachmentId)) {
            body.put("ErAttachmentId", request.erAttachmentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erAttachmentName)) {
            body.put("ErAttachmentName", request.erAttachmentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateErAttachment"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateErAttachmentResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateErAttachmentResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updates a network instance connection.</p>
     * 
     * @param request UpdateErAttachmentRequest
     * @return UpdateErAttachmentResponse
     */
    public UpdateErAttachmentResponse updateErAttachment(UpdateErAttachmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateErAttachmentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update some information about the routing policy, including the description and name of the routing policy.</p>
     * 
     * @param request UpdateErRouteMapRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateErRouteMapResponse
     */
    public UpdateErRouteMapResponse updateErRouteMapWithOptions(UpdateErRouteMapRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erId)) {
            body.put("ErId", request.erId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.erRouteMapId)) {
            body.put("ErRouteMapId", request.erRouteMapId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateErRouteMap"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateErRouteMapResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateErRouteMapResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Update some information about the routing policy, including the description and name of the routing policy.</p>
     * 
     * @param request UpdateErRouteMapRequest
     * @return UpdateErRouteMapResponse
     */
    public UpdateErRouteMapResponse updateErRouteMap(UpdateErRouteMapRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateErRouteMapWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updated the description of the secondary private network assigned by the Lingjun Elastic Network Interface.</p>
     * 
     * @param request UpdateLeniPrivateIpAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLeniPrivateIpAddressResponse
     */
    public UpdateLeniPrivateIpAddressResponse updateLeniPrivateIpAddressWithOptions(UpdateLeniPrivateIpAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticNetworkInterfaceId)) {
            body.put("ElasticNetworkInterfaceId", request.elasticNetworkInterfaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ipName)) {
            body.put("IpName", request.ipName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLeniPrivateIpAddress"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLeniPrivateIpAddressResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateLeniPrivateIpAddressResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updated the description of the secondary private network assigned by the Lingjun Elastic Network Interface.</p>
     * 
     * @param request UpdateLeniPrivateIpAddressRequest
     * @return UpdateLeniPrivateIpAddressResponse
     */
    public UpdateLeniPrivateIpAddressResponse updateLeniPrivateIpAddress(UpdateLeniPrivateIpAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLeniPrivateIpAddressWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates some information about a specified subnet instance, including the name of the subnet instance.</p>
     * 
     * @param request UpdateSubnetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSubnetResponse
     */
    public UpdateSubnetResponse updateSubnetWithOptions(UpdateSubnetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subnetId)) {
            body.put("SubnetId", request.subnetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subnetName)) {
            body.put("SubnetName", request.subnetName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            body.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSubnet"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSubnetResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateSubnetResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updates some information about a specified subnet instance, including the name of the subnet instance.</p>
     * 
     * @param request UpdateSubnetRequest
     * @return UpdateSubnetResponse
     */
    public UpdateSubnetResponse updateSubnet(UpdateSubnetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSubnetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a Lingjun connection instance, including the peak bandwidth and name of the Lingjun connection instance.</p>
     * 
     * @param request UpdateVccRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVccResponse
     */
    public UpdateVccResponse updateVccWithOptions(UpdateVccRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bandwidth)) {
            body.put("Bandwidth", request.bandwidth);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccId)) {
            body.put("VccId", request.vccId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vccName)) {
            body.put("VccName", request.vccName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVcc"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVccResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateVccResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about a Lingjun connection instance, including the peak bandwidth and name of the Lingjun connection instance.</p>
     * 
     * @param request UpdateVccRequest
     * @return UpdateVccResponse
     */
    public UpdateVccResponse updateVcc(UpdateVccRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVccWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about the Lingjun CIDR block, including the name of the Lingjun CIDR block.</p>
     * 
     * @param request UpdateVpdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateVpdResponse
     */
    public UpdateVpdResponse updateVpdWithOptions(UpdateVpdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdId)) {
            body.put("VpdId", request.vpdId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpdName)) {
            body.put("VpdName", request.vpdName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateVpd"),
            new TeaPair("version", "2022-05-30"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        if (com.aliyun.teautil.Common.isUnset(_signatureVersion) || !com.aliyun.teautil.Common.equalString(_signatureVersion, "v4")) {
            return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateVpdResponse());
        } else {
            return TeaModel.toModel(this.execute(params, req, runtime), new UpdateVpdResponse());
        }

    }

    /**
     * <b>summary</b> : 
     * <p>Updates the information about the Lingjun CIDR block, including the name of the Lingjun CIDR block.</p>
     * 
     * @param request UpdateVpdRequest
     * @return UpdateVpdResponse
     */
    public UpdateVpdResponse updateVpd(UpdateVpdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateVpdWithOptions(request, runtime);
    }
}
