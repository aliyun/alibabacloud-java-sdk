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
     * <b>summary</b> : 
     * <p>启用账号组规则</p>
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
     * <b>summary</b> : 
     * <p>启用账号组规则</p>
     * 
     * @param request ActiveAggregateConfigRulesRequest
     * @return ActiveAggregateConfigRulesResponse
     */
    public ActiveAggregateConfigRulesResponse activeAggregateConfigRules(ActiveAggregateConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activeAggregateConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用指定规则</p>
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
     * <b>summary</b> : 
     * <p>启用指定规则</p>
     * 
     * @param request ActiveConfigRulesRequest
     * @return ActiveConfigRulesResponse
     */
    public ActiveConfigRulesResponse activeConfigRules(ActiveConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.activeConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将指定账号组规则加入指定账号组合规包</p>
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
     * <b>summary</b> : 
     * <p>将指定账号组规则加入指定账号组合规包</p>
     * 
     * @param request AttachAggregateConfigRuleToCompliancePackRequest
     * @return AttachAggregateConfigRuleToCompliancePackResponse
     */
    public AttachAggregateConfigRuleToCompliancePackResponse attachAggregateConfigRuleToCompliancePack(AttachAggregateConfigRuleToCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachAggregateConfigRuleToCompliancePackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将指定规则加入指定合规包</p>
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
     * <b>summary</b> : 
     * <p>将指定规则加入指定合规包</p>
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
     * <p>合规包复制</p>
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
     * <p>合规包复制</p>
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
     * <p>规则复制</p>
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
     * <p>规则复制</p>
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
     * <p>生成当前账号搜索结果下载文件</p>
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
     * <p>生成当前账号搜索结果下载文件</p>
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
     * <p>This topic provides an example of how to query for ECS instances in the account group <code>ca-edd3626622af00b3****</code> and create a downloadable file of the search results.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a downloadable file of advanced search results for resources in an account group.</p>
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
     * <p>This topic provides an example of how to query for ECS instances in the account group <code>ca-edd3626622af00b3****</code> and create a downloadable file of the search results.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a downloadable file of advanced search results for resources in an account group.</p>
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
     * <p>A compliance pack is a collection of rules. When you create a compliance pack, you can select default rules from a compliance pack template. You can also select rules from rule templates and the list of existing rules.
     * After a compliance pack is created, its rules are evaluated once by default. Subsequent evaluations are automatically triggered based on the trigger mechanism of the rules. You can also manually trigger an evaluation.
     * A compliance pack template is a collection of rules created by CloudConfig for a specific compliance scenario.
     * This topic provides an example of how to create a compliance pack for the account group <code>ca-f632626622af0079****</code> using the compliance pack template <code>ClassifiedProtectionPreCheck</code> (Classified Protection Level 3 Pre-check).</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a compliance pack for a specified account group.</p>
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
     * <p>A compliance pack is a collection of rules. When you create a compliance pack, you can select default rules from a compliance pack template. You can also select rules from rule templates and the list of existing rules.
     * After a compliance pack is created, its rules are evaluated once by default. Subsequent evaluations are automatically triggered based on the trigger mechanism of the rules. You can also manually trigger an evaluation.
     * A compliance pack template is a collection of rules created by CloudConfig for a specific compliance scenario.
     * This topic provides an example of how to create a compliance pack for the account group <code>ca-f632626622af0079****</code> using the compliance pack template <code>ClassifiedProtectionPreCheck</code> (Classified Protection Level 3 Pre-check).</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a compliance pack for a specified account group.</p>
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
     * <h3>Background information</h3>
     * <ul>
     * <li>Deliver to Simple Log Service (SLS)
     * To deliver configuration history, non-compliance events, and scheduled resource snapshots to a Logstore in Simple Log Service (SLS), you must first create a log project and a Logstore. This lets you query and analyze logs. For examples of the content in JSON format, see <a href="https://help.aliyun.com/document_detail/308347.html">Example of resource configuration change history</a>, <a href="https://help.aliyun.com/document_detail/307122.html">Example of resource non-compliance event</a>, and <a href="https://help.aliyun.com/document_detail/611894.html">Example of scheduled resource snapshot</a>.</li>
     * <li>Deliver to Object Storage Service (OSS)
     * To deliver scheduled resource snapshots or configuration history to a specified location in Object Storage Service (OSS), you must first create a bucket. This lets you view or download files in JSON format. For examples of the content in JSON format, see <a href="https://help.aliyun.com/document_detail/305669.html">Example of scheduled resource snapshot</a> and <a href="https://help.aliyun.com/document_detail/189738.html">Example of resource configuration change history</a>.</li>
     * <li>Deliver to Simple Message Queue (MNS)
     * To deliver resource configuration change history and resource non-compliance events to a specified topic in Simple Message Queue (formerly MNS), you must first create a topic. This lets you configure the push method and content for the topic. For examples of the content in JSON format, see <a href="https://help.aliyun.com/document_detail/309462.html">Example of resource configuration change history</a> and <a href="https://help.aliyun.com/document_detail/309463.html">Example of resource non-compliance event</a>.</li>
     * </ul>
     * <h3>Limits</h3>
     * <p>You can create a maximum of five delivery channels for each account group.</p>
     * <h3>Usage notes</h3>
     * <p>This example shows how to create a delivery channel of the <code>OSS</code> type for the account group <code>ca-a4e5626622af0079****</code>. The Amazon Resource Name (ARN) of the delivery destination is <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>. The response shows that the delivery channel is created and its ID is <code>cdc-8e45ff4e06a3a8****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a delivery channel for a specified account group to deliver resource data to Simple Log Service (SLS), Object Storage Service (OSS), or Simple Message Queue (formerly MNS).</p>
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
     * <h3>Background information</h3>
     * <ul>
     * <li>Deliver to Simple Log Service (SLS)
     * To deliver configuration history, non-compliance events, and scheduled resource snapshots to a Logstore in Simple Log Service (SLS), you must first create a log project and a Logstore. This lets you query and analyze logs. For examples of the content in JSON format, see <a href="https://help.aliyun.com/document_detail/308347.html">Example of resource configuration change history</a>, <a href="https://help.aliyun.com/document_detail/307122.html">Example of resource non-compliance event</a>, and <a href="https://help.aliyun.com/document_detail/611894.html">Example of scheduled resource snapshot</a>.</li>
     * <li>Deliver to Object Storage Service (OSS)
     * To deliver scheduled resource snapshots or configuration history to a specified location in Object Storage Service (OSS), you must first create a bucket. This lets you view or download files in JSON format. For examples of the content in JSON format, see <a href="https://help.aliyun.com/document_detail/305669.html">Example of scheduled resource snapshot</a> and <a href="https://help.aliyun.com/document_detail/189738.html">Example of resource configuration change history</a>.</li>
     * <li>Deliver to Simple Message Queue (MNS)
     * To deliver resource configuration change history and resource non-compliance events to a specified topic in Simple Message Queue (formerly MNS), you must first create a topic. This lets you configure the push method and content for the topic. For examples of the content in JSON format, see <a href="https://help.aliyun.com/document_detail/309462.html">Example of resource configuration change history</a> and <a href="https://help.aliyun.com/document_detail/309463.html">Example of resource non-compliance event</a>.</li>
     * </ul>
     * <h3>Limits</h3>
     * <p>You can create a maximum of five delivery channels for each account group.</p>
     * <h3>Usage notes</h3>
     * <p>This example shows how to create a delivery channel of the <code>OSS</code> type for the account group <code>ca-a4e5626622af0079****</code>. The Amazon Resource Name (ARN) of the delivery destination is <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>. The response shows that the delivery channel is created and its ID is <code>cdc-8e45ff4e06a3a8****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a delivery channel for a specified account group to deliver resource data to Simple Log Service (SLS), Object Storage Service (OSS), or Simple Message Queue (formerly MNS).</p>
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
     * <p>Each management account and delegated administrator account can have a maximum of 200 rules.</p>
     * <h3>Background information</h3>
     * <p>Cloud Config supports the following methods for creating rules:</p>
     * <ul>
     * <li>Create rules from templates
     * Rule templates are predefined rule functions that Cloud Config provides in Function Compute (FC). You can use rule templates to create rules quickly. For more information about rules, see <a href="https://help.aliyun.com/document_detail/128273.html">Definition and working principle of rules</a>.</li>
     * <li>Create rules based on functions in Function Compute
     * Custom function rules are rules whose code is hosted in FC functions. If the predefined rule templates in Cloud Config do not meet your compliance requirements, you can write function code to check compliance in complex scenarios. For more information about custom function rules, see <a href="https://help.aliyun.com/document_detail/127405.html">Definition and working principle of custom function rules</a>.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <p>This example shows how to create a rule for the account group <code>ca-a4e5626622af0079****</code> using the \<code>required-tags\\</code> template. The response shows that the rule is created with the ID <code>cr-4e3d626622af0080****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a rule for a specified account group. You can create a rule from a template or create a custom rule using Function Compute. The rule checks your resources for compliance. After a rule is created, it automatically runs once. Cloud Config then runs evaluations based on the rule\&quot;s trigger. You can also run evaluations manually.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.conditions)) {
            body.put("Conditions", request.conditions);
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
     * <p>Each management account and delegated administrator account can have a maximum of 200 rules.</p>
     * <h3>Background information</h3>
     * <p>Cloud Config supports the following methods for creating rules:</p>
     * <ul>
     * <li>Create rules from templates
     * Rule templates are predefined rule functions that Cloud Config provides in Function Compute (FC). You can use rule templates to create rules quickly. For more information about rules, see <a href="https://help.aliyun.com/document_detail/128273.html">Definition and working principle of rules</a>.</li>
     * <li>Create rules based on functions in Function Compute
     * Custom function rules are rules whose code is hosted in FC functions. If the predefined rule templates in Cloud Config do not meet your compliance requirements, you can write function code to check compliance in complex scenarios. For more information about custom function rules, see <a href="https://help.aliyun.com/document_detail/127405.html">Definition and working principle of custom function rules</a>.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <p>This example shows how to create a rule for the account group <code>ca-a4e5626622af0079****</code> using the \<code>required-tags\\</code> template. The response shows that the rule is created with the ID <code>cr-4e3d626622af0080****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a rule for a specified account group. You can create a rule from a template or create a custom rule using Function Compute. The rule checks your resources for compliance. After a rule is created, it automatically runs once. Cloud Config then runs evaluations based on the rule\&quot;s trigger. You can also run evaluations manually.</p>
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
     * <h3>Background information</h3>
     * <ul>
     * <li>Template-based remediation: Uses public templates provided by Operation Orchestration Service (OOS) to quickly remediate non-compliant resources.
     * Only one remediation can be created for a rule. This type of remediation is supported only for rules that are created from specific templates.</li>
     * <li>Custom remediation: Runs custom code in Function Compute (FC) to quickly remediate non-compliant resources.
     * Only one remediation can be created for a rule. This type of remediation is supported for rules created from templates and for custom rules.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to create a remediation for the rule <code>cr-6b7c626622af00b4****</code> in the account group <code>ca-6b4a626622af0012****</code>. The response shows that the remediation is created and its ID is <code>crr-909ba2d4716700eb****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a remediation for a rule in a specified account group.</p>
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
     * <h3>Background information</h3>
     * <ul>
     * <li>Template-based remediation: Uses public templates provided by Operation Orchestration Service (OOS) to quickly remediate non-compliant resources.
     * Only one remediation can be created for a rule. This type of remediation is supported only for rules that are created from specific templates.</li>
     * <li>Custom remediation: Runs custom code in Function Compute (FC) to quickly remediate non-compliant resources.
     * Only one remediation can be created for a rule. This type of remediation is supported for rules created from templates and for custom rules.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to create a remediation for the rule <code>cr-6b7c626622af00b4****</code> in the account group <code>ca-6b4a626622af0012****</code>. The response shows that the remediation is created and its ID is <code>crr-909ba2d4716700eb****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a remediation for a rule in a specified account group.</p>
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
     * <h3>Limits</h3>
     * <p>A management account or a delegated administrator account can create a maximum of 5 account groups. Each account group can contain a maximum of 200 member accounts.</p>
     * <h3>Background information</h3>
     * <p>For more information about account groups, including their concepts, use cases, and the impact of member account changes on Cloud Config, see <a href="https://help.aliyun.com/document_detail/211534.html">Overview</a>.
     * Cloud Config supports the following types of account groups:</p>
     * <ul>
     * <li>Global account group: A global account group contains all members in a resource directory and automatically synchronizes member changes. A management account or a delegated administrator account can create only one global account group.</li>
     * <li>Custom account group: To create a custom account group, a management account or a delegated administrator account selects some or all member accounts from the resource directory.<ul>
     * <li>If a new member is added to the resource directory, the change is not automatically synchronized. The management account or delegated administrator account must manually add the new member to the account group.</li>
     * <li>If a member is removed from the resource directory, the management account or delegated administrator account loses the permissions to manage that member\&quot;s compliance. The custom account group automatically detects this change and removes the member from the group.</li>
     * </ul>
     * </li>
     * <li>Folder account group: When an account group is created from a folder, it automatically detects and synchronizes changes to the members within that folder. The members in a folder account group are always consistent with the members in the selected folder.
     * A management account or a delegated administrator account can select only one non-empty folder to create a folder account group.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to use a management account to create a custom account group of the <code>CUSTOM</code> type. The account group is named <code>Test_Group</code> and has the description <code>Test Group</code>. The member accounts are as follows:</p>
     * <ul>
     * <li>The member account ID is <code>171322098523****</code> and the member account name is <code>Alice</code>.</li>
     * <li>The member account ID is <code>100532098349****</code> and the member account name is <code>Tom</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>A management account or a delegated administrator account in a resource directory can create an account group to centrally manage resources, compliance packages, and rules across multiple member accounts.</p>
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
     * <h3>Limits</h3>
     * <p>A management account or a delegated administrator account can create a maximum of 5 account groups. Each account group can contain a maximum of 200 member accounts.</p>
     * <h3>Background information</h3>
     * <p>For more information about account groups, including their concepts, use cases, and the impact of member account changes on Cloud Config, see <a href="https://help.aliyun.com/document_detail/211534.html">Overview</a>.
     * Cloud Config supports the following types of account groups:</p>
     * <ul>
     * <li>Global account group: A global account group contains all members in a resource directory and automatically synchronizes member changes. A management account or a delegated administrator account can create only one global account group.</li>
     * <li>Custom account group: To create a custom account group, a management account or a delegated administrator account selects some or all member accounts from the resource directory.<ul>
     * <li>If a new member is added to the resource directory, the change is not automatically synchronized. The management account or delegated administrator account must manually add the new member to the account group.</li>
     * <li>If a member is removed from the resource directory, the management account or delegated administrator account loses the permissions to manage that member\&quot;s compliance. The custom account group automatically detects this change and removes the member from the group.</li>
     * </ul>
     * </li>
     * <li>Folder account group: When an account group is created from a folder, it automatically detects and synchronizes changes to the members within that folder. The members in a folder account group are always consistent with the members in the selected folder.
     * A management account or a delegated administrator account can select only one non-empty folder to create a folder account group.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to use a management account to create a custom account group of the <code>CUSTOM</code> type. The account group is named <code>Test_Group</code> and has the description <code>Test Group</code>. The member accounts are as follows:</p>
     * <ul>
     * <li>The member account ID is <code>171322098523****</code> and the member account name is <code>Alice</code>.</li>
     * <li>The member account ID is <code>100532098349****</code> and the member account name is <code>Tom</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>A management account or a delegated administrator account in a resource directory can create an account group to centrally manage resources, compliance packages, and rules across multiple member accounts.</p>
     * 
     * @param request CreateAggregatorRequest
     * @return CreateAggregatorResponse
     */
    public CreateAggregatorResponse createAggregator(CreateAggregatorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAggregatorWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>为当前账号创建合规包</p>
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
     * <b>summary</b> : 
     * <p>为当前账号创建合规包</p>
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
     * <h3>Background information</h3>
     * <ul>
     * <li>Deliver to Simple Log Service (SLS)
     * When you deliver resource configuration histories, non-compliant events, and scheduled snapshots to a Logstore in SLS, you must first create a project and a Logstore. This lets you query and analyze logs. For examples of the content of the JSON files, see <a href="https://help.aliyun.com/document_detail/308347.html">Resource configuration history examples</a>, <a href="https://help.aliyun.com/document_detail/307122.html">Non-compliant event examples</a>, and <a href="https://help.aliyun.com/document_detail/611894.html">Scheduled resource snapshot examples</a>.</li>
     * <li>Deliver to Object Storage Service (OSS)
     * When you deliver scheduled resource snapshots or configuration histories to a specified location in OSS, you must first create a bucket. This lets you view or download the JSON files. For examples of the content of the JSON files, see <a href="https://help.aliyun.com/document_detail/305669.html">Scheduled resource snapshot examples</a> and <a href="https://help.aliyun.com/document_detail/189738.html">Resource configuration history examples</a>.</li>
     * <li>Deliver to Simple Message Queue (formerly MNS)
     * When you deliver resource configuration histories and non-compliant events to a specified topic in MNS, you must first create a topic. This lets you set the push method and content for the topic. For examples of the content of the JSON files, see <a href="https://help.aliyun.com/document_detail/309462.html">Resource configuration history examples</a> and <a href="https://help.aliyun.com/document_detail/309463.html">Non-compliant event examples</a>.</li>
     * </ul>
     * <h3>Limits</h3>
     * <p>You can create a maximum of 5 delivery channels.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to create a delivery channel. In this example, the channel type is <code>OSS</code> and the destination ARN is <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>. The response shows that a delivery channel with the ID <code>cdc-8e45ff4e06a3a8****</code> is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a delivery channel to deliver resource data to Simple Log Service (SLS), Object Storage Service (OSS), or Simple Message Queue (formerly MNS).</p>
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
     * <h3>Background information</h3>
     * <ul>
     * <li>Deliver to Simple Log Service (SLS)
     * When you deliver resource configuration histories, non-compliant events, and scheduled snapshots to a Logstore in SLS, you must first create a project and a Logstore. This lets you query and analyze logs. For examples of the content of the JSON files, see <a href="https://help.aliyun.com/document_detail/308347.html">Resource configuration history examples</a>, <a href="https://help.aliyun.com/document_detail/307122.html">Non-compliant event examples</a>, and <a href="https://help.aliyun.com/document_detail/611894.html">Scheduled resource snapshot examples</a>.</li>
     * <li>Deliver to Object Storage Service (OSS)
     * When you deliver scheduled resource snapshots or configuration histories to a specified location in OSS, you must first create a bucket. This lets you view or download the JSON files. For examples of the content of the JSON files, see <a href="https://help.aliyun.com/document_detail/305669.html">Scheduled resource snapshot examples</a> and <a href="https://help.aliyun.com/document_detail/189738.html">Resource configuration history examples</a>.</li>
     * <li>Deliver to Simple Message Queue (formerly MNS)
     * When you deliver resource configuration histories and non-compliant events to a specified topic in MNS, you must first create a topic. This lets you set the push method and content for the topic. For examples of the content of the JSON files, see <a href="https://help.aliyun.com/document_detail/309462.html">Resource configuration history examples</a> and <a href="https://help.aliyun.com/document_detail/309463.html">Non-compliant event examples</a>.</li>
     * </ul>
     * <h3>Limits</h3>
     * <p>You can create a maximum of 5 delivery channels.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to create a delivery channel. In this example, the channel type is <code>OSS</code> and the destination ARN is <code>acs:oss:cn-shanghai:100931896542****:new-bucket</code>. The response shows that a delivery channel with the ID <code>cdc-8e45ff4e06a3a8****</code> is created.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a delivery channel to deliver resource data to Simple Log Service (SLS), Object Storage Service (OSS), or Simple Message Queue (formerly MNS).</p>
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
     * <h3>Limits</h3>
     * <p>You can create up to 200 rules for each account.</p>
     * <h3>Background information</h3>
     * <p>You can create rules in Cloud Config in the following ways:</p>
     * <ul>
     * <li>Create rules from templates
     * Rule templates are predefined rule functions in Function Compute that are provided by Cloud Config. You can use rule templates to create rules quickly. For more information about rules, see <a href="https://help.aliyun.com/document_detail/128273.html">Definition and working principles of rules</a>.</li>
     * <li>Create custom rules using Function Compute
     * Custom rules are based on functions in Function Compute that host your rule code. If the predefined rule templates in Cloud Config do not meet your compliance requirements, you can write your own function code to check compliance in complex scenarios. For more information about custom rules, see <a href="https://help.aliyun.com/document_detail/127405.html">Definition and working principles of custom rules</a>.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to create a rule from the \<code>required-tags\\</code> template. In the response, a rule is created and its ID is <code>cr-5772ba41209e007b****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a rule from a template or a custom rule using Function Compute to check resource compliance. After you create a rule, Cloud Config runs an initial evaluation and then automatically triggers subsequent evaluations based on the rule\&quot;s trigger. You can also run evaluations manually.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.conditions)) {
            body.put("Conditions", request.conditions);
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
     * <h3>Limits</h3>
     * <p>You can create up to 200 rules for each account.</p>
     * <h3>Background information</h3>
     * <p>You can create rules in Cloud Config in the following ways:</p>
     * <ul>
     * <li>Create rules from templates
     * Rule templates are predefined rule functions in Function Compute that are provided by Cloud Config. You can use rule templates to create rules quickly. For more information about rules, see <a href="https://help.aliyun.com/document_detail/128273.html">Definition and working principles of rules</a>.</li>
     * <li>Create custom rules using Function Compute
     * Custom rules are based on functions in Function Compute that host your rule code. If the predefined rule templates in Cloud Config do not meet your compliance requirements, you can write your own function code to check compliance in complex scenarios. For more information about custom rules, see <a href="https://help.aliyun.com/document_detail/127405.html">Definition and working principles of custom rules</a>.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to create a rule from the \<code>required-tags\\</code> template. In the response, a rule is created and its ID is <code>cr-5772ba41209e007b****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a rule from a template or a custom rule using Function Compute to check resource compliance. After you create a rule, Cloud Config runs an initial evaluation and then automatically triggers subsequent evaluations based on the rule\&quot;s trigger. You can also run evaluations manually.</p>
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
     * <h3>Background information</h3>
     * <ul>
     * <li>Template-based remediation: Uses public templates from Operation Orchestration Service (OOS) to remediate non-compliant resources.
     * Each rule supports only one remediation. This remediation type is available only for rules created from specific templates.</li>
     * <li>Custom remediation: Uses custom code in Function Compute (FC) to remediate non-compliant resources.
     * Each rule supports only one remediation. This remediation type is available for rules created from templates and custom rules.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <p>In this example, a remediation is created for the rule <code>cr-8a973ac2e2be00a2****</code>. The sample response shows that the remediation is created and has the ID <code>crr-909ba2d4716700eb****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a remediation for an existing rule.</p>
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
     * <h3>Background information</h3>
     * <ul>
     * <li>Template-based remediation: Uses public templates from Operation Orchestration Service (OOS) to remediate non-compliant resources.
     * Each rule supports only one remediation. This remediation type is available only for rules created from specific templates.</li>
     * <li>Custom remediation: Uses custom code in Function Compute (FC) to remediate non-compliant resources.
     * Each rule supports only one remediation. This remediation type is available for rules created from templates and custom rules.</li>
     * </ul>
     * <h3>Usage notes</h3>
     * <p>In this example, a remediation is created for the rule <code>cr-8a973ac2e2be00a2****</code>. The sample response shows that the remediation is created and has the ID <code>crr-909ba2d4716700eb****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a remediation for an existing rule.</p>
     * 
     * @param request CreateRemediationRequest
     * @return CreateRemediationResponse
     */
    public CreateRemediationResponse createRemediation(CreateRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRemediationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create a compliance report template for the current UID.</p>
     * 
     * @param tmpReq CreateReportTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateReportTemplateResponse
     */
    public CreateReportTemplateResponse createReportTemplateWithOptions(CreateReportTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateReportTemplateShrinkRequest request = new CreateReportTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.reportScope)) {
            request.reportScopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.reportScope, "ReportScope", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportFileFormats)) {
            body.put("ReportFileFormats", request.reportFileFormats);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportGranularity)) {
            body.put("ReportGranularity", request.reportGranularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportLanguage)) {
            body.put("ReportLanguage", request.reportLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportScopeShrink)) {
            body.put("ReportScope", request.reportScopeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportTemplateDescription)) {
            body.put("ReportTemplateDescription", request.reportTemplateDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportTemplateName)) {
            body.put("ReportTemplateName", request.reportTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionFrequency)) {
            body.put("SubscriptionFrequency", request.subscriptionFrequency);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateReportTemplate"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateReportTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create a compliance report template for the current UID.</p>
     * 
     * @param request CreateReportTemplateRequest
     * @return CreateReportTemplateResponse
     */
    public CreateReportTemplateResponse createReportTemplate(CreateReportTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createReportTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停用账号组规则</p>
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
     * <b>summary</b> : 
     * <p>停用账号组规则</p>
     * 
     * @param request DeactiveAggregateConfigRulesRequest
     * @return DeactiveAggregateConfigRulesResponse
     */
    public DeactiveAggregateConfigRulesResponse deactiveAggregateConfigRules(DeactiveAggregateConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactiveAggregateConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停用指定规则</p>
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
     * <b>summary</b> : 
     * <p>停用指定规则</p>
     * 
     * @param request DeactiveConfigRulesRequest
     * @return DeactiveConfigRulesResponse
     */
    public DeactiveConfigRulesResponse deactiveConfigRules(DeactiveConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deactiveConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定账号组内的合规包。删除合规包后，该合规包的检查结果和检查报告也自动被删除</p>
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
     * <b>summary</b> : 
     * <p>删除指定账号组内的合规包。删除合规包后，该合规包的检查结果和检查报告也自动被删除</p>
     * 
     * @param request DeleteAggregateCompliancePacksRequest
     * @return DeleteAggregateCompliancePacksResponse
     */
    public DeleteAggregateCompliancePacksResponse deleteAggregateCompliancePacks(DeleteAggregateCompliancePacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAggregateCompliancePacksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>账号组删除投递渠道</p>
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
     * <b>summary</b> : 
     * <p>账号组删除投递渠道</p>
     * 
     * @param request DeleteAggregateConfigDeliveryChannelRequest
     * @return DeleteAggregateConfigDeliveryChannelResponse
     */
    public DeleteAggregateConfigDeliveryChannelResponse deleteAggregateConfigDeliveryChannel(DeleteAggregateConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAggregateConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除指定账号组内的规则。删除规则后，其配置信息不再保留</p>
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
     * <b>summary</b> : 
     * <p>删除指定账号组内的规则。删除规则后，其配置信息不再保留</p>
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
     * <p>This topic provides an example of how to delete the remediation setting <code>crr-909ba2d4716700eb****</code> for a rule in the account group <code>ca-6b4a626622af0012****</code>. The response shows that the remediation setting is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the remediation settings for a rule in a specified account group.</p>
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
     * <p>This topic provides an example of how to delete the remediation setting <code>crr-909ba2d4716700eb****</code> for a rule in the account group <code>ca-6b4a626622af0012****</code>. The response shows that the remediation setting is deleted.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes the remediation settings for a rule in a specified account group.</p>
     * 
     * @param request DeleteAggregateRemediationsRequest
     * @return DeleteAggregateRemediationsResponse
     */
    public DeleteAggregateRemediationsResponse deleteAggregateRemediations(DeleteAggregateRemediationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAggregateRemediationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除账号组</p>
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
     * <b>summary</b> : 
     * <p>删除账号组</p>
     * 
     * @param request DeleteAggregatorsRequest
     * @return DeleteAggregatorsResponse
     */
    public DeleteAggregatorsResponse deleteAggregators(DeleteAggregatorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAggregatorsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除合规包</p>
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
     * <b>summary</b> : 
     * <p>批量删除合规包</p>
     * 
     * @param request DeleteCompliancePacksRequest
     * @return DeleteCompliancePacksResponse
     */
    public DeleteCompliancePacksResponse deleteCompliancePacks(DeleteCompliancePacksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCompliancePacksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>当前账号删除投递渠道</p>
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
     * <b>summary</b> : 
     * <p>当前账号删除投递渠道</p>
     * 
     * @param request DeleteConfigDeliveryChannelRequest
     * @return DeleteConfigDeliveryChannelResponse
     */
    public DeleteConfigDeliveryChannelResponse deleteConfigDeliveryChannel(DeleteConfigDeliveryChannelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteConfigDeliveryChannelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量删除规则</p>
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
     * <b>summary</b> : 
     * <p>批量删除规则</p>
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
     * <p>This topic provides an example of how to delete a remediation setting for a rule. In this example, the remediation setting with the ID <code>crr-909ba2d4716700eb****</code> is deleted. The response indicates that the operation is successful.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes specified remediation settings.</p>
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
     * <p>This topic provides an example of how to delete a remediation setting for a rule. In this example, the remediation setting with the ID <code>crr-909ba2d4716700eb****</code> is deleted. The response indicates that the operation is successful.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes specified remediation settings.</p>
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
     * <p>Deletes a compliance report template.</p>
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
     * <p>Deletes a compliance report template.</p>
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
     * <p>This operation retrieves the details of multiple resources in a batch.</p>
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
     * <p>This operation retrieves the details of multiple resources in a batch.</p>
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
     * <p>Queries the authorization status of an integrated cloud service.</p>
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
     * <p>Queries the authorization status of an integrated cloud service.</p>
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
     * <p>获取修正详情</p>
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
     * <p>获取修正详情</p>
     * 
     * @param request DescribeRemediationRequest
     * @return DescribeRemediationResponse
     */
    public DescribeRemediationResponse describeRemediation(DescribeRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRemediationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>将指定账号组规则从指定账号组合规包中移出</p>
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
     * <b>summary</b> : 
     * <p>将指定账号组规则从指定账号组合规包中移出</p>
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
     * <p>Make sure that the destination compliance package contains rules.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of detaching the rule <code>cr-6cc4626622af00e7****</code> from the compliance package <code>cp-5bb1626622af00bd****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation detaches one or more rules from a compliance package.</p>
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
     * <p>Make sure that the destination compliance package contains rules.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of detaching the rule <code>cr-6cc4626622af00e7****</code> from the compliance package <code>cp-5bb1626622af00bd****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation detaches one or more rules from a compliance package.</p>
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
     * <p>This API performs a dry run on rules for proactive compliance pre-checks.</p>
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
     * <p>This API performs a dry run on rules for proactive compliance pre-checks.</p>
     * 
     * @param request DryRunConfigRuleRequest
     * @return DryRunConfigRuleResponse
     */
    public DryRunConfigRuleResponse dryRunConfigRule(DryRunConfigRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.dryRunConfigRuleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about the concepts, operating principles, and integration process of evaluation rules, see <a href="https://help.aliyun.com/document_detail/470802.html">Definition and operating principles of evaluation rules</a>.
     * After you create an evaluation rule, a managed rule with the same settings is created. This managed rule can continuously check the compliance of resources after they are created.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes evaluation rules to perform compliance pre-checks on resources.</p>
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
     * <b>description</b> :
     * <p>For more information about the concepts, operating principles, and integration process of evaluation rules, see <a href="https://help.aliyun.com/document_detail/470802.html">Definition and operating principles of evaluation rules</a>.
     * After you create an evaluation rule, a managed rule with the same settings is created. This managed rule can continuously check the compliance of resources after they are created.</p>
     * 
     * <b>summary</b> : 
     * <p>Executes evaluation rules to perform compliance pre-checks on resources.</p>
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
     * <p>This operation only generates the latest assessment report. You need to call the GetAggregateCompliancePackReport operation to download the assessment report. For more information, see <a href="https://help.aliyun.com/document_detail/262699.html">GetAggregateCompliancePackReport</a>.
     * This topic provides an example that shows how to generate an assessment report for the compliance package <code>cp-fdc8626622af00f9****</code> in the account group <code>ca-f632626622af0079****</code>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates an assessment report for a specified compliance package in a specified account group.</p>
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
     * <p>This operation only generates the latest assessment report. You need to call the GetAggregateCompliancePackReport operation to download the assessment report. For more information, see <a href="https://help.aliyun.com/document_detail/262699.html">GetAggregateCompliancePackReport</a>.
     * This topic provides an example that shows how to generate an assessment report for the compliance package <code>cp-fdc8626622af00f9****</code> in the account group <code>ca-f632626622af0079****</code>.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Generates an assessment report for a specified compliance package in a specified account group.</p>
     * 
     * @param request GenerateAggregateCompliancePackReportRequest
     * @return GenerateAggregateCompliancePackReportResponse
     */
    public GenerateAggregateCompliancePackReportResponse generateAggregateCompliancePackReport(GenerateAggregateCompliancePackReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateAggregateCompliancePackReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成指定账号组的合规报告</p>
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
     * <b>summary</b> : 
     * <p>生成指定账号组的合规报告</p>
     * 
     * @param request GenerateAggregateConfigRulesReportRequest
     * @return GenerateAggregateConfigRulesReportResponse
     */
    public GenerateAggregateConfigRulesReportResponse generateAggregateConfigRulesReport(GenerateAggregateConfigRulesReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateAggregateConfigRulesReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>账号组资源清单生成</p>
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
     * <b>summary</b> : 
     * <p>账号组资源清单生成</p>
     * 
     * @param request GenerateAggregateResourceInventoryRequest
     * @return GenerateAggregateResourceInventoryResponse
     */
    public GenerateAggregateResourceInventoryResponse generateAggregateResourceInventory(GenerateAggregateResourceInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateAggregateResourceInventoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成合规包的合规包报告</p>
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
     * <b>summary</b> : 
     * <p>生成合规包的合规包报告</p>
     * 
     * @param request GenerateCompliancePackReportRequest
     * @return GenerateCompliancePackReportResponse
     */
    public GenerateCompliancePackReportResponse generateCompliancePackReport(GenerateCompliancePackReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateCompliancePackReportWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>生成规则的合规评估报告</p>
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
     * <b>summary</b> : 
     * <p>生成规则的合规评估报告</p>
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
     * <p>Generate a report ID from a report template.</p>
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
     * <p>Generate a report ID from a report template.</p>
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
     * <p>This topic provides an example of how to generate a downloadable inventory of global resources for the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a downloadable inventory of global resources.</p>
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
     * <p>This topic provides an example of how to generate a downloadable inventory of global resources for the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Generates a downloadable inventory of global resources.</p>
     * 
     * @param request GenerateResourceInventoryRequest
     * @return GenerateResourceInventoryResponse
     */
    public GenerateResourceInventoryResponse generateResourceInventory(GenerateResourceInventoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.generateResourceInventoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>高级搜索 获取搜索结果下载文件地址</p>
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
     * <b>summary</b> : 
     * <p>高级搜索 获取搜索结果下载文件地址</p>
     * @return GetAdvancedSearchFileResponse
     */
    public GetAdvancedSearchFileResponse getAdvancedSearchFile() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAdvancedSearchFileWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定账号组内指定合规包中成员账号的合规结果</p>
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
     * <b>summary</b> : 
     * <p>查询指定账号组内指定合规包中成员账号的合规结果</p>
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
     * <p>高级搜获取搜索结果下载文件地址</p>
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
     * <p>高级搜获取搜索结果下载文件地址</p>
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
     * <p>This topic provides an example of how to retrieve the details of the compliance pack <code>cp-fdc8626622af00f9****</code> in the account group <code>ca-f632626622af0079****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a compliance pack in a specified account group.</p>
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
     * <p>This topic provides an example of how to retrieve the details of the compliance pack <code>cp-fdc8626622af00f9****</code> in the account group <code>ca-f632626622af0079****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a compliance pack in a specified account group.</p>
     * 
     * @param request GetAggregateCompliancePackRequest
     * @return GetAggregateCompliancePackResponse
     */
    public GetAggregateCompliancePackResponse getAggregateCompliancePack(GetAggregateCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateCompliancePackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定账号组内指定合规包的评估报告</p>
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
     * <b>summary</b> : 
     * <p>获取指定账号组内指定合规包的评估报告</p>
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
     * <p>This topic provides an example of how to query the compliance summary by resource and by rule for the account group ca-a91d626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance summary for a specified account group.</p>
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
     * <p>This topic provides an example of how to query the compliance summary by resource and by rule for the account group ca-a91d626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance summary for a specified account group.</p>
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
     * <p>账号组查询单个投递渠道</p>
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
     * <p>账号组查询单个投递渠道</p>
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
     * <p>This topic provides an example of how to query the details of the rule <code>cr-7f7d626622af0041****</code> in the account group <code>ca-7f00626622af0041****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specific rule in a specified account group.</p>
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
     * <p>This topic provides an example of how to query the details of the rule <code>cr-7f7d626622af0041****</code> in the account group <code>ca-7f00626622af0041****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specific rule in a specified account group.</p>
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
     * <p>This topic provides an example of how to query the compliance results of rules in the compliance pack <code>cp-541e626622af0087****</code> for the account group <code>ca-04b3fd170e340007****</code>. The response returns a total of <code>1</code> rule and <code>0</code> non-compliant rules.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance results of rules in a specified compliance pack within a specified account group.</p>
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
     * <p>This topic provides an example of how to query the compliance results of rules in the compliance pack <code>cp-541e626622af0087****</code> for the account group <code>ca-04b3fd170e340007****</code>. The response returns a total of <code>1</code> rule and <code>0</code> non-compliant rules.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance results of rules in a specified compliance pack within a specified account group.</p>
     * 
     * @param request GetAggregateConfigRuleComplianceByPackRequest
     * @return GetAggregateConfigRuleComplianceByPackResponse
     */
    public GetAggregateConfigRuleComplianceByPackResponse getAggregateConfigRuleComplianceByPack(GetAggregateConfigRuleComplianceByPackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateConfigRuleComplianceByPackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询指定风险等级的账号组规则合规统计</p>
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
     * <b>summary</b> : 
     * <p>查询指定风险等级的账号组规则合规统计</p>
     * 
     * @param request GetAggregateConfigRuleSummaryByRiskLevelRequest
     * @return GetAggregateConfigRuleSummaryByRiskLevelResponse
     */
    public GetAggregateConfigRuleSummaryByRiskLevelResponse getAggregateConfigRuleSummaryByRiskLevel(GetAggregateConfigRuleSummaryByRiskLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateConfigRuleSummaryByRiskLevelWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>下载Excel格式的规则合规评估报告到本地，便于您云下分配任务并跟进不合规资源配置的修改</p>
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
     * <b>summary</b> : 
     * <p>下载Excel格式的规则合规评估报告到本地，便于您云下分配任务并跟进不合规资源配置的修改</p>
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
     * <p>This topic provides an example on how to query the details of an ECS instance <code>i-bp12g4xbl4i0brkn****</code> in the Hangzhou region within the account group <code>ca-5885626622af0008****</code>.</p>
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
     * <p>This topic provides an example on how to query the details of an ECS instance <code>i-bp12g4xbl4i0brkn****</code> in the Hangzhou region within the account group <code>ca-5885626622af0008****</code>.</p>
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
     * <b>summary</b> : 
     * <p>查询多账号规则合规情况</p>
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
     * <b>summary</b> : 
     * <p>查询多账号规则合规情况</p>
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
     * <p>This topic provides an example of how to query the compliance results for resources in the compliance package <code>cp-fdc8626622af00f9****</code> within the account group <code>ca-f632626622af0079****</code>. The response shows that of a total of <code>10</code> resources, <code>7</code> are non-compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance statistics for resources in a specified compliance package within a specified account group.</p>
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
     * <p>This topic provides an example of how to query the compliance results for resources in the compliance package <code>cp-fdc8626622af00f9****</code> within the account group <code>ca-f632626622af0079****</code>. The response shows that of a total of <code>10</code> resources, <code>7</code> are non-compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance statistics for resources in a specified compliance package within a specified account group.</p>
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
     * <p>查询指定账号组内规则对资源的评估结果，评估结果按资源所属地域进行分组展示</p>
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
     * <p>查询指定账号组内规则对资源的评估结果，评估结果按资源所属地域进行分组展示</p>
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
     * <p>查询指定账号组内规则对资源的评估结果，评估结果按资源类型进行分组展示</p>
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
     * <p>查询指定账号组内规则对资源的评估结果，评估结果按资源类型进行分组展示</p>
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
     * <p>In Cloud Config, each resource has its own compliance timeline, which is composed of compliance evaluation records. A record is generated each time a rule is triggered to evaluate the resource. Rules can be triggered by configuration changes, periodic executions, or manual executions.
     * This topic provides an example of how to query the compliance timeline for the resource <code>new-bucket</code> (an OSS bucket). The resource is in the <code>cn-hangzhou</code> region and belongs to the member account <code>100931896542****</code> within the account group <code>ca-5885626622af0008****</code>. The response shows that the resource\&quot;s compliance timeline includes records with the timestamps <code>1625200295276</code> (UTC+8: 2021-07-02 12:31:35) and <code>1625200228510</code> (UTC+8: 2021-07-02 12:30:28).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance timeline of a specific resource in an account group. A compliance timeline is a set of compliance evaluation records for a resource. Each record includes the time and content of an evaluation.</p>
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
     * <p>In Cloud Config, each resource has its own compliance timeline, which is composed of compliance evaluation records. A record is generated each time a rule is triggered to evaluate the resource. Rules can be triggered by configuration changes, periodic executions, or manual executions.
     * This topic provides an example of how to query the compliance timeline for the resource <code>new-bucket</code> (an OSS bucket). The resource is in the <code>cn-hangzhou</code> region and belongs to the member account <code>100931896542****</code> within the account group <code>ca-5885626622af0008****</code>. The response shows that the resource\&quot;s compliance timeline includes records with the timestamps <code>1625200295276</code> (UTC+8: 2021-07-02 12:31:35) and <code>1625200228510</code> (UTC+8: 2021-07-02 12:30:28).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance timeline of a specific resource in an account group. A compliance timeline is a set of compliance evaluation records for a resource. Each record includes the time and content of an evaluation.</p>
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
     * <p>Cloud Config provides a configuration history for each resource within the monitoring scope:</p>
     * <ul>
     * <li>For resources that already exist when you enable Cloud Config, the configuration history begins when the service is enabled.</li>
     * <li>For resources that are created after you enable Cloud Config, the configuration history begins when the resources are created. Cloud Config records resource configuration changes every 10 minutes. When the configuration of a resource changes, a node appears in the configuration history. This node contains the resource configuration details, change details, and the related management event.
     * This topic provides an example of how to query the configuration history of an OSS bucket named <code>new-bucket</code>. The bucket is in the <code>cn-hangzhou</code> region, belongs to the member account <code>100931896542****</code>, and is part of the account group <code>ca-5885626622af0008****</code>. The returned result indicates that a configuration change for the resource was recorded at the UNIX timestamp <code>1624961112000</code> (UTC+8: 2021-06-29 18:05:12).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration history of a specific resource in a specified account group. After you enable Cloud Config, the service records all configuration and relationship changes for your resources and organizes them into a configuration history. This history is saved for 10 years by default.</p>
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
     * <p>Cloud Config provides a configuration history for each resource within the monitoring scope:</p>
     * <ul>
     * <li>For resources that already exist when you enable Cloud Config, the configuration history begins when the service is enabled.</li>
     * <li>For resources that are created after you enable Cloud Config, the configuration history begins when the resources are created. Cloud Config records resource configuration changes every 10 minutes. When the configuration of a resource changes, a node appears in the configuration history. This node contains the resource configuration details, change details, and the related management event.
     * This topic provides an example of how to query the configuration history of an OSS bucket named <code>new-bucket</code>. The bucket is in the <code>cn-hangzhou</code> region, belongs to the member account <code>100931896542****</code>, and is part of the account group <code>ca-5885626622af0008****</code>. The returned result indicates that a configuration change for the resource was recorded at the UNIX timestamp <code>1624961112000</code> (UTC+8: 2021-06-29 18:05:12).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration history of a specific resource in a specified account group. After you enable Cloud Config, the service records all configuration and relationship changes for your resources and organizes them into a configuration history. This history is saved for 10 years by default.</p>
     * 
     * @param request GetAggregateResourceConfigurationTimelineRequest
     * @return GetAggregateResourceConfigurationTimelineResponse
     */
    public GetAggregateResourceConfigurationTimelineResponse getAggregateResourceConfigurationTimeline(GetAggregateResourceConfigurationTimelineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceConfigurationTimelineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从地域维度查询指定账号组内资源的统计结果</p>
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
     * <b>summary</b> : 
     * <p>从地域维度查询指定账号组内资源的统计结果</p>
     * 
     * @param request GetAggregateResourceCountsGroupByRegionRequest
     * @return GetAggregateResourceCountsGroupByRegionResponse
     */
    public GetAggregateResourceCountsGroupByRegionResponse getAggregateResourceCountsGroupByRegion(GetAggregateResourceCountsGroupByRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceCountsGroupByRegionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从资源类型维度查询指定账号组内资源的统计结果</p>
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
     * <b>summary</b> : 
     * <p>从资源类型维度查询指定账号组内资源的统计结果</p>
     * 
     * @param request GetAggregateResourceCountsGroupByResourceTypeRequest
     * @return GetAggregateResourceCountsGroupByResourceTypeResponse
     */
    public GetAggregateResourceCountsGroupByResourceTypeResponse getAggregateResourceCountsGroupByResourceType(GetAggregateResourceCountsGroupByResourceTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAggregateResourceCountsGroupByResourceTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询账号组内全局资源下载清单信息。</p>
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
     * <b>summary</b> : 
     * <p>查询账号组内全局资源下载清单信息。</p>
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
     * <p>This topic provides an example of how to query the details of the account group <code>ca-88ea626622af0055****</code>. The response shows that the account group name is <code>Test_Group</code>, the description is <code>Test Group</code>, the type is <code>CUSTOM</code> (custom account group), and the status is <code>1</code> (created).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the name, creation time, members, and type of an account group.</p>
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
     * <p>This topic provides an example of how to query the details of the account group <code>ca-88ea626622af0055****</code>. The response shows that the account group name is <code>Test_Group</code>, the description is <code>Test Group</code>, the type is <code>CUSTOM</code> (custom account group), and the status is <code>1</code> (created).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the name, creation time, members, and type of an account group.</p>
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
     * <p>This topic provides an example of how to query the details of the compliance package <code>cp-fdc8626622af00f9****</code>. The response indicates that the compliance package is named <code>MLPS 2.0 Level 3 Pre-check Compliance Package</code>, its status is <code>ACTIVE</code>, and the risk level of its rules is <code>1</code> (high risk).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specific compliance package.</p>
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
     * <p>This topic provides an example of how to query the details of the compliance package <code>cp-fdc8626622af00f9****</code>. The response indicates that the compliance package is named <code>MLPS 2.0 Level 3 Pre-check Compliance Package</code>, its status is <code>ACTIVE</code>, and the risk level of its rules is <code>1</code> (high risk).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specific compliance package.</p>
     * 
     * @param request GetCompliancePackRequest
     * @return GetCompliancePackResponse
     */
    public GetCompliancePackResponse getCompliancePack(GetCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCompliancePackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取合规包的评估报告</p>
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
     * <b>summary</b> : 
     * <p>获取合规包的评估报告</p>
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
     * <p>This topic provides an example of how to query the compliance summary by resource and rule for an account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance summary for the current account.</p>
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
     * <p>This topic provides an example of how to query the compliance summary by resource and rule for an account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance summary for the current account.</p>
     * @return GetComplianceSummaryResponse
     */
    public GetComplianceSummaryResponse getComplianceSummary() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getComplianceSummaryWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of a specified delivery channel.</p>
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
     * <p>Queries the details of a specified delivery channel.</p>
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
     * <p>This topic provides an example of how to query the details of the rule <code>cr-7f7d626622af0041****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified rule.</p>
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
     * <p>This topic provides an example of how to query the details of the rule <code>cr-7f7d626622af0041****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified rule.</p>
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
     * <p>This example shows how to query the compliance results for rules in the compliance package <code>cp-541e626622af0087****</code>. The response shows that the total number of rules is 1 and the number of non-compliant rules is 0.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance statistics for rules in a specified compliance package.</p>
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
     * <p>This example shows how to query the compliance results for rules in the compliance package <code>cp-541e626622af0087****</code>. The response shows that the total number of rules is 1 and the number of non-compliant rules is 0.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance statistics for rules in a specified compliance package.</p>
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
     * <b>summary</b> : 
     * <p>下载Excel格式的规则合规评估报告到本地，便于您云下分配任务并跟进不合规资源配置的修改</p>
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
     * <b>summary</b> : 
     * <p>下载Excel格式的规则合规评估报告到本地，便于您云下分配任务并跟进不合规资源配置的修改</p>
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
     * <p>This topic provides an example of how to query the status of the Cloud Config service and the resource monitoring scope for the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of the Cloud Config service and the resource monitoring scope for the current account.</p>
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
     * <p>This topic provides an example of how to query the status of the Cloud Config service and the resource monitoring scope for the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of the Cloud Config service and the resource monitoring scope for the current account.</p>
     * @return GetConfigurationRecorderResponse
     */
    public GetConfigurationRecorderResponse getConfigurationRecorder() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConfigurationRecorderWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the details of the ECS instance <code>i-bp12g4xbl4i0brkn****</code> in the China (Hangzhou) region.</p>
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
     * <p>This topic provides an example of how to query the details of the ECS instance <code>i-bp12g4xbl4i0brkn****</code> in the China (Hangzhou) region.</p>
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
     * <b>summary</b> : 
     * <p>从地域维度查询资源的统计结果</p>
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
     * <b>summary</b> : 
     * <p>从地域维度查询资源的统计结果</p>
     * 
     * @param request GetDiscoveredResourceCountsGroupByRegionRequest
     * @return GetDiscoveredResourceCountsGroupByRegionResponse
     */
    public GetDiscoveredResourceCountsGroupByRegionResponse getDiscoveredResourceCountsGroupByRegion(GetDiscoveredResourceCountsGroupByRegionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDiscoveredResourceCountsGroupByRegionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从资源类型维度查询资源的统计结果</p>
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
     * <b>summary</b> : 
     * <p>从资源类型维度查询资源的统计结果</p>
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
     * <p>查询用户集成云产品的授权状态</p>
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
     * <p>查询用户集成云产品的授权状态</p>
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
     * <p>This topic provides an example of how to query the details of the rule template <code>cdn-domain-https-enabled</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified rule template.</p>
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
     * <p>This topic provides an example of how to query the details of the rule template <code>cdn-domain-https-enabled</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a specified rule template.</p>
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
     * <p>This topic describes how to query the details of the <code>ACS-ALB-BulkyEnableDeletionProtection</code> automatic remediation template.</p>
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
     * <p>This topic describes how to query the details of the <code>ACS-ALB-BulkyEnableDeletionProtection</code> automatic remediation template.</p>
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
     * <p>Retrieves a report generated from a report template.</p>
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
     * <p>Retrieves a report generated from a report template.</p>
     * 
     * @param request GetReportFromTemplateRequest
     * @return GetReportFromTemplateResponse
     */
    public GetReportFromTemplateResponse getReportFromTemplate(GetReportFromTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getReportFromTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve details of a compliance report template.</p>
     * 
     * @param request GetReportTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetReportTemplateResponse
     */
    public GetReportTemplateResponse getReportTemplateWithOptions(GetReportTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportTemplateId)) {
            query.put("ReportTemplateId", request.reportTemplateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetReportTemplate"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetReportTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieve details of a compliance report template.</p>
     * 
     * @param request GetReportTemplateRequest
     * @return GetReportTemplateResponse
     */
    public GetReportTemplateResponse getReportTemplate(GetReportTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getReportTemplateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>从规则的合规评估结果维度查询合规概要</p>
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
     * <b>summary</b> : 
     * <p>从规则的合规评估结果维度查询合规概要</p>
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
     * <p>This topic provides an example of how to query the compliance results for resources in the compliance package <code>cp-541e626622af0087****</code>. The response shows that 7 of the 10 resources are non-compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance results for resources in a compliance package.</p>
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
     * <p>This topic provides an example of how to query the compliance results for resources in the compliance package <code>cp-541e626622af0087****</code>. The response shows that 7 of the 10 resources are non-compliant.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance results for resources in a compliance package.</p>
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
     * <p>查询合规情况按照地域分组统计</p>
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
     * <p>查询合规情况按照地域分组统计</p>
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
     * <p>查询规则对资源的评估结果，评估结果按资源类型进行分组展示</p>
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
     * <p>查询规则对资源的评估结果，评估结果按资源类型进行分组展示</p>
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
     * <p>In Cloud Config, each resource has its own compliance evaluation history. A compliance evaluation record is generated when a rule is triggered to evaluate a resource. The collection of these records forms the compliance evaluation history of the resource. Rules can be triggered by configuration changes, periodic execution, or manual execution.
     * This topic provides an example of how to query the compliance evaluation history of the resource <code>new-bucket</code>, which is an Object Storage Service (OSS) bucket in the <code>cn-hangzhou</code> region. The returned result shows that the compliance evaluation history of the resource includes records with the timestamps <code>1625200295276</code> (UTC+8: 2021-07-02 12:31:35) and <code>1625200228510</code> (UTC+8: 2021-07-02 12:30:28).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation history of a specified resource. The history is a set of compliance evaluation records that contain the timestamp and details of each evaluation.</p>
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
     * <p>In Cloud Config, each resource has its own compliance evaluation history. A compliance evaluation record is generated when a rule is triggered to evaluate a resource. The collection of these records forms the compliance evaluation history of the resource. Rules can be triggered by configuration changes, periodic execution, or manual execution.
     * This topic provides an example of how to query the compliance evaluation history of the resource <code>new-bucket</code>, which is an Object Storage Service (OSS) bucket in the <code>cn-hangzhou</code> region. The returned result shows that the compliance evaluation history of the resource includes records with the timestamps <code>1625200295276</code> (UTC+8: 2021-07-02 12:31:35) and <code>1625200228510</code> (UTC+8: 2021-07-02 12:30:28).</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation history of a specified resource. The history is a set of compliance evaluation records that contain the timestamp and details of each evaluation.</p>
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
     * <p>This operation obtains configuration samples for a specified resource type.</p>
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
     * <p>This operation obtains configuration samples for a specified resource type.</p>
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
     * <p>Cloud Config provides a configuration history for each resource that it monitors. The details are as follows:</p>
     * <ul>
     * <li>For existing resources, the configuration history starts when you enable the Cloud Config service.</li>
     * <li>For new resources created after you enable the service, the configuration history starts when the resource is created. Cloud Config records configuration changes every 10 minutes. When a configuration changes, a new node appears in the history. This node contains the resource configuration details, change details, and the associated management event.
     * This topic provides an example of how to query the configuration history for a resource named <code>new-bucket</code>. The resource is a bucket in the <code>cn-hangzhou</code> region. The response shows that the creation time of the resource is <code>1624961112000</code> (18:05:12 on June 29, 2021, UTC+8).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration history of a specified resource. Cloud Config records every configuration and relationship change for a resource in a configuration history. Recording starts after you enable the Cloud Config service. By default, the history is retained for 10 years.</p>
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
     * <p>Cloud Config provides a configuration history for each resource that it monitors. The details are as follows:</p>
     * <ul>
     * <li>For existing resources, the configuration history starts when you enable the Cloud Config service.</li>
     * <li>For new resources created after you enable the service, the configuration history starts when the resource is created. Cloud Config records configuration changes every 10 minutes. When a configuration changes, a new node appears in the history. This node contains the resource configuration details, change details, and the associated management event.
     * This topic provides an example of how to query the configuration history for a resource named <code>new-bucket</code>. The resource is a bucket in the <code>cn-hangzhou</code> region. The response shows that the creation time of the resource is <code>1624961112000</code> (18:05:12 on June 29, 2021, UTC+8).</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the configuration history of a specified resource. Cloud Config records every configuration and relationship change for a resource in a configuration history. Recording starts after you enable the Cloud Config service. By default, the history is retained for 10 years.</p>
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
     * <h3>Prerequisites</h3>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2398354.html">GenerateResourceInventory</a> operation to generate a global resource inventory. You can then call this operation to obtain the URL of the global resource inventory.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to query the most recently generated global resource inventory for the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about the most recently generated global resource inventory for the current account.</p>
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
     * <h3>Prerequisites</h3>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/2398354.html">GenerateResourceInventory</a> operation to generate a global resource inventory. You can then call this operation to obtain the URL of the global resource inventory.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to query the most recently generated global resource inventory for the current account.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries information about the most recently generated global resource inventory for the current account.</p>
     * @return GetResourceInventoryResponse
     */
    public GetResourceInventoryResponse getResourceInventory() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getResourceInventoryWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>This operation retrieves the property descriptions for a specified resource type.</p>
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
     * <p>This operation retrieves the property descriptions for a specified resource type.</p>
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
     * <p>This topic provides an example of how to query the resource relations supported by the ACS::ECS::Instance resource type.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the supported resource relations for a specified resource type.</p>
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
     * <p>This topic provides an example of how to query the resource relations supported by the ACS::ECS::Instance resource type.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the supported resource relations for a specified resource type.</p>
     * 
     * @param request GetSupportedResourceRelationConfigRequest
     * @return GetSupportedResourceRelationConfigResponse
     */
    public GetSupportedResourceRelationConfigResponse getSupportedResourceRelationConfig(GetSupportedResourceRelationConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSupportedResourceRelationConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>忽略评估结果增加截止时间</p>
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
     * <b>summary</b> : 
     * <p>忽略评估结果增加截止时间</p>
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
     * <p>After a non-compliant resource is ignored, the rule still evaluates the resource. The evaluation result is Ignored.
     * This topic provides an example of how to ignore the evaluation results of the rule <code>cr-7e72626622af0051****</code> for a specified non-compliant resource in the Alibaba Cloud account <code>100931896542****</code>. The region ID of the resource is <code>cn-beijing</code>, the resource type is <code>ACS::SLB::LoadBalancer</code>, and the resource ID is <code>lb-hp3a3b4ztyfm2plgm****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Ignores the evaluation results of a rule for specific resources. You can also set a time period to ignore the rule. When the ignore period expires, the system automatically resumes displaying the evaluation results of the rule for the resources.</p>
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
     * <p>After a non-compliant resource is ignored, the rule still evaluates the resource. The evaluation result is Ignored.
     * This topic provides an example of how to ignore the evaluation results of the rule <code>cr-7e72626622af0051****</code> for a specified non-compliant resource in the Alibaba Cloud account <code>100931896542****</code>. The region ID of the resource is <code>cn-beijing</code>, the resource type is <code>ACS::SLB::LoadBalancer</code>, and the resource ID is <code>lb-hp3a3b4ztyfm2plgm****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Ignores the evaluation results of a rule for specific resources. You can also set a time period to ignore the rule. When the ignore period expires, the system automatically resumes displaying the evaluation results of the rule for the resources.</p>
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
     * <p>This topic provides an example of how to query the compliance packs in the account group <code>ca-f632626622af0079****</code>. The response shows that the account group contains the compliance pack <code>cp-fdc8626622af00f9****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance packs in a specified account group.</p>
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
     * <p>This topic provides an example of how to query the compliance packs in the account group <code>ca-f632626622af0079****</code>. The response shows that the account group contains the compliance pack <code>cp-fdc8626622af00f9****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the compliance packs in a specified account group.</p>
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
     * <p>账号组查询投递渠道列表</p>
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
     * <p>账号组查询投递渠道列表</p>
     * 
     * @param request ListAggregateConfigDeliveryChannelsRequest
     * @return ListAggregateConfigDeliveryChannelsResponse
     */
    public ListAggregateConfigDeliveryChannelsResponse listAggregateConfigDeliveryChannels(ListAggregateConfigDeliveryChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateConfigDeliveryChannelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the evaluation results of a rule for resources in a specified account group.</p>
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
     * <b>summary</b> : 
     * <p>Queries the evaluation results of a rule for resources in a specified account group.</p>
     * 
     * @param request ListAggregateConfigRuleEvaluationResultsRequest
     * @return ListAggregateConfigRuleEvaluationResultsResponse
     */
    public ListAggregateConfigRuleEvaluationResultsResponse listAggregateConfigRuleEvaluationResults(ListAggregateConfigRuleEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateConfigRuleEvaluationResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>透出用户账号组维度的评估结果统计</p>
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
     * <b>summary</b> : 
     * <p>透出用户账号组维度的评估结果统计</p>
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
     * <p>This topic provides an example of how to query the rules in the account group <code>ca-f632626622af0079****</code>. The response shows that the account group contains one rule. This rule evaluates two resources, and the compliance result is <code>COMPLIANT</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the rules in a specified account group.</p>
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
     * <p>This topic provides an example of how to query the rules in the account group <code>ca-f632626622af0079****</code>. The response shows that the account group contains one rule. This rule evaluates two resources, and the compliance result is <code>COMPLIANT</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the rules in a specified account group.</p>
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
     * <h3>Limits</h3>
     * <p>The resource checklist displays only some of your resources because Cloud Config supports only specific Alibaba Cloud services and resource types. For more information about the supported services and resource types, see <a href="https://help.aliyun.com/document_detail/127411.html">Supported resource types and resource relationships</a>.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to query the resources of a member with the ID <code>100931896542****</code> in the account group <code>ca-c560626622af0005****</code>. The response indicates that there are eight resources in total.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resources in a specified account group.</p>
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
     * <h3>Limits</h3>
     * <p>The resource checklist displays only some of your resources because Cloud Config supports only specific Alibaba Cloud services and resource types. For more information about the supported services and resource types, see <a href="https://help.aliyun.com/document_detail/127411.html">Supported resource types and resource relationships</a>.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to query the resources of a member with the ID <code>100931896542****</code> in the account group <code>ca-c560626622af0005****</code>. The response indicates that there are eight resources in total.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resources in a specified account group.</p>
     * 
     * @param request ListAggregateDiscoveredResourcesRequest
     * @return ListAggregateDiscoveredResourcesResponse
     */
    public ListAggregateDiscoveredResourcesResponse listAggregateDiscoveredResources(ListAggregateDiscoveredResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateDiscoveredResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For more information about the concepts, working principles, and integration process of dry run rules, see <a href="https://help.aliyun.com/document_detail/470802.html">Definition and working principles of dry run rules</a>.
     * Dry run rules and rule templates are based on the same underlying rule definitions. After you create a resource, a dry run rule continuously checks the resource for compliance.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation retrieves the list of recommended managed rules for an account group.</p>
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
     * <b>description</b> :
     * <p>For more information about the concepts, working principles, and integration process of dry run rules, see <a href="https://help.aliyun.com/document_detail/470802.html">Definition and working principles of dry run rules</a>.
     * Dry run rules and rule templates are based on the same underlying rule definitions. After you create a resource, a dry run rule continuously checks the resource for compliance.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation retrieves the list of recommended managed rules for an account group.</p>
     * 
     * @param request ListAggregateRecommendManagedRulesRequest
     * @return ListAggregateRecommendManagedRulesResponse
     */
    public ListAggregateRecommendManagedRulesResponse listAggregateRecommendManagedRules(ListAggregateRecommendManagedRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateRecommendManagedRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>账号组规则修正执行历史</p>
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
     * <b>summary</b> : 
     * <p>账号组规则修正执行历史</p>
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
     * <p>This topic provides an example of how to query the remediation settings for the rule <code>cr-6b7c626622af00b4****</code> in the account group <code>ca-6b4a626622af0012****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the remediations in a specified account group.</p>
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
     * <p>This topic provides an example of how to query the remediation settings for the rule <code>cr-6b7c626622af00b4****</code> in the account group <code>ca-6b4a626622af0012****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the remediations in a specified account group.</p>
     * 
     * @param request ListAggregateRemediationsRequest
     * @return ListAggregateRemediationsResponse
     */
    public ListAggregateRemediationsResponse listAggregateRemediations(ListAggregateRemediationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateRemediationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the rule evaluation results for resources in a specified account group.</p>
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
     * <b>summary</b> : 
     * <p>Queries the rule evaluation results for resources in a specified account group.</p>
     * 
     * @param request ListAggregateResourceEvaluationResultsRequest
     * @return ListAggregateResourceEvaluationResultsResponse
     */
    public ListAggregateResourceEvaluationResultsResponse listAggregateResourceEvaluationResults(ListAggregateResourceEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateResourceEvaluationResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源关系列表</p>
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
     * <b>summary</b> : 
     * <p>获取资源关系列表</p>
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
     * <p>When you write an SQL <code>Select</code> statement, you can retrieve the search fields and their types from the property file of the target resource type. For more information about resource property files, see <a href="https://github.com/aliyun/alibabacloud-config-resource-schema">alibabacloud-config-resource-schema</a>.</p>
     * <blockquote>
     * <ul>
     * <li><p>The resource property files contain all resource types that are supported by Cloud Config. These files are named after their corresponding resource types. For example, the property file for the <code>ACS::ECS::Instance</code> resource type is <code>ACS_ECS_Instance.properties.json</code>. The path to the property files is <code>config/properties/resource-types</code>.</p>
     * </li>
     * <li><p>For more information about SQL search examples and limits, see <a href="https://help.aliyun.com/document_detail/398718.html">SQL search examples</a> and <a href="https://help.aliyun.com/document_detail/398750.html">Limits of SQL search</a>.
     * This topic provides an example of an advanced search query. The query finds all resources in the account group <code>ca-4b05626622af000c****</code> that have a tag key of <code>business</code> and a tag value of <code>online</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You can use SQL Select statements to search for resources in a specific account group based on fields in the resource properties.</p>
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
     * <p>When you write an SQL <code>Select</code> statement, you can retrieve the search fields and their types from the property file of the target resource type. For more information about resource property files, see <a href="https://github.com/aliyun/alibabacloud-config-resource-schema">alibabacloud-config-resource-schema</a>.</p>
     * <blockquote>
     * <ul>
     * <li><p>The resource property files contain all resource types that are supported by Cloud Config. These files are named after their corresponding resource types. For example, the property file for the <code>ACS::ECS::Instance</code> resource type is <code>ACS_ECS_Instance.properties.json</code>. The path to the property files is <code>config/properties/resource-types</code>.</p>
     * </li>
     * <li><p>For more information about SQL search examples and limits, see <a href="https://help.aliyun.com/document_detail/398718.html">SQL search examples</a> and <a href="https://help.aliyun.com/document_detail/398750.html">Limits of SQL search</a>.
     * This topic provides an example of an advanced search query. The query finds all resources in the account group <code>ca-4b05626622af000c****</code> that have a tag key of <code>business</code> and a tag value of <code>online</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>You can use SQL Select statements to search for resources in a specific account group based on fields in the resource properties.</p>
     * 
     * @param request ListAggregateResourcesByAdvancedSearchRequest
     * @return ListAggregateResourcesByAdvancedSearchResponse
     */
    public ListAggregateResourcesByAdvancedSearchResponse listAggregateResourcesByAdvancedSearch(ListAggregateResourcesByAdvancedSearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAggregateResourcesByAdvancedSearchWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取账号组列表</p>
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
     * <b>summary</b> : 
     * <p>获取账号组列表</p>
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
     * <p>A compliance pack template is a collection of rules customized by CloudConfig for compliance scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of all compliance pack templates provided by CloudConfig.</p>
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
     * <p>A compliance pack template is a collection of rules customized by CloudConfig for compliance scenarios.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of all compliance pack templates provided by CloudConfig.</p>
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
     * <p>This topic provides an example of how to list compliance packs. The response returns one compliance pack record: <code>cp-fdc8626622af00f9****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the compliance packs for the current account.</p>
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
     * <p>This topic provides an example of how to list compliance packs. The response returns one compliance pack record: <code>cp-fdc8626622af00f9****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Lists the compliance packs for the current account.</p>
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
     * <p>Returns a list of delivery channels.</p>
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
     * <p>Returns a list of delivery channels.</p>
     * 
     * @param request ListConfigDeliveryChannelsRequest
     * @return ListConfigDeliveryChannelsResponse
     */
    public ListConfigDeliveryChannelsResponse listConfigDeliveryChannels(ListConfigDeliveryChannelsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigDeliveryChannelsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of a rule.</p>
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
     * <b>summary</b> : 
     * <p>Queries the compliance evaluation results of a rule.</p>
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
     * <p>透出用户维度的历史评估结果统计</p>
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
     * <p>透出用户维度的历史评估结果统计</p>
     * @return ListConfigRuleEvaluationStatisticsResponse
     */
    public ListConfigRuleEvaluationStatisticsResponse listConfigRuleEvaluationStatistics() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigRuleEvaluationStatisticsWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Lists the operators available for Cloud Config rules.</p>
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
     * <p>Lists the operators available for Cloud Config rules.</p>
     * @return ListConfigRuleOperatorsResponse
     */
    public ListConfigRuleOperatorsResponse listConfigRuleOperators() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listConfigRuleOperatorsWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <p>This topic provides an example of how to query the list of rules for the current account. The sample response indicates that the rule list contains one rule, three resources are evaluated, and the compliance result is COMPLIANT.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of rules.</p>
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
     * <p>This topic provides an example of how to query the list of rules for the current account. The sample response indicates that the rule list contains one rule, three resources are evaluated, and the compliance result is COMPLIANT.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of rules.</p>
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
     * <h3>Limits</h3>
     * <p>Cloud Config supports only specific Alibaba Cloud services and resource types. The returned resource list includes only these supported resources. For more information about supported services and resource types, see <a href="https://help.aliyun.com/document_detail/127411.html">Supported resource types and resource relationships</a>.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to query the resources in your account. The sample response shows that eight resources are returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of resources that are aggregated across regions in the current Alibaba Cloud account.</p>
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
     * <h3>Limits</h3>
     * <p>Cloud Config supports only specific Alibaba Cloud services and resource types. The returned resource list includes only these supported resources. For more information about supported services and resource types, see <a href="https://help.aliyun.com/document_detail/127411.html">Supported resource types and resource relationships</a>.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to query the resources in your account. The sample response shows that eight resources are returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of resources that are aggregated across regions in the current Alibaba Cloud account.</p>
     * 
     * @param request ListDiscoveredResourcesRequest
     * @return ListDiscoveredResourcesResponse
     */
    public ListDiscoveredResourcesResponse listDiscoveredResources(ListDiscoveredResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDiscoveredResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the services integrated with CloudConfig and their statuses.</p>
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
     * <b>summary</b> : 
     * <p>Queries the services integrated with CloudConfig and their statuses.</p>
     * @return ListIntegratedServiceResponse
     */
    public ListIntegratedServiceResponse listIntegratedService() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIntegratedServiceWithOptions(runtime);
    }

    /**
     * <b>description</b> :
     * <h3>Background information</h3>
     * <p>For more information about rule definitions, working principles, and templates, see <a href="https://help.aliyun.com/document_detail/128273.html">Definition and working principles of rules</a>.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to query all rule templates that contain the keyword <code>CDN</code>. The sample response shows that a total of 21 rule templates are returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the rule templates that are supported by Cloud Config.</p>
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
     * <h3>Background information</h3>
     * <p>For more information about rule definitions, working principles, and templates, see <a href="https://help.aliyun.com/document_detail/128273.html">Definition and working principles of rules</a>.</p>
     * <h3>Usage notes</h3>
     * <p>This topic provides an example of how to query all rule templates that contain the keyword <code>CDN</code>. The sample response shows that a total of 21 rule templates are returned.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the rule templates that are supported by Cloud Config.</p>
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
     * <p>For more information about the concepts, working principles, and integration procedure of proactive rules, see <a href="https://help.aliyun.com/document_detail/470802.html">Definitions and working principles of proactive rules</a>.
     * Proactive rules and rule templates originate from the same source rules. After you create resources, proactive rules continuously check your resources for compliance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the proactive rules supported by Cloud Config.</p>
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
     * <p>For more information about the concepts, working principles, and integration procedure of proactive rules, see <a href="https://help.aliyun.com/document_detail/470802.html">Definitions and working principles of proactive rules</a>.
     * Proactive rules and rule templates originate from the same source rules. After you create resources, proactive rules continuously check your resources for compliance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the proactive rules supported by Cloud Config.</p>
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
     * <p>This operation obtains a list of recommended managed rules.</p>
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
     * <p>This operation obtains a list of recommended managed rules.</p>
     * 
     * @param request ListRecommendManagedRulesRequest
     * @return ListRecommendManagedRulesResponse
     */
    public ListRecommendManagedRulesResponse listRecommendManagedRules(ListRecommendManagedRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRecommendManagedRulesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修正执行历史</p>
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
     * <b>summary</b> : 
     * <p>修正执行历史</p>
     * 
     * @param request ListRemediationExecutionsRequest
     * @return ListRemediationExecutionsResponse
     */
    public ListRemediationExecutionsResponse listRemediationExecutions(ListRemediationExecutionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRemediationExecutionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修正模版列表</p>
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
     * <b>summary</b> : 
     * <p>修正模版列表</p>
     * 
     * @param request ListRemediationTemplatesRequest
     * @return ListRemediationTemplatesResponse
     */
    public ListRemediationTemplatesResponse listRemediationTemplates(ListRemediationTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRemediationTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询规则的修正</p>
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
     * <b>summary</b> : 
     * <p>查询规则的修正</p>
     * 
     * @param request ListRemediationsRequest
     * @return ListRemediationsResponse
     */
    public ListRemediationsResponse listRemediations(ListRemediationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRemediationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of compliance report templates in batches.</p>
     * 
     * @param request ListReportTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListReportTemplatesResponse
     */
    public ListReportTemplatesResponse listReportTemplatesWithOptions(ListReportTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
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
            new TeaPair("action", "ListReportTemplates"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListReportTemplatesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the details of compliance report templates in batches.</p>
     * 
     * @param request ListReportTemplatesRequest
     * @return ListReportTemplatesResponse
     */
    public ListReportTemplatesResponse listReportTemplates(ListReportTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listReportTemplatesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the evaluation results for a resource based on a rule.</p>
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
     * <b>summary</b> : 
     * <p>Queries the evaluation results for a resource based on a rule.</p>
     * 
     * @param request ListResourceEvaluationResultsRequest
     * @return ListResourceEvaluationResultsResponse
     */
    public ListResourceEvaluationResultsResponse listResourceEvaluationResults(ListResourceEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceEvaluationResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取资源关系列表</p>
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
     * <b>summary</b> : 
     * <p>获取资源关系列表</p>
     * 
     * @param request ListResourceRelationsRequest
     * @return ListResourceRelationsResponse
     */
    public ListResourceRelationsResponse listResourceRelations(ListResourceRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResourceRelationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>资源列表高级搜索接口</p>
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
     * <b>summary</b> : 
     * <p>资源列表高级搜索接口</p>
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
     * <p>Queries the tags attached to resources in Cloud Config.</p>
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
     * <p>Queries the tags attached to resources in Cloud Config.</p>
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
     * <p>自定义规则评估结果回调</p>
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
     * <b>summary</b> : 
     * <p>自定义规则评估结果回调</p>
     * 
     * @param request PutEvaluationsRequest
     * @return PutEvaluationsResponse
     */
    public PutEvaluationsResponse putEvaluations(PutEvaluationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putEvaluationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消评估结果的忽略状态</p>
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
     * <b>summary</b> : 
     * <p>取消评估结果的忽略状态</p>
     * 
     * @param request RevertAggregateEvaluationResultsRequest
     * @return RevertAggregateEvaluationResultsResponse
     */
    public RevertAggregateEvaluationResultsResponse revertAggregateEvaluationResults(RevertAggregateEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revertAggregateEvaluationResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>恢复已忽略的某条规则对某些资源的评估结果后，继续显示该规则对资源的评估结果</p>
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
     * <b>summary</b> : 
     * <p>恢复已忽略的某条规则对某些资源的评估结果后，继续显示该规则对资源的评估结果</p>
     * 
     * @param request RevertEvaluationResultsRequest
     * @return RevertEvaluationResultsResponse
     */
    public RevertEvaluationResultsResponse revertEvaluationResults(RevertEvaluationResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revertEvaluationResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>重新审计指定账号组内的某条规则或某个合规包中的所有规则</p>
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
     * <b>summary</b> : 
     * <p>重新审计指定账号组内的某条规则或某个合规包中的所有规则</p>
     * 
     * @param request StartAggregateConfigRuleEvaluationRequest
     * @return StartAggregateConfigRuleEvaluationResponse
     */
    public StartAggregateConfigRuleEvaluationResponse startAggregateConfigRuleEvaluation(StartAggregateConfigRuleEvaluationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAggregateConfigRuleEvaluationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行账号组规则修正</p>
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
     * <b>summary</b> : 
     * <p>执行账号组规则修正</p>
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
     * <p>This topic provides an example of how to re-evaluate the rule cr-9920626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * <b>summary</b> : 
     * <p>Re-evaluates a specific rule or all rules in a compliance package.</p>
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
     * <p>This topic provides an example of how to re-evaluate the rule cr-9920626622af0035\<em>\</em>\<em>\</em>.</p>
     * 
     * <b>summary</b> : 
     * <p>Re-evaluates a specific rule or all rules in a compliance package.</p>
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
     * <p>Starts a re-evaluation of a single resource.</p>
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
     * <p>Starts a re-evaluation of a single resource.</p>
     * 
     * @param request StartConfigRuleEvaluationByResourceRequest
     * @return StartConfigRuleEvaluationByResourceResponse
     */
    public StartConfigRuleEvaluationByResourceResponse startConfigRuleEvaluationByResource(StartConfigRuleEvaluationByResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startConfigRuleEvaluationByResourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>启用配置审计服务</p>
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
     * <b>summary</b> : 
     * <p>启用配置审计服务</p>
     * @return StartConfigurationRecorderResponse
     */
    public StartConfigurationRecorderResponse startConfigurationRecorder() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startConfigurationRecorderWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>执行修正</p>
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
     * <b>summary</b> : 
     * <p>执行修正</p>
     * 
     * @param request StartRemediationRequest
     * @return StartRemediationResponse
     */
    public StartRemediationResponse startRemediation(StartRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRemediationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停用配置审计服务</p>
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
     * <b>summary</b> : 
     * <p>停用配置审计服务</p>
     * @return StopConfigurationRecorderResponse
     */
    public StopConfigurationRecorderResponse stopConfigurationRecorder() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopConfigurationRecorderWithOptions(runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Attaches tags to CloudConfig rules, account groups, and compliance packages.</p>
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
     * <p>Attaches tags to CloudConfig rules, account groups, and compliance packages.</p>
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
     * <p>Sends a real-time test notification.</p>
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
     * <p>Sends a real-time test notification.</p>
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
     * <p>Detaches tags from resources in Cloud Config.</p>
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
     * <p>Detaches tags from resources in Cloud Config.</p>
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
     * <p>This topic provides an example of how to change the value of a parameter for the <code>eip-bandwidth-limit</code> rule template to <code>20</code> in the <code>cp-fdc8626622af00f9****</code> compliance pack that belongs to the <code>ca-f632626622af0079****</code> account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a compliance pack in a specified account group.</p>
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
     * <p>This topic provides an example of how to change the value of a parameter for the <code>eip-bandwidth-limit</code> rule template to <code>20</code> in the <code>cp-fdc8626622af00f9****</code> compliance pack that belongs to the <code>ca-f632626622af0079****</code> account group.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a compliance pack in a specified account group.</p>
     * 
     * @param request UpdateAggregateCompliancePackRequest
     * @return UpdateAggregateCompliancePackResponse
     */
    public UpdateAggregateCompliancePackResponse updateAggregateCompliancePack(UpdateAggregateCompliancePackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAggregateCompliancePackWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>账号组修改投递渠道</p>
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
     * <b>summary</b> : 
     * <p>账号组修改投递渠道</p>
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
     * <p>This topic provides an example of how to change the risk level of the rule <code>cr-4e3d626622af0080****</code> in the account group <code>ca-a4e5626622af0079****</code> to <code>3</code> (low risk).</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description, input parameters, and risk level of a rule in a specified account group.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.conditions)) {
            body.put("Conditions", request.conditions);
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
     * <p>This topic provides an example of how to change the risk level of the rule <code>cr-4e3d626622af0080****</code> in the account group <code>ca-a4e5626622af0079****</code> to <code>3</code> (low risk).</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description, input parameters, and risk level of a rule in a specified account group.</p>
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
     * <p>This topic provides an example of how to change the execution mode of the remediation <code>crr-909ba2d4716700eb****</code> to <code>AUTO_EXECUTION</code> (automatic execution) for a rule in the account group <code>ca-6b4a626622af0012****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a specified rule remediation.</p>
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
     * <p>This topic provides an example of how to change the execution mode of the remediation <code>crr-909ba2d4716700eb****</code> to <code>AUTO_EXECUTION</code> (automatic execution) for a rule in the account group <code>ca-6b4a626622af0012****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a specified rule remediation.</p>
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
     * <p>This topic provides an example of how to add a member to the account group <code>ca-dacf86d8314e00eb****</code>. The member has an ID of <code>173808452267****</code>, a name of <code>Tony</code>, and an account type of <code>ResourceDirectory</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>The management account or a delegated administrator account of a resource directory can modify the name and description of an account group, and add or remove members.</p>
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
     * <p>This topic provides an example of how to add a member to the account group <code>ca-dacf86d8314e00eb****</code>. The member has an ID of <code>173808452267****</code>, a name of <code>Tony</code>, and an account type of <code>ResourceDirectory</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>The management account or a delegated administrator account of a resource directory can modify the name and description of an account group, and add or remove members.</p>
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
     * <p>This topic provides an example of how to change the parameter value for the <code>eip-bandwidth-limit</code> rule to <code>20</code> in the compliance pack <code>cp-a8a8626622af0082****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified compliance pack in the current account.</p>
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
     * <p>This topic provides an example of how to change the parameter value for the <code>eip-bandwidth-limit</code> rule to <code>20</code> in the compliance pack <code>cp-a8a8626622af0082****</code>.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the configuration of a specified compliance pack in the current account.</p>
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
     * <p>This topic provides an example of how to change the status of the delivery channel <code>cdc-8e45ff4e06a3a8****</code> to <code>0</code> (disabled). After you disable the delivery channel, Cloud Config retains the most recent delivery configuration and stops delivering resource data.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation modifies a delivery channel for the current account.</p>
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
     * <p>This topic provides an example of how to change the status of the delivery channel <code>cdc-8e45ff4e06a3a8****</code> to <code>0</code> (disabled). After you disable the delivery channel, Cloud Config retains the most recent delivery configuration and stops delivering resource data.</p>
     * 
     * <b>summary</b> : 
     * <p>This operation modifies a delivery channel for the current account.</p>
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
     * <p>This topic provides an example of how to change the risk level of the rule <code>cr-a260626622af0005****</code> to <code>3</code> (low risk).</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.conditions)) {
            body.put("Conditions", request.conditions);
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
     * <p>This topic provides an example of how to change the risk level of the rule <code>cr-a260626622af0005****</code> to <code>3</code> (low risk).</p>
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
     * <b>summary</b> : 
     * <p>修改配置审计监控资源范围</p>
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
     * <b>summary</b> : 
     * <p>修改配置审计监控资源范围</p>
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
     * <p>修改云产品集成用户状态</p>
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
     * <p>修改云产品集成用户状态</p>
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
     * <p>This topic provides an example of how to change the execution mode for the remediation setting <code>crr-909ba2d4716700eb****</code> to <code>AUTO_EXECUTION</code> (automatic execution).</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the specified remediation setting.</p>
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
     * <p>This topic provides an example of how to change the execution mode for the remediation setting <code>crr-909ba2d4716700eb****</code> to <code>AUTO_EXECUTION</code> (automatic execution).</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the specified remediation setting.</p>
     * 
     * @param request UpdateRemediationRequest
     * @return UpdateRemediationResponse
     */
    public UpdateRemediationResponse updateRemediation(UpdateRemediationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRemediationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a compliance report template.</p>
     * 
     * @param tmpReq UpdateReportTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateReportTemplateResponse
     */
    public UpdateReportTemplateResponse updateReportTemplateWithOptions(UpdateReportTemplateRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateReportTemplateShrinkRequest request = new UpdateReportTemplateShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.reportScope)) {
            request.reportScopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.reportScope, "ReportScope", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportFileFormats)) {
            body.put("ReportFileFormats", request.reportFileFormats);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportGranularity)) {
            body.put("ReportGranularity", request.reportGranularity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportLanguage)) {
            body.put("ReportLanguage", request.reportLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportScopeShrink)) {
            body.put("ReportScope", request.reportScopeShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportTemplateDescription)) {
            body.put("ReportTemplateDescription", request.reportTemplateDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportTemplateId)) {
            body.put("ReportTemplateId", request.reportTemplateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reportTemplateName)) {
            body.put("ReportTemplateName", request.reportTemplateName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subscriptionFrequency)) {
            body.put("SubscriptionFrequency", request.subscriptionFrequency);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateReportTemplate"),
            new TeaPair("version", "2020-09-07"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateReportTemplateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a compliance report template.</p>
     * 
     * @param request UpdateReportTemplateRequest
     * @return UpdateReportTemplateResponse
     */
    public UpdateReportTemplateResponse updateReportTemplate(UpdateReportTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateReportTemplateWithOptions(request, runtime);
    }
}
