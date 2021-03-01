// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101;

import com.aliyun.tea.*;
import com.aliyun.dms_enterprise20181101.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
        super(config);
        this._endpointRule = "central";
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("dms-enterprise", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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

    public SubmitStructSyncOrderApprovalResponse submitStructSyncOrderApprovalWithOptions(SubmitStructSyncOrderApprovalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitStructSyncOrderApproval", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitStructSyncOrderApprovalResponse());
    }

    public SubmitStructSyncOrderApprovalResponse submitStructSyncOrderApproval(SubmitStructSyncOrderApprovalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitStructSyncOrderApprovalWithOptions(request, runtime);
    }

    public ListDatabaseUserPermssionsResponse listDatabaseUserPermssionsWithOptions(ListDatabaseUserPermssionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDatabaseUserPermssions", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListDatabaseUserPermssionsResponse());
    }

    public ListDatabaseUserPermssionsResponse listDatabaseUserPermssions(ListDatabaseUserPermssionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDatabaseUserPermssionsWithOptions(request, runtime);
    }

    public ListSensitiveColumnsResponse listSensitiveColumnsWithOptions(ListSensitiveColumnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSensitiveColumns", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListSensitiveColumnsResponse());
    }

    public ListSensitiveColumnsResponse listSensitiveColumns(ListSensitiveColumnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSensitiveColumnsWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUsers", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public SubmitOrderApprovalResponse submitOrderApprovalWithOptions(SubmitOrderApprovalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SubmitOrderApproval", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SubmitOrderApprovalResponse());
    }

    public SubmitOrderApprovalResponse submitOrderApproval(SubmitOrderApprovalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitOrderApprovalWithOptions(request, runtime);
    }

    public GrantUserPermissionResponse grantUserPermissionWithOptions(GrantUserPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GrantUserPermission", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GrantUserPermissionResponse());
    }

    public GrantUserPermissionResponse grantUserPermission(GrantUserPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantUserPermissionWithOptions(request, runtime);
    }

    public GetMetaTableDetailInfoResponse getMetaTableDetailInfoWithOptions(GetMetaTableDetailInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMetaTableDetailInfo", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetMetaTableDetailInfoResponse());
    }

    public GetMetaTableDetailInfoResponse getMetaTableDetailInfo(GetMetaTableDetailInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMetaTableDetailInfoWithOptions(request, runtime);
    }

    public GetDataCorrectSQLFileResponse getDataCorrectSQLFileWithOptions(GetDataCorrectSQLFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDataCorrectSQLFile", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetDataCorrectSQLFileResponse());
    }

    public GetDataCorrectSQLFileResponse getDataCorrectSQLFile(GetDataCorrectSQLFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataCorrectSQLFileWithOptions(request, runtime);
    }

    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOrderShrinkRequest request = new CreateOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pluginParam)) {
            request.pluginParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pluginParam, "PluginParam", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateOrder", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateOrderResponse());
    }

    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    public ListDatabasesResponse listDatabasesWithOptions(ListDatabasesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDatabases", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListDatabasesResponse());
    }

    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDatabasesWithOptions(request, runtime);
    }

    public ListUserPermissionsResponse listUserPermissionsWithOptions(ListUserPermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListUserPermissions", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserPermissionsResponse());
    }

    public ListUserPermissionsResponse listUserPermissions(ListUserPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserPermissionsWithOptions(request, runtime);
    }

    public ListWorkFlowTemplatesResponse listWorkFlowTemplatesWithOptions(ListWorkFlowTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListWorkFlowTemplates", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListWorkFlowTemplatesResponse());
    }

    public ListWorkFlowTemplatesResponse listWorkFlowTemplates(ListWorkFlowTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listWorkFlowTemplatesWithOptions(request, runtime);
    }

    public GetDataExportOrderDetailResponse getDataExportOrderDetailWithOptions(GetDataExportOrderDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDataExportOrderDetail", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetDataExportOrderDetailResponse());
    }

    public GetDataExportOrderDetailResponse getDataExportOrderDetail(GetDataExportOrderDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataExportOrderDetailWithOptions(request, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListInstances", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListInstancesResponse());
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    public GetUserUploadFileJobResponse getUserUploadFileJobWithOptions(GetUserUploadFileJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUserUploadFileJob", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserUploadFileJobResponse());
    }

    public GetUserUploadFileJobResponse getUserUploadFileJob(GetUserUploadFileJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserUploadFileJobWithOptions(request, runtime);
    }

    public GetStructSyncJobDetailResponse getStructSyncJobDetailWithOptions(GetStructSyncJobDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetStructSyncJobDetail", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetStructSyncJobDetailResponse());
    }

    public GetStructSyncJobDetailResponse getStructSyncJobDetail(GetStructSyncJobDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStructSyncJobDetailWithOptions(request, runtime);
    }

    public CreateUploadOSSFileJobResponse createUploadOSSFileJobWithOptions(CreateUploadOSSFileJobRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUploadOSSFileJobShrinkRequest request = new CreateUploadOSSFileJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.uploadTarget))) {
            request.uploadTargetShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.uploadTarget), "UploadTarget", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUploadOSSFileJob", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUploadOSSFileJobResponse());
    }

    public CreateUploadOSSFileJobResponse createUploadOSSFileJob(CreateUploadOSSFileJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUploadOSSFileJobWithOptions(request, runtime);
    }

    public SearchDatabaseResponse searchDatabaseWithOptions(SearchDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchDatabase", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SearchDatabaseResponse());
    }

    public SearchDatabaseResponse searchDatabase(SearchDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchDatabaseWithOptions(request, runtime);
    }

    public SyncDatabaseMetaResponse syncDatabaseMetaWithOptions(SyncDatabaseMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncDatabaseMeta", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SyncDatabaseMetaResponse());
    }

    public SyncDatabaseMetaResponse syncDatabaseMeta(SyncDatabaseMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncDatabaseMetaWithOptions(request, runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetUser", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserResponse());
    }

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    public ExecuteStructSyncResponse executeStructSyncWithOptions(ExecuteStructSyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteStructSync", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteStructSyncResponse());
    }

    public ExecuteStructSyncResponse executeStructSync(ExecuteStructSyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeStructSyncWithOptions(request, runtime);
    }

    public GetDataCorrectOrderDetailResponse getDataCorrectOrderDetailWithOptions(GetDataCorrectOrderDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDataCorrectOrderDetail", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetDataCorrectOrderDetailResponse());
    }

    public GetDataCorrectOrderDetailResponse getDataCorrectOrderDetail(GetDataCorrectOrderDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataCorrectOrderDetailWithOptions(request, runtime);
    }

    public ListColumnsResponse listColumnsWithOptions(ListColumnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListColumns", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListColumnsResponse());
    }

    public ListColumnsResponse listColumns(ListColumnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listColumnsWithOptions(request, runtime);
    }

    public RevokeUserPermissionResponse revokeUserPermissionWithOptions(RevokeUserPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RevokeUserPermission", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new RevokeUserPermissionResponse());
    }

    public RevokeUserPermissionResponse revokeUserPermission(RevokeUserPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeUserPermissionWithOptions(request, runtime);
    }

    public GetMetaTableColumnResponse getMetaTableColumnWithOptions(GetMetaTableColumnRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetMetaTableColumn", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetMetaTableColumnResponse());
    }

    public GetMetaTableColumnResponse getMetaTableColumn(GetMetaTableColumnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMetaTableColumnWithOptions(request, runtime);
    }

    public EnableUserResponse enableUserWithOptions(EnableUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("EnableUser", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new EnableUserResponse());
    }

    public EnableUserResponse enableUser(EnableUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableUserWithOptions(request, runtime);
    }

    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateInstance", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateInstanceResponse());
    }

    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceWithOptions(request, runtime);
    }

    public ExecuteScriptResponse executeScriptWithOptions(ExecuteScriptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteScript", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteScriptResponse());
    }

    public ExecuteScriptResponse executeScript(ExecuteScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeScriptWithOptions(request, runtime);
    }

    public ListDBTaskSQLJobDetailResponse listDBTaskSQLJobDetailWithOptions(ListDBTaskSQLJobDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDBTaskSQLJobDetail", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListDBTaskSQLJobDetailResponse());
    }

    public ListDBTaskSQLJobDetailResponse listDBTaskSQLJobDetail(ListDBTaskSQLJobDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDBTaskSQLJobDetailWithOptions(request, runtime);
    }

    public DisableUserResponse disableUserWithOptions(DisableUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DisableUser", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DisableUserResponse());
    }

    public DisableUserResponse disableUser(DisableUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableUserWithOptions(request, runtime);
    }

    public GetApprovalDetailResponse getApprovalDetailWithOptions(GetApprovalDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetApprovalDetail", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetApprovalDetailResponse());
    }

    public GetApprovalDetailResponse getApprovalDetail(GetApprovalDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApprovalDetailWithOptions(request, runtime);
    }

    public GetUserActiveTenantResponse getUserActiveTenantWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("GetUserActiveTenant", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetUserActiveTenantResponse());
    }

    public GetUserActiveTenantResponse getUserActiveTenant() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserActiveTenantWithOptions(runtime);
    }

    public RegisterUserResponse registerUserWithOptions(RegisterUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterUser", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterUserResponse());
    }

    public RegisterUserResponse registerUser(RegisterUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerUserWithOptions(request, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetInstance", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    public GetPermApplyOrderDetailResponse getPermApplyOrderDetailWithOptions(GetPermApplyOrderDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetPermApplyOrderDetail", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetPermApplyOrderDetailResponse());
    }

    public GetPermApplyOrderDetailResponse getPermApplyOrderDetail(GetPermApplyOrderDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPermApplyOrderDetailWithOptions(request, runtime);
    }

    public ListIndexesResponse listIndexesWithOptions(ListIndexesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListIndexes", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListIndexesResponse());
    }

    public ListIndexesResponse listIndexes(ListIndexesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIndexesWithOptions(request, runtime);
    }

    public ListLogicTablesResponse listLogicTablesWithOptions(ListLogicTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLogicTables", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListLogicTablesResponse());
    }

    public ListLogicTablesResponse listLogicTables(ListLogicTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLogicTablesWithOptions(request, runtime);
    }

    public GetDataExportDownloadURLResponse getDataExportDownloadURLWithOptions(GetDataExportDownloadURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDataExportDownloadURL", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetDataExportDownloadURLResponse());
    }

    public GetDataExportDownloadURLResponse getDataExportDownloadURL(GetDataExportDownloadURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataExportDownloadURLWithOptions(request, runtime);
    }

    public CreatePublishGroupTaskResponse createPublishGroupTaskWithOptions(CreatePublishGroupTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreatePublishGroupTask", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreatePublishGroupTaskResponse());
    }

    public CreatePublishGroupTaskResponse createPublishGroupTask(CreatePublishGroupTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPublishGroupTaskWithOptions(request, runtime);
    }

    public GetDatabaseResponse getDatabaseWithOptions(GetDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDatabase", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetDatabaseResponse());
    }

    public GetDatabaseResponse getDatabase(GetDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDatabaseWithOptions(request, runtime);
    }

    public GetOwnerApplyOrderDetailResponse getOwnerApplyOrderDetailWithOptions(GetOwnerApplyOrderDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOwnerApplyOrderDetail", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetOwnerApplyOrderDetailResponse());
    }

    public GetOwnerApplyOrderDetailResponse getOwnerApplyOrderDetail(GetOwnerApplyOrderDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOwnerApplyOrderDetailWithOptions(request, runtime);
    }

    public GetOpLogResponse getOpLogWithOptions(GetOpLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOpLog", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetOpLogResponse());
    }

    public GetOpLogResponse getOpLog(GetOpLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOpLogWithOptions(request, runtime);
    }

    public SearchTableResponse searchTableWithOptions(SearchTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SearchTable", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SearchTableResponse());
    }

    public SearchTableResponse searchTable(SearchTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTableWithOptions(request, runtime);
    }

    public ListDBTaskSQLJobResponse listDBTaskSQLJobWithOptions(ListDBTaskSQLJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListDBTaskSQLJob", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListDBTaskSQLJobResponse());
    }

    public ListDBTaskSQLJobResponse listDBTaskSQLJob(ListDBTaskSQLJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDBTaskSQLJobWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteUser", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public GetStructSyncJobAnalyzeResultResponse getStructSyncJobAnalyzeResultWithOptions(GetStructSyncJobAnalyzeResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetStructSyncJobAnalyzeResult", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetStructSyncJobAnalyzeResultResponse());
    }

    public GetStructSyncJobAnalyzeResultResponse getStructSyncJobAnalyzeResult(GetStructSyncJobAnalyzeResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStructSyncJobAnalyzeResultWithOptions(request, runtime);
    }

    public ApproveOrderResponse approveOrderWithOptions(ApproveOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ApproveOrder", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ApproveOrderResponse());
    }

    public ApproveOrderResponse approveOrder(ApproveOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.approveOrderWithOptions(request, runtime);
    }

    public CreateUploadFileJobResponse createUploadFileJobWithOptions(CreateUploadFileJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateUploadFileJob", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateUploadFileJobResponse());
    }

    public CreateUploadFileJobResponse createUploadFileJob(CreateUploadFileJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUploadFileJobWithOptions(request, runtime);
    }

    public ListLogicDatabasesResponse listLogicDatabasesWithOptions(ListLogicDatabasesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListLogicDatabases", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListLogicDatabasesResponse());
    }

    public ListLogicDatabasesResponse listLogicDatabases(ListLogicDatabasesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLogicDatabasesWithOptions(request, runtime);
    }

    public CloseOrderResponse closeOrderWithOptions(CloseOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CloseOrder", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CloseOrderResponse());
    }

    public CloseOrderResponse closeOrder(CloseOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeOrderWithOptions(request, runtime);
    }

    public SyncInstanceMetaResponse syncInstanceMetaWithOptions(SyncInstanceMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SyncInstanceMeta", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SyncInstanceMetaResponse());
    }

    public SyncInstanceMetaResponse syncInstanceMeta(SyncInstanceMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncInstanceMetaWithOptions(request, runtime);
    }

    public ListOrdersResponse listOrdersWithOptions(ListOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListOrders", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListOrdersResponse());
    }

    public ListOrdersResponse listOrders(ListOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOrdersWithOptions(request, runtime);
    }

    public GetOrderBaseInfoResponse getOrderBaseInfoWithOptions(GetOrderBaseInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetOrderBaseInfo", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetOrderBaseInfoResponse());
    }

    public GetOrderBaseInfoResponse getOrderBaseInfo(GetOrderBaseInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOrderBaseInfoWithOptions(request, runtime);
    }

    public ListUserTenantsResponse listUserTenantsWithOptions(RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = new OpenApiRequest();
        return TeaModel.toModel(this.doRPCRequest("ListUserTenants", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListUserTenantsResponse());
    }

    public ListUserTenantsResponse listUserTenants() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserTenantsWithOptions(runtime);
    }

    public SetOwnersResponse setOwnersWithOptions(SetOwnersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("SetOwners", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new SetOwnersResponse());
    }

    public SetOwnersResponse setOwners(SetOwnersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setOwnersWithOptions(request, runtime);
    }

    public GetLogicDatabaseResponse getLogicDatabaseWithOptions(GetLogicDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetLogicDatabase", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetLogicDatabaseResponse());
    }

    public GetLogicDatabaseResponse getLogicDatabase(GetLogicDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLogicDatabaseWithOptions(request, runtime);
    }

    public GetDataCorrectBackupFilesResponse getDataCorrectBackupFilesWithOptions(GetDataCorrectBackupFilesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDataCorrectBackupFilesShrinkRequest request = new GetDataCorrectBackupFilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actionDetail)) {
            request.actionDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actionDetail, "ActionDetail", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetDataCorrectBackupFiles", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetDataCorrectBackupFilesResponse());
    }

    public GetDataCorrectBackupFilesResponse getDataCorrectBackupFiles(GetDataCorrectBackupFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataCorrectBackupFilesWithOptions(request, runtime);
    }

    public RegisterInstanceResponse registerInstanceWithOptions(RegisterInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("RegisterInstance", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new RegisterInstanceResponse());
    }

    public RegisterInstanceResponse registerInstance(RegisterInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerInstanceWithOptions(request, runtime);
    }

    public CreateStructSyncOrderResponse createStructSyncOrderWithOptions(CreateStructSyncOrderRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStructSyncOrderShrinkRequest request = new CreateStructSyncOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedUserList)) {
            request.relatedUserListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedUserList, "RelatedUserList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.param))) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.param), "Param", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("CreateStructSyncOrder", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new CreateStructSyncOrderResponse());
    }

    public CreateStructSyncOrderResponse createStructSyncOrder(CreateStructSyncOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStructSyncOrderWithOptions(request, runtime);
    }

    public ExecuteDataExportResponse executeDataExportWithOptions(ExecuteDataExportRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExecuteDataExportShrinkRequest request = new ExecuteDataExportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actionDetail)) {
            request.actionDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actionDetail, "ActionDetail", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteDataExport", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteDataExportResponse());
    }

    public ExecuteDataExportResponse executeDataExport(ExecuteDataExportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeDataExportWithOptions(request, runtime);
    }

    public ExecuteDataCorrectResponse executeDataCorrectWithOptions(ExecuteDataCorrectRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExecuteDataCorrectShrinkRequest request = new ExecuteDataCorrectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actionDetail)) {
            request.actionDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actionDetail, "ActionDetail", "json");
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ExecuteDataCorrect", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ExecuteDataCorrectResponse());
    }

    public ExecuteDataCorrectResponse executeDataCorrect(ExecuteDataCorrectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeDataCorrectWithOptions(request, runtime);
    }

    public ListTablesResponse listTablesWithOptions(ListTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListTables", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListTablesResponse());
    }

    public ListTablesResponse listTables(ListTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTablesWithOptions(request, runtime);
    }

    public ListWorkFlowNodesResponse listWorkFlowNodesWithOptions(ListWorkFlowNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListWorkFlowNodes", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListWorkFlowNodesResponse());
    }

    public ListWorkFlowNodesResponse listWorkFlowNodes(ListWorkFlowNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listWorkFlowNodesWithOptions(request, runtime);
    }

    public GetStructSyncOrderDetailResponse getStructSyncOrderDetailWithOptions(GetStructSyncOrderDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetStructSyncOrderDetail", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetStructSyncOrderDetailResponse());
    }

    public GetStructSyncOrderDetailResponse getStructSyncOrderDetail(GetStructSyncOrderDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStructSyncOrderDetailWithOptions(request, runtime);
    }

    public ListSensitiveColumnsDetailResponse listSensitiveColumnsDetailWithOptions(ListSensitiveColumnsDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("ListSensitiveColumnsDetail", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new ListSensitiveColumnsDetailResponse());
    }

    public ListSensitiveColumnsDetailResponse listSensitiveColumnsDetail(ListSensitiveColumnsDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSensitiveColumnsDetailWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("UpdateUser", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }

    public GetStructSyncExecSqlDetailResponse getStructSyncExecSqlDetailWithOptions(GetStructSyncExecSqlDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetStructSyncExecSqlDetail", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetStructSyncExecSqlDetailResponse());
    }

    public GetStructSyncExecSqlDetailResponse getStructSyncExecSqlDetail(GetStructSyncExecSqlDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStructSyncExecSqlDetailWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("DeleteInstance", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public GetTableDBTopologyResponse getTableDBTopologyWithOptions(GetTableDBTopologyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.teautil.Common.toMap(request))
        ));
        return TeaModel.toModel(this.doRPCRequest("GetTableDBTopology", "2018-11-01", "HTTPS", "POST", "AK", "json", req, runtime), new GetTableDBTopologyResponse());
    }

    public GetTableDBTopologyResponse getTableDBTopology(GetTableDBTopologyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTableDBTopologyWithOptions(request, runtime);
    }
}
