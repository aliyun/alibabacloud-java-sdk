// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907;

import com.aliyun.tea.*;
import com.aliyun.config20200907.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "config.cn-shanghai.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "config.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("config", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
      * This topic provides an example on how to enable the `cr-5772ba41209e007b****` rule in the `ca-a4e5626622af0079****` account group.
      *
      * @param request ActiveAggregateConfigRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ActiveAggregateConfigRulesResponse
     */
    public ActiveAggregateConfigRulesResponse activeAggregateConfigRulesWithOptions(ActiveAggregateConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActiveAggregateConfigRules"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActiveAggregateConfigRulesResponse());
    }

    /**
      * This topic provides an example on how to enable the `cr-5772ba41209e007b****` rule in the `ca-a4e5626622af0079****` account group.
      *
      * @param request ActiveAggregateConfigRulesRequest
      * @return ActiveAggregateConfigRulesResponse
     */
    public ActiveAggregateConfigRulesResponse activeAggregateConfigRules(ActiveAggregateConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activeAggregateConfigRulesWithOptions(request, runtime);
    }

    public ActiveConfigRulesResponse activeConfigRulesWithOptions(ActiveConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ActiveConfigRules"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ActiveConfigRulesResponse());
    }

    public ActiveConfigRulesResponse activeConfigRules(ActiveConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activeConfigRulesWithOptions(request, runtime);
    }

    /**
      * The sample request in this topic shows you how to add the `cr-6cc4626622af00e7****` rule in the `ca-75b4626622af00c3****` account group to the `cp-5bb1626622af00bd****` compliance package.
      *
      * @param request AttachAggregateConfigRuleToCompliancePackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AttachAggregateConfigRuleToCompliancePackResponse
     */
    public AttachAggregateConfigRuleToCompliancePackResponse attachAggregateConfigRuleToCompliancePackWithOptions(AttachAggregateConfigRuleToCompliancePackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackId)) {
            query.put("CompliancePackId", request.compliancePackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachAggregateConfigRuleToCompliancePack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachAggregateConfigRuleToCompliancePackResponse());
    }

    /**
      * The sample request in this topic shows you how to add the `cr-6cc4626622af00e7****` rule in the `ca-75b4626622af00c3****` account group to the `cp-5bb1626622af00bd****` compliance package.
      *
      * @param request AttachAggregateConfigRuleToCompliancePackRequest
      * @return AttachAggregateConfigRuleToCompliancePackResponse
     */
    public AttachAggregateConfigRuleToCompliancePackResponse attachAggregateConfigRuleToCompliancePack(AttachAggregateConfigRuleToCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachAggregateConfigRuleToCompliancePackWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to add the `cr-6cc4626622af00e7****` rule to the `cp-5bb1626622af00bd****` compliance package.
      *
      * @param request AttachConfigRuleToCompliancePackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return AttachConfigRuleToCompliancePackResponse
     */
    public AttachConfigRuleToCompliancePackResponse attachConfigRuleToCompliancePackWithOptions(AttachConfigRuleToCompliancePackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackId)) {
            query.put("CompliancePackId", request.compliancePackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachConfigRuleToCompliancePack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachConfigRuleToCompliancePackResponse());
    }

    /**
      * This topic provides an example on how to add the `cr-6cc4626622af00e7****` rule to the `cp-5bb1626622af00bd****` compliance package.
      *
      * @param request AttachConfigRuleToCompliancePackRequest
      * @return AttachConfigRuleToCompliancePackResponse
     */
    public AttachConfigRuleToCompliancePackResponse attachConfigRuleToCompliancePack(AttachConfigRuleToCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachConfigRuleToCompliancePackWithOptions(request, runtime);
    }

    public CopyCompliancePacksResponse copyCompliancePacksWithOptions(CopyCompliancePacksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desAggregatorIds)) {
            query.put("DesAggregatorIds", request.desAggregatorIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcAggregatorId)) {
            query.put("SrcAggregatorId", request.srcAggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcCompliancePackIds)) {
            query.put("SrcCompliancePackIds", request.srcCompliancePackIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyCompliancePacks"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyCompliancePacksResponse());
    }

    public CopyCompliancePacksResponse copyCompliancePacks(CopyCompliancePacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyCompliancePacksWithOptions(request, runtime);
    }

    public CopyConfigRulesResponse copyConfigRulesWithOptions(CopyConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desAggregatorIds)) {
            query.put("DesAggregatorIds", request.desAggregatorIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcAggregatorId)) {
            query.put("SrcAggregatorId", request.srcAggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcConfigRuleIds)) {
            query.put("SrcConfigRuleIds", request.srcConfigRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CopyConfigRules"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CopyConfigRulesResponse());
    }

    public CopyConfigRulesResponse copyConfigRules(CopyConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyConfigRulesWithOptions(request, runtime);
    }

    /**
      * You can use your management account to create up to five compliance packages for each account group.
      * This topic provides an example on how to create a compliance package named ClassifiedProtectionPreCheck for the `ca-f632626622af0079****` account group. The compliance package contains the `eip-bandwidth-limit` managed rule.
      *
      * @param tmpReq CreateAggregateCompliancePackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateAggregateCompliancePackResponse
     */
    public CreateAggregateCompliancePackResponse createAggregateCompliancePackWithOptions(CreateAggregateCompliancePackRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAggregateCompliancePackShrinkRequest request = new CreateAggregateCompliancePackShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configRules)) {
            request.configRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configRules, "ConfigRules", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            body.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackName)) {
            body.put("CompliancePackName", request.compliancePackName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackTemplateId)) {
            body.put("CompliancePackTemplateId", request.compliancePackTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRulesShrink)) {
            body.put("ConfigRules", request.configRulesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultEnable)) {
            body.put("DefaultEnable", request.defaultEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            body.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            body.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            body.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyScope)) {
            body.put("TagKeyScope", request.tagKeyScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagValueScope)) {
            body.put("TagValueScope", request.tagValueScope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAggregateCompliancePack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAggregateCompliancePackResponse());
    }

    /**
      * You can use your management account to create up to five compliance packages for each account group.
      * This topic provides an example on how to create a compliance package named ClassifiedProtectionPreCheck for the `ca-f632626622af0079****` account group. The compliance package contains the `eip-bandwidth-limit` managed rule.
      *
      * @param request CreateAggregateCompliancePackRequest
      * @return CreateAggregateCompliancePackResponse
     */
    public CreateAggregateCompliancePackResponse createAggregateCompliancePack(CreateAggregateCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAggregateCompliancePackWithOptions(request, runtime);
    }

    /**
      * In this example, a delivery channel is created for an account group. The ID of the account group is `ca-a4e5626622af0079****`. The type of the delivery channel is `OSS` and the Alibaba Cloud Resource Name (ARN) of the delivery destination is `acs:oss:cn-shanghai:100931896542****:new-bucket`. The result indicates that the delivery channel is created. The ID of the delivery channel is `cdc-8e45ff4e06a3a8****`.
      *
      * @param request CreateAggregateConfigDeliveryChannelRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateAggregateConfigDeliveryChannelResponse
     */
    public CreateAggregateConfigDeliveryChannelResponse createAggregateConfigDeliveryChannelWithOptions(CreateAggregateConfigDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationItemChangeNotification)) {
            query.put("ConfigurationItemChangeNotification", request.configurationItemChangeNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationSnapshot)) {
            query.put("ConfigurationSnapshot", request.configurationSnapshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelCondition)) {
            query.put("DeliveryChannelCondition", request.deliveryChannelCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelName)) {
            query.put("DeliveryChannelName", request.deliveryChannelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelTargetArn)) {
            query.put("DeliveryChannelTargetArn", request.deliveryChannelTargetArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelType)) {
            query.put("DeliveryChannelType", request.deliveryChannelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliverySnapshotTime)) {
            query.put("DeliverySnapshotTime", request.deliverySnapshotTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonCompliantNotification)) {
            query.put("NonCompliantNotification", request.nonCompliantNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversizedDataOSSTargetArn)) {
            query.put("OversizedDataOSSTargetArn", request.oversizedDataOSSTargetArn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAggregateConfigDeliveryChannel"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAggregateConfigDeliveryChannelResponse());
    }

    /**
      * In this example, a delivery channel is created for an account group. The ID of the account group is `ca-a4e5626622af0079****`. The type of the delivery channel is `OSS` and the Alibaba Cloud Resource Name (ARN) of the delivery destination is `acs:oss:cn-shanghai:100931896542****:new-bucket`. The result indicates that the delivery channel is created. The ID of the delivery channel is `cdc-8e45ff4e06a3a8****`.
      *
      * @param request CreateAggregateConfigDeliveryChannelRequest
      * @return CreateAggregateConfigDeliveryChannelResponse
     */
    public CreateAggregateConfigDeliveryChannelResponse createAggregateConfigDeliveryChannel(CreateAggregateConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAggregateConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
      * ### Limits
      * You can create up to 200 rules for each management account.
      * ### Usage notes
      * This topic provides an example on how to create a rule based on the required-tags managed rule in the `ca-a4e5626622af0079****` account group. The returned result shows that the rule is created and its ID is `cr-4e3d626622af0080****`.
      *
      * @param tmpReq CreateAggregateConfigRuleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateAggregateConfigRuleResponse
     */
    public CreateAggregateConfigRuleResponse createAggregateConfigRuleWithOptions(CreateAggregateConfigRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAggregateConfigRuleShrinkRequest request = new CreateAggregateConfigRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputParameters)) {
            request.inputParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputParameters, "InputParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceTypesScope)) {
            request.resourceTypesScopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceTypesScope, "ResourceTypesScope", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            body.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleName)) {
            body.put("ConfigRuleName", request.configRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleTriggerTypes)) {
            body.put("ConfigRuleTriggerTypes", request.configRuleTriggerTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeAccountIdsScope)) {
            body.put("ExcludeAccountIdsScope", request.excludeAccountIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeFolderIdsScope)) {
            body.put("ExcludeFolderIdsScope", request.excludeFolderIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderIdsScope)) {
            body.put("FolderIdsScope", request.folderIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputParametersShrink)) {
            body.put("InputParameters", request.inputParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumExecutionFrequency)) {
            body.put("MaximumExecutionFrequency", request.maximumExecutionFrequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            body.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            body.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypesScopeShrink)) {
            body.put("ResourceTypesScope", request.resourceTypesScopeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            body.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIdentifier)) {
            body.put("SourceIdentifier", request.sourceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOwner)) {
            body.put("SourceOwner", request.sourceOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyLogicScope)) {
            body.put("TagKeyLogicScope", request.tagKeyLogicScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyScope)) {
            body.put("TagKeyScope", request.tagKeyScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagValueScope)) {
            body.put("TagValueScope", request.tagValueScope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAggregateConfigRule"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAggregateConfigRuleResponse());
    }

    /**
      * ### Limits
      * You can create up to 200 rules for each management account.
      * ### Usage notes
      * This topic provides an example on how to create a rule based on the required-tags managed rule in the `ca-a4e5626622af0079****` account group. The returned result shows that the rule is created and its ID is `cr-4e3d626622af0080****`.
      *
      * @param request CreateAggregateConfigRuleRequest
      * @return CreateAggregateConfigRuleResponse
     */
    public CreateAggregateConfigRuleResponse createAggregateConfigRule(CreateAggregateConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAggregateConfigRuleWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to create a remediation template for the rule whose ID is `cr-6b7c626622af00b4****` in the account group whose ID is `ca-6b4a626622af0012****`. The returned result shows that a remediation template is created and the ID of the remediation template is `crr-909ba2d4716700eb****`.
      *
      * @param request CreateAggregateRemediationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateAggregateRemediationResponse
     */
    public CreateAggregateRemediationResponse createAggregateRemediationWithOptions(CreateAggregateRemediationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            body.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            body.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeType)) {
            body.put("InvokeType", request.invokeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remediationTemplateId)) {
            body.put("RemediationTemplateId", request.remediationTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remediationType)) {
            body.put("RemediationType", request.remediationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAggregateRemediation"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAggregateRemediationResponse());
    }

    /**
      * This topic provides an example on how to create a remediation template for the rule whose ID is `cr-6b7c626622af00b4****` in the account group whose ID is `ca-6b4a626622af0012****`. The returned result shows that a remediation template is created and the ID of the remediation template is `crr-909ba2d4716700eb****`.
      *
      * @param request CreateAggregateRemediationRequest
      * @return CreateAggregateRemediationResponse
     */
    public CreateAggregateRemediationResponse createAggregateRemediation(CreateAggregateRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAggregateRemediationWithOptions(request, runtime);
    }

    /**
      * Each management account can create a maximum of five account groups. Each account group can contain a maximum of 200 member accounts.
      * Cloud Config supports the following types of account groups:
      * *   Global account group: The global account group contains all the member accounts that are added to the resource directory. A management account can create only one global account group.
      * *   Custom account group: If you create a custom account group, you must manually add all or specific member accounts from the resource directory to the custom account group.
      * This topic provides an example on how to create an account group of the `CUSTOM` type. The custom account group is named `Test_Group`, and its description is `Test account group`. The custom account group contains the following two member accounts:
      * *   Member account ID: `171322098523****`. Member account name: `Alice`.
      * *   Member account ID: `100532098349****`. Member account name: `Tom`.
      *
      * @param tmpReq CreateAggregatorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateAggregatorResponse
     */
    public CreateAggregatorResponse createAggregatorWithOptions(CreateAggregatorRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAggregatorShrinkRequest request = new CreateAggregatorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aggregatorAccounts)) {
            request.aggregatorAccountsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aggregatorAccounts, "AggregatorAccounts", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorAccountsShrink)) {
            body.put("AggregatorAccounts", request.aggregatorAccountsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorName)) {
            body.put("AggregatorName", request.aggregatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorType)) {
            body.put("AggregatorType", request.aggregatorType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAggregator"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAggregatorResponse());
    }

    /**
      * Each management account can create a maximum of five account groups. Each account group can contain a maximum of 200 member accounts.
      * Cloud Config supports the following types of account groups:
      * *   Global account group: The global account group contains all the member accounts that are added to the resource directory. A management account can create only one global account group.
      * *   Custom account group: If you create a custom account group, you must manually add all or specific member accounts from the resource directory to the custom account group.
      * This topic provides an example on how to create an account group of the `CUSTOM` type. The custom account group is named `Test_Group`, and its description is `Test account group`. The custom account group contains the following two member accounts:
      * *   Member account ID: `171322098523****`. Member account name: `Alice`.
      * *   Member account ID: `100532098349****`. Member account name: `Tom`.
      *
      * @param request CreateAggregatorRequest
      * @return CreateAggregatorResponse
     */
    public CreateAggregatorResponse createAggregator(CreateAggregatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAggregatorWithOptions(request, runtime);
    }

    /**
      * Each ordinary account can create up to five compliance packages.
      * This topic provides an example on how to create a compliance package named ClassifiedProtectionPreCheck. The compliance package contains a managed rule named `eip-bandwidth-limit`.
      *
      * @param tmpReq CreateCompliancePackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateCompliancePackResponse
     */
    public CreateCompliancePackResponse createCompliancePackWithOptions(CreateCompliancePackRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCompliancePackShrinkRequest request = new CreateCompliancePackShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configRules)) {
            request.configRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configRules, "ConfigRules", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackName)) {
            body.put("CompliancePackName", request.compliancePackName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackTemplateId)) {
            body.put("CompliancePackTemplateId", request.compliancePackTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRulesShrink)) {
            body.put("ConfigRules", request.configRulesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.defaultEnable)) {
            body.put("DefaultEnable", request.defaultEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            body.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            body.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            body.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyScope)) {
            body.put("TagKeyScope", request.tagKeyScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagValueScope)) {
            body.put("TagValueScope", request.tagValueScope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCompliancePack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCompliancePackResponse());
    }

    /**
      * Each ordinary account can create up to five compliance packages.
      * This topic provides an example on how to create a compliance package named ClassifiedProtectionPreCheck. The compliance package contains a managed rule named `eip-bandwidth-limit`.
      *
      * @param request CreateCompliancePackRequest
      * @return CreateCompliancePackResponse
     */
    public CreateCompliancePackResponse createCompliancePack(CreateCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCompliancePackWithOptions(request, runtime);
    }

    /**
      * In this example, a delivery channel is created. The type of the delivery channel is `OSS` and the Alibaba Cloud Resource Name (ARN) of the delivery destination is `acs:oss:cn-shanghai:100931896542****:new-bucket`. The result indicates that the delivery channel is created, and the ID of the delivery channel is `cdc-8e45ff4e06a3a8****`.
      *
      * @param request CreateConfigDeliveryChannelRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateConfigDeliveryChannelResponse
     */
    public CreateConfigDeliveryChannelResponse createConfigDeliveryChannelWithOptions(CreateConfigDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationItemChangeNotification)) {
            query.put("ConfigurationItemChangeNotification", request.configurationItemChangeNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationSnapshot)) {
            query.put("ConfigurationSnapshot", request.configurationSnapshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelCondition)) {
            query.put("DeliveryChannelCondition", request.deliveryChannelCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelName)) {
            query.put("DeliveryChannelName", request.deliveryChannelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelTargetArn)) {
            query.put("DeliveryChannelTargetArn", request.deliveryChannelTargetArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelType)) {
            query.put("DeliveryChannelType", request.deliveryChannelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliverySnapshotTime)) {
            query.put("DeliverySnapshotTime", request.deliverySnapshotTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonCompliantNotification)) {
            query.put("NonCompliantNotification", request.nonCompliantNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversizedDataOSSTargetArn)) {
            query.put("OversizedDataOSSTargetArn", request.oversizedDataOSSTargetArn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConfigDeliveryChannel"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConfigDeliveryChannelResponse());
    }

    /**
      * In this example, a delivery channel is created. The type of the delivery channel is `OSS` and the Alibaba Cloud Resource Name (ARN) of the delivery destination is `acs:oss:cn-shanghai:100931896542****:new-bucket`. The result indicates that the delivery channel is created, and the ID of the delivery channel is `cdc-8e45ff4e06a3a8****`.
      *
      * @param request CreateConfigDeliveryChannelRequest
      * @return CreateConfigDeliveryChannelResponse
     */
    public CreateConfigDeliveryChannelResponse createConfigDeliveryChannel(CreateConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to create a managed rule named required-tags. The returned result indicates that the rule is created and the ID of the rule is `cr-5772ba41209e007b****`.
      * ## Limits
      * You can use a common account to create up to 200 rules.
      *
      * @param tmpReq CreateConfigRuleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateConfigRuleResponse
     */
    public CreateConfigRuleResponse createConfigRuleWithOptions(CreateConfigRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateConfigRuleShrinkRequest request = new CreateConfigRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputParameters)) {
            request.inputParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputParameters, "InputParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceTypesScope)) {
            request.resourceTypesScopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceTypesScope, "ResourceTypesScope", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleName)) {
            body.put("ConfigRuleName", request.configRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleTriggerTypes)) {
            body.put("ConfigRuleTriggerTypes", request.configRuleTriggerTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputParametersShrink)) {
            body.put("InputParameters", request.inputParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumExecutionFrequency)) {
            body.put("MaximumExecutionFrequency", request.maximumExecutionFrequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            body.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            body.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypesScopeShrink)) {
            body.put("ResourceTypesScope", request.resourceTypesScopeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            body.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIdentifier)) {
            body.put("SourceIdentifier", request.sourceIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceOwner)) {
            body.put("SourceOwner", request.sourceOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyLogicScope)) {
            body.put("TagKeyLogicScope", request.tagKeyLogicScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyScope)) {
            body.put("TagKeyScope", request.tagKeyScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagValueScope)) {
            body.put("TagValueScope", request.tagValueScope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateConfigRule"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateConfigRuleResponse());
    }

    /**
      * This topic provides an example on how to create a managed rule named required-tags. The returned result indicates that the rule is created and the ID of the rule is `cr-5772ba41209e007b****`.
      * ## Limits
      * You can use a common account to create up to 200 rules.
      *
      * @param request CreateConfigRuleRequest
      * @return CreateConfigRuleResponse
     */
    public CreateConfigRuleResponse createConfigRule(CreateConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConfigRuleWithOptions(request, runtime);
    }

    /**
      * @deprecated : CreateDeliveryChannel is deprecated, please use Config::2020-09-07::CreateConfigDeliveryChannel,Config::2020-09-07::CreateAggregateConfigDeliveryChannel instead.
      * In this example, a delivery channel is created. The type of the delivery channel is `OSS`, the Alibaba Cloud Resource Name (ARN) of the delivery destination is `acs:oss:cn-shanghai:100931896542****:new-bucket`, and the ARN of the role that is assigned to the delivery channel is `acs:ram::100931896542****:role/aliyunserviceroleforconfig`. The returned result shows that the delivery channel is created, and the ID of the delivery channel is `cdc-8e45ff4e06a3a8****`.
      *
      * @param request CreateDeliveryChannelRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateDeliveryChannelResponse
     */
    // Deprecated
    public CreateDeliveryChannelResponse createDeliveryChannelWithOptions(CreateDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationItemChangeNotification)) {
            body.put("ConfigurationItemChangeNotification", request.configurationItemChangeNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationSnapshot)) {
            body.put("ConfigurationSnapshot", request.configurationSnapshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelAssumeRoleArn)) {
            body.put("DeliveryChannelAssumeRoleArn", request.deliveryChannelAssumeRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelCondition)) {
            body.put("DeliveryChannelCondition", request.deliveryChannelCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelName)) {
            body.put("DeliveryChannelName", request.deliveryChannelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelTargetArn)) {
            body.put("DeliveryChannelTargetArn", request.deliveryChannelTargetArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelType)) {
            body.put("DeliveryChannelType", request.deliveryChannelType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonCompliantNotification)) {
            body.put("NonCompliantNotification", request.nonCompliantNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversizedDataOSSTargetArn)) {
            body.put("OversizedDataOSSTargetArn", request.oversizedDataOSSTargetArn);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDeliveryChannel"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDeliveryChannelResponse());
    }

    /**
      * @deprecated : CreateDeliveryChannel is deprecated, please use Config::2020-09-07::CreateConfigDeliveryChannel,Config::2020-09-07::CreateAggregateConfigDeliveryChannel instead.
      * In this example, a delivery channel is created. The type of the delivery channel is `OSS`, the Alibaba Cloud Resource Name (ARN) of the delivery destination is `acs:oss:cn-shanghai:100931896542****:new-bucket`, and the ARN of the role that is assigned to the delivery channel is `acs:ram::100931896542****:role/aliyunserviceroleforconfig`. The returned result shows that the delivery channel is created, and the ID of the delivery channel is `cdc-8e45ff4e06a3a8****`.
      *
      * @param request CreateDeliveryChannelRequest
      * @return CreateDeliveryChannelResponse
     */
    // Deprecated
    public CreateDeliveryChannelResponse createDeliveryChannel(CreateDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDeliveryChannelWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to create a remediation template for the rule `cr-8a973ac2e2be00a2****`. The returned result shows that a remediation template is created and the ID of the remediation template is `crr-909ba2d4716700eb****`.
      *
      * @param request CreateRemediationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return CreateRemediationResponse
     */
    public CreateRemediationResponse createRemediationWithOptions(CreateRemediationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            body.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeType)) {
            body.put("InvokeType", request.invokeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remediationTemplateId)) {
            body.put("RemediationTemplateId", request.remediationTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remediationType)) {
            body.put("RemediationType", request.remediationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRemediation"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRemediationResponse());
    }

    /**
      * This topic provides an example on how to create a remediation template for the rule `cr-8a973ac2e2be00a2****`. The returned result shows that a remediation template is created and the ID of the remediation template is `crr-909ba2d4716700eb****`.
      *
      * @param request CreateRemediationRequest
      * @return CreateRemediationResponse
     */
    public CreateRemediationResponse createRemediation(CreateRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRemediationWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to disable the `cr-5772ba41209e007b****` rule in the `ca-04b3fd170e340007****` account group.
      *
      * @param request DeactiveAggregateConfigRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeactiveAggregateConfigRulesResponse
     */
    public DeactiveAggregateConfigRulesResponse deactiveAggregateConfigRulesWithOptions(DeactiveAggregateConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeactiveAggregateConfigRules"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeactiveAggregateConfigRulesResponse());
    }

    /**
      * This topic provides an example on how to disable the `cr-5772ba41209e007b****` rule in the `ca-04b3fd170e340007****` account group.
      *
      * @param request DeactiveAggregateConfigRulesRequest
      * @return DeactiveAggregateConfigRulesResponse
     */
    public DeactiveAggregateConfigRulesResponse deactiveAggregateConfigRules(DeactiveAggregateConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactiveAggregateConfigRulesWithOptions(request, runtime);
    }

    /**
      * In this example, the `cr-19a56457e0d90058****` rule is used.
      *
      * @param request DeactiveConfigRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeactiveConfigRulesResponse
     */
    public DeactiveConfigRulesResponse deactiveConfigRulesWithOptions(DeactiveConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeactiveConfigRules"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeactiveConfigRulesResponse());
    }

    /**
      * In this example, the `cr-19a56457e0d90058****` rule is used.
      *
      * @param request DeactiveConfigRulesRequest
      * @return DeactiveConfigRulesResponse
     */
    public DeactiveConfigRulesResponse deactiveConfigRules(DeactiveConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactiveConfigRulesWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to delete the `cp-541e626622af0087****` compliance package from the `ca-04b3fd170e340007****` account group.
      *
      * @param request DeleteAggregateCompliancePacksRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteAggregateCompliancePacksResponse
     */
    public DeleteAggregateCompliancePacksResponse deleteAggregateCompliancePacksWithOptions(DeleteAggregateCompliancePacksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            body.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackIds)) {
            body.put("CompliancePackIds", request.compliancePackIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteRule)) {
            body.put("DeleteRule", request.deleteRule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAggregateCompliancePacks"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAggregateCompliancePacksResponse());
    }

    /**
      * This topic provides an example on how to delete the `cp-541e626622af0087****` compliance package from the `ca-04b3fd170e340007****` account group.
      *
      * @param request DeleteAggregateCompliancePacksRequest
      * @return DeleteAggregateCompliancePacksResponse
     */
    public DeleteAggregateCompliancePacksResponse deleteAggregateCompliancePacks(DeleteAggregateCompliancePacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAggregateCompliancePacksWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to delete the `cdc-38c3013b46c9002c****` delivery channel from the `ca-23c6626622af0041****` account group. The returned result shows that the `cdc-38c3013b46c9002c****` delivery channel is deleted.
      *
      * @param request DeleteAggregateConfigDeliveryChannelRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteAggregateConfigDeliveryChannelResponse
     */
    public DeleteAggregateConfigDeliveryChannelResponse deleteAggregateConfigDeliveryChannelWithOptions(DeleteAggregateConfigDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            query.put("DeliveryChannelId", request.deliveryChannelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAggregateConfigDeliveryChannel"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAggregateConfigDeliveryChannelResponse());
    }

    /**
      * This topic provides an example on how to delete the `cdc-38c3013b46c9002c****` delivery channel from the `ca-23c6626622af0041****` account group. The returned result shows that the `cdc-38c3013b46c9002c****` delivery channel is deleted.
      *
      * @param request DeleteAggregateConfigDeliveryChannelRequest
      * @return DeleteAggregateConfigDeliveryChannelResponse
     */
    public DeleteAggregateConfigDeliveryChannelResponse deleteAggregateConfigDeliveryChannel(DeleteAggregateConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAggregateConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
      * ### Background information
      * You can delete a rule in the Cloud Config console. After you delete the rule, the configurations of the rule are deleted.
      * ### Usage notes
      * This topic provides an example on how to delete the `cr-4e3d626622af0080****` rule from the `ca-a4e5626622af0079****` account group.
      *
      * @param request DeleteAggregateConfigRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteAggregateConfigRulesResponse
     */
    public DeleteAggregateConfigRulesResponse deleteAggregateConfigRulesWithOptions(DeleteAggregateConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAggregateConfigRules"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAggregateConfigRulesResponse());
    }

    /**
      * ### Background information
      * You can delete a rule in the Cloud Config console. After you delete the rule, the configurations of the rule are deleted.
      * ### Usage notes
      * This topic provides an example on how to delete the `cr-4e3d626622af0080****` rule from the `ca-a4e5626622af0079****` account group.
      *
      * @param request DeleteAggregateConfigRulesRequest
      * @return DeleteAggregateConfigRulesResponse
     */
    public DeleteAggregateConfigRulesResponse deleteAggregateConfigRules(DeleteAggregateConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAggregateConfigRulesWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to delete the remediation template whose ID is `crr-909ba2d4716700eb****` from the account group whose ID is `ca-6b4a626622af0012****`. The returned result shows that the remediation template whose ID is `crr-909ba2d4716700eb****` is deleted.
      *
      * @param request DeleteAggregateRemediationsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteAggregateRemediationsResponse
     */
    public DeleteAggregateRemediationsResponse deleteAggregateRemediationsWithOptions(DeleteAggregateRemediationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            body.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remediationIds)) {
            body.put("RemediationIds", request.remediationIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAggregateRemediations"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAggregateRemediationsResponse());
    }

    /**
      * This topic provides an example on how to delete the remediation template whose ID is `crr-909ba2d4716700eb****` from the account group whose ID is `ca-6b4a626622af0012****`. The returned result shows that the remediation template whose ID is `crr-909ba2d4716700eb****` is deleted.
      *
      * @param request DeleteAggregateRemediationsRequest
      * @return DeleteAggregateRemediationsResponse
     */
    public DeleteAggregateRemediationsResponse deleteAggregateRemediations(DeleteAggregateRemediationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAggregateRemediationsWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to delete the account group whose ID is `ca-9190626622af00a9****`.
      *
      * @param request DeleteAggregatorsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteAggregatorsResponse
     */
    public DeleteAggregatorsResponse deleteAggregatorsWithOptions(DeleteAggregatorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorIds)) {
            body.put("AggregatorIds", request.aggregatorIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAggregators"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAggregatorsResponse());
    }

    /**
      * This topic provides an example on how to delete the account group whose ID is `ca-9190626622af00a9****`.
      *
      * @param request DeleteAggregatorsRequest
      * @return DeleteAggregatorsResponse
     */
    public DeleteAggregatorsResponse deleteAggregators(DeleteAggregatorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAggregatorsWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to delete the `cp-541e626622af0087****` compliance package.
      *
      * @param request DeleteCompliancePacksRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteCompliancePacksResponse
     */
    public DeleteCompliancePacksResponse deleteCompliancePacksWithOptions(DeleteCompliancePacksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackIds)) {
            body.put("CompliancePackIds", request.compliancePackIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deleteRule)) {
            body.put("DeleteRule", request.deleteRule);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCompliancePacks"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCompliancePacksResponse());
    }

    /**
      * This topic provides an example on how to delete the `cp-541e626622af0087****` compliance package.
      *
      * @param request DeleteCompliancePacksRequest
      * @return DeleteCompliancePacksResponse
     */
    public DeleteCompliancePacksResponse deleteCompliancePacks(DeleteCompliancePacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCompliancePacksWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to delete the `cdc-38c3013b46c9002c****` delivery channel. The returned result shows that the `cdc-38c3013b46c9002c****` delivery channel is deleted.
      *
      * @param request DeleteConfigDeliveryChannelRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteConfigDeliveryChannelResponse
     */
    public DeleteConfigDeliveryChannelResponse deleteConfigDeliveryChannelWithOptions(DeleteConfigDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            query.put("DeliveryChannelId", request.deliveryChannelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConfigDeliveryChannel"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConfigDeliveryChannelResponse());
    }

    /**
      * This topic provides an example on how to delete the `cdc-38c3013b46c9002c****` delivery channel. The returned result shows that the `cdc-38c3013b46c9002c****` delivery channel is deleted.
      *
      * @param request DeleteConfigDeliveryChannelRequest
      * @return DeleteConfigDeliveryChannelResponse
     */
    public DeleteConfigDeliveryChannelResponse deleteConfigDeliveryChannel(DeleteConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
      * In this example, the rule whose ID is cr-9908626622af0035\\*\\*\\*\\* is deleted.
      *
      * @param request DeleteConfigRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteConfigRulesResponse
     */
    public DeleteConfigRulesResponse deleteConfigRulesWithOptions(DeleteConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteConfigRules"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteConfigRulesResponse());
    }

    /**
      * In this example, the rule whose ID is cr-9908626622af0035\\*\\*\\*\\* is deleted.
      *
      * @param request DeleteConfigRulesRequest
      * @return DeleteConfigRulesResponse
     */
    public DeleteConfigRulesResponse deleteConfigRules(DeleteConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConfigRulesWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to delete the remediation template `crr-909ba2d4716700eb****`. The returned result shows that the remediation template whose ID is `crr-909ba2d4716700eb****` is deleted.
      *
      * @param request DeleteRemediationsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DeleteRemediationsResponse
     */
    public DeleteRemediationsResponse deleteRemediationsWithOptions(DeleteRemediationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.remediationIds)) {
            body.put("RemediationIds", request.remediationIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRemediations"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRemediationsResponse());
    }

    /**
      * This topic provides an example on how to delete the remediation template `crr-909ba2d4716700eb****`. The returned result shows that the remediation template whose ID is `crr-909ba2d4716700eb****` is deleted.
      *
      * @param request DeleteRemediationsRequest
      * @return DeleteRemediationsResponse
     */
    public DeleteRemediationsResponse deleteRemediations(DeleteRemediationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRemediationsWithOptions(request, runtime);
    }

    /**
      * The sample request in this topic shows you how to remove the `cr-6cc4626622af00e7****` rule in the `ca-75b4626622af00c3****` account group from the `cp-5bb1626622af00bd****` compliance package.
      * ## Prerequisites
      * One or more rules in an account group are added to a compliance package.
      *
      * @param request DetachAggregateConfigRuleToCompliancePackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DetachAggregateConfigRuleToCompliancePackResponse
     */
    public DetachAggregateConfigRuleToCompliancePackResponse detachAggregateConfigRuleToCompliancePackWithOptions(DetachAggregateConfigRuleToCompliancePackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackId)) {
            query.put("CompliancePackId", request.compliancePackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachAggregateConfigRuleToCompliancePack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachAggregateConfigRuleToCompliancePackResponse());
    }

    /**
      * The sample request in this topic shows you how to remove the `cr-6cc4626622af00e7****` rule in the `ca-75b4626622af00c3****` account group from the `cp-5bb1626622af00bd****` compliance package.
      * ## Prerequisites
      * One or more rules in an account group are added to a compliance package.
      *
      * @param request DetachAggregateConfigRuleToCompliancePackRequest
      * @return DetachAggregateConfigRuleToCompliancePackResponse
     */
    public DetachAggregateConfigRuleToCompliancePackResponse detachAggregateConfigRuleToCompliancePack(DetachAggregateConfigRuleToCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachAggregateConfigRuleToCompliancePackWithOptions(request, runtime);
    }

    /**
      * ### Prerequisites
      * One or more rules are added to a compliance package.
      * ### Usage notes
      * This topic provides an example on how to remove the `cr-6cc4626622af00e7****` rule from the `cp-5bb1626622af00bd****` compliance package.
      *
      * @param request DetachConfigRuleToCompliancePackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return DetachConfigRuleToCompliancePackResponse
     */
    public DetachConfigRuleToCompliancePackResponse detachConfigRuleToCompliancePackWithOptions(DetachConfigRuleToCompliancePackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackId)) {
            query.put("CompliancePackId", request.compliancePackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachConfigRuleToCompliancePack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachConfigRuleToCompliancePackResponse());
    }

    /**
      * ### Prerequisites
      * One or more rules are added to a compliance package.
      * ### Usage notes
      * This topic provides an example on how to remove the `cr-6cc4626622af00e7****` rule from the `cp-5bb1626622af00bd****` compliance package.
      *
      * @param request DetachConfigRuleToCompliancePackRequest
      * @return DetachConfigRuleToCompliancePackResponse
     */
    public DetachConfigRuleToCompliancePackResponse detachConfigRuleToCompliancePack(DetachConfigRuleToCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachConfigRuleToCompliancePackWithOptions(request, runtime);
    }

    public EvaluatePreConfigRulesResponse evaluatePreConfigRulesWithOptions(EvaluatePreConfigRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EvaluatePreConfigRulesShrinkRequest request = new EvaluatePreConfigRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceEvaluateItems)) {
            request.resourceEvaluateItemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceEvaluateItems, "ResourceEvaluateItems", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.enableManagedRules)) {
            body.put("EnableManagedRules", request.enableManagedRules);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceEvaluateItemsShrink)) {
            body.put("ResourceEvaluateItems", request.resourceEvaluateItemsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EvaluatePreConfigRules"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EvaluatePreConfigRulesResponse());
    }

    public EvaluatePreConfigRulesResponse evaluatePreConfigRules(EvaluatePreConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.evaluatePreConfigRulesWithOptions(request, runtime);
    }

    /**
      * > You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetAggregateConfigRulesReport operation. For more information, see [GetAggregateCompliancePackReport](~~262699~~).
      * This topic provides an example on how to generate a compliance evaluation report based on the `cp-fdc8626622af00f9****` compliance package in the `ca-f632626622af0079****` account group.
      *
      * @param request GenerateAggregateCompliancePackReportRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GenerateAggregateCompliancePackReportResponse
     */
    public GenerateAggregateCompliancePackReportResponse generateAggregateCompliancePackReportWithOptions(GenerateAggregateCompliancePackReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            body.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackId)) {
            body.put("CompliancePackId", request.compliancePackId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateAggregateCompliancePackReport"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateAggregateCompliancePackReportResponse());
    }

    /**
      * > You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetAggregateConfigRulesReport operation. For more information, see [GetAggregateCompliancePackReport](~~262699~~).
      * This topic provides an example on how to generate a compliance evaluation report based on the `cp-fdc8626622af00f9****` compliance package in the `ca-f632626622af0079****` account group.
      *
      * @param request GenerateAggregateCompliancePackReportRequest
      * @return GenerateAggregateCompliancePackReportResponse
     */
    public GenerateAggregateCompliancePackReportResponse generateAggregateCompliancePackReport(GenerateAggregateCompliancePackReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateAggregateCompliancePackReportWithOptions(request, runtime);
    }

    /**
      * > You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetAggregateConfigRulesReport operation. For more information, see [GetAggregateConfigRulesReport](~~262706~~).
      * The topic provides an example on how to generate a compliance evaluation report based on all rules in the `ca-f632626622af0079****` account group.
      *
      * @param request GenerateAggregateConfigRulesReportRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GenerateAggregateConfigRulesReportResponse
     */
    public GenerateAggregateConfigRulesReportResponse generateAggregateConfigRulesReportWithOptions(GenerateAggregateConfigRulesReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            body.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            body.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateAggregateConfigRulesReport"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateAggregateConfigRulesReportResponse());
    }

    /**
      * > You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetAggregateConfigRulesReport operation. For more information, see [GetAggregateConfigRulesReport](~~262706~~).
      * The topic provides an example on how to generate a compliance evaluation report based on all rules in the `ca-f632626622af0079****` account group.
      *
      * @param request GenerateAggregateConfigRulesReportRequest
      * @return GenerateAggregateConfigRulesReportResponse
     */
    public GenerateAggregateConfigRulesReportResponse generateAggregateConfigRulesReport(GenerateAggregateConfigRulesReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateAggregateConfigRulesReportWithOptions(request, runtime);
    }

    public GenerateAggregateResourceInventoryResponse generateAggregateResourceInventoryWithOptions(GenerateAggregateResourceInventoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIds)) {
            query.put("AccountIds", request.accountIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regions)) {
            query.put("Regions", request.regions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateAggregateResourceInventory"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateAggregateResourceInventoryResponse());
    }

    public GenerateAggregateResourceInventoryResponse generateAggregateResourceInventory(GenerateAggregateResourceInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateAggregateResourceInventoryWithOptions(request, runtime);
    }

    /**
      * > You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetCompliancePackReport operation. For more information, see [GetCompliancePackReport](~~263347~~).
      * This topic provides an example on how to generate a compliance evaluation report based on the `cp-a8a8626622af0082****` compliance package.
      *
      * @param request GenerateCompliancePackReportRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GenerateCompliancePackReportResponse
     */
    public GenerateCompliancePackReportResponse generateCompliancePackReportWithOptions(GenerateCompliancePackReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackId)) {
            body.put("CompliancePackId", request.compliancePackId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateCompliancePackReport"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateCompliancePackReportResponse());
    }

    /**
      * > You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetCompliancePackReport operation. For more information, see [GetCompliancePackReport](~~263347~~).
      * This topic provides an example on how to generate a compliance evaluation report based on the `cp-a8a8626622af0082****` compliance package.
      *
      * @param request GenerateCompliancePackReportRequest
      * @return GenerateCompliancePackReportResponse
     */
    public GenerateCompliancePackReportResponse generateCompliancePackReport(GenerateCompliancePackReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateCompliancePackReportWithOptions(request, runtime);
    }

    /**
      * >  You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetConfigRulesReport operation. For more information, see [GetConfigRulesReport](~~263608~~).
      * This topic provides an example of how to generate a compliance evaluation report based on all existing rules.
      *
      * @param request GenerateConfigRulesReportRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GenerateConfigRulesReportResponse
     */
    public GenerateConfigRulesReportResponse generateConfigRulesReportWithOptions(GenerateConfigRulesReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            body.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateConfigRulesReport"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateConfigRulesReportResponse());
    }

    /**
      * >  You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetConfigRulesReport operation. For more information, see [GetConfigRulesReport](~~263608~~).
      * This topic provides an example of how to generate a compliance evaluation report based on all existing rules.
      *
      * @param request GenerateConfigRulesReportRequest
      * @return GenerateConfigRulesReportResponse
     */
    public GenerateConfigRulesReportResponse generateConfigRulesReport(GenerateConfigRulesReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateConfigRulesReportWithOptions(request, runtime);
    }

    public GenerateResourceInventoryResponse generateResourceInventoryWithOptions(GenerateResourceInventoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regions)) {
            query.put("Regions", request.regions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateResourceInventory"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateResourceInventoryResponse());
    }

    public GenerateResourceInventoryResponse generateResourceInventory(GenerateResourceInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateResourceInventoryWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the compliance evaluation results of member accounts for which the `cp-541e626622af0087****` compliance package takes effect in the `ca-04b3fd170e340007****` account group. The returned result shows that two member accounts are monitored by the compliance package and they are both evaluated as compliant.
      *
      * @param request GetAggregateAccountComplianceByPackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregateAccountComplianceByPackResponse
     */
    public GetAggregateAccountComplianceByPackResponse getAggregateAccountComplianceByPackWithOptions(GetAggregateAccountComplianceByPackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateAccountComplianceByPack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateAccountComplianceByPackResponse());
    }

    /**
      * This topic provides an example on how to query the compliance evaluation results of member accounts for which the `cp-541e626622af0087****` compliance package takes effect in the `ca-04b3fd170e340007****` account group. The returned result shows that two member accounts are monitored by the compliance package and they are both evaluated as compliant.
      *
      * @param request GetAggregateAccountComplianceByPackRequest
      * @return GetAggregateAccountComplianceByPackResponse
     */
    public GetAggregateAccountComplianceByPackResponse getAggregateAccountComplianceByPack(GetAggregateAccountComplianceByPackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateAccountComplianceByPackWithOptions(request, runtime);
    }

    /**
      * The topic provides an example on how to query the details of a compliance package whose ID is `cp-fdc8626622af00f9****` in an account group whose ID is `ca-f632626622af0079****`.
      *
      * @param request GetAggregateCompliancePackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregateCompliancePackResponse
     */
    public GetAggregateCompliancePackResponse getAggregateCompliancePackWithOptions(GetAggregateCompliancePackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateCompliancePack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateCompliancePackResponse());
    }

    /**
      * The topic provides an example on how to query the details of a compliance package whose ID is `cp-fdc8626622af00f9****` in an account group whose ID is `ca-f632626622af0079****`.
      *
      * @param request GetAggregateCompliancePackRequest
      * @return GetAggregateCompliancePackResponse
     */
    public GetAggregateCompliancePackResponse getAggregateCompliancePack(GetAggregateCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateCompliancePackWithOptions(request, runtime);
    }

    /**
      * > Before you call this operation, you must call the GenerateAggregateCompliancePackReport operation to generate the latest compliance evaluation report based on a compliance package. For more information, see [GenerateAggregateCompliancePackReport](~~262687~~).
      * This topic provides an example on how to query the compliance evaluation report that is generated based on the `cp-fdc8626622af00f9****` compliance package in the `ca-f632626622af0079****` account group.
      *
      * @param request GetAggregateCompliancePackReportRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregateCompliancePackReportResponse
     */
    public GetAggregateCompliancePackReportResponse getAggregateCompliancePackReportWithOptions(GetAggregateCompliancePackReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateCompliancePackReport"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateCompliancePackReportResponse());
    }

    /**
      * > Before you call this operation, you must call the GenerateAggregateCompliancePackReport operation to generate the latest compliance evaluation report based on a compliance package. For more information, see [GenerateAggregateCompliancePackReport](~~262687~~).
      * This topic provides an example on how to query the compliance evaluation report that is generated based on the `cp-fdc8626622af00f9****` compliance package in the `ca-f632626622af0079****` account group.
      *
      * @param request GetAggregateCompliancePackReportRequest
      * @return GetAggregateCompliancePackReportResponse
     */
    public GetAggregateCompliancePackReportResponse getAggregateCompliancePackReport(GetAggregateCompliancePackReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateCompliancePackReportWithOptions(request, runtime);
    }

    public GetAggregateComplianceSummaryResponse getAggregateComplianceSummaryWithOptions(GetAggregateComplianceSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateComplianceSummary"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateComplianceSummaryResponse());
    }

    public GetAggregateComplianceSummaryResponse getAggregateComplianceSummary(GetAggregateComplianceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateComplianceSummaryWithOptions(request, runtime);
    }

    public GetAggregateConfigDeliveryChannelResponse getAggregateConfigDeliveryChannelWithOptions(GetAggregateConfigDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            query.put("DeliveryChannelId", request.deliveryChannelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateConfigDeliveryChannel"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateConfigDeliveryChannelResponse());
    }

    public GetAggregateConfigDeliveryChannelResponse getAggregateConfigDeliveryChannel(GetAggregateConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
      * This example shows how to query the details of the `cr-7f7d626622af0041****` rule in the `ca-7f00626622af0041****` account group.
      *
      * @param request GetAggregateConfigRuleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregateConfigRuleResponse
     */
    public GetAggregateConfigRuleResponse getAggregateConfigRuleWithOptions(GetAggregateConfigRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            query.put("ConfigRuleId", request.configRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateConfigRule"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateConfigRuleResponse());
    }

    /**
      * This example shows how to query the details of the `cr-7f7d626622af0041****` rule in the `ca-7f00626622af0041****` account group.
      *
      * @param request GetAggregateConfigRuleRequest
      * @return GetAggregateConfigRuleResponse
     */
    public GetAggregateConfigRuleResponse getAggregateConfigRule(GetAggregateConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateConfigRuleWithOptions(request, runtime);
    }

    /**
      * The sample request in this topic shows you how to query the compliance evaluation results based on rules in the `cp-541e626622af0087****` compliance package that is created for the `ca-04b3fd170e340007****` account group. The return result shows a total of `one` rule. `No resources` are evaluated as non-compliant based on the rule.
      *
      * @param request GetAggregateConfigRuleComplianceByPackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregateConfigRuleComplianceByPackResponse
     */
    public GetAggregateConfigRuleComplianceByPackResponse getAggregateConfigRuleComplianceByPackWithOptions(GetAggregateConfigRuleComplianceByPackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateConfigRuleComplianceByPack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateConfigRuleComplianceByPackResponse());
    }

    /**
      * The sample request in this topic shows you how to query the compliance evaluation results based on rules in the `cp-541e626622af0087****` compliance package that is created for the `ca-04b3fd170e340007****` account group. The return result shows a total of `one` rule. `No resources` are evaluated as non-compliant based on the rule.
      *
      * @param request GetAggregateConfigRuleComplianceByPackRequest
      * @return GetAggregateConfigRuleComplianceByPackResponse
     */
    public GetAggregateConfigRuleComplianceByPackResponse getAggregateConfigRuleComplianceByPack(GetAggregateConfigRuleComplianceByPackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateConfigRuleComplianceByPackWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the summary of compliance evaluation results by rule risk level in the `ca-3a58626622af0005****` account group. The returned result shows four rules that are specified with the high risk level. One of the rules detects non-compliant resources, and the resources evaluated by the remaining three are compliant.
      *
      * @param request GetAggregateConfigRuleSummaryByRiskLevelRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregateConfigRuleSummaryByRiskLevelResponse
     */
    public GetAggregateConfigRuleSummaryByRiskLevelResponse getAggregateConfigRuleSummaryByRiskLevelWithOptions(GetAggregateConfigRuleSummaryByRiskLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateConfigRuleSummaryByRiskLevel"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateConfigRuleSummaryByRiskLevelResponse());
    }

    /**
      * This topic provides an example on how to query the summary of compliance evaluation results by rule risk level in the `ca-3a58626622af0005****` account group. The returned result shows four rules that are specified with the high risk level. One of the rules detects non-compliant resources, and the resources evaluated by the remaining three are compliant.
      *
      * @param request GetAggregateConfigRuleSummaryByRiskLevelRequest
      * @return GetAggregateConfigRuleSummaryByRiskLevelResponse
     */
    public GetAggregateConfigRuleSummaryByRiskLevelResponse getAggregateConfigRuleSummaryByRiskLevel(GetAggregateConfigRuleSummaryByRiskLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateConfigRuleSummaryByRiskLevelWithOptions(request, runtime);
    }

    /**
      * > Before you call this operation, you must call the GenerateAggregateConfigRulesReport operation to generate the latest compliance evaluation report based on all rules in an account group. For more information, see [GenerateAggregateConfigRulesReport](~~262701~~).
      * This topic provides an example on how to query the compliance evaluation report that is generated based on all rules in the `ca-f632626622af0079****` account group.
      *
      * @param request GetAggregateConfigRulesReportRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregateConfigRulesReportResponse
     */
    public GetAggregateConfigRulesReportResponse getAggregateConfigRulesReportWithOptions(GetAggregateConfigRulesReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateConfigRulesReport"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateConfigRulesReportResponse());
    }

    /**
      * > Before you call this operation, you must call the GenerateAggregateConfigRulesReport operation to generate the latest compliance evaluation report based on all rules in an account group. For more information, see [GenerateAggregateConfigRulesReport](~~262701~~).
      * This topic provides an example on how to query the compliance evaluation report that is generated based on all rules in the `ca-f632626622af0079****` account group.
      *
      * @param request GetAggregateConfigRulesReportRequest
      * @return GetAggregateConfigRulesReportResponse
     */
    public GetAggregateConfigRulesReportResponse getAggregateConfigRulesReport(GetAggregateConfigRulesReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateConfigRulesReportWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the `new-bucket` resource in the `ca-5885626622af0008****` account group.
      *
      * @param request GetAggregateDiscoveredResourceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregateDiscoveredResourceResponse
     */
    public GetAggregateDiscoveredResourceResponse getAggregateDiscoveredResourceWithOptions(GetAggregateDiscoveredResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateDiscoveredResource"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateDiscoveredResourceResponse());
    }

    /**
      * This topic provides an example on how to query the `new-bucket` resource in the `ca-5885626622af0008****` account group.
      *
      * @param request GetAggregateDiscoveredResourceRequest
      * @return GetAggregateDiscoveredResourceResponse
     */
    public GetAggregateDiscoveredResourceResponse getAggregateDiscoveredResource(GetAggregateDiscoveredResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateDiscoveredResourceWithOptions(request, runtime);
    }

    /**
      * The sample request in this topic shows you how to query the compliance evaluation results based on the `cr-d369626622af008e****` rule in the `ca-a4e5626622af0079****` account group. The return result shows that a total of 10 resources are evaluated by the rule and five of them are evaluated as compliant.
      *
      * @param request GetAggregateResourceComplianceByConfigRuleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregateResourceComplianceByConfigRuleResponse
     */
    public GetAggregateResourceComplianceByConfigRuleResponse getAggregateResourceComplianceByConfigRuleWithOptions(GetAggregateResourceComplianceByConfigRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.complianceType)) {
            query.put("ComplianceType", request.complianceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            query.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAccountId)) {
            query.put("ResourceAccountId", request.resourceAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateResourceComplianceByConfigRule"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateResourceComplianceByConfigRuleResponse());
    }

    /**
      * The sample request in this topic shows you how to query the compliance evaluation results based on the `cr-d369626622af008e****` rule in the `ca-a4e5626622af0079****` account group. The return result shows that a total of 10 resources are evaluated by the rule and five of them are evaluated as compliant.
      *
      * @param request GetAggregateResourceComplianceByConfigRuleRequest
      * @return GetAggregateResourceComplianceByConfigRuleResponse
     */
    public GetAggregateResourceComplianceByConfigRuleResponse getAggregateResourceComplianceByConfigRule(GetAggregateResourceComplianceByConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceComplianceByConfigRuleWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the compliance evaluation results of resources monitored based on the `cp-fdc8626622af00f9****` compliance package in the `ca-f632626622af0079****`account group. The returned result shows that the total number of monitored resources is `10` and the number of non-compliant resources is `7`.
      *
      * @param request GetAggregateResourceComplianceByPackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregateResourceComplianceByPackResponse
     */
    public GetAggregateResourceComplianceByPackResponse getAggregateResourceComplianceByPackWithOptions(GetAggregateResourceComplianceByPackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateResourceComplianceByPack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateResourceComplianceByPackResponse());
    }

    /**
      * This topic provides an example on how to query the compliance evaluation results of resources monitored based on the `cp-fdc8626622af00f9****` compliance package in the `ca-f632626622af0079****`account group. The returned result shows that the total number of monitored resources is `10` and the number of non-compliant resources is `7`.
      *
      * @param request GetAggregateResourceComplianceByPackRequest
      * @return GetAggregateResourceComplianceByPackResponse
     */
    public GetAggregateResourceComplianceByPackResponse getAggregateResourceComplianceByPack(GetAggregateResourceComplianceByPackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceComplianceByPackWithOptions(request, runtime);
    }

    public GetAggregateResourceComplianceGroupByRegionResponse getAggregateResourceComplianceGroupByRegionWithOptions(GetAggregateResourceComplianceGroupByRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateResourceComplianceGroupByRegion"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateResourceComplianceGroupByRegionResponse());
    }

    public GetAggregateResourceComplianceGroupByRegionResponse getAggregateResourceComplianceGroupByRegion(GetAggregateResourceComplianceGroupByRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceComplianceGroupByRegionWithOptions(request, runtime);
    }

    public GetAggregateResourceComplianceGroupByResourceTypeResponse getAggregateResourceComplianceGroupByResourceTypeWithOptions(GetAggregateResourceComplianceGroupByResourceTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateResourceComplianceGroupByResourceType"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateResourceComplianceGroupByResourceTypeResponse());
    }

    public GetAggregateResourceComplianceGroupByResourceTypeResponse getAggregateResourceComplianceGroupByResourceType(GetAggregateResourceComplianceGroupByResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceComplianceGroupByResourceTypeWithOptions(request, runtime);
    }

    /**
      * The sample request in this topic shows you how to query the compliance timeline of the `new-bucket` resource that resides in the `cn-hangzhou` region within the `100931896542****` member account of the `ca-5885626622af0008****` account group. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows the following two timestamps on the compliance timeline: `1625200295276` and `1625200228510`. The first timestamp indicates 12:31:35 on July 2, 2021 (UTC+8), and the second timestamp indicates 12:30:28 on July 2, 2021 (UTC+8).
      *
      * @param request GetAggregateResourceComplianceTimelineRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregateResourceComplianceTimelineResponse
     */
    public GetAggregateResourceComplianceTimelineResponse getAggregateResourceComplianceTimelineWithOptions(GetAggregateResourceComplianceTimelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateResourceComplianceTimeline"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateResourceComplianceTimelineResponse());
    }

    /**
      * The sample request in this topic shows you how to query the compliance timeline of the `new-bucket` resource that resides in the `cn-hangzhou` region within the `100931896542****` member account of the `ca-5885626622af0008****` account group. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows the following two timestamps on the compliance timeline: `1625200295276` and `1625200228510`. The first timestamp indicates 12:31:35 on July 2, 2021 (UTC+8), and the second timestamp indicates 12:30:28 on July 2, 2021 (UTC+8).
      *
      * @param request GetAggregateResourceComplianceTimelineRequest
      * @return GetAggregateResourceComplianceTimelineResponse
     */
    public GetAggregateResourceComplianceTimelineResponse getAggregateResourceComplianceTimeline(GetAggregateResourceComplianceTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceComplianceTimelineWithOptions(request, runtime);
    }

    /**
      * The sample request in this topic shows you how to query the configuration timeline of the `new-bucket` resource that resides in the `cn-hangzhou` region within the `100931896542****` member account of the `ca-5885626622af0008****` account group. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows that the timestamp when the resource configuration changes is `1624961112000`. The timestamp indicates 18:05:12 on June 29, 2021 (UTC+8).
      *
      * @param request GetAggregateResourceConfigurationTimelineRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregateResourceConfigurationTimelineResponse
     */
    public GetAggregateResourceConfigurationTimelineResponse getAggregateResourceConfigurationTimelineWithOptions(GetAggregateResourceConfigurationTimelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateResourceConfigurationTimeline"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateResourceConfigurationTimelineResponse());
    }

    /**
      * The sample request in this topic shows you how to query the configuration timeline of the `new-bucket` resource that resides in the `cn-hangzhou` region within the `100931896542****` member account of the `ca-5885626622af0008****` account group. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows that the timestamp when the resource configuration changes is `1624961112000`. The timestamp indicates 18:05:12 on June 29, 2021 (UTC+8).
      *
      * @param request GetAggregateResourceConfigurationTimelineRequest
      * @return GetAggregateResourceConfigurationTimelineResponse
     */
    public GetAggregateResourceConfigurationTimelineResponse getAggregateResourceConfigurationTimeline(GetAggregateResourceConfigurationTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceConfigurationTimelineWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the statistics on the resources in an account group named `ca-a260626622af0005****` by region. The returned result shows that a total of `10` resources exist in the `cn-hangzhou` region.
      *
      * @param request GetAggregateResourceCountsGroupByRegionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregateResourceCountsGroupByRegionResponse
     */
    public GetAggregateResourceCountsGroupByRegionResponse getAggregateResourceCountsGroupByRegionWithOptions(GetAggregateResourceCountsGroupByRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAccountId)) {
            query.put("ResourceAccountId", request.resourceAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateResourceCountsGroupByRegion"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateResourceCountsGroupByRegionResponse());
    }

    /**
      * This topic provides an example on how to query the statistics on the resources in an account group named `ca-a260626622af0005****` by region. The returned result shows that a total of `10` resources exist in the `cn-hangzhou` region.
      *
      * @param request GetAggregateResourceCountsGroupByRegionRequest
      * @return GetAggregateResourceCountsGroupByRegionResponse
     */
    public GetAggregateResourceCountsGroupByRegionResponse getAggregateResourceCountsGroupByRegion(GetAggregateResourceCountsGroupByRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceCountsGroupByRegionWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the statistics on the resources in an account group whose ID is `ca-a260626622af0005****` by resource type. The returned result shows that a total of `seven` resources of the `ACS::RAM::Role` resource type exist.
      *
      * @param request GetAggregateResourceCountsGroupByResourceTypeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregateResourceCountsGroupByResourceTypeResponse
     */
    public GetAggregateResourceCountsGroupByResourceTypeResponse getAggregateResourceCountsGroupByResourceTypeWithOptions(GetAggregateResourceCountsGroupByResourceTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            query.put("FolderId", request.folderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAccountId)) {
            query.put("ResourceAccountId", request.resourceAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateResourceCountsGroupByResourceType"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateResourceCountsGroupByResourceTypeResponse());
    }

    /**
      * This topic provides an example on how to query the statistics on the resources in an account group whose ID is `ca-a260626622af0005****` by resource type. The returned result shows that a total of `seven` resources of the `ACS::RAM::Role` resource type exist.
      *
      * @param request GetAggregateResourceCountsGroupByResourceTypeRequest
      * @return GetAggregateResourceCountsGroupByResourceTypeResponse
     */
    public GetAggregateResourceCountsGroupByResourceTypeResponse getAggregateResourceCountsGroupByResourceType(GetAggregateResourceCountsGroupByResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceCountsGroupByResourceTypeWithOptions(request, runtime);
    }

    /**
      * The sample request in this topic shows you how to query the details of the `ca-88ea626622af0055****` account group. The return result shows that the account group is named `Test_Group`, its description is `Test account group`, and it is of the `CUSTOM` type. The account group is in the `1` state, which indicates that it is created.
      *
      * @param request GetAggregatorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetAggregatorResponse
     */
    public GetAggregatorResponse getAggregatorWithOptions(GetAggregatorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregator"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregatorResponse());
    }

    /**
      * The sample request in this topic shows you how to query the details of the `ca-88ea626622af0055****` account group. The return result shows that the account group is named `Test_Group`, its description is `Test account group`, and it is of the `CUSTOM` type. The account group is in the `1` state, which indicates that it is created.
      *
      * @param request GetAggregatorRequest
      * @return GetAggregatorResponse
     */
    public GetAggregatorResponse getAggregator(GetAggregatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregatorWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the details of a compliance package whose ID is `cp-fdc8626622af00f9****`. The returned result shows that the name of the compliance package is `ClassifiedProtectionPreCheck`, the compliance package is in the `ACTIVE` state, and the risk level of the rules in the compliance package is `1`, which indicates high risk level.
      *
      * @param request GetCompliancePackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetCompliancePackResponse
     */
    public GetCompliancePackResponse getCompliancePackWithOptions(GetCompliancePackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompliancePack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompliancePackResponse());
    }

    /**
      * This topic provides an example on how to query the details of a compliance package whose ID is `cp-fdc8626622af00f9****`. The returned result shows that the name of the compliance package is `ClassifiedProtectionPreCheck`, the compliance package is in the `ACTIVE` state, and the risk level of the rules in the compliance package is `1`, which indicates high risk level.
      *
      * @param request GetCompliancePackRequest
      * @return GetCompliancePackResponse
     */
    public GetCompliancePackResponse getCompliancePack(GetCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCompliancePackWithOptions(request, runtime);
    }

    /**
      * > Before you call this operation, you must call the GenerateCompliancePackReport operation to generate the latest compliance evaluation report based on a compliance package. For more information, see [GenerateCompliancePackReport](~~263525~~).
      * This topic provides an example on how to query the compliance evaluation report that is generated based on the `cp-fdc8626622af00f9****` compliance package.
      *
      * @param request GetCompliancePackReportRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetCompliancePackReportResponse
     */
    public GetCompliancePackReportResponse getCompliancePackReportWithOptions(GetCompliancePackReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCompliancePackReport"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCompliancePackReportResponse());
    }

    /**
      * > Before you call this operation, you must call the GenerateCompliancePackReport operation to generate the latest compliance evaluation report based on a compliance package. For more information, see [GenerateCompliancePackReport](~~263525~~).
      * This topic provides an example on how to query the compliance evaluation report that is generated based on the `cp-fdc8626622af00f9****` compliance package.
      *
      * @param request GetCompliancePackReportRequest
      * @return GetCompliancePackReportResponse
     */
    public GetCompliancePackReportResponse getCompliancePackReport(GetCompliancePackReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCompliancePackReportWithOptions(request, runtime);
    }

    public GetComplianceSummaryResponse getComplianceSummaryWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetComplianceSummary"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetComplianceSummaryResponse());
    }

    public GetComplianceSummaryResponse getComplianceSummary() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getComplianceSummaryWithOptions(runtime);
    }

    public GetConfigDeliveryChannelResponse getConfigDeliveryChannelWithOptions(GetConfigDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            query.put("DeliveryChannelId", request.deliveryChannelId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConfigDeliveryChannel"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConfigDeliveryChannelResponse());
    }

    public GetConfigDeliveryChannelResponse getConfigDeliveryChannel(GetConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the details of the `cr-7f7d626622af0041****` rule.
      *
      * @param request GetConfigRuleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetConfigRuleResponse
     */
    public GetConfigRuleResponse getConfigRuleWithOptions(GetConfigRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            query.put("ConfigRuleId", request.configRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConfigRule"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConfigRuleResponse());
    }

    /**
      * This topic provides an example on how to query the details of the `cr-7f7d626622af0041****` rule.
      *
      * @param request GetConfigRuleRequest
      * @return GetConfigRuleResponse
     */
    public GetConfigRuleResponse getConfigRule(GetConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigRuleWithOptions(request, runtime);
    }

    /**
      * In this topic, the `cp-541e626622af0087****` compliance package is used as an example. The return result shows a total of one rule against which specific resources are evaluated as compliant.
      *
      * @param request GetConfigRuleComplianceByPackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetConfigRuleComplianceByPackResponse
     */
    public GetConfigRuleComplianceByPackResponse getConfigRuleComplianceByPackWithOptions(GetConfigRuleComplianceByPackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConfigRuleComplianceByPack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConfigRuleComplianceByPackResponse());
    }

    /**
      * In this topic, the `cp-541e626622af0087****` compliance package is used as an example. The return result shows a total of one rule against which specific resources are evaluated as compliant.
      *
      * @param request GetConfigRuleComplianceByPackRequest
      * @return GetConfigRuleComplianceByPackResponse
     */
    public GetConfigRuleComplianceByPackResponse getConfigRuleComplianceByPack(GetConfigRuleComplianceByPackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigRuleComplianceByPackWithOptions(request, runtime);
    }

    /**
      * This topic provides an example of how to query the summary of compliance evaluation results by rule risk level. The return result shows four rules that are specified with the high risk level. One of them detects non-compliant resources, and the resources evaluated by the remaining three are all compliant.
      *
      * @param request GetConfigRuleSummaryByRiskLevelRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetConfigRuleSummaryByRiskLevelResponse
     */
    public GetConfigRuleSummaryByRiskLevelResponse getConfigRuleSummaryByRiskLevelWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConfigRuleSummaryByRiskLevel"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConfigRuleSummaryByRiskLevelResponse());
    }

    /**
      * This topic provides an example of how to query the summary of compliance evaluation results by rule risk level. The return result shows four rules that are specified with the high risk level. One of them detects non-compliant resources, and the resources evaluated by the remaining three are all compliant.
      *
      * @return GetConfigRuleSummaryByRiskLevelResponse
     */
    public GetConfigRuleSummaryByRiskLevelResponse getConfigRuleSummaryByRiskLevel() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigRuleSummaryByRiskLevelWithOptions(runtime);
    }

    /**
      * >  Before you call this operation, you must call the GenerateConfigRulesReport operation to generate the latest compliance evaluation report based on all existing rules. For more information, see [GenerateConfigRulesReport](~~263601~~).
      * This topic provides an example of how to query the compliance evaluation report that is generated based on all existing rules.
      *
      * @param request GetConfigRulesReportRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetConfigRulesReportResponse
     */
    public GetConfigRulesReportResponse getConfigRulesReportWithOptions(GetConfigRulesReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportId)) {
            query.put("ReportId", request.reportId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConfigRulesReport"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConfigRulesReportResponse());
    }

    /**
      * >  Before you call this operation, you must call the GenerateConfigRulesReport operation to generate the latest compliance evaluation report based on all existing rules. For more information, see [GenerateConfigRulesReport](~~263601~~).
      * This topic provides an example of how to query the compliance evaluation report that is generated based on all existing rules.
      *
      * @param request GetConfigRulesReportRequest
      * @return GetConfigRulesReportResponse
     */
    public GetConfigRulesReportResponse getConfigRulesReport(GetConfigRulesReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigRulesReportWithOptions(request, runtime);
    }

    public GetConfigurationRecorderResponse getConfigurationRecorderWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetConfigurationRecorder"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConfigurationRecorderResponse());
    }

    public GetConfigurationRecorderResponse getConfigurationRecorder() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigurationRecorderWithOptions(runtime);
    }

    /**
      * The sample request in this topic shows you how to query the details of the `new-bucket` resource.
      *
      * @param request GetDiscoveredResourceRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDiscoveredResourceResponse
     */
    public GetDiscoveredResourceResponse getDiscoveredResourceWithOptions(GetDiscoveredResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDiscoveredResource"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDiscoveredResourceResponse());
    }

    /**
      * The sample request in this topic shows you how to query the details of the `new-bucket` resource.
      *
      * @param request GetDiscoveredResourceRequest
      * @return GetDiscoveredResourceResponse
     */
    public GetDiscoveredResourceResponse getDiscoveredResource(GetDiscoveredResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDiscoveredResourceWithOptions(request, runtime);
    }

    /**
      * This topic provides an example of how to query the statistics on resources by region. The returned result shows that a total of 10 resources exist in the `cn-hangzhou` region.
      *
      * @param request GetDiscoveredResourceCountsGroupByRegionRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDiscoveredResourceCountsGroupByRegionResponse
     */
    public GetDiscoveredResourceCountsGroupByRegionResponse getDiscoveredResourceCountsGroupByRegionWithOptions(GetDiscoveredResourceCountsGroupByRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDiscoveredResourceCountsGroupByRegion"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDiscoveredResourceCountsGroupByRegionResponse());
    }

    /**
      * This topic provides an example of how to query the statistics on resources by region. The returned result shows that a total of 10 resources exist in the `cn-hangzhou` region.
      *
      * @param request GetDiscoveredResourceCountsGroupByRegionRequest
      * @return GetDiscoveredResourceCountsGroupByRegionResponse
     */
    public GetDiscoveredResourceCountsGroupByRegionResponse getDiscoveredResourceCountsGroupByRegion(GetDiscoveredResourceCountsGroupByRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDiscoveredResourceCountsGroupByRegionWithOptions(request, runtime);
    }

    /**
      * This topic describes how to query the statistics on resources by resource type. The returned result shows that a total of 10 resources of the `ACS::ECS::Instance` resource type exist.
      *
      * @param request GetDiscoveredResourceCountsGroupByResourceTypeRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetDiscoveredResourceCountsGroupByResourceTypeResponse
     */
    public GetDiscoveredResourceCountsGroupByResourceTypeResponse getDiscoveredResourceCountsGroupByResourceTypeWithOptions(GetDiscoveredResourceCountsGroupByResourceTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDiscoveredResourceCountsGroupByResourceType"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDiscoveredResourceCountsGroupByResourceTypeResponse());
    }

    /**
      * This topic describes how to query the statistics on resources by resource type. The returned result shows that a total of 10 resources of the `ACS::ECS::Instance` resource type exist.
      *
      * @param request GetDiscoveredResourceCountsGroupByResourceTypeRequest
      * @return GetDiscoveredResourceCountsGroupByResourceTypeResponse
     */
    public GetDiscoveredResourceCountsGroupByResourceTypeResponse getDiscoveredResourceCountsGroupByResourceType(GetDiscoveredResourceCountsGroupByResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDiscoveredResourceCountsGroupByResourceTypeWithOptions(request, runtime);
    }

    public GetIntegratedServiceStatusResponse getIntegratedServiceStatusWithOptions(GetIntegratedServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIntegratedServiceStatus"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIntegratedServiceStatusResponse());
    }

    public GetIntegratedServiceStatusResponse getIntegratedServiceStatus(GetIntegratedServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIntegratedServiceStatusWithOptions(request, runtime);
    }

    /**
      * In this topic, the `cdn-domain-https-enabled` managed rule is used as an example.
      *
      * @param request GetManagedRuleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetManagedRuleResponse
     */
    public GetManagedRuleResponse getManagedRuleWithOptions(GetManagedRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.identifier)) {
            query.put("Identifier", request.identifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetManagedRule"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetManagedRuleResponse());
    }

    /**
      * In this topic, the `cdn-domain-https-enabled` managed rule is used as an example.
      *
      * @param request GetManagedRuleRequest
      * @return GetManagedRuleResponse
     */
    public GetManagedRuleResponse getManagedRule(GetManagedRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getManagedRuleWithOptions(request, runtime);
    }

    public GetRemediationTemplateResponse getRemediationTemplateWithOptions(GetRemediationTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateIdentifier)) {
            query.put("TemplateIdentifier", request.templateIdentifier);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRemediationTemplate"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRemediationTemplateResponse());
    }

    public GetRemediationTemplateResponse getRemediationTemplate(GetRemediationTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRemediationTemplateWithOptions(request, runtime);
    }

    /**
      * In this topic, the `cr-d369626622af008e****` rule is used as an example. The return result shows that a total of 10 resources are evaluated by the rule and `five` of them are evaluated as compliant.
      *
      * @param request GetResourceComplianceByConfigRuleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetResourceComplianceByConfigRuleResponse
     */
    public GetResourceComplianceByConfigRuleResponse getResourceComplianceByConfigRuleWithOptions(GetResourceComplianceByConfigRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceComplianceByConfigRule"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceComplianceByConfigRuleResponse());
    }

    /**
      * In this topic, the `cr-d369626622af008e****` rule is used as an example. The return result shows that a total of 10 resources are evaluated by the rule and `five` of them are evaluated as compliant.
      *
      * @param request GetResourceComplianceByConfigRuleRequest
      * @return GetResourceComplianceByConfigRuleResponse
     */
    public GetResourceComplianceByConfigRuleResponse getResourceComplianceByConfigRule(GetResourceComplianceByConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceComplianceByConfigRuleWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the compliance evaluation results of resources monitored by using the `cp-541e626622af0087****` compliance package. The returned result shows a total of 10 resources and seven of them are evaluated as non-compliant.
      *
      * @param request GetResourceComplianceByPackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetResourceComplianceByPackResponse
     */
    public GetResourceComplianceByPackResponse getResourceComplianceByPackWithOptions(GetResourceComplianceByPackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceComplianceByPack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceComplianceByPackResponse());
    }

    /**
      * This topic provides an example on how to query the compliance evaluation results of resources monitored by using the `cp-541e626622af0087****` compliance package. The returned result shows a total of 10 resources and seven of them are evaluated as non-compliant.
      *
      * @param request GetResourceComplianceByPackRequest
      * @return GetResourceComplianceByPackResponse
     */
    public GetResourceComplianceByPackResponse getResourceComplianceByPack(GetResourceComplianceByPackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceComplianceByPackWithOptions(request, runtime);
    }

    public GetResourceComplianceGroupByRegionResponse getResourceComplianceGroupByRegionWithOptions(GetResourceComplianceGroupByRegionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceComplianceGroupByRegion"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceComplianceGroupByRegionResponse());
    }

    public GetResourceComplianceGroupByRegionResponse getResourceComplianceGroupByRegion(GetResourceComplianceGroupByRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceComplianceGroupByRegionWithOptions(request, runtime);
    }

    public GetResourceComplianceGroupByResourceTypeResponse getResourceComplianceGroupByResourceTypeWithOptions(GetResourceComplianceGroupByResourceTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceComplianceGroupByResourceType"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceComplianceGroupByResourceTypeResponse());
    }

    public GetResourceComplianceGroupByResourceTypeResponse getResourceComplianceGroupByResourceType(GetResourceComplianceGroupByResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceComplianceGroupByResourceTypeWithOptions(request, runtime);
    }

    /**
      * The sample request in this topic shows you how to query the compliance timeline of the `new-bucket` resource that resides in the `cn-hangzhou` region. The resource is an Object Storage Service (OSS) bucket. The return result shows the following two timestamps on the compliance timeline: `1625200295276` and `1625200228510`. The first timestamp indicates 12:31:35 on July 2, 2021 (UTC+8) and the second timestamp indicates 12:30:28 on July 2, 2021 (UTC+8).
      *
      * @param request GetResourceComplianceTimelineRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetResourceComplianceTimelineResponse
     */
    public GetResourceComplianceTimelineResponse getResourceComplianceTimelineWithOptions(GetResourceComplianceTimelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceComplianceTimeline"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceComplianceTimelineResponse());
    }

    /**
      * The sample request in this topic shows you how to query the compliance timeline of the `new-bucket` resource that resides in the `cn-hangzhou` region. The resource is an Object Storage Service (OSS) bucket. The return result shows the following two timestamps on the compliance timeline: `1625200295276` and `1625200228510`. The first timestamp indicates 12:31:35 on July 2, 2021 (UTC+8) and the second timestamp indicates 12:30:28 on July 2, 2021 (UTC+8).
      *
      * @param request GetResourceComplianceTimelineRequest
      * @return GetResourceComplianceTimelineResponse
     */
    public GetResourceComplianceTimelineResponse getResourceComplianceTimeline(GetResourceComplianceTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceComplianceTimelineWithOptions(request, runtime);
    }

    /**
      * The sample request in this topic shows you how to query the configuration timeline of the `new-bucket` resource that resides in the `cn-hangzhou` region. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows that the timestamp when the resource configuration changes is `1624961112000`. The timestamp indicates 18:05:12 on June 29, 2021 (UTC+8).
      *
      * @param request GetResourceConfigurationTimelineRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetResourceConfigurationTimelineResponse
     */
    public GetResourceConfigurationTimelineResponse getResourceConfigurationTimelineWithOptions(GetResourceConfigurationTimelineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceConfigurationTimeline"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceConfigurationTimelineResponse());
    }

    /**
      * The sample request in this topic shows you how to query the configuration timeline of the `new-bucket` resource that resides in the `cn-hangzhou` region. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows that the timestamp when the resource configuration changes is `1624961112000`. The timestamp indicates 18:05:12 on June 29, 2021 (UTC+8).
      *
      * @param request GetResourceConfigurationTimelineRequest
      * @return GetResourceConfigurationTimelineResponse
     */
    public GetResourceConfigurationTimelineResponse getResourceConfigurationTimeline(GetResourceConfigurationTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceConfigurationTimelineWithOptions(request, runtime);
    }

    /**
      * This topic provides an example to show how to query the resource relationships that are supported by the ACS::ECS::Instance resource type.
      *
      * @param request GetSupportedResourceRelationConfigRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return GetSupportedResourceRelationConfigResponse
     */
    public GetSupportedResourceRelationConfigResponse getSupportedResourceRelationConfigWithOptions(GetSupportedResourceRelationConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSupportedResourceRelationConfig"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSupportedResourceRelationConfigResponse());
    }

    /**
      * This topic provides an example to show how to query the resource relationships that are supported by the ACS::ECS::Instance resource type.
      *
      * @param request GetSupportedResourceRelationConfigRequest
      * @return GetSupportedResourceRelationConfigResponse
     */
    public GetSupportedResourceRelationConfigResponse getSupportedResourceRelationConfig(GetSupportedResourceRelationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSupportedResourceRelationConfigWithOptions(request, runtime);
    }

    /**
      * After you ignore a resource that is evaluated as incompliant by using a rule, the resource is still evaluated by using the rule, but the compliance result is Ignored.
      * This example shows how to ignore the `lb-hp3a3b4ztyfm2plgm****` incompliant resource that is evaluated by using the `cr-7e72626622af0051***` rule in the `120886317861****` member account of the `ca-5b6c626622af008f****` account group. The ID of the region where the resource resides is `cn-beijing`, and the type of the resource is `ACS::SLB::LoadBalancer`.
      *
      * @param tmpReq IgnoreAggregateEvaluationResultsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return IgnoreAggregateEvaluationResultsResponse
     */
    public IgnoreAggregateEvaluationResultsResponse ignoreAggregateEvaluationResultsWithOptions(IgnoreAggregateEvaluationResultsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IgnoreAggregateEvaluationResultsShrinkRequest request = new IgnoreAggregateEvaluationResultsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resources)) {
            request.resourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resources, "Resources", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            body.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            body.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreDate)) {
            body.put("IgnoreDate", request.ignoreDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcesShrink)) {
            body.put("Resources", request.resourcesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IgnoreAggregateEvaluationResults"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IgnoreAggregateEvaluationResultsResponse());
    }

    /**
      * After you ignore a resource that is evaluated as incompliant by using a rule, the resource is still evaluated by using the rule, but the compliance result is Ignored.
      * This example shows how to ignore the `lb-hp3a3b4ztyfm2plgm****` incompliant resource that is evaluated by using the `cr-7e72626622af0051***` rule in the `120886317861****` member account of the `ca-5b6c626622af008f****` account group. The ID of the region where the resource resides is `cn-beijing`, and the type of the resource is `ACS::SLB::LoadBalancer`.
      *
      * @param request IgnoreAggregateEvaluationResultsRequest
      * @return IgnoreAggregateEvaluationResultsResponse
     */
    public IgnoreAggregateEvaluationResultsResponse ignoreAggregateEvaluationResults(IgnoreAggregateEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ignoreAggregateEvaluationResultsWithOptions(request, runtime);
    }

    /**
      * After you ignore a resource that is evaluated as incompliant by using a rule, the resource is still evaluated by using the rule, but the compliance result is Ignored.
      * This example shows how to ignore the `lb-hp3a3b4ztyfm2plgm****` resource that is evaluated as incompliant by using the `cr-7e72626622af0051****` rule in the `100931896542****` account. The ID of the region in which the resource resides is `cn-beijing`, and the type of the resource is `ACS::SLB::LoadBalancer`.
      *
      * @param tmpReq IgnoreEvaluationResultsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return IgnoreEvaluationResultsResponse
     */
    public IgnoreEvaluationResultsResponse ignoreEvaluationResultsWithOptions(IgnoreEvaluationResultsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        IgnoreEvaluationResultsShrinkRequest request = new IgnoreEvaluationResultsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resources)) {
            request.resourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resources, "Resources", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            body.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ignoreDate)) {
            body.put("IgnoreDate", request.ignoreDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            body.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcesShrink)) {
            body.put("Resources", request.resourcesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "IgnoreEvaluationResults"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new IgnoreEvaluationResultsResponse());
    }

    /**
      * After you ignore a resource that is evaluated as incompliant by using a rule, the resource is still evaluated by using the rule, but the compliance result is Ignored.
      * This example shows how to ignore the `lb-hp3a3b4ztyfm2plgm****` resource that is evaluated as incompliant by using the `cr-7e72626622af0051****` rule in the `100931896542****` account. The ID of the region in which the resource resides is `cn-beijing`, and the type of the resource is `ACS::SLB::LoadBalancer`.
      *
      * @param request IgnoreEvaluationResultsRequest
      * @return IgnoreEvaluationResultsResponse
     */
    public IgnoreEvaluationResultsResponse ignoreEvaluationResults(IgnoreEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ignoreEvaluationResultsWithOptions(request, runtime);
    }

    /**
      * In this topic, the `ca-f632626622af0079****` account group is used as an example. The return result shows one compliance package whose ID is `cp-fdc8626622af00f9****`.
      *
      * @param request ListAggregateCompliancePacksRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAggregateCompliancePacksResponse
     */
    public ListAggregateCompliancePacksResponse listAggregateCompliancePacksWithOptions(ListAggregateCompliancePacksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
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
            new TeaPair("action", "ListAggregateCompliancePacks"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggregateCompliancePacksResponse());
    }

    /**
      * In this topic, the `ca-f632626622af0079****` account group is used as an example. The return result shows one compliance package whose ID is `cp-fdc8626622af00f9****`.
      *
      * @param request ListAggregateCompliancePacksRequest
      * @return ListAggregateCompliancePacksResponse
     */
    public ListAggregateCompliancePacksResponse listAggregateCompliancePacks(ListAggregateCompliancePacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateCompliancePacksWithOptions(request, runtime);
    }

    public ListAggregateConfigDeliveryChannelsResponse listAggregateConfigDeliveryChannelsWithOptions(ListAggregateConfigDeliveryChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelIds)) {
            query.put("DeliveryChannelIds", request.deliveryChannelIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAggregateConfigDeliveryChannels"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggregateConfigDeliveryChannelsResponse());
    }

    public ListAggregateConfigDeliveryChannelsResponse listAggregateConfigDeliveryChannels(ListAggregateConfigDeliveryChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateConfigDeliveryChannelsWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the compliance evaluation results of resources based on the `cr-888f626622af00ae****` rule in the `ca-d1e3326622af00cb****` account group. The returned result indicates that the `Bucket-test` resource is evaluated as `NON_COMPLIANT` by using the rule. The resource is an Object Storage Service (OSS) bucket.
      *
      * @param request ListAggregateConfigRuleEvaluationResultsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAggregateConfigRuleEvaluationResultsResponse
     */
    public ListAggregateConfigRuleEvaluationResultsResponse listAggregateConfigRuleEvaluationResultsWithOptions(ListAggregateConfigRuleEvaluationResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackId)) {
            query.put("CompliancePackId", request.compliancePackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.complianceType)) {
            query.put("ComplianceType", request.complianceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            query.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regions)) {
            query.put("Regions", request.regions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAccountId)) {
            query.put("ResourceAccountId", request.resourceAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            query.put("ResourceGroupIds", request.resourceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAggregateConfigRuleEvaluationResults"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggregateConfigRuleEvaluationResultsResponse());
    }

    /**
      * This topic provides an example on how to query the compliance evaluation results of resources based on the `cr-888f626622af00ae****` rule in the `ca-d1e3326622af00cb****` account group. The returned result indicates that the `Bucket-test` resource is evaluated as `NON_COMPLIANT` by using the rule. The resource is an Object Storage Service (OSS) bucket.
      *
      * @param request ListAggregateConfigRuleEvaluationResultsRequest
      * @return ListAggregateConfigRuleEvaluationResultsResponse
     */
    public ListAggregateConfigRuleEvaluationResultsResponse listAggregateConfigRuleEvaluationResults(ListAggregateConfigRuleEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateConfigRuleEvaluationResultsWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the rules in an account group whose ID is `ca-f632626622af0079****`. The returned result shows a total of one rule and two evaluated resources. The resources are both evaluated as `COMPLIANT`.
      *
      * @param request ListAggregateConfigRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAggregateConfigRulesResponse
     */
    public ListAggregateConfigRulesResponse listAggregateConfigRulesWithOptions(ListAggregateConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.complianceType)) {
            query.put("ComplianceType", request.complianceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleName)) {
            query.put("ConfigRuleName", request.configRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleState)) {
            query.put("ConfigRuleState", request.configRuleState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAggregateConfigRules"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggregateConfigRulesResponse());
    }

    /**
      * This topic provides an example on how to query the rules in an account group whose ID is `ca-f632626622af0079****`. The returned result shows a total of one rule and two evaluated resources. The resources are both evaluated as `COMPLIANT`.
      *
      * @param request ListAggregateConfigRulesRequest
      * @return ListAggregateConfigRulesResponse
     */
    public ListAggregateConfigRulesResponse listAggregateConfigRules(ListAggregateConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateConfigRulesWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query a list of resources in the `ca-c560626622af0005****` account group. The returned result shows that eight resources exist in the account group.
      *
      * @param request ListAggregateDiscoveredResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAggregateDiscoveredResourcesResponse
     */
    public ListAggregateDiscoveredResourcesResponse listAggregateDiscoveredResourcesWithOptions(ListAggregateDiscoveredResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regions)) {
            query.put("Regions", request.regions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAccountId)) {
            query.put("ResourceAccountId", request.resourceAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceDeleted)) {
            query.put("ResourceDeleted", request.resourceDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAggregateDiscoveredResources"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggregateDiscoveredResourcesResponse());
    }

    /**
      * This topic provides an example on how to query a list of resources in the `ca-c560626622af0005****` account group. The returned result shows that eight resources exist in the account group.
      *
      * @param request ListAggregateDiscoveredResourcesRequest
      * @return ListAggregateDiscoveredResourcesResponse
     */
    public ListAggregateDiscoveredResourcesResponse listAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateDiscoveredResourcesWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the remediation templates of the rule whose ID is `cr-6b7c626622af00b4****` in the account group whose ID is `ca-6b4a626622af0012****`.
      *
      * @param request ListAggregateRemediationsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAggregateRemediationsResponse
     */
    public ListAggregateRemediationsResponse listAggregateRemediationsWithOptions(ListAggregateRemediationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAggregateRemediations"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggregateRemediationsResponse());
    }

    /**
      * This topic provides an example on how to query the remediation templates of the rule whose ID is `cr-6b7c626622af00b4****` in the account group whose ID is `ca-6b4a626622af0012****`.
      *
      * @param request ListAggregateRemediationsRequest
      * @return ListAggregateRemediationsResponse
     */
    public ListAggregateRemediationsResponse listAggregateRemediations(ListAggregateRemediationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateRemediationsWithOptions(request, runtime);
    }

    /**
      * This example shows how to query the compliance evaluation result of the `23642660635396****` resource in the `ca-7f00626622af0041****` account group. The resource is a RAM user. The returned result indicates that the resource is evaluated as `NON_COMPLIANT` by using the `cr-7f7d626622af0041****` rule.
      *
      * @param request ListAggregateResourceEvaluationResultsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAggregateResourceEvaluationResultsResponse
     */
    public ListAggregateResourceEvaluationResultsResponse listAggregateResourceEvaluationResultsWithOptions(ListAggregateResourceEvaluationResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.complianceType)) {
            query.put("ComplianceType", request.complianceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
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
            new TeaPair("action", "ListAggregateResourceEvaluationResults"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggregateResourceEvaluationResultsResponse());
    }

    /**
      * This example shows how to query the compliance evaluation result of the `23642660635396****` resource in the `ca-7f00626622af0041****` account group. The resource is a RAM user. The returned result indicates that the resource is evaluated as `NON_COMPLIANT` by using the `cr-7f7d626622af0041****` rule.
      *
      * @param request ListAggregateResourceEvaluationResultsRequest
      * @return ListAggregateResourceEvaluationResultsResponse
     */
    public ListAggregateResourceEvaluationResultsResponse listAggregateResourceEvaluationResults(ListAggregateResourceEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateResourceEvaluationResultsWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the disks that are associated with an Elastic Compute Service (ECS) instance in an account group.
      *
      * @param request ListAggregateResourceRelationsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAggregateResourceRelationsResponse
     */
    public ListAggregateResourceRelationsResponse listAggregateResourceRelationsWithOptions(ListAggregateResourceRelationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationType)) {
            query.put("RelationType", request.relationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAccountId)) {
            query.put("ResourceAccountId", request.resourceAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetResourceId)) {
            query.put("TargetResourceId", request.targetResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetResourceType)) {
            query.put("TargetResourceType", request.targetResourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAggregateResourceRelations"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggregateResourceRelationsResponse());
    }

    /**
      * This topic provides an example on how to query the disks that are associated with an Elastic Compute Service (ECS) instance in an account group.
      *
      * @param request ListAggregateResourceRelationsRequest
      * @return ListAggregateResourceRelationsResponse
     */
    public ListAggregateResourceRelationsResponse listAggregateResourceRelations(ListAggregateResourceRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateResourceRelationsWithOptions(request, runtime);
    }

    /**
      * The sample request in this topic shows you how to query account groups. A maximum of 10 entries can be returned for the request. As shown in the responses, the account group returned is named as `Test_Group`, its description is `Test account group`, and it is of the `CUSTOM` type, which indicates a custom account group. The account group contains two member accounts.
      *
      * @param request ListAggregatorsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListAggregatorsResponse
     */
    public ListAggregatorsResponse listAggregatorsWithOptions(ListAggregatorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAggregators"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggregatorsResponse());
    }

    /**
      * The sample request in this topic shows you how to query account groups. A maximum of 10 entries can be returned for the request. As shown in the responses, the account group returned is named as `Test_Group`, its description is `Test account group`, and it is of the `CUSTOM` type, which indicates a custom account group. The account group contains two member accounts.
      *
      * @param request ListAggregatorsRequest
      * @return ListAggregatorsResponse
     */
    public ListAggregatorsResponse listAggregators(ListAggregatorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregatorsWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the details of a compliance package template whose ID is `ct-d254ff4e06a300cf****`. The returned result indicates that the template name is `BestPracticesForNetwork`, the template ID is `ct-d254ff4e06a300cf****`, and the ID of the managed rule of the template is `slb-servercertificate-expired-check`.
      *
      * @param request ListCompliancePackTemplatesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListCompliancePackTemplatesResponse
     */
    public ListCompliancePackTemplatesResponse listCompliancePackTemplatesWithOptions(ListCompliancePackTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackTemplateId)) {
            query.put("CompliancePackTemplateId", request.compliancePackTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCompliancePackTemplates"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCompliancePackTemplatesResponse());
    }

    /**
      * This topic provides an example on how to query the details of a compliance package template whose ID is `ct-d254ff4e06a300cf****`. The returned result indicates that the template name is `BestPracticesForNetwork`, the template ID is `ct-d254ff4e06a300cf****`, and the ID of the managed rule of the template is `slb-servercertificate-expired-check`.
      *
      * @param request ListCompliancePackTemplatesRequest
      * @return ListCompliancePackTemplatesResponse
     */
    public ListCompliancePackTemplatesResponse listCompliancePackTemplates(ListCompliancePackTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCompliancePackTemplatesWithOptions(request, runtime);
    }

    /**
      * This topic provides an example of how to query compliance packages. The return result shows the details of the `cp-fdc8626622af00f9****` compliance package.
      *
      * @param request ListCompliancePacksRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListCompliancePacksResponse
     */
    public ListCompliancePacksResponse listCompliancePacksWithOptions(ListCompliancePacksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "ListCompliancePacks"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCompliancePacksResponse());
    }

    /**
      * This topic provides an example of how to query compliance packages. The return result shows the details of the `cp-fdc8626622af00f9****` compliance package.
      *
      * @param request ListCompliancePacksRequest
      * @return ListCompliancePacksResponse
     */
    public ListCompliancePacksResponse listCompliancePacks(ListCompliancePacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCompliancePacksWithOptions(request, runtime);
    }

    public ListConfigDeliveryChannelsResponse listConfigDeliveryChannelsWithOptions(ListConfigDeliveryChannelsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelIds)) {
            query.put("DeliveryChannelIds", request.deliveryChannelIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigDeliveryChannels"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigDeliveryChannelsResponse());
    }

    public ListConfigDeliveryChannelsResponse listConfigDeliveryChannels(ListConfigDeliveryChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigDeliveryChannelsWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the compliance evaluation result of resources based on a rule whose ID is `cr-cac56457e0d900d3****`. The returned result indicates that the `i-hp3e4kvhzqn2s11t****` resource is evaluated as `NON_COMPLIANT` by using the rule. The resource is an Elastic Compute Service (ECS) instance.
      *
      * @param request ListConfigRuleEvaluationResultsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListConfigRuleEvaluationResultsResponse
     */
    public ListConfigRuleEvaluationResultsResponse listConfigRuleEvaluationResultsWithOptions(ListConfigRuleEvaluationResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigRuleEvaluationResults"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigRuleEvaluationResultsResponse());
    }

    /**
      * This topic provides an example on how to query the compliance evaluation result of resources based on a rule whose ID is `cr-cac56457e0d900d3****`. The returned result indicates that the `i-hp3e4kvhzqn2s11t****` resource is evaluated as `NON_COMPLIANT` by using the rule. The resource is an Elastic Compute Service (ECS) instance.
      *
      * @param request ListConfigRuleEvaluationResultsRequest
      * @return ListConfigRuleEvaluationResultsResponse
     */
    public ListConfigRuleEvaluationResultsResponse listConfigRuleEvaluationResults(ListConfigRuleEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigRuleEvaluationResultsWithOptions(request, runtime);
    }

    public ListConfigRulesResponse listConfigRulesWithOptions(ListConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.complianceType)) {
            query.put("ComplianceType", request.complianceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleName)) {
            query.put("ConfigRuleName", request.configRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleState)) {
            query.put("ConfigRuleState", request.configRuleState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigRules"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigRulesResponse());
    }

    public ListConfigRulesResponse listConfigRules(ListConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigRulesWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to call the ListDiscoveredResources operation to query the resources in the current Alibaba Cloud account. The returned result indicates that a total of eight resources exist in the account.
      *
      * @param request ListDiscoveredResourcesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListDiscoveredResourcesResponse
     */
    public ListDiscoveredResourcesResponse listDiscoveredResourcesWithOptions(ListDiscoveredResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regions)) {
            query.put("Regions", request.regions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceDeleted)) {
            query.put("ResourceDeleted", request.resourceDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDiscoveredResources"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDiscoveredResourcesResponse());
    }

    /**
      * This topic provides an example on how to call the ListDiscoveredResources operation to query the resources in the current Alibaba Cloud account. The returned result indicates that a total of eight resources exist in the account.
      *
      * @param request ListDiscoveredResourcesRequest
      * @return ListDiscoveredResourcesResponse
     */
    public ListDiscoveredResourcesResponse listDiscoveredResources(ListDiscoveredResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDiscoveredResourcesWithOptions(request, runtime);
    }

    /**
      * This topic describes how to query the managed rules of Alibaba Cloud CDN by using the `CDN` keyword. The returned result shows that only one managed rule exists. You can view the rule details in the result.
      *
      * @param request ListManagedRulesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListManagedRulesResponse
     */
    public ListManagedRulesResponse listManagedRulesWithOptions(ListManagedRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListManagedRules"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListManagedRulesResponse());
    }

    /**
      * This topic describes how to query the managed rules of Alibaba Cloud CDN by using the `CDN` keyword. The returned result shows that only one managed rule exists. You can view the rule details in the result.
      *
      * @param request ListManagedRulesRequest
      * @return ListManagedRulesResponse
     */
    public ListManagedRulesResponse listManagedRules(ListManagedRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listManagedRulesWithOptions(request, runtime);
    }

    public ListPreManagedRulesResponse listPreManagedRulesWithOptions(ListPreManagedRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPreManagedRulesShrinkRequest request = new ListPreManagedRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceTypes)) {
            request.resourceTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceTypes, "ResourceTypes", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypesShrink)) {
            body.put("ResourceTypes", request.resourceTypesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPreManagedRules"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPreManagedRulesResponse());
    }

    public ListPreManagedRulesResponse listPreManagedRules(ListPreManagedRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPreManagedRulesWithOptions(request, runtime);
    }

    public ListRemediationExecutionsResponse listRemediationExecutionsWithOptions(ListRemediationExecutionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            query.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executionStatus)) {
            query.put("ExecutionStatus", request.executionStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRemediationExecutions"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRemediationExecutionsResponse());
    }

    public ListRemediationExecutionsResponse listRemediationExecutions(ListRemediationExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRemediationExecutionsWithOptions(request, runtime);
    }

    /**
      * In this topic, the `oss-bucket-public-write-prohibited` managed rule is used as an example. The return result shows the details of the remediation template of the `OOS` type for the managed rule. OOS represents Operation Orchestration Service.
      *
      * @param request ListRemediationTemplatesRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListRemediationTemplatesResponse
     */
    public ListRemediationTemplatesResponse listRemediationTemplatesWithOptions(ListRemediationTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.managedRuleIdentifier)) {
            query.put("ManagedRuleIdentifier", request.managedRuleIdentifier);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remediationType)) {
            query.put("RemediationType", request.remediationType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRemediationTemplates"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRemediationTemplatesResponse());
    }

    /**
      * In this topic, the `oss-bucket-public-write-prohibited` managed rule is used as an example. The return result shows the details of the remediation template of the `OOS` type for the managed rule. OOS represents Operation Orchestration Service.
      *
      * @param request ListRemediationTemplatesRequest
      * @return ListRemediationTemplatesResponse
     */
    public ListRemediationTemplatesResponse listRemediationTemplates(ListRemediationTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRemediationTemplatesWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the remediation templates for the rule whose ID is `cr-6b7c626622af00b4****`.
      *
      * @param request ListRemediationsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListRemediationsResponse
     */
    public ListRemediationsResponse listRemediationsWithOptions(ListRemediationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configRuleIds)) {
            query.put("ConfigRuleIds", request.configRuleIds);
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
            new TeaPair("action", "ListRemediations"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRemediationsResponse());
    }

    /**
      * This topic provides an example on how to query the remediation templates for the rule whose ID is `cr-6b7c626622af00b4****`.
      *
      * @param request ListRemediationsRequest
      * @return ListRemediationsResponse
     */
    public ListRemediationsResponse listRemediations(ListRemediationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRemediationsWithOptions(request, runtime);
    }

    /**
      * In this example, the compliance evaluation result of the `23642660635396****` resource is queried and the resource is a RAM user. The returned result indicates that the resource is evaluated as `NON_COMPLIANT` by using the `cr-7f7d626622af0041****` rule.
      *
      * @param request ListResourceEvaluationResultsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListResourceEvaluationResultsResponse
     */
    public ListResourceEvaluationResultsResponse listResourceEvaluationResultsWithOptions(ListResourceEvaluationResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.complianceType)) {
            query.put("ComplianceType", request.complianceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
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
            new TeaPair("action", "ListResourceEvaluationResults"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceEvaluationResultsResponse());
    }

    /**
      * In this example, the compliance evaluation result of the `23642660635396****` resource is queried and the resource is a RAM user. The returned result indicates that the resource is evaluated as `NON_COMPLIANT` by using the `cr-7f7d626622af0041****` rule.
      *
      * @param request ListResourceEvaluationResultsRequest
      * @return ListResourceEvaluationResultsResponse
     */
    public ListResourceEvaluationResultsResponse listResourceEvaluationResults(ListResourceEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceEvaluationResultsWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to query the disks that are associated with an Elastic Compute Service (ECS) instance within the current Alibaba Cloud account.
      *
      * @param request ListResourceRelationsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return ListResourceRelationsResponse
     */
    public ListResourceRelationsResponse listResourceRelationsWithOptions(ListResourceRelationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relationType)) {
            query.put("RelationType", request.relationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetResourceId)) {
            query.put("TargetResourceId", request.targetResourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetResourceType)) {
            query.put("TargetResourceType", request.targetResourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourceRelations"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourceRelationsResponse());
    }

    /**
      * This topic provides an example on how to query the disks that are associated with an Elastic Compute Service (ECS) instance within the current Alibaba Cloud account.
      *
      * @param request ListResourceRelationsRequest
      * @return ListResourceRelationsResponse
     */
    public ListResourceRelationsResponse listResourceRelations(ListResourceRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceRelationsWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTagResourcesShrinkRequest request = new ListTagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            body.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            body.put("Tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2020-09-07"),
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

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public PutEvaluationsResponse putEvaluationsWithOptions(PutEvaluationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.deleteMode)) {
            body.put("DeleteMode", request.deleteMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.evaluations)) {
            body.put("Evaluations", request.evaluations);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resultToken)) {
            body.put("ResultToken", request.resultToken);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PutEvaluations"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PutEvaluationsResponse());
    }

    public PutEvaluationsResponse putEvaluations(PutEvaluationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putEvaluationsWithOptions(request, runtime);
    }

    /**
      * ### Prerequisites
      * One or more non-compliant resources that are evaluated based on a rule are ignored.
      * ### Usage notes
      * The sample request in this topic shows you how to re-evaluate the `lb-hp3a3b4ztyfm2plgm****` non-compliant resource that is evaluated by the `cr-7e72626622af0051***` rule in the `120886317861****` member account of the `ca-5b6c626622af008f****` account group. The ID of the region in which the resource resides is `cn-beijing`, and the type of the resource is `ACS::SLB::LoadBalancer`.
      *
      * @param tmpReq RevertAggregateEvaluationResultsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RevertAggregateEvaluationResultsResponse
     */
    public RevertAggregateEvaluationResultsResponse revertAggregateEvaluationResultsWithOptions(RevertAggregateEvaluationResultsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RevertAggregateEvaluationResultsShrinkRequest request = new RevertAggregateEvaluationResultsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resources)) {
            request.resourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resources, "Resources", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            body.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            body.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcesShrink)) {
            body.put("Resources", request.resourcesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevertAggregateEvaluationResults"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevertAggregateEvaluationResultsResponse());
    }

    /**
      * ### Prerequisites
      * One or more non-compliant resources that are evaluated based on a rule are ignored.
      * ### Usage notes
      * The sample request in this topic shows you how to re-evaluate the `lb-hp3a3b4ztyfm2plgm****` non-compliant resource that is evaluated by the `cr-7e72626622af0051***` rule in the `120886317861****` member account of the `ca-5b6c626622af008f****` account group. The ID of the region in which the resource resides is `cn-beijing`, and the type of the resource is `ACS::SLB::LoadBalancer`.
      *
      * @param request RevertAggregateEvaluationResultsRequest
      * @return RevertAggregateEvaluationResultsResponse
     */
    public RevertAggregateEvaluationResultsResponse revertAggregateEvaluationResults(RevertAggregateEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revertAggregateEvaluationResultsWithOptions(request, runtime);
    }

    /**
      * ### Prerequisites
      * One or more non-compliant resources that are evaluated by a rule are ignored.
      * ### Usage notes
      * The sample request in this topic shows you how to re-evaluate the `lb-hp3a3b4ztyfm2plgm****` non-compliant resource that is evaluated by the `cr-7e72626622af0051****` rule. The ID of the region in which the resource resides is `cn-beijing`, and the type of the resource is `ACS::SLB::LoadBalancer`.``
      *
      * @param tmpReq RevertEvaluationResultsRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return RevertEvaluationResultsResponse
     */
    public RevertEvaluationResultsResponse revertEvaluationResultsWithOptions(RevertEvaluationResultsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        RevertEvaluationResultsShrinkRequest request = new RevertEvaluationResultsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resources)) {
            request.resourcesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resources, "Resources", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            body.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcesShrink)) {
            body.put("Resources", request.resourcesShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevertEvaluationResults"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevertEvaluationResultsResponse());
    }

    /**
      * ### Prerequisites
      * One or more non-compliant resources that are evaluated by a rule are ignored.
      * ### Usage notes
      * The sample request in this topic shows you how to re-evaluate the `lb-hp3a3b4ztyfm2plgm****` non-compliant resource that is evaluated by the `cr-7e72626622af0051****` rule. The ID of the region in which the resource resides is `cn-beijing`, and the type of the resource is `ACS::SLB::LoadBalancer`.``
      *
      * @param request RevertEvaluationResultsRequest
      * @return RevertEvaluationResultsResponse
     */
    public RevertEvaluationResultsResponse revertEvaluationResults(RevertEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revertEvaluationResultsWithOptions(request, runtime);
    }

    /**
      * > After you call this operation, the compliance evaluation is performed only once. To query the compliance evaluation results returned by the rule, call the ListAggregateConfigRuleEvaluationResults operation. For more information, see [ListAggregateConfigRuleEvaluationResults](~~265979~~).
      * The sample request in this topic shows how to use the `cr-c169626622af009f****` rule in the `ca-3a58626622af0005****` account group to evaluate resources.
      *
      * @param request StartAggregateConfigRuleEvaluationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return StartAggregateConfigRuleEvaluationResponse
     */
    public StartAggregateConfigRuleEvaluationResponse startAggregateConfigRuleEvaluationWithOptions(StartAggregateConfigRuleEvaluationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackId)) {
            query.put("CompliancePackId", request.compliancePackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            query.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revertEvaluation)) {
            query.put("RevertEvaluation", request.revertEvaluation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAggregateConfigRuleEvaluation"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartAggregateConfigRuleEvaluationResponse());
    }

    /**
      * > After you call this operation, the compliance evaluation is performed only once. To query the compliance evaluation results returned by the rule, call the ListAggregateConfigRuleEvaluationResults operation. For more information, see [ListAggregateConfigRuleEvaluationResults](~~265979~~).
      * The sample request in this topic shows how to use the `cr-c169626622af009f****` rule in the `ca-3a58626622af0005****` account group to evaluate resources.
      *
      * @param request StartAggregateConfigRuleEvaluationRequest
      * @return StartAggregateConfigRuleEvaluationResponse
     */
    public StartAggregateConfigRuleEvaluationResponse startAggregateConfigRuleEvaluation(StartAggregateConfigRuleEvaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAggregateConfigRuleEvaluationWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to manually perform a remediation operation by using the rule whose ID is `cr-6b7c626622af00b4****` in the account group whose ID is `ca-6b4a626622af0012****`. The returned result shows that the manual execution is successful.
      *
      * @param request StartAggregateRemediationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return StartAggregateRemediationResponse
     */
    public StartAggregateRemediationResponse startAggregateRemediationWithOptions(StartAggregateRemediationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            query.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAccountId)) {
            query.put("ResourceAccountId", request.resourceAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartAggregateRemediation"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartAggregateRemediationResponse());
    }

    /**
      * This topic provides an example on how to manually perform a remediation operation by using the rule whose ID is `cr-6b7c626622af00b4****` in the account group whose ID is `ca-6b4a626622af0012****`. The returned result shows that the manual execution is successful.
      *
      * @param request StartAggregateRemediationRequest
      * @return StartAggregateRemediationResponse
     */
    public StartAggregateRemediationResponse startAggregateRemediation(StartAggregateRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAggregateRemediationWithOptions(request, runtime);
    }

    public StartConfigRuleEvaluationResponse startConfigRuleEvaluationWithOptions(StartConfigRuleEvaluationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackId)) {
            query.put("CompliancePackId", request.compliancePackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            query.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.revertEvaluation)) {
            query.put("RevertEvaluation", request.revertEvaluation);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartConfigRuleEvaluation"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartConfigRuleEvaluationResponse());
    }

    public StartConfigRuleEvaluationResponse startConfigRuleEvaluation(StartConfigRuleEvaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startConfigRuleEvaluationWithOptions(request, runtime);
    }

    public StartConfigurationRecorderResponse startConfigurationRecorderWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartConfigurationRecorder"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartConfigurationRecorderResponse());
    }

    public StartConfigurationRecorderResponse startConfigurationRecorder() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startConfigurationRecorderWithOptions(runtime);
    }

    /**
      * This topic provides an example on how to perform a remediation operation by using the rule whose ID is `cr-8a973ac2e2be00a2****`. The returned result shows that the manual execution is successful.
      *
      * @param request StartRemediationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return StartRemediationResponse
     */
    public StartRemediationResponse startRemediationWithOptions(StartRemediationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            query.put("ConfigRuleId", request.configRuleId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartRemediation"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartRemediationResponse());
    }

    /**
      * This topic provides an example on how to perform a remediation operation by using the rule whose ID is `cr-8a973ac2e2be00a2****`. The returned result shows that the manual execution is successful.
      *
      * @param request StartRemediationRequest
      * @return StartRemediationResponse
     */
    public StartRemediationResponse startRemediation(StartRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRemediationWithOptions(request, runtime);
    }

    public StopConfigurationRecorderResponse stopConfigurationRecorderWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopConfigurationRecorder"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopConfigurationRecorderResponse());
    }

    public StopConfigurationRecorderResponse stopConfigurationRecorder() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopConfigurationRecorderWithOptions(runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        TagResourcesShrinkRequest request = new TagResourcesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            body.put("Tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2020-09-07"),
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

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            body.put("All", request.all);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            body.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2020-09-07"),
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

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to change the value of a parameter for a managed rule whose ID is `eip-bandwidth-limit` to `20`. The managed rule is included in the `cp-fdc8626622af00f9****` compliance package in the `ca-f632626622af0079****` account group.
      *
      * @param tmpReq UpdateAggregateCompliancePackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAggregateCompliancePackResponse
     */
    public UpdateAggregateCompliancePackResponse updateAggregateCompliancePackWithOptions(UpdateAggregateCompliancePackRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAggregateCompliancePackShrinkRequest request = new UpdateAggregateCompliancePackShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configRules)) {
            request.configRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configRules, "ConfigRules", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            body.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackId)) {
            body.put("CompliancePackId", request.compliancePackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackName)) {
            body.put("CompliancePackName", request.compliancePackName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRulesShrink)) {
            body.put("ConfigRules", request.configRulesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            body.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            body.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            body.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyScope)) {
            body.put("TagKeyScope", request.tagKeyScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagValueScope)) {
            body.put("TagValueScope", request.tagValueScope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAggregateCompliancePack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAggregateCompliancePackResponse());
    }

    /**
      * This topic provides an example on how to change the value of a parameter for a managed rule whose ID is `eip-bandwidth-limit` to `20`. The managed rule is included in the `cp-fdc8626622af00f9****` compliance package in the `ca-f632626622af0079****` account group.
      *
      * @param request UpdateAggregateCompliancePackRequest
      * @return UpdateAggregateCompliancePackResponse
     */
    public UpdateAggregateCompliancePackResponse updateAggregateCompliancePack(UpdateAggregateCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAggregateCompliancePackWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to disable a delivery channel in an account group. The ID of the account group is `ca-a4e5626622af0079****`, and the ID of the delivery channel is `cdc-8e45ff4e06a3a8****`. The Status parameter is set to `0`. After the delivery channel is disabled, Cloud Config retains the most recent delivery configuration and stops resource data delivery.
      *
      * @param request UpdateAggregateConfigDeliveryChannelRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAggregateConfigDeliveryChannelResponse
     */
    public UpdateAggregateConfigDeliveryChannelResponse updateAggregateConfigDeliveryChannelWithOptions(UpdateAggregateConfigDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationItemChangeNotification)) {
            query.put("ConfigurationItemChangeNotification", request.configurationItemChangeNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationSnapshot)) {
            query.put("ConfigurationSnapshot", request.configurationSnapshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelCondition)) {
            query.put("DeliveryChannelCondition", request.deliveryChannelCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            query.put("DeliveryChannelId", request.deliveryChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelName)) {
            query.put("DeliveryChannelName", request.deliveryChannelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelTargetArn)) {
            query.put("DeliveryChannelTargetArn", request.deliveryChannelTargetArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliverySnapshotTime)) {
            query.put("DeliverySnapshotTime", request.deliverySnapshotTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonCompliantNotification)) {
            query.put("NonCompliantNotification", request.nonCompliantNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversizedDataOSSTargetArn)) {
            query.put("OversizedDataOSSTargetArn", request.oversizedDataOSSTargetArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAggregateConfigDeliveryChannel"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAggregateConfigDeliveryChannelResponse());
    }

    /**
      * This topic provides an example on how to disable a delivery channel in an account group. The ID of the account group is `ca-a4e5626622af0079****`, and the ID of the delivery channel is `cdc-8e45ff4e06a3a8****`. The Status parameter is set to `0`. After the delivery channel is disabled, Cloud Config retains the most recent delivery configuration and stops resource data delivery.
      *
      * @param request UpdateAggregateConfigDeliveryChannelRequest
      * @return UpdateAggregateConfigDeliveryChannelResponse
     */
    public UpdateAggregateConfigDeliveryChannelResponse updateAggregateConfigDeliveryChannel(UpdateAggregateConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAggregateConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
      * The sample request in this topic shows you how to change the risk level specified for the `cr-4e3d626622af0080****` managed rule to `3`, which indicates low risk level, in the `ca-a4e5626622af0079****` account group.
      *
      * @param tmpReq UpdateAggregateConfigRuleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAggregateConfigRuleResponse
     */
    public UpdateAggregateConfigRuleResponse updateAggregateConfigRuleWithOptions(UpdateAggregateConfigRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAggregateConfigRuleShrinkRequest request = new UpdateAggregateConfigRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputParameters)) {
            request.inputParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputParameters, "InputParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceTypesScope)) {
            request.resourceTypesScopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceTypesScope, "ResourceTypesScope", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            body.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            body.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleName)) {
            body.put("ConfigRuleName", request.configRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleTriggerTypes)) {
            body.put("ConfigRuleTriggerTypes", request.configRuleTriggerTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeAccountIdsScope)) {
            body.put("ExcludeAccountIdsScope", request.excludeAccountIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeFolderIdsScope)) {
            body.put("ExcludeFolderIdsScope", request.excludeFolderIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.folderIdsScope)) {
            body.put("FolderIdsScope", request.folderIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputParametersShrink)) {
            body.put("InputParameters", request.inputParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumExecutionFrequency)) {
            body.put("MaximumExecutionFrequency", request.maximumExecutionFrequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            body.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            body.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypesScopeShrink)) {
            body.put("ResourceTypesScope", request.resourceTypesScopeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            body.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyLogicScope)) {
            body.put("TagKeyLogicScope", request.tagKeyLogicScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyScope)) {
            body.put("TagKeyScope", request.tagKeyScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagValueScope)) {
            body.put("TagValueScope", request.tagValueScope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAggregateConfigRule"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAggregateConfigRuleResponse());
    }

    /**
      * The sample request in this topic shows you how to change the risk level specified for the `cr-4e3d626622af0080****` managed rule to `3`, which indicates low risk level, in the `ca-a4e5626622af0079****` account group.
      *
      * @param request UpdateAggregateConfigRuleRequest
      * @return UpdateAggregateConfigRuleResponse
     */
    public UpdateAggregateConfigRuleResponse updateAggregateConfigRule(UpdateAggregateConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAggregateConfigRuleWithOptions(request, runtime);
    }

    /**
      * This topic describes how to change the execution mode of the `crr-909ba2d4716700eb****` remediation setting for a rule in the `ca-6b4a626622af0012****` account group to `AUTO_EXECUTION`, which specifies automatic remediation. This topic also provides a sample request.
      *
      * @param request UpdateAggregateRemediationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAggregateRemediationResponse
     */
    public UpdateAggregateRemediationResponse updateAggregateRemediationWithOptions(UpdateAggregateRemediationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            body.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeType)) {
            body.put("InvokeType", request.invokeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remediationId)) {
            body.put("RemediationId", request.remediationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remediationTemplateId)) {
            body.put("RemediationTemplateId", request.remediationTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remediationType)) {
            body.put("RemediationType", request.remediationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAggregateRemediation"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAggregateRemediationResponse());
    }

    /**
      * This topic describes how to change the execution mode of the `crr-909ba2d4716700eb****` remediation setting for a rule in the `ca-6b4a626622af0012****` account group to `AUTO_EXECUTION`, which specifies automatic remediation. This topic also provides a sample request.
      *
      * @param request UpdateAggregateRemediationRequest
      * @return UpdateAggregateRemediationResponse
     */
    public UpdateAggregateRemediationResponse updateAggregateRemediation(UpdateAggregateRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAggregateRemediationWithOptions(request, runtime);
    }

    /**
      * The sample request in this topic shows you how to add a member account to the account group whose ID is `ca-dacf86d8314e00eb****`. The member account ID is `173808452267****` and the member account name is `Tony`. The member account belongs to `ResourceDirectory`.
      *
      * @param tmpReq UpdateAggregatorRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateAggregatorResponse
     */
    public UpdateAggregatorResponse updateAggregatorWithOptions(UpdateAggregatorRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAggregatorShrinkRequest request = new UpdateAggregatorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aggregatorAccounts)) {
            request.aggregatorAccountsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aggregatorAccounts, "AggregatorAccounts", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorAccountsShrink)) {
            body.put("AggregatorAccounts", request.aggregatorAccountsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            body.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorName)) {
            body.put("AggregatorName", request.aggregatorName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAggregator"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAggregatorResponse());
    }

    /**
      * The sample request in this topic shows you how to add a member account to the account group whose ID is `ca-dacf86d8314e00eb****`. The member account ID is `173808452267****` and the member account name is `Tony`. The member account belongs to `ResourceDirectory`.
      *
      * @param request UpdateAggregatorRequest
      * @return UpdateAggregatorResponse
     */
    public UpdateAggregatorResponse updateAggregator(UpdateAggregatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAggregatorWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to change the value of a parameter for a managed rule whose ID is `eip-bandwidth-limit` to `20`. The managed rule is included in the `cp-a8a8626622af0082****` compliance package.
      *
      * @param tmpReq UpdateCompliancePackRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateCompliancePackResponse
     */
    public UpdateCompliancePackResponse updateCompliancePackWithOptions(UpdateCompliancePackRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCompliancePackShrinkRequest request = new UpdateCompliancePackShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configRules)) {
            request.configRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configRules, "ConfigRules", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackId)) {
            body.put("CompliancePackId", request.compliancePackId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackName)) {
            body.put("CompliancePackName", request.compliancePackName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRulesShrink)) {
            body.put("ConfigRules", request.configRulesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            body.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            body.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            body.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyScope)) {
            body.put("TagKeyScope", request.tagKeyScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagValueScope)) {
            body.put("TagValueScope", request.tagValueScope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCompliancePack"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCompliancePackResponse());
    }

    /**
      * This topic provides an example on how to change the value of a parameter for a managed rule whose ID is `eip-bandwidth-limit` to `20`. The managed rule is included in the `cp-a8a8626622af0082****` compliance package.
      *
      * @param request UpdateCompliancePackRequest
      * @return UpdateCompliancePackResponse
     */
    public UpdateCompliancePackResponse updateCompliancePack(UpdateCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCompliancePackWithOptions(request, runtime);
    }

    /**
      * In this example, a delivery channel is disabled. The ID of the delivery channel is `cdc-8e45ff4e06a3a8****```. The Status parameter is set to 0. After the delivery channel is disabled, Cloud Config retains the most recent delivery configuration and stops the delivery of resource data.
      *
      * @param request UpdateConfigDeliveryChannelRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateConfigDeliveryChannelResponse
     */
    public UpdateConfigDeliveryChannelResponse updateConfigDeliveryChannelWithOptions(UpdateConfigDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationItemChangeNotification)) {
            query.put("ConfigurationItemChangeNotification", request.configurationItemChangeNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationSnapshot)) {
            query.put("ConfigurationSnapshot", request.configurationSnapshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelCondition)) {
            query.put("DeliveryChannelCondition", request.deliveryChannelCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            query.put("DeliveryChannelId", request.deliveryChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelName)) {
            query.put("DeliveryChannelName", request.deliveryChannelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelTargetArn)) {
            query.put("DeliveryChannelTargetArn", request.deliveryChannelTargetArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliverySnapshotTime)) {
            query.put("DeliverySnapshotTime", request.deliverySnapshotTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonCompliantNotification)) {
            query.put("NonCompliantNotification", request.nonCompliantNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversizedDataOSSTargetArn)) {
            query.put("OversizedDataOSSTargetArn", request.oversizedDataOSSTargetArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConfigDeliveryChannel"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConfigDeliveryChannelResponse());
    }

    /**
      * In this example, a delivery channel is disabled. The ID of the delivery channel is `cdc-8e45ff4e06a3a8****```. The Status parameter is set to 0. After the delivery channel is disabled, Cloud Config retains the most recent delivery configuration and stops the delivery of resource data.
      *
      * @param request UpdateConfigDeliveryChannelRequest
      * @return UpdateConfigDeliveryChannelResponse
     */
    public UpdateConfigDeliveryChannelResponse updateConfigDeliveryChannel(UpdateConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
      * This topic provides an example on how to change the risk level of a managed rule whose ID is `cr-a260626622af0005****` to `3` (low risk level).
      *
      * @param tmpReq UpdateConfigRuleRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateConfigRuleResponse
     */
    public UpdateConfigRuleResponse updateConfigRuleWithOptions(UpdateConfigRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateConfigRuleShrinkRequest request = new UpdateConfigRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputParameters)) {
            request.inputParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputParameters, "InputParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceTypesScope)) {
            request.resourceTypesScopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceTypesScope, "ResourceTypesScope", "simple");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            body.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleName)) {
            body.put("ConfigRuleName", request.configRuleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleTriggerTypes)) {
            body.put("ConfigRuleTriggerTypes", request.configRuleTriggerTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inputParametersShrink)) {
            body.put("InputParameters", request.inputParametersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maximumExecutionFrequency)) {
            body.put("MaximumExecutionFrequency", request.maximumExecutionFrequency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            body.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            body.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypesScopeShrink)) {
            body.put("ResourceTypesScope", request.resourceTypesScopeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            body.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyLogicScope)) {
            body.put("TagKeyLogicScope", request.tagKeyLogicScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagKeyScope)) {
            body.put("TagKeyScope", request.tagKeyScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagValueScope)) {
            body.put("TagValueScope", request.tagValueScope);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConfigRule"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConfigRuleResponse());
    }

    /**
      * This topic provides an example on how to change the risk level of a managed rule whose ID is `cr-a260626622af0005****` to `3` (low risk level).
      *
      * @param request UpdateConfigRuleRequest
      * @return UpdateConfigRuleResponse
     */
    public UpdateConfigRuleResponse updateConfigRule(UpdateConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConfigRuleWithOptions(request, runtime);
    }

    public UpdateConfigurationRecorderResponse updateConfigurationRecorderWithOptions(UpdateConfigurationRecorderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            body.put("ResourceTypes", request.resourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateConfigurationRecorder"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateConfigurationRecorderResponse());
    }

    public UpdateConfigurationRecorderResponse updateConfigurationRecorder(UpdateConfigurationRecorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConfigurationRecorderWithOptions(request, runtime);
    }

    /**
      * @deprecated : UpdateDeliveryChannel is deprecated, please use Config::2020-09-07::UpdateConfigDeliveryChannel,Config::2020-09-07::UpdateAggregateConfigDeliveryChannel instead.
      * This topic provides an example on how to change the status of the delivery channel whose ID is `cdc-8e45ff4e06a3a8****` to 0, which indicates that the delivery channel is disabled. After the delivery channel is disabled, Cloud Config retains the last delivery configuration and stops resource data delivery.
      *
      * @param request UpdateDeliveryChannelRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateDeliveryChannelResponse
     */
    // Deprecated
    public UpdateDeliveryChannelResponse updateDeliveryChannelWithOptions(UpdateDeliveryChannelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationItemChangeNotification)) {
            body.put("ConfigurationItemChangeNotification", request.configurationItemChangeNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configurationSnapshot)) {
            body.put("ConfigurationSnapshot", request.configurationSnapshot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelAssumeRoleArn)) {
            body.put("DeliveryChannelAssumeRoleArn", request.deliveryChannelAssumeRoleArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelCondition)) {
            body.put("DeliveryChannelCondition", request.deliveryChannelCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelId)) {
            body.put("DeliveryChannelId", request.deliveryChannelId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelName)) {
            body.put("DeliveryChannelName", request.deliveryChannelName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.deliveryChannelTargetArn)) {
            body.put("DeliveryChannelTargetArn", request.deliveryChannelTargetArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nonCompliantNotification)) {
            body.put("NonCompliantNotification", request.nonCompliantNotification);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oversizedDataOSSTargetArn)) {
            body.put("OversizedDataOSSTargetArn", request.oversizedDataOSSTargetArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDeliveryChannel"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDeliveryChannelResponse());
    }

    /**
      * @deprecated : UpdateDeliveryChannel is deprecated, please use Config::2020-09-07::UpdateConfigDeliveryChannel,Config::2020-09-07::UpdateAggregateConfigDeliveryChannel instead.
      * This topic provides an example on how to change the status of the delivery channel whose ID is `cdc-8e45ff4e06a3a8****` to 0, which indicates that the delivery channel is disabled. After the delivery channel is disabled, Cloud Config retains the last delivery configuration and stops resource data delivery.
      *
      * @param request UpdateDeliveryChannelRequest
      * @return UpdateDeliveryChannelResponse
     */
    // Deprecated
    public UpdateDeliveryChannelResponse updateDeliveryChannel(UpdateDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDeliveryChannelWithOptions(request, runtime);
    }

    public UpdateIntegratedServiceStatusResponse updateIntegratedServiceStatusWithOptions(UpdateIntegratedServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            body.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateIntegratedServiceStatus"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateIntegratedServiceStatusResponse());
    }

    public UpdateIntegratedServiceStatusResponse updateIntegratedServiceStatus(UpdateIntegratedServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIntegratedServiceStatusWithOptions(request, runtime);
    }

    /**
      * This topic describes how to change the execution mode of the `crr-909ba2d4716700eb****` remediation setting to `AUTO_EXECUTION`, which specifies automatic remediation. This topic also provides a sample request.
      *
      * @param request UpdateRemediationRequest
      * @param runtime runtime options for this request RuntimeOptions
      * @return UpdateRemediationResponse
     */
    public UpdateRemediationResponse updateRemediationWithOptions(UpdateRemediationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            body.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.invokeType)) {
            body.put("InvokeType", request.invokeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.params)) {
            body.put("Params", request.params);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remediationId)) {
            body.put("RemediationId", request.remediationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remediationTemplateId)) {
            body.put("RemediationTemplateId", request.remediationTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remediationType)) {
            body.put("RemediationType", request.remediationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceType)) {
            body.put("SourceType", request.sourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRemediation"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRemediationResponse());
    }

    /**
      * This topic describes how to change the execution mode of the `crr-909ba2d4716700eb****` remediation setting to `AUTO_EXECUTION`, which specifies automatic remediation. This topic also provides a sample request.
      *
      * @param request UpdateRemediationRequest
      * @return UpdateRemediationResponse
     */
    public UpdateRemediationResponse updateRemediation(UpdateRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRemediationWithOptions(request, runtime);
    }
}
