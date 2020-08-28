// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.idrsservice20200630;

import com.aliyun.tea.*;
import com.aliyun.idrsservice20200630.models.*;

public class Client extends com.aliyun.tearpc.Client {
    public Client(com.aliyun.tearpc.models.Config config) throws Exception {
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


    public ListTasksResponse listTasksWithOptions(ListTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTasks", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new ListTasksResponse());
    }

    public ListTasksResponse listTasks(ListTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTasksWithOptions(request, runtime);
    }

    public DeleteAppResponse deleteAppWithOptions(DeleteAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteApp", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new DeleteAppResponse());
    }

    public DeleteAppResponse deleteApp(DeleteAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAppWithOptions(request, runtime);
    }

    public ListAppsResponse listAppsWithOptions(ListAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListApps", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new ListAppsResponse());
    }

    public ListAppsResponse listApps(ListAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAppsWithOptions(request, runtime);
    }

    public UpdateAppResponse updateAppWithOptions(UpdateAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateApp", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new UpdateAppResponse());
    }

    public UpdateAppResponse updateApp(UpdateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAppWithOptions(request, runtime);
    }

    public ListTaskGroupsResponse listTaskGroupsWithOptions(ListTaskGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTaskGroups", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new ListTaskGroupsResponse());
    }

    public ListTaskGroupsResponse listTaskGroups(ListTaskGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskGroupsWithOptions(request, runtime);
    }

    public ListRulesResponse listRulesWithOptions(ListRulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListRules", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new ListRulesResponse());
    }

    public ListRulesResponse listRules(ListRulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRulesWithOptions(request, runtime);
    }

    public ListDetectionsResponse listDetectionsWithOptions(ListDetectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDetections", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new ListDetectionsResponse());
    }

    public ListDetectionsResponse listDetections(ListDetectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDetectionsWithOptions(request, runtime);
    }

    public CreateTaskGroupResponse createTaskGroupWithOptions(CreateTaskGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateTaskGroup", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateTaskGroupResponse());
    }

    public CreateTaskGroupResponse createTaskGroup(CreateTaskGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTaskGroupWithOptions(request, runtime);
    }

    public GetTaskGroupResponse getTaskGroupWithOptions(GetTaskGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTaskGroup", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new GetTaskGroupResponse());
    }

    public GetTaskGroupResponse getTaskGroup(GetTaskGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskGroupWithOptions(request, runtime);
    }

    public GetRuleResponse getRuleWithOptions(GetRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetRule", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new GetRuleResponse());
    }

    public GetRuleResponse getRule(GetRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuleWithOptions(request, runtime);
    }

    public GetDetectionResponse getDetectionWithOptions(GetDetectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDetection", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new GetDetectionResponse());
    }

    public GetDetectionResponse getDetection(GetDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDetectionWithOptions(request, runtime);
    }

    public ListTaskItemsResponse listTaskItemsWithOptions(ListTaskItemsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListTaskItems", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new ListTaskItemsResponse());
    }

    public ListTaskItemsResponse listTaskItems(ListTaskItemsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskItemsWithOptions(request, runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetUser", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new GetUserResponse());
    }

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    public CreateRuleResponse createRuleWithOptions(CreateRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateRule", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateRuleResponse());
    }

    public CreateRuleResponse createRule(CreateRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createRuleWithOptions(request, runtime);
    }

    public CreateUserDepartmentsResponse createUserDepartmentsWithOptions(CreateUserDepartmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateUserDepartments", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateUserDepartmentsResponse());
    }

    public CreateUserDepartmentsResponse createUserDepartments(CreateUserDepartmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUserDepartmentsWithOptions(request, runtime);
    }

    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListRoles", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new ListRolesResponse());
    }

    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listRolesWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateUser", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteUser", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public CreateDepartmentResponse createDepartmentWithOptions(CreateDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateDepartment", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateDepartmentResponse());
    }

    public CreateDepartmentResponse createDepartment(CreateDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDepartmentWithOptions(request, runtime);
    }

    public UpdateDepartmentResponse updateDepartmentWithOptions(UpdateDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateDepartment", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new UpdateDepartmentResponse());
    }

    public UpdateDepartmentResponse updateDepartment(UpdateDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDepartmentWithOptions(request, runtime);
    }

    public JoinLiveResponse joinLiveWithOptions(JoinLiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("JoinLive", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new JoinLiveResponse());
    }

    public JoinLiveResponse joinLive(JoinLiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.joinLiveWithOptions(request, runtime);
    }

    public UpdateLiveResponse updateLiveWithOptions(UpdateLiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateLive", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new UpdateLiveResponse());
    }

    public UpdateLiveResponse updateLive(UpdateLiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLiveWithOptions(request, runtime);
    }

    public CreateLiveResponse createLiveWithOptions(CreateLiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateLive", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateLiveResponse());
    }

    public CreateLiveResponse createLive(CreateLiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLiveWithOptions(request, runtime);
    }

    public ListDepartmentsResponse listDepartmentsWithOptions(ListDepartmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListDepartments", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new ListDepartmentsResponse());
    }

    public ListDepartmentsResponse listDepartments(ListDepartmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDepartmentsWithOptions(request, runtime);
    }

    public UpdateServiceConfigurationResponse updateServiceConfigurationWithOptions(UpdateServiceConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateServiceConfiguration", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new UpdateServiceConfigurationResponse());
    }

    public UpdateServiceConfigurationResponse updateServiceConfiguration(UpdateServiceConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateServiceConfigurationWithOptions(request, runtime);
    }

    public CreateAppResponse createAppWithOptions(CreateAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateApp", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateAppResponse());
    }

    public CreateAppResponse createApp(CreateAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAppWithOptions(request, runtime);
    }

    public CreateLiveDetectionResponse createLiveDetectionWithOptions(CreateLiveDetectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateLiveDetection", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateLiveDetectionResponse());
    }

    public CreateLiveDetectionResponse createLiveDetection(CreateLiveDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLiveDetectionWithOptions(request, runtime);
    }

    public DeleteDepartmentResponse deleteDepartmentWithOptions(DeleteDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteDepartment", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new DeleteDepartmentResponse());
    }

    public DeleteDepartmentResponse deleteDepartment(DeleteDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDepartmentWithOptions(request, runtime);
    }

    public ListFilesResponse listFilesWithOptions(ListFilesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListFiles", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new ListFilesResponse());
    }

    public ListFilesResponse listFiles(ListFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listFilesWithOptions(request, runtime);
    }

    public GetDepartmentResponse getDepartmentWithOptions(GetDepartmentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetDepartment", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new GetDepartmentResponse());
    }

    public GetDepartmentResponse getDepartment(GetDepartmentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDepartmentWithOptions(request, runtime);
    }

    public DeleteUserDepartmentsResponse deleteUserDepartmentsWithOptions(DeleteUserDepartmentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteUserDepartments", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new DeleteUserDepartmentsResponse());
    }

    public DeleteUserDepartmentsResponse deleteUserDepartments(DeleteUserDepartmentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserDepartmentsWithOptions(request, runtime);
    }

    public GetPreSignedUrlResponse getPreSignedUrlWithOptions(GetPreSignedUrlRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetPreSignedUrl", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new GetPreSignedUrlResponse());
    }

    public GetPreSignedUrlResponse getPreSignedUrl(GetPreSignedUrlRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPreSignedUrlWithOptions(request, runtime);
    }

    public DeleteRuleResponse deleteRuleWithOptions(DeleteRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("DeleteRule", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new DeleteRuleResponse());
    }

    public DeleteRuleResponse deleteRule(DeleteRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteRuleWithOptions(request, runtime);
    }

    public UpdateRuleResponse updateRuleWithOptions(UpdateRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("UpdateRule", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new UpdateRuleResponse());
    }

    public UpdateRuleResponse updateRule(UpdateRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateRuleWithOptions(request, runtime);
    }

    public ListStatisticsTaskResponse listStatisticsTaskWithOptions(ListStatisticsTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListStatisticsTask", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new ListStatisticsTaskResponse());
    }

    public ListStatisticsTaskResponse listStatisticsTask(ListStatisticsTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStatisticsTaskWithOptions(request, runtime);
    }

    public ListLivesResponse listLivesWithOptions(ListLivesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListLives", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new ListLivesResponse());
    }

    public ListLivesResponse listLives(ListLivesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLivesWithOptions(request, runtime);
    }

    public ExitLiveResponse exitLiveWithOptions(ExitLiveRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ExitLive", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new ExitLiveResponse());
    }

    public ExitLiveResponse exitLive(ExitLiveRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.exitLiveWithOptions(request, runtime);
    }

    public GetTaskResponse getTaskWithOptions(GetTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetTask", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new GetTaskResponse());
    }

    public GetTaskResponse getTask(GetTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskWithOptions(request, runtime);
    }

    public GetStatisticsResponse getStatisticsWithOptions(GetStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetStatistics", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new GetStatisticsResponse());
    }

    public GetStatisticsResponse getStatistics(GetStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStatisticsWithOptions(request, runtime);
    }

    public GetServiceConfigurationResponse getServiceConfigurationWithOptions(GetServiceConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetServiceConfiguration", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new GetServiceConfigurationResponse());
    }

    public GetServiceConfigurationResponse getServiceConfiguration(GetServiceConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getServiceConfigurationWithOptions(request, runtime);
    }

    public GetAppResponse getAppWithOptions(GetAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("GetApp", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new GetAppResponse());
    }

    public GetAppResponse getApp(GetAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAppWithOptions(request, runtime);
    }

    public CreateStatisticsRecordResponse createStatisticsRecordWithOptions(CreateStatisticsRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateStatisticsRecord", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateStatisticsRecordResponse());
    }

    public CreateStatisticsRecordResponse createStatisticsRecord(CreateStatisticsRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStatisticsRecordWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("ListUsers", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public CreateStatisticsTaskResponse createStatisticsTaskWithOptions(CreateStatisticsTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        return TeaModel.toModel(this.doRequest("CreateStatisticsTask", "HTTPS", "POST", "2020-06-30", "AK", null, TeaModel.buildMap(request), runtime), new CreateStatisticsTaskResponse());
    }

    public CreateStatisticsTaskResponse createStatisticsTask(CreateStatisticsTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStatisticsTaskWithOptions(request, runtime);
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
