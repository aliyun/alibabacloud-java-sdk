// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airec20181012;

import com.aliyun.tea.*;
import com.aliyun.airec20181012.models.*;
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
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("airec", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public AttachDatasetResponse attachDataset(String InstanceId, String VersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.attachDatasetWithOptions(InstanceId, VersionId, headers, runtime);
    }

    public AttachDatasetResponse attachDatasetWithOptions(String InstanceId, String VersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("AttachDataset", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/dataSets/{VersionId}/actions/current", "json", req, runtime), new AttachDatasetResponse());
    }

    public CreateDiversifyResponse createDiversify(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDiversifyWithOptions(InstanceId, headers, runtime);
    }

    public CreateDiversifyResponse createDiversifyWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateDiversify", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/diversifies", "json", req, runtime), new CreateDiversifyResponse());
    }

    public CreateInstanceResponse createInstance() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createInstanceWithOptions(headers, runtime);
    }

    public CreateInstanceResponse createInstanceWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateInstance", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances", "json", req, runtime), new CreateInstanceResponse());
    }

    public CreateMixResponse createMix(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMixWithOptions(InstanceId, headers, runtime);
    }

    public CreateMixResponse createMixWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateMix", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/mixes", "json", req, runtime), new CreateMixResponse());
    }

    public CreateRuleResponse createRule(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRuleWithOptions(InstanceId, headers, runtime);
    }

    public CreateRuleResponse createRuleWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("CreateRule", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/rules", "json", req, runtime), new CreateRuleResponse());
    }

    public CreateSceneResponse createScene(String InstanceId, CreateSceneRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSceneWithOptions(InstanceId, request, headers, runtime);
    }

    public CreateSceneResponse createSceneWithOptions(String InstanceId, CreateSceneRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            query.put("DryRun", request.dryRun);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("CreateScene", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/scenes", "json", req, runtime), new CreateSceneResponse());
    }

    public DeleteDataSetResponse deleteDataSet(String InstanceId, String VersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataSetWithOptions(InstanceId, VersionId, headers, runtime);
    }

    public DeleteDataSetResponse deleteDataSetWithOptions(String InstanceId, String VersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteDataSet", "2018-10-12", "HTTPS", "DELETE", "AK", "/openapi/instances/" + InstanceId + "/dataSets/{VersionId}", "json", req, runtime), new DeleteDataSetResponse());
    }

    public DeleteDiversifyResponse deleteDiversify(String InstanceId, String Name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDiversifyWithOptions(InstanceId, Name, headers, runtime);
    }

    public DeleteDiversifyResponse deleteDiversifyWithOptions(String InstanceId, String Name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteDiversify", "2018-10-12", "HTTPS", "DELETE", "AK", "/openapi/instances/" + InstanceId + "/diversifies/{Name}", "json", req, runtime), new DeleteDiversifyResponse());
    }

    public DeleteMixResponse deleteMix(String InstanceId, String Name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMixWithOptions(InstanceId, Name, headers, runtime);
    }

    public DeleteMixResponse deleteMixWithOptions(String InstanceId, String Name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteMix", "2018-10-12", "HTTPS", "DELETE", "AK", "/openapi/instances/" + InstanceId + "/mixes/{Name}", "json", req, runtime), new DeleteMixResponse());
    }

    public DeleteSceneResponse deleteScene(String InstanceId, String SceneId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSceneWithOptions(InstanceId, SceneId, headers, runtime);
    }

    public DeleteSceneResponse deleteSceneWithOptions(String InstanceId, String SceneId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DeleteScene", "2018-10-12", "HTTPS", "DELETE", "AK", "/openapi/instances/" + InstanceId + "/scenes/{SceneId}", "json", req, runtime), new DeleteSceneResponse());
    }

    public DescribeDataSetMessageResponse describeDataSetMessage(String InstanceId, String VersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDataSetMessageWithOptions(InstanceId, VersionId, headers, runtime);
    }

    public DescribeDataSetMessageResponse describeDataSetMessageWithOptions(String InstanceId, String VersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeDataSetMessage", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/dataSets/{VersionId}/messages", "json", req, runtime), new DescribeDataSetMessageResponse());
    }

    public DescribeDataSetReportResponse describeDataSetReport(String InstanceId, String VersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDataSetReportWithOptions(InstanceId, VersionId, headers, runtime);
    }

    public DescribeDataSetReportResponse describeDataSetReportWithOptions(String InstanceId, String VersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeDataSetReport", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/dataSets/{VersionId}/report", "json", req, runtime), new DescribeDataSetReportResponse());
    }

    public DescribeDiversifyResponse describeDiversify(String InstanceId, String Name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDiversifyWithOptions(InstanceId, Name, headers, runtime);
    }

    public DescribeDiversifyResponse describeDiversifyWithOptions(String InstanceId, String Name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeDiversify", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/diversifies/{Name}", "json", req, runtime), new DescribeDiversifyResponse());
    }

    public DescribeExposureSettingsResponse describeExposureSettings(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeExposureSettingsWithOptions(InstanceId, headers, runtime);
    }

    public DescribeExposureSettingsResponse describeExposureSettingsWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeExposureSettings", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/exposure-settings", "json", req, runtime), new DescribeExposureSettingsResponse());
    }

    public DescribeInstanceResponse describeInstance(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeInstanceWithOptions(InstanceId, headers, runtime);
    }

    public DescribeInstanceResponse describeInstanceWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeInstance", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "", "json", req, runtime), new DescribeInstanceResponse());
    }

    public DescribeMixResponse describeMix(String InstanceId, String Name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeMixWithOptions(InstanceId, Name, headers, runtime);
    }

    public DescribeMixResponse describeMixWithOptions(String InstanceId, String Name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeMix", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/mixes/{Name}", "json", req, runtime), new DescribeMixResponse());
    }

    public DescribeQuotaResponse describeQuota(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeQuotaWithOptions(InstanceId, headers, runtime);
    }

    public DescribeQuotaResponse describeQuotaWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeQuota", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/quota", "json", req, runtime), new DescribeQuotaResponse());
    }

    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(request, headers, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeRegions", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/configurations/regions", "json", req, runtime), new DescribeRegionsResponse());
    }

    public DescribeRuleResponse describeRule(String InstanceId, String RuleId, DescribeRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRuleWithOptions(InstanceId, RuleId, request, headers, runtime);
    }

    public DescribeRuleResponse describeRuleWithOptions(String InstanceId, String RuleId, DescribeRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeRule", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/rules/{RuleId}", "json", req, runtime), new DescribeRuleResponse());
    }

    public DescribeSceneResponse describeScene(String InstanceId, String SceneId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSceneWithOptions(InstanceId, SceneId, headers, runtime);
    }

    public DescribeSceneResponse describeSceneWithOptions(String InstanceId, String SceneId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeScene", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/scenes/{SceneId}", "json", req, runtime), new DescribeSceneResponse());
    }

    public DescribeSceneThroughputResponse describeSceneThroughput(String InstanceId, String SceneId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSceneThroughputWithOptions(InstanceId, SceneId, headers, runtime);
    }

    public DescribeSceneThroughputResponse describeSceneThroughputWithOptions(String InstanceId, String SceneId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DescribeSceneThroughput", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/scenes/{SceneId}/throughput", "json", req, runtime), new DescribeSceneThroughputResponse());
    }

    public DescribeSyncReportDetailResponse describeSyncReportDetail(String InstanceId, DescribeSyncReportDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSyncReportDetailWithOptions(InstanceId, request, headers, runtime);
    }

    public DescribeSyncReportDetailResponse describeSyncReportDetailWithOptions(String InstanceId, DescribeSyncReportDetailRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levelType)) {
            query.put("LevelType", request.levelType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeSyncReportDetail", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/sync-reports/detail", "json", req, runtime), new DescribeSyncReportDetailResponse());
    }

    public DescribeSyncReportOutliersResponse describeSyncReportOutliers(String InstanceId, DescribeSyncReportOutliersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeSyncReportOutliersWithOptions(InstanceId, request, headers, runtime);
    }

    public DescribeSyncReportOutliersResponse describeSyncReportOutliersWithOptions(String InstanceId, DescribeSyncReportOutliersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.levelType)) {
            query.put("LevelType", request.levelType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeSyncReportOutliers", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/sync-reports/outliers", "json", req, runtime), new DescribeSyncReportOutliersResponse());
    }

    public DescribeUserMetricsResponse describeUserMetrics(String InstanceId, DescribeUserMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeUserMetricsWithOptions(InstanceId, request, headers, runtime);
    }

    public DescribeUserMetricsResponse describeUserMetricsWithOptions(String InstanceId, DescribeUserMetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DescribeUserMetrics", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/metrics", "json", req, runtime), new DescribeUserMetricsResponse());
    }

    public DowngradeInstanceResponse downgradeInstance(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.downgradeInstanceWithOptions(InstanceId, headers, runtime);
    }

    public DowngradeInstanceResponse downgradeInstanceWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("DowngradeInstance", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/downgrade", "json", req, runtime), new DowngradeInstanceResponse());
    }

    public ListDashboardResponse listDashboard(String InstanceId, ListDashboardRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDashboardWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDashboardResponse listDashboardWithOptions(String InstanceId, ListDashboardRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startDate)) {
            query.put("StartDate", request.startDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endDate)) {
            query.put("EndDate", request.endDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            query.put("TraceId", request.traceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDashboard", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/dashboard/statistics", "json", req, runtime), new ListDashboardResponse());
    }

    public ListDashboardDetailsResponse listDashboardDetails(String InstanceId, ListDashboardDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDashboardDetailsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDashboardDetailsResponse listDashboardDetailsWithOptions(String InstanceId, ListDashboardDetailsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceIds)) {
            query.put("TraceIds", request.traceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneIds)) {
            query.put("SceneIds", request.sceneIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDashboardDetails", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/dashboard/details", "json", req, runtime), new ListDashboardDetailsResponse());
    }

    public ListDashboardDetailsFlowsResponse listDashboardDetailsFlows(String InstanceId, ListDashboardDetailsFlowsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDashboardDetailsFlowsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDashboardDetailsFlowsResponse listDashboardDetailsFlowsWithOptions(String InstanceId, ListDashboardDetailsFlowsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceIds)) {
            query.put("TraceIds", request.traceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneIds)) {
            query.put("SceneIds", request.sceneIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDashboardDetailsFlows", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/dashboard/details/flows", "json", req, runtime), new ListDashboardDetailsFlowsResponse());
    }

    public ListDashboardMetricsResponse listDashboardMetrics(String InstanceId, ListDashboardMetricsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDashboardMetricsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDashboardMetricsResponse listDashboardMetricsWithOptions(String InstanceId, ListDashboardMetricsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDashboardMetrics", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/dashboard/metrics", "json", req, runtime), new ListDashboardMetricsResponse());
    }

    public ListDashboardMetricsFlowsResponse listDashboardMetricsFlows(String InstanceId, ListDashboardMetricsFlowsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDashboardMetricsFlowsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListDashboardMetricsFlowsResponse listDashboardMetricsFlowsWithOptions(String InstanceId, ListDashboardMetricsFlowsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metricType)) {
            query.put("MetricType", request.metricType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListDashboardMetricsFlows", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/dashboard/metrics/flows", "json", req, runtime), new ListDashboardMetricsFlowsResponse());
    }

    public ListDashboardParametersResponse listDashboardParameters(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDashboardParametersWithOptions(InstanceId, headers, runtime);
    }

    public ListDashboardParametersResponse listDashboardParametersWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListDashboardParameters", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/dashboard/parameters", "json", req, runtime), new ListDashboardParametersResponse());
    }

    public ListDashboardUidResponse listDashboardUid(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDashboardUidWithOptions(InstanceId, headers, runtime);
    }

    public ListDashboardUidResponse listDashboardUidWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListDashboardUid", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/dashboard/uid", "json", req, runtime), new ListDashboardUidResponse());
    }

    public ListDataSetResponse listDataSet(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSetWithOptions(InstanceId, headers, runtime);
    }

    public ListDataSetResponse listDataSetWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListDataSet", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/dataSets", "json", req, runtime), new ListDataSetResponse());
    }

    public ListDataSourceResponse listDataSource(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourceWithOptions(InstanceId, headers, runtime);
    }

    public ListDataSourceResponse listDataSourceWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListDataSource", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/dataSources", "json", req, runtime), new ListDataSourceResponse());
    }

    public ListDiversifyResponse listDiversify(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDiversifyWithOptions(InstanceId, headers, runtime);
    }

    public ListDiversifyResponse listDiversifyWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListDiversify", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/diversifies", "json", req, runtime), new ListDiversifyResponse());
    }

    public ListInstanceResponse listInstance(ListInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceWithOptions(request, headers, runtime);
    }

    public ListInstanceResponse listInstanceWithOptions(ListInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            query.put("ExpiredTime", request.expiredTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListInstance", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances", "json", req, runtime), new ListInstanceResponse());
    }

    public ListInstanceTaskResponse listInstanceTask(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listInstanceTaskWithOptions(InstanceId, headers, runtime);
    }

    public ListInstanceTaskResponse listInstanceTaskWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListInstanceTask", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/tasks", "json", req, runtime), new ListInstanceTaskResponse());
    }

    public ListItemsResponse listItems(String InstanceId, ListItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listItemsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListItemsResponse listItemsWithOptions(String InstanceId, ListItemsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListItems", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/items/actions/list", "json", req, runtime), new ListItemsResponse());
    }

    public ListLogsResponse listLogs(String InstanceId, ListLogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listLogsWithOptions(InstanceId, request, headers, runtime);
    }

    public ListLogsResponse listLogsWithOptions(String InstanceId, ListLogsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryParams)) {
            query.put("QueryParams", request.queryParams);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListLogs", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/logs", "json", req, runtime), new ListLogsResponse());
    }

    public ListMixResponse listMix(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMixWithOptions(InstanceId, headers, runtime);
    }

    public ListMixResponse listMixWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListMix", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/mixes", "json", req, runtime), new ListMixResponse());
    }

    public ListRuleConditionsResponse listRuleConditions(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRuleConditionsWithOptions(InstanceId, headers, runtime);
    }

    public ListRuleConditionsResponse listRuleConditionsWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListRuleConditions", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/rule-conditions", "json", req, runtime), new ListRuleConditionsResponse());
    }

    public ListRulesResponse listRules(String InstanceId, ListRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRulesWithOptions(InstanceId, request, headers, runtime);
    }

    public ListRulesResponse listRulesWithOptions(String InstanceId, ListRulesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRules", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/rules", "json", req, runtime), new ListRulesResponse());
    }

    public ListRuleTasksResponse listRuleTasks(String InstanceId, ListRuleTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRuleTasksWithOptions(InstanceId, request, headers, runtime);
    }

    public ListRuleTasksResponse listRuleTasksWithOptions(String InstanceId, ListRuleTasksRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListRuleTasks", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/rule-tasks", "json", req, runtime), new ListRuleTasksResponse());
    }

    public ListSceneItemsResponse listSceneItems(String InstanceId, String SceneId, ListSceneItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSceneItemsWithOptions(InstanceId, SceneId, request, headers, runtime);
    }

    public ListSceneItemsResponse listSceneItemsWithOptions(String InstanceId, String SceneId, ListSceneItemsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.operationRuleId)) {
            query.put("OperationRuleId", request.operationRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.selectionRuleId)) {
            query.put("SelectionRuleId", request.selectionRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.previewType)) {
            query.put("PreviewType", request.previewType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCount)) {
            query.put("QueryCount", request.queryCount);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListSceneItems", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/scenes/{SceneId}/items", "json", req, runtime), new ListSceneItemsResponse());
    }

    public ListScenesResponse listScenes(String InstanceId, ListScenesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listScenesWithOptions(InstanceId, request, headers, runtime);
    }

    public ListScenesResponse listScenesWithOptions(String InstanceId, ListScenesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListScenes", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/scenes", "json", req, runtime), new ListScenesResponse());
    }

    public ListUmengAppkeysResponse listUmengAppkeys() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUmengAppkeysWithOptions(headers, runtime);
    }

    public ListUmengAppkeysResponse listUmengAppkeysWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ListUmengAppkeys", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/umeng/appkeys", "json", req, runtime), new ListUmengAppkeysResponse());
    }

    public ModifyDataSourceResponse modifyDataSource(String InstanceId, String TableName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDataSourceWithOptions(InstanceId, TableName, headers, runtime);
    }

    public ModifyDataSourceResponse modifyDataSourceWithOptions(String InstanceId, String TableName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ModifyDataSource", "2018-10-12", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "/dataSources/{TableName}", "json", req, runtime), new ModifyDataSourceResponse());
    }

    public ModifyDiversifyResponse modifyDiversify(String InstanceId, String Name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyDiversifyWithOptions(InstanceId, Name, headers, runtime);
    }

    public ModifyDiversifyResponse modifyDiversifyWithOptions(String InstanceId, String Name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ModifyDiversify", "2018-10-12", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "/diversifies/{Name}", "json", req, runtime), new ModifyDiversifyResponse());
    }

    public ModifyExposureSettingsResponse modifyExposureSettings(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyExposureSettingsWithOptions(InstanceId, headers, runtime);
    }

    public ModifyExposureSettingsResponse modifyExposureSettingsWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ModifyExposureSettings", "2018-10-12", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "/exposure-settings", "json", req, runtime), new ModifyExposureSettingsResponse());
    }

    public ModifyInstanceResponse modifyInstance(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyInstanceWithOptions(InstanceId, headers, runtime);
    }

    public ModifyInstanceResponse modifyInstanceWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ModifyInstance", "2018-10-12", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "", "json", req, runtime), new ModifyInstanceResponse());
    }

    public ModifyItemsResponse modifyItems(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyItemsWithOptions(InstanceId, headers, runtime);
    }

    public ModifyItemsResponse modifyItemsWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ModifyItems", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/items", "json", req, runtime), new ModifyItemsResponse());
    }

    public ModifyMixResponse modifyMix(String InstanceId, String Name) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyMixWithOptions(InstanceId, Name, headers, runtime);
    }

    public ModifyMixResponse modifyMixWithOptions(String InstanceId, String Name, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ModifyMix", "2018-10-12", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "/mixes/{Name}", "json", req, runtime), new ModifyMixResponse());
    }

    public ModifyRuleResponse modifyRule(String InstanceId, String RuleId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyRuleWithOptions(InstanceId, RuleId, headers, runtime);
    }

    public ModifyRuleResponse modifyRuleWithOptions(String InstanceId, String RuleId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ModifyRule", "2018-10-12", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "/rules/{RuleId}", "json", req, runtime), new ModifyRuleResponse());
    }

    public ModifySceneResponse modifyScene(String InstanceId, String SceneId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifySceneWithOptions(InstanceId, SceneId, headers, runtime);
    }

    public ModifySceneResponse modifySceneWithOptions(String InstanceId, String SceneId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ModifyScene", "2018-10-12", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "/scenes/{SceneId}", "json", req, runtime), new ModifySceneResponse());
    }

    public PublishRuleResponse publishRule(String InstanceId, String RuleId, PublishRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.publishRuleWithOptions(InstanceId, RuleId, request, headers, runtime);
    }

    public PublishRuleResponse publishRuleWithOptions(String InstanceId, String RuleId, PublishRuleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("PublishRule", "2018-10-12", "HTTPS", "PUT", "AK", "/openapi/instances/" + InstanceId + "/rules/{RuleId}/actions/publish", "json", req, runtime), new PublishRuleResponse());
    }

    public PushDocumentResponse pushDocument(String InstanceId, String TableName) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushDocumentWithOptions(InstanceId, TableName, headers, runtime);
    }

    public PushDocumentResponse pushDocumentWithOptions(String InstanceId, String TableName, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("PushDocument", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/tables/{TableName}/actions/bulk", "json", req, runtime), new PushDocumentResponse());
    }

    public PushInterventionResponse pushIntervention(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.pushInterventionWithOptions(InstanceId, headers, runtime);
    }

    public PushInterventionResponse pushInterventionWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("PushIntervention", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/intervene", "json", req, runtime), new PushInterventionResponse());
    }

    public QueryDataMessageResponse queryDataMessage(String InstanceId, String Table, QueryDataMessageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataMessageWithOptions(InstanceId, Table, request, headers, runtime);
    }

    public QueryDataMessageResponse queryDataMessageWithOptions(String InstanceId, String Table, QueryDataMessageRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmdType)) {
            query.put("CmdType", request.cmdType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemType)) {
            query.put("ItemType", request.itemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.page)) {
            query.put("Page", request.page);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.size)) {
            query.put("Size", request.size);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            query.put("TraceId", request.traceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bhvType)) {
            query.put("BhvType", request.bhvType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageSource)) {
            query.put("MessageSource", request.messageSource);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QueryDataMessage", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/tables/{Table}/data-message", "json", req, runtime), new QueryDataMessageResponse());
    }

    public QueryDataMessageStatisticsResponse queryDataMessageStatistics(String InstanceId, String Table, QueryDataMessageStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryDataMessageStatisticsWithOptions(InstanceId, Table, request, headers, runtime);
    }

    public QueryDataMessageStatisticsResponse queryDataMessageStatisticsWithOptions(String InstanceId, String Table, QueryDataMessageStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cmdType)) {
            query.put("CmdType", request.cmdType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemType)) {
            query.put("ItemType", request.itemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.traceId)) {
            query.put("TraceId", request.traceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.bhvType)) {
            query.put("BhvType", request.bhvType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.messageSource)) {
            query.put("MessageSource", request.messageSource);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QueryDataMessageStatistics", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/tables/{Table}/data-message-statistics", "json", req, runtime), new QueryDataMessageStatisticsResponse());
    }

    public QueryExceptionHistoryResponse queryExceptionHistory(String InstanceId, QueryExceptionHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryExceptionHistoryWithOptions(InstanceId, request, headers, runtime);
    }

    public QueryExceptionHistoryResponse queryExceptionHistoryWithOptions(String InstanceId, QueryExceptionHistoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QueryExceptionHistory", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/sync-reports/exception-history", "json", req, runtime), new QueryExceptionHistoryResponse());
    }

    public QueryRawDataResponse queryRawData(String InstanceId, String Table, QueryRawDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.queryRawDataWithOptions(InstanceId, Table, request, headers, runtime);
    }

    public QueryRawDataResponse queryRawDataWithOptions(String InstanceId, String Table, QueryRawDataRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.itemId)) {
            query.put("ItemId", request.itemId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.itemType)) {
            query.put("ItemType", request.itemType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userType)) {
            query.put("UserType", request.userType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QueryRawData", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/tables/{Table}/raw-data", "json", req, runtime), new QueryRawDataResponse());
    }

    public QuerySingleAggregationReportResponse querySingleAggregationReport(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySingleAggregationReportWithOptions(InstanceId, headers, runtime);
    }

    public QuerySingleAggregationReportResponse querySingleAggregationReportWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("QuerySingleAggregationReport", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/sync-reports/single-aggregation-report", "json", req, runtime), new QuerySingleAggregationReportResponse());
    }

    public QuerySingleReportResponse querySingleReport(String InstanceId, QuerySingleReportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySingleReportWithOptions(InstanceId, request, headers, runtime);
    }

    public QuerySingleReportResponse querySingleReportWithOptions(String InstanceId, QuerySingleReportRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.reportType)) {
            query.put("ReportType", request.reportType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QuerySingleReport", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/sync-reports/single-report", "json", req, runtime), new QuerySingleReportResponse());
    }

    public QuerySyncReportAggregationResponse querySyncReportAggregation(String InstanceId, QuerySyncReportAggregationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.querySyncReportAggregationWithOptions(InstanceId, request, headers, runtime);
    }

    public QuerySyncReportAggregationResponse querySyncReportAggregationWithOptions(String InstanceId, QuerySyncReportAggregationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("QuerySyncReportAggregation", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/sync-reports/aggregation", "json", req, runtime), new QuerySyncReportAggregationResponse());
    }

    public RecommendResponse recommend(String InstanceId, RecommendRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        RecommendHeaders headers = new RecommendHeaders();
        return this.recommendWithOptions(InstanceId, request, headers, runtime);
    }

    public RecommendResponse recommendWithOptions(String InstanceId, RecommendRequest request, RecommendHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sceneId)) {
            query.put("SceneId", request.sceneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ip)) {
            query.put("Ip", request.ip);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.imei)) {
            query.put("Imei", request.imei);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnCount)) {
            query.put("ReturnCount", request.returnCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.items)) {
            query.put("Items", request.items);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.regionId)) {
            realHeaders.put("RegionId", headers.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("Recommend", "2018-10-12", "HTTPS", "GET", "AK", "/openapi/instances/" + InstanceId + "/actions/recommend", "json", req, runtime), new RecommendResponse());
    }

    public RunInstanceResponse runInstance(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runInstanceWithOptions(InstanceId, headers, runtime);
    }

    public RunInstanceResponse runInstanceWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("RunInstance", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/import", "json", req, runtime), new RunInstanceResponse());
    }

    public StopDataSetResponse stopDataSet(String InstanceId, String VersionId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopDataSetWithOptions(InstanceId, VersionId, headers, runtime);
    }

    public StopDataSetResponse stopDataSetWithOptions(String InstanceId, String VersionId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("StopDataSet", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/dataSets/{VersionId}/actions/stop", "json", req, runtime), new StopDataSetResponse());
    }

    public UpgradeInstanceResponse upgradeInstance(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.upgradeInstanceWithOptions(InstanceId, headers, runtime);
    }

    public UpgradeInstanceResponse upgradeInstanceWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("UpgradeInstance", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/upgrade", "json", req, runtime), new UpgradeInstanceResponse());
    }

    public ValidateInstanceResponse validateInstance(String InstanceId) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.validateInstanceWithOptions(InstanceId, headers, runtime);
    }

    public ValidateInstanceResponse validateInstanceWithOptions(String InstanceId, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        return TeaModel.toModel(this.doROARequest("ValidateInstance", "2018-10-12", "HTTPS", "POST", "AK", "/openapi/instances/" + InstanceId + "/actions/validate", "json", req, runtime), new ValidateInstanceResponse());
    }
}
