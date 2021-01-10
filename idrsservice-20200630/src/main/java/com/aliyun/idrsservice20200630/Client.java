// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630;

import com.aliyun.tea.*;
import com.aliyun.idrsservice20200630.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "idrsservice.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "idrsservice.aliyuncs.com"),
            new TeaPair("ap-south-1", "idrsservice.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "idrsservice.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "idrsservice.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "idrsservice.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-beijing", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-chengdu", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-edge-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-fujian", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hongkong", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-qingdao", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shanghai", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-wuhan", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "idrsservice.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "idrsservice.aliyuncs.com"),
            new TeaPair("eu-central-1", "idrsservice.aliyuncs.com"),
            new TeaPair("eu-west-1", "idrsservice.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "idrsservice.aliyuncs.com"),
            new TeaPair("me-east-1", "idrsservice.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "idrsservice.aliyuncs.com"),
            new TeaPair("us-east-1", "idrsservice.aliyuncs.com"),
            new TeaPair("us-west-1", "idrsservice.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("idrsservice", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public CheckServiceLinkedRoleResponse checkServiceLinkedRoleWithOptions(CheckServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CheckServiceLinkedRole", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CheckServiceLinkedRoleResponse());
    }

    public CheckServiceLinkedRoleResponse checkServiceLinkedRole(CheckServiceLinkedRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.checkServiceLinkedRoleWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateApp", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    public CreateDepartmentResponse createDepartmentWithOptions(CreateDepartmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDepartment", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDepartmentResponse());
    }

    public CreateDepartmentResponse createDepartment(CreateDepartmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDepartmentWithOptions(request, runtime);
    }

    public CreateDetectProcessResponse createDetectProcessWithOptions(CreateDetectProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateDetectProcess", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateDetectProcessResponse());
    }

    public CreateDetectProcessResponse createDetectProcess(CreateDetectProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDetectProcessWithOptions(request, runtime);
    }

    public CreateLiveResponse createLiveWithOptions(CreateLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLive", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLiveResponse());
    }

    public CreateLiveResponse createLive(CreateLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLiveWithOptions(request, runtime);
    }

    public CreateLiveDetectionResponse createLiveDetectionWithOptions(CreateLiveDetectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateLiveDetection", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateLiveDetectionResponse());
    }

    public CreateLiveDetectionResponse createLiveDetection(CreateLiveDetectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLiveDetectionWithOptions(request, runtime);
    }

    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateRule", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateRuleResponse());
    }

    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    public CreateStatisticsRecordResponse createStatisticsRecordWithOptions(CreateStatisticsRecordRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateStatisticsRecord", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateStatisticsRecordResponse());
    }

    public CreateStatisticsRecordResponse createStatisticsRecord(CreateStatisticsRecordRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStatisticsRecordWithOptions(request, runtime);
    }

    public CreateStatisticsTaskResponse createStatisticsTaskWithOptions(CreateStatisticsTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateStatisticsTask", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateStatisticsTaskResponse());
    }

    public CreateStatisticsTaskResponse createStatisticsTask(CreateStatisticsTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStatisticsTaskWithOptions(request, runtime);
    }

    public CreateTaskGroupResponse createTaskGroupWithOptions(CreateTaskGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateTaskGroup", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateTaskGroupResponse());
    }

    public CreateTaskGroupResponse createTaskGroup(CreateTaskGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createTaskGroupWithOptions(request, runtime);
    }

    public CreateUserDepartmentsResponse createUserDepartmentsWithOptions(CreateUserDepartmentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUserDepartments", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUserDepartmentsResponse());
    }

    public CreateUserDepartmentsResponse createUserDepartments(CreateUserDepartmentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUserDepartmentsWithOptions(request, runtime);
    }

    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteApp", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteAppResponse());
    }

    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    public DeleteDepartmentResponse deleteDepartmentWithOptions(DeleteDepartmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDepartment", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDepartmentResponse());
    }

    public DeleteDepartmentResponse deleteDepartment(DeleteDepartmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDepartmentWithOptions(request, runtime);
    }

    public DeleteDetectProcessResponse deleteDetectProcessWithOptions(DeleteDetectProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteDetectProcess", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteDetectProcessResponse());
    }

    public DeleteDetectProcessResponse deleteDetectProcess(DeleteDetectProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteDetectProcessWithOptions(request, runtime);
    }

    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteRule", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteRuleResponse());
    }

    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUser", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public DeleteUserDepartmentsResponse deleteUserDepartmentsWithOptions(DeleteUserDepartmentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUserDepartments", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserDepartmentsResponse());
    }

    public DeleteUserDepartmentsResponse deleteUserDepartments(DeleteUserDepartmentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserDepartmentsWithOptions(request, runtime);
    }

    public ExitLiveResponse exitLiveWithOptions(ExitLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExitLive", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ExitLiveResponse());
    }

    public ExitLiveResponse exitLive(ExitLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.exitLiveWithOptions(request, runtime);
    }

    public GetAppResponse getAppWithOptions(GetAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApp", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetAppResponse());
    }

    public GetAppResponse getApp(GetAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getAppWithOptions(request, runtime);
    }

    public GetBatchSignedUrlResponse getBatchSignedUrlWithOptions(GetBatchSignedUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetBatchSignedUrl", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetBatchSignedUrlResponse());
    }

    public GetBatchSignedUrlResponse getBatchSignedUrl(GetBatchSignedUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getBatchSignedUrlWithOptions(request, runtime);
    }

    public GetDepartmentResponse getDepartmentWithOptions(GetDepartmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDepartment", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetDepartmentResponse());
    }

    public GetDepartmentResponse getDepartment(GetDepartmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDepartmentWithOptions(request, runtime);
    }

    public GetDetectEvaluationResponse getDetectEvaluationWithOptions(GetDetectEvaluationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDetectEvaluation", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetDetectEvaluationResponse());
    }

    public GetDetectEvaluationResponse getDetectEvaluation(GetDetectEvaluationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDetectEvaluationWithOptions(request, runtime);
    }

    public GetDetectionResponse getDetectionWithOptions(GetDetectionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDetection", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetDetectionResponse());
    }

    public GetDetectionResponse getDetection(GetDetectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDetectionWithOptions(request, runtime);
    }

    public GetDetectProcessResponse getDetectProcessWithOptions(GetDetectProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDetectProcess", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetDetectProcessResponse());
    }

    public GetDetectProcessResponse getDetectProcess(GetDetectProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDetectProcessWithOptions(request, runtime);
    }

    public GetDetectProcessJsonFileResponse getDetectProcessJsonFileWithOptions(GetDetectProcessJsonFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDetectProcessJsonFile", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetDetectProcessJsonFileResponse());
    }

    public GetDetectProcessJsonFileResponse getDetectProcessJsonFile(GetDetectProcessJsonFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDetectProcessJsonFileWithOptions(request, runtime);
    }

    public GetDetectProcessTemplateResponse getDetectProcessTemplateWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetDetectProcessTemplate", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetDetectProcessTemplateResponse());
    }

    public GetDetectProcessTemplateResponse getDetectProcessTemplate() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDetectProcessTemplateWithOptions(runtime);
    }

    public GetGlobalConfigResponse getGlobalConfigWithOptions(GetGlobalConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetGlobalConfig", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetGlobalConfigResponse());
    }

    public GetGlobalConfigResponse getGlobalConfig(GetGlobalConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getGlobalConfigWithOptions(request, runtime);
    }

    public GetModelSignedUrlResponse getModelSignedUrlWithOptions(GetModelSignedUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetModelSignedUrl", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetModelSignedUrlResponse());
    }

    public GetModelSignedUrlResponse getModelSignedUrl(GetModelSignedUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getModelSignedUrlWithOptions(request, runtime);
    }

    public GetPreSignedUrlResponse getPreSignedUrlWithOptions(GetPreSignedUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPreSignedUrl", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetPreSignedUrlResponse());
    }

    public GetPreSignedUrlResponse getPreSignedUrl(GetPreSignedUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPreSignedUrlWithOptions(request, runtime);
    }

    public GetRuleResponse getRuleWithOptions(GetRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetRule", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetRuleResponse());
    }

    public GetRuleResponse getRule(GetRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getRuleWithOptions(request, runtime);
    }

    public GetServiceConfigurationResponse getServiceConfigurationWithOptions(GetServiceConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetServiceConfiguration", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetServiceConfigurationResponse());
    }

    public GetServiceConfigurationResponse getServiceConfiguration(GetServiceConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getServiceConfigurationWithOptions(request, runtime);
    }

    public GetSignedUrlResponse getSignedUrlWithOptions(GetSignedUrlRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSignedUrl", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetSignedUrlResponse());
    }

    public GetSignedUrlResponse getSignedUrl(GetSignedUrlRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSignedUrlWithOptions(request, runtime);
    }

    public GetSlrConfigurationResponse getSlrConfigurationWithOptions(GetSlrConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetSlrConfiguration", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetSlrConfigurationResponse());
    }

    public GetSlrConfigurationResponse getSlrConfiguration(GetSlrConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSlrConfigurationWithOptions(request, runtime);
    }

    public GetStatisticsResponse getStatisticsWithOptions(GetStatisticsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetStatistics", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetStatisticsResponse());
    }

    public GetStatisticsResponse getStatistics(GetStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStatisticsWithOptions(request, runtime);
    }

    public GetTaskResponse getTaskWithOptions(GetTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTask", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetTaskResponse());
    }

    public GetTaskResponse getTask(GetTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskWithOptions(request, runtime);
    }

    public GetTaskGroupResponse getTaskGroupWithOptions(GetTaskGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTaskGroup", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetTaskGroupResponse());
    }

    public GetTaskGroupResponse getTaskGroup(GetTaskGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskGroupWithOptions(request, runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUser", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserResponse());
    }

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    public InitializeServiceLinkedRoleResponse initializeServiceLinkedRoleWithOptions(InitializeServiceLinkedRoleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("InitializeServiceLinkedRole", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new InitializeServiceLinkedRoleResponse());
    }

    public InitializeServiceLinkedRoleResponse initializeServiceLinkedRole(InitializeServiceLinkedRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.initializeServiceLinkedRoleWithOptions(request, runtime);
    }

    public JoinLiveResponse joinLiveWithOptions(JoinLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("JoinLive", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new JoinLiveResponse());
    }

    public JoinLiveResponse joinLive(JoinLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.joinLiveWithOptions(request, runtime);
    }

    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListApps", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListAppsResponse());
    }

    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listAppsWithOptions(request, runtime);
    }

    public ListDepartmentsResponse listDepartmentsWithOptions(ListDepartmentsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDepartments", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListDepartmentsResponse());
    }

    public ListDepartmentsResponse listDepartments(ListDepartmentsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDepartmentsWithOptions(request, runtime);
    }

    public ListDetectionsResponse listDetectionsWithOptions(ListDetectionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDetections", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListDetectionsResponse());
    }

    public ListDetectionsResponse listDetections(ListDetectionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDetectionsWithOptions(request, runtime);
    }

    public ListDetectProcessesResponse listDetectProcessesWithOptions(ListDetectProcessesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDetectProcesses", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListDetectProcessesResponse());
    }

    public ListDetectProcessesResponse listDetectProcesses(ListDetectProcessesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDetectProcessesWithOptions(request, runtime);
    }

    public ListFilesResponse listFilesWithOptions(ListFilesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListFiles", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListFilesResponse());
    }

    public ListFilesResponse listFiles(ListFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listFilesWithOptions(request, runtime);
    }

    public ListLivesResponse listLivesWithOptions(ListLivesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLives", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListLivesResponse());
    }

    public ListLivesResponse listLives(ListLivesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLivesWithOptions(request, runtime);
    }

    public ListRolesResponse listRolesWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListRoles", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListRolesResponse());
    }

    public ListRolesResponse listRoles() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRolesWithOptions(runtime);
    }

    public ListRulesResponse listRulesWithOptions(ListRulesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListRules", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListRulesResponse());
    }

    public ListRulesResponse listRules(ListRulesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listRulesWithOptions(request, runtime);
    }

    public ListStatisticsTaskResponse listStatisticsTaskWithOptions(ListStatisticsTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListStatisticsTask", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListStatisticsTaskResponse());
    }

    public ListStatisticsTaskResponse listStatisticsTask(ListStatisticsTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStatisticsTaskWithOptions(request, runtime);
    }

    public ListTaskGroupsResponse listTaskGroupsWithOptions(ListTaskGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTaskGroups", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListTaskGroupsResponse());
    }

    public ListTaskGroupsResponse listTaskGroups(ListTaskGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTaskGroupsWithOptions(request, runtime);
    }

    public ListTaskItemsResponse listTaskItemsWithOptions(ListTaskItemsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTaskItems", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListTaskItemsResponse());
    }

    public ListTaskItemsResponse listTaskItems(ListTaskItemsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTaskItemsWithOptions(request, runtime);
    }

    public ListTasksResponse listTasksWithOptions(ListTasksRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTasks", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListTasksResponse());
    }

    public ListTasksResponse listTasks(ListTasksRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTasksWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsers", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public RenameDetectProcessResponse renameDetectProcessWithOptions(RenameDetectProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RenameDetectProcess", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new RenameDetectProcessResponse());
    }

    public RenameDetectProcessResponse renameDetectProcess(RenameDetectProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.renameDetectProcessWithOptions(request, runtime);
    }

    public UpdateAppResponse updateAppWithOptions(UpdateAppRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateApp", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateAppResponse());
    }

    public UpdateAppResponse updateApp(UpdateAppRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateAppWithOptions(request, runtime);
    }

    public UpdateDepartmentResponse updateDepartmentWithOptions(UpdateDepartmentRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDepartment", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDepartmentResponse());
    }

    public UpdateDepartmentResponse updateDepartment(UpdateDepartmentRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDepartmentWithOptions(request, runtime);
    }

    public UpdateDetectProcessResponse updateDetectProcessWithOptions(UpdateDetectProcessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateDetectProcess", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateDetectProcessResponse());
    }

    public UpdateDetectProcessResponse updateDetectProcess(UpdateDetectProcessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateDetectProcessWithOptions(request, runtime);
    }

    public UpdateLiveResponse updateLiveWithOptions(UpdateLiveRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateLive", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateLiveResponse());
    }

    public UpdateLiveResponse updateLive(UpdateLiveRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateLiveWithOptions(request, runtime);
    }

    public UpdateRuleResponse updateRuleWithOptions(UpdateRuleRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateRule", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateRuleResponse());
    }

    public UpdateRuleResponse updateRule(UpdateRuleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateRuleWithOptions(request, runtime);
    }

    public UpdateServiceConfigurationResponse updateServiceConfigurationWithOptions(UpdateServiceConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateServiceConfiguration", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateServiceConfigurationResponse());
    }

    public UpdateServiceConfigurationResponse updateServiceConfiguration(UpdateServiceConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateServiceConfigurationWithOptions(request, runtime);
    }

    public UpdateSlrConfigurationResponse updateSlrConfigurationWithOptions(UpdateSlrConfigurationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateSlrConfiguration", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateSlrConfigurationResponse());
    }

    public UpdateSlrConfigurationResponse updateSlrConfiguration(UpdateSlrConfigurationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateSlrConfigurationWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateUser", "2020-06-30", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }
}
