// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808;

import com.aliyun.tea.*;
import com.aliyun.arms20190808.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
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


    public GetMultipleTraceResponse getMultipleTraceWithOptions(GetMultipleTraceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetMultipleTrace", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new GetMultipleTraceResponse());
    }

    public GetMultipleTraceResponse getMultipleTrace(GetMultipleTraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMultipleTraceWithOptions(request, runtime);
    }

    public SearchTracesByPageResponse searchTracesByPageWithOptions(SearchTracesByPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchTracesByPage", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new SearchTracesByPageResponse());
    }

    public SearchTracesByPageResponse searchTracesByPage(SearchTracesByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchTracesByPageWithOptions(request, runtime);
    }

    public GetStackResponse getStackWithOptions(GetStackRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStack", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new GetStackResponse());
    }

    public GetStackResponse getStack(GetStackRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStackWithOptions(request, runtime);
    }

    public DescribeTraceLocationResponse describeTraceLocationWithOptions(DescribeTraceLocationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTraceLocation", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTraceLocationResponse());
    }

    public DescribeTraceLocationResponse describeTraceLocation(DescribeTraceLocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTraceLocationWithOptions(request, runtime);
    }

    public DeleteTraceAppResponse deleteTraceAppWithOptions(DeleteTraceAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteTraceApp", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DeleteTraceAppResponse());
    }

    public DeleteTraceAppResponse deleteTraceApp(DeleteTraceAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTraceAppWithOptions(request, runtime);
    }

    public DescribeTraceLicenseKeyResponse describeTraceLicenseKeyWithOptions(DescribeTraceLicenseKeyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTraceLicenseKey", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTraceLicenseKeyResponse());
    }

    public DescribeTraceLicenseKeyResponse describeTraceLicenseKey(DescribeTraceLicenseKeyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTraceLicenseKeyWithOptions(request, runtime);
    }

    public CheckServiceLinkedRoleForDeletingResponse checkServiceLinkedRoleForDeletingWithOptions(CheckServiceLinkedRoleForDeletingRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckServiceLinkedRoleForDeleting", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new CheckServiceLinkedRoleForDeletingResponse());
    }

    public CheckServiceLinkedRoleForDeletingResponse checkServiceLinkedRoleForDeleting(CheckServiceLinkedRoleForDeletingRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkServiceLinkedRoleForDeletingWithOptions(request, runtime);
    }

    public ListDashboardsResponse listDashboardsWithOptions(ListDashboardsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDashboards", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new ListDashboardsResponse());
    }

    public ListDashboardsResponse listDashboards(ListDashboardsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDashboardsWithOptions(request, runtime);
    }

    public GetConsistencySnapshotResponse getConsistencySnapshotWithOptions(GetConsistencySnapshotRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetConsistencySnapshot", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new GetConsistencySnapshotResponse());
    }

    public GetConsistencySnapshotResponse getConsistencySnapshot(GetConsistencySnapshotRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getConsistencySnapshotWithOptions(request, runtime);
    }

    public CheckDataConsistencyResponse checkDataConsistencyWithOptions(CheckDataConsistencyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckDataConsistency", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new CheckDataConsistencyResponse());
    }

    public CheckDataConsistencyResponse checkDataConsistency(CheckDataConsistencyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDataConsistencyWithOptions(request, runtime);
    }

    public AddGrafanaResponse addGrafanaWithOptions(AddGrafanaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddGrafana", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new AddGrafanaResponse());
    }

    public AddGrafanaResponse addGrafana(AddGrafanaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addGrafanaWithOptions(request, runtime);
    }

    public AddIntegrationResponse addIntegrationWithOptions(AddIntegrationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddIntegration", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new AddIntegrationResponse());
    }

    public AddIntegrationResponse addIntegration(AddIntegrationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addIntegrationWithOptions(request, runtime);
    }

    public GetTraceResponse getTraceWithOptions(GetTraceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTrace", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new GetTraceResponse());
    }

    public GetTraceResponse getTrace(GetTraceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTraceWithOptions(request, runtime);
    }

    public ListClusterFromGrafanaResponse listClusterFromGrafanaWithOptions(ListClusterFromGrafanaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListClusterFromGrafana", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new ListClusterFromGrafanaResponse());
    }

    public ListClusterFromGrafanaResponse listClusterFromGrafana(ListClusterFromGrafanaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClusterFromGrafanaWithOptions(request, runtime);
    }

    public SearchTracesResponse searchTracesWithOptions(SearchTracesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchTraces", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new SearchTracesResponse());
    }

    public SearchTracesResponse searchTraces(SearchTracesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchTracesWithOptions(request, runtime);
    }

    public GetPrometheusApiTokenResponse getPrometheusApiTokenWithOptions(GetPrometheusApiTokenRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPrometheusApiToken", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new GetPrometheusApiTokenResponse());
    }

    public GetPrometheusApiTokenResponse getPrometheusApiToken(GetPrometheusApiTokenRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPrometheusApiTokenWithOptions(request, runtime);
    }

    public SetRetcodeShareStatusResponse setRetcodeShareStatusWithOptions(SetRetcodeShareStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetRetcodeShareStatus", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new SetRetcodeShareStatusResponse());
    }

    public SetRetcodeShareStatusResponse setRetcodeShareStatus(SetRetcodeShareStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setRetcodeShareStatusWithOptions(request, runtime);
    }

    public GetRetcodeShareUrlResponse getRetcodeShareUrlWithOptions(GetRetcodeShareUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetRetcodeShareUrl", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new GetRetcodeShareUrlResponse());
    }

    public GetRetcodeShareUrlResponse getRetcodeShareUrl(GetRetcodeShareUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRetcodeShareUrlWithOptions(request, runtime);
    }

    public ListPromClustersResponse listPromClustersWithOptions(ListPromClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListPromClusters", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new ListPromClustersResponse());
    }

    public ListPromClustersResponse listPromClusters(ListPromClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listPromClustersWithOptions(request, runtime);
    }

    public UpdateAlertRuleResponse updateAlertRuleWithOptions(UpdateAlertRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAlertRule", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new UpdateAlertRuleResponse());
    }

    public UpdateAlertRuleResponse updateAlertRule(UpdateAlertRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAlertRuleWithOptions(request, runtime);
    }

    public StartAlertResponse startAlertWithOptions(StartAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartAlert", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new StartAlertResponse());
    }

    public StartAlertResponse startAlert(StartAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startAlertWithOptions(request, runtime);
    }

    public StopAlertResponse stopAlertWithOptions(StopAlertRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopAlert", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new StopAlertResponse());
    }

    public StopAlertResponse stopAlert(StopAlertRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopAlertWithOptions(request, runtime);
    }

    public SearchEventsResponse searchEventsWithOptions(SearchEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchEvents", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new SearchEventsResponse());
    }

    public SearchEventsResponse searchEvents(SearchEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchEventsWithOptions(request, runtime);
    }

    public SearchAlertHistoriesResponse searchAlertHistoriesWithOptions(SearchAlertHistoriesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchAlertHistories", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new SearchAlertHistoriesResponse());
    }

    public SearchAlertHistoriesResponse searchAlertHistories(SearchAlertHistoriesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchAlertHistoriesWithOptions(request, runtime);
    }

    public UpdateAlertContactResponse updateAlertContactWithOptions(UpdateAlertContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAlertContact", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new UpdateAlertContactResponse());
    }

    public UpdateAlertContactResponse updateAlertContact(UpdateAlertContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAlertContactWithOptions(request, runtime);
    }

    public DeleteAlertContactGroupResponse deleteAlertContactGroupWithOptions(DeleteAlertContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAlertContactGroup", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAlertContactGroupResponse());
    }

    public DeleteAlertContactGroupResponse deleteAlertContactGroup(DeleteAlertContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAlertContactGroupWithOptions(request, runtime);
    }

    public DeleteAlertContactResponse deleteAlertContactWithOptions(DeleteAlertContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAlertContact", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAlertContactResponse());
    }

    public DeleteAlertContactResponse deleteAlertContact(DeleteAlertContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAlertContactWithOptions(request, runtime);
    }

    public UpdateAlertContactGroupResponse updateAlertContactGroupWithOptions(UpdateAlertContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateAlertContactGroup", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new UpdateAlertContactGroupResponse());
    }

    public UpdateAlertContactGroupResponse updateAlertContactGroup(UpdateAlertContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAlertContactGroupWithOptions(request, runtime);
    }

    public ImportCustomAlertRulesResponse importCustomAlertRulesWithOptions(ImportCustomAlertRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ImportCustomAlertRules", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new ImportCustomAlertRulesResponse());
    }

    public ImportCustomAlertRulesResponse importCustomAlertRules(ImportCustomAlertRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importCustomAlertRulesWithOptions(request, runtime);
    }

    public SearchAlertRulesResponse searchAlertRulesWithOptions(SearchAlertRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchAlertRules", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new SearchAlertRulesResponse());
    }

    public SearchAlertRulesResponse searchAlertRules(SearchAlertRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchAlertRulesWithOptions(request, runtime);
    }

    public DeleteAlertRulesResponse deleteAlertRulesWithOptions(DeleteAlertRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteAlertRules", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAlertRulesResponse());
    }

    public DeleteAlertRulesResponse deleteAlertRules(DeleteAlertRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAlertRulesWithOptions(request, runtime);
    }

    public CreateRetcodeAppResponse createRetcodeAppWithOptions(CreateRetcodeAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRetcodeApp", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new CreateRetcodeAppResponse());
    }

    public CreateRetcodeAppResponse createRetcodeApp(CreateRetcodeAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRetcodeAppWithOptions(request, runtime);
    }

    public DeleteRetcodeAppResponse deleteRetcodeAppWithOptions(DeleteRetcodeAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRetcodeApp", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRetcodeAppResponse());
    }

    public DeleteRetcodeAppResponse deleteRetcodeApp(DeleteRetcodeAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRetcodeAppWithOptions(request, runtime);
    }

    public QueryDatasetResponse queryDatasetWithOptions(QueryDatasetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDataset", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new QueryDatasetResponse());
    }

    public QueryDatasetResponse queryDataset(QueryDatasetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDatasetWithOptions(request, runtime);
    }

    public QueryMetricResponse queryMetricWithOptions(QueryMetricRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryMetric", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new QueryMetricResponse());
    }

    public QueryMetricResponse queryMetric(QueryMetricRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryMetricWithOptions(request, runtime);
    }

    public CreateAlertContactResponse createAlertContactWithOptions(CreateAlertContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAlertContact", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new CreateAlertContactResponse());
    }

    public CreateAlertContactResponse createAlertContact(CreateAlertContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAlertContactWithOptions(request, runtime);
    }

    public CreateAlertContactGroupResponse createAlertContactGroupWithOptions(CreateAlertContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateAlertContactGroup", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new CreateAlertContactGroupResponse());
    }

    public CreateAlertContactGroupResponse createAlertContactGroup(CreateAlertContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAlertContactGroupWithOptions(request, runtime);
    }

    public SearchAlertContactResponse searchAlertContactWithOptions(SearchAlertContactRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchAlertContact", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new SearchAlertContactResponse());
    }

    public SearchAlertContactResponse searchAlertContact(SearchAlertContactRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchAlertContactWithOptions(request, runtime);
    }

    public SearchAlertContactGroupResponse searchAlertContactGroupWithOptions(SearchAlertContactGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchAlertContactGroup", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new SearchAlertContactGroupResponse());
    }

    public SearchAlertContactGroupResponse searchAlertContactGroup(SearchAlertContactGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchAlertContactGroupWithOptions(request, runtime);
    }

    public ImportAppAlertRulesResponse importAppAlertRulesWithOptions(ImportAppAlertRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ImportAppAlertRules", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new ImportAppAlertRulesResponse());
    }

    public ImportAppAlertRulesResponse importAppAlertRules(ImportAppAlertRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.importAppAlertRulesWithOptions(request, runtime);
    }

    public SearchRetcodeAppByPageResponse searchRetcodeAppByPageWithOptions(SearchRetcodeAppByPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchRetcodeAppByPage", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new SearchRetcodeAppByPageResponse());
    }

    public SearchRetcodeAppByPageResponse searchRetcodeAppByPage(SearchRetcodeAppByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchRetcodeAppByPageWithOptions(request, runtime);
    }

    public SearchTraceAppByNameResponse searchTraceAppByNameWithOptions(SearchTraceAppByNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchTraceAppByName", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new SearchTraceAppByNameResponse());
    }

    public SearchTraceAppByNameResponse searchTraceAppByName(SearchTraceAppByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchTraceAppByNameWithOptions(request, runtime);
    }

    public SearchTraceAppByPageResponse searchTraceAppByPageWithOptions(SearchTraceAppByPageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SearchTraceAppByPage", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new SearchTraceAppByPageResponse());
    }

    public SearchTraceAppByPageResponse searchTraceAppByPage(SearchTraceAppByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchTraceAppByPageWithOptions(request, runtime);
    }

    public ListRetcodeAppsResponse listRetcodeAppsWithOptions(ListRetcodeAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListRetcodeApps", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new ListRetcodeAppsResponse());
    }

    public ListRetcodeAppsResponse listRetcodeApps(ListRetcodeAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRetcodeAppsWithOptions(request, runtime);
    }

    public ListTraceAppsResponse listTraceAppsWithOptions(ListTraceAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTraceApps", "HTTPS", "POST", "2019-08-08", "AK", null, TeaModel.buildMap(request), runtime), new ListTraceAppsResponse());
    }

    public ListTraceAppsResponse listTraceApps(ListTraceAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTraceAppsWithOptions(request, runtime);
    }

    public String getEndpoint(String productId, String regionId, String endpointRule, String network, String suffix, java.util.Map<String, String> endpointMap, String endpoint) throws Exception {
        if (!com.aliyun.teautil.Common.empty(endpoint)) {
            return endpoint;
        }

        if (!com.aliyun.teautil.Common.isUnset(endpointMap) && !com.aliyun.teautil.Common.empty(endpointMap.get("regionId"))) {
            return endpointMap.get("regionId");
        }

        return com.aliyun.endpointutil.Client.getEndpointRules(productId, regionId, endpointRule, network, suffix);
    }
}
