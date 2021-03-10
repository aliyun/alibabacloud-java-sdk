// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iot20180120;

import com.aliyun.tea.*;
import com.aliyun.iot20180120.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.common.*;
import com.aliyun.tearpc.*;
import com.aliyun.tearpc.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.tearpc.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-2-pop", "iot.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-south-1", "iot.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "iot.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "iot.ap-northeast-1.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "iot.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "iot.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-chengdu", "iot.aliyuncs.com"),
            new TeaPair("cn-edge-1", "iot.aliyuncs.com"),
            new TeaPair("cn-fujian", "iot.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "iot.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "iot.aliyuncs.com"),
            new TeaPair("cn-hongkong", "iot.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "iot.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "iot.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "iot.aliyuncs.com"),
            new TeaPair("cn-qingdao", "iot.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "iot.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "iot.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-wuhan", "iot.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "iot.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "iot.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "iot.aliyuncs.com"),
            new TeaPair("eu-west-1", "iot.ap-northeast-1.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "iot.ap-northeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "iot.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "iot.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("iot", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
    }


    public ListAnalyticsDataResponse listAnalyticsDataWithOptions(ListAnalyticsDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListAnalyticsData", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListAnalyticsDataResponse());
    }

    public ListAnalyticsDataResponse listAnalyticsData(ListAnalyticsDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAnalyticsDataWithOptions(request, runtime);
    }

    public BatchBindDevicesIntoProjectResponse batchBindDevicesIntoProjectWithOptions(BatchBindDevicesIntoProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchBindDevicesIntoProject", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchBindDevicesIntoProjectResponse());
    }

    public BatchBindDevicesIntoProjectResponse batchBindDevicesIntoProject(BatchBindDevicesIntoProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchBindDevicesIntoProjectWithOptions(request, runtime);
    }

    public BatchBindProductsIntoProjectResponse batchBindProductsIntoProjectWithOptions(BatchBindProductsIntoProjectRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchBindProductsIntoProject", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchBindProductsIntoProjectResponse());
    }

    public BatchBindProductsIntoProjectResponse batchBindProductsIntoProject(BatchBindProductsIntoProjectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchBindProductsIntoProjectWithOptions(request, runtime);
    }

    public BatchUnbindProjectDevicesResponse batchUnbindProjectDevicesWithOptions(BatchUnbindProjectDevicesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchUnbindProjectDevices", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchUnbindProjectDevicesResponse());
    }

    public BatchUnbindProjectDevicesResponse batchUnbindProjectDevices(BatchUnbindProjectDevicesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUnbindProjectDevicesWithOptions(request, runtime);
    }

    public BatchUnbindProjectProductsResponse batchUnbindProjectProductsWithOptions(BatchUnbindProjectProductsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchUnbindProjectProducts", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchUnbindProjectProductsResponse());
    }

    public BatchUnbindProjectProductsResponse batchUnbindProjectProducts(BatchUnbindProjectProductsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUnbindProjectProductsWithOptions(request, runtime);
    }

    public SyncSpeechByCombinationResponse syncSpeechByCombinationWithOptions(SyncSpeechByCombinationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SyncSpeechByCombination", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new SyncSpeechByCombinationResponse());
    }

    public SyncSpeechByCombinationResponse syncSpeechByCombination(SyncSpeechByCombinationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncSpeechByCombinationWithOptions(request, runtime);
    }

    public OpenIotServiceResponse openIotServiceWithOptions(OpenIotServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("OpenIotService", "HTTPS", "POST", "2018-01-20", "AK,APP,PrivateKey,BearerToken", null, TeaModel.buildMap(request), runtime), new OpenIotServiceResponse());
    }

    public OpenIotServiceResponse openIotService(OpenIotServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.openIotServiceWithOptions(request, runtime);
    }

    public CreateRulengDistributeJobResponse createRulengDistributeJobWithOptions(CreateRulengDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRulengDistributeJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateRulengDistributeJobResponse());
    }

    public CreateRulengDistributeJobResponse createRulengDistributeJob(CreateRulengDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRulengDistributeJobWithOptions(request, runtime);
    }

    public ListTaskByPageResponse listTaskByPageWithOptions(ListTaskByPageRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        ListTaskByPageShrinkRequest request = new ListTaskByPageShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.device)) {
            request.deviceShrink = com.aliyun.teautil.Common.toJSONString(tmp.device);
        }

        return TeaModel.toModel(this.doRequest("ListTaskByPage", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListTaskByPageResponse());
    }

    public ListTaskByPageResponse listTaskByPage(ListTaskByPageRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTaskByPageWithOptions(request, runtime);
    }

    public ListTaskResponse listTaskWithOptions(ListTaskRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        ListTaskShrinkRequest request = new ListTaskShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.device)) {
            request.deviceShrink = com.aliyun.teautil.Common.toJSONString(tmp.device);
        }

        return TeaModel.toModel(this.doRequest("ListTask", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListTaskResponse());
    }

    public ListTaskResponse listTask(ListTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTaskWithOptions(request, runtime);
    }

    public QueryJobStatisticsResponse queryJobStatisticsWithOptions(QueryJobStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryJobStatistics", "HTTPS", "GET", "2018-01-20", "AK", TeaModel.buildMap(request), null, runtime), new QueryJobStatisticsResponse());
    }

    public QueryJobStatisticsResponse queryJobStatistics(QueryJobStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryJobStatisticsWithOptions(request, runtime);
    }

    public DeleteJobResponse deleteJobWithOptions(DeleteJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteJobResponse());
    }

    public DeleteJobResponse deleteJob(DeleteJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteJobWithOptions(request, runtime);
    }

    public CancelJobResponse cancelJobWithOptions(CancelJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CancelJobResponse());
    }

    public CancelJobResponse cancelJob(CancelJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelJobWithOptions(request, runtime);
    }

    public ListJobResponse listJobWithOptions(ListJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListJobResponse());
    }

    public ListJobResponse listJob(ListJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listJobWithOptions(request, runtime);
    }

    public QueryJobResponse queryJobWithOptions(QueryJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryJobResponse());
    }

    public QueryJobResponse queryJob(QueryJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryJobWithOptions(request, runtime);
    }

    public UpdateJobResponse updateJobWithOptions(UpdateJobRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        UpdateJobShrinkRequest request = new UpdateJobShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.timeoutConfig)) {
            request.timeoutConfigShrink = com.aliyun.teautil.Common.toJSONString(tmp.timeoutConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.rolloutConfig)) {
            request.rolloutConfigShrink = com.aliyun.teautil.Common.toJSONString(tmp.rolloutConfig);
        }

        return TeaModel.toModel(this.doRequest("UpdateJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateJobResponse());
    }

    public UpdateJobResponse updateJob(UpdateJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateJobWithOptions(request, runtime);
    }

    public CreateJobResponse createJobWithOptions(CreateJobRequest tmp, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmp);
        CreateJobShrinkRequest request = new CreateJobShrinkRequest();
        com.aliyun.common.Common.convert(tmp, request);
        if (!com.aliyun.teautil.Common.isUnset(tmp.jobFile)) {
            request.jobFileShrink = com.aliyun.teautil.Common.toJSONString(tmp.jobFile);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.timeoutConfig)) {
            request.timeoutConfigShrink = com.aliyun.teautil.Common.toJSONString(tmp.timeoutConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.rolloutConfig)) {
            request.rolloutConfigShrink = com.aliyun.teautil.Common.toJSONString(tmp.rolloutConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(tmp.targetConfig)) {
            request.targetConfigShrink = com.aliyun.teautil.Common.toJSONString(tmp.targetConfig);
        }

        return TeaModel.toModel(this.doRequest("CreateJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateJobResponse());
    }

    public CreateJobResponse createJob(CreateJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createJobWithOptions(request, runtime);
    }

    public GenerateFileUploadURLResponse generateFileUploadURLWithOptions(GenerateFileUploadURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GenerateFileUploadURL", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GenerateFileUploadURLResponse());
    }

    public GenerateFileUploadURLResponse generateFileUploadURL(GenerateFileUploadURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateFileUploadURLWithOptions(request, runtime);
    }

    public CreateProductDistributeJobResponse createProductDistributeJobWithOptions(CreateProductDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateProductDistributeJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateProductDistributeJobResponse());
    }

    public CreateProductDistributeJobResponse createProductDistributeJob(CreateProductDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProductDistributeJobWithOptions(request, runtime);
    }

    public QueryDeviceOriginalPropertyDataResponse queryDeviceOriginalPropertyDataWithOptions(QueryDeviceOriginalPropertyDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceOriginalPropertyData", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceOriginalPropertyDataResponse());
    }

    public QueryDeviceOriginalPropertyDataResponse queryDeviceOriginalPropertyData(QueryDeviceOriginalPropertyDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceOriginalPropertyDataWithOptions(request, runtime);
    }

    public QueryDeviceOriginalEventDataResponse queryDeviceOriginalEventDataWithOptions(QueryDeviceOriginalEventDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceOriginalEventData", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceOriginalEventDataResponse());
    }

    public QueryDeviceOriginalEventDataResponse queryDeviceOriginalEventData(QueryDeviceOriginalEventDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceOriginalEventDataWithOptions(request, runtime);
    }

    public QueryDeviceOriginalPropertyStatusResponse queryDeviceOriginalPropertyStatusWithOptions(QueryDeviceOriginalPropertyStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceOriginalPropertyStatus", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceOriginalPropertyStatusResponse());
    }

    public QueryDeviceOriginalPropertyStatusResponse queryDeviceOriginalPropertyStatus(QueryDeviceOriginalPropertyStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceOriginalPropertyStatusWithOptions(request, runtime);
    }

    public QueryDeviceOriginalServiceDataResponse queryDeviceOriginalServiceDataWithOptions(QueryDeviceOriginalServiceDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceOriginalServiceData", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceOriginalServiceDataResponse());
    }

    public QueryDeviceOriginalServiceDataResponse queryDeviceOriginalServiceData(QueryDeviceOriginalServiceDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceOriginalServiceDataWithOptions(request, runtime);
    }

    public CreateThingScriptResponse createThingScriptWithOptions(CreateThingScriptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateThingScript", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateThingScriptResponse());
    }

    public CreateThingScriptResponse createThingScript(CreateThingScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createThingScriptWithOptions(request, runtime);
    }

    public UpdateThingScriptResponse updateThingScriptWithOptions(UpdateThingScriptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateThingScript", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateThingScriptResponse());
    }

    public UpdateThingScriptResponse updateThingScript(UpdateThingScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateThingScriptWithOptions(request, runtime);
    }

    public GetThingScriptResponse getThingScriptWithOptions(GetThingScriptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetThingScript", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetThingScriptResponse());
    }

    public GetThingScriptResponse getThingScript(GetThingScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingScriptWithOptions(request, runtime);
    }

    public ListOTAModuleVersionsByDeviceResponse listOTAModuleVersionsByDeviceWithOptions(ListOTAModuleVersionsByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListOTAModuleVersionsByDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListOTAModuleVersionsByDeviceResponse());
    }

    public ListOTAModuleVersionsByDeviceResponse listOTAModuleVersionsByDevice(ListOTAModuleVersionsByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAModuleVersionsByDeviceWithOptions(request, runtime);
    }

    public BatchPubResponse batchPubWithOptions(BatchPubRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchPub", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchPubResponse());
    }

    public BatchPubResponse batchPub(BatchPubRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchPubWithOptions(request, runtime);
    }

    public SpeechByCombinationResponse speechByCombinationWithOptions(SpeechByCombinationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SpeechByCombination", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new SpeechByCombinationResponse());
    }

    public SpeechByCombinationResponse speechByCombination(SpeechByCombinationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.speechByCombinationWithOptions(request, runtime);
    }

    public UpdateThingModelValidationConfigResponse updateThingModelValidationConfigWithOptions(UpdateThingModelValidationConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateThingModelValidationConfig", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateThingModelValidationConfigResponse());
    }

    public UpdateThingModelValidationConfigResponse updateThingModelValidationConfig(UpdateThingModelValidationConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateThingModelValidationConfigWithOptions(request, runtime);
    }

    public QueryDeviceBySQLResponse queryDeviceBySQLWithOptions(QueryDeviceBySQLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceBySQL", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceBySQLResponse());
    }

    public QueryDeviceBySQLResponse queryDeviceBySQL(QueryDeviceBySQLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceBySQLWithOptions(request, runtime);
    }

    public ListOTAModuleByProductResponse listOTAModuleByProductWithOptions(ListOTAModuleByProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListOTAModuleByProduct", "HTTPS", "GET", "2018-01-20", "AK", TeaModel.buildMap(request), null, runtime), new ListOTAModuleByProductResponse());
    }

    public ListOTAModuleByProductResponse listOTAModuleByProduct(ListOTAModuleByProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAModuleByProductWithOptions(request, runtime);
    }

    public DeleteOTAModuleResponse deleteOTAModuleWithOptions(DeleteOTAModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteOTAModule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteOTAModuleResponse());
    }

    public DeleteOTAModuleResponse deleteOTAModule(DeleteOTAModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOTAModuleWithOptions(request, runtime);
    }

    public GenerateDeviceNameListURLResponse generateDeviceNameListURLWithOptions(GenerateDeviceNameListURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GenerateDeviceNameListURL", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GenerateDeviceNameListURLResponse());
    }

    public GenerateDeviceNameListURLResponse generateDeviceNameListURL(GenerateDeviceNameListURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateDeviceNameListURLWithOptions(request, runtime);
    }

    public UpdateOTAModuleResponse updateOTAModuleWithOptions(UpdateOTAModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateOTAModule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateOTAModuleResponse());
    }

    public UpdateOTAModuleResponse updateOTAModule(UpdateOTAModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateOTAModuleWithOptions(request, runtime);
    }

    public CreateOTAModuleResponse createOTAModuleWithOptions(CreateOTAModuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateOTAModule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateOTAModuleResponse());
    }

    public CreateOTAModuleResponse createOTAModule(CreateOTAModuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTAModuleWithOptions(request, runtime);
    }

    public QueryThingModelExtendConfigPublishedResponse queryThingModelExtendConfigPublishedWithOptions(QueryThingModelExtendConfigPublishedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryThingModelExtendConfigPublished", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryThingModelExtendConfigPublishedResponse());
    }

    public QueryThingModelExtendConfigPublishedResponse queryThingModelExtendConfigPublished(QueryThingModelExtendConfigPublishedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryThingModelExtendConfigPublishedWithOptions(request, runtime);
    }

    public GetThingModelTslPublishedResponse getThingModelTslPublishedWithOptions(GetThingModelTslPublishedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetThingModelTslPublished", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetThingModelTslPublishedResponse());
    }

    public GetThingModelTslPublishedResponse getThingModelTslPublished(GetThingModelTslPublishedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingModelTslPublishedWithOptions(request, runtime);
    }

    public QueryThingModelPublishedResponse queryThingModelPublishedWithOptions(QueryThingModelPublishedRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryThingModelPublished", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryThingModelPublishedResponse());
    }

    public QueryThingModelPublishedResponse queryThingModelPublished(QueryThingModelPublishedRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryThingModelPublishedWithOptions(request, runtime);
    }

    public QueryThingModelExtendConfigResponse queryThingModelExtendConfigWithOptions(QueryThingModelExtendConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryThingModelExtendConfig", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryThingModelExtendConfigResponse());
    }

    public QueryThingModelExtendConfigResponse queryThingModelExtendConfig(QueryThingModelExtendConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryThingModelExtendConfigWithOptions(request, runtime);
    }

    public ListDistributedDeviceResponse listDistributedDeviceWithOptions(ListDistributedDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDistributedDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListDistributedDeviceResponse());
    }

    public ListDistributedDeviceResponse listDistributedDevice(ListDistributedDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDistributedDeviceWithOptions(request, runtime);
    }

    public ListDistributedProductResponse listDistributedProductWithOptions(ListDistributedProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDistributedProduct", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListDistributedProductResponse());
    }

    public ListDistributedProductResponse listDistributedProduct(ListDistributedProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDistributedProductWithOptions(request, runtime);
    }

    public QuerySubscribeRelationResponse querySubscribeRelationWithOptions(QuerySubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySubscribeRelation", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QuerySubscribeRelationResponse());
    }

    public QuerySubscribeRelationResponse querySubscribeRelation(QuerySubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySubscribeRelationWithOptions(request, runtime);
    }

    public CreateConsumerGroupSubscribeRelationResponse createConsumerGroupSubscribeRelationWithOptions(CreateConsumerGroupSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateConsumerGroupSubscribeRelation", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateConsumerGroupSubscribeRelationResponse());
    }

    public CreateConsumerGroupSubscribeRelationResponse createConsumerGroupSubscribeRelation(CreateConsumerGroupSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConsumerGroupSubscribeRelationWithOptions(request, runtime);
    }

    public UpdateSubscribeRelationResponse updateSubscribeRelationWithOptions(UpdateSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateSubscribeRelation", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateSubscribeRelationResponse());
    }

    public UpdateSubscribeRelationResponse updateSubscribeRelation(UpdateSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSubscribeRelationWithOptions(request, runtime);
    }

    public DeleteConsumerGroupSubscribeRelationResponse deleteConsumerGroupSubscribeRelationWithOptions(DeleteConsumerGroupSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteConsumerGroupSubscribeRelation", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteConsumerGroupSubscribeRelationResponse());
    }

    public DeleteConsumerGroupSubscribeRelationResponse deleteConsumerGroupSubscribeRelation(DeleteConsumerGroupSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConsumerGroupSubscribeRelationWithOptions(request, runtime);
    }

    public ResetConsumerGroupPositionResponse resetConsumerGroupPositionWithOptions(ResetConsumerGroupPositionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResetConsumerGroupPosition", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ResetConsumerGroupPositionResponse());
    }

    public ResetConsumerGroupPositionResponse resetConsumerGroupPosition(ResetConsumerGroupPositionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetConsumerGroupPositionWithOptions(request, runtime);
    }

    public UpdateConsumerGroupResponse updateConsumerGroupWithOptions(UpdateConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateConsumerGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateConsumerGroupResponse());
    }

    public UpdateConsumerGroupResponse updateConsumerGroup(UpdateConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateConsumerGroupWithOptions(request, runtime);
    }

    public BatchDeleteEdgeInstanceChannelResponse batchDeleteEdgeInstanceChannelWithOptions(BatchDeleteEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchDeleteEdgeInstanceChannel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchDeleteEdgeInstanceChannelResponse());
    }

    public BatchDeleteEdgeInstanceChannelResponse batchDeleteEdgeInstanceChannel(BatchDeleteEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteEdgeInstanceChannelWithOptions(request, runtime);
    }

    public BatchSetEdgeInstanceDeviceChannelResponse batchSetEdgeInstanceDeviceChannelWithOptions(BatchSetEdgeInstanceDeviceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchSetEdgeInstanceDeviceChannel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchSetEdgeInstanceDeviceChannelResponse());
    }

    public BatchSetEdgeInstanceDeviceChannelResponse batchSetEdgeInstanceDeviceChannel(BatchSetEdgeInstanceDeviceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetEdgeInstanceDeviceChannelWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceDeviceDriverResponse batchGetEdgeInstanceDeviceDriverWithOptions(BatchGetEdgeInstanceDeviceDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchGetEdgeInstanceDeviceDriver", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchGetEdgeInstanceDeviceDriverResponse());
    }

    public BatchGetEdgeInstanceDeviceDriverResponse batchGetEdgeInstanceDeviceDriver(BatchGetEdgeInstanceDeviceDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceDeviceDriverWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceDeviceChannelResponse batchGetEdgeInstanceDeviceChannelWithOptions(BatchGetEdgeInstanceDeviceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchGetEdgeInstanceDeviceChannel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchGetEdgeInstanceDeviceChannelResponse());
    }

    public BatchGetEdgeInstanceDeviceChannelResponse batchGetEdgeInstanceDeviceChannel(BatchGetEdgeInstanceDeviceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceDeviceChannelWithOptions(request, runtime);
    }

    public ReleaseEdgeDriverVersionResponse releaseEdgeDriverVersionWithOptions(ReleaseEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReleaseEdgeDriverVersion", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ReleaseEdgeDriverVersionResponse());
    }

    public ReleaseEdgeDriverVersionResponse releaseEdgeDriverVersion(ReleaseEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.releaseEdgeDriverVersionWithOptions(request, runtime);
    }

    public QueryEdgeInstanceDeviceByDriverResponse queryEdgeInstanceDeviceByDriverWithOptions(QueryEdgeInstanceDeviceByDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEdgeInstanceDeviceByDriver", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEdgeInstanceDeviceByDriverResponse());
    }

    public QueryEdgeInstanceDeviceByDriverResponse queryEdgeInstanceDeviceByDriver(QueryEdgeInstanceDeviceByDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceDeviceByDriverWithOptions(request, runtime);
    }

    public DisableSceneRuleResponse disableSceneRuleWithOptions(DisableSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableSceneRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DisableSceneRuleResponse());
    }

    public DisableSceneRuleResponse disableSceneRule(DisableSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableSceneRuleWithOptions(request, runtime);
    }

    public TriggerSceneRuleResponse triggerSceneRuleWithOptions(TriggerSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("TriggerSceneRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new TriggerSceneRuleResponse());
    }

    public TriggerSceneRuleResponse triggerSceneRule(TriggerSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.triggerSceneRuleWithOptions(request, runtime);
    }

    public UnbindSceneRuleFromEdgeInstanceResponse unbindSceneRuleFromEdgeInstanceWithOptions(UnbindSceneRuleFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnbindSceneRuleFromEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UnbindSceneRuleFromEdgeInstanceResponse());
    }

    public UnbindSceneRuleFromEdgeInstanceResponse unbindSceneRuleFromEdgeInstance(UnbindSceneRuleFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindSceneRuleFromEdgeInstanceWithOptions(request, runtime);
    }

    public QueryEdgeInstanceSceneRuleResponse queryEdgeInstanceSceneRuleWithOptions(QueryEdgeInstanceSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEdgeInstanceSceneRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEdgeInstanceSceneRuleResponse());
    }

    public QueryEdgeInstanceSceneRuleResponse queryEdgeInstanceSceneRule(QueryEdgeInstanceSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceSceneRuleWithOptions(request, runtime);
    }

    public CreateSceneRuleResponse createSceneRuleWithOptions(CreateSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSceneRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateSceneRuleResponse());
    }

    public CreateSceneRuleResponse createSceneRule(CreateSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSceneRuleWithOptions(request, runtime);
    }

    public QueryDetailSceneRuleLogResponse queryDetailSceneRuleLogWithOptions(QueryDetailSceneRuleLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDetailSceneRuleLog", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDetailSceneRuleLogResponse());
    }

    public QueryDetailSceneRuleLogResponse queryDetailSceneRuleLog(QueryDetailSceneRuleLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDetailSceneRuleLogWithOptions(request, runtime);
    }

    public EnableSceneRuleResponse enableSceneRuleWithOptions(EnableSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableSceneRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new EnableSceneRuleResponse());
    }

    public EnableSceneRuleResponse enableSceneRule(EnableSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableSceneRuleWithOptions(request, runtime);
    }

    public UpdateSceneRuleResponse updateSceneRuleWithOptions(UpdateSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateSceneRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateSceneRuleResponse());
    }

    public UpdateSceneRuleResponse updateSceneRule(UpdateSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSceneRuleWithOptions(request, runtime);
    }

    public QuerySceneRuleResponse querySceneRuleWithOptions(QuerySceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySceneRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QuerySceneRuleResponse());
    }

    public QuerySceneRuleResponse querySceneRule(QuerySceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySceneRuleWithOptions(request, runtime);
    }

    public QuerySummarySceneRuleLogResponse querySummarySceneRuleLogWithOptions(QuerySummarySceneRuleLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySummarySceneRuleLog", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QuerySummarySceneRuleLogResponse());
    }

    public QuerySummarySceneRuleLogResponse querySummarySceneRuleLog(QuerySummarySceneRuleLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySummarySceneRuleLogWithOptions(request, runtime);
    }

    public GetSceneRuleResponse getSceneRuleWithOptions(GetSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetSceneRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetSceneRuleResponse());
    }

    public GetSceneRuleResponse getSceneRule(GetSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSceneRuleWithOptions(request, runtime);
    }

    public DeleteSceneRuleResponse deleteSceneRuleWithOptions(DeleteSceneRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSceneRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSceneRuleResponse());
    }

    public DeleteSceneRuleResponse deleteSceneRule(DeleteSceneRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSceneRuleWithOptions(request, runtime);
    }

    public BindSceneRuleToEdgeInstanceResponse bindSceneRuleToEdgeInstanceWithOptions(BindSceneRuleToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindSceneRuleToEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BindSceneRuleToEdgeInstanceResponse());
    }

    public BindSceneRuleToEdgeInstanceResponse bindSceneRuleToEdgeInstance(BindSceneRuleToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindSceneRuleToEdgeInstanceWithOptions(request, runtime);
    }

    public CreateEdgeOssPreSignedAddressResponse createEdgeOssPreSignedAddressWithOptions(CreateEdgeOssPreSignedAddressRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateEdgeOssPreSignedAddress", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateEdgeOssPreSignedAddressResponse());
    }

    public CreateEdgeOssPreSignedAddressResponse createEdgeOssPreSignedAddress(CreateEdgeOssPreSignedAddressRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeOssPreSignedAddressWithOptions(request, runtime);
    }

    public UpdateEdgeDriverVersionResponse updateEdgeDriverVersionWithOptions(UpdateEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateEdgeDriverVersion", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateEdgeDriverVersionResponse());
    }

    public UpdateEdgeDriverVersionResponse updateEdgeDriverVersion(UpdateEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEdgeDriverVersionWithOptions(request, runtime);
    }

    public DeleteEdgeDriverVersionResponse deleteEdgeDriverVersionWithOptions(DeleteEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteEdgeDriverVersion", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteEdgeDriverVersionResponse());
    }

    public DeleteEdgeDriverVersionResponse deleteEdgeDriverVersion(DeleteEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEdgeDriverVersionWithOptions(request, runtime);
    }

    public CreateEdgeDriverVersionResponse createEdgeDriverVersionWithOptions(CreateEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateEdgeDriverVersion", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateEdgeDriverVersionResponse());
    }

    public CreateEdgeDriverVersionResponse createEdgeDriverVersion(CreateEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeDriverVersionWithOptions(request, runtime);
    }

    public DeleteEdgeDriverResponse deleteEdgeDriverWithOptions(DeleteEdgeDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteEdgeDriver", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteEdgeDriverResponse());
    }

    public DeleteEdgeDriverResponse deleteEdgeDriver(DeleteEdgeDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEdgeDriverWithOptions(request, runtime);
    }

    public QueryEdgeDriverResponse queryEdgeDriverWithOptions(QueryEdgeDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEdgeDriver", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEdgeDriverResponse());
    }

    public QueryEdgeDriverResponse queryEdgeDriver(QueryEdgeDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeDriverWithOptions(request, runtime);
    }

    public BatchGetEdgeDriverResponse batchGetEdgeDriverWithOptions(BatchGetEdgeDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchGetEdgeDriver", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchGetEdgeDriverResponse());
    }

    public BatchGetEdgeDriverResponse batchGetEdgeDriver(BatchGetEdgeDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeDriverWithOptions(request, runtime);
    }

    public CreateEdgeDriverResponse createEdgeDriverWithOptions(CreateEdgeDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateEdgeDriver", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateEdgeDriverResponse());
    }

    public CreateEdgeDriverResponse createEdgeDriver(CreateEdgeDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeDriverWithOptions(request, runtime);
    }

    public GetEdgeDriverVersionResponse getEdgeDriverVersionWithOptions(GetEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetEdgeDriverVersion", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetEdgeDriverVersionResponse());
    }

    public GetEdgeDriverVersionResponse getEdgeDriverVersion(GetEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEdgeDriverVersionWithOptions(request, runtime);
    }

    public QueryEdgeDriverVersionResponse queryEdgeDriverVersionWithOptions(QueryEdgeDriverVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEdgeDriverVersion", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEdgeDriverVersionResponse());
    }

    public QueryEdgeDriverVersionResponse queryEdgeDriverVersion(QueryEdgeDriverVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeDriverVersionWithOptions(request, runtime);
    }

    public BatchGetDeviceBindStatusResponse batchGetDeviceBindStatusWithOptions(BatchGetDeviceBindStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchGetDeviceBindStatus", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchGetDeviceBindStatusResponse());
    }

    public BatchGetDeviceBindStatusResponse batchGetDeviceBindStatus(BatchGetDeviceBindStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetDeviceBindStatusWithOptions(request, runtime);
    }

    public ListOTAJobByDeviceResponse listOTAJobByDeviceWithOptions(ListOTAJobByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListOTAJobByDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListOTAJobByDeviceResponse());
    }

    public ListOTAJobByDeviceResponse listOTAJobByDevice(ListOTAJobByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAJobByDeviceWithOptions(request, runtime);
    }

    public UpdateThingModelResponse updateThingModelWithOptions(UpdateThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateThingModel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateThingModelResponse());
    }

    public UpdateThingModelResponse updateThingModel(UpdateThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateThingModelWithOptions(request, runtime);
    }

    public CreateThingModelResponse createThingModelWithOptions(CreateThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateThingModel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateThingModelResponse());
    }

    public CreateThingModelResponse createThingModel(CreateThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createThingModelWithOptions(request, runtime);
    }

    public ListOTATaskByJobResponse listOTATaskByJobWithOptions(ListOTATaskByJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListOTATaskByJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListOTATaskByJobResponse());
    }

    public ListOTATaskByJobResponse listOTATaskByJob(ListOTATaskByJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTATaskByJobWithOptions(request, runtime);
    }

    public ListThingTemplatesResponse listThingTemplatesWithOptions(ListThingTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListThingTemplates", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListThingTemplatesResponse());
    }

    public ListThingTemplatesResponse listThingTemplates(ListThingTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listThingTemplatesWithOptions(request, runtime);
    }

    public GetThingTemplateResponse getThingTemplateWithOptions(GetThingTemplateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetThingTemplate", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetThingTemplateResponse());
    }

    public GetThingTemplateResponse getThingTemplate(GetThingTemplateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingTemplateWithOptions(request, runtime);
    }

    public ListThingModelVersionResponse listThingModelVersionWithOptions(ListThingModelVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListThingModelVersion", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListThingModelVersionResponse());
    }

    public ListThingModelVersionResponse listThingModelVersion(ListThingModelVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listThingModelVersionWithOptions(request, runtime);
    }

    public ImportThingModelTslResponse importThingModelTslWithOptions(ImportThingModelTslRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ImportThingModelTsl", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ImportThingModelTslResponse());
    }

    public ImportThingModelTslResponse importThingModelTsl(ImportThingModelTslRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.importThingModelTslWithOptions(request, runtime);
    }

    public PublishThingModelResponse publishThingModelWithOptions(PublishThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PublishThingModel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new PublishThingModelResponse());
    }

    public PublishThingModelResponse publishThingModel(PublishThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.publishThingModelWithOptions(request, runtime);
    }

    public CopyThingModelResponse copyThingModelWithOptions(CopyThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CopyThingModel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CopyThingModelResponse());
    }

    public CopyThingModelResponse copyThingModel(CopyThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.copyThingModelWithOptions(request, runtime);
    }

    public GetThingModelTslResponse getThingModelTslWithOptions(GetThingModelTslRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetThingModelTsl", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetThingModelTslResponse());
    }

    public GetThingModelTslResponse getThingModelTsl(GetThingModelTslRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingModelTslWithOptions(request, runtime);
    }

    public QueryThingModelResponse queryThingModelWithOptions(QueryThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryThingModel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryThingModelResponse());
    }

    public QueryThingModelResponse queryThingModel(QueryThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryThingModelWithOptions(request, runtime);
    }

    public DeleteThingModelResponse deleteThingModelWithOptions(DeleteThingModelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteThingModel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteThingModelResponse());
    }

    public DeleteThingModelResponse deleteThingModel(DeleteThingModelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteThingModelWithOptions(request, runtime);
    }

    public UpdateProductFilterConfigResponse updateProductFilterConfigWithOptions(UpdateProductFilterConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateProductFilterConfig", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateProductFilterConfigResponse());
    }

    public UpdateProductFilterConfigResponse updateProductFilterConfig(UpdateProductFilterConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProductFilterConfigWithOptions(request, runtime);
    }

    public CancelOTAStrategyByJobResponse cancelOTAStrategyByJobWithOptions(CancelOTAStrategyByJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelOTAStrategyByJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CancelOTAStrategyByJobResponse());
    }

    public CancelOTAStrategyByJobResponse cancelOTAStrategyByJob(CancelOTAStrategyByJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOTAStrategyByJobWithOptions(request, runtime);
    }

    public ListOTAJobByFirmwareResponse listOTAJobByFirmwareWithOptions(ListOTAJobByFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListOTAJobByFirmware", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListOTAJobByFirmwareResponse());
    }

    public ListOTAJobByFirmwareResponse listOTAJobByFirmware(ListOTAJobByFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAJobByFirmwareWithOptions(request, runtime);
    }

    public ListOTAFirmwareResponse listOTAFirmwareWithOptions(ListOTAFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListOTAFirmware", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListOTAFirmwareResponse());
    }

    public ListOTAFirmwareResponse listOTAFirmware(ListOTAFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOTAFirmwareWithOptions(request, runtime);
    }

    public CancelOTATaskByJobResponse cancelOTATaskByJobWithOptions(CancelOTATaskByJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelOTATaskByJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CancelOTATaskByJobResponse());
    }

    public CancelOTATaskByJobResponse cancelOTATaskByJob(CancelOTATaskByJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOTATaskByJobWithOptions(request, runtime);
    }

    public CreateDeviceDistributeJobResponse createDeviceDistributeJobWithOptions(CreateDeviceDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDeviceDistributeJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateDeviceDistributeJobResponse());
    }

    public CreateDeviceDistributeJobResponse createDeviceDistributeJob(CreateDeviceDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceDistributeJobWithOptions(request, runtime);
    }

    public QueryDeviceDistributeDetailResponse queryDeviceDistributeDetailWithOptions(QueryDeviceDistributeDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceDistributeDetail", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceDistributeDetailResponse());
    }

    public QueryDeviceDistributeDetailResponse queryDeviceDistributeDetail(QueryDeviceDistributeDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceDistributeDetailWithOptions(request, runtime);
    }

    public ListDeviceDistributeJobResponse listDeviceDistributeJobWithOptions(ListDeviceDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDeviceDistributeJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListDeviceDistributeJobResponse());
    }

    public ListDeviceDistributeJobResponse listDeviceDistributeJob(ListDeviceDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDeviceDistributeJobWithOptions(request, runtime);
    }

    public QueryDeviceDistributeJobResponse queryDeviceDistributeJobWithOptions(QueryDeviceDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceDistributeJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceDistributeJobResponse());
    }

    public QueryDeviceDistributeJobResponse queryDeviceDistributeJob(QueryDeviceDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceDistributeJobWithOptions(request, runtime);
    }

    public DeleteDeviceDistributeJobResponse deleteDeviceDistributeJobWithOptions(DeleteDeviceDistributeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDeviceDistributeJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDeviceDistributeJobResponse());
    }

    public DeleteDeviceDistributeJobResponse deleteDeviceDistributeJob(DeleteDeviceDistributeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceDistributeJobWithOptions(request, runtime);
    }

    public QueryDeviceByStatusResponse queryDeviceByStatusWithOptions(QueryDeviceByStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceByStatus", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceByStatusResponse());
    }

    public QueryDeviceByStatusResponse queryDeviceByStatus(QueryDeviceByStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceByStatusWithOptions(request, runtime);
    }

    public GenerateOTAUploadURLResponse generateOTAUploadURLWithOptions(GenerateOTAUploadURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GenerateOTAUploadURL", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GenerateOTAUploadURLResponse());
    }

    public GenerateOTAUploadURLResponse generateOTAUploadURL(GenerateOTAUploadURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.generateOTAUploadURLWithOptions(request, runtime);
    }

    public QueryProductCertInfoResponse queryProductCertInfoWithOptions(QueryProductCertInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryProductCertInfo", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryProductCertInfoResponse());
    }

    public QueryProductCertInfoResponse queryProductCertInfo(QueryProductCertInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductCertInfoWithOptions(request, runtime);
    }

    public SetProductCertInfoResponse setProductCertInfoWithOptions(SetProductCertInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetProductCertInfo", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new SetProductCertInfoResponse());
    }

    public SetProductCertInfoResponse setProductCertInfo(SetProductCertInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setProductCertInfoWithOptions(request, runtime);
    }

    public CreateSubscribeRelationResponse createSubscribeRelationWithOptions(CreateSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateSubscribeRelation", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateSubscribeRelationResponse());
    }

    public CreateSubscribeRelationResponse createSubscribeRelation(CreateSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSubscribeRelationWithOptions(request, runtime);
    }

    public DeleteSubscribeRelationResponse deleteSubscribeRelationWithOptions(DeleteSubscribeRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteSubscribeRelation", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteSubscribeRelationResponse());
    }

    public DeleteSubscribeRelationResponse deleteSubscribeRelation(DeleteSubscribeRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteSubscribeRelationWithOptions(request, runtime);
    }

    public QueryConsumerGroupStatusResponse queryConsumerGroupStatusWithOptions(QueryConsumerGroupStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryConsumerGroupStatus", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryConsumerGroupStatusResponse());
    }

    public QueryConsumerGroupStatusResponse queryConsumerGroupStatus(QueryConsumerGroupStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryConsumerGroupStatusWithOptions(request, runtime);
    }

    public DeleteConsumerGroupResponse deleteConsumerGroupWithOptions(DeleteConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteConsumerGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteConsumerGroupResponse());
    }

    public DeleteConsumerGroupResponse deleteConsumerGroup(DeleteConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteConsumerGroupWithOptions(request, runtime);
    }

    public QueryConsumerGroupListResponse queryConsumerGroupListWithOptions(QueryConsumerGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryConsumerGroupList", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryConsumerGroupListResponse());
    }

    public QueryConsumerGroupListResponse queryConsumerGroupList(QueryConsumerGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryConsumerGroupListWithOptions(request, runtime);
    }

    public QueryConsumerGroupByGroupIdResponse queryConsumerGroupByGroupIdWithOptions(QueryConsumerGroupByGroupIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryConsumerGroupByGroupId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryConsumerGroupByGroupIdResponse());
    }

    public QueryConsumerGroupByGroupIdResponse queryConsumerGroupByGroupId(QueryConsumerGroupByGroupIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryConsumerGroupByGroupIdWithOptions(request, runtime);
    }

    public CreateConsumerGroupResponse createConsumerGroupWithOptions(CreateConsumerGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateConsumerGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateConsumerGroupResponse());
    }

    public CreateConsumerGroupResponse createConsumerGroup(CreateConsumerGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createConsumerGroupWithOptions(request, runtime);
    }

    public CreateOTADynamicUpgradeJobResponse createOTADynamicUpgradeJobWithOptions(CreateOTADynamicUpgradeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateOTADynamicUpgradeJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateOTADynamicUpgradeJobResponse());
    }

    public CreateOTADynamicUpgradeJobResponse createOTADynamicUpgradeJob(CreateOTADynamicUpgradeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTADynamicUpgradeJobWithOptions(request, runtime);
    }

    public CreateOTAStaticUpgradeJobResponse createOTAStaticUpgradeJobWithOptions(CreateOTAStaticUpgradeJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateOTAStaticUpgradeJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateOTAStaticUpgradeJobResponse());
    }

    public CreateOTAStaticUpgradeJobResponse createOTAStaticUpgradeJob(CreateOTAStaticUpgradeJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTAStaticUpgradeJobWithOptions(request, runtime);
    }

    public CreateOTAFirmwareResponse createOTAFirmwareWithOptions(CreateOTAFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateOTAFirmware", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateOTAFirmwareResponse());
    }

    public CreateOTAFirmwareResponse createOTAFirmware(CreateOTAFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTAFirmwareWithOptions(request, runtime);
    }

    public CreateOTAVerifyJobResponse createOTAVerifyJobWithOptions(CreateOTAVerifyJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateOTAVerifyJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateOTAVerifyJobResponse());
    }

    public CreateOTAVerifyJobResponse createOTAVerifyJob(CreateOTAVerifyJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOTAVerifyJobWithOptions(request, runtime);
    }

    public QueryOTAJobResponse queryOTAJobWithOptions(QueryOTAJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryOTAJob", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryOTAJobResponse());
    }

    public QueryOTAJobResponse queryOTAJob(QueryOTAJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOTAJobWithOptions(request, runtime);
    }

    public CancelOTATaskByDeviceResponse cancelOTATaskByDeviceWithOptions(CancelOTATaskByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CancelOTATaskByDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CancelOTATaskByDeviceResponse());
    }

    public CancelOTATaskByDeviceResponse cancelOTATaskByDevice(CancelOTATaskByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.cancelOTATaskByDeviceWithOptions(request, runtime);
    }

    public DeleteOTAFirmwareResponse deleteOTAFirmwareWithOptions(DeleteOTAFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteOTAFirmware", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteOTAFirmwareResponse());
    }

    public DeleteOTAFirmwareResponse deleteOTAFirmware(DeleteOTAFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteOTAFirmwareWithOptions(request, runtime);
    }

    public QueryOTAFirmwareResponse queryOTAFirmwareWithOptions(QueryOTAFirmwareRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryOTAFirmware", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryOTAFirmwareResponse());
    }

    public QueryOTAFirmwareResponse queryOTAFirmware(QueryOTAFirmwareRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryOTAFirmwareWithOptions(request, runtime);
    }

    public UnbindApplicationFromEdgeInstanceResponse unbindApplicationFromEdgeInstanceWithOptions(UnbindApplicationFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnbindApplicationFromEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UnbindApplicationFromEdgeInstanceResponse());
    }

    public UnbindApplicationFromEdgeInstanceResponse unbindApplicationFromEdgeInstance(UnbindApplicationFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindApplicationFromEdgeInstanceWithOptions(request, runtime);
    }

    public BindApplicationToEdgeInstanceResponse bindApplicationToEdgeInstanceWithOptions(BindApplicationToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindApplicationToEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BindApplicationToEdgeInstanceResponse());
    }

    public BindApplicationToEdgeInstanceResponse bindApplicationToEdgeInstance(BindApplicationToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindApplicationToEdgeInstanceWithOptions(request, runtime);
    }

    public QueryCertUrlByApplyIdResponse queryCertUrlByApplyIdWithOptions(QueryCertUrlByApplyIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryCertUrlByApplyId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryCertUrlByApplyIdResponse());
    }

    public QueryCertUrlByApplyIdResponse queryCertUrlByApplyId(QueryCertUrlByApplyIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryCertUrlByApplyIdWithOptions(request, runtime);
    }

    public QueryDeviceCertResponse queryDeviceCertWithOptions(QueryDeviceCertRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceCert", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceCertResponse());
    }

    public QueryDeviceCertResponse queryDeviceCert(QueryDeviceCertRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceCertWithOptions(request, runtime);
    }

    public CloseEdgeInstanceDeploymentResponse closeEdgeInstanceDeploymentWithOptions(CloseEdgeInstanceDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CloseEdgeInstanceDeployment", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CloseEdgeInstanceDeploymentResponse());
    }

    public CloseEdgeInstanceDeploymentResponse closeEdgeInstanceDeployment(CloseEdgeInstanceDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeEdgeInstanceDeploymentWithOptions(request, runtime);
    }

    public UnbindDriverFromEdgeInstanceResponse unbindDriverFromEdgeInstanceWithOptions(UnbindDriverFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnbindDriverFromEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UnbindDriverFromEdgeInstanceResponse());
    }

    public UnbindDriverFromEdgeInstanceResponse unbindDriverFromEdgeInstance(UnbindDriverFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindDriverFromEdgeInstanceWithOptions(request, runtime);
    }

    public ReplaceEdgeInstanceGatewayResponse replaceEdgeInstanceGatewayWithOptions(ReplaceEdgeInstanceGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ReplaceEdgeInstanceGateway", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ReplaceEdgeInstanceGatewayResponse());
    }

    public ReplaceEdgeInstanceGatewayResponse replaceEdgeInstanceGateway(ReplaceEdgeInstanceGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.replaceEdgeInstanceGatewayWithOptions(request, runtime);
    }

    public BindDriverToEdgeInstanceResponse bindDriverToEdgeInstanceWithOptions(BindDriverToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindDriverToEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BindDriverToEdgeInstanceResponse());
    }

    public BindDriverToEdgeInstanceResponse bindDriverToEdgeInstance(BindDriverToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindDriverToEdgeInstanceWithOptions(request, runtime);
    }

    public BatchQueryDeviceDetailResponse batchQueryDeviceDetailWithOptions(BatchQueryDeviceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchQueryDeviceDetail", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchQueryDeviceDetailResponse());
    }

    public BatchQueryDeviceDetailResponse batchQueryDeviceDetail(BatchQueryDeviceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchQueryDeviceDetailWithOptions(request, runtime);
    }

    public GetEdgeInstanceDeploymentResponse getEdgeInstanceDeploymentWithOptions(GetEdgeInstanceDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetEdgeInstanceDeployment", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetEdgeInstanceDeploymentResponse());
    }

    public GetEdgeInstanceDeploymentResponse getEdgeInstanceDeployment(GetEdgeInstanceDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEdgeInstanceDeploymentWithOptions(request, runtime);
    }

    public QueryTaskResponse queryTaskWithOptions(QueryTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryTask", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryTaskResponse());
    }

    public QueryTaskResponse queryTask(QueryTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTaskWithOptions(request, runtime);
    }

    public CreateDataAPIServiceResponse createDataAPIServiceWithOptions(CreateDataAPIServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDataAPIService", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateDataAPIServiceResponse());
    }

    public CreateDataAPIServiceResponse createDataAPIService(CreateDataAPIServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDataAPIServiceWithOptions(request, runtime);
    }

    public GetDataAPIServiceDetailResponse getDataAPIServiceDetailWithOptions(GetDataAPIServiceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDataAPIServiceDetail", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetDataAPIServiceDetailResponse());
    }

    public GetDataAPIServiceDetailResponse getDataAPIServiceDetail(GetDataAPIServiceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataAPIServiceDetailWithOptions(request, runtime);
    }

    public InvokeDataAPIServiceResponse invokeDataAPIServiceWithOptions(InvokeDataAPIServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InvokeDataAPIService", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new InvokeDataAPIServiceResponse());
    }

    public InvokeDataAPIServiceResponse invokeDataAPIService(InvokeDataAPIServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeDataAPIServiceWithOptions(request, runtime);
    }

    public UpdateEdgeInstanceChannelResponse updateEdgeInstanceChannelWithOptions(UpdateEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateEdgeInstanceChannel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateEdgeInstanceChannelResponse());
    }

    public UpdateEdgeInstanceChannelResponse updateEdgeInstanceChannel(UpdateEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEdgeInstanceChannelWithOptions(request, runtime);
    }

    public QueryEdgeInstanceChannelResponse queryEdgeInstanceChannelWithOptions(QueryEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEdgeInstanceChannel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEdgeInstanceChannelResponse());
    }

    public QueryEdgeInstanceChannelResponse queryEdgeInstanceChannel(QueryEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceChannelWithOptions(request, runtime);
    }

    public BatchUnbindDeviceFromEdgeInstanceResponse batchUnbindDeviceFromEdgeInstanceWithOptions(BatchUnbindDeviceFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchUnbindDeviceFromEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchUnbindDeviceFromEdgeInstanceResponse());
    }

    public BatchUnbindDeviceFromEdgeInstanceResponse batchUnbindDeviceFromEdgeInstance(BatchUnbindDeviceFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUnbindDeviceFromEdgeInstanceWithOptions(request, runtime);
    }

    public SetEdgeInstanceDriverConfigsResponse setEdgeInstanceDriverConfigsWithOptions(SetEdgeInstanceDriverConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetEdgeInstanceDriverConfigs", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new SetEdgeInstanceDriverConfigsResponse());
    }

    public SetEdgeInstanceDriverConfigsResponse setEdgeInstanceDriverConfigs(SetEdgeInstanceDriverConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setEdgeInstanceDriverConfigsWithOptions(request, runtime);
    }

    public CreateEdgeInstanceChannelResponse createEdgeInstanceChannelWithOptions(CreateEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateEdgeInstanceChannel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateEdgeInstanceChannelResponse());
    }

    public CreateEdgeInstanceChannelResponse createEdgeInstanceChannel(CreateEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeInstanceChannelWithOptions(request, runtime);
    }

    public BatchBindDeviceToEdgeInstanceWithDriverResponse batchBindDeviceToEdgeInstanceWithDriverWithOptions(BatchBindDeviceToEdgeInstanceWithDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchBindDeviceToEdgeInstanceWithDriver", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchBindDeviceToEdgeInstanceWithDriverResponse());
    }

    public BatchBindDeviceToEdgeInstanceWithDriverResponse batchBindDeviceToEdgeInstanceWithDriver(BatchBindDeviceToEdgeInstanceWithDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchBindDeviceToEdgeInstanceWithDriverWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceChannelResponse batchGetEdgeInstanceChannelWithOptions(BatchGetEdgeInstanceChannelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchGetEdgeInstanceChannel", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchGetEdgeInstanceChannelResponse());
    }

    public BatchGetEdgeInstanceChannelResponse batchGetEdgeInstanceChannel(BatchGetEdgeInstanceChannelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceChannelWithOptions(request, runtime);
    }

    public BatchSetEdgeInstanceDeviceConfigResponse batchSetEdgeInstanceDeviceConfigWithOptions(BatchSetEdgeInstanceDeviceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchSetEdgeInstanceDeviceConfig", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchSetEdgeInstanceDeviceConfigResponse());
    }

    public BatchSetEdgeInstanceDeviceConfigResponse batchSetEdgeInstanceDeviceConfig(BatchSetEdgeInstanceDeviceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchSetEdgeInstanceDeviceConfigWithOptions(request, runtime);
    }

    public BatchClearEdgeInstanceDeviceConfigResponse batchClearEdgeInstanceDeviceConfigWithOptions(BatchClearEdgeInstanceDeviceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchClearEdgeInstanceDeviceConfig", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchClearEdgeInstanceDeviceConfigResponse());
    }

    public BatchClearEdgeInstanceDeviceConfigResponse batchClearEdgeInstanceDeviceConfig(BatchClearEdgeInstanceDeviceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchClearEdgeInstanceDeviceConfigWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceDeviceConfigResponse batchGetEdgeInstanceDeviceConfigWithOptions(BatchGetEdgeInstanceDeviceConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchGetEdgeInstanceDeviceConfig", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchGetEdgeInstanceDeviceConfigResponse());
    }

    public BatchGetEdgeInstanceDeviceConfigResponse batchGetEdgeInstanceDeviceConfig(BatchGetEdgeInstanceDeviceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceDeviceConfigWithOptions(request, runtime);
    }

    public BatchGetEdgeInstanceDriverConfigsResponse batchGetEdgeInstanceDriverConfigsWithOptions(BatchGetEdgeInstanceDriverConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchGetEdgeInstanceDriverConfigs", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchGetEdgeInstanceDriverConfigsResponse());
    }

    public BatchGetEdgeInstanceDriverConfigsResponse batchGetEdgeInstanceDriverConfigs(BatchGetEdgeInstanceDriverConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetEdgeInstanceDriverConfigsWithOptions(request, runtime);
    }

    public ClearEdgeInstanceDriverConfigsResponse clearEdgeInstanceDriverConfigsWithOptions(ClearEdgeInstanceDriverConfigsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ClearEdgeInstanceDriverConfigs", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ClearEdgeInstanceDriverConfigsResponse());
    }

    public ClearEdgeInstanceDriverConfigsResponse clearEdgeInstanceDriverConfigs(ClearEdgeInstanceDriverConfigsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.clearEdgeInstanceDriverConfigsWithOptions(request, runtime);
    }

    public CreateLoRaNodesTaskResponse createLoRaNodesTaskWithOptions(CreateLoRaNodesTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateLoRaNodesTask", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateLoRaNodesTaskResponse());
    }

    public CreateLoRaNodesTaskResponse createLoRaNodesTask(CreateLoRaNodesTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLoRaNodesTaskWithOptions(request, runtime);
    }

    public GetLoraNodesTaskResponse getLoraNodesTaskWithOptions(GetLoraNodesTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetLoraNodesTask", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetLoraNodesTaskResponse());
    }

    public GetLoraNodesTaskResponse getLoraNodesTask(GetLoraNodesTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLoraNodesTaskWithOptions(request, runtime);
    }

    public QueryLoRaJoinPermissionsResponse queryLoRaJoinPermissionsWithOptions(QueryLoRaJoinPermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryLoRaJoinPermissions", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryLoRaJoinPermissionsResponse());
    }

    public QueryLoRaJoinPermissionsResponse queryLoRaJoinPermissions(QueryLoRaJoinPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryLoRaJoinPermissionsWithOptions(request, runtime);
    }

    public QueryEdgeInstanceDriverResponse queryEdgeInstanceDriverWithOptions(QueryEdgeInstanceDriverRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEdgeInstanceDriver", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEdgeInstanceDriverResponse());
    }

    public QueryEdgeInstanceDriverResponse queryEdgeInstanceDriver(QueryEdgeInstanceDriverRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceDriverWithOptions(request, runtime);
    }

    public BatchUpdateDeviceNicknameResponse batchUpdateDeviceNicknameWithOptions(BatchUpdateDeviceNicknameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchUpdateDeviceNickname", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchUpdateDeviceNicknameResponse());
    }

    public BatchUpdateDeviceNicknameResponse batchUpdateDeviceNickname(BatchUpdateDeviceNicknameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchUpdateDeviceNicknameWithOptions(request, runtime);
    }

    public QueryDeviceFileResponse queryDeviceFileWithOptions(QueryDeviceFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceFile", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceFileResponse());
    }

    public QueryDeviceFileResponse queryDeviceFile(QueryDeviceFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceFileWithOptions(request, runtime);
    }

    public QueryDeviceFileListResponse queryDeviceFileListWithOptions(QueryDeviceFileListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceFileList", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceFileListResponse());
    }

    public QueryDeviceFileListResponse queryDeviceFileList(QueryDeviceFileListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceFileListWithOptions(request, runtime);
    }

    public DeleteDeviceFileResponse deleteDeviceFileWithOptions(DeleteDeviceFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDeviceFile", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDeviceFileResponse());
    }

    public DeleteDeviceFileResponse deleteDeviceFile(DeleteDeviceFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceFileWithOptions(request, runtime);
    }

    public GetNodesAddingTaskResponse getNodesAddingTaskWithOptions(GetNodesAddingTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetNodesAddingTask", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetNodesAddingTaskResponse());
    }

    public GetNodesAddingTaskResponse getNodesAddingTask(GetNodesAddingTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getNodesAddingTaskWithOptions(request, runtime);
    }

    public SetDeviceDesiredPropertyResponse setDeviceDesiredPropertyWithOptions(SetDeviceDesiredPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDeviceDesiredProperty", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new SetDeviceDesiredPropertyResponse());
    }

    public SetDeviceDesiredPropertyResponse setDeviceDesiredProperty(SetDeviceDesiredPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDeviceDesiredPropertyWithOptions(request, runtime);
    }

    public QueryDeviceDesiredPropertyResponse queryDeviceDesiredPropertyWithOptions(QueryDeviceDesiredPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceDesiredProperty", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceDesiredPropertyResponse());
    }

    public QueryDeviceDesiredPropertyResponse queryDeviceDesiredProperty(QueryDeviceDesiredPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceDesiredPropertyWithOptions(request, runtime);
    }

    public QueryEdgeInstanceHistoricDeploymentResponse queryEdgeInstanceHistoricDeploymentWithOptions(QueryEdgeInstanceHistoricDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEdgeInstanceHistoricDeployment", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEdgeInstanceHistoricDeploymentResponse());
    }

    public QueryEdgeInstanceHistoricDeploymentResponse queryEdgeInstanceHistoricDeployment(QueryEdgeInstanceHistoricDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceHistoricDeploymentWithOptions(request, runtime);
    }

    public CreateProductTagsResponse createProductTagsWithOptions(CreateProductTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateProductTags", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateProductTagsResponse());
    }

    public CreateProductTagsResponse createProductTags(CreateProductTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProductTagsWithOptions(request, runtime);
    }

    public UpdateProductTagsResponse updateProductTagsWithOptions(UpdateProductTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateProductTags", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateProductTagsResponse());
    }

    public UpdateProductTagsResponse updateProductTags(UpdateProductTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProductTagsWithOptions(request, runtime);
    }

    public DeleteProductTagsResponse deleteProductTagsWithOptions(DeleteProductTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteProductTags", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteProductTagsResponse());
    }

    public DeleteProductTagsResponse deleteProductTags(DeleteProductTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProductTagsWithOptions(request, runtime);
    }

    public ListProductTagsResponse listProductTagsWithOptions(ListProductTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListProductTags", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListProductTagsResponse());
    }

    public ListProductTagsResponse listProductTags(ListProductTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProductTagsWithOptions(request, runtime);
    }

    public ListProductByTagsResponse listProductByTagsWithOptions(ListProductByTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListProductByTags", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListProductByTagsResponse());
    }

    public ListProductByTagsResponse listProductByTags(ListProductByTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProductByTagsWithOptions(request, runtime);
    }

    public QueryDeviceGroupByTagsResponse queryDeviceGroupByTagsWithOptions(QueryDeviceGroupByTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceGroupByTags", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceGroupByTagsResponse());
    }

    public QueryDeviceGroupByTagsResponse queryDeviceGroupByTags(QueryDeviceGroupByTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupByTagsWithOptions(request, runtime);
    }

    public BatchAddThingTopoResponse batchAddThingTopoWithOptions(BatchAddThingTopoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchAddThingTopo", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchAddThingTopoResponse());
    }

    public BatchAddThingTopoResponse batchAddThingTopo(BatchAddThingTopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAddThingTopoWithOptions(request, runtime);
    }

    public QueryDeviceListByDeviceGroupResponse queryDeviceListByDeviceGroupWithOptions(QueryDeviceListByDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceListByDeviceGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceListByDeviceGroupResponse());
    }

    public QueryDeviceListByDeviceGroupResponse queryDeviceListByDeviceGroup(QueryDeviceListByDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceListByDeviceGroupWithOptions(request, runtime);
    }

    public QueryDevicePropertiesDataResponse queryDevicePropertiesDataWithOptions(QueryDevicePropertiesDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDevicePropertiesData", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDevicePropertiesDataResponse());
    }

    public QueryDevicePropertiesDataResponse queryDevicePropertiesData(QueryDevicePropertiesDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePropertiesDataWithOptions(request, runtime);
    }

    public UnbindRoleFromEdgeInstanceResponse unbindRoleFromEdgeInstanceWithOptions(UnbindRoleFromEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UnbindRoleFromEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UnbindRoleFromEdgeInstanceResponse());
    }

    public UnbindRoleFromEdgeInstanceResponse unbindRoleFromEdgeInstance(UnbindRoleFromEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.unbindRoleFromEdgeInstanceWithOptions(request, runtime);
    }

    public UpdateEdgeInstanceResponse updateEdgeInstanceWithOptions(UpdateEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateEdgeInstanceResponse());
    }

    public UpdateEdgeInstanceResponse updateEdgeInstance(UpdateEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateEdgeInstanceWithOptions(request, runtime);
    }

    public GetEdgeInstanceResponse getEdgeInstanceWithOptions(GetEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetEdgeInstanceResponse());
    }

    public GetEdgeInstanceResponse getEdgeInstance(GetEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getEdgeInstanceWithOptions(request, runtime);
    }

    public DeleteEdgeInstanceResponse deleteEdgeInstanceWithOptions(DeleteEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteEdgeInstanceResponse());
    }

    public DeleteEdgeInstanceResponse deleteEdgeInstance(DeleteEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteEdgeInstanceWithOptions(request, runtime);
    }

    public CreateEdgeInstanceResponse createEdgeInstanceWithOptions(CreateEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateEdgeInstanceResponse());
    }

    public CreateEdgeInstanceResponse createEdgeInstance(CreateEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeInstanceWithOptions(request, runtime);
    }

    public QueryEdgeInstanceGatewayResponse queryEdgeInstanceGatewayWithOptions(QueryEdgeInstanceGatewayRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEdgeInstanceGateway", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEdgeInstanceGatewayResponse());
    }

    public QueryEdgeInstanceGatewayResponse queryEdgeInstanceGateway(QueryEdgeInstanceGatewayRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceGatewayWithOptions(request, runtime);
    }

    public QueryEdgeInstanceDeviceResponse queryEdgeInstanceDeviceWithOptions(QueryEdgeInstanceDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEdgeInstanceDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEdgeInstanceDeviceResponse());
    }

    public QueryEdgeInstanceDeviceResponse queryEdgeInstanceDevice(QueryEdgeInstanceDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceDeviceWithOptions(request, runtime);
    }

    public BindGatewayToEdgeInstanceResponse bindGatewayToEdgeInstanceWithOptions(BindGatewayToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindGatewayToEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BindGatewayToEdgeInstanceResponse());
    }

    public BindGatewayToEdgeInstanceResponse bindGatewayToEdgeInstance(BindGatewayToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindGatewayToEdgeInstanceWithOptions(request, runtime);
    }

    public QueryEdgeInstanceResponse queryEdgeInstanceWithOptions(QueryEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryEdgeInstanceResponse());
    }

    public QueryEdgeInstanceResponse queryEdgeInstance(QueryEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryEdgeInstanceWithOptions(request, runtime);
    }

    public CreateEdgeInstanceDeploymentResponse createEdgeInstanceDeploymentWithOptions(CreateEdgeInstanceDeploymentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateEdgeInstanceDeployment", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateEdgeInstanceDeploymentResponse());
    }

    public CreateEdgeInstanceDeploymentResponse createEdgeInstanceDeployment(CreateEdgeInstanceDeploymentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createEdgeInstanceDeploymentWithOptions(request, runtime);
    }

    public BindRoleToEdgeInstanceResponse bindRoleToEdgeInstanceWithOptions(BindRoleToEdgeInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BindRoleToEdgeInstance", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BindRoleToEdgeInstanceResponse());
    }

    public BindRoleToEdgeInstanceResponse bindRoleToEdgeInstance(BindRoleToEdgeInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.bindRoleToEdgeInstanceWithOptions(request, runtime);
    }

    public QuerySuperDeviceGroupResponse querySuperDeviceGroupWithOptions(QuerySuperDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QuerySuperDeviceGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QuerySuperDeviceGroupResponse());
    }

    public QuerySuperDeviceGroupResponse querySuperDeviceGroup(QuerySuperDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.querySuperDeviceGroupWithOptions(request, runtime);
    }

    public QueryDeviceByTagsResponse queryDeviceByTagsWithOptions(QueryDeviceByTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceByTags", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceByTagsResponse());
    }

    public QueryDeviceByTagsResponse queryDeviceByTags(QueryDeviceByTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceByTagsWithOptions(request, runtime);
    }

    public SetDevicesPropertyResponse setDevicesPropertyWithOptions(SetDevicesPropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDevicesProperty", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new SetDevicesPropertyResponse());
    }

    public SetDevicesPropertyResponse setDevicesProperty(SetDevicesPropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDevicesPropertyWithOptions(request, runtime);
    }

    public InvokeThingsServiceResponse invokeThingsServiceWithOptions(InvokeThingsServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InvokeThingsService", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new InvokeThingsServiceResponse());
    }

    public InvokeThingsServiceResponse invokeThingsService(InvokeThingsServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeThingsServiceWithOptions(request, runtime);
    }

    public SetDeviceGroupTagsResponse setDeviceGroupTagsWithOptions(SetDeviceGroupTagsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDeviceGroupTags", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new SetDeviceGroupTagsResponse());
    }

    public SetDeviceGroupTagsResponse setDeviceGroupTags(SetDeviceGroupTagsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDeviceGroupTagsWithOptions(request, runtime);
    }

    public QueryAppDeviceListResponse queryAppDeviceListWithOptions(QueryAppDeviceListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryAppDeviceList", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryAppDeviceListResponse());
    }

    public QueryAppDeviceListResponse queryAppDeviceList(QueryAppDeviceListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryAppDeviceListWithOptions(request, runtime);
    }

    public UpdateDeviceGroupResponse updateDeviceGroupWithOptions(UpdateDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDeviceGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDeviceGroupResponse());
    }

    public UpdateDeviceGroupResponse updateDeviceGroup(UpdateDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceGroupWithOptions(request, runtime);
    }

    public QueryDeviceGroupTagListResponse queryDeviceGroupTagListWithOptions(QueryDeviceGroupTagListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceGroupTagList", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceGroupTagListResponse());
    }

    public QueryDeviceGroupTagListResponse queryDeviceGroupTagList(QueryDeviceGroupTagListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupTagListWithOptions(request, runtime);
    }

    public QueryDeviceGroupListResponse queryDeviceGroupListWithOptions(QueryDeviceGroupListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceGroupList", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceGroupListResponse());
    }

    public QueryDeviceGroupListResponse queryDeviceGroupList(QueryDeviceGroupListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupListWithOptions(request, runtime);
    }

    public QueryDeviceGroupInfoResponse queryDeviceGroupInfoWithOptions(QueryDeviceGroupInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceGroupInfo", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceGroupInfoResponse());
    }

    public QueryDeviceGroupInfoResponse queryDeviceGroupInfo(QueryDeviceGroupInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupInfoWithOptions(request, runtime);
    }

    public QueryDeviceGroupByDeviceResponse queryDeviceGroupByDeviceWithOptions(QueryDeviceGroupByDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceGroupByDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceGroupByDeviceResponse());
    }

    public QueryDeviceGroupByDeviceResponse queryDeviceGroupByDevice(QueryDeviceGroupByDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceGroupByDeviceWithOptions(request, runtime);
    }

    public DeleteDeviceGroupResponse deleteDeviceGroupWithOptions(DeleteDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDeviceGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDeviceGroupResponse());
    }

    public DeleteDeviceGroupResponse deleteDeviceGroup(DeleteDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceGroupWithOptions(request, runtime);
    }

    public CreateDeviceGroupResponse createDeviceGroupWithOptions(CreateDeviceGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDeviceGroup", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateDeviceGroupResponse());
    }

    public CreateDeviceGroupResponse createDeviceGroup(CreateDeviceGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDeviceGroupWithOptions(request, runtime);
    }

    public BatchDeleteDeviceGroupRelationsResponse batchDeleteDeviceGroupRelationsWithOptions(BatchDeleteDeviceGroupRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchDeleteDeviceGroupRelations", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchDeleteDeviceGroupRelationsResponse());
    }

    public BatchDeleteDeviceGroupRelationsResponse batchDeleteDeviceGroupRelations(BatchDeleteDeviceGroupRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchDeleteDeviceGroupRelationsWithOptions(request, runtime);
    }

    public BatchAddDeviceGroupRelationsResponse batchAddDeviceGroupRelationsWithOptions(BatchAddDeviceGroupRelationsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchAddDeviceGroupRelations", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchAddDeviceGroupRelationsResponse());
    }

    public BatchAddDeviceGroupRelationsResponse batchAddDeviceGroupRelations(BatchAddDeviceGroupRelationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchAddDeviceGroupRelationsWithOptions(request, runtime);
    }

    public RRpcResponse RRpcWithOptions(RRpcRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RRpc", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new RRpcResponse());
    }

    public RRpcResponse RRpc(RRpcRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.RRpcWithOptions(request, runtime);
    }

    public QueryPageByApplyIdResponse queryPageByApplyIdWithOptions(QueryPageByApplyIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryPageByApplyId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryPageByApplyIdResponse());
    }

    public QueryPageByApplyIdResponse queryPageByApplyId(QueryPageByApplyIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryPageByApplyIdWithOptions(request, runtime);
    }

    public QueryDeviceResponse queryDeviceWithOptions(QueryDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceResponse());
    }

    public QueryDeviceResponse queryDevice(QueryDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceWithOptions(request, runtime);
    }

    public SaveDevicePropResponse saveDevicePropWithOptions(SaveDevicePropRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SaveDeviceProp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new SaveDevicePropResponse());
    }

    public SaveDevicePropResponse saveDeviceProp(SaveDevicePropRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.saveDevicePropWithOptions(request, runtime);
    }

    public QueryTopicRouteTableResponse queryTopicRouteTableWithOptions(QueryTopicRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryTopicRouteTable", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryTopicRouteTableResponse());
    }

    public QueryTopicRouteTableResponse queryTopicRouteTable(QueryTopicRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTopicRouteTableWithOptions(request, runtime);
    }

    public QueryTopicReverseRouteTableResponse queryTopicReverseRouteTableWithOptions(QueryTopicReverseRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryTopicReverseRouteTable", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryTopicReverseRouteTableResponse());
    }

    public QueryTopicReverseRouteTableResponse queryTopicReverseRouteTable(QueryTopicReverseRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryTopicReverseRouteTableWithOptions(request, runtime);
    }

    public PubBroadcastResponse pubBroadcastWithOptions(PubBroadcastRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("PubBroadcast", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new PubBroadcastResponse());
    }

    public PubBroadcastResponse pubBroadcast(PubBroadcastRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pubBroadcastWithOptions(request, runtime);
    }

    public DeleteTopicRouteTableResponse deleteTopicRouteTableWithOptions(DeleteTopicRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteTopicRouteTable", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteTopicRouteTableResponse());
    }

    public DeleteTopicRouteTableResponse deleteTopicRouteTable(DeleteTopicRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTopicRouteTableWithOptions(request, runtime);
    }

    public DeleteDevicePropResponse deleteDevicePropWithOptions(DeleteDevicePropRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDeviceProp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDevicePropResponse());
    }

    public DeleteDevicePropResponse deleteDeviceProp(DeleteDevicePropRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDevicePropWithOptions(request, runtime);
    }

    public CreateTopicRouteTableResponse createTopicRouteTableWithOptions(CreateTopicRouteTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateTopicRouteTable", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateTopicRouteTableResponse());
    }

    public CreateTopicRouteTableResponse createTopicRouteTable(CreateTopicRouteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTopicRouteTableWithOptions(request, runtime);
    }

    public BatchGetDeviceStateResponse batchGetDeviceStateWithOptions(BatchGetDeviceStateRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchGetDeviceState", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchGetDeviceStateResponse());
    }

    public BatchGetDeviceStateResponse batchGetDeviceState(BatchGetDeviceStateRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchGetDeviceStateWithOptions(request, runtime);
    }

    public UpdateRuleActionResponse updateRuleActionWithOptions(UpdateRuleActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateRuleAction", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateRuleActionResponse());
    }

    public UpdateRuleActionResponse updateRuleAction(UpdateRuleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRuleActionWithOptions(request, runtime);
    }

    public UpdateRuleResponse updateRuleWithOptions(UpdateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateRuleResponse());
    }

    public UpdateRuleResponse updateRule(UpdateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRuleWithOptions(request, runtime);
    }

    public UpdateProductTopicResponse updateProductTopicWithOptions(UpdateProductTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateProductTopic", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateProductTopicResponse());
    }

    public UpdateProductTopicResponse updateProductTopic(UpdateProductTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProductTopicWithOptions(request, runtime);
    }

    public UpdateDeviceShadowResponse updateDeviceShadowWithOptions(UpdateDeviceShadowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDeviceShadow", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDeviceShadowResponse());
    }

    public UpdateDeviceShadowResponse updateDeviceShadow(UpdateDeviceShadowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDeviceShadowWithOptions(request, runtime);
    }

    public StopRuleResponse stopRuleWithOptions(StopRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StopRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new StopRuleResponse());
    }

    public StopRuleResponse stopRule(StopRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.stopRuleWithOptions(request, runtime);
    }

    public StartRuleResponse startRuleWithOptions(StartRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("StartRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new StartRuleResponse());
    }

    public StartRuleResponse startRule(StartRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.startRuleWithOptions(request, runtime);
    }

    public QueryProductTopicResponse queryProductTopicWithOptions(QueryProductTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryProductTopic", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryProductTopicResponse());
    }

    public QueryProductTopicResponse queryProductTopic(QueryProductTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductTopicWithOptions(request, runtime);
    }

    public QueryDevicePropResponse queryDevicePropWithOptions(QueryDevicePropRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceProp", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDevicePropResponse());
    }

    public QueryDevicePropResponse queryDeviceProp(QueryDevicePropRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePropWithOptions(request, runtime);
    }

    public PubResponse pubWithOptions(PubRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("Pub", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new PubResponse());
    }

    public PubResponse pub(PubRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pubWithOptions(request, runtime);
    }

    public ListRuleActionsResponse listRuleActionsWithOptions(ListRuleActionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListRuleActions", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListRuleActionsResponse());
    }

    public ListRuleActionsResponse listRuleActions(ListRuleActionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRuleActionsWithOptions(request, runtime);
    }

    public ListRuleResponse listRuleWithOptions(ListRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ListRuleResponse());
    }

    public ListRuleResponse listRule(ListRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRuleWithOptions(request, runtime);
    }

    public GetRuleActionResponse getRuleActionWithOptions(GetRuleActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetRuleAction", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetRuleActionResponse());
    }

    public GetRuleActionResponse getRuleAction(GetRuleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRuleActionWithOptions(request, runtime);
    }

    public GetRuleResponse getRuleWithOptions(GetRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetRuleResponse());
    }

    public GetRuleResponse getRule(GetRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRuleWithOptions(request, runtime);
    }

    public GetDeviceShadowResponse getDeviceShadowWithOptions(GetDeviceShadowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDeviceShadow", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetDeviceShadowResponse());
    }

    public GetDeviceShadowResponse getDeviceShadow(GetDeviceShadowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceShadowWithOptions(request, runtime);
    }

    public DeleteRuleActionResponse deleteRuleActionWithOptions(DeleteRuleActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRuleAction", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRuleActionResponse());
    }

    public DeleteRuleActionResponse deleteRuleAction(DeleteRuleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleActionWithOptions(request, runtime);
    }

    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRuleResponse());
    }

    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    public DeleteProductTopicResponse deleteProductTopicWithOptions(DeleteProductTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteProductTopic", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteProductTopicResponse());
    }

    public DeleteProductTopicResponse deleteProductTopic(DeleteProductTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProductTopicWithOptions(request, runtime);
    }

    public CreateRuleActionResponse createRuleActionWithOptions(CreateRuleActionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRuleAction", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateRuleActionResponse());
    }

    public CreateRuleActionResponse createRuleAction(CreateRuleActionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleActionWithOptions(request, runtime);
    }

    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRule", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateRuleResponse());
    }

    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    public CreateProductTopicResponse createProductTopicWithOptions(CreateProductTopicRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateProductTopic", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateProductTopicResponse());
    }

    public CreateProductTopicResponse createProductTopic(CreateProductTopicRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProductTopicWithOptions(request, runtime);
    }

    public QueryBatchRegisterDeviceStatusResponse queryBatchRegisterDeviceStatusWithOptions(QueryBatchRegisterDeviceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryBatchRegisterDeviceStatus", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryBatchRegisterDeviceStatusResponse());
    }

    public QueryBatchRegisterDeviceStatusResponse queryBatchRegisterDeviceStatus(QueryBatchRegisterDeviceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryBatchRegisterDeviceStatusWithOptions(request, runtime);
    }

    public GetGatewayBySubDeviceResponse getGatewayBySubDeviceWithOptions(GetGatewayBySubDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetGatewayBySubDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetGatewayBySubDeviceResponse());
    }

    public GetGatewayBySubDeviceResponse getGatewayBySubDevice(GetGatewayBySubDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGatewayBySubDeviceWithOptions(request, runtime);
    }

    public ResetThingResponse resetThingWithOptions(ResetThingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ResetThing", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new ResetThingResponse());
    }

    public ResetThingResponse resetThing(ResetThingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.resetThingWithOptions(request, runtime);
    }

    public RemoveThingTopoResponse removeThingTopoWithOptions(RemoveThingTopoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RemoveThingTopo", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new RemoveThingTopoResponse());
    }

    public RemoveThingTopoResponse removeThingTopo(RemoveThingTopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.removeThingTopoWithOptions(request, runtime);
    }

    public NotifyAddThingTopoResponse notifyAddThingTopoWithOptions(NotifyAddThingTopoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("NotifyAddThingTopo", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new NotifyAddThingTopoResponse());
    }

    public NotifyAddThingTopoResponse notifyAddThingTopo(NotifyAddThingTopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.notifyAddThingTopoWithOptions(request, runtime);
    }

    public GetThingTopoResponse getThingTopoWithOptions(GetThingTopoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetThingTopo", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetThingTopoResponse());
    }

    public GetThingTopoResponse getThingTopo(GetThingTopoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getThingTopoWithOptions(request, runtime);
    }

    public QueryDevicePropertyStatusResponse queryDevicePropertyStatusWithOptions(QueryDevicePropertyStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDevicePropertyStatus", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDevicePropertyStatusResponse());
    }

    public QueryDevicePropertyStatusResponse queryDevicePropertyStatus(QueryDevicePropertyStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePropertyStatusWithOptions(request, runtime);
    }

    public QueryDevicePropertyDataResponse queryDevicePropertyDataWithOptions(QueryDevicePropertyDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDevicePropertyData", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDevicePropertyDataResponse());
    }

    public QueryDevicePropertyDataResponse queryDevicePropertyData(QueryDevicePropertyDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDevicePropertyDataWithOptions(request, runtime);
    }

    public BatchRegisterDeviceWithApplyIdResponse batchRegisterDeviceWithApplyIdWithOptions(BatchRegisterDeviceWithApplyIdRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchRegisterDeviceWithApplyId", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchRegisterDeviceWithApplyIdResponse());
    }

    public BatchRegisterDeviceWithApplyIdResponse batchRegisterDeviceWithApplyId(BatchRegisterDeviceWithApplyIdRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchRegisterDeviceWithApplyIdWithOptions(request, runtime);
    }

    public BatchRegisterDeviceResponse batchRegisterDeviceWithOptions(BatchRegisterDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchRegisterDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchRegisterDeviceResponse());
    }

    public BatchRegisterDeviceResponse batchRegisterDevice(BatchRegisterDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchRegisterDeviceWithOptions(request, runtime);
    }

    public BatchCheckDeviceNamesResponse batchCheckDeviceNamesWithOptions(BatchCheckDeviceNamesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("BatchCheckDeviceNames", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new BatchCheckDeviceNamesResponse());
    }

    public BatchCheckDeviceNamesResponse batchCheckDeviceNames(BatchCheckDeviceNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.batchCheckDeviceNamesWithOptions(request, runtime);
    }

    public UpdateProductResponse updateProductWithOptions(UpdateProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateProduct", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new UpdateProductResponse());
    }

    public UpdateProductResponse updateProduct(UpdateProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateProductWithOptions(request, runtime);
    }

    public SetDevicePropertyResponse setDevicePropertyWithOptions(SetDevicePropertyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("SetDeviceProperty", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new SetDevicePropertyResponse());
    }

    public SetDevicePropertyResponse setDeviceProperty(SetDevicePropertyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setDevicePropertyWithOptions(request, runtime);
    }

    public RegisterDeviceResponse registerDeviceWithOptions(RegisterDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("RegisterDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new RegisterDeviceResponse());
    }

    public RegisterDeviceResponse registerDevice(RegisterDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerDeviceWithOptions(request, runtime);
    }

    public QueryProductListResponse queryProductListWithOptions(QueryProductListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryProductList", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryProductListResponse());
    }

    public QueryProductListResponse queryProductList(QueryProductListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductListWithOptions(request, runtime);
    }

    public QueryProductResponse queryProductWithOptions(QueryProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryProduct", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryProductResponse());
    }

    public QueryProductResponse queryProduct(QueryProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryProductWithOptions(request, runtime);
    }

    public QueryDeviceStatisticsResponse queryDeviceStatisticsWithOptions(QueryDeviceStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceStatistics", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceStatisticsResponse());
    }

    public QueryDeviceStatisticsResponse queryDeviceStatistics(QueryDeviceStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceStatisticsWithOptions(request, runtime);
    }

    public QueryDeviceServiceDataResponse queryDeviceServiceDataWithOptions(QueryDeviceServiceDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceServiceData", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceServiceDataResponse());
    }

    public QueryDeviceServiceDataResponse queryDeviceServiceData(QueryDeviceServiceDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceServiceDataWithOptions(request, runtime);
    }

    public QueryDeviceEventDataResponse queryDeviceEventDataWithOptions(QueryDeviceEventDataRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceEventData", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceEventDataResponse());
    }

    public QueryDeviceEventDataResponse queryDeviceEventData(QueryDeviceEventDataRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceEventDataWithOptions(request, runtime);
    }

    public QueryDeviceDetailResponse queryDeviceDetailWithOptions(QueryDeviceDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("QueryDeviceDetail", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new QueryDeviceDetailResponse());
    }

    public QueryDeviceDetailResponse queryDeviceDetail(QueryDeviceDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.queryDeviceDetailWithOptions(request, runtime);
    }

    public InvokeThingServiceResponse invokeThingServiceWithOptions(InvokeThingServiceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("InvokeThingService", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new InvokeThingServiceResponse());
    }

    public InvokeThingServiceResponse invokeThingService(InvokeThingServiceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.invokeThingServiceWithOptions(request, runtime);
    }

    public GetDeviceStatusResponse getDeviceStatusWithOptions(GetDeviceStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDeviceStatus", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new GetDeviceStatusResponse());
    }

    public GetDeviceStatusResponse getDeviceStatus(GetDeviceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDeviceStatusWithOptions(request, runtime);
    }

    public EnableThingResponse enableThingWithOptions(EnableThingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("EnableThing", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new EnableThingResponse());
    }

    public EnableThingResponse enableThing(EnableThingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableThingWithOptions(request, runtime);
    }

    public DisableThingResponse disableThingWithOptions(DisableThingRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DisableThing", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DisableThingResponse());
    }

    public DisableThingResponse disableThing(DisableThingRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableThingWithOptions(request, runtime);
    }

    public DeleteProductResponse deleteProductWithOptions(DeleteProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteProduct", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteProductResponse());
    }

    public DeleteProductResponse deleteProduct(DeleteProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProductWithOptions(request, runtime);
    }

    public DeleteDeviceResponse deleteDeviceWithOptions(DeleteDeviceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDevice", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDeviceResponse());
    }

    public DeleteDeviceResponse deleteDevice(DeleteDeviceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDeviceWithOptions(request, runtime);
    }

    public CreateProductResponse createProductWithOptions(CreateProductRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateProduct", "HTTPS", "POST", "2018-01-20", "AK", null, TeaModel.buildMap(request), runtime), new CreateProductResponse());
    }

    public CreateProductResponse createProduct(CreateProductRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProductWithOptions(request, runtime);
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
