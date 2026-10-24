// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csasedr20241122;

import com.aliyun.tea.*;
import com.aliyun.csasedr20241122.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("csasedr", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>Creates a client rule policy. The policy type is specified by PolicyType.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a client rule policy.</p>
     * 
     * @param tmpReq CreateClientRuleStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateClientRuleStrategyResponse
     */
    public CreateClientRuleStrategyResponse createClientRuleStrategyWithOptions(CreateClientRuleStrategyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateClientRuleStrategyShrinkRequest request = new CreateClientRuleStrategyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.excludeUserNameList)) {
            request.excludeUserNameListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.excludeUserNameList, "ExcludeUserNameList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.includeGroupIdList)) {
            request.includeGroupIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.includeGroupIdList, "IncludeGroupIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.portOnList)) {
            request.portOnListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.portOnList, "PortOnList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.softWareOnList)) {
            request.softWareOnListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.softWareOnList, "SoftWareOnList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allGroup)) {
            query.put("AllGroup", request.allGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            query.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmdline)) {
            query.put("Cmdline", request.cmdline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeUserNameListShrink)) {
            query.put("ExcludeUserNameList", request.excludeUserNameListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inSwitch)) {
            query.put("InSwitch", request.inSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeGroupIdListShrink)) {
            query.put("IncludeGroupIdList", request.includeGroupIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainButtonTextCh)) {
            query.put("MainButtonTextCh", request.mainButtonTextCh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainButtonTextEn)) {
            query.put("MainButtonTextEn", request.mainButtonTextEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            query.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchTargetIds)) {
            query.put("MatchTargetIds", request.matchTargetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5List)) {
            query.put("Md5List", request.md5List);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minorButtonTextCh)) {
            query.put("MinorButtonTextCh", request.minorButtonTextCh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minorButtonTextEn)) {
            query.put("MinorButtonTextEn", request.minorButtonTextEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newFilePath)) {
            query.put("NewFilePath", request.newFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outSwitch)) {
            query.put("OutSwitch", request.outSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCmdline)) {
            query.put("ParentCmdline", request.parentCmdline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentProcPath)) {
            query.put("ParentProcPath", request.parentProcPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portOnListShrink)) {
            query.put("PortOnList", request.portOnListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.procPath)) {
            query.put("ProcPath", request.procPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registryContent)) {
            query.put("RegistryContent", request.registryContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registryKey)) {
            query.put("RegistryKey", request.registryKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectionKey)) {
            query.put("SelectionKey", request.selectionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.softWareOnListShrink)) {
            query.put("SoftWareOnList", request.softWareOnListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategySourceType)) {
            query.put("StrategySourceType", request.strategySourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportsApproval)) {
            query.put("SupportsApproval", request.supportsApproval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usContent)) {
            query.put("UsContent", request.usContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usTitle)) {
            query.put("UsTitle", request.usTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhContent)) {
            query.put("ZhContent", request.zhContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhTitle)) {
            query.put("ZhTitle", request.zhTitle);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateClientRuleStrategy"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateClientRuleStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Creates a client rule policy. The policy type is specified by PolicyType.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a client rule policy.</p>
     * 
     * @param request CreateClientRuleStrategyRequest
     * @return CreateClientRuleStrategyResponse
     */
    public CreateClientRuleStrategyResponse createClientRuleStrategy(CreateClientRuleStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createClientRuleStrategyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is used for the initialization of a general asset selection configuration and generates a SelectionKey. The addition or selection of specific assets is completed in What to do next. When you invoke this operation, it only generates the configuration object and does not save the configuration record.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a general asset selection configuration and generates a SelectionKey for use in What to do next.</p>
     * 
     * @param request CreateSelectionConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSelectionConfigResponse
     */
    public CreateSelectionConfigResponse createSelectionConfigWithOptions(CreateSelectionConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = new com.aliyun.teaopenapi.models.OpenApiRequest();
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSelectionConfig"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSelectionConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is used for the initialization of a general asset selection configuration and generates a SelectionKey. The addition or selection of specific assets is completed in What to do next. When you invoke this operation, it only generates the configuration object and does not save the configuration record.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a general asset selection configuration and generates a SelectionKey for use in What to do next.</p>
     * 
     * @param request CreateSelectionConfigRequest
     * @return CreateSelectionConfigResponse
     */
    public CreateSelectionConfigResponse createSelectionConfig(CreateSelectionConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSelectionConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a node to query alerting events triggered by the same rule or Alarm Metric.</p>
     * 
     * @param request CreateSimilarSecurityEventsQueryTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSimilarSecurityEventsQueryTaskResponse
     */
    public CreateSimilarSecurityEventsQueryTaskResponse createSimilarSecurityEventsQueryTaskWithOptions(CreateSimilarSecurityEventsQueryTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityEventId)) {
            query.put("SecurityEventId", request.securityEventId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.similarEventScenarioCode)) {
            query.put("SimilarEventScenarioCode", request.similarEventScenarioCode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSimilarSecurityEventsQueryTask"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSimilarSecurityEventsQueryTaskResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a node to query alerting events triggered by the same rule or Alarm Metric.</p>
     * 
     * @param request CreateSimilarSecurityEventsQueryTaskRequest
     * @return CreateSimilarSecurityEventsQueryTaskResponse
     */
    public CreateSimilarSecurityEventsQueryTaskResponse createSimilarSecurityEventsQueryTask(CreateSimilarSecurityEventsQueryTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSimilarSecurityEventsQueryTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes client rule policies based on a list of policy IDs.</p>
     * 
     * @param tmpReq DeleteClientRuleStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteClientRuleStrategyResponse
     */
    public DeleteClientRuleStrategyResponse deleteClientRuleStrategyWithOptions(DeleteClientRuleStrategyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteClientRuleStrategyShrinkRequest request = new DeleteClientRuleStrategyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.idList)) {
            request.idListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.idList, "IdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idListShrink)) {
            query.put("IdList", request.idListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteClientRuleStrategy"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteClientRuleStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes client rule policies based on a list of policy IDs.</p>
     * 
     * @param request DeleteClientRuleStrategyRequest
     * @return DeleteClientRuleStrategyResponse
     */
    public DeleteClientRuleStrategyResponse deleteClientRuleStrategy(DeleteClientRuleStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteClientRuleStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes alert whitelist configurations in batches.</p>
     * 
     * @param request DeleteSecurityEventMarkMissListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSecurityEventMarkMissListResponse
     */
    public DeleteSecurityEventMarkMissListResponse deleteSecurityEventMarkMissListWithOptions(DeleteSecurityEventMarkMissListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ids)) {
            query.put("Ids", request.ids);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSecurityEventMarkMissList"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSecurityEventMarkMissListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes alert whitelist configurations in batches.</p>
     * 
     * @param request DeleteSecurityEventMarkMissListRequest
     * @return DeleteSecurityEventMarkMissListResponse
     */
    public DeleteSecurityEventMarkMissListResponse deleteSecurityEventMarkMissList(DeleteSecurityEventMarkMissListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSecurityEventMarkMissListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the effective scope mode, target list, and scope record information based on the asset scope ID.</p>
     * 
     * @param request DescribeAssetScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAssetScopeResponse
     */
    public DescribeAssetScopeResponse describeAssetScopeWithOptions(DescribeAssetScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAssetScope"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAssetScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the effective scope mode, target list, and scope record information based on the asset scope ID.</p>
     * 
     * @param request DescribeAssetScopeRequest
     * @return DescribeAssetScopeResponse
     */
    public DescribeAssetScopeResponse describeAssetScope(DescribeAssetScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAssetScopeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries security alert types.</p>
     * 
     * @param request DescribeNsasSuspEventTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNsasSuspEventTypeResponse
     */
    public DescribeNsasSuspEventTypeResponse describeNsasSuspEventTypeWithOptions(DescribeNsasSuspEventTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.containerFieldName)) {
            query.put("ContainerFieldName", request.containerFieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerFieldValue)) {
            query.put("ContainerFieldValue", request.containerFieldValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuids)) {
            query.put("Uuids", request.uuids);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeNsasSuspEventType"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNsasSuspEventTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries security alert types.</p>
     * 
     * @param request DescribeNsasSuspEventTypeRequest
     * @return DescribeNsasSuspEventTypeResponse
     */
    public DescribeNsasSuspEventTypeResponse describeNsasSuspEventType(DescribeNsasSuspEventTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNsasSuspEventTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the automatic whitelist rules for alerts.</p>
     * 
     * @param request DescribeSecurityEventMarkMissListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityEventMarkMissListResponse
     */
    public DescribeSecurityEventMarkMissListResponse describeSecurityEventMarkMissListWithOptions(DescribeSecurityEventMarkMissListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.disposalWay)) {
            query.put("DisposalWay", request.disposalWay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventName)) {
            query.put("EventName", request.eventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityEventMarkMissList"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityEventMarkMissListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the automatic whitelist rules for alerts.</p>
     * 
     * @param request DescribeSecurityEventMarkMissListRequest
     * @return DescribeSecurityEventMarkMissListResponse
     */
    public DescribeSecurityEventMarkMissListResponse describeSecurityEventMarkMissList(DescribeSecurityEventMarkMissListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityEventMarkMissListWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the processing status of security alerts based on the task ID or alert event ID.</p>
     * 
     * @param request DescribeSecurityEventOperationStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityEventOperationStatusResponse
     */
    public DescribeSecurityEventOperationStatusResponse describeSecurityEventOperationStatusWithOptions(DescribeSecurityEventOperationStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityEventIds)) {
            query.put("SecurityEventIds", request.securityEventIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityEventOperationStatus"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityEventOperationStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the processing status of security alerts based on the task ID or alert event ID.</p>
     * 
     * @param request DescribeSecurityEventOperationStatusRequest
     * @return DescribeSecurityEventOperationStatusResponse
     */
    public DescribeSecurityEventOperationStatusResponse describeSecurityEventOperationStatus(DescribeSecurityEventOperationStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityEventOperationStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the handling operations that can be displayed for a specified endpoint alert. When initiating a subsequent response, you must select the operation items returned in this response where UserCanOperate is true, and submit parameters as required by the response operation. The query result does not guarantee that the subsequent response will succeed.
     * The actual returned results are affected by feature switches, canary releases, dynamic allowlists, alert templates, alert statuses, and filter conditions. The list may be empty. The examples are used to illustrate field formats or rule combinations and do not represent that a specific alert will definitely return these values. MappingMarkFields and its subfields are generic compatibility structures. The current query pipeline does not populate their elements, and you should not infer that this operation supports the corresponding capabilities based on them.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the handling operations, operability, and whitelist rule configurations for a specified endpoint alert in its current state.</p>
     * 
     * @param request DescribeSecurityEventOperationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSecurityEventOperationsResponse
     */
    public DescribeSecurityEventOperationsResponse describeSecurityEventOperationsWithOptions(DescribeSecurityEventOperationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityEventId)) {
            query.put("SecurityEventId", request.securityEventId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSecurityEventOperations"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSecurityEventOperationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation queries the handling operations that can be displayed for a specified endpoint alert. When initiating a subsequent response, you must select the operation items returned in this response where UserCanOperate is true, and submit parameters as required by the response operation. The query result does not guarantee that the subsequent response will succeed.
     * The actual returned results are affected by feature switches, canary releases, dynamic allowlists, alert templates, alert statuses, and filter conditions. The list may be empty. The examples are used to illustrate field formats or rule combinations and do not represent that a specific alert will definitely return these values. MappingMarkFields and its subfields are generic compatibility structures. The current query pipeline does not populate their elements, and you should not infer that this operation supports the corresponding capabilities based on them.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the handling operations, operability, and whitelist rule configurations for a specified endpoint alert in its current state.</p>
     * 
     * @param request DescribeSecurityEventOperationsRequest
     * @return DescribeSecurityEventOperationsResponse
     */
    public DescribeSecurityEventOperationsResponse describeSecurityEventOperations(DescribeSecurityEventOperationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSecurityEventOperationsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the handling scenarios for alerts triggered by the same rule or type.</p>
     * 
     * @param request DescribeSimilarEventScenariosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSimilarEventScenariosResponse
     */
    public DescribeSimilarEventScenariosResponse describeSimilarEventScenariosWithOptions(DescribeSimilarEventScenariosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.securityEventId)) {
            query.put("SecurityEventId", request.securityEventId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSimilarEventScenarios"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSimilarEventScenariosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the handling scenarios for alerts triggered by the same rule or type.</p>
     * 
     * @param request DescribeSimilarEventScenariosRequest
     * @return DescribeSimilarEventScenariosResponse
     */
    public DescribeSimilarEventScenariosResponse describeSimilarEventScenarios(DescribeSimilarEventScenariosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSimilarEventScenariosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries aggregated alerts triggered by the same rule or type.</p>
     * 
     * @param request DescribeSimilarSecurityEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSimilarSecurityEventsResponse
     */
    public DescribeSimilarSecurityEventsResponse describeSimilarSecurityEventsWithOptions(DescribeSimilarSecurityEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResults)) {
            query.put("MaxResults", request.maxResults);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSimilarSecurityEvents"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSimilarSecurityEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries aggregated alerts triggered by the same rule or type.</p>
     * 
     * @param request DescribeSimilarSecurityEventsRequest
     * @return DescribeSimilarSecurityEventsResponse
     */
    public DescribeSimilarSecurityEventsResponse describeSimilarSecurityEvents(DescribeSimilarSecurityEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSimilarSecurityEventsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries endpoint security alerts and supports filtering by alert, endpoint, and processing status.</p>
     * 
     * @param request DescribeSuspEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSuspEventsResponse
     */
    public DescribeSuspEventsResponse describeSuspEventsWithOptions(DescribeSuspEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alarmEventName)) {
            query.put("AlarmEventName", request.alarmEventName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.alarmUniqueInfo)) {
            query.put("AlarmUniqueInfo", request.alarmUniqueInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.assetsTypeList)) {
            query.put("AssetsTypeList", request.assetsTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterId)) {
            query.put("ClusterId", request.clusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerFieldName)) {
            query.put("ContainerFieldName", request.containerFieldName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.containerFieldValue)) {
            query.put("ContainerFieldValue", request.containerFieldValue);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dealed)) {
            query.put("Dealed", request.dealed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.department)) {
            query.put("Department", request.department);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventNames)) {
            query.put("EventNames", request.eventNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostName)) {
            query.put("HostName", request.hostName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.innerIp)) {
            query.put("InnerIp", request.innerIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levels)) {
            query.put("Levels", request.levels);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateErrorCodeList)) {
            query.put("OperateErrorCodeList", request.operateErrorCodeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateTimeEnd)) {
            query.put("OperateTimeEnd", request.operateTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateTimeStart)) {
            query.put("OperateTimeStart", request.operateTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentEventTypes)) {
            query.put("ParentEventTypes", request.parentEventTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortColumn)) {
            query.put("SortColumn", request.sortColumn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortType)) {
            query.put("SortType", request.sortType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.source)) {
            query.put("Source", request.source);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIp)) {
            query.put("SourceIp", request.sourceIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcIp)) {
            query.put("SrcIp", request.srcIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strictMode)) {
            query.put("StrictMode", request.strictMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            query.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeEnd)) {
            query.put("TimeEnd", request.timeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeStart)) {
            query.put("TimeStart", request.timeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uniqueInfo)) {
            query.put("UniqueInfo", request.uniqueInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uuids)) {
            query.put("Uuids", request.uuids);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tacticId)) {
            body.put("TacticId", request.tacticId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSuspEvents"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSuspEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries endpoint security alerts and supports filtering by alert, endpoint, and processing status.</p>
     * 
     * @param request DescribeSuspEventsRequest
     * @return DescribeSuspEventsResponse
     */
    public DescribeSuspEventsResponse describeSuspEvents(DescribeSuspEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSuspEventsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the detailed information of a client rule policy based on the policy ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a client rule policy.</p>
     * 
     * @param request GetClientRuleStrategyDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClientRuleStrategyDetailResponse
     */
    public GetClientRuleStrategyDetailResponse getClientRuleStrategyDetailWithOptions(GetClientRuleStrategyDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClientRuleStrategyDetail"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClientRuleStrategyDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the detailed information of a client rule policy based on the policy ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of a client rule policy.</p>
     * 
     * @param request GetClientRuleStrategyDetailRequest
     * @return GetClientRuleStrategyDetailResponse
     */
    public GetClientRuleStrategyDetailResponse getClientRuleStrategyDetail(GetClientRuleStrategyDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClientRuleStrategyDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Counts the number of proactive defense policies (PolicyType=2) for the current account and returns the number of system rule policies and custom rule policies.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of system rules and custom rules in proactive defense policies.</p>
     * 
     * @param request GetClientRuleStrategyStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClientRuleStrategyStatisticsResponse
     */
    public GetClientRuleStrategyStatisticsResponse getClientRuleStrategyStatisticsWithOptions(GetClientRuleStrategyStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClientRuleStrategyStatistics"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClientRuleStrategyStatisticsResponse());
    }

    /**
     * <b>description</b> :
     * <p>Counts the number of proactive defense policies (PolicyType=2) for the current account and returns the number of system rule policies and custom rule policies.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of system rules and custom rules in proactive defense policies.</p>
     * 
     * @param request GetClientRuleStrategyStatisticsRequest
     * @return GetClientRuleStrategyStatisticsResponse
     */
    public GetClientRuleStrategyStatisticsResponse getClientRuleStrategyStatistics(GetClientRuleStrategyStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClientRuleStrategyStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Handles security alert events.</p>
     * 
     * @param request HandleSecurityEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return HandleSecurityEventsResponse
     */
    public HandleSecurityEventsResponse handleSecurityEventsWithOptions(HandleSecurityEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.markBatch)) {
            query.put("MarkBatch", request.markBatch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.markMissParam)) {
            query.put("MarkMissParam", request.markMissParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationCode)) {
            query.put("OperationCode", request.operationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationParams)) {
            query.put("OperationParams", request.operationParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityEventIds)) {
            query.put("SecurityEventIds", request.securityEventIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HandleSecurityEvents"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HandleSecurityEventsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Handles security alert events.</p>
     * 
     * @param request HandleSecurityEventsRequest
     * @return HandleSecurityEventsResponse
     */
    public HandleSecurityEventsResponse handleSecurityEvents(HandleSecurityEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.handleSecurityEventsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>First, call the CreateSimilarSecurityEventsQueryTask operation to create a similar alert query task. Wait until the data extraction for the task is complete and the task reaches the DataRetrieved state before you call this operation. The processing scope covers the security alerts filtered under the TaskId. This scope is determined by the similar scenario and alert configurations selected when the query task was created. The scope does not equal all alerts of the same type, nor is it fixed to alerts with the same IP address. After this operation is successfully called, the processing continues to run asynchronously in the background.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs batch operations on similar security alerts filtered by a query task.</p>
     * 
     * @param request HandleSimilarSecurityEventsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return HandleSimilarSecurityEventsResponse
     */
    public HandleSimilarSecurityEventsResponse handleSimilarSecurityEventsWithOptions(HandleSimilarSecurityEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.markMissParam)) {
            query.put("MarkMissParam", request.markMissParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationCode)) {
            query.put("OperationCode", request.operationCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationParams)) {
            query.put("OperationParams", request.operationParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remark)) {
            query.put("Remark", request.remark);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HandleSimilarSecurityEvents"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HandleSimilarSecurityEventsResponse());
    }

    /**
     * <b>description</b> :
     * <p>First, call the CreateSimilarSecurityEventsQueryTask operation to create a similar alert query task. Wait until the data extraction for the task is complete and the task reaches the DataRetrieved state before you call this operation. The processing scope covers the security alerts filtered under the TaskId. This scope is determined by the similar scenario and alert configurations selected when the query task was created. The scope does not equal all alerts of the same type, nor is it fixed to alerts with the same IP address. After this operation is successfully called, the processing continues to run asynchronously in the background.</p>
     * 
     * <b>summary</b> : 
     * <p>Performs batch operations on similar security alerts filtered by a query task.</p>
     * 
     * @param request HandleSimilarSecurityEventsRequest
     * @return HandleSimilarSecurityEventsResponse
     */
    public HandleSimilarSecurityEventsResponse handleSimilarSecurityEvents(HandleSimilarSecurityEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.handleSimilarSecurityEventsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query to retrieve client rule policies based on the policy type (PolicyType) with paging. You can call GetClientRuleStrategyDetail to query the details.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the client rule policy list by using a paged query with paging.</p>
     * 
     * @param request ListClientRuleStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClientRuleStrategyResponse
     */
    public ListClientRuleStrategyResponse listClientRuleStrategyWithOptions(ListClientRuleStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClientRuleStrategy"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClientRuleStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Performs a paged query to retrieve client rule policies based on the policy type (PolicyType) with paging. You can call GetClientRuleStrategyDetail to query the details.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the client rule policy list by using a paged query with paging.</p>
     * 
     * @param request ListClientRuleStrategyRequest
     * @return ListClientRuleStrategyResponse
     */
    public ListClientRuleStrategyResponse listClientRuleStrategy(ListClientRuleStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClientRuleStrategyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Queries the system rule catalog and the switch status of rules under a specified SelectionKey. You can use the returned SwitchId and the same SelectionKey to call the OperateTargetConfig operation to modify the switch status.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries system defense rules and the switch status of rules under a specified SelectionKey by paging in a paged query.</p>
     * 
     * @param tmpReq ListSystemConfigRulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSystemConfigRulesResponse
     */
    public ListSystemConfigRulesResponse listSystemConfigRulesWithOptions(ListSystemConfigRulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSystemConfigRulesShrinkRequest request = new ListSystemConfigRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aggregationIds)) {
            request.aggregationIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aggregationIds, "AggregationIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ruleTypes)) {
            request.ruleTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ruleTypes, "RuleTypes", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.aggregationIdsShrink)) {
            query.put("AggregationIds", request.aggregationIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentPage)) {
            query.put("CurrentPage", request.currentPage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleTypesShrink)) {
            query.put("RuleTypes", request.ruleTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectionKey)) {
            query.put("SelectionKey", request.selectionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.systemType)) {
            query.put("SystemType", request.systemType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSystemConfigRules"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSystemConfigRulesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Queries the system rule catalog and the switch status of rules under a specified SelectionKey. You can use the returned SwitchId and the same SelectionKey to call the OperateTargetConfig operation to modify the switch status.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries system defense rules and the switch status of rules under a specified SelectionKey by paging in a paged query.</p>
     * 
     * @param request ListSystemConfigRulesRequest
     * @return ListSystemConfigRulesResponse
     */
    public ListSystemConfigRulesResponse listSystemConfigRules(ListSystemConfigRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSystemConfigRulesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates the override configuration of rule switches for each SwitchId under the same SelectionKey. Obtain the rule SwitchId by calling ListSystemConfigRules first. Do not use this operation to replace UpdateClientRuleStrategy for updating the overall policy switch Status, and do not use software process names as system rule SwitchIds.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the switch status of system rules in batches by SelectionKey.</p>
     * 
     * @param tmpReq OperateTargetConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OperateTargetConfigResponse
     */
    public OperateTargetConfigResponse operateTargetConfigWithOptions(OperateTargetConfigRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OperateTargetConfigShrinkRequest request = new OperateTargetConfigShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.switchIdList)) {
            request.switchIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.switchIdList, "SwitchIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.selectionKey)) {
            query.put("SelectionKey", request.selectionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchIdListShrink)) {
            query.put("SwitchIdList", request.switchIdListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OperateTargetConfig"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OperateTargetConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates the override configuration of rule switches for each SwitchId under the same SelectionKey. Obtain the rule SwitchId by calling ListSystemConfigRules first. Do not use this operation to replace UpdateClientRuleStrategy for updating the overall policy switch Status, and do not use software process names as system rule SwitchIds.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates the switch status of system rules in batches by SelectionKey.</p>
     * 
     * @param request OperateTargetConfigRequest
     * @return OperateTargetConfigResponse
     */
    public OperateTargetConfigResponse operateTargetConfig(OperateTargetConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.operateTargetConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the effective scope mode and target list of a specified asset scope record.</p>
     * 
     * @param request UpdateAssetScopeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAssetScopeResponse
     */
    public UpdateAssetScopeResponse updateAssetScopeWithOptions(UpdateAssetScopeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            query.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchTargetIds)) {
            query.put("MatchTargetIds", request.matchTargetIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAssetScope"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAssetScopeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the effective scope mode and target list of a specified asset scope record.</p>
     * 
     * @param request UpdateAssetScopeRequest
     * @return UpdateAssetScopeResponse
     */
    public UpdateAssetScopeResponse updateAssetScope(UpdateAssetScopeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAssetScopeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Updates a client rule policy based on the policy ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a client rule policy.</p>
     * 
     * @param tmpReq UpdateClientRuleStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateClientRuleStrategyResponse
     */
    public UpdateClientRuleStrategyResponse updateClientRuleStrategyWithOptions(UpdateClientRuleStrategyRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateClientRuleStrategyShrinkRequest request = new UpdateClientRuleStrategyShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.excludeUserNameList)) {
            request.excludeUserNameListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.excludeUserNameList, "ExcludeUserNameList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.includeGroupIdList)) {
            request.includeGroupIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.includeGroupIdList, "IncludeGroupIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.portOnList)) {
            request.portOnListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.portOnList, "PortOnList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.softWareOnList)) {
            request.softWareOnListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.softWareOnList, "SoftWareOnList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionType)) {
            query.put("ActionType", request.actionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.allGroup)) {
            query.put("AllGroup", request.allGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalId)) {
            query.put("ApprovalId", request.approvalId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmdline)) {
            query.put("Cmdline", request.cmdline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.excludeUserNameListShrink)) {
            query.put("ExcludeUserNameList", request.excludeUserNameListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filePath)) {
            query.put("FilePath", request.filePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.inSwitch)) {
            query.put("InSwitch", request.inSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeGroupIdListShrink)) {
            query.put("IncludeGroupIdList", request.includeGroupIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainButtonTextCh)) {
            query.put("MainButtonTextCh", request.mainButtonTextCh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mainButtonTextEn)) {
            query.put("MainButtonTextEn", request.mainButtonTextEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchMode)) {
            query.put("MatchMode", request.matchMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchTargetIds)) {
            query.put("MatchTargetIds", request.matchTargetIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.md5List)) {
            query.put("Md5List", request.md5List);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minorButtonTextCh)) {
            query.put("MinorButtonTextCh", request.minorButtonTextCh);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minorButtonTextEn)) {
            query.put("MinorButtonTextEn", request.minorButtonTextEn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newFilePath)) {
            query.put("NewFilePath", request.newFilePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outSwitch)) {
            query.put("OutSwitch", request.outSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentCmdline)) {
            query.put("ParentCmdline", request.parentCmdline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentProcPath)) {
            query.put("ParentProcPath", request.parentProcPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.platform)) {
            query.put("Platform", request.platform);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.policyType)) {
            query.put("PolicyType", request.policyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.portOnListShrink)) {
            query.put("PortOnList", request.portOnListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.priority)) {
            query.put("Priority", request.priority);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.procPath)) {
            query.put("ProcPath", request.procPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registryContent)) {
            query.put("RegistryContent", request.registryContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.registryKey)) {
            query.put("RegistryKey", request.registryKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.softWareOnListShrink)) {
            query.put("SoftWareOnList", request.softWareOnListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategySourceType)) {
            query.put("StrategySourceType", request.strategySourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.supportsApproval)) {
            query.put("SupportsApproval", request.supportsApproval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usContent)) {
            query.put("UsContent", request.usContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usTitle)) {
            query.put("UsTitle", request.usTitle);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhContent)) {
            query.put("ZhContent", request.zhContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhTitle)) {
            query.put("ZhTitle", request.zhTitle);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateClientRuleStrategy"),
            new TeaPair("version", "2024-11-22"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateClientRuleStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <p>Updates a client rule policy based on the policy ID.</p>
     * 
     * <b>summary</b> : 
     * <p>Updates a client rule policy.</p>
     * 
     * @param request UpdateClientRuleStrategyRequest
     * @return UpdateClientRuleStrategyResponse
     */
    public UpdateClientRuleStrategyResponse updateClientRuleStrategy(UpdateClientRuleStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateClientRuleStrategyWithOptions(request, runtime);
    }
}
