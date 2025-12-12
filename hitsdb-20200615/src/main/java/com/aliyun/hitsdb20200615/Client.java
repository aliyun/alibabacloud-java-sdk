// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hitsdb20200615;

import com.aliyun.tea.*;
import com.aliyun.hitsdb20200615.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("hitsdb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Changes a resource group to another.</p>
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeResourceGroup"),
            new TeaPair("version", "2020-06-15"),
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
     * <p>Changes a resource group to another.</p>
     * 
     * @param request ChangeResourceGroupRequest
     * @return ChangeResourceGroupResponse
     */
    public ChangeResourceGroupResponse changeResourceGroup(ChangeResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeResourceGroupWithOptions(request, runtime);
    }

    /**
     * @param request CheckLdpsColumnarIndexStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckLdpsColumnarIndexStatusResponse
     */
    public CheckLdpsColumnarIndexStatusResponse checkLdpsColumnarIndexStatusWithOptions(CheckLdpsColumnarIndexStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckLdpsColumnarIndexStatus"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckLdpsColumnarIndexStatusResponse());
    }

    /**
     * @param request CheckLdpsColumnarIndexStatusRequest
     * @return CheckLdpsColumnarIndexStatusResponse
     */
    public CheckLdpsColumnarIndexStatusResponse checkLdpsColumnarIndexStatus(CheckLdpsColumnarIndexStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkLdpsColumnarIndexStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建弹性伸缩配置</p>
     * 
     * @param tmpReq CreateAutoScalingConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAutoScalingConfigResponse
     */
    public CreateAutoScalingConfigResponse createAutoScalingConfigWithOptions(CreateAutoScalingConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAutoScalingConfigShrinkRequest request = new CreateAutoScalingConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scaleRuleList)) {
            request.scaleRuleListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scaleRuleList, "ScaleRuleList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configName)) {
            query.put("ConfigName", request.configName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTimeEnd)) {
            query.put("EffectiveTimeEnd", request.effectiveTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTimeStart)) {
            query.put("EffectiveTimeStart", request.effectiveTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodesMax)) {
            query.put("NodesMax", request.nodesMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodesMin)) {
            query.put("NodesMin", request.nodesMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleRuleListShrink)) {
            query.put("ScaleRuleList", request.scaleRuleListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleType)) {
            query.put("ScaleType", request.scaleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specId)) {
            query.put("SpecId", request.specId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageCapacityMax)) {
            query.put("StorageCapacityMax", request.storageCapacityMax);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoScalingConfig"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoScalingConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建弹性伸缩配置</p>
     * 
     * @param request CreateAutoScalingConfigRequest
     * @return CreateAutoScalingConfigResponse
     */
    public CreateAutoScalingConfigResponse createAutoScalingConfig(CreateAutoScalingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAutoScalingConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建弹性伸缩规则</p>
     * 
     * @param request CreateAutoScalingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAutoScalingRuleResponse
     */
    public CreateAutoScalingRuleResponse createAutoScalingRuleWithOptions(CreateAutoScalingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.observationWindow)) {
            query.put("ObservationWindow", request.observationWindow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleInStep)) {
            query.put("ScaleInStep", request.scaleInStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleOutStep)) {
            query.put("ScaleOutStep", request.scaleOutStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silenceTime)) {
            query.put("SilenceTime", request.silenceTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetMetric)) {
            query.put("TargetMetric", request.targetMetric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetNodes)) {
            query.put("TargetNodes", request.targetNodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thresholdLower)) {
            query.put("ThresholdLower", request.thresholdLower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thresholdUpper)) {
            query.put("ThresholdUpper", request.thresholdUpper);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerCronExpr)) {
            query.put("TriggerCronExpr", request.triggerCronExpr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAutoScalingRule"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAutoScalingRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建弹性伸缩规则</p>
     * 
     * @param request CreateAutoScalingRuleRequest
     * @return CreateAutoScalingRuleResponse
     */
    public CreateAutoScalingRuleResponse createAutoScalingRule(CreateAutoScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAutoScalingRuleWithOptions(request, runtime);
    }

    /**
     * @param request CreateLdpsComputeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLdpsComputeGroupResponse
     */
    public CreateLdpsComputeGroupResponse createLdpsComputeGroupWithOptions(CreateLdpsComputeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.properties)) {
            query.put("Properties", request.properties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLdpsComputeGroup"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLdpsComputeGroupResponse());
    }

    /**
     * @param request CreateLdpsComputeGroupRequest
     * @return CreateLdpsComputeGroupResponse
     */
    public CreateLdpsComputeGroupResponse createLdpsComputeGroup(CreateLdpsComputeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLdpsComputeGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You must select at least one engine when you create a Lindorm instance. For more information about how to select the storage type and engine type when you create a Lindorm instance, see <a href="https://help.aliyun.com/document_detail/181971.html">Select engine types</a> and <a href="https://help.aliyun.com/document_detail/174643.html">Select storage types</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Lindorm instance.</p>
     * 
     * @param request CreateLindormInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLindormInstanceResponse
     */
    public CreateLindormInstanceResponse createLindormInstanceWithOptions(CreateLindormInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arbiterVSwitchId)) {
            query.put("ArbiterVSwitchId", request.arbiterVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arbiterZoneId)) {
            query.put("ArbiterZoneId", request.arbiterZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.archVersion)) {
            query.put("ArchVersion", request.archVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewDuration)) {
            query.put("AutoRenewDuration", request.autoRenewDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewal)) {
            query.put("AutoRenewal", request.autoRenewal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coldStorage)) {
            query.put("ColdStorage", request.coldStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coreSingleStorage)) {
            query.put("CoreSingleStorage", request.coreSingleStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coreSpec)) {
            query.put("CoreSpec", request.coreSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskCategory)) {
            query.put("DiskCategory", request.diskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filestoreNum)) {
            query.put("FilestoreNum", request.filestoreNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filestoreSpec)) {
            query.put("FilestoreSpec", request.filestoreSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceAlias)) {
            query.put("InstanceAlias", request.instanceAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceStorage)) {
            query.put("InstanceStorage", request.instanceStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lindormNum)) {
            query.put("LindormNum", request.lindormNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lindormSpec)) {
            query.put("LindormSpec", request.lindormSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logDiskCategory)) {
            query.put("LogDiskCategory", request.logDiskCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logNum)) {
            query.put("LogNum", request.logNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSingleStorage)) {
            query.put("LogSingleStorage", request.logSingleStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSpec)) {
            query.put("LogSpec", request.logSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ltsNum)) {
            query.put("LtsNum", request.ltsNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ltsSpec)) {
            query.put("LtsSpec", request.ltsSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.multiZoneCombination)) {
            query.put("MultiZoneCombination", request.multiZoneCombination);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryVSwitchId)) {
            query.put("PrimaryVSwitchId", request.primaryVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryZoneId)) {
            query.put("PrimaryZoneId", request.primaryZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solrNum)) {
            query.put("SolrNum", request.solrNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solrSpec)) {
            query.put("SolrSpec", request.solrSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyVSwitchId)) {
            query.put("StandbyVSwitchId", request.standbyVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyZoneId)) {
            query.put("StandbyZoneId", request.standbyZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamNum)) {
            query.put("StreamNum", request.streamNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamSpec)) {
            query.put("StreamSpec", request.streamSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tsdbNum)) {
            query.put("TsdbNum", request.tsdbNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tsdbSpec)) {
            query.put("TsdbSpec", request.tsdbSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VPCId)) {
            query.put("VPCId", request.VPCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLindormInstance"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLindormInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You must select at least one engine when you create a Lindorm instance. For more information about how to select the storage type and engine type when you create a Lindorm instance, see <a href="https://help.aliyun.com/document_detail/181971.html">Select engine types</a> and <a href="https://help.aliyun.com/document_detail/174643.html">Select storage types</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a Lindorm instance.</p>
     * 
     * @param request CreateLindormInstanceRequest
     * @return CreateLindormInstanceResponse
     */
    public CreateLindormInstanceResponse createLindormInstance(CreateLindormInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLindormInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建Lindorm实例</p>
     * 
     * @param request CreateLindormV2InstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLindormV2InstanceResponse
     */
    public CreateLindormV2InstanceResponse createLindormV2InstanceWithOptions(CreateLindormV2InstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arbiterVSwitchId)) {
            query.put("ArbiterVSwitchId", request.arbiterVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arbiterZoneId)) {
            query.put("ArbiterZoneId", request.arbiterZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.archVersion)) {
            query.put("ArchVersion", request.archVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewDuration)) {
            query.put("AutoRenewDuration", request.autoRenewDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewal)) {
            query.put("AutoRenewal", request.autoRenewal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.capacityStorageSize)) {
            query.put("CapacityStorageSize", request.capacityStorageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudStorageSize)) {
            query.put("CloudStorageSize", request.cloudStorageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudStorageType)) {
            query.put("CloudStorageType", request.cloudStorageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterMode)) {
            query.put("ClusterMode", request.clusterMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterPattern)) {
            query.put("ClusterPattern", request.clusterPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCapacityStorage)) {
            query.put("EnableCapacityStorage", request.enableCapacityStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineList)) {
            query.put("EngineList", request.engineList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceAlias)) {
            query.put("InstanceAlias", request.instanceAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryVSwitchId)) {
            query.put("PrimaryVSwitchId", request.primaryVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryZoneId)) {
            query.put("PrimaryZoneId", request.primaryZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyVSwitchId)) {
            query.put("StandbyVSwitchId", request.standbyVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyZoneId)) {
            query.put("StandbyZoneId", request.standbyZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VPCId)) {
            query.put("VPCId", request.VPCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLindormV2Instance"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLindormV2InstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建Lindorm实例</p>
     * 
     * @param request CreateLindormV2InstanceRequest
     * @return CreateLindormV2InstanceResponse
     */
    public CreateLindormV2InstanceResponse createLindormV2Instance(CreateLindormV2InstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLindormV2InstanceWithOptions(request, runtime);
    }

    /**
     * @param request DeleteAutoScalingConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAutoScalingConfigResponse
     */
    public DeleteAutoScalingConfigResponse deleteAutoScalingConfigWithOptions(DeleteAutoScalingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoScalingConfig"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoScalingConfigResponse());
    }

    /**
     * @param request DeleteAutoScalingConfigRequest
     * @return DeleteAutoScalingConfigResponse
     */
    public DeleteAutoScalingConfigResponse deleteAutoScalingConfig(DeleteAutoScalingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutoScalingConfigWithOptions(request, runtime);
    }

    /**
     * @param request DeleteAutoScalingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAutoScalingRuleResponse
     */
    public DeleteAutoScalingRuleResponse deleteAutoScalingRuleWithOptions(DeleteAutoScalingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAutoScalingRule"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAutoScalingRuleResponse());
    }

    /**
     * @param request DeleteAutoScalingRuleRequest
     * @return DeleteAutoScalingRuleResponse
     */
    public DeleteAutoScalingRuleResponse deleteAutoScalingRule(DeleteAutoScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAutoScalingRuleWithOptions(request, runtime);
    }

    /**
     * @param request DeleteCustomResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCustomResourceResponse
     */
    public DeleteCustomResourceResponse deleteCustomResourceWithOptions(DeleteCustomResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCustomResource"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCustomResourceResponse());
    }

    /**
     * @param request DeleteCustomResourceRequest
     * @return DeleteCustomResourceResponse
     */
    public DeleteCustomResourceResponse deleteCustomResource(DeleteCustomResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCustomResourceWithOptions(request, runtime);
    }

    /**
     * @param request DeleteLdpsComputeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLdpsComputeGroupResponse
     */
    public DeleteLdpsComputeGroupResponse deleteLdpsComputeGroupWithOptions(DeleteLdpsComputeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLdpsComputeGroup"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLdpsComputeGroupResponse());
    }

    /**
     * @param request DeleteLdpsComputeGroupRequest
     * @return DeleteLdpsComputeGroupResponse
     */
    public DeleteLdpsComputeGroupResponse deleteLdpsComputeGroup(DeleteLdpsComputeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLdpsComputeGroupWithOptions(request, runtime);
    }

    /**
     * @param request DeployLdpsSemiManagedComponentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeployLdpsSemiManagedComponentResponse
     */
    public DeployLdpsSemiManagedComponentResponse deployLdpsSemiManagedComponentWithOptions(DeployLdpsSemiManagedComponentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.componentName)) {
            query.put("ComponentName", request.componentName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeployLdpsSemiManagedComponent"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeployLdpsSemiManagedComponentResponse());
    }

    /**
     * @param request DeployLdpsSemiManagedComponentRequest
     * @return DeployLdpsSemiManagedComponentResponse
     */
    public DeployLdpsSemiManagedComponentResponse deployLdpsSemiManagedComponent(DeployLdpsSemiManagedComponentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deployLdpsSemiManagedComponentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the regions supported by Lindorm.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-06-15"),
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
     * <p>Obtains the regions supported by Lindorm.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * @param request GetAutoScalingConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutoScalingConfigResponse
     */
    public GetAutoScalingConfigResponse getAutoScalingConfigWithOptions(GetAutoScalingConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoScalingConfig"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoScalingConfigResponse());
    }

    /**
     * @param request GetAutoScalingConfigRequest
     * @return GetAutoScalingConfigResponse
     */
    public GetAutoScalingConfigResponse getAutoScalingConfig(GetAutoScalingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoScalingConfigWithOptions(request, runtime);
    }

    /**
     * @param request GetAutoScalingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAutoScalingRuleResponse
     */
    public GetAutoScalingRuleResponse getAutoScalingRuleWithOptions(GetAutoScalingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAutoScalingRule"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAutoScalingRuleResponse());
    }

    /**
     * @param request GetAutoScalingRuleRequest
     * @return GetAutoScalingRuleResponse
     */
    public GetAutoScalingRuleResponse getAutoScalingRule(GetAutoScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutoScalingRuleWithOptions(request, runtime);
    }

    /**
     * @param request GetClientSourceIpRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClientSourceIpResponse
     */
    public GetClientSourceIpResponse getClientSourceIpWithOptions(GetClientSourceIpRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClientSourceIp"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClientSourceIpResponse());
    }

    /**
     * @param request GetClientSourceIpRequest
     * @return GetClientSourceIpResponse
     */
    public GetClientSourceIpResponse getClientSourceIp(GetClientSourceIpRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClientSourceIpWithOptions(request, runtime);
    }

    /**
     * @param request GetEngineDefaultAuthRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetEngineDefaultAuthResponse
     */
    public GetEngineDefaultAuthResponse getEngineDefaultAuthWithOptions(GetEngineDefaultAuthRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEngineDefaultAuth"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEngineDefaultAuthResponse());
    }

    /**
     * @param request GetEngineDefaultAuthRequest
     * @return GetEngineDefaultAuthResponse
     */
    public GetEngineDefaultAuthResponse getEngineDefaultAuth(GetEngineDefaultAuthRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEngineDefaultAuthWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the whitelists configured for a Lindorm instance.</p>
     * 
     * @param request GetInstanceIpWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceIpWhiteListResponse
     */
    public GetInstanceIpWhiteListResponse getInstanceIpWhiteListWithOptions(GetInstanceIpWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceIpWhiteList"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceIpWhiteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the whitelists configured for a Lindorm instance.</p>
     * 
     * @param request GetInstanceIpWhiteListRequest
     * @return GetInstanceIpWhiteListResponse
     */
    public GetInstanceIpWhiteListResponse getInstanceIpWhiteList(GetInstanceIpWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceIpWhiteListWithOptions(request, runtime);
    }

    /**
     * @param request GetInstanceSecurityGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceSecurityGroupsResponse
     */
    public GetInstanceSecurityGroupsResponse getInstanceSecurityGroupsWithOptions(GetInstanceSecurityGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstanceSecurityGroups"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceSecurityGroupsResponse());
    }

    /**
     * @param request GetInstanceSecurityGroupsRequest
     * @return GetInstanceSecurityGroupsResponse
     */
    public GetInstanceSecurityGroupsResponse getInstanceSecurityGroups(GetInstanceSecurityGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceSecurityGroupsWithOptions(request, runtime);
    }

    /**
     * @param request GetLdpsComputeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLdpsComputeGroupResponse
     */
    public GetLdpsComputeGroupResponse getLdpsComputeGroupWithOptions(GetLdpsComputeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLdpsComputeGroup"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLdpsComputeGroupResponse());
    }

    /**
     * @param request GetLdpsComputeGroupRequest
     * @return GetLdpsComputeGroupResponse
     */
    public GetLdpsComputeGroupResponse getLdpsComputeGroup(GetLdpsComputeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLdpsComputeGroupWithOptions(request, runtime);
    }

    /**
     * @param request GetLdpsNamespacedQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLdpsNamespacedQuotaResponse
     */
    public GetLdpsNamespacedQuotaResponse getLdpsNamespacedQuotaWithOptions(GetLdpsNamespacedQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLdpsNamespacedQuota"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLdpsNamespacedQuotaResponse());
    }

    /**
     * @param request GetLdpsNamespacedQuotaRequest
     * @return GetLdpsNamespacedQuotaResponse
     */
    public GetLdpsNamespacedQuotaResponse getLdpsNamespacedQuota(GetLdpsNamespacedQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLdpsNamespacedQuotaWithOptions(request, runtime);
    }

    /**
     * @param request GetLdpsResourceCostRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLdpsResourceCostResponse
     */
    public GetLdpsResourceCostResponse getLdpsResourceCostWithOptions(GetLdpsResourceCostRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLdpsResourceCost"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLdpsResourceCostResponse());
    }

    /**
     * @param request GetLdpsResourceCostRequest
     * @return GetLdpsResourceCostResponse
     */
    public GetLdpsResourceCostResponse getLdpsResourceCost(GetLdpsResourceCostRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLdpsResourceCostWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Lindorm引擎配置</p>
     * 
     * @param request GetLindormEngineConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLindormEngineConfigResponse
     */
    public GetLindormEngineConfigResponse getLindormEngineConfigWithOptions(GetLindormEngineConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormEngineConfig"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormEngineConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Lindorm引擎配置</p>
     * 
     * @param request GetLindormEngineConfigRequest
     * @return GetLindormEngineConfigResponse
     */
    public GetLindormEngineConfigResponse getLindormEngineConfig(GetLindormEngineConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLindormEngineConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If the version of the underlying storage engine in a Lindorm cluster is 4.1.9 or later, the storage usage values returned for the LStorageUsageList parameter prevail.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of each storage type in a Lindorm instance.</p>
     * 
     * @param request GetLindormFsUsedDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLindormFsUsedDetailResponse
     */
    public GetLindormFsUsedDetailResponse getLindormFsUsedDetailWithOptions(GetLindormFsUsedDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormFsUsedDetail"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormFsUsedDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>If the version of the underlying storage engine in a Lindorm cluster is 4.1.9 or later, the storage usage values returned for the LStorageUsageList parameter prevail.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of each storage type in a Lindorm instance.</p>
     * 
     * @param request GetLindormFsUsedDetailRequest
     * @return GetLindormFsUsedDetailResponse
     */
    public GetLindormFsUsedDetailResponse getLindormFsUsedDetail(GetLindormFsUsedDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLindormFsUsedDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the detailed information about a Lindorm instance, including the instance type, billing method, and VPC.</p>
     * 
     * @param request GetLindormInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLindormInstanceResponse
     */
    public GetLindormInstanceResponse getLindormInstanceWithOptions(GetLindormInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormInstance"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the detailed information about a Lindorm instance, including the instance type, billing method, and VPC.</p>
     * 
     * @param request GetLindormInstanceRequest
     * @return GetLindormInstanceResponse
     */
    public GetLindormInstanceResponse getLindormInstance(GetLindormInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLindormInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the engine types supported by the specified Lindorm instance.</p>
     * 
     * @param request GetLindormInstanceEngineListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLindormInstanceEngineListResponse
     */
    public GetLindormInstanceEngineListResponse getLindormInstanceEngineListWithOptions(GetLindormInstanceEngineListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormInstanceEngineList"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormInstanceEngineListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the engine types supported by the specified Lindorm instance.</p>
     * 
     * @param request GetLindormInstanceEngineListRequest
     * @return GetLindormInstanceEngineListResponse
     */
    public GetLindormInstanceEngineListResponse getLindormInstanceEngineList(GetLindormInstanceEngineListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLindormInstanceEngineListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the instances that meet the specified conditions.</p>
     * 
     * @param request GetLindormInstanceListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLindormInstanceListResponse
     */
    public GetLindormInstanceListResponse getLindormInstanceListWithOptions(GetLindormInstanceListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryStr)) {
            query.put("QueryStr", request.queryStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceType)) {
            query.put("ServiceType", request.serviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportEngine)) {
            query.put("SupportEngine", request.supportEngine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormInstanceList"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormInstanceListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the instances that meet the specified conditions.</p>
     * 
     * @param request GetLindormInstanceListRequest
     * @return GetLindormInstanceListResponse
     */
    public GetLindormInstanceListResponse getLindormInstanceList(GetLindormInstanceListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLindormInstanceListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例详情</p>
     * 
     * @param request GetLindormV2InstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLindormV2InstanceResponse
     */
    public GetLindormV2InstanceResponse getLindormV2InstanceWithOptions(GetLindormV2InstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormV2Instance"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormV2InstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询实例详情</p>
     * 
     * @param request GetLindormV2InstanceRequest
     * @return GetLindormV2InstanceResponse
     */
    public GetLindormV2InstanceResponse getLindormV2Instance(GetLindormV2InstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLindormV2InstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询新架构实例详情</p>
     * 
     * @param request GetLindormV2InstanceDetailsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLindormV2InstanceDetailsResponse
     */
    public GetLindormV2InstanceDetailsResponse getLindormV2InstanceDetailsWithOptions(GetLindormV2InstanceDetailsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormV2InstanceDetails"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormV2InstanceDetailsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询新架构实例详情</p>
     * 
     * @param request GetLindormV2InstanceDetailsRequest
     * @return GetLindormV2InstanceDetailsResponse
     */
    public GetLindormV2InstanceDetailsResponse getLindormV2InstanceDetails(GetLindormV2InstanceDetailsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLindormV2InstanceDetailsWithOptions(request, runtime);
    }

    /**
     * @param request GetLindormV2InstanceEngineListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLindormV2InstanceEngineListResponse
     */
    public GetLindormV2InstanceEngineListResponse getLindormV2InstanceEngineListWithOptions(GetLindormV2InstanceEngineListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormV2InstanceEngineList"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormV2InstanceEngineListResponse());
    }

    /**
     * @param request GetLindormV2InstanceEngineListRequest
     * @return GetLindormV2InstanceEngineListResponse
     */
    public GetLindormV2InstanceEngineListResponse getLindormV2InstanceEngineList(GetLindormV2InstanceEngineListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLindormV2InstanceEngineListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询新架构实例详情</p>
     * 
     * @param request GetLindormV2InstanceForTerraformRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLindormV2InstanceForTerraformResponse
     */
    public GetLindormV2InstanceForTerraformResponse getLindormV2InstanceForTerraformWithOptions(GetLindormV2InstanceForTerraformRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormV2InstanceForTerraform"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormV2InstanceForTerraformResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询新架构实例详情</p>
     * 
     * @param request GetLindormV2InstanceForTerraformRequest
     * @return GetLindormV2InstanceForTerraformResponse
     */
    public GetLindormV2InstanceForTerraformResponse getLindormV2InstanceForTerraform(GetLindormV2InstanceForTerraformRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLindormV2InstanceForTerraformWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询新架构实例安全组信息</p>
     * 
     * @param request GetLindormV2InstanceSecurityGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLindormV2InstanceSecurityGroupsResponse
     */
    public GetLindormV2InstanceSecurityGroupsResponse getLindormV2InstanceSecurityGroupsWithOptions(GetLindormV2InstanceSecurityGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormV2InstanceSecurityGroups"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormV2InstanceSecurityGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询新架构实例安全组信息</p>
     * 
     * @param request GetLindormV2InstanceSecurityGroupsRequest
     * @return GetLindormV2InstanceSecurityGroupsResponse
     */
    public GetLindormV2InstanceSecurityGroupsResponse getLindormV2InstanceSecurityGroups(GetLindormV2InstanceSecurityGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLindormV2InstanceSecurityGroupsWithOptions(request, runtime);
    }

    /**
     * @param request GetLindormV2StorageUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLindormV2StorageUsageResponse
     */
    public GetLindormV2StorageUsageResponse getLindormV2StorageUsageWithOptions(GetLindormV2StorageUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormV2StorageUsage"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormV2StorageUsageResponse());
    }

    /**
     * @param request GetLindormV2StorageUsageRequest
     * @return GetLindormV2StorageUsageResponse
     */
    public GetLindormV2StorageUsageResponse getLindormV2StorageUsage(GetLindormV2StorageUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLindormV2StorageUsageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取流引擎信息</p>
     * 
     * @param request GetLindormV2StreamEngineInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLindormV2StreamEngineInfoResponse
     */
    public GetLindormV2StreamEngineInfoResponse getLindormV2StreamEngineInfoWithOptions(GetLindormV2StreamEngineInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLindormV2StreamEngineInfo"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLindormV2StreamEngineInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取流引擎信息</p>
     * 
     * @param request GetLindormV2StreamEngineInfoRequest
     * @return GetLindormV2StreamEngineInfoResponse
     */
    public GetLindormV2StreamEngineInfoResponse getLindormV2StreamEngineInfo(GetLindormV2StreamEngineInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLindormV2StreamEngineInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询弹性伸缩配置</p>
     * 
     * @param tmpReq ListAutoScalingConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAutoScalingConfigsResponse
     */
    public ListAutoScalingConfigsResponse listAutoScalingConfigsWithOptions(ListAutoScalingConfigsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAutoScalingConfigsShrinkRequest request = new ListAutoScalingConfigsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scaleTypes)) {
            request.scaleTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scaleTypes, "ScaleTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleTypesShrink)) {
            query.put("ScaleTypes", request.scaleTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutoScalingConfigs"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoScalingConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询弹性伸缩配置</p>
     * 
     * @param request ListAutoScalingConfigsRequest
     * @return ListAutoScalingConfigsResponse
     */
    public ListAutoScalingConfigsResponse listAutoScalingConfigs(ListAutoScalingConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAutoScalingConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询伸缩记录</p>
     * 
     * @param tmpReq ListAutoScalingRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAutoScalingRecordsResponse
     */
    public ListAutoScalingRecordsResponse listAutoScalingRecordsWithOptions(ListAutoScalingRecordsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAutoScalingRecordsShrinkRequest request = new ListAutoScalingRecordsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scaleTypes)) {
            request.scaleTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scaleTypes, "ScaleTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNum)) {
            query.put("PageNum", request.pageNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleTypesShrink)) {
            query.put("ScaleTypes", request.scaleTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutoScalingRecords"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoScalingRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询伸缩记录</p>
     * 
     * @param request ListAutoScalingRecordsRequest
     * @return ListAutoScalingRecordsResponse
     */
    public ListAutoScalingRecordsResponse listAutoScalingRecords(ListAutoScalingRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAutoScalingRecordsWithOptions(request, runtime);
    }

    /**
     * @param request ListAutoScalingRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAutoScalingRulesResponse
     */
    public ListAutoScalingRulesResponse listAutoScalingRulesWithOptions(ListAutoScalingRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAutoScalingRules"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAutoScalingRulesResponse());
    }

    /**
     * @param request ListAutoScalingRulesRequest
     * @return ListAutoScalingRulesResponse
     */
    public ListAutoScalingRulesResponse listAutoScalingRules(ListAutoScalingRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAutoScalingRulesWithOptions(request, runtime);
    }

    /**
     * @param request ListLdpsComputeGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLdpsComputeGroupsResponse
     */
    public ListLdpsComputeGroupsResponse listLdpsComputeGroupsWithOptions(ListLdpsComputeGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLdpsComputeGroups"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLdpsComputeGroupsResponse());
    }

    /**
     * @param request ListLdpsComputeGroupsRequest
     * @return ListLdpsComputeGroupsResponse
     */
    public ListLdpsComputeGroupsResponse listLdpsComputeGroups(ListLdpsComputeGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLdpsComputeGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags associated with the specified Lindorm instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-06-15"),
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
     * <p>Queries the tags associated with the specified Lindorm instance.</p>
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
     * <p>单可用区迁移多可用区基础版</p>
     * 
     * @param request MigrateSingleZoneToMultiZoneRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MigrateSingleZoneToMultiZoneResponse
     */
    public MigrateSingleZoneToMultiZoneResponse migrateSingleZoneToMultiZoneWithOptions(MigrateSingleZoneToMultiZoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.arbitraryVSwitchId)) {
            query.put("ArbitraryVSwitchId", request.arbitraryVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.arbitraryZoneId)) {
            query.put("ArbitraryZoneId", request.arbitraryZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyVSwitchId)) {
            query.put("StandbyVSwitchId", request.standbyVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.standbyZoneId)) {
            query.put("StandbyZoneId", request.standbyZoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MigrateSingleZoneToMultiZone"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MigrateSingleZoneToMultiZoneResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>单可用区迁移多可用区基础版</p>
     * 
     * @param request MigrateSingleZoneToMultiZoneRequest
     * @return MigrateSingleZoneToMultiZoneResponse
     */
    public MigrateSingleZoneToMultiZoneResponse migrateSingleZoneToMultiZone(MigrateSingleZoneToMultiZoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.migrateSingleZoneToMultiZoneWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改弹性伸缩配置</p>
     * 
     * @param tmpReq ModifyAutoScalingConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAutoScalingConfigResponse
     */
    public ModifyAutoScalingConfigResponse modifyAutoScalingConfigWithOptions(ModifyAutoScalingConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAutoScalingConfigShrinkRequest request = new ModifyAutoScalingConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.scaleRuleList)) {
            request.scaleRuleListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.scaleRuleList, "ScaleRuleList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configName)) {
            query.put("ConfigName", request.configName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTimeEnd)) {
            query.put("EffectiveTimeEnd", request.effectiveTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.effectiveTimeStart)) {
            query.put("EffectiveTimeStart", request.effectiveTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodesMax)) {
            query.put("NodesMax", request.nodesMax);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodesMin)) {
            query.put("NodesMin", request.nodesMin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleRuleListShrink)) {
            query.put("ScaleRuleList", request.scaleRuleListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleType)) {
            query.put("ScaleType", request.scaleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specId)) {
            query.put("SpecId", request.specId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageCapacityMax)) {
            query.put("StorageCapacityMax", request.storageCapacityMax);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAutoScalingConfig"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAutoScalingConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改弹性伸缩配置</p>
     * 
     * @param request ModifyAutoScalingConfigRequest
     * @return ModifyAutoScalingConfigResponse
     */
    public ModifyAutoScalingConfigResponse modifyAutoScalingConfig(ModifyAutoScalingConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoScalingConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改弹性伸缩规则</p>
     * 
     * @param request ModifyAutoScalingRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAutoScalingRuleResponse
     */
    public ModifyAutoScalingRuleResponse modifyAutoScalingRuleWithOptions(ModifyAutoScalingRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configId)) {
            query.put("ConfigId", request.configId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.observationWindow)) {
            query.put("ObservationWindow", request.observationWindow);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleInStep)) {
            query.put("ScaleInStep", request.scaleInStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scaleOutStep)) {
            query.put("ScaleOutStep", request.scaleOutStep);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.silenceTime)) {
            query.put("SilenceTime", request.silenceTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetMetric)) {
            query.put("TargetMetric", request.targetMetric);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetNodes)) {
            query.put("TargetNodes", request.targetNodes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thresholdLower)) {
            query.put("ThresholdLower", request.thresholdLower);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.thresholdUpper)) {
            query.put("ThresholdUpper", request.thresholdUpper);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerCronExpr)) {
            query.put("TriggerCronExpr", request.triggerCronExpr);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAutoScalingRule"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAutoScalingRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改弹性伸缩规则</p>
     * 
     * @param request ModifyAutoScalingRuleRequest
     * @return ModifyAutoScalingRuleResponse
     */
    public ModifyAutoScalingRuleResponse modifyAutoScalingRule(ModifyAutoScalingRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoScalingRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to change the billing method of an instance to subscription or pay-as-you-go.
     * Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/en/pricing-calculator?spm=a2c63.p38356.0.0.2b024c2adcHeXL&_p_lc=1#/commodity/hitsdb_lindormpre_public_intl">pricing</a> of Lindorm. Published on only international site (alibabacloud.com).</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the billing method of the specified Lindorm instance.</p>
     * 
     * @param request ModifyInstancePayTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstancePayTypeResponse
     */
    public ModifyInstancePayTypeResponse modifyInstancePayTypeWithOptions(ModifyInstancePayTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstancePayType"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstancePayTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to change the billing method of an instance to subscription or pay-as-you-go.
     * Before you call this operation, make sure that you fully understand the billing methods and <a href="https://www.alibabacloud.com/en/pricing-calculator?spm=a2c63.p38356.0.0.2b024c2adcHeXL&_p_lc=1#/commodity/hitsdb_lindormpre_public_intl">pricing</a> of Lindorm. Published on only international site (alibabacloud.com).</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the billing method of the specified Lindorm instance.</p>
     * 
     * @param request ModifyInstancePayTypeRequest
     * @return ModifyInstancePayTypeResponse
     */
    public ModifyInstancePayTypeResponse modifyInstancePayType(ModifyInstancePayTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstancePayTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>变配实例</p>
     * 
     * @param request ModifyLindormV2InstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLindormV2InstanceResponse
     */
    public ModifyLindormV2InstanceResponse modifyLindormV2InstanceWithOptions(ModifyLindormV2InstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cloudStorageSize)) {
            query.put("CloudStorageSize", request.cloudStorageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudStorageType)) {
            query.put("CloudStorageType", request.cloudStorageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeGroupList)) {
            query.put("NodeGroupList", request.nodeGroupList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeType)) {
            query.put("UpgradeType", request.upgradeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLindormV2Instance"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLindormV2InstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>变配实例</p>
     * 
     * @param request ModifyLindormV2InstanceRequest
     * @return ModifyLindormV2InstanceResponse
     */
    public ModifyLindormV2InstanceResponse modifyLindormV2Instance(ModifyLindormV2InstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLindormV2InstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>新架构修改安全组接口</p>
     * 
     * @param request ModifyLindormV2InstanceSecurityGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLindormV2InstanceSecurityGroupsResponse
     */
    public ModifyLindormV2InstanceSecurityGroupsResponse modifyLindormV2InstanceSecurityGroupsWithOptions(ModifyLindormV2InstanceSecurityGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroups)) {
            query.put("SecurityGroups", request.securityGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLindormV2InstanceSecurityGroups"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLindormV2InstanceSecurityGroupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>新架构修改安全组接口</p>
     * 
     * @param request ModifyLindormV2InstanceSecurityGroupsRequest
     * @return ModifyLindormV2InstanceSecurityGroupsResponse
     */
    public ModifyLindormV2InstanceSecurityGroupsResponse modifyLindormV2InstanceSecurityGroups(ModifyLindormV2InstanceSecurityGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLindormV2InstanceSecurityGroupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改Lindorm新版实例白名单</p>
     * 
     * @param request ModifyLindormV2WhiteIpListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLindormV2WhiteIpListResponse
     */
    public ModifyLindormV2WhiteIpListResponse modifyLindormV2WhiteIpListWithOptions(ModifyLindormV2WhiteIpListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteGroup)) {
            query.put("DeleteGroup", request.deleteGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteIpList)) {
            query.put("WhiteIpList", request.whiteIpList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLindormV2WhiteIpList"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLindormV2WhiteIpListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改Lindorm新版实例白名单</p>
     * 
     * @param request ModifyLindormV2WhiteIpListRequest
     * @return ModifyLindormV2WhiteIpListResponse
     */
    public ModifyLindormV2WhiteIpListResponse modifyLindormV2WhiteIpList(ModifyLindormV2WhiteIpListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLindormV2WhiteIpListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开通计算引擎</p>
     * 
     * @param request OpenComputeEngineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenComputeEngineResponse
     */
    public OpenComputeEngineResponse openComputeEngineWithOptions(OpenComputeEngineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpuLimit)) {
            query.put("CpuLimit", request.cpuLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryLimit)) {
            query.put("MemoryLimit", request.memoryLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenComputeEngine"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenComputeEngineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开通计算引擎</p>
     * 
     * @param request OpenComputeEngineRequest
     * @return OpenComputeEngineResponse
     */
    public OpenComputeEngineResponse openComputeEngine(OpenComputeEngineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openComputeEngineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开通计算引擎前置校验</p>
     * 
     * @param request OpenComputePreCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenComputePreCheckResponse
     */
    public OpenComputePreCheckResponse openComputePreCheckWithOptions(OpenComputePreCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cpuLimit)) {
            query.put("CpuLimit", request.cpuLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.memoryLimit)) {
            query.put("MemoryLimit", request.memoryLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenComputePreCheck"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenComputePreCheckResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开通计算引擎前置校验</p>
     * 
     * @param request OpenComputePreCheckRequest
     * @return OpenComputePreCheckResponse
     */
    public OpenComputePreCheckResponse openComputePreCheck(OpenComputePreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openComputePreCheckWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>开通列存索引</p>
     * 
     * @param request OpenLdpsColumnarIndexRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OpenLdpsColumnarIndexResponse
     */
    public OpenLdpsColumnarIndexResponse openLdpsColumnarIndexWithOptions(OpenLdpsColumnarIndexRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OpenLdpsColumnarIndex"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OpenLdpsColumnarIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>开通列存索引</p>
     * 
     * @param request OpenLdpsColumnarIndexRequest
     * @return OpenLdpsColumnarIndexResponse
     */
    public OpenLdpsColumnarIndexResponse openLdpsColumnarIndex(OpenLdpsColumnarIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.openLdpsColumnarIndexWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a Lindorm instance.</p>
     * 
     * @param request ReleaseLindormInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseLindormInstanceResponse
     */
    public ReleaseLindormInstanceResponse releaseLindormInstanceWithOptions(ReleaseLindormInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.immediately)) {
            query.put("Immediately", request.immediately);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseLindormInstance"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseLindormInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases a Lindorm instance.</p>
     * 
     * @param request ReleaseLindormInstanceRequest
     * @return ReleaseLindormInstanceResponse
     */
    public ReleaseLindormInstanceResponse releaseLindormInstance(ReleaseLindormInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseLindormInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>释放实例</p>
     * 
     * @param request ReleaseLindormV2InstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseLindormV2InstanceResponse
     */
    public ReleaseLindormV2InstanceResponse releaseLindormV2InstanceWithOptions(ReleaseLindormV2InstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.immediately)) {
            query.put("Immediately", request.immediately);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseLindormV2Instance"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseLindormV2InstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>释放实例</p>
     * 
     * @param request ReleaseLindormV2InstanceRequest
     * @return ReleaseLindormV2InstanceResponse
     */
    public ReleaseLindormV2InstanceResponse releaseLindormV2Instance(ReleaseLindormV2InstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseLindormV2InstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to renew a subscription Lindorm instance for 1 to 9 months or 1 to 3 years.
     * Before you call this operation, make sure that you fully understand the billing methods and pricing of Lindorm.</p>
     * 
     * <b>summary</b> : 
     * <p>Renews a subscription Lindorm instance.</p>
     * 
     * @param request RenewLindormInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenewLindormInstanceResponse
     */
    public RenewLindormInstanceResponse renewLindormInstanceWithOptions(RenewLindormInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.duration)) {
            query.put("Duration", request.duration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pricingCycle)) {
            query.put("PricingCycle", request.pricingCycle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenewLindormInstance"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenewLindormInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to renew a subscription Lindorm instance for 1 to 9 months or 1 to 3 years.
     * Before you call this operation, make sure that you fully understand the billing methods and pricing of Lindorm.</p>
     * 
     * <b>summary</b> : 
     * <p>Renews a subscription Lindorm instance.</p>
     * 
     * @param request RenewLindormInstanceRequest
     * @return RenewLindormInstanceResponse
     */
    public RenewLindormInstanceResponse renewLindormInstance(RenewLindormInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.renewLindormInstanceWithOptions(request, runtime);
    }

    /**
     * @param request RestartLdpsComputeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartLdpsComputeGroupResponse
     */
    public RestartLdpsComputeGroupResponse restartLdpsComputeGroupWithOptions(RestartLdpsComputeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartLdpsComputeGroup"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartLdpsComputeGroupResponse());
    }

    /**
     * @param request RestartLdpsComputeGroupRequest
     * @return RestartLdpsComputeGroupResponse
     */
    public RestartLdpsComputeGroupResponse restartLdpsComputeGroup(RestartLdpsComputeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartLdpsComputeGroupWithOptions(request, runtime);
    }

    /**
     * @param request SetDefaultOlapComputeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDefaultOlapComputeGroupResponse
     */
    public SetDefaultOlapComputeGroupResponse setDefaultOlapComputeGroupWithOptions(SetDefaultOlapComputeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDefault)) {
            query.put("IsDefault", request.isDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDefaultOlapComputeGroup"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDefaultOlapComputeGroupResponse());
    }

    /**
     * @param request SetDefaultOlapComputeGroupRequest
     * @return SetDefaultOlapComputeGroupResponse
     */
    public SetDefaultOlapComputeGroupResponse setDefaultOlapComputeGroup(SetDefaultOlapComputeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDefaultOlapComputeGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Prerequisites</p>
     * <ul>
     * <li>The LindormTable version of your instance is 2.6.0 or later.</li>
     * <li>The LindormTable of your instance supports LindormSQL V3. The value of the EnableLsqlVersionV3 parameter in the response of the GetLindormInstance operation is true for Lindorm instances purchased after Oct 24, 2023, which indicates that LindormSQL is supported by these instances by default. If you want to enable LindormSQL for instances purchased before Oct 24, 2023, contact the on-duty technical support.
     * You can enable the MySQL compatibility feature for a Lindorm instance only when the instance meets the preceding requirements.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the MySQL compatibility feature for a Lindorm instance.</p>
     * 
     * @param request SwitchLSQLV3MySQLServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchLSQLV3MySQLServiceResponse
     */
    public SwitchLSQLV3MySQLServiceResponse switchLSQLV3MySQLServiceWithOptions(SwitchLSQLV3MySQLServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchLSQLV3MySQLService"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchLSQLV3MySQLServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>Prerequisites</p>
     * <ul>
     * <li>The LindormTable version of your instance is 2.6.0 or later.</li>
     * <li>The LindormTable of your instance supports LindormSQL V3. The value of the EnableLsqlVersionV3 parameter in the response of the GetLindormInstance operation is true for Lindorm instances purchased after Oct 24, 2023, which indicates that LindormSQL is supported by these instances by default. If you want to enable LindormSQL for instances purchased before Oct 24, 2023, contact the on-duty technical support.
     * You can enable the MySQL compatibility feature for a Lindorm instance only when the instance meets the preceding requirements.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables the MySQL compatibility feature for a Lindorm instance.</p>
     * 
     * @param request SwitchLSQLV3MySQLServiceRequest
     * @return SwitchLSQLV3MySQLServiceResponse
     */
    public SwitchLSQLV3MySQLServiceResponse switchLSQLV3MySQLService(SwitchLSQLV3MySQLServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchLSQLV3MySQLServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Associates tags with a single or multiple Lindorm instances.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-06-15"),
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
     * <p>Associates tags with a single or multiple Lindorm instances.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If a tag is not added to any Lindorm instance, it is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from a Lindorm instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-06-15"),
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
     * <b>description</b> :
     * <p>If a tag is not added to any Lindorm instance, it is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes tags from a Lindorm instance.</p>
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
     * <p>Configures an IP address whitelist for a Lindorm instance.</p>
     * 
     * @param request UpdateInstanceIpWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceIpWhiteListResponse
     */
    public UpdateInstanceIpWhiteListResponse updateInstanceIpWhiteListWithOptions(UpdateInstanceIpWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.delete)) {
            query.put("Delete", request.delete);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIpList)) {
            query.put("SecurityIpList", request.securityIpList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceIpWhiteList"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceIpWhiteListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures an IP address whitelist for a Lindorm instance.</p>
     * 
     * @param request UpdateInstanceIpWhiteListRequest
     * @return UpdateInstanceIpWhiteListResponse
     */
    public UpdateInstanceIpWhiteListResponse updateInstanceIpWhiteList(UpdateInstanceIpWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceIpWhiteListWithOptions(request, runtime);
    }

    /**
     * @param request UpdateInstanceSecurityGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceSecurityGroupsResponse
     */
    public UpdateInstanceSecurityGroupsResponse updateInstanceSecurityGroupsWithOptions(UpdateInstanceSecurityGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityGroups)) {
            query.put("SecurityGroups", request.securityGroups);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstanceSecurityGroups"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceSecurityGroupsResponse());
    }

    /**
     * @param request UpdateInstanceSecurityGroupsRequest
     * @return UpdateInstanceSecurityGroupsResponse
     */
    public UpdateInstanceSecurityGroupsResponse updateInstanceSecurityGroups(UpdateInstanceSecurityGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceSecurityGroupsWithOptions(request, runtime);
    }

    /**
     * @param request UpdateLdpsComputeGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLdpsComputeGroupResponse
     */
    public UpdateLdpsComputeGroupResponse updateLdpsComputeGroupWithOptions(UpdateLdpsComputeGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.properties)) {
            query.put("Properties", request.properties);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLdpsComputeGroup"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLdpsComputeGroupResponse());
    }

    /**
     * @param request UpdateLdpsComputeGroupRequest
     * @return UpdateLdpsComputeGroupResponse
     */
    public UpdateLdpsComputeGroupResponse updateLdpsComputeGroup(UpdateLdpsComputeGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLdpsComputeGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例名称或删除保护</p>
     * 
     * @param request UpdateLindormInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLindormInstanceAttributeResponse
     */
    public UpdateLindormInstanceAttributeResponse updateLindormInstanceAttributeWithOptions(UpdateLindormInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deletionProtection)) {
            query.put("DeletionProtection", request.deletionProtection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceAlias)) {
            query.put("InstanceAlias", request.instanceAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLindormInstanceAttribute"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLindormInstanceAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新实例名称或删除保护</p>
     * 
     * @param request UpdateLindormInstanceAttributeRequest
     * @return UpdateLindormInstanceAttributeResponse
     */
    public UpdateLindormInstanceAttributeResponse updateLindormInstanceAttribute(UpdateLindormInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLindormInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新LindormV2Instance</p>
     * 
     * @param request UpdateLindormV2InstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLindormV2InstanceResponse
     */
    public UpdateLindormV2InstanceResponse updateLindormV2InstanceWithOptions(UpdateLindormV2InstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.capacityStorageSize)) {
            query.put("CapacityStorageSize", request.capacityStorageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudStorageSize)) {
            query.put("CloudStorageSize", request.cloudStorageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloudStorageType)) {
            query.put("CloudStorageType", request.cloudStorageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCapacityStorage)) {
            query.put("EnableCapacityStorage", request.enableCapacityStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineList)) {
            query.put("EngineList", request.engineList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLindormV2Instance"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLindormV2InstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新LindormV2Instance</p>
     * 
     * @param request UpdateLindormV2InstanceRequest
     * @return UpdateLindormV2InstanceResponse
     */
    public UpdateLindormV2InstanceResponse updateLindormV2Instance(UpdateLindormV2InstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLindormV2InstanceWithOptions(request, runtime);
    }

    /**
     * @param request UpdateLindormV2InstanceParameterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLindormV2InstanceParameterResponse
     */
    public UpdateLindormV2InstanceParameterResponse updateLindormV2InstanceParameterWithOptions(UpdateLindormV2InstanceParameterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterKey)) {
            query.put("ParameterKey", request.parameterKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameterValue)) {
            query.put("ParameterValue", request.parameterValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateType)) {
            query.put("UpdateType", request.updateType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLindormV2InstanceParameter"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLindormV2InstanceParameterResponse());
    }

    /**
     * @param request UpdateLindormV2InstanceParameterRequest
     * @return UpdateLindormV2InstanceParameterResponse
     */
    public UpdateLindormV2InstanceParameterResponse updateLindormV2InstanceParameter(UpdateLindormV2InstanceParameterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLindormV2InstanceParameterWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改Lindorm新版实例白名单分组列表</p>
     * 
     * @param request UpdateLindormV2WhiteIpListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLindormV2WhiteIpListResponse
     */
    public UpdateLindormV2WhiteIpListResponse updateLindormV2WhiteIpListWithOptions(UpdateLindormV2WhiteIpListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.whiteIpGroupList)) {
            query.put("WhiteIpGroupList", request.whiteIpGroupList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLindormV2WhiteIpList"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLindormV2WhiteIpListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改Lindorm新版实例白名单分组列表</p>
     * 
     * @param request UpdateLindormV2WhiteIpListRequest
     * @return UpdateLindormV2WhiteIpListResponse
     */
    public UpdateLindormV2WhiteIpListResponse updateLindormV2WhiteIpList(UpdateLindormV2WhiteIpListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLindormV2WhiteIpListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about how to select the storage type and engine type when you create a Lindorm instance, see <a href="https://help.aliyun.com/document_detail/181971.html">Select engine typpes</a> and <a href="https://help.aliyun.com/document_detail/174643.html">Select storage types</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades, scales up, or enable cold storage for a Lindorm instance.</p>
     * 
     * @param request UpgradeLindormInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeLindormInstanceResponse
     */
    public UpgradeLindormInstanceResponse upgradeLindormInstanceWithOptions(UpgradeLindormInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clusterStorage)) {
            query.put("ClusterStorage", request.clusterStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coldStorage)) {
            query.put("ColdStorage", request.coldStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.coreSingleStorage)) {
            query.put("CoreSingleStorage", request.coreSingleStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filestoreNum)) {
            query.put("FilestoreNum", request.filestoreNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filestoreSpec)) {
            query.put("FilestoreSpec", request.filestoreSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lindormNum)) {
            query.put("LindormNum", request.lindormNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lindormSpec)) {
            query.put("LindormSpec", request.lindormSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logNum)) {
            query.put("LogNum", request.logNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSingleStorage)) {
            query.put("LogSingleStorage", request.logSingleStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logSpec)) {
            query.put("LogSpec", request.logSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ltsCoreNum)) {
            query.put("LtsCoreNum", request.ltsCoreNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ltsCoreSpec)) {
            query.put("LtsCoreSpec", request.ltsCoreSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solrNum)) {
            query.put("SolrNum", request.solrNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.solrSpec)) {
            query.put("SolrSpec", request.solrSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamNum)) {
            query.put("StreamNum", request.streamNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.streamSpec)) {
            query.put("StreamSpec", request.streamSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tsdbNum)) {
            query.put("TsdbNum", request.tsdbNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tsdbSpec)) {
            query.put("TsdbSpec", request.tsdbSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeType)) {
            query.put("UpgradeType", request.upgradeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeLindormInstance"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeLindormInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>For more information about how to select the storage type and engine type when you create a Lindorm instance, see <a href="https://help.aliyun.com/document_detail/181971.html">Select engine typpes</a> and <a href="https://help.aliyun.com/document_detail/174643.html">Select storage types</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Upgrades, scales up, or enable cold storage for a Lindorm instance.</p>
     * 
     * @param request UpgradeLindormInstanceRequest
     * @return UpgradeLindormInstanceResponse
     */
    public UpgradeLindormInstanceResponse upgradeLindormInstance(UpgradeLindormInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeLindormInstanceWithOptions(request, runtime);
    }

    /**
     * @param request UpgradeLindormV2StreamEngineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeLindormV2StreamEngineResponse
     */
    public UpgradeLindormV2StreamEngineResponse upgradeLindormV2StreamEngineWithOptions(UpgradeLindormV2StreamEngineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.customConfig)) {
            query.put("CustomConfig", request.customConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.quantity)) {
            query.put("Quantity", request.quantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spec)) {
            query.put("Spec", request.spec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specId)) {
            query.put("SpecId", request.specId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeType)) {
            query.put("UpgradeType", request.upgradeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeLindormV2StreamEngine"),
            new TeaPair("version", "2020-06-15"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeLindormV2StreamEngineResponse());
    }

    /**
     * @param request UpgradeLindormV2StreamEngineRequest
     * @return UpgradeLindormV2StreamEngineResponse
     */
    public UpgradeLindormV2StreamEngineResponse upgradeLindormV2StreamEngine(UpgradeLindormV2StreamEngineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeLindormV2StreamEngineWithOptions(request, runtime);
    }
}
