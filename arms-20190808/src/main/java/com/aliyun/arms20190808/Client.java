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
            new TeaPair("ap-northeast-1", "arms.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "arms.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "arms.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "arms.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "arms.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-chengdu", "arms.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "arms.aliyuncs.com"),
            new TeaPair("eu-central-1", "arms.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "arms.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "arms.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-east-1", "arms.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "arms.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "arms.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "arms.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "arms.aliyuncs.com")
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

    public CheckDataConsistencyResponse checkDataConsistencyWithOptions(CheckDataConsistencyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckDataConsistency", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new CheckDataConsistencyResponse());
    }

    public CheckDataConsistencyResponse checkDataConsistency(CheckDataConsistencyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkDataConsistencyWithOptions(request, runtime);
    }

    public CheckServiceLinkedRoleForDeletingResponse checkServiceLinkedRoleForDeletingWithOptions(CheckServiceLinkedRoleForDeletingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckServiceLinkedRoleForDeleting", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new CheckServiceLinkedRoleForDeletingResponse());
    }

    public CheckServiceLinkedRoleForDeletingResponse checkServiceLinkedRoleForDeleting(CheckServiceLinkedRoleForDeletingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkServiceLinkedRoleForDeletingWithOptions(request, runtime);
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

    public CreateWehookResponse createWehookWithOptions(CreateWehookRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateWehook", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new CreateWehookResponse());
    }

    public CreateWehookResponse createWehook(CreateWehookRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createWehookWithOptions(request, runtime);
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

    public DescribeTraceLocationResponse describeTraceLocationWithOptions(DescribeTraceLocationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTraceLocation", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTraceLocationResponse());
    }

    public DescribeTraceLocationResponse describeTraceLocation(DescribeTraceLocationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTraceLocationWithOptions(request, runtime);
    }

    public ExportPrometheusRulesResponse exportPrometheusRulesWithOptions(ExportPrometheusRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExportPrometheusRules", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ExportPrometheusRulesResponse());
    }

    public ExportPrometheusRulesResponse exportPrometheusRules(ExportPrometheusRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exportPrometheusRulesWithOptions(request, runtime);
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

    public GetConsistencySnapshotResponse getConsistencySnapshotWithOptions(GetConsistencySnapshotRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetConsistencySnapshot", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetConsistencySnapshotResponse());
    }

    public GetConsistencySnapshotResponse getConsistencySnapshot(GetConsistencySnapshotRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getConsistencySnapshotWithOptions(request, runtime);
    }

    public GetIntegrationTokenResponse getIntegrationTokenWithOptions(GetIntegrationTokenRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetIntegrationToken", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new GetIntegrationTokenResponse());
    }

    public GetIntegrationTokenResponse getIntegrationToken(GetIntegrationTokenRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getIntegrationTokenWithOptions(request, runtime);
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

    public ImportCustomAlertRulesResponse importCustomAlertRulesWithOptions(ImportCustomAlertRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportCustomAlertRules", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ImportCustomAlertRulesResponse());
    }

    public ImportCustomAlertRulesResponse importCustomAlertRules(ImportCustomAlertRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importCustomAlertRulesWithOptions(request, runtime);
    }

    public ImportPrometheusRulesResponse importPrometheusRulesWithOptions(ImportPrometheusRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ImportPrometheusRules", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ImportPrometheusRulesResponse());
    }

    public ImportPrometheusRulesResponse importPrometheusRules(ImportPrometheusRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importPrometheusRulesWithOptions(request, runtime);
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

    public ListPromClustersResponse listPromClustersWithOptions(ListPromClustersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListPromClusters", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new ListPromClustersResponse());
    }

    public ListPromClustersResponse listPromClusters(ListPromClustersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listPromClustersWithOptions(request, runtime);
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

    public QueryMetricResponse queryMetricWithOptions(QueryMetricRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("QueryMetric", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new QueryMetricResponse());
    }

    public QueryMetricResponse queryMetric(QueryMetricRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryMetricWithOptions(request, runtime);
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

    public SendCustomIncidentsResponse sendCustomIncidentsWithOptions(SendCustomIncidentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendCustomIncidents", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SendCustomIncidentsResponse());
    }

    public SendCustomIncidentsResponse sendCustomIncidents(SendCustomIncidentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendCustomIncidentsWithOptions(request, runtime);
    }

    public SendMseIncidentResponse sendMseIncidentWithOptions(SendMseIncidentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SendMseIncident", "2019-08-08", "HTTPS", "POST", "AK", "json", req, runtime), new SendMseIncidentResponse());
    }

    public SendMseIncidentResponse sendMseIncident(SendMseIncidentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.sendMseIncidentWithOptions(request, runtime);
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
