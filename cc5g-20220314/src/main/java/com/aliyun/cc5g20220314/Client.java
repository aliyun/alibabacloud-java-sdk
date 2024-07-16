// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cc5g20220314;

import com.aliyun.tea.*;
import com.aliyun.cc5g20220314.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("cc5g", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>添加5G高速上云服务实例的DNS授权规则</p>
     * 
     * @param request AddDNSAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDNSAuthorizationRuleResponse
     */
    public AddDNSAuthorizationRuleResponse addDNSAuthorizationRuleWithOptions(AddDNSAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationIp)) {
            query.put("DestinationIp", request.destinationIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDNSIp)) {
            query.put("SourceDNSIp", request.sourceDNSIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDNSAuthorizationRule"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDNSAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加5G高速上云服务实例的DNS授权规则</p>
     * 
     * @param request AddDNSAuthorizationRuleRequest
     * @return AddDNSAuthorizationRuleResponse
     */
    public AddDNSAuthorizationRuleResponse addDNSAuthorizationRule(AddDNSAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDNSAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加5G高速上云服务实例组的DNS授权规则</p>
     * 
     * @param request AddGroupDnsAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddGroupDnsAuthorizationRuleResponse
     */
    public AddGroupDnsAuthorizationRuleResponse addGroupDnsAuthorizationRuleWithOptions(AddGroupDnsAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationIp)) {
            query.put("DestinationIp", request.destinationIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDNSIp)) {
            query.put("SourceDNSIp", request.sourceDNSIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorGroupId)) {
            query.put("WirelessCloudConnectorGroupId", request.wirelessCloudConnectorGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddGroupDnsAuthorizationRule"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddGroupDnsAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加5G高速上云服务实例组的DNS授权规则</p>
     * 
     * @param request AddGroupDnsAuthorizationRuleRequest
     * @return AddGroupDnsAuthorizationRuleResponse
     */
    public AddGroupDnsAuthorizationRuleResponse addGroupDnsAuthorizationRule(AddGroupDnsAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGroupDnsAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>添加5G高速上云服务实例到组</p>
     * 
     * @param request AddWirelessCloudConnectorToGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddWirelessCloudConnectorToGroupResponse
     */
    public AddWirelessCloudConnectorToGroupResponse addWirelessCloudConnectorToGroupWithOptions(AddWirelessCloudConnectorToGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorGroupId)) {
            query.put("WirelessCloudConnectorGroupId", request.wirelessCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorIds)) {
            query.put("WirelessCloudConnectorIds", request.wirelessCloudConnectorIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddWirelessCloudConnectorToGroup"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddWirelessCloudConnectorToGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>添加5G高速上云服务实例到组</p>
     * 
     * @param request AddWirelessCloudConnectorToGroupRequest
     * @return AddWirelessCloudConnectorToGroupResponse
     */
    public AddWirelessCloudConnectorToGroupResponse addWirelessCloudConnectorToGroup(AddWirelessCloudConnectorToGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addWirelessCloudConnectorToGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建5G高速上云服务实例下的网络连接</p>
     * 
     * @param request AttachVpcToNetLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachVpcToNetLinkResponse
     */
    public AttachVpcToNetLinkResponse attachVpcToNetLinkWithOptions(AttachVpcToNetLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netLinkId)) {
            query.put("NetLinkId", request.netLinkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitches)) {
            query.put("VSwitches", request.vSwitches);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachVpcToNetLink"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachVpcToNetLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建5G高速上云服务实例下的网络连接</p>
     * 
     * @param request AttachVpcToNetLinkRequest
     * @return AttachVpcToNetLinkResponse
     */
    public AttachVpcToNetLinkResponse attachVpcToNetLink(AttachVpcToNetLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachVpcToNetLinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建5G高速上云服务实例的授权规则</p>
     * 
     * @param request CreateAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAuthorizationRuleResponse
     */
    public CreateAuthorizationRuleResponse createAuthorizationRuleWithOptions(CreateAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationPort)) {
            query.put("DestinationPort", request.destinationPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidr)) {
            query.put("SourceCidr", request.sourceCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAuthorizationRule"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建5G高速上云服务实例的授权规则</p>
     * 
     * @param request CreateAuthorizationRuleRequest
     * @return CreateAuthorizationRuleResponse
     */
    public CreateAuthorizationRuleResponse createAuthorizationRule(CreateAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建批量操作卡任务</p>
     * 
     * @param request CreateBatchOperateCardsTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBatchOperateCardsTaskResponse
     */
    public CreateBatchOperateCardsTaskResponse createBatchOperateCardsTaskWithOptions(CreateBatchOperateCardsTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectType)) {
            query.put("EffectType", request.effectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccids)) {
            query.put("Iccids", request.iccids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccidsOssFilePath)) {
            query.put("IccidsOssFilePath", request.iccidsOssFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorIds)) {
            query.put("WirelessCloudConnectorIds", request.wirelessCloudConnectorIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBatchOperateCardsTask"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBatchOperateCardsTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建批量操作卡任务</p>
     * 
     * @param request CreateBatchOperateCardsTaskRequest
     * @return CreateBatchOperateCardsTaskResponse
     */
    public CreateBatchOperateCardsTaskResponse createBatchOperateCardsTask(CreateBatchOperateCardsTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBatchOperateCardsTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建5G高速上云服务实例组的授权规则</p>
     * 
     * @param request CreateGroupAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateGroupAuthorizationRuleResponse
     */
    public CreateGroupAuthorizationRuleResponse createGroupAuthorizationRuleWithOptions(CreateGroupAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationPort)) {
            query.put("DestinationPort", request.destinationPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationType)) {
            query.put("DestinationType", request.destinationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidr)) {
            query.put("SourceCidr", request.sourceCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorGroupId)) {
            query.put("WirelessCloudConnectorGroupId", request.wirelessCloudConnectorGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateGroupAuthorizationRule"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateGroupAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建5G高速上云服务实例组的授权规则</p>
     * 
     * @param request CreateGroupAuthorizationRuleRequest
     * @return CreateGroupAuthorizationRuleResponse
     */
    public CreateGroupAuthorizationRuleResponse createGroupAuthorizationRule(CreateGroupAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createGroupAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下发iotcc实例的回程路由</p>
     * 
     * @param request CreateIoTCloudConnectorBackhaulRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateIoTCloudConnectorBackhaulRouteResponse
     */
    public CreateIoTCloudConnectorBackhaulRouteResponse createIoTCloudConnectorBackhaulRouteWithOptions(CreateIoTCloudConnectorBackhaulRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netLinkId)) {
            query.put("NetLinkId", request.netLinkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateIoTCloudConnectorBackhaulRoute"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateIoTCloudConnectorBackhaulRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>下发iotcc实例的回程路由</p>
     * 
     * @param request CreateIoTCloudConnectorBackhaulRouteRequest
     * @return CreateIoTCloudConnectorBackhaulRouteResponse
     */
    public CreateIoTCloudConnectorBackhaulRouteResponse createIoTCloudConnectorBackhaulRoute(CreateIoTCloudConnectorBackhaulRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createIoTCloudConnectorBackhaulRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建5G高速上云服务实例</p>
     * 
     * @param request CreateWirelessCloudConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWirelessCloudConnectorResponse
     */
    public CreateWirelessCloudConnectorResponse createWirelessCloudConnectorWithOptions(CreateWirelessCloudConnectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.businessType)) {
            query.put("BusinessType", request.businessType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ISP)) {
            query.put("ISP", request.ISP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netLinks)) {
            query.put("NetLinks", request.netLinks);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useCase)) {
            query.put("UseCase", request.useCase);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWirelessCloudConnector"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWirelessCloudConnectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建5G高速上云服务实例</p>
     * 
     * @param request CreateWirelessCloudConnectorRequest
     * @return CreateWirelessCloudConnectorResponse
     */
    public CreateWirelessCloudConnectorResponse createWirelessCloudConnector(CreateWirelessCloudConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWirelessCloudConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建5G高速上云服务实例组</p>
     * 
     * @param request CreateWirelessCloudConnectorGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateWirelessCloudConnectorGroupResponse
     */
    public CreateWirelessCloudConnectorGroupResponse createWirelessCloudConnectorGroupWithOptions(CreateWirelessCloudConnectorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateWirelessCloudConnectorGroup"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateWirelessCloudConnectorGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建5G高速上云服务实例组</p>
     * 
     * @param request CreateWirelessCloudConnectorGroupRequest
     * @return CreateWirelessCloudConnectorGroupResponse
     */
    public CreateWirelessCloudConnectorGroupResponse createWirelessCloudConnectorGroup(CreateWirelessCloudConnectorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createWirelessCloudConnectorGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除5G高速上云服务实例的授权规则</p>
     * 
     * @param request DeleteAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAuthorizationRuleResponse
     */
    public DeleteAuthorizationRuleResponse deleteAuthorizationRuleWithOptions(DeleteAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAuthorizationRule"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除5G高速上云服务实例的授权规则</p>
     * 
     * @param request DeleteAuthorizationRuleRequest
     * @return DeleteAuthorizationRuleResponse
     */
    public DeleteAuthorizationRuleResponse deleteAuthorizationRule(DeleteAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除批量操作卡任务</p>
     * 
     * @param request DeleteBatchOperateCardsTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBatchOperateCardsTaskResponse
     */
    public DeleteBatchOperateCardsTaskResponse deleteBatchOperateCardsTaskWithOptions(DeleteBatchOperateCardsTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchOperateCardsTaskId)) {
            query.put("BatchOperateCardsTaskId", request.batchOperateCardsTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBatchOperateCardsTask"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBatchOperateCardsTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除批量操作卡任务</p>
     * 
     * @param request DeleteBatchOperateCardsTaskRequest
     * @return DeleteBatchOperateCardsTaskResponse
     */
    public DeleteBatchOperateCardsTaskResponse deleteBatchOperateCardsTask(DeleteBatchOperateCardsTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBatchOperateCardsTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除5G高速上云服务实例组的授权规则</p>
     * 
     * @param request DeleteGroupAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteGroupAuthorizationRuleResponse
     */
    public DeleteGroupAuthorizationRuleResponse deleteGroupAuthorizationRuleWithOptions(DeleteGroupAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorGroupId)) {
            query.put("WirelessCloudConnectorGroupId", request.wirelessCloudConnectorGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteGroupAuthorizationRule"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteGroupAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除5G高速上云服务实例组的授权规则</p>
     * 
     * @param request DeleteGroupAuthorizationRuleRequest
     * @return DeleteGroupAuthorizationRuleResponse
     */
    public DeleteGroupAuthorizationRuleResponse deleteGroupAuthorizationRule(DeleteGroupAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteGroupAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除iotcc实例的回程路由</p>
     * 
     * @param request DeleteIoTCloudConnectorBackhaulRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteIoTCloudConnectorBackhaulRouteResponse
     */
    public DeleteIoTCloudConnectorBackhaulRouteResponse deleteIoTCloudConnectorBackhaulRouteWithOptions(DeleteIoTCloudConnectorBackhaulRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netLinkId)) {
            query.put("NetLinkId", request.netLinkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteIoTCloudConnectorBackhaulRoute"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteIoTCloudConnectorBackhaulRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除iotcc实例的回程路由</p>
     * 
     * @param request DeleteIoTCloudConnectorBackhaulRouteRequest
     * @return DeleteIoTCloudConnectorBackhaulRouteResponse
     */
    public DeleteIoTCloudConnectorBackhaulRouteResponse deleteIoTCloudConnectorBackhaulRoute(DeleteIoTCloudConnectorBackhaulRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteIoTCloudConnectorBackhaulRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除5G高速上云服务实例</p>
     * 
     * @param request DeleteWirelessCloudConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWirelessCloudConnectorResponse
     */
    public DeleteWirelessCloudConnectorResponse deleteWirelessCloudConnectorWithOptions(DeleteWirelessCloudConnectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWirelessCloudConnector"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWirelessCloudConnectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除5G高速上云服务实例</p>
     * 
     * @param request DeleteWirelessCloudConnectorRequest
     * @return DeleteWirelessCloudConnectorResponse
     */
    public DeleteWirelessCloudConnectorResponse deleteWirelessCloudConnector(DeleteWirelessCloudConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWirelessCloudConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除5G高速上云服务实例分组</p>
     * 
     * @param request DeleteWirelessCloudConnectorGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteWirelessCloudConnectorGroupResponse
     */
    public DeleteWirelessCloudConnectorGroupResponse deleteWirelessCloudConnectorGroupWithOptions(DeleteWirelessCloudConnectorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorGroupId)) {
            query.put("WirelessCloudConnectorGroupId", request.wirelessCloudConnectorGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteWirelessCloudConnectorGroup"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteWirelessCloudConnectorGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除5G高速上云服务实例分组</p>
     * 
     * @param request DeleteWirelessCloudConnectorGroupRequest
     * @return DeleteWirelessCloudConnectorGroupResponse
     */
    public DeleteWirelessCloudConnectorGroupResponse deleteWirelessCloudConnectorGroup(DeleteWirelessCloudConnectorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteWirelessCloudConnectorGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>解除5G高速上云服务实例下的网络连接和VPC的绑定</p>
     * 
     * @param request DetachVpcFromNetLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachVpcFromNetLinkResponse
     */
    public DetachVpcFromNetLinkResponse detachVpcFromNetLinkWithOptions(DetachVpcFromNetLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netLinkId)) {
            query.put("NetLinkId", request.netLinkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachVpcFromNetLink"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachVpcFromNetLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>解除5G高速上云服务实例下的网络连接和VPC的绑定</p>
     * 
     * @param request DetachVpcFromNetLinkRequest
     * @return DetachVpcFromNetLinkResponse
     */
    public DetachVpcFromNetLinkResponse detachVpcFromNetLink(DetachVpcFromNetLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachVpcFromNetLinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>卡注销接口</p>
     * 
     * @param request FailCardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return FailCardsResponse
     */
    public FailCardsResponse failCardsWithOptions(FailCardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccids)) {
            query.put("Iccids", request.iccids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "FailCards"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new FailCardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>卡注销接口</p>
     * 
     * @param request FailCardsRequest
     * @return FailCardsResponse
     */
    public FailCardsResponse failCards(FailCardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.failCardsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例的详细连接信息</p>
     * 
     * @param request GetCardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCardResponse
     */
    public GetCardResponse getCardWithOptions(GetCardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCard"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例的详细连接信息</p>
     * 
     * @param request GetCardRequest
     * @return GetCardResponse
     */
    public GetCardResponse getCard(GetCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询卡锁定停机的原因</p>
     * 
     * @param request GetCardLockReasonRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCardLockReasonResponse
     */
    public GetCardLockReasonResponse getCardLockReasonWithOptions(GetCardLockReasonRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCardLockReason"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCardLockReasonResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询卡锁定停机的原因</p>
     * 
     * @param request GetCardLockReasonRequest
     * @return GetCardLockReasonResponse
     */
    public GetCardLockReasonResponse getCardLockReason(GetCardLockReasonRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCardLockReasonWithOptions(request, runtime);
    }

    /**
     * @param request GetCreateCustomerInfomationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCreateCustomerInfomationResponse
     */
    public GetCreateCustomerInfomationResponse getCreateCustomerInfomationWithOptions(GetCreateCustomerInfomationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCreateCustomerInfomation"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCreateCustomerInfomationResponse());
    }

    /**
     * @param request GetCreateCustomerInfomationRequest
     * @return GetCreateCustomerInfomationResponse
     */
    public GetCreateCustomerInfomationResponse getCreateCustomerInfomation(GetCreateCustomerInfomationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCreateCustomerInfomationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取录入客户资料的相关信息</p>
     * 
     * @param request GetCreateCustomerInformationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCreateCustomerInformationResponse
     */
    public GetCreateCustomerInformationResponse getCreateCustomerInformationWithOptions(GetCreateCustomerInformationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCreateCustomerInformation"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCreateCustomerInformationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取录入客户资料的相关信息</p>
     * 
     * @param request GetCreateCustomerInformationRequest
     * @return GetCreateCustomerInformationResponse
     */
    public GetCreateCustomerInformationResponse getCreateCustomerInformation(GetCreateCustomerInformationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCreateCustomerInformationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单卡诊断结果</p>
     * 
     * @param request GetDiagnoseResultForSingleCardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDiagnoseResultForSingleCardResponse
     */
    public GetDiagnoseResultForSingleCardResponse getDiagnoseResultForSingleCardWithOptions(GetDiagnoseResultForSingleCardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.diagnoseTaskId)) {
            query.put("DiagnoseTaskId", request.diagnoseTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDiagnoseResultForSingleCard"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDiagnoseResultForSingleCardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单卡诊断结果</p>
     * 
     * @param request GetDiagnoseResultForSingleCardRequest
     * @return GetDiagnoseResultForSingleCardResponse
     */
    public GetDiagnoseResultForSingleCardResponse getDiagnoseResultForSingleCard(GetDiagnoseResultForSingleCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDiagnoseResultForSingleCardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例详情</p>
     * 
     * @param request GetWirelessCloudConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetWirelessCloudConnectorResponse
     */
    public GetWirelessCloudConnectorResponse getWirelessCloudConnectorWithOptions(GetWirelessCloudConnectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWirelessCloudConnector"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWirelessCloudConnectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例详情</p>
     * 
     * @param request GetWirelessCloudConnectorRequest
     * @return GetWirelessCloudConnectorResponse
     */
    public GetWirelessCloudConnectorResponse getWirelessCloudConnector(GetWirelessCloudConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getWirelessCloudConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>分享授权网络连接</p>
     * 
     * @param request GrantNetLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantNetLinkResponse
     */
    public GrantNetLinkResponse grantNetLinkWithOptions(GrantNetLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantAliUid)) {
            query.put("GrantAliUid", request.grantAliUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netLinkId)) {
            query.put("NetLinkId", request.netLinkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantNetLink"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantNetLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>分享授权网络连接</p>
     * 
     * @param request GrantNetLinkRequest
     * @return GrantNetLinkResponse
     */
    public GrantNetLinkResponse grantNetLink(GrantNetLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantNetLinkWithOptions(request, runtime);
    }

    /**
     * @param request InnerLimitRateCardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InnerLimitRateCardsResponse
     */
    public InnerLimitRateCardsResponse innerLimitRateCardsWithOptions(InnerLimitRateCardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccids)) {
            query.put("Iccids", request.iccids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.innerApi)) {
            query.put("InnerApi", request.innerApi);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.task)) {
            query.put("Task", request.task);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InnerLimitRateCards"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InnerLimitRateCardsResponse());
    }

    /**
     * @param request InnerLimitRateCardsRequest
     * @return InnerLimitRateCardsResponse
     */
    public InnerLimitRateCardsResponse innerLimitRateCards(InnerLimitRateCardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.innerLimitRateCardsWithOptions(request, runtime);
    }

    /**
     * @param request InnerStopCardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InnerStopCardsResponse
     */
    public InnerStopCardsResponse innerStopCardsWithOptions(InnerStopCardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccids)) {
            query.put("Iccids", request.iccids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.innerApi)) {
            query.put("InnerApi", request.innerApi);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.task)) {
            query.put("Task", request.task);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InnerStopCards"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InnerStopCardsResponse());
    }

    /**
     * @param request InnerStopCardsRequest
     * @return InnerStopCardsResponse
     */
    public InnerStopCardsResponse innerStopCards(InnerStopCardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.innerStopCardsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务支持的APN列表</p>
     * 
     * @param request ListAPNsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAPNsResponse
     */
    public ListAPNsResponse listAPNsWithOptions(ListAPNsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAPNs"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAPNsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务支持的APN列表</p>
     * 
     * @param request ListAPNsRequest
     * @return ListAPNsResponse
     */
    public ListAPNsResponse listAPNs(ListAPNsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAPNsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例的授权规则列表</p>
     * 
     * @param request ListAuthorizationRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorizationRulesResponse
     */
    public ListAuthorizationRulesResponse listAuthorizationRulesWithOptions(ListAuthorizationRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorizationRules"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorizationRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例的授权规则列表</p>
     * 
     * @param request ListAuthorizationRulesRequest
     * @return ListAuthorizationRulesResponse
     */
    public ListAuthorizationRulesResponse listAuthorizationRules(ListAuthorizationRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorizationRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询批量操作卡任务列表</p>
     * 
     * @param request ListBatchOperateCardsTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListBatchOperateCardsTasksResponse
     */
    public ListBatchOperateCardsTasksResponse listBatchOperateCardsTasksWithOptions(ListBatchOperateCardsTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBatchOperateCardsTasks"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBatchOperateCardsTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询批量操作卡任务列表</p>
     * 
     * @param request ListBatchOperateCardsTasksRequest
     * @return ListBatchOperateCardsTasksResponse
     */
    public ListBatchOperateCardsTasksResponse listBatchOperateCardsTasks(ListBatchOperateCardsTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listBatchOperateCardsTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务物联网卡区域解锁支持区域</p>
     * 
     * @param request ListCardAreaLimitSupportAreaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCardAreaLimitSupportAreaResponse
     */
    public ListCardAreaLimitSupportAreaResponse listCardAreaLimitSupportAreaWithOptions(ListCardAreaLimitSupportAreaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCardAreaLimitSupportArea"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCardAreaLimitSupportAreaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务物联网卡区域解锁支持区域</p>
     * 
     * @param request ListCardAreaLimitSupportAreaRequest
     * @return ListCardAreaLimitSupportAreaResponse
     */
    public ListCardAreaLimitSupportAreaResponse listCardAreaLimitSupportArea(ListCardAreaLimitSupportAreaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCardAreaLimitSupportAreaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例的卡单日流量信息列表</p>
     * 
     * @param request ListCardDayUsagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCardDayUsagesResponse
     */
    public ListCardDayUsagesResponse listCardDayUsagesWithOptions(ListCardDayUsagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCardDayUsages"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCardDayUsagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例的卡单日流量信息列表</p>
     * 
     * @param request ListCardDayUsagesRequest
     * @return ListCardDayUsagesResponse
     */
    public ListCardDayUsagesResponse listCardDayUsages(ListCardDayUsagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCardDayUsagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例的流量信息列表</p>
     * 
     * @param request ListCardUsagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCardUsagesResponse
     */
    public ListCardUsagesResponse listCardUsagesWithOptions(ListCardUsagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCardUsages"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCardUsagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例的流量信息列表</p>
     * 
     * @param request ListCardUsagesRequest
     * @return ListCardUsagesResponse
     */
    public ListCardUsagesResponse listCardUsages(ListCardUsagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCardUsagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例的连接列表</p>
     * 
     * @param request ListCardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCardsResponse
     */
    public ListCardsResponse listCardsWithOptions(ListCardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCards"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例的连接列表</p>
     * 
     * @param request ListCardsRequest
     * @return ListCardsResponse
     */
    public ListCardsResponse listCards(ListCardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCardsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例下的带宽包列表</p>
     * 
     * @param request ListDataPackagesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataPackagesResponse
     */
    public ListDataPackagesResponse listDataPackagesWithOptions(ListDataPackagesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataPackages"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataPackagesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例下的带宽包列表</p>
     * 
     * @param request ListDataPackagesRequest
     * @return ListDataPackagesResponse
     */
    public ListDataPackagesResponse listDataPackages(ListDataPackagesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataPackagesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询单卡诊断信息列表</p>
     * 
     * @param request ListDiagnoseInfoForSingleCardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDiagnoseInfoForSingleCardResponse
     */
    public ListDiagnoseInfoForSingleCardResponse listDiagnoseInfoForSingleCardWithOptions(ListDiagnoseInfoForSingleCardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            query.put("SourceType", request.sourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDiagnoseInfoForSingleCard"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDiagnoseInfoForSingleCardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询单卡诊断信息列表</p>
     * 
     * @param request ListDiagnoseInfoForSingleCardRequest
     * @return ListDiagnoseInfoForSingleCardResponse
     */
    public ListDiagnoseInfoForSingleCardResponse listDiagnoseInfoForSingleCard(ListDiagnoseInfoForSingleCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDiagnoseInfoForSingleCardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例组的授权规则列表</p>
     * 
     * @param request ListGroupAuthorizationRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListGroupAuthorizationRulesResponse
     */
    public ListGroupAuthorizationRulesResponse listGroupAuthorizationRulesWithOptions(ListGroupAuthorizationRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListGroupAuthorizationRules"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListGroupAuthorizationRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例组的授权规则列表</p>
     * 
     * @param request ListGroupAuthorizationRulesRequest
     * @return ListGroupAuthorizationRulesResponse
     */
    public ListGroupAuthorizationRulesResponse listGroupAuthorizationRules(ListGroupAuthorizationRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listGroupAuthorizationRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询iotcc实例回程路由</p>
     * 
     * @param request ListIoTCloudConnectorBackhaulRouteRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIoTCloudConnectorBackhaulRouteResponse
     */
    public ListIoTCloudConnectorBackhaulRouteResponse listIoTCloudConnectorBackhaulRouteWithOptions(ListIoTCloudConnectorBackhaulRouteRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIoTCloudConnectorBackhaulRoute"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIoTCloudConnectorBackhaulRouteResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询iotcc实例回程路由</p>
     * 
     * @param request ListIoTCloudConnectorBackhaulRouteRequest
     * @return ListIoTCloudConnectorBackhaulRouteResponse
     */
    public ListIoTCloudConnectorBackhaulRouteResponse listIoTCloudConnectorBackhaulRoute(ListIoTCloudConnectorBackhaulRouteRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIoTCloudConnectorBackhaulRouteWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例下的订单列表</p>
     * 
     * @param request ListOrdersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrdersResponse
     */
    public ListOrdersResponse listOrdersWithOptions(ListOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrders"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrdersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例下的订单列表</p>
     * 
     * @param request ListOrdersRequest
     * @return ListOrdersResponse
     */
    public ListOrdersResponse listOrders(ListOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOrdersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务支持的REGION</p>
     * 
     * @param request ListRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRegionsResponse
     */
    public ListRegionsResponse listRegionsWithOptions(ListRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRegions"),
            new TeaPair("version", "2022-03-14"),
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
     * <p>查询5G高速上云服务支持的REGION</p>
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
     * <p>查询5G高速上云服务实例分组列表</p>
     * 
     * @param request ListWirelessCloudConnectorGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWirelessCloudConnectorGroupsResponse
     */
    public ListWirelessCloudConnectorGroupsResponse listWirelessCloudConnectorGroupsWithOptions(ListWirelessCloudConnectorGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWirelessCloudConnectorGroups"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWirelessCloudConnectorGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例分组列表</p>
     * 
     * @param request ListWirelessCloudConnectorGroupsRequest
     * @return ListWirelessCloudConnectorGroupsResponse
     */
    public ListWirelessCloudConnectorGroupsResponse listWirelessCloudConnectorGroups(ListWirelessCloudConnectorGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWirelessCloudConnectorGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例列表</p>
     * 
     * @param request ListWirelessCloudConnectorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWirelessCloudConnectorsResponse
     */
    public ListWirelessCloudConnectorsResponse listWirelessCloudConnectorsWithOptions(ListWirelessCloudConnectorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWirelessCloudConnectors"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWirelessCloudConnectorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务实例列表</p>
     * 
     * @param request ListWirelessCloudConnectorsRequest
     * @return ListWirelessCloudConnectorsResponse
     */
    public ListWirelessCloudConnectorsResponse listWirelessCloudConnectors(ListWirelessCloudConnectorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWirelessCloudConnectorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务支持的可用区</p>
     * 
     * @param request ListZonesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListZonesResponse
     */
    public ListZonesResponse listZonesWithOptions(ListZonesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListZones"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListZonesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询5G高速上云服务支持的可用区</p>
     * 
     * @param request ListZonesRequest
     * @return ListZonesResponse
     */
    public ListZonesResponse listZones(ListZonesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listZonesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>运营商侧卡停机</p>
     * 
     * @param request LockCardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LockCardsResponse
     */
    public LockCardsResponse lockCardsWithOptions(LockCardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccids)) {
            query.put("Iccids", request.iccids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LockCards"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LockCardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>运营商侧卡停机</p>
     * 
     * @param request LockCardsRequest
     * @return LockCardsResponse
     */
    public LockCardsResponse lockCards(LockCardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.lockCardsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改5G高速上云服务实例属性</p>
     * 
     * @param request ModifyWirelessCloudConnectorFeatureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyWirelessCloudConnectorFeatureResponse
     */
    public ModifyWirelessCloudConnectorFeatureResponse modifyWirelessCloudConnectorFeatureWithOptions(ModifyWirelessCloudConnectorFeatureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureName)) {
            query.put("FeatureName", request.featureName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.featureValue)) {
            query.put("FeatureValue", request.featureValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWirelessCloudConnectorFeature"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWirelessCloudConnectorFeatureResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改5G高速上云服务实例属性</p>
     * 
     * @param request ModifyWirelessCloudConnectorFeatureRequest
     * @return ModifyWirelessCloudConnectorFeatureResponse
     */
    public ModifyWirelessCloudConnectorFeatureResponse modifyWirelessCloudConnectorFeature(ModifyWirelessCloudConnectorFeatureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyWirelessCloudConnectorFeatureWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开通5G高速上云服务</p>
     * 
     * @param request OpenCc5gServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenCc5gServiceResponse
     */
    public OpenCc5gServiceResponse openCc5gServiceWithOptions(OpenCc5gServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenCc5gService"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenCc5gServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开通5G高速上云服务</p>
     * 
     * @param request OpenCc5gServiceRequest
     * @return OpenCc5gServiceResponse
     */
    public OpenCc5gServiceResponse openCc5gService(OpenCc5gServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openCc5gServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>物联网卡换绑解锁操作</p>
     * 
     * @param request RebindCardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebindCardsResponse
     */
    public RebindCardsResponse rebindCardsWithOptions(RebindCardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccids)) {
            query.put("Iccids", request.iccids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebindCards"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebindCardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>物联网卡换绑解锁操作</p>
     * 
     * @param request RebindCardsRequest
     * @return RebindCardsResponse
     */
    public RebindCardsResponse rebindCards(RebindCardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebindCardsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从组里移除5G高速上云服务实例</p>
     * 
     * @param request RemoveWirelessCloudConnectorFromGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RemoveWirelessCloudConnectorFromGroupResponse
     */
    public RemoveWirelessCloudConnectorFromGroupResponse removeWirelessCloudConnectorFromGroupWithOptions(RemoveWirelessCloudConnectorFromGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorGroupId)) {
            query.put("WirelessCloudConnectorGroupId", request.wirelessCloudConnectorGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorIds)) {
            query.put("WirelessCloudConnectorIds", request.wirelessCloudConnectorIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RemoveWirelessCloudConnectorFromGroup"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RemoveWirelessCloudConnectorFromGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>从组里移除5G高速上云服务实例</p>
     * 
     * @param request RemoveWirelessCloudConnectorFromGroupRequest
     * @return RemoveWirelessCloudConnectorFromGroupResponse
     */
    public RemoveWirelessCloudConnectorFromGroupResponse removeWirelessCloudConnectorFromGroup(RemoveWirelessCloudConnectorFromGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeWirelessCloudConnectorFromGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重置单卡区域限制</p>
     * 
     * @param request ResetAreaLimitCardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAreaLimitCardsResponse
     */
    public ResetAreaLimitCardsResponse resetAreaLimitCardsWithOptions(ResetAreaLimitCardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccids)) {
            query.put("Iccids", request.iccids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.province)) {
            query.put("Province", request.province);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAreaLimitCards"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAreaLimitCardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>重置单卡区域限制</p>
     * 
     * @param request ResetAreaLimitCardsRequest
     * @return ResetAreaLimitCardsResponse
     */
    public ResetAreaLimitCardsResponse resetAreaLimitCards(ResetAreaLimitCardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAreaLimitCardsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>激活单卡运营商侧卡状态恢复</p>
     * 
     * @param request ResumeCardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeCardsResponse
     */
    public ResumeCardsResponse resumeCardsWithOptions(ResumeCardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccids)) {
            query.put("Iccids", request.iccids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeCards"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeCardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>激活单卡运营商侧卡状态恢复</p>
     * 
     * @param request ResumeCardsRequest
     * @return ResumeCardsResponse
     */
    public ResumeCardsResponse resumeCards(ResumeCardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeCardsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>撤销分享授权网络连接</p>
     * 
     * @param request RevokeNetLinkRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeNetLinkResponse
     */
    public RevokeNetLinkResponse revokeNetLinkWithOptions(RevokeNetLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netLinkId)) {
            query.put("NetLinkId", request.netLinkId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeNetLink"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeNetLinkResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>撤销分享授权网络连接</p>
     * 
     * @param request RevokeNetLinkRequest
     * @return RevokeNetLinkResponse
     */
    public RevokeNetLinkResponse revokeNetLink(RevokeNetLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeNetLinkWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>运营商侧卡停机</p>
     * 
     * @param request StopCardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopCardsResponse
     */
    public StopCardsResponse stopCardsWithOptions(StopCardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccids)) {
            query.put("Iccids", request.iccids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopCards"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopCardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>运营商侧卡停机</p>
     * 
     * @param request StopCardsRequest
     * @return StopCardsResponse
     */
    public StopCardsResponse stopCards(StopCardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopCardsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开启cciot单卡一键诊断</p>
     * 
     * @param request SubmitDiagnoseTaskForSingleCardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitDiagnoseTaskForSingleCardResponse
     */
    public SubmitDiagnoseTaskForSingleCardResponse submitDiagnoseTaskForSingleCardWithOptions(SubmitDiagnoseTaskForSingleCardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.beginTime)) {
            query.put("BeginTime", request.beginTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionNo)) {
            query.put("RegionNo", request.regionNo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceUid)) {
            query.put("ResourceUid", request.resourceUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitDiagnoseTaskForSingleCard"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitDiagnoseTaskForSingleCardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开启cciot单卡一键诊断</p>
     * 
     * @param request SubmitDiagnoseTaskForSingleCardRequest
     * @return SubmitDiagnoseTaskForSingleCardResponse
     */
    public SubmitDiagnoseTaskForSingleCardResponse submitDiagnoseTaskForSingleCard(SubmitDiagnoseTaskForSingleCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitDiagnoseTaskForSingleCardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>切换cc5g实例商业类型到商业版</p>
     * 
     * @param request SwitchWirelessCloudConnectorToBusinessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchWirelessCloudConnectorToBusinessResponse
     */
    public SwitchWirelessCloudConnectorToBusinessResponse switchWirelessCloudConnectorToBusinessWithOptions(SwitchWirelessCloudConnectorToBusinessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchWirelessCloudConnectorToBusiness"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchWirelessCloudConnectorToBusinessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>切换cc5g实例商业类型到商业版</p>
     * 
     * @param request SwitchWirelessCloudConnectorToBusinessRequest
     * @return SwitchWirelessCloudConnectorToBusinessResponse
     */
    public SwitchWirelessCloudConnectorToBusinessResponse switchWirelessCloudConnectorToBusiness(SwitchWirelessCloudConnectorToBusinessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchWirelessCloudConnectorToBusinessWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量解锁卡</p>
     * 
     * @param request UnlockCardsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnlockCardsResponse
     */
    public UnlockCardsResponse unlockCardsWithOptions(UnlockCardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccids)) {
            query.put("Iccids", request.iccids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnlockCards"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnlockCardsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量解锁卡</p>
     * 
     * @param request UnlockCardsRequest
     * @return UnlockCardsResponse
     */
    public UnlockCardsResponse unlockCards(UnlockCardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unlockCardsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新5G高速上云服务实例的授权规则</p>
     * 
     * @param request UpdateAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuthorizationRuleResponse
     */
    public UpdateAuthorizationRuleResponse updateAuthorizationRuleWithOptions(UpdateAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationPort)) {
            query.put("DestinationPort", request.destinationPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidr)) {
            query.put("SourceCidr", request.sourceCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuthorizationRule"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新5G高速上云服务实例的授权规则</p>
     * 
     * @param request UpdateAuthorizationRuleRequest
     * @return UpdateAuthorizationRuleResponse
     */
    public UpdateAuthorizationRuleResponse updateAuthorizationRule(UpdateAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改批量操作卡任务</p>
     * 
     * @param request UpdateBatchOperateCardsTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateBatchOperateCardsTaskResponse
     */
    public UpdateBatchOperateCardsTaskResponse updateBatchOperateCardsTaskWithOptions(UpdateBatchOperateCardsTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.batchOperateCardsTaskId)) {
            query.put("BatchOperateCardsTaskId", request.batchOperateCardsTaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectType)) {
            query.put("EffectType", request.effectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccids)) {
            query.put("Iccids", request.iccids);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccidsOssFilePath)) {
            query.put("IccidsOssFilePath", request.iccidsOssFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.threshold)) {
            query.put("Threshold", request.threshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorIds)) {
            query.put("WirelessCloudConnectorIds", request.wirelessCloudConnectorIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBatchOperateCardsTask"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBatchOperateCardsTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改批量操作卡任务</p>
     * 
     * @param request UpdateBatchOperateCardsTaskRequest
     * @return UpdateBatchOperateCardsTaskResponse
     */
    public UpdateBatchOperateCardsTaskResponse updateBatchOperateCardsTask(UpdateBatchOperateCardsTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateBatchOperateCardsTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改5G高速上云服务实例的连接描述和名称信息</p>
     * 
     * @param request UpdateCardRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCardResponse
     */
    public UpdateCardResponse updateCardWithOptions(UpdateCardRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.iccid)) {
            query.put("Iccid", request.iccid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCard"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCardResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改5G高速上云服务实例的连接描述和名称信息</p>
     * 
     * @param request UpdateCardRequest
     * @return UpdateCardResponse
     */
    public UpdateCardResponse updateCard(UpdateCardRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCardWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新5G高速上云服务实例的DNS授权规则</p>
     * 
     * @param request UpdateDNSAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDNSAuthorizationRuleResponse
     */
    public UpdateDNSAuthorizationRuleResponse updateDNSAuthorizationRuleWithOptions(UpdateDNSAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationIp)) {
            query.put("DestinationIp", request.destinationIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDNSIp)) {
            query.put("SourceDNSIp", request.sourceDNSIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDNSAuthorizationRule"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDNSAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新5G高速上云服务实例的DNS授权规则</p>
     * 
     * @param request UpdateDNSAuthorizationRuleRequest
     * @return UpdateDNSAuthorizationRuleResponse
     */
    public UpdateDNSAuthorizationRuleResponse updateDNSAuthorizationRule(UpdateDNSAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDNSAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新5G高速上云服务实例组的授权规则</p>
     * 
     * @param request UpdateGroupAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupAuthorizationRuleResponse
     */
    public UpdateGroupAuthorizationRuleResponse updateGroupAuthorizationRuleWithOptions(UpdateGroupAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destination)) {
            query.put("Destination", request.destination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationPort)) {
            query.put("DestinationPort", request.destinationPort);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policy)) {
            query.put("Policy", request.policy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.protocol)) {
            query.put("Protocol", request.protocol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceCidr)) {
            query.put("SourceCidr", request.sourceCidr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorGroupId)) {
            query.put("WirelessCloudConnectorGroupId", request.wirelessCloudConnectorGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroupAuthorizationRule"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新5G高速上云服务实例组的授权规则</p>
     * 
     * @param request UpdateGroupAuthorizationRuleRequest
     * @return UpdateGroupAuthorizationRuleResponse
     */
    public UpdateGroupAuthorizationRuleResponse updateGroupAuthorizationRule(UpdateGroupAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGroupAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新5G高速上云服务实例组的DNS授权规则</p>
     * 
     * @param request UpdateGroupDnsAuthorizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateGroupDnsAuthorizationRuleResponse
     */
    public UpdateGroupDnsAuthorizationRuleResponse updateGroupDnsAuthorizationRuleWithOptions(UpdateGroupDnsAuthorizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.authorizationRuleId)) {
            query.put("AuthorizationRuleId", request.authorizationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationIp)) {
            query.put("DestinationIp", request.destinationIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDNSIp)) {
            query.put("SourceDNSIp", request.sourceDNSIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorGroupId)) {
            query.put("WirelessCloudConnectorGroupId", request.wirelessCloudConnectorGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateGroupDnsAuthorizationRule"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateGroupDnsAuthorizationRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新5G高速上云服务实例组的DNS授权规则</p>
     * 
     * @param request UpdateGroupDnsAuthorizationRuleRequest
     * @return UpdateGroupDnsAuthorizationRuleResponse
     */
    public UpdateGroupDnsAuthorizationRuleResponse updateGroupDnsAuthorizationRule(UpdateGroupDnsAuthorizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateGroupDnsAuthorizationRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改5G高速上云服务实例</p>
     * 
     * @param request UpdateWirelessCloudConnectorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWirelessCloudConnectorResponse
     */
    public UpdateWirelessCloudConnectorResponse updateWirelessCloudConnectorWithOptions(UpdateWirelessCloudConnectorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorId)) {
            query.put("WirelessCloudConnectorId", request.wirelessCloudConnectorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWirelessCloudConnector"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWirelessCloudConnectorResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改5G高速上云服务实例</p>
     * 
     * @param request UpdateWirelessCloudConnectorRequest
     * @return UpdateWirelessCloudConnectorResponse
     */
    public UpdateWirelessCloudConnectorResponse updateWirelessCloudConnector(UpdateWirelessCloudConnectorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWirelessCloudConnectorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改5G高速上云服务实例分组</p>
     * 
     * @param request UpdateWirelessCloudConnectorGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateWirelessCloudConnectorGroupResponse
     */
    public UpdateWirelessCloudConnectorGroupResponse updateWirelessCloudConnectorGroupWithOptions(UpdateWirelessCloudConnectorGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.wirelessCloudConnectorGroupId)) {
            query.put("WirelessCloudConnectorGroupId", request.wirelessCloudConnectorGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWirelessCloudConnectorGroup"),
            new TeaPair("version", "2022-03-14"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWirelessCloudConnectorGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改5G高速上云服务实例分组</p>
     * 
     * @param request UpdateWirelessCloudConnectorGroupRequest
     * @return UpdateWirelessCloudConnectorGroupResponse
     */
    public UpdateWirelessCloudConnectorGroupResponse updateWirelessCloudConnectorGroup(UpdateWirelessCloudConnectorGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateWirelessCloudConnectorGroupWithOptions(request, runtime);
    }
}
