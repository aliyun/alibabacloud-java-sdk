// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.msha20200414;

import com.aliyun.tea.*;
import com.aliyun.msha20200414.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("msha", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public GetUnitTypeAndUnitDefinesResponse getUnitTypeAndUnitDefinesWithOptions(GetUnitTypeAndUnitDefinesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUnitTypeAndUnitDefines", "2020-04-14", "HTTPS", "GET", "AK", "json", req, runtime), new GetUnitTypeAndUnitDefinesResponse());
    }

    public GetUnitTypeAndUnitDefinesResponse getUnitTypeAndUnitDefines(GetUnitTypeAndUnitDefinesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUnitTypeAndUnitDefinesWithOptions(request, runtime);
    }

    public GetRpcAppFlowRuleSummarysResponse getRpcAppFlowRuleSummarysWithOptions(GetRpcAppFlowRuleSummarysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRpcAppFlowRuleSummarys", "2020-04-14", "HTTPS", "GET", "AK", "json", req, runtime), new GetRpcAppFlowRuleSummarysResponse());
    }

    public GetRpcAppFlowRuleSummarysResponse getRpcAppFlowRuleSummarys(GetRpcAppFlowRuleSummarysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRpcAppFlowRuleSummarysWithOptions(request, runtime);
    }

    public AddSpringCloudFlowItemRuleResponse addSpringCloudFlowItemRuleWithOptions(AddSpringCloudFlowItemRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddSpringCloudFlowItemRuleShrinkRequest request = new AddSpringCloudFlowItemRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestData))) {
            request.requestDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestData), "requestData", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddSpringCloudFlowItemRule", "2020-04-14", "HTTPS", "POST", "AK", "json", req, runtime), new AddSpringCloudFlowItemRuleResponse());
    }

    public AddSpringCloudFlowItemRuleResponse addSpringCloudFlowItemRule(AddSpringCloudFlowItemRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addSpringCloudFlowItemRuleWithOptions(request, runtime);
    }

    public DeleteFlowItemRuleResponse deleteFlowItemRuleWithOptions(DeleteFlowItemRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteFlowItemRuleShrinkRequest request = new DeleteFlowItemRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ruleItemId)) {
            request.ruleItemIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ruleItemId, "RuleItemId", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlowItemRule", "2020-04-14", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlowItemRuleResponse());
    }

    public DeleteFlowItemRuleResponse deleteFlowItemRule(DeleteFlowItemRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlowItemRuleWithOptions(request, runtime);
    }

    public CommitSpringCloudFlowRuleResponse commitSpringCloudFlowRuleWithOptions(CommitSpringCloudFlowRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CommitSpringCloudFlowRuleShrinkRequest request = new CommitSpringCloudFlowRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appNames)) {
            request.appNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appNames, "AppNames", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CommitSpringCloudFlowRule", "2020-04-14", "HTTPS", "POST", "AK", "json", req, runtime), new CommitSpringCloudFlowRuleResponse());
    }

    public CommitSpringCloudFlowRuleResponse commitSpringCloudFlowRule(CommitSpringCloudFlowRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.commitSpringCloudFlowRuleWithOptions(request, runtime);
    }

    public GetUserLicenceResponse getUserLicenceWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetUserLicence", "2020-04-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserLicenceResponse());
    }

    public GetUserLicenceResponse getUserLicence() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserLicenceWithOptions(runtime);
    }

    public CloseSpringCloudFlowRulesResponse closeSpringCloudFlowRulesWithOptions(CloseSpringCloudFlowRulesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CloseSpringCloudFlowRulesShrinkRequest request = new CloseSpringCloudFlowRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.appNames)) {
            request.appNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.appNames, "AppNames", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloseSpringCloudFlowRules", "2020-04-14", "HTTPS", "POST", "AK", "json", req, runtime), new CloseSpringCloudFlowRulesResponse());
    }

    public CloseSpringCloudFlowRulesResponse closeSpringCloudFlowRules(CloseSpringCloudFlowRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeSpringCloudFlowRulesWithOptions(request, runtime);
    }

    public GetNamespaceInfosResponse getNamespaceInfosWithOptions(GetNamespaceInfosRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetNamespaceInfos", "2020-04-14", "HTTPS", "GET", "AK", "json", req, runtime), new GetNamespaceInfosResponse());
    }

    public GetNamespaceInfosResponse getNamespaceInfos(GetNamespaceInfosRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNamespaceInfosWithOptions(request, runtime);
    }

    public GetDomainsResponse getDomainsWithOptions(GetDomainsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDomains", "2020-04-14", "HTTPS", "GET", "AK", "json", req, runtime), new GetDomainsResponse());
    }

    public GetDomainsResponse getDomains(GetDomainsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomainsWithOptions(request, runtime);
    }

    public ListDomainUnitCellsResponse listDomainUnitCellsWithOptions(ListDomainUnitCellsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDomainUnitCells", "2020-04-14", "HTTPS", "GET", "AK", "json", req, runtime), new ListDomainUnitCellsResponse());
    }

    public ListDomainUnitCellsResponse listDomainUnitCells(ListDomainUnitCellsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDomainUnitCellsWithOptions(request, runtime);
    }

    public GetUrisResponse getUrisWithOptions(GetUrisRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUris", "2020-04-14", "HTTPS", "POST", "AK", "json", req, runtime), new GetUrisResponse());
    }

    public GetUrisResponse getUris(GetUrisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUrisWithOptions(request, runtime);
    }

    public CloseSpringCloudFlowItemRulesResponse closeSpringCloudFlowItemRulesWithOptions(CloseSpringCloudFlowItemRulesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CloseSpringCloudFlowItemRulesShrinkRequest request = new CloseSpringCloudFlowItemRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ruleItemIds)) {
            request.ruleItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ruleItemIds, "ruleItemIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloseSpringCloudFlowItemRules", "2020-04-14", "HTTPS", "POST", "AK", "json", req, runtime), new CloseSpringCloudFlowItemRulesResponse());
    }

    public CloseSpringCloudFlowItemRulesResponse closeSpringCloudFlowItemRules(CloseSpringCloudFlowItemRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeSpringCloudFlowItemRulesWithOptions(request, runtime);
    }

    public GetAppInstancesResponse getAppInstancesWithOptions(GetAppInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAppInstances", "2020-04-14", "HTTPS", "GET", "AK", "json", req, runtime), new GetAppInstancesResponse());
    }

    public GetAppInstancesResponse getAppInstances(GetAppInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppInstancesWithOptions(request, runtime);
    }

    public GetSpringCloudFlowItemRulesResponse getSpringCloudFlowItemRulesWithOptions(GetSpringCloudFlowItemRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSpringCloudFlowItemRules", "2020-04-14", "HTTPS", "GET", "AK", "json", req, runtime), new GetSpringCloudFlowItemRulesResponse());
    }

    public GetSpringCloudFlowItemRulesResponse getSpringCloudFlowItemRules(GetSpringCloudFlowItemRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSpringCloudFlowItemRulesWithOptions(request, runtime);
    }

    public GetDomainAndUriResourcesResponse getDomainAndUriResourcesWithOptions(GetDomainAndUriResourcesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDomainAndUriResources", "2020-04-14", "HTTPS", "GET", "AK", "json", req, runtime), new GetDomainAndUriResourcesResponse());
    }

    public GetDomainAndUriResourcesResponse getDomainAndUriResources(GetDomainAndUriResourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDomainAndUriResourcesWithOptions(request, runtime);
    }

    public OpenSpringCloudFlowItemRulesResponse openSpringCloudFlowItemRulesWithOptions(OpenSpringCloudFlowItemRulesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        OpenSpringCloudFlowItemRulesShrinkRequest request = new OpenSpringCloudFlowItemRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ruleItemIds)) {
            request.ruleItemIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ruleItemIds, "ruleItemIds", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenSpringCloudFlowItemRules", "2020-04-14", "HTTPS", "POST", "AK", "json", req, runtime), new OpenSpringCloudFlowItemRulesResponse());
    }

    public OpenSpringCloudFlowItemRulesResponse openSpringCloudFlowItemRules(OpenSpringCloudFlowItemRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openSpringCloudFlowItemRulesWithOptions(request, runtime);
    }

    public UpdateSpringCloudItemRulePriorityResponse updateSpringCloudItemRulePriorityWithOptions(UpdateSpringCloudItemRulePriorityRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSpringCloudItemRulePriorityShrinkRequest request = new UpdateSpringCloudItemRulePriorityShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.priorities)) {
            request.prioritiesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.priorities, "Priorities", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSpringCloudItemRulePriority", "2020-04-14", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSpringCloudItemRulePriorityResponse());
    }

    public UpdateSpringCloudItemRulePriorityResponse updateSpringCloudItemRulePriority(UpdateSpringCloudItemRulePriorityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSpringCloudItemRulePriorityWithOptions(request, runtime);
    }

    public UpdateSpringCloudFlowItemRuleResponse updateSpringCloudFlowItemRuleWithOptions(UpdateSpringCloudFlowItemRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSpringCloudFlowItemRuleShrinkRequest request = new UpdateSpringCloudFlowItemRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.requestData))) {
            request.requestDataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.requestData), "requestData", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSpringCloudFlowItemRule", "2020-04-14", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSpringCloudFlowItemRuleResponse());
    }

    public UpdateSpringCloudFlowItemRuleResponse updateSpringCloudFlowItemRule(UpdateSpringCloudFlowItemRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSpringCloudFlowItemRuleWithOptions(request, runtime);
    }
}
