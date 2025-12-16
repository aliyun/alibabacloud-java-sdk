// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201;

import com.aliyun.tea.*;
import com.aliyun.adb20211201.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-qingdao", "adb.aliyuncs.com"),
            new TeaPair("cn-beijing", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "adb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "adb.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "adb.aliyuncs.com"),
            new TeaPair("us-west-1", "adb.aliyuncs.com"),
            new TeaPair("us-east-1", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "adb.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "adb.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "adb.ap-northeast-1.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "adb.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "adb.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "adb.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-edge-1", "adb.aliyuncs.com"),
            new TeaPair("cn-fujian", "adb.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "adb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "adb.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "adb.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "adb.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "adb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-wuhan", "adb.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "adb.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "adb.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "adb.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "adb.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "adb.ap-northeast-1.aliyuncs.com"),
            new TeaPair("me-east-1", "adb.ap-northeast-1.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "adb.ap-northeast-1.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("adb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Applies for a public endpoint for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request AllocateClusterPublicConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllocateClusterPublicConnectionResponse
     */
    public AllocateClusterPublicConnectionResponse allocateClusterPublicConnectionWithOptions(AllocateClusterPublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionStringPrefix)) {
            query.put("ConnectionStringPrefix", request.connectionStringPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AllocateClusterPublicConnection"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateClusterPublicConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Applies for a public endpoint for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request AllocateClusterPublicConnectionRequest
     * @return AllocateClusterPublicConnectionResponse
     */
    public AllocateClusterPublicConnectionResponse allocateClusterPublicConnection(AllocateClusterPublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateClusterPublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Applies an optimization suggestion.</p>
     * 
     * @param request ApplyAdviceByIdRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ApplyAdviceByIdResponse
     */
    public ApplyAdviceByIdResponse applyAdviceByIdWithOptions(ApplyAdviceByIdRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adviceDate)) {
            query.put("AdviceDate", request.adviceDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adviceId)) {
            query.put("AdviceId", request.adviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyType)) {
            query.put("ApplyType", request.applyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildImmediately)) {
            query.put("BuildImmediately", request.buildImmediately);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ApplyAdviceById"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ApplyAdviceByIdResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Applies an optimization suggestion.</p>
     * 
     * @param request ApplyAdviceByIdRequest
     * @return ApplyAdviceByIdResponse
     */
    public ApplyAdviceByIdResponse applyAdviceById(ApplyAdviceByIdRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.applyAdviceByIdWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches an elastic network interface (ENI) to an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request AttachUserENIRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AttachUserENIResponse
     */
    public AttachUserENIResponse attachUserENIWithOptions(AttachUserENIRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AttachUserENI"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AttachUserENIResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Attaches an elastic network interface (ENI) to an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request AttachUserENIRequest
     * @return AttachUserENIResponse
     */
    public AttachUserENIResponse attachUserENI(AttachUserENIRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.attachUserENIWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Applies optimization suggestions.</p>
     * 
     * @param request BatchApplyAdviceByIdListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchApplyAdviceByIdListResponse
     */
    public BatchApplyAdviceByIdListResponse batchApplyAdviceByIdListWithOptions(BatchApplyAdviceByIdListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adviceDate)) {
            query.put("AdviceDate", request.adviceDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adviceIdList)) {
            query.put("AdviceIdList", request.adviceIdList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.applyType)) {
            query.put("ApplyType", request.applyType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.buildImmediately)) {
            query.put("BuildImmediately", request.buildImmediately);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchApplyAdviceByIdList"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchApplyAdviceByIdListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Applies optimization suggestions.</p>
     * 
     * @param request BatchApplyAdviceByIdListRequest
     * @return BatchApplyAdviceByIdListResponse
     */
    public BatchApplyAdviceByIdListResponse batchApplyAdviceByIdList(BatchApplyAdviceByIdListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.batchApplyAdviceByIdListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a standard account of an AnalyticDB for MySQL cluster with a Resource Access Management (RAM) user.</p>
     * 
     * @param request BindAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindAccountResponse
     */
    public BindAccountResponse bindAccountWithOptions(BindAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ramUser)) {
            query.put("RamUser", request.ramUser);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindAccount"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a standard account of an AnalyticDB for MySQL cluster with a Resource Access Management (RAM) user.</p>
     * 
     * @param request BindAccountRequest
     * @return BindAccountResponse
     */
    public BindAccountResponse bindAccount(BindAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a resource group with a database account.</p>
     * 
     * @param request BindDBResourceGroupWithUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindDBResourceGroupWithUserResponse
     */
    public BindDBResourceGroupWithUserResponse bindDBResourceGroupWithUserWithOptions(BindDBResourceGroupWithUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupUser)) {
            query.put("GroupUser", request.groupUser);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindDBResourceGroupWithUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindDBResourceGroupWithUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Associates a resource group with a database account.</p>
     * 
     * @param request BindDBResourceGroupWithUserRequest
     * @return BindDBResourceGroupWithUserResponse
     */
    public BindDBResourceGroupWithUserResponse bindDBResourceGroupWithUser(BindDBResourceGroupWithUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindDBResourceGroupWithUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Terminates part of the code in a Spark job.</p>
     * 
     * @param request CancelSparkReplStatementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelSparkReplStatementResponse
     */
    public CancelSparkReplStatementResponse cancelSparkReplStatementWithOptions(CancelSparkReplStatementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statementId)) {
            body.put("StatementId", request.statementId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelSparkReplStatement"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelSparkReplStatementResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Terminates part of the code in a Spark job.</p>
     * 
     * @param request CancelSparkReplStatementRequest
     * @return CancelSparkReplStatementResponse
     */
    public CancelSparkReplStatementResponse cancelSparkReplStatement(CancelSparkReplStatementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelSparkReplStatementWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the execution of a Spark SQL statement.</p>
     * 
     * @param request CancelSparkWarehouseBatchSQLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelSparkWarehouseBatchSQLResponse
     */
    public CancelSparkWarehouseBatchSQLResponse cancelSparkWarehouseBatchSQLWithOptions(CancelSparkWarehouseBatchSQLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agency)) {
            body.put("Agency", request.agency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryId)) {
            body.put("QueryId", request.queryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelSparkWarehouseBatchSQL"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelSparkWarehouseBatchSQLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Cancels the execution of a Spark SQL statement.</p>
     * 
     * @param request CancelSparkWarehouseBatchSQLRequest
     * @return CancelSparkWarehouseBatchSQLResponse
     */
    public CancelSparkWarehouseBatchSQLResponse cancelSparkWarehouseBatchSQL(CancelSparkWarehouseBatchSQLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelSparkWarehouseBatchSQLWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a database account of an AnalyticDB for MySQL cluster is associated with a Resource Access Management (RAM) user.</p>
     * 
     * @param request CheckBindRamUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckBindRamUserResponse
     */
    public CheckBindRamUserResponse checkBindRamUserWithOptions(CheckBindRamUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckBindRamUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckBindRamUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a database account of an AnalyticDB for MySQL cluster is associated with a Resource Access Management (RAM) user.</p>
     * 
     * @param request CheckBindRamUserRequest
     * @return CheckBindRamUserResponse
     */
    public CheckBindRamUserResponse checkBindRamUser(CheckBindRamUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkBindRamUserWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request CheckSampleDataSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckSampleDataSetResponse
     */
    public CheckSampleDataSetResponse checkSampleDataSetWithOptions(CheckSampleDataSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckSampleDataSet"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckSampleDataSetResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * @param request CheckSampleDataSetRequest
     * @return CheckSampleDataSetResponse
     */
    public CheckSampleDataSetResponse checkSampleDataSet(CheckSampleDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkSampleDataSetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the export destination (SLS or OSS) at the instance level. The configuration is unique per instance and follows the &quot;configure once, use multiple times&quot; principle.</p>
     * 
     * @param tmpReq ConfigureResultExportRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ConfigureResultExportResponse
     */
    public ConfigureResultExportResponse configureResultExportWithOptions(ConfigureResultExportRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ConfigureResultExportShrinkRequest request = new ConfigureResultExportShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ossInfo)) {
            request.ossInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ossInfo, "OssInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.slsInfo)) {
            request.slsInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.slsInfo, "SlsInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportType)) {
            body.put("ExportType", request.exportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossInfoShrink)) {
            body.put("OssInfo", request.ossInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsInfoShrink)) {
            body.put("SlsInfo", request.slsInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ConfigureResultExport"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ConfigureResultExportResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the export destination (SLS or OSS) at the instance level. The configuration is unique per instance and follows the &quot;configure once, use multiple times&quot; principle.</p>
     * 
     * @param request ConfigureResultExportRequest
     * @return ConfigureResultExportResponse
     */
    public ConfigureResultExportResponse configureResultExport(ConfigureResultExportRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.configureResultExportWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB Pipeline Service (APS) job.</p>
     * 
     * @param request CreateAPSJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAPSJobResponse
     */
    public CreateAPSJobResponse createAPSJobWithOptions(CreateAPSJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apsJobName)) {
            body.put("ApsJobName", request.apsJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbList)) {
            body.put("DbList", request.dbList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointInstanceID)) {
            body.put("DestinationEndpointInstanceID", request.destinationEndpointInstanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointPassword)) {
            body.put("DestinationEndpointPassword", request.destinationEndpointPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destinationEndpointUserName)) {
            body.put("DestinationEndpointUserName", request.destinationEndpointUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionList)) {
            body.put("PartitionList", request.partitionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointInstanceID)) {
            body.put("SourceEndpointInstanceID", request.sourceEndpointInstanceID);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointPassword)) {
            body.put("SourceEndpointPassword", request.sourceEndpointPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointRegion)) {
            body.put("SourceEndpointRegion", request.sourceEndpointRegion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceEndpointUserName)) {
            body.put("SourceEndpointUserName", request.sourceEndpointUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTableMode)) {
            body.put("TargetTableMode", request.targetTableMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAPSJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAPSJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB Pipeline Service (APS) job.</p>
     * 
     * @param request CreateAPSJobRequest
     * @return CreateAPSJobResponse
     */
    public CreateAPSJobResponse createAPSJob(CreateAPSJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAPSJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a database account for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request CreateAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccountWithOptions(CreateAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountDescription)) {
            query.put("AccountDescription", request.accountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountType)) {
            query.put("AccountType", request.accountType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccount"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a database account for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request CreateAccountRequest
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB Pipeline Service (APS) replication job.</p>
     * 
     * @param request CreateApsCopyWorkloadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApsCopyWorkloadResponse
     */
    public CreateApsCopyWorkloadResponse createApsCopyWorkloadWithOptions(CreateApsCopyWorkloadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceId)) {
            body.put("DatasourceId", request.datasourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadId)) {
            body.put("WorkloadId", request.workloadId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadType)) {
            body.put("WorkloadType", request.workloadType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApsCopyWorkload"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApsCopyWorkloadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB Pipeline Service (APS) replication job.</p>
     * 
     * @param request CreateApsCopyWorkloadRequest
     * @return CreateApsCopyWorkloadResponse
     */
    public CreateApsCopyWorkloadResponse createApsCopyWorkload(CreateApsCopyWorkloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApsCopyWorkloadWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB Pipeline Service (APS) data source.</p>
     * 
     * @param tmpReq CreateApsDatasoureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApsDatasoureResponse
     */
    public CreateApsDatasoureResponse createApsDatasoureWithOptions(CreateApsDatasoureRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateApsDatasoureShrinkRequest request = new CreateApsDatasoureShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.databricksInfo)) {
            request.databricksInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.databricksInfo, "DatabricksInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hiveInfo)) {
            request.hiveInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hiveInfo, "HiveInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.kafkaInfo)) {
            request.kafkaInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.kafkaInfo, "KafkaInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.polarDBMysqlInfo)) {
            request.polarDBMysqlInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.polarDBMysqlInfo, "PolarDBMysqlInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.polarDBXInfo)) {
            request.polarDBXInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.polarDBXInfo, "PolarDBXInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rdsMysqlInfo)) {
            request.rdsMysqlInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rdsMysqlInfo, "RdsMysqlInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.slsInfo)) {
            request.slsInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.slsInfo, "SlsInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databricksInfoShrink)) {
            body.put("DatabricksInfo", request.databricksInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceDescription)) {
            body.put("DatasourceDescription", request.datasourceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceName)) {
            body.put("DatasourceName", request.datasourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceType)) {
            body.put("DatasourceType", request.datasourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hiveInfoShrink)) {
            body.put("HiveInfo", request.hiveInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaInfoShrink)) {
            body.put("KafkaInfo", request.kafkaInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            body.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.polarDBMysqlInfoShrink)) {
            body.put("PolarDBMysqlInfo", request.polarDBMysqlInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.polarDBXInfoShrink)) {
            body.put("PolarDBXInfo", request.polarDBXInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsMysqlInfoShrink)) {
            body.put("RdsMysqlInfo", request.rdsMysqlInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsInfoShrink)) {
            body.put("SlsInfo", request.slsInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApsDatasoure"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApsDatasoureResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB Pipeline Service (APS) data source.</p>
     * 
     * @param request CreateApsDatasoureRequest
     * @return CreateApsDatasoureResponse
     */
    public CreateApsDatasoureResponse createApsDatasoure(CreateApsDatasoureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApsDatasoureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB Pipeline Service (APS) job from a Hive data source.</p>
     * 
     * @param request CreateApsHiveJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApsHiveJobResponse
     */
    public CreateApsHiveJobResponse createApsHiveJobWithOptions(CreateApsHiveJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.advancedConfig)) {
            body.put("AdvancedConfig", request.advancedConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.conflictStrategy)) {
            body.put("ConflictStrategy", request.conflictStrategy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceId)) {
            body.put("DatasourceId", request.datasourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullComputeUnit)) {
            body.put("FullComputeUnit", request.fullComputeUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossLocation)) {
            body.put("OssLocation", request.ossLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parallelism)) {
            body.put("Parallelism", request.parallelism);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroup)) {
            body.put("ResourceGroup", request.resourceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncAllowExpression)) {
            body.put("SyncAllowExpression", request.syncAllowExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncDenyExpression)) {
            body.put("SyncDenyExpression", request.syncDenyExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            body.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadName)) {
            body.put("WorkloadName", request.workloadName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApsHiveJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApsHiveJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB Pipeline Service (APS) job from a Hive data source.</p>
     * 
     * @param request CreateApsHiveJobRequest
     * @return CreateApsHiveJobResponse
     */
    public CreateApsHiveJobResponse createApsHiveJob(CreateApsHiveJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApsHiveJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data ingestion task to load data from an Apache Kafka topic into an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param tmpReq CreateApsKafkaHudiJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApsKafkaHudiJobResponse
     */
    public CreateApsKafkaHudiJobResponse createApsKafkaHudiJobWithOptions(CreateApsKafkaHudiJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateApsKafkaHudiJobShrinkRequest request = new CreateApsKafkaHudiJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columns)) {
            request.columnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columns, "Columns", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partitionSpecs)) {
            request.partitionSpecsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partitionSpecs, "PartitionSpecs", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrossRole)) {
            body.put("AcrossRole", request.acrossRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acrossUid)) {
            body.put("AcrossUid", request.acrossUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.advancedConfig)) {
            body.put("AdvancedConfig", request.advancedConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnsShrink)) {
            body.put("Columns", request.columnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataFormatType)) {
            body.put("DataFormatType", request.dataFormatType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataOutputFormat)) {
            body.put("DataOutputFormat", request.dataOutputFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceId)) {
            body.put("DatasourceId", request.datasourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullComputeUnit)) {
            body.put("FullComputeUnit", request.fullComputeUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hudiAdvancedConfig)) {
            body.put("HudiAdvancedConfig", request.hudiAdvancedConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incrementalComputeUnit)) {
            body.put("IncrementalComputeUnit", request.incrementalComputeUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jsonParseLevel)) {
            body.put("JsonParseLevel", request.jsonParseLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaClusterId)) {
            body.put("KafkaClusterId", request.kafkaClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaTopic)) {
            body.put("KafkaTopic", request.kafkaTopic);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lakehouseId)) {
            body.put("LakehouseId", request.lakehouseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxOffsetsPerTrigger)) {
            body.put("MaxOffsetsPerTrigger", request.maxOffsetsPerTrigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossLocation)) {
            body.put("OssLocation", request.ossLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputFormat)) {
            body.put("OutputFormat", request.outputFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionSpecsShrink)) {
            body.put("PartitionSpecs", request.partitionSpecsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryKeyDefinition)) {
            body.put("PrimaryKeyDefinition", request.primaryKeyDefinition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroup)) {
            body.put("ResourceGroup", request.resourceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRegionId)) {
            body.put("SourceRegionId", request.sourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startingOffsets)) {
            body.put("StartingOffsets", request.startingOffsets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetGenerateRule)) {
            body.put("TargetGenerateRule", request.targetGenerateRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            body.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadName)) {
            body.put("WorkloadName", request.workloadName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApsKafkaHudiJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApsKafkaHudiJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a data ingestion task to load data from an Apache Kafka topic into an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request CreateApsKafkaHudiJobRequest
     * @return CreateApsKafkaHudiJobResponse
     */
    public CreateApsKafkaHudiJobResponse createApsKafkaHudiJob(CreateApsKafkaHudiJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApsKafkaHudiJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB Pipeline Service (APS) job from Simple Log Service (SLS) to an AnalyticDB for MySQL Data Warehouse Edition cluster.</p>
     * 
     * @param tmpReq CreateApsSlsADBJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApsSlsADBJobResponse
     */
    public CreateApsSlsADBJobResponse createApsSlsADBJobWithOptions(CreateApsSlsADBJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateApsSlsADBJobShrinkRequest request = new CreateApsSlsADBJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columns)) {
            request.columnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columns, "Columns", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partitionSpecs)) {
            request.partitionSpecsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partitionSpecs, "PartitionSpecs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.unixTimestampConvert)) {
            request.unixTimestampConvertShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.unixTimestampConvert, "UnixTimestampConvert", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acrossRole)) {
            body.put("AcrossRole", request.acrossRole);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.acrossUid)) {
            body.put("AcrossUid", request.acrossUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.advancedConfig)) {
            body.put("AdvancedConfig", request.advancedConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnsShrink)) {
            body.put("Columns", request.columnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceId)) {
            body.put("DatasourceId", request.datasourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dirtyDataHandleMode)) {
            body.put("DirtyDataHandleMode", request.dirtyDataHandleMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dirtyDataProcessPattern)) {
            body.put("DirtyDataProcessPattern", request.dirtyDataProcessPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exactlyOnce)) {
            body.put("ExactlyOnce", request.exactlyOnce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullComputeUnit)) {
            body.put("FullComputeUnit", request.fullComputeUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hudiAdvancedConfig)) {
            body.put("HudiAdvancedConfig", request.hudiAdvancedConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.incrementalComputeUnit)) {
            body.put("IncrementalComputeUnit", request.incrementalComputeUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lakehouseId)) {
            body.put("LakehouseId", request.lakehouseId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxOffsetsPerTrigger)) {
            body.put("MaxOffsetsPerTrigger", request.maxOffsetsPerTrigger);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossLocation)) {
            body.put("OssLocation", request.ossLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.outputFormat)) {
            body.put("OutputFormat", request.outputFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionSpecsShrink)) {
            body.put("PartitionSpecs", request.partitionSpecsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.primaryKeyDefinition)) {
            body.put("PrimaryKeyDefinition", request.primaryKeyDefinition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.project)) {
            body.put("Project", request.project);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroup)) {
            body.put("ResourceGroup", request.resourceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceRegionId)) {
            body.put("SourceRegionId", request.sourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startingOffsets)) {
            body.put("StartingOffsets", request.startingOffsets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.store)) {
            body.put("Store", request.store);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetGenerateRule)) {
            body.put("TargetGenerateRule", request.targetGenerateRule);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetType)) {
            body.put("TargetType", request.targetType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unixTimestampConvertShrink)) {
            body.put("UnixTimestampConvert", request.unixTimestampConvertShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadName)) {
            body.put("WorkloadName", request.workloadName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApsSlsADBJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApsSlsADBJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB Pipeline Service (APS) job from Simple Log Service (SLS) to an AnalyticDB for MySQL Data Warehouse Edition cluster.</p>
     * 
     * @param request CreateApsSlsADBJobRequest
     * @return CreateApsSlsADBJobResponse
     */
    public CreateApsSlsADBJobResponse createApsSlsADBJob(CreateApsSlsADBJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApsSlsADBJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a new webhook for the specified cluster or task type.</p>
     * 
     * @param tmpReq CreateApsWebhookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateApsWebhookResponse
     */
    public CreateApsWebhookResponse createApsWebhookWithOptions(CreateApsWebhookRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateApsWebhookShrinkRequest request = new CreateApsWebhookShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.webhook)) {
            request.webhookShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.webhook, "Webhook", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookShrink)) {
            body.put("Webhook", request.webhookShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateApsWebhook"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateApsWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a new webhook for the specified cluster or task type.</p>
     * 
     * @param request CreateApsWebhookRequest
     * @return CreateApsWebhookResponse
     */
    public CreateApsWebhookResponse createApsWebhook(CreateApsWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createApsWebhookWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/ads/detail/ads_pre">pricing</a> of AnalyticDB for MySQL.</em>* Temporary backups are the same as regular backups in terms of price and retention period of backup sets.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data backup for an AnalyticDB for MySQL instance.</p>
     * 
     * @param request CreateBackupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateBackupResponse
     */
    public CreateBackupResponse createBackupWithOptions(CreateBackupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBackup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBackupResponse());
    }

    /**
     * <b>description</b> :
     * <p><em>Before you call this operation, make sure that you fully understand the billing method and <a href="https://www.aliyun.com/price/product#/ads/detail/ads_pre">pricing</a> of AnalyticDB for MySQL.</em>* Temporary backups are the same as regular backups in terms of price and retention period of backup sets.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a data backup for an AnalyticDB for MySQL instance.</p>
     * 
     * @param request CreateBackupRequest
     * @return CreateBackupResponse
     */
    public CreateBackupResponse createBackup(CreateBackupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createBackupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>CreateDBCluster</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
     * 
     * @param request CreateDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBClusterResponse
     */
    public CreateDBClusterResponse createDBClusterWithOptions(CreateDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupSetId)) {
            query.put("BackupSetId", request.backupSetId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cloneSourceRegionId)) {
            query.put("CloneSourceRegionId", request.cloneSourceRegionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.computeResource)) {
            query.put("ComputeResource", request.computeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterNetworkType)) {
            query.put("DBClusterNetworkType", request.DBClusterNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterVersion)) {
            query.put("DBClusterVersion", request.DBClusterVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.diskEncryption)) {
            query.put("DiskEncryption", request.diskEncryption);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableDefaultResourcePool)) {
            query.put("EnableDefaultResourcePool", request.enableDefaultResourcePool);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSSL)) {
            query.put("EnableSSL", request.enableSSL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kmsId)) {
            query.put("KmsId", request.kmsId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productForm)) {
            query.put("ProductForm", request.productForm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersion)) {
            query.put("ProductVersion", request.productVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedNodeCount)) {
            query.put("ReservedNodeCount", request.reservedNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedNodeSize)) {
            query.put("ReservedNodeSize", request.reservedNodeSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreToTime)) {
            query.put("RestoreToTime", request.restoreToTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.restoreType)) {
            query.put("RestoreType", request.restoreType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryVSwitchId)) {
            query.put("SecondaryVSwitchId", request.secondaryVSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.secondaryZoneId)) {
            query.put("SecondaryZoneId", request.secondaryZoneId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceDbClusterId)) {
            query.put("SourceDbClusterId", request.sourceDbClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageResource)) {
            query.put("StorageResource", request.storageResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.usedTime)) {
            query.put("UsedTime", request.usedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VPCId)) {
            query.put("VPCId", request.VPCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDBCluster"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBClusterResponse());
    }

    /**
     * <b>description</b> :
     * <p>CreateDBCluster</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
     * 
     * @param request CreateDBClusterRequest
     * @return CreateDBClusterResponse
     */
    public CreateDBClusterResponse createDBCluster(CreateDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a resource group for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param tmpReq CreateDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBResourceGroupResponse
     */
    public CreateDBResourceGroupResponse createDBResourceGroupWithOptions(CreateDBResourceGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateDBResourceGroupShrinkRequest request = new CreateDBResourceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.engineParams)) {
            request.engineParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.engineParams, "EngineParams", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.gpuElasticPlan)) {
            request.gpuElasticPlanShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.gpuElasticPlan, "GpuElasticPlan", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rayConfig)) {
            request.rayConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rayConfig, "RayConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rules)) {
            request.rulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rules, "Rules", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoStopInterval)) {
            query.put("AutoStopInterval", request.autoStopInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterMode)) {
            query.put("ClusterMode", request.clusterMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSizeResource)) {
            query.put("ClusterSizeResource", request.clusterSizeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSpot)) {
            query.put("EnableSpot", request.enableSpot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineParamsShrink)) {
            query.put("EngineParams", request.engineParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuElasticPlanShrink)) {
            query.put("GpuElasticPlan", request.gpuElasticPlanShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxClusterCount)) {
            query.put("MaxClusterCount", request.maxClusterCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeResource)) {
            query.put("MaxComputeResource", request.maxComputeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxGpuQuantity)) {
            query.put("MaxGpuQuantity", request.maxGpuQuantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minClusterCount)) {
            query.put("MinClusterCount", request.minClusterCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minComputeResource)) {
            query.put("MinComputeResource", request.minComputeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minGpuQuantity)) {
            query.put("MinGpuQuantity", request.minGpuQuantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rayConfigShrink)) {
            query.put("RayConfig", request.rayConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesShrink)) {
            query.put("Rules", request.rulesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specName)) {
            query.put("SpecName", request.specName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetResourceGroupName)) {
            query.put("TargetResourceGroupName", request.targetResourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDBResourceGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a resource group for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request CreateDBResourceGroupRequest
     * @return CreateDBResourceGroupResponse
     */
    public CreateDBResourceGroupResponse createDBResourceGroup(CreateDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling plan for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request CreateElasticPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateElasticPlanResponse
     */
    public CreateElasticPlanResponse createElasticPlanWithOptions(CreateElasticPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoScale)) {
            query.put("AutoScale", request.autoScale);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cronExpression)) {
            query.put("CronExpression", request.cronExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetSize)) {
            query.put("TargetSize", request.targetSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateElasticPlan"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateElasticPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a scaling plan for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request CreateElasticPlanRequest
     * @return CreateElasticPlanResponse
     */
    public CreateElasticPlanResponse createElasticPlan(CreateElasticPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createElasticPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a lake storage.</p>
     * 
     * @param tmpReq CreateLakeStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLakeStorageResponse
     */
    public CreateLakeStorageResponse createLakeStorageWithOptions(CreateLakeStorageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateLakeStorageShrinkRequest request = new CreateLakeStorageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.permissions)) {
            request.permissionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.permissions, "Permissions", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionsShrink)) {
            body.put("Permissions", request.permissionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLakeStorage"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLakeStorageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a lake storage.</p>
     * 
     * @param request CreateLakeStorageRequest
     * @return CreateLakeStorageResponse
     */
    public CreateLakeStorageResponse createLakeStorage(CreateLakeStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createLakeStorageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a materialized view recommendation task.</p>
     * 
     * @param request CreateMaterializedViewRecommendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateMaterializedViewRecommendResponse
     */
    public CreateMaterializedViewRecommendResponse createMaterializedViewRecommendWithOptions(CreateMaterializedViewRecommendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minRewriteQueryCount)) {
            query.put("MinRewriteQueryCount", request.minRewriteQueryCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minRewriteQueryPattern)) {
            query.put("MinRewriteQueryPattern", request.minRewriteQueryPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanQueriesRange)) {
            query.put("ScanQueriesRange", request.scanQueriesRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulingDay)) {
            query.put("SchedulingDay", request.schedulingDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulingPolicy)) {
            query.put("SchedulingPolicy", request.schedulingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slowQueryThreshold)) {
            query.put("SlowQueryThreshold", request.slowQueryThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specifiedTime)) {
            query.put("SpecifiedTime", request.specifiedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMaterializedViewRecommend"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMaterializedViewRecommendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a materialized view recommendation task.</p>
     * 
     * @param request CreateMaterializedViewRecommendRequest
     * @return CreateMaterializedViewRecommendResponse
     */
    public CreateMaterializedViewRecommendResponse createMaterializedViewRecommend(CreateMaterializedViewRecommendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createMaterializedViewRecommendWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an Object Storage Service (OSS) subdirectory.</p>
     * 
     * @param request CreateOssSubDirectoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateOssSubDirectoryResponse
     */
    public CreateOssSubDirectoryResponse createOssSubDirectoryWithOptions(CreateOssSubDirectoryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.path)) {
            body.put("Path", request.path);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateOssSubDirectory"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateOssSubDirectoryResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates an Object Storage Service (OSS) subdirectory.</p>
     * 
     * @param request CreateOssSubDirectoryRequest
     * @return CreateOssSubDirectoryResponse
     */
    public CreateOssSubDirectoryResponse createOssSubDirectory(CreateOssSubDirectoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createOssSubDirectoryWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom monitoring view.</p>
     * 
     * @param tmpReq CreatePerformanceViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePerformanceViewResponse
     */
    public CreatePerformanceViewResponse createPerformanceViewWithOptions(CreatePerformanceViewRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreatePerformanceViewShrinkRequest request = new CreatePerformanceViewShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.viewDetail)) {
            request.viewDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.viewDetail, "ViewDetail", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.createFromViewType)) {
            query.put("CreateFromViewType", request.createFromViewType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fillOriginViewKeys)) {
            query.put("FillOriginViewKeys", request.fillOriginViewKeys);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewDetailShrink)) {
            query.put("ViewDetail", request.viewDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewName)) {
            query.put("ViewName", request.viewName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePerformanceView"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePerformanceViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a custom monitoring view.</p>
     * 
     * @param request CreatePerformanceViewRequest
     * @return CreatePerformanceViewResponse
     */
    public CreatePerformanceViewResponse createPerformanceView(CreatePerformanceViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createPerformanceViewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Spark application template.</p>
     * 
     * @param request CreateSparkTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSparkTemplateResponse
     */
    public CreateSparkTemplateResponse createSparkTemplateWithOptions(CreateSparkTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parentId)) {
            body.put("ParentId", request.parentId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSparkTemplate"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSparkTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a Spark application template.</p>
     * 
     * @param request CreateSparkTemplateRequest
     * @return CreateSparkTemplateResponse
     */
    public CreateSparkTemplateResponse createSparkTemplate(CreateSparkTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSparkTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a database account from an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DeleteAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccountWithOptions(DeleteAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteAccount"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a database account from an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DeleteAccountRequest
     * @return DeleteAccountResponse
     */
    public DeleteAccountResponse deleteAccount(DeleteAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an AnalyticDB Pipeline Service (APS) data source.</p>
     * 
     * @param request DeleteApsDatasoureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApsDatasoureResponse
     */
    public DeleteApsDatasoureResponse deleteApsDatasoureWithOptions(DeleteApsDatasoureRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceId)) {
            body.put("DatasourceId", request.datasourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApsDatasoure"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApsDatasoureResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes an AnalyticDB Pipeline Service (APS) data source.</p>
     * 
     * @param request DeleteApsDatasoureRequest
     * @return DeleteApsDatasoureResponse
     */
    public DeleteApsDatasoureResponse deleteApsDatasoure(DeleteApsDatasoureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApsDatasoureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Deleting backup sets is an asynchronous operation and may require 10 to 20 minutes to complete.</p>
     * <ul>
     * <li>You can delete up to 100 backup sets at a time. If you want to delete more than 100 backup sets, call this operation twice.</li>
     * <li>To ensure data security, the system forcibly retains one valid backup set. If you want to delete the last backup set, the system prohibits your operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an AnalyticDB Pipeline Service (APS) job.</p>
     * 
     * @param request DeleteApsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApsJobResponse
     */
    public DeleteApsJobResponse deleteApsJobWithOptions(DeleteApsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apsJobId)) {
            body.put("ApsJobId", request.apsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApsJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApsJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Deleting backup sets is an asynchronous operation and may require 10 to 20 minutes to complete.</p>
     * <ul>
     * <li>You can delete up to 100 backup sets at a time. If you want to delete more than 100 backup sets, call this operation twice.</li>
     * <li>To ensure data security, the system forcibly retains one valid backup set. If you want to delete the last backup set, the system prohibits your operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an AnalyticDB Pipeline Service (APS) job.</p>
     * 
     * @param request DeleteApsJobRequest
     * @return DeleteApsJobResponse
     */
    public DeleteApsJobResponse deleteApsJob(DeleteApsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApsJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API allows users to delete an existing webhook configuration by providing <code>RegionId</code>, <code>DBClusterId</code>, and <code>WebhookId</code>. Make sure that the provided parameter values are accurate to avoid deleting important settings by mistake.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specific webhook in a specified cluster.</p>
     * 
     * @param request DeleteApsWebhookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteApsWebhookResponse
     */
    public DeleteApsWebhookResponse deleteApsWebhookWithOptions(DeleteApsWebhookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookId)) {
            body.put("WebhookId", request.webhookId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteApsWebhook"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteApsWebhookResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API allows users to delete an existing webhook configuration by providing <code>RegionId</code>, <code>DBClusterId</code>, and <code>WebhookId</code>. Make sure that the provided parameter values are accurate to avoid deleting important settings by mistake.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a specific webhook in a specified cluster.</p>
     * 
     * @param request DeleteApsWebhookRequest
     * @return DeleteApsWebhookResponse
     */
    public DeleteApsWebhookResponse deleteApsWebhook(DeleteApsWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteApsWebhookWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can delete up to 100 backup sets at a time. If you want to delete more than 100 backup sets, call this operation twice.</p>
     * <ul>
     * <li>To ensure data security, the system forcibly retains one valid backup set. If you want to delete the last backup set, the system prohibits your operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Manually deletes backup sets.</p>
     * 
     * @param request DeleteBackupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteBackupsResponse
     */
    public DeleteBackupsResponse deleteBackupsWithOptions(DeleteBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupIds)) {
            query.put("BackupIds", request.backupIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBackups"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBackupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can delete up to 100 backup sets at a time. If you want to delete more than 100 backup sets, call this operation twice.</p>
     * <ul>
     * <li>To ensure data security, the system forcibly retains one valid backup set. If you want to delete the last backup set, the system prohibits your operation.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Manually deletes backup sets.</p>
     * 
     * @param request DeleteBackupsRequest
     * @return DeleteBackupsResponse
     */
    public DeleteBackupsResponse deleteBackups(DeleteBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteBackupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>You can delete only pay-as-you-go clusters.</li>
     * <li>The cluster that you want to delete must be in the Running state.</li>
     * <li>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DeleteDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDBClusterResponse
     */
    public DeleteDBClusterResponse deleteDBClusterWithOptions(DeleteDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDBCluster"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBClusterResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>You can delete only pay-as-you-go clusters.</li>
     * <li>The cluster that you want to delete must be in the Running state.</li>
     * <li>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DeleteDBClusterRequest
     * @return DeleteDBClusterResponse
     */
    public DeleteDBClusterResponse deleteDBCluster(DeleteDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a resource group from an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DeleteDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDBResourceGroupResponse
     */
    public DeleteDBResourceGroupResponse deleteDBResourceGroupWithOptions(DeleteDBResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDBResourceGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a resource group from an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DeleteDBResourceGroupRequest
     * @return DeleteDBResourceGroupResponse
     */
    public DeleteDBResourceGroupResponse deleteDBResourceGroup(DeleteDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scaling plan from an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DeleteElasticPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteElasticPlanResponse
     */
    public DeleteElasticPlanResponse deleteElasticPlanWithOptions(DeleteElasticPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteElasticPlan"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteElasticPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a scaling plan from an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DeleteElasticPlanRequest
     * @return DeleteElasticPlanResponse
     */
    public DeleteElasticPlanResponse deleteElasticPlan(DeleteElasticPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteElasticPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a lake storage.</p>
     * 
     * @param request DeleteLakeStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteLakeStorageResponse
     */
    public DeleteLakeStorageResponse deleteLakeStorageWithOptions(DeleteLakeStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lakeStorageId)) {
            body.put("LakeStorageId", request.lakeStorageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteLakeStorage"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteLakeStorageResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a lake storage.</p>
     * 
     * @param request DeleteLakeStorageRequest
     * @return DeleteLakeStorageResponse
     */
    public DeleteLakeStorageResponse deleteLakeStorage(DeleteLakeStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteLakeStorageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a materialized view recommendation task.</p>
     * 
     * @param request DeleteMaterializedViewRecommendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteMaterializedViewRecommendResponse
     */
    public DeleteMaterializedViewRecommendResponse deleteMaterializedViewRecommendWithOptions(DeleteMaterializedViewRecommendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMaterializedViewRecommend"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMaterializedViewRecommendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a materialized view recommendation task.</p>
     * 
     * @param request DeleteMaterializedViewRecommendRequest
     * @return DeleteMaterializedViewRecommendResponse
     */
    public DeleteMaterializedViewRecommendResponse deleteMaterializedViewRecommend(DeleteMaterializedViewRecommendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteMaterializedViewRecommendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a monitoring view.</p>
     * 
     * @param request DeletePerformanceViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePerformanceViewResponse
     */
    public DeletePerformanceViewResponse deletePerformanceViewWithOptions(DeletePerformanceViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewName)) {
            query.put("ViewName", request.viewName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePerformanceView"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePerformanceViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a monitoring view.</p>
     * 
     * @param request DeletePerformanceViewRequest
     * @return DeletePerformanceViewResponse
     */
    public DeletePerformanceViewResponse deletePerformanceView(DeletePerformanceViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deletePerformanceViewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes Spark template files.</p>
     * 
     * @param request DeleteSparkTemplateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSparkTemplateResponse
     */
    public DeleteSparkTemplateResponse deleteSparkTemplateWithOptions(DeleteSparkTemplateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSparkTemplate"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSparkTemplateResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes Spark template files.</p>
     * 
     * @param request DeleteSparkTemplateRequest
     * @return DeleteSparkTemplateResponse
     */
    public DeleteSparkTemplateResponse deleteSparkTemplate(DeleteSparkTemplateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSparkTemplateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes Spark template files.</p>
     * 
     * @param request DeleteSparkTemplateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteSparkTemplateFileResponse
     */
    public DeleteSparkTemplateFileResponse deleteSparkTemplateFileWithOptions(DeleteSparkTemplateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSparkTemplateFile"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSparkTemplateFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Deletes Spark template files.</p>
     * 
     * @param request DeleteSparkTemplateFileRequest
     * @return DeleteSparkTemplateFileResponse
     */
    public DeleteSparkTemplateFileResponse deleteSparkTemplateFile(DeleteSparkTemplateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteSparkTemplateFileWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the performance data of a cluster over a time range based on performance metrics. The collection granularity is 30 seconds. This operation allows you to query information about slow queries, such as the SQL query duration, number of scanned rows, and amount of scanned data.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of AnalyticDB for MySQL clusters for AnalyticDB Pipeline Service (APS) federated analytics.</p>
     * 
     * @param request DescribeAPSADBInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAPSADBInstancesResponse
     */
    public DescribeAPSADBInstancesResponse describeAPSADBInstancesWithOptions(DescribeAPSADBInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAPSADBInstances"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAPSADBInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the performance data of a cluster over a time range based on performance metrics. The collection granularity is 30 seconds. This operation allows you to query information about slow queries, such as the SQL query duration, number of scanned rows, and amount of scanned data.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of AnalyticDB for MySQL clusters for AnalyticDB Pipeline Service (APS) federated analytics.</p>
     * 
     * @param request DescribeAPSADBInstancesRequest
     * @return DescribeAPSADBInstancesResponse
     */
    public DescribeAPSADBInstancesResponse describeAPSADBInstances(DescribeAPSADBInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAPSADBInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries abnormal SQL patterns within a time range.</p>
     * 
     * @param request DescribeAbnormalPatternDetectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAbnormalPatternDetectionResponse
     */
    public DescribeAbnormalPatternDetectionResponse describeAbnormalPatternDetectionWithOptions(DescribeAbnormalPatternDetectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAbnormalPatternDetection"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAbnormalPatternDetectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries abnormal SQL patterns within a time range.</p>
     * 
     * @param request DescribeAbnormalPatternDetectionRequest
     * @return DescribeAbnormalPatternDetectionResponse
     */
    public DescribeAbnormalPatternDetectionResponse describeAbnormalPatternDetection(DescribeAbnormalPatternDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAbnormalPatternDetectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the permissions of a database account on all permission levels.</p>
     * 
     * @param request DescribeAccountAllPrivilegesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountAllPrivilegesResponse
     */
    public DescribeAccountAllPrivilegesResponse describeAccountAllPrivilegesWithOptions(DescribeAccountAllPrivilegesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.marker)) {
            query.put("Marker", request.marker);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccountAllPrivileges"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountAllPrivilegesResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the permissions of a database account on all permission levels.</p>
     * 
     * @param request DescribeAccountAllPrivilegesRequest
     * @return DescribeAccountAllPrivilegesResponse
     */
    public DescribeAccountAllPrivilegesResponse describeAccountAllPrivileges(DescribeAccountAllPrivilegesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountAllPrivilegesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the databases, tables, and columns on which a database account has permissions.</p>
     * 
     * @param request DescribeAccountPrivilegeObjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountPrivilegeObjectsResponse
     */
    public DescribeAccountPrivilegeObjectsResponse describeAccountPrivilegeObjectsWithOptions(DescribeAccountPrivilegeObjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnPrivilegeObject)) {
            query.put("ColumnPrivilegeObject", request.columnPrivilegeObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasePrivilegeObject)) {
            query.put("DatabasePrivilegeObject", request.databasePrivilegeObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privilegeType)) {
            query.put("PrivilegeType", request.privilegeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tablePrivilegeObject)) {
            query.put("TablePrivilegeObject", request.tablePrivilegeObject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccountPrivilegeObjects"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountPrivilegeObjectsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the databases, tables, and columns on which a database account has permissions.</p>
     * 
     * @param request DescribeAccountPrivilegeObjectsRequest
     * @return DescribeAccountPrivilegeObjectsResponse
     */
    public DescribeAccountPrivilegeObjectsResponse describeAccountPrivilegeObjects(DescribeAccountPrivilegeObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountPrivilegeObjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取某一ADB账户的权限</p>
     * 
     * @param request DescribeAccountPrivilegesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountPrivilegesResponse
     */
    public DescribeAccountPrivilegesResponse describeAccountPrivilegesWithOptions(DescribeAccountPrivilegesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnPrivilegeObject)) {
            query.put("ColumnPrivilegeObject", request.columnPrivilegeObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databasePrivilegeObject)) {
            query.put("DatabasePrivilegeObject", request.databasePrivilegeObject);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privilegeType)) {
            query.put("PrivilegeType", request.privilegeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tablePrivilegeObject)) {
            query.put("TablePrivilegeObject", request.tablePrivilegeObject);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccountPrivileges"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountPrivilegesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取某一ADB账户的权限</p>
     * 
     * @param request DescribeAccountPrivilegesRequest
     * @return DescribeAccountPrivilegesResponse
     */
    public DescribeAccountPrivilegesResponse describeAccountPrivileges(DescribeAccountPrivilegesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountPrivilegesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the database accounts of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAccountsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAccountsResponse
     */
    public DescribeAccountsResponse describeAccountsWithOptions(DescribeAccountsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccounts"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAccountsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the database accounts of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about table columns for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAdbMySqlColumnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdbMySqlColumnsResponse
     */
    public DescribeAdbMySqlColumnsResponse describeAdbMySqlColumnsWithOptions(DescribeAdbMySqlColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("Schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdbMySqlColumns"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdbMySqlColumnsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about table columns for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAdbMySqlColumnsRequest
     * @return DescribeAdbMySqlColumnsResponse
     */
    public DescribeAdbMySqlColumnsResponse describeAdbMySqlColumns(DescribeAdbMySqlColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdbMySqlColumnsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about table indexes.</p>
     * 
     * @param request DescribeAdbMySqlIndexesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdbMySqlIndexesResponse
     */
    public DescribeAdbMySqlIndexesResponse describeAdbMySqlIndexesWithOptions(DescribeAdbMySqlIndexesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("Schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdbMySqlIndexes"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdbMySqlIndexesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about table indexes.</p>
     * 
     * @param request DescribeAdbMySqlIndexesRequest
     * @return DescribeAdbMySqlIndexesResponse
     */
    public DescribeAdbMySqlIndexesResponse describeAdbMySqlIndexes(DescribeAdbMySqlIndexesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdbMySqlIndexesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of databases for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAdbMySqlSchemasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdbMySqlSchemasResponse
     */
    public DescribeAdbMySqlSchemasResponse describeAdbMySqlSchemasWithOptions(DescribeAdbMySqlSchemasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdbMySqlSchemas"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdbMySqlSchemasResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of databases for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAdbMySqlSchemasRequest
     * @return DescribeAdbMySqlSchemasResponse
     */
    public DescribeAdbMySqlSchemasResponse describeAdbMySqlSchemas(DescribeAdbMySqlSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdbMySqlSchemasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about table metadata.</p>
     * 
     * @param request DescribeAdbMySqlTableMetaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdbMySqlTableMetaResponse
     */
    public DescribeAdbMySqlTableMetaResponse describeAdbMySqlTableMetaWithOptions(DescribeAdbMySqlTableMetaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("Schema", request.schema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdbMySqlTableMeta"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdbMySqlTableMetaResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about table metadata.</p>
     * 
     * @param request DescribeAdbMySqlTableMetaRequest
     * @return DescribeAdbMySqlTableMetaResponse
     */
    public DescribeAdbMySqlTableMetaResponse describeAdbMySqlTableMeta(DescribeAdbMySqlTableMetaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdbMySqlTableMetaWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of tables for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAdbMySqlTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdbMySqlTablesResponse
     */
    public DescribeAdbMySqlTablesResponse describeAdbMySqlTablesWithOptions(DescribeAdbMySqlTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            query.put("Schema", request.schema);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdbMySqlTables"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdbMySqlTablesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of tables for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAdbMySqlTablesRequest
     * @return DescribeAdbMySqlTablesResponse
     */
    public DescribeAdbMySqlTablesResponse describeAdbMySqlTables(DescribeAdbMySqlTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdbMySqlTablesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether the suggestion feature is enabled.</p>
     * 
     * @param request DescribeAdviceServiceEnabledRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAdviceServiceEnabledResponse
     */
    public DescribeAdviceServiceEnabledResponse describeAdviceServiceEnabledWithOptions(DescribeAdviceServiceEnabledRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAdviceServiceEnabled"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAdviceServiceEnabledResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether the suggestion feature is enabled.</p>
     * 
     * @param request DescribeAdviceServiceEnabledRequest
     * @return DescribeAdviceServiceEnabledResponse
     */
    public DescribeAdviceServiceEnabledResponse describeAdviceServiceEnabled(DescribeAdviceServiceEnabledRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAdviceServiceEnabledWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of databases, tables, and columns in an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAllDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAllDataSourceResponse
     */
    public DescribeAllDataSourceResponse describeAllDataSourceWithOptions(DescribeAllDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAllDataSource"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAllDataSourceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of databases, tables, and columns in an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAllDataSourceRequest
     * @return DescribeAllDataSourceResponse
     */
    public DescribeAllDataSourceResponse describeAllDataSource(DescribeAllDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAllDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the applied optimization suggestions for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAppliedAdvicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAppliedAdvicesResponse
     */
    public DescribeAppliedAdvicesResponse describeAppliedAdvicesWithOptions(DescribeAppliedAdvicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adviceType)) {
            query.put("AdviceType", request.adviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaTableName)) {
            query.put("SchemaTableName", request.schemaTableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAppliedAdvices"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAppliedAdvicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the applied optimization suggestions for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAppliedAdvicesRequest
     * @return DescribeAppliedAdvicesResponse
     */
    public DescribeAppliedAdvicesResponse describeAppliedAdvices(DescribeAppliedAdvicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAppliedAdvicesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of a real-time data ingestion job for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeApsActionLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApsActionLogsResponse
     */
    public DescribeApsActionLogsResponse describeApsActionLogsWithOptions(DescribeApsActionLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.stage)) {
            query.put("Stage", request.stage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.state)) {
            query.put("State", request.state);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadId)) {
            query.put("WorkloadId", request.workloadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApsActionLogs"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApsActionLogsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of a real-time data ingestion job for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeApsActionLogsRequest
     * @return DescribeApsActionLogsResponse
     */
    public DescribeApsActionLogsResponse describeApsActionLogs(DescribeApsActionLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApsActionLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an AnalyticDB Pipeline Service (APS) data source.</p>
     * 
     * @param request DescribeApsDatasourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApsDatasourceResponse
     */
    public DescribeApsDatasourceResponse describeApsDatasourceWithOptions(DescribeApsDatasourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceId)) {
            body.put("DatasourceId", request.datasourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApsDatasource"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApsDatasourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an AnalyticDB Pipeline Service (APS) data source.</p>
     * 
     * @param request DescribeApsDatasourceRequest
     * @return DescribeApsDatasourceResponse
     */
    public DescribeApsDatasourceResponse describeApsDatasource(DescribeApsDatasourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApsDatasourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of AnalyticDB Pipeline Service (APS) data sources.</p>
     * 
     * @param request DescribeApsDatasourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApsDatasourcesResponse
     */
    public DescribeApsDatasourcesResponse describeApsDatasourcesWithOptions(DescribeApsDatasourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceName)) {
            body.put("DatasourceName", request.datasourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceType)) {
            body.put("DatasourceType", request.datasourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApsDatasources"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApsDatasourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of AnalyticDB Pipeline Service (APS) data sources.</p>
     * 
     * @param request DescribeApsDatasourcesRequest
     * @return DescribeApsDatasourcesResponse
     */
    public DescribeApsDatasourcesResponse describeApsDatasources(DescribeApsDatasourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApsDatasourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an AnalyticDB Pipeline Service (APS) job from a Hive data source.</p>
     * 
     * @param request DescribeApsHiveWorkloadRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApsHiveWorkloadResponse
     */
    public DescribeApsHiveWorkloadResponse describeApsHiveWorkloadWithOptions(DescribeApsHiveWorkloadRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadId)) {
            body.put("WorkloadId", request.workloadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApsHiveWorkload"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApsHiveWorkloadResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an AnalyticDB Pipeline Service (APS) job from a Hive data source.</p>
     * 
     * @param request DescribeApsHiveWorkloadRequest
     * @return DescribeApsHiveWorkloadResponse
     */
    public DescribeApsHiveWorkloadResponse describeApsHiveWorkload(DescribeApsHiveWorkloadRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApsHiveWorkloadWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an AnalyticDB Pipeline Service (APS) job.</p>
     * 
     * @param request DescribeApsJobDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApsJobDetailResponse
     */
    public DescribeApsJobDetailResponse describeApsJobDetailWithOptions(DescribeApsJobDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apsJobId)) {
            body.put("ApsJobId", request.apsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApsJobDetail"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApsJobDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about an AnalyticDB Pipeline Service (APS) job.</p>
     * 
     * @param request DescribeApsJobDetailRequest
     * @return DescribeApsJobDetailResponse
     */
    public DescribeApsJobDetailResponse describeApsJobDetail(DescribeApsJobDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApsJobDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of AnalyticDB Pipeline Service (APS) jobs.</p>
     * 
     * @param request DescribeApsJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApsJobsResponse
     */
    public DescribeApsJobsResponse describeApsJobsWithOptions(DescribeApsJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apsJobName)) {
            body.put("ApsJobName", request.apsJobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeEnd)) {
            body.put("CreateTimeEnd", request.createTimeEnd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createTimeStart)) {
            body.put("CreateTimeStart", request.createTimeStart);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApsJobs"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApsJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of AnalyticDB Pipeline Service (APS) jobs.</p>
     * 
     * @param request DescribeApsJobsRequest
     * @return DescribeApsJobsResponse
     */
    public DescribeApsJobsResponse describeApsJobs(DescribeApsJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApsJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the workloads of AnalyticDB Pipeline Service (APS) migration jobs.</p>
     * 
     * @param request DescribeApsMigrationWorkloadsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApsMigrationWorkloadsResponse
     */
    public DescribeApsMigrationWorkloadsResponse describeApsMigrationWorkloadsWithOptions(DescribeApsMigrationWorkloadsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossLocation)) {
            body.put("OssLocation", request.ossLocation);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadName)) {
            body.put("WorkloadName", request.workloadName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApsMigrationWorkloads"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApsMigrationWorkloadsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the workloads of AnalyticDB Pipeline Service (APS) migration jobs.</p>
     * 
     * @param request DescribeApsMigrationWorkloadsRequest
     * @return DescribeApsMigrationWorkloadsResponse
     */
    public DescribeApsMigrationWorkloadsResponse describeApsMigrationWorkloads(DescribeApsMigrationWorkloadsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApsMigrationWorkloadsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the progress of an AnalyticDB Pipeline Service (APS) job.</p>
     * 
     * @param request DescribeApsProgressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApsProgressResponse
     */
    public DescribeApsProgressResponse describeApsProgressWithOptions(DescribeApsProgressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadId)) {
            body.put("WorkloadId", request.workloadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApsProgress"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApsProgressResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the progress of an AnalyticDB Pipeline Service (APS) job.</p>
     * 
     * @param request DescribeApsProgressRequest
     * @return DescribeApsProgressResponse
     */
    public DescribeApsProgressResponse describeApsProgress(DescribeApsProgressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApsProgressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about resource groups of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeApsResourceGroupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeApsResourceGroupsResponse
     */
    public DescribeApsResourceGroupsResponse describeApsResourceGroupsWithOptions(DescribeApsResourceGroupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadId)) {
            body.put("WorkloadId", request.workloadId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeApsResourceGroups"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeApsResourceGroupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about resource groups of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeApsResourceGroupsRequest
     * @return DescribeApsResourceGroupsResponse
     */
    public DescribeApsResourceGroupsResponse describeApsResourceGroups(DescribeApsResourceGroupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeApsResourceGroupsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  SQL audit logs can be queried only when SQL audit is enabled. Only SQL audit logs within the last 30 days can be queried. If SQL audit was disabled and re-enabled, only SQL audit logs from the time when SQL audit was re-enabled can be queried. The following operations are not recorded in SQL audit logs: <strong>INSERT INTO VALUES</strong>, <strong>REPLACE INTO VALUES</strong>, and <strong>UPSERT INTO VALUES</strong>.</p>
     * <ul>
     * <li>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the SQL audit logs of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAuditLogRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAuditLogRecordsResponse
     */
    public DescribeAuditLogRecordsResponse describeAuditLogRecordsWithOptions(DescribeAuditLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBName)) {
            query.put("DBName", request.DBName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hostAddress)) {
            query.put("HostAddress", request.hostAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyUser)) {
            query.put("ProxyUser", request.proxyUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryKeyword)) {
            query.put("QueryKeyword", request.queryKeyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlType)) {
            query.put("SqlType", request.sqlType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.succeed)) {
            query.put("Succeed", request.succeed);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAuditLogRecords"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAuditLogRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  SQL audit logs can be queried only when SQL audit is enabled. Only SQL audit logs within the last 30 days can be queried. If SQL audit was disabled and re-enabled, only SQL audit logs from the time when SQL audit was re-enabled can be queried. The following operations are not recorded in SQL audit logs: <strong>INSERT INTO VALUES</strong>, <strong>REPLACE INTO VALUES</strong>, and <strong>UPSERT INTO VALUES</strong>.</p>
     * <ul>
     * <li>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the SQL audit logs of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAuditLogRecordsRequest
     * @return DescribeAuditLogRecordsResponse
     */
    public DescribeAuditLogRecordsResponse describeAuditLogRecords(DescribeAuditLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAuditLogRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询自动续费参数</p>
     * 
     * @param tmpReq DescribeAutoRenewalAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAutoRenewalAttributeResponse
     */
    public DescribeAutoRenewalAttributeResponse describeAutoRenewalAttributeWithOptions(DescribeAutoRenewalAttributeRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeAutoRenewalAttributeShrinkRequest request = new DescribeAutoRenewalAttributeShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.DBClusterId)) {
            request.DBClusterIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.DBClusterId, "DBClusterId", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIdShrink)) {
            query.put("DBClusterId", request.DBClusterIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAutoRenewalAttribute"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAutoRenewalAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询自动续费参数</p>
     * 
     * @param request DescribeAutoRenewalAttributeRequest
     * @return DescribeAutoRenewalAttributeResponse
     */
    public DescribeAutoRenewalAttributeResponse describeAutoRenewalAttribute(DescribeAutoRenewalAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAutoRenewalAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available optimization suggestions for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAvailableAdvicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAvailableAdvicesResponse
     */
    public DescribeAvailableAdvicesResponse describeAvailableAdvicesWithOptions(DescribeAvailableAdvicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.adviceDate)) {
            query.put("AdviceDate", request.adviceDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.adviceType)) {
            query.put("AdviceType", request.adviceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaTableName)) {
            query.put("SchemaTableName", request.schemaTableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableAdvices"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableAdvicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the available optimization suggestions for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeAvailableAdvicesRequest
     * @return DescribeAvailableAdvicesResponse
     */
    public DescribeAvailableAdvicesResponse describeAvailableAdvices(DescribeAvailableAdvicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableAdvicesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>查看集群备份设置</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupPolicy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>查看集群备份设置</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>查询实例备份集</p>
     * 
     * @param request DescribeBackupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupsResponse
     */
    public DescribeBackupsResponse describeBackupsWithOptions(DescribeBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.remote)) {
            query.put("Remote", request.remote);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackups"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBackupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>查询实例备份集</p>
     * 
     * @param request DescribeBackupsRequest
     * @return DescribeBackupsResponse
     */
    public DescribeBackupsResponse describeBackups(DescribeBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the bad SQL statements that affect cluster stability within a time range.</p>
     * 
     * @param request DescribeBadSqlDetectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBadSqlDetectionResponse
     */
    public DescribeBadSqlDetectionResponse describeBadSqlDetectionWithOptions(DescribeBadSqlDetectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBadSqlDetection"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBadSqlDetectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the bad SQL statements that affect cluster stability within a time range.</p>
     * 
     * @param request DescribeBadSqlDetectionRequest
     * @return DescribeBadSqlDetectionResponse
     */
    public DescribeBadSqlDetectionResponse describeBadSqlDetection(DescribeBadSqlDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBadSqlDetectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP address whitelists of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeClusterAccessWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterAccessWhiteListResponse
     */
    public DescribeClusterAccessWhiteListResponse describeClusterAccessWhiteListWithOptions(DescribeClusterAccessWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterAccessWhiteList"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterAccessWhiteListResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the IP address whitelists of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeClusterAccessWhiteListRequest
     * @return DescribeClusterAccessWhiteListResponse
     */
    public DescribeClusterAccessWhiteListResponse describeClusterAccessWhiteList(DescribeClusterAccessWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterAccessWhiteListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the network information about an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeClusterNetInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterNetInfoResponse
     */
    public DescribeClusterNetInfoResponse describeClusterNetInfoWithOptions(DescribeClusterNetInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterNetInfo"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterNetInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the network information about an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeClusterNetInfoRequest
     * @return DescribeClusterNetInfoResponse
     */
    public DescribeClusterNetInfoResponse describeClusterNetInfo(DescribeClusterNetInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterNetInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about resource usage of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeClusterResourceDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterResourceDetailResponse
     */
    public DescribeClusterResourceDetailResponse describeClusterResourceDetailWithOptions(DescribeClusterResourceDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterResourceDetail"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterResourceDetailResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about resource usage of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeClusterResourceDetailRequest
     * @return DescribeClusterResourceDetailResponse
     */
    public DescribeClusterResourceDetailResponse describeClusterResourceDetail(DescribeClusterResourceDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterResourceDetailWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource usage of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeClusterResourceUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeClusterResourceUsageResponse
     */
    public DescribeClusterResourceUsageResponse describeClusterResourceUsageWithOptions(DescribeClusterResourceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeClusterResourceUsage"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeClusterResourceUsageResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource usage of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeClusterResourceUsageRequest
     * @return DescribeClusterResourceUsageResponse
     */
    public DescribeClusterResourceUsageResponse describeClusterResourceUsage(DescribeClusterResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeClusterResourceUsageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of columns in a table.</p>
     * 
     * @param request DescribeColumnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeColumnsResponse
     */
    public DescribeColumnsResponse describeColumnsWithOptions(DescribeColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeColumns"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeColumnsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of columns in a table.</p>
     * 
     * @param request DescribeColumnsRequest
     * @return DescribeColumnsResponse
     */
    public DescribeColumnsResponse describeColumns(DescribeColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeColumnsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the remote build feature is enabled in the query acceleration configuration of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeCompactionServiceSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCompactionServiceSwitchResponse
     */
    public DescribeCompactionServiceSwitchResponse describeCompactionServiceSwitchWithOptions(DescribeCompactionServiceSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeCompactionServiceSwitch"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCompactionServiceSwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether the remote build feature is enabled in the query acceleration configuration of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeCompactionServiceSwitchRequest
     * @return DescribeCompactionServiceSwitchResponse
     */
    public DescribeCompactionServiceSwitchResponse describeCompactionServiceSwitch(DescribeCompactionServiceSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCompactionServiceSwitchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the computing resource usage of a resource group in an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeComputeResourceUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeComputeResourceUsageResponse
     */
    public DescribeComputeResourceUsageResponse describeComputeResourceUsageWithOptions(DescribeComputeResourceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeComputeResourceUsage"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeComputeResourceUsageResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the computing resource usage of a resource group in an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeComputeResourceUsageRequest
     * @return DescribeComputeResourceUsageResponse
     */
    public DescribeComputeResourceUsageResponse describeComputeResourceUsage(DescribeComputeResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeComputeResourceUsageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostic results of the access layer.</p>
     * 
     * @param request DescribeControllerDetectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeControllerDetectionResponse
     */
    public DescribeControllerDetectionResponse describeControllerDetectionWithOptions(DescribeControllerDetectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeControllerDetection"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeControllerDetectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostic results of the access layer.</p>
     * 
     * @param request DescribeControllerDetectionRequest
     * @return DescribeControllerDetectionResponse
     */
    public DescribeControllerDetectionResponse describeControllerDetection(DescribeControllerDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeControllerDetectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeDBClusterAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterAttributeResponse
     */
    public DescribeDBClusterAttributeResponse describeDBClusterAttributeWithOptions(DescribeDBClusterAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterAttribute"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeDBClusterAttributeRequest
     * @return DescribeDBClusterAttributeResponse
     */
    public DescribeDBClusterAttributeResponse describeDBClusterAttribute(DescribeDBClusterAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the health status of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeDBClusterHealthStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterHealthStatusResponse
     */
    public DescribeDBClusterHealthStatusResponse describeDBClusterHealthStatusWithOptions(DescribeDBClusterHealthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterHealthStatus"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterHealthStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the health status of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeDBClusterHealthStatusRequest
     * @return DescribeDBClusterHealthStatusResponse
     */
    public DescribeDBClusterHealthStatusResponse describeDBClusterHealthStatus(DescribeDBClusterHealthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterHealthStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the performance data of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeDBClusterPerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterPerformanceResponse
     */
    public DescribeDBClusterPerformanceResponse describeDBClusterPerformanceWithOptions(DescribeDBClusterPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourcePools)) {
            query.put("ResourcePools", request.resourcePools);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterPerformance"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterPerformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the performance data of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeDBClusterPerformanceRequest
     * @return DescribeDBClusterPerformanceResponse
     */
    public DescribeDBClusterPerformanceResponse describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterPerformanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the SSL configurations of a cluster.</p>
     * 
     * @param request DescribeDBClusterSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterSSLResponse
     */
    public DescribeDBClusterSSLResponse describeDBClusterSSLWithOptions(DescribeDBClusterSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterSSL"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterSSLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the SSL configurations of a cluster.</p>
     * 
     * @param request DescribeDBClusterSSLRequest
     * @return DescribeDBClusterSSLResponse
     */
    public DescribeDBClusterSSLResponse describeDBClusterSSL(DescribeDBClusterSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterSSLWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage overview information of an AnalyticDB for MySQL cluster, such as the total data size, hot data size, cold data size, and data growth.</p>
     * 
     * @param request DescribeDBClusterSpaceSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterSpaceSummaryResponse
     */
    public DescribeDBClusterSpaceSummaryResponse describeDBClusterSpaceSummaryWithOptions(DescribeDBClusterSpaceSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterSpaceSummary"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterSpaceSummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage overview information of an AnalyticDB for MySQL cluster, such as the total data size, hot data size, cold data size, and data growth.</p>
     * 
     * @param request DescribeDBClusterSpaceSummaryRequest
     * @return DescribeDBClusterSpaceSummaryResponse
     */
    public DescribeDBClusterSpaceSummaryResponse describeDBClusterSpaceSummary(DescribeDBClusterSpaceSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterSpaceSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statuses of AnalyticDB for MySQL clusters within a region.</p>
     * 
     * @param request DescribeDBClusterStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterStatusResponse
     */
    public DescribeDBClusterStatusResponse describeDBClusterStatusWithOptions(DescribeDBClusterStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterStatus"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the statuses of AnalyticDB for MySQL clusters within a region.</p>
     * 
     * @param request DescribeDBClusterStatusRequest
     * @return DescribeDBClusterStatusResponse
     */
    public DescribeDBClusterStatusResponse describeDBClusterStatus(DescribeDBClusterStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about AnalyticDB for MySQL Data Lakehouse Edition clusters within a region.</p>
     * 
     * @param request DescribeDBClustersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClustersResponse
     */
    public DescribeDBClustersResponse describeDBClustersWithOptions(DescribeDBClustersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIds)) {
            query.put("DBClusterIds", request.DBClusterIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterStatus)) {
            query.put("DBClusterStatus", request.DBClusterStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterVersion)) {
            query.put("DBClusterVersion", request.DBClusterVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productVersion)) {
            query.put("ProductVersion", request.productVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusters"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClustersResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about AnalyticDB for MySQL Data Lakehouse Edition clusters within a region.</p>
     * 
     * @param request DescribeDBClustersRequest
     * @return DescribeDBClustersResponse
     */
    public DescribeDBClustersResponse describeDBClusters(DescribeDBClustersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClustersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about resource groups of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBResourceGroupResponse
     */
    public DescribeDBResourceGroupResponse describeDBResourceGroupWithOptions(DescribeDBResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBResourceGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about resource groups of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeDBResourceGroupRequest
     * @return DescribeDBResourceGroupResponse
     */
    public DescribeDBResourceGroupResponse describeDBResourceGroup(DescribeDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the deduplicated statistics of resource groups, databases, usernames, and source IP addresses about SQL statements that meet a query condition for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDiagnosisDimensionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnosisDimensionsResponse
     */
    public DescribeDiagnosisDimensionsResponse describeDiagnosisDimensionsWithOptions(DescribeDiagnosisDimensionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCondition)) {
            query.put("QueryCondition", request.queryCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnosisDimensions"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiagnosisDimensionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the deduplicated statistics of resource groups, databases, usernames, and source IP addresses about SQL statements that meet a query condition for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDiagnosisDimensionsRequest
     * @return DescribeDiagnosisDimensionsResponse
     */
    public DescribeDiagnosisDimensionsResponse describeDiagnosisDimensions(DescribeDiagnosisDimensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosisDimensionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the diagnostic information about SQL statements that meet a query condition for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeDiagnosisRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnosisRecordsResponse
     */
    public DescribeDiagnosisRecordsResponse describeDiagnosisRecordsWithOptions(DescribeDiagnosisRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPeakMemory)) {
            query.put("MaxPeakMemory", request.maxPeakMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxScanSize)) {
            query.put("MaxScanSize", request.maxScanSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minPeakMemory)) {
            query.put("MinPeakMemory", request.minPeakMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minScanSize)) {
            query.put("MinScanSize", request.minScanSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patternId)) {
            query.put("PatternId", request.patternId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCondition)) {
            query.put("QueryCondition", request.queryCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroup)) {
            query.put("ResourceGroup", request.resourceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnosisRecords"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiagnosisRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the diagnostic information about SQL statements that meet a query condition for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeDiagnosisRecordsRequest
     * @return DescribeDiagnosisRecordsResponse
     */
    public DescribeDiagnosisRecordsResponse describeDiagnosisRecords(DescribeDiagnosisRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosisRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution information about an SQL statement, including the execution plan, execution information, resource usage, and self-diagnostics results.</p>
     * 
     * @param request DescribeDiagnosisSQLInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnosisSQLInfoResponse
     */
    public DescribeDiagnosisSQLInfoResponse describeDiagnosisSQLInfoWithOptions(DescribeDiagnosisSQLInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processId)) {
            query.put("ProcessId", request.processId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processRcHost)) {
            query.put("ProcessRcHost", request.processRcHost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processStartTime)) {
            query.put("ProcessStartTime", request.processStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processState)) {
            query.put("ProcessState", request.processState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnosisSQLInfo"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiagnosisSQLInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution information about an SQL statement, including the execution plan, execution information, resource usage, and self-diagnostics results.</p>
     * 
     * @param request DescribeDiagnosisSQLInfoRequest
     * @return DescribeDiagnosisSQLInfoResponse
     */
    public DescribeDiagnosisSQLInfoResponse describeDiagnosisSQLInfo(DescribeDiagnosisSQLInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosisSQLInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the last five SQL query download tasks of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDownloadRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDownloadRecordsResponse
     */
    public DescribeDownloadRecordsResponse describeDownloadRecordsWithOptions(DescribeDownloadRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDownloadRecords"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDownloadRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the last five SQL query download tasks of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeDownloadRecordsRequest
     * @return DescribeDownloadRecordsResponse
     */
    public DescribeDownloadRecordsResponse describeDownloadRecords(DescribeDownloadRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a scaling plan for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeElasticPlanAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeElasticPlanAttributeResponse
     */
    public DescribeElasticPlanAttributeResponse describeElasticPlanAttributeWithOptions(DescribeElasticPlanAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElasticPlanAttribute"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticPlanAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a scaling plan for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeElasticPlanAttributeRequest
     * @return DescribeElasticPlanAttributeResponse
     */
    public DescribeElasticPlanAttributeResponse describeElasticPlanAttribute(DescribeElasticPlanAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElasticPlanAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of scaling plan jobs for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeElasticPlanJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeElasticPlanJobsResponse
     */
    public DescribeElasticPlanJobsResponse describeElasticPlanJobsWithOptions(DescribeElasticPlanJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElasticPlanJobs"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticPlanJobsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of scaling plan jobs for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeElasticPlanJobsRequest
     * @return DescribeElasticPlanJobsResponse
     */
    public DescribeElasticPlanJobsResponse describeElasticPlanJobs(DescribeElasticPlanJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElasticPlanJobsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource specifications that are supported by different types of scaling plans of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeElasticPlanSpecificationsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeElasticPlanSpecificationsResponse
     */
    public DescribeElasticPlanSpecificationsResponse describeElasticPlanSpecificationsWithOptions(DescribeElasticPlanSpecificationsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElasticPlanSpecifications"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticPlanSpecificationsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the resource specifications that are supported by different types of scaling plans of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeElasticPlanSpecificationsRequest
     * @return DescribeElasticPlanSpecificationsResponse
     */
    public DescribeElasticPlanSpecificationsResponse describeElasticPlanSpecifications(DescribeElasticPlanSpecificationsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElasticPlanSpecificationsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries scaling plans of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeElasticPlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeElasticPlansResponse
     */
    public DescribeElasticPlansResponse describeElasticPlansWithOptions(DescribeElasticPlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeElasticPlans"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeElasticPlansResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries scaling plans of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeElasticPlansRequest
     * @return DescribeElasticPlansResponse
     */
    public DescribeElasticPlansResponse describeElasticPlans(DescribeElasticPlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeElasticPlansWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the permission level and permissions supported for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeEnabledPrivilegesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEnabledPrivilegesResponse
     */
    public DescribeEnabledPrivilegesResponse describeEnabledPrivilegesWithOptions(DescribeEnabledPrivilegesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEnabledPrivileges"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEnabledPrivilegesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the permission level and permissions supported for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DescribeEnabledPrivilegesRequest
     * @return DescribeEnabledPrivilegesResponse
     */
    public DescribeEnabledPrivilegesResponse describeEnabledPrivileges(DescribeEnabledPrivilegesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEnabledPrivilegesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the disk cache size in the query acceleration configuration of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeEssdCacheConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeEssdCacheConfigResponse
     */
    public DescribeEssdCacheConfigResponse describeEssdCacheConfigWithOptions(DescribeEssdCacheConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeEssdCacheConfig"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeEssdCacheConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the disk cache size in the query acceleration configuration of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeEssdCacheConfigRequest
     * @return DescribeEssdCacheConfigResponse
     */
    public DescribeEssdCacheConfigResponse describeEssdCacheConfig(DescribeEssdCacheConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeEssdCacheConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about tables that have excessive primary key fields in an AnalyticDB for MySQL Data Lakehouse Edition (V5.0) cluster.</p>
     * 
     * @param request DescribeExcessivePrimaryKeysRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExcessivePrimaryKeysResponse
     */
    public DescribeExcessivePrimaryKeysResponse describeExcessivePrimaryKeysWithOptions(DescribeExcessivePrimaryKeysRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExcessivePrimaryKeys"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExcessivePrimaryKeysResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about tables that have excessive primary key fields in an AnalyticDB for MySQL Data Lakehouse Edition (V5.0) cluster.</p>
     * 
     * @param request DescribeExcessivePrimaryKeysRequest
     * @return DescribeExcessivePrimaryKeysResponse
     */
    public DescribeExcessivePrimaryKeysResponse describeExcessivePrimaryKeys(DescribeExcessivePrimaryKeysRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExcessivePrimaryKeysWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostic results of the compute layer.</p>
     * 
     * @param request DescribeExecutorDetectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExecutorDetectionResponse
     */
    public DescribeExecutorDetectionResponse describeExecutorDetectionWithOptions(DescribeExecutorDetectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExecutorDetection"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExecutorDetectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostic results of the compute layer.</p>
     * 
     * @param request DescribeExecutorDetectionRequest
     * @return DescribeExecutorDetectionResponse
     */
    public DescribeExecutorDetectionResponse describeExecutorDetection(DescribeExecutorDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExecutorDetectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Only supports viewing tasks within the last 30 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieve historical task records.</p>
     * 
     * @param request DescribeHistoryTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHistoryTasksResponse
     */
    public DescribeHistoryTasksResponse describeHistoryTasksWithOptions(DescribeHistoryTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromExecTime)) {
            query.put("FromExecTime", request.fromExecTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromStartTime)) {
            query.put("FromStartTime", request.fromStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceType)) {
            query.put("InstanceType", request.instanceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toExecTime)) {
            query.put("ToExecTime", request.toExecTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toStartTime)) {
            query.put("ToStartTime", request.toStartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHistoryTasks"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHistoryTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>Only supports viewing tasks within the last 30 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieve historical task records.</p>
     * 
     * @param request DescribeHistoryTasksRequest
     * @return DescribeHistoryTasksResponse
     */
    public DescribeHistoryTasksResponse describeHistoryTasks(DescribeHistoryTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHistoryTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries task statistics.</p>
     * 
     * @param request DescribeHistoryTasksStatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHistoryTasksStatResponse
     */
    public DescribeHistoryTasksStatResponse describeHistoryTasksStatWithOptions(DescribeHistoryTasksStatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.fromExecTime)) {
            query.put("FromExecTime", request.fromExecTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fromStartTime)) {
            query.put("FromStartTime", request.fromStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityToken)) {
            query.put("SecurityToken", request.securityToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskType)) {
            query.put("TaskType", request.taskType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toExecTime)) {
            query.put("ToExecTime", request.toExecTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.toStartTime)) {
            query.put("ToStartTime", request.toStartTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHistoryTasksStat"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHistoryTasksStatResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries task statistics.</p>
     * 
     * @param request DescribeHistoryTasksStatRequest
     * @return DescribeHistoryTasksStatResponse
     */
    public DescribeHistoryTasksStatResponse describeHistoryTasksStat(DescribeHistoryTasksStatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHistoryTasksStatWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the disk usage of all storage nodes.</p>
     * 
     * @param request DescribeInclinedNodesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInclinedNodesResponse
     */
    public DescribeInclinedNodesResponse describeInclinedNodesWithOptions(DescribeInclinedNodesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInclinedNodes"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInclinedNodesResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the disk usage of all storage nodes.</p>
     * 
     * @param request DescribeInclinedNodesRequest
     * @return DescribeInclinedNodesResponse
     */
    public DescribeInclinedNodesResponse describeInclinedNodes(DescribeInclinedNodesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInclinedNodesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about skewed tables for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeInclinedTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeInclinedTablesResponse
     */
    public DescribeInclinedTablesResponse describeInclinedTablesWithOptions(DescribeInclinedTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableType)) {
            query.put("TableType", request.tableType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeInclinedTables"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeInclinedTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about skewed tables for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeInclinedTablesRequest
     * @return DescribeInclinedTablesResponse
     */
    public DescribeInclinedTablesResponse describeInclinedTables(DescribeInclinedTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeInclinedTablesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>获取作业资源使用统计</p>
     * 
     * @param request DescribeJobResourceUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJobResourceUsageResponse
     */
    public DescribeJobResourceUsageResponse describeJobResourceUsageWithOptions(DescribeJobResourceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJobResourceUsage"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJobResourceUsageResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>获取作业资源使用统计</p>
     * 
     * @param request DescribeJobResourceUsageRequest
     * @return DescribeJobResourceUsageResponse
     */
    public DescribeJobResourceUsageResponse describeJobResourceUsage(DescribeJobResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJobResourceUsageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the minor version of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeKernelVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeKernelVersionResponse
     */
    public DescribeKernelVersionResponse describeKernelVersionWithOptions(DescribeKernelVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeKernelVersion"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeKernelVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about the minor version of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeKernelVersionRequest
     * @return DescribeKernelVersionResponse
     */
    public DescribeKernelVersionResponse describeKernelVersion(DescribeKernelVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeKernelVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the answer by a large language model (LLM) to a user question about the use of AnalyticDB for MySQL.</p>
     * 
     * @param request DescribeLLMAnswerRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLLMAnswerResponse
     */
    public DescribeLLMAnswerResponse describeLLMAnswerWithOptions(DescribeLLMAnswerRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLLMAnswer"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLLMAnswerResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the answer by a large language model (LLM) to a user question about the use of AnalyticDB for MySQL.</p>
     * 
     * @param request DescribeLLMAnswerRequest
     * @return DescribeLLMAnswerResponse
     */
    public DescribeLLMAnswerResponse describeLLMAnswer(DescribeLLMAnswerRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLLMAnswerWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of questions similar to a user question.</p>
     * 
     * @param request DescribeLLMSimilarQuestionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLLMSimilarQuestionsResponse
     */
    public DescribeLLMSimilarQuestionsResponse describeLLMSimilarQuestionsWithOptions(DescribeLLMSimilarQuestionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            query.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLLMSimilarQuestions"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLLMSimilarQuestionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of questions similar to a user question.</p>
     * 
     * @param request DescribeLLMSimilarQuestionsRequest
     * @return DescribeLLMSimilarQuestionsResponse
     */
    public DescribeLLMSimilarQuestionsResponse describeLLMSimilarQuestions(DescribeLLMSimilarQuestionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLLMSimilarQuestionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the lake cache size of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeLakeCacheSizeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLakeCacheSizeResponse
     */
    public DescribeLakeCacheSizeResponse describeLakeCacheSizeWithOptions(DescribeLakeCacheSizeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeLakeCacheSize"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLakeCacheSizeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the lake cache size of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeLakeCacheSizeRequest
     * @return DescribeLakeCacheSizeResponse
     */
    public DescribeLakeCacheSizeResponse describeLakeCacheSize(DescribeLakeCacheSizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLakeCacheSizeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the result of a recommendation task for a materialized view.</p>
     * 
     * @param request DescribeMVRecommendResultsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMVRecommendResultsResponse
     */
    public DescribeMVRecommendResultsResponse describeMVRecommendResultsWithOptions(DescribeMVRecommendResultsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionInner)) {
            query.put("ActionInner", request.actionInner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subQueryId)) {
            query.put("SubQueryId", request.subQueryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subtaskId)) {
            query.put("SubtaskId", request.subtaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMVRecommendResults"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMVRecommendResultsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Retrieves the result of a recommendation task for a materialized view.</p>
     * 
     * @param request DescribeMVRecommendResultsRequest
     * @return DescribeMVRecommendResultsResponse
     */
    public DescribeMVRecommendResultsResponse describeMVRecommendResults(DescribeMVRecommendResultsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMVRecommendResultsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看物化视图子任务</p>
     * 
     * @param request DescribeMvRecommendSubTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMvRecommendSubTasksResponse
     */
    public DescribeMvRecommendSubTasksResponse describeMvRecommendSubTasksWithOptions(DescribeMvRecommendSubTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionInner)) {
            query.put("ActionInner", request.actionInner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.subtaskId)) {
            query.put("SubtaskId", request.subtaskId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMvRecommendSubTasks"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMvRecommendSubTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看物化视图子任务</p>
     * 
     * @param request DescribeMvRecommendSubTasksRequest
     * @return DescribeMvRecommendSubTasksResponse
     */
    public DescribeMvRecommendSubTasksResponse describeMvRecommendSubTasks(DescribeMvRecommendSubTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMvRecommendSubTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查看物化视图推荐任务</p>
     * 
     * @param request DescribeMvRecommendTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeMvRecommendTasksResponse
     */
    public DescribeMvRecommendTasksResponse describeMvRecommendTasksWithOptions(DescribeMvRecommendTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.actionInner)) {
            query.put("ActionInner", request.actionInner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.from)) {
            query.put("From", request.from);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMvRecommendTasks"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMvRecommendTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查看物化视图推荐任务</p>
     * 
     * @param request DescribeMvRecommendTasksRequest
     * @return DescribeMvRecommendTasksResponse
     */
    public DescribeMvRecommendTasksResponse describeMvRecommendTasks(DescribeMvRecommendTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeMvRecommendTasksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the service account permissions of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeOperatorPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOperatorPermissionResponse
     */
    public DescribeOperatorPermissionResponse describeOperatorPermissionWithOptions(DescribeOperatorPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOperatorPermission"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOperatorPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the service account permissions of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeOperatorPermissionRequest
     * @return DescribeOperatorPermissionResponse
     */
    public DescribeOperatorPermissionResponse describeOperatorPermission(DescribeOperatorPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOperatorPermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about oversized non-partitioned tables in an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeOversizeNonPartitionTableInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeOversizeNonPartitionTableInfosResponse
     */
    public DescribeOversizeNonPartitionTableInfosResponse describeOversizeNonPartitionTableInfosWithOptions(DescribeOversizeNonPartitionTableInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeOversizeNonPartitionTableInfos"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeOversizeNonPartitionTableInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about oversized non-partitioned tables in an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeOversizeNonPartitionTableInfosRequest
     * @return DescribeOversizeNonPartitionTableInfosResponse
     */
    public DescribeOversizeNonPartitionTableInfosResponse describeOversizeNonPartitionTableInfos(DescribeOversizeNonPartitionTableInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeOversizeNonPartitionTableInfosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about performance metrics of an SQL pattern such as the query duration and average memory usage for an AnalyticDB for MySQL cluster within a time range.</p>
     * 
     * @param request DescribePatternPerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePatternPerformanceResponse
     */
    public DescribePatternPerformanceResponse describePatternPerformanceWithOptions(DescribePatternPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.patternId)) {
            query.put("PatternId", request.patternId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePatternPerformance"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePatternPerformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about performance metrics of an SQL pattern such as the query duration and average memory usage for an AnalyticDB for MySQL cluster within a time range.</p>
     * 
     * @param request DescribePatternPerformanceRequest
     * @return DescribePatternPerformanceResponse
     */
    public DescribePatternPerformanceResponse describePatternPerformance(DescribePatternPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePatternPerformanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a monitoring view.</p>
     * 
     * @param request DescribePerformanceViewAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePerformanceViewAttributeResponse
     */
    public DescribePerformanceViewAttributeResponse describePerformanceViewAttributeWithOptions(DescribePerformanceViewAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewName)) {
            query.put("ViewName", request.viewName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePerformanceViewAttribute"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePerformanceViewAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a monitoring view.</p>
     * 
     * @param request DescribePerformanceViewAttributeRequest
     * @return DescribePerformanceViewAttributeResponse
     */
    public DescribePerformanceViewAttributeResponse describePerformanceViewAttribute(DescribePerformanceViewAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePerformanceViewAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of monitoring views.</p>
     * 
     * @param request DescribePerformanceViewsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribePerformanceViewsResponse
     */
    public DescribePerformanceViewsResponse describePerformanceViewsWithOptions(DescribePerformanceViewsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribePerformanceViews"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribePerformanceViewsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of monitoring views.</p>
     * 
     * @param request DescribePerformanceViewsRequest
     * @return DescribePerformanceViewsResponse
     */
    public DescribePerformanceViewsResponse describePerformanceViews(DescribePerformanceViewsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describePerformanceViewsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of regions and zones in which AnalyticDB for MySQL Data Lakehouse Edition (V3.0) is available.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.acceptLanguage)) {
            query.put("AcceptLanguage", request.acceptLanguage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of regions and zones in which AnalyticDB for MySQL Data Lakehouse Edition (V3.0) is available.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about resource group specifications.</p>
     * 
     * @param request DescribeResourceGroupSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResourceGroupSpecResponse
     */
    public DescribeResourceGroupSpecResponse describeResourceGroupSpecWithOptions(DescribeResourceGroupSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupType)) {
            query.put("ResourceGroupType", request.resourceGroupType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResourceGroupSpec"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResourceGroupSpecResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about resource group specifications.</p>
     * 
     * @param request DescribeResourceGroupSpecRequest
     * @return DescribeResourceGroupSpecResponse
     */
    public DescribeResourceGroupSpecResponse describeResourceGroupSpec(DescribeResourceGroupSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResourceGroupSpecWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the user-configured result set export settings.</p>
     * 
     * @param request DescribeResultExportConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeResultExportConfigResponse
     */
    public DescribeResultExportConfigResponse describeResultExportConfigWithOptions(DescribeResultExportConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportType)) {
            query.put("ExportType", request.exportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeResultExportConfig"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeResultExportConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the user-configured result set export settings.</p>
     * 
     * @param request DescribeResultExportConfigRequest
     * @return DescribeResultExportConfigResponse
     */
    public DescribeResultExportConfigResponse describeResultExportConfig(DescribeResultExportConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeResultExportConfigWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of SQL patterns for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster within a time range.</p>
     * 
     * @param request DescribeSQLPatternsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSQLPatternsResponse
     */
    public DescribeSQLPatternsResponse describeSQLPatternsWithOptions(DescribeSQLPatternsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSQLPatterns"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSQLPatternsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of SQL patterns for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster within a time range.</p>
     * 
     * @param request DescribeSQLPatternsRequest
     * @return DescribeSQLPatternsResponse
     */
    public DescribeSQLPatternsResponse describeSQLPatterns(DescribeSQLPatternsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLPatternsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the WebSocket domain name of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeSQLWebSocketDomainRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSQLWebSocketDomainResponse
     */
    public DescribeSQLWebSocketDomainResponse describeSQLWebSocketDomainWithOptions(DescribeSQLWebSocketDomainRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.module)) {
            query.put("Module", request.module);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSQLWebSocketDomain"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSQLWebSocketDomainResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the WebSocket domain name of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeSQLWebSocketDomainRequest
     * @return DescribeSQLWebSocketDomainResponse
     */
    public DescribeSQLWebSocketDomainResponse describeSQLWebSocketDomain(DescribeSQLWebSocketDomainRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLWebSocketDomainWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of databases in an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeSchemasRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSchemasResponse
     */
    public DescribeSchemasResponse describeSchemasWithOptions(DescribeSchemasRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSchemas"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSchemasResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of databases in an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeSchemasRequest
     * @return DescribeSchemasResponse
     */
    public DescribeSchemasResponse describeSchemas(DescribeSchemasRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSchemasWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostic information about a Spark application.</p>
     * 
     * @param request DescribeSparkAppDiagnosisInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSparkAppDiagnosisInfoResponse
     */
    public DescribeSparkAppDiagnosisInfoResponse describeSparkAppDiagnosisInfoWithOptions(DescribeSparkAppDiagnosisInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSparkAppDiagnosisInfo"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSparkAppDiagnosisInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostic information about a Spark application.</p>
     * 
     * @param request DescribeSparkAppDiagnosisInfoRequest
     * @return DescribeSparkAppDiagnosisInfoResponse
     */
    public DescribeSparkAppDiagnosisInfoResponse describeSparkAppDiagnosisInfo(DescribeSparkAppDiagnosisInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSparkAppDiagnosisInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the type of a Spark application.</p>
     * 
     * @param request DescribeSparkAppTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSparkAppTypeResponse
     */
    public DescribeSparkAppTypeResponse describeSparkAppTypeWithOptions(DescribeSparkAppTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSparkAppType"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSparkAppTypeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the type of a Spark application.</p>
     * 
     * @param request DescribeSparkAppTypeRequest
     * @return DescribeSparkAppTypeResponse
     */
    public DescribeSparkAppTypeResponse describeSparkAppType(DescribeSparkAppTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSparkAppTypeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>SQL audit logs can be queried only when SQL audit is enabled. Only SQL audit logs within the last 30 days can be queried. If SQL auditing is turned off midway, when it is re-enabled, you can only query the SQL audit logs generated after it was turned back on.</p>
     * <blockquote>
     * <p> You can query only SQL audit logs that are executed by using Spark Interactive Resource Group.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the SQL audit logs for a Spark Interactive resource group.</p>
     * 
     * @param request DescribeSparkAuditLogRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSparkAuditLogRecordsResponse
     */
    public DescribeSparkAuditLogRecordsResponse describeSparkAuditLogRecordsWithOptions(DescribeSparkAuditLogRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.processId)) {
            query.put("ProcessId", request.processId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.proxyUser)) {
            query.put("ProxyUser", request.proxyUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SQLText)) {
            query.put("SQLText", request.SQLText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statementId)) {
            query.put("StatementId", request.statementId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statementSource)) {
            query.put("StatementSource", request.statementSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.totalTime)) {
            query.put("TotalTime", request.totalTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSparkAuditLogRecords"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSparkAuditLogRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>SQL audit logs can be queried only when SQL audit is enabled. Only SQL audit logs within the last 30 days can be queried. If SQL auditing is turned off midway, when it is re-enabled, you can only query the SQL audit logs generated after it was turned back on.</p>
     * <blockquote>
     * <p> You can query only SQL audit logs that are executed by using Spark Interactive Resource Group.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the SQL audit logs for a Spark Interactive resource group.</p>
     * 
     * @param request DescribeSparkAuditLogRecordsRequest
     * @return DescribeSparkAuditLogRecordsResponse
     */
    public DescribeSparkAuditLogRecordsResponse describeSparkAuditLogRecords(DescribeSparkAuditLogRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSparkAuditLogRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution logs of Spark code.</p>
     * 
     * @param request DescribeSparkCodeLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSparkCodeLogResponse
     */
    public DescribeSparkCodeLogResponse describeSparkCodeLogWithOptions(DescribeSparkCodeLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSparkCodeLog"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSparkCodeLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution logs of Spark code.</p>
     * 
     * @param request DescribeSparkCodeLogRequest
     * @return DescribeSparkCodeLogResponse
     */
    public DescribeSparkCodeLogResponse describeSparkCodeLog(DescribeSparkCodeLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSparkCodeLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution result of Spark code.</p>
     * 
     * @param request DescribeSparkCodeOutputRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSparkCodeOutputResponse
     */
    public DescribeSparkCodeOutputResponse describeSparkCodeOutputWithOptions(DescribeSparkCodeOutputRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSparkCodeOutput"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSparkCodeOutputResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the execution result of Spark code.</p>
     * 
     * @param request DescribeSparkCodeOutputRequest
     * @return DescribeSparkCodeOutputResponse
     */
    public DescribeSparkCodeOutputResponse describeSparkCodeOutput(DescribeSparkCodeOutputRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSparkCodeOutputWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the URL of the web UI for a Spark application.</p>
     * 
     * @param request DescribeSparkCodeWebUiRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSparkCodeWebUiResponse
     */
    public DescribeSparkCodeWebUiResponse describeSparkCodeWebUiWithOptions(DescribeSparkCodeWebUiRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSparkCodeWebUi"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSparkCodeWebUiResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the URL of the web UI for a Spark application.</p>
     * 
     * @param request DescribeSparkCodeWebUiRequest
     * @return DescribeSparkCodeWebUiResponse
     */
    public DescribeSparkCodeWebUiResponse describeSparkCodeWebUi(DescribeSparkCodeWebUiRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSparkCodeWebUiWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostic information about a Spark SQL query.</p>
     * 
     * @param request DescribeSparkSQLDiagnosisAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSparkSQLDiagnosisAttributeResponse
     */
    public DescribeSparkSQLDiagnosisAttributeResponse describeSparkSQLDiagnosisAttributeWithOptions(DescribeSparkSQLDiagnosisAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.innerQueryId)) {
            query.put("InnerQueryId", request.innerQueryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.language)) {
            query.put("Language", request.language);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSparkSQLDiagnosisAttribute"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSparkSQLDiagnosisAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostic information about a Spark SQL query.</p>
     * 
     * @param request DescribeSparkSQLDiagnosisAttributeRequest
     * @return DescribeSparkSQLDiagnosisAttributeResponse
     */
    public DescribeSparkSQLDiagnosisAttributeResponse describeSparkSQLDiagnosisAttribute(DescribeSparkSQLDiagnosisAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSparkSQLDiagnosisAttributeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostic information about Spark SQL queries.</p>
     * 
     * @param request DescribeSparkSQLDiagnosisListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSparkSQLDiagnosisListResponse
     */
    public DescribeSparkSQLDiagnosisListResponse describeSparkSQLDiagnosisListWithOptions(DescribeSparkSQLDiagnosisListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxStartTime)) {
            query.put("MaxStartTime", request.maxStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minStartTime)) {
            query.put("MinStartTime", request.minStartTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statementId)) {
            query.put("StatementId", request.statementId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSparkSQLDiagnosisList"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSparkSQLDiagnosisListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostic information about Spark SQL queries.</p>
     * 
     * @param request DescribeSparkSQLDiagnosisListRequest
     * @return DescribeSparkSQLDiagnosisListResponse
     */
    public DescribeSparkSQLDiagnosisListResponse describeSparkSQLDiagnosisList(DescribeSparkSQLDiagnosisListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSparkSQLDiagnosisListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about SQL patterns of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster within a time range.</p>
     * 
     * @param request DescribeSqlPatternRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSqlPatternResponse
     */
    public DescribeSqlPatternResponse describeSqlPatternWithOptions(DescribeSqlPatternRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sqlPattern)) {
            query.put("SqlPattern", request.sqlPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            query.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSqlPattern"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSqlPatternResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about SQL patterns of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster within a time range.</p>
     * 
     * @param request DescribeSqlPatternRequest
     * @return DescribeSqlPatternResponse
     */
    public DescribeSqlPatternResponse describeSqlPattern(DescribeSqlPatternRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSqlPatternWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage resource usage of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeStorageResourceUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStorageResourceUsageResponse
     */
    public DescribeStorageResourceUsageResponse describeStorageResourceUsageWithOptions(DescribeStorageResourceUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStorageResourceUsage"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStorageResourceUsageResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the storage resource usage of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeStorageResourceUsageRequest
     * @return DescribeStorageResourceUsageResponse
     */
    public DescribeStorageResourceUsageResponse describeStorageResourceUsage(DescribeStorageResourceUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStorageResourceUsageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of accesses to a table or all tables in an AnalyticDB for MySQL cluster on a date.</p>
     * 
     * @param request DescribeTableAccessCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTableAccessCountResponse
     */
    public DescribeTableAccessCountResponse describeTableAccessCountWithOptions(DescribeTableAccessCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTableAccessCount"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTableAccessCountResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of accesses to a table or all tables in an AnalyticDB for MySQL cluster on a date.</p>
     * 
     * @param request DescribeTableAccessCountRequest
     * @return DescribeTableAccessCountResponse
     */
    public DescribeTableAccessCountResponse describeTableAccessCount(DescribeTableAccessCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTableAccessCountWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about data distribution among shards of a table.</p>
     * 
     * @param request DescribeTableDetailRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTableDetailResponse
     */
    public DescribeTableDetailResponse describeTableDetailWithOptions(DescribeTableDetailRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTableDetail"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTableDetailResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about data distribution among shards of a table.</p>
     * 
     * @param request DescribeTableDetailRequest
     * @return DescribeTableDetailResponse
     */
    public DescribeTableDetailResponse describeTableDetail(DescribeTableDetailRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTableDetailWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about partition diagnostics.</p>
     * 
     * @param request DescribeTablePartitionDiagnoseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTablePartitionDiagnoseResponse
     */
    public DescribeTablePartitionDiagnoseResponse describeTablePartitionDiagnoseWithOptions(DescribeTablePartitionDiagnoseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTablePartitionDiagnose"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTablePartitionDiagnoseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about partition diagnostics.</p>
     * 
     * @param request DescribeTablePartitionDiagnoseRequest
     * @return DescribeTablePartitionDiagnoseResponse
     */
    public DescribeTablePartitionDiagnoseResponse describeTablePartitionDiagnose(DescribeTablePartitionDiagnoseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTablePartitionDiagnoseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the table statistics of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeTableStatisticsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTableStatisticsResponse
     */
    public DescribeTableStatisticsResponse describeTableStatisticsWithOptions(DescribeTableStatisticsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTableStatistics"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTableStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the table statistics of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DescribeTableStatisticsRequest
     * @return DescribeTableStatisticsResponse
     */
    public DescribeTableStatisticsResponse describeTableStatistics(DescribeTableStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTableStatisticsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of tables in a database.</p>
     * 
     * @param request DescribeTablesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTablesResponse
     */
    public DescribeTablesResponse describeTablesWithOptions(DescribeTablesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTables"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTablesResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of tables in a database.</p>
     * 
     * @param request DescribeTablesRequest
     * @return DescribeTablesResponse
     */
    public DescribeTablesResponse describeTables(DescribeTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTablesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries available quotas.</p>
     * 
     * @param request DescribeUserQuotaRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserQuotaResponse
     */
    public DescribeUserQuotaResponse describeUserQuotaWithOptions(DescribeUserQuotaRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeUserQuota"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserQuotaResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries available quotas.</p>
     * 
     * @param request DescribeUserQuotaRequest
     * @return DescribeUserQuotaResponse
     */
    public DescribeUserQuotaResponse describeUserQuota(DescribeUserQuotaRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserQuotaWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves materialized view refresh tasks.</p>
     * 
     * @param request DescribeViewJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeViewJobsResponse
     */
    public DescribeViewJobsResponse describeViewJobsWithOptions(DescribeViewJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterOwner)) {
            query.put("FilterOwner", request.filterOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterViewName)) {
            query.put("FilterViewName", request.filterViewName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterViewType)) {
            query.put("FilterViewType", request.filterViewType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeViewJobs"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeViewJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves materialized view refresh tasks.</p>
     * 
     * @param request DescribeViewJobsRequest
     * @return DescribeViewJobsResponse
     */
    public DescribeViewJobsResponse describeViewJobs(DescribeViewJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeViewJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostic results of the storage layer.</p>
     * 
     * @param request DescribeWorkerDetectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWorkerDetectionResponse
     */
    public DescribeWorkerDetectionResponse describeWorkerDetectionWithOptions(DescribeWorkerDetectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWorkerDetection"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWorkerDetectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the diagnostic results of the storage layer.</p>
     * 
     * @param request DescribeWorkerDetectionRequest
     * @return DescribeWorkerDetectionResponse
     */
    public DescribeWorkerDetectionResponse describeWorkerDetection(DescribeWorkerDetectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWorkerDetectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>解绑用户弹性网卡</p>
     * 
     * @param request DetachUserENIRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DetachUserENIResponse
     */
    public DetachUserENIResponse detachUserENIWithOptions(DetachUserENIRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DetachUserENI"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DetachUserENIResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>解绑用户弹性网卡</p>
     * 
     * @param request DetachUserENIRequest
     * @return DetachUserENIResponse
     */
    public DetachUserENIResponse detachUserENI(DetachUserENIRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.detachUserENIWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the suggestion feature.</p>
     * 
     * @param request DisableAdviceServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableAdviceServiceResponse
     */
    public DisableAdviceServiceResponse disableAdviceServiceWithOptions(DisableAdviceServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableAdviceService"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableAdviceServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Disables the suggestion feature.</p>
     * 
     * @param request DisableAdviceServiceRequest
     * @return DisableAdviceServiceResponse
     */
    public DisableAdviceServiceResponse disableAdviceService(DisableAdviceServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableAdviceServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a scaling plan for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DisableElasticPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableElasticPlanResponse
     */
    public DisableElasticPlanResponse disableElasticPlanWithOptions(DisableElasticPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableElasticPlan"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableElasticPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disables a scaling plan for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request DisableElasticPlanRequest
     * @return DisableElasticPlanResponse
     */
    public DisableElasticPlanResponse disableElasticPlan(DisableElasticPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableElasticPlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Downloads the diagnostic information about SQL statements that meet a query condition for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DownloadDiagnosisRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadDiagnosisRecordsResponse
     */
    public DownloadDiagnosisRecordsResponse downloadDiagnosisRecordsWithOptions(DownloadDiagnosisRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientIp)) {
            query.put("ClientIp", request.clientIp);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxPeakMemory)) {
            query.put("MaxPeakMemory", request.maxPeakMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxScanSize)) {
            query.put("MaxScanSize", request.maxScanSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minPeakMemory)) {
            query.put("MinPeakMemory", request.minPeakMemory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minScanSize)) {
            query.put("MinScanSize", request.minScanSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCondition)) {
            query.put("QueryCondition", request.queryCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroup)) {
            query.put("ResourceGroup", request.resourceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadDiagnosisRecords"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadDiagnosisRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Downloads the diagnostic information about SQL statements that meet a query condition for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request DownloadDiagnosisRecordsRequest
     * @return DownloadDiagnosisRecordsResponse
     */
    public DownloadDiagnosisRecordsResponse downloadDiagnosisRecords(DownloadDiagnosisRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadDiagnosisRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Object Storage Service (OSS) URL of the downloaded certificate authority (CA) certificate that is used to connect to the wide table engine.</p>
     * 
     * @param request DownloadInstanceCACertificateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadInstanceCACertificateResponse
     */
    public DownloadInstanceCACertificateResponse downloadInstanceCACertificateWithOptions(DownloadInstanceCACertificateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadInstanceCACertificate"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadInstanceCACertificateResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Object Storage Service (OSS) URL of the downloaded certificate authority (CA) certificate that is used to connect to the wide table engine.</p>
     * 
     * @param request DownloadInstanceCACertificateRequest
     * @return DownloadInstanceCACertificateResponse
     */
    public DownloadInstanceCACertificateResponse downloadInstanceCACertificate(DownloadInstanceCACertificateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadInstanceCACertificateWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the suggestion feature.</p>
     * 
     * @param request EnableAdviceServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableAdviceServiceResponse
     */
    public EnableAdviceServiceResponse enableAdviceServiceWithOptions(EnableAdviceServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableAdviceService"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableAdviceServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the suggestion feature.</p>
     * 
     * @param request EnableAdviceServiceRequest
     * @return EnableAdviceServiceResponse
     */
    public EnableAdviceServiceResponse enableAdviceService(EnableAdviceServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableAdviceServiceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a scaling plan for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request EnableElasticPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableElasticPlanResponse
     */
    public EnableElasticPlanResponse enableElasticPlanWithOptions(EnableElasticPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableElasticPlan"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableElasticPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables a scaling plan for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request EnableElasticPlanRequest
     * @return EnableElasticPlanResponse
     */
    public EnableElasticPlanResponse enableElasticPlan(EnableElasticPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableElasticPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Executes part of the code in a Spark job.</p>
     * 
     * @param request ExecuteSparkReplStatementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteSparkReplStatementResponse
     */
    public ExecuteSparkReplStatementResponse executeSparkReplStatementWithOptions(ExecuteSparkReplStatementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.code)) {
            body.put("Code", request.code);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.codeType)) {
            body.put("CodeType", request.codeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteSparkReplStatement"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteSparkReplStatementResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Executes part of the code in a Spark job.</p>
     * 
     * @param request ExecuteSparkReplStatementRequest
     * @return ExecuteSparkReplStatementResponse
     */
    public ExecuteSparkReplStatementResponse executeSparkReplStatement(ExecuteSparkReplStatementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeSparkReplStatementWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Executes Spark SQL statements in batches.</p>
     * 
     * @param request ExecuteSparkWarehouseBatchSQLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExecuteSparkWarehouseBatchSQLResponse
     */
    public ExecuteSparkWarehouseBatchSQLResponse executeSparkWarehouseBatchSQLWithOptions(ExecuteSparkWarehouseBatchSQLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agency)) {
            body.put("Agency", request.agency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeResultLimit)) {
            body.put("ExecuteResultLimit", request.executeResultLimit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeTimeLimitInSeconds)) {
            body.put("ExecuteTimeLimitInSeconds", request.executeTimeLimitInSeconds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.query)) {
            body.put("Query", request.query);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runtimeConfig)) {
            body.put("RuntimeConfig", request.runtimeConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            body.put("Schema", request.schema);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExecuteSparkWarehouseBatchSQL"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExecuteSparkWarehouseBatchSQLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Executes Spark SQL statements in batches.</p>
     * 
     * @param request ExecuteSparkWarehouseBatchSQLRequest
     * @return ExecuteSparkWarehouseBatchSQLResponse
     */
    public ExecuteSparkWarehouseBatchSQLResponse executeSparkWarehouseBatchSQL(ExecuteSparkWarehouseBatchSQLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.executeSparkWarehouseBatchSQLWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a running SQL engine exists.</p>
     * 
     * @deprecated OpenAPI ExistRunningSQLEngine is deprecated
     * 
     * @param request ExistRunningSQLEngineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ExistRunningSQLEngineResponse
     */
    @Deprecated
    // Deprecated
    public ExistRunningSQLEngineResponse existRunningSQLEngineWithOptions(ExistRunningSQLEngineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ExistRunningSQLEngine"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExistRunningSQLEngineResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a running SQL engine exists.</p>
     * 
     * @deprecated OpenAPI ExistRunningSQLEngine is deprecated
     * 
     * @param request ExistRunningSQLEngineRequest
     * @return ExistRunningSQLEngineResponse
     */
    @Deprecated
    // Deprecated
    public ExistRunningSQLEngineResponse existRunningSQLEngine(ExistRunningSQLEngineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.existRunningSQLEngineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The API diagnosis report contains whether the current user has all permissions required by the AnalyticDB for Spark related features. The scope of the permissions may exceed the minimum requirements of the business. The diagnostic report of the current API is used to quickly initialize the environment of AnalyticDB for Spark. If fine-grained permission configuration is needed, see <a href="https://www.alibabacloud.com/help/zh/analyticdb/analyticdb-for-mysql/user-guide/create-the-aliyunadbsparkprocessingdatarole-role-for-a-ram-user-and-grant-permissions-to-the-role?spm=a2c63.p38356.help-menu-92664.d_2_5_0.48362a487dMzm9#section-y2z-ucd-1ko">Configure fine-grained permissions in AnalyDB for Spark.</a></p>
     * 
     * <b>summary</b> : 
     * <p>View the Spark basic permission diagnosis report of the current user.</p>
     * 
     * @param request GetADBSparkNecessaryRAMPermissionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetADBSparkNecessaryRAMPermissionsResponse
     */
    public GetADBSparkNecessaryRAMPermissionsResponse getADBSparkNecessaryRAMPermissionsWithOptions(GetADBSparkNecessaryRAMPermissionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetADBSparkNecessaryRAMPermissions"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetADBSparkNecessaryRAMPermissionsResponse());
    }

    /**
     * <b>description</b> :
     * <p>The API diagnosis report contains whether the current user has all permissions required by the AnalyticDB for Spark related features. The scope of the permissions may exceed the minimum requirements of the business. The diagnostic report of the current API is used to quickly initialize the environment of AnalyticDB for Spark. If fine-grained permission configuration is needed, see <a href="https://www.alibabacloud.com/help/zh/analyticdb/analyticdb-for-mysql/user-guide/create-the-aliyunadbsparkprocessingdatarole-role-for-a-ram-user-and-grant-permissions-to-the-role?spm=a2c63.p38356.help-menu-92664.d_2_5_0.48362a487dMzm9#section-y2z-ucd-1ko">Configure fine-grained permissions in AnalyDB for Spark.</a></p>
     * 
     * <b>summary</b> : 
     * <p>View the Spark basic permission diagnosis report of the current user.</p>
     * 
     * @param request GetADBSparkNecessaryRAMPermissionsRequest
     * @return GetADBSparkNecessaryRAMPermissionsResponse
     */
    public GetADBSparkNecessaryRAMPermissionsResponse getADBSparkNecessaryRAMPermissions(GetADBSparkNecessaryRAMPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getADBSparkNecessaryRAMPermissionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of databases.</p>
     * 
     * @param request GetApsManagedDatabasesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetApsManagedDatabasesResponse
     */
    public GetApsManagedDatabasesResponse getApsManagedDatabasesWithOptions(GetApsManagedDatabasesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetApsManagedDatabases"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetApsManagedDatabasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of databases.</p>
     * 
     * @param request GetApsManagedDatabasesRequest
     * @return GetApsManagedDatabasesResponse
     */
    public GetApsManagedDatabasesResponse getApsManagedDatabases(GetApsManagedDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getApsManagedDatabasesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the table creation statement for tables.</p>
     * 
     * @param request GetCreateTableSQLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCreateTableSQLResponse
     */
    public GetCreateTableSQLResponse getCreateTableSQLWithOptions(GetCreateTableSQLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCreateTableSQL"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCreateTableSQLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the table creation statement for tables.</p>
     * 
     * @param request GetCreateTableSQLRequest
     * @return GetCreateTableSQLResponse
     */
    public GetCreateTableSQLResponse getCreateTableSQL(GetCreateTableSQLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getCreateTableSQLWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about databases.</p>
     * 
     * @param request GetDatabaseObjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatabaseObjectsResponse
     */
    public GetDatabaseObjectsResponse getDatabaseObjectsWithOptions(GetDatabaseObjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterOwner)) {
            query.put("FilterOwner", request.filterOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterSchemaName)) {
            query.put("FilterSchemaName", request.filterSchemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatabaseObjects"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatabaseObjectsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about databases.</p>
     * 
     * @param request GetDatabaseObjectsRequest
     * @return GetDatabaseObjectsResponse
     */
    public GetDatabaseObjectsResponse getDatabaseObjects(GetDatabaseObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getDatabaseObjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a lake storage.</p>
     * 
     * @param request GetLakeStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLakeStorageResponse
     */
    public GetLakeStorageResponse getLakeStorageWithOptions(GetLakeStorageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lakeStorageId)) {
            query.put("LakeStorageId", request.lakeStorageId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLakeStorage"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLakeStorageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a lake storage.</p>
     * 
     * @param request GetLakeStorageRequest
     * @return GetLakeStorageResponse
     */
    public GetLakeStorageResponse getLakeStorage(GetLakeStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getLakeStorageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the retry log of a Spark application.</p>
     * 
     * @param request GetSparkAppAttemptLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkAppAttemptLogResponse
     */
    public GetSparkAppAttemptLogResponse getSparkAppAttemptLogWithOptions(GetSparkAppAttemptLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.attemptId)) {
            body.put("AttemptId", request.attemptId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logLength)) {
            body.put("LogLength", request.logLength);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkAppAttemptLog"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkAppAttemptLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about the retry log of a Spark application.</p>
     * 
     * @param request GetSparkAppAttemptLogRequest
     * @return GetSparkAppAttemptLogResponse
     */
    public GetSparkAppAttemptLogResponse getSparkAppAttemptLog(GetSparkAppAttemptLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkAppAttemptLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an Spark application.</p>
     * 
     * @param request GetSparkAppInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkAppInfoResponse
     */
    public GetSparkAppInfoResponse getSparkAppInfoWithOptions(GetSparkAppInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkAppInfo"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkAppInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an Spark application.</p>
     * 
     * @param request GetSparkAppInfoRequest
     * @return GetSparkAppInfoResponse
     */
    public GetSparkAppInfoResponse getSparkAppInfo(GetSparkAppInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkAppInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of a Spark application.</p>
     * 
     * @param request GetSparkAppLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkAppLogResponse
     */
    public GetSparkAppLogResponse getSparkAppLogWithOptions(GetSparkAppLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logLength)) {
            body.put("LogLength", request.logLength);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkAppLog"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkAppLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the logs of a Spark application.</p>
     * 
     * @param request GetSparkAppLogRequest
     * @return GetSparkAppLogResponse
     */
    public GetSparkAppLogResponse getSparkAppLog(GetSparkAppLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkAppLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/612447.html">PreloadSparkAppMetrics</a> operation to preload the metrics of a Spark application.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the metrics of a Spark application.</p>
     * 
     * @param request GetSparkAppMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkAppMetricsResponse
     */
    public GetSparkAppMetricsResponse getSparkAppMetricsWithOptions(GetSparkAppMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkAppMetrics"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkAppMetricsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Before you call this operation, you must call the <a href="https://help.aliyun.com/document_detail/612447.html">PreloadSparkAppMetrics</a> operation to preload the metrics of a Spark application.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the metrics of a Spark application.</p>
     * 
     * @param request GetSparkAppMetricsRequest
     * @return GetSparkAppMetricsResponse
     */
    public GetSparkAppMetricsResponse getSparkAppMetrics(GetSparkAppMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkAppMetricsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a Spark application.</p>
     * 
     * @param request GetSparkAppStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkAppStateResponse
     */
    public GetSparkAppStateResponse getSparkAppStateWithOptions(GetSparkAppStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkAppState"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkAppStateResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the status of a Spark application.</p>
     * 
     * @param request GetSparkAppStateRequest
     * @return GetSparkAppStateResponse
     */
    public GetSparkAppStateResponse getSparkAppState(GetSparkAppStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkAppStateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the URL of the web UI for a Spark application.</p>
     * 
     * @param request GetSparkAppWebUiAddressRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkAppWebUiAddressResponse
     */
    public GetSparkAppWebUiAddressResponse getSparkAppWebUiAddressWithOptions(GetSparkAppWebUiAddressRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkAppWebUiAddress"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkAppWebUiAddressResponse());
    }

    /**
     * <b>description</b> :
     * <p>  General endpoint: <code>adb.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</li>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the URL of the web UI for a Spark application.</p>
     * 
     * @param request GetSparkAppWebUiAddressRequest
     * @return GetSparkAppWebUiAddressResponse
     */
    public GetSparkAppWebUiAddressResponse getSparkAppWebUiAddress(GetSparkAppWebUiAddressRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkAppWebUiAddressWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the Spark log configuration of an AnalyticDB for MySQL cluster, including the default Spark log path.</p>
     * 
     * @param request GetSparkConfigLogPathRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkConfigLogPathResponse
     */
    public GetSparkConfigLogPathResponse getSparkConfigLogPathWithOptions(GetSparkConfigLogPathRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkConfigLogPath"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkConfigLogPathResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the Spark log configuration of an AnalyticDB for MySQL cluster, including the default Spark log path.</p>
     * 
     * @param request GetSparkConfigLogPathRequest
     * @return GetSparkConfigLogPathResponse
     */
    public GetSparkConfigLogPathResponse getSparkConfigLogPath(GetSparkConfigLogPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkConfigLogPathWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of a Spark log analysis task.</p>
     * 
     * @param request GetSparkLogAnalyzeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkLogAnalyzeTaskResponse
     */
    public GetSparkLogAnalyzeTaskResponse getSparkLogAnalyzeTaskWithOptions(GetSparkLogAnalyzeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkLogAnalyzeTask"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkLogAnalyzeTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the results of a Spark log analysis task.</p>
     * 
     * @param request GetSparkLogAnalyzeTaskRequest
     * @return GetSparkLogAnalyzeTaskResponse
     */
    public GetSparkLogAnalyzeTaskResponse getSparkLogAnalyzeTask(GetSparkLogAnalyzeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkLogAnalyzeTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a Spark session.</p>
     * 
     * @param request GetSparkReplSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkReplSessionResponse
     */
    public GetSparkReplSessionResponse getSparkReplSessionWithOptions(GetSparkReplSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkReplSession"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkReplSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the status of a Spark session.</p>
     * 
     * @param request GetSparkReplSessionRequest
     * @return GetSparkReplSessionResponse
     */
    public GetSparkReplSessionResponse getSparkReplSession(GetSparkReplSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkReplSessionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution result of a code block.</p>
     * 
     * @param request GetSparkReplStatementRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkReplStatementResponse
     */
    public GetSparkReplStatementResponse getSparkReplStatementWithOptions(GetSparkReplStatementRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sessionId)) {
            body.put("SessionId", request.sessionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statementId)) {
            body.put("StatementId", request.statementId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkReplStatement"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkReplStatementResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution result of a code block.</p>
     * 
     * @param request GetSparkReplStatementRequest
     * @return GetSparkReplStatementResponse
     */
    public GetSparkReplStatementResponse getSparkReplStatement(GetSparkReplStatementRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkReplStatementWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the state information about the Spark SQL engine.</p>
     * 
     * @deprecated OpenAPI GetSparkSQLEngineState is deprecated
     * 
     * @param request GetSparkSQLEngineStateRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkSQLEngineStateResponse
     */
    @Deprecated
    // Deprecated
    public GetSparkSQLEngineStateResponse getSparkSQLEngineStateWithOptions(GetSparkSQLEngineStateRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkSQLEngineState"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkSQLEngineStateResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the state information about the Spark SQL engine.</p>
     * 
     * @deprecated OpenAPI GetSparkSQLEngineState is deprecated
     * 
     * @param request GetSparkSQLEngineStateRequest
     * @return GetSparkSQLEngineStateResponse
     */
    @Deprecated
    // Deprecated
    public GetSparkSQLEngineStateResponse getSparkSQLEngineState(GetSparkSQLEngineStateRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkSQLEngineStateWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the content of a Spark application template.</p>
     * 
     * @param request GetSparkTemplateFileContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkTemplateFileContentResponse
     */
    public GetSparkTemplateFileContentResponse getSparkTemplateFileContentWithOptions(GetSparkTemplateFileContentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkTemplateFileContent"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkTemplateFileContentResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the content of a Spark application template.</p>
     * 
     * @param request GetSparkTemplateFileContentRequest
     * @return GetSparkTemplateFileContentResponse
     */
    public GetSparkTemplateFileContentResponse getSparkTemplateFileContent(GetSparkTemplateFileContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkTemplateFileContentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the directory structure of Spark applications.</p>
     * 
     * @param request GetSparkTemplateFolderTreeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkTemplateFolderTreeResponse
     */
    public GetSparkTemplateFolderTreeResponse getSparkTemplateFolderTreeWithOptions(GetSparkTemplateFolderTreeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkTemplateFolderTree"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkTemplateFolderTreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the directory structure of Spark applications.</p>
     * 
     * @param request GetSparkTemplateFolderTreeRequest
     * @return GetSparkTemplateFolderTreeResponse
     */
    public GetSparkTemplateFolderTreeResponse getSparkTemplateFolderTree(GetSparkTemplateFolderTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkTemplateFolderTreeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the directory structure of Spark applications.</p>
     * 
     * @param request GetSparkTemplateFullTreeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkTemplateFullTreeResponse
     */
    public GetSparkTemplateFullTreeResponse getSparkTemplateFullTreeWithOptions(GetSparkTemplateFullTreeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkTemplateFullTree"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkTemplateFullTreeResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the directory structure of Spark applications.</p>
     * 
     * @param request GetSparkTemplateFullTreeRequest
     * @return GetSparkTemplateFullTreeResponse
     */
    public GetSparkTemplateFullTreeResponse getSparkTemplateFullTree(GetSparkTemplateFullTreeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkTemplateFullTreeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution result of a Spark SQL statement.</p>
     * 
     * @param request GetSparkWarehouseBatchSQLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetSparkWarehouseBatchSQLResponse
     */
    public GetSparkWarehouseBatchSQLResponse getSparkWarehouseBatchSQLWithOptions(GetSparkWarehouseBatchSQLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agency)) {
            body.put("Agency", request.agency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryId)) {
            body.put("QueryId", request.queryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetSparkWarehouseBatchSQL"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetSparkWarehouseBatchSQLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution result of a Spark SQL statement.</p>
     * 
     * @param request GetSparkWarehouseBatchSQLRequest
     * @return GetSparkWarehouseBatchSQLResponse
     */
    public GetSparkWarehouseBatchSQLResponse getSparkWarehouseBatchSQL(GetSparkWarehouseBatchSQLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getSparkWarehouseBatchSQLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取表</p>
     * 
     * @param request GetTableRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableResponse
     */
    public GetTableResponse getTableWithOptions(GetTableRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTable"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取表</p>
     * 
     * @param request GetTableRequest
     * @return GetTableResponse
     */
    public GetTableResponse getTable(GetTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about columns.</p>
     * 
     * @param request GetTableColumnsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableColumnsResponse
     */
    public GetTableColumnsResponse getTableColumnsWithOptions(GetTableColumnsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnName)) {
            query.put("ColumnName", request.columnName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableColumns"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableColumnsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about columns.</p>
     * 
     * @param request GetTableColumnsRequest
     * @return GetTableColumnsResponse
     */
    public GetTableColumnsResponse getTableColumns(GetTableColumnsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableColumnsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the statement that is used to create a table.</p>
     * 
     * @param request GetTableDDLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableDDLResponse
     */
    public GetTableDDLResponse getTableDDLWithOptions(GetTableDDLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableDDL"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableDDLResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the statement that is used to create a table.</p>
     * 
     * @param request GetTableDDLRequest
     * @return GetTableDDLResponse
     */
    public GetTableDDLResponse getTableDDL(GetTableDDLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableDDLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取table概要信息</p>
     * 
     * @param request GetTableObjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableObjectsResponse
     */
    public GetTableObjectsResponse getTableObjectsWithOptions(GetTableObjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterDescription)) {
            query.put("FilterDescription", request.filterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterOwner)) {
            query.put("FilterOwner", request.filterOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterTblName)) {
            query.put("FilterTblName", request.filterTblName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterTblType)) {
            query.put("FilterTblType", request.filterTblType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableObjects"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableObjectsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取table概要信息</p>
     * 
     * @param request GetTableObjectsRequest
     * @return GetTableObjectsResponse
     */
    public GetTableObjectsResponse getTableObjects(GetTableObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getTableObjectsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the statement that is used to create a view.</p>
     * 
     * @param request GetViewDDLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetViewDDLResponse
     */
    public GetViewDDLResponse getViewDDLWithOptions(GetViewDDLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewName)) {
            query.put("ViewName", request.viewName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetViewDDL"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetViewDDLResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the statement that is used to create a view.</p>
     * 
     * @param request GetViewDDLRequest
     * @return GetViewDDLResponse
     */
    public GetViewDDLResponse getViewDDL(GetViewDDLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getViewDDLWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about views.</p>
     * 
     * @param request GetViewObjectsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetViewObjectsResponse
     */
    public GetViewObjectsResponse getViewObjectsWithOptions(GetViewObjectsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterOwner)) {
            query.put("FilterOwner", request.filterOwner);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterViewName)) {
            query.put("FilterViewName", request.filterViewName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filterViewType)) {
            query.put("FilterViewType", request.filterViewType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schemaName)) {
            query.put("SchemaName", request.schemaName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.showMvBaseTable)) {
            query.put("ShowMvBaseTable", request.showMvBaseTable);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetViewObjects"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetViewObjectsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about views.</p>
     * 
     * @param request GetViewObjectsRequest
     * @return GetViewObjectsResponse
     */
    public GetViewObjectsResponse getViewObjects(GetViewObjectsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getViewObjectsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grants permissions to the service account of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request GrantOperatorPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantOperatorPermissionResponse
     */
    public GrantOperatorPermissionResponse grantOperatorPermissionWithOptions(GrantOperatorPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.expiredTime)) {
            query.put("ExpiredTime", request.expiredTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privileges)) {
            query.put("Privileges", request.privileges);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantOperatorPermission"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantOperatorPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grants permissions to the service account of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request GrantOperatorPermissionRequest
     * @return GrantOperatorPermissionResponse
     */
    public GrantOperatorPermissionResponse grantOperatorPermission(GrantOperatorPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantOperatorPermissionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Terminates an ongoing query.</p>
     * 
     * @param request KillProcessRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KillProcessResponse
     */
    public KillProcessResponse killProcessWithOptions(KillProcessRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KillProcess"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KillProcessResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Terminates an ongoing query.</p>
     * 
     * @param request KillProcessRequest
     * @return KillProcessResponse
     */
    public KillProcessResponse killProcess(KillProcessRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.killProcessWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Terminates a Spark application.</p>
     * 
     * @param request KillSparkAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KillSparkAppResponse
     */
    public KillSparkAppResponse killSparkAppWithOptions(KillSparkAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KillSparkApp"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KillSparkAppResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Terminates a Spark application.</p>
     * 
     * @param request KillSparkAppRequest
     * @return KillSparkAppResponse
     */
    public KillSparkAppResponse killSparkApp(KillSparkAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.killSparkAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Terminates a Spark log analysis task and queries the information about the analysis task.</p>
     * 
     * @param request KillSparkLogAnalyzeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KillSparkLogAnalyzeTaskResponse
     */
    public KillSparkLogAnalyzeTaskResponse killSparkLogAnalyzeTaskWithOptions(KillSparkLogAnalyzeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            body.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KillSparkLogAnalyzeTask"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KillSparkLogAnalyzeTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Terminates a Spark log analysis task and queries the information about the analysis task.</p>
     * 
     * @param request KillSparkLogAnalyzeTaskRequest
     * @return KillSparkLogAnalyzeTaskResponse
     */
    public KillSparkLogAnalyzeTaskResponse killSparkLogAnalyzeTask(KillSparkLogAnalyzeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.killSparkLogAnalyzeTaskWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Shuts down a Spark SQL engine.</p>
     * 
     * @deprecated OpenAPI KillSparkSQLEngine is deprecated
     * 
     * @param request KillSparkSQLEngineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return KillSparkSQLEngineResponse
     */
    @Deprecated
    // Deprecated
    public KillSparkSQLEngineResponse killSparkSQLEngineWithOptions(KillSparkSQLEngineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "KillSparkSQLEngine"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new KillSparkSQLEngineResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Shuts down a Spark SQL engine.</p>
     * 
     * @deprecated OpenAPI KillSparkSQLEngine is deprecated
     * 
     * @param request KillSparkSQLEngineRequest
     * @return KillSparkSQLEngineResponse
     */
    @Deprecated
    // Deprecated
    public KillSparkSQLEngineResponse killSparkSQLEngine(KillSparkSQLEngineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.killSparkSQLEngineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of lifecycle management policies of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ListApsLifecycleStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApsLifecycleStrategyResponse
     */
    public ListApsLifecycleStrategyResponse listApsLifecycleStrategyWithOptions(ListApsLifecycleStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApsLifecycleStrategy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApsLifecycleStrategyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of lifecycle management policies of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ListApsLifecycleStrategyRequest
     * @return ListApsLifecycleStrategyResponse
     */
    public ListApsLifecycleStrategyResponse listApsLifecycleStrategy(ListApsLifecycleStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApsLifecycleStrategyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of lake storage optimization policies for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ListApsOptimizationStrategyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApsOptimizationStrategyResponse
     */
    public ListApsOptimizationStrategyResponse listApsOptimizationStrategyWithOptions(ListApsOptimizationStrategyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApsOptimizationStrategy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApsOptimizationStrategyResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of lake storage optimization policies for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ListApsOptimizationStrategyRequest
     * @return ListApsOptimizationStrategyResponse
     */
    public ListApsOptimizationStrategyResponse listApsOptimizationStrategy(ListApsOptimizationStrategyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApsOptimizationStrategyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of optimization jobs executed based on a lifecycle management policy. The system runs optimization jobs on a regular basis based on lifecycle management policies.</p>
     * 
     * @param request ListApsOptimizationTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApsOptimizationTasksResponse
     */
    public ListApsOptimizationTasksResponse listApsOptimizationTasksWithOptions(ListApsOptimizationTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.strategyType)) {
            body.put("StrategyType", request.strategyType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApsOptimizationTasks"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApsOptimizationTasksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of optimization jobs executed based on a lifecycle management policy. The system runs optimization jobs on a regular basis based on lifecycle management policies.</p>
     * 
     * @param request ListApsOptimizationTasksRequest
     * @return ListApsOptimizationTasksResponse
     */
    public ListApsOptimizationTasksResponse listApsOptimizationTasks(ListApsOptimizationTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApsOptimizationTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This API allows you to obtain a list of configured webhooks based on <code>RegionId</code>, <code>DBClusterId</code>, and optional <code>JobType</code>. The <code>JobType</code> parameter specifies the task type, such as SLS/OSS export task. If the parameter is provided, webhooks related to the task type are returned. If the parameter is not provided, all types of webhooks are returned.
     * Note: Make sure that the <code>RegionId</code> and <code>DBClusterId</code> you provided are correct. Otherwise, the webhook information may not be obtained correctly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Webhook configurations of a specified database cluster.</p>
     * 
     * @param request ListApsWebhookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListApsWebhookResponse
     */
    public ListApsWebhookResponse listApsWebhookWithOptions(ListApsWebhookRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobType)) {
            body.put("JobType", request.jobType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListApsWebhook"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListApsWebhookResponse());
    }

    /**
     * <b>description</b> :
     * <p>This API allows you to obtain a list of configured webhooks based on <code>RegionId</code>, <code>DBClusterId</code>, and optional <code>JobType</code>. The <code>JobType</code> parameter specifies the task type, such as SLS/OSS export task. If the parameter is provided, webhooks related to the task type are returned. If the parameter is not provided, all types of webhooks are returned.
     * Note: Make sure that the <code>RegionId</code> and <code>DBClusterId</code> you provided are correct. Otherwise, the webhook information may not be obtained correctly.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the Webhook configurations of a specified database cluster.</p>
     * 
     * @param request ListApsWebhookRequest
     * @return ListApsWebhookResponse
     */
    public ListApsWebhookResponse listApsWebhook(ListApsWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listApsWebhookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of lake storages.</p>
     * 
     * @param request ListLakeStoragesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListLakeStoragesResponse
     */
    public ListLakeStoragesResponse listLakeStoragesWithOptions(ListLakeStoragesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, String> query = com.aliyun.openapiutil.Client.query(com.aliyun.teautil.Common.toMap(request));
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListLakeStorages"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListLakeStoragesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of lake storages.</p>
     * 
     * @param request ListLakeStoragesRequest
     * @return ListLakeStoragesResponse
     */
    public ListLakeStoragesResponse listLakeStorages(ListLakeStoragesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listLakeStoragesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution records of result set export jobs of a Resource Access Management (RAM) user.</p>
     * 
     * @param tmpReq ListResultExportJobHistoryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListResultExportJobHistoryResponse
     */
    public ListResultExportJobHistoryResponse listResultExportJobHistoryWithOptions(ListResultExportJobHistoryRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListResultExportJobHistoryShrinkRequest request = new ListResultExportJobHistoryShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.order)) {
            request.orderShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.order, "Order", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.statusList)) {
            request.statusListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.statusList, "StatusList", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseUser)) {
            body.put("DatabaseUser", request.databaseUser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            body.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderShrink)) {
            body.put("Order", request.orderShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroup)) {
            body.put("ResourceGroup", request.resourceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            body.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusListShrink)) {
            body.put("StatusList", request.statusListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListResultExportJobHistory"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListResultExportJobHistoryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the execution records of result set export jobs of a Resource Access Management (RAM) user.</p>
     * 
     * @param request ListResultExportJobHistoryRequest
     * @return ListResultExportJobHistoryResponse
     */
    public ListResultExportJobHistoryResponse listResultExportJobHistory(ListResultExportJobHistoryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listResultExportJobHistoryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about retry attempts of a Spark application.</p>
     * 
     * @param request ListSparkAppAttemptsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSparkAppAttemptsResponse
     */
    public ListSparkAppAttemptsResponse listSparkAppAttemptsWithOptions(ListSparkAppAttemptsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            query.put("AppId", request.appId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSparkAppAttempts"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSparkAppAttemptsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about retry attempts of a Spark application.</p>
     * 
     * @param request ListSparkAppAttemptsRequest
     * @return ListSparkAppAttemptsResponse
     */
    public ListSparkAppAttemptsResponse listSparkAppAttempts(ListSparkAppAttemptsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSparkAppAttemptsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Spark applications that run on an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ListSparkAppsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSparkAppsResponse
     */
    public ListSparkAppsResponse listSparkAppsWithOptions(ListSparkAppsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filters)) {
            query.put("Filters", request.filters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSparkApps"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSparkAppsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the Spark applications that run on an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ListSparkAppsRequest
     * @return ListSparkAppsResponse
     */
    public ListSparkAppsResponse listSparkApps(ListSparkAppsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSparkAppsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Spark log analysis tasks.</p>
     * 
     * @param request ListSparkLogAnalyzeTasksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSparkLogAnalyzeTasksResponse
     */
    public ListSparkLogAnalyzeTasksResponse listSparkLogAnalyzeTasksWithOptions(ListSparkLogAnalyzeTasksRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSparkLogAnalyzeTasks"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSparkLogAnalyzeTasksResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Spark log analysis tasks.</p>
     * 
     * @param request ListSparkLogAnalyzeTasksRequest
     * @return ListSparkLogAnalyzeTasksResponse
     */
    public ListSparkLogAnalyzeTasksResponse listSparkLogAnalyzeTasks(ListSparkLogAnalyzeTasksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSparkLogAnalyzeTasksWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Spark template file IDs for AnalyticDB for MySQL clusters.</p>
     * 
     * @param request ListSparkTemplateFileIdsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSparkTemplateFileIdsResponse
     */
    public ListSparkTemplateFileIdsResponse listSparkTemplateFileIdsWithOptions(ListSparkTemplateFileIdsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSparkTemplateFileIds"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSparkTemplateFileIdsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of Spark template file IDs for AnalyticDB for MySQL clusters.</p>
     * 
     * @param request ListSparkTemplateFileIdsRequest
     * @return ListSparkTemplateFileIdsResponse
     */
    public ListSparkTemplateFileIdsResponse listSparkTemplateFileIds(ListSparkTemplateFileIdsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSparkTemplateFileIdsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Spark SQL statements.</p>
     * 
     * @param request ListSparkWarehouseBatchSQLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListSparkWarehouseBatchSQLResponse
     */
    public ListSparkWarehouseBatchSQLResponse listSparkWarehouseBatchSQLWithOptions(ListSparkWarehouseBatchSQLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSparkWarehouseBatchSQL"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSparkWarehouseBatchSQLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Spark SQL statements.</p>
     * 
     * @param request ListSparkWarehouseBatchSQLRequest
     * @return ListSparkWarehouseBatchSQLResponse
     */
    public ListSparkWarehouseBatchSQLResponse listSparkWarehouseBatchSQL(ListSparkWarehouseBatchSQLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listSparkWarehouseBatchSQLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are added to AnalyticDB for MySQL clusters, or the AnalyticDB for MySQL clusters that have tags added.</p>
     * 
     * @param request ListTagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResourcesWithOptions(ListTagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextToken)) {
            query.put("NextToken", request.nextToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceId)) {
            query.put("ResourceId", request.resourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTagResources"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the tags that are added to AnalyticDB for MySQL clusters, or the AnalyticDB for MySQL clusters that have tags added.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Loads a built-in dataset.</p>
     * 
     * @param request LoadSampleDataSetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return LoadSampleDataSetResponse
     */
    public LoadSampleDataSetResponse loadSampleDataSetWithOptions(LoadSampleDataSetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "LoadSampleDataSet"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new LoadSampleDataSetResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Loads a built-in dataset.</p>
     * 
     * @param request LoadSampleDataSetRequest
     * @return LoadSampleDataSetResponse
     */
    public LoadSampleDataSetResponse loadSampleDataSet(LoadSampleDataSetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.loadSampleDataSetWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description of a database account for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyAccountDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccountDescriptionResponse
     */
    public ModifyAccountDescriptionResponse modifyAccountDescriptionWithOptions(ModifyAccountDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountDescription)) {
            query.put("AccountDescription", request.accountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountDescriptionResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description of a database account for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the permissions of a database account.</p>
     * 
     * @param tmpReq ModifyAccountPrivilegesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAccountPrivilegesResponse
     */
    public ModifyAccountPrivilegesResponse modifyAccountPrivilegesWithOptions(ModifyAccountPrivilegesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyAccountPrivilegesShrinkRequest request = new ModifyAccountPrivilegesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.accountPrivileges)) {
            request.accountPrivilegesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.accountPrivileges, "AccountPrivileges", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPrivilegesShrink)) {
            query.put("AccountPrivileges", request.accountPrivilegesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountPrivileges"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAccountPrivilegesResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the permissions of a database account.</p>
     * 
     * @param request ModifyAccountPrivilegesRequest
     * @return ModifyAccountPrivilegesResponse
     */
    public ModifyAccountPrivilegesResponse modifyAccountPrivileges(ModifyAccountPrivilegesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountPrivilegesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>You can call this operation only for AnalyticDB for MySQL clusters in elastic mode for Cluster Edition that have 32 cores or more.</li>
     * <li>You cannot modify the number of nodes for the USER_DEFAULT resource group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an AnalyticDB Pipeline Service (APS) data source.</p>
     * 
     * @param tmpReq ModifyApsDatasoureRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApsDatasoureResponse
     */
    public ModifyApsDatasoureResponse modifyApsDatasoureWithOptions(ModifyApsDatasoureRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyApsDatasoureShrinkRequest request = new ModifyApsDatasoureShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.kafkaInfo)) {
            request.kafkaInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.kafkaInfo, "KafkaInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.lakehouseId)) {
            request.lakehouseIdShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.lakehouseId, "LakehouseId", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.polarDBMysqlInfo)) {
            request.polarDBMysqlInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.polarDBMysqlInfo, "PolarDBMysqlInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rdsMysqlInfo)) {
            request.rdsMysqlInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rdsMysqlInfo, "RdsMysqlInfo", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.slsInfo)) {
            request.slsInfoShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.slsInfo, "SlsInfo", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceDescription)) {
            body.put("DatasourceDescription", request.datasourceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceId)) {
            body.put("DatasourceId", request.datasourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceName)) {
            body.put("DatasourceName", request.datasourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.kafkaInfoShrink)) {
            body.put("KafkaInfo", request.kafkaInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lakehouseIdShrink)) {
            body.put("LakehouseId", request.lakehouseIdShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.polarDBMysqlInfoShrink)) {
            body.put("PolarDBMysqlInfo", request.polarDBMysqlInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rdsMysqlInfoShrink)) {
            body.put("RdsMysqlInfo", request.rdsMysqlInfoShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slsInfoShrink)) {
            body.put("SlsInfo", request.slsInfoShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApsDatasoure"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApsDatasoureResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>You can call this operation only for AnalyticDB for MySQL clusters in elastic mode for Cluster Edition that have 32 cores or more.</li>
     * <li>You cannot modify the number of nodes for the USER_DEFAULT resource group.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies an AnalyticDB Pipeline Service (APS) data source.</p>
     * 
     * @param request ModifyApsDatasoureRequest
     * @return ModifyApsDatasoureResponse
     */
    public ModifyApsDatasoureResponse modifyApsDatasoure(ModifyApsDatasoureRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApsDatasoureWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an AnalyticDB Pipeline Service (APS) job.</p>
     * 
     * @param request ModifyApsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApsJobResponse
     */
    public ModifyApsJobResponse modifyApsJobWithOptions(ModifyApsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apsJobId)) {
            body.put("ApsJobId", request.apsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbList)) {
            body.put("DbList", request.dbList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionList)) {
            body.put("PartitionList", request.partitionList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApsJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApsJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies an AnalyticDB Pipeline Service (APS) job.</p>
     * 
     * @param request ModifyApsJobRequest
     * @return ModifyApsJobResponse
     */
    public ModifyApsJobResponse modifyApsJob(ModifyApsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApsJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an AnalyticDB Pipeline Service (APS) job from Simple Log Service (SLS) to an AnalyticDB for MySQL Data Warehouse Edition cluster.</p>
     * 
     * @param tmpReq ModifyApsSlsADBJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApsSlsADBJobResponse
     */
    public ModifyApsSlsADBJobResponse modifyApsSlsADBJobWithOptions(ModifyApsSlsADBJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyApsSlsADBJobShrinkRequest request = new ModifyApsSlsADBJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columns)) {
            request.columnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columns, "Columns", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.columnsShrink)) {
            body.put("Columns", request.columnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dirtyDataProcessPattern)) {
            body.put("DirtyDataProcessPattern", request.dirtyDataProcessPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exactlyOnce)) {
            body.put("ExactlyOnce", request.exactlyOnce);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startingOffsets)) {
            body.put("StartingOffsets", request.startingOffsets);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.unixTimestampConvert)) {
            body.put("UnixTimestampConvert", request.unixTimestampConvert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadId)) {
            body.put("WorkloadId", request.workloadId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadName)) {
            body.put("WorkloadName", request.workloadName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApsSlsADBJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApsSlsADBJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an AnalyticDB Pipeline Service (APS) job from Simple Log Service (SLS) to an AnalyticDB for MySQL Data Warehouse Edition cluster.</p>
     * 
     * @param request ModifyApsSlsADBJobRequest
     * @return ModifyApsSlsADBJobResponse
     */
    public ModifyApsSlsADBJobResponse modifyApsSlsADBJob(ModifyApsSlsADBJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApsSlsADBJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the AnalyticDB Pipeline Service (APS) workload name.</p>
     * 
     * @param request ModifyApsWorkloadNameRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyApsWorkloadNameResponse
     */
    public ModifyApsWorkloadNameResponse modifyApsWorkloadNameWithOptions(ModifyApsWorkloadNameRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadId)) {
            body.put("WorkloadId", request.workloadId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workloadName)) {
            body.put("WorkloadName", request.workloadName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyApsWorkloadName"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyApsWorkloadNameResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the AnalyticDB Pipeline Service (APS) workload name.</p>
     * 
     * @param request ModifyApsWorkloadNameRequest
     * @return ModifyApsWorkloadNameResponse
     */
    public ModifyApsWorkloadNameResponse modifyApsWorkloadName(ModifyApsWorkloadNameRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyApsWorkloadNameWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the SQL audit settings of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyAuditLogConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAuditLogConfigResponse
     */
    public ModifyAuditLogConfigResponse modifyAuditLogConfigWithOptions(ModifyAuditLogConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.auditLogStatus)) {
            query.put("AuditLogStatus", request.auditLogStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineType)) {
            query.put("EngineType", request.engineType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAuditLogConfig"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAuditLogConfigResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the SQL audit settings of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyAuditLogConfigRequest
     * @return ModifyAuditLogConfigResponse
     */
    public ModifyAuditLogConfigResponse modifyAuditLogConfig(ModifyAuditLogConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAuditLogConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改自动续费配置</p>
     * 
     * @param request ModifyAutoRenewalAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyAutoRenewalAttributeResponse
     */
    public ModifyAutoRenewalAttributeResponse modifyAutoRenewalAttributeWithOptions(ModifyAutoRenewalAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewalPeriod)) {
            query.put("AutoRenewalPeriod", request.autoRenewalPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewalPeriodUnit)) {
            query.put("AutoRenewalPeriodUnit", request.autoRenewalPeriodUnit);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.autoRenewalStatus)) {
            query.put("AutoRenewalStatus", request.autoRenewalStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAutoRenewalAttribute"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyAutoRenewalAttributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改自动续费配置</p>
     * 
     * @param request ModifyAutoRenewalAttributeRequest
     * @return ModifyAutoRenewalAttributeResponse
     */
    public ModifyAutoRenewalAttributeResponse modifyAutoRenewalAttribute(ModifyAutoRenewalAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAutoRenewalAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the backup policy of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyBackupPolicyResponse
     */
    public ModifyBackupPolicyResponse modifyBackupPolicyWithOptions(ModifyBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupRetentionPeriod)) {
            query.put("BackupRetentionPeriod", request.backupRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableBackupLog)) {
            query.put("EnableBackupLog", request.enableBackupLog);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logBackupRetentionPeriod)) {
            query.put("LogBackupRetentionPeriod", request.logBackupRetentionPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupPeriod)) {
            query.put("PreferredBackupPeriod", request.preferredBackupPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupTime)) {
            query.put("PreferredBackupTime", request.preferredBackupTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBackupPolicy"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyBackupPolicyResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the backup policy of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the wide table engine feature for an AnalyticDB for MySQL cluster or modifies the disk cache size of the wide table engine of an AnalyticDB for MySQL cluster for which you enabled the wide table engine feature.</p>
     * 
     * @param request ModifyClickhouseEngineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyClickhouseEngineResponse
     */
    public ModifyClickhouseEngineResponse modifyClickhouseEngineWithOptions(ModifyClickhouseEngineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cacheSize)) {
            query.put("CacheSize", request.cacheSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enabled)) {
            query.put("Enabled", request.enabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClickhouseEngine"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClickhouseEngineResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables the wide table engine feature for an AnalyticDB for MySQL cluster or modifies the disk cache size of the wide table engine of an AnalyticDB for MySQL cluster for which you enabled the wide table engine feature.</p>
     * 
     * @param request ModifyClickhouseEngineRequest
     * @return ModifyClickhouseEngineResponse
     */
    public ModifyClickhouseEngineResponse modifyClickhouseEngine(ModifyClickhouseEngineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyClickhouseEngineWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyClusterAccessWhiteListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyClusterAccessWhiteListResponse
     */
    public ModifyClusterAccessWhiteListResponse modifyClusterAccessWhiteListWithOptions(ModifyClusterAccessWhiteListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIPArrayAttribute)) {
            query.put("DBClusterIPArrayAttribute", request.DBClusterIPArrayAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterIPArrayName)) {
            query.put("DBClusterIPArrayName", request.DBClusterIPArrayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("ModifyMode", request.modifyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIps)) {
            query.put("SecurityIps", request.securityIps);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterAccessWhiteList"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterAccessWhiteListResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyClusterAccessWhiteListRequest
     * @return ModifyClusterAccessWhiteListResponse
     */
    public ModifyClusterAccessWhiteListResponse modifyClusterAccessWhiteList(ModifyClusterAccessWhiteListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyClusterAccessWhiteListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the public endpoint of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyClusterConnectionStringRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyClusterConnectionStringResponse
     */
    public ModifyClusterConnectionStringResponse modifyClusterConnectionStringWithOptions(ModifyClusterConnectionStringRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionStringPrefix)) {
            query.put("ConnectionStringPrefix", request.connectionStringPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentConnectionString)) {
            query.put("CurrentConnectionString", request.currentConnectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyClusterConnectionString"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyClusterConnectionStringResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the public endpoint of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyClusterConnectionStringRequest
     * @return ModifyClusterConnectionStringResponse
     */
    public ModifyClusterConnectionStringResponse modifyClusterConnectionString(ModifyClusterConnectionStringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyClusterConnectionStringWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the status of the remote build feature in the query acceleration configuration of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyCompactionServiceSwitchRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyCompactionServiceSwitchResponse
     */
    public ModifyCompactionServiceSwitchResponse modifyCompactionServiceSwitchWithOptions(ModifyCompactionServiceSwitchRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableCompactionService)) {
            query.put("EnableCompactionService", request.enableCompactionService);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyCompactionServiceSwitch"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyCompactionServiceSwitchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the status of the remote build feature in the query acceleration configuration of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyCompactionServiceSwitchRequest
     * @return ModifyCompactionServiceSwitchResponse
     */
    public ModifyCompactionServiceSwitchResponse modifyCompactionServiceSwitch(ModifyCompactionServiceSwitchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyCompactionServiceSwitchWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>During a scaling event, you are not allowed to execute the <code>SUBMIT JOB</code> statement to submit asynchronous jobs. If your business requires asynchronous jobs, perform scaling during appropriate periods.</li>
     * <li>When you scale a cluster, data in the cluster is migrated for redistribution. The amount of time that is required to migrate data is proportional to the data volume. During a scaling event, the services provided by the cluster are not interrupted. When you downgrade cluster specifications, data migration may require up to dozens of hours to complete. Proceed with caution especially if your cluster contains a large amount of data.</li>
     * <li>If the cluster has a built-in dataset loaded, make sure that the cluster has reserved storage resources of at least 24 AnalyticDB compute units (ACUs). Otherwise, the built-in dataset cannot be used.</li>
     * <li>When the scaling process is about to end, transient connections may occur. We recommend that you scale your cluster during off-peak hours or make sure that your application is configured to automatically reconnect to your cluster.</li>
     * <li>You can change an AnalyticDB for MySQL cluster from Data Warehouse Edition to Data Lakehouse Edition, but not the other way around. For more information, see Change a cluster from Data Warehouse Edition to Data Lakehouse Edition.</li>
     * <li>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the configurations of an AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
     * 
     * @param request ModifyDBClusterRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterResponse
     */
    public ModifyDBClusterResponse modifyDBClusterWithOptions(ModifyDBClusterRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.computeResource)) {
            query.put("ComputeResource", request.computeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableDefaultResourcePool)) {
            query.put("EnableDefaultResourcePool", request.enableDefaultResourcePool);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.productForm)) {
            query.put("ProductForm", request.productForm);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedNodeCount)) {
            query.put("ReservedNodeCount", request.reservedNodeCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.reservedNodeSize)) {
            query.put("ReservedNodeSize", request.reservedNodeSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageResource)) {
            query.put("StorageResource", request.storageResource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBCluster"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterResponse());
    }

    /**
     * <b>description</b> :
     * <h3><a href="#"></a></h3>
     * <ul>
     * <li>During a scaling event, you are not allowed to execute the <code>SUBMIT JOB</code> statement to submit asynchronous jobs. If your business requires asynchronous jobs, perform scaling during appropriate periods.</li>
     * <li>When you scale a cluster, data in the cluster is migrated for redistribution. The amount of time that is required to migrate data is proportional to the data volume. During a scaling event, the services provided by the cluster are not interrupted. When you downgrade cluster specifications, data migration may require up to dozens of hours to complete. Proceed with caution especially if your cluster contains a large amount of data.</li>
     * <li>If the cluster has a built-in dataset loaded, make sure that the cluster has reserved storage resources of at least 24 AnalyticDB compute units (ACUs). Otherwise, the built-in dataset cannot be used.</li>
     * <li>When the scaling process is about to end, transient connections may occur. We recommend that you scale your cluster during off-peak hours or make sure that your application is configured to automatically reconnect to your cluster.</li>
     * <li>You can change an AnalyticDB for MySQL cluster from Data Warehouse Edition to Data Lakehouse Edition, but not the other way around. For more information, see Change a cluster from Data Warehouse Edition to Data Lakehouse Edition.</li>
     * <li>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Changes the configurations of an AnalyticDB for MySQL Data Lakehouse Edition cluster.</p>
     * 
     * @param request ModifyDBClusterRequest
     * @return ModifyDBClusterResponse
     */
    public ModifyDBClusterResponse modifyDBCluster(ModifyDBClusterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description of an AnalyticDB for MySQL cluster to facilitate the maintenance and management of the cluster.</p>
     * 
     * @param request ModifyDBClusterDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterDescriptionResponse
     */
    public ModifyDBClusterDescriptionResponse modifyDBClusterDescriptionWithOptions(ModifyDBClusterDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterDescription)) {
            query.put("DBClusterDescription", request.DBClusterDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterDescription"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterDescriptionResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the description of an AnalyticDB for MySQL cluster to facilitate the maintenance and management of the cluster.</p>
     * 
     * @param request ModifyDBClusterDescriptionRequest
     * @return ModifyDBClusterDescriptionResponse
     */
    public ModifyDBClusterDescriptionResponse modifyDBClusterDescription(ModifyDBClusterDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the maintenance window of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyDBClusterMaintainTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterMaintainTimeResponse
     */
    public ModifyDBClusterMaintainTimeResponse modifyDBClusterMaintainTimeWithOptions(ModifyDBClusterMaintainTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maintainTime)) {
            query.put("MaintainTime", request.maintainTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterMaintainTime"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterMaintainTimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the maintenance window of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyDBClusterMaintainTimeRequest
     * @return ModifyDBClusterMaintainTimeResponse
     */
    public ModifyDBClusterMaintainTimeResponse modifyDBClusterMaintainTime(ModifyDBClusterMaintainTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterMaintainTimeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which an AnalyticDB for MySQL cluster belongs.</p>
     * 
     * @param request ModifyDBClusterResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterResourceGroupResponse
     */
    public ModifyDBClusterResourceGroupResponse modifyDBClusterResourceGroupWithOptions(ModifyDBClusterResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.newResourceGroupId)) {
            query.put("NewResourceGroupId", request.newResourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterResourceGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterResourceGroupResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the resource group to which an AnalyticDB for MySQL cluster belongs.</p>
     * 
     * @param request ModifyDBClusterResourceGroupRequest
     * @return ModifyDBClusterResourceGroupResponse
     */
    public ModifyDBClusterResourceGroupResponse modifyDBClusterResourceGroup(ModifyDBClusterResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the SSL link configuration of a cluster.</p>
     * 
     * @param request ModifyDBClusterSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterSSLResponse
     */
    public ModifyDBClusterSSLResponse modifyDBClusterSSLWithOptions(ModifyDBClusterSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionString)) {
            query.put("ConnectionString", request.connectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSSL)) {
            query.put("EnableSSL", request.enableSSL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterSSL"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterSSLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the SSL link configuration of a cluster.</p>
     * 
     * @param request ModifyDBClusterSSLRequest
     * @return ModifyDBClusterSSLResponse
     */
    public ModifyDBClusterSSLResponse modifyDBClusterSSL(ModifyDBClusterSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterSSLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the virtual IP address (VIP) that is used to connect to an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyDBClusterVipRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBClusterVipResponse
     */
    public ModifyDBClusterVipResponse modifyDBClusterVipWithOptions(ModifyDBClusterVipRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectString)) {
            query.put("ConnectString", request.connectString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.VPCId)) {
            query.put("VPCId", request.VPCId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchId)) {
            query.put("VSwitchId", request.vSwitchId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBClusterVip"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBClusterVipResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the virtual IP address (VIP) that is used to connect to an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyDBClusterVipRequest
     * @return ModifyDBClusterVipResponse
     */
    public ModifyDBClusterVipResponse modifyDBClusterVip(ModifyDBClusterVipRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBClusterVipWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the amount of reserved computing resources for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param tmpReq ModifyDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBResourceGroupResponse
     */
    public ModifyDBResourceGroupResponse modifyDBResourceGroupWithOptions(ModifyDBResourceGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyDBResourceGroupShrinkRequest request = new ModifyDBResourceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.engineParams)) {
            request.engineParamsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.engineParams, "EngineParams", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.gpuElasticPlan)) {
            request.gpuElasticPlanShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.gpuElasticPlan, "GpuElasticPlan", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rayConfig)) {
            request.rayConfigShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rayConfig, "RayConfig", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rules)) {
            request.rulesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rules, "Rules", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.autoStopInterval)) {
            query.put("AutoStopInterval", request.autoStopInterval);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterMode)) {
            query.put("ClusterMode", request.clusterMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clusterSizeResource)) {
            query.put("ClusterSizeResource", request.clusterSizeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSpot)) {
            query.put("EnableSpot", request.enableSpot);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineParamsShrink)) {
            query.put("EngineParams", request.engineParamsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.gpuElasticPlanShrink)) {
            query.put("GpuElasticPlan", request.gpuElasticPlanShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupType)) {
            query.put("GroupType", request.groupType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxClusterCount)) {
            query.put("MaxClusterCount", request.maxClusterCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxComputeResource)) {
            query.put("MaxComputeResource", request.maxComputeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxGpuQuantity)) {
            query.put("MaxGpuQuantity", request.maxGpuQuantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minClusterCount)) {
            query.put("MinClusterCount", request.minClusterCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minComputeResource)) {
            query.put("MinComputeResource", request.minComputeResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minGpuQuantity)) {
            query.put("MinGpuQuantity", request.minGpuQuantity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rayConfigShrink)) {
            query.put("RayConfig", request.rayConfigShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rulesShrink)) {
            query.put("Rules", request.rulesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specName)) {
            query.put("SpecName", request.specName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetResourceGroupName)) {
            query.put("TargetResourceGroupName", request.targetResourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBResourceGroup"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the amount of reserved computing resources for an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ModifyDBResourceGroupRequest
     * @return ModifyDBResourceGroupResponse
     */
    public ModifyDBResourceGroupResponse modifyDBResourceGroup(ModifyDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a scaling plan for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyElasticPlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyElasticPlanResponse
     */
    public ModifyElasticPlanResponse modifyElasticPlanWithOptions(ModifyElasticPlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cronExpression)) {
            query.put("CronExpression", request.cronExpression);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.elasticPlanName)) {
            query.put("ElasticPlanName", request.elasticPlanName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetSize)) {
            query.put("TargetSize", request.targetSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyElasticPlan"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyElasticPlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see Endpoints.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a scaling plan for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyElasticPlanRequest
     * @return ModifyElasticPlanResponse
     */
    public ModifyElasticPlanResponse modifyElasticPlan(ModifyElasticPlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyElasticPlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the disk cache size in the query acceleration configuration of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyEssdCacheConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyEssdCacheConfigResponse
     */
    public ModifyEssdCacheConfigResponse modifyEssdCacheConfigWithOptions(ModifyEssdCacheConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableEssdCache)) {
            query.put("EnableEssdCache", request.enableEssdCache);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.essdCacheSize)) {
            query.put("EssdCacheSize", request.essdCacheSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyEssdCacheConfig"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyEssdCacheConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the disk cache size in the query acceleration configuration of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyEssdCacheConfigRequest
     * @return ModifyEssdCacheConfigResponse
     */
    public ModifyEssdCacheConfigResponse modifyEssdCacheConfig(ModifyEssdCacheConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyEssdCacheConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the lake cache size of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyLakeCacheSizeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyLakeCacheSizeResponse
     */
    public ModifyLakeCacheSizeResponse modifyLakeCacheSizeWithOptions(ModifyLakeCacheSizeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.capacity)) {
            query.put("Capacity", request.capacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableLakeCache)) {
            query.put("EnableLakeCache", request.enableLakeCache);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyLakeCacheSize"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyLakeCacheSizeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the lake cache size of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ModifyLakeCacheSizeRequest
     * @return ModifyLakeCacheSizeResponse
     */
    public ModifyLakeCacheSizeResponse modifyLakeCacheSize(ModifyLakeCacheSizeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyLakeCacheSizeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies materialized views.</p>
     * 
     * @param request ModifyMaterializedViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMaterializedViewResponse
     */
    public ModifyMaterializedViewResponse modifyMaterializedViewWithOptions(ModifyMaterializedViewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            query.put("DbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableDelayAlert)) {
            query.put("EnableDelayAlert", request.enableDelayAlert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableFailureAlert)) {
            query.put("EnableFailureAlert", request.enableFailureAlert);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.latencyTolerance)) {
            query.put("LatencyTolerance", request.latencyTolerance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryWrite)) {
            query.put("QueryWrite", request.queryWrite);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewName)) {
            query.put("ViewName", request.viewName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMaterializedView"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMaterializedViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies materialized views.</p>
     * 
     * @param request ModifyMaterializedViewRequest
     * @return ModifyMaterializedViewResponse
     */
    public ModifyMaterializedViewResponse modifyMaterializedView(ModifyMaterializedViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMaterializedViewWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a materialized view recommendation task.</p>
     * 
     * @param request ModifyMaterializedViewRecommendRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMaterializedViewRecommendResponse
     */
    public ModifyMaterializedViewRecommendResponse modifyMaterializedViewRecommendWithOptions(ModifyMaterializedViewRecommendRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            query.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minRewriteQueryCount)) {
            query.put("MinRewriteQueryCount", request.minRewriteQueryCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minRewriteQueryPattern)) {
            query.put("MinRewriteQueryPattern", request.minRewriteQueryPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.scanQueriesRange)) {
            query.put("ScanQueriesRange", request.scanQueriesRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulingDay)) {
            query.put("SchedulingDay", request.schedulingDay);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schedulingPolicy)) {
            query.put("SchedulingPolicy", request.schedulingPolicy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slowQueryThreshold)) {
            query.put("SlowQueryThreshold", request.slowQueryThreshold);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.specifiedTime)) {
            query.put("SpecifiedTime", request.specifiedTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskName)) {
            query.put("TaskName", request.taskName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMaterializedViewRecommend"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMaterializedViewRecommendResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a materialized view recommendation task.</p>
     * 
     * @param request ModifyMaterializedViewRecommendRequest
     * @return ModifyMaterializedViewRecommendResponse
     */
    public ModifyMaterializedViewRecommendResponse modifyMaterializedViewRecommend(ModifyMaterializedViewRecommendRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMaterializedViewRecommendWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about a custom monitoring view.</p>
     * 
     * @param tmpReq ModifyPerformanceViewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyPerformanceViewResponse
     */
    public ModifyPerformanceViewResponse modifyPerformanceViewWithOptions(ModifyPerformanceViewRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyPerformanceViewShrinkRequest request = new ModifyPerformanceViewShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.viewDetail)) {
            request.viewDetailShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.viewDetail, "ViewDetail", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewDetailShrink)) {
            query.put("ViewDetail", request.viewDetailShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.viewName)) {
            query.put("ViewName", request.viewName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyPerformanceView"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyPerformanceViewResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the information about a custom monitoring view.</p>
     * 
     * @param request ModifyPerformanceViewRequest
     * @return ModifyPerformanceViewResponse
     */
    public ModifyPerformanceViewResponse modifyPerformanceView(ModifyPerformanceViewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyPerformanceViewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the directory location of SQL templates.</p>
     * 
     * @param request ModifySqlTemplatePositionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySqlTemplatePositionResponse
     */
    public ModifySqlTemplatePositionResponse modifySqlTemplatePositionWithOptions(ModifySqlTemplatePositionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTemplateGroupId)) {
            query.put("TargetTemplateGroupId", request.targetTemplateGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateId)) {
            query.put("TemplateId", request.templateId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySqlTemplatePosition"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySqlTemplatePositionResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the directory location of SQL templates.</p>
     * 
     * @param request ModifySqlTemplatePositionRequest
     * @return ModifySqlTemplatePositionResponse
     */
    public ModifySqlTemplatePositionResponse modifySqlTemplatePosition(ModifySqlTemplatePositionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySqlTemplatePositionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the vSwitches that are connected to elastic network interfaces (ENIs).</p>
     * 
     * @param request ModifyUserEniVswitchOptionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyUserEniVswitchOptionsResponse
     */
    public ModifyUserEniVswitchOptionsResponse modifyUserEniVswitchOptionsWithOptions(ModifyUserEniVswitchOptionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dbClusterId)) {
            query.put("DbClusterId", request.dbClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.vSwitchOptions)) {
            body.put("VSwitchOptions", request.vSwitchOptions);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyUserEniVswitchOptions"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyUserEniVswitchOptionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the vSwitches that are connected to elastic network interfaces (ENIs).</p>
     * 
     * @param request ModifyUserEniVswitchOptionsRequest
     * @return ModifyUserEniVswitchOptionsResponse
     */
    public ModifyUserEniVswitchOptionsResponse modifyUserEniVswitchOptions(ModifyUserEniVswitchOptionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyUserEniVswitchOptionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Preloads metrics for a Spark application.</p>
     * 
     * @param request PreloadSparkAppMetricsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PreloadSparkAppMetricsResponse
     */
    public PreloadSparkAppMetricsResponse preloadSparkAppMetricsWithOptions(PreloadSparkAppMetricsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreloadSparkAppMetrics"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreloadSparkAppMetricsResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Preloads metrics for a Spark application.</p>
     * 
     * @param request PreloadSparkAppMetricsRequest
     * @return PreloadSparkAppMetricsResponse
     */
    public PreloadSparkAppMetricsResponse preloadSparkAppMetrics(PreloadSparkAppMetricsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.preloadSparkAppMetricsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases the public endpoint of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ReleaseClusterPublicConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseClusterPublicConnectionResponse
     */
    public ReleaseClusterPublicConnectionResponse releaseClusterPublicConnectionWithOptions(ReleaseClusterPublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseClusterPublicConnection"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseClusterPublicConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases the public endpoint of an AnalyticDB for MySQL Data Lakehouse Edition (V3.0) cluster.</p>
     * 
     * @param request ReleaseClusterPublicConnectionRequest
     * @return ReleaseClusterPublicConnectionResponse
     */
    public ReleaseClusterPublicConnectionResponse releaseClusterPublicConnection(ReleaseClusterPublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseClusterPublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the password of a database account for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ResetAccountPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAccountPasswordResponse
     */
    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountDescription)) {
            query.put("AccountDescription", request.accountDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAccountPassword"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetAccountPasswordResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Resets the password of a database account for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAccountPasswordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes permissions from the service account of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request RevokeOperatorPermissionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeOperatorPermissionResponse
     */
    public RevokeOperatorPermissionResponse revokeOperatorPermissionWithOptions(RevokeOperatorPermissionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeOperatorPermission"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeOperatorPermissionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Revokes permissions from the service account of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request RevokeOperatorPermissionRequest
     * @return RevokeOperatorPermissionResponse
     */
    public RevokeOperatorPermissionResponse revokeOperatorPermission(RevokeOperatorPermissionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.revokeOperatorPermissionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the Spark log configuration.</p>
     * 
     * @param request SetSparkAppLogRootPathRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetSparkAppLogRootPathResponse
     */
    public SetSparkAppLogRootPathResponse setSparkAppLogRootPathWithOptions(SetSparkAppLogRootPathRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossLogPath)) {
            body.put("OssLogPath", request.ossLogPath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useDefaultOss)) {
            body.put("UseDefaultOss", request.useDefaultOss);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetSparkAppLogRootPath"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetSparkAppLogRootPathResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Modifies the Spark log configuration.</p>
     * 
     * @param request SetSparkAppLogRootPathRequest
     * @return SetSparkAppLogRootPathResponse
     */
    public SetSparkAppLogRootPathResponse setSparkAppLogRootPath(SetSparkAppLogRootPathRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setSparkAppLogRootPathWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an AnalyticDB Pipeline Service (APS) job.</p>
     * 
     * @param request StartApsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartApsJobResponse
     */
    public StartApsJobResponse startApsJobWithOptions(StartApsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apsJobId)) {
            body.put("ApsJobId", request.apsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartApsJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartApsJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts an AnalyticDB Pipeline Service (APS) job.</p>
     * 
     * @param request StartApsJobRequest
     * @return StartApsJobResponse
     */
    public StartApsJobResponse startApsJob(StartApsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startApsJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a Spark session.</p>
     * 
     * @param request StartSparkReplSessionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSparkReplSessionResponse
     */
    public StartSparkReplSessionResponse startSparkReplSessionWithOptions(StartSparkReplSessionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSparkReplSession"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSparkReplSessionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Starts a Spark session.</p>
     * 
     * @param request StartSparkReplSessionRequest
     * @return StartSparkReplSessionResponse
     */
    public StartSparkReplSessionResponse startSparkReplSession(StartSparkReplSessionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSparkReplSessionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Starts the Spark SQL engine.</p>
     * 
     * @deprecated OpenAPI StartSparkSQLEngine is deprecated
     * 
     * @param request StartSparkSQLEngineRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return StartSparkSQLEngineResponse
     */
    @Deprecated
    // Deprecated
    public StartSparkSQLEngineResponse startSparkSQLEngineWithOptions(StartSparkSQLEngineRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            body.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jars)) {
            body.put("Jars", request.jars);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxExecutor)) {
            body.put("MaxExecutor", request.maxExecutor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minExecutor)) {
            body.put("MinExecutor", request.minExecutor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.slotNum)) {
            body.put("SlotNum", request.slotNum);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StartSparkSQLEngine"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StartSparkSQLEngineResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Starts the Spark SQL engine.</p>
     * 
     * @deprecated OpenAPI StartSparkSQLEngine is deprecated
     * 
     * @param request StartSparkSQLEngineRequest
     * @return StartSparkSQLEngineResponse
     */
    @Deprecated
    // Deprecated
    public StartSparkSQLEngineResponse startSparkSQLEngine(StartSparkSQLEngineRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.startSparkSQLEngineWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Submits an SQL query and exports a result set.</p>
     * 
     * @param request SubmitResultExportJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitResultExportJobResponse
     */
    public SubmitResultExportJobResponse submitResultExportJobWithOptions(SubmitResultExportJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            body.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.exportType)) {
            body.put("ExportType", request.exportType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroup)) {
            body.put("ResourceGroup", request.resourceGroup);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SQL)) {
            body.put("SQL", request.SQL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.schema)) {
            body.put("Schema", request.schema);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitResultExportJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitResultExportJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Submits an SQL query and exports a result set.</p>
     * 
     * @param request SubmitResultExportJobRequest
     * @return SubmitResultExportJobResponse
     */
    public SubmitResultExportJobResponse submitResultExportJob(SubmitResultExportJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitResultExportJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a Spark application.</p>
     * 
     * @param request SubmitSparkAppRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSparkAppResponse
     */
    public SubmitSparkAppResponse submitSparkAppWithOptions(SubmitSparkAppRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.agentSource)) {
            body.put("AgentSource", request.agentSource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.agentVersion)) {
            body.put("AgentVersion", request.agentVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appName)) {
            body.put("AppName", request.appName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.appType)) {
            body.put("AppType", request.appType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.data)) {
            body.put("Data", request.data);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.templateFileId)) {
            body.put("TemplateFileId", request.templateFileId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSparkApp"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSparkAppResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a Spark application.</p>
     * 
     * @param request SubmitSparkAppRequest
     * @return SubmitSparkAppResponse
     */
    public SubmitSparkAppResponse submitSparkApp(SubmitSparkAppRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSparkAppWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a Spark log analysis task and queries the analysis results.</p>
     * 
     * @param request SubmitSparkLogAnalyzeTaskRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitSparkLogAnalyzeTaskResponse
     */
    public SubmitSparkLogAnalyzeTaskResponse submitSparkLogAnalyzeTaskWithOptions(SubmitSparkLogAnalyzeTaskRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.appId)) {
            body.put("AppId", request.appId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitSparkLogAnalyzeTask"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitSparkLogAnalyzeTaskResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Submits a Spark log analysis task and queries the analysis results.</p>
     * 
     * @param request SubmitSparkLogAnalyzeTaskRequest
     * @return SubmitSparkLogAnalyzeTaskResponse
     */
    public SubmitSparkLogAnalyzeTaskResponse submitSparkLogAnalyzeTask(SubmitSparkLogAnalyzeTaskRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.submitSparkLogAnalyzeTaskWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Suspends an AnalyticDB Pipeline Service (APS) job.</p>
     * 
     * @param request SuspendApsJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SuspendApsJobResponse
     */
    public SuspendApsJobResponse suspendApsJobWithOptions(SuspendApsJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.apsJobId)) {
            body.put("ApsJobId", request.apsJobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SuspendApsJob"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SuspendApsJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Suspends an AnalyticDB Pipeline Service (APS) job.</p>
     * 
     * @param request SuspendApsJobRequest
     * @return SuspendApsJobResponse
     */
    public SuspendApsJobResponse suspendApsJob(SuspendApsJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.suspendApsJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a standard account of an AnalyticDB for MySQL cluster from a Resource Access Management (RAM) user.</p>
     * 
     * @param request UnbindAccountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindAccountResponse
     */
    public UnbindAccountResponse unbindAccountWithOptions(UnbindAccountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindAccount"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindAccountResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates a standard account of an AnalyticDB for MySQL cluster from a Resource Access Management (RAM) user.</p>
     * 
     * @param request UnbindAccountRequest
     * @return UnbindAccountResponse
     */
    public UnbindAccountResponse unbindAccount(UnbindAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindAccountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates resource groups from database accounts for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request UnbindDBResourceGroupWithUserRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindDBResourceGroupWithUserResponse
     */
    public UnbindDBResourceGroupWithUserResponse unbindDBResourceGroupWithUserWithOptions(UnbindDBResourceGroupWithUserRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupUser)) {
            query.put("GroupUser", request.groupUser);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindDBResourceGroupWithUser"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindDBResourceGroupWithUserResponse());
    }

    /**
     * <b>description</b> :
     * <p>For information about the endpoints of AnalyticDB for MySQL, see <a href="https://help.aliyun.com/document_detail/612373.html">Endpoints</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Disassociates resource groups from database accounts for an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request UnbindDBResourceGroupWithUserRequest
     * @return UnbindDBResourceGroupWithUserResponse
     */
    public UnbindDBResourceGroupWithUserResponse unbindDBResourceGroupWithUser(UnbindDBResourceGroupWithUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindDBResourceGroupWithUserWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the webhook configuration of a specified cluster.</p>
     * 
     * @param tmpReq UpdateApsWebhookRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateApsWebhookResponse
     */
    public UpdateApsWebhookResponse updateApsWebhookWithOptions(UpdateApsWebhookRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateApsWebhookShrinkRequest request = new UpdateApsWebhookShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.webhook)) {
            request.webhookShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.webhook, "Webhook", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.webhookShrink)) {
            body.put("Webhook", request.webhookShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateApsWebhook"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateApsWebhookResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the webhook configuration of a specified cluster.</p>
     * 
     * @param request UpdateApsWebhookRequest
     * @return UpdateApsWebhookResponse
     */
    public UpdateApsWebhookResponse updateApsWebhook(UpdateApsWebhookRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateApsWebhookWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a lake storage.</p>
     * 
     * @param tmpReq UpdateLakeStorageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateLakeStorageResponse
     */
    public UpdateLakeStorageResponse updateLakeStorageWithOptions(UpdateLakeStorageRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateLakeStorageShrinkRequest request = new UpdateLakeStorageShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.permissions)) {
            request.permissionsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.permissions, "Permissions", "json");
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lakeStorageId)) {
            body.put("LakeStorageId", request.lakeStorageId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.permissionsShrink)) {
            body.put("Permissions", request.permissionsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            body.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateLakeStorage"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateLakeStorageResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates a lake storage.</p>
     * 
     * @param request UpdateLakeStorageRequest
     * @return UpdateLakeStorageResponse
     */
    public UpdateLakeStorageResponse updateLakeStorage(UpdateLakeStorageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateLakeStorageWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a Spark application template.</p>
     * 
     * @param request UpdateSparkTemplateFileRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateSparkTemplateFileResponse
     */
    public UpdateSparkTemplateFileResponse updateSparkTemplateFileWithOptions(UpdateSparkTemplateFileRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            body.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            body.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            body.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateSparkTemplateFile"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateSparkTemplateFileResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Regional public endpoint: <code>adb.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb.cn-hangzhou.aliyuncs.com</code>.</p>
     * <ul>
     * <li>Regional Virtual Private Cloud (VPC) endpoint: <code>adb-vpc.&lt;region-id&gt;.aliyuncs.com</code>. Example: <code>adb-vpc.cn-hangzhou.aliyuncs.com</code>.<blockquote>
     * <p> If HTTP status code 409 is returned when you call this operation in the China (Qingdao), China (Shenzhen), China (Guangzhou), or China (Hong Kong) region, contact technical support.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Updates a Spark application template.</p>
     * 
     * @param request UpdateSparkTemplateFileRequest
     * @return UpdateSparkTemplateFileResponse
     */
    public UpdateSparkTemplateFileResponse updateSparkTemplateFile(UpdateSparkTemplateFileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateSparkTemplateFileWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the minor version of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request UpgradeKernelVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeKernelVersionResponse
     */
    public UpgradeKernelVersionResponse upgradeKernelVersionWithOptions(UpgradeKernelVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBClusterId)) {
            query.put("DBClusterId", request.DBClusterId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBVersion)) {
            query.put("DBVersion", request.DBVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerAccount)) {
            query.put("ResourceOwnerAccount", request.resourceOwnerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceOwnerId)) {
            query.put("ResourceOwnerId", request.resourceOwnerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchMode)) {
            query.put("SwitchMode", request.switchMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeKernelVersion"),
            new TeaPair("version", "2021-12-01"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeKernelVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates the minor version of an AnalyticDB for MySQL cluster.</p>
     * 
     * @param request UpgradeKernelVersionRequest
     * @return UpgradeKernelVersionResponse
     */
    public UpgradeKernelVersionResponse upgradeKernelVersion(UpgradeKernelVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeKernelVersionWithOptions(request, runtime);
    }
}
