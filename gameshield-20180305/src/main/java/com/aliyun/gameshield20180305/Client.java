// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gameshield20180305;

import com.aliyun.tea.*;
import com.aliyun.gameshield20180305.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("gameshield", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CleanFlexAccFwdRulesResponse cleanFlexAccFwdRulesWithOptions(CleanFlexAccFwdRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CleanFlexAccFwdRules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new CleanFlexAccFwdRulesResponse());
    }

    public CleanFlexAccFwdRulesResponse cleanFlexAccFwdRules(CleanFlexAccFwdRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cleanFlexAccFwdRulesWithOptions(request, runtime);
    }

    public CleanFlexFwdRulesResponse cleanFlexFwdRulesWithOptions(CleanFlexFwdRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CleanFlexFwdRules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new CleanFlexFwdRulesResponse());
    }

    public CleanFlexFwdRulesResponse cleanFlexFwdRules(CleanFlexFwdRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cleanFlexFwdRulesWithOptions(request, runtime);
    }

    public ClearCcRouteRulesResponse clearCcRouteRulesWithOptions(ClearCcRouteRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ClearCcRouteRules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new ClearCcRouteRulesResponse());
    }

    public ClearCcRouteRulesResponse clearCcRouteRules(ClearCcRouteRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clearCcRouteRulesWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateApp", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    public CreateAppKeyResponse createAppKeyWithOptions(CreateAppKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAppKey", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAppKeyResponse());
    }

    public CreateAppKeyResponse createAppKey(CreateAppKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppKeyWithOptions(request, runtime);
    }

    public CreateBizResponse createBizWithOptions(CreateBizRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateBiz", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateBizResponse());
    }

    public CreateBizResponse createBiz(CreateBizRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createBizWithOptions(request, runtime);
    }

    public CreateCcRouteRulesResponse createCcRouteRulesWithOptions(CreateCcRouteRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCcRouteRules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCcRouteRulesResponse());
    }

    public CreateCcRouteRulesResponse createCcRouteRules(CreateCcRouteRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCcRouteRulesWithOptions(request, runtime);
    }

    public CreateFlexAccFwdRuleResponse createFlexAccFwdRuleWithOptions(CreateFlexAccFwdRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlexAccFwdRule", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlexAccFwdRuleResponse());
    }

    public CreateFlexAccFwdRuleResponse createFlexAccFwdRule(CreateFlexAccFwdRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlexAccFwdRuleWithOptions(request, runtime);
    }

    public CreateFlexAccFwdRuleListResponse createFlexAccFwdRuleListWithOptions(CreateFlexAccFwdRuleListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlexAccFwdRuleList", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlexAccFwdRuleListResponse());
    }

    public CreateFlexAccFwdRuleListResponse createFlexAccFwdRuleList(CreateFlexAccFwdRuleListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlexAccFwdRuleListWithOptions(request, runtime);
    }

    public CreateFlexFwdRuleResponse createFlexFwdRuleWithOptions(CreateFlexFwdRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateFlexFwdRule", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateFlexFwdRuleResponse());
    }

    public CreateFlexFwdRuleResponse createFlexFwdRule(CreateFlexFwdRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFlexFwdRuleWithOptions(request, runtime);
    }

    public CreateGroupResponse createGroupWithOptions(CreateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateGroup", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateGroupResponse());
    }

    public CreateGroupResponse createGroup(CreateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createGroupWithOptions(request, runtime);
    }

    public CreateLayer4RuleResponse createLayer4RuleWithOptions(CreateLayer4RuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLayer4Rule", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLayer4RuleResponse());
    }

    public CreateLayer4RuleResponse createLayer4Rule(CreateLayer4RuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLayer4RuleWithOptions(request, runtime);
    }

    public CreateLayer4RulesResponse createLayer4RulesWithOptions(CreateLayer4RulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLayer4Rules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLayer4RulesResponse());
    }

    public CreateLayer4RulesResponse createLayer4Rules(CreateLayer4RulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLayer4RulesWithOptions(request, runtime);
    }

    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteApp", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAppResponse());
    }

    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    public DeleteAppKeyResponse deleteAppKeyWithOptions(DeleteAppKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAppKey", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAppKeyResponse());
    }

    public DeleteAppKeyResponse deleteAppKey(DeleteAppKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppKeyWithOptions(request, runtime);
    }

    public DeleteBizResponse deleteBizWithOptions(DeleteBizRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteBiz", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteBizResponse());
    }

    public DeleteBizResponse deleteBiz(DeleteBizRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteBizWithOptions(request, runtime);
    }

    public DeleteCcRouteRulesResponse deleteCcRouteRulesWithOptions(DeleteCcRouteRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteCcRouteRules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteCcRouteRulesResponse());
    }

    public DeleteCcRouteRulesResponse deleteCcRouteRules(DeleteCcRouteRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteCcRouteRulesWithOptions(request, runtime);
    }

    public DeleteFlexAccFwdRuleResponse deleteFlexAccFwdRuleWithOptions(DeleteFlexAccFwdRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlexAccFwdRule", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlexAccFwdRuleResponse());
    }

    public DeleteFlexAccFwdRuleResponse deleteFlexAccFwdRule(DeleteFlexAccFwdRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlexAccFwdRuleWithOptions(request, runtime);
    }

    public DeleteFlexFwdRuleResponse deleteFlexFwdRuleWithOptions(DeleteFlexFwdRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteFlexFwdRule", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteFlexFwdRuleResponse());
    }

    public DeleteFlexFwdRuleResponse deleteFlexFwdRule(DeleteFlexFwdRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteFlexFwdRuleWithOptions(request, runtime);
    }

    public DeleteGroupResponse deleteGroupWithOptions(DeleteGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteGroup", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteGroupResponse());
    }

    public DeleteGroupResponse deleteGroup(DeleteGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteGroupWithOptions(request, runtime);
    }

    public DeleteLayer4RuleResponse deleteLayer4RuleWithOptions(DeleteLayer4RuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteLayer4Rule", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteLayer4RuleResponse());
    }

    public DeleteLayer4RuleResponse deleteLayer4Rule(DeleteLayer4RuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLayer4RuleWithOptions(request, runtime);
    }

    public DescribeAccResSummaryResponse describeAccResSummaryWithOptions(DescribeAccResSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAccResSummary", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAccResSummaryResponse());
    }

    public DescribeAccResSummaryResponse describeAccResSummary(DescribeAccResSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAccResSummaryWithOptions(request, runtime);
    }

    public DescribeAllLocalIpsResponse describeAllLocalIpsWithOptions(DescribeAllLocalIpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAllLocalIps", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAllLocalIpsResponse());
    }

    public DescribeAllLocalIpsResponse describeAllLocalIps(DescribeAllLocalIpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAllLocalIpsWithOptions(request, runtime);
    }

    public DescribeAppDailyDetailsResponse describeAppDailyDetailsWithOptions(DescribeAppDailyDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAppDailyDetails", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAppDailyDetailsResponse());
    }

    public DescribeAppDailyDetailsResponse describeAppDailyDetails(DescribeAppDailyDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppDailyDetailsWithOptions(request, runtime);
    }

    public DescribeAppDailySdkVersionsResponse describeAppDailySdkVersionsWithOptions(DescribeAppDailySdkVersionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAppDailySdkVersions", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAppDailySdkVersionsResponse());
    }

    public DescribeAppDailySdkVersionsResponse describeAppDailySdkVersions(DescribeAppDailySdkVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppDailySdkVersionsWithOptions(request, runtime);
    }

    public DescribeAppListResponse describeAppListWithOptions(DescribeAppListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAppList", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAppListResponse());
    }

    public DescribeAppListResponse describeAppList(DescribeAppListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppListWithOptions(request, runtime);
    }

    public DescribeAppSimpleListResponse describeAppSimpleListWithOptions(DescribeAppSimpleListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAppSimpleList", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAppSimpleListResponse());
    }

    public DescribeAppSimpleListResponse describeAppSimpleList(DescribeAppSimpleListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAppSimpleListWithOptions(request, runtime);
    }

    public DescribeAsyncOperationResponse describeAsyncOperationWithOptions(DescribeAsyncOperationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAsyncOperation", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAsyncOperationResponse());
    }

    public DescribeAsyncOperationResponse describeAsyncOperation(DescribeAsyncOperationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAsyncOperationWithOptions(request, runtime);
    }

    public DescribeAutomaticTraceabilitySlsLogResponse describeAutomaticTraceabilitySlsLogWithOptions(DescribeAutomaticTraceabilitySlsLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeAutomaticTraceabilitySlsLog", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeAutomaticTraceabilitySlsLogResponse());
    }

    public DescribeAutomaticTraceabilitySlsLogResponse describeAutomaticTraceabilitySlsLog(DescribeAutomaticTraceabilitySlsLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeAutomaticTraceabilitySlsLogWithOptions(request, runtime);
    }

    public DescribeBgpResSummaryResponse describeBgpResSummaryWithOptions(DescribeBgpResSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBgpResSummary", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBgpResSummaryResponse());
    }

    public DescribeBgpResSummaryResponse describeBgpResSummary(DescribeBgpResSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBgpResSummaryWithOptions(request, runtime);
    }

    public DescribeBizListResponse describeBizListWithOptions(DescribeBizListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBizList", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBizListResponse());
    }

    public DescribeBizListResponse describeBizList(DescribeBizListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBizListWithOptions(request, runtime);
    }

    public DescribeBizSimpleListResponse describeBizSimpleListWithOptions(DescribeBizSimpleListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBizSimpleList", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBizSimpleListResponse());
    }

    public DescribeBizSimpleListResponse describeBizSimpleList(DescribeBizSimpleListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBizSimpleListWithOptions(request, runtime);
    }

    public DescribeBpsFlowResponse describeBpsFlowWithOptions(DescribeBpsFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeBpsFlow", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeBpsFlowResponse());
    }

    public DescribeBpsFlowResponse describeBpsFlow(DescribeBpsFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeBpsFlowWithOptions(request, runtime);
    }

    public DescribeCcBlackListResponse describeCcBlackListWithOptions(DescribeCcBlackListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcBlackList", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcBlackListResponse());
    }

    public DescribeCcBlackListResponse describeCcBlackList(DescribeCcBlackListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcBlackListWithOptions(request, runtime);
    }

    public DescribeCcDevieIpListResponse describeCcDevieIpListWithOptions(DescribeCcDevieIpListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcDevieIpList", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcDevieIpListResponse());
    }

    public DescribeCcDevieIpListResponse describeCcDevieIpList(DescribeCcDevieIpListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcDevieIpListWithOptions(request, runtime);
    }

    public DescribeCcFlowResponse describeCcFlowWithOptions(DescribeCcFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcFlow", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcFlowResponse());
    }

    public DescribeCcFlowResponse describeCcFlow(DescribeCcFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcFlowWithOptions(request, runtime);
    }

    public DescribeCcIDCBlockSwitchResponse describeCcIDCBlockSwitchWithOptions(DescribeCcIDCBlockSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcIDCBlockSwitch", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcIDCBlockSwitchResponse());
    }

    public DescribeCcIDCBlockSwitchResponse describeCcIDCBlockSwitch(DescribeCcIDCBlockSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcIDCBlockSwitchWithOptions(request, runtime);
    }

    public DescribeCcMaxFwResponse describeCcMaxFwWithOptions(DescribeCcMaxFwRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcMaxFw", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcMaxFwResponse());
    }

    public DescribeCcMaxFwResponse describeCcMaxFw(DescribeCcMaxFwRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcMaxFwWithOptions(request, runtime);
    }

    public DescribeCcResSummaryResponse describeCcResSummaryWithOptions(DescribeCcResSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcResSummary", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcResSummaryResponse());
    }

    public DescribeCcResSummaryResponse describeCcResSummary(DescribeCcResSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcResSummaryWithOptions(request, runtime);
    }

    public DescribeCcRouteRulesResponse describeCcRouteRulesWithOptions(DescribeCcRouteRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcRouteRules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcRouteRulesResponse());
    }

    public DescribeCcRouteRulesResponse describeCcRouteRules(DescribeCcRouteRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcRouteRulesWithOptions(request, runtime);
    }

    public DescribeCcRouteSwitchResponse describeCcRouteSwitchWithOptions(DescribeCcRouteSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcRouteSwitch", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcRouteSwitchResponse());
    }

    public DescribeCcRouteSwitchResponse describeCcRouteSwitch(DescribeCcRouteSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcRouteSwitchWithOptions(request, runtime);
    }

    public DescribeCcSocketDetailResponse describeCcSocketDetailWithOptions(DescribeCcSocketDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcSocketDetail", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcSocketDetailResponse());
    }

    public DescribeCcSocketDetailResponse describeCcSocketDetail(DescribeCcSocketDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcSocketDetailWithOptions(request, runtime);
    }

    public DescribeCcTotalFwResponse describeCcTotalFwWithOptions(DescribeCcTotalFwRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcTotalFw", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcTotalFwResponse());
    }

    public DescribeCcTotalFwResponse describeCcTotalFw(DescribeCcTotalFwRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcTotalFwWithOptions(request, runtime);
    }

    public DescribeCcTunnelResponse describeCcTunnelWithOptions(DescribeCcTunnelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcTunnel", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcTunnelResponse());
    }

    public DescribeCcTunnelResponse describeCcTunnel(DescribeCcTunnelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcTunnelWithOptions(request, runtime);
    }

    public DescribeCcWhiteListResponse describeCcWhiteListWithOptions(DescribeCcWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcWhiteList", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcWhiteListResponse());
    }

    public DescribeCcWhiteListResponse describeCcWhiteList(DescribeCcWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcWhiteListWithOptions(request, runtime);
    }

    public DescribeCcZoneBlockConfigResponse describeCcZoneBlockConfigWithOptions(DescribeCcZoneBlockConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcZoneBlockConfig", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcZoneBlockConfigResponse());
    }

    public DescribeCcZoneBlockConfigResponse describeCcZoneBlockConfig(DescribeCcZoneBlockConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcZoneBlockConfigWithOptions(request, runtime);
    }

    public DescribeCcZonesResponse describeCcZonesWithOptions(DescribeCcZonesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCcZones", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCcZonesResponse());
    }

    public DescribeCcZonesResponse describeCcZones(DescribeCcZonesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCcZonesWithOptions(request, runtime);
    }

    public DescribeDailyDetailsResponse describeDailyDetailsWithOptions(DescribeDailyDetailsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDailyDetails", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDailyDetailsResponse());
    }

    public DescribeDailyDetailsResponse describeDailyDetails(DescribeDailyDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDailyDetailsWithOptions(request, runtime);
    }

    public DescribeDownloadUrlsForAppKeyResponse describeDownloadUrlsForAppKeyWithOptions(DescribeDownloadUrlsForAppKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDownloadUrlsForAppKey", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDownloadUrlsForAppKeyResponse());
    }

    public DescribeDownloadUrlsForAppKeyResponse describeDownloadUrlsForAppKey(DescribeDownloadUrlsForAppKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDownloadUrlsForAppKeyWithOptions(request, runtime);
    }

    public DescribeDownloadUrlsForSDKResponse describeDownloadUrlsForSDKWithOptions(DescribeDownloadUrlsForSDKRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDownloadUrlsForSDK", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDownloadUrlsForSDKResponse());
    }

    public DescribeDownloadUrlsForSDKResponse describeDownloadUrlsForSDK(DescribeDownloadUrlsForSDKRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDownloadUrlsForSDKWithOptions(request, runtime);
    }

    public DescribeFlexAccConfigResponse describeFlexAccConfigWithOptions(DescribeFlexAccConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlexAccConfig", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlexAccConfigResponse());
    }

    public DescribeFlexAccConfigResponse describeFlexAccConfig(DescribeFlexAccConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlexAccConfigWithOptions(request, runtime);
    }

    public DescribeFlexAccFlowResponse describeFlexAccFlowWithOptions(DescribeFlexAccFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlexAccFlow", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlexAccFlowResponse());
    }

    public DescribeFlexAccFlowResponse describeFlexAccFlow(DescribeFlexAccFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlexAccFlowWithOptions(request, runtime);
    }

    public DescribeFlexAccFwdRulesResponse describeFlexAccFwdRulesWithOptions(DescribeFlexAccFwdRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlexAccFwdRules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlexAccFwdRulesResponse());
    }

    public DescribeFlexAccFwdRulesResponse describeFlexAccFwdRules(DescribeFlexAccFwdRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlexAccFwdRulesWithOptions(request, runtime);
    }

    public DescribeFlexBackupGroupsResponse describeFlexBackupGroupsWithOptions(DescribeFlexBackupGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlexBackupGroups", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlexBackupGroupsResponse());
    }

    public DescribeFlexBackupGroupsResponse describeFlexBackupGroups(DescribeFlexBackupGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlexBackupGroupsWithOptions(request, runtime);
    }

    public DescribeFlexConfigResponse describeFlexConfigWithOptions(DescribeFlexConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlexConfig", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlexConfigResponse());
    }

    public DescribeFlexConfigResponse describeFlexConfig(DescribeFlexConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlexConfigWithOptions(request, runtime);
    }

    public DescribeFlexFwdRulesResponse describeFlexFwdRulesWithOptions(DescribeFlexFwdRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlexFwdRules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlexFwdRulesResponse());
    }

    public DescribeFlexFwdRulesResponse describeFlexFwdRules(DescribeFlexFwdRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlexFwdRulesWithOptions(request, runtime);
    }

    public DescribeFlexSechedPolicyResponse describeFlexSechedPolicyWithOptions(DescribeFlexSechedPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlexSechedPolicy", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlexSechedPolicyResponse());
    }

    public DescribeFlexSechedPolicyResponse describeFlexSechedPolicy(DescribeFlexSechedPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlexSechedPolicyWithOptions(request, runtime);
    }

    public DescribeFlowReportResponse describeFlowReportWithOptions(DescribeFlowReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFlowReport", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFlowReportResponse());
    }

    public DescribeFlowReportResponse describeFlowReport(DescribeFlowReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFlowReportWithOptions(request, runtime);
    }

    public DescribeFullNodesResponse describeFullNodesWithOptions(DescribeFullNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFullNodes", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFullNodesResponse());
    }

    public DescribeFullNodesResponse describeFullNodes(DescribeFullNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFullNodesWithOptions(request, runtime);
    }

    public DescribeFullNodesSummaryResponse describeFullNodesSummaryWithOptions(DescribeFullNodesSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeFullNodesSummary", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeFullNodesSummaryResponse());
    }

    public DescribeFullNodesSummaryResponse describeFullNodesSummary(DescribeFullNodesSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeFullNodesSummaryWithOptions(request, runtime);
    }

    public DescribeGfResSummaryResponse describeGfResSummaryWithOptions(DescribeGfResSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGfResSummary", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGfResSummaryResponse());
    }

    public DescribeGfResSummaryResponse describeGfResSummary(DescribeGfResSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGfResSummaryWithOptions(request, runtime);
    }

    public DescribeGroupListResponse describeGroupListWithOptions(DescribeGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGroupList", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGroupListResponse());
    }

    public DescribeGroupListResponse describeGroupList(DescribeGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGroupListWithOptions(request, runtime);
    }

    public DescribeGroupSimpleListResponse describeGroupSimpleListWithOptions(DescribeGroupSimpleListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeGroupSimpleList", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeGroupSimpleListResponse());
    }

    public DescribeGroupSimpleListResponse describeGroupSimpleList(DescribeGroupSimpleListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeGroupSimpleListWithOptions(request, runtime);
    }

    public DescribeInstanceResponse describeInstanceWithOptions(DescribeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeInstance", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeInstanceResponse());
    }

    public DescribeInstanceResponse describeInstance(DescribeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeInstanceWithOptions(request, runtime);
    }

    public DescribeIpFlowReportResponse describeIpFlowReportWithOptions(DescribeIpFlowReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeIpFlowReport", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeIpFlowReportResponse());
    }

    public DescribeIpFlowReportResponse describeIpFlowReport(DescribeIpFlowReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeIpFlowReportWithOptions(request, runtime);
    }

    public DescribeJianYuTestGetResponse describeJianYuTestGetWithOptions(DescribeJianYuTestGetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeJianYuTestGet", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeJianYuTestGetResponse());
    }

    public DescribeJianYuTestGetResponse describeJianYuTestGet(DescribeJianYuTestGetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeJianYuTestGetWithOptions(request, runtime);
    }

    public DescribeJianYuTestListResponse describeJianYuTestListWithOptions(DescribeJianYuTestListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeJianYuTestList", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeJianYuTestListResponse());
    }

    public DescribeJianYuTestListResponse describeJianYuTestList(DescribeJianYuTestListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeJianYuTestListWithOptions(request, runtime);
    }

    public DescribeJianYuTestPaginationResponse describeJianYuTestPaginationWithOptions(DescribeJianYuTestPaginationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeJianYuTestPagination", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeJianYuTestPaginationResponse());
    }

    public DescribeJianYuTestPaginationResponse describeJianYuTestPagination(DescribeJianYuTestPaginationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeJianYuTestPaginationWithOptions(request, runtime);
    }

    public DescribeL4EventsSelectiveResponse describeL4EventsSelectiveWithOptions(DescribeL4EventsSelectiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeL4EventsSelective", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeL4EventsSelectiveResponse());
    }

    public DescribeL4EventsSelectiveResponse describeL4EventsSelective(DescribeL4EventsSelectiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeL4EventsSelectiveWithOptions(request, runtime);
    }

    public DescribeLayer4RulesResponse describeLayer4RulesWithOptions(DescribeLayer4RulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeLayer4Rules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeLayer4RulesResponse());
    }

    public DescribeLayer4RulesResponse describeLayer4Rules(DescribeLayer4RulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeLayer4RulesWithOptions(request, runtime);
    }

    public DescribeMianLiuResSummaryResponse describeMianLiuResSummaryWithOptions(DescribeMianLiuResSummaryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeMianLiuResSummary", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeMianLiuResSummaryResponse());
    }

    public DescribeMianLiuResSummaryResponse describeMianLiuResSummary(DescribeMianLiuResSummaryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeMianLiuResSummaryWithOptions(request, runtime);
    }

    public DescribeNgSourceDiagnosisLogResponse describeNgSourceDiagnosisLogWithOptions(DescribeNgSourceDiagnosisLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeNgSourceDiagnosisLog", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeNgSourceDiagnosisLogResponse());
    }

    public DescribeNgSourceDiagnosisLogResponse describeNgSourceDiagnosisLog(DescribeNgSourceDiagnosisLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeNgSourceDiagnosisLogWithOptions(request, runtime);
    }

    public DescribeRemainQpsResponse describeRemainQpsWithOptions(DescribeRemainQpsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRemainQps", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRemainQpsResponse());
    }

    public DescribeRemainQpsResponse describeRemainQps(DescribeRemainQpsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRemainQpsWithOptions(request, runtime);
    }

    public DescribeRequestStatisticByEsnBizIntervalResponse describeRequestStatisticByEsnBizIntervalWithOptions(DescribeRequestStatisticByEsnBizIntervalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRequestStatisticByEsnBizInterval", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRequestStatisticByEsnBizIntervalResponse());
    }

    public DescribeRequestStatisticByEsnBizIntervalResponse describeRequestStatisticByEsnBizInterval(DescribeRequestStatisticByEsnBizIntervalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRequestStatisticByEsnBizIntervalWithOptions(request, runtime);
    }

    public DescribeRequestStatisticCountByEsnBiz1DayResponse describeRequestStatisticCountByEsnBiz1DayWithOptions(DescribeRequestStatisticCountByEsnBiz1DayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRequestStatisticCountByEsnBiz1Day", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRequestStatisticCountByEsnBiz1DayResponse());
    }

    public DescribeRequestStatisticCountByEsnBiz1DayResponse describeRequestStatisticCountByEsnBiz1Day(DescribeRequestStatisticCountByEsnBiz1DayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRequestStatisticCountByEsnBiz1DayWithOptions(request, runtime);
    }

    public DescribeRequestStatisticCountByEsnBiz1DayProvinceResponse describeRequestStatisticCountByEsnBiz1DayProvinceWithOptions(DescribeRequestStatisticCountByEsnBiz1DayProvinceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRequestStatisticCountByEsnBiz1DayProvince", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRequestStatisticCountByEsnBiz1DayProvinceResponse());
    }

    public DescribeRequestStatisticCountByEsnBiz1DayProvinceResponse describeRequestStatisticCountByEsnBiz1DayProvince(DescribeRequestStatisticCountByEsnBiz1DayProvinceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRequestStatisticCountByEsnBiz1DayProvinceWithOptions(request, runtime);
    }

    public DescribeRequestStatisticCountByEsnBiz1M30MResponse describeRequestStatisticCountByEsnBiz1M30MWithOptions(DescribeRequestStatisticCountByEsnBiz1M30MRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRequestStatisticCountByEsnBiz1M30M", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRequestStatisticCountByEsnBiz1M30MResponse());
    }

    public DescribeRequestStatisticCountByEsnBiz1M30MResponse describeRequestStatisticCountByEsnBiz1M30M(DescribeRequestStatisticCountByEsnBiz1M30MRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRequestStatisticCountByEsnBiz1M30MWithOptions(request, runtime);
    }

    public DescribeRequestStatisticCountByEsnBiz30MResponse describeRequestStatisticCountByEsnBiz30MWithOptions(DescribeRequestStatisticCountByEsnBiz30MRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRequestStatisticCountByEsnBiz30M", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRequestStatisticCountByEsnBiz30MResponse());
    }

    public DescribeRequestStatisticCountByEsnBiz30MResponse describeRequestStatisticCountByEsnBiz30M(DescribeRequestStatisticCountByEsnBiz30MRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRequestStatisticCountByEsnBiz30MWithOptions(request, runtime);
    }

    public DescribeRequestStatisticCountByEsnBizGroup30MResponse describeRequestStatisticCountByEsnBizGroup30MWithOptions(DescribeRequestStatisticCountByEsnBizGroup30MRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRequestStatisticCountByEsnBizGroup30M", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRequestStatisticCountByEsnBizGroup30MResponse());
    }

    public DescribeRequestStatisticCountByEsnBizGroup30MResponse describeRequestStatisticCountByEsnBizGroup30M(DescribeRequestStatisticCountByEsnBizGroup30MRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRequestStatisticCountByEsnBizGroup30MWithOptions(request, runtime);
    }

    public DescribeRequestStatisticLogResponse describeRequestStatisticLogWithOptions(DescribeRequestStatisticLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeRequestStatisticLog", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeRequestStatisticLogResponse());
    }

    public DescribeRequestStatisticLogResponse describeRequestStatisticLog(DescribeRequestStatisticLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeRequestStatisticLogWithOptions(request, runtime);
    }

    public DescribeSDKStatisticLogResponse describeSDKStatisticLogWithOptions(DescribeSDKStatisticLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSDKStatisticLog", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSDKStatisticLogResponse());
    }

    public DescribeSDKStatisticLogResponse describeSDKStatisticLog(DescribeSDKStatisticLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSDKStatisticLogWithOptions(request, runtime);
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MResponse describeSDKStatisticResultByEsnBizISP1M30MWithOptions(DescribeSDKStatisticResultByEsnBizISP1M30MRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSDKStatisticResultByEsnBizISP1M30M", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSDKStatisticResultByEsnBizISP1M30MResponse());
    }

    public DescribeSDKStatisticResultByEsnBizISP1M30MResponse describeSDKStatisticResultByEsnBizISP1M30M(DescribeSDKStatisticResultByEsnBizISP1M30MRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSDKStatisticResultByEsnBizISP1M30MWithOptions(request, runtime);
    }

    public DescribeSDKStatisticResultByEsnBizISPIntervalResponse describeSDKStatisticResultByEsnBizISPIntervalWithOptions(DescribeSDKStatisticResultByEsnBizISPIntervalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSDKStatisticResultByEsnBizISPInterval", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSDKStatisticResultByEsnBizISPIntervalResponse());
    }

    public DescribeSDKStatisticResultByEsnBizISPIntervalResponse describeSDKStatisticResultByEsnBizISPInterval(DescribeSDKStatisticResultByEsnBizISPIntervalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSDKStatisticResultByEsnBizISPIntervalWithOptions(request, runtime);
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayResponse describeSDKStatisticResultByEsnBizProvince1DayWithOptions(DescribeSDKStatisticResultByEsnBizProvince1DayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSDKStatisticResultByEsnBizProvince1Day", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSDKStatisticResultByEsnBizProvince1DayResponse());
    }

    public DescribeSDKStatisticResultByEsnBizProvince1DayResponse describeSDKStatisticResultByEsnBizProvince1Day(DescribeSDKStatisticResultByEsnBizProvince1DayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSDKStatisticResultByEsnBizProvince1DayWithOptions(request, runtime);
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MResponse describeSDKStatisticResultByEsnBizProvince30MWithOptions(DescribeSDKStatisticResultByEsnBizProvince30MRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSDKStatisticResultByEsnBizProvince30M", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSDKStatisticResultByEsnBizProvince30MResponse());
    }

    public DescribeSDKStatisticResultByEsnBizProvince30MResponse describeSDKStatisticResultByEsnBizProvince30M(DescribeSDKStatisticResultByEsnBizProvince30MRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSDKStatisticResultByEsnBizProvince30MWithOptions(request, runtime);
    }

    public DescribeSourceFailureTopIpResponse describeSourceFailureTopIpWithOptions(DescribeSourceFailureTopIpRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSourceFailureTopIp", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSourceFailureTopIpResponse());
    }

    public DescribeSourceFailureTopIpResponse describeSourceFailureTopIp(DescribeSourceFailureTopIpRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSourceFailureTopIpWithOptions(request, runtime);
    }

    public DescribeSourceFailureTrendGraphResponse describeSourceFailureTrendGraphWithOptions(DescribeSourceFailureTrendGraphRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeSourceFailureTrendGraph", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeSourceFailureTrendGraphResponse());
    }

    public DescribeSourceFailureTrendGraphResponse describeSourceFailureTrendGraph(DescribeSourceFailureTrendGraphRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeSourceFailureTrendGraphWithOptions(request, runtime);
    }

    public DescribeUploadPreSignResponse describeUploadPreSignWithOptions(DescribeUploadPreSignRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUploadPreSign", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUploadPreSignResponse());
    }

    public DescribeUploadPreSignResponse describeUploadPreSign(DescribeUploadPreSignRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUploadPreSignWithOptions(request, runtime);
    }

    public DescribeUserFlowInfoResponse describeUserFlowInfoWithOptions(DescribeUserFlowInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserFlowInfo", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserFlowInfoResponse());
    }

    public DescribeUserFlowInfoResponse describeUserFlowInfo(DescribeUserFlowInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserFlowInfoWithOptions(request, runtime);
    }

    public DescribeUserFlowReportResponse describeUserFlowReportWithOptions(DescribeUserFlowReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserFlowReport", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserFlowReportResponse());
    }

    public DescribeUserFlowReportResponse describeUserFlowReport(DescribeUserFlowReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserFlowReportWithOptions(request, runtime);
    }

    public DescribeUserTotalFlowReportResponse describeUserTotalFlowReportWithOptions(DescribeUserTotalFlowReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeUserTotalFlowReport", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeUserTotalFlowReportResponse());
    }

    public DescribeUserTotalFlowReportResponse describeUserTotalFlowReport(DescribeUserTotalFlowReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeUserTotalFlowReportWithOptions(request, runtime);
    }

    public DownloadAppKeyFileResponse downloadAppKeyFileWithOptions(DownloadAppKeyFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadAppKeyFile", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DownloadAppKeyFileResponse());
    }

    public DownloadAppKeyFileResponse downloadAppKeyFile(DownloadAppKeyFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadAppKeyFileWithOptions(request, runtime);
    }

    public DownloadCcRouteRulesResponse downloadCcRouteRulesWithOptions(DownloadCcRouteRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadCcRouteRules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DownloadCcRouteRulesResponse());
    }

    public DownloadCcRouteRulesResponse downloadCcRouteRules(DownloadCcRouteRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadCcRouteRulesWithOptions(request, runtime);
    }

    public DownloadFlexAccRulesFileResponse downloadFlexAccRulesFileWithOptions(DownloadFlexAccRulesFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadFlexAccRulesFile", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DownloadFlexAccRulesFileResponse());
    }

    public DownloadFlexAccRulesFileResponse downloadFlexAccRulesFile(DownloadFlexAccRulesFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadFlexAccRulesFileWithOptions(request, runtime);
    }

    public DownloadLayer4RulesResponse downloadLayer4RulesWithOptions(DownloadLayer4RulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadLayer4Rules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DownloadLayer4RulesResponse());
    }

    public DownloadLayer4RulesResponse downloadLayer4Rules(DownloadLayer4RulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadLayer4RulesWithOptions(request, runtime);
    }

    public DownloadSdkFileResponse downloadSdkFileWithOptions(DownloadSdkFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadSdkFile", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DownloadSdkFileResponse());
    }

    public DownloadSdkFileResponse downloadSdkFile(DownloadSdkFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadSdkFileWithOptions(request, runtime);
    }

    public DownloadUserTotalFlowReportResponse downloadUserTotalFlowReportWithOptions(DownloadUserTotalFlowReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DownloadUserTotalFlowReport", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new DownloadUserTotalFlowReportResponse());
    }

    public DownloadUserTotalFlowReportResponse downloadUserTotalFlowReport(DownloadUserTotalFlowReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.downloadUserTotalFlowReportWithOptions(request, runtime);
    }

    public FlushLayer4RulesResponse flushLayer4RulesWithOptions(FlushLayer4RulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("FlushLayer4Rules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new FlushLayer4RulesResponse());
    }

    public FlushLayer4RulesResponse flushLayer4Rules(FlushLayer4RulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.flushLayer4RulesWithOptions(request, runtime);
    }

    public ReallocNgResourceResponse reallocNgResourceWithOptions(ReallocNgResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReallocNgResource", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new ReallocNgResourceResponse());
    }

    public ReallocNgResourceResponse reallocNgResource(ReallocNgResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reallocNgResourceWithOptions(request, runtime);
    }

    public ReplaceCcRouteRulesResponse replaceCcRouteRulesWithOptions(ReplaceCcRouteRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ReplaceCcRouteRules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new ReplaceCcRouteRulesResponse());
    }

    public ReplaceCcRouteRulesResponse replaceCcRouteRules(ReplaceCcRouteRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceCcRouteRulesWithOptions(request, runtime);
    }

    public SearchFlexFwdRulesResponse searchFlexFwdRulesWithOptions(SearchFlexFwdRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchFlexFwdRules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new SearchFlexFwdRulesResponse());
    }

    public SearchFlexFwdRulesResponse searchFlexFwdRules(SearchFlexFwdRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchFlexFwdRulesWithOptions(request, runtime);
    }

    public UpdateAppResponse updateAppWithOptions(UpdateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateApp", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppResponse());
    }

    public UpdateAppResponse updateApp(UpdateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppWithOptions(request, runtime);
    }

    public UpdateCcBlackListResponse updateCcBlackListWithOptions(UpdateCcBlackListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCcBlackList", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCcBlackListResponse());
    }

    public UpdateCcBlackListResponse updateCcBlackList(UpdateCcBlackListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCcBlackListWithOptions(request, runtime);
    }

    public UpdateCcIDCBlockSwitchResponse updateCcIDCBlockSwitchWithOptions(UpdateCcIDCBlockSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCcIDCBlockSwitch", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCcIDCBlockSwitchResponse());
    }

    public UpdateCcIDCBlockSwitchResponse updateCcIDCBlockSwitch(UpdateCcIDCBlockSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCcIDCBlockSwitchWithOptions(request, runtime);
    }

    public UpdateCcRouteRulesResponse updateCcRouteRulesWithOptions(UpdateCcRouteRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCcRouteRules", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCcRouteRulesResponse());
    }

    public UpdateCcRouteRulesResponse updateCcRouteRules(UpdateCcRouteRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCcRouteRulesWithOptions(request, runtime);
    }

    public UpdateCcRouteSwitchResponse updateCcRouteSwitchWithOptions(UpdateCcRouteSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCcRouteSwitch", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCcRouteSwitchResponse());
    }

    public UpdateCcRouteSwitchResponse updateCcRouteSwitch(UpdateCcRouteSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCcRouteSwitchWithOptions(request, runtime);
    }

    public UpdateCcTunnelGrayAndOnlyAllowResponse updateCcTunnelGrayAndOnlyAllowWithOptions(UpdateCcTunnelGrayAndOnlyAllowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCcTunnelGrayAndOnlyAllow", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCcTunnelGrayAndOnlyAllowResponse());
    }

    public UpdateCcTunnelGrayAndOnlyAllowResponse updateCcTunnelGrayAndOnlyAllow(UpdateCcTunnelGrayAndOnlyAllowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCcTunnelGrayAndOnlyAllowWithOptions(request, runtime);
    }

    public UpdateCcTunnelStatusResponse updateCcTunnelStatusWithOptions(UpdateCcTunnelStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCcTunnelStatus", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCcTunnelStatusResponse());
    }

    public UpdateCcTunnelStatusResponse updateCcTunnelStatus(UpdateCcTunnelStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCcTunnelStatusWithOptions(request, runtime);
    }

    public UpdateCcUseResponse updateCcUseWithOptions(UpdateCcUseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCcUse", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCcUseResponse());
    }

    public UpdateCcUseResponse updateCcUse(UpdateCcUseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCcUseWithOptions(request, runtime);
    }

    public UpdateCcWhiteListResponse updateCcWhiteListWithOptions(UpdateCcWhiteListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCcWhiteList", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCcWhiteListResponse());
    }

    public UpdateCcWhiteListResponse updateCcWhiteList(UpdateCcWhiteListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCcWhiteListWithOptions(request, runtime);
    }

    public UpdateCcZoneBlockConfigResponse updateCcZoneBlockConfigWithOptions(UpdateCcZoneBlockConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCcZoneBlockConfig", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCcZoneBlockConfigResponse());
    }

    public UpdateCcZoneBlockConfigResponse updateCcZoneBlockConfig(UpdateCcZoneBlockConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCcZoneBlockConfigWithOptions(request, runtime);
    }

    public UpdateCcZoneBlockStatusResponse updateCcZoneBlockStatusWithOptions(UpdateCcZoneBlockStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateCcZoneBlockStatus", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateCcZoneBlockStatusResponse());
    }

    public UpdateCcZoneBlockStatusResponse updateCcZoneBlockStatus(UpdateCcZoneBlockStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateCcZoneBlockStatusWithOptions(request, runtime);
    }

    public UpdateFlexAccFwdRuleResponse updateFlexAccFwdRuleWithOptions(UpdateFlexAccFwdRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFlexAccFwdRule", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFlexAccFwdRuleResponse());
    }

    public UpdateFlexAccFwdRuleResponse updateFlexAccFwdRule(UpdateFlexAccFwdRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFlexAccFwdRuleWithOptions(request, runtime);
    }

    public UpdateFlexAccFwdRuleV2Response updateFlexAccFwdRuleV2WithOptions(UpdateFlexAccFwdRuleV2Request request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFlexAccFwdRuleV2", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFlexAccFwdRuleV2Response());
    }

    public UpdateFlexAccFwdRuleV2Response updateFlexAccFwdRuleV2(UpdateFlexAccFwdRuleV2Request request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFlexAccFwdRuleV2WithOptions(request, runtime);
    }

    public UpdateFlexAccStatusResponse updateFlexAccStatusWithOptions(UpdateFlexAccStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFlexAccStatus", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFlexAccStatusResponse());
    }

    public UpdateFlexAccStatusResponse updateFlexAccStatus(UpdateFlexAccStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFlexAccStatusWithOptions(request, runtime);
    }

    public UpdateFlexAccTcpPortsResponse updateFlexAccTcpPortsWithOptions(UpdateFlexAccTcpPortsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFlexAccTcpPorts", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFlexAccTcpPortsResponse());
    }

    public UpdateFlexAccTcpPortsResponse updateFlexAccTcpPorts(UpdateFlexAccTcpPortsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFlexAccTcpPortsWithOptions(request, runtime);
    }

    public UpdateFlexAccUdpPortsResponse updateFlexAccUdpPortsWithOptions(UpdateFlexAccUdpPortsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFlexAccUdpPorts", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFlexAccUdpPortsResponse());
    }

    public UpdateFlexAccUdpPortsResponse updateFlexAccUdpPorts(UpdateFlexAccUdpPortsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFlexAccUdpPortsWithOptions(request, runtime);
    }

    public UpdateFlexBackupGroupsResponse updateFlexBackupGroupsWithOptions(UpdateFlexBackupGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFlexBackupGroups", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFlexBackupGroupsResponse());
    }

    public UpdateFlexBackupGroupsResponse updateFlexBackupGroups(UpdateFlexBackupGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFlexBackupGroupsWithOptions(request, runtime);
    }

    public UpdateFlexFwdRuleResponse updateFlexFwdRuleWithOptions(UpdateFlexFwdRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFlexFwdRule", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFlexFwdRuleResponse());
    }

    public UpdateFlexFwdRuleResponse updateFlexFwdRule(UpdateFlexFwdRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFlexFwdRuleWithOptions(request, runtime);
    }

    public UpdateFlexInnerPolicyResponse updateFlexInnerPolicyWithOptions(UpdateFlexInnerPolicyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFlexInnerPolicy", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFlexInnerPolicyResponse());
    }

    public UpdateFlexInnerPolicyResponse updateFlexInnerPolicy(UpdateFlexInnerPolicyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFlexInnerPolicyWithOptions(request, runtime);
    }

    public UpdateFlexLinkTypeResponse updateFlexLinkTypeWithOptions(UpdateFlexLinkTypeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFlexLinkType", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFlexLinkTypeResponse());
    }

    public UpdateFlexLinkTypeResponse updateFlexLinkType(UpdateFlexLinkTypeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFlexLinkTypeWithOptions(request, runtime);
    }

    public UpdateFlexPortsResponse updateFlexPortsWithOptions(UpdateFlexPortsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFlexPorts", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFlexPortsResponse());
    }

    public UpdateFlexPortsResponse updateFlexPorts(UpdateFlexPortsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFlexPortsWithOptions(request, runtime);
    }

    public UpdateFlexStatusResponse updateFlexStatusWithOptions(UpdateFlexStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateFlexStatus", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateFlexStatusResponse());
    }

    public UpdateFlexStatusResponse updateFlexStatus(UpdateFlexStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateFlexStatusWithOptions(request, runtime);
    }

    public UpdateGroupResponse updateGroupWithOptions(UpdateGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGroup", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGroupResponse());
    }

    public UpdateGroupResponse updateGroup(UpdateGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGroupWithOptions(request, runtime);
    }

    public UpdateGroupDnsStatusResponse updateGroupDnsStatusWithOptions(UpdateGroupDnsStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGroupDnsStatus", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGroupDnsStatusResponse());
    }

    public UpdateGroupDnsStatusResponse updateGroupDnsStatus(UpdateGroupDnsStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGroupDnsStatusWithOptions(request, runtime);
    }

    public UpdateGroupNodesResponse updateGroupNodesWithOptions(UpdateGroupNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGroupNodes", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGroupNodesResponse());
    }

    public UpdateGroupNodesResponse updateGroupNodes(UpdateGroupNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGroupNodesWithOptions(request, runtime);
    }

    public UpdateGroupStatusResponse updateGroupStatusWithOptions(UpdateGroupStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateGroupStatus", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateGroupStatusResponse());
    }

    public UpdateGroupStatusResponse updateGroupStatus(UpdateGroupStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateGroupStatusWithOptions(request, runtime);
    }

    public UpdateLayer4RuleResponse updateLayer4RuleWithOptions(UpdateLayer4RuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLayer4Rule", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLayer4RuleResponse());
    }

    public UpdateLayer4RuleResponse updateLayer4Rule(UpdateLayer4RuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLayer4RuleWithOptions(request, runtime);
    }

    public UploadCcRouteFileForParseResponse uploadCcRouteFileForParseWithOptions(UploadCcRouteFileForParseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadCcRouteFileForParse", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UploadCcRouteFileForParseResponse());
    }

    public UploadCcRouteFileForParseResponse uploadCcRouteFileForParse(UploadCcRouteFileForParseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadCcRouteFileForParseWithOptions(request, runtime);
    }

    public UploadCcWhiteBlackListResponse uploadCcWhiteBlackListWithOptions(UploadCcWhiteBlackListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadCcWhiteBlackList", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UploadCcWhiteBlackListResponse());
    }

    public UploadCcWhiteBlackListResponse uploadCcWhiteBlackList(UploadCcWhiteBlackListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadCcWhiteBlackListWithOptions(request, runtime);
    }

    public UploadFlexAccRulesFileForParseResponse uploadFlexAccRulesFileForParseWithOptions(UploadFlexAccRulesFileForParseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadFlexAccRulesFileForParse", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UploadFlexAccRulesFileForParseResponse());
    }

    public UploadFlexAccRulesFileForParseResponse uploadFlexAccRulesFileForParse(UploadFlexAccRulesFileForParseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadFlexAccRulesFileForParseWithOptions(request, runtime);
    }

    public UploadFlexRulesFileForParseResponse uploadFlexRulesFileForParseWithOptions(UploadFlexRulesFileForParseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadFlexRulesFileForParse", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UploadFlexRulesFileForParseResponse());
    }

    public UploadFlexRulesFileForParseResponse uploadFlexRulesFileForParse(UploadFlexRulesFileForParseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadFlexRulesFileForParseWithOptions(request, runtime);
    }

    public UploadL4RulesFileForParseResponse uploadL4RulesFileForParseWithOptions(UploadL4RulesFileForParseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UploadL4RulesFileForParse", "2018-03-05", "HTTPS", "POST", "AK", "json", req, runtime), new UploadL4RulesFileForParseResponse());
    }

    public UploadL4RulesFileForParseResponse uploadL4RulesFileForParse(UploadL4RulesFileForParseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uploadL4RulesFileForParseWithOptions(request, runtime);
    }
}
