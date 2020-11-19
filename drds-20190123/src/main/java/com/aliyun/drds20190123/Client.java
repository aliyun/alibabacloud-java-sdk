// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.drds20190123;

import com.aliyun.tea.*;
import com.aliyun.drds20190123.models.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "drds.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "drds.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "drds.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-chengdu", "drds.aliyuncs.com"),
            new TeaPair("cn-edge-1", "drds.aliyuncs.com"),
            new TeaPair("cn-fujian", "drds.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "drds.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "drds.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "drds.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "drds.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "drds.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "drds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "drds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "drds.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-wuhan", "drds.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "drds.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "drds.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "drds.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "drds.aliyuncs.com"),
            new TeaPair("eu-central-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "drds.ap-southeast-1.aliyuncs.com"),
            new TeaPair("us-west-1", "drds.ap-southeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("drds", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public UpdateResourceGroupAttributeResponse updateResourceGroupAttributeWithOptions(UpdateResourceGroupAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateResourceGroupAttribute", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new UpdateResourceGroupAttributeResponse());
    }

    public UpdateResourceGroupAttributeResponse updateResourceGroupAttribute(UpdateResourceGroupAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateResourceGroupAttributeWithOptions(request, runtime);
    }

    public DescribeCustomDataExportSrcDstTablesResponse describeCustomDataExportSrcDstTablesWithOptions(DescribeCustomDataExportSrcDstTablesRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        DescribeCustomDataExportSrcDstTablesShrinkRequest request = new DescribeCustomDataExportSrcDstTablesShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.exportParam)) {
            request.exportParamShrink = com.aliyun.teautil.Common.toJSONString(tmp.exportParam);
        }

        return TeaModel.toModel(this.doRequest("DescribeCustomDataExportSrcDstTables", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCustomDataExportSrcDstTablesResponse());
    }

    public DescribeCustomDataExportSrcDstTablesResponse describeCustomDataExportSrcDstTables(DescribeCustomDataExportSrcDstTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomDataExportSrcDstTablesWithOptions(request, runtime);
    }

    public DescribeDataExportPreCheckResultResponse describeDataExportPreCheckResultWithOptions(DescribeDataExportPreCheckResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDataExportPreCheckResult", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDataExportPreCheckResultResponse());
    }

    public DescribeDataExportPreCheckResultResponse describeDataExportPreCheckResult(DescribeDataExportPreCheckResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataExportPreCheckResultWithOptions(request, runtime);
    }

    public DescribeDataExportTasksResponse describeDataExportTasksWithOptions(DescribeDataExportTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDataExportTasks", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDataExportTasksResponse());
    }

    public DescribeDataExportTasksResponse describeDataExportTasks(DescribeDataExportTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataExportTasksWithOptions(request, runtime);
    }

    public DescribeDataExportTaskReportResponse describeDataExportTaskReportWithOptions(DescribeDataExportTaskReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDataExportTaskReport", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDataExportTaskReportResponse());
    }

    public DescribeDataExportTaskReportResponse describeDataExportTaskReport(DescribeDataExportTaskReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataExportTaskReportWithOptions(request, runtime);
    }

    public StopDataExportTaskResponse stopDataExportTaskWithOptions(StopDataExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopDataExportTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new StopDataExportTaskResponse());
    }

    public StopDataExportTaskResponse stopDataExportTask(StopDataExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDataExportTaskWithOptions(request, runtime);
    }

    public CreateCustomDataExportTaskResponse createCustomDataExportTaskWithOptions(CreateCustomDataExportTaskRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        CreateCustomDataExportTaskShrinkRequest request = new CreateCustomDataExportTaskShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.exportParam)) {
            request.exportParamShrink = com.aliyun.teautil.Common.toJSONString(tmp.exportParam);
        }

        return TeaModel.toModel(this.doRequest("CreateCustomDataExportTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateCustomDataExportTaskResponse());
    }

    public CreateCustomDataExportTaskResponse createCustomDataExportTask(CreateCustomDataExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomDataExportTaskWithOptions(request, runtime);
    }

    public RemoveDataExportTaskResponse removeDataExportTaskWithOptions(RemoveDataExportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveDataExportTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveDataExportTaskResponse());
    }

    public RemoveDataExportTaskResponse removeDataExportTask(RemoveDataExportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDataExportTaskWithOptions(request, runtime);
    }

    public CreateCustomDataExportPreCheckTaskResponse createCustomDataExportPreCheckTaskWithOptions(CreateCustomDataExportPreCheckTaskRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        CreateCustomDataExportPreCheckTaskShrinkRequest request = new CreateCustomDataExportPreCheckTaskShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.exportParam)) {
            request.exportParamShrink = com.aliyun.teautil.Common.toJSONString(tmp.exportParam);
        }

        return TeaModel.toModel(this.doRequest("CreateCustomDataExportPreCheckTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateCustomDataExportPreCheckTaskResponse());
    }

    public CreateCustomDataExportPreCheckTaskResponse createCustomDataExportPreCheckTask(CreateCustomDataExportPreCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomDataExportPreCheckTaskWithOptions(request, runtime);
    }

    public ManagePrivateRdsResponse managePrivateRdsWithOptions(ManagePrivateRdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ManagePrivateRds", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ManagePrivateRdsResponse());
    }

    public ManagePrivateRdsResponse managePrivateRds(ManagePrivateRdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.managePrivateRdsWithOptions(request, runtime);
    }

    public DescribeDrdsRdsInstancesResponse describeDrdsRdsInstancesWithOptions(DescribeDrdsRdsInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsRdsInstances", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsRdsInstancesResponse());
    }

    public DescribeDrdsRdsInstancesResponse describeDrdsRdsInstances(DescribeDrdsRdsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsRdsInstancesWithOptions(request, runtime);
    }

    public DescribeRdsReadOnlyResponse describeRdsReadOnlyWithOptions(DescribeRdsReadOnlyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRdsReadOnly", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRdsReadOnlyResponse());
    }

    public DescribeRdsReadOnlyResponse describeRdsReadOnly(DescribeRdsReadOnlyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsReadOnlyWithOptions(request, runtime);
    }

    public DescribeRdsDrdsDBResponse describeRdsDrdsDBWithOptions(DescribeRdsDrdsDBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRdsDrdsDB", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRdsDrdsDBResponse());
    }

    public DescribeRdsDrdsDBResponse describeRdsDrdsDB(DescribeRdsDrdsDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsDrdsDBWithOptions(request, runtime);
    }

    public DescribeMyCatReportInfoResponse describeMyCatReportInfoWithOptions(DescribeMyCatReportInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMyCatReportInfo", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMyCatReportInfoResponse());
    }

    public DescribeMyCatReportInfoResponse describeMyCatReportInfo(DescribeMyCatReportInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMyCatReportInfoWithOptions(request, runtime);
    }

    public DescribeUnCompatibilitySqlResponse describeUnCompatibilitySqlWithOptions(DescribeUnCompatibilitySqlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeUnCompatibilitySql", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeUnCompatibilitySqlResponse());
    }

    public DescribeUnCompatibilitySqlResponse describeUnCompatibilitySql(DescribeUnCompatibilitySqlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUnCompatibilitySqlWithOptions(request, runtime);
    }

    public MyCatCustomImportPreCheckResponse myCatCustomImportPreCheckWithOptions(MyCatCustomImportPreCheckRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        MyCatCustomImportPreCheckShrinkRequest request = new MyCatCustomImportPreCheckShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.tableMap)) {
            request.tableMapShrink = com.aliyun.teautil.Common.toJSONString(tmp.tableMap);
        }

        return TeaModel.toModel(this.doRequest("MyCatCustomImportPreCheck", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new MyCatCustomImportPreCheckResponse());
    }

    public MyCatCustomImportPreCheckResponse myCatCustomImportPreCheck(MyCatCustomImportPreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.myCatCustomImportPreCheckWithOptions(request, runtime);
    }

    public CreateMyCatEvaluateResponse createMyCatEvaluateWithOptions(CreateMyCatEvaluateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateMyCatEvaluate", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateMyCatEvaluateResponse());
    }

    public CreateMyCatEvaluateResponse createMyCatEvaluate(CreateMyCatEvaluateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMyCatEvaluateWithOptions(request, runtime);
    }

    public MyCatConnectTestResponse myCatConnectTestWithOptions(MyCatConnectTestRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("MyCatConnectTest", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new MyCatConnectTestResponse());
    }

    public MyCatConnectTestResponse myCatConnectTest(MyCatConnectTestRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.myCatConnectTestWithOptions(request, runtime);
    }

    public PrecheckMyCatEvaluateResponse precheckMyCatEvaluateWithOptions(PrecheckMyCatEvaluateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PrecheckMyCatEvaluate", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new PrecheckMyCatEvaluateResponse());
    }

    public PrecheckMyCatEvaluateResponse precheckMyCatEvaluate(PrecheckMyCatEvaluateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.precheckMyCatEvaluateWithOptions(request, runtime);
    }

    public DescribeMyCatDbListResponse describeMyCatDbListWithOptions(DescribeMyCatDbListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeMyCatDbList", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeMyCatDbListResponse());
    }

    public DescribeMyCatDbListResponse describeMyCatDbList(DescribeMyCatDbListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMyCatDbListWithOptions(request, runtime);
    }

    public CreateMyCatCustomImportResponse createMyCatCustomImportWithOptions(CreateMyCatCustomImportRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        CreateMyCatCustomImportShrinkRequest request = new CreateMyCatCustomImportShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.tableMap)) {
            request.tableMapShrink = com.aliyun.teautil.Common.toJSONString(tmp.tableMap);
        }

        return TeaModel.toModel(this.doRequest("CreateMyCatCustomImport", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateMyCatCustomImportResponse());
    }

    public CreateMyCatCustomImportResponse createMyCatCustomImport(CreateMyCatCustomImportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMyCatCustomImportWithOptions(request, runtime);
    }

    public RemoveDrdsMysqlResponse removeDrdsMysqlWithOptions(RemoveDrdsMysqlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveDrdsMysql", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveDrdsMysqlResponse());
    }

    public RemoveDrdsMysqlResponse removeDrdsMysql(RemoveDrdsMysqlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDrdsMysqlWithOptions(request, runtime);
    }

    public StopEvaluateTaskResponse stopEvaluateTaskWithOptions(StopEvaluateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopEvaluateTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new StopEvaluateTaskResponse());
    }

    public StopEvaluateTaskResponse stopEvaluateTask(StopEvaluateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopEvaluateTaskWithOptions(request, runtime);
    }

    public StopDataImportTaskResponse stopDataImportTaskWithOptions(StopDataImportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopDataImportTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new StopDataImportTaskResponse());
    }

    public StopDataImportTaskResponse stopDataImportTask(StopDataImportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopDataImportTaskWithOptions(request, runtime);
    }

    public StartEvaluateTaskResponse startEvaluateTaskWithOptions(StartEvaluateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartEvaluateTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new StartEvaluateTaskResponse());
    }

    public StartEvaluateTaskResponse startEvaluateTask(StartEvaluateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startEvaluateTaskWithOptions(request, runtime);
    }

    public StartDataImportTaskResponse startDataImportTaskWithOptions(StartDataImportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartDataImportTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new StartDataImportTaskResponse());
    }

    public StartDataImportTaskResponse startDataImportTask(StartDataImportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startDataImportTaskWithOptions(request, runtime);
    }

    public DescribeRdsInstInfosResponse describeRdsInstInfosWithOptions(DescribeRdsInstInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("describeRdsInstInfos", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRdsInstInfosResponse());
    }

    public DescribeRdsInstInfosResponse describeRdsInstInfos(DescribeRdsInstInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsInstInfosWithOptions(request, runtime);
    }

    public DescribeRdsDbInfosResponse describeRdsDbInfosWithOptions(DescribeRdsDbInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRdsDbInfos", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRdsDbInfosResponse());
    }

    public DescribeRdsDbInfosResponse describeRdsDbInfos(DescribeRdsDbInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsDbInfosWithOptions(request, runtime);
    }

    public DescribeFirstDrdsInstanceByOrderIdResponse describeFirstDrdsInstanceByOrderIdWithOptions(DescribeFirstDrdsInstanceByOrderIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeFirstDrdsInstanceByOrderId", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeFirstDrdsInstanceByOrderIdResponse());
    }

    public DescribeFirstDrdsInstanceByOrderIdResponse describeFirstDrdsInstanceByOrderId(DescribeFirstDrdsInstanceByOrderIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeFirstDrdsInstanceByOrderIdWithOptions(request, runtime);
    }

    public DescribeEvaluateTasksResponse describeEvaluateTasksWithOptions(DescribeEvaluateTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEvaluateTasks", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEvaluateTasksResponse());
    }

    public DescribeEvaluateTasksResponse describeEvaluateTasks(DescribeEvaluateTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEvaluateTasksWithOptions(request, runtime);
    }

    public DescribeEvaluateTaskReportResponse describeEvaluateTaskReportWithOptions(DescribeEvaluateTaskReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEvaluateTaskReport", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEvaluateTaskReportResponse());
    }

    public DescribeEvaluateTaskReportResponse describeEvaluateTaskReport(DescribeEvaluateTaskReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEvaluateTaskReportWithOptions(request, runtime);
    }

    public DescribeEvaluatePreCheckResultResponse describeEvaluatePreCheckResultWithOptions(DescribeEvaluatePreCheckResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeEvaluatePreCheckResult", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEvaluatePreCheckResultResponse());
    }

    public DescribeEvaluatePreCheckResultResponse describeEvaluatePreCheckResult(DescribeEvaluatePreCheckResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEvaluatePreCheckResultWithOptions(request, runtime);
    }

    public DescribeEvaluateDataImportDbTopologysResponse describeEvaluateDataImportDbTopologysWithOptions(DescribeEvaluateDataImportDbTopologysRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        DescribeEvaluateDataImportDbTopologysShrinkRequest request = new DescribeEvaluateDataImportDbTopologysShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.importParam)) {
            request.importParamShrink = com.aliyun.teautil.Common.toJSONString(tmp.importParam);
        }

        return TeaModel.toModel(this.doRequest("DescribeEvaluateDataImportDbTopologys", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeEvaluateDataImportDbTopologysResponse());
    }

    public DescribeEvaluateDataImportDbTopologysResponse describeEvaluateDataImportDbTopologys(DescribeEvaluateDataImportDbTopologysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEvaluateDataImportDbTopologysWithOptions(request, runtime);
    }

    public DescribeDataImportTasksResponse describeDataImportTasksWithOptions(DescribeDataImportTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDataImportTasks", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDataImportTasksResponse());
    }

    public DescribeDataImportTasksResponse describeDataImportTasks(DescribeDataImportTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataImportTasksWithOptions(request, runtime);
    }

    public DescribeDataImportTaskReportResponse describeDataImportTaskReportWithOptions(DescribeDataImportTaskReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDataImportTaskReport", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDataImportTaskReportResponse());
    }

    public DescribeDataImportTaskReportResponse describeDataImportTaskReport(DescribeDataImportTaskReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataImportTaskReportWithOptions(request, runtime);
    }

    public DescribeCustomDataImportSrcDstTablesResponse describeCustomDataImportSrcDstTablesWithOptions(DescribeCustomDataImportSrcDstTablesRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        DescribeCustomDataImportSrcDstTablesShrinkRequest request = new DescribeCustomDataImportSrcDstTablesShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.importParam)) {
            request.importParamShrink = com.aliyun.teautil.Common.toJSONString(tmp.importParam);
        }

        return TeaModel.toModel(this.doRequest("DescribeCustomDataImportSrcDstTables", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeCustomDataImportSrcDstTablesResponse());
    }

    public DescribeCustomDataImportSrcDstTablesResponse describeCustomDataImportSrcDstTables(DescribeCustomDataImportSrcDstTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCustomDataImportSrcDstTablesWithOptions(request, runtime);
    }

    public DescribeBatchEvaluateTaskReportResponse describeBatchEvaluateTaskReportWithOptions(DescribeBatchEvaluateTaskReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBatchEvaluateTaskReport", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBatchEvaluateTaskReportResponse());
    }

    public DescribeBatchEvaluateTaskReportResponse describeBatchEvaluateTaskReport(DescribeBatchEvaluateTaskReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBatchEvaluateTaskReportWithOptions(request, runtime);
    }

    public DescribeDataImportPreCheckResultResponse describeDataImportPreCheckResultWithOptions(DescribeDataImportPreCheckResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDataImportPreCheckResult", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDataImportPreCheckResultResponse());
    }

    public DescribeDataImportPreCheckResultResponse describeDataImportPreCheckResult(DescribeDataImportPreCheckResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataImportPreCheckResultWithOptions(request, runtime);
    }

    public CreateEvaluateTaskResponse createEvaluateTaskWithOptions(CreateEvaluateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateEvaluateTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateEvaluateTaskResponse());
    }

    public CreateEvaluateTaskResponse createEvaluateTask(CreateEvaluateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEvaluateTaskWithOptions(request, runtime);
    }

    public CreateEvaluatePreCheckTaskResponse createEvaluatePreCheckTaskWithOptions(CreateEvaluatePreCheckTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateEvaluatePreCheckTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateEvaluatePreCheckTaskResponse());
    }

    public CreateEvaluatePreCheckTaskResponse createEvaluatePreCheckTask(CreateEvaluatePreCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEvaluatePreCheckTaskWithOptions(request, runtime);
    }

    public CreateEvaluateDataImportTaskResponse createEvaluateDataImportTaskWithOptions(CreateEvaluateDataImportTaskRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        CreateEvaluateDataImportTaskShrinkRequest request = new CreateEvaluateDataImportTaskShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.importParam)) {
            request.importParamShrink = com.aliyun.teautil.Common.toJSONString(tmp.importParam);
        }

        return TeaModel.toModel(this.doRequest("CreateEvaluateDataImportTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateEvaluateDataImportTaskResponse());
    }

    public CreateEvaluateDataImportTaskResponse createEvaluateDataImportTask(CreateEvaluateDataImportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEvaluateDataImportTaskWithOptions(request, runtime);
    }

    public CreateEvaluateDataImportPreCheckTaskResponse createEvaluateDataImportPreCheckTaskWithOptions(CreateEvaluateDataImportPreCheckTaskRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        CreateEvaluateDataImportPreCheckTaskShrinkRequest request = new CreateEvaluateDataImportPreCheckTaskShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.importParam)) {
            request.importParamShrink = com.aliyun.teautil.Common.toJSONString(tmp.importParam);
        }

        return TeaModel.toModel(this.doRequest("CreateEvaluateDataImportPreCheckTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateEvaluateDataImportPreCheckTaskResponse());
    }

    public CreateEvaluateDataImportPreCheckTaskResponse createEvaluateDataImportPreCheckTask(CreateEvaluateDataImportPreCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createEvaluateDataImportPreCheckTaskWithOptions(request, runtime);
    }

    public CreateCustomDataImportTaskResponse createCustomDataImportTaskWithOptions(CreateCustomDataImportTaskRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        CreateCustomDataImportTaskShrinkRequest request = new CreateCustomDataImportTaskShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.importParam)) {
            request.importParamShrink = com.aliyun.teautil.Common.toJSONString(tmp.importParam);
        }

        return TeaModel.toModel(this.doRequest("CreateCustomDataImportTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateCustomDataImportTaskResponse());
    }

    public CreateCustomDataImportTaskResponse createCustomDataImportTask(CreateCustomDataImportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomDataImportTaskWithOptions(request, runtime);
    }

    public CreateCustomDataImportPreCheckTaskResponse createCustomDataImportPreCheckTaskWithOptions(CreateCustomDataImportPreCheckTaskRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        CreateCustomDataImportPreCheckTaskShrinkRequest request = new CreateCustomDataImportPreCheckTaskShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.importParam)) {
            request.importParamShrink = com.aliyun.teautil.Common.toJSONString(tmp.importParam);
        }

        return TeaModel.toModel(this.doRequest("CreateCustomDataImportPreCheckTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateCustomDataImportPreCheckTaskResponse());
    }

    public CreateCustomDataImportPreCheckTaskResponse createCustomDataImportPreCheckTask(CreateCustomDataImportPreCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCustomDataImportPreCheckTaskWithOptions(request, runtime);
    }

    public CheckConnectivityResponse checkConnectivityWithOptions(CheckConnectivityRequest tmp, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        CheckConnectivityShrinkRequest request = new CheckConnectivityShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.dbInfo)) {
            request.dbInfoShrink = com.aliyun.teautil.Common.toJSONString(tmp.dbInfo);
        }

        return TeaModel.toModel(this.doRequest("CheckConnectivity", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CheckConnectivityResponse());
    }

    public CheckConnectivityResponse checkConnectivity(CheckConnectivityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkConnectivityWithOptions(request, runtime);
    }

    public CreateDrdsInstanceResponse createDrdsInstanceWithOptions(CreateDrdsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDrdsInstance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateDrdsInstanceResponse());
    }

    public CreateDrdsInstanceResponse createDrdsInstance(CreateDrdsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDrdsInstanceWithOptions(request, runtime);
    }

    public DescribeDrdsComponentsResponse describeDrdsComponentsWithOptions(DescribeDrdsComponentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsComponents", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsComponentsResponse());
    }

    public DescribeDrdsComponentsResponse describeDrdsComponents(DescribeDrdsComponentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsComponentsWithOptions(request, runtime);
    }

    public AsyncTaskCancelResponse asyncTaskCancelWithOptions(AsyncTaskCancelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("AsyncTaskCancel", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new AsyncTaskCancelResponse());
    }

    public AsyncTaskCancelResponse asyncTaskCancel(AsyncTaskCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.asyncTaskCancelWithOptions(request, runtime);
    }

    public DescribeDrdsDbTestLinkResponse describeDrdsDbTestLinkWithOptions(DescribeDrdsDbTestLinkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDbTestLink", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDbTestLinkResponse());
    }

    public DescribeDrdsDbTestLinkResponse describeDrdsDbTestLink(DescribeDrdsDbTestLinkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDbTestLinkWithOptions(request, runtime);
    }

    public GetBatchEvaluateTaskReportResponse getBatchEvaluateTaskReportWithOptions(GetBatchEvaluateTaskReportRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetBatchEvaluateTaskReport", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new GetBatchEvaluateTaskReportResponse());
    }

    public GetBatchEvaluateTaskReportResponse getBatchEvaluateTaskReport(GetBatchEvaluateTaskReportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getBatchEvaluateTaskReportWithOptions(request, runtime);
    }

    public RemoveDataImportTaskResponse removeDataImportTaskWithOptions(RemoveDataImportTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveDataImportTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveDataImportTaskResponse());
    }

    public RemoveDataImportTaskResponse removeDataImportTask(RemoveDataImportTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDataImportTaskWithOptions(request, runtime);
    }

    public RemoveEvaluateTaskResponse removeEvaluateTaskWithOptions(RemoveEvaluateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveEvaluateTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveEvaluateTaskResponse());
    }

    public RemoveEvaluateTaskResponse removeEvaluateTask(RemoveEvaluateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeEvaluateTaskWithOptions(request, runtime);
    }

    public CheckNewTableNameValidResponse checkNewTableNameValidWithOptions(CheckNewTableNameValidRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckNewTableNameValid", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CheckNewTableNameValidResponse());
    }

    public CheckNewTableNameValidResponse checkNewTableNameValid(CheckNewTableNameValidRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkNewTableNameValidWithOptions(request, runtime);
    }

    public DescribeTableShardingInfoResponse describeTableShardingInfoWithOptions(DescribeTableShardingInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTableShardingInfo", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTableShardingInfoResponse());
    }

    public DescribeTableShardingInfoResponse describeTableShardingInfo(DescribeTableShardingInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTableShardingInfoWithOptions(request, runtime);
    }

    public SubmitCleanTableShardingKeyModifyResponse submitCleanTableShardingKeyModifyWithOptions(SubmitCleanTableShardingKeyModifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitCleanTableShardingKeyModify", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitCleanTableShardingKeyModifyResponse());
    }

    public SubmitCleanTableShardingKeyModifyResponse submitCleanTableShardingKeyModify(SubmitCleanTableShardingKeyModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitCleanTableShardingKeyModifyWithOptions(request, runtime);
    }

    public SubmitRollbackShardingKeyModifyResponse submitRollbackShardingKeyModifyWithOptions(SubmitRollbackShardingKeyModifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitRollbackShardingKeyModify", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitRollbackShardingKeyModifyResponse());
    }

    public SubmitRollbackShardingKeyModifyResponse submitRollbackShardingKeyModify(SubmitRollbackShardingKeyModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitRollbackShardingKeyModifyWithOptions(request, runtime);
    }

    public SubmitSwitchTableShardingKeyModifyResponse submitSwitchTableShardingKeyModifyWithOptions(SubmitSwitchTableShardingKeyModifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitSwitchTableShardingKeyModify", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitSwitchTableShardingKeyModifyResponse());
    }

    public SubmitSwitchTableShardingKeyModifyResponse submitSwitchTableShardingKeyModify(SubmitSwitchTableShardingKeyModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSwitchTableShardingKeyModifyWithOptions(request, runtime);
    }

    public SubmitTableShardingKeyModifyResponse submitTableShardingKeyModifyWithOptions(SubmitTableShardingKeyModifyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitTableShardingKeyModify", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitTableShardingKeyModifyResponse());
    }

    public SubmitTableShardingKeyModifyResponse submitTableShardingKeyModify(SubmitTableShardingKeyModifyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitTableShardingKeyModifyWithOptions(request, runtime);
    }

    public PreCheckModifyTableShardingKeyParamResponse preCheckModifyTableShardingKeyParamWithOptions(PreCheckModifyTableShardingKeyParamRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PreCheckModifyTableShardingKeyParam", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new PreCheckModifyTableShardingKeyParamResponse());
    }

    public PreCheckModifyTableShardingKeyParamResponse preCheckModifyTableShardingKeyParam(PreCheckModifyTableShardingKeyParamRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preCheckModifyTableShardingKeyParamWithOptions(request, runtime);
    }

    public SqlCompatibilityStartResponse sqlCompatibilityStartWithOptions(SqlCompatibilityStartRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SqlCompatibilityStart", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SqlCompatibilityStartResponse());
    }

    public SqlCompatibilityStartResponse sqlCompatibilityStart(SqlCompatibilityStartRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sqlCompatibilityStartWithOptions(request, runtime);
    }

    public SqlCompatibilityCancelResponse sqlCompatibilityCancelWithOptions(SqlCompatibilityCancelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SqlCompatibilityCancel", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SqlCompatibilityCancelResponse());
    }

    public SqlCompatibilityCancelResponse sqlCompatibilityCancel(SqlCompatibilityCancelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.sqlCompatibilityCancelWithOptions(request, runtime);
    }

    public ListVersionsResponse listVersionsWithOptions(ListVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListVersions", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ListVersionsResponse());
    }

    public ListVersionsResponse listVersions(ListVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listVersionsWithOptions(request, runtime);
    }

    public ListUserReportsResponse listUserReportsWithOptions(ListUserReportsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListUserReports", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ListUserReportsResponse());
    }

    public ListUserReportsResponse listUserReports(ListUserReportsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserReportsWithOptions(request, runtime);
    }

    public DescribeHiStoreInstanceInfoResponse describeHiStoreInstanceInfoWithOptions(DescribeHiStoreInstanceInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeHiStoreInstanceInfo", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeHiStoreInstanceInfoResponse());
    }

    public DescribeHiStoreInstanceInfoResponse describeHiStoreInstanceInfo(DescribeHiStoreInstanceInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHiStoreInstanceInfoWithOptions(request, runtime);
    }

    public RollbackHiStoreInstanceResponse rollbackHiStoreInstanceWithOptions(RollbackHiStoreInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RollbackHiStoreInstance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RollbackHiStoreInstanceResponse());
    }

    public RollbackHiStoreInstanceResponse rollbackHiStoreInstance(RollbackHiStoreInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackHiStoreInstanceWithOptions(request, runtime);
    }

    public ModifyPolarDbReadWeightResponse modifyPolarDbReadWeightWithOptions(ModifyPolarDbReadWeightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyPolarDbReadWeight", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ModifyPolarDbReadWeightResponse());
    }

    public ModifyPolarDbReadWeightResponse modifyPolarDbReadWeight(ModifyPolarDbReadWeightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPolarDbReadWeightWithOptions(request, runtime);
    }

    public DatalinkReplicationPrecheckResponse datalinkReplicationPrecheckWithOptions(DatalinkReplicationPrecheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DatalinkReplicationPrecheck", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DatalinkReplicationPrecheckResponse());
    }

    public DatalinkReplicationPrecheckResponse datalinkReplicationPrecheck(DatalinkReplicationPrecheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.datalinkReplicationPrecheckWithOptions(request, runtime);
    }

    public ReleaseHiStoreInstanceResponse releaseHiStoreInstanceWithOptions(ReleaseHiStoreInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseHiStoreInstance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseHiStoreInstanceResponse());
    }

    public ReleaseHiStoreInstanceResponse releaseHiStoreInstance(ReleaseHiStoreInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseHiStoreInstanceWithOptions(request, runtime);
    }

    public SubmitSmoothExpandPreCheckResponse submitSmoothExpandPreCheckWithOptions(SubmitSmoothExpandPreCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitSmoothExpandPreCheck", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitSmoothExpandPreCheckResponse());
    }

    public SubmitSmoothExpandPreCheckResponse submitSmoothExpandPreCheck(SubmitSmoothExpandPreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSmoothExpandPreCheckWithOptions(request, runtime);
    }

    public DescribeDrdsDBClusterResponse describeDrdsDBClusterWithOptions(DescribeDrdsDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDBCluster", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDBClusterResponse());
    }

    public DescribeDrdsDBClusterResponse describeDrdsDBCluster(DescribeDrdsDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDBClusterWithOptions(request, runtime);
    }

    public SubmitHotExpandPreCheckTaskResponse submitHotExpandPreCheckTaskWithOptions(SubmitHotExpandPreCheckTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitHotExpandPreCheckTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitHotExpandPreCheckTaskResponse());
    }

    public SubmitHotExpandPreCheckTaskResponse submitHotExpandPreCheckTask(SubmitHotExpandPreCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitHotExpandPreCheckTaskWithOptions(request, runtime);
    }

    public UpgradeHiStoreInstanceResponse upgradeHiStoreInstanceWithOptions(UpgradeHiStoreInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpgradeHiStoreInstance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new UpgradeHiStoreInstanceResponse());
    }

    public UpgradeHiStoreInstanceResponse upgradeHiStoreInstance(UpgradeHiStoreInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeHiStoreInstanceWithOptions(request, runtime);
    }

    public SubmitSmoothExpandPreCheckTaskResponse submitSmoothExpandPreCheckTaskWithOptions(SubmitSmoothExpandPreCheckTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitSmoothExpandPreCheckTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitSmoothExpandPreCheckTaskResponse());
    }

    public SubmitSmoothExpandPreCheckTaskResponse submitSmoothExpandPreCheckTask(SubmitSmoothExpandPreCheckTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSmoothExpandPreCheckTaskWithOptions(request, runtime);
    }

    public DescribePreCheckResultResponse describePreCheckResultWithOptions(DescribePreCheckResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribePreCheckResult", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribePreCheckResultResponse());
    }

    public DescribePreCheckResultResponse describePreCheckResult(DescribePreCheckResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePreCheckResultWithOptions(request, runtime);
    }

    public DescribeRDSPerformanceResponse describeRDSPerformanceWithOptions(DescribeRDSPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRDSPerformance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRDSPerformanceResponse());
    }

    public DescribeRDSPerformanceResponse describeRDSPerformance(DescribeRDSPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRDSPerformanceWithOptions(request, runtime);
    }

    public UpdateInstanceNetworkResponse updateInstanceNetworkWithOptions(UpdateInstanceNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateInstanceNetwork", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new UpdateInstanceNetworkResponse());
    }

    public UpdateInstanceNetworkResponse updateInstanceNetwork(UpdateInstanceNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceNetworkWithOptions(request, runtime);
    }

    public DescribeDrdsSqlAuditStatusResponse describeDrdsSqlAuditStatusWithOptions(DescribeDrdsSqlAuditStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsSqlAuditStatus", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsSqlAuditStatusResponse());
    }

    public DescribeDrdsSqlAuditStatusResponse describeDrdsSqlAuditStatus(DescribeDrdsSqlAuditStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsSqlAuditStatusWithOptions(request, runtime);
    }

    public DescribeDrdsDbRdsNameListResponse describeDrdsDbRdsNameListWithOptions(DescribeDrdsDbRdsNameListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDbRdsNameList", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDbRdsNameListResponse());
    }

    public DescribeDrdsDbRdsNameListResponse describeDrdsDbRdsNameList(DescribeDrdsDbRdsNameListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDbRdsNameListWithOptions(request, runtime);
    }

    public SwitchGlobalBroadcastTypeResponse switchGlobalBroadcastTypeWithOptions(SwitchGlobalBroadcastTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SwitchGlobalBroadcastType", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SwitchGlobalBroadcastTypeResponse());
    }

    public SwitchGlobalBroadcastTypeResponse switchGlobalBroadcastType(SwitchGlobalBroadcastTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchGlobalBroadcastTypeWithOptions(request, runtime);
    }

    public ResetDrdsToRdsConnectionsResponse resetDrdsToRdsConnectionsWithOptions(ResetDrdsToRdsConnectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResetDrdsToRdsConnections", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ResetDrdsToRdsConnectionsResponse());
    }

    public ResetDrdsToRdsConnectionsResponse resetDrdsToRdsConnections(ResetDrdsToRdsConnectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetDrdsToRdsConnectionsWithOptions(request, runtime);
    }

    public DescribeInstanceSwitchAzoneResponse describeInstanceSwitchAzoneWithOptions(DescribeInstanceSwitchAzoneRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceSwitchAzone", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceSwitchAzoneResponse());
    }

    public DescribeInstanceSwitchAzoneResponse describeInstanceSwitchAzone(DescribeInstanceSwitchAzoneRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSwitchAzoneWithOptions(request, runtime);
    }

    public DescribeInstanceSwitchNetworkResponse describeInstanceSwitchNetworkWithOptions(DescribeInstanceSwitchNetworkRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceSwitchNetwork", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceSwitchNetworkResponse());
    }

    public DescribeInstanceSwitchNetworkResponse describeInstanceSwitchNetwork(DescribeInstanceSwitchNetworkRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceSwitchNetworkWithOptions(request, runtime);
    }

    public DescribeDbInstancesResponse describeDbInstancesWithOptions(DescribeDbInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDbInstances", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDbInstancesResponse());
    }

    public DescribeDbInstancesResponse describeDbInstances(DescribeDbInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDbInstancesWithOptions(request, runtime);
    }

    public DescribeDrdsInstancesResponse describeDrdsInstancesWithOptions(DescribeDrdsInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsInstances", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsInstancesResponse());
    }

    public DescribeDrdsInstancesResponse describeDrdsInstances(DescribeDrdsInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstancesWithOptions(request, runtime);
    }

    public DescribeDrdsDBsResponse describeDrdsDBsWithOptions(DescribeDrdsDBsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDBs", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDBsResponse());
    }

    public DescribeDrdsDBsResponse describeDrdsDBs(DescribeDrdsDBsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDBsWithOptions(request, runtime);
    }

    public DescribeDrdsInstanceResponse describeDrdsInstanceWithOptions(DescribeDrdsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsInstance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsInstanceResponse());
    }

    public DescribeDrdsInstanceResponse describeDrdsInstance(DescribeDrdsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceWithOptions(request, runtime);
    }

    public DescribeDrdsInstanceVersionResponse describeDrdsInstanceVersionWithOptions(DescribeDrdsInstanceVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsInstanceVersion", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsInstanceVersionResponse());
    }

    public DescribeDrdsInstanceVersionResponse describeDrdsInstanceVersion(DescribeDrdsInstanceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceVersionWithOptions(request, runtime);
    }

    public DescribeRdsSuperAccountInstancesResponse describeRdsSuperAccountInstancesWithOptions(DescribeRdsSuperAccountInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRdsSuperAccountInstances", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRdsSuperAccountInstancesResponse());
    }

    public DescribeRdsSuperAccountInstancesResponse describeRdsSuperAccountInstances(DescribeRdsSuperAccountInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsSuperAccountInstancesWithOptions(request, runtime);
    }

    public DescribeDrdsDBResponse describeDrdsDBWithOptions(DescribeDrdsDBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDB", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDBResponse());
    }

    public DescribeDrdsDBResponse describeDrdsDB(DescribeDrdsDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDBWithOptions(request, runtime);
    }

    public CreateDrdsDBResponse createDrdsDBWithOptions(CreateDrdsDBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDrdsDB", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateDrdsDBResponse());
    }

    public CreateDrdsDBResponse createDrdsDB(CreateDrdsDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDrdsDBWithOptions(request, runtime);
    }

    public ModifyRdsReadWeightResponse modifyRdsReadWeightWithOptions(ModifyRdsReadWeightRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyRdsReadWeight", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ModifyRdsReadWeightResponse());
    }

    public ModifyRdsReadWeightResponse modifyRdsReadWeight(ModifyRdsReadWeightRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyRdsReadWeightWithOptions(request, runtime);
    }

    public CheckDrdsDbNameResponse checkDrdsDbNameWithOptions(CheckDrdsDbNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckDrdsDbName", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CheckDrdsDbNameResponse());
    }

    public CheckDrdsDbNameResponse checkDrdsDbName(CheckDrdsDbNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkDrdsDbNameWithOptions(request, runtime);
    }

    public DescribeInstanceAccountsResponse describeInstanceAccountsWithOptions(DescribeInstanceAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceAccounts", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceAccountsResponse());
    }

    public DescribeInstanceAccountsResponse describeInstanceAccounts(DescribeInstanceAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceAccountsWithOptions(request, runtime);
    }

    public DescribeDrdsDbInstanceResponse describeDrdsDbInstanceWithOptions(DescribeDrdsDbInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDbInstance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDbInstanceResponse());
    }

    public DescribeDrdsDbInstanceResponse describeDrdsDbInstance(DescribeDrdsDbInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDbInstanceWithOptions(request, runtime);
    }

    public DescribeDrdsDbInstancesResponse describeDrdsDbInstancesWithOptions(DescribeDrdsDbInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDbInstances", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDbInstancesResponse());
    }

    public DescribeDrdsDbInstancesResponse describeDrdsDbInstances(DescribeDrdsDbInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDbInstancesWithOptions(request, runtime);
    }

    public DescribeDrdsShardingDbsResponse describeDrdsShardingDbsWithOptions(DescribeDrdsShardingDbsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsShardingDbs", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsShardingDbsResponse());
    }

    public DescribeDrdsShardingDbsResponse describeDrdsShardingDbs(DescribeDrdsShardingDbsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsShardingDbsWithOptions(request, runtime);
    }

    public RemoveDrdsInstanceResponse removeDrdsInstanceWithOptions(RemoveDrdsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveDrdsInstance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveDrdsInstanceResponse());
    }

    public RemoveDrdsInstanceResponse removeDrdsInstance(RemoveDrdsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDrdsInstanceWithOptions(request, runtime);
    }

    public CreateInstanceAccountResponse createInstanceAccountWithOptions(CreateInstanceAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateInstanceAccount", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateInstanceAccountResponse());
    }

    public CreateInstanceAccountResponse createInstanceAccount(CreateInstanceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceAccountWithOptions(request, runtime);
    }

    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyAccountDescription", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ModifyAccountDescriptionResponse());
    }

    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    public ChangeAccountPasswordResponse changeAccountPasswordWithOptions(ChangeAccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ChangeAccountPassword", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ChangeAccountPasswordResponse());
    }

    public ChangeAccountPasswordResponse changeAccountPassword(ChangeAccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeAccountPasswordWithOptions(request, runtime);
    }

    public RemoveInstanceAccountResponse removeInstanceAccountWithOptions(RemoveInstanceAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveInstanceAccount", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveInstanceAccountResponse());
    }

    public RemoveInstanceAccountResponse removeInstanceAccount(RemoveInstanceAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeInstanceAccountWithOptions(request, runtime);
    }

    public RemoveDrdsDbResponse removeDrdsDbWithOptions(RemoveDrdsDbRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveDrdsDb", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveDrdsDbResponse());
    }

    public RemoveDrdsDbResponse removeDrdsDb(RemoveDrdsDbRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDrdsDbWithOptions(request, runtime);
    }

    public ModifyAccountPrivilegeResponse modifyAccountPrivilegeWithOptions(ModifyAccountPrivilegeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyAccountPrivilege", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ModifyAccountPrivilegeResponse());
    }

    public ModifyAccountPrivilegeResponse modifyAccountPrivilege(ModifyAccountPrivilegeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountPrivilegeWithOptions(request, runtime);
    }

    public DescribeDrdsSlowSqlsResponse describeDrdsSlowSqlsWithOptions(DescribeDrdsSlowSqlsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsSlowSqls", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsSlowSqlsResponse());
    }

    public DescribeDrdsSlowSqlsResponse describeDrdsSlowSqls(DescribeDrdsSlowSqlsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsSlowSqlsWithOptions(request, runtime);
    }

    public ModifyDrdsIpWhiteListResponse modifyDrdsIpWhiteListWithOptions(ModifyDrdsIpWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDrdsIpWhiteList", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDrdsIpWhiteListResponse());
    }

    public ModifyDrdsIpWhiteListResponse modifyDrdsIpWhiteList(ModifyDrdsIpWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDrdsIpWhiteListWithOptions(request, runtime);
    }

    public DescribeDrdsDBIpWhiteListResponse describeDrdsDBIpWhiteListWithOptions(DescribeDrdsDBIpWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDBIpWhiteList", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDBIpWhiteListResponse());
    }

    public DescribeDrdsDBIpWhiteListResponse describeDrdsDBIpWhiteList(DescribeDrdsDBIpWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDBIpWhiteListWithOptions(request, runtime);
    }

    public DescribeDrdsTasksResponse describeDrdsTasksWithOptions(DescribeDrdsTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsTasks", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsTasksResponse());
    }

    public DescribeDrdsTasksResponse describeDrdsTasks(DescribeDrdsTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsTasksWithOptions(request, runtime);
    }

    public RestartDrdsInstanceResponse restartDrdsInstanceWithOptions(RestartDrdsInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RestartDrdsInstance", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RestartDrdsInstanceResponse());
    }

    public RestartDrdsInstanceResponse restartDrdsInstance(RestartDrdsInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDrdsInstanceWithOptions(request, runtime);
    }

    public SubmitSqlFlashbackTaskResponse submitSqlFlashbackTaskWithOptions(SubmitSqlFlashbackTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitSqlFlashbackTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitSqlFlashbackTaskResponse());
    }

    public SubmitSqlFlashbackTaskResponse submitSqlFlashbackTask(SubmitSqlFlashbackTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSqlFlashbackTaskWithOptions(request, runtime);
    }

    public EnableSqlFlashbackMatchSwitchResponse enableSqlFlashbackMatchSwitchWithOptions(EnableSqlFlashbackMatchSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableSqlFlashbackMatchSwitch", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new EnableSqlFlashbackMatchSwitchResponse());
    }

    public EnableSqlFlashbackMatchSwitchResponse enableSqlFlashbackMatchSwitch(EnableSqlFlashbackMatchSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSqlFlashbackMatchSwitchWithOptions(request, runtime);
    }

    public DisableSqlAuditResponse disableSqlAuditWithOptions(DisableSqlAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableSqlAudit", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DisableSqlAuditResponse());
    }

    public DisableSqlAuditResponse disableSqlAudit(DisableSqlAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableSqlAuditWithOptions(request, runtime);
    }

    public CheckSqlAuditEnableStatusResponse checkSqlAuditEnableStatusWithOptions(CheckSqlAuditEnableStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckSqlAuditEnableStatus", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CheckSqlAuditEnableStatusResponse());
    }

    public CheckSqlAuditEnableStatusResponse checkSqlAuditEnableStatus(CheckSqlAuditEnableStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSqlAuditEnableStatusWithOptions(request, runtime);
    }

    public EnableSqlAuditResponse enableSqlAuditWithOptions(EnableSqlAuditRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableSqlAudit", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new EnableSqlAuditResponse());
    }

    public EnableSqlAuditResponse enableSqlAudit(EnableSqlAuditRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableSqlAuditWithOptions(request, runtime);
    }

    public RefreshDrdsAtomUrlResponse refreshDrdsAtomUrlWithOptions(RefreshDrdsAtomUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RefreshDrdsAtomUrl", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RefreshDrdsAtomUrlResponse());
    }

    public RefreshDrdsAtomUrlResponse refreshDrdsAtomUrl(RefreshDrdsAtomUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refreshDrdsAtomUrlWithOptions(request, runtime);
    }

    public DescribeInstanceMenuSwitchResponse describeInstanceMenuSwitchWithOptions(DescribeInstanceMenuSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstanceMenuSwitch", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstanceMenuSwitchResponse());
    }

    public DescribeInstanceMenuSwitchResponse describeInstanceMenuSwitch(DescribeInstanceMenuSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstanceMenuSwitchWithOptions(request, runtime);
    }

    public DescribeDrdsInstanceLevelTasksResponse describeDrdsInstanceLevelTasksWithOptions(DescribeDrdsInstanceLevelTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsInstanceLevelTasks", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsInstanceLevelTasksResponse());
    }

    public DescribeDrdsInstanceLevelTasksResponse describeDrdsInstanceLevelTasks(DescribeDrdsInstanceLevelTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceLevelTasksWithOptions(request, runtime);
    }

    public DescribeBackMenuResponse describeBackMenuWithOptions(DescribeBackMenuRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackMenu", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackMenuResponse());
    }

    public DescribeBackMenuResponse describeBackMenu(DescribeBackMenuRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackMenuWithOptions(request, runtime);
    }

    public DescribeBackupDbsResponse describeBackupDbsWithOptions(DescribeBackupDbsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackupDbs", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackupDbsResponse());
    }

    public DescribeBackupDbsResponse describeBackupDbs(DescribeBackupDbsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupDbsWithOptions(request, runtime);
    }

    public DescribeBackupLocalResponse describeBackupLocalWithOptions(DescribeBackupLocalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackupLocal", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackupLocalResponse());
    }

    public DescribeBackupLocalResponse describeBackupLocal(DescribeBackupLocalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupLocalWithOptions(request, runtime);
    }

    public DescribeBackupSetsResponse describeBackupSetsWithOptions(DescribeBackupSetsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackupSets", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackupSetsResponse());
    }

    public DescribeBackupSetsResponse describeBackupSets(DescribeBackupSetsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupSetsWithOptions(request, runtime);
    }

    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackupPolicy", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackupPolicyResponse());
    }

    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    public DescribeBackupTimesResponse describeBackupTimesWithOptions(DescribeBackupTimesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBackupTimes", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBackupTimesResponse());
    }

    public DescribeBackupTimesResponse describeBackupTimes(DescribeBackupTimesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupTimesWithOptions(request, runtime);
    }

    public DescribeRestoreOrderResponse describeRestoreOrderWithOptions(DescribeRestoreOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRestoreOrder", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRestoreOrderResponse());
    }

    public DescribeRestoreOrderResponse describeRestoreOrder(DescribeRestoreOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRestoreOrderWithOptions(request, runtime);
    }

    public SetBackupLocalResponse setBackupLocalWithOptions(SetBackupLocalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetBackupLocal", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SetBackupLocalResponse());
    }

    public SetBackupLocalResponse setBackupLocal(SetBackupLocalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setBackupLocalWithOptions(request, runtime);
    }

    public RemoveBackupsSetResponse removeBackupsSetWithOptions(RemoveBackupsSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveBackupsSet", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveBackupsSetResponse());
    }

    public RemoveBackupsSetResponse removeBackupsSet(RemoveBackupsSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeBackupsSetWithOptions(request, runtime);
    }

    public SetBackupPolicyResponse setBackupPolicyWithOptions(SetBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetBackupPolicy", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SetBackupPolicyResponse());
    }

    public SetBackupPolicyResponse setBackupPolicy(SetBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setBackupPolicyWithOptions(request, runtime);
    }

    public StartRestoreResponse startRestoreWithOptions(StartRestoreRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartRestore", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new StartRestoreResponse());
    }

    public StartRestoreResponse startRestore(StartRestoreRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startRestoreWithOptions(request, runtime);
    }

    public PutStartBackupResponse putStartBackupWithOptions(PutStartBackupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PutStartBackup", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new PutStartBackupResponse());
    }

    public PutStartBackupResponse putStartBackup(PutStartBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.putStartBackupWithOptions(request, runtime);
    }

    public DescribeDrdsDbTasksResponse describeDrdsDbTasksWithOptions(DescribeDrdsDbTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsDbTasks", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsDbTasksResponse());
    }

    public DescribeDrdsDbTasksResponse describeDrdsDbTasks(DescribeDrdsDbTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsDbTasksWithOptions(request, runtime);
    }

    public SubmitSmoothExpandTaskResponse submitSmoothExpandTaskWithOptions(SubmitSmoothExpandTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitSmoothExpandTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitSmoothExpandTaskResponse());
    }

    public SubmitSmoothExpandTaskResponse submitSmoothExpandTask(SubmitSmoothExpandTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSmoothExpandTaskWithOptions(request, runtime);
    }

    public DescribeDbInstanceDbsResponse describeDbInstanceDbsWithOptions(DescribeDbInstanceDbsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDbInstanceDbs", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDbInstanceDbsResponse());
    }

    public DescribeDbInstanceDbsResponse describeDbInstanceDbs(DescribeDbInstanceDbsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDbInstanceDbsWithOptions(request, runtime);
    }

    public SubmitSwitchTaskResponse submitSwitchTaskWithOptions(SubmitSwitchTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitSwitchTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitSwitchTaskResponse());
    }

    public SubmitSwitchTaskResponse submitSwitchTask(SubmitSwitchTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSwitchTaskWithOptions(request, runtime);
    }

    public SubmitCleanTaskResponse submitCleanTaskWithOptions(SubmitCleanTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitCleanTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitCleanTaskResponse());
    }

    public SubmitCleanTaskResponse submitCleanTask(SubmitCleanTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitCleanTaskWithOptions(request, runtime);
    }

    public SubmitRollbackTaskResponse submitRollbackTaskWithOptions(SubmitRollbackTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitRollbackTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitRollbackTaskResponse());
    }

    public SubmitRollbackTaskResponse submitRollbackTask(SubmitRollbackTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitRollbackTaskWithOptions(request, runtime);
    }

    public SubmitHotExpandTaskResponse submitHotExpandTaskWithOptions(SubmitHotExpandTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SubmitHotExpandTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SubmitHotExpandTaskResponse());
    }

    public SubmitHotExpandTaskResponse submitHotExpandTask(SubmitHotExpandTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitHotExpandTaskWithOptions(request, runtime);
    }

    public CheckExpandStatusResponse checkExpandStatusWithOptions(CheckExpandStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CheckExpandStatus", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CheckExpandStatusResponse());
    }

    public CheckExpandStatusResponse checkExpandStatus(CheckExpandStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkExpandStatusWithOptions(request, runtime);
    }

    public DescribeExpandLogicTableInfoListResponse describeExpandLogicTableInfoListWithOptions(DescribeExpandLogicTableInfoListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeExpandLogicTableInfoList", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeExpandLogicTableInfoListResponse());
    }

    public DescribeExpandLogicTableInfoListResponse describeExpandLogicTableInfoList(DescribeExpandLogicTableInfoListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExpandLogicTableInfoListWithOptions(request, runtime);
    }

    public DescribeHotDbListResponse describeHotDbListWithOptions(DescribeHotDbListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeHotDbList", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeHotDbListResponse());
    }

    public DescribeHotDbListResponse describeHotDbList(DescribeHotDbListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHotDbListWithOptions(request, runtime);
    }

    public DescribeSqlFlashbakTaskResponse describeSqlFlashbakTaskWithOptions(DescribeSqlFlashbakTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeSqlFlashbakTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeSqlFlashbakTaskResponse());
    }

    public DescribeSqlFlashbakTaskResponse describeSqlFlashbakTask(DescribeSqlFlashbakTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSqlFlashbakTaskWithOptions(request, runtime);
    }

    public DescribeInstDbLogInfoResponse describeInstDbLogInfoWithOptions(DescribeInstDbLogInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstDbLogInfo", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstDbLogInfoResponse());
    }

    public DescribeInstDbLogInfoResponse describeInstDbLogInfo(DescribeInstDbLogInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstDbLogInfoWithOptions(request, runtime);
    }

    public DescribeInstDbSlsInfoResponse describeInstDbSlsInfoWithOptions(DescribeInstDbSlsInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeInstDbSlsInfo", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeInstDbSlsInfoResponse());
    }

    public DescribeInstDbSlsInfoResponse describeInstDbSlsInfo(DescribeInstDbSlsInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInstDbSlsInfoWithOptions(request, runtime);
    }

    public RemoveRecycleBinTableResponse removeRecycleBinTableWithOptions(RemoveRecycleBinTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveRecycleBinTable", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveRecycleBinTableResponse());
    }

    public RemoveRecycleBinTableResponse removeRecycleBinTable(RemoveRecycleBinTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeRecycleBinTableWithOptions(request, runtime);
    }

    public CreateShardTaskResponse createShardTaskWithOptions(CreateShardTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateShardTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateShardTaskResponse());
    }

    public CreateShardTaskResponse createShardTask(CreateShardTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createShardTaskWithOptions(request, runtime);
    }

    public EnableInstanceIpv6AddressResponse enableInstanceIpv6AddressWithOptions(EnableInstanceIpv6AddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableInstanceIpv6Address", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new EnableInstanceIpv6AddressResponse());
    }

    public EnableInstanceIpv6AddressResponse enableInstanceIpv6Address(EnableInstanceIpv6AddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableInstanceIpv6AddressWithOptions(request, runtime);
    }

    public DescribeTableResponse describeTableWithOptions(DescribeTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTable", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTableResponse());
    }

    public DescribeTableResponse describeTable(DescribeTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTableWithOptions(request, runtime);
    }

    public UpgradeInstanceVersionResponse upgradeInstanceVersionWithOptions(UpgradeInstanceVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpgradeInstanceVersion", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new UpgradeInstanceVersionResponse());
    }

    public UpgradeInstanceVersionResponse upgradeInstanceVersion(UpgradeInstanceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeInstanceVersionWithOptions(request, runtime);
    }

    public DescribeTableListByTypeResponse describeTableListByTypeWithOptions(DescribeTableListByTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTableListByType", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTableListByTypeResponse());
    }

    public DescribeTableListByTypeResponse describeTableListByType(DescribeTableListByTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTableListByTypeWithOptions(request, runtime);
    }

    public ValidateShardTaskResponse validateShardTaskWithOptions(ValidateShardTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ValidateShardTask", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ValidateShardTaskResponse());
    }

    public ValidateShardTaskResponse validateShardTask(ValidateShardTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.validateShardTaskWithOptions(request, runtime);
    }

    public DescribeTablesResponse describeTablesWithOptions(DescribeTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeTables", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeTablesResponse());
    }

    public DescribeTablesResponse describeTables(DescribeTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTablesWithOptions(request, runtime);
    }

    public DescribeShardTaskListResponse describeShardTaskListWithOptions(DescribeShardTaskListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeShardTaskList", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeShardTaskListResponse());
    }

    public DescribeShardTaskListResponse describeShardTaskList(DescribeShardTaskListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeShardTaskListWithOptions(request, runtime);
    }

    public CreateInstanceInternetAddressResponse createInstanceInternetAddressWithOptions(CreateInstanceInternetAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateInstanceInternetAddress", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateInstanceInternetAddressResponse());
    }

    public CreateInstanceInternetAddressResponse createInstanceInternetAddress(CreateInstanceInternetAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createInstanceInternetAddressWithOptions(request, runtime);
    }

    public DescribeBroadcastTablesResponse describeBroadcastTablesWithOptions(DescribeBroadcastTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeBroadcastTables", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeBroadcastTablesResponse());
    }

    public DescribeBroadcastTablesResponse describeBroadcastTables(DescribeBroadcastTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBroadcastTablesWithOptions(request, runtime);
    }

    public FlashbackRecycleBinTableResponse flashbackRecycleBinTableWithOptions(FlashbackRecycleBinTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("FlashbackRecycleBinTable", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new FlashbackRecycleBinTableResponse());
    }

    public FlashbackRecycleBinTableResponse flashbackRecycleBinTable(FlashbackRecycleBinTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.flashbackRecycleBinTableWithOptions(request, runtime);
    }

    public SetupBroadcastTablesResponse setupBroadcastTablesWithOptions(SetupBroadcastTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetupBroadcastTables", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SetupBroadcastTablesResponse());
    }

    public SetupBroadcastTablesResponse setupBroadcastTables(SetupBroadcastTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setupBroadcastTablesWithOptions(request, runtime);
    }

    public RollbackInstanceVersionResponse rollbackInstanceVersionWithOptions(RollbackInstanceVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RollbackInstanceVersion", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RollbackInstanceVersionResponse());
    }

    public RollbackInstanceVersionResponse rollbackInstanceVersion(RollbackInstanceVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rollbackInstanceVersionWithOptions(request, runtime);
    }

    public DescribeGlobalBroadcastTypeResponse describeGlobalBroadcastTypeWithOptions(DescribeGlobalBroadcastTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeGlobalBroadcastType", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeGlobalBroadcastTypeResponse());
    }

    public DescribeGlobalBroadcastTypeResponse describeGlobalBroadcastType(DescribeGlobalBroadcastTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeGlobalBroadcastTypeWithOptions(request, runtime);
    }

    public ReleaseInstanceInternetAddressResponse releaseInstanceInternetAddressWithOptions(ReleaseInstanceInternetAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseInstanceInternetAddress", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseInstanceInternetAddressResponse());
    }

    public ReleaseInstanceInternetAddressResponse releaseInstanceInternetAddress(ReleaseInstanceInternetAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstanceInternetAddressWithOptions(request, runtime);
    }

    public DescribeRecycleBinTablesResponse describeRecycleBinTablesWithOptions(DescribeRecycleBinTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRecycleBinTables", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRecycleBinTablesResponse());
    }

    public DescribeRecycleBinTablesResponse describeRecycleBinTables(DescribeRecycleBinTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecycleBinTablesWithOptions(request, runtime);
    }

    public DescribeDrdsParamsResponse describeDrdsParamsWithOptions(DescribeDrdsParamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsParams", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsParamsResponse());
    }

    public DescribeDrdsParamsResponse describeDrdsParams(DescribeDrdsParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsParamsWithOptions(request, runtime);
    }

    public DeleteShardTasksResponse deleteShardTasksWithOptions(DeleteShardTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteShardTasks", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DeleteShardTasksResponse());
    }

    public DeleteShardTasksResponse deleteShardTasks(DeleteShardTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteShardTasksWithOptions(request, runtime);
    }

    public SetupTableResponse setupTableWithOptions(SetupTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetupTable", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SetupTableResponse());
    }

    public SetupTableResponse setupTable(SetupTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setupTableWithOptions(request, runtime);
    }

    public SetupDrdsParamsResponse setupDrdsParamsWithOptions(SetupDrdsParamsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetupDrdsParams", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SetupDrdsParamsResponse());
    }

    public SetupDrdsParamsResponse setupDrdsParams(SetupDrdsParamsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setupDrdsParamsWithOptions(request, runtime);
    }

    public DescribeRecycleBinStatusResponse describeRecycleBinStatusWithOptions(DescribeRecycleBinStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRecycleBinStatus", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRecycleBinStatusResponse());
    }

    public DescribeRecycleBinStatusResponse describeRecycleBinStatus(DescribeRecycleBinStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRecycleBinStatusWithOptions(request, runtime);
    }

    public DescribeShardTaskInfoResponse describeShardTaskInfoWithOptions(DescribeShardTaskInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeShardTaskInfo", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeShardTaskInfoResponse());
    }

    public DescribeShardTaskInfoResponse describeShardTaskInfo(DescribeShardTaskInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeShardTaskInfoWithOptions(request, runtime);
    }

    public SetupRecycleBinStatusResponse setupRecycleBinStatusWithOptions(SetupRecycleBinStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetupRecycleBinStatus", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new SetupRecycleBinStatusResponse());
    }

    public SetupRecycleBinStatusResponse setupRecycleBinStatus(SetupRecycleBinStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setupRecycleBinStatusWithOptions(request, runtime);
    }

    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UntagResources", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new UntagResourcesResponse());
    }

    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    public DescribeDrdsInstanceMonitorResponse describeDrdsInstanceMonitorWithOptions(DescribeDrdsInstanceMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsInstanceMonitor", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsInstanceMonitorResponse());
    }

    public DescribeDrdsInstanceMonitorResponse describeDrdsInstanceMonitor(DescribeDrdsInstanceMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceMonitorWithOptions(request, runtime);
    }

    public DescribeDrdsInstanceDbMonitorResponse describeDrdsInstanceDbMonitorWithOptions(DescribeDrdsInstanceDbMonitorRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeDrdsInstanceDbMonitor", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeDrdsInstanceDbMonitorResponse());
    }

    public DescribeDrdsInstanceDbMonitorResponse describeDrdsInstanceDbMonitor(DescribeDrdsInstanceDbMonitorRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDrdsInstanceDbMonitorWithOptions(request, runtime);
    }

    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TagResources", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new TagResourcesResponse());
    }

    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    public RemoveDrdsDbFailedRecordResponse removeDrdsDbFailedRecordWithOptions(RemoveDrdsDbFailedRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveDrdsDbFailedRecord", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new RemoveDrdsDbFailedRecordResponse());
    }

    public RemoveDrdsDbFailedRecordResponse removeDrdsDbFailedRecord(RemoveDrdsDbFailedRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.removeDrdsDbFailedRecordWithOptions(request, runtime);
    }

    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTagResources", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ListTagResourcesResponse());
    }

    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    public DescribeRdsCommodityResponse describeRdsCommodityWithOptions(DescribeRdsCommodityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRdsCommodity", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRdsCommodityResponse());
    }

    public DescribeRdsCommodityResponse describeRdsCommodity(DescribeRdsCommodityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsCommodityWithOptions(request, runtime);
    }

    public CreateOrderForRdsResponse createOrderForRdsWithOptions(CreateOrderForRdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateOrderForRds", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new CreateOrderForRdsResponse());
    }

    public CreateOrderForRdsResponse createOrderForRds(CreateOrderForRdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderForRdsWithOptions(request, runtime);
    }

    public DescribeRdsPerformanceSummaryResponse describeRdsPerformanceSummaryWithOptions(DescribeRdsPerformanceSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DescribeRdsPerformanceSummary", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new DescribeRdsPerformanceSummaryResponse());
    }

    public DescribeRdsPerformanceSummaryResponse describeRdsPerformanceSummary(DescribeRdsPerformanceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsPerformanceSummaryWithOptions(request, runtime);
    }

    public ModifyDrdsInstanceDescriptionResponse modifyDrdsInstanceDescriptionWithOptions(ModifyDrdsInstanceDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ModifyDrdsInstanceDescription", "HTTPS", "POST", "2019-01-23", "AK", null, TeaModel.buildMap(request), runtime), new ModifyDrdsInstanceDescriptionResponse());
    }

    public ModifyDrdsInstanceDescriptionResponse modifyDrdsInstanceDescription(ModifyDrdsInstanceDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDrdsInstanceDescriptionWithOptions(request, runtime);
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
