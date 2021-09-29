// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.config20200907;

import com.aliyun.tea.*;
import com.aliyun.config20200907.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
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

    public DeleteAggregateConfigRulesResponse deleteAggregateConfigRulesWithOptions(DeleteAggregateConfigRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAggregateConfigRules", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAggregateConfigRulesResponse());
    }

    public DeleteAggregateConfigRulesResponse deleteAggregateConfigRules(DeleteAggregateConfigRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAggregateConfigRulesWithOptions(request, runtime);
    }

    public DeactiveAggregateConfigRulesResponse deactiveAggregateConfigRulesWithOptions(DeactiveAggregateConfigRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeactiveAggregateConfigRules", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new DeactiveAggregateConfigRulesResponse());
    }

    public DeactiveAggregateConfigRulesResponse deactiveAggregateConfigRules(DeactiveAggregateConfigRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deactiveAggregateConfigRulesWithOptions(request, runtime);
    }

    public GetAggregateConfigRulesReportResponse getAggregateConfigRulesReportWithOptions(GetAggregateConfigRulesReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregateConfigRulesReport", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetAggregateConfigRulesReportResponse());
    }

    public GetAggregateConfigRulesReportResponse getAggregateConfigRulesReport(GetAggregateConfigRulesReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateConfigRulesReportWithOptions(request, runtime);
    }

    public GetResourceInventoryResponse getResourceInventoryWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetResourceInventory", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new GetResourceInventoryResponse());
    }

    public GetResourceInventoryResponse getResourceInventory() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceInventoryWithOptions(runtime);
    }

    public ListAggregateConfigRuleEvaluationResultsResponse listAggregateConfigRuleEvaluationResultsWithOptions(ListAggregateConfigRuleEvaluationResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAggregateConfigRuleEvaluationResults", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new ListAggregateConfigRuleEvaluationResultsResponse());
    }

    public ListAggregateConfigRuleEvaluationResultsResponse listAggregateConfigRuleEvaluationResults(ListAggregateConfigRuleEvaluationResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAggregateConfigRuleEvaluationResultsWithOptions(request, runtime);
    }

    public ListAggregateRemediationsResponse listAggregateRemediationsWithOptions(ListAggregateRemediationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAggregateRemediations", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new ListAggregateRemediationsResponse());
    }

    public ListAggregateRemediationsResponse listAggregateRemediations(ListAggregateRemediationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAggregateRemediationsWithOptions(request, runtime);
    }

    public GetAggregatorResponse getAggregatorWithOptions(GetAggregatorRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregator", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetAggregatorResponse());
    }

    public GetAggregatorResponse getAggregator(GetAggregatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregatorWithOptions(request, runtime);
    }

    public GetResourceComplianceTimelineResponse getResourceComplianceTimelineWithOptions(GetResourceComplianceTimelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetResourceComplianceTimeline", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetResourceComplianceTimelineResponse());
    }

    public GetResourceComplianceTimelineResponse getResourceComplianceTimeline(GetResourceComplianceTimelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceComplianceTimelineWithOptions(request, runtime);
    }

    public GenerateAggregateConfigRulesReportResponse generateAggregateConfigRulesReportWithOptions(GenerateAggregateConfigRulesReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateAggregateConfigRulesReport", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateAggregateConfigRulesReportResponse());
    }

    public GenerateAggregateConfigRulesReportResponse generateAggregateConfigRulesReport(GenerateAggregateConfigRulesReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateAggregateConfigRulesReportWithOptions(request, runtime);
    }

    public ListAggregateCompliancePacksResponse listAggregateCompliancePacksWithOptions(ListAggregateCompliancePacksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAggregateCompliancePacks", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new ListAggregateCompliancePacksResponse());
    }

    public ListAggregateCompliancePacksResponse listAggregateCompliancePacks(ListAggregateCompliancePacksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAggregateCompliancePacksWithOptions(request, runtime);
    }

    public ListConfigRuleEvaluationResultsResponse listConfigRuleEvaluationResultsWithOptions(ListConfigRuleEvaluationResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListConfigRuleEvaluationResults", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new ListConfigRuleEvaluationResultsResponse());
    }

    public ListConfigRuleEvaluationResultsResponse listConfigRuleEvaluationResults(ListConfigRuleEvaluationResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listConfigRuleEvaluationResultsWithOptions(request, runtime);
    }

    public DeleteCompliancePacksResponse deleteCompliancePacksWithOptions(DeleteCompliancePacksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCompliancePacks", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCompliancePacksResponse());
    }

    public DeleteCompliancePacksResponse deleteCompliancePacks(DeleteCompliancePacksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCompliancePacksWithOptions(request, runtime);
    }

    public UpdateAggregateRemediationResponse updateAggregateRemediationWithOptions(UpdateAggregateRemediationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAggregateRemediation", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAggregateRemediationResponse());
    }

    public UpdateAggregateRemediationResponse updateAggregateRemediation(UpdateAggregateRemediationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAggregateRemediationWithOptions(request, runtime);
    }

    public DeleteAggregateCompliancePacksResponse deleteAggregateCompliancePacksWithOptions(DeleteAggregateCompliancePacksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAggregateCompliancePacks", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAggregateCompliancePacksResponse());
    }

    public DeleteAggregateCompliancePacksResponse deleteAggregateCompliancePacks(DeleteAggregateCompliancePacksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAggregateCompliancePacksWithOptions(request, runtime);
    }

    public ListAggregatorsResponse listAggregatorsWithOptions(ListAggregatorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAggregators", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new ListAggregatorsResponse());
    }

    public ListAggregatorsResponse listAggregators(ListAggregatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAggregatorsWithOptions(request, runtime);
    }

    public UpdateAggregateCompliancePackResponse updateAggregateCompliancePackWithOptions(UpdateAggregateCompliancePackRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAggregateCompliancePackShrinkRequest request = new UpdateAggregateCompliancePackShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configRules)) {
            request.configRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configRules, "ConfigRules", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAggregateCompliancePack", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAggregateCompliancePackResponse());
    }

    public UpdateAggregateCompliancePackResponse updateAggregateCompliancePack(UpdateAggregateCompliancePackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAggregateCompliancePackWithOptions(request, runtime);
    }

    public GetAggregateCompliancePackResponse getAggregateCompliancePackWithOptions(GetAggregateCompliancePackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregateCompliancePack", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetAggregateCompliancePackResponse());
    }

    public GetAggregateCompliancePackResponse getAggregateCompliancePack(GetAggregateCompliancePackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateCompliancePackWithOptions(request, runtime);
    }

    public DeleteAggregateRemediationsResponse deleteAggregateRemediationsWithOptions(DeleteAggregateRemediationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAggregateRemediations", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAggregateRemediationsResponse());
    }

    public DeleteAggregateRemediationsResponse deleteAggregateRemediations(DeleteAggregateRemediationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAggregateRemediationsWithOptions(request, runtime);
    }

    public GenerateConfigRulesReportResponse generateConfigRulesReportWithOptions(GenerateConfigRulesReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateConfigRulesReport", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateConfigRulesReportResponse());
    }

    public GenerateConfigRulesReportResponse generateConfigRulesReport(GenerateConfigRulesReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateConfigRulesReportWithOptions(request, runtime);
    }

    public GetAggregateResourceComplianceByPackResponse getAggregateResourceComplianceByPackWithOptions(GetAggregateResourceComplianceByPackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregateResourceComplianceByPack", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetAggregateResourceComplianceByPackResponse());
    }

    public GetAggregateResourceComplianceByPackResponse getAggregateResourceComplianceByPack(GetAggregateResourceComplianceByPackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateResourceComplianceByPackWithOptions(request, runtime);
    }

    public DeleteRemediationsResponse deleteRemediationsWithOptions(DeleteRemediationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRemediations", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRemediationsResponse());
    }

    public DeleteRemediationsResponse deleteRemediations(DeleteRemediationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRemediationsWithOptions(request, runtime);
    }

    public ListCompliancePacksResponse listCompliancePacksWithOptions(ListCompliancePacksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCompliancePacks", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new ListCompliancePacksResponse());
    }

    public ListCompliancePacksResponse listCompliancePacks(ListCompliancePacksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCompliancePacksWithOptions(request, runtime);
    }

    public ActiveAggregateConfigRulesResponse activeAggregateConfigRulesWithOptions(ActiveAggregateConfigRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ActiveAggregateConfigRules", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new ActiveAggregateConfigRulesResponse());
    }

    public ActiveAggregateConfigRulesResponse activeAggregateConfigRules(ActiveAggregateConfigRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.activeAggregateConfigRulesWithOptions(request, runtime);
    }

    public GetResourceComplianceByPackResponse getResourceComplianceByPackWithOptions(GetResourceComplianceByPackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetResourceComplianceByPack", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetResourceComplianceByPackResponse());
    }

    public GetResourceComplianceByPackResponse getResourceComplianceByPack(GetResourceComplianceByPackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceComplianceByPackWithOptions(request, runtime);
    }

    public ListResourceOwnerInAllAggregatorResponse listResourceOwnerInAllAggregatorWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListResourceOwnerInAllAggregator", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new ListResourceOwnerInAllAggregatorResponse());
    }

    public ListResourceOwnerInAllAggregatorResponse listResourceOwnerInAllAggregator() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceOwnerInAllAggregatorWithOptions(runtime);
    }

    public ListCompliancePackTemplatesResponse listCompliancePackTemplatesWithOptions(ListCompliancePackTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListCompliancePackTemplates", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new ListCompliancePackTemplatesResponse());
    }

    public ListCompliancePackTemplatesResponse listCompliancePackTemplates(ListCompliancePackTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listCompliancePackTemplatesWithOptions(request, runtime);
    }

    public UpdateRemediationResponse updateRemediationWithOptions(UpdateRemediationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRemediation", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRemediationResponse());
    }

    public UpdateRemediationResponse updateRemediation(UpdateRemediationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRemediationWithOptions(request, runtime);
    }

    public GetAggregateAccountComplianceByPackResponse getAggregateAccountComplianceByPackWithOptions(GetAggregateAccountComplianceByPackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregateAccountComplianceByPack", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetAggregateAccountComplianceByPackResponse());
    }

    public GetAggregateAccountComplianceByPackResponse getAggregateAccountComplianceByPack(GetAggregateAccountComplianceByPackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateAccountComplianceByPackWithOptions(request, runtime);
    }

    public CreateConfigRuleResponse createConfigRuleWithOptions(CreateConfigRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateConfigRuleShrinkRequest request = new CreateConfigRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputParameters)) {
            request.inputParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputParameters, "InputParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceTypesScope)) {
            request.resourceTypesScopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceTypesScope, "ResourceTypesScope", "simple");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateConfigRule", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateConfigRuleResponse());
    }

    public CreateConfigRuleResponse createConfigRule(CreateConfigRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConfigRuleWithOptions(request, runtime);
    }

    public GetAggregateResourceConfigurationTimelineResponse getAggregateResourceConfigurationTimelineWithOptions(GetAggregateResourceConfigurationTimelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregateResourceConfigurationTimeline", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetAggregateResourceConfigurationTimelineResponse());
    }

    public GetAggregateResourceConfigurationTimelineResponse getAggregateResourceConfigurationTimeline(GetAggregateResourceConfigurationTimelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateResourceConfigurationTimelineWithOptions(request, runtime);
    }

    public DeleteAggregatorsResponse deleteAggregatorsWithOptions(DeleteAggregatorsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAggregators", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAggregatorsResponse());
    }

    public DeleteAggregatorsResponse deleteAggregators(DeleteAggregatorsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAggregatorsWithOptions(request, runtime);
    }

    public GenerateResourceInventoryResponse generateResourceInventoryWithOptions(GenerateResourceInventoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateResourceInventory", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateResourceInventoryResponse());
    }

    public GenerateResourceInventoryResponse generateResourceInventory(GenerateResourceInventoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateResourceInventoryWithOptions(request, runtime);
    }

    public CreateRemediationResponse createRemediationWithOptions(CreateRemediationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRemediation", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRemediationResponse());
    }

    public CreateRemediationResponse createRemediation(CreateRemediationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRemediationWithOptions(request, runtime);
    }

    public GetCompliancePackResponse getCompliancePackWithOptions(GetCompliancePackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCompliancePack", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetCompliancePackResponse());
    }

    public GetCompliancePackResponse getCompliancePack(GetCompliancePackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompliancePackWithOptions(request, runtime);
    }

    public GetConfigRulesReportResponse getConfigRulesReportWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetConfigRulesReport", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetConfigRulesReportResponse());
    }

    public GetConfigRulesReportResponse getConfigRulesReport() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConfigRulesReportWithOptions(runtime);
    }

    public GetResourceConfigurationTimelineResponse getResourceConfigurationTimelineWithOptions(GetResourceConfigurationTimelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetResourceConfigurationTimeline", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetResourceConfigurationTimelineResponse());
    }

    public GetResourceConfigurationTimelineResponse getResourceConfigurationTimeline(GetResourceConfigurationTimelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceConfigurationTimelineWithOptions(request, runtime);
    }

    public GetDiscoveredResourceCountsGroupByResourceTypeResponse getDiscoveredResourceCountsGroupByResourceTypeWithOptions(GetDiscoveredResourceCountsGroupByResourceTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDiscoveredResourceCountsGroupByResourceType", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetDiscoveredResourceCountsGroupByResourceTypeResponse());
    }

    public GetDiscoveredResourceCountsGroupByResourceTypeResponse getDiscoveredResourceCountsGroupByResourceType(GetDiscoveredResourceCountsGroupByResourceTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDiscoveredResourceCountsGroupByResourceTypeWithOptions(request, runtime);
    }

    public CreateAggregatorResponse createAggregatorWithOptions(CreateAggregatorRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAggregatorShrinkRequest request = new CreateAggregatorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aggregatorAccounts)) {
            request.aggregatorAccountsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aggregatorAccounts, "AggregatorAccounts", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAggregator", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAggregatorResponse());
    }

    public CreateAggregatorResponse createAggregator(CreateAggregatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAggregatorWithOptions(request, runtime);
    }

    public ListAggregateConfigRulesResponse listAggregateConfigRulesWithOptions(ListAggregateConfigRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAggregateConfigRules", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new ListAggregateConfigRulesResponse());
    }

    public ListAggregateConfigRulesResponse listAggregateConfigRules(ListAggregateConfigRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAggregateConfigRulesWithOptions(request, runtime);
    }

    public GenerateAggregateResourceInventoryResponse generateAggregateResourceInventoryWithOptions(GenerateAggregateResourceInventoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateAggregateResourceInventory", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateAggregateResourceInventoryResponse());
    }

    public GenerateAggregateResourceInventoryResponse generateAggregateResourceInventory(GenerateAggregateResourceInventoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateAggregateResourceInventoryWithOptions(request, runtime);
    }

    public CreateAggregateConfigRuleResponse createAggregateConfigRuleWithOptions(CreateAggregateConfigRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAggregateConfigRuleShrinkRequest request = new CreateAggregateConfigRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputParameters)) {
            request.inputParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputParameters, "InputParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceTypesScope)) {
            request.resourceTypesScopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceTypesScope, "ResourceTypesScope", "simple");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAggregateConfigRule", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAggregateConfigRuleResponse());
    }

    public CreateAggregateConfigRuleResponse createAggregateConfigRule(CreateAggregateConfigRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAggregateConfigRuleWithOptions(request, runtime);
    }

    public CreateAggregateRemediationResponse createAggregateRemediationWithOptions(CreateAggregateRemediationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAggregateRemediation", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAggregateRemediationResponse());
    }

    public CreateAggregateRemediationResponse createAggregateRemediation(CreateAggregateRemediationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAggregateRemediationWithOptions(request, runtime);
    }

    public StartAggregateConfigRuleEvaluationResponse startAggregateConfigRuleEvaluationWithOptions(StartAggregateConfigRuleEvaluationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartAggregateConfigRuleEvaluation", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new StartAggregateConfigRuleEvaluationResponse());
    }

    public StartAggregateConfigRuleEvaluationResponse startAggregateConfigRuleEvaluation(StartAggregateConfigRuleEvaluationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startAggregateConfigRuleEvaluationWithOptions(request, runtime);
    }

    public GenerateAggregateCompliancePackReportResponse generateAggregateCompliancePackReportWithOptions(GenerateAggregateCompliancePackReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateAggregateCompliancePackReport", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateAggregateCompliancePackReportResponse());
    }

    public GenerateAggregateCompliancePackReportResponse generateAggregateCompliancePackReport(GenerateAggregateCompliancePackReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateAggregateCompliancePackReportWithOptions(request, runtime);
    }

    public GetCompliancePackReportResponse getCompliancePackReportWithOptions(GetCompliancePackReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetCompliancePackReport", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetCompliancePackReportResponse());
    }

    public GetCompliancePackReportResponse getCompliancePackReport(GetCompliancePackReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getCompliancePackReportWithOptions(request, runtime);
    }

    public GetResourceComplianceByConfigRuleResponse getResourceComplianceByConfigRuleWithOptions(GetResourceComplianceByConfigRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetResourceComplianceByConfigRule", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetResourceComplianceByConfigRuleResponse());
    }

    public GetResourceComplianceByConfigRuleResponse getResourceComplianceByConfigRule(GetResourceComplianceByConfigRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceComplianceByConfigRuleWithOptions(request, runtime);
    }

    public ListResourceEvaluationResultsResponse listResourceEvaluationResultsWithOptions(ListResourceEvaluationResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListResourceEvaluationResults", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new ListResourceEvaluationResultsResponse());
    }

    public ListResourceEvaluationResultsResponse listResourceEvaluationResults(ListResourceEvaluationResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listResourceEvaluationResultsWithOptions(request, runtime);
    }

    public UpdateCompliancePackResponse updateCompliancePackWithOptions(UpdateCompliancePackRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCompliancePackShrinkRequest request = new UpdateCompliancePackShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configRules)) {
            request.configRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configRules, "ConfigRules", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCompliancePack", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCompliancePackResponse());
    }

    public UpdateCompliancePackResponse updateCompliancePack(UpdateCompliancePackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCompliancePackWithOptions(request, runtime);
    }

    public ListAggregateResourceEvaluationResultsResponse listAggregateResourceEvaluationResultsWithOptions(ListAggregateResourceEvaluationResultsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("ListAggregateResourceEvaluationResults", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new ListAggregateResourceEvaluationResultsResponse());
    }

    public ListAggregateResourceEvaluationResultsResponse listAggregateResourceEvaluationResults(ListAggregateResourceEvaluationResultsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAggregateResourceEvaluationResultsWithOptions(request, runtime);
    }

    public GetConfigRuleResponse getConfigRuleWithOptions(GetConfigRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConfigRule", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new GetConfigRuleResponse());
    }

    public GetConfigRuleResponse getConfigRule(GetConfigRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConfigRuleWithOptions(request, runtime);
    }

    public DeactiveConfigRulesResponse deactiveConfigRulesWithOptions(DeactiveConfigRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeactiveConfigRules", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new DeactiveConfigRulesResponse());
    }

    public DeactiveConfigRulesResponse deactiveConfigRules(DeactiveConfigRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deactiveConfigRulesWithOptions(request, runtime);
    }

    public CreateCompliancePackResponse createCompliancePackWithOptions(CreateCompliancePackRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateCompliancePackShrinkRequest request = new CreateCompliancePackShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configRules)) {
            request.configRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configRules, "ConfigRules", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCompliancePack", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCompliancePackResponse());
    }

    public CreateCompliancePackResponse createCompliancePack(CreateCompliancePackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCompliancePackWithOptions(request, runtime);
    }

    public GetDiscoveredResourceCountsGroupByRegionResponse getDiscoveredResourceCountsGroupByRegionWithOptions(GetDiscoveredResourceCountsGroupByRegionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDiscoveredResourceCountsGroupByRegion", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetDiscoveredResourceCountsGroupByRegionResponse());
    }

    public GetDiscoveredResourceCountsGroupByRegionResponse getDiscoveredResourceCountsGroupByRegion(GetDiscoveredResourceCountsGroupByRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDiscoveredResourceCountsGroupByRegionWithOptions(request, runtime);
    }

    public GetAggregateConfigRuleComplianceByPackResponse getAggregateConfigRuleComplianceByPackWithOptions(GetAggregateConfigRuleComplianceByPackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregateConfigRuleComplianceByPack", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetAggregateConfigRuleComplianceByPackResponse());
    }

    public GetAggregateConfigRuleComplianceByPackResponse getAggregateConfigRuleComplianceByPack(GetAggregateConfigRuleComplianceByPackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateConfigRuleComplianceByPackWithOptions(request, runtime);
    }

    public GetAggregateResourceComplianceByConfigRuleResponse getAggregateResourceComplianceByConfigRuleWithOptions(GetAggregateResourceComplianceByConfigRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregateResourceComplianceByConfigRule", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetAggregateResourceComplianceByConfigRuleResponse());
    }

    public GetAggregateResourceComplianceByConfigRuleResponse getAggregateResourceComplianceByConfigRule(GetAggregateResourceComplianceByConfigRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateResourceComplianceByConfigRuleWithOptions(request, runtime);
    }

    public GetAggregateConfigRuleSummaryByRiskLevelResponse getAggregateConfigRuleSummaryByRiskLevelWithOptions(GetAggregateConfigRuleSummaryByRiskLevelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregateConfigRuleSummaryByRiskLevel", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetAggregateConfigRuleSummaryByRiskLevelResponse());
    }

    public GetAggregateConfigRuleSummaryByRiskLevelResponse getAggregateConfigRuleSummaryByRiskLevel(GetAggregateConfigRuleSummaryByRiskLevelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateConfigRuleSummaryByRiskLevelWithOptions(request, runtime);
    }

    public UpdateConfigRuleResponse updateConfigRuleWithOptions(UpdateConfigRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateConfigRuleShrinkRequest request = new UpdateConfigRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputParameters)) {
            request.inputParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputParameters, "InputParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceTypesScope)) {
            request.resourceTypesScopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceTypesScope, "ResourceTypesScope", "simple");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateConfigRule", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateConfigRuleResponse());
    }

    public UpdateConfigRuleResponse updateConfigRule(UpdateConfigRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConfigRuleWithOptions(request, runtime);
    }

    public GetAggregateResourceInventoryResponse getAggregateResourceInventoryWithOptions(GetAggregateResourceInventoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregateResourceInventory", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new GetAggregateResourceInventoryResponse());
    }

    public GetAggregateResourceInventoryResponse getAggregateResourceInventory(GetAggregateResourceInventoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateResourceInventoryWithOptions(request, runtime);
    }

    public GetAggregateResourceComplianceTimelineResponse getAggregateResourceComplianceTimelineWithOptions(GetAggregateResourceComplianceTimelineRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregateResourceComplianceTimeline", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetAggregateResourceComplianceTimelineResponse());
    }

    public GetAggregateResourceComplianceTimelineResponse getAggregateResourceComplianceTimeline(GetAggregateResourceComplianceTimelineRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateResourceComplianceTimelineWithOptions(request, runtime);
    }

    public UpdateAggregateConfigRuleResponse updateAggregateConfigRuleWithOptions(UpdateAggregateConfigRuleRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAggregateConfigRuleShrinkRequest request = new UpdateAggregateConfigRuleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.inputParameters)) {
            request.inputParametersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.inputParameters, "InputParameters", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceTypesScope)) {
            request.resourceTypesScopeShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceTypesScope, "ResourceTypesScope", "simple");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAggregateConfigRule", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAggregateConfigRuleResponse());
    }

    public UpdateAggregateConfigRuleResponse updateAggregateConfigRule(UpdateAggregateConfigRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAggregateConfigRuleWithOptions(request, runtime);
    }

    public GetAggregateCompliancePackReportResponse getAggregateCompliancePackReportWithOptions(GetAggregateCompliancePackReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregateCompliancePackReport", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetAggregateCompliancePackReportResponse());
    }

    public GetAggregateCompliancePackReportResponse getAggregateCompliancePackReport(GetAggregateCompliancePackReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateCompliancePackReportWithOptions(request, runtime);
    }

    public CreateAggregateCompliancePackResponse createAggregateCompliancePackWithOptions(CreateAggregateCompliancePackRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateAggregateCompliancePackShrinkRequest request = new CreateAggregateCompliancePackShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.configRules)) {
            request.configRulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.configRules, "ConfigRules", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAggregateCompliancePack", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAggregateCompliancePackResponse());
    }

    public CreateAggregateCompliancePackResponse createAggregateCompliancePack(CreateAggregateCompliancePackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAggregateCompliancePackWithOptions(request, runtime);
    }

    public GetAggregateResourceCountsGroupByResourceTypeResponse getAggregateResourceCountsGroupByResourceTypeWithOptions(GetAggregateResourceCountsGroupByResourceTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregateResourceCountsGroupByResourceType", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetAggregateResourceCountsGroupByResourceTypeResponse());
    }

    public GetAggregateResourceCountsGroupByResourceTypeResponse getAggregateResourceCountsGroupByResourceType(GetAggregateResourceCountsGroupByResourceTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateResourceCountsGroupByResourceTypeWithOptions(request, runtime);
    }

    public GetAggregateConfigRuleResponse getAggregateConfigRuleWithOptions(GetAggregateConfigRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregateConfigRule", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new GetAggregateConfigRuleResponse());
    }

    public GetAggregateConfigRuleResponse getAggregateConfigRule(GetAggregateConfigRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateConfigRuleWithOptions(request, runtime);
    }

    public GetAggregateResourceCountsGroupByRegionResponse getAggregateResourceCountsGroupByRegionWithOptions(GetAggregateResourceCountsGroupByRegionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAggregateResourceCountsGroupByRegion", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetAggregateResourceCountsGroupByRegionResponse());
    }

    public GetAggregateResourceCountsGroupByRegionResponse getAggregateResourceCountsGroupByRegion(GetAggregateResourceCountsGroupByRegionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAggregateResourceCountsGroupByRegionWithOptions(request, runtime);
    }

    public GetConfigRuleComplianceByPackResponse getConfigRuleComplianceByPackWithOptions(GetConfigRuleComplianceByPackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConfigRuleComplianceByPack", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetConfigRuleComplianceByPackResponse());
    }

    public GetConfigRuleComplianceByPackResponse getConfigRuleComplianceByPack(GetConfigRuleComplianceByPackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConfigRuleComplianceByPackWithOptions(request, runtime);
    }

    public GetConfigRuleSummaryByRiskLevelResponse getConfigRuleSummaryByRiskLevelWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetConfigRuleSummaryByRiskLevel", "2020-09-07", "HTTPS", "GET", "AK", "json", req, runtime), new GetConfigRuleSummaryByRiskLevelResponse());
    }

    public GetConfigRuleSummaryByRiskLevelResponse getConfigRuleSummaryByRiskLevel() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConfigRuleSummaryByRiskLevelWithOptions(runtime);
    }

    public StartRemediationResponse startRemediationWithOptions(StartRemediationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartRemediation", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new StartRemediationResponse());
    }

    public StartRemediationResponse startRemediation(StartRemediationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startRemediationWithOptions(request, runtime);
    }

    public GenerateCompliancePackReportResponse generateCompliancePackReportWithOptions(GenerateCompliancePackReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GenerateCompliancePackReport", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new GenerateCompliancePackReportResponse());
    }

    public GenerateCompliancePackReportResponse generateCompliancePackReport(GenerateCompliancePackReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateCompliancePackReportWithOptions(request, runtime);
    }

    public StartAggregateRemediationResponse startAggregateRemediationWithOptions(StartAggregateRemediationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartAggregateRemediation", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new StartAggregateRemediationResponse());
    }

    public StartAggregateRemediationResponse startAggregateRemediation(StartAggregateRemediationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startAggregateRemediationWithOptions(request, runtime);
    }

    public ListRemediationsResponse listRemediationsWithOptions(ListRemediationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRemediations", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new ListRemediationsResponse());
    }

    public ListRemediationsResponse listRemediations(ListRemediationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRemediationsWithOptions(request, runtime);
    }

    public UpdateAggregatorResponse updateAggregatorWithOptions(UpdateAggregatorRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateAggregatorShrinkRequest request = new UpdateAggregatorShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.aggregatorAccounts)) {
            request.aggregatorAccountsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.aggregatorAccounts, "AggregatorAccounts", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAggregator", "2020-09-07", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAggregatorResponse());
    }

    public UpdateAggregatorResponse updateAggregator(UpdateAggregatorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAggregatorWithOptions(request, runtime);
    }
}
