// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808;

import com.aliyun.tea.*;
import com.aliyun.arms20190808.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "arms.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "arms.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "arms.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "arms.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "arms.aliyuncs.com"),
            new TeaPair("cn-edge-1", "arms.aliyuncs.com"),
            new TeaPair("cn-fujian", "arms.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "arms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "arms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "arms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "arms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "arms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "arms.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "arms.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "arms.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "arms.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "arms.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "arms.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "arms.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "arms.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "arms.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "arms.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "arms.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "arms.aliyuncs.com"),
            new TeaPair("cn-wuhan", "arms.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "arms.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "arms.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "arms.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "arms.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "arms.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "arms.aliyuncs.com"),
            new TeaPair("me-east-1", "arms.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "arms.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("arms", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AddGrafanaResponse addGrafanaWithOptions(AddGrafanaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddGrafana", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new AddGrafanaResponse());
    }

    public AddGrafanaResponse addGrafana(AddGrafanaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addGrafanaWithOptions(request, runtime);
    }

    public AddIntegrationResponse addIntegrationWithOptions(AddIntegrationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddIntegration", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new AddIntegrationResponse());
    }

    public AddIntegrationResponse addIntegration(AddIntegrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addIntegrationWithOptions(request, runtime);
    }

    public AddRecordingRuleResponse addRecordingRuleWithOptions(AddRecordingRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddRecordingRule", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new AddRecordingRuleResponse());
    }

    public AddRecordingRuleResponse addRecordingRule(AddRecordingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addRecordingRuleWithOptions(request, runtime);
    }

    public ApplyScenarioResponse applyScenarioWithOptions(ApplyScenarioRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ApplyScenarioShrinkRequest request = new ApplyScenarioShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.config)) {
            request.configShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.config, "Config", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApplyScenario", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ApplyScenarioResponse());
    }

    public ApplyScenarioResponse applyScenario(ApplyScenarioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.applyScenarioWithOptions(request, runtime);
    }

    public CheckServiceStatusResponse checkServiceStatusWithOptions(CheckServiceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckServiceStatus", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new CheckServiceStatusResponse());
    }

    public CheckServiceStatusResponse checkServiceStatus(CheckServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkServiceStatusWithOptions(request, runtime);
    }

    public ConfigAppResponse configAppWithOptions(ConfigAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ConfigApp", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ConfigAppResponse());
    }

    public ConfigAppResponse configApp(ConfigAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.configAppWithOptions(request, runtime);
    }

    public CreateAlertContactResponse createAlertContactWithOptions(CreateAlertContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAlertContact", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAlertContactResponse());
    }

    public CreateAlertContactResponse createAlertContact(CreateAlertContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAlertContactWithOptions(request, runtime);
    }

    public CreateAlertContactGroupResponse createAlertContactGroupWithOptions(CreateAlertContactGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAlertContactGroup", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAlertContactGroupResponse());
    }

    public CreateAlertContactGroupResponse createAlertContactGroup(CreateAlertContactGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAlertContactGroupWithOptions(request, runtime);
    }

    public CreateDispatchRuleResponse createDispatchRuleWithOptions(CreateDispatchRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDispatchRule", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDispatchRuleResponse());
    }

    public CreateDispatchRuleResponse createDispatchRule(CreateDispatchRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDispatchRuleWithOptions(request, runtime);
    }

    public CreateOrUpdateAlertRuleResponse createOrUpdateAlertRuleWithOptions(CreateOrUpdateAlertRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOrUpdateAlertRule", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOrUpdateAlertRuleResponse());
    }

    public CreateOrUpdateAlertRuleResponse createOrUpdateAlertRule(CreateOrUpdateAlertRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrUpdateAlertRuleWithOptions(request, runtime);
    }

    public CreatePrometheusAlertRuleResponse createPrometheusAlertRuleWithOptions(CreatePrometheusAlertRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePrometheusAlertRule", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePrometheusAlertRuleResponse());
    }

    public CreatePrometheusAlertRuleResponse createPrometheusAlertRule(CreatePrometheusAlertRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPrometheusAlertRuleWithOptions(request, runtime);
    }

    public CreateRetcodeAppResponse createRetcodeAppWithOptions(CreateRetcodeAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRetcodeApp", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRetcodeAppResponse());
    }

    public CreateRetcodeAppResponse createRetcodeApp(CreateRetcodeAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRetcodeAppWithOptions(request, runtime);
    }

    public CreateWebhookResponse createWebhookWithOptions(CreateWebhookRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateWebhook", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateWebhookResponse());
    }

    public CreateWebhookResponse createWebhook(CreateWebhookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createWebhookWithOptions(request, runtime);
    }

    public DeleteAlertContactResponse deleteAlertContactWithOptions(DeleteAlertContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAlertContact", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAlertContactResponse());
    }

    public DeleteAlertContactResponse deleteAlertContact(DeleteAlertContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlertContactWithOptions(request, runtime);
    }

    public DeleteAlertContactGroupResponse deleteAlertContactGroupWithOptions(DeleteAlertContactGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAlertContactGroup", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAlertContactGroupResponse());
    }

    public DeleteAlertContactGroupResponse deleteAlertContactGroup(DeleteAlertContactGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlertContactGroupWithOptions(request, runtime);
    }

    public DeleteAlertRulesResponse deleteAlertRulesWithOptions(DeleteAlertRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteAlertRules", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAlertRulesResponse());
    }

    public DeleteAlertRulesResponse deleteAlertRules(DeleteAlertRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAlertRulesWithOptions(request, runtime);
    }

    public DeleteDispatchRuleResponse deleteDispatchRuleWithOptions(DeleteDispatchRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDispatchRule", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDispatchRuleResponse());
    }

    public DeleteDispatchRuleResponse deleteDispatchRule(DeleteDispatchRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDispatchRuleWithOptions(request, runtime);
    }

    public DeletePrometheusAlertRuleResponse deletePrometheusAlertRuleWithOptions(DeletePrometheusAlertRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeletePrometheusAlertRule", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeletePrometheusAlertRuleResponse());
    }

    public DeletePrometheusAlertRuleResponse deletePrometheusAlertRule(DeletePrometheusAlertRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deletePrometheusAlertRuleWithOptions(request, runtime);
    }

    public DeleteRetcodeAppResponse deleteRetcodeAppWithOptions(DeleteRetcodeAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRetcodeApp", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRetcodeAppResponse());
    }

    public DeleteRetcodeAppResponse deleteRetcodeApp(DeleteRetcodeAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRetcodeAppWithOptions(request, runtime);
    }

    public DeleteScenarioResponse deleteScenarioWithOptions(DeleteScenarioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteScenario", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteScenarioResponse());
    }

    public DeleteScenarioResponse deleteScenario(DeleteScenarioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteScenarioWithOptions(request, runtime);
    }

    public DeleteTraceAppResponse deleteTraceAppWithOptions(DeleteTraceAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteTraceApp", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteTraceAppResponse());
    }

    public DeleteTraceAppResponse deleteTraceApp(DeleteTraceAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTraceAppWithOptions(request, runtime);
    }

    public DescribeDispatchRuleResponse describeDispatchRuleWithOptions(DescribeDispatchRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDispatchRule", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDispatchRuleResponse());
    }

    public DescribeDispatchRuleResponse describeDispatchRule(DescribeDispatchRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDispatchRuleWithOptions(request, runtime);
    }

    public DescribePrometheusAlertRuleResponse describePrometheusAlertRuleWithOptions(DescribePrometheusAlertRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribePrometheusAlertRule", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribePrometheusAlertRuleResponse());
    }

    public DescribePrometheusAlertRuleResponse describePrometheusAlertRule(DescribePrometheusAlertRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describePrometheusAlertRuleWithOptions(request, runtime);
    }

    public DescribeTraceLicenseKeyResponse describeTraceLicenseKeyWithOptions(DescribeTraceLicenseKeyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTraceLicenseKey", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTraceLicenseKeyResponse());
    }

    public DescribeTraceLicenseKeyResponse describeTraceLicenseKey(DescribeTraceLicenseKeyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTraceLicenseKeyWithOptions(request, runtime);
    }

    public GetAgentDownloadUrlResponse getAgentDownloadUrlWithOptions(GetAgentDownloadUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAgentDownloadUrl", "2019-08-08", "HTTPS", "GET", "AK", "json", req, runtime), new GetAgentDownloadUrlResponse());
    }

    public GetAgentDownloadUrlResponse getAgentDownloadUrl(GetAgentDownloadUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAgentDownloadUrlWithOptions(request, runtime);
    }

    public GetAlertRulesResponse getAlertRulesWithOptions(GetAlertRulesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetAlertRulesShrinkRequest request = new GetAlertRulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alertIds)) {
            request.alertIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alertIds, "AlertIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.alertNames)) {
            request.alertNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.alertNames, "AlertNames", "json");
        }

        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAlertRules", "2019-08-08", "HTTPS", "GET", "AK", "json", req, runtime), new GetAlertRulesResponse());
    }

    public GetAlertRulesResponse getAlertRules(GetAlertRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAlertRulesWithOptions(request, runtime);
    }

    public GetAppApiByPageResponse getAppApiByPageWithOptions(GetAppApiByPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAppApiByPage", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetAppApiByPageResponse());
    }

    public GetAppApiByPageResponse getAppApiByPage(GetAppApiByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppApiByPageWithOptions(request, runtime);
    }

    public GetEstimateFeeInfoResponse getEstimateFeeInfoWithOptions(GetEstimateFeeInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEstimateFeeInfo", "2019-08-08", "HTTPS", "GET", "AK", "json", req, runtime), new GetEstimateFeeInfoResponse());
    }

    public GetEstimateFeeInfoResponse getEstimateFeeInfo(GetEstimateFeeInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEstimateFeeInfoWithOptions(request, runtime);
    }

    public GetExploreUrlResponse getExploreUrlWithOptions(GetExploreUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetExploreUrl", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetExploreUrlResponse());
    }

    public GetExploreUrlResponse getExploreUrl(GetExploreUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getExploreUrlWithOptions(request, runtime);
    }

    public GetMultipleTraceResponse getMultipleTraceWithOptions(GetMultipleTraceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMultipleTrace", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetMultipleTraceResponse());
    }

    public GetMultipleTraceResponse getMultipleTrace(GetMultipleTraceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMultipleTraceWithOptions(request, runtime);
    }

    public GetPrometheusApiTokenResponse getPrometheusApiTokenWithOptions(GetPrometheusApiTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPrometheusApiToken", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetPrometheusApiTokenResponse());
    }

    public GetPrometheusApiTokenResponse getPrometheusApiToken(GetPrometheusApiTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPrometheusApiTokenWithOptions(request, runtime);
    }

    public GetRecordingRuleResponse getRecordingRuleWithOptions(GetRecordingRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRecordingRule", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetRecordingRuleResponse());
    }

    public GetRecordingRuleResponse getRecordingRule(GetRecordingRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRecordingRuleWithOptions(request, runtime);
    }

    public GetRetcodeShareUrlResponse getRetcodeShareUrlWithOptions(GetRetcodeShareUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRetcodeShareUrl", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetRetcodeShareUrlResponse());
    }

    public GetRetcodeShareUrlResponse getRetcodeShareUrl(GetRetcodeShareUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRetcodeShareUrlWithOptions(request, runtime);
    }

    public GetStackResponse getStackWithOptions(GetStackRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetStack", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetStackResponse());
    }

    public GetStackResponse getStack(GetStackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStackWithOptions(request, runtime);
    }

    public GetTraceResponse getTraceWithOptions(GetTraceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTrace", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetTraceResponse());
    }

    public GetTraceResponse getTrace(GetTraceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTraceWithOptions(request, runtime);
    }

    public GetTraceAppResponse getTraceAppWithOptions(GetTraceAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTraceApp", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetTraceAppResponse());
    }

    public GetTraceAppResponse getTraceApp(GetTraceAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTraceAppWithOptions(request, runtime);
    }

    public GetUserCommercialStatusResponse getUserCommercialStatusWithOptions(GetUserCommercialStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserCommercialStatus", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserCommercialStatusResponse());
    }

    public GetUserCommercialStatusResponse getUserCommercialStatus(GetUserCommercialStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserCommercialStatusWithOptions(request, runtime);
    }

    public ImportAppAlertRulesResponse importAppAlertRulesWithOptions(ImportAppAlertRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportAppAlertRules", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ImportAppAlertRulesResponse());
    }

    public ImportAppAlertRulesResponse importAppAlertRules(ImportAppAlertRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importAppAlertRulesWithOptions(request, runtime);
    }

    public ListActivatedAlertsResponse listActivatedAlertsWithOptions(ListActivatedAlertsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListActivatedAlerts", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListActivatedAlertsResponse());
    }

    public ListActivatedAlertsResponse listActivatedAlerts(ListActivatedAlertsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listActivatedAlertsWithOptions(request, runtime);
    }

    public ListClusterFromGrafanaResponse listClusterFromGrafanaWithOptions(ListClusterFromGrafanaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListClusterFromGrafana", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListClusterFromGrafanaResponse());
    }

    public ListClusterFromGrafanaResponse listClusterFromGrafana(ListClusterFromGrafanaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listClusterFromGrafanaWithOptions(request, runtime);
    }

    public ListDashboardsResponse listDashboardsWithOptions(ListDashboardsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDashboards", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListDashboardsResponse());
    }

    public ListDashboardsResponse listDashboards(ListDashboardsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDashboardsWithOptions(request, runtime);
    }

    public ListDispatchRuleResponse listDispatchRuleWithOptions(ListDispatchRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDispatchRule", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListDispatchRuleResponse());
    }

    public ListDispatchRuleResponse listDispatchRule(ListDispatchRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDispatchRuleWithOptions(request, runtime);
    }

    public ListPrometheusAlertRulesResponse listPrometheusAlertRulesWithOptions(ListPrometheusAlertRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPrometheusAlertRules", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListPrometheusAlertRulesResponse());
    }

    public ListPrometheusAlertRulesResponse listPrometheusAlertRules(ListPrometheusAlertRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPrometheusAlertRulesWithOptions(request, runtime);
    }

    public ListPrometheusAlertTemplatesResponse listPrometheusAlertTemplatesWithOptions(ListPrometheusAlertTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPrometheusAlertTemplates", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListPrometheusAlertTemplatesResponse());
    }

    public ListPrometheusAlertTemplatesResponse listPrometheusAlertTemplates(ListPrometheusAlertTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPrometheusAlertTemplatesWithOptions(request, runtime);
    }

    public ListRetcodeAppsResponse listRetcodeAppsWithOptions(ListRetcodeAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRetcodeApps", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListRetcodeAppsResponse());
    }

    public ListRetcodeAppsResponse listRetcodeApps(ListRetcodeAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRetcodeAppsWithOptions(request, runtime);
    }

    public ListScenarioResponse listScenarioWithOptions(ListScenarioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListScenario", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListScenarioResponse());
    }

    public ListScenarioResponse listScenario(ListScenarioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listScenarioWithOptions(request, runtime);
    }

    public ListTraceAppsResponse listTraceAppsWithOptions(ListTraceAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTraceApps", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListTraceAppsResponse());
    }

    public ListTraceAppsResponse listTraceApps(ListTraceAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTraceAppsWithOptions(request, runtime);
    }

    public OpenArmsDefaultSLRResponse openArmsDefaultSLRWithOptions(OpenArmsDefaultSLRRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenArmsDefaultSLR", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new OpenArmsDefaultSLRResponse());
    }

    public OpenArmsDefaultSLRResponse openArmsDefaultSLR(OpenArmsDefaultSLRRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openArmsDefaultSLRWithOptions(request, runtime);
    }

    public OpenArmsServiceResponse openArmsServiceWithOptions(OpenArmsServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenArmsService", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new OpenArmsServiceResponse());
    }

    public OpenArmsServiceResponse openArmsService(OpenArmsServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openArmsServiceWithOptions(request, runtime);
    }

    public OpenArmsServiceSecondVersionResponse openArmsServiceSecondVersionWithOptions(OpenArmsServiceSecondVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenArmsServiceSecondVersion", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new OpenArmsServiceSecondVersionResponse());
    }

    public OpenArmsServiceSecondVersionResponse openArmsServiceSecondVersion(OpenArmsServiceSecondVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openArmsServiceSecondVersionWithOptions(request, runtime);
    }

    public OpenVClusterResponse openVClusterWithOptions(OpenVClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenVCluster", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new OpenVClusterResponse());
    }

    public OpenVClusterResponse openVCluster(OpenVClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openVClusterWithOptions(request, runtime);
    }

    public OpenXtraceDefaultSLRResponse openXtraceDefaultSLRWithOptions(OpenXtraceDefaultSLRRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("OpenXtraceDefaultSLR", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new OpenXtraceDefaultSLRResponse());
    }

    public OpenXtraceDefaultSLRResponse openXtraceDefaultSLR(OpenXtraceDefaultSLRRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openXtraceDefaultSLRWithOptions(request, runtime);
    }

    public QueryDatasetResponse queryDatasetWithOptions(QueryDatasetRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryDataset", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new QueryDatasetResponse());
    }

    public QueryDatasetResponse queryDataset(QueryDatasetRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDatasetWithOptions(request, runtime);
    }

    public QueryMetricByPageResponse queryMetricByPageWithOptions(QueryMetricByPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMetricByPage", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMetricByPageResponse());
    }

    public QueryMetricByPageResponse queryMetricByPage(QueryMetricByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMetricByPageWithOptions(request, runtime);
    }

    public QueryPromInstallStatusResponse queryPromInstallStatusWithOptions(QueryPromInstallStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryPromInstallStatus", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new QueryPromInstallStatusResponse());
    }

    public QueryPromInstallStatusResponse queryPromInstallStatus(QueryPromInstallStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPromInstallStatusWithOptions(request, runtime);
    }

    public QueryReleaseMetricResponse queryReleaseMetricWithOptions(QueryReleaseMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryReleaseMetric", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new QueryReleaseMetricResponse());
    }

    public QueryReleaseMetricResponse queryReleaseMetric(QueryReleaseMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryReleaseMetricWithOptions(request, runtime);
    }

    public SaveTraceAppConfigResponse saveTraceAppConfigWithOptions(SaveTraceAppConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SaveTraceAppConfig", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SaveTraceAppConfigResponse());
    }

    public SaveTraceAppConfigResponse saveTraceAppConfig(SaveTraceAppConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveTraceAppConfigWithOptions(request, runtime);
    }

    public SearchAlertContactResponse searchAlertContactWithOptions(SearchAlertContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchAlertContact", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SearchAlertContactResponse());
    }

    public SearchAlertContactResponse searchAlertContact(SearchAlertContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchAlertContactWithOptions(request, runtime);
    }

    public SearchAlertContactGroupResponse searchAlertContactGroupWithOptions(SearchAlertContactGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchAlertContactGroup", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SearchAlertContactGroupResponse());
    }

    public SearchAlertContactGroupResponse searchAlertContactGroup(SearchAlertContactGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchAlertContactGroupWithOptions(request, runtime);
    }

    public SearchAlertHistoriesResponse searchAlertHistoriesWithOptions(SearchAlertHistoriesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchAlertHistories", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SearchAlertHistoriesResponse());
    }

    public SearchAlertHistoriesResponse searchAlertHistories(SearchAlertHistoriesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchAlertHistoriesWithOptions(request, runtime);
    }

    public SearchAlertRulesResponse searchAlertRulesWithOptions(SearchAlertRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchAlertRules", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SearchAlertRulesResponse());
    }

    public SearchAlertRulesResponse searchAlertRules(SearchAlertRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchAlertRulesWithOptions(request, runtime);
    }

    public SearchEventsResponse searchEventsWithOptions(SearchEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchEvents", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SearchEventsResponse());
    }

    public SearchEventsResponse searchEvents(SearchEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchEventsWithOptions(request, runtime);
    }

    public SearchRetcodeAppByPageResponse searchRetcodeAppByPageWithOptions(SearchRetcodeAppByPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchRetcodeAppByPage", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SearchRetcodeAppByPageResponse());
    }

    public SearchRetcodeAppByPageResponse searchRetcodeAppByPage(SearchRetcodeAppByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchRetcodeAppByPageWithOptions(request, runtime);
    }

    public SearchTraceAppByNameResponse searchTraceAppByNameWithOptions(SearchTraceAppByNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchTraceAppByName", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SearchTraceAppByNameResponse());
    }

    public SearchTraceAppByNameResponse searchTraceAppByName(SearchTraceAppByNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTraceAppByNameWithOptions(request, runtime);
    }

    public SearchTraceAppByPageResponse searchTraceAppByPageWithOptions(SearchTraceAppByPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchTraceAppByPage", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SearchTraceAppByPageResponse());
    }

    public SearchTraceAppByPageResponse searchTraceAppByPage(SearchTraceAppByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTraceAppByPageWithOptions(request, runtime);
    }

    public SearchTracesResponse searchTracesWithOptions(SearchTracesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchTraces", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SearchTracesResponse());
    }

    public SearchTracesResponse searchTraces(SearchTracesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTracesWithOptions(request, runtime);
    }

    public SearchTracesByPageResponse searchTracesByPageWithOptions(SearchTracesByPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchTracesByPage", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SearchTracesByPageResponse());
    }

    public SearchTracesByPageResponse searchTracesByPage(SearchTracesByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTracesByPageWithOptions(request, runtime);
    }

    public SetRetcodeShareStatusResponse setRetcodeShareStatusWithOptions(SetRetcodeShareStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetRetcodeShareStatus", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SetRetcodeShareStatusResponse());
    }

    public SetRetcodeShareStatusResponse setRetcodeShareStatus(SetRetcodeShareStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setRetcodeShareStatusWithOptions(request, runtime);
    }

    public StartAlertResponse startAlertWithOptions(StartAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StartAlert", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new StartAlertResponse());
    }

    public StartAlertResponse startAlert(StartAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startAlertWithOptions(request, runtime);
    }

    public StopAlertResponse stopAlertWithOptions(StopAlertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopAlert", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new StopAlertResponse());
    }

    public StopAlertResponse stopAlert(StopAlertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopAlertWithOptions(request, runtime);
    }

    public TurnOnSecondSwitchResponse turnOnSecondSwitchWithOptions(TurnOnSecondSwitchRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", query)
        ));
        return TeaModel.toModel(this.doRPCRequest("TurnOnSecondSwitch", "2019-08-08", "HTTPS", "GET", "AK", "json", req, runtime), new TurnOnSecondSwitchResponse());
    }

    public TurnOnSecondSwitchResponse turnOnSecondSwitch(TurnOnSecondSwitchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.turnOnSecondSwitchWithOptions(request, runtime);
    }

    public UninstallPromClusterResponse uninstallPromClusterWithOptions(UninstallPromClusterRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UninstallPromCluster", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new UninstallPromClusterResponse());
    }

    public UninstallPromClusterResponse uninstallPromCluster(UninstallPromClusterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.uninstallPromClusterWithOptions(request, runtime);
    }

    public UpdateAlertContactResponse updateAlertContactWithOptions(UpdateAlertContactRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAlertContact", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAlertContactResponse());
    }

    public UpdateAlertContactResponse updateAlertContact(UpdateAlertContactRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAlertContactWithOptions(request, runtime);
    }

    public UpdateAlertContactGroupResponse updateAlertContactGroupWithOptions(UpdateAlertContactGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAlertContactGroup", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAlertContactGroupResponse());
    }

    public UpdateAlertContactGroupResponse updateAlertContactGroup(UpdateAlertContactGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAlertContactGroupWithOptions(request, runtime);
    }

    public UpdateAlertRuleResponse updateAlertRuleWithOptions(UpdateAlertRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAlertRule", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAlertRuleResponse());
    }

    public UpdateAlertRuleResponse updateAlertRule(UpdateAlertRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAlertRuleWithOptions(request, runtime);
    }

    public UpdateDispatchRuleResponse updateDispatchRuleWithOptions(UpdateDispatchRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDispatchRule", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDispatchRuleResponse());
    }

    public UpdateDispatchRuleResponse updateDispatchRule(UpdateDispatchRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDispatchRuleWithOptions(request, runtime);
    }

    public UpdatePrometheusAlertRuleResponse updatePrometheusAlertRuleWithOptions(UpdatePrometheusAlertRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdatePrometheusAlertRule", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new UpdatePrometheusAlertRuleResponse());
    }

    public UpdatePrometheusAlertRuleResponse updatePrometheusAlertRule(UpdatePrometheusAlertRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updatePrometheusAlertRuleWithOptions(request, runtime);
    }

    public UpdateWebhookResponse updateWebhookWithOptions(UpdateWebhookRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateWebhook", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateWebhookResponse());
    }

    public UpdateWebhookResponse updateWebhook(UpdateWebhookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateWebhookWithOptions(request, runtime);
    }
}
