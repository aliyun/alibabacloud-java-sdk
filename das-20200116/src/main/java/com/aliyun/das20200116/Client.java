// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116;

import com.aliyun.tea.*;
import com.aliyun.das20200116.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "das.cn-shanghai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("das", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public GetEventOverviewResponse getEventOverviewWithOptions(GetEventOverviewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetEventOverview", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new GetEventOverviewResponse());
    }

    public GetEventOverviewResponse getEventOverview(GetEventOverviewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEventOverviewWithOptions(request, runtime);
    }

    public DescribeHotKeysResponse describeHotKeysWithOptions(DescribeHotKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeHotKeys", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new DescribeHotKeysResponse());
    }

    public DescribeHotKeysResponse describeHotKeys(DescribeHotKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHotKeysWithOptions(request, runtime);
    }

    public GetAutonomousNotifyEventDetailResponse getAutonomousNotifyEventDetailWithOptions(GetAutonomousNotifyEventDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAutonomousNotifyEventDetail", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new GetAutonomousNotifyEventDetailResponse());
    }

    public GetAutonomousNotifyEventDetailResponse getAutonomousNotifyEventDetail(GetAutonomousNotifyEventDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutonomousNotifyEventDetailWithOptions(request, runtime);
    }

    public GetAutonomousNotifyEventsResponse getAutonomousNotifyEventsWithOptions(GetAutonomousNotifyEventsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetAutonomousNotifyEvents", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new GetAutonomousNotifyEventsResponse());
    }

    public GetAutonomousNotifyEventsResponse getAutonomousNotifyEvents(GetAutonomousNotifyEventsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAutonomousNotifyEventsWithOptions(request, runtime);
    }

    public CreateCacheAnalysisJobResponse createCacheAnalysisJobWithOptions(CreateCacheAnalysisJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateCacheAnalysisJob", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new CreateCacheAnalysisJobResponse());
    }

    public CreateCacheAnalysisJobResponse createCacheAnalysisJob(CreateCacheAnalysisJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCacheAnalysisJobWithOptions(request, runtime);
    }

    public DescribeCacheAnalysisJobsResponse describeCacheAnalysisJobsWithOptions(DescribeCacheAnalysisJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCacheAnalysisJobs", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCacheAnalysisJobsResponse());
    }

    public DescribeCacheAnalysisJobsResponse describeCacheAnalysisJobs(DescribeCacheAnalysisJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCacheAnalysisJobsWithOptions(request, runtime);
    }

    public DescribeCacheAnalysisJobResponse describeCacheAnalysisJobWithOptions(DescribeCacheAnalysisJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeCacheAnalysisJob", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCacheAnalysisJobResponse());
    }

    public DescribeCacheAnalysisJobResponse describeCacheAnalysisJob(DescribeCacheAnalysisJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCacheAnalysisJobWithOptions(request, runtime);
    }

    public DescribeDiagnosticReportListResponse describeDiagnosticReportListWithOptions(DescribeDiagnosticReportListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDiagnosticReportList", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDiagnosticReportListResponse());
    }

    public DescribeDiagnosticReportListResponse describeDiagnosticReportList(DescribeDiagnosticReportListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosticReportListWithOptions(request, runtime);
    }

    public CreateDiagnosticReportResponse createDiagnosticReportWithOptions(CreateDiagnosticReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDiagnosticReport", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new CreateDiagnosticReportResponse());
    }

    public CreateDiagnosticReportResponse createDiagnosticReport(CreateDiagnosticReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDiagnosticReportWithOptions(request, runtime);
    }

    public AccessHDMInstanceResponse accessHDMInstanceWithOptions(AccessHDMInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AccessHDMInstance", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new AccessHDMInstanceResponse());
    }

    public AccessHDMInstanceResponse accessHDMInstance(AccessHDMInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.accessHDMInstanceWithOptions(request, runtime);
    }

    public SyncHDMAliyunResourceResponse syncHDMAliyunResourceWithOptions(SyncHDMAliyunResourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SyncHDMAliyunResource", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new SyncHDMAliyunResourceResponse());
    }

    public SyncHDMAliyunResourceResponse syncHDMAliyunResource(SyncHDMAliyunResourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncHDMAliyunResourceWithOptions(request, runtime);
    }

    public GetHDMLastAliyunResourceSyncResultResponse getHDMLastAliyunResourceSyncResultWithOptions(GetHDMLastAliyunResourceSyncResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetHDMLastAliyunResourceSyncResult", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new GetHDMLastAliyunResourceSyncResultResponse());
    }

    public GetHDMLastAliyunResourceSyncResultResponse getHDMLastAliyunResourceSyncResult(GetHDMLastAliyunResourceSyncResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHDMLastAliyunResourceSyncResultWithOptions(request, runtime);
    }

    public GetEndpointSwitchTaskResponse getEndpointSwitchTaskWithOptions(GetEndpointSwitchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetEndpointSwitchTask", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new GetEndpointSwitchTaskResponse());
    }

    public GetEndpointSwitchTaskResponse getEndpointSwitchTask(GetEndpointSwitchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getEndpointSwitchTaskWithOptions(request, runtime);
    }

    public GetHDMAliyunResourceSyncResultResponse getHDMAliyunResourceSyncResultWithOptions(GetHDMAliyunResourceSyncResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetHDMAliyunResourceSyncResult", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new GetHDMAliyunResourceSyncResultResponse());
    }

    public GetHDMAliyunResourceSyncResultResponse getHDMAliyunResourceSyncResult(GetHDMAliyunResourceSyncResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getHDMAliyunResourceSyncResultWithOptions(request, runtime);
    }

    public AddHDMInstanceResponse addHDMInstanceWithOptions(AddHDMInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AddHDMInstance", "HTTPS", "POST", "2020-01-16", "AK", null, TeaModel.buildMap(request), runtime), new AddHDMInstanceResponse());
    }

    public AddHDMInstanceResponse addHDMInstance(AddHDMInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addHDMInstanceWithOptions(request, runtime);
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
}
