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
     * <b>description</b> :
     * <p>Enables one or more rules in an account group. After a rule is enabled, the rule continues to automatically evaluate resources based on the trigger mechanism.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables one or more rules in an account group. After a rule is enabled, the rule continues to automatically evaluate resources based on the trigger mechanism.</p>
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
     * <b>description</b> :
     * <p>Enables one or more rules in an account group. After a rule is enabled, the rule continues to automatically evaluate resources based on the trigger mechanism.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables one or more rules in an account group. After a rule is enabled, the rule continues to automatically evaluate resources based on the trigger mechanism.</p>
     * 
     * @param request ActiveAggregateConfigRulesRequest
     * @return ActiveAggregateConfigRulesResponse
     */
    public ActiveAggregateConfigRulesResponse activeAggregateConfigRules(ActiveAggregateConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activeAggregateConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The rule is in the <code>INACTIVE</code> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a rule in Cloud Config. After a rule is enabled, Cloud Config automatically evaluates the compliance of a resource based on the trigger mechanism of the rule.</p>
     * 
     * @param request ActiveConfigRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ActiveConfigRulesResponse
     */
    public ActiveConfigRulesResponse activeConfigRulesWithOptions(ActiveConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The rule is in the <code>INACTIVE</code> state.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a rule in Cloud Config. After a rule is enabled, Cloud Config automatically evaluates the compliance of a resource based on the trigger mechanism of the rule.</p>
     * 
     * @param request ActiveConfigRulesRequest
     * @return ActiveConfigRulesResponse
     */
    public ActiveConfigRulesResponse activeConfigRules(ActiveConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activeConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to add the <code>cr-6cc4626622af00e7****</code> rule in the <code>ca-75b4626622af00c3****</code> account group to the <code>cp-5bb1626622af00bd****</code> compliance package.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more rules in an account group to a compliance package.</p>
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
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to add the <code>cr-6cc4626622af00e7****</code> rule in the <code>ca-75b4626622af00c3****</code> account group to the <code>cp-5bb1626622af00bd****</code> compliance package.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more rules in an account group to a compliance package.</p>
     * 
     * @param request AttachAggregateConfigRuleToCompliancePackRequest
     * @return AttachAggregateConfigRuleToCompliancePackResponse
     */
    public AttachAggregateConfigRuleToCompliancePackResponse attachAggregateConfigRuleToCompliancePack(AttachAggregateConfigRuleToCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachAggregateConfigRuleToCompliancePackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to add the <code>cr-6cc4626622af00e7****</code> rule to the <code>cp-5bb1626622af00bd****</code> compliance package.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more rules to a compliance package.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to add the <code>cr-6cc4626622af00e7****</code> rule to the <code>cp-5bb1626622af00bd****</code> compliance package.</p>
     * 
     * <b>summary</b> : 
     * <p>Adds one or more rules to a compliance package.</p>
     * 
     * @param request AttachConfigRuleToCompliancePackRequest
     * @return AttachConfigRuleToCompliancePackResponse
     */
    public AttachConfigRuleToCompliancePackResponse attachConfigRuleToCompliancePack(AttachConfigRuleToCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachConfigRuleToCompliancePackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Replicates compliance packages.</p>
     * 
     * @param request CopyCompliancePacksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyCompliancePacksResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Replicates compliance packages.</p>
     * 
     * @param request CopyCompliancePacksRequest
     * @return CopyCompliancePacksResponse
     */
    public CopyCompliancePacksResponse copyCompliancePacks(CopyCompliancePacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyCompliancePacksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Replicates rules.</p>
     * 
     * @param request CopyConfigRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CopyConfigRulesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Replicates rules.</p>
     * 
     * @param request CopyConfigRulesRequest
     * @return CopyConfigRulesResponse
     */
    public CopyConfigRulesResponse copyConfigRules(CopyConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.copyConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a downloadable resource file for the current Alibaba Cloud account.</p>
     * 
     * @param request CreateAdvancedSearchFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAdvancedSearchFileResponse
     */
    public CreateAdvancedSearchFileResponse createAdvancedSearchFileWithOptions(CreateAdvancedSearchFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            query.put("Sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAdvancedSearchFile"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAdvancedSearchFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a downloadable resource file for the current Alibaba Cloud account.</p>
     * 
     * @param request CreateAdvancedSearchFileRequest
     * @return CreateAdvancedSearchFileResponse
     */
    public CreateAdvancedSearchFileResponse createAdvancedSearchFile(CreateAdvancedSearchFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAdvancedSearchFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a downloadable resource file for an account group whose ID is <code>ca-edd3626622af00b3****</code>. The resource file includes all the ECS instances in the account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a downloadable resource file for an account group.</p>
     * 
     * @param request CreateAggregateAdvancedSearchFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAggregateAdvancedSearchFileResponse
     */
    public CreateAggregateAdvancedSearchFileResponse createAggregateAdvancedSearchFileWithOptions(CreateAggregateAdvancedSearchFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            query.put("Sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAggregateAdvancedSearchFile"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAggregateAdvancedSearchFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a downloadable resource file for an account group whose ID is <code>ca-edd3626622af00b3****</code>. The resource file includes all the ECS instances in the account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a downloadable resource file for an account group.</p>
     * 
     * @param request CreateAggregateAdvancedSearchFileRequest
     * @return CreateAggregateAdvancedSearchFileResponse
     */
    public CreateAggregateAdvancedSearchFileResponse createAggregateAdvancedSearchFile(CreateAggregateAdvancedSearchFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAggregateAdvancedSearchFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a compliance package for the account group <code>ca-f632626622af0079****</code> by using the compliance package template <code>ClassifiedProtectionPreCheck</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a compliance package for an account group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.excludeRegionIdsScope)) {
            body.put("ExcludeRegionIdsScope", request.excludeRegionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceGroupIdsScope)) {
            body.put("ExcludeResourceGroupIdsScope", request.excludeResourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeTagsScope)) {
            bodyFlat.put("ExcludeTagsScope", request.excludeTagsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            body.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            body.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsScope)) {
            body.put("ResourceIdsScope", request.resourceIdsScope);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagsScope)) {
            bodyFlat.put("TagsScope", request.tagsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateContent)) {
            body.put("TemplateContent", request.templateContent);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <b>description</b> :
     * <p>This topic provides an example on how to create a compliance package for the account group <code>ca-f632626622af0079****</code> by using the compliance package template <code>ClassifiedProtectionPreCheck</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a compliance package for an account group.</p>
     * 
     * @param request CreateAggregateCompliancePackRequest
     * @return CreateAggregateCompliancePackResponse
     */
    public CreateAggregateCompliancePackResponse createAggregateCompliancePack(CreateAggregateCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAggregateCompliancePackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, a delivery channel is created for an account group. The ID of the account group is <code>ca-a4e5626622af0079****</code>. The type of the delivery channel is <code>OSS</code> and the Alibaba Cloud Resource Name (ARN) of the delivery destination is <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>. The result indicates that the delivery channel is created. The ID of the delivery channel is <code>cdc-8e45ff4e06a3a8****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a delivery channel for an account group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.compliantSnapshot)) {
            query.put("CompliantSnapshot", request.compliantSnapshot);
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
     * <b>description</b> :
     * <p>In this example, a delivery channel is created for an account group. The ID of the account group is <code>ca-a4e5626622af0079****</code>. The type of the delivery channel is <code>OSS</code> and the Alibaba Cloud Resource Name (ARN) of the delivery destination is <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>. The result indicates that the delivery channel is created. The ID of the delivery channel is <code>cdc-8e45ff4e06a3a8****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a delivery channel for an account group.</p>
     * 
     * @param request CreateAggregateConfigDeliveryChannelRequest
     * @return CreateAggregateConfigDeliveryChannelResponse
     */
    public CreateAggregateConfigDeliveryChannelResponse createAggregateConfigDeliveryChannel(CreateAggregateConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAggregateConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Limits</h3>
     * <p>You can create up to 200 rules for each management account.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example on how to create a rule based on the required-tags managed rule in the <code>ca-a4e5626622af0079****</code> account group. The returned result shows that the rule is created and its ID is <code>cr-4e3d626622af0080****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a rule for an account group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceNameScope)) {
            query.put("ResourceNameScope", request.resourceNameScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIdsScope)) {
            body.put("AccountIdsScope", request.accountIdsScope);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.excludeRegionIdsScope)) {
            body.put("ExcludeRegionIdsScope", request.excludeRegionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceGroupIdsScope)) {
            body.put("ExcludeResourceGroupIdsScope", request.excludeResourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeTagsScope)) {
            bodyFlat.put("ExcludeTagsScope", request.excludeTagsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendContent)) {
            body.put("ExtendContent", request.extendContent);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsScope)) {
            body.put("ResourceIdsScope", request.resourceIdsScope);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagsScope)) {
            bodyFlat.put("TagsScope", request.tagsScope);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <b>description</b> :
     * <h3>Limits</h3>
     * <p>You can create up to 200 rules for each management account.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example on how to create a rule based on the required-tags managed rule in the <code>ca-a4e5626622af0079****</code> account group. The returned result shows that the rule is created and its ID is <code>cr-4e3d626622af0080****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a rule for an account group.</p>
     * 
     * @param request CreateAggregateConfigRuleRequest
     * @return CreateAggregateConfigRuleResponse
     */
    public CreateAggregateConfigRuleResponse createAggregateConfigRule(CreateAggregateConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAggregateConfigRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a remediation template for the rule whose ID is <code>cr-6b7c626622af00b4****</code> in the account group whose ID is <code>ca-6b4a626622af0012****</code>. The returned result shows that a remediation template is created and the ID of the remediation template is <code>crr-909ba2d4716700eb****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a remediation template for a rule in an account group.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to create a remediation template for the rule whose ID is <code>cr-6b7c626622af00b4****</code> in the account group whose ID is <code>ca-6b4a626622af0012****</code>. The returned result shows that a remediation template is created and the ID of the remediation template is <code>crr-909ba2d4716700eb****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a remediation template for a rule in an account group.</p>
     * 
     * @param request CreateAggregateRemediationRequest
     * @return CreateAggregateRemediationResponse
     */
    public CreateAggregateRemediationResponse createAggregateRemediation(CreateAggregateRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAggregateRemediationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Each management account can create a maximum of five account groups. Each account group can contain a maximum of 200 member accounts.
     * Cloud Config supports the following types of account groups:</p>
     * <ul>
     * <li>Global account group: The global account group contains all the member accounts that are added to the resource directory. A management account can create only one global account group.</li>
     * <li>Custom account group: If you create a custom account group, you must manually add all or specific member accounts from the resource directory to the custom account group.
     * This topic provides an example on how to create an account group of the <code>CUSTOM</code> type. The custom account group is named <code>Test_Group</code>, and its description is <code>Test account group</code>. The custom account group contains the following two member accounts:</li>
     * <li>Member account ID: <code>171322098523****</code>. Member account name: <code>Alice</code>.</li>
     * <li>Member account ID: <code>100532098349****</code>. Member account name: <code>Tom</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an account group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <b>description</b> :
     * <p>Each management account can create a maximum of five account groups. Each account group can contain a maximum of 200 member accounts.
     * Cloud Config supports the following types of account groups:</p>
     * <ul>
     * <li>Global account group: The global account group contains all the member accounts that are added to the resource directory. A management account can create only one global account group.</li>
     * <li>Custom account group: If you create a custom account group, you must manually add all or specific member accounts from the resource directory to the custom account group.
     * This topic provides an example on how to create an account group of the <code>CUSTOM</code> type. The custom account group is named <code>Test_Group</code>, and its description is <code>Test account group</code>. The custom account group contains the following two member accounts:</li>
     * <li>Member account ID: <code>171322098523****</code>. Member account name: <code>Alice</code>.</li>
     * <li>Member account ID: <code>100532098349****</code>. Member account name: <code>Tom</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an account group.</p>
     * 
     * @param request CreateAggregatorRequest
     * @return CreateAggregatorResponse
     */
    public CreateAggregatorResponse createAggregator(CreateAggregatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAggregatorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Each ordinary account can create up to five compliance packages.
     * This topic provides an example on how to create a compliance package named ClassifiedProtectionPreCheck. The compliance package contains a managed rule named <code>eip-bandwidth-limit</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a compliance package for the current account.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.excludeRegionIdsScope)) {
            body.put("ExcludeRegionIdsScope", request.excludeRegionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceGroupIdsScope)) {
            body.put("ExcludeResourceGroupIdsScope", request.excludeResourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeTagsScope)) {
            bodyFlat.put("ExcludeTagsScope", request.excludeTagsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            body.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            body.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsScope)) {
            body.put("ResourceIdsScope", request.resourceIdsScope);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagsScope)) {
            bodyFlat.put("TagsScope", request.tagsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateContent)) {
            body.put("TemplateContent", request.templateContent);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <b>description</b> :
     * <p>Each ordinary account can create up to five compliance packages.
     * This topic provides an example on how to create a compliance package named ClassifiedProtectionPreCheck. The compliance package contains a managed rule named <code>eip-bandwidth-limit</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a compliance package for the current account.</p>
     * 
     * @param request CreateCompliancePackRequest
     * @return CreateCompliancePackResponse
     */
    public CreateCompliancePackResponse createCompliancePack(CreateCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCompliancePackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, a delivery channel is created. The type of the delivery channel is <code>OSS</code> and the Alibaba Cloud Resource Name (ARN) of the delivery destination is <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>. The result indicates that the delivery channel is created, and the ID of the delivery channel is <code>cdc-8e45ff4e06a3a8****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a delivery channel.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.compliantSnapshot)) {
            query.put("CompliantSnapshot", request.compliantSnapshot);
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
     * <b>description</b> :
     * <p>In this example, a delivery channel is created. The type of the delivery channel is <code>OSS</code> and the Alibaba Cloud Resource Name (ARN) of the delivery destination is <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>. The result indicates that the delivery channel is created, and the ID of the delivery channel is <code>cdc-8e45ff4e06a3a8****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a delivery channel.</p>
     * 
     * @param request CreateConfigDeliveryChannelRequest
     * @return CreateConfigDeliveryChannelResponse
     */
    public CreateConfigDeliveryChannelResponse createConfigDeliveryChannel(CreateConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>You can use a common account to create up to 200 rules.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a rule for the current account.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.excludeRegionIdsScope)) {
            body.put("ExcludeRegionIdsScope", request.excludeRegionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceGroupIdsScope)) {
            body.put("ExcludeResourceGroupIdsScope", request.excludeResourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeTagsScope)) {
            bodyFlat.put("ExcludeTagsScope", request.excludeTagsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendContent)) {
            body.put("ExtendContent", request.extendContent);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsScope)) {
            body.put("ResourceIdsScope", request.resourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceNameScope)) {
            body.put("ResourceNameScope", request.resourceNameScope);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagsScope)) {
            bodyFlat.put("TagsScope", request.tagsScope);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <b>description</b> :
     * <h2>Limits</h2>
     * <p>You can use a common account to create up to 200 rules.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a rule for the current account.</p>
     * 
     * @param request CreateConfigRuleRequest
     * @return CreateConfigRuleResponse
     */
    public CreateConfigRuleResponse createConfigRule(CreateConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createConfigRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to create a remediation template for the rule <code>cr-8a973ac2e2be00a2****</code>. The returned result shows that a remediation template is created and the ID of the remediation template is <code>crr-909ba2d4716700eb****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a remediation template for a rule.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to create a remediation template for the rule <code>cr-8a973ac2e2be00a2****</code>. The returned result shows that a remediation template is created and the ID of the remediation template is <code>crr-909ba2d4716700eb****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a remediation template for a rule.</p>
     * 
     * @param request CreateRemediationRequest
     * @return CreateRemediationResponse
     */
    public CreateRemediationResponse createRemediation(CreateRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRemediationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The status of the rule is <code>ACTIVE</code>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to disable the <code>cr-5772ba41209e007b****</code> rule in the <code>ca-04b3fd170e340007****</code> account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables one or more rules in an account group. After a rule is disabled, the resource in the rule is no longer evaluated. The compliance evaluation results before the rule is disabled are still displayed.</p>
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
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The status of the rule is <code>ACTIVE</code>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to disable the <code>cr-5772ba41209e007b****</code> rule in the <code>ca-04b3fd170e340007****</code> account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables one or more rules in an account group. After a rule is disabled, the resource in the rule is no longer evaluated. The compliance evaluation results before the rule is disabled are still displayed.</p>
     * 
     * @param request DeactiveAggregateConfigRulesRequest
     * @return DeactiveAggregateConfigRulesResponse
     */
    public DeactiveAggregateConfigRulesResponse deactiveAggregateConfigRules(DeactiveAggregateConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactiveAggregateConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The status of the rule is <code>ACTIVE</code>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to disable the <code>cr-19a56457e0d90058****</code> rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a rule. After a rule is disabled, the resource in the rule is no longer evaluated. The compliance evaluation results before the rule is disabled are still displayed.</p>
     * 
     * @param request DeactiveConfigRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeactiveConfigRulesResponse
     */
    public DeactiveConfigRulesResponse deactiveConfigRulesWithOptions(DeactiveConfigRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The status of the rule is <code>ACTIVE</code>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to disable the <code>cr-19a56457e0d90058****</code> rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a rule. After a rule is disabled, the resource in the rule is no longer evaluated. The compliance evaluation results before the rule is disabled are still displayed.</p>
     * 
     * @param request DeactiveConfigRulesRequest
     * @return DeactiveConfigRulesResponse
     */
    public DeactiveConfigRulesResponse deactiveConfigRules(DeactiveConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactiveConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cp-541e626622af0087****</code> compliance package from the <code>ca-04b3fd170e340007****</code> account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the compliance packages of an account group.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cp-541e626622af0087****</code> compliance package from the <code>ca-04b3fd170e340007****</code> account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the compliance packages of an account group.</p>
     * 
     * @param request DeleteAggregateCompliancePacksRequest
     * @return DeleteAggregateCompliancePacksResponse
     */
    public DeleteAggregateCompliancePacksResponse deleteAggregateCompliancePacks(DeleteAggregateCompliancePacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAggregateCompliancePacksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cdc-38c3013b46c9002c****</code> delivery channel from the <code>ca-23c6626622af0041****</code> account group. The returned result shows that the <code>cdc-38c3013b46c9002c****</code> delivery channel is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a delivery channel from an account group.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cdc-38c3013b46c9002c****</code> delivery channel from the <code>ca-23c6626622af0041****</code> account group. The returned result shows that the <code>cdc-38c3013b46c9002c****</code> delivery channel is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a delivery channel from an account group.</p>
     * 
     * @param request DeleteAggregateConfigDeliveryChannelRequest
     * @return DeleteAggregateConfigDeliveryChannelResponse
     */
    public DeleteAggregateConfigDeliveryChannelResponse deleteAggregateConfigDeliveryChannel(DeleteAggregateConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAggregateConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cr-4e3d626622af0080****</code> rule from the <code>ca-a4e5626622af0079****</code> account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more rules from an account group. You can delete a rule in the Cloud Config console. After you delete the rule, the configurations of the rule are deleted.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cr-4e3d626622af0080****</code> rule from the <code>ca-a4e5626622af0079****</code> account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more rules from an account group. You can delete a rule in the Cloud Config console. After you delete the rule, the configurations of the rule are deleted.</p>
     * 
     * @param request DeleteAggregateConfigRulesRequest
     * @return DeleteAggregateConfigRulesResponse
     */
    public DeleteAggregateConfigRulesResponse deleteAggregateConfigRules(DeleteAggregateConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAggregateConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the remediation template whose ID is <code>crr-909ba2d4716700eb****</code> from the account group whose ID is <code>ca-6b4a626622af0012****</code>. The returned result shows that the remediation template whose ID is <code>crr-909ba2d4716700eb****</code> is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more remediation templates from a rule in an account group.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the remediation template whose ID is <code>crr-909ba2d4716700eb****</code> from the account group whose ID is <code>ca-6b4a626622af0012****</code>. The returned result shows that the remediation template whose ID is <code>crr-909ba2d4716700eb****</code> is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more remediation templates from a rule in an account group.</p>
     * 
     * @param request DeleteAggregateRemediationsRequest
     * @return DeleteAggregateRemediationsResponse
     */
    public DeleteAggregateRemediationsResponse deleteAggregateRemediations(DeleteAggregateRemediationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAggregateRemediationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Background information</h3>
     * <p>After you delete an account group, the following changes occur to Cloud Config:</p>
     * <ul>
     * <li>The rules and compliance packages of the account group are deleted and cannot be recovered.</li>
     * <li>All compliance results generated in the account group are automatically deleted and cannot be recovered.</li>
     * <li>Service-linked roles for Cloud Config of member accounts in the account group are retained.</li>
     * <li>If the account groups to which a member belongs are all deleted, the member account uses Cloud Config as an independent Alibaba Cloud account.</li>
     * </ul>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to delete the account group whose ID is <code>ca-9190626622af00a9****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>The management account or delegated administrator account of a resource directory can delete an account group.</p>
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
     * <b>description</b> :
     * <h3><a href="#"></a>Background information</h3>
     * <p>After you delete an account group, the following changes occur to Cloud Config:</p>
     * <ul>
     * <li>The rules and compliance packages of the account group are deleted and cannot be recovered.</li>
     * <li>All compliance results generated in the account group are automatically deleted and cannot be recovered.</li>
     * <li>Service-linked roles for Cloud Config of member accounts in the account group are retained.</li>
     * <li>If the account groups to which a member belongs are all deleted, the member account uses Cloud Config as an independent Alibaba Cloud account.</li>
     * </ul>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to delete the account group whose ID is <code>ca-9190626622af00a9****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>The management account or delegated administrator account of a resource directory can delete an account group.</p>
     * 
     * @param request DeleteAggregatorsRequest
     * @return DeleteAggregatorsResponse
     */
    public DeleteAggregatorsResponse deleteAggregators(DeleteAggregatorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAggregatorsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cp-541e626622af0087****</code> compliance package.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more compliance packages.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cp-541e626622af0087****</code> compliance package.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more compliance packages.</p>
     * 
     * @param request DeleteCompliancePacksRequest
     * @return DeleteCompliancePacksResponse
     */
    public DeleteCompliancePacksResponse deleteCompliancePacks(DeleteCompliancePacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCompliancePacksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cdc-38c3013b46c9002c****</code> delivery channel. The returned result shows that the <code>cdc-38c3013b46c9002c****</code> delivery channel is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a delivery channel.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the <code>cdc-38c3013b46c9002c****</code> delivery channel. The returned result shows that the <code>cdc-38c3013b46c9002c****</code> delivery channel is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a delivery channel.</p>
     * 
     * @param request DeleteConfigDeliveryChannelRequest
     * @return DeleteConfigDeliveryChannelResponse
     */
    public DeleteConfigDeliveryChannelResponse deleteConfigDeliveryChannel(DeleteConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the rule whose ID is cr-9908626622af0035\<em>\</em>\<em>\</em> is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes rules.</p>
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
     * <b>description</b> :
     * <p>In this example, the rule whose ID is cr-9908626622af0035\<em>\</em>\<em>\</em> is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes rules.</p>
     * 
     * @param request DeleteConfigRulesRequest
     * @return DeleteConfigRulesResponse
     */
    public DeleteConfigRulesResponse deleteConfigRules(DeleteConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the remediation template <code>crr-909ba2d4716700eb****</code>. The returned result shows that the remediation template whose ID is <code>crr-909ba2d4716700eb****</code> is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more configured remediation templates that are associated with a rule.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to delete the remediation template <code>crr-909ba2d4716700eb****</code>. The returned result shows that the remediation template whose ID is <code>crr-909ba2d4716700eb****</code> is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes one or more configured remediation templates that are associated with a rule.</p>
     * 
     * @param request DeleteRemediationsRequest
     * @return DeleteRemediationsResponse
     */
    public DeleteRemediationsResponse deleteRemediations(DeleteRemediationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRemediationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除合规报告模版</p>
     * 
     * @param request DeleteReportTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteReportTemplateResponse
     */
    public DeleteReportTemplateResponse deleteReportTemplateWithOptions(DeleteReportTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportTemplateId)) {
            body.put("ReportTemplateId", request.reportTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteReportTemplate"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteReportTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除合规报告模版</p>
     * 
     * @param request DeleteReportTemplateRequest
     * @return DeleteReportTemplateResponse
     */
    public DeleteReportTemplateResponse deleteReportTemplate(DeleteReportTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteReportTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取资源详情</p>
     * 
     * @param request DescribeDiscoveredResourceBatchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiscoveredResourceBatchResponse
     */
    public DescribeDiscoveredResourceBatchResponse describeDiscoveredResourceBatchWithOptions(DescribeDiscoveredResourceBatchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regions)) {
            query.put("Regions", request.regions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIds)) {
            query.put("ResourceIds", request.resourceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiscoveredResourceBatch"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiscoveredResourceBatchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量获取资源详情</p>
     * 
     * @param request DescribeDiscoveredResourceBatchRequest
     * @return DescribeDiscoveredResourceBatchResponse
     */
    public DescribeDiscoveredResourceBatchResponse describeDiscoveredResourceBatch(DescribeDiscoveredResourceBatchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiscoveredResourceBatchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户集成云产品的授权状态</p>
     * 
     * @param request DescribeIntegratedServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIntegratedServiceStatusResponse
     */
    public DescribeIntegratedServiceStatusResponse describeIntegratedServiceStatusWithOptions(DescribeIntegratedServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.serviceCode)) {
            body.put("ServiceCode", request.serviceCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIntegratedServiceStatus"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIntegratedServiceStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户集成云产品的授权状态</p>
     * 
     * @param request DescribeIntegratedServiceStatusRequest
     * @return DescribeIntegratedServiceStatusResponse
     */
    public DescribeIntegratedServiceStatusResponse describeIntegratedServiceStatus(DescribeIntegratedServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIntegratedServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This topic provides an example on how to query the details of a remediation configuration whose ID is crr-f381cf0c1c2f004e\<em>\</em>\<em>\</em>.</p>
     * 
     * @param request DescribeRemediationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRemediationResponse
     */
    public DescribeRemediationResponse describeRemediationWithOptions(DescribeRemediationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRemediation"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRemediationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>This topic provides an example on how to query the details of a remediation configuration whose ID is crr-f381cf0c1c2f004e\<em>\</em>\<em>\</em>.</p>
     * 
     * @param request DescribeRemediationRequest
     * @return DescribeRemediationResponse
     */
    public DescribeRemediationResponse describeRemediation(DescribeRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRemediationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>One or more rules are added to a compliance package.</p>
     * <h3>Usage notes</h3>
     * <p>The sample request in this topic shows you how to remove the <code>cr-6cc4626622af00e7****</code> rule in the <code>ca-75b4626622af00c3****</code> account group from the <code>cp-5bb1626622af00bd****</code> compliance package.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes one or more rules in an account group from a compliance package.</p>
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
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>One or more rules are added to a compliance package.</p>
     * <h3>Usage notes</h3>
     * <p>The sample request in this topic shows you how to remove the <code>cr-6cc4626622af00e7****</code> rule in the <code>ca-75b4626622af00c3****</code> account group from the <code>cp-5bb1626622af00bd****</code> compliance package.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes one or more rules in an account group from a compliance package.</p>
     * 
     * @param request DetachAggregateConfigRuleToCompliancePackRequest
     * @return DetachAggregateConfigRuleToCompliancePackResponse
     */
    public DetachAggregateConfigRuleToCompliancePackResponse detachAggregateConfigRuleToCompliancePack(DetachAggregateConfigRuleToCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachAggregateConfigRuleToCompliancePackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>One or more rules are added to a compliance package.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example on how to remove the <code>cr-6cc4626622af00e7****</code> rule from the <code>cp-5bb1626622af00bd****</code> compliance package.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes one or more rules from a compliance package.</p>
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
     * <b>description</b> :
     * <h3>Prerequisites</h3>
     * <p>One or more rules are added to a compliance package.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example on how to remove the <code>cr-6cc4626622af00e7****</code> rule from the <code>cp-5bb1626622af00bd****</code> compliance package.</p>
     * 
     * <b>summary</b> : 
     * <p>Removes one or more rules from a compliance package.</p>
     * 
     * @param request DetachConfigRuleToCompliancePackRequest
     * @return DetachConfigRuleToCompliancePackResponse
     */
    public DetachConfigRuleToCompliancePackResponse detachConfigRuleToCompliancePack(DetachConfigRuleToCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachConfigRuleToCompliancePackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>试运行事前合规预检的规则</p>
     * 
     * @param request DryRunConfigRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DryRunConfigRuleResponse
     */
    public DryRunConfigRuleResponse dryRunConfigRuleWithOptions(DryRunConfigRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configurationItem)) {
            body.put("ConfigurationItem", request.configurationItem);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            body.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DryRunConfigRule"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DryRunConfigRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>试运行事前合规预检的规则</p>
     * 
     * @param request DryRunConfigRuleRequest
     * @return DryRunConfigRuleResponse
     */
    public DryRunConfigRuleResponse dryRunConfigRule(DryRunConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dryRunConfigRuleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Executes evaluation rules to evaluate resources.</p>
     * 
     * @param tmpReq EvaluatePreConfigRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EvaluatePreConfigRulesResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypeFormat)) {
            body.put("ResourceTypeFormat", request.resourceTypeFormat);
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

    /**
     * <b>summary</b> : 
     * <p>Executes evaluation rules to evaluate resources.</p>
     * 
     * @param request EvaluatePreConfigRulesRequest
     * @return EvaluatePreConfigRulesResponse
     */
    public EvaluatePreConfigRulesResponse evaluatePreConfigRules(EvaluatePreConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.evaluatePreConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetAggregateConfigRulesReport operation. For more information, see <a href="https://help.aliyun.com/document_detail/262699.html">GetAggregateCompliancePackReport</a>.
     * This topic provides an example on how to generate a compliance evaluation report based on the <code>cp-fdc8626622af00f9****</code> compliance package in the <code>ca-f632626622af0079****</code> account group.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a compliance evaluation report based on a compliance package in an account group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.multiFiles)) {
            body.put("MultiFiles", request.multiFiles);
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetAggregateConfigRulesReport operation. For more information, see <a href="https://help.aliyun.com/document_detail/262699.html">GetAggregateCompliancePackReport</a>.
     * This topic provides an example on how to generate a compliance evaluation report based on the <code>cp-fdc8626622af00f9****</code> compliance package in the <code>ca-f632626622af0079****</code> account group.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a compliance evaluation report based on a compliance package in an account group.</p>
     * 
     * @param request GenerateAggregateCompliancePackReportRequest
     * @return GenerateAggregateCompliancePackReportResponse
     */
    public GenerateAggregateCompliancePackReportResponse generateAggregateCompliancePackReport(GenerateAggregateCompliancePackReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateAggregateCompliancePackReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetAggregateConfigRulesReport operation. For more information, see <a href="https://help.aliyun.com/document_detail/262706.html">GetAggregateConfigRulesReport</a>.
     * The topic provides an example on how to generate a compliance evaluation report based on all rules in the <code>ca-f632626622af0079****</code> account group.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a compliance evaluation report for the rules in a specified account group.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetAggregateConfigRulesReport operation. For more information, see <a href="https://help.aliyun.com/document_detail/262706.html">GetAggregateConfigRulesReport</a>.
     * The topic provides an example on how to generate a compliance evaluation report based on all rules in the <code>ca-f632626622af0079****</code> account group.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a compliance evaluation report for the rules in a specified account group.</p>
     * 
     * @param request GenerateAggregateConfigRulesReportRequest
     * @return GenerateAggregateConfigRulesReportResponse
     */
    public GenerateAggregateConfigRulesReportResponse generateAggregateConfigRulesReport(GenerateAggregateConfigRulesReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateAggregateConfigRulesReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to generate a downloadable inventory for global resources in the account group ca-a91d626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a downloadable inventory for global resources in an account group.</p>
     * 
     * @param request GenerateAggregateResourceInventoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateAggregateResourceInventoryResponse
     */
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceDeleted)) {
            query.put("ResourceDeleted", request.resourceDeleted);
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

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to generate a downloadable inventory for global resources in the account group ca-a91d626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a downloadable inventory for global resources in an account group.</p>
     * 
     * @param request GenerateAggregateResourceInventoryRequest
     * @return GenerateAggregateResourceInventoryResponse
     */
    public GenerateAggregateResourceInventoryResponse generateAggregateResourceInventory(GenerateAggregateResourceInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateAggregateResourceInventoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetCompliancePackReport operation. For more information, see <a href="https://help.aliyun.com/document_detail/263347.html">GetCompliancePackReport</a>.
     * This topic provides an example on how to generate a compliance evaluation report based on the <code>cp-a8a8626622af0082****</code> compliance package.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a compliance evaluation report based on a compliance package.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetCompliancePackReport operation. For more information, see <a href="https://help.aliyun.com/document_detail/263347.html">GetCompliancePackReport</a>.
     * This topic provides an example on how to generate a compliance evaluation report based on the <code>cp-a8a8626622af0082****</code> compliance package.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a compliance evaluation report based on a compliance package.</p>
     * 
     * @param request GenerateCompliancePackReportRequest
     * @return GenerateCompliancePackReportResponse
     */
    public GenerateCompliancePackReportResponse generateCompliancePackReport(GenerateCompliancePackReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateCompliancePackReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetConfigRulesReport operation. For more information, see <a href="https://help.aliyun.com/document_detail/263608.html">GetConfigRulesReport</a>.
     * This topic provides an example of how to generate a compliance evaluation report based on all existing rules.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a compliance evaluation report for a rule.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> You can call this operation to generate the latest compliance evaluation report. To download the report, call the GetConfigRulesReport operation. For more information, see <a href="https://help.aliyun.com/document_detail/263608.html">GetConfigRulesReport</a>.
     * This topic provides an example of how to generate a compliance evaluation report based on all existing rules.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates a compliance evaluation report for a rule.</p>
     * 
     * @param request GenerateConfigRulesReportRequest
     * @return GenerateConfigRulesReportResponse
     */
    public GenerateConfigRulesReportResponse generateConfigRulesReport(GenerateConfigRulesReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateConfigRulesReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>基于报告模版生成报告Id</p>
     * 
     * @param request GenerateReportFromTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateReportFromTemplateResponse
     */
    public GenerateReportFromTemplateResponse generateReportFromTemplateWithOptions(GenerateReportFromTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportTemplateId)) {
            body.put("ReportTemplateId", request.reportTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GenerateReportFromTemplate"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GenerateReportFromTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>基于报告模版生成报告Id</p>
     * 
     * @param request GenerateReportFromTemplateRequest
     * @return GenerateReportFromTemplateResponse
     */
    public GenerateReportFromTemplateResponse generateReportFromTemplate(GenerateReportFromTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateReportFromTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to generate a resource inventory for global resources of the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a resource inventory for global resources.</p>
     * 
     * @param request GenerateResourceInventoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GenerateResourceInventoryResponse
     */
    public GenerateResourceInventoryResponse generateResourceInventoryWithOptions(GenerateResourceInventoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regions)) {
            query.put("Regions", request.regions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceDeleted)) {
            query.put("ResourceDeleted", request.resourceDeleted);
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

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to generate a resource inventory for global resources of the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a resource inventory for global resources.</p>
     * 
     * @param request GenerateResourceInventoryRequest
     * @return GenerateResourceInventoryResponse
     */
    public GenerateResourceInventoryResponse generateResourceInventory(GenerateResourceInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateResourceInventoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>You must call the <a href="https://help.aliyun.com/document_detail/2511967.html">CreateAdvancedSearchFile</a> operation to create a resource advanced search file. Then, you can call this operation to obtain the URL of the resource advanced search file.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the last resource advanced search file that is generated within the current account. You can call this operation to obtain the URL of the resource advanced search file.</p>
     * 
     * @param request GetAdvancedSearchFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAdvancedSearchFileResponse
     */
    public GetAdvancedSearchFileResponse getAdvancedSearchFileWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAdvancedSearchFile"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAdvancedSearchFileResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>You must call the <a href="https://help.aliyun.com/document_detail/2511967.html">CreateAdvancedSearchFile</a> operation to create a resource advanced search file. Then, you can call this operation to obtain the URL of the resource advanced search file.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the last resource advanced search file that is generated within the current account. You can call this operation to obtain the URL of the resource advanced search file.</p>
     * @return GetAdvancedSearchFileResponse
     */
    public GetAdvancedSearchFileResponse getAdvancedSearchFile() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAdvancedSearchFileWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of member accounts for which the <code>cp-541e626622af0087****</code> compliance package takes effect in the <code>ca-04b3fd170e340007****</code> account group. The returned result shows that two member accounts are monitored by the compliance package and they are both evaluated as compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of member accounts for which a compliance package takes effect in an account group.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of member accounts for which the <code>cp-541e626622af0087****</code> compliance package takes effect in the <code>ca-04b3fd170e340007****</code> account group. The returned result shows that two member accounts are monitored by the compliance package and they are both evaluated as compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of member accounts for which a compliance package takes effect in an account group.</p>
     * 
     * @param request GetAggregateAccountComplianceByPackRequest
     * @return GetAggregateAccountComplianceByPackResponse
     */
    public GetAggregateAccountComplianceByPackResponse getAggregateAccountComplianceByPack(GetAggregateAccountComplianceByPackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateAccountComplianceByPackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the most recently generated resource file of an account group.</p>
     * 
     * @param request GetAggregateAdvancedSearchFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAggregateAdvancedSearchFileResponse
     */
    public GetAggregateAdvancedSearchFileResponse getAggregateAdvancedSearchFileWithOptions(GetAggregateAdvancedSearchFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateAdvancedSearchFile"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateAdvancedSearchFileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the most recently generated resource file of an account group.</p>
     * 
     * @param request GetAggregateAdvancedSearchFileRequest
     * @return GetAggregateAdvancedSearchFileResponse
     */
    public GetAggregateAdvancedSearchFileResponse getAggregateAdvancedSearchFile(GetAggregateAdvancedSearchFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateAdvancedSearchFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The topic provides an example on how to query the details of a compliance package whose ID is <code>cp-fdc8626622af00f9****</code> in an account group whose ID is <code>ca-f632626622af0079****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a compliance package in an account group.</p>
     * 
     * @param tmpReq GetAggregateCompliancePackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAggregateCompliancePackResponse
     */
    public GetAggregateCompliancePackResponse getAggregateCompliancePackWithOptions(GetAggregateCompliancePackRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAggregateCompliancePackShrinkRequest request = new GetAggregateCompliancePackShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

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
     * <b>description</b> :
     * <p>The topic provides an example on how to query the details of a compliance package whose ID is <code>cp-fdc8626622af00f9****</code> in an account group whose ID is <code>ca-f632626622af0079****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a compliance package in an account group.</p>
     * 
     * @param request GetAggregateCompliancePackRequest
     * @return GetAggregateCompliancePackResponse
     */
    public GetAggregateCompliancePackResponse getAggregateCompliancePack(GetAggregateCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateCompliancePackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, you must call the GenerateAggregateCompliancePackReport operation to generate the latest compliance evaluation report based on a compliance package. For more information, see <a href="https://help.aliyun.com/document_detail/262687.html">GenerateAggregateCompliancePackReport</a>.
     * This topic provides an example on how to query the compliance evaluation report that is generated based on the <code>cp-fdc8626622af00f9****</code> compliance package in the <code>ca-f632626622af0079****</code> account group.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation report that is generated based on a compliance package of an account group.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, you must call the GenerateAggregateCompliancePackReport operation to generate the latest compliance evaluation report based on a compliance package. For more information, see <a href="https://help.aliyun.com/document_detail/262687.html">GenerateAggregateCompliancePackReport</a>.
     * This topic provides an example on how to query the compliance evaluation report that is generated based on the <code>cp-fdc8626622af00f9****</code> compliance package in the <code>ca-f632626622af0079****</code> account group.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation report that is generated based on a compliance package of an account group.</p>
     * 
     * @param request GetAggregateCompliancePackReportRequest
     * @return GetAggregateCompliancePackReportResponse
     */
    public GetAggregateCompliancePackReportResponse getAggregateCompliancePackReport(GetAggregateCompliancePackReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateCompliancePackReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance statistics of resources and rules in the account group ca-a91d626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance statistics of an account group.</p>
     * 
     * @param request GetAggregateComplianceSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAggregateComplianceSummaryResponse
     */
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

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance statistics of resources and rules in the account group ca-a91d626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance statistics of an account group.</p>
     * 
     * @param request GetAggregateComplianceSummaryRequest
     * @return GetAggregateComplianceSummaryResponse
     */
    public GetAggregateComplianceSummaryResponse getAggregateComplianceSummary(GetAggregateComplianceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateComplianceSummaryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a delivery channel in an account group.</p>
     * 
     * @param request GetAggregateConfigDeliveryChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAggregateConfigDeliveryChannelResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a delivery channel in an account group.</p>
     * 
     * @param request GetAggregateConfigDeliveryChannelRequest
     * @return GetAggregateConfigDeliveryChannelResponse
     */
    public GetAggregateConfigDeliveryChannelResponse getAggregateConfigDeliveryChannel(GetAggregateConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This example shows how to query the details of the <code>cr-7f7d626622af0041****</code> rule in the <code>ca-7f00626622af0041****</code> account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a rule in an account group.</p>
     * 
     * @param tmpReq GetAggregateConfigRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAggregateConfigRuleResponse
     */
    public GetAggregateConfigRuleResponse getAggregateConfigRuleWithOptions(GetAggregateConfigRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAggregateConfigRuleShrinkRequest request = new GetAggregateConfigRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            query.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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
     * <b>description</b> :
     * <p>This example shows how to query the details of the <code>cr-7f7d626622af0041****</code> rule in the <code>ca-7f00626622af0041****</code> account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a rule in an account group.</p>
     * 
     * @param request GetAggregateConfigRuleRequest
     * @return GetAggregateConfigRuleResponse
     */
    public GetAggregateConfigRuleResponse getAggregateConfigRule(GetAggregateConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateConfigRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the compliance evaluation results based on rules in the <code>cp-541e626622af0087****</code> compliance package that is created for the <code>ca-04b3fd170e340007****</code> account group. The return result shows a total of <code>one</code> rule. <code>No resources</code> are evaluated as non-compliant based on the rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries compliance evaluation results based on the rules in a compliance package in an account group.</p>
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
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the compliance evaluation results based on rules in the <code>cp-541e626622af0087****</code> compliance package that is created for the <code>ca-04b3fd170e340007****</code> account group. The return result shows a total of <code>one</code> rule. <code>No resources</code> are evaluated as non-compliant based on the rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries compliance evaluation results based on the rules in a compliance package in an account group.</p>
     * 
     * @param request GetAggregateConfigRuleComplianceByPackRequest
     * @return GetAggregateConfigRuleComplianceByPackResponse
     */
    public GetAggregateConfigRuleComplianceByPackResponse getAggregateConfigRuleComplianceByPack(GetAggregateConfigRuleComplianceByPackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateConfigRuleComplianceByPackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the summary of compliance evaluation results by rule risk level in the <code>ca-3a58626622af0005****</code> account group. The returned result shows four rules that are specified with the high risk level. One of the rules detects non-compliant resources, and the resources evaluated by the remaining three are compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the summary of compliance evaluation results by rule risk level in an account group.</p>
     * 
     * @param request GetAggregateConfigRuleSummaryByRiskLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAggregateConfigRuleSummaryByRiskLevelResponse
     */
    public GetAggregateConfigRuleSummaryByRiskLevelResponse getAggregateConfigRuleSummaryByRiskLevelWithOptions(GetAggregateConfigRuleSummaryByRiskLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateConfigRuleSummaryByRiskLevel"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateConfigRuleSummaryByRiskLevelResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the summary of compliance evaluation results by rule risk level in the <code>ca-3a58626622af0005****</code> account group. The returned result shows four rules that are specified with the high risk level. One of the rules detects non-compliant resources, and the resources evaluated by the remaining three are compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the summary of compliance evaluation results by rule risk level in an account group.</p>
     * 
     * @param request GetAggregateConfigRuleSummaryByRiskLevelRequest
     * @return GetAggregateConfigRuleSummaryByRiskLevelResponse
     */
    public GetAggregateConfigRuleSummaryByRiskLevelResponse getAggregateConfigRuleSummaryByRiskLevel(GetAggregateConfigRuleSummaryByRiskLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateConfigRuleSummaryByRiskLevelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, you must call the GenerateAggregateConfigRulesReport operation to generate the latest compliance evaluation report based on all rules in an account group. For more information, see <a href="https://help.aliyun.com/document_detail/262701.html">GenerateAggregateConfigRulesReport</a>.
     * This topic provides an example on how to query the compliance evaluation report that is generated based on all rules in the <code>ca-f632626622af0079****</code> account group.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Downloads the compliance evaluation report in the Excel format to your on-premises machine. This allows you to assign tasks and modify incompliant resource configurations.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, you must call the GenerateAggregateConfigRulesReport operation to generate the latest compliance evaluation report based on all rules in an account group. For more information, see <a href="https://help.aliyun.com/document_detail/262701.html">GenerateAggregateConfigRulesReport</a>.
     * This topic provides an example on how to query the compliance evaluation report that is generated based on all rules in the <code>ca-f632626622af0079****</code> account group.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Downloads the compliance evaluation report in the Excel format to your on-premises machine. This allows you to assign tasks and modify incompliant resource configurations.</p>
     * 
     * @param request GetAggregateConfigRulesReportRequest
     * @return GetAggregateConfigRulesReportResponse
     */
    public GetAggregateConfigRulesReportResponse getAggregateConfigRulesReport(GetAggregateConfigRulesReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateConfigRulesReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of an Elastic Compute Service (ECS) instance <code>i-bp12g4xbl4i0brkn****</code> that resides in the China (Hangzhou) region in the account group <code>ca-5885626622af0008****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specific resource in an account group.</p>
     * 
     * @param request GetAggregateDiscoveredResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAggregateDiscoveredResourceResponse
     */
    public GetAggregateDiscoveredResourceResponse getAggregateDiscoveredResourceWithOptions(GetAggregateDiscoveredResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.complianceOption)) {
            query.put("ComplianceOption", request.complianceOption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAccountId)) {
            query.put("ResourceAccountId", request.resourceAccountId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
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
            new TeaPair("action", "GetAggregateDiscoveredResource"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateDiscoveredResourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of an Elastic Compute Service (ECS) instance <code>i-bp12g4xbl4i0brkn****</code> that resides in the China (Hangzhou) region in the account group <code>ca-5885626622af0008****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specific resource in an account group.</p>
     * 
     * @param request GetAggregateDiscoveredResourceRequest
     * @return GetAggregateDiscoveredResourceResponse
     */
    public GetAggregateDiscoveredResourceResponse getAggregateDiscoveredResource(GetAggregateDiscoveredResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateDiscoveredResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results based on the <code>cr-d369626622af008e****</code> rule in the <code>ca-a4e5626622af0079****</code> account group. The returned result shows that a total of 10 resources are evaluated by the rule and five of them are evaluated as compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries compliance evaluation results based on the rules in a compliance package in an account group.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results based on the <code>cr-d369626622af008e****</code> rule in the <code>ca-a4e5626622af0079****</code> account group. The returned result shows that a total of 10 resources are evaluated by the rule and five of them are evaluated as compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries compliance evaluation results based on the rules in a compliance package in an account group.</p>
     * 
     * @param request GetAggregateResourceComplianceByConfigRuleRequest
     * @return GetAggregateResourceComplianceByConfigRuleResponse
     */
    public GetAggregateResourceComplianceByConfigRuleResponse getAggregateResourceComplianceByConfigRule(GetAggregateResourceComplianceByConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceComplianceByConfigRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of resources monitored based on the <code>cp-fdc8626622af00f9****</code> compliance package in the <code>ca-f632626622af0079****</code>account group. The returned result shows that the total number of monitored resources is <code>10</code> and the number of non-compliant resources is <code>7</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of resources evaluated based on a compliance package of an account group.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of resources monitored based on the <code>cp-fdc8626622af00f9****</code> compliance package in the <code>ca-f632626622af0079****</code>account group. The returned result shows that the total number of monitored resources is <code>10</code> and the number of non-compliant resources is <code>7</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of resources evaluated based on a compliance package of an account group.</p>
     * 
     * @param request GetAggregateResourceComplianceByPackRequest
     * @return GetAggregateResourceComplianceByPackResponse
     */
    public GetAggregateResourceComplianceByPackResponse getAggregateResourceComplianceByPack(GetAggregateResourceComplianceByPackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceComplianceByPackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the evaluation results grouped by resource type for an account group rule.</p>
     * 
     * @param request GetAggregateResourceComplianceGroupByRegionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAggregateResourceComplianceGroupByRegionResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the evaluation results grouped by resource type for an account group rule.</p>
     * 
     * @param request GetAggregateResourceComplianceGroupByRegionRequest
     * @return GetAggregateResourceComplianceGroupByRegionResponse
     */
    public GetAggregateResourceComplianceGroupByRegionResponse getAggregateResourceComplianceGroupByRegion(GetAggregateResourceComplianceGroupByRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceComplianceGroupByRegionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the evaluation results grouped by resource type for an account group rule.</p>
     * 
     * @param request GetAggregateResourceComplianceGroupByResourceTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAggregateResourceComplianceGroupByResourceTypeResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the evaluation results grouped by resource type for an account group rule.</p>
     * 
     * @param request GetAggregateResourceComplianceGroupByResourceTypeRequest
     * @return GetAggregateResourceComplianceGroupByResourceTypeResponse
     */
    public GetAggregateResourceComplianceGroupByResourceTypeResponse getAggregateResourceComplianceGroupByResourceType(GetAggregateResourceComplianceGroupByResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceComplianceGroupByResourceTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the compliance timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region within the <code>100931896542****</code> member account of the <code>ca-5885626622af0008****</code> account group. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows the following two timestamps on the compliance timeline: <code>1625200295276</code> and <code>1625200228510</code>. The first timestamp indicates 12:31:35 on July 2, 2021 (UTC+8), and the second timestamp indicates 12:30:28 on July 2, 2021 (UTC+8).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance timeline of a resource in an account group.</p>
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
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the compliance timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region within the <code>100931896542****</code> member account of the <code>ca-5885626622af0008****</code> account group. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows the following two timestamps on the compliance timeline: <code>1625200295276</code> and <code>1625200228510</code>. The first timestamp indicates 12:31:35 on July 2, 2021 (UTC+8), and the second timestamp indicates 12:30:28 on July 2, 2021 (UTC+8).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance timeline of a resource in an account group.</p>
     * 
     * @param request GetAggregateResourceComplianceTimelineRequest
     * @return GetAggregateResourceComplianceTimelineResponse
     */
    public GetAggregateResourceComplianceTimelineResponse getAggregateResourceComplianceTimeline(GetAggregateResourceComplianceTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceComplianceTimelineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the configuration timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region within the <code>100931896542****</code> member account of the <code>ca-5885626622af0008****</code> account group. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows that the timestamp when the resource configuration changes is <code>1624961112000</code>. The timestamp indicates 18:05:12 on June 29, 2021 (UTC+8).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration timeline of a resource in an account group.</p>
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
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the configuration timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region within the <code>100931896542****</code> member account of the <code>ca-5885626622af0008****</code> account group. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows that the timestamp when the resource configuration changes is <code>1624961112000</code>. The timestamp indicates 18:05:12 on June 29, 2021 (UTC+8).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration timeline of a resource in an account group.</p>
     * 
     * @param request GetAggregateResourceConfigurationTimelineRequest
     * @return GetAggregateResourceConfigurationTimelineResponse
     */
    public GetAggregateResourceConfigurationTimelineResponse getAggregateResourceConfigurationTimeline(GetAggregateResourceConfigurationTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceConfigurationTimelineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics on the resources in an account group named <code>ca-a260626622af0005****</code> by region. The returned result shows that a total of <code>10</code> resources exist in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics on the resources in an account group by region.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics on the resources in an account group named <code>ca-a260626622af0005****</code> by region. The returned result shows that a total of <code>10</code> resources exist in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics on the resources in an account group by region.</p>
     * 
     * @param request GetAggregateResourceCountsGroupByRegionRequest
     * @return GetAggregateResourceCountsGroupByRegionResponse
     */
    public GetAggregateResourceCountsGroupByRegionResponse getAggregateResourceCountsGroupByRegion(GetAggregateResourceCountsGroupByRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceCountsGroupByRegionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics on the resources in an account group whose ID is <code>ca-a260626622af0005****</code> by resource type. The returned result shows that the account group has a total of <code>seven</code> resources of the <code>ACS::RAM::Role</code> resource type.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics on the resources in an account group by resource type.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics on the resources in an account group whose ID is <code>ca-a260626622af0005****</code> by resource type. The returned result shows that the account group has a total of <code>seven</code> resources of the <code>ACS::RAM::Role</code> resource type.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics on the resources in an account group by resource type.</p>
     * 
     * @param request GetAggregateResourceCountsGroupByResourceTypeRequest
     * @return GetAggregateResourceCountsGroupByResourceTypeResponse
     */
    public GetAggregateResourceCountsGroupByResourceTypeResponse getAggregateResourceCountsGroupByResourceType(GetAggregateResourceCountsGroupByResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceCountsGroupByResourceTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The <a href="https://help.aliyun.com/document_detail/2398353.html">GenerateAggregateResourceInventory</a> operation is called to generate a resource inventory. Then, this operation is called to obtain the URL of the resource inventory.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to obtain the last resource inventory that is generated within the account group ca-a91d626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the last resource inventory that is generated on the Global Resources page within the current account group.</p>
     * 
     * @param request GetAggregateResourceInventoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAggregateResourceInventoryResponse
     */
    public GetAggregateResourceInventoryResponse getAggregateResourceInventoryWithOptions(GetAggregateResourceInventoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregateResourceInventory"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregateResourceInventoryResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>The <a href="https://help.aliyun.com/document_detail/2398353.html">GenerateAggregateResourceInventory</a> operation is called to generate a resource inventory. Then, this operation is called to obtain the URL of the resource inventory.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to obtain the last resource inventory that is generated within the account group ca-a91d626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the last resource inventory that is generated on the Global Resources page within the current account group.</p>
     * 
     * @param request GetAggregateResourceInventoryRequest
     * @return GetAggregateResourceInventoryResponse
     */
    public GetAggregateResourceInventoryResponse getAggregateResourceInventory(GetAggregateResourceInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceInventoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the details of the <code>ca-88ea626622af0055****</code> account group. The return result shows that the account group is named <code>Test_Group</code>, its description is <code>Test account group</code>, and it is of the <code>CUSTOM</code> type. The account group is in the <code>1</code> state, which indicates that it is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an account group. You can query the name, creation time, member, and type of an account group.</p>
     * 
     * @param tmpReq GetAggregatorRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAggregatorResponse
     */
    public GetAggregatorResponse getAggregatorWithOptions(GetAggregatorRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAggregatorShrinkRequest request = new GetAggregatorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAggregator"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAggregatorResponse());
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the details of the <code>ca-88ea626622af0055****</code> account group. The return result shows that the account group is named <code>Test_Group</code>, its description is <code>Test account group</code>, and it is of the <code>CUSTOM</code> type. The account group is in the <code>1</code> state, which indicates that it is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an account group. You can query the name, creation time, member, and type of an account group.</p>
     * 
     * @param request GetAggregatorRequest
     * @return GetAggregatorResponse
     */
    public GetAggregatorResponse getAggregator(GetAggregatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregatorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of a compliance package whose ID is <code>cp-fdc8626622af00f9****</code>. The returned result shows that the name of the compliance package is <code>ClassifiedProtectionPreCheck</code>, the compliance package is in the <code>ACTIVE</code> state, and the risk level of the rules in the compliance package is <code>1</code>, which indicates high risk level.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a compliance package.</p>
     * 
     * @param tmpReq GetCompliancePackRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCompliancePackResponse
     */
    public GetCompliancePackResponse getCompliancePackWithOptions(GetCompliancePackRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetCompliancePackShrinkRequest request = new GetCompliancePackShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of a compliance package whose ID is <code>cp-fdc8626622af00f9****</code>. The returned result shows that the name of the compliance package is <code>ClassifiedProtectionPreCheck</code>, the compliance package is in the <code>ACTIVE</code> state, and the risk level of the rules in the compliance package is <code>1</code>, which indicates high risk level.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a compliance package.</p>
     * 
     * @param request GetCompliancePackRequest
     * @return GetCompliancePackResponse
     */
    public GetCompliancePackResponse getCompliancePack(GetCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCompliancePackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, you must call the GenerateCompliancePackReport operation to generate the latest compliance evaluation report based on a compliance package. For more information, see <a href="https://help.aliyun.com/document_detail/263525.html">GenerateCompliancePackReport</a>.
     * This topic provides an example on how to query the compliance evaluation report that is generated based on the <code>cp-fdc8626622af00f9****</code> compliance package.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation report that is generated based on a compliance package.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>Before you call this operation, you must call the GenerateCompliancePackReport operation to generate the latest compliance evaluation report based on a compliance package. For more information, see <a href="https://help.aliyun.com/document_detail/263525.html">GenerateCompliancePackReport</a>.
     * This topic provides an example on how to query the compliance evaluation report that is generated based on the <code>cp-fdc8626622af00f9****</code> compliance package.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation report that is generated based on a compliance package.</p>
     * 
     * @param request GetCompliancePackReportRequest
     * @return GetCompliancePackReportResponse
     */
    public GetCompliancePackReportResponse getCompliancePackReport(GetCompliancePackReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCompliancePackReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance statistics of resources and rules in the current account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the summary of compliance statistics within the current account.</p>
     * 
     * @param request GetComplianceSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetComplianceSummaryResponse
     */
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

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance statistics of resources and rules in the current account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the summary of compliance statistics within the current account.</p>
     * @return GetComplianceSummaryResponse
     */
    public GetComplianceSummaryResponse getComplianceSummary() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getComplianceSummaryWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a delivery channel.</p>
     * 
     * @param request GetConfigDeliveryChannelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConfigDeliveryChannelResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a delivery channel.</p>
     * 
     * @param request GetConfigDeliveryChannelRequest
     * @return GetConfigDeliveryChannelResponse
     */
    public GetConfigDeliveryChannelResponse getConfigDeliveryChannel(GetConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the <code>cr-7f7d626622af0041****</code> rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a rule.</p>
     * 
     * @param tmpReq GetConfigRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConfigRuleResponse
     */
    public GetConfigRuleResponse getConfigRuleWithOptions(GetConfigRuleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetConfigRuleShrinkRequest request = new GetConfigRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configRuleId)) {
            query.put("ConfigRuleId", request.configRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the <code>cr-7f7d626622af0041****</code> rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a rule.</p>
     * 
     * @param request GetConfigRuleRequest
     * @return GetConfigRuleResponse
     */
    public GetConfigRuleResponse getConfigRule(GetConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this topic, the <code>cp-541e626622af0087****</code> compliance package is used as an example. The return result shows a total of one rule against which specific resources are evaluated as compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries compliance evaluation results based on the rules in a compliance package.</p>
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
     * <b>description</b> :
     * <p>In this topic, the <code>cp-541e626622af0087****</code> compliance package is used as an example. The return result shows a total of one rule against which specific resources are evaluated as compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries compliance evaluation results based on the rules in a compliance package.</p>
     * 
     * @param request GetConfigRuleComplianceByPackRequest
     * @return GetConfigRuleComplianceByPackResponse
     */
    public GetConfigRuleComplianceByPackResponse getConfigRuleComplianceByPack(GetConfigRuleComplianceByPackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigRuleComplianceByPackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the summary of compliance evaluation results by rule risk level. The return result shows four rules that are specified with the high risk level. One of them detects non-compliant resources, and the resources evaluated by the remaining three are all compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance summary based on the risk level of a rule.</p>
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
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetConfigRuleSummaryByRiskLevelResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the summary of compliance evaluation results by rule risk level. The return result shows four rules that are specified with the high risk level. One of them detects non-compliant resources, and the resources evaluated by the remaining three are all compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance summary based on the risk level of a rule.</p>
     * @return GetConfigRuleSummaryByRiskLevelResponse
     */
    public GetConfigRuleSummaryByRiskLevelResponse getConfigRuleSummaryByRiskLevel() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigRuleSummaryByRiskLevelWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> Before you call this operation, you must call the GenerateConfigRulesReport operation to generate the latest compliance evaluation report based on all existing rules. For more information, see <a href="https://help.aliyun.com/document_detail/263601.html">GenerateConfigRulesReport</a>.
     * This topic provides an example of how to query the compliance evaluation report that is generated based on all existing rules.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Downloads the compliance evaluation report in the Excel format to your on-premises machine. This allows you to assign tasks and modify incompliant resource configurations.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p> Before you call this operation, you must call the GenerateConfigRulesReport operation to generate the latest compliance evaluation report based on all existing rules. For more information, see <a href="https://help.aliyun.com/document_detail/263601.html">GenerateConfigRulesReport</a>.
     * This topic provides an example of how to query the compliance evaluation report that is generated based on all existing rules.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Downloads the compliance evaluation report in the Excel format to your on-premises machine. This allows you to assign tasks and modify incompliant resource configurations.</p>
     * 
     * @param request GetConfigRulesReportRequest
     * @return GetConfigRulesReportResponse
     */
    public GetConfigRulesReportResponse getConfigRulesReport(GetConfigRulesReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigRulesReportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the activation status and resource monitoring scope of Cloud Config for the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the activation status and resource monitoring scope of Cloud Config for the current account.</p>
     * 
     * @param request GetConfigurationRecorderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetConfigurationRecorderResponse
     */
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

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the activation status and resource monitoring scope of Cloud Config for the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the activation status and resource monitoring scope of Cloud Config for the current account.</p>
     * @return GetConfigurationRecorderResponse
     */
    public GetConfigurationRecorderResponse getConfigurationRecorder() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigurationRecorderWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the Elastic Compute Service (ECS) instance <code>i-bp12g4xbl4i0brkn****</code> that resides in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specific resource.</p>
     * 
     * @param request GetDiscoveredResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDiscoveredResourceResponse
     */
    public GetDiscoveredResourceResponse getDiscoveredResourceWithOptions(GetDiscoveredResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.complianceOption)) {
            query.put("ComplianceOption", request.complianceOption);
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
            new TeaPair("action", "GetDiscoveredResource"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDiscoveredResourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the Elastic Compute Service (ECS) instance <code>i-bp12g4xbl4i0brkn****</code> that resides in the China (Hangzhou) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specific resource.</p>
     * 
     * @param request GetDiscoveredResourceRequest
     * @return GetDiscoveredResourceResponse
     */
    public GetDiscoveredResourceResponse getDiscoveredResource(GetDiscoveredResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDiscoveredResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to demonstrate how to query the statistics on resources by region. The returned result shows that a total of 10 resources exist in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics on resources by region.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example to demonstrate how to query the statistics on resources by region. The returned result shows that a total of 10 resources exist in the <code>cn-hangzhou</code> region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics on resources by region.</p>
     * 
     * @param request GetDiscoveredResourceCountsGroupByRegionRequest
     * @return GetDiscoveredResourceCountsGroupByRegionResponse
     */
    public GetDiscoveredResourceCountsGroupByRegionResponse getDiscoveredResourceCountsGroupByRegion(GetDiscoveredResourceCountsGroupByRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDiscoveredResourceCountsGroupByRegionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to query the statistics on resources by resource type. The returned result shows that a total of 10 resources of the <code>ACS::ECS::Instance</code> resource type exist.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics on resources by resource type.</p>
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
     * <b>description</b> :
     * <p>This topic describes how to query the statistics on resources by resource type. The returned result shows that a total of 10 resources of the <code>ACS::ECS::Instance</code> resource type exist.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics on resources by resource type.</p>
     * 
     * @param request GetDiscoveredResourceCountsGroupByResourceTypeRequest
     * @return GetDiscoveredResourceCountsGroupByResourceTypeResponse
     */
    public GetDiscoveredResourceCountsGroupByResourceTypeResponse getDiscoveredResourceCountsGroupByResourceType(GetDiscoveredResourceCountsGroupByResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDiscoveredResourceCountsGroupByResourceTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the integration status of a specific cloud service.</p>
     * 
     * @param request GetIntegratedServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIntegratedServiceStatusResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the integration status of a specific cloud service.</p>
     * 
     * @param request GetIntegratedServiceStatusRequest
     * @return GetIntegratedServiceStatusResponse
     */
    public GetIntegratedServiceStatusResponse getIntegratedServiceStatus(GetIntegratedServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIntegratedServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the managed rule <code>cdn-domain-https-enabled</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specific managed rule.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the managed rule <code>cdn-domain-https-enabled</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specific managed rule.</p>
     * 
     * @param request GetManagedRuleRequest
     * @return GetManagedRuleResponse
     */
    public GetManagedRuleResponse getManagedRule(GetManagedRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getManagedRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the automatic remediation template ACS-ALB-BulkyEnableDeletionProtection.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an automatic remediation template.</p>
     * 
     * @param request GetRemediationTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRemediationTemplateResponse
     */
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

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the details of the automatic remediation template ACS-ALB-BulkyEnableDeletionProtection.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of an automatic remediation template.</p>
     * 
     * @param request GetRemediationTemplateRequest
     * @return GetRemediationTemplateResponse
     */
    public GetRemediationTemplateResponse getRemediationTemplate(GetRemediationTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRemediationTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取基于报告模版生成的报告</p>
     * 
     * @param request GetReportFromTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReportFromTemplateResponse
     */
    public GetReportFromTemplateResponse getReportFromTemplateWithOptions(GetReportFromTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportTemplateId)) {
            query.put("ReportTemplateId", request.reportTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReportFromTemplate"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReportFromTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取基于报告模版生成的报告</p>
     * 
     * @param request GetReportFromTemplateRequest
     * @return GetReportFromTemplateResponse
     */
    public GetReportFromTemplateResponse getReportFromTemplate(GetReportFromTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getReportFromTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this topic, the <code>cr-d369626622af008e****</code> rule is used as an example. The return result shows that a total of 10 resources are evaluated by the rule and <code>five</code> of them are evaluated as compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance summary based on the compliance evaluation result of a rule.</p>
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
     * <b>description</b> :
     * <p>In this topic, the <code>cr-d369626622af008e****</code> rule is used as an example. The return result shows that a total of 10 resources are evaluated by the rule and <code>five</code> of them are evaluated as compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance summary based on the compliance evaluation result of a rule.</p>
     * 
     * @param request GetResourceComplianceByConfigRuleRequest
     * @return GetResourceComplianceByConfigRuleResponse
     */
    public GetResourceComplianceByConfigRuleResponse getResourceComplianceByConfigRule(GetResourceComplianceByConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceComplianceByConfigRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of resources monitored by using the <code>cp-541e626622af0087****</code> compliance package. The returned result shows a total of 10 resources and seven of them are evaluated as non-compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of resources evaluated based on a compliance package.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of resources monitored by using the <code>cp-541e626622af0087****</code> compliance package. The returned result shows a total of 10 resources and seven of them are evaluated as non-compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of resources evaluated based on a compliance package.</p>
     * 
     * @param request GetResourceComplianceByPackRequest
     * @return GetResourceComplianceByPackResponse
     */
    public GetResourceComplianceByPackResponse getResourceComplianceByPack(GetResourceComplianceByPackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceComplianceByPackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the evaluation results grouped by region for a rule.</p>
     * 
     * @param request GetResourceComplianceGroupByRegionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceComplianceGroupByRegionResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the evaluation results grouped by region for a rule.</p>
     * 
     * @param request GetResourceComplianceGroupByRegionRequest
     * @return GetResourceComplianceGroupByRegionResponse
     */
    public GetResourceComplianceGroupByRegionResponse getResourceComplianceGroupByRegion(GetResourceComplianceGroupByRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceComplianceGroupByRegionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the evaluation results grouped by resource type for a rule.</p>
     * 
     * @param request GetResourceComplianceGroupByResourceTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceComplianceGroupByResourceTypeResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the evaluation results grouped by resource type for a rule.</p>
     * 
     * @param request GetResourceComplianceGroupByResourceTypeRequest
     * @return GetResourceComplianceGroupByResourceTypeResponse
     */
    public GetResourceComplianceGroupByResourceTypeResponse getResourceComplianceGroupByResourceType(GetResourceComplianceGroupByResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceComplianceGroupByResourceTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In Cloud Config, each resource has a compliance timeline. Cloud Config generates a compliance evaluation record for a resource each time the resource is evaluated based on a rule. The compliance evaluation records of a resource are displayed in a compliance timeline. You can configure Cloud Config to execute a rule to evaluate a resource on a regular basis or each time you change the resource configuration. You can also manually execute a rule to evaluate a resource.
     * This topic provides an example on how to query the compliance timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region. The resource is an Object Storage Service (OSS) bucket. The returned result shows the following two timestamps on the compliance timeline: <code>1625200295276</code> and <code>1625200228510</code>. The first timestamp indicates 12:31:35 on July 2, 2021 (UTC+8) and the second timestamp indicates 12:30:28 on July 2, 2021 (UTC+8).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance timeline of a resource. The compliance timeline of a resource indicates the compliance evaluation record of the resource. A compliance timeline includes points and the content on the compliance timeline.</p>
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
     * <b>description</b> :
     * <p>In Cloud Config, each resource has a compliance timeline. Cloud Config generates a compliance evaluation record for a resource each time the resource is evaluated based on a rule. The compliance evaluation records of a resource are displayed in a compliance timeline. You can configure Cloud Config to execute a rule to evaluate a resource on a regular basis or each time you change the resource configuration. You can also manually execute a rule to evaluate a resource.
     * This topic provides an example on how to query the compliance timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region. The resource is an Object Storage Service (OSS) bucket. The returned result shows the following two timestamps on the compliance timeline: <code>1625200295276</code> and <code>1625200228510</code>. The first timestamp indicates 12:31:35 on July 2, 2021 (UTC+8) and the second timestamp indicates 12:30:28 on July 2, 2021 (UTC+8).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance timeline of a resource. The compliance timeline of a resource indicates the compliance evaluation record of the resource. A compliance timeline includes points and the content on the compliance timeline.</p>
     * 
     * @param request GetResourceComplianceTimelineRequest
     * @return GetResourceComplianceTimelineResponse
     */
    public GetResourceComplianceTimelineResponse getResourceComplianceTimeline(GetResourceComplianceTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceComplianceTimelineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源配置样例</p>
     * 
     * @param request GetResourceConfigurationSampleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceConfigurationSampleResponse
     */
    public GetResourceConfigurationSampleResponse getResourceConfigurationSampleWithOptions(GetResourceConfigurationSampleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mockOnly)) {
            query.put("MockOnly", request.mockOnly);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceConfigurationSample"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceConfigurationSampleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源配置样例</p>
     * 
     * @param request GetResourceConfigurationSampleRequest
     * @return GetResourceConfigurationSampleResponse
     */
    public GetResourceConfigurationSampleResponse getResourceConfigurationSample(GetResourceConfigurationSampleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceConfigurationSampleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the configuration timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows that the timestamp when the resource configuration changes is <code>1624961112000</code>. The timestamp indicates 18:05:12 on June 29, 2021 (UTC+8).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration timeline of a resource.</p>
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
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query the configuration timeline of the <code>new-bucket</code> resource that resides in the <code>cn-hangzhou</code> region. The new-bucket resource is an Object Storage Service (OSS) bucket. The return result shows that the timestamp when the resource configuration changes is <code>1624961112000</code>. The timestamp indicates 18:05:12 on June 29, 2021 (UTC+8).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration timeline of a resource.</p>
     * 
     * @param request GetResourceConfigurationTimelineRequest
     * @return GetResourceConfigurationTimelineResponse
     */
    public GetResourceConfigurationTimelineResponse getResourceConfigurationTimeline(GetResourceConfigurationTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceConfigurationTimelineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2398354.html">GenerateResourceInventory</a> operation to generate a resource inventory. Then, you can call the GetResourceInventory operation to obtain the URL of the resource inventory.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to obtain the last resource inventory that is generated within the current Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the last resource inventory that is generated within the current Alibaba Cloud account.</p>
     * 
     * @param request GetResourceInventoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceInventoryResponse
     */
    public GetResourceInventoryResponse getResourceInventoryWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceInventory"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceInventoryResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2398354.html">GenerateResourceInventory</a> operation to generate a resource inventory. Then, you can call the GetResourceInventory operation to obtain the URL of the resource inventory.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to obtain the last resource inventory that is generated within the current Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains the last resource inventory that is generated within the current Alibaba Cloud account.</p>
     * @return GetResourceInventoryResponse
     */
    public GetResourceInventoryResponse getResourceInventory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceInventoryWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源类型的属性配置</p>
     * 
     * @param request GetResourceTypePropertiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetResourceTypePropertiesResponse
     */
    public GetResourceTypePropertiesResponse getResourceTypePropertiesWithOptions(GetResourceTypePropertiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetResourceTypeProperties"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetResourceTypePropertiesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源类型的属性配置</p>
     * 
     * @param request GetResourceTypePropertiesRequest
     * @return GetResourceTypePropertiesResponse
     */
    public GetResourceTypePropertiesResponse getResourceTypeProperties(GetResourceTypePropertiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceTypePropertiesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example to show how to query the resource relationships that are supported by the ACS::ECS::Instance resource type.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource relationships supported by a resource type.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example to show how to query the resource relationships that are supported by the ACS::ECS::Instance resource type.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource relationships supported by a resource type.</p>
     * 
     * @param request GetSupportedResourceRelationConfigRequest
     * @return GetSupportedResourceRelationConfigResponse
     */
    public GetSupportedResourceRelationConfigResponse getSupportedResourceRelationConfig(GetSupportedResourceRelationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSupportedResourceRelationConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you ignore a resource that is evaluated as incompliant by using a rule, the resource is still evaluated by using the rule, but the compliance result is Ignored.
     * This example shows how to ignore the <code>lb-hp3a3b4ztyfm2plgm****</code> incompliant resource that is evaluated by using the <code>cr-7e72626622af0051***</code> rule in the <code>120886317861****</code> member account of the <code>ca-5b6c626622af008f****</code> account group. The ID of the region where the resource resides is <code>cn-beijing</code>, and the type of the resource is <code>ACS::SLB::LoadBalancer</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Ignores the evaluation results of some resources in an account group based on a specific rule. You can also specify a time period for ignoring the evaluation results. After the period elapses, the evaluation results of the resources based on the rule are automatically displayed.</p>
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
     * <b>description</b> :
     * <p>After you ignore a resource that is evaluated as incompliant by using a rule, the resource is still evaluated by using the rule, but the compliance result is Ignored.
     * This example shows how to ignore the <code>lb-hp3a3b4ztyfm2plgm****</code> incompliant resource that is evaluated by using the <code>cr-7e72626622af0051***</code> rule in the <code>120886317861****</code> member account of the <code>ca-5b6c626622af008f****</code> account group. The ID of the region where the resource resides is <code>cn-beijing</code>, and the type of the resource is <code>ACS::SLB::LoadBalancer</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Ignores the evaluation results of some resources in an account group based on a specific rule. You can also specify a time period for ignoring the evaluation results. After the period elapses, the evaluation results of the resources based on the rule are automatically displayed.</p>
     * 
     * @param request IgnoreAggregateEvaluationResultsRequest
     * @return IgnoreAggregateEvaluationResultsResponse
     */
    public IgnoreAggregateEvaluationResultsResponse ignoreAggregateEvaluationResults(IgnoreAggregateEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ignoreAggregateEvaluationResultsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>After you ignore a resource that is evaluated as incompliant by using a rule, the resource is still evaluated by using the rule, but the compliance result is Ignored.
     * This example shows how to ignore the <code>lb-hp3a3b4ztyfm2plgm****</code> resource that is evaluated as incompliant by using the <code>cr-7e72626622af0051****</code> rule in the <code>100931896542****</code> account. The ID of the region in which the resource resides is <code>cn-beijing</code>, and the type of the resource is <code>ACS::SLB::LoadBalancer</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Ignores the evaluation results of some resources based on a specific rule. You can also specify a time period for ignoring the evaluation results. After the period elapses, the evaluation results of the resources based on the rule are automatically displayed.</p>
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
     * <b>description</b> :
     * <p>After you ignore a resource that is evaluated as incompliant by using a rule, the resource is still evaluated by using the rule, but the compliance result is Ignored.
     * This example shows how to ignore the <code>lb-hp3a3b4ztyfm2plgm****</code> resource that is evaluated as incompliant by using the <code>cr-7e72626622af0051****</code> rule in the <code>100931896542****</code> account. The ID of the region in which the resource resides is <code>cn-beijing</code>, and the type of the resource is <code>ACS::SLB::LoadBalancer</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Ignores the evaluation results of some resources based on a specific rule. You can also specify a time period for ignoring the evaluation results. After the period elapses, the evaluation results of the resources based on the rule are automatically displayed.</p>
     * 
     * @param request IgnoreEvaluationResultsRequest
     * @return IgnoreEvaluationResultsResponse
     */
    public IgnoreEvaluationResultsResponse ignoreEvaluationResults(IgnoreEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.ignoreEvaluationResultsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this topic, the <code>ca-f632626622af0079****</code> account group is used as an example. The return result shows one compliance package whose ID is <code>cp-fdc8626622af00f9****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of compliance packages in an account group.</p>
     * 
     * @param tmpReq ListAggregateCompliancePacksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAggregateCompliancePacksResponse
     */
    public ListAggregateCompliancePacksResponse listAggregateCompliancePacksWithOptions(ListAggregateCompliancePacksRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAggregateCompliancePacksShrinkRequest request = new ListAggregateCompliancePacksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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
     * <b>description</b> :
     * <p>In this topic, the <code>ca-f632626622af0079****</code> account group is used as an example. The return result shows one compliance package whose ID is <code>cp-fdc8626622af00f9****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of compliance packages in an account group.</p>
     * 
     * @param request ListAggregateCompliancePacksRequest
     * @return ListAggregateCompliancePacksResponse
     */
    public ListAggregateCompliancePacksResponse listAggregateCompliancePacks(ListAggregateCompliancePacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateCompliancePacksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all delivery channels in an account group.</p>
     * 
     * @param request ListAggregateConfigDeliveryChannelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAggregateConfigDeliveryChannelsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries the information about all delivery channels in an account group.</p>
     * 
     * @param request ListAggregateConfigDeliveryChannelsRequest
     * @return ListAggregateConfigDeliveryChannelsResponse
     */
    public ListAggregateConfigDeliveryChannelsResponse listAggregateConfigDeliveryChannels(ListAggregateConfigDeliveryChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateConfigDeliveryChannelsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of resources based on the <code>cr-888f626622af00ae****</code> rule in the <code>ca-d1e3326622af00cb****</code> account group. The returned result indicates that the <code>Bucket-test</code> resource is evaluated as <code>NON_COMPLIANT</code> by using the rule. The resource is an Object Storage Service (OSS) bucket.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of resources based on a rule in an account group.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation results of resources based on the <code>cr-888f626622af00ae****</code> rule in the <code>ca-d1e3326622af00cb****</code> account group. The returned result indicates that the <code>Bucket-test</code> resource is evaluated as <code>NON_COMPLIANT</code> by using the rule. The resource is an Object Storage Service (OSS) bucket.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of resources based on a rule in an account group.</p>
     * 
     * @param request ListAggregateConfigRuleEvaluationResultsRequest
     * @return ListAggregateConfigRuleEvaluationResultsResponse
     */
    public ListAggregateConfigRuleEvaluationResultsResponse listAggregateConfigRuleEvaluationResults(ListAggregateConfigRuleEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateConfigRuleEvaluationResultsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics of compliance evaluation results of an account group whose ID is ca-edd3626622af00b3\<em>\</em>\<em>\</em>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics of compliance evaluation results of an account group.</p>
     * 
     * @param request ListAggregateConfigRuleEvaluationStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAggregateConfigRuleEvaluationStatisticsResponse
     */
    public ListAggregateConfigRuleEvaluationStatisticsResponse listAggregateConfigRuleEvaluationStatisticsWithOptions(ListAggregateConfigRuleEvaluationStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAggregateConfigRuleEvaluationStatistics"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggregateConfigRuleEvaluationStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the statistics of compliance evaluation results of an account group whose ID is ca-edd3626622af00b3\<em>\</em>\<em>\</em>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statistics of compliance evaluation results of an account group.</p>
     * 
     * @param request ListAggregateConfigRuleEvaluationStatisticsRequest
     * @return ListAggregateConfigRuleEvaluationStatisticsResponse
     */
    public ListAggregateConfigRuleEvaluationStatisticsResponse listAggregateConfigRuleEvaluationStatistics(ListAggregateConfigRuleEvaluationStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateConfigRuleEvaluationStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the rules in an account group whose ID is <code>ca-f632626622af0079****</code>. The returned result shows a total of one rule and two evaluated resources. The resources are both evaluated as <code>COMPLIANT</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of rules in an account group.</p>
     * 
     * @param tmpReq ListAggregateConfigRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAggregateConfigRulesResponse
     */
    public ListAggregateConfigRulesResponse listAggregateConfigRulesWithOptions(ListAggregateConfigRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAggregateConfigRulesShrinkRequest request = new ListAggregateConfigRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the rules in an account group whose ID is <code>ca-f632626622af0079****</code>. The returned result shows a total of one rule and two evaluated resources. The resources are both evaluated as <code>COMPLIANT</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of rules in an account group.</p>
     * 
     * @param request ListAggregateConfigRulesRequest
     * @return ListAggregateConfigRulesResponse
     */
    public ListAggregateConfigRulesResponse listAggregateConfigRules(ListAggregateConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the resources within the member account <code>100931896542****</code> of the account group <code>ca-c560626622af0005****</code>. The result indicates that eight resources are queried.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a list of resources aggregated across regions within all member accounts of a specific account group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.endUpdateTimestamp)) {
            query.put("EndUpdateTimestamp", request.endUpdateTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceTypes)) {
            query.put("ExcludeResourceTypes", request.excludeResourceTypes);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startUpdateTimestamp)) {
            query.put("StartUpdateTimestamp", request.startUpdateTimestamp);
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the resources within the member account <code>100931896542****</code> of the account group <code>ca-c560626622af0005****</code>. The result indicates that eight resources are queried.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a list of resources aggregated across regions within all member accounts of a specific account group.</p>
     * 
     * @param request ListAggregateDiscoveredResourcesRequest
     * @return ListAggregateDiscoveredResourcesResponse
     */
    public ListAggregateDiscoveredResourcesResponse listAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateDiscoveredResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取推荐的托管规则列表-多账号</p>
     * 
     * @param request ListAggregateRecommendManagedRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAggregateRecommendManagedRulesResponse
     */
    public ListAggregateRecommendManagedRulesResponse listAggregateRecommendManagedRulesWithOptions(ListAggregateRecommendManagedRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeRegionIdsScope)) {
            query.put("ExcludeRegionIdsScope", request.excludeRegionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceGroupIdsScope)) {
            query.put("ExcludeResourceGroupIdsScope", request.excludeResourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            query.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            query.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            query.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsScope)) {
            query.put("ResourceIdsScope", request.resourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectedManagedRuleIdentifiers)) {
            query.put("SelectedManagedRuleIdentifiers", request.selectedManagedRuleIdentifiers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAggregateRecommendManagedRules"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggregateRecommendManagedRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取推荐的托管规则列表-多账号</p>
     * 
     * @param request ListAggregateRecommendManagedRulesRequest
     * @return ListAggregateRecommendManagedRulesResponse
     */
    public ListAggregateRecommendManagedRulesResponse listAggregateRecommendManagedRules(ListAggregateRecommendManagedRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateRecommendManagedRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation records of the <code>cr-d04a626622af00af****</code> rule in the <code>ca-edd3626622af00b3****</code> account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the remediation records of a rule in an account group.</p>
     * 
     * @param request ListAggregateRemediationExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAggregateRemediationExecutionsResponse
     */
    public ListAggregateRemediationExecutionsResponse listAggregateRemediationExecutionsWithOptions(ListAggregateRemediationExecutionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceAccountId)) {
            query.put("ResourceAccountId", request.resourceAccountId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAggregateRemediationExecutions"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggregateRemediationExecutionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation records of the <code>cr-d04a626622af00af****</code> rule in the <code>ca-edd3626622af00b3****</code> account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the remediation records of a rule in an account group.</p>
     * 
     * @param request ListAggregateRemediationExecutionsRequest
     * @return ListAggregateRemediationExecutionsResponse
     */
    public ListAggregateRemediationExecutionsResponse listAggregateRemediationExecutions(ListAggregateRemediationExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateRemediationExecutionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation templates of the rule whose ID is <code>cr-6b7c626622af00b4****</code> in the account group whose ID is <code>ca-6b4a626622af0012****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of remediation templates for a rule in an account group.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation templates of the rule whose ID is <code>cr-6b7c626622af00b4****</code> in the account group whose ID is <code>ca-6b4a626622af0012****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of remediation templates for a rule in an account group.</p>
     * 
     * @param request ListAggregateRemediationsRequest
     * @return ListAggregateRemediationsResponse
     */
    public ListAggregateRemediationsResponse listAggregateRemediations(ListAggregateRemediationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateRemediationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This example shows how to query the compliance evaluation result of the <code>23642660635396****</code> resource in the <code>ca-7f00626622af0041****</code> account group. The resource is a RAM user. The returned result indicates that the resource is evaluated as <code>NON_COMPLIANT</code> by using the <code>cr-7f7d626622af0041****</code> rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of resources in an account group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
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
     * <b>description</b> :
     * <p>This example shows how to query the compliance evaluation result of the <code>23642660635396****</code> resource in the <code>ca-7f00626622af0041****</code> account group. The resource is a RAM user. The returned result indicates that the resource is evaluated as <code>NON_COMPLIANT</code> by using the <code>cr-7f7d626622af0041****</code> rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of resources in an account group.</p>
     * 
     * @param request ListAggregateResourceEvaluationResultsRequest
     * @return ListAggregateResourceEvaluationResultsResponse
     */
    public ListAggregateResourceEvaluationResultsResponse listAggregateResourceEvaluationResults(ListAggregateResourceEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateResourceEvaluationResultsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the disks that are associated with an Elastic Compute Service (ECS) instance in an account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of the resources of a specific resource in an account group.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the disks that are associated with an Elastic Compute Service (ECS) instance in an account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of the resources of a specific resource in an account group.</p>
     * 
     * @param request ListAggregateResourceRelationsRequest
     * @return ListAggregateResourceRelationsResponse
     */
    public ListAggregateResourceRelationsResponse listAggregateResourceRelations(ListAggregateResourceRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateResourceRelationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you write a <code>SELECT</code> statement, you must obtain the fields and the data types of the fields from the property file of the resource type. For more information about property files, see<a href="https://github.com/aliyun/alibabacloud-config-resource-schema"> Alibaba Cloud Config Resource Schema</a></p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each resource type supported by Cloud Config has a property file. Property files are named based on the related resource types. For example, the property file of the <code>ACS::ECS::Instance</code> resource type is named <code>ACS_ECS_Instance.properties.json</code>. Property files of different resource types are placed under the <code>config/properties/resource-types</code> path.</li>
     * <li>For more information about the examples and limits on SQL query statements, see <a href="https://help.aliyun.com/document_detail/398718.html">Examples of SQL query statements</a> and <a href="https://help.aliyun.com/document_detail/398750.html">Limits on SQL query statements</a>.
     * This topic provides an example on how to obtain all resources whose tag key is <code>business</code> and whose tag value is <code>online</code> in the account group <code>ca-4b05626622af000c****</code> by using the advanced search feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains resources in a specific account group based on the fields in the resource properties by using a SELECT statement.</p>
     * 
     * @param request ListAggregateResourcesByAdvancedSearchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAggregateResourcesByAdvancedSearchResponse
     */
    public ListAggregateResourcesByAdvancedSearchResponse listAggregateResourcesByAdvancedSearchWithOptions(ListAggregateResourcesByAdvancedSearchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorId)) {
            query.put("AggregatorId", request.aggregatorId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            query.put("Sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAggregateResourcesByAdvancedSearch"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAggregateResourcesByAdvancedSearchResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you write a <code>SELECT</code> statement, you must obtain the fields and the data types of the fields from the property file of the resource type. For more information about property files, see<a href="https://github.com/aliyun/alibabacloud-config-resource-schema"> Alibaba Cloud Config Resource Schema</a></p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each resource type supported by Cloud Config has a property file. Property files are named based on the related resource types. For example, the property file of the <code>ACS::ECS::Instance</code> resource type is named <code>ACS_ECS_Instance.properties.json</code>. Property files of different resource types are placed under the <code>config/properties/resource-types</code> path.</li>
     * <li>For more information about the examples and limits on SQL query statements, see <a href="https://help.aliyun.com/document_detail/398718.html">Examples of SQL query statements</a> and <a href="https://help.aliyun.com/document_detail/398750.html">Limits on SQL query statements</a>.
     * This topic provides an example on how to obtain all resources whose tag key is <code>business</code> and whose tag value is <code>online</code> in the account group <code>ca-4b05626622af000c****</code> by using the advanced search feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains resources in a specific account group based on the fields in the resource properties by using a SELECT statement.</p>
     * 
     * @param request ListAggregateResourcesByAdvancedSearchRequest
     * @return ListAggregateResourcesByAdvancedSearchResponse
     */
    public ListAggregateResourcesByAdvancedSearchResponse listAggregateResourcesByAdvancedSearch(ListAggregateResourcesByAdvancedSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateResourcesByAdvancedSearchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query account groups. A maximum of 10 entries can be returned for the request. As shown in the responses, the account group returned is named as <code>Test_Group</code>, its description is <code>Test account group</code>, and it is of the <code>CUSTOM</code> type, which indicates a custom account group. The account group contains two member accounts.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all account groups within the current management account or delegated administrator account.</p>
     * 
     * @param tmpReq ListAggregatorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAggregatorsResponse
     */
    public ListAggregatorsResponse listAggregatorsWithOptions(ListAggregatorsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListAggregatorsShrinkRequest request = new ListAggregatorsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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
     * <b>description</b> :
     * <p>The sample request in this topic shows you how to query account groups. A maximum of 10 entries can be returned for the request. As shown in the responses, the account group returned is named as <code>Test_Group</code>, its description is <code>Test account group</code>, and it is of the <code>CUSTOM</code> type, which indicates a custom account group. The account group contains two member accounts.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all account groups within the current management account or delegated administrator account.</p>
     * 
     * @param request ListAggregatorsRequest
     * @return ListAggregatorsResponse
     */
    public ListAggregatorsResponse listAggregators(ListAggregatorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregatorsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A compliance package template is a collection of rules that Cloud Config can create based on compliance scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all compliance package templates provided by Cloud Config and the details of the compliance package templates.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.filterType)) {
            query.put("FilterType", request.filterType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.ruleRiskLevel)) {
            query.put("RuleRiskLevel", request.ruleRiskLevel);
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
     * <b>description</b> :
     * <p>A compliance package template is a collection of rules that Cloud Config can create based on compliance scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all compliance package templates provided by Cloud Config and the details of the compliance package templates.</p>
     * 
     * @param request ListCompliancePackTemplatesRequest
     * @return ListCompliancePackTemplatesResponse
     */
    public ListCompliancePackTemplatesResponse listCompliancePackTemplates(ListCompliancePackTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCompliancePackTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query compliance packages. The return result shows the details of the <code>cp-fdc8626622af00f9****</code> compliance package.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of compliance packages.</p>
     * 
     * @param tmpReq ListCompliancePacksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCompliancePacksResponse
     */
    public ListCompliancePacksResponse listCompliancePacksWithOptions(ListCompliancePacksRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListCompliancePacksShrinkRequest request = new ListCompliancePacksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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
     * <b>description</b> :
     * <p>This topic provides an example of how to query compliance packages. The return result shows the details of the <code>cp-fdc8626622af00f9****</code> compliance package.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of compliance packages.</p>
     * 
     * @param request ListCompliancePacksRequest
     * @return ListCompliancePacksResponse
     */
    public ListCompliancePacksResponse listCompliancePacks(ListCompliancePacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCompliancePacksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of delivery channels.</p>
     * 
     * @param request ListConfigDeliveryChannelsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConfigDeliveryChannelsResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries a list of delivery channels.</p>
     * 
     * @param request ListConfigDeliveryChannelsRequest
     * @return ListConfigDeliveryChannelsResponse
     */
    public ListConfigDeliveryChannelsResponse listConfigDeliveryChannels(ListConfigDeliveryChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigDeliveryChannelsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation result of resources based on a rule whose ID is <code>cr-cac56457e0d900d3****</code>. The returned result indicates that the <code>i-hp3e4kvhzqn2s11t****</code> resource is evaluated as <code>NON_COMPLIANT</code> by using the rule. The resource is an Elastic Compute Service (ECS) instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of resources based on a rule.</p>
     * 
     * @param request ListConfigRuleEvaluationResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConfigRuleEvaluationResultsResponse
     */
    public ListConfigRuleEvaluationResultsResponse listConfigRuleEvaluationResultsWithOptions(ListConfigRuleEvaluationResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIds)) {
            query.put("ResourceGroupIds", request.resourceGroupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigRuleEvaluationResults"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigRuleEvaluationResultsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the compliance evaluation result of resources based on a rule whose ID is <code>cr-cac56457e0d900d3****</code>. The returned result indicates that the <code>i-hp3e4kvhzqn2s11t****</code> resource is evaluated as <code>NON_COMPLIANT</code> by using the rule. The resource is an Elastic Compute Service (ECS) instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of resources based on a rule.</p>
     * 
     * @param request ListConfigRuleEvaluationResultsRequest
     * @return ListConfigRuleEvaluationResultsResponse
     */
    public ListConfigRuleEvaluationResultsResponse listConfigRuleEvaluationResults(ListConfigRuleEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigRuleEvaluationResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of compliance evaluation results of the current Alibaba Cloud account.</p>
     * 
     * @param request ListConfigRuleEvaluationStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConfigRuleEvaluationStatisticsResponse
     */
    public ListConfigRuleEvaluationStatisticsResponse listConfigRuleEvaluationStatisticsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigRuleEvaluationStatistics"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigRuleEvaluationStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the statistics of compliance evaluation results of the current Alibaba Cloud account.</p>
     * @return ListConfigRuleEvaluationStatisticsResponse
     */
    public ListConfigRuleEvaluationStatisticsResponse listConfigRuleEvaluationStatistics() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigRuleEvaluationStatisticsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>规则支持的操作符列表</p>
     * 
     * @param request ListConfigRuleOperatorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConfigRuleOperatorsResponse
     */
    public ListConfigRuleOperatorsResponse listConfigRuleOperatorsWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListConfigRuleOperators"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListConfigRuleOperatorsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>规则支持的操作符列表</p>
     * @return ListConfigRuleOperatorsResponse
     */
    public ListConfigRuleOperatorsResponse listConfigRuleOperators() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigRuleOperatorsWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the rules of the current account. The response shows that the current account has a total of one rule and three evaluated resources. The resources are evaluated as compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the rules of the current account.</p>
     * 
     * @param tmpReq ListConfigRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListConfigRulesResponse
     */
    public ListConfigRulesResponse listConfigRulesWithOptions(ListConfigRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListConfigRulesShrinkRequest request = new ListConfigRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compliancePackId)) {
            query.put("CompliancePackId", request.compliancePackId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the rules of the current account. The response shows that the current account has a total of one rule and three evaluated resources. The resources are evaluated as compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the rules of the current account.</p>
     * 
     * @param request ListConfigRulesRequest
     * @return ListConfigRulesResponse
     */
    public ListConfigRulesResponse listConfigRules(ListConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to call the ListDiscoveredResources operation to query the resources in the current Alibaba Cloud account. The returned result indicates that a total of eight resources exist in the account.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a list of resources aggregated across regions within an Alibaba Cloud account.</p>
     * 
     * @param request ListDiscoveredResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDiscoveredResourcesResponse
     */
    public ListDiscoveredResourcesResponse listDiscoveredResourcesWithOptions(ListDiscoveredResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endUpdateTimestamp)) {
            query.put("EndUpdateTimestamp", request.endUpdateTimestamp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceTypes)) {
            query.put("ExcludeResourceTypes", request.excludeResourceTypes);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceDeleted)) {
            query.put("ResourceDeleted", request.resourceDeleted);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceTypes)) {
            query.put("ResourceTypes", request.resourceTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startUpdateTimestamp)) {
            query.put("StartUpdateTimestamp", request.startUpdateTimestamp);
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
     * <b>description</b> :
     * <p>This topic provides an example on how to call the ListDiscoveredResources operation to query the resources in the current Alibaba Cloud account. The returned result indicates that a total of eight resources exist in the account.</p>
     * 
     * <b>summary</b> : 
     * <p>Obtains a list of resources aggregated across regions within an Alibaba Cloud account.</p>
     * 
     * @param request ListDiscoveredResourcesRequest
     * @return ListDiscoveredResourcesResponse
     */
    public ListDiscoveredResourcesResponse listDiscoveredResources(ListDiscoveredResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDiscoveredResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the cloud services that can be integrated by the current Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of cloud services that are integrated with Cloud Config and the status of each cloud service.</p>
     * 
     * @param request ListIntegratedServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIntegratedServiceResponse
     */
    public ListIntegratedServiceResponse listIntegratedServiceWithOptions(com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIntegratedService"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIntegratedServiceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the cloud services that can be integrated by the current Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of cloud services that are integrated with Cloud Config and the status of each cloud service.</p>
     * @return ListIntegratedServiceResponse
     */
    public ListIntegratedServiceResponse listIntegratedService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntegratedServiceWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Background information</h3>
     * <p>For more information about how to define, execute, and integrate a managed rule, see <a href="https://help.aliyun.com/document_detail/128273.html">Definition and execution of rules</a>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to query all managed rules whose keyword is <code>CDN</code>. The response shows that 21 managed rules exist.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of managed rules supported by Cloud Config.</p>
     * 
     * @param request ListManagedRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListManagedRulesResponse
     */
    public ListManagedRulesResponse listManagedRulesWithOptions(ListManagedRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.filterType)) {
            query.put("FilterType", request.filterType);
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
     * <b>description</b> :
     * <h3><a href="#"></a>Background information</h3>
     * <p>For more information about how to define, execute, and integrate a managed rule, see <a href="https://help.aliyun.com/document_detail/128273.html">Definition and execution of rules</a>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to query all managed rules whose keyword is <code>CDN</code>. The response shows that 21 managed rules exist.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of managed rules supported by Cloud Config.</p>
     * 
     * @param request ListManagedRulesRequest
     * @return ListManagedRulesResponse
     */
    public ListManagedRulesResponse listManagedRules(ListManagedRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listManagedRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about how to define, execute, and integrate an evaluation rule, see <a href="https://help.aliyun.com/document_detail/470802.html">Definition and execution of evaluation rules</a>.
     * After you create an evaluation rule, a managed rule that has the same settings as the evaluation rule is created. After you create a resource, the managed rule can be used to continuously check the compliance of the resource.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of evaluation rules supported by Cloud Config.</p>
     * 
     * @param tmpReq ListPreManagedRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPreManagedRulesResponse
     */
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

    /**
     * <b>description</b> :
     * <p>For more information about how to define, execute, and integrate an evaluation rule, see <a href="https://help.aliyun.com/document_detail/470802.html">Definition and execution of evaluation rules</a>.
     * After you create an evaluation rule, a managed rule that has the same settings as the evaluation rule is created. After you create a resource, the managed rule can be used to continuously check the compliance of the resource.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of evaluation rules supported by Cloud Config.</p>
     * 
     * @param request ListPreManagedRulesRequest
     * @return ListPreManagedRulesResponse
     */
    public ListPreManagedRulesResponse listPreManagedRules(ListPreManagedRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPreManagedRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取推荐的托管规则列表</p>
     * 
     * @param request ListRecommendManagedRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRecommendManagedRulesResponse
     */
    public ListRecommendManagedRulesResponse listRecommendManagedRulesWithOptions(ListRecommendManagedRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeRegionIdsScope)) {
            query.put("ExcludeRegionIdsScope", request.excludeRegionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceGroupIdsScope)) {
            query.put("ExcludeResourceGroupIdsScope", request.excludeResourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            query.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            query.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            query.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsScope)) {
            query.put("ResourceIdsScope", request.resourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectedManagedRuleIdentifiers)) {
            query.put("SelectedManagedRuleIdentifiers", request.selectedManagedRuleIdentifiers);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRecommendManagedRules"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRecommendManagedRulesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取推荐的托管规则列表</p>
     * 
     * @param request ListRecommendManagedRulesRequest
     * @return ListRecommendManagedRulesResponse
     */
    public ListRecommendManagedRulesResponse listRecommendManagedRules(ListRecommendManagedRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecommendManagedRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation records of the rule cr-5392626622af0000\<em>\</em>\<em>\</em>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the remediation records of a rule.</p>
     * 
     * @param request ListRemediationExecutionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRemediationExecutionsResponse
     */
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

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation records of the rule cr-5392626622af0000\<em>\</em>\<em>\</em>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the remediation records of a rule.</p>
     * 
     * @param request ListRemediationExecutionsRequest
     * @return ListRemediationExecutionsResponse
     */
    public ListRemediationExecutionsResponse listRemediationExecutions(ListRemediationExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRemediationExecutionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this topic, the <code>oss-bucket-public-write-prohibited</code> managed rule is used as an example. The return result shows the details of the remediation template of the <code>OOS</code> type for the managed rule. OOS represents Operation Orchestration Service.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of remediation templates for a managed rule.</p>
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
     * <b>description</b> :
     * <p>In this topic, the <code>oss-bucket-public-write-prohibited</code> managed rule is used as an example. The return result shows the details of the remediation template of the <code>OOS</code> type for the managed rule. OOS represents Operation Orchestration Service.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of remediation templates for a managed rule.</p>
     * 
     * @param request ListRemediationTemplatesRequest
     * @return ListRemediationTemplatesResponse
     */
    public ListRemediationTemplatesResponse listRemediationTemplates(ListRemediationTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRemediationTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation templates for the rule whose ID is <code>cr-6b7c626622af00b4****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the execution of remediation templates.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to query the remediation templates for the rule whose ID is <code>cr-6b7c626622af00b4****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the execution of remediation templates.</p>
     * 
     * @param request ListRemediationsRequest
     * @return ListRemediationsResponse
     */
    public ListRemediationsResponse listRemediations(ListRemediationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRemediationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the compliance evaluation result of the <code>23642660635396****</code> resource is queried and the resource is a RAM user. The returned result indicates that the resource is evaluated as <code>NON_COMPLIANT</code> by using the <code>cr-7f7d626622af0041****</code> rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of resources.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.riskLevel)) {
            query.put("RiskLevel", request.riskLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortBy)) {
            query.put("SortBy", request.sortBy);
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
     * <b>description</b> :
     * <p>In this example, the compliance evaluation result of the <code>23642660635396****</code> resource is queried and the resource is a RAM user. The returned result indicates that the resource is evaluated as <code>NON_COMPLIANT</code> by using the <code>cr-7f7d626622af0041****</code> rule.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of resources.</p>
     * 
     * @param request ListResourceEvaluationResultsRequest
     * @return ListResourceEvaluationResultsResponse
     */
    public ListResourceEvaluationResultsResponse listResourceEvaluationResults(ListResourceEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceEvaluationResultsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the Alibaba Cloud services and resource types supported by Cloud Config, see <a href="https://help.aliyun.com/document_detail/127411.html">Alibaba Cloud services and resource types supported by Cloud Config</a>.
     * This topic provides an example on how to query the information about the disks that are attached to an Elastic Compute Service (ECS) instance named <code>i-j6cajg9yrfoh4sas****</code> that is created by the current Alibaba Cloud account in the China (Shanghai) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of resources that associate with a specific resource.</p>
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
     * <b>description</b> :
     * <p>For information about the Alibaba Cloud services and resource types supported by Cloud Config, see <a href="https://help.aliyun.com/document_detail/127411.html">Alibaba Cloud services and resource types supported by Cloud Config</a>.
     * This topic provides an example on how to query the information about the disks that are attached to an Elastic Compute Service (ECS) instance named <code>i-j6cajg9yrfoh4sas****</code> that is created by the current Alibaba Cloud account in the China (Shanghai) region.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of resources that associate with a specific resource.</p>
     * 
     * @param request ListResourceRelationsRequest
     * @return ListResourceRelationsResponse
     */
    public ListResourceRelationsResponse listResourceRelations(ListResourceRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceRelationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you write a <code>SELECT</code> statement, you must obtain the fields and the data types of the fields from the property file of the resource type. For more information about property files, see <a href="https://github.com/aliyun/alibabacloud-config-resource-schema">Alibaba Cloud Config Resource Schema</a>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each resource type supported by Cloud Config has a property file. Property files are named based on the related resource types. For example, the property file of the <code>ACS::ECS::Instance</code> resource type is named <code>ACS_ECS_Instance.properties.json</code>. Property files of different resource types are placed under the <code>config/properties/resource-types</code> path.</li>
     * <li>For more information about the examples and limits on SQL query statements, see <a href="https://help.aliyun.com/document_detail/398718.html">Examples of SQL query statements</a> and <a href="https://help.aliyun.com/document_detail/398750.html">Limits on SQL query statements</a>.
     * This topic provides an example on how to obtain all resources whose tag key is <code>business</code> and whose tag value is <code>online</code> within the current account by using the advanced search feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains resources based on the fields in the resource properties by using a SELECT statement.</p>
     * 
     * @param request ListResourcesByAdvancedSearchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResourcesByAdvancedSearchResponse
     */
    public ListResourcesByAdvancedSearchResponse listResourcesByAdvancedSearchWithOptions(ListResourcesByAdvancedSearchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            query.put("Sql", request.sql);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResourcesByAdvancedSearch"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResourcesByAdvancedSearchResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you write a <code>SELECT</code> statement, you must obtain the fields and the data types of the fields from the property file of the resource type. For more information about property files, see <a href="https://github.com/aliyun/alibabacloud-config-resource-schema">Alibaba Cloud Config Resource Schema</a>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li>Each resource type supported by Cloud Config has a property file. Property files are named based on the related resource types. For example, the property file of the <code>ACS::ECS::Instance</code> resource type is named <code>ACS_ECS_Instance.properties.json</code>. Property files of different resource types are placed under the <code>config/properties/resource-types</code> path.</li>
     * <li>For more information about the examples and limits on SQL query statements, see <a href="https://help.aliyun.com/document_detail/398718.html">Examples of SQL query statements</a> and <a href="https://help.aliyun.com/document_detail/398750.html">Limits on SQL query statements</a>.
     * This topic provides an example on how to obtain all resources whose tag key is <code>business</code> and whose tag value is <code>online</code> within the current account by using the advanced search feature.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Obtains resources based on the fields in the resource properties by using a SELECT statement.</p>
     * 
     * @param request ListResourcesByAdvancedSearchRequest
     * @return ListResourcesByAdvancedSearchResponse
     */
    public ListResourcesByAdvancedSearchResponse listResourcesByAdvancedSearch(ListResourcesByAdvancedSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourcesByAdvancedSearchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the Alibaba Cloud services and resource types supported by a Cloud Config.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the cloud services and resource types that are supported by Cloud Config.</p>
     * 
     * @param request ListSupportedProductsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSupportedProductsResponse
     */
    public ListSupportedProductsResponse listSupportedProductsWithOptions(ListSupportedProductsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ListSupportedProducts"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSupportedProductsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to query the Alibaba Cloud services and resource types supported by a Cloud Config.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the cloud services and resource types that are supported by Cloud Config.</p>
     * 
     * @param request ListSupportedProductsRequest
     * @return ListSupportedProductsResponse
     */
    public ListSupportedProductsResponse listSupportedProducts(ListSupportedProductsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSupportedProductsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries tags that are added to specified resources.</p>
     * 
     * @param tmpReq ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Queries tags that are added to specified resources.</p>
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
     * <p>For more information about the definition, use scenarios, and execution of custom function rules, see <a href="https://help.aliyun.com/document_detail/127405.html">Definition and execution of custom function rules</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits the evaluation results of a rule from Function Compute.</p>
     * 
     * @param request PutEvaluationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PutEvaluationsResponse
     */
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

    /**
     * <b>description</b> :
     * <p>For more information about the definition, use scenarios, and execution of custom function rules, see <a href="https://help.aliyun.com/document_detail/127405.html">Definition and execution of custom function rules</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Submits the evaluation results of a rule from Function Compute.</p>
     * 
     * @param request PutEvaluationsRequest
     * @return PutEvaluationsResponse
     */
    public PutEvaluationsResponse putEvaluations(PutEvaluationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putEvaluationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>One or more non-compliant resources that are evaluated by a rule are ignored. For more information, see <a href="https://help.aliyun.com/document_detail/607054.html">IgnoreAggregateEvaluationResults</a>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to re-evaluate the non-compliant resource that is evaluated by the <code>cr-7e72626622af0051****</code> rule of the <code>120886317861****</code> member in the <code>ca-5b6c626622af008f****</code> group account. The ID of the region in which the resource resides is <code>cn-beijing</code>, the type of the resource is <code>ACS::SLB::LoadBalancer</code>, and the ID of the resource is <code>lb-hp3a3b4ztyfm2plgm****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Re-evaluates resources that are evaluated based on a rule after the evaluation results on some resources of an ignored rule in an account group are resumed.</p>
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
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>One or more non-compliant resources that are evaluated by a rule are ignored. For more information, see <a href="https://help.aliyun.com/document_detail/607054.html">IgnoreAggregateEvaluationResults</a>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to re-evaluate the non-compliant resource that is evaluated by the <code>cr-7e72626622af0051****</code> rule of the <code>120886317861****</code> member in the <code>ca-5b6c626622af008f****</code> group account. The ID of the region in which the resource resides is <code>cn-beijing</code>, the type of the resource is <code>ACS::SLB::LoadBalancer</code>, and the ID of the resource is <code>lb-hp3a3b4ztyfm2plgm****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Re-evaluates resources that are evaluated based on a rule after the evaluation results on some resources of an ignored rule in an account group are resumed.</p>
     * 
     * @param request RevertAggregateEvaluationResultsRequest
     * @return RevertAggregateEvaluationResultsResponse
     */
    public RevertAggregateEvaluationResultsResponse revertAggregateEvaluationResults(RevertAggregateEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revertAggregateEvaluationResultsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>One or more non-compliant resources that are evaluated by a rule are ignored. For more information, see <a href="https://help.aliyun.com/document_detail/606990.html">IgnoreEvaluationResults</a>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to re-evaluate the <code>lb-hp3a3b4ztyfm2plgm****</code> non-compliant resource that is evaluated by the <code>cr-7e72626622af0051****</code> rule. The ID of the region in which the resource resides is<code>cn-beijing</code>, the type of the resource is <code>ACS::SLB::LoadBalancer</code>, and the ID of the resource is <code>lb-hp3a3b4ztyfm2plgm****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Re-evaluates resources that are evaluated based on a rule after the evaluation results on some resources of an ignored rule are resumed.</p>
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
     * <b>description</b> :
     * <h3><a href="#"></a>Prerequisites</h3>
     * <p>One or more non-compliant resources that are evaluated by a rule are ignored. For more information, see <a href="https://help.aliyun.com/document_detail/606990.html">IgnoreEvaluationResults</a>.</p>
     * <h3><a href="#"></a>Description</h3>
     * <p>This topic provides an example on how to re-evaluate the <code>lb-hp3a3b4ztyfm2plgm****</code> non-compliant resource that is evaluated by the <code>cr-7e72626622af0051****</code> rule. The ID of the region in which the resource resides is<code>cn-beijing</code>, the type of the resource is <code>ACS::SLB::LoadBalancer</code>, and the ID of the resource is <code>lb-hp3a3b4ztyfm2plgm****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Re-evaluates resources that are evaluated based on a rule after the evaluation results on some resources of an ignored rule are resumed.</p>
     * 
     * @param request RevertEvaluationResultsRequest
     * @return RevertEvaluationResultsResponse
     */
    public RevertEvaluationResultsResponse revertEvaluationResults(RevertEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revertEvaluationResultsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>After you call this operation, the compliance evaluation is performed only once. To query the compliance evaluation results returned by the rule, call the ListAggregateConfigRuleEvaluationResults operation. For more information, see <a href="https://help.aliyun.com/document_detail/265979.html">ListAggregateConfigRuleEvaluationResults</a>.
     * The sample request in this topic shows how to use the <code>cr-c169626622af009f****</code> rule in the <code>ca-3a58626622af0005****</code> account group to evaluate resources.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Re-evaluates the compliance of resources based on a rule or based on all rules in a compliance package in a specific account group.</p>
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
     * <b>description</b> :
     * <blockquote>
     * <p>After you call this operation, the compliance evaluation is performed only once. To query the compliance evaluation results returned by the rule, call the ListAggregateConfigRuleEvaluationResults operation. For more information, see <a href="https://help.aliyun.com/document_detail/265979.html">ListAggregateConfigRuleEvaluationResults</a>.
     * The sample request in this topic shows how to use the <code>cr-c169626622af009f****</code> rule in the <code>ca-3a58626622af0005****</code> account group to evaluate resources.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Re-evaluates the compliance of resources based on a rule or based on all rules in a compliance package in a specific account group.</p>
     * 
     * @param request StartAggregateConfigRuleEvaluationRequest
     * @return StartAggregateConfigRuleEvaluationResponse
     */
    public StartAggregateConfigRuleEvaluationResponse startAggregateConfigRuleEvaluation(StartAggregateConfigRuleEvaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAggregateConfigRuleEvaluationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to manually perform a remediation operation by using the rule whose ID is <code>cr-6b7c626622af00b4****</code> in the account group whose ID is <code>ca-6b4a626622af0012****</code>. The return result shows that the manual execution is successful.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a remediation operation by using a rule in an account group.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to manually perform a remediation operation by using the rule whose ID is <code>cr-6b7c626622af00b4****</code> in the account group whose ID is <code>ca-6b4a626622af0012****</code>. The return result shows that the manual execution is successful.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a remediation operation by using a rule in an account group.</p>
     * 
     * @param request StartAggregateRemediationRequest
     * @return StartAggregateRemediationResponse
     */
    public StartAggregateRemediationResponse startAggregateRemediation(StartAggregateRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAggregateRemediationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, the cr-9920626622af0035\<em>\</em>\<em>\</em> rule is used to re-evaluate the compliance of resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Re-evaluates the compliance of resources based on a rule or based on all rules in a compliance package.</p>
     * 
     * @param request StartConfigRuleEvaluationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartConfigRuleEvaluationResponse
     */
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

    /**
     * <b>description</b> :
     * <p>In this example, the cr-9920626622af0035\<em>\</em>\<em>\</em> rule is used to re-evaluate the compliance of resources.</p>
     * 
     * <b>summary</b> : 
     * <p>Re-evaluates the compliance of resources based on a rule or based on all rules in a compliance package.</p>
     * 
     * @param request StartConfigRuleEvaluationRequest
     * @return StartConfigRuleEvaluationResponse
     */
    public StartConfigRuleEvaluationResponse startConfigRuleEvaluation(StartConfigRuleEvaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startConfigRuleEvaluationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>触发单资源重新评估</p>
     * 
     * @param request StartConfigRuleEvaluationByResourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartConfigRuleEvaluationByResourceResponse
     */
    public StartConfigRuleEvaluationByResourceResponse startConfigRuleEvaluationByResourceWithOptions(StartConfigRuleEvaluationByResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            body.put("ResourceId", request.resourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartConfigRuleEvaluationByResource"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartConfigRuleEvaluationByResourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>触发单资源重新评估</p>
     * 
     * @param request StartConfigRuleEvaluationByResourceRequest
     * @return StartConfigRuleEvaluationByResourceResponse
     */
    public StartConfigRuleEvaluationByResourceResponse startConfigRuleEvaluationByResource(StartConfigRuleEvaluationByResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startConfigRuleEvaluationByResourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to enable Cloud Config to monitor the resources of your Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables Cloud Config to monitor the resources of your Alibaba Cloud account.</p>
     * 
     * @param request StartConfigurationRecorderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartConfigurationRecorderResponse
     */
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

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to enable Cloud Config to monitor the resources of your Alibaba Cloud account.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables Cloud Config to monitor the resources of your Alibaba Cloud account.</p>
     * @return StartConfigurationRecorderResponse
     */
    public StartConfigurationRecorderResponse startConfigurationRecorder() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startConfigurationRecorderWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to perform a remediation operation by using the rule whose ID is <code>cr-8a973ac2e2be00a2****</code>. The returned result shows that the manual execution is successful.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a remediation operation by using a rule.</p>
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
     * <b>description</b> :
     * <p>This topic provides an example on how to perform a remediation operation by using the rule whose ID is <code>cr-8a973ac2e2be00a2****</code>. The returned result shows that the manual execution is successful.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs a remediation operation by using a rule.</p>
     * 
     * @param request StartRemediationRequest
     * @return StartRemediationResponse
     */
    public StartRemediationResponse startRemediation(StartRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRemediationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> After you deactivate Cloud Config, the resource configurations, created rules, and compliance evaluation results that are stored in Cloud Config are automatically cleared and cannot be restored. Proceed with caution.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deactivates Cloud Config.</p>
     * 
     * @param request StopConfigurationRecorderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopConfigurationRecorderResponse
     */
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

    /**
     * <b>description</b> :
     * <blockquote>
     * <p> After you deactivate Cloud Config, the resource configurations, created rules, and compliance evaluation results that are stored in Cloud Config are automatically cleared and cannot be restored. Proceed with caution.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Deactivates Cloud Config.</p>
     * @return StopConfigurationRecorderResponse
     */
    public StopConfigurationRecorderResponse stopConfigurationRecorder() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopConfigurationRecorderWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Adds tags to resources.</p>
     * 
     * @param tmpReq TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
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

    /**
     * <b>summary</b> : 
     * <p>Adds tags to resources.</p>
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
     * <p>实时测试通知</p>
     * 
     * @param request TriggerReportSendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TriggerReportSendResponse
     */
    public TriggerReportSendResponse triggerReportSendWithOptions(TriggerReportSendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportTemplateId)) {
            body.put("ReportTemplateId", request.reportTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "TriggerReportSend"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TriggerReportSendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>实时测试通知</p>
     * 
     * @param request TriggerReportSendRequest
     * @return TriggerReportSendResponse
     */
    public TriggerReportSendResponse triggerReportSend(TriggerReportSendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.triggerReportSendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from specified resources.</p>
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

    /**
     * <b>summary</b> : 
     * <p>Removes tags from specified resources.</p>
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
     * <p>This topic provides an example on how to change the value of the <code>eip-bandwidth-limit</code> parameter in the rule template of the compliance package <code>cp-fdc8626622af00f9****</code> in the account group <code>ca-f632626622af0079****</code> to <code>20</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a compliance package in an account group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.excludeRegionIdsScope)) {
            body.put("ExcludeRegionIdsScope", request.excludeRegionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceGroupIdsScope)) {
            body.put("ExcludeResourceGroupIdsScope", request.excludeResourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeTagsScope)) {
            bodyFlat.put("ExcludeTagsScope", request.excludeTagsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            body.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            body.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsScope)) {
            body.put("ResourceIdsScope", request.resourceIdsScope);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagsScope)) {
            bodyFlat.put("TagsScope", request.tagsScope);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <b>description</b> :
     * <p>This topic provides an example on how to change the value of the <code>eip-bandwidth-limit</code> parameter in the rule template of the compliance package <code>cp-fdc8626622af00f9****</code> in the account group <code>ca-f632626622af0079****</code> to <code>20</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a compliance package in an account group.</p>
     * 
     * @param request UpdateAggregateCompliancePackRequest
     * @return UpdateAggregateCompliancePackResponse
     */
    public UpdateAggregateCompliancePackResponse updateAggregateCompliancePack(UpdateAggregateCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAggregateCompliancePackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to disable a delivery channel in an account group. The ID of the account group is <code>ca-a4e5626622af0079****</code>, and the ID of the delivery channel is <code>cdc-8e45ff4e06a3a8****</code>. The Status parameter is set to <code>0</code>. After the delivery channel is disabled, Cloud Config retains the most recent delivery configuration and stops resource data delivery.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a delivery channel in an account group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.compliantSnapshot)) {
            query.put("CompliantSnapshot", request.compliantSnapshot);
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
     * <b>description</b> :
     * <p>This topic provides an example on how to disable a delivery channel in an account group. The ID of the account group is <code>ca-a4e5626622af0079****</code>, and the ID of the delivery channel is <code>cdc-8e45ff4e06a3a8****</code>. The Status parameter is set to <code>0</code>. After the delivery channel is disabled, Cloud Config retains the most recent delivery configuration and stops resource data delivery.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a delivery channel in an account group.</p>
     * 
     * @param request UpdateAggregateConfigDeliveryChannelRequest
     * @return UpdateAggregateConfigDeliveryChannelResponse
     */
    public UpdateAggregateConfigDeliveryChannelResponse updateAggregateConfigDeliveryChannel(UpdateAggregateConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAggregateConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the risk level of the rule <code>cr-4e3d626622af0080****</code> in an account group <code>ca-a4e5626622af0079****</code> to <code>3</code>, which indicates low risk level.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description, input parameters, and risk level of a rule in a specific account group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountIdsScope)) {
            body.put("AccountIdsScope", request.accountIdsScope);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.excludeRegionIdsScope)) {
            body.put("ExcludeRegionIdsScope", request.excludeRegionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceGroupIdsScope)) {
            body.put("ExcludeResourceGroupIdsScope", request.excludeResourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeTagsScope)) {
            bodyFlat.put("ExcludeTagsScope", request.excludeTagsScope);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsScope)) {
            body.put("ResourceIdsScope", request.resourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceNameScope)) {
            body.put("ResourceNameScope", request.resourceNameScope);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagsScope)) {
            bodyFlat.put("TagsScope", request.tagsScope);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <b>description</b> :
     * <p>This topic provides an example on how to change the risk level of the rule <code>cr-4e3d626622af0080****</code> in an account group <code>ca-a4e5626622af0079****</code> to <code>3</code>, which indicates low risk level.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description, input parameters, and risk level of a rule in a specific account group.</p>
     * 
     * @param request UpdateAggregateConfigRuleRequest
     * @return UpdateAggregateConfigRuleResponse
     */
    public UpdateAggregateConfigRuleResponse updateAggregateConfigRule(UpdateAggregateConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAggregateConfigRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to change the execution mode of the <code>crr-909ba2d4716700eb****</code> remediation setting for a rule in the <code>ca-6b4a626622af0012****</code> account group to <code>AUTO_EXECUTION</code>, which specifies automatic remediation. This topic also provides a sample request.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a remediation template for a rule in an account group.</p>
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
     * <b>description</b> :
     * <p>This topic describes how to change the execution mode of the <code>crr-909ba2d4716700eb****</code> remediation setting for a rule in the <code>ca-6b4a626622af0012****</code> account group to <code>AUTO_EXECUTION</code>, which specifies automatic remediation. This topic also provides a sample request.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a remediation template for a rule in an account group.</p>
     * 
     * @param request UpdateAggregateRemediationRequest
     * @return UpdateAggregateRemediationResponse
     */
    public UpdateAggregateRemediationResponse updateAggregateRemediation(UpdateAggregateRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAggregateRemediationWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to add a member to the account group <code>ca-dacf86d8314e00eb****</code>. The member ID is <code>173808452267****</code>, the member name is <code>Tony</code>, and the member belongs to the resource directory <code>ResourceDirectory</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>The management account or delegated administrator account of a resource directory can be used to modify the name and description of an account group. The management account or delegated administrator account can also be used to add or remove members from the account group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.folderId)) {
            body.put("FolderId", request.folderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <b>description</b> :
     * <p>This topic provides an example on how to add a member to the account group <code>ca-dacf86d8314e00eb****</code>. The member ID is <code>173808452267****</code>, the member name is <code>Tony</code>, and the member belongs to the resource directory <code>ResourceDirectory</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>The management account or delegated administrator account of a resource directory can be used to modify the name and description of an account group. The management account or delegated administrator account can also be used to add or remove members from the account group.</p>
     * 
     * @param request UpdateAggregatorRequest
     * @return UpdateAggregatorResponse
     */
    public UpdateAggregatorResponse updateAggregator(UpdateAggregatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAggregatorWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the value of the <code>eip-bandwidth-limit</code> parameter of a rule in the compliance package <code>cp-a8a8626622af0082****</code> to <code>20</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a specific compliance package in the current account.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.excludeRegionIdsScope)) {
            body.put("ExcludeRegionIdsScope", request.excludeRegionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceGroupIdsScope)) {
            body.put("ExcludeResourceGroupIdsScope", request.excludeResourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeTagsScope)) {
            bodyFlat.put("ExcludeTagsScope", request.excludeTagsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionIdsScope)) {
            body.put("RegionIdsScope", request.regionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupIdsScope)) {
            body.put("ResourceGroupIdsScope", request.resourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsScope)) {
            body.put("ResourceIdsScope", request.resourceIdsScope);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagsScope)) {
            bodyFlat.put("TagsScope", request.tagsScope);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <b>description</b> :
     * <p>This topic provides an example on how to change the value of the <code>eip-bandwidth-limit</code> parameter of a rule in the compliance package <code>cp-a8a8626622af0082****</code> to <code>20</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configurations of a specific compliance package in the current account.</p>
     * 
     * @param request UpdateCompliancePackRequest
     * @return UpdateCompliancePackResponse
     */
    public UpdateCompliancePackResponse updateCompliancePack(UpdateCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCompliancePackWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>In this example, a delivery channel is disabled. The ID of the delivery channel is `cdc-8e45ff4e06a3a8****```. The Status parameter is set to 0. After the delivery channel is disabled, Cloud Config retains the most recent delivery configuration and stops the delivery of resource data.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a delivery channel by using the current account.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.compliantSnapshot)) {
            query.put("CompliantSnapshot", request.compliantSnapshot);
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
     * <b>description</b> :
     * <p>In this example, a delivery channel is disabled. The ID of the delivery channel is `cdc-8e45ff4e06a3a8****```. The Status parameter is set to 0. After the delivery channel is disabled, Cloud Config retains the most recent delivery configuration and stops the delivery of resource data.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a delivery channel by using the current account.</p>
     * 
     * @param request UpdateConfigDeliveryChannelRequest
     * @return UpdateConfigDeliveryChannelResponse
     */
    public UpdateConfigDeliveryChannelResponse updateConfigDeliveryChannel(UpdateConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the risk level of the rule <code>cr-a260626622af0005****</code> to <code>3</code>, which indicates low risk level.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description, input parameters, and risk level of a rule.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.tag)) {
            request.tagShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.tag, "Tag", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tagShrink)) {
            query.put("Tag", request.tagShrink);
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

        if (!com.aliyun.teautil.Common.isUnset(request.excludeRegionIdsScope)) {
            body.put("ExcludeRegionIdsScope", request.excludeRegionIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceGroupIdsScope)) {
            body.put("ExcludeResourceGroupIdsScope", request.excludeResourceGroupIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeResourceIdsScope)) {
            body.put("ExcludeResourceIdsScope", request.excludeResourceIdsScope);
        }

        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.excludeTagsScope)) {
            bodyFlat.put("ExcludeTagsScope", request.excludeTagsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extendContent)) {
            body.put("ExtendContent", request.extendContent);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceIdsScope)) {
            body.put("ResourceIdsScope", request.resourceIdsScope);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceNameScope)) {
            body.put("ResourceNameScope", request.resourceNameScope);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagsScope)) {
            bodyFlat.put("TagsScope", request.tagsScope);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
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
     * <b>description</b> :
     * <p>This topic provides an example on how to change the risk level of the rule <code>cr-a260626622af0005****</code> to <code>3</code>, which indicates low risk level.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description, input parameters, and risk level of a rule.</p>
     * 
     * @param request UpdateConfigRuleRequest
     * @return UpdateConfigRuleResponse
     */
    public UpdateConfigRuleResponse updateConfigRule(UpdateConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConfigRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the resource monitoring scope of the current account to ACS::ECS::Instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the resource monitoring scope of the current account.</p>
     * 
     * @param request UpdateConfigurationRecorderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateConfigurationRecorderResponse
     */
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

    /**
     * <b>description</b> :
     * <p>This topic provides an example on how to change the resource monitoring scope of the current account to ACS::ECS::Instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the resource monitoring scope of the current account.</p>
     * 
     * @param request UpdateConfigurationRecorderRequest
     * @return UpdateConfigurationRecorderResponse
     */
    public UpdateConfigurationRecorderResponse updateConfigurationRecorder(UpdateConfigurationRecorderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateConfigurationRecorderWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the integration of a cloud service.</p>
     * 
     * @param request UpdateIntegratedServiceStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateIntegratedServiceStatusResponse
     */
    public UpdateIntegratedServiceStatusResponse updateIntegratedServiceStatusWithOptions(UpdateIntegratedServiceStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregatorDeliveryDataType)) {
            body.put("AggregatorDeliveryDataType", request.aggregatorDeliveryDataType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.integratedTypes)) {
            body.put("IntegratedTypes", request.integratedTypes);
        }

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

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the integration of a cloud service.</p>
     * 
     * @param request UpdateIntegratedServiceStatusRequest
     * @return UpdateIntegratedServiceStatusResponse
     */
    public UpdateIntegratedServiceStatusResponse updateIntegratedServiceStatus(UpdateIntegratedServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateIntegratedServiceStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic describes how to change the execution mode of the <code>crr-909ba2d4716700eb****</code> remediation setting to <code>AUTO_EXECUTION</code>, which specifies automatic remediation. This topic also provides a sample request.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a remediation template for a rule.</p>
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
     * <b>description</b> :
     * <p>This topic describes how to change the execution mode of the <code>crr-909ba2d4716700eb****</code> remediation setting to <code>AUTO_EXECUTION</code>, which specifies automatic remediation. This topic also provides a sample request.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a remediation template for a rule.</p>
     * 
     * @param request UpdateRemediationRequest
     * @return UpdateRemediationResponse
     */
    public UpdateRemediationResponse updateRemediation(UpdateRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRemediationWithOptions(request, runtime);
    }
}
