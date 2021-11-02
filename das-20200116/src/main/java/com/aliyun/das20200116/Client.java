// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116;

import com.aliyun.tea.*;
import com.aliyun.das20200116.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-shanghai", "das.cn-shanghai.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("das", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AccessHDMInstanceResponse accessHDMInstanceWithOptions(AccessHDMInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AccessHDMInstance", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new AccessHDMInstanceResponse());
    }

    public AccessHDMInstanceResponse accessHDMInstance(AccessHDMInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.accessHDMInstanceWithOptions(request, runtime);
    }

    public AddHDMInstanceResponse addHDMInstanceWithOptions(AddHDMInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("AddHDMInstance", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new AddHDMInstanceResponse());
    }

    public AddHDMInstanceResponse addHDMInstance(AddHDMInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addHDMInstanceWithOptions(request, runtime);
    }

    public CreateAdamBenchTaskResponse createAdamBenchTaskWithOptions(CreateAdamBenchTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateAdamBenchTask", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAdamBenchTaskResponse());
    }

    public CreateAdamBenchTaskResponse createAdamBenchTask(CreateAdamBenchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAdamBenchTaskWithOptions(request, runtime);
    }

    public CreateCacheAnalysisJobResponse createCacheAnalysisJobWithOptions(CreateCacheAnalysisJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCacheAnalysisJob", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCacheAnalysisJobResponse());
    }

    public CreateCacheAnalysisJobResponse createCacheAnalysisJob(CreateCacheAnalysisJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCacheAnalysisJobWithOptions(request, runtime);
    }

    public CreateCloudBenchTasksResponse createCloudBenchTasksWithOptions(CreateCloudBenchTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateCloudBenchTasks", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateCloudBenchTasksResponse());
    }

    public CreateCloudBenchTasksResponse createCloudBenchTasks(CreateCloudBenchTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createCloudBenchTasksWithOptions(request, runtime);
    }

    public CreateDiagnosticReportResponse createDiagnosticReportWithOptions(CreateDiagnosticReportRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDiagnosticReport", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDiagnosticReportResponse());
    }

    public CreateDiagnosticReportResponse createDiagnosticReport(CreateDiagnosticReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDiagnosticReportWithOptions(request, runtime);
    }

    public DescribeCacheAnalysisJobResponse describeCacheAnalysisJobWithOptions(DescribeCacheAnalysisJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCacheAnalysisJob", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCacheAnalysisJobResponse());
    }

    public DescribeCacheAnalysisJobResponse describeCacheAnalysisJob(DescribeCacheAnalysisJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCacheAnalysisJobWithOptions(request, runtime);
    }

    public DescribeCacheAnalysisJobsResponse describeCacheAnalysisJobsWithOptions(DescribeCacheAnalysisJobsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCacheAnalysisJobs", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCacheAnalysisJobsResponse());
    }

    public DescribeCacheAnalysisJobsResponse describeCacheAnalysisJobs(DescribeCacheAnalysisJobsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCacheAnalysisJobsWithOptions(request, runtime);
    }

    public DescribeCloudBenchTasksResponse describeCloudBenchTasksWithOptions(DescribeCloudBenchTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCloudBenchTasks", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCloudBenchTasksResponse());
    }

    public DescribeCloudBenchTasksResponse describeCloudBenchTasks(DescribeCloudBenchTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCloudBenchTasksWithOptions(request, runtime);
    }

    public DescribeCloudbenchTaskResponse describeCloudbenchTaskWithOptions(DescribeCloudbenchTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCloudbenchTask", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCloudbenchTaskResponse());
    }

    public DescribeCloudbenchTaskResponse describeCloudbenchTask(DescribeCloudbenchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCloudbenchTaskWithOptions(request, runtime);
    }

    public DescribeCloudbenchTaskConfigResponse describeCloudbenchTaskConfigWithOptions(DescribeCloudbenchTaskConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeCloudbenchTaskConfig", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeCloudbenchTaskConfigResponse());
    }

    public DescribeCloudbenchTaskConfigResponse describeCloudbenchTaskConfig(DescribeCloudbenchTaskConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeCloudbenchTaskConfigWithOptions(request, runtime);
    }

    public DescribeDiagnosticReportListResponse describeDiagnosticReportListWithOptions(DescribeDiagnosticReportListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeDiagnosticReportList", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeDiagnosticReportListResponse());
    }

    public DescribeDiagnosticReportListResponse describeDiagnosticReportList(DescribeDiagnosticReportListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeDiagnosticReportListWithOptions(request, runtime);
    }

    public DescribeHotBigKeysResponse describeHotBigKeysWithOptions(DescribeHotBigKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHotBigKeys", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHotBigKeysResponse());
    }

    public DescribeHotBigKeysResponse describeHotBigKeys(DescribeHotBigKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHotBigKeysWithOptions(request, runtime);
    }

    public DescribeHotKeysResponse describeHotKeysWithOptions(DescribeHotKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeHotKeys", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeHotKeysResponse());
    }

    public DescribeHotKeysResponse describeHotKeys(DescribeHotKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeHotKeysWithOptions(request, runtime);
    }

    public DescribeTopBigKeysResponse describeTopBigKeysWithOptions(DescribeTopBigKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTopBigKeys", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTopBigKeysResponse());
    }

    public DescribeTopBigKeysResponse describeTopBigKeys(DescribeTopBigKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTopBigKeysWithOptions(request, runtime);
    }

    public DescribeTopHotKeysResponse describeTopHotKeysWithOptions(DescribeTopHotKeysRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DescribeTopHotKeys", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new DescribeTopHotKeysResponse());
    }

    public DescribeTopHotKeysResponse describeTopHotKeys(DescribeTopHotKeysRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.describeTopHotKeysWithOptions(request, runtime);
    }

    public DisableAllSqlConcurrencyControlRulesResponse disableAllSqlConcurrencyControlRulesWithOptions(DisableAllSqlConcurrencyControlRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableAllSqlConcurrencyControlRules", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new DisableAllSqlConcurrencyControlRulesResponse());
    }

    public DisableAllSqlConcurrencyControlRulesResponse disableAllSqlConcurrencyControlRules(DisableAllSqlConcurrencyControlRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableAllSqlConcurrencyControlRulesWithOptions(request, runtime);
    }

    public DisableSqlConcurrencyControlResponse disableSqlConcurrencyControlWithOptions(DisableSqlConcurrencyControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableSqlConcurrencyControl", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new DisableSqlConcurrencyControlResponse());
    }

    public DisableSqlConcurrencyControlResponse disableSqlConcurrencyControl(DisableSqlConcurrencyControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableSqlConcurrencyControlWithOptions(request, runtime);
    }

    public EnableSqlConcurrencyControlResponse enableSqlConcurrencyControlWithOptions(EnableSqlConcurrencyControlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableSqlConcurrencyControl", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new EnableSqlConcurrencyControlResponse());
    }

    public EnableSqlConcurrencyControlResponse enableSqlConcurrencyControl(EnableSqlConcurrencyControlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSqlConcurrencyControlWithOptions(request, runtime);
    }

    public GetAutoResourceOptimizeConfigResponse getAutoResourceOptimizeConfigWithOptions(GetAutoResourceOptimizeConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAutoResourceOptimizeConfig", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetAutoResourceOptimizeConfigResponse());
    }

    public GetAutoResourceOptimizeConfigResponse getAutoResourceOptimizeConfig(GetAutoResourceOptimizeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutoResourceOptimizeConfigWithOptions(request, runtime);
    }

    public GetAutonomousNotifyEventContentResponse getAutonomousNotifyEventContentWithOptions(GetAutonomousNotifyEventContentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAutonomousNotifyEventContent", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetAutonomousNotifyEventContentResponse());
    }

    public GetAutonomousNotifyEventContentResponse getAutonomousNotifyEventContent(GetAutonomousNotifyEventContentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutonomousNotifyEventContentWithOptions(request, runtime);
    }

    public GetAutonomousNotifyEventDetailResponse getAutonomousNotifyEventDetailWithOptions(GetAutonomousNotifyEventDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAutonomousNotifyEventDetail", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetAutonomousNotifyEventDetailResponse());
    }

    public GetAutonomousNotifyEventDetailResponse getAutonomousNotifyEventDetail(GetAutonomousNotifyEventDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutonomousNotifyEventDetailWithOptions(request, runtime);
    }

    public GetAutonomousNotifyEventsResponse getAutonomousNotifyEventsWithOptions(GetAutonomousNotifyEventsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAutonomousNotifyEvents", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetAutonomousNotifyEventsResponse());
    }

    public GetAutonomousNotifyEventsResponse getAutonomousNotifyEvents(GetAutonomousNotifyEventsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutonomousNotifyEventsWithOptions(request, runtime);
    }

    public GetAutonomousNotifyEventsInRangeResponse getAutonomousNotifyEventsInRangeWithOptions(GetAutonomousNotifyEventsInRangeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetAutonomousNotifyEventsInRange", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetAutonomousNotifyEventsInRangeResponse());
    }

    public GetAutonomousNotifyEventsInRangeResponse getAutonomousNotifyEventsInRange(GetAutonomousNotifyEventsInRangeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAutonomousNotifyEventsInRangeWithOptions(request, runtime);
    }

    public GetEndpointSwitchTaskResponse getEndpointSwitchTaskWithOptions(GetEndpointSwitchTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEndpointSwitchTask", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetEndpointSwitchTaskResponse());
    }

    public GetEndpointSwitchTaskResponse getEndpointSwitchTask(GetEndpointSwitchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEndpointSwitchTaskWithOptions(request, runtime);
    }

    public GetEventOverviewResponse getEventOverviewWithOptions(GetEventOverviewRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetEventOverview", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetEventOverviewResponse());
    }

    public GetEventOverviewResponse getEventOverview(GetEventOverviewRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEventOverviewWithOptions(request, runtime);
    }

    public GetHDMAliyunResourceSyncResultResponse getHDMAliyunResourceSyncResultWithOptions(GetHDMAliyunResourceSyncResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHDMAliyunResourceSyncResult", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetHDMAliyunResourceSyncResultResponse());
    }

    public GetHDMAliyunResourceSyncResultResponse getHDMAliyunResourceSyncResult(GetHDMAliyunResourceSyncResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHDMAliyunResourceSyncResultWithOptions(request, runtime);
    }

    public GetHDMLastAliyunResourceSyncResultResponse getHDMLastAliyunResourceSyncResultWithOptions(GetHDMLastAliyunResourceSyncResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetHDMLastAliyunResourceSyncResult", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetHDMLastAliyunResourceSyncResultResponse());
    }

    public GetHDMLastAliyunResourceSyncResultResponse getHDMLastAliyunResourceSyncResult(GetHDMLastAliyunResourceSyncResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getHDMLastAliyunResourceSyncResultWithOptions(request, runtime);
    }

    public GetInstanceInspectionsResponse getInstanceInspectionsWithOptions(GetInstanceInspectionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstanceInspections", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceInspectionsResponse());
    }

    public GetInstanceInspectionsResponse getInstanceInspections(GetInstanceInspectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceInspectionsWithOptions(request, runtime);
    }

    public GetRequestDiagnosisIdResponse getRequestDiagnosisIdWithOptions(GetRequestDiagnosisIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRequestDiagnosisId", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetRequestDiagnosisIdResponse());
    }

    public GetRequestDiagnosisIdResponse getRequestDiagnosisId(GetRequestDiagnosisIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRequestDiagnosisIdWithOptions(request, runtime);
    }

    public GetRequestDiagnosisPageResponse getRequestDiagnosisPageWithOptions(GetRequestDiagnosisPageRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRequestDiagnosisPage", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetRequestDiagnosisPageResponse());
    }

    public GetRequestDiagnosisPageResponse getRequestDiagnosisPage(GetRequestDiagnosisPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRequestDiagnosisPageWithOptions(request, runtime);
    }

    public GetRequestDiagnosisResultResponse getRequestDiagnosisResultWithOptions(GetRequestDiagnosisResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRequestDiagnosisResult", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetRequestDiagnosisResultResponse());
    }

    public GetRequestDiagnosisResultResponse getRequestDiagnosisResult(GetRequestDiagnosisResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRequestDiagnosisResultWithOptions(request, runtime);
    }

    public GetResourceOptimizeHistoryListResponse getResourceOptimizeHistoryListWithOptions(GetResourceOptimizeHistoryListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetResourceOptimizeHistoryList", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetResourceOptimizeHistoryListResponse());
    }

    public GetResourceOptimizeHistoryListResponse getResourceOptimizeHistoryList(GetResourceOptimizeHistoryListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getResourceOptimizeHistoryListWithOptions(request, runtime);
    }

    public GetRunningSqlConcurrencyControlRulesResponse getRunningSqlConcurrencyControlRulesWithOptions(GetRunningSqlConcurrencyControlRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRunningSqlConcurrencyControlRules", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetRunningSqlConcurrencyControlRulesResponse());
    }

    public GetRunningSqlConcurrencyControlRulesResponse getRunningSqlConcurrencyControlRules(GetRunningSqlConcurrencyControlRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRunningSqlConcurrencyControlRulesWithOptions(request, runtime);
    }

    public GetSqlConcurrencyControlRulesHistoryResponse getSqlConcurrencyControlRulesHistoryWithOptions(GetSqlConcurrencyControlRulesHistoryRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSqlConcurrencyControlRulesHistory", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetSqlConcurrencyControlRulesHistoryResponse());
    }

    public GetSqlConcurrencyControlRulesHistoryResponse getSqlConcurrencyControlRulesHistory(GetSqlConcurrencyControlRulesHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSqlConcurrencyControlRulesHistoryWithOptions(request, runtime);
    }

    public GetSqlOptimizeAdviceResponse getSqlOptimizeAdviceWithOptions(GetSqlOptimizeAdviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSqlOptimizeAdvice", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new GetSqlOptimizeAdviceResponse());
    }

    public GetSqlOptimizeAdviceResponse getSqlOptimizeAdvice(GetSqlOptimizeAdviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSqlOptimizeAdviceWithOptions(request, runtime);
    }

    public RunCloudBenchTaskResponse runCloudBenchTaskWithOptions(RunCloudBenchTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RunCloudBenchTask", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new RunCloudBenchTaskResponse());
    }

    public RunCloudBenchTaskResponse runCloudBenchTask(RunCloudBenchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.runCloudBenchTaskWithOptions(request, runtime);
    }

    public StopCloudBenchTaskResponse stopCloudBenchTaskWithOptions(StopCloudBenchTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopCloudBenchTask", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new StopCloudBenchTaskResponse());
    }

    public StopCloudBenchTaskResponse stopCloudBenchTask(StopCloudBenchTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopCloudBenchTaskWithOptions(request, runtime);
    }

    public StopOrRollbackOptimizeTaskResponse stopOrRollbackOptimizeTaskWithOptions(StopOrRollbackOptimizeTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("StopOrRollbackOptimizeTask", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new StopOrRollbackOptimizeTaskResponse());
    }

    public StopOrRollbackOptimizeTaskResponse stopOrRollbackOptimizeTask(StopOrRollbackOptimizeTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopOrRollbackOptimizeTaskWithOptions(request, runtime);
    }

    public SyncHDMAliyunResourceResponse syncHDMAliyunResourceWithOptions(SyncHDMAliyunResourceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncHDMAliyunResource", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new SyncHDMAliyunResourceResponse());
    }

    public SyncHDMAliyunResourceResponse syncHDMAliyunResource(SyncHDMAliyunResourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncHDMAliyunResourceWithOptions(request, runtime);
    }

    public TurnOffAutoResourceOptimizeResponse turnOffAutoResourceOptimizeWithOptions(TurnOffAutoResourceOptimizeRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("TurnOffAutoResourceOptimize", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new TurnOffAutoResourceOptimizeResponse());
    }

    public TurnOffAutoResourceOptimizeResponse turnOffAutoResourceOptimize(TurnOffAutoResourceOptimizeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.turnOffAutoResourceOptimizeWithOptions(request, runtime);
    }

    public UpdateAutoResourceOptimizeConfigResponse updateAutoResourceOptimizeConfigWithOptions(UpdateAutoResourceOptimizeConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateAutoResourceOptimizeConfig", "2020-01-16", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAutoResourceOptimizeConfigResponse());
    }

    public UpdateAutoResourceOptimizeConfigResponse updateAutoResourceOptimizeConfig(UpdateAutoResourceOptimizeConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAutoResourceOptimizeConfigWithOptions(request, runtime);
    }
}
