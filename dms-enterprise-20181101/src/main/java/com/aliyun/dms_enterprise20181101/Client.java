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

    public AddLhMembersResponse addLhMembersWithOptions(AddLhMembersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddLhMembersShrinkRequest request = new AddLhMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.members)) {
            request.membersShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.members, "Members", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.membersShrink)) {
            query.put("Members", request.membersShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddLhMembers"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddLhMembersResponse());
    }

    public AddLhMembersResponse addLhMembers(AddLhMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLhMembersWithOptions(request, runtime);
    }

    public AddLogicTableRouteConfigResponse addLogicTableRouteConfigWithOptions(AddLogicTableRouteConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.routeExpr)) {
            query.put("RouteExpr", request.routeExpr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.routeKey)) {
            query.put("RouteKey", request.routeKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            query.put("TableId", request.tableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddLogicTableRouteConfig"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddLogicTableRouteConfigResponse());
    }

    public AddLogicTableRouteConfigResponse addLogicTableRouteConfig(AddLogicTableRouteConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.addLogicTableRouteConfigWithOptions(request, runtime);
    }

    public ApproveOrderResponse approveOrderWithOptions(ApproveOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalType)) {
            query.put("ApprovalType", request.approvalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowInstanceId)) {
            query.put("WorkflowInstanceId", request.workflowInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApproveOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApproveOrderResponse());
    }

    public ApproveOrderResponse approveOrder(ApproveOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.approveOrderWithOptions(request, runtime);
    }

    public ChangeColumnSecLevelResponse changeColumnSecLevelWithOptions(ChangeColumnSecLevelRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnName)) {
            query.put("ColumnName", request.columnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isLogic)) {
            query.put("IsLogic", request.isLogic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newLevel)) {
            query.put("NewLevel", request.newLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeColumnSecLevel"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeColumnSecLevelResponse());
    }

    public ChangeColumnSecLevelResponse changeColumnSecLevel(ChangeColumnSecLevelRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeColumnSecLevelWithOptions(request, runtime);
    }

    public ChangeLhDagOwnerResponse changeLhDagOwnerWithOptions(ChangeLhDagOwnerRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerUserId)) {
            query.put("OwnerUserId", request.ownerUserId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeLhDagOwner"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeLhDagOwnerResponse());
    }

    public ChangeLhDagOwnerResponse changeLhDagOwner(ChangeLhDagOwnerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.changeLhDagOwnerWithOptions(request, runtime);
    }

    public CloseOrderResponse closeOrderWithOptions(CloseOrderRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.closeReason)) {
            query.put("CloseReason", request.closeReason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CloseOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CloseOrderResponse());
    }

    public CloseOrderResponse closeOrder(CloseOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.closeOrderWithOptions(request, runtime);
    }

    public CreateDataCorrectOrderResponse createDataCorrectOrderWithOptions(CreateDataCorrectOrderRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataCorrectOrderShrinkRequest request = new CreateDataCorrectOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.param))) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.param), "Param", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedUserList)) {
            request.relatedUserListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedUserList, "RelatedUserList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachmentKey)) {
            query.put("AttachmentKey", request.attachmentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramShrink)) {
            query.put("Param", request.paramShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedUserListShrink)) {
            query.put("RelatedUserList", request.relatedUserListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataCorrectOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataCorrectOrderResponse());
    }

    public CreateDataCorrectOrderResponse createDataCorrectOrder(CreateDataCorrectOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDataCorrectOrderWithOptions(request, runtime);
    }

    public CreateDataCronClearOrderResponse createDataCronClearOrderWithOptions(CreateDataCronClearOrderRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataCronClearOrderShrinkRequest request = new CreateDataCronClearOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.param))) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.param), "Param", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedUserList)) {
            request.relatedUserListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedUserList, "RelatedUserList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachmentKey)) {
            query.put("AttachmentKey", request.attachmentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramShrink)) {
            query.put("Param", request.paramShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedUserListShrink)) {
            query.put("RelatedUserList", request.relatedUserListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataCronClearOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataCronClearOrderResponse());
    }

    public CreateDataCronClearOrderResponse createDataCronClearOrder(CreateDataCronClearOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDataCronClearOrderWithOptions(request, runtime);
    }

    public CreateDataImportOrderResponse createDataImportOrderWithOptions(CreateDataImportOrderRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataImportOrderShrinkRequest request = new CreateDataImportOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.param))) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.param), "Param", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedUserList)) {
            request.relatedUserListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedUserList, "RelatedUserList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachmentKey)) {
            query.put("AttachmentKey", request.attachmentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramShrink)) {
            query.put("Param", request.paramShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedUserListShrink)) {
            query.put("RelatedUserList", request.relatedUserListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataImportOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataImportOrderResponse());
    }

    public CreateDataImportOrderResponse createDataImportOrder(CreateDataImportOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createDataImportOrderWithOptions(request, runtime);
    }

    public CreateFreeLockCorrectOrderResponse createFreeLockCorrectOrderWithOptions(CreateFreeLockCorrectOrderRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFreeLockCorrectOrderShrinkRequest request = new CreateFreeLockCorrectOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.param))) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.param), "Param", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedUserList)) {
            request.relatedUserListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedUserList, "RelatedUserList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachmentKey)) {
            query.put("AttachmentKey", request.attachmentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramShrink)) {
            query.put("Param", request.paramShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedUserListShrink)) {
            query.put("RelatedUserList", request.relatedUserListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFreeLockCorrectOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFreeLockCorrectOrderResponse());
    }

    public CreateFreeLockCorrectOrderResponse createFreeLockCorrectOrder(CreateFreeLockCorrectOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createFreeLockCorrectOrderWithOptions(request, runtime);
    }

    public CreateLakeHouseSpaceResponse createLakeHouseSpaceWithOptions(CreateLakeHouseSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.devDbId)) {
            query.put("DevDbId", request.devDbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dwDbType)) {
            query.put("DwDbType", request.dwDbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodDbId)) {
            query.put("ProdDbId", request.prodDbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceConfig)) {
            query.put("SpaceConfig", request.spaceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.spaceName)) {
            query.put("SpaceName", request.spaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLakeHouseSpace"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLakeHouseSpaceResponse());
    }

    public CreateLakeHouseSpaceResponse createLakeHouseSpace(CreateLakeHouseSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLakeHouseSpaceWithOptions(request, runtime);
    }

    public CreateLogicDatabaseResponse createLogicDatabaseWithOptions(CreateLogicDatabaseRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateLogicDatabaseShrinkRequest request = new CreateLogicDatabaseShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.databaseIds)) {
            request.databaseIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.databaseIds, "DatabaseIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            query.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseIdsShrink)) {
            query.put("DatabaseIds", request.databaseIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLogicDatabase"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLogicDatabaseResponse());
    }

    public CreateLogicDatabaseResponse createLogicDatabase(CreateLogicDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createLogicDatabaseWithOptions(request, runtime);
    }

    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateOrderShrinkRequest request = new CreateOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pluginParam)) {
            request.pluginParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pluginParam, "PluginParam", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachmentKey)) {
            query.put("AttachmentKey", request.attachmentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginType)) {
            query.put("PluginType", request.pluginType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedUserList)) {
            query.put("RelatedUserList", request.relatedUserList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pluginParamShrink)) {
            body.put("PluginParam", request.pluginParamShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOrderResponse());
    }

    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    public CreateProxyResponse createProxyWithOptions(CreateProxyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.username)) {
            query.put("Username", request.username);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProxy"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProxyResponse());
    }

    public CreateProxyResponse createProxy(CreateProxyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProxyWithOptions(request, runtime);
    }

    public CreateProxyAccessResponse createProxyAccessWithOptions(CreateProxyAccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.indepAccount)) {
            query.put("IndepAccount", request.indepAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indepPassword)) {
            query.put("IndepPassword", request.indepPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyId)) {
            query.put("ProxyId", request.proxyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProxyAccess"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProxyAccessResponse());
    }

    public CreateProxyAccessResponse createProxyAccess(CreateProxyAccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createProxyAccessWithOptions(request, runtime);
    }

    public CreatePublishGroupTaskResponse createPublishGroupTaskWithOptions(CreatePublishGroupTaskRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logic)) {
            query.put("Logic", request.logic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planTime)) {
            query.put("PlanTime", request.planTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.publishStrategy)) {
            query.put("PublishStrategy", request.publishStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePublishGroupTask"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePublishGroupTaskResponse());
    }

    public CreatePublishGroupTaskResponse createPublishGroupTask(CreatePublishGroupTaskRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createPublishGroupTaskWithOptions(request, runtime);
    }

    public CreateSQLReviewOrderResponse createSQLReviewOrderWithOptions(CreateSQLReviewOrderRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSQLReviewOrderShrinkRequest request = new CreateSQLReviewOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.param))) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.param), "Param", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedUserList)) {
            request.relatedUserListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedUserList, "RelatedUserList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramShrink)) {
            query.put("Param", request.paramShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedUserListShrink)) {
            query.put("RelatedUserList", request.relatedUserListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSQLReviewOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSQLReviewOrderResponse());
    }

    public CreateSQLReviewOrderResponse createSQLReviewOrder(CreateSQLReviewOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createSQLReviewOrderWithOptions(request, runtime);
    }

    public CreateStandardGroupResponse createStandardGroupWithOptions(CreateStandardGroupRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            query.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStandardGroup"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStandardGroupResponse());
    }

    public CreateStandardGroupResponse createStandardGroup(CreateStandardGroupRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStandardGroupWithOptions(request, runtime);
    }

    public CreateStructSyncOrderResponse createStructSyncOrderWithOptions(CreateStructSyncOrderRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStructSyncOrderShrinkRequest request = new CreateStructSyncOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.param))) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.param), "Param", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.relatedUserList)) {
            request.relatedUserListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.relatedUserList, "RelatedUserList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attachmentKey)) {
            query.put("AttachmentKey", request.attachmentKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.paramShrink)) {
            query.put("Param", request.paramShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedUserListShrink)) {
            query.put("RelatedUserList", request.relatedUserListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStructSyncOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStructSyncOrderResponse());
    }

    public CreateStructSyncOrderResponse createStructSyncOrder(CreateStructSyncOrderRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createStructSyncOrderWithOptions(request, runtime);
    }

    public CreateUploadFileJobResponse createUploadFileJobWithOptions(CreateUploadFileJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSource)) {
            query.put("FileSource", request.fileSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadURL)) {
            query.put("UploadURL", request.uploadURL);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUploadFileJob"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUploadFileJobResponse());
    }

    public CreateUploadFileJobResponse createUploadFileJob(CreateUploadFileJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUploadFileJobWithOptions(request, runtime);
    }

    public CreateUploadOSSFileJobResponse createUploadOSSFileJobWithOptions(CreateUploadOSSFileJobRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUploadOSSFileJobShrinkRequest request = new CreateUploadOSSFileJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.uploadTarget))) {
            request.uploadTargetShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.uploadTarget), "UploadTarget", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileSource)) {
            query.put("FileSource", request.fileSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uploadTargetShrink)) {
            query.put("UploadTarget", request.uploadTargetShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUploadOSSFileJob"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUploadOSSFileJobResponse());
    }

    public CreateUploadOSSFileJobResponse createUploadOSSFileJob(CreateUploadOSSFileJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.createUploadOSSFileJobWithOptions(request, runtime);
    }

    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sid)) {
            query.put("Sid", request.sid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteInstance"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteInstanceResponse());
    }

    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    public DeleteLakeHouseSpaceResponse deleteLakeHouseSpaceWithOptions(DeleteLakeHouseSpaceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.spaceId)) {
            query.put("SpaceId", request.spaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLakeHouseSpace"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLakeHouseSpaceResponse());
    }

    public DeleteLakeHouseSpaceResponse deleteLakeHouseSpace(DeleteLakeHouseSpaceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLakeHouseSpaceWithOptions(request, runtime);
    }

    public DeleteLhMembersResponse deleteLhMembersWithOptions(DeleteLhMembersRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteLhMembersShrinkRequest request = new DeleteLhMembersShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.memberIds)) {
            request.memberIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.memberIds, "MemberIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.memberIdsShrink)) {
            query.put("MemberIds", request.memberIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectId)) {
            query.put("ObjectId", request.objectId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.objectType)) {
            query.put("ObjectType", request.objectType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLhMembers"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLhMembersResponse());
    }

    public DeleteLhMembersResponse deleteLhMembers(DeleteLhMembersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLhMembersWithOptions(request, runtime);
    }

    public DeleteLogicDatabaseResponse deleteLogicDatabaseWithOptions(DeleteLogicDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicDbId)) {
            query.put("LogicDbId", request.logicDbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLogicDatabase"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLogicDatabaseResponse());
    }

    public DeleteLogicDatabaseResponse deleteLogicDatabase(DeleteLogicDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLogicDatabaseWithOptions(request, runtime);
    }

    public DeleteLogicTableRouteConfigResponse deleteLogicTableRouteConfigWithOptions(DeleteLogicTableRouteConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.routeKey)) {
            query.put("RouteKey", request.routeKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            query.put("TableId", request.tableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLogicTableRouteConfig"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLogicTableRouteConfigResponse());
    }

    public DeleteLogicTableRouteConfigResponse deleteLogicTableRouteConfig(DeleteLogicTableRouteConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteLogicTableRouteConfigWithOptions(request, runtime);
    }

    public DeleteProxyResponse deleteProxyWithOptions(DeleteProxyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.proxyId)) {
            query.put("ProxyId", request.proxyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProxy"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProxyResponse());
    }

    public DeleteProxyResponse deleteProxy(DeleteProxyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProxyWithOptions(request, runtime);
    }

    public DeleteProxyAccessResponse deleteProxyAccessWithOptions(DeleteProxyAccessRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.proxyAccessId)) {
            query.put("ProxyAccessId", request.proxyAccessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteProxyAccess"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteProxyAccessResponse());
    }

    public DeleteProxyAccessResponse deleteProxyAccess(DeleteProxyAccessRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteProxyAccessWithOptions(request, runtime);
    }

    public DeleteTaskFlowResponse deleteTaskFlowWithOptions(DeleteTaskFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTaskFlow"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTaskFlowResponse());
    }

    public DeleteTaskFlowResponse deleteTaskFlow(DeleteTaskFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteTaskFlowWithOptions(request, runtime);
    }

    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteUser"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteUserResponse());
    }

    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    public DisableUserResponse disableUserWithOptions(DisableUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableUser"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableUserResponse());
    }

    public DisableUserResponse disableUser(DisableUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.disableUserWithOptions(request, runtime);
    }

    public EditLogicDatabaseResponse editLogicDatabaseWithOptions(EditLogicDatabaseRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        EditLogicDatabaseShrinkRequest request = new EditLogicDatabaseShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.databaseIds)) {
            request.databaseIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.databaseIds, "DatabaseIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.alias)) {
            query.put("Alias", request.alias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseIdsShrink)) {
            query.put("DatabaseIds", request.databaseIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logicDbId)) {
            query.put("LogicDbId", request.logicDbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EditLogicDatabase"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EditLogicDatabaseResponse());
    }

    public EditLogicDatabaseResponse editLogicDatabase(EditLogicDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.editLogicDatabaseWithOptions(request, runtime);
    }

    public EnableUserResponse enableUserWithOptions(EnableUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableUser"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableUserResponse());
    }

    public EnableUserResponse enableUser(EnableUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.enableUserWithOptions(request, runtime);
    }

    public ExecuteDataCorrectResponse executeDataCorrectWithOptions(ExecuteDataCorrectRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExecuteDataCorrectShrinkRequest request = new ExecuteDataCorrectShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actionDetail)) {
            request.actionDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actionDetail, "ActionDetail", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionDetailShrink)) {
            query.put("ActionDetail", request.actionDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteDataCorrect"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteDataCorrectResponse());
    }

    public ExecuteDataCorrectResponse executeDataCorrect(ExecuteDataCorrectRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeDataCorrectWithOptions(request, runtime);
    }

    public ExecuteDataExportResponse executeDataExportWithOptions(ExecuteDataExportRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ExecuteDataExportShrinkRequest request = new ExecuteDataExportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actionDetail)) {
            request.actionDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actionDetail, "ActionDetail", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionDetailShrink)) {
            query.put("ActionDetail", request.actionDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteDataExport"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteDataExportResponse());
    }

    public ExecuteDataExportResponse executeDataExport(ExecuteDataExportRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeDataExportWithOptions(request, runtime);
    }

    public ExecuteScriptResponse executeScriptWithOptions(ExecuteScriptRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logic)) {
            query.put("Logic", request.logic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.script)) {
            query.put("Script", request.script);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteScript"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteScriptResponse());
    }

    public ExecuteScriptResponse executeScript(ExecuteScriptRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeScriptWithOptions(request, runtime);
    }

    public ExecuteStructSyncResponse executeStructSyncWithOptions(ExecuteStructSyncRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteStructSync"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteStructSyncResponse());
    }

    public ExecuteStructSyncResponse executeStructSync(ExecuteStructSyncRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.executeStructSyncWithOptions(request, runtime);
    }

    public GetApprovalDetailResponse getApprovalDetailWithOptions(GetApprovalDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowInstanceId)) {
            query.put("WorkflowInstanceId", request.workflowInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApprovalDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApprovalDetailResponse());
    }

    public GetApprovalDetailResponse getApprovalDetail(GetApprovalDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getApprovalDetailWithOptions(request, runtime);
    }

    public GetDBTaskSQLJobLogResponse getDBTaskSQLJobLogWithOptions(GetDBTaskSQLJobLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDBTaskSQLJobLog"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDBTaskSQLJobLogResponse());
    }

    public GetDBTaskSQLJobLogResponse getDBTaskSQLJobLog(GetDBTaskSQLJobLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDBTaskSQLJobLogWithOptions(request, runtime);
    }

    public GetDBTopologyResponse getDBTopologyWithOptions(GetDBTopologyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicDbId)) {
            query.put("LogicDbId", request.logicDbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDBTopology"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDBTopologyResponse());
    }

    public GetDBTopologyResponse getDBTopology(GetDBTopologyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDBTopologyWithOptions(request, runtime);
    }

    public GetDataCorrectBackupFilesResponse getDataCorrectBackupFilesWithOptions(GetDataCorrectBackupFilesRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetDataCorrectBackupFilesShrinkRequest request = new GetDataCorrectBackupFilesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.actionDetail)) {
            request.actionDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.actionDetail, "ActionDetail", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionDetailShrink)) {
            query.put("ActionDetail", request.actionDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataCorrectBackupFiles"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataCorrectBackupFilesResponse());
    }

    public GetDataCorrectBackupFilesResponse getDataCorrectBackupFiles(GetDataCorrectBackupFilesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataCorrectBackupFilesWithOptions(request, runtime);
    }

    public GetDataCorrectOrderDetailResponse getDataCorrectOrderDetailWithOptions(GetDataCorrectOrderDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataCorrectOrderDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataCorrectOrderDetailResponse());
    }

    public GetDataCorrectOrderDetailResponse getDataCorrectOrderDetail(GetDataCorrectOrderDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataCorrectOrderDetailWithOptions(request, runtime);
    }

    public GetDataCorrectSQLFileResponse getDataCorrectSQLFileWithOptions(GetDataCorrectSQLFileRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataCorrectSQLFile"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataCorrectSQLFileResponse());
    }

    public GetDataCorrectSQLFileResponse getDataCorrectSQLFile(GetDataCorrectSQLFileRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataCorrectSQLFileWithOptions(request, runtime);
    }

    public GetDataCorrectTaskDetailResponse getDataCorrectTaskDetailWithOptions(GetDataCorrectTaskDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataCorrectTaskDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataCorrectTaskDetailResponse());
    }

    public GetDataCorrectTaskDetailResponse getDataCorrectTaskDetail(GetDataCorrectTaskDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataCorrectTaskDetailWithOptions(request, runtime);
    }

    public GetDataCronClearTaskDetailListResponse getDataCronClearTaskDetailListWithOptions(GetDataCronClearTaskDetailListRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataCronClearTaskDetailList"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataCronClearTaskDetailListResponse());
    }

    public GetDataCronClearTaskDetailListResponse getDataCronClearTaskDetailList(GetDataCronClearTaskDetailListRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataCronClearTaskDetailListWithOptions(request, runtime);
    }

    public GetDataExportDownloadURLResponse getDataExportDownloadURLWithOptions(GetDataExportDownloadURLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataExportDownloadURL"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataExportDownloadURLResponse());
    }

    public GetDataExportDownloadURLResponse getDataExportDownloadURL(GetDataExportDownloadURLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataExportDownloadURLWithOptions(request, runtime);
    }

    public GetDataExportOrderDetailResponse getDataExportOrderDetailWithOptions(GetDataExportOrderDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("OrderId", request.orderId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataExportOrderDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataExportOrderDetailResponse());
    }

    public GetDataExportOrderDetailResponse getDataExportOrderDetail(GetDataExportOrderDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDataExportOrderDetailWithOptions(request, runtime);
    }

    public GetDatabaseResponse getDatabaseWithOptions(GetDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sid)) {
            query.put("Sid", request.sid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatabase"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatabaseResponse());
    }

    public GetDatabaseResponse getDatabase(GetDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getDatabaseWithOptions(request, runtime);
    }

    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sid)) {
            query.put("Sid", request.sid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetInstance"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetInstanceResponse());
    }

    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    public GetLhSpaceByNameResponse getLhSpaceByNameWithOptions(GetLhSpaceByNameRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.spaceName)) {
            query.put("SpaceName", request.spaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLhSpaceByName"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLhSpaceByNameResponse());
    }

    public GetLhSpaceByNameResponse getLhSpaceByName(GetLhSpaceByNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLhSpaceByNameWithOptions(request, runtime);
    }

    public GetLogicDatabaseResponse getLogicDatabaseWithOptions(GetLogicDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLogicDatabase"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLogicDatabaseResponse());
    }

    public GetLogicDatabaseResponse getLogicDatabase(GetLogicDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getLogicDatabaseWithOptions(request, runtime);
    }

    public GetMetaTableColumnResponse getMetaTableColumnWithOptions(GetMetaTableColumnRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableColumn"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableColumnResponse());
    }

    public GetMetaTableColumnResponse getMetaTableColumn(GetMetaTableColumnRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMetaTableColumnWithOptions(request, runtime);
    }

    public GetMetaTableDetailInfoResponse getMetaTableDetailInfoWithOptions(GetMetaTableDetailInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaTableDetailInfo"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaTableDetailInfoResponse());
    }

    public GetMetaTableDetailInfoResponse getMetaTableDetailInfo(GetMetaTableDetailInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getMetaTableDetailInfoWithOptions(request, runtime);
    }

    public GetOpLogResponse getOpLogWithOptions(GetOpLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.module)) {
            query.put("Module", request.module);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOpLog"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOpLogResponse());
    }

    public GetOpLogResponse getOpLog(GetOpLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOpLogWithOptions(request, runtime);
    }

    public GetOrderBaseInfoResponse getOrderBaseInfoWithOptions(GetOrderBaseInfoRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrderBaseInfo"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrderBaseInfoResponse());
    }

    public GetOrderBaseInfoResponse getOrderBaseInfo(GetOrderBaseInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOrderBaseInfoWithOptions(request, runtime);
    }

    public GetOwnerApplyOrderDetailResponse getOwnerApplyOrderDetailWithOptions(GetOwnerApplyOrderDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOwnerApplyOrderDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOwnerApplyOrderDetailResponse());
    }

    public GetOwnerApplyOrderDetailResponse getOwnerApplyOrderDetail(GetOwnerApplyOrderDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getOwnerApplyOrderDetailWithOptions(request, runtime);
    }

    public GetPermApplyOrderDetailResponse getPermApplyOrderDetailWithOptions(GetPermApplyOrderDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPermApplyOrderDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPermApplyOrderDetailResponse());
    }

    public GetPermApplyOrderDetailResponse getPermApplyOrderDetail(GetPermApplyOrderDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPermApplyOrderDetailWithOptions(request, runtime);
    }

    public GetPhysicalDatabaseResponse getPhysicalDatabaseWithOptions(GetPhysicalDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPhysicalDatabase"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPhysicalDatabaseResponse());
    }

    public GetPhysicalDatabaseResponse getPhysicalDatabase(GetPhysicalDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getPhysicalDatabaseWithOptions(request, runtime);
    }

    public GetProxyResponse getProxyWithOptions(GetProxyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyId)) {
            query.put("ProxyId", request.proxyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProxy"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProxyResponse());
    }

    public GetProxyResponse getProxy(GetProxyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getProxyWithOptions(request, runtime);
    }

    public GetSQLReviewCheckResultStatusResponse getSQLReviewCheckResultStatusWithOptions(GetSQLReviewCheckResultStatusRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSQLReviewCheckResultStatus"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSQLReviewCheckResultStatusResponse());
    }

    public GetSQLReviewCheckResultStatusResponse getSQLReviewCheckResultStatus(GetSQLReviewCheckResultStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSQLReviewCheckResultStatusWithOptions(request, runtime);
    }

    public GetSQLReviewOptimizeDetailResponse getSQLReviewOptimizeDetailWithOptions(GetSQLReviewOptimizeDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SQLReviewQueryKey)) {
            query.put("SQLReviewQueryKey", request.SQLReviewQueryKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSQLReviewOptimizeDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSQLReviewOptimizeDetailResponse());
    }

    public GetSQLReviewOptimizeDetailResponse getSQLReviewOptimizeDetail(GetSQLReviewOptimizeDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getSQLReviewOptimizeDetailWithOptions(request, runtime);
    }

    public GetStructSyncExecSqlDetailResponse getStructSyncExecSqlDetailWithOptions(GetStructSyncExecSqlDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStructSyncExecSqlDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStructSyncExecSqlDetailResponse());
    }

    public GetStructSyncExecSqlDetailResponse getStructSyncExecSqlDetail(GetStructSyncExecSqlDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStructSyncExecSqlDetailWithOptions(request, runtime);
    }

    public GetStructSyncJobAnalyzeResultResponse getStructSyncJobAnalyzeResultWithOptions(GetStructSyncJobAnalyzeResultRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.compareType)) {
            query.put("CompareType", request.compareType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStructSyncJobAnalyzeResult"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStructSyncJobAnalyzeResultResponse());
    }

    public GetStructSyncJobAnalyzeResultResponse getStructSyncJobAnalyzeResult(GetStructSyncJobAnalyzeResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStructSyncJobAnalyzeResultWithOptions(request, runtime);
    }

    public GetStructSyncJobDetailResponse getStructSyncJobDetailWithOptions(GetStructSyncJobDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStructSyncJobDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStructSyncJobDetailResponse());
    }

    public GetStructSyncJobDetailResponse getStructSyncJobDetail(GetStructSyncJobDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStructSyncJobDetailWithOptions(request, runtime);
    }

    public GetStructSyncOrderDetailResponse getStructSyncOrderDetailWithOptions(GetStructSyncOrderDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStructSyncOrderDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStructSyncOrderDetailResponse());
    }

    public GetStructSyncOrderDetailResponse getStructSyncOrderDetail(GetStructSyncOrderDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getStructSyncOrderDetailWithOptions(request, runtime);
    }

    public GetTableDBTopologyResponse getTableDBTopologyWithOptions(GetTableDBTopologyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableDBTopology"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableDBTopologyResponse());
    }

    public GetTableDBTopologyResponse getTableDBTopology(GetTableDBTopologyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTableDBTopologyWithOptions(request, runtime);
    }

    public GetTableTopologyResponse getTableTopologyWithOptions(GetTableTopologyRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableTopology"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableTopologyResponse());
    }

    public GetTableTopologyResponse getTableTopology(GetTableTopologyRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTableTopologyWithOptions(request, runtime);
    }

    public GetTaskInstanceRelationResponse getTaskInstanceRelationWithOptions(GetTaskInstanceRelationRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagInstanceId)) {
            query.put("DagInstanceId", request.dagInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskInstanceRelation"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskInstanceRelationResponse());
    }

    public GetTaskInstanceRelationResponse getTaskInstanceRelation(GetTaskInstanceRelationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getTaskInstanceRelationWithOptions(request, runtime);
    }

    public GetUserResponse getUserWithOptions(GetUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUser"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserResponse());
    }

    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    public GetUserActiveTenantResponse getUserActiveTenantWithOptions(GetUserActiveTenantRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserActiveTenant"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserActiveTenantResponse());
    }

    public GetUserActiveTenantResponse getUserActiveTenant(GetUserActiveTenantRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserActiveTenantWithOptions(request, runtime);
    }

    public GetUserUploadFileJobResponse getUserUploadFileJobWithOptions(GetUserUploadFileJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobKey)) {
            query.put("JobKey", request.jobKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUserUploadFileJob"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUserUploadFileJobResponse());
    }

    public GetUserUploadFileJobResponse getUserUploadFileJob(GetUserUploadFileJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.getUserUploadFileJobWithOptions(request, runtime);
    }

    public GrantUserPermissionResponse grantUserPermissionWithOptions(GrantUserPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsType)) {
            query.put("DsType", request.dsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireDate)) {
            query.put("ExpireDate", request.expireDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logic)) {
            query.put("Logic", request.logic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permTypes)) {
            query.put("PermTypes", request.permTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            query.put("TableId", request.tableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantUserPermission"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantUserPermissionResponse());
    }

    public GrantUserPermissionResponse grantUserPermission(GrantUserPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.grantUserPermissionWithOptions(request, runtime);
    }

    public InspectProxyAccessSecretResponse inspectProxyAccessSecretWithOptions(InspectProxyAccessSecretRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.proxyAccessId)) {
            query.put("ProxyAccessId", request.proxyAccessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "InspectProxyAccessSecret"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InspectProxyAccessSecretResponse());
    }

    public InspectProxyAccessSecretResponse inspectProxyAccessSecret(InspectProxyAccessSecretRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.inspectProxyAccessSecretWithOptions(request, runtime);
    }

    public ListColumnsResponse listColumnsWithOptions(ListColumnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logic)) {
            query.put("Logic", request.logic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            query.put("TableId", request.tableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListColumns"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListColumnsResponse());
    }

    public ListColumnsResponse listColumns(ListColumnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listColumnsWithOptions(request, runtime);
    }

    public ListDBTaskSQLJobResponse listDBTaskSQLJobWithOptions(ListDBTaskSQLJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBTaskGroupId)) {
            query.put("DBTaskGroupId", request.DBTaskGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDBTaskSQLJob"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDBTaskSQLJobResponse());
    }

    public ListDBTaskSQLJobResponse listDBTaskSQLJob(ListDBTaskSQLJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDBTaskSQLJobWithOptions(request, runtime);
    }

    public ListDBTaskSQLJobDetailResponse listDBTaskSQLJobDetailWithOptions(ListDBTaskSQLJobDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDBTaskSQLJobDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDBTaskSQLJobDetailResponse());
    }

    public ListDBTaskSQLJobDetailResponse listDBTaskSQLJobDetail(ListDBTaskSQLJobDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDBTaskSQLJobDetailWithOptions(request, runtime);
    }

    public ListDDLPublishRecordsResponse listDDLPublishRecordsWithOptions(ListDDLPublishRecordsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDDLPublishRecords"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDDLPublishRecordsResponse());
    }

    public ListDDLPublishRecordsResponse listDDLPublishRecords(ListDDLPublishRecordsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDDLPublishRecordsWithOptions(request, runtime);
    }

    public ListDataCorrectPreCheckDBResponse listDataCorrectPreCheckDBWithOptions(ListDataCorrectPreCheckDBRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataCorrectPreCheckDB"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataCorrectPreCheckDBResponse());
    }

    public ListDataCorrectPreCheckDBResponse listDataCorrectPreCheckDB(ListDataCorrectPreCheckDBRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDataCorrectPreCheckDBWithOptions(request, runtime);
    }

    public ListDataCorrectPreCheckSQLResponse listDataCorrectPreCheckSQLWithOptions(ListDataCorrectPreCheckSQLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataCorrectPreCheckSQL"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataCorrectPreCheckSQLResponse());
    }

    public ListDataCorrectPreCheckSQLResponse listDataCorrectPreCheckSQL(ListDataCorrectPreCheckSQLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDataCorrectPreCheckSQLWithOptions(request, runtime);
    }

    public ListDatabaseUserPermssionsResponse listDatabaseUserPermssionsWithOptions(ListDatabaseUserPermssionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logic)) {
            query.put("Logic", request.logic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permType)) {
            query.put("PermType", request.permType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabaseUserPermssions"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabaseUserPermssionsResponse());
    }

    public ListDatabaseUserPermssionsResponse listDatabaseUserPermssions(ListDatabaseUserPermssionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDatabaseUserPermssionsWithOptions(request, runtime);
    }

    public ListDatabasesResponse listDatabasesWithOptions(ListDatabasesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabases"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabasesResponse());
    }

    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listDatabasesWithOptions(request, runtime);
    }

    public ListIndexesResponse listIndexesWithOptions(ListIndexesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logic)) {
            query.put("Logic", request.logic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            query.put("TableId", request.tableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListIndexes"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListIndexesResponse());
    }

    public ListIndexesResponse listIndexes(ListIndexesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listIndexesWithOptions(request, runtime);
    }

    public ListInstanceLoginAuditLogResponse listInstanceLoginAuditLogWithOptions(ListInstanceLoginAuditLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUserName)) {
            query.put("OpUserName", request.opUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchName)) {
            query.put("SearchName", request.searchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceLoginAuditLog"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceLoginAuditLogResponse());
    }

    public ListInstanceLoginAuditLogResponse listInstanceLoginAuditLog(ListInstanceLoginAuditLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstanceLoginAuditLogWithOptions(request, runtime);
    }

    public ListInstanceUserPermissionsResponse listInstanceUserPermissionsWithOptions(ListInstanceUserPermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstanceUserPermissions"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceUserPermissionsResponse());
    }

    public ListInstanceUserPermissionsResponse listInstanceUserPermissions(ListInstanceUserPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstanceUserPermissionsWithOptions(request, runtime);
    }

    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            query.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSource)) {
            query.put("InstanceSource", request.instanceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceState)) {
            query.put("InstanceState", request.instanceState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.netType)) {
            query.put("NetType", request.netType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListInstances"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstancesResponse());
    }

    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    public ListLhTaskFlowAndScenarioResponse listLhTaskFlowAndScenarioWithOptions(ListLhTaskFlowAndScenarioRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.spaceId)) {
            query.put("SpaceId", request.spaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLhTaskFlowAndScenario"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLhTaskFlowAndScenarioResponse());
    }

    public ListLhTaskFlowAndScenarioResponse listLhTaskFlowAndScenario(ListLhTaskFlowAndScenarioRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLhTaskFlowAndScenarioWithOptions(request, runtime);
    }

    public ListLogicDatabasesResponse listLogicDatabasesWithOptions(ListLogicDatabasesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogicDatabases"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogicDatabasesResponse());
    }

    public ListLogicDatabasesResponse listLogicDatabases(ListLogicDatabasesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLogicDatabasesWithOptions(request, runtime);
    }

    public ListLogicTableRouteConfigResponse listLogicTableRouteConfigWithOptions(ListLogicTableRouteConfigRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            query.put("TableId", request.tableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogicTableRouteConfig"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogicTableRouteConfigResponse());
    }

    public ListLogicTableRouteConfigResponse listLogicTableRouteConfig(ListLogicTableRouteConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLogicTableRouteConfigWithOptions(request, runtime);
    }

    public ListLogicTablesResponse listLogicTablesWithOptions(ListLogicTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseId)) {
            query.put("DatabaseId", request.databaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnGuid)) {
            query.put("ReturnGuid", request.returnGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchName)) {
            query.put("SearchName", request.searchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLogicTables"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLogicTablesResponse());
    }

    public ListLogicTablesResponse listLogicTables(ListLogicTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listLogicTablesWithOptions(request, runtime);
    }

    public ListOrdersResponse listOrdersWithOptions(ListOrdersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderResultType)) {
            query.put("OrderResultType", request.orderResultType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderStatus)) {
            query.put("OrderStatus", request.orderStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginType)) {
            query.put("PluginType", request.pluginType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchContent)) {
            query.put("SearchContent", request.searchContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchDateType)) {
            query.put("SearchDateType", request.searchDateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListOrders"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListOrdersResponse());
    }

    public ListOrdersResponse listOrders(ListOrdersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listOrdersWithOptions(request, runtime);
    }

    public ListProxiesResponse listProxiesWithOptions(ListProxiesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProxies"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProxiesResponse());
    }

    public ListProxiesResponse listProxies(ListProxiesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProxiesWithOptions(request, runtime);
    }

    public ListProxyAccessesResponse listProxyAccessesWithOptions(ListProxyAccessesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.proxyId)) {
            query.put("ProxyId", request.proxyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProxyAccesses"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProxyAccessesResponse());
    }

    public ListProxyAccessesResponse listProxyAccesses(ListProxyAccessesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProxyAccessesWithOptions(request, runtime);
    }

    public ListProxySQLExecAuditLogResponse listProxySQLExecAuditLogWithOptions(ListProxySQLExecAuditLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.execState)) {
            query.put("ExecState", request.execState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUserName)) {
            query.put("OpUserName", request.opUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SQLType)) {
            query.put("SQLType", request.SQLType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchName)) {
            query.put("SearchName", request.searchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListProxySQLExecAuditLog"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListProxySQLExecAuditLogResponse());
    }

    public ListProxySQLExecAuditLogResponse listProxySQLExecAuditLog(ListProxySQLExecAuditLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listProxySQLExecAuditLogWithOptions(request, runtime);
    }

    public ListSQLExecAuditLogResponse listSQLExecAuditLogWithOptions(ListSQLExecAuditLogRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.execState)) {
            query.put("ExecState", request.execState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.opUserName)) {
            query.put("OpUserName", request.opUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchName)) {
            query.put("SearchName", request.searchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlType)) {
            query.put("SqlType", request.sqlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSQLExecAuditLog"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSQLExecAuditLogResponse());
    }

    public ListSQLExecAuditLogResponse listSQLExecAuditLog(ListSQLExecAuditLogRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSQLExecAuditLogWithOptions(request, runtime);
    }

    public ListSQLReviewOriginSQLResponse listSQLReviewOriginSQLWithOptions(ListSQLReviewOriginSQLRequest tmpReq, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSQLReviewOriginSQLShrinkRequest request = new ListSQLReviewOriginSQLShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(tmpReq.orderActionDetail))) {
            request.orderActionDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(TeaModel.buildMap(tmpReq.orderActionDetail), "OrderActionDetail", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderActionDetailShrink)) {
            query.put("OrderActionDetail", request.orderActionDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSQLReviewOriginSQL"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSQLReviewOriginSQLResponse());
    }

    public ListSQLReviewOriginSQLResponse listSQLReviewOriginSQL(ListSQLReviewOriginSQLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSQLReviewOriginSQLWithOptions(request, runtime);
    }

    public ListSensitiveColumnsResponse listSensitiveColumnsWithOptions(ListSensitiveColumnsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnName)) {
            query.put("ColumnName", request.columnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logic)) {
            query.put("Logic", request.logic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityLevel)) {
            query.put("SecurityLevel", request.securityLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSensitiveColumns"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSensitiveColumnsResponse());
    }

    public ListSensitiveColumnsResponse listSensitiveColumns(ListSensitiveColumnsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSensitiveColumnsWithOptions(request, runtime);
    }

    public ListSensitiveColumnsDetailResponse listSensitiveColumnsDetailWithOptions(ListSensitiveColumnsDetailRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnName)) {
            query.put("ColumnName", request.columnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logic)) {
            query.put("Logic", request.logic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSensitiveColumnsDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSensitiveColumnsDetailResponse());
    }

    public ListSensitiveColumnsDetailResponse listSensitiveColumnsDetail(ListSensitiveColumnsDetailRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listSensitiveColumnsDetailWithOptions(request, runtime);
    }

    public ListStandardGroupsResponse listStandardGroupsWithOptions(ListStandardGroupsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStandardGroups"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStandardGroupsResponse());
    }

    public ListStandardGroupsResponse listStandardGroups(ListStandardGroupsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listStandardGroupsWithOptions(request, runtime);
    }

    public ListTablesResponse listTablesWithOptions(ListTablesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseId)) {
            query.put("DatabaseId", request.databaseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnGuid)) {
            query.put("ReturnGuid", request.returnGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchName)) {
            query.put("SearchName", request.searchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTables"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTablesResponse());
    }

    public ListTablesResponse listTables(ListTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTablesWithOptions(request, runtime);
    }

    public ListTaskFlowResponse listTaskFlowWithOptions(ListTaskFlowRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagInstanceId)) {
            query.put("DagInstanceId", request.dagInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskFlow"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskFlowResponse());
    }

    public ListTaskFlowResponse listTaskFlow(ListTaskFlowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTaskFlowWithOptions(request, runtime);
    }

    public ListTaskFlowInstanceResponse listTaskFlowInstanceWithOptions(ListTaskFlowInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeBegin)) {
            query.put("StartTimeBegin", request.startTimeBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTimeEnd)) {
            query.put("StartTimeEnd", request.startTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            query.put("TriggerType", request.triggerType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskFlowInstance"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskFlowInstanceResponse());
    }

    public ListTaskFlowInstanceResponse listTaskFlowInstance(ListTaskFlowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listTaskFlowInstanceWithOptions(request, runtime);
    }

    public ListUserPermissionsResponse listUserPermissionsWithOptions(ListUserPermissionsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            query.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logic)) {
            query.put("Logic", request.logic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permType)) {
            query.put("PermType", request.permType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserPermissions"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserPermissionsResponse());
    }

    public ListUserPermissionsResponse listUserPermissions(ListUserPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserPermissionsWithOptions(request, runtime);
    }

    public ListUserTenantsResponse listUserTenantsWithOptions(ListUserTenantsRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserTenants"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserTenantsResponse());
    }

    public ListUserTenantsResponse listUserTenants(ListUserTenantsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUserTenantsWithOptions(request, runtime);
    }

    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.role)) {
            query.put("Role", request.role);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userState)) {
            query.put("UserState", request.userState);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUsers"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUsersResponse());
    }

    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    public ListWorkFlowNodesResponse listWorkFlowNodesWithOptions(ListWorkFlowNodesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.searchName)) {
            query.put("SearchName", request.searchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkFlowNodes"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkFlowNodesResponse());
    }

    public ListWorkFlowNodesResponse listWorkFlowNodes(ListWorkFlowNodesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listWorkFlowNodesWithOptions(request, runtime);
    }

    public ListWorkFlowTemplatesResponse listWorkFlowTemplatesWithOptions(ListWorkFlowTemplatesRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.searchName)) {
            query.put("SearchName", request.searchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkFlowTemplates"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkFlowTemplatesResponse());
    }

    public ListWorkFlowTemplatesResponse listWorkFlowTemplates(ListWorkFlowTemplatesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.listWorkFlowTemplatesWithOptions(request, runtime);
    }

    public ModifyDataCorrectExecSQLResponse modifyDataCorrectExecSQLWithOptions(ModifyDataCorrectExecSQLRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.execSQL)) {
            query.put("ExecSQL", request.execSQL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDataCorrectExecSQL"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDataCorrectExecSQLResponse());
    }

    public ModifyDataCorrectExecSQLResponse modifyDataCorrectExecSQL(ModifyDataCorrectExecSQLRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.modifyDataCorrectExecSQLWithOptions(request, runtime);
    }

    public PauseDataCorrectSQLJobResponse pauseDataCorrectSQLJobWithOptions(PauseDataCorrectSQLJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PauseDataCorrectSQLJob"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseDataCorrectSQLJobResponse());
    }

    public PauseDataCorrectSQLJobResponse pauseDataCorrectSQLJob(PauseDataCorrectSQLJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.pauseDataCorrectSQLJobWithOptions(request, runtime);
    }

    public ReDeployLhDagVersionResponse reDeployLhDagVersionWithOptions(ReDeployLhDagVersionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagVersion)) {
            query.put("DagVersion", request.dagVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReDeployLhDagVersion"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReDeployLhDagVersionResponse());
    }

    public ReDeployLhDagVersionResponse reDeployLhDagVersion(ReDeployLhDagVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.reDeployLhDagVersionWithOptions(request, runtime);
    }

    public RegisterInstanceResponse registerInstanceWithOptions(RegisterInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataLinkName)) {
            query.put("DataLinkName", request.dataLinkName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasePassword)) {
            query.put("DatabasePassword", request.databasePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseUser)) {
            query.put("DatabaseUser", request.databaseUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbaUid)) {
            query.put("DbaUid", request.dbaUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddlOnline)) {
            query.put("DdlOnline", request.ddlOnline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceId)) {
            query.put("EcsInstanceId", request.ecsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsRegion)) {
            query.put("EcsRegion", request.ecsRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportTimeout)) {
            query.put("ExportTimeout", request.exportTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceAlias)) {
            query.put("InstanceAlias", request.instanceAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSource)) {
            query.put("InstanceSource", request.instanceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.networkType)) {
            query.put("NetworkType", request.networkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryTimeout)) {
            query.put("QueryTimeout", request.queryTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.safeRule)) {
            query.put("SafeRule", request.safeRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sid)) {
            query.put("Sid", request.sid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipTest)) {
            query.put("SkipTest", request.skipTest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useDsql)) {
            query.put("UseDsql", request.useDsql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterInstance"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterInstanceResponse());
    }

    public RegisterInstanceResponse registerInstance(RegisterInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerInstanceWithOptions(request, runtime);
    }

    public RegisterUserResponse registerUserWithOptions(RegisterUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleNames)) {
            query.put("RoleNames", request.roleNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            query.put("UserNick", request.userNick);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterUser"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterUserResponse());
    }

    public RegisterUserResponse registerUser(RegisterUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.registerUserWithOptions(request, runtime);
    }

    public RestartDataCorrectSQLJobResponse restartDataCorrectSQLJobWithOptions(RestartDataCorrectSQLJobRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartDataCorrectSQLJob"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartDataCorrectSQLJobResponse());
    }

    public RestartDataCorrectSQLJobResponse restartDataCorrectSQLJob(RestartDataCorrectSQLJobRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.restartDataCorrectSQLJobWithOptions(request, runtime);
    }

    public RetryDataCorrectPreCheckResponse retryDataCorrectPreCheckWithOptions(RetryDataCorrectPreCheckRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RetryDataCorrectPreCheck"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RetryDataCorrectPreCheckResponse());
    }

    public RetryDataCorrectPreCheckResponse retryDataCorrectPreCheck(RetryDataCorrectPreCheckRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.retryDataCorrectPreCheckWithOptions(request, runtime);
    }

    public RevokeUserPermissionResponse revokeUserPermissionWithOptions(RevokeUserPermissionRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dsType)) {
            query.put("DsType", request.dsType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logic)) {
            query.put("Logic", request.logic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permTypes)) {
            query.put("PermTypes", request.permTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            query.put("TableId", request.tableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userAccessId)) {
            query.put("UserAccessId", request.userAccessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userId)) {
            query.put("UserId", request.userId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeUserPermission"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeUserPermissionResponse());
    }

    public RevokeUserPermissionResponse revokeUserPermission(RevokeUserPermissionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.revokeUserPermissionWithOptions(request, runtime);
    }

    public SearchDatabaseResponse searchDatabaseWithOptions(SearchDatabaseRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            query.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchRange)) {
            query.put("SearchRange", request.searchRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchTarget)) {
            query.put("SearchTarget", request.searchTarget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchDatabase"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchDatabaseResponse());
    }

    public SearchDatabaseResponse searchDatabase(SearchDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchDatabaseWithOptions(request, runtime);
    }

    public SearchTableResponse searchTableWithOptions(SearchTableRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbType)) {
            query.put("DbType", request.dbType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.returnGuid)) {
            query.put("ReturnGuid", request.returnGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchRange)) {
            query.put("SearchRange", request.searchRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchTarget)) {
            query.put("SearchTarget", request.searchTarget);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchTable"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchTableResponse());
    }

    public SearchTableResponse searchTable(SearchTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.searchTableWithOptions(request, runtime);
    }

    public SetOwnersResponse setOwnersWithOptions(SetOwnersRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerIds)) {
            query.put("OwnerIds", request.ownerIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerType)) {
            query.put("OwnerType", request.ownerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetOwners"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetOwnersResponse());
    }

    public SetOwnersResponse setOwners(SetOwnersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.setOwnersWithOptions(request, runtime);
    }

    public SubmitOrderApprovalResponse submitOrderApprovalWithOptions(SubmitOrderApprovalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitOrderApproval"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitOrderApprovalResponse());
    }

    public SubmitOrderApprovalResponse submitOrderApproval(SubmitOrderApprovalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitOrderApprovalWithOptions(request, runtime);
    }

    public SubmitStructSyncOrderApprovalResponse submitStructSyncOrderApprovalWithOptions(SubmitStructSyncOrderApprovalRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitStructSyncOrderApproval"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitStructSyncOrderApprovalResponse());
    }

    public SubmitStructSyncOrderApprovalResponse submitStructSyncOrderApproval(SubmitStructSyncOrderApprovalRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.submitStructSyncOrderApprovalWithOptions(request, runtime);
    }

    public SyncDatabaseMetaResponse syncDatabaseMetaWithOptions(SyncDatabaseMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logic)) {
            query.put("Logic", request.logic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncDatabaseMeta"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncDatabaseMetaResponse());
    }

    public SyncDatabaseMetaResponse syncDatabaseMeta(SyncDatabaseMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncDatabaseMetaWithOptions(request, runtime);
    }

    public SyncInstanceMetaResponse syncInstanceMetaWithOptions(SyncInstanceMetaRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ignoreTable)) {
            query.put("IgnoreTable", request.ignoreTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SyncInstanceMeta"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SyncInstanceMetaResponse());
    }

    public SyncInstanceMetaResponse syncInstanceMeta(SyncInstanceMetaRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.syncInstanceMetaWithOptions(request, runtime);
    }

    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataLinkName)) {
            query.put("DataLinkName", request.dataLinkName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasePassword)) {
            query.put("DatabasePassword", request.databasePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseUser)) {
            query.put("DatabaseUser", request.databaseUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbaId)) {
            query.put("DbaId", request.dbaId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ddlOnline)) {
            query.put("DdlOnline", request.ddlOnline);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsInstanceId)) {
            query.put("EcsInstanceId", request.ecsInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ecsRegion)) {
            query.put("EcsRegion", request.ecsRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.envType)) {
            query.put("EnvType", request.envType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportTimeout)) {
            query.put("ExportTimeout", request.exportTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceAlias)) {
            query.put("InstanceAlias", request.instanceAlias);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSource)) {
            query.put("InstanceSource", request.instanceSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryTimeout)) {
            query.put("QueryTimeout", request.queryTimeout);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.safeRuleId)) {
            query.put("SafeRuleId", request.safeRuleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sid)) {
            query.put("Sid", request.sid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipTest)) {
            query.put("SkipTest", request.skipTest);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useDsql)) {
            query.put("UseDsql", request.useDsql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateInstance"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateInstanceResponse());
    }

    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateInstanceWithOptions(request, runtime);
    }

    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.maxExecuteCount)) {
            query.put("MaxExecuteCount", request.maxExecuteCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxResultCount)) {
            query.put("MaxResultCount", request.maxResultCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mobile)) {
            query.put("Mobile", request.mobile);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleNames)) {
            query.put("RoleNames", request.roleNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            query.put("UserNick", request.userNick);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateUser"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateUserResponse());
    }

    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }
}
