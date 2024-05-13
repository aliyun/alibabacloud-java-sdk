// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101;

import com.aliyun.tea.*;
import com.aliyun.dms_enterprise20181101.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
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

    /**
     * @summary Adds a masking rule.
     *
     * @param request AddDesensitizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddDesensitizationRuleResponse
     */
    public AddDesensitizationRuleResponse addDesensitizationRuleWithOptions(AddDesensitizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionType)) {
            query.put("FunctionType", request.functionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleDescription)) {
            query.put("RuleDescription", request.ruleDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        java.util.Map<String, Object> bodyFlat = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.functionParams)) {
            bodyFlat.put("FunctionParams", request.functionParams);
        }

        body = TeaConverter.merge(Object.class,
            body,
            com.aliyun.openapiutil.Client.query(bodyFlat)
        );
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddDesensitizationRule"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddDesensitizationRuleResponse());
    }

    /**
     * @summary Adds a masking rule.
     *
     * @param request AddDesensitizationRuleRequest
     * @return AddDesensitizationRuleResponse
     */
    public AddDesensitizationRuleResponse addDesensitizationRule(AddDesensitizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addDesensitizationRuleWithOptions(request, runtime);
    }

    /**
     * @summary 添加实例
     *
     * @param request AddInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddInstanceResponse
     */
    public AddInstanceResponse addInstanceWithOptions(AddInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableSellCommon)) {
            query.put("EnableSellCommon", request.enableSellCommon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSellSitd)) {
            query.put("EnableSellSitd", request.enableSellSitd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSellStable)) {
            query.put("EnableSellStable", request.enableSellStable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSellTrust)) {
            query.put("EnableSellTrust", request.enableSellTrust);
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useDsql)) {
            query.put("UseDsql", request.useDsql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useSsl)) {
            query.put("UseSsl", request.useSsl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddInstance"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddInstanceResponse());
    }

    /**
     * @summary 添加实例
     *
     * @param request AddInstanceRequest
     * @return AddInstanceResponse
     */
    public AddInstanceResponse addInstance(AddInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Adds a workspace administrator, a workspace member, or a task flow developer in Data Management (DMS).
     *
     * @description You must call this operation as a DMS administrator, a database administrator (DBA), or a workspace administrator.
     * Usage notes:
     * *   Before you call this operation to add a user as a task flow developer, make sure that you have added the user as a workspace member.
     * *   You cannot call this operation to transfer the ownership of a task flow. To transfer the ownership of a task flow, call the [ChangLhDagOwner](https://help.aliyun.com/document_detail/424761.html) operation.
     * *   For more information about workspace roles and permissions, see [Manage permissions on a workspace](https://help.aliyun.com/document_detail/410893.html).
     *
     * @param tmpReq AddLhMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddLhMembersResponse
     */
    public AddLhMembersResponse addLhMembersWithOptions(AddLhMembersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Adds a workspace administrator, a workspace member, or a task flow developer in Data Management (DMS).
     *
     * @description You must call this operation as a DMS administrator, a database administrator (DBA), or a workspace administrator.
     * Usage notes:
     * *   Before you call this operation to add a user as a task flow developer, make sure that you have added the user as a workspace member.
     * *   You cannot call this operation to transfer the ownership of a task flow. To transfer the ownership of a task flow, call the [ChangLhDagOwner](https://help.aliyun.com/document_detail/424761.html) operation.
     * *   For more information about workspace roles and permissions, see [Manage permissions on a workspace](https://help.aliyun.com/document_detail/410893.html).
     *
     * @param request AddLhMembersRequest
     * @return AddLhMembersResponse
     */
    public AddLhMembersResponse addLhMembers(AddLhMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLhMembersWithOptions(request, runtime);
    }

    /**
     * @summary Adds a routing algorithm to a logical table.
     *
     * @param request AddLogicTableRouteConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddLogicTableRouteConfigResponse
     */
    public AddLogicTableRouteConfigResponse addLogicTableRouteConfigWithOptions(AddLogicTableRouteConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Adds a routing algorithm to a logical table.
     *
     * @param request AddLogicTableRouteConfigRequest
     * @return AddLogicTableRouteConfigResponse
     */
    public AddLogicTableRouteConfigResponse addLogicTableRouteConfig(AddLogicTableRouteConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addLogicTableRouteConfigWithOptions(request, runtime);
    }

    /**
     * @summary Adds directed edges for an existing task node.
     *
     * @description When you add directed edges for a task node, take note of the following limits:
     * 1. The endpoints of the specified edge exist in the Directed Acyclic Graph (DAG) of the task flow specified by DagId.
     * 2. After a backward edge is added, the DAG does not contain loops.
     *
     * @param tmpReq AddTaskFlowEdgesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AddTaskFlowEdgesResponse
     */
    public AddTaskFlowEdgesResponse addTaskFlowEdgesWithOptions(AddTaskFlowEdgesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        AddTaskFlowEdgesShrinkRequest request = new AddTaskFlowEdgesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.edges)) {
            request.edgesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.edges, "Edges", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edgesShrink)) {
            query.put("Edges", request.edgesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AddTaskFlowEdges"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AddTaskFlowEdgesResponse());
    }

    /**
     * @summary Adds directed edges for an existing task node.
     *
     * @description When you add directed edges for a task node, take note of the following limits:
     * 1. The endpoints of the specified edge exist in the Directed Acyclic Graph (DAG) of the task flow specified by DagId.
     * 2. After a backward edge is added, the DAG does not contain loops.
     *
     * @param request AddTaskFlowEdgesRequest
     * @return AddTaskFlowEdgesResponse
     */
    public AddTaskFlowEdgesResponse addTaskFlowEdges(AddTaskFlowEdgesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.addTaskFlowEdgesWithOptions(request, runtime);
    }

    /**
     * @summary Analyzes the lineage (dependencies and influence) between tables and between fields in SQL statements.
     *
     * @description The following conditions must be met before you call this API operation.
     * *   The database instance is of one of the following types: ApsaraDB RDS for MySQL, PolarDB for MySQL, AnalyticDB for MySQL, ApsaraDB RDS for PostgreSQL, PolarDB for PostgreSQL, AnalyticDB for PostgreSQL, Oracle, and openGauss.
     * *   A database instance is managed in Security Collaboration mode. For more information about control modes, see [Control modes](https://help.aliyun.com/document_detail/151629.html).
     *
     * @param request AnalyzeSQLLineageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AnalyzeSQLLineageResponse
     */
    public AnalyzeSQLLineageResponse analyzeSQLLineageWithOptions(AnalyzeSQLLineageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlContent)) {
            query.put("SqlContent", request.sqlContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AnalyzeSQLLineage"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AnalyzeSQLLineageResponse());
    }

    /**
     * @summary Analyzes the lineage (dependencies and influence) between tables and between fields in SQL statements.
     *
     * @description The following conditions must be met before you call this API operation.
     * *   The database instance is of one of the following types: ApsaraDB RDS for MySQL, PolarDB for MySQL, AnalyticDB for MySQL, ApsaraDB RDS for PostgreSQL, PolarDB for PostgreSQL, AnalyticDB for PostgreSQL, Oracle, and openGauss.
     * *   A database instance is managed in Security Collaboration mode. For more information about control modes, see [Control modes](https://help.aliyun.com/document_detail/151629.html).
     *
     * @param request AnalyzeSQLLineageRequest
     * @return AnalyzeSQLLineageResponse
     */
    public AnalyzeSQLLineageResponse analyzeSQLLineage(AnalyzeSQLLineageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.analyzeSQLLineageWithOptions(request, runtime);
    }

    /**
     * @summary Reviews a ticket.
     *
     * @param request ApproveOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApproveOrderResponse
     */
    public ApproveOrderResponse approveOrderWithOptions(ApproveOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.approvalNodeId)) {
            query.put("ApprovalNodeId", request.approvalNodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalNodePos)) {
            query.put("ApprovalNodePos", request.approvalNodePos);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.approvalType)) {
            query.put("ApprovalType", request.approvalType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newApprover)) {
            query.put("NewApprover", request.newApprover);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newApproverList)) {
            query.put("NewApproverList", request.newApproverList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.oldApprover)) {
            query.put("OldApprover", request.oldApprover);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowInstanceId)) {
            query.put("WorkflowInstanceId", request.workflowInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Reviews a ticket.
     *
     * @param request ApproveOrderRequest
     * @return ApproveOrderResponse
     */
    public ApproveOrderResponse approveOrder(ApproveOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.approveOrderWithOptions(request, runtime);
    }

    /**
     * @summary Backfills data for task orchestration.
     *
     * @description During a data backfill, task flows are run in sequence based on their dates. You can specify whether task flows are run in chronological or reverse chronological order. After the data backfill is complete, you can specify a date or date range, and a node range to run task flows.
     *
     * @param tmpReq BackFillRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BackFillResponse
     */
    public BackFillResponse backFillWithOptions(BackFillRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BackFillShrinkRequest request = new BackFillShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterNodeIds)) {
            request.filterNodeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterNodeIds, "FilterNodeIds", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.startNodeIds)) {
            request.startNodeIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.startNodeIds, "StartNodeIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.asc)) {
            query.put("Asc", request.asc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backFillDate)) {
            query.put("BackFillDate", request.backFillDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backFillDateBegin)) {
            query.put("BackFillDateBegin", request.backFillDateBegin);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backFillDateEnd)) {
            query.put("BackFillDateEnd", request.backFillDateEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterNodeIdsShrink)) {
            query.put("FilterNodeIds", request.filterNodeIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.historyDagId)) {
            query.put("HistoryDagId", request.historyDagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.interval)) {
            query.put("Interval", request.interval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isTriggerSubTree)) {
            query.put("IsTriggerSubTree", request.isTriggerSubTree);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startNodeIdsShrink)) {
            query.put("StartNodeIds", request.startNodeIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BackFill"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BackFillResponse());
    }

    /**
     * @summary Backfills data for task orchestration.
     *
     * @description During a data backfill, task flows are run in sequence based on their dates. You can specify whether task flows are run in chronological or reverse chronological order. After the data backfill is complete, you can specify a date or date range, and a node range to run task flows.
     *
     * @param request BackFillRequest
     * @return BackFillResponse
     */
    public BackFillResponse backFill(BackFillRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.backFillWithOptions(request, runtime);
    }

    /**
     * @summary Purchases a pay-as-you-go Data Management (DMS) resource.
     *
     * @param request BuyPayAsYouGoOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BuyPayAsYouGoOrderResponse
     */
    public BuyPayAsYouGoOrderResponse buyPayAsYouGoOrderWithOptions(BuyPayAsYouGoOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.commodityType)) {
            query.put("CommodityType", request.commodityType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.insNum)) {
            query.put("InsNum", request.insNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionType)) {
            query.put("VersionType", request.versionType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BuyPayAsYouGoOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BuyPayAsYouGoOrderResponse());
    }

    /**
     * @summary Purchases a pay-as-you-go Data Management (DMS) resource.
     *
     * @param request BuyPayAsYouGoOrderRequest
     * @return BuyPayAsYouGoOrderResponse
     */
    public BuyPayAsYouGoOrderResponse buyPayAsYouGoOrder(BuyPayAsYouGoOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.buyPayAsYouGoOrderWithOptions(request, runtime);
    }

    /**
     * @summary Adjusts the sensitivity level of one or more fields.
     *
     * @param request ChangeColumnSecLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeColumnSecLevelResponse
     */
    public ChangeColumnSecLevelResponse changeColumnSecLevelWithOptions(ChangeColumnSecLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Adjusts the sensitivity level of one or more fields.
     *
     * @param request ChangeColumnSecLevelRequest
     * @return ChangeColumnSecLevelResponse
     */
    public ChangeColumnSecLevelResponse changeColumnSecLevel(ChangeColumnSecLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeColumnSecLevelWithOptions(request, runtime);
    }

    /**
     * @summary 修改字段敏感序列
     *
     * @param request ChangeColumnSecurityLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeColumnSecurityLevelResponse
     */
    public ChangeColumnSecurityLevelResponse changeColumnSecurityLevelWithOptions(ChangeColumnSecurityLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.newSensitivityLevel)) {
            query.put("NewSensitivityLevel", request.newSensitivityLevel);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ChangeColumnSecurityLevel"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ChangeColumnSecurityLevelResponse());
    }

    /**
     * @summary 修改字段敏感序列
     *
     * @param request ChangeColumnSecurityLevelRequest
     * @return ChangeColumnSecurityLevelResponse
     */
    public ChangeColumnSecurityLevelResponse changeColumnSecurityLevel(ChangeColumnSecurityLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeColumnSecurityLevelWithOptions(request, runtime);
    }

    /**
     * @summary 移交数仓开发任务流
     *
     * @description Usage notes:
     * *   If you call this operation to transfer the ownership of a published task flow, the ownership transfer does not take effect.
     * *   You can call the [ReDeployLhDagVersion](https://help.aliyun.com/document_detail/424712.html) operation to redeploy a published version of a task flow.
     *
     * @param request ChangeLhDagOwnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ChangeLhDagOwnerResponse
     */
    public ChangeLhDagOwnerResponse changeLhDagOwnerWithOptions(ChangeLhDagOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 移交数仓开发任务流
     *
     * @description Usage notes:
     * *   If you call this operation to transfer the ownership of a published task flow, the ownership transfer does not take effect.
     * *   You can call the [ReDeployLhDagVersion](https://help.aliyun.com/document_detail/424712.html) operation to redeploy a published version of a task flow.
     *
     * @param request ChangeLhDagOwnerRequest
     * @return ChangeLhDagOwnerResponse
     */
    public ChangeLhDagOwnerResponse changeLhDagOwner(ChangeLhDagOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.changeLhDagOwnerWithOptions(request, runtime);
    }

    /**
     * @summary Closes a ticket.
     *
     * @param request CloseOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CloseOrderResponse
     */
    public CloseOrderResponse closeOrderWithOptions(CloseOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Closes a ticket.
     *
     * @param request CloseOrderRequest
     * @return CloseOrderResponse
     */
    public CloseOrderResponse closeOrder(CloseOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.closeOrderWithOptions(request, runtime);
    }

    /**
     * @summary Creates a permission template
     *
     * @description You are a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see [View system roles](https://help.aliyun.com/document_detail/324212.html).
     *
     * @param request CreateAuthorityTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAuthorityTemplateResponse
     */
    public CreateAuthorityTemplateResponse createAuthorityTemplateWithOptions(CreateAuthorityTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAuthorityTemplate"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAuthorityTemplateResponse());
    }

    /**
     * @summary Creates a permission template
     *
     * @description You are a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see [View system roles](https://help.aliyun.com/document_detail/324212.html).
     *
     * @param request CreateAuthorityTemplateRequest
     * @return CreateAuthorityTemplateResponse
     */
    public CreateAuthorityTemplateResponse createAuthorityTemplate(CreateAuthorityTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAuthorityTemplateWithOptions(request, runtime);
    }

    /**
     * @summary Creates data archiving tickets.
     *
     * @param tmpReq CreateDataArchiveOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataArchiveOrderResponse
     */
    public CreateDataArchiveOrderResponse createDataArchiveOrderWithOptions(CreateDataArchiveOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataArchiveOrderShrinkRequest request = new CreateDataArchiveOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.param)) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.param, "Param", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginType)) {
            query.put("PluginType", request.pluginType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedUserListShrink)) {
            query.put("RelatedUserList", request.relatedUserListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataArchiveOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataArchiveOrderResponse());
    }

    /**
     * @summary Creates data archiving tickets.
     *
     * @param request CreateDataArchiveOrderRequest
     * @return CreateDataArchiveOrderResponse
     */
    public CreateDataArchiveOrderResponse createDataArchiveOrder(CreateDataArchiveOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataArchiveOrderWithOptions(request, runtime);
    }

    /**
     * @summary Creates a ticket for changing data in Data Management (DMS).
     *
     * @description For more information about the Normal Data Modify feature, see [Change regular data](https://help.aliyun.com/document_detail/58419.html).
     *
     * @param tmpReq CreateDataCorrectOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataCorrectOrderResponse
     */
    public CreateDataCorrectOrderResponse createDataCorrectOrderWithOptions(CreateDataCorrectOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataCorrectOrderShrinkRequest request = new CreateDataCorrectOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.param)) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.param, "Param", "json");
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Creates a ticket for changing data in Data Management (DMS).
     *
     * @description For more information about the Normal Data Modify feature, see [Change regular data](https://help.aliyun.com/document_detail/58419.html).
     *
     * @param request CreateDataCorrectOrderRequest
     * @return CreateDataCorrectOrderResponse
     */
    public CreateDataCorrectOrderResponse createDataCorrectOrder(CreateDataCorrectOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataCorrectOrderWithOptions(request, runtime);
    }

    /**
     * @summary Creates a ticket for clearing historical data.
     *
     * @description For more information about the historical data cleaning, see [Clear historical data](https://help.aliyun.com/document_detail/162507.html).
     * This operation can be used only for MySQL databases.
     *
     * @param tmpReq CreateDataCronClearOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataCronClearOrderResponse
     */
    public CreateDataCronClearOrderResponse createDataCronClearOrderWithOptions(CreateDataCronClearOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataCronClearOrderShrinkRequest request = new CreateDataCronClearOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.param)) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.param, "Param", "json");
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Creates a ticket for clearing historical data.
     *
     * @description For more information about the historical data cleaning, see [Clear historical data](https://help.aliyun.com/document_detail/162507.html).
     * This operation can be used only for MySQL databases.
     *
     * @param request CreateDataCronClearOrderRequest
     * @return CreateDataCronClearOrderResponse
     */
    public CreateDataCronClearOrderResponse createDataCronClearOrder(CreateDataCronClearOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataCronClearOrderWithOptions(request, runtime);
    }

    /**
     * @summary Creates a ticket to export an SQL result set.
     *
     * @param tmpReq CreateDataExportOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataExportOrderResponse
     */
    public CreateDataExportOrderResponse createDataExportOrderWithOptions(CreateDataExportOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataExportOrderShrinkRequest request = new CreateDataExportOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pluginParam)) {
            request.pluginParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pluginParam, "PluginParam", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginParamShrink)) {
            query.put("PluginParam", request.pluginParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedUserListShrink)) {
            query.put("RelatedUserList", request.relatedUserListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataExportOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataExportOrderResponse());
    }

    /**
     * @summary Creates a ticket to export an SQL result set.
     *
     * @param request CreateDataExportOrderRequest
     * @return CreateDataExportOrderResponse
     */
    public CreateDataExportOrderResponse createDataExportOrder(CreateDataExportOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataExportOrderWithOptions(request, runtime);
    }

    /**
     * @summary Creates a ticket for importing data to Data Management (DMS).
     *
     * @description For more information about the Large Data Import feature, see [Import data](https://help.aliyun.com/document_detail/161439.html).
     *
     * @param tmpReq CreateDataImportOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataImportOrderResponse
     */
    public CreateDataImportOrderResponse createDataImportOrderWithOptions(CreateDataImportOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataImportOrderShrinkRequest request = new CreateDataImportOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.param)) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.param, "Param", "json");
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Creates a ticket for importing data to Data Management (DMS).
     *
     * @description For more information about the Large Data Import feature, see [Import data](https://help.aliyun.com/document_detail/161439.html).
     *
     * @param request CreateDataImportOrderRequest
     * @return CreateDataImportOrderResponse
     */
    public CreateDataImportOrderResponse createDataImportOrder(CreateDataImportOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataImportOrderWithOptions(request, runtime);
    }

    /**
     * @summary Creates a data tracking ticket.
     *
     * @description This operation is available only for instances that are managed in Security Collaboration mode.
     *
     * @param tmpReq CreateDataTrackOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDataTrackOrderResponse
     */
    public CreateDataTrackOrderResponse createDataTrackOrderWithOptions(CreateDataTrackOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDataTrackOrderShrinkRequest request = new CreateDataTrackOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.param)) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.param, "Param", "json");
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataTrackOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataTrackOrderResponse());
    }

    /**
     * @summary Creates a data tracking ticket.
     *
     * @description This operation is available only for instances that are managed in Security Collaboration mode.
     *
     * @param request CreateDataTrackOrderRequest
     * @return CreateDataTrackOrderResponse
     */
    public CreateDataTrackOrderResponse createDataTrackOrder(CreateDataTrackOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDataTrackOrderWithOptions(request, runtime);
    }

    /**
     * @summary Creates a database export ticket.
     *
     * @param tmpReq CreateDatabaseExportOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatabaseExportOrderResponse
     */
    public CreateDatabaseExportOrderResponse createDatabaseExportOrderWithOptions(CreateDatabaseExportOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDatabaseExportOrderShrinkRequest request = new CreateDatabaseExportOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.pluginParam)) {
            request.pluginParamShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.pluginParam, "PluginParam", "json");
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

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            query.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginParamShrink)) {
            query.put("PluginParam", request.pluginParamShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.relatedUserListShrink)) {
            query.put("RelatedUserList", request.relatedUserListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDatabaseExportOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatabaseExportOrderResponse());
    }

    /**
     * @summary Creates a database export ticket.
     *
     * @param request CreateDatabaseExportOrderRequest
     * @return CreateDatabaseExportOrderResponse
     */
    public CreateDatabaseExportOrderResponse createDatabaseExportOrder(CreateDatabaseExportOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDatabaseExportOrderWithOptions(request, runtime);
    }

    /**
     * @summary 创建无锁变更工单
     *
     * @description For more information about the lock-free change feature, see [Overview](https://help.aliyun.com/document_detail/207847.html).
     * This operation can be used only for instances that are managed in Stable Change or Security Collaboration mode. For more information, see [Change data without the need to lock tables](https://help.aliyun.com/document_detail/96145.html) and [Change schemas without locking tables](https://help.aliyun.com/document_detail/98373.html).
     *
     * @param tmpReq CreateFreeLockCorrectOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFreeLockCorrectOrderResponse
     */
    public CreateFreeLockCorrectOrderResponse createFreeLockCorrectOrderWithOptions(CreateFreeLockCorrectOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateFreeLockCorrectOrderShrinkRequest request = new CreateFreeLockCorrectOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.param)) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.param, "Param", "json");
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 创建无锁变更工单
     *
     * @description For more information about the lock-free change feature, see [Overview](https://help.aliyun.com/document_detail/207847.html).
     * This operation can be used only for instances that are managed in Stable Change or Security Collaboration mode. For more information, see [Change data without the need to lock tables](https://help.aliyun.com/document_detail/96145.html) and [Change schemas without locking tables](https://help.aliyun.com/document_detail/98373.html).
     *
     * @param request CreateFreeLockCorrectOrderRequest
     * @return CreateFreeLockCorrectOrderResponse
     */
    public CreateFreeLockCorrectOrderResponse createFreeLockCorrectOrder(CreateFreeLockCorrectOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createFreeLockCorrectOrderWithOptions(request, runtime);
    }

    /**
     * @summary Creates a workspace for data warehouse development in Data Management (DMS).
     *
     * @description *   The workspace name must be unique within a tenant. If a workspace with the same name already exists within the tenant, the call may fail.
     * *   You can call the [GetLhSpaceByName](https://help.aliyun.com/document_detail/424379.html) operation to query whether a workspace with a specific name already exists as a DMS administrator or database administrator (DBA).
     *
     * @param request CreateLakeHouseSpaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLakeHouseSpaceResponse
     */
    public CreateLakeHouseSpaceResponse createLakeHouseSpaceWithOptions(CreateLakeHouseSpaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Creates a workspace for data warehouse development in Data Management (DMS).
     *
     * @description *   The workspace name must be unique within a tenant. If a workspace with the same name already exists within the tenant, the call may fail.
     * *   You can call the [GetLhSpaceByName](https://help.aliyun.com/document_detail/424379.html) operation to query whether a workspace with a specific name already exists as a DMS administrator or database administrator (DBA).
     *
     * @param request CreateLakeHouseSpaceRequest
     * @return CreateLakeHouseSpaceResponse
     */
    public CreateLakeHouseSpaceResponse createLakeHouseSpace(CreateLakeHouseSpaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLakeHouseSpaceWithOptions(request, runtime);
    }

    /**
     * @summary Creates a logical database in Database Management (DMS).
     *
     * @param tmpReq CreateLogicDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLogicDatabaseResponse
     */
    public CreateLogicDatabaseResponse createLogicDatabaseWithOptions(CreateLogicDatabaseRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Creates a logical database in Database Management (DMS).
     *
     * @param request CreateLogicDatabaseRequest
     * @return CreateLogicDatabaseResponse
     */
    public CreateLogicDatabaseResponse createLogicDatabase(CreateLogicDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLogicDatabaseWithOptions(request, runtime);
    }

    /**
     * @summary Creates a ticket in Data Management (DMS).
     *
     * @description To facilitate ticket creation, you can call the following dedicated operations to create some types of tickets:
     * *   [CreateDataCorrectOrder](https://help.aliyun.com/document_detail/208388.html): creates a regular data change ticket.
     * *   [CreateDataCronClearOrder](https://help.aliyun.com/document_detail/208385.html): creates a ticket to clear historical data.
     * *   [CreateDataImportOrder](https://help.aliyun.com/document_detail/208387.html): creates a data import ticket.
     * *   [CreateFreeLockCorrectOrder](https://help.aliyun.com/document_detail/208386.html): creates a lock-free change ticket.
     *
     * @param tmpReq CreateOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrderWithOptions(CreateOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Creates a ticket in Data Management (DMS).
     *
     * @description To facilitate ticket creation, you can call the following dedicated operations to create some types of tickets:
     * *   [CreateDataCorrectOrder](https://help.aliyun.com/document_detail/208388.html): creates a regular data change ticket.
     * *   [CreateDataCronClearOrder](https://help.aliyun.com/document_detail/208385.html): creates a ticket to clear historical data.
     * *   [CreateDataImportOrder](https://help.aliyun.com/document_detail/208387.html): creates a data import ticket.
     * *   [CreateFreeLockCorrectOrder](https://help.aliyun.com/document_detail/208386.html): creates a lock-free change ticket.
     *
     * @param request CreateOrderRequest
     * @return CreateOrderResponse
     */
    public CreateOrderResponse createOrder(CreateOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOrderWithOptions(request, runtime);
    }

    /**
     * @summary 创建可编程对象变更工单
     *
     * @param tmpReq CreateProcCorrectOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProcCorrectOrderResponse
     */
    public CreateProcCorrectOrderResponse createProcCorrectOrderWithOptions(CreateProcCorrectOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateProcCorrectOrderShrinkRequest request = new CreateProcCorrectOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.param)) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.param, "Param", "json");
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateProcCorrectOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateProcCorrectOrderResponse());
    }

    /**
     * @summary 创建可编程对象变更工单
     *
     * @param request CreateProcCorrectOrderRequest
     * @return CreateProcCorrectOrderResponse
     */
    public CreateProcCorrectOrderResponse createProcCorrectOrder(CreateProcCorrectOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProcCorrectOrderWithOptions(request, runtime);
    }

    /**
     * @summary Enables the secure access proxy feature for a database instance.
     *
     * @description - The database instance runs the MySQL or MariaDB database engine. For example, the database instance can be an ApsaraDB RDS for MySQL instance, a PolarDB for MySQL cluster, a Distributed Relational Database Service (DRDS) cluster, or an AnalyticDB for MySQL cluster. The database instance can also be a self-managed MySQL or MariaDB database, or a MySQL or MariaDB database in a third-party cloud.
     * - The database instance resides in the China (Hangzhou) or China (Beijing) region.
     * - You are a Data Management (DMS) administrator, a database administrator (DBA), or the owner of the database instance.
     *
     * @param request CreateProxyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProxyResponse
     */
    public CreateProxyResponse createProxyWithOptions(CreateProxyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Enables the secure access proxy feature for a database instance.
     *
     * @description - The database instance runs the MySQL or MariaDB database engine. For example, the database instance can be an ApsaraDB RDS for MySQL instance, a PolarDB for MySQL cluster, a Distributed Relational Database Service (DRDS) cluster, or an AnalyticDB for MySQL cluster. The database instance can also be a self-managed MySQL or MariaDB database, or a MySQL or MariaDB database in a third-party cloud.
     * - The database instance resides in the China (Hangzhou) or China (Beijing) region.
     * - You are a Data Management (DMS) administrator, a database administrator (DBA), or the owner of the database instance.
     *
     * @param request CreateProxyRequest
     * @return CreateProxyResponse
     */
    public CreateProxyResponse createProxy(CreateProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProxyWithOptions(request, runtime);
    }

    /**
     * @summary You can call the CreateProxyAccess to authorize users to access the DB instance through the Data Security Protection agent.
     *
     * @description - The data security protection feature is enabled for the instance.
     * - Your user role is the administrator role, DBA role, or the owner of data security protection for the current instance.
     *
     * @param request CreateProxyAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateProxyAccessResponse
     */
    public CreateProxyAccessResponse createProxyAccessWithOptions(CreateProxyAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary You can call the CreateProxyAccess to authorize users to access the DB instance through the Data Security Protection agent.
     *
     * @description - The data security protection feature is enabled for the instance.
     * - Your user role is the administrator role, DBA role, or the owner of data security protection for the current instance.
     *
     * @param request CreateProxyAccessRequest
     * @return CreateProxyAccessResponse
     */
    public CreateProxyAccessResponse createProxyAccess(CreateProxyAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createProxyAccessWithOptions(request, runtime);
    }

    /**
     * @summary Executes a schema design ticket.
     *
     * @param request CreatePublishGroupTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePublishGroupTaskResponse
     */
    public CreatePublishGroupTaskResponse createPublishGroupTaskWithOptions(CreatePublishGroupTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Executes a schema design ticket.
     *
     * @param request CreatePublishGroupTaskRequest
     * @return CreatePublishGroupTaskResponse
     */
    public CreatePublishGroupTaskResponse createPublishGroupTask(CreatePublishGroupTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPublishGroupTaskWithOptions(request, runtime);
    }

    /**
     * @summary Creates a SQL review ticket.
     *
     * @description You can call this operation only for database instances that are managed in Security Collaboration mode.
     * For more information about the SQL review feature, see [SQL review](https://help.aliyun.com/document_detail/60374.html).
     *
     * @param tmpReq CreateSQLReviewOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSQLReviewOrderResponse
     */
    public CreateSQLReviewOrderResponse createSQLReviewOrderWithOptions(CreateSQLReviewOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateSQLReviewOrderShrinkRequest request = new CreateSQLReviewOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.param)) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.param, "Param", "json");
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Creates a SQL review ticket.
     *
     * @description You can call this operation only for database instances that are managed in Security Collaboration mode.
     * For more information about the SQL review feature, see [SQL review](https://help.aliyun.com/document_detail/60374.html).
     *
     * @param request CreateSQLReviewOrderRequest
     * @return CreateSQLReviewOrderResponse
     */
    public CreateSQLReviewOrderResponse createSQLReviewOrder(CreateSQLReviewOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSQLReviewOrderWithOptions(request, runtime);
    }

    /**
     * @summary Creates a business scenario to group task flows by business scenario.
     *
     * @param request CreateScenarioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateScenarioResponse
     */
    public CreateScenarioResponse createScenarioWithOptions(CreateScenarioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioName)) {
            query.put("ScenarioName", request.scenarioName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateScenario"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateScenarioResponse());
    }

    /**
     * @summary Creates a business scenario to group task flows by business scenario.
     *
     * @param request CreateScenarioRequest
     * @return CreateScenarioResponse
     */
    public CreateScenarioResponse createScenario(CreateScenarioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createScenarioWithOptions(request, runtime);
    }

    /**
     * @summary Creates a security rule set.
     *
     * @param request CreateStandardGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStandardGroupResponse
     */
    public CreateStandardGroupResponse createStandardGroupWithOptions(CreateStandardGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Creates a security rule set.
     *
     * @param request CreateStandardGroupRequest
     * @return CreateStandardGroupResponse
     */
    public CreateStandardGroupResponse createStandardGroup(CreateStandardGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStandardGroupWithOptions(request, runtime);
    }

    /**
     * @summary Creates a schema synchronization ticket.
     *
     * @param tmpReq CreateStructSyncOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStructSyncOrderResponse
     */
    public CreateStructSyncOrderResponse createStructSyncOrderWithOptions(CreateStructSyncOrderRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStructSyncOrderShrinkRequest request = new CreateStructSyncOrderShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.param)) {
            request.paramShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.param, "Param", "json");
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Creates a schema synchronization ticket.
     *
     * @param request CreateStructSyncOrderRequest
     * @return CreateStructSyncOrderResponse
     */
    public CreateStructSyncOrderResponse createStructSyncOrder(CreateStructSyncOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStructSyncOrderWithOptions(request, runtime);
    }

    /**
     * @summary Creates a task node for a task flow.
     *
     * @param request CreateTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTaskWithOptions(CreateTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.graphParam)) {
            query.put("GraphParam", request.graphParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeContent)) {
            query.put("NodeContent", request.nodeContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            query.put("NodeName", request.nodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeOutput)) {
            query.put("NodeOutput", request.nodeOutput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("NodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeVariables)) {
            query.put("TimeVariables", request.timeVariables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTask"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskResponse());
    }

    /**
     * @summary Creates a task node for a task flow.
     *
     * @param request CreateTaskRequest
     * @return CreateTaskResponse
     */
    public CreateTaskResponse createTask(CreateTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTaskWithOptions(request, runtime);
    }

    /**
     * @summary Creates a task flow.
     *
     * @param request CreateTaskFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTaskFlowResponse
     */
    public CreateTaskFlowResponse createTaskFlowWithOptions(CreateTaskFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagName)) {
            query.put("DagName", request.dagName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTaskFlow"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTaskFlowResponse());
    }

    /**
     * @summary Creates a task flow.
     *
     * @param request CreateTaskFlowRequest
     * @return CreateTaskFlowResponse
     */
    public CreateTaskFlowResponse createTaskFlow(CreateTaskFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createTaskFlowWithOptions(request, runtime);
    }

    /**
     * @summary 创建上传附件任务
     *
     * @param request CreateUploadFileJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUploadFileJobResponse
     */
    public CreateUploadFileJobResponse createUploadFileJobWithOptions(CreateUploadFileJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 创建上传附件任务
     *
     * @param request CreateUploadFileJobRequest
     * @return CreateUploadFileJobResponse
     */
    public CreateUploadFileJobResponse createUploadFileJob(CreateUploadFileJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadFileJobWithOptions(request, runtime);
    }

    /**
     * @summary Creates a task to upload an Object Storage Service (OSS) file and obtain the key of the task.
     *
     * @param tmpReq CreateUploadOSSFileJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateUploadOSSFileJobResponse
     */
    public CreateUploadOSSFileJobResponse createUploadOSSFileJobWithOptions(CreateUploadOSSFileJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateUploadOSSFileJobShrinkRequest request = new CreateUploadOSSFileJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.uploadTarget)) {
            request.uploadTargetShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.uploadTarget, "UploadTarget", "json");
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Creates a task to upload an Object Storage Service (OSS) file and obtain the key of the task.
     *
     * @param request CreateUploadOSSFileJobRequest
     * @return CreateUploadOSSFileJobResponse
     */
    public CreateUploadOSSFileJobResponse createUploadOSSFileJob(CreateUploadOSSFileJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createUploadOSSFileJobWithOptions(request, runtime);
    }

    /**
     * @summary 删除权限模版
     *
     * @param request DeleteAuthorityTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAuthorityTemplateResponse
     */
    public DeleteAuthorityTemplateResponse deleteAuthorityTemplateWithOptions(DeleteAuthorityTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAuthorityTemplate"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAuthorityTemplateResponse());
    }

    /**
     * @summary 删除权限模版
     *
     * @param request DeleteAuthorityTemplateRequest
     * @return DeleteAuthorityTemplateResponse
     */
    public DeleteAuthorityTemplateResponse deleteAuthorityTemplate(DeleteAuthorityTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAuthorityTemplateWithOptions(request, runtime);
    }

    /**
     * @summary Removes a database instance from Data Management (DMS).
     *
     * @description Note: You can call this operation only to remove a database instance from the instance list of DMS. The instance is not deleted or shut down.
     *
     * @param request DeleteInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstanceWithOptions(DeleteInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Removes a database instance from Data Management (DMS).
     *
     * @description Note: You can call this operation only to remove a database instance from the instance list of DMS. The instance is not deleted or shut down.
     *
     * @param request DeleteInstanceRequest
     * @return DeleteInstanceResponse
     */
    public DeleteInstanceResponse deleteInstance(DeleteInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a workspace.
     *
     * @param request DeleteLakeHouseSpaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLakeHouseSpaceResponse
     */
    public DeleteLakeHouseSpaceResponse deleteLakeHouseSpaceWithOptions(DeleteLakeHouseSpaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.spaceId)) {
            query.put("SpaceId", request.spaceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Deletes a workspace.
     *
     * @param request DeleteLakeHouseSpaceRequest
     * @return DeleteLakeHouseSpaceResponse
     */
    public DeleteLakeHouseSpaceResponse deleteLakeHouseSpace(DeleteLakeHouseSpaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLakeHouseSpaceWithOptions(request, runtime);
    }

    /**
     * @summary 删除数仓空间成员
     *
     * @description You must call this operation as a DMS administrator, a database administrator (DBA), or a workspace administrator.
     * You cannot call this operation to transfer the ownership of a task flow. To transfer the ownership of a task flow, call the [ChangLhDagOwner](https://help.aliyun.com/document_detail/424761.html) operation.
     *
     * @param tmpReq DeleteLhMembersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLhMembersResponse
     */
    public DeleteLhMembersResponse deleteLhMembersWithOptions(DeleteLhMembersRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 删除数仓空间成员
     *
     * @description You must call this operation as a DMS administrator, a database administrator (DBA), or a workspace administrator.
     * You cannot call this operation to transfer the ownership of a task flow. To transfer the ownership of a task flow, call the [ChangLhDagOwner](https://help.aliyun.com/document_detail/424761.html) operation.
     *
     * @param request DeleteLhMembersRequest
     * @return DeleteLhMembersResponse
     */
    public DeleteLhMembersResponse deleteLhMembers(DeleteLhMembersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLhMembersWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a logical database in Database Management (DMS). This operation only deletes the specified logical database but does not delete physical databases.
     *
     * @param request DeleteLogicDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLogicDatabaseResponse
     */
    public DeleteLogicDatabaseResponse deleteLogicDatabaseWithOptions(DeleteLogicDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicDbId)) {
            query.put("LogicDbId", request.logicDbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Deletes a logical database in Database Management (DMS). This operation only deletes the specified logical database but does not delete physical databases.
     *
     * @param request DeleteLogicDatabaseRequest
     * @return DeleteLogicDatabaseResponse
     */
    public DeleteLogicDatabaseResponse deleteLogicDatabase(DeleteLogicDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLogicDatabaseWithOptions(request, runtime);
    }

    /**
     * @summary Deletes the routing algorithm of a logical table.
     *
     * @param request DeleteLogicTableRouteConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLogicTableRouteConfigResponse
     */
    public DeleteLogicTableRouteConfigResponse deleteLogicTableRouteConfigWithOptions(DeleteLogicTableRouteConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Deletes the routing algorithm of a logical table.
     *
     * @param request DeleteLogicTableRouteConfigRequest
     * @return DeleteLogicTableRouteConfigResponse
     */
    public DeleteLogicTableRouteConfigResponse deleteLogicTableRouteConfig(DeleteLogicTableRouteConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLogicTableRouteConfigWithOptions(request, runtime);
    }

    /**
     * @summary You can call this operation to disable the data security protection proxy of a DB instance.
     *
     * @description After you disable this feature, your DB instance loses the JDBC protocol. All authorization information is recycled.
     *
     * @param request DeleteProxyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProxyResponse
     */
    public DeleteProxyResponse deleteProxyWithOptions(DeleteProxyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.proxyId)) {
            query.put("ProxyId", request.proxyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary You can call this operation to disable the data security protection proxy of a DB instance.
     *
     * @description After you disable this feature, your DB instance loses the JDBC protocol. All authorization information is recycled.
     *
     * @param request DeleteProxyRequest
     * @return DeleteProxyResponse
     */
    public DeleteProxyResponse deleteProxy(DeleteProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProxyWithOptions(request, runtime);
    }

    /**
     * @summary You can call this operation to DeleteProxyAccess reclaim the data security protection authorization of the target user.
     *
     * @param request DeleteProxyAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteProxyAccessResponse
     */
    public DeleteProxyAccessResponse deleteProxyAccessWithOptions(DeleteProxyAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.proxyAccessId)) {
            query.put("ProxyAccessId", request.proxyAccessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary You can call this operation to DeleteProxyAccess reclaim the data security protection authorization of the target user.
     *
     * @param request DeleteProxyAccessRequest
     * @return DeleteProxyAccessResponse
     */
    public DeleteProxyAccessResponse deleteProxyAccess(DeleteProxyAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteProxyAccessWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a business scenario.
     *
     * @description When you call this operation, make sure that no task flow is specified in the business scenario.
     *
     * @param request DeleteScenarioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteScenarioResponse
     */
    public DeleteScenarioResponse deleteScenarioWithOptions(DeleteScenarioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteScenario"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteScenarioResponse());
    }

    /**
     * @summary Deletes a business scenario.
     *
     * @description When you call this operation, make sure that no task flow is specified in the business scenario.
     *
     * @param request DeleteScenarioRequest
     * @return DeleteScenarioResponse
     */
    public DeleteScenarioResponse deleteScenario(DeleteScenarioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteScenarioWithOptions(request, runtime);
    }

    /**
     * @summary 删除安全规则
     *
     * @param request DeleteStandardGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStandardGroupResponse
     */
    public DeleteStandardGroupResponse deleteStandardGroupWithOptions(DeleteStandardGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStandardGroup"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStandardGroupResponse());
    }

    /**
     * @summary 删除安全规则
     *
     * @param request DeleteStandardGroupRequest
     * @return DeleteStandardGroupResponse
     */
    public DeleteStandardGroupResponse deleteStandardGroup(DeleteStandardGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStandardGroupWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a task in a specified task flow.
     *
     * @param request DeleteTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTaskWithOptions(DeleteTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTask"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTaskResponse());
    }

    /**
     * @summary Deletes a task in a specified task flow.
     *
     * @param request DeleteTaskRequest
     * @return DeleteTaskResponse
     */
    public DeleteTaskResponse deleteTask(DeleteTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTaskWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a task flow.
     *
     * @param request DeleteTaskFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTaskFlowResponse
     */
    public DeleteTaskFlowResponse deleteTaskFlowWithOptions(DeleteTaskFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Deletes a task flow.
     *
     * @param request DeleteTaskFlowRequest
     * @return DeleteTaskFlowResponse
     */
    public DeleteTaskFlowResponse deleteTaskFlow(DeleteTaskFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTaskFlowWithOptions(request, runtime);
    }

    /**
     * @summary Deletes task flow edges based on multiple conditions.
     *
     * @description This operation is used for multi-condition query. You can call it to delete the edges of a specified task flow that meet all specified conditions.
     *
     * @param request DeleteTaskFlowEdgesByConditionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTaskFlowEdgesByConditionResponse
     */
    public DeleteTaskFlowEdgesByConditionResponse deleteTaskFlowEdgesByConditionWithOptions(DeleteTaskFlowEdgesByConditionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeEnd)) {
            query.put("NodeEnd", request.nodeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeFrom)) {
            query.put("NodeFrom", request.nodeFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTaskFlowEdgesByCondition"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTaskFlowEdgesByConditionResponse());
    }

    /**
     * @summary Deletes task flow edges based on multiple conditions.
     *
     * @description This operation is used for multi-condition query. You can call it to delete the edges of a specified task flow that meet all specified conditions.
     *
     * @param request DeleteTaskFlowEdgesByConditionRequest
     * @return DeleteTaskFlowEdgesByConditionResponse
     */
    public DeleteTaskFlowEdgesByConditionResponse deleteTaskFlowEdgesByCondition(DeleteTaskFlowEdgesByConditionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteTaskFlowEdgesByConditionWithOptions(request, runtime);
    }

    /**
     * @summary Deletes an Alibaba Cloud account that is no longer used.
     *
     * @description The effect of deleting a user by calling this operation is the same as that of deleting a user by choosing System Management > User Management in the DMS Enterprise console. The administrator of DMS Enterprise can call this operation to delete a user that is no longer used from DMS Enterprise. After the user is deleted, the data source permission, data owner configuration, and database administrator (DBA) configuration of the corresponding Alibaba Cloud account or Resource Access Management (RAM) user are revoked and become invalid.
     * >  This operation only removes the association of the Alibaba Cloud account or RAM user with DMS Enterprise of the enterprise, rather than actually deleting the Alibaba Cloud account or RAM user. After the user is deleted, the Alibaba Cloud account or RAM user cannot log on to DMS Enterprise, unless the user is added to DMS Enterprise again.
     *
     * @param request DeleteUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUserWithOptions(DeleteUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Deletes an Alibaba Cloud account that is no longer used.
     *
     * @description The effect of deleting a user by calling this operation is the same as that of deleting a user by choosing System Management > User Management in the DMS Enterprise console. The administrator of DMS Enterprise can call this operation to delete a user that is no longer used from DMS Enterprise. After the user is deleted, the data source permission, data owner configuration, and database administrator (DBA) configuration of the corresponding Alibaba Cloud account or Resource Access Management (RAM) user are revoked and become invalid.
     * >  This operation only removes the association of the Alibaba Cloud account or RAM user with DMS Enterprise of the enterprise, rather than actually deleting the Alibaba Cloud account or RAM user. After the user is deleted, the Alibaba Cloud account or RAM user cannot log on to DMS Enterprise, unless the user is added to DMS Enterprise again.
     *
     * @param request DeleteUserRequest
     * @return DeleteUserResponse
     */
    public DeleteUserResponse deleteUser(DeleteUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteUserWithOptions(request, runtime);
    }

    /**
     * @summary You can call this operation to disable a user that is temporarily not used in Data Management (DMS) Enterprise.
     *
     * @description The effect of disabling a user by calling this operation is the same as that of disabling a user by choosing System Management > User Management in the DMS Enterprise console. The administrator of DMS Enterprise can call this operation to disable a user that is temporarily not used in DMS Enterprise. After the user is disabled, the data source permission, data owner configuration, and database administrator (DBA) configuration of the corresponding Alibaba Cloud account or Resource Access Management (RAM) user are revoked and become invalid.
     * >  This operation only stops the Alibaba Cloud account or RAM user from logging on to DMS Enterprise of the enterprise, rather than actually disabling the Alibaba Cloud account or RAM user. After the user is disabled, the Alibaba Cloud account or RAM user cannot log on to DMS Enterprise, unless the user is enabled again. The disabled user, however, still exists in DMS Enterprise.
     *
     * @param request DisableUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableUserResponse
     */
    public DisableUserResponse disableUserWithOptions(DisableUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary You can call this operation to disable a user that is temporarily not used in Data Management (DMS) Enterprise.
     *
     * @description The effect of disabling a user by calling this operation is the same as that of disabling a user by choosing System Management > User Management in the DMS Enterprise console. The administrator of DMS Enterprise can call this operation to disable a user that is temporarily not used in DMS Enterprise. After the user is disabled, the data source permission, data owner configuration, and database administrator (DBA) configuration of the corresponding Alibaba Cloud account or Resource Access Management (RAM) user are revoked and become invalid.
     * >  This operation only stops the Alibaba Cloud account or RAM user from logging on to DMS Enterprise of the enterprise, rather than actually disabling the Alibaba Cloud account or RAM user. After the user is disabled, the Alibaba Cloud account or RAM user cannot log on to DMS Enterprise, unless the user is enabled again. The disabled user, however, still exists in DMS Enterprise.
     *
     * @param request DisableUserRequest
     * @return DisableUserResponse
     */
    public DisableUserResponse disableUser(DisableUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableUserWithOptions(request, runtime);
    }

    /**
     * @summary Downloads the parsing result of a data tracking task.
     *
     * @param tmpReq DownloadDataTrackResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadDataTrackResultResponse
     */
    public DownloadDataTrackResultResponse downloadDataTrackResultWithOptions(DownloadDataTrackResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DownloadDataTrackResultShrinkRequest request = new DownloadDataTrackResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columnFilter)) {
            request.columnFilterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columnFilter, "ColumnFilter", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.eventIdList)) {
            request.eventIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.eventIdList, "EventIdList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterTableList)) {
            request.filterTableListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterTableList, "FilterTableList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterTypeList)) {
            request.filterTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterTypeList, "FilterTypeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnFilterShrink)) {
            query.put("ColumnFilter", request.columnFilterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.eventIdListShrink)) {
            query.put("EventIdList", request.eventIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterEndTime)) {
            query.put("FilterEndTime", request.filterEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterStartTime)) {
            query.put("FilterStartTime", request.filterStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterTableListShrink)) {
            query.put("FilterTableList", request.filterTableListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterTypeListShrink)) {
            query.put("FilterTypeList", request.filterTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rollbackSQLType)) {
            query.put("RollbackSQLType", request.rollbackSQLType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadDataTrackResult"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadDataTrackResultResponse());
    }

    /**
     * @summary Downloads the parsing result of a data tracking task.
     *
     * @param request DownloadDataTrackResultRequest
     * @return DownloadDataTrackResultResponse
     */
    public DownloadDataTrackResultResponse downloadDataTrackResult(DownloadDataTrackResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadDataTrackResultWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the information about a logical database.
     *
     * @param tmpReq EditLogicDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EditLogicDatabaseResponse
     */
    public EditLogicDatabaseResponse editLogicDatabaseWithOptions(EditLogicDatabaseRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Modifies the information about a logical database.
     *
     * @param request EditLogicDatabaseRequest
     * @return EditLogicDatabaseResponse
     */
    public EditLogicDatabaseResponse editLogicDatabase(EditLogicDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.editLogicDatabaseWithOptions(request, runtime);
    }

    /**
     * @summary You can call this operation to enable a user that has been disabled in Data Management (DMS) Enterprise.
     *
     * @description The effect of enabling a user by calling this operation is the same as that of enabling a user by choosing System Management > User Management in the DMS Enterprise console. The administrator of DMS Enterprise can call this operation to enable a user that has been disabled in DMS Enterprise. After the user is enabled, the corresponding Alibaba Cloud account or Resource Access Management (RAM) user can continue to log on to DMS Enterprise and perform relevant operations.
     * >  This operation only enables the Alibaba Cloud account or RAM user to log on to DMS Enterprise of the enterprise and perform relevant operations, rather than granting other permissions to the Alibaba Cloud account or RAM user.
     *
     * @param request EnableUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableUserResponse
     */
    public EnableUserResponse enableUserWithOptions(EnableUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.uid)) {
            query.put("Uid", request.uid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary You can call this operation to enable a user that has been disabled in Data Management (DMS) Enterprise.
     *
     * @description The effect of enabling a user by calling this operation is the same as that of enabling a user by choosing System Management > User Management in the DMS Enterprise console. The administrator of DMS Enterprise can call this operation to enable a user that has been disabled in DMS Enterprise. After the user is enabled, the corresponding Alibaba Cloud account or Resource Access Management (RAM) user can continue to log on to DMS Enterprise and perform relevant operations.
     * >  This operation only enables the Alibaba Cloud account or RAM user to log on to DMS Enterprise of the enterprise and perform relevant operations, rather than granting other permissions to the Alibaba Cloud account or RAM user.
     *
     * @param request EnableUserRequest
     * @return EnableUserResponse
     */
    public EnableUserResponse enableUser(EnableUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableUserWithOptions(request, runtime);
    }

    /**
     * @summary Submits a ticket for data change.
     *
     * @param tmpReq ExecuteDataCorrectRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteDataCorrectResponse
     */
    public ExecuteDataCorrectResponse executeDataCorrectWithOptions(ExecuteDataCorrectRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Submits a ticket for data change.
     *
     * @param request ExecuteDataCorrectRequest
     * @return ExecuteDataCorrectResponse
     */
    public ExecuteDataCorrectResponse executeDataCorrect(ExecuteDataCorrectRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeDataCorrectWithOptions(request, runtime);
    }

    /**
     * @summary Executes a data export ticket.
     *
     * @param tmpReq ExecuteDataExportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteDataExportResponse
     */
    public ExecuteDataExportResponse executeDataExportWithOptions(ExecuteDataExportRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Executes a data export ticket.
     *
     * @param request ExecuteDataExportRequest
     * @return ExecuteDataExportResponse
     */
    public ExecuteDataExportResponse executeDataExport(ExecuteDataExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeDataExportWithOptions(request, runtime);
    }

    /**
     * @summary Executes SQL statements.
     *
     * @description You can call this operation only for instances that are managed in Security Collaboration mode.
     *
     * @param request ExecuteScriptRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteScriptResponse
     */
    public ExecuteScriptResponse executeScriptWithOptions(ExecuteScriptRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Executes SQL statements.
     *
     * @description You can call this operation only for instances that are managed in Security Collaboration mode.
     *
     * @param request ExecuteScriptRequest
     * @return ExecuteScriptResponse
     */
    public ExecuteScriptResponse executeScript(ExecuteScriptRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeScriptWithOptions(request, runtime);
    }

    /**
     * @summary Executes a schema synchronization task.
     *
     * @description If the security rules of an instance indicate that a ticket must be approved before you perform schema synchronization, you can call the [SubmitStructSyncOrderApproval](https://help.aliyun.com/document_detail/206166.html) operation to submit the ticket for approval.
     * >  You can call the [GetStructSyncJobDetail](https://help.aliyun.com/document_detail/206160.html) operation to query whether you need to submit a ticket for approval.
     *
     * @param request ExecuteStructSyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteStructSyncResponse
     */
    public ExecuteStructSyncResponse executeStructSyncWithOptions(ExecuteStructSyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Executes a schema synchronization task.
     *
     * @description If the security rules of an instance indicate that a ticket must be approved before you perform schema synchronization, you can call the [SubmitStructSyncOrderApproval](https://help.aliyun.com/document_detail/206166.html) operation to submit the ticket for approval.
     * >  You can call the [GetStructSyncJobDetail](https://help.aliyun.com/document_detail/206160.html) operation to query whether you need to submit a ticket for approval.
     *
     * @param request ExecuteStructSyncRequest
     * @return ExecuteStructSyncResponse
     */
    public ExecuteStructSyncResponse executeStructSync(ExecuteStructSyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeStructSyncWithOptions(request, runtime);
    }

    /**
     * @summary Queries the approval details of a ticket.
     *
     * @param request GetApprovalDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApprovalDetailResponse
     */
    public GetApprovalDetailResponse getApprovalDetailWithOptions(GetApprovalDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workflowInstanceId)) {
            query.put("WorkflowInstanceId", request.workflowInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the approval details of a ticket.
     *
     * @param request GetApprovalDetailRequest
     * @return GetApprovalDetailResponse
     */
    public GetApprovalDetailResponse getApprovalDetail(GetApprovalDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApprovalDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a permission template.
     *
     * @description You must be a Data Management (DMS) administrator or a database administrator (DBA). For more information about how to view system roles, see [View system roles](https://help.aliyun.com/document_detail/324212.html).
     *
     * @param request GetAuthorityTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAuthorityTemplateResponse
     */
    public GetAuthorityTemplateResponse getAuthorityTemplateWithOptions(GetAuthorityTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuthorityTemplate"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuthorityTemplateResponse());
    }

    /**
     * @summary Queries the information about a permission template.
     *
     * @description You must be a Data Management (DMS) administrator or a database administrator (DBA). For more information about how to view system roles, see [View system roles](https://help.aliyun.com/document_detail/324212.html).
     *
     * @param request GetAuthorityTemplateRequest
     * @return GetAuthorityTemplateResponse
     */
    public GetAuthorityTemplateResponse getAuthorityTemplate(GetAuthorityTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuthorityTemplateWithOptions(request, runtime);
    }

    /**
     * @summary Queries the resources in a permission template.
     *
     * @description You are a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see [View system roles](https://help.aliyun.com/document_detail/324212.html).
     *
     * @param request GetAuthorityTemplateItemRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAuthorityTemplateItemResponse
     */
    public GetAuthorityTemplateItemResponse getAuthorityTemplateItemWithOptions(GetAuthorityTemplateItemRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAuthorityTemplateItem"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAuthorityTemplateItemResponse());
    }

    /**
     * @summary Queries the resources in a permission template.
     *
     * @description You are a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see [View system roles](https://help.aliyun.com/document_detail/324212.html).
     *
     * @param request GetAuthorityTemplateItemRequest
     * @return GetAuthorityTemplateItemResponse
     */
    public GetAuthorityTemplateItemResponse getAuthorityTemplateItem(GetAuthorityTemplateItemRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getAuthorityTemplateItemWithOptions(request, runtime);
    }

    /**
     * @summary 获取实例绑定的分类分级模板
     *
     * @param request GetClassificationTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetClassificationTemplateResponse
     */
    public GetClassificationTemplateResponse getClassificationTemplateWithOptions(GetClassificationTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetClassificationTemplate"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetClassificationTemplateResponse());
    }

    /**
     * @summary 获取实例绑定的分类分级模板
     *
     * @param request GetClassificationTemplateRequest
     * @return GetClassificationTemplateResponse
     */
    public GetClassificationTemplateResponse getClassificationTemplate(GetClassificationTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getClassificationTemplateWithOptions(request, runtime);
    }

    /**
     * @summary Queries the log that records the scheduling details of an SQL task.
     *
     * @param request GetDBTaskSQLJobLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDBTaskSQLJobLogResponse
     */
    public GetDBTaskSQLJobLogResponse getDBTaskSQLJobLogWithOptions(GetDBTaskSQLJobLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the log that records the scheduling details of an SQL task.
     *
     * @param request GetDBTaskSQLJobLogRequest
     * @return GetDBTaskSQLJobLogResponse
     */
    public GetDBTaskSQLJobLogResponse getDBTaskSQLJobLog(GetDBTaskSQLJobLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDBTaskSQLJobLogWithOptions(request, runtime);
    }

    /**
     * @summary Queries the topologies of a logical database and its physical database shards.
     *
     * @param request GetDBTopologyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDBTopologyResponse
     */
    public GetDBTopologyResponse getDBTopologyWithOptions(GetDBTopologyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.logicDbId)) {
            query.put("LogicDbId", request.logicDbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the topologies of a logical database and its physical database shards.
     *
     * @param request GetDBTopologyRequest
     * @return GetDBTopologyResponse
     */
    public GetDBTopologyResponse getDBTopology(GetDBTopologyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDBTopologyWithOptions(request, runtime);
    }

    /**
     * @summary Queries the statistics of data archiving orders, including the number of successful archiving tickets, the number of failed archiving tickets, the number of in-progress archiving tickets, and the total number of archiving tickets.
     *
     * @param request GetDataArchiveCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataArchiveCountResponse
     */
    public GetDataArchiveCountResponse getDataArchiveCountWithOptions(GetDataArchiveCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderResultType)) {
            query.put("OrderResultType", request.orderResultType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pluginType)) {
            query.put("PluginType", request.pluginType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchDateType)) {
            query.put("SearchDateType", request.searchDateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataArchiveCount"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataArchiveCountResponse());
    }

    /**
     * @summary Queries the statistics of data archiving orders, including the number of successful archiving tickets, the number of failed archiving tickets, the number of in-progress archiving tickets, and the total number of archiving tickets.
     *
     * @param request GetDataArchiveCountRequest
     * @return GetDataArchiveCountResponse
     */
    public GetDataArchiveCountResponse getDataArchiveCount(GetDataArchiveCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataArchiveCountWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a data archiving ticket.
     *
     * @param request GetDataArchiveOrderDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataArchiveOrderDetailResponse
     */
    public GetDataArchiveOrderDetailResponse getDataArchiveOrderDetailWithOptions(GetDataArchiveOrderDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataArchiveOrderDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataArchiveOrderDetailResponse());
    }

    /**
     * @summary Queries the details of a data archiving ticket.
     *
     * @param request GetDataArchiveOrderDetailRequest
     * @return GetDataArchiveOrderDetailResponse
     */
    public GetDataArchiveOrderDetailResponse getDataArchiveOrderDetail(GetDataArchiveOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataArchiveOrderDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the download URL of the backup file for a data change ticket in Data Management (DMS).
     *
     * @param tmpReq GetDataCorrectBackupFilesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataCorrectBackupFilesResponse
     */
    public GetDataCorrectBackupFilesResponse getDataCorrectBackupFilesWithOptions(GetDataCorrectBackupFilesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the download URL of the backup file for a data change ticket in Data Management (DMS).
     *
     * @param request GetDataCorrectBackupFilesRequest
     * @return GetDataCorrectBackupFilesResponse
     */
    public GetDataCorrectBackupFilesResponse getDataCorrectBackupFiles(GetDataCorrectBackupFilesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataCorrectBackupFilesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a data change ticket in Data Management (DMS).
     *
     * @param request GetDataCorrectOrderDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataCorrectOrderDetailResponse
     */
    public GetDataCorrectOrderDetailResponse getDataCorrectOrderDetailWithOptions(GetDataCorrectOrderDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the information about a data change ticket in Data Management (DMS).
     *
     * @param request GetDataCorrectOrderDetailRequest
     * @return GetDataCorrectOrderDetailResponse
     */
    public GetDataCorrectOrderDetailResponse getDataCorrectOrderDetail(GetDataCorrectOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataCorrectOrderDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the download URL of the rollback attachment submitted along with a data change ticket.
     *
     * @param request GetDataCorrectRollbackFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataCorrectRollbackFileResponse
     */
    public GetDataCorrectRollbackFileResponse getDataCorrectRollbackFileWithOptions(GetDataCorrectRollbackFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataCorrectRollbackFile"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataCorrectRollbackFileResponse());
    }

    /**
     * @summary Queries the download URL of the rollback attachment submitted along with a data change ticket.
     *
     * @param request GetDataCorrectRollbackFileRequest
     * @return GetDataCorrectRollbackFileResponse
     */
    public GetDataCorrectRollbackFileResponse getDataCorrectRollbackFile(GetDataCorrectRollbackFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataCorrectRollbackFileWithOptions(request, runtime);
    }

    /**
     * @summary Queries the download URL of the SQL script for a data change task.
     *
     * @description This operation applies to [regular data change](https://help.aliyun.com/document_detail/58419.html) and [batch data import](https://help.aliyun.com/document_detail/144643.html).
     *
     * @param request GetDataCorrectSQLFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataCorrectSQLFileResponse
     */
    public GetDataCorrectSQLFileResponse getDataCorrectSQLFileWithOptions(GetDataCorrectSQLFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the download URL of the SQL script for a data change task.
     *
     * @description This operation applies to [regular data change](https://help.aliyun.com/document_detail/58419.html) and [batch data import](https://help.aliyun.com/document_detail/144643.html).
     *
     * @param request GetDataCorrectSQLFileRequest
     * @return GetDataCorrectSQLFileResponse
     */
    public GetDataCorrectSQLFileResponse getDataCorrectSQLFile(GetDataCorrectSQLFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataCorrectSQLFileWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a data change, lock-free data change, or data import task.
     *
     * @param request GetDataCorrectTaskDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataCorrectTaskDetailResponse
     */
    public GetDataCorrectTaskDetailResponse getDataCorrectTaskDetailWithOptions(GetDataCorrectTaskDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the information about a data change, lock-free data change, or data import task.
     *
     * @param request GetDataCorrectTaskDetailRequest
     * @return GetDataCorrectTaskDetailResponse
     */
    public GetDataCorrectTaskDetailResponse getDataCorrectTaskDetail(GetDataCorrectTaskDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataCorrectTaskDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the scheduling configuration of a ticket for cleaning up historical data.
     *
     * @param request GetDataCronClearConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataCronClearConfigResponse
     */
    public GetDataCronClearConfigResponse getDataCronClearConfigWithOptions(GetDataCronClearConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataCronClearConfig"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataCronClearConfigResponse());
    }

    /**
     * @summary Queries the scheduling configuration of a ticket for cleaning up historical data.
     *
     * @param request GetDataCronClearConfigRequest
     * @return GetDataCronClearConfigResponse
     */
    public GetDataCronClearConfigResponse getDataCronClearConfig(GetDataCronClearConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataCronClearConfigWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a historical data cleansing ticket.
     *
     * @param request GetDataCronClearTaskDetailListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataCronClearTaskDetailListResponse
     */
    public GetDataCronClearTaskDetailListResponse getDataCronClearTaskDetailListWithOptions(GetDataCronClearTaskDetailListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of a historical data cleansing ticket.
     *
     * @param request GetDataCronClearTaskDetailListRequest
     * @return GetDataCronClearTaskDetailListResponse
     */
    public GetDataCronClearTaskDetailListResponse getDataCronClearTaskDetailList(GetDataCronClearTaskDetailListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataCronClearTaskDetailListWithOptions(request, runtime);
    }

    /**
     * @summary Queries the download URL of the file that records the export results for a data export ticket in Data Management (DMS).
     *
     * @param request GetDataExportDownloadURLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataExportDownloadURLResponse
     */
    public GetDataExportDownloadURLResponse getDataExportDownloadURLWithOptions(GetDataExportDownloadURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the download URL of the file that records the export results for a data export ticket in Data Management (DMS).
     *
     * @param request GetDataExportDownloadURLRequest
     * @return GetDataExportDownloadURLResponse
     */
    public GetDataExportDownloadURLResponse getDataExportDownloadURL(GetDataExportDownloadURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataExportDownloadURLWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a data export ticket.
     *
     * @param request GetDataExportOrderDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataExportOrderDetailResponse
     */
    public GetDataExportOrderDetailResponse getDataExportOrderDetailWithOptions(GetDataExportOrderDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the information about a data export ticket.
     *
     * @param request GetDataExportOrderDetailRequest
     * @return GetDataExportOrderDetailResponse
     */
    public GetDataExportOrderDetailResponse getDataExportOrderDetail(GetDataExportOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataExportOrderDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the precheck details of an SQL result set export ticket.
     *
     * @param request GetDataExportPreCheckDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataExportPreCheckDetailResponse
     */
    public GetDataExportPreCheckDetailResponse getDataExportPreCheckDetailWithOptions(GetDataExportPreCheckDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataExportPreCheckDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataExportPreCheckDetailResponse());
    }

    /**
     * @summary Queries the precheck details of an SQL result set export ticket.
     *
     * @param request GetDataExportPreCheckDetailRequest
     * @return GetDataExportPreCheckDetailResponse
     */
    public GetDataExportPreCheckDetailResponse getDataExportPreCheckDetail(GetDataExportPreCheckDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataExportPreCheckDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the SQL statements used for data import in a ticket.
     *
     * @description You can call this operation only if the data is imported in security mode in your data import ticket.
     *
     * @param request GetDataImportSQLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataImportSQLResponse
     */
    public GetDataImportSQLResponse getDataImportSQLWithOptions(GetDataImportSQLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlId)) {
            query.put("SqlId", request.sqlId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataImportSQL"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataImportSQLResponse());
    }

    /**
     * @summary Queries the SQL statements used for data import in a ticket.
     *
     * @description You can call this operation only if the data is imported in security mode in your data import ticket.
     *
     * @param request GetDataImportSQLRequest
     * @return GetDataImportSQLResponse
     */
    public GetDataImportSQLResponse getDataImportSQL(GetDataImportSQLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataImportSQLWithOptions(request, runtime);
    }

    /**
     * @summary Queries the progress of a data tracking task.
     *
     * @param request GetDataTrackJobDegreeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataTrackJobDegreeResponse
     */
    public GetDataTrackJobDegreeResponse getDataTrackJobDegreeWithOptions(GetDataTrackJobDegreeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataTrackJobDegree"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataTrackJobDegreeResponse());
    }

    /**
     * @summary Queries the progress of a data tracking task.
     *
     * @param request GetDataTrackJobDegreeRequest
     * @return GetDataTrackJobDegreeResponse
     */
    public GetDataTrackJobDegreeResponse getDataTrackJobDegree(GetDataTrackJobDegreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataTrackJobDegreeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the metadata of tables involved in a data tracking task.
     *
     * @param request GetDataTrackJobTableMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataTrackJobTableMetaResponse
     */
    public GetDataTrackJobTableMetaResponse getDataTrackJobTableMetaWithOptions(GetDataTrackJobTableMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataTrackJobTableMeta"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataTrackJobTableMetaResponse());
    }

    /**
     * @summary Queries the metadata of tables involved in a data tracking task.
     *
     * @param request GetDataTrackJobTableMetaRequest
     * @return GetDataTrackJobTableMetaResponse
     */
    public GetDataTrackJobTableMetaResponse getDataTrackJobTableMeta(GetDataTrackJobTableMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataTrackJobTableMetaWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a data tracking ticket.
     *
     * @param request GetDataTrackOrderDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDataTrackOrderDetailResponse
     */
    public GetDataTrackOrderDetailResponse getDataTrackOrderDetailWithOptions(GetDataTrackOrderDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataTrackOrderDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataTrackOrderDetailResponse());
    }

    /**
     * @summary Queries the details of a data tracking ticket.
     *
     * @param request GetDataTrackOrderDetailRequest
     * @return GetDataTrackOrderDetailResponse
     */
    public GetDataTrackOrderDetailResponse getDataTrackOrderDetail(GetDataTrackOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDataTrackOrderDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries details of a specific database.
     *
     * @param request GetDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatabaseResponse
     */
    public GetDatabaseResponse getDatabaseWithOptions(GetDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries details of a specific database.
     *
     * @param request GetDatabaseRequest
     * @return GetDatabaseResponse
     */
    public GetDatabaseResponse getDatabase(GetDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDatabaseWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a database export ticket.
     *
     * @param request GetDatabaseExportOrderDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatabaseExportOrderDetailResponse
     */
    public GetDatabaseExportOrderDetailResponse getDatabaseExportOrderDetailWithOptions(GetDatabaseExportOrderDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            body.put("OrderId", request.orderId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatabaseExportOrderDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatabaseExportOrderDetailResponse());
    }

    /**
     * @summary Queries the details of a database export ticket.
     *
     * @param request GetDatabaseExportOrderDetailRequest
     * @return GetDatabaseExportOrderDetailResponse
     */
    public GetDatabaseExportOrderDetailResponse getDatabaseExportOrderDetail(GetDatabaseExportOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDatabaseExportOrderDetailWithOptions(request, runtime);
    }

    /**
     * @summary 获取数据库导出下载地址
     *
     * @param request GetDbExportDownloadURLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDbExportDownloadURLResponse
     */
    public GetDbExportDownloadURLResponse getDbExportDownloadURLWithOptions(GetDbExportDownloadURLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDbExportDownloadURL"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDbExportDownloadURLResponse());
    }

    /**
     * @summary 获取数据库导出下载地址
     *
     * @param request GetDbExportDownloadURLRequest
     * @return GetDbExportDownloadURLResponse
     */
    public GetDbExportDownloadURLResponse getDbExportDownloadURL(GetDbExportDownloadURLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDbExportDownloadURLWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a database instance.
     *
     * @param request GetInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstanceWithOptions(GetInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of a database instance.
     *
     * @param request GetInstanceRequest
     * @return GetInstanceResponse
     */
    public GetInstanceResponse getInstance(GetInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the minimum scheduling cycle of a task flow when a service level agreement (SLA) timeout rule is configured for the task flow.
     *
     * @description The scheduling cycle of a task flow must be greater than the minimum scheduling cycle configured in the SLA rule for the task flow.
     *
     * @param request GetIntervalLimitOfSLARequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetIntervalLimitOfSLAResponse
     */
    public GetIntervalLimitOfSLAResponse getIntervalLimitOfSLAWithOptions(GetIntervalLimitOfSLARequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIntervalLimitOfSLA"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIntervalLimitOfSLAResponse());
    }

    /**
     * @summary Queries the minimum scheduling cycle of a task flow when a service level agreement (SLA) timeout rule is configured for the task flow.
     *
     * @description The scheduling cycle of a task flow must be greater than the minimum scheduling cycle configured in the SLA rule for the task flow.
     *
     * @param request GetIntervalLimitOfSLARequest
     * @return GetIntervalLimitOfSLAResponse
     */
    public GetIntervalLimitOfSLAResponse getIntervalLimitOfSLA(GetIntervalLimitOfSLARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getIntervalLimitOfSLAWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a workspace based on the workspace name in Data Management (DMS).
     *
     * @description You are a DMS administrator or a database administrator (DBA).
     *
     * @param request GetLhSpaceByNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLhSpaceByNameResponse
     */
    public GetLhSpaceByNameResponse getLhSpaceByNameWithOptions(GetLhSpaceByNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.spaceName)) {
            query.put("SpaceName", request.spaceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the information about a workspace based on the workspace name in Data Management (DMS).
     *
     * @description You are a DMS administrator or a database administrator (DBA).
     *
     * @param request GetLhSpaceByNameRequest
     * @return GetLhSpaceByNameResponse
     */
    public GetLhSpaceByNameResponse getLhSpaceByName(GetLhSpaceByNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLhSpaceByNameWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a logical database.
     *
     * @param request GetLogicDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLogicDatabaseResponse
     */
    public GetLogicDatabaseResponse getLogicDatabaseWithOptions(GetLogicDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of a logical database.
     *
     * @param request GetLogicDatabaseRequest
     * @return GetLogicDatabaseResponse
     */
    public GetLogicDatabaseResponse getLogicDatabase(GetLogicDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLogicDatabaseWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of columns in a table.
     *
     * @description You can call this operation only for database instances whose control mode is Security Collaboration.
     *
     * @param request GetMetaTableColumnRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaTableColumnResponse
     */
    public GetMetaTableColumnResponse getMetaTableColumnWithOptions(GetMetaTableColumnRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of columns in a table.
     *
     * @description You can call this operation only for database instances whose control mode is Security Collaboration.
     *
     * @param request GetMetaTableColumnRequest
     * @return GetMetaTableColumnResponse
     */
    public GetMetaTableColumnResponse getMetaTableColumn(GetMetaTableColumnRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableColumnWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of columns and indexes in a table.
     *
     * @description You can call this operation only for database instances whose control mode is Security Collaboration.
     *
     * @param request GetMetaTableDetailInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetMetaTableDetailInfoResponse
     */
    public GetMetaTableDetailInfoResponse getMetaTableDetailInfoWithOptions(GetMetaTableDetailInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of columns and indexes in a table.
     *
     * @description You can call this operation only for database instances whose control mode is Security Collaboration.
     *
     * @param request GetMetaTableDetailInfoRequest
     * @return GetMetaTableDetailInfoResponse
     */
    public GetMetaTableDetailInfoResponse getMetaTableDetailInfo(GetMetaTableDetailInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getMetaTableDetailInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details and progress of an OnlineDDL task.
     *
     * @param request GetOnlineDDLProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOnlineDDLProgressResponse
     */
    public GetOnlineDDLProgressResponse getOnlineDDLProgressWithOptions(GetOnlineDDLProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobDetailId)) {
            query.put("JobDetailId", request.jobDetailId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOnlineDDLProgress"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOnlineDDLProgressResponse());
    }

    /**
     * @summary Queries the details and progress of an OnlineDDL task.
     *
     * @param request GetOnlineDDLProgressRequest
     * @return GetOnlineDDLProgressResponse
     */
    public GetOnlineDDLProgressResponse getOnlineDDLProgress(GetOnlineDDLProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOnlineDDLProgressWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of operation logs that are generated in a specified period of time.
     *
     * @description Prerequisites: You are an administrator of Data Management (DMS) or a security administrator. You can call the [ListUsers](https://help.aliyun.com/document_detail/141938.html) or [GetUser](https://help.aliyun.com/document_detail/147098.html) operation to obtain your user role from the RoleIdList parameter that is returned.
     *
     * @param request GetOpLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOpLogResponse
     */
    public GetOpLogResponse getOpLogWithOptions(GetOpLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.userNick)) {
            query.put("UserNick", request.userNick);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of operation logs that are generated in a specified period of time.
     *
     * @description Prerequisites: You are an administrator of Data Management (DMS) or a security administrator. You can call the [ListUsers](https://help.aliyun.com/document_detail/141938.html) or [GetUser](https://help.aliyun.com/document_detail/147098.html) operation to obtain your user role from the RoleIdList parameter that is returned.
     *
     * @param request GetOpLogRequest
     * @return GetOpLogResponse
     */
    public GetOpLogResponse getOpLog(GetOpLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOpLogWithOptions(request, runtime);
    }

    /**
     * @summary Queries the download URL of the attachment of a ticket.
     *
     * @param request GetOrderAttachmentFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrderAttachmentFileResponse
     */
    public GetOrderAttachmentFileResponse getOrderAttachmentFileWithOptions(GetOrderAttachmentFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetOrderAttachmentFile"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetOrderAttachmentFileResponse());
    }

    /**
     * @summary Queries the download URL of the attachment of a ticket.
     *
     * @param request GetOrderAttachmentFileRequest
     * @return GetOrderAttachmentFileResponse
     */
    public GetOrderAttachmentFileResponse getOrderAttachmentFile(GetOrderAttachmentFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOrderAttachmentFileWithOptions(request, runtime);
    }

    /**
     * @summary Queries the basic information about a ticket.
     *
     * @param request GetOrderBaseInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOrderBaseInfoResponse
     */
    public GetOrderBaseInfoResponse getOrderBaseInfoWithOptions(GetOrderBaseInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the basic information about a ticket.
     *
     * @param request GetOrderBaseInfoRequest
     * @return GetOrderBaseInfoResponse
     */
    public GetOrderBaseInfoResponse getOrderBaseInfo(GetOrderBaseInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOrderBaseInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of the Database-OWNER, Table-OWNER, and Instance-OWNER tickets.
     *
     * @param request GetOwnerApplyOrderDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetOwnerApplyOrderDetailResponse
     */
    public GetOwnerApplyOrderDetailResponse getOwnerApplyOrderDetailWithOptions(GetOwnerApplyOrderDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of the Database-OWNER, Table-OWNER, and Instance-OWNER tickets.
     *
     * @param request GetOwnerApplyOrderDetailRequest
     * @return GetOwnerApplyOrderDetailResponse
     */
    public GetOwnerApplyOrderDetailResponse getOwnerApplyOrderDetail(GetOwnerApplyOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getOwnerApplyOrderDetailWithOptions(request, runtime);
    }

    /**
     * @summary 获取数据归档工单任务实例
     *
     * @param request GetPagedInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPagedInstanceResponse
     */
    public GetPagedInstanceResponse getPagedInstanceWithOptions(GetPagedInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPagedInstance"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPagedInstanceResponse());
    }

    /**
     * @summary 获取数据归档工单任务实例
     *
     * @param request GetPagedInstanceRequest
     * @return GetPagedInstanceResponse
     */
    public GetPagedInstanceResponse getPagedInstance(GetPagedInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPagedInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a ticket that applies for permissions.
     *
     * @description You can call this operation to query the information about tickets that apply for permissions on databases, tables, and sensitive columns.
     *
     * @param request GetPermApplyOrderDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPermApplyOrderDetailResponse
     */
    public GetPermApplyOrderDetailResponse getPermApplyOrderDetailWithOptions(GetPermApplyOrderDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of a ticket that applies for permissions.
     *
     * @description You can call this operation to query the information about tickets that apply for permissions on databases, tables, and sensitive columns.
     *
     * @param request GetPermApplyOrderDetailRequest
     * @return GetPermApplyOrderDetailResponse
     */
    public GetPermApplyOrderDetailResponse getPermApplyOrderDetail(GetPermApplyOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPermApplyOrderDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a physical database.
     *
     * @param request GetPhysicalDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPhysicalDatabaseResponse
     */
    public GetPhysicalDatabaseResponse getPhysicalDatabaseWithOptions(GetPhysicalDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of a physical database.
     *
     * @param request GetPhysicalDatabaseRequest
     * @return GetPhysicalDatabaseResponse
     */
    public GetPhysicalDatabaseResponse getPhysicalDatabase(GetPhysicalDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getPhysicalDatabaseWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a secure access proxy.
     *
     * @param request GetProxyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProxyResponse
     */
    public GetProxyResponse getProxyWithOptions(GetProxyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.proxyId)) {
            query.put("ProxyId", request.proxyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of a secure access proxy.
     *
     * @param request GetProxyRequest
     * @return GetProxyResponse
     */
    public GetProxyResponse getProxy(GetProxyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProxyWithOptions(request, runtime);
    }

    /**
     * @summary Queries the authorization information about the secure access proxy feature.
     *
     * @param request GetProxyAccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetProxyAccessResponse
     */
    public GetProxyAccessResponse getProxyAccessWithOptions(GetProxyAccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.proxyAccessId)) {
            query.put("ProxyAccessId", request.proxyAccessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetProxyAccess"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetProxyAccessResponse());
    }

    /**
     * @summary Queries the authorization information about the secure access proxy feature.
     *
     * @param request GetProxyAccessRequest
     * @return GetProxyAccessResponse
     */
    public GetProxyAccessResponse getProxyAccess(GetProxyAccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getProxyAccessWithOptions(request, runtime);
    }

    /**
     * @summary Queries the maximum number of custom service-level agreement (SLA) rules for task orchestration.
     *
     * @param request GetRuleNumLimitOfSLARequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRuleNumLimitOfSLAResponse
     */
    public GetRuleNumLimitOfSLAResponse getRuleNumLimitOfSLAWithOptions(GetRuleNumLimitOfSLARequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRuleNumLimitOfSLA"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRuleNumLimitOfSLAResponse());
    }

    /**
     * @summary Queries the maximum number of custom service-level agreement (SLA) rules for task orchestration.
     *
     * @param request GetRuleNumLimitOfSLARequest
     * @return GetRuleNumLimitOfSLAResponse
     */
    public GetRuleNumLimitOfSLAResponse getRuleNumLimitOfSLA(GetRuleNumLimitOfSLARequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getRuleNumLimitOfSLAWithOptions(request, runtime);
    }

    /**
     * @summary Queries the result of an SQL review.
     *
     * @description For more information about the SQL review feature, see [SQL review](https://help.aliyun.com/document_detail/60374.html).
     *
     * @param request GetSQLReviewCheckResultStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSQLReviewCheckResultStatusResponse
     */
    public GetSQLReviewCheckResultStatusResponse getSQLReviewCheckResultStatusWithOptions(GetSQLReviewCheckResultStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the result of an SQL review.
     *
     * @description For more information about the SQL review feature, see [SQL review](https://help.aliyun.com/document_detail/60374.html).
     *
     * @param request GetSQLReviewCheckResultStatusRequest
     * @return GetSQLReviewCheckResultStatusResponse
     */
    public GetSQLReviewCheckResultStatusResponse getSQLReviewCheckResultStatus(GetSQLReviewCheckResultStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSQLReviewCheckResultStatusWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of optimization suggestions. The operation applies only to the tickets for the data changes and SQL review.
     *
     * @description For more information about the SQL review feature, see [SQL review](https://help.aliyun.com/document_detail/60374.html).
     *
     * @param request GetSQLReviewOptimizeDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSQLReviewOptimizeDetailResponse
     */
    public GetSQLReviewOptimizeDetailResponse getSQLReviewOptimizeDetailWithOptions(GetSQLReviewOptimizeDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.SQLReviewQueryKey)) {
            query.put("SQLReviewQueryKey", request.SQLReviewQueryKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of optimization suggestions. The operation applies only to the tickets for the data changes and SQL review.
     *
     * @description For more information about the SQL review feature, see [SQL review](https://help.aliyun.com/document_detail/60374.html).
     *
     * @param request GetSQLReviewOptimizeDetailRequest
     * @return GetSQLReviewOptimizeDetailResponse
     */
    public GetSQLReviewOptimizeDetailResponse getSQLReviewOptimizeDetail(GetSQLReviewOptimizeDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSQLReviewOptimizeDetailWithOptions(request, runtime);
    }

    /**
     * @summary 获取安全规则
     *
     * @param request GetStandardGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStandardGroupResponse
     */
    public GetStandardGroupResponse getStandardGroupWithOptions(GetStandardGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStandardGroup"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStandardGroupResponse());
    }

    /**
     * @summary 获取安全规则
     *
     * @param request GetStandardGroupRequest
     * @return GetStandardGroupResponse
     */
    public GetStandardGroupResponse getStandardGroup(GetStandardGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStandardGroupWithOptions(request, runtime);
    }

    /**
     * @summary Queries the SQL statements that are involved in a schema synchronization ticket.
     *
     * @param request GetStructSyncExecSqlDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStructSyncExecSqlDetailResponse
     */
    public GetStructSyncExecSqlDetailResponse getStructSyncExecSqlDetailWithOptions(GetStructSyncExecSqlDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the SQL statements that are involved in a schema synchronization ticket.
     *
     * @param request GetStructSyncExecSqlDetailRequest
     * @return GetStructSyncExecSqlDetailResponse
     */
    public GetStructSyncExecSqlDetailResponse getStructSyncExecSqlDetail(GetStructSyncExecSqlDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStructSyncExecSqlDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the analysis result of a schema synchronization task.
     *
     * @param request GetStructSyncJobAnalyzeResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStructSyncJobAnalyzeResultResponse
     */
    public GetStructSyncJobAnalyzeResultResponse getStructSyncJobAnalyzeResultWithOptions(GetStructSyncJobAnalyzeResultRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the analysis result of a schema synchronization task.
     *
     * @param request GetStructSyncJobAnalyzeResultRequest
     * @return GetStructSyncJobAnalyzeResultResponse
     */
    public GetStructSyncJobAnalyzeResultResponse getStructSyncJobAnalyzeResult(GetStructSyncJobAnalyzeResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStructSyncJobAnalyzeResultWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information of a schema synchronization task.
     *
     * @param request GetStructSyncJobDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStructSyncJobDetailResponse
     */
    public GetStructSyncJobDetailResponse getStructSyncJobDetailWithOptions(GetStructSyncJobDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the information of a schema synchronization task.
     *
     * @param request GetStructSyncJobDetailRequest
     * @return GetStructSyncJobDetailResponse
     */
    public GetStructSyncJobDetailResponse getStructSyncJobDetail(GetStructSyncJobDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStructSyncJobDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a schema synchronization ticket.
     *
     * @param request GetStructSyncOrderDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetStructSyncOrderDetailResponse
     */
    public GetStructSyncOrderDetailResponse getStructSyncOrderDetailWithOptions(GetStructSyncOrderDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of a schema synchronization ticket.
     *
     * @param request GetStructSyncOrderDetailRequest
     * @return GetStructSyncOrderDetailResponse
     */
    public GetStructSyncOrderDetailResponse getStructSyncOrderDetail(GetStructSyncOrderDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getStructSyncOrderDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the topology of a data table.
     *
     * @param request GetTableDBTopologyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableDBTopologyResponse
     */
    public GetTableDBTopologyResponse getTableDBTopologyWithOptions(GetTableDBTopologyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the topology of a data table.
     *
     * @param request GetTableDBTopologyRequest
     * @return GetTableDBTopologyResponse
     */
    public GetTableDBTopologyResponse getTableDBTopology(GetTableDBTopologyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableDBTopologyWithOptions(request, runtime);
    }

    /**
     * @summary 获取结构设计项目的流程信息
     *
     * @param request GetTableDesignProjectFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableDesignProjectFlowResponse
     */
    public GetTableDesignProjectFlowResponse getTableDesignProjectFlowWithOptions(GetTableDesignProjectFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableDesignProjectFlow"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableDesignProjectFlowResponse());
    }

    /**
     * @summary 获取结构设计项目的流程信息
     *
     * @param request GetTableDesignProjectFlowRequest
     * @return GetTableDesignProjectFlowResponse
     */
    public GetTableDesignProjectFlowResponse getTableDesignProjectFlow(GetTableDesignProjectFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableDesignProjectFlowWithOptions(request, runtime);
    }

    /**
     * @summary 获取结构设计项目的详细信息
     *
     * @param request GetTableDesignProjectInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableDesignProjectInfoResponse
     */
    public GetTableDesignProjectInfoResponse getTableDesignProjectInfoWithOptions(GetTableDesignProjectInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableDesignProjectInfo"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableDesignProjectInfoResponse());
    }

    /**
     * @summary 获取结构设计项目的详细信息
     *
     * @param request GetTableDesignProjectInfoRequest
     * @return GetTableDesignProjectInfoResponse
     */
    public GetTableDesignProjectInfoResponse getTableDesignProjectInfo(GetTableDesignProjectInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableDesignProjectInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries the topology of a table.
     *
     * @param request GetTableTopologyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableTopologyResponse
     */
    public GetTableTopologyResponse getTableTopologyWithOptions(GetTableTopologyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableGuid)) {
            query.put("TableGuid", request.tableGuid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the topology of a table.
     *
     * @param request GetTableTopologyRequest
     * @return GetTableTopologyResponse
     */
    public GetTableTopologyResponse getTableTopology(GetTableTopologyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableTopologyWithOptions(request, runtime);
    }

    /**
     * @summary Queries the configurations, including time variables, of a specified task node based on the task node ID.
     *
     * @param request GetTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskResponse
     */
    public GetTaskResponse getTaskWithOptions(GetTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTask"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskResponse());
    }

    /**
     * @summary Queries the configurations, including time variables, of a specified task node based on the task node ID.
     *
     * @param request GetTaskRequest
     * @return GetTaskResponse
     */
    public GetTaskResponse getTask(GetTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskWithOptions(request, runtime);
    }

    /**
     * @summary Queries the Directed Acyclic Graph (DAG) of a task flow.
     *
     * @param request GetTaskFlowGraphRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskFlowGraphResponse
     */
    public GetTaskFlowGraphResponse getTaskFlowGraphWithOptions(GetTaskFlowGraphRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskFlowGraph"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskFlowGraphResponse());
    }

    /**
     * @summary Queries the Directed Acyclic Graph (DAG) of a task flow.
     *
     * @param request GetTaskFlowGraphRequest
     * @return GetTaskFlowGraphResponse
     */
    public GetTaskFlowGraphResponse getTaskFlowGraph(GetTaskFlowGraphRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskFlowGraphWithOptions(request, runtime);
    }

    /**
     * @summary Queries the notification settings for task flows.
     *
     * @param request GetTaskFlowNotificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskFlowNotificationResponse
     */
    public GetTaskFlowNotificationResponse getTaskFlowNotificationWithOptions(GetTaskFlowNotificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTaskFlowNotification"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTaskFlowNotificationResponse());
    }

    /**
     * @summary Queries the notification settings for task flows.
     *
     * @param request GetTaskFlowNotificationRequest
     * @return GetTaskFlowNotificationResponse
     */
    public GetTaskFlowNotificationResponse getTaskFlowNotification(GetTaskFlowNotificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskFlowNotificationWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about the nodes in an execution record of a task flow.
     *
     * @param request GetTaskInstanceRelationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTaskInstanceRelationResponse
     */
    public GetTaskInstanceRelationResponse getTaskInstanceRelationWithOptions(GetTaskInstanceRelationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the information about the nodes in an execution record of a task flow.
     *
     * @param request GetTaskInstanceRelationRequest
     * @return GetTaskInstanceRelationResponse
     */
    public GetTaskInstanceRelationResponse getTaskInstanceRelation(GetTaskInstanceRelationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTaskInstanceRelationWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a user.
     *
     * @param request GetUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserResponse
     */
    public GetUserResponse getUserWithOptions(GetUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the information about a user.
     *
     * @param request GetUserRequest
     * @return GetUserResponse
     */
    public GetUserResponse getUser(GetUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserWithOptions(request, runtime);
    }

    /**
     * @summary Queries details of the active tenant.
     *
     * @param request GetUserActiveTenantRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserActiveTenantResponse
     */
    public GetUserActiveTenantResponse getUserActiveTenantWithOptions(GetUserActiveTenantRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries details of the active tenant.
     *
     * @param request GetUserActiveTenantRequest
     * @return GetUserActiveTenantResponse
     */
    public GetUserActiveTenantResponse getUserActiveTenant(GetUserActiveTenantRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserActiveTenantWithOptions(request, runtime);
    }

    /**
     * @summary Obtains the information of a file upload task.
     *
     * @param request GetUserUploadFileJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUserUploadFileJobResponse
     */
    public GetUserUploadFileJobResponse getUserUploadFileJobWithOptions(GetUserUploadFileJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.jobKey)) {
            query.put("JobKey", request.jobKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Obtains the information of a file upload task.
     *
     * @param request GetUserUploadFileJobRequest
     * @return GetUserUploadFileJobResponse
     */
    public GetUserUploadFileJobResponse getUserUploadFileJob(GetUserUploadFileJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUserUploadFileJobWithOptions(request, runtime);
    }

    /**
     * @summary Grants permissions on resources to users by using a permission template.
     *
     * @description You must be a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see [View system roles](https://help.aliyun.com/document_detail/324212.html).
     *
     * @param request GrantTemplateAuthorityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantTemplateAuthorityResponse
     */
    public GrantTemplateAuthorityResponse grantTemplateAuthorityWithOptions(GrantTemplateAuthorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.comment)) {
            query.put("Comment", request.comment);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expireDate)) {
            query.put("ExpireDate", request.expireDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantTemplateAuthority"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantTemplateAuthorityResponse());
    }

    /**
     * @summary Grants permissions on resources to users by using a permission template.
     *
     * @description You must be a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see [View system roles](https://help.aliyun.com/document_detail/324212.html).
     *
     * @param request GrantTemplateAuthorityRequest
     * @return GrantTemplateAuthorityResponse
     */
    public GrantTemplateAuthorityResponse grantTemplateAuthority(GrantTemplateAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantTemplateAuthorityWithOptions(request, runtime);
    }

    /**
     * @summary Grants permissions on an instance, a database, or a table to a user.
     *
     * @param request GrantUserPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantUserPermissionResponse
     */
    public GrantUserPermissionResponse grantUserPermissionWithOptions(GrantUserPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Grants permissions on an instance, a database, or a table to a user.
     *
     * @param request GrantUserPermissionRequest
     * @return GrantUserPermissionResponse
     */
    public GrantUserPermissionResponse grantUserPermission(GrantUserPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantUserPermissionWithOptions(request, runtime);
    }

    /**
     * @summary You can call this operation to obtain the authorization password of the security protection agent InspectProxyAccessSecret.
     *
     * @param request InspectProxyAccessSecretRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InspectProxyAccessSecretResponse
     */
    public InspectProxyAccessSecretResponse inspectProxyAccessSecretWithOptions(InspectProxyAccessSecretRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.proxyAccessId)) {
            query.put("ProxyAccessId", request.proxyAccessId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary You can call this operation to obtain the authorization password of the security protection agent InspectProxyAccessSecret.
     *
     * @param request InspectProxyAccessSecretRequest
     * @return InspectProxyAccessSecretResponse
     */
    public InspectProxyAccessSecretResponse inspectProxyAccessSecret(InspectProxyAccessSecretRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.inspectProxyAccessSecretWithOptions(request, runtime);
    }

    /**
     * @summary 获取权限模版列表
     *
     * @param request ListAuthorityTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListAuthorityTemplateResponse
     */
    public ListAuthorityTemplateResponse listAuthorityTemplateWithOptions(ListAuthorityTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListAuthorityTemplate"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListAuthorityTemplateResponse());
    }

    /**
     * @summary 获取权限模版列表
     *
     * @param request ListAuthorityTemplateRequest
     * @return ListAuthorityTemplateResponse
     */
    public ListAuthorityTemplateResponse listAuthorityTemplate(ListAuthorityTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listAuthorityTemplateWithOptions(request, runtime);
    }

    /**
     * @summary Queries the classification templates.
     *
     * @param request ListClassificationTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListClassificationTemplatesResponse
     */
    public ListClassificationTemplatesResponse listClassificationTemplatesWithOptions(ListClassificationTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListClassificationTemplates"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListClassificationTemplatesResponse());
    }

    /**
     * @summary Queries the classification templates.
     *
     * @param request ListClassificationTemplatesRequest
     * @return ListClassificationTemplatesResponse
     */
    public ListClassificationTemplatesResponse listClassificationTemplates(ListClassificationTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listClassificationTemplatesWithOptions(request, runtime);
    }

    /**
     * @summary Returns the column information of a table.
     *
     * @description You can call this operation only for database instances whose control mode is Security Collaboration.
     *
     * @param request ListColumnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListColumnsResponse
     */
    public ListColumnsResponse listColumnsWithOptions(ListColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Returns the column information of a table.
     *
     * @description You can call this operation only for database instances whose control mode is Security Collaboration.
     *
     * @param request ListColumnsRequest
     * @return ListColumnsResponse
     */
    public ListColumnsResponse listColumns(ListColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listColumnsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the published versions of a task flow.
     *
     * @param request ListDAGVersionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDAGVersionsResponse
     */
    public ListDAGVersionsResponse listDAGVersionsWithOptions(ListDAGVersionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDAGVersions"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDAGVersionsResponse());
    }

    /**
     * @summary Queries the published versions of a task flow.
     *
     * @param request ListDAGVersionsRequest
     * @return ListDAGVersionsResponse
     */
    public ListDAGVersionsResponse listDAGVersions(ListDAGVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDAGVersionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of SQL tasks.
     *
     * @param request ListDBTaskSQLJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDBTaskSQLJobResponse
     */
    public ListDBTaskSQLJobResponse listDBTaskSQLJobWithOptions(ListDBTaskSQLJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries a list of SQL tasks.
     *
     * @param request ListDBTaskSQLJobRequest
     * @return ListDBTaskSQLJobResponse
     */
    public ListDBTaskSQLJobResponse listDBTaskSQLJob(ListDBTaskSQLJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDBTaskSQLJobWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of an SQL task.
     *
     * @param request ListDBTaskSQLJobDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDBTaskSQLJobDetailResponse
     */
    public ListDBTaskSQLJobDetailResponse listDBTaskSQLJobDetailWithOptions(ListDBTaskSQLJobDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of an SQL task.
     *
     * @param request ListDBTaskSQLJobDetailRequest
     * @return ListDBTaskSQLJobDetailResponse
     */
    public ListDBTaskSQLJobDetailResponse listDBTaskSQLJobDetail(ListDBTaskSQLJobDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDBTaskSQLJobDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the publishing details of a schema design ticket.
     *
     * @param request ListDDLPublishRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDDLPublishRecordsResponse
     */
    public ListDDLPublishRecordsResponse listDDLPublishRecordsWithOptions(ListDDLPublishRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the publishing details of a schema design ticket.
     *
     * @param request ListDDLPublishRecordsRequest
     * @return ListDDLPublishRecordsResponse
     */
    public ListDDLPublishRecordsResponse listDDLPublishRecords(ListDDLPublishRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDDLPublishRecordsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the databases that are involved in the precheck of a data change ticket.
     *
     * @description For more information about the Normal Data Modify feature, see [Change regular data](https://help.aliyun.com/document_detail/58419.html).
     *
     * @param request ListDataCorrectPreCheckDBRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataCorrectPreCheckDBResponse
     */
    public ListDataCorrectPreCheckDBResponse listDataCorrectPreCheckDBWithOptions(ListDataCorrectPreCheckDBRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the databases that are involved in the precheck of a data change ticket.
     *
     * @description For more information about the Normal Data Modify feature, see [Change regular data](https://help.aliyun.com/document_detail/58419.html).
     *
     * @param request ListDataCorrectPreCheckDBRequest
     * @return ListDataCorrectPreCheckDBResponse
     */
    public ListDataCorrectPreCheckDBResponse listDataCorrectPreCheckDB(ListDataCorrectPreCheckDBRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataCorrectPreCheckDBWithOptions(request, runtime);
    }

    /**
     * @summary Queries the precheck information about an SQL statement that is specified in a data change ticket.
     *
     * @description For more information about the Normal Data Modify feature, see [Change regular data](https://help.aliyun.com/document_detail/58419.html).
     *
     * @param request ListDataCorrectPreCheckSQLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataCorrectPreCheckSQLResponse
     */
    public ListDataCorrectPreCheckSQLResponse listDataCorrectPreCheckSQLWithOptions(ListDataCorrectPreCheckSQLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the precheck information about an SQL statement that is specified in a data change ticket.
     *
     * @description For more information about the Normal Data Modify feature, see [Change regular data](https://help.aliyun.com/document_detail/58419.html).
     *
     * @param request ListDataCorrectPreCheckSQLRequest
     * @return ListDataCorrectPreCheckSQLResponse
     */
    public ListDataCorrectPreCheckSQLResponse listDataCorrectPreCheckSQL(ListDataCorrectPreCheckSQLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataCorrectPreCheckSQLWithOptions(request, runtime);
    }

    /**
     * @summary Queries the precheck information of SQL statements used for data import in a ticket.
     *
     * @description You can call this operation only if the data is imported in security mode in your data import ticket.
     *
     * @param request ListDataImportSQLPreCheckDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataImportSQLPreCheckDetailResponse
     */
    public ListDataImportSQLPreCheckDetailResponse listDataImportSQLPreCheckDetailWithOptions(ListDataImportSQLPreCheckDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumer)) {
            query.put("PageNumer", request.pageNumer);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlType)) {
            query.put("SqlType", request.sqlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusCode)) {
            query.put("StatusCode", request.statusCode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataImportSQLPreCheckDetail"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataImportSQLPreCheckDetailResponse());
    }

    /**
     * @summary Queries the precheck information of SQL statements used for data import in a ticket.
     *
     * @description You can call this operation only if the data is imported in security mode in your data import ticket.
     *
     * @param request ListDataImportSQLPreCheckDetailRequest
     * @return ListDataImportSQLPreCheckDetailResponse
     */
    public ListDataImportSQLPreCheckDetailResponse listDataImportSQLPreCheckDetail(ListDataImportSQLPreCheckDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataImportSQLPreCheckDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the types of SQL statements used for data import in a ticket.
     *
     * @description You can call this operation only if the data is imported in security mode in your data import ticket.
     *
     * @param request ListDataImportSQLTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDataImportSQLTypeResponse
     */
    public ListDataImportSQLTypeResponse listDataImportSQLTypeWithOptions(ListDataImportSQLTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataImportSQLType"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataImportSQLTypeResponse());
    }

    /**
     * @summary Queries the types of SQL statements used for data import in a ticket.
     *
     * @description You can call this operation only if the data is imported in security mode in your data import ticket.
     *
     * @param request ListDataImportSQLTypeRequest
     * @return ListDataImportSQLTypeResponse
     */
    public ListDataImportSQLTypeResponse listDataImportSQLType(ListDataImportSQLTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDataImportSQLTypeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the permissions of users on a database.
     *
     * @param request ListDatabaseUserPermssionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabaseUserPermssionsResponse
     */
    public ListDatabaseUserPermssionsResponse listDatabaseUserPermssionsWithOptions(ListDatabaseUserPermssionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the permissions of users on a database.
     *
     * @param request ListDatabaseUserPermssionsRequest
     * @return ListDatabaseUserPermssionsResponse
     */
    public ListDatabaseUserPermssionsResponse listDatabaseUserPermssions(ListDatabaseUserPermssionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatabaseUserPermssionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the databases in a database instance.
     *
     * @param request ListDatabasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabasesWithOptions(ListDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the databases in a database instance.
     *
     * @param request ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDatabasesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the default service level agreement (SLA) timeout rules.
     *
     * @param request ListDefaultSLARulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDefaultSLARulesResponse
     */
    public ListDefaultSLARulesResponse listDefaultSLARulesWithOptions(ListDefaultSLARulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDefaultSLARules"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDefaultSLARulesResponse());
    }

    /**
     * @summary Queries the default service level agreement (SLA) timeout rules.
     *
     * @param request ListDefaultSLARulesRequest
     * @return ListDefaultSLARulesResponse
     */
    public ListDefaultSLARulesResponse listDefaultSLARules(ListDefaultSLARulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDefaultSLARulesWithOptions(request, runtime);
    }

    /**
     * @summary Queries masking rules.
     *
     * @param request ListDesensitizationRuleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDesensitizationRuleResponse
     */
    public ListDesensitizationRuleResponse listDesensitizationRuleWithOptions(ListDesensitizationRuleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.funcType)) {
            query.put("FuncType", request.funcType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleName)) {
            query.put("RuleName", request.ruleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleType)) {
            query.put("RuleType", request.ruleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDesensitizationRule"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDesensitizationRuleResponse());
    }

    /**
     * @summary Queries masking rules.
     *
     * @param request ListDesensitizationRuleRequest
     * @return ListDesensitizationRuleResponse
     */
    public ListDesensitizationRuleResponse listDesensitizationRule(ListDesensitizationRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDesensitizationRuleWithOptions(request, runtime);
    }

    /**
     * @summary Queries valid orders.
     *
     * @param request ListEffectiveOrdersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListEffectiveOrdersResponse
     */
    public ListEffectiveOrdersResponse listEffectiveOrdersWithOptions(ListEffectiveOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListEffectiveOrders"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListEffectiveOrdersResponse());
    }

    /**
     * @summary Queries valid orders.
     *
     * @param request ListEffectiveOrdersRequest
     * @return ListEffectiveOrdersResponse
     */
    public ListEffectiveOrdersResponse listEffectiveOrders(ListEffectiveOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listEffectiveOrdersWithOptions(request, runtime);
    }

    /**
     * @summary Queries the indexes of a table.
     *
     * @param request ListIndexesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListIndexesResponse
     */
    public ListIndexesResponse listIndexesWithOptions(ListIndexesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the indexes of a table.
     *
     * @param request ListIndexesRequest
     * @return ListIndexesResponse
     */
    public ListIndexesResponse listIndexes(ListIndexesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listIndexesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the logon records of an instance.
     *
     * @param request ListInstanceLoginAuditLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceLoginAuditLogResponse
     */
    public ListInstanceLoginAuditLogResponse listInstanceLoginAuditLogWithOptions(ListInstanceLoginAuditLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the logon records of an instance.
     *
     * @param request ListInstanceLoginAuditLogRequest
     * @return ListInstanceLoginAuditLogResponse
     */
    public ListInstanceLoginAuditLogResponse listInstanceLoginAuditLog(ListInstanceLoginAuditLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceLoginAuditLogWithOptions(request, runtime);
    }

    /**
     * @summary Queries the permissions of a user on a specific instance.
     *
     * @param request ListInstanceUserPermissionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceUserPermissionsResponse
     */
    public ListInstanceUserPermissionsResponse listInstanceUserPermissionsWithOptions(ListInstanceUserPermissionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the permissions of a user on a specific instance.
     *
     * @param request ListInstanceUserPermissionsRequest
     * @return ListInstanceUserPermissionsResponse
     */
    public ListInstanceUserPermissionsResponse listInstanceUserPermissions(ListInstanceUserPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceUserPermissionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about database instances.
     *
     * @param request ListInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstancesWithOptions(ListInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the information about database instances.
     *
     * @param request ListInstancesRequest
     * @return ListInstancesResponse
     */
    public ListInstancesResponse listInstances(ListInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the task flows corresponding to a specific business scenario in a workspace in Data Management (DMS).
     *
     * @description *   Before you call this operation, make sure that you have the access permissions on the workspace. If you do not have the access permissions on the workspace, you can contact a DMS administrator, database administrator (DBA), or workspace administrator to add you as a member of the workspace. The [AddLhMembers](https://help.aliyun.com/document_detail/424759.html) operation can be called to add a workspace member.
     * *   If you are a DMS administrator or a workspace administrator, you can query the business scenarios and task flows related to a user in a workspace based on the user ID.
     *
     * @param request ListLhTaskFlowAndScenarioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLhTaskFlowAndScenarioResponse
     */
    public ListLhTaskFlowAndScenarioResponse listLhTaskFlowAndScenarioWithOptions(ListLhTaskFlowAndScenarioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the task flows corresponding to a specific business scenario in a workspace in Data Management (DMS).
     *
     * @description *   Before you call this operation, make sure that you have the access permissions on the workspace. If you do not have the access permissions on the workspace, you can contact a DMS administrator, database administrator (DBA), or workspace administrator to add you as a member of the workspace. The [AddLhMembers](https://help.aliyun.com/document_detail/424759.html) operation can be called to add a workspace member.
     * *   If you are a DMS administrator or a workspace administrator, you can query the business scenarios and task flows related to a user in a workspace based on the user ID.
     *
     * @param request ListLhTaskFlowAndScenarioRequest
     * @return ListLhTaskFlowAndScenarioResponse
     */
    public ListLhTaskFlowAndScenarioResponse listLhTaskFlowAndScenario(ListLhTaskFlowAndScenarioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLhTaskFlowAndScenarioWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of logical databases.
     *
     * @param request ListLogicDatabasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogicDatabasesResponse
     */
    public ListLogicDatabasesResponse listLogicDatabasesWithOptions(ListLogicDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of logical databases.
     *
     * @param request ListLogicDatabasesRequest
     * @return ListLogicDatabasesResponse
     */
    public ListLogicDatabasesResponse listLogicDatabases(ListLogicDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLogicDatabasesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the routing algorithms of a logical table.
     *
     * @param request ListLogicTableRouteConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogicTableRouteConfigResponse
     */
    public ListLogicTableRouteConfigResponse listLogicTableRouteConfigWithOptions(ListLogicTableRouteConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tableId)) {
            query.put("TableId", request.tableId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the routing algorithms of a logical table.
     *
     * @param request ListLogicTableRouteConfigRequest
     * @return ListLogicTableRouteConfigResponse
     */
    public ListLogicTableRouteConfigResponse listLogicTableRouteConfig(ListLogicTableRouteConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLogicTableRouteConfigWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of the logical tables in a logical database.
     *
     * @param request ListLogicTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLogicTablesResponse
     */
    public ListLogicTablesResponse listLogicTablesWithOptions(ListLogicTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of the logical tables in a logical database.
     *
     * @param request ListLogicTablesRequest
     * @return ListLogicTablesResponse
     */
    public ListLogicTablesResponse listLogicTables(ListLogicTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLogicTablesWithOptions(request, runtime);
    }

    /**
     * @summary Queries tickets in Data Management (DMS).
     *
     * @param request ListOrdersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListOrdersResponse
     */
    public ListOrdersResponse listOrdersWithOptions(ListOrdersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries tickets in Data Management (DMS).
     *
     * @param request ListOrdersRequest
     * @return ListOrdersResponse
     */
    public ListOrdersResponse listOrders(ListOrdersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listOrdersWithOptions(request, runtime);
    }

    /**
     * @summary Queries the proxies that are generated by the secure access proxy feature.
     *
     * @param request ListProxiesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProxiesResponse
     */
    public ListProxiesResponse listProxiesWithOptions(ListProxiesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the proxies that are generated by the secure access proxy feature.
     *
     * @param request ListProxiesRequest
     * @return ListProxiesResponse
     */
    public ListProxiesResponse listProxies(ListProxiesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProxiesWithOptions(request, runtime);
    }

    /**
     * @summary Queries information about users that are authorized to access a database instance by using the secure access proxy feature.
     *
     * @param request ListProxyAccessesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProxyAccessesResponse
     */
    public ListProxyAccessesResponse listProxyAccessesWithOptions(ListProxyAccessesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.proxyId)) {
            query.put("ProxyId", request.proxyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries information about users that are authorized to access a database instance by using the secure access proxy feature.
     *
     * @param request ListProxyAccessesRequest
     * @return ListProxyAccessesResponse
     */
    public ListProxyAccessesResponse listProxyAccesses(ListProxyAccessesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProxyAccessesWithOptions(request, runtime);
    }

    /**
     * @summary 操作审计-数据安全代理SQL执行列表
     *
     * @param request ListProxySQLExecAuditLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListProxySQLExecAuditLogResponse
     */
    public ListProxySQLExecAuditLogResponse listProxySQLExecAuditLogWithOptions(ListProxySQLExecAuditLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 操作审计-数据安全代理SQL执行列表
     *
     * @param request ListProxySQLExecAuditLogRequest
     * @return ListProxySQLExecAuditLogResponse
     */
    public ListProxySQLExecAuditLogResponse listProxySQLExecAuditLog(ListProxySQLExecAuditLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listProxySQLExecAuditLogWithOptions(request, runtime);
    }

    /**
     * @summary Queries the custom service level agreement (SLA) rules.
     *
     * @param request ListSLARulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSLARulesResponse
     */
    public ListSLARulesResponse listSLARulesWithOptions(ListSLARulesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSLARules"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSLARulesResponse());
    }

    /**
     * @summary Queries the custom service level agreement (SLA) rules.
     *
     * @param request ListSLARulesRequest
     * @return ListSLARulesResponse
     */
    public ListSLARulesResponse listSLARules(ListSLARulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSLARulesWithOptions(request, runtime);
    }

    /**
     * @summary Queries SQL statements that were written on the SQLConsole tab.
     *
     * @param request ListSQLExecAuditLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSQLExecAuditLogResponse
     */
    public ListSQLExecAuditLogResponse listSQLExecAuditLogWithOptions(ListSQLExecAuditLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries SQL statements that were written on the SQLConsole tab.
     *
     * @param request ListSQLExecAuditLogRequest
     * @return ListSQLExecAuditLogResponse
     */
    public ListSQLExecAuditLogResponse listSQLExecAuditLog(ListSQLExecAuditLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSQLExecAuditLogWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of the SQL statements that are involved in an SQL review ticket.
     *
     * @description For more information about the SQL review feature, see [SQL review](https://help.aliyun.com/document_detail/60374.html).
     *
     * @param tmpReq ListSQLReviewOriginSQLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSQLReviewOriginSQLResponse
     */
    public ListSQLReviewOriginSQLResponse listSQLReviewOriginSQLWithOptions(ListSQLReviewOriginSQLRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListSQLReviewOriginSQLShrinkRequest request = new ListSQLReviewOriginSQLShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.orderActionDetail)) {
            request.orderActionDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.orderActionDetail, "OrderActionDetail", "json");
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of the SQL statements that are involved in an SQL review ticket.
     *
     * @description For more information about the SQL review feature, see [SQL review](https://help.aliyun.com/document_detail/60374.html).
     *
     * @param request ListSQLReviewOriginSQLRequest
     * @return ListSQLReviewOriginSQLResponse
     */
    public ListSQLReviewOriginSQLResponse listSQLReviewOriginSQL(ListSQLReviewOriginSQLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSQLReviewOriginSQLWithOptions(request, runtime);
    }

    /**
     * @summary Queries business scenarios.
     *
     * @param request ListScenariosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListScenariosResponse
     */
    public ListScenariosResponse listScenariosWithOptions(ListScenariosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListScenarios"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListScenariosResponse());
    }

    /**
     * @summary Queries business scenarios.
     *
     * @param request ListScenariosRequest
     * @return ListScenariosResponse
     */
    public ListScenariosResponse listScenarios(ListScenariosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listScenariosWithOptions(request, runtime);
    }

    /**
     * @summary 获取敏感字段信息
     *
     * @param request ListSensitiveColumnInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSensitiveColumnInfoResponse
     */
    public ListSensitiveColumnInfoResponse listSensitiveColumnInfoWithOptions(ListSensitiveColumnInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnName)) {
            query.put("ColumnName", request.columnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSensitiveColumnInfo"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSensitiveColumnInfoResponse());
    }

    /**
     * @summary 获取敏感字段信息
     *
     * @param request ListSensitiveColumnInfoRequest
     * @return ListSensitiveColumnInfoResponse
     */
    public ListSensitiveColumnInfoResponse listSensitiveColumnInfo(ListSensitiveColumnInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSensitiveColumnInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries sensitive fields in a table of a database.
     *
     * @param request ListSensitiveColumnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSensitiveColumnsResponse
     */
    public ListSensitiveColumnsResponse listSensitiveColumnsWithOptions(ListSensitiveColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries sensitive fields in a table of a database.
     *
     * @param request ListSensitiveColumnsRequest
     * @return ListSensitiveColumnsResponse
     */
    public ListSensitiveColumnsResponse listSensitiveColumns(ListSensitiveColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSensitiveColumnsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of a sensitive field.
     *
     * @param request ListSensitiveColumnsDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSensitiveColumnsDetailResponse
     */
    public ListSensitiveColumnsDetailResponse listSensitiveColumnsDetailWithOptions(ListSensitiveColumnsDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of a sensitive field.
     *
     * @param request ListSensitiveColumnsDetailRequest
     * @return ListSensitiveColumnsDetailResponse
     */
    public ListSensitiveColumnsDetailResponse listSensitiveColumnsDetail(ListSensitiveColumnsDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSensitiveColumnsDetailWithOptions(request, runtime);
    }

    /**
     * @summary Queries the audit logs for sensitive information.
     *
     * @param request ListSensitiveDataAuditLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSensitiveDataAuditLogResponse
     */
    public ListSensitiveDataAuditLogResponse listSensitiveDataAuditLogWithOptions(ListSensitiveDataAuditLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnName)) {
            query.put("ColumnName", request.columnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.moduleName)) {
            query.put("ModuleName", request.moduleName);
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

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSensitiveDataAuditLog"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSensitiveDataAuditLogResponse());
    }

    /**
     * @summary Queries the audit logs for sensitive information.
     *
     * @param request ListSensitiveDataAuditLogRequest
     * @return ListSensitiveDataAuditLogResponse
     */
    public ListSensitiveDataAuditLogResponse listSensitiveDataAuditLog(ListSensitiveDataAuditLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSensitiveDataAuditLogWithOptions(request, runtime);
    }

    /**
     * @summary Queries the sensitivity levels of a classification template.
     *
     * @param request ListSensitivityLevelRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSensitivityLevelResponse
     */
    public ListSensitivityLevelResponse listSensitivityLevelWithOptions(ListSensitivityLevelRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSensitivityLevel"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSensitivityLevelResponse());
    }

    /**
     * @summary Queries the sensitivity levels of a classification template.
     *
     * @param request ListSensitivityLevelRequest
     * @return ListSensitivityLevelResponse
     */
    public ListSensitivityLevelResponse listSensitivityLevel(ListSensitivityLevelRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSensitivityLevelWithOptions(request, runtime);
    }

    /**
     * @summary Queries security rule sets.
     *
     * @param request ListStandardGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStandardGroupsResponse
     */
    public ListStandardGroupsResponse listStandardGroupsWithOptions(ListStandardGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries security rule sets.
     *
     * @param request ListStandardGroupsRequest
     * @return ListStandardGroupsResponse
     */
    public ListStandardGroupsResponse listStandardGroups(ListStandardGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStandardGroupsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the tables in a database.
     *
     * @description You can call this operation only for database instances whose control mode is Security Collaboration.
     *
     * @param request ListTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTablesResponse
     */
    public ListTablesResponse listTablesWithOptions(ListTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the tables in a database.
     *
     * @description You can call this operation only for database instances whose control mode is Security Collaboration.
     *
     * @param request ListTablesRequest
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(ListTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTablesWithOptions(request, runtime);
    }

    /**
     * @summary 任务编排获取任务流列表
     *
     * @param request ListTaskFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskFlowResponse
     */
    public ListTaskFlowResponse listTaskFlowWithOptions(ListTaskFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 任务编排获取任务流列表
     *
     * @param request ListTaskFlowRequest
     * @return ListTaskFlowResponse
     */
    public ListTaskFlowResponse listTaskFlow(ListTaskFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskFlowWithOptions(request, runtime);
    }

    /**
     * @summary Queries the constants for a task flow.
     *
     * @param request ListTaskFlowConstantsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskFlowConstantsResponse
     */
    public ListTaskFlowConstantsResponse listTaskFlowConstantsWithOptions(ListTaskFlowConstantsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskFlowConstants"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskFlowConstantsResponse());
    }

    /**
     * @summary Queries the constants for a task flow.
     *
     * @param request ListTaskFlowConstantsRequest
     * @return ListTaskFlowConstantsResponse
     */
    public ListTaskFlowConstantsResponse listTaskFlowConstants(ListTaskFlowConstantsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskFlowConstantsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the users that are involved in a specified task flow.
     *
     * @param request ListTaskFlowCooperatorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskFlowCooperatorsResponse
     */
    public ListTaskFlowCooperatorsResponse listTaskFlowCooperatorsWithOptions(ListTaskFlowCooperatorsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskFlowCooperators"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskFlowCooperatorsResponse());
    }

    /**
     * @summary Queries the users that are involved in a specified task flow.
     *
     * @param request ListTaskFlowCooperatorsRequest
     * @return ListTaskFlowCooperatorsResponse
     */
    public ListTaskFlowCooperatorsResponse listTaskFlowCooperators(ListTaskFlowCooperatorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskFlowCooperatorsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the edges of the directed acyclic graph (DAG) for a specified task flow based on multiple conditions.
     *
     * @description This operation is used for multi-condition query. You can call this operation to query the edges of a specified task flow that meet all specified conditions.
     *
     * @param request ListTaskFlowEdgesByConditionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskFlowEdgesByConditionResponse
     */
    public ListTaskFlowEdgesByConditionResponse listTaskFlowEdgesByConditionWithOptions(ListTaskFlowEdgesByConditionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            query.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeEnd)) {
            query.put("NodeEnd", request.nodeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeFrom)) {
            query.put("NodeFrom", request.nodeFrom);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskFlowEdgesByCondition"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskFlowEdgesByConditionResponse());
    }

    /**
     * @summary Queries the edges of the directed acyclic graph (DAG) for a specified task flow based on multiple conditions.
     *
     * @description This operation is used for multi-condition query. You can call this operation to query the edges of a specified task flow that meet all specified conditions.
     *
     * @param request ListTaskFlowEdgesByConditionRequest
     * @return ListTaskFlowEdgesByConditionResponse
     */
    public ListTaskFlowEdgesByConditionResponse listTaskFlowEdgesByCondition(ListTaskFlowEdgesByConditionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskFlowEdgesByConditionWithOptions(request, runtime);
    }

    /**
     * @summary Queries the execution records of a task flow.
     *
     * @param request ListTaskFlowInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskFlowInstanceResponse
     */
    public ListTaskFlowInstanceResponse listTaskFlowInstanceWithOptions(ListTaskFlowInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            query.put("TriggerType", request.triggerType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useBizDate)) {
            query.put("UseBizDate", request.useBizDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the execution records of a task flow.
     *
     * @param request ListTaskFlowInstanceRequest
     * @return ListTaskFlowInstanceResponse
     */
    public ListTaskFlowInstanceResponse listTaskFlowInstance(ListTaskFlowInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskFlowInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the time variables for a task flow.
     *
     * @param request ListTaskFlowTimeVariablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskFlowTimeVariablesResponse
     */
    public ListTaskFlowTimeVariablesResponse listTaskFlowTimeVariablesWithOptions(ListTaskFlowTimeVariablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskFlowTimeVariables"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskFlowTimeVariablesResponse());
    }

    /**
     * @summary Queries the time variables for a task flow.
     *
     * @param request ListTaskFlowTimeVariablesRequest
     * @return ListTaskFlowTimeVariablesResponse
     */
    public ListTaskFlowTimeVariablesResponse listTaskFlowTimeVariables(ListTaskFlowTimeVariablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskFlowTimeVariablesWithOptions(request, runtime);
    }

    /**
     * @summary Queries task flows by page.
     *
     * @param tmpReq ListTaskFlowsByPageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTaskFlowsByPageResponse
     */
    public ListTaskFlowsByPageResponse listTaskFlowsByPageWithOptions(ListTaskFlowsByPageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListTaskFlowsByPageShrinkRequest request = new ListTaskFlowsByPageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dagIdList)) {
            request.dagIdListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dagIdList, "DagIdList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagIdListShrink)) {
            query.put("DagIdList", request.dagIdListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageIndex)) {
            query.put("PageIndex", request.pageIndex);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchKey)) {
            query.put("SearchKey", request.searchKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTaskFlowsByPage"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTaskFlowsByPageResponse());
    }

    /**
     * @summary Queries task flows by page.
     *
     * @param request ListTaskFlowsByPageRequest
     * @return ListTaskFlowsByPageResponse
     */
    public ListTaskFlowsByPageResponse listTaskFlowsByPage(ListTaskFlowsByPageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTaskFlowsByPageWithOptions(request, runtime);
    }

    /**
     * @summary Queries the tasks in a specified task flow.
     *
     * @param request ListTasksInTaskFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTasksInTaskFlowResponse
     */
    public ListTasksInTaskFlowResponse listTasksInTaskFlowWithOptions(ListTasksInTaskFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTasksInTaskFlow"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTasksInTaskFlowResponse());
    }

    /**
     * @summary Queries the tasks in a specified task flow.
     *
     * @param request ListTasksInTaskFlowRequest
     * @return ListTasksInTaskFlowResponse
     */
    public ListTasksInTaskFlowResponse listTasksInTaskFlow(ListTasksInTaskFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTasksInTaskFlowWithOptions(request, runtime);
    }

    /**
     * @summary Queries the permissions of a specific user on a database or a table.
     *
     * @param request ListUserPermissionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserPermissionsResponse
     */
    public ListUserPermissionsResponse listUserPermissionsWithOptions(ListUserPermissionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the permissions of a specific user on a database or a table.
     *
     * @param request ListUserPermissionsRequest
     * @return ListUserPermissionsResponse
     */
    public ListUserPermissionsResponse listUserPermissions(ListUserPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserPermissionsWithOptions(request, runtime);
    }

    /**
     * @summary 获取用户租户列表
     *
     * @param request ListUserTenantsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserTenantsResponse
     */
    public ListUserTenantsResponse listUserTenantsWithOptions(ListUserTenantsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 获取用户租户列表
     *
     * @param request ListUserTenantsRequest
     * @return ListUserTenantsResponse
     */
    public ListUserTenantsResponse listUserTenants(ListUserTenantsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUserTenantsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of users.
     *
     * @param request ListUsersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsersWithOptions(ListUsersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of users.
     *
     * @param request ListUsersRequest
     * @return ListUsersResponse
     */
    public ListUsersResponse listUsers(ListUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listUsersWithOptions(request, runtime);
    }

    /**
     * @summary Queries approval nodes.
     *
     * @param request ListWorkFlowNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkFlowNodesResponse
     */
    public ListWorkFlowNodesResponse listWorkFlowNodesWithOptions(ListWorkFlowNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.searchName)) {
            query.put("SearchName", request.searchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries approval nodes.
     *
     * @param request ListWorkFlowNodesRequest
     * @return ListWorkFlowNodesResponse
     */
    public ListWorkFlowNodesResponse listWorkFlowNodes(ListWorkFlowNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkFlowNodesWithOptions(request, runtime);
    }

    /**
     * @summary Queries approval templates.
     *
     * @param request ListWorkFlowTemplatesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListWorkFlowTemplatesResponse
     */
    public ListWorkFlowTemplatesResponse listWorkFlowTemplatesWithOptions(ListWorkFlowTemplatesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.searchName)) {
            query.put("SearchName", request.searchName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries approval templates.
     *
     * @param request ListWorkFlowTemplatesRequest
     * @return ListWorkFlowTemplatesResponse
     */
    public ListWorkFlowTemplatesResponse listWorkFlowTemplates(ListWorkFlowTemplatesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listWorkFlowTemplatesWithOptions(request, runtime);
    }

    /**
     * @summary Sets the status of a task flow to "Successful".
     *
     * @param request MakeTaskFlowInstanceSuccessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MakeTaskFlowInstanceSuccessResponse
     */
    public MakeTaskFlowInstanceSuccessResponse makeTaskFlowInstanceSuccessWithOptions(MakeTaskFlowInstanceSuccessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MakeTaskFlowInstanceSuccess"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MakeTaskFlowInstanceSuccessResponse());
    }

    /**
     * @summary Sets the status of a task flow to "Successful".
     *
     * @param request MakeTaskFlowInstanceSuccessRequest
     * @return MakeTaskFlowInstanceSuccessResponse
     */
    public MakeTaskFlowInstanceSuccessResponse makeTaskFlowInstanceSuccess(MakeTaskFlowInstanceSuccessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.makeTaskFlowInstanceSuccessWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the SQL script that is submitted by using a data change ticket.
     *
     * @param request ModifyDataCorrectExecSQLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDataCorrectExecSQLResponse
     */
    public ModifyDataCorrectExecSQLResponse modifyDataCorrectExecSQLWithOptions(ModifyDataCorrectExecSQLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Modifies the SQL script that is submitted by using a data change ticket.
     *
     * @param request ModifyDataCorrectExecSQLRequest
     * @return ModifyDataCorrectExecSQLResponse
     */
    public ModifyDataCorrectExecSQLResponse modifyDataCorrectExecSQL(ModifyDataCorrectExecSQLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDataCorrectExecSQLWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the masking rule bound to a specified field.
     *
     * @param request ModifyDesensitizationStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDesensitizationStrategyResponse
     */
    public ModifyDesensitizationStrategyResponse modifyDesensitizationStrategyWithOptions(ModifyDesensitizationStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnName)) {
            query.put("ColumnName", request.columnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbId)) {
            query.put("DbId", request.dbId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isDefault)) {
            query.put("IsDefault", request.isDefault);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isLogic)) {
            query.put("IsLogic", request.isLogic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isReset)) {
            query.put("IsReset", request.isReset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ruleId)) {
            query.put("RuleId", request.ruleId);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDesensitizationStrategy"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDesensitizationStrategyResponse());
    }

    /**
     * @summary Modifies the masking rule bound to a specified field.
     *
     * @param request ModifyDesensitizationStrategyRequest
     * @return ModifyDesensitizationStrategyResponse
     */
    public ModifyDesensitizationStrategyResponse modifyDesensitizationStrategy(ModifyDesensitizationStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDesensitizationStrategyWithOptions(request, runtime);
    }

    /**
     * @summary 修改实例信息，同时检查该实例连通性
     *
     * @param request ModifyInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstanceWithOptions(ModifyInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableSellCommon)) {
            query.put("EnableSellCommon", request.enableSellCommon);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSellSitd)) {
            query.put("EnableSellSitd", request.enableSellSitd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSellStable)) {
            query.put("EnableSellStable", request.enableSellStable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSellTrust)) {
            query.put("EnableSellTrust", request.enableSellTrust);
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useDsql)) {
            query.put("UseDsql", request.useDsql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useSsl)) {
            query.put("UseSsl", request.useSsl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyInstance"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyInstanceResponse());
    }

    /**
     * @summary 修改实例信息，同时检查该实例连通性
     *
     * @param request ModifyInstanceRequest
     * @return ModifyInstanceResponse
     */
    public ModifyInstanceResponse modifyInstance(ModifyInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Migrates a task flow to a specified business scenario.
     *
     * @param request MoveTaskFlowToScenarioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return MoveTaskFlowToScenarioResponse
     */
    public MoveTaskFlowToScenarioResponse moveTaskFlowToScenarioWithOptions(MoveTaskFlowToScenarioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "MoveTaskFlowToScenario"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new MoveTaskFlowToScenarioResponse());
    }

    /**
     * @summary Migrates a task flow to a specified business scenario.
     *
     * @param request MoveTaskFlowToScenarioRequest
     * @return MoveTaskFlowToScenarioResponse
     */
    public MoveTaskFlowToScenarioResponse moveTaskFlowToScenario(MoveTaskFlowToScenarioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.moveTaskFlowToScenarioWithOptions(request, runtime);
    }

    /**
     * @summary Unpublishes a published task flow.
     *
     * @param request OfflineTaskFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return OfflineTaskFlowResponse
     */
    public OfflineTaskFlowResponse offlineTaskFlowWithOptions(OfflineTaskFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "OfflineTaskFlow"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new OfflineTaskFlowResponse());
    }

    /**
     * @summary Unpublishes a published task flow.
     *
     * @param request OfflineTaskFlowRequest
     * @return OfflineTaskFlowResponse
     */
    public OfflineTaskFlowResponse offlineTaskFlow(OfflineTaskFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.offlineTaskFlowWithOptions(request, runtime);
    }

    /**
     * @summary Pauses a SQL task for data change.
     *
     * @description You can call this operation only for database instances that are managed in Security Collaboration mode.
     *
     * @param request PauseDataCorrectSQLJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseDataCorrectSQLJobResponse
     */
    public PauseDataCorrectSQLJobResponse pauseDataCorrectSQLJobWithOptions(PauseDataCorrectSQLJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Pauses a SQL task for data change.
     *
     * @description You can call this operation only for database instances that are managed in Security Collaboration mode.
     *
     * @param request PauseDataCorrectSQLJobRequest
     * @return PauseDataCorrectSQLJobResponse
     */
    public PauseDataCorrectSQLJobResponse pauseDataCorrectSQLJob(PauseDataCorrectSQLJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseDataCorrectSQLJobWithOptions(request, runtime);
    }

    /**
     * @summary 创建工单审批流
     *
     * @param request PreviewWorkflowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreviewWorkflowResponse
     */
    public PreviewWorkflowResponse previewWorkflowWithOptions(PreviewWorkflowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewWorkflow"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewWorkflowResponse());
    }

    /**
     * @summary 创建工单审批流
     *
     * @param request PreviewWorkflowRequest
     * @return PreviewWorkflowResponse
     */
    public PreviewWorkflowResponse previewWorkflow(PreviewWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.previewWorkflowWithOptions(request, runtime);
    }

    /**
     * @summary Publishes and deploys a task flow.
     *
     * @param request PublishAndDeployTaskFlowRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PublishAndDeployTaskFlowResponse
     */
    public PublishAndDeployTaskFlowResponse publishAndDeployTaskFlowWithOptions(PublishAndDeployTaskFlowRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionComments)) {
            query.put("VersionComments", request.versionComments);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PublishAndDeployTaskFlow"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PublishAndDeployTaskFlowResponse());
    }

    /**
     * @summary Publishes and deploys a task flow.
     *
     * @param request PublishAndDeployTaskFlowRequest
     * @return PublishAndDeployTaskFlowResponse
     */
    public PublishAndDeployTaskFlowResponse publishAndDeployTaskFlow(PublishAndDeployTaskFlowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.publishAndDeployTaskFlowWithOptions(request, runtime);
    }

    /**
     * @summary Queries the download and parsing progress of data tracking logs.
     *
     * @param request QueryDataTrackResultDownloadStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryDataTrackResultDownloadStatusResponse
     */
    public QueryDataTrackResultDownloadStatusResponse queryDataTrackResultDownloadStatusWithOptions(QueryDataTrackResultDownloadStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.downloadKeyId)) {
            query.put("DownloadKeyId", request.downloadKeyId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryDataTrackResultDownloadStatus"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryDataTrackResultDownloadStatusResponse());
    }

    /**
     * @summary Queries the download and parsing progress of data tracking logs.
     *
     * @param request QueryDataTrackResultDownloadStatusRequest
     * @return QueryDataTrackResultDownloadStatusResponse
     */
    public QueryDataTrackResultDownloadStatusResponse queryDataTrackResultDownloadStatus(QueryDataTrackResultDownloadStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryDataTrackResultDownloadStatusWithOptions(request, runtime);
    }

    /**
     * @summary 部署任务流的历史版本
     *
     * @param request ReDeployLhDagVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReDeployLhDagVersionResponse
     */
    public ReDeployLhDagVersionResponse reDeployLhDagVersionWithOptions(ReDeployLhDagVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary 部署任务流的历史版本
     *
     * @param request ReDeployLhDagVersionRequest
     * @return ReDeployLhDagVersionResponse
     */
    public ReDeployLhDagVersionResponse reDeployLhDagVersion(ReDeployLhDagVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reDeployLhDagVersionWithOptions(request, runtime);
    }

    /**
     * @summary Reruns a task flow instance.
     *
     * @param request ReRunTaskFlowInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReRunTaskFlowInstanceResponse
     */
    public ReRunTaskFlowInstanceResponse reRunTaskFlowInstanceWithOptions(ReRunTaskFlowInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagInstanceId)) {
            query.put("DagInstanceId", request.dagInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagVersion)) {
            query.put("DagVersion", request.dagVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReRunTaskFlowInstance"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReRunTaskFlowInstanceResponse());
    }

    /**
     * @summary Reruns a task flow instance.
     *
     * @param request ReRunTaskFlowInstanceRequest
     * @return ReRunTaskFlowInstanceResponse
     */
    public ReRunTaskFlowInstanceResponse reRunTaskFlowInstance(ReRunTaskFlowInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.reRunTaskFlowInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Unsubscribes from a pay-as-you-go Data Management (DMS) resource.
     *
     * @param request RefundPayAsYouGoOrderRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefundPayAsYouGoOrderResponse
     */
    public RefundPayAsYouGoOrderResponse refundPayAsYouGoOrderWithOptions(RefundPayAsYouGoOrderRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefundPayAsYouGoOrder"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefundPayAsYouGoOrderResponse());
    }

    /**
     * @summary Unsubscribes from a pay-as-you-go Data Management (DMS) resource.
     *
     * @param request RefundPayAsYouGoOrderRequest
     * @return RefundPayAsYouGoOrderResponse
     */
    public RefundPayAsYouGoOrderResponse refundPayAsYouGoOrder(RefundPayAsYouGoOrderRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.refundPayAsYouGoOrderWithOptions(request, runtime);
    }

    /**
     * @summary Registers a database instance in Data Management (DMS).
     *
     * @description Prerequisites: You are a DMS administrator or a database administrator (DBA). You can call the [ListUsers](https://help.aliyun.com/document_detail/141938.html) or [GetUser](https://help.aliyun.com/document_detail/147098.html) operation to query your user role from the RoleIdList parameter that is returned.
     *
     * @param request RegisterInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterInstanceResponse
     */
    public RegisterInstanceResponse registerInstanceWithOptions(RegisterInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.dbaUidByString)) {
            query.put("DbaUidByString", request.dbaUidByString);
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableSellSitd)) {
            query.put("EnableSellSitd", request.enableSellSitd);
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Registers a database instance in Data Management (DMS).
     *
     * @description Prerequisites: You are a DMS administrator or a database administrator (DBA). You can call the [ListUsers](https://help.aliyun.com/document_detail/141938.html) or [GetUser](https://help.aliyun.com/document_detail/147098.html) operation to query your user role from the RoleIdList parameter that is returned.
     *
     * @param request RegisterInstanceRequest
     * @return RegisterInstanceResponse
     */
    public RegisterInstanceResponse registerInstance(RegisterInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Registers a user for your enterprise.
     *
     * @description If you are an **administrator** in Data Management (DMS), you can call this operation to register a user for your enterprise. To view users that are assigned the administrator role, perform the following steps: Log on to the DMS console. In the top navigation bar, click O&M. In the left-side navigation pane, click User.
     *
     * @param request RegisterUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterUserResponse
     */
    public RegisterUserResponse registerUserWithOptions(RegisterUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Registers a user for your enterprise.
     *
     * @description If you are an **administrator** in Data Management (DMS), you can call this operation to register a user for your enterprise. To view users that are assigned the administrator role, perform the following steps: Log on to the DMS console. In the top navigation bar, click O&M. In the left-side navigation pane, click User.
     *
     * @param request RegisterUserRequest
     * @return RegisterUserResponse
     */
    public RegisterUserResponse registerUser(RegisterUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.registerUserWithOptions(request, runtime);
    }

    /**
     * @summary Reruns a failed SQL task for data change.
     *
     * @param request RestartDataCorrectSQLJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartDataCorrectSQLJobResponse
     */
    public RestartDataCorrectSQLJobResponse restartDataCorrectSQLJobWithOptions(RestartDataCorrectSQLJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Reruns a failed SQL task for data change.
     *
     * @param request RestartDataCorrectSQLJobRequest
     * @return RestartDataCorrectSQLJobResponse
     */
    public RestartDataCorrectSQLJobResponse restartDataCorrectSQLJob(RestartDataCorrectSQLJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDataCorrectSQLJobWithOptions(request, runtime);
    }

    /**
     * @summary Resumes a suspended task flow.
     *
     * @description You can call this operation only for task flows that are suspended.
     *
     * @param request ResumeTaskFlowInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeTaskFlowInstanceResponse
     */
    public ResumeTaskFlowInstanceResponse resumeTaskFlowInstanceWithOptions(ResumeTaskFlowInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagInstanceId)) {
            query.put("DagInstanceId", request.dagInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagVersion)) {
            query.put("DagVersion", request.dagVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeTaskFlowInstance"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeTaskFlowInstanceResponse());
    }

    /**
     * @summary Resumes a suspended task flow.
     *
     * @description You can call this operation only for task flows that are suspended.
     *
     * @param request ResumeTaskFlowInstanceRequest
     * @return ResumeTaskFlowInstanceResponse
     */
    public ResumeTaskFlowInstanceResponse resumeTaskFlowInstance(ResumeTaskFlowInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeTaskFlowInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Reruns the precheck for a data change ticket.
     *
     * @param request RetryDataCorrectPreCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RetryDataCorrectPreCheckResponse
     */
    public RetryDataCorrectPreCheckResponse retryDataCorrectPreCheckWithOptions(RetryDataCorrectPreCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Reruns the precheck for a data change ticket.
     *
     * @param request RetryDataCorrectPreCheckRequest
     * @return RetryDataCorrectPreCheckResponse
     */
    public RetryDataCorrectPreCheckResponse retryDataCorrectPreCheck(RetryDataCorrectPreCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.retryDataCorrectPreCheckWithOptions(request, runtime);
    }

    /**
     * @summary Revokes permissions on resources from Data Management (DMS) users by using a permission template.
     *
     * @description You must be a database administrator (DBA) or a DMS administrator. For more information about how to view system roles, see [View system roles](https://help.aliyun.com/document_detail/324212.html).
     *
     * @param request RevokeTemplateAuthorityRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeTemplateAuthorityResponse
     */
    public RevokeTemplateAuthorityResponse revokeTemplateAuthorityWithOptions(RevokeTemplateAuthorityRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userIds)) {
            query.put("UserIds", request.userIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeTemplateAuthority"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeTemplateAuthorityResponse());
    }

    /**
     * @summary Revokes permissions on resources from Data Management (DMS) users by using a permission template.
     *
     * @description You must be a database administrator (DBA) or a DMS administrator. For more information about how to view system roles, see [View system roles](https://help.aliyun.com/document_detail/324212.html).
     *
     * @param request RevokeTemplateAuthorityRequest
     * @return RevokeTemplateAuthorityResponse
     */
    public RevokeTemplateAuthorityResponse revokeTemplateAuthority(RevokeTemplateAuthorityRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeTemplateAuthorityWithOptions(request, runtime);
    }

    /**
     * @summary Revokes a permission on a resource from a user.
     *
     * @param request RevokeUserPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeUserPermissionResponse
     */
    public RevokeUserPermissionResponse revokeUserPermissionWithOptions(RevokeUserPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Revokes a permission on a resource from a user.
     *
     * @param request RevokeUserPermissionRequest
     * @return RevokeUserPermissionResponse
     */
    public RevokeUserPermissionResponse revokeUserPermission(RevokeUserPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeUserPermissionWithOptions(request, runtime);
    }

    /**
     * @summary Searches for the parsing result of a data tracking task.
     *
     * @param tmpReq SearchDataTrackResultRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchDataTrackResultResponse
     */
    public SearchDataTrackResultResponse searchDataTrackResultWithOptions(SearchDataTrackResultRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SearchDataTrackResultShrinkRequest request = new SearchDataTrackResultShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columnFilter)) {
            request.columnFilterShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columnFilter, "ColumnFilter", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterTableList)) {
            request.filterTableListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterTableList, "FilterTableList", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.filterTypeList)) {
            request.filterTypeListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.filterTypeList, "FilterTypeList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnFilterShrink)) {
            query.put("ColumnFilter", request.columnFilterShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterEndTime)) {
            query.put("FilterEndTime", request.filterEndTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterStartTime)) {
            query.put("FilterStartTime", request.filterStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterTableListShrink)) {
            query.put("FilterTableList", request.filterTableListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterTypeListShrink)) {
            query.put("FilterTypeList", request.filterTypeListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchDataTrackResult"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchDataTrackResultResponse());
    }

    /**
     * @summary Searches for the parsing result of a data tracking task.
     *
     * @param request SearchDataTrackResultRequest
     * @return SearchDataTrackResultResponse
     */
    public SearchDataTrackResultResponse searchDataTrackResult(SearchDataTrackResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchDataTrackResultWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of the databases.
     *
     * @param request SearchDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchDatabaseResponse
     */
    public SearchDatabaseResponse searchDatabaseWithOptions(SearchDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries the details of the databases.
     *
     * @param request SearchDatabaseRequest
     * @return SearchDatabaseResponse
     */
    public SearchDatabaseResponse searchDatabase(SearchDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchDatabaseWithOptions(request, runtime);
    }

    /**
     * @summary Queries detailed information about tables.
     *
     * @description You can call this operation only for database instances that are managed in Security Collaboration mode.
     *
     * @param request SearchTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchTableResponse
     */
    public SearchTableResponse searchTableWithOptions(SearchTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Queries detailed information about tables.
     *
     * @description You can call this operation only for database instances that are managed in Security Collaboration mode.
     *
     * @param request SearchTableRequest
     * @return SearchTableResponse
     */
    public SearchTableResponse searchTable(SearchTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.searchTableWithOptions(request, runtime);
    }

    /**
     * @summary Configures the owner of an instance, a database, or a table.
     *
     * @param request SetOwnersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetOwnersResponse
     */
    public SetOwnersResponse setOwnersWithOptions(SetOwnersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Configures the owner of an instance, a database, or a table.
     *
     * @param request SetOwnersRequest
     * @return SetOwnersResponse
     */
    public SetOwnersResponse setOwners(SetOwnersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setOwnersWithOptions(request, runtime);
    }

    /**
     * @summary Skips the verification on the number of rows in the precheck for data change.
     *
     * @param request SkipDataCorrectRowCheckRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SkipDataCorrectRowCheckResponse
     */
    public SkipDataCorrectRowCheckResponse skipDataCorrectRowCheckWithOptions(SkipDataCorrectRowCheckRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reason)) {
            query.put("Reason", request.reason);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SkipDataCorrectRowCheck"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SkipDataCorrectRowCheckResponse());
    }

    /**
     * @summary Skips the verification on the number of rows in the precheck for data change.
     *
     * @param request SkipDataCorrectRowCheckRequest
     * @return SkipDataCorrectRowCheckResponse
     */
    public SkipDataCorrectRowCheckResponse skipDataCorrectRowCheck(SkipDataCorrectRowCheckRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.skipDataCorrectRowCheckWithOptions(request, runtime);
    }

    /**
     * @summary Stops a task flow instance.
     *
     * @param request StopTaskFlowInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopTaskFlowInstanceResponse
     */
    public StopTaskFlowInstanceResponse stopTaskFlowInstanceWithOptions(StopTaskFlowInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopTaskFlowInstance"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopTaskFlowInstanceResponse());
    }

    /**
     * @summary Stops a task flow instance.
     *
     * @param request StopTaskFlowInstanceRequest
     * @return StopTaskFlowInstanceResponse
     */
    public StopTaskFlowInstanceResponse stopTaskFlowInstance(StopTaskFlowInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.stopTaskFlowInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Submits a ticket for approval.
     *
     * @param request SubmitOrderApprovalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitOrderApprovalResponse
     */
    public SubmitOrderApprovalResponse submitOrderApprovalWithOptions(SubmitOrderApprovalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Submits a ticket for approval.
     *
     * @param request SubmitOrderApprovalRequest
     * @return SubmitOrderApprovalResponse
     */
    public SubmitOrderApprovalResponse submitOrderApproval(SubmitOrderApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitOrderApprovalWithOptions(request, runtime);
    }

    /**
     * @summary Submits a schema synchronization ticket for approval.
     *
     * @param request SubmitStructSyncOrderApprovalRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitStructSyncOrderApprovalResponse
     */
    public SubmitStructSyncOrderApprovalResponse submitStructSyncOrderApprovalWithOptions(SubmitStructSyncOrderApprovalRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.orderId)) {
            query.put("OrderId", request.orderId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Submits a schema synchronization ticket for approval.
     *
     * @param request SubmitStructSyncOrderApprovalRequest
     * @return SubmitStructSyncOrderApprovalResponse
     */
    public SubmitStructSyncOrderApprovalResponse submitStructSyncOrderApproval(SubmitStructSyncOrderApprovalRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitStructSyncOrderApprovalWithOptions(request, runtime);
    }

    /**
     * @summary Suspends a task flow instance.
     *
     * @param request SuspendTaskFlowInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendTaskFlowInstanceResponse
     */
    public SuspendTaskFlowInstanceResponse suspendTaskFlowInstanceWithOptions(SuspendTaskFlowInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendTaskFlowInstance"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendTaskFlowInstanceResponse());
    }

    /**
     * @summary Suspends a task flow instance.
     *
     * @param request SuspendTaskFlowInstanceRequest
     * @return SuspendTaskFlowInstanceResponse
     */
    public SuspendTaskFlowInstanceResponse suspendTaskFlowInstance(SuspendTaskFlowInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendTaskFlowInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Synchronizes the metadata of a database.
     *
     * @param request SyncDatabaseMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncDatabaseMetaResponse
     */
    public SyncDatabaseMetaResponse syncDatabaseMetaWithOptions(SyncDatabaseMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Synchronizes the metadata of a database.
     *
     * @param request SyncDatabaseMetaRequest
     * @return SyncDatabaseMetaResponse
     */
    public SyncDatabaseMetaResponse syncDatabaseMeta(SyncDatabaseMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncDatabaseMetaWithOptions(request, runtime);
    }

    /**
     * @summary Synchronizes the metadata of all databases in a database instance.
     *
     * @description You can call this operation only for database instances whose control mode is Security Collaboration.
     *
     * @param request SyncInstanceMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SyncInstanceMetaResponse
     */
    public SyncInstanceMetaResponse syncInstanceMetaWithOptions(SyncInstanceMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Synchronizes the metadata of all databases in a database instance.
     *
     * @description You can call this operation only for database instances whose control mode is Security Collaboration.
     *
     * @param request SyncInstanceMetaRequest
     * @return SyncInstanceMetaResponse
     */
    public SyncInstanceMetaResponse syncInstanceMeta(SyncInstanceMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.syncInstanceMetaWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a permission template.
     *
     * @description You are a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see [View system roles](https://help.aliyun.com/document_detail/324212.html).
     *
     * @param request UpdateAuthorityTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateAuthorityTemplateResponse
     */
    public UpdateAuthorityTemplateResponse updateAuthorityTemplateWithOptions(UpdateAuthorityTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateAuthorityTemplate"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateAuthorityTemplateResponse());
    }

    /**
     * @summary Modifies a permission template.
     *
     * @description You are a database administrator (DBA) or a Data Management (DMS) administrator. For more information about how to view system roles, see [View system roles](https://help.aliyun.com/document_detail/324212.html).
     *
     * @param request UpdateAuthorityTemplateRequest
     * @return UpdateAuthorityTemplateResponse
     */
    public UpdateAuthorityTemplateResponse updateAuthorityTemplate(UpdateAuthorityTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateAuthorityTemplateWithOptions(request, runtime);
    }

    /**
     * @summary Updates the information about a database instance and checks the connectivity of the database instance.
     *
     * @description Before you call the UpdateInstance operation, call the [GetInstance](https://help.aliyun.com/document_detail/141567.html) or [ListInstances](https://help.aliyun.com/document_detail/141936.html) operation to obtain the complete information about the instance.
     *
     * @param request UpdateInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstanceWithOptions(UpdateInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.enableSellSitd)) {
            query.put("EnableSellSitd", request.enableSellSitd);
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

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateType)) {
            query.put("TemplateType", request.templateType);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Updates the information about a database instance and checks the connectivity of the database instance.
     *
     * @description Before you call the UpdateInstance operation, call the [GetInstance](https://help.aliyun.com/document_detail/141567.html) or [ListInstances](https://help.aliyun.com/document_detail/141936.html) operation to obtain the complete information about the instance.
     *
     * @param request UpdateInstanceRequest
     * @return UpdateInstanceResponse
     */
    public UpdateInstanceResponse updateInstance(UpdateInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Updates the service level agreement (SLA) timeout reminder for a task flow.
     *
     * @description SLA rules take effect after task flows are deployed and published.
     *
     * @param tmpReq UpdateSLARulesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSLARulesResponse
     */
    public UpdateSLARulesResponse updateSLARulesWithOptions(UpdateSLARulesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateSLARulesShrinkRequest request = new UpdateSLARulesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.slaRuleList)) {
            request.slaRuleListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.slaRuleList, "SlaRuleList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slaRuleListShrink)) {
            query.put("SlaRuleList", request.slaRuleListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSLARules"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSLARulesResponse());
    }

    /**
     * @summary Updates the service level agreement (SLA) timeout reminder for a task flow.
     *
     * @description SLA rules take effect after task flows are deployed and published.
     *
     * @param request UpdateSLARulesRequest
     * @return UpdateSLARulesResponse
     */
    public UpdateSLARulesResponse updateSLARules(UpdateSLARulesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSLARulesWithOptions(request, runtime);
    }

    /**
     * @summary Updates the name and description of the business scenario for a specified task flow.
     *
     * @param request UpdateScenarioRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateScenarioResponse
     */
    public UpdateScenarioResponse updateScenarioWithOptions(UpdateScenarioRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioId)) {
            query.put("ScenarioId", request.scenarioId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scenarioName)) {
            query.put("ScenarioName", request.scenarioName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateScenario"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateScenarioResponse());
    }

    /**
     * @summary Updates the name and description of the business scenario for a specified task flow.
     *
     * @param request UpdateScenarioRequest
     * @return UpdateScenarioResponse
     */
    public UpdateScenarioResponse updateScenario(UpdateScenarioRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateScenarioWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the name and description of a specific security rule set.
     *
     * @param request UpdateStandardGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateStandardGroupResponse
     */
    public UpdateStandardGroupResponse updateStandardGroupWithOptions(UpdateStandardGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupId)) {
            query.put("GroupId", request.groupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateStandardGroup"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateStandardGroupResponse());
    }

    /**
     * @summary Modifies the name and description of a specific security rule set.
     *
     * @param request UpdateStandardGroupRequest
     * @return UpdateStandardGroupResponse
     */
    public UpdateStandardGroupResponse updateStandardGroup(UpdateStandardGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateStandardGroupWithOptions(request, runtime);
    }

    /**
     * @summary Updates the advanced configuration of a task node.
     *
     * @description You can call this operation to configure a failed task or rerun a task.
     *
     * @param request UpdateTaskConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskConfigResponse
     */
    public UpdateTaskConfigResponse updateTaskConfigWithOptions(UpdateTaskConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeConfig)) {
            query.put("NodeConfig", request.nodeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskConfig"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskConfigResponse());
    }

    /**
     * @summary Updates the advanced configuration of a task node.
     *
     * @description You can call this operation to configure a failed task or rerun a task.
     *
     * @param request UpdateTaskConfigRequest
     * @return UpdateTaskConfigResponse
     */
    public UpdateTaskConfigResponse updateTaskConfig(UpdateTaskConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskConfigWithOptions(request, runtime);
    }

    /**
     * @summary Updates tasks in a task flow.
     *
     * @description You can call this operation to modify node configurations.
     *
     * @param request UpdateTaskContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskContentResponse
     */
    public UpdateTaskContentResponse updateTaskContentWithOptions(UpdateTaskContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeContent)) {
            query.put("NodeContent", request.nodeContent);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskContent"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskContentResponse());
    }

    /**
     * @summary Updates tasks in a task flow.
     *
     * @description You can call this operation to modify node configurations.
     *
     * @param request UpdateTaskContentRequest
     * @return UpdateTaskContentResponse
     */
    public UpdateTaskContentResponse updateTaskContent(UpdateTaskContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskContentWithOptions(request, runtime);
    }

    /**
     * @summary Updates the constants for a specified task flow.
     *
     * @param tmpReq UpdateTaskFlowConstantsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskFlowConstantsResponse
     */
    public UpdateTaskFlowConstantsResponse updateTaskFlowConstantsWithOptions(UpdateTaskFlowConstantsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTaskFlowConstantsShrinkRequest request = new UpdateTaskFlowConstantsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.dagConstants)) {
            request.dagConstantsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.dagConstants, "DagConstants", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagConstantsShrink)) {
            query.put("DagConstants", request.dagConstantsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskFlowConstants"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskFlowConstantsResponse());
    }

    /**
     * @summary Updates the constants for a specified task flow.
     *
     * @param request UpdateTaskFlowConstantsRequest
     * @return UpdateTaskFlowConstantsResponse
     */
    public UpdateTaskFlowConstantsResponse updateTaskFlowConstants(UpdateTaskFlowConstantsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskFlowConstantsWithOptions(request, runtime);
    }

    /**
     * @summary Updates the IDs of the users who are involved in the task flow.
     *
     * @param tmpReq UpdateTaskFlowCooperatorsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskFlowCooperatorsResponse
     */
    public UpdateTaskFlowCooperatorsResponse updateTaskFlowCooperatorsWithOptions(UpdateTaskFlowCooperatorsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTaskFlowCooperatorsShrinkRequest request = new UpdateTaskFlowCooperatorsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.cooperatorIds)) {
            request.cooperatorIdsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.cooperatorIds, "CooperatorIds", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cooperatorIdsShrink)) {
            query.put("CooperatorIds", request.cooperatorIdsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskFlowCooperators"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskFlowCooperatorsResponse());
    }

    /**
     * @summary Updates the IDs of the users who are involved in the task flow.
     *
     * @param request UpdateTaskFlowCooperatorsRequest
     * @return UpdateTaskFlowCooperatorsResponse
     */
    public UpdateTaskFlowCooperatorsResponse updateTaskFlowCooperators(UpdateTaskFlowCooperatorsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskFlowCooperatorsWithOptions(request, runtime);
    }

    /**
     * @summary Updates the start node and end node of multiple edges at a time for a task flow.
     *
     * @description ###
     * The edges can be updated only when the following conditions are met:
     * 1.  The specified edge exists in the directed acyclic graph (DAG) of the task flow specified by DagId.
     * 2.  The specified edge nodes exist in the DAG of the task flow specified by DagId.
     * 3.  After the update, rings do not exist in the DAG.
     *
     * @param tmpReq UpdateTaskFlowEdgesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskFlowEdgesResponse
     */
    public UpdateTaskFlowEdgesResponse updateTaskFlowEdgesWithOptions(UpdateTaskFlowEdgesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTaskFlowEdgesShrinkRequest request = new UpdateTaskFlowEdgesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.edges)) {
            request.edgesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.edges, "Edges", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edgesShrink)) {
            query.put("Edges", request.edgesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskFlowEdges"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskFlowEdgesResponse());
    }

    /**
     * @summary Updates the start node and end node of multiple edges at a time for a task flow.
     *
     * @description ###
     * The edges can be updated only when the following conditions are met:
     * 1.  The specified edge exists in the directed acyclic graph (DAG) of the task flow specified by DagId.
     * 2.  The specified edge nodes exist in the DAG of the task flow specified by DagId.
     * 3.  After the update, rings do not exist in the DAG.
     *
     * @param request UpdateTaskFlowEdgesRequest
     * @return UpdateTaskFlowEdgesResponse
     */
    public UpdateTaskFlowEdgesResponse updateTaskFlowEdges(UpdateTaskFlowEdgesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskFlowEdgesWithOptions(request, runtime);
    }

    /**
     * @summary Updates the name and description of a task flow.
     *
     * @param request UpdateTaskFlowNameAndDescRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskFlowNameAndDescResponse
     */
    public UpdateTaskFlowNameAndDescResponse updateTaskFlowNameAndDescWithOptions(UpdateTaskFlowNameAndDescRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagName)) {
            query.put("DagName", request.dagName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskFlowNameAndDesc"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskFlowNameAndDescResponse());
    }

    /**
     * @summary Updates the name and description of a task flow.
     *
     * @param request UpdateTaskFlowNameAndDescRequest
     * @return UpdateTaskFlowNameAndDescResponse
     */
    public UpdateTaskFlowNameAndDescResponse updateTaskFlowNameAndDesc(UpdateTaskFlowNameAndDescRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskFlowNameAndDescWithOptions(request, runtime);
    }

    /**
     * @summary Updates the notification settings for task flows.
     *
     * @param request UpdateTaskFlowNotificationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskFlowNotificationResponse
     */
    public UpdateTaskFlowNotificationResponse updateTaskFlowNotificationWithOptions(UpdateTaskFlowNotificationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagNotificationFail)) {
            query.put("DagNotificationFail", request.dagNotificationFail);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagNotificationSla)) {
            query.put("DagNotificationSla", request.dagNotificationSla);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagNotificationSuccess)) {
            query.put("DagNotificationSuccess", request.dagNotificationSuccess);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskFlowNotification"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskFlowNotificationResponse());
    }

    /**
     * @summary Updates the notification settings for task flows.
     *
     * @param request UpdateTaskFlowNotificationRequest
     * @return UpdateTaskFlowNotificationResponse
     */
    public UpdateTaskFlowNotificationResponse updateTaskFlowNotification(UpdateTaskFlowNotificationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskFlowNotificationWithOptions(request, runtime);
    }

    /**
     * @summary Changes the owner of a task flow.
     *
     * @description Note: The new owner of the task flow must belong to the same tenant as the previous owner.
     *
     * @param request UpdateTaskFlowOwnerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskFlowOwnerResponse
     */
    public UpdateTaskFlowOwnerResponse updateTaskFlowOwnerWithOptions(UpdateTaskFlowOwnerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newOwnerId)) {
            query.put("NewOwnerId", request.newOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskFlowOwner"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskFlowOwnerResponse());
    }

    /**
     * @summary Changes the owner of a task flow.
     *
     * @description Note: The new owner of the task flow must belong to the same tenant as the previous owner.
     *
     * @param request UpdateTaskFlowOwnerRequest
     * @return UpdateTaskFlowOwnerResponse
     */
    public UpdateTaskFlowOwnerResponse updateTaskFlowOwner(UpdateTaskFlowOwnerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskFlowOwnerWithOptions(request, runtime);
    }

    /**
     * @summary Fully updates the edges of a task flow.
     *
     * @description You can call this operation to perform a full update. For incremental updates, see AddTaskFlowEdges, UpdateTaskFlowEdges, and DeleteTaskFlowEdgesByMultiCondition.
     *
     * @param tmpReq UpdateTaskFlowRelationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskFlowRelationsResponse
     */
    public UpdateTaskFlowRelationsResponse updateTaskFlowRelationsWithOptions(UpdateTaskFlowRelationsRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateTaskFlowRelationsShrinkRequest request = new UpdateTaskFlowRelationsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.edges)) {
            request.edgesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.edges, "Edges", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.edgesShrink)) {
            query.put("Edges", request.edgesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskFlowRelations"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskFlowRelationsResponse());
    }

    /**
     * @summary Fully updates the edges of a task flow.
     *
     * @description You can call this operation to perform a full update. For incremental updates, see AddTaskFlowEdges, UpdateTaskFlowEdges, and DeleteTaskFlowEdgesByMultiCondition.
     *
     * @param request UpdateTaskFlowRelationsRequest
     * @return UpdateTaskFlowRelationsResponse
     */
    public UpdateTaskFlowRelationsResponse updateTaskFlowRelations(UpdateTaskFlowRelationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskFlowRelationsWithOptions(request, runtime);
    }

    /**
     * @summary Updates the scheduling properties for a task flow.
     *
     * @description You can call this operation to update the scheduling properties for a task flow in the editing state. You can configure a **timed scheduling** task flow or an **event scheduling** task flow. When you configure a **timed scheduling** task flow, you can choose from one-time scheduling or periodic scheduling. When you configure an **event scheduling** task flow, you can subscribe to task flows or task flow nodes.****\\
     * After you update the scheduling properties, you need to publish and deploy the task flow again. The new task flow instance will run based on the updated scheduling properties.
     *
     * @param request UpdateTaskFlowScheduleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskFlowScheduleResponse
     */
    public UpdateTaskFlowScheduleResponse updateTaskFlowScheduleWithOptions(UpdateTaskFlowScheduleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cronBeginDate)) {
            query.put("CronBeginDate", request.cronBeginDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronEndDate)) {
            query.put("CronEndDate", request.cronEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronStr)) {
            query.put("CronStr", request.cronStr);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronType)) {
            query.put("CronType", request.cronType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleParam)) {
            query.put("ScheduleParam", request.scheduleParam);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scheduleSwitch)) {
            query.put("ScheduleSwitch", request.scheduleSwitch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeZoneId)) {
            query.put("TimeZoneId", request.timeZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.triggerType)) {
            query.put("TriggerType", request.triggerType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskFlowSchedule"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskFlowScheduleResponse());
    }

    /**
     * @summary Updates the scheduling properties for a task flow.
     *
     * @description You can call this operation to update the scheduling properties for a task flow in the editing state. You can configure a **timed scheduling** task flow or an **event scheduling** task flow. When you configure a **timed scheduling** task flow, you can choose from one-time scheduling or periodic scheduling. When you configure an **event scheduling** task flow, you can subscribe to task flows or task flow nodes.****\\
     * After you update the scheduling properties, you need to publish and deploy the task flow again. The new task flow instance will run based on the updated scheduling properties.
     *
     * @param request UpdateTaskFlowScheduleRequest
     * @return UpdateTaskFlowScheduleResponse
     */
    public UpdateTaskFlowScheduleResponse updateTaskFlowSchedule(UpdateTaskFlowScheduleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskFlowScheduleWithOptions(request, runtime);
    }

    /**
     * @summary Updates the time variables for a task flow.
     *
     * @param request UpdateTaskFlowTimeVariablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskFlowTimeVariablesResponse
     */
    public UpdateTaskFlowTimeVariablesResponse updateTaskFlowTimeVariablesWithOptions(UpdateTaskFlowTimeVariablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dagId)) {
            query.put("DagId", request.dagId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeVariables)) {
            query.put("TimeVariables", request.timeVariables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskFlowTimeVariables"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskFlowTimeVariablesResponse());
    }

    /**
     * @summary Updates the time variables for a task flow.
     *
     * @param request UpdateTaskFlowTimeVariablesRequest
     * @return UpdateTaskFlowTimeVariablesResponse
     */
    public UpdateTaskFlowTimeVariablesResponse updateTaskFlowTimeVariables(UpdateTaskFlowTimeVariablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskFlowTimeVariablesWithOptions(request, runtime);
    }

    /**
     * @summary Updates the name of a specified task.
     *
     * @param request UpdateTaskNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskNameResponse
     */
    public UpdateTaskNameResponse updateTaskNameWithOptions(UpdateTaskNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeName)) {
            query.put("NodeName", request.nodeName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskName"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskNameResponse());
    }

    /**
     * @summary Updates the name of a specified task.
     *
     * @param request UpdateTaskNameRequest
     * @return UpdateTaskNameResponse
     */
    public UpdateTaskNameResponse updateTaskName(UpdateTaskNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskNameWithOptions(request, runtime);
    }

    /**
     * @summary Updates the output variables for a specified task node.
     *
     * @description Only nodes of single-instance SQL assignment, script code, and ECS remote command have output variables.
     *
     * @param request UpdateTaskOutputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskOutputResponse
     */
    public UpdateTaskOutputResponse updateTaskOutputWithOptions(UpdateTaskOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeOutput)) {
            query.put("NodeOutput", request.nodeOutput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskOutput"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskOutputResponse());
    }

    /**
     * @summary Updates the output variables for a specified task node.
     *
     * @description Only nodes of single-instance SQL assignment, script code, and ECS remote command have output variables.
     *
     * @param request UpdateTaskOutputRequest
     * @return UpdateTaskOutputResponse
     */
    public UpdateTaskOutputResponse updateTaskOutput(UpdateTaskOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskOutputWithOptions(request, runtime);
    }

    /**
     * @summary Updates time variables for a task.
     *
     * @param request UpdateTaskTimeVariablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTaskTimeVariablesResponse
     */
    public UpdateTaskTimeVariablesResponse updateTaskTimeVariablesWithOptions(UpdateTaskTimeVariablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nodeId)) {
            query.put("NodeId", request.nodeId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tid)) {
            query.put("Tid", request.tid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeVariables)) {
            query.put("TimeVariables", request.timeVariables);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTaskTimeVariables"),
            new TeaPair("version", "2018-11-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTaskTimeVariablesResponse());
    }

    /**
     * @summary Updates time variables for a task.
     *
     * @param request UpdateTaskTimeVariablesRequest
     * @return UpdateTaskTimeVariablesResponse
     */
    public UpdateTaskTimeVariablesResponse updateTaskTimeVariables(UpdateTaskTimeVariablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateTaskTimeVariablesWithOptions(request, runtime);
    }

    /**
     * @summary Updates user information.
     *
     * @param request UpdateUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUserWithOptions(UpdateUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
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

    /**
     * @summary Updates user information.
     *
     * @param request UpdateUserRequest
     * @return UpdateUserResponse
     */
    public UpdateUserResponse updateUser(UpdateUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateUserWithOptions(request, runtime);
    }
}
