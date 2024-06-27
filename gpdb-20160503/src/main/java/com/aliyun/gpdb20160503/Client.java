// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503;

import com.aliyun.tea.*;
import com.aliyun.gpdb20160503.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("cn-beijing", "gpdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "gpdb.aliyuncs.com"),
            new TeaPair("cn-shanghai", "gpdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "gpdb.aliyuncs.com"),
            new TeaPair("cn-hongkong", "gpdb.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "gpdb.aliyuncs.com"),
            new TeaPair("us-west-1", "gpdb.aliyuncs.com"),
            new TeaPair("us-east-1", "gpdb.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "gpdb.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "gpdb.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "gpdb.aliyuncs.com"),
            new TeaPair("cn-qingdao", "gpdb.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "gpdb.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("gpdb", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <p>You can call this operation to apply for a public endpoint for an AnalyticDB for PostgreSQL instance. Both the primary and instance endpoints of an AnalyticDB for PostgreSQL instance can be public endpoints. For more information, see <a href="https://help.aliyun.com/document_detail/204879.html">Endpoints of an instance and its primary coordinator node</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Allocates a public endpoint for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request AllocateInstancePublicConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return AllocateInstancePublicConnectionResponse
     */
    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnectionWithOptions(AllocateInstancePublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.connectionStringPrefix)) {
            query.put("ConnectionStringPrefix", request.connectionStringPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
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
            new TeaPair("action", "AllocateInstancePublicConnection"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AllocateInstancePublicConnectionResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to apply for a public endpoint for an AnalyticDB for PostgreSQL instance. Both the primary and instance endpoints of an AnalyticDB for PostgreSQL instance can be public endpoints. For more information, see <a href="https://help.aliyun.com/document_detail/204879.html">Endpoints of an instance and its primary coordinator node</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Allocates a public endpoint for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request AllocateInstancePublicConnectionRequest
     * @return AllocateInstancePublicConnectionResponse
     */
    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateInstancePublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a resource group to a database role.</p>
     * 
     * @param tmpReq BindDBResourceGroupWithRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return BindDBResourceGroupWithRoleResponse
     */
    public BindDBResourceGroupWithRoleResponse bindDBResourceGroupWithRoleWithOptions(BindDBResourceGroupWithRoleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        BindDBResourceGroupWithRoleShrinkRequest request = new BindDBResourceGroupWithRoleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleList)) {
            request.roleListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleList, "RoleList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleListShrink)) {
            query.put("RoleList", request.roleListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BindDBResourceGroupWithRole"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BindDBResourceGroupWithRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Binds a resource group to a database role.</p>
     * 
     * @param request BindDBResourceGroupWithRoleRequest
     * @return BindDBResourceGroupWithRoleResponse
     */
    public BindDBResourceGroupWithRoleResponse bindDBResourceGroupWithRole(BindDBResourceGroupWithRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.bindDBResourceGroupWithRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is related to the UploadDocumentAsync operation. You can call this operation to cancel a document upload job.</p>
     * <blockquote>
     * <p> If the canceling operation is complete, failed, or is canceled, you cannot call the operation again. The canceling operation only interrupts the document upload job. To remove the uploaded data, you must manually remove it or call the DeleteCollectionData operation. You can also call the document upload operation to overwrite the data by using the same FileName parameter.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Cancels an asynchronous document upload job based on the job ID.</p>
     * 
     * @param request CancelUploadDocumentJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelUploadDocumentJobResponse
     */
    public CancelUploadDocumentJobResponse cancelUploadDocumentJobWithOptions(CancelUploadDocumentJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            body.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            body.put("NamespacePassword", request.namespacePassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelUploadDocumentJob"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelUploadDocumentJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is related to the UploadDocumentAsync operation. You can call this operation to cancel a document upload job.</p>
     * <blockquote>
     * <p> If the canceling operation is complete, failed, or is canceled, you cannot call the operation again. The canceling operation only interrupts the document upload job. To remove the uploaded data, you must manually remove it or call the DeleteCollectionData operation. You can also call the document upload operation to overwrite the data by using the same FileName parameter.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Cancels an asynchronous document upload job based on the job ID.</p>
     * 
     * @param request CancelUploadDocumentJobRequest
     * @return CancelUploadDocumentJobResponse
     */
    public CancelUploadDocumentJobResponse cancelUploadDocumentJob(CancelUploadDocumentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelUploadDocumentJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is related to the <code>UpsertCollectionDataAsync</code> operation. You can call this operation to cancel an upload job.</p>
     * <blockquote>
     * <p> If the canceling operation is complete, failed, or is canceled, you cannot call the operation again. The canceling operation only interrupts the upload job. To remove the uploaded data, you must manually remove it or call the DeleteCollectionData operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Cancels an asynchronous vector data upload job by using a job ID.</p>
     * 
     * @param request CancelUpsertCollectionDataJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelUpsertCollectionDataJobResponse
     */
    public CancelUpsertCollectionDataJobResponse cancelUpsertCollectionDataJobWithOptions(CancelUpsertCollectionDataJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            body.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            body.put("NamespacePassword", request.namespacePassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelUpsertCollectionDataJob"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelUpsertCollectionDataJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is related to the <code>UpsertCollectionDataAsync</code> operation. You can call this operation to cancel an upload job.</p>
     * <blockquote>
     * <p> If the canceling operation is complete, failed, or is canceled, you cannot call the operation again. The canceling operation only interrupts the upload job. To remove the uploaded data, you must manually remove it or call the DeleteCollectionData operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Cancels an asynchronous vector data upload job by using a job ID.</p>
     * 
     * @param request CancelUpsertCollectionDataJobRequest
     * @return CancelUpsertCollectionDataJobResponse
     */
    public CancelUpsertCollectionDataJobResponse cancelUpsertCollectionDataJob(CancelUpsertCollectionDataJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelUpsertCollectionDataJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the configurations of a Hadoop data source.</p>
     * 
     * @param request CheckHadoopDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckHadoopDataSourceResponse
     */
    public CheckHadoopDataSourceResponse checkHadoopDataSourceWithOptions(CheckHadoopDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.checkDir)) {
            query.put("CheckDir", request.checkDir);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckHadoopDataSource"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckHadoopDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the configurations of a Hadoop data source.</p>
     * 
     * @param request CheckHadoopDataSourceRequest
     * @return CheckHadoopDataSourceResponse
     */
    public CheckHadoopDataSourceResponse checkHadoopDataSource(CheckHadoopDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkHadoopDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>检查hadoop集群网络连通性</p>
     * 
     * @param request CheckHadoopNetConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckHadoopNetConnectionResponse
     */
    public CheckHadoopNetConnectionResponse checkHadoopNetConnectionWithOptions(CheckHadoopNetConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emrInstanceId)) {
            query.put("EmrInstanceId", request.emrInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckHadoopNetConnection"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckHadoopNetConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>检查hadoop集群网络连通性</p>
     * 
     * @param request CheckHadoopNetConnectionRequest
     * @return CheckHadoopNetConnectionResponse
     */
    public CheckHadoopNetConnectionResponse checkHadoopNetConnection(CheckHadoopNetConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkHadoopNetConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the network connectivity of a connection specified by a Java Database Connectivity (JDBC) connection string.</p>
     * 
     * @param request CheckJDBCSourceNetConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckJDBCSourceNetConnectionResponse
     */
    public CheckJDBCSourceNetConnectionResponse checkJDBCSourceNetConnectionWithOptions(CheckJDBCSourceNetConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jdbcConnectionString)) {
            query.put("JdbcConnectionString", request.jdbcConnectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckJDBCSourceNetConnection"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckJDBCSourceNetConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Checks the network connectivity of a connection specified by a Java Database Connectivity (JDBC) connection string.</p>
     * 
     * @param request CheckJDBCSourceNetConnectionRequest
     * @return CheckJDBCSourceNetConnectionResponse
     */
    public CheckJDBCSourceNetConnectionResponse checkJDBCSourceNetConnection(CheckJDBCSourceNetConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkJDBCSourceNetConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether a service-linked role is created.</p>
     * 
     * @param request CheckServiceLinkedRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckServiceLinkedRoleResponse
     */
    public CheckServiceLinkedRoleResponse checkServiceLinkedRoleWithOptions(CheckServiceLinkedRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckServiceLinkedRole"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckServiceLinkedRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries whether a service-linked role is created.</p>
     * 
     * @param request CheckServiceLinkedRoleRequest
     * @return CheckServiceLinkedRoleResponse
     */
    public CheckServiceLinkedRoleResponse checkServiceLinkedRole(CheckServiceLinkedRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkServiceLinkedRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Before you can use an AnalyticDB for PostgreSQL instance, you must create a privileged account for the instance.</p>
     * <ul>
     * <li>You can call this operation to create only privileged accounts. For information about how to create other types of accounts, see <a href="https://help.aliyun.com/document_detail/50206.html">Create a database account</a>.</li>
     * </ul>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a privileged account for an AnalyticDB for PostgreSQL instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateAccount"),
            new TeaPair("version", "2016-05-03"),
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
     * <p>  Before you can use an AnalyticDB for PostgreSQL instance, you must create a privileged account for the instance.</p>
     * <ul>
     * <li>You can call this operation to create only privileged accounts. For information about how to create other types of accounts, see <a href="https://help.aliyun.com/document_detail/50206.html">Create a database account</a>.</li>
     * </ul>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates a privileged account for an AnalyticDB for PostgreSQL instance.</p>
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
     * <p>Creates a vector collection.</p>
     * 
     * @param request CreateCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCollectionResponse
     */
    public CreateCollectionResponse createCollectionWithOptions(CreateCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimension)) {
            query.put("Dimension", request.dimension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalStorage)) {
            query.put("ExternalStorage", request.externalStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullTextRetrievalFields)) {
            query.put("FullTextRetrievalFields", request.fullTextRetrievalFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hnswM)) {
            query.put("HnswM", request.hnswM);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccount)) {
            query.put("ManagerAccount", request.managerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccountPassword)) {
            query.put("ManagerAccountPassword", request.managerAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadata)) {
            query.put("Metadata", request.metadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            query.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parser)) {
            query.put("Parser", request.parser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pqEnable)) {
            query.put("PqEnable", request.pqEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCollection"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a vector collection.</p>
     * 
     * @param request CreateCollectionRequest
     * @return CreateCollectionResponse
     */
    public CreateCollectionResponse createCollection(CreateCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCollectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation when you need to create AnalyticDB for PostgreSQL instances to meet the requirements of new applications or services.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL instances. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request CreateDBInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBInstanceResponse
     */
    public CreateDBInstanceResponse createDBInstanceWithOptions(CreateDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.createSampleData)) {
            query.put("CreateSampleData", request.createSampleData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceCategory)) {
            query.put("DBInstanceCategory", request.DBInstanceCategory);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceClass)) {
            query.put("DBInstanceClass", request.DBInstanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceDescription)) {
            query.put("DBInstanceDescription", request.DBInstanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceGroupCount)) {
            query.put("DBInstanceGroupCount", request.DBInstanceGroupCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceMode)) {
            query.put("DBInstanceMode", request.DBInstanceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableSSL)) {
            query.put("EnableSSL", request.enableSSL);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionKey)) {
            query.put("EncryptionKey", request.encryptionKey);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.encryptionType)) {
            query.put("EncryptionType", request.encryptionType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engine)) {
            query.put("Engine", request.engine);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.engineVersion)) {
            query.put("EngineVersion", request.engineVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTime)) {
            query.put("IdleTime", request.idleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceNetworkType)) {
            query.put("InstanceNetworkType", request.instanceNetworkType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSpec)) {
            query.put("InstanceSpec", request.instanceSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterCU)) {
            query.put("MasterCU", request.masterCU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterNodeNum)) {
            query.put("MasterNodeNum", request.masterNodeNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.period)) {
            query.put("Period", request.period);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.privateIpAddress)) {
            query.put("PrivateIpAddress", request.privateIpAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.prodType)) {
            query.put("ProdType", request.prodType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIPList)) {
            query.put("SecurityIPList", request.securityIPList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.segDiskPerformanceLevel)) {
            query.put("SegDiskPerformanceLevel", request.segDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.segNodeNum)) {
            query.put("SegNodeNum", request.segNodeNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.segStorageType)) {
            query.put("SegStorageType", request.segStorageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessMode)) {
            query.put("ServerlessMode", request.serverlessMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessResource)) {
            query.put("ServerlessResource", request.serverlessResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcDbInstanceName)) {
            query.put("SrcDbInstanceName", request.srcDbInstanceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSize)) {
            query.put("StorageSize", request.storageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageType)) {
            query.put("StorageType", request.storageType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vectorConfigurationStatus)) {
            query.put("VectorConfigurationStatus", request.vectorConfigurationStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDBInstance"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation when you need to create AnalyticDB for PostgreSQL instances to meet the requirements of new applications or services.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL instances. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Creates an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     */
    public CreateDBInstanceResponse createDBInstance(CreateDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  The plan management feature is supported only for pay-as-you-go instances.</p>
     * <ul>
     * <li>When you change the compute node specifications or change the number of compute nodes, transient connections may occur. We recommend that you perform these operations during off-peak hours.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a plan for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request CreateDBInstancePlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBInstancePlanResponse
     */
    public CreateDBInstancePlanResponse createDBInstancePlanWithOptions(CreateDBInstancePlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planConfig)) {
            query.put("PlanConfig", request.planConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planDesc)) {
            query.put("PlanDesc", request.planDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planEndDate)) {
            query.put("PlanEndDate", request.planEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planName)) {
            query.put("PlanName", request.planName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planScheduleType)) {
            query.put("PlanScheduleType", request.planScheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planStartDate)) {
            query.put("PlanStartDate", request.planStartDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planType)) {
            query.put("PlanType", request.planType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDBInstancePlan"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDBInstancePlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>  The plan management feature is supported only for pay-as-you-go instances.</p>
     * <ul>
     * <li>When you change the compute node specifications or change the number of compute nodes, transient connections may occur. We recommend that you perform these operations during off-peak hours.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a plan for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request CreateDBInstancePlanRequest
     * @return CreateDBInstancePlanResponse
     */
    public CreateDBInstancePlanResponse createDBInstancePlan(CreateDBInstancePlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBInstancePlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a resource group.</p>
     * 
     * @param request CreateDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDBResourceGroupResponse
     */
    public CreateDBResourceGroupResponse createDBResourceGroupWithOptions(CreateDBResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupConfig)) {
            query.put("ResourceGroupConfig", request.resourceGroupConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDBResourceGroup"),
            new TeaPair("version", "2016-05-03"),
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
     * <b>summary</b> : 
     * <p>Creates a resource group.</p>
     * 
     * @param request CreateDBResourceGroupRequest
     * @return CreateDBResourceGroupResponse
     */
    public CreateDBResourceGroupResponse createDBResourceGroup(CreateDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a document collection.</p>
     * 
     * @param request CreateDocumentCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDocumentCollectionResponse
     */
    public CreateDocumentCollectionResponse createDocumentCollectionWithOptions(CreateDocumentCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.embeddingModel)) {
            query.put("EmbeddingModel", request.embeddingModel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalStorage)) {
            query.put("ExternalStorage", request.externalStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fullTextRetrievalFields)) {
            query.put("FullTextRetrievalFields", request.fullTextRetrievalFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hnswM)) {
            query.put("HnswM", request.hnswM);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccount)) {
            query.put("ManagerAccount", request.managerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccountPassword)) {
            query.put("ManagerAccountPassword", request.managerAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadata)) {
            query.put("Metadata", request.metadata);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            query.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parser)) {
            query.put("Parser", request.parser);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pqEnable)) {
            query.put("PqEnable", request.pqEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDocumentCollection"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDocumentCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a document collection.</p>
     * 
     * @param request CreateDocumentCollectionRequest
     * @return CreateDocumentCollectionResponse
     */
    public CreateDocumentCollectionResponse createDocumentCollection(CreateDocumentCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDocumentCollectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Install extensions.</p>
     * 
     * @param request CreateExtensionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExtensionsResponse
     */
    public CreateExtensionsResponse createExtensionsWithOptions(CreateExtensionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNames)) {
            query.put("DBNames", request.DBNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extensions)) {
            query.put("Extensions", request.extensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExtensions"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExtensionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Install extensions.</p>
     * 
     * @param request CreateExtensionsRequest
     * @return CreateExtensionsResponse
     */
    public CreateExtensionsResponse createExtensions(CreateExtensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExtensionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an external data service.</p>
     * 
     * @param request CreateExternalDataServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateExternalDataServiceResponse
     */
    public CreateExternalDataServiceResponse createExternalDataServiceWithOptions(CreateExternalDataServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDescription)) {
            query.put("ServiceDescription", request.serviceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceSpec)) {
            query.put("ServiceSpec", request.serviceSpec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateExternalDataService"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateExternalDataServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates an external data service.</p>
     * 
     * @param request CreateExternalDataServiceRequest
     * @return CreateExternalDataServiceResponse
     */
    public CreateExternalDataServiceResponse createExternalDataService(CreateExternalDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExternalDataServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates the configurations for a Hadoop data source.</p>
     * 
     * @param request CreateHadoopDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateHadoopDataSourceResponse
     */
    public CreateHadoopDataSourceResponse createHadoopDataSourceWithOptions(CreateHadoopDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceDescription)) {
            query.put("DataSourceDescription", request.dataSourceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            query.put("DataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emrInstanceId)) {
            query.put("EmrInstanceId", request.emrInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HDFSConf)) {
            query.put("HDFSConf", request.HDFSConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hadoopCoreConf)) {
            query.put("HadoopCoreConf", request.hadoopCoreConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hadoopCreateType)) {
            query.put("HadoopCreateType", request.hadoopCreateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hadoopHostsAddress)) {
            query.put("HadoopHostsAddress", request.hadoopHostsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hiveConf)) {
            query.put("HiveConf", request.hiveConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapReduceConf)) {
            query.put("MapReduceConf", request.mapReduceConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yarnConf)) {
            query.put("YarnConf", request.yarnConf);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateHadoopDataSource"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateHadoopDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates the configurations for a Hadoop data source.</p>
     * 
     * @param request CreateHadoopDataSourceRequest
     * @return CreateHadoopDataSourceResponse
     */
    public CreateHadoopDataSourceResponse createHadoopDataSource(CreateHadoopDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHadoopDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Java Database Connectivity (JDBC) data source.</p>
     * 
     * @param request CreateJDBCDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateJDBCDataSourceResponse
     */
    public CreateJDBCDataSourceResponse createJDBCDataSourceWithOptions(CreateJDBCDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceDescription)) {
            query.put("DataSourceDescription", request.dataSourceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            query.put("DataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.JDBCConnectionString)) {
            query.put("JDBCConnectionString", request.JDBCConnectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.JDBCPassword)) {
            query.put("JDBCPassword", request.JDBCPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.JDBCUserName)) {
            query.put("JDBCUserName", request.JDBCUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateJDBCDataSource"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateJDBCDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a Java Database Connectivity (JDBC) data source.</p>
     * 
     * @param request CreateJDBCDataSourceRequest
     * @return CreateJDBCDataSourceResponse
     */
    public CreateJDBCDataSourceResponse createJDBCDataSource(CreateJDBCDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createJDBCDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a vector namespace.</p>
     * 
     * @param request CreateNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespaceWithOptions(CreateNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccount)) {
            query.put("ManagerAccount", request.managerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccountPassword)) {
            query.put("ManagerAccountPassword", request.managerAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
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
            new TeaPair("action", "CreateNamespace"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a vector namespace.</p>
     * 
     * @param request CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to create a sample dataset for an AnalyticDB for PostgreSQL instance. Then, you can execute query statements on the sample dataset to use or test your instance. For more information about query statements, see <a href="https://help.aliyun.com/document_detail/452277.html">Dataset information and query examples</a>.</p>
     * <ul>
     * <li>This operation is supported only for AnalyticDB for PostgreSQL V6.3.8.8 and V6.3.10.3 or later, excluding the versions from V6.3.9.0 to V6.3.10.2.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a sample dataset for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request CreateSampleDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateSampleDataResponse
     */
    public CreateSampleDataResponse createSampleDataWithOptions(CreateSampleDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSampleData"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSampleDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation to create a sample dataset for an AnalyticDB for PostgreSQL instance. Then, you can execute query statements on the sample dataset to use or test your instance. For more information about query statements, see <a href="https://help.aliyun.com/document_detail/452277.html">Dataset information and query examples</a>.</p>
     * <ul>
     * <li>This operation is supported only for AnalyticDB for PostgreSQL V6.3.8.8 and V6.3.10.3 or later, excluding the versions from V6.3.9.0 to V6.3.10.2.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Creates a sample dataset for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request CreateSampleDataRequest
     * @return CreateSampleDataResponse
     */
    public CreateSampleDataResponse createSampleData(CreateSampleDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSampleDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service-linked role.</p>
     * 
     * @param request CreateServiceLinkedRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateServiceLinkedRoleResponse
     */
    public CreateServiceLinkedRoleResponse createServiceLinkedRoleWithOptions(CreateServiceLinkedRoleRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "CreateServiceLinkedRole"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateServiceLinkedRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a service-linked role.</p>
     * 
     * @param request CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    public CreateServiceLinkedRoleResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a real-time data service.</p>
     * 
     * @param request CreateStreamingDataServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStreamingDataServiceResponse
     */
    public CreateStreamingDataServiceResponse createStreamingDataServiceWithOptions(CreateStreamingDataServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDescription)) {
            query.put("ServiceDescription", request.serviceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceName)) {
            query.put("ServiceName", request.serviceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceSpec)) {
            query.put("ServiceSpec", request.serviceSpec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStreamingDataService"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStreamingDataServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a real-time data service.</p>
     * 
     * @param request CreateStreamingDataServiceRequest
     * @return CreateStreamingDataServiceResponse
     */
    public CreateStreamingDataServiceResponse createStreamingDataService(CreateStreamingDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStreamingDataServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a real-time data source.</p>
     * 
     * @param request CreateStreamingDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStreamingDataSourceResponse
     */
    public CreateStreamingDataSourceResponse createStreamingDataSourceWithOptions(CreateStreamingDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceConfig)) {
            query.put("DataSourceConfig", request.dataSourceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceDescription)) {
            query.put("DataSourceDescription", request.dataSourceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceName)) {
            query.put("DataSourceName", request.dataSourceName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStreamingDataSource"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStreamingDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a real-time data source.</p>
     * 
     * @param request CreateStreamingDataSourceRequest
     * @return CreateStreamingDataSourceResponse
     */
    public CreateStreamingDataSourceResponse createStreamingDataSource(CreateStreamingDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStreamingDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建外部数据源配置</p>
     * 
     * @param tmpReq CreateStreamingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateStreamingJobResponse
     */
    public CreateStreamingJobResponse createStreamingJobWithOptions(CreateStreamingJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        CreateStreamingJobShrinkRequest request = new CreateStreamingJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.destColumns)) {
            request.destColumnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.destColumns, "DestColumns", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.matchColumns)) {
            request.matchColumnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.matchColumns, "MatchColumns", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.srcColumns)) {
            request.srcColumnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.srcColumns, "SrcColumns", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateColumns)) {
            request.updateColumnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateColumns, "UpdateColumns", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consistency)) {
            query.put("Consistency", request.consistency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destColumnsShrink)) {
            query.put("DestColumns", request.destColumnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destDatabase)) {
            query.put("DestDatabase", request.destDatabase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destSchema)) {
            query.put("DestSchema", request.destSchema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destTable)) {
            query.put("DestTable", request.destTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorLimitCount)) {
            query.put("ErrorLimitCount", request.errorLimitCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallbackOffset)) {
            query.put("FallbackOffset", request.fallbackOffset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobConfig)) {
            query.put("JobConfig", request.jobConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobDescription)) {
            query.put("JobDescription", request.jobDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobName)) {
            query.put("JobName", request.jobName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchColumnsShrink)) {
            query.put("MatchColumns", request.matchColumnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mode)) {
            query.put("Mode", request.mode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcColumnsShrink)) {
            query.put("SrcColumns", request.srcColumnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tryRun)) {
            query.put("TryRun", request.tryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateColumnsShrink)) {
            query.put("UpdateColumns", request.updateColumnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.writeMode)) {
            query.put("WriteMode", request.writeMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStreamingJob"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStreamingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建外部数据源配置</p>
     * 
     * @param request CreateStreamingJobRequest
     * @return CreateStreamingJobResponse
     */
    public CreateStreamingJobResponse createStreamingJob(CreateStreamingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStreamingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a vector index.</p>
     * 
     * @param request CreateVectorIndexRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateVectorIndexResponse
     */
    public CreateVectorIndexResponse createVectorIndexWithOptions(CreateVectorIndexRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dimension)) {
            query.put("Dimension", request.dimension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.externalStorage)) {
            query.put("ExternalStorage", request.externalStorage);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hnswM)) {
            query.put("HnswM", request.hnswM);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccount)) {
            query.put("ManagerAccount", request.managerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccountPassword)) {
            query.put("ManagerAccountPassword", request.managerAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            query.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pqEnable)) {
            query.put("PqEnable", request.pqEnable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateVectorIndex"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateVectorIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates a vector index.</p>
     * 
     * @param request CreateVectorIndexRequest
     * @return CreateVectorIndexResponse
     */
    public CreateVectorIndexResponse createVectorIndex(CreateVectorIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVectorIndexWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a vector collection.</p>
     * 
     * @param request DeleteCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCollectionResponse
     */
    public DeleteCollectionResponse deleteCollectionWithOptions(DeleteCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
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
            new TeaPair("action", "DeleteCollection"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a vector collection.</p>
     * 
     * @param request DeleteCollectionRequest
     * @return DeleteCollectionResponse
     */
    public DeleteCollectionResponse deleteCollection(DeleteCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCollectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes vector data.</p>
     * 
     * @param request DeleteCollectionDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCollectionDataResponse
     */
    public DeleteCollectionDataResponse deleteCollectionDataWithOptions(DeleteCollectionDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collectionData)) {
            query.put("CollectionData", request.collectionData);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collectionDataFilter)) {
            query.put("CollectionDataFilter", request.collectionDataFilter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
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
            new TeaPair("action", "DeleteCollectionData"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCollectionDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes vector data.</p>
     * 
     * @param request DeleteCollectionDataRequest
     * @return DeleteCollectionDataResponse
     */
    public DeleteCollectionDataResponse deleteCollectionData(DeleteCollectionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCollectionDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  Subscription instances cannot be manually released. They are automatically released when they expire.</p>
     * <ul>
     * <li>You can call this operation to release pay-as-you-go instances only when they are in the <strong>Running</strong> state.</li>
     * </ul>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DeleteDBInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDBInstanceResponse
     */
    public DeleteDBInstanceResponse deleteDBInstanceWithOptions(DeleteDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDBInstance"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>  Subscription instances cannot be manually released. They are automatically released when they expire.</p>
     * <ul>
     * <li>You can call this operation to release pay-as-you-go instances only when they are in the <strong>Running</strong> state.</li>
     * </ul>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a pay-as-you-go AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DeleteDBInstanceRequest
     * @return DeleteDBInstanceResponse
     */
    public DeleteDBInstanceResponse deleteDBInstance(DeleteDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>If you no longer need a plan, you can call this operation to delete the plan. The plan management feature is supported only for AnalyticDB for PostgreSQL instances in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a plan from an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DeleteDBInstancePlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDBInstancePlanResponse
     */
    public DeleteDBInstancePlanResponse deleteDBInstancePlanWithOptions(DeleteDBInstancePlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDBInstancePlan"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDBInstancePlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>If you no longer need a plan, you can call this operation to delete the plan. The plan management feature is supported only for AnalyticDB for PostgreSQL instances in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Deletes a plan from an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DeleteDBInstancePlanRequest
     * @return DeleteDBInstancePlanResponse
     */
    public DeleteDBInstancePlanResponse deleteDBInstancePlan(DeleteDBInstancePlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBInstancePlanWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a resource group.</p>
     * 
     * @param request DeleteDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDBResourceGroupResponse
     */
    public DeleteDBResourceGroupResponse deleteDBResourceGroupWithOptions(DeleteDBResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDBResourceGroup"),
            new TeaPair("version", "2016-05-03"),
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
     * <b>summary</b> : 
     * <p>Deletes a resource group.</p>
     * 
     * @param request DeleteDBResourceGroupRequest
     * @return DeleteDBResourceGroupResponse
     */
    public DeleteDBResourceGroupResponse deleteDBResourceGroup(DeleteDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a document from a document collection.</p>
     * 
     * @param request DeleteDocumentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDocumentResponse
     */
    public DeleteDocumentResponse deleteDocumentWithOptions(DeleteDocumentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
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
            new TeaPair("action", "DeleteDocument"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a document from a document collection.</p>
     * 
     * @param request DeleteDocumentRequest
     * @return DeleteDocumentResponse
     */
    public DeleteDocumentResponse deleteDocument(DeleteDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDocumentWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a document collection.</p>
     * 
     * @param request DeleteDocumentCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDocumentCollectionResponse
     */
    public DeleteDocumentCollectionResponse deleteDocumentCollectionWithOptions(DeleteDocumentCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
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
            new TeaPair("action", "DeleteDocumentCollection"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDocumentCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a document collection.</p>
     * 
     * @param request DeleteDocumentCollectionRequest
     * @return DeleteDocumentCollectionResponse
     */
    public DeleteDocumentCollectionResponse deleteDocumentCollection(DeleteDocumentCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDocumentCollectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uninstall an extension.</p>
     * 
     * @param request DeleteExtensionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExtensionResponse
     */
    public DeleteExtensionResponse deleteExtensionWithOptions(DeleteExtensionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBNames)) {
            query.put("DBNames", request.DBNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            query.put("Extension", request.extension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExtension"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExtensionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uninstall an extension.</p>
     * 
     * @param request DeleteExtensionRequest
     * @return DeleteExtensionResponse
     */
    public DeleteExtensionResponse deleteExtension(DeleteExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExtensionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除外部数据服务</p>
     * 
     * @param request DeleteExternalDataServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteExternalDataServiceResponse
     */
    public DeleteExternalDataServiceResponse deleteExternalDataServiceWithOptions(DeleteExternalDataServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteExternalDataService"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteExternalDataServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除外部数据服务</p>
     * 
     * @param request DeleteExternalDataServiceRequest
     * @return DeleteExternalDataServiceResponse
     */
    public DeleteExternalDataServiceResponse deleteExternalDataService(DeleteExternalDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExternalDataServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除hadoop数据源</p>
     * 
     * @param request DeleteHadoopDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteHadoopDataSourceResponse
     */
    public DeleteHadoopDataSourceResponse deleteHadoopDataSourceWithOptions(DeleteHadoopDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteHadoopDataSource"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteHadoopDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除hadoop数据源</p>
     * 
     * @param request DeleteHadoopDataSourceRequest
     * @return DeleteHadoopDataSourceResponse
     */
    public DeleteHadoopDataSourceResponse deleteHadoopDataSource(DeleteHadoopDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHadoopDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Java Database Connectivity (JDBC) data source.</p>
     * 
     * @param request DeleteJDBCDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteJDBCDataSourceResponse
     */
    public DeleteJDBCDataSourceResponse deleteJDBCDataSourceWithOptions(DeleteJDBCDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteJDBCDataSource"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteJDBCDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a Java Database Connectivity (JDBC) data source.</p>
     * 
     * @param request DeleteJDBCDataSourceRequest
     * @return DeleteJDBCDataSourceResponse
     */
    public DeleteJDBCDataSourceResponse deleteJDBCDataSource(DeleteJDBCDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteJDBCDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a namespace.</p>
     * 
     * @param request DeleteNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespaceWithOptions(DeleteNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccount)) {
            query.put("ManagerAccount", request.managerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccountPassword)) {
            query.put("ManagerAccountPassword", request.managerAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
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
            new TeaPair("action", "DeleteNamespace"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a namespace.</p>
     * 
     * @param request DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a real-time data service.</p>
     * 
     * @param request DeleteStreamingDataServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStreamingDataServiceResponse
     */
    public DeleteStreamingDataServiceResponse deleteStreamingDataServiceWithOptions(DeleteStreamingDataServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStreamingDataService"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStreamingDataServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a real-time data service.</p>
     * 
     * @param request DeleteStreamingDataServiceRequest
     * @return DeleteStreamingDataServiceResponse
     */
    public DeleteStreamingDataServiceResponse deleteStreamingDataService(DeleteStreamingDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStreamingDataServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a real-time data source.</p>
     * 
     * @param request DeleteStreamingDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStreamingDataSourceResponse
     */
    public DeleteStreamingDataSourceResponse deleteStreamingDataSourceWithOptions(DeleteStreamingDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteStreamingDataSource"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStreamingDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a real-time data source.</p>
     * 
     * @param request DeleteStreamingDataSourceRequest
     * @return DeleteStreamingDataSourceResponse
     */
    public DeleteStreamingDataSourceResponse deleteStreamingDataSource(DeleteStreamingDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStreamingDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a real-time data service job.</p>
     * 
     * @param request DeleteStreamingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteStreamingJobResponse
     */
    public DeleteStreamingJobResponse deleteStreamingJobWithOptions(DeleteStreamingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DeleteStreamingJob"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteStreamingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a real-time data service job.</p>
     * 
     * @param request DeleteStreamingJobRequest
     * @return DeleteStreamingJobResponse
     */
    public DeleteStreamingJobResponse deleteStreamingJob(DeleteStreamingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStreamingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a vector index.</p>
     * 
     * @param request DeleteVectorIndexRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteVectorIndexResponse
     */
    public DeleteVectorIndexResponse deleteVectorIndexWithOptions(DeleteVectorIndexRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccount)) {
            query.put("ManagerAccount", request.managerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccountPassword)) {
            query.put("ManagerAccountPassword", request.managerAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
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
            new TeaPair("action", "DeleteVectorIndex"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteVectorIndexResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Deletes a vector index.</p>
     * 
     * @param request DeleteVectorIndexRequest
     * @return DeleteVectorIndexResponse
     */
    public DeleteVectorIndexResponse deleteVectorIndex(DeleteVectorIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVectorIndexWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is called to query the information of the privileged account in an AnalyticDB for PostgreSQL instance, such as its state, description, and the instance.</p>
     * <h2>Limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about database accounts for an AnalyticDB for PostgreSQL instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAccounts"),
            new TeaPair("version", "2016-05-03"),
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
     * <p>This operation is called to query the information of the privileged account in an AnalyticDB for PostgreSQL instance, such as its state, description, and the instance.</p>
     * <h2>Limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about database accounts for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries active SQL records.</p>
     * 
     * @param request DescribeActiveSQLRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeActiveSQLRecordsResponse
     */
    public DescribeActiveSQLRecordsResponse describeActiveSQLRecordsWithOptions(DescribeActiveSQLRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.maxDuration)) {
            query.put("MaxDuration", request.maxDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minDuration)) {
            query.put("MinDuration", request.minDuration);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeActiveSQLRecords"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeActiveSQLRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries active SQL records.</p>
     * 
     * @param request DescribeActiveSQLRecordsRequest
     * @return DescribeActiveSQLRecordsResponse
     */
    public DescribeActiveSQLRecordsResponse describeActiveSQLRecords(DescribeActiveSQLRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActiveSQLRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available resources within a zone.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about available resources of AnalyticDB for PostgreSQL.</p>
     * 
     * @param request DescribeAvailableResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeAvailableResourcesResponse
     */
    public DescribeAvailableResourcesResponse describeAvailableResourcesWithOptions(DescribeAvailableResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chargeType)) {
            query.put("ChargeType", request.chargeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeAvailableResources"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeAvailableResourcesResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available resources within a zone.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about available resources of AnalyticDB for PostgreSQL.</p>
     * 
     * @param request DescribeAvailableResourcesRequest
     * @return DescribeAvailableResourcesResponse
     */
    public DescribeAvailableResourcesResponse describeAvailableResources(DescribeAvailableResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableResourcesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the backup settings of an AnalyticDB for PostgreSQL instance in elastic storage mode. Periodically backing data can prevent data loss. For more information about how to modify backup policies, see <a href="https://help.aliyun.com/document_detail/210095.html">ModifyBackupPolicy</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the backup policy of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicyWithOptions(DescribeBackupPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBackupPolicy"),
            new TeaPair("version", "2016-05-03"),
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
     * <p>You can call this operation to query the backup settings of an AnalyticDB for PostgreSQL instance in elastic storage mode. Periodically backing data can prevent data loss. For more information about how to modify backup policies, see <a href="https://help.aliyun.com/document_detail/210095.html">ModifyBackupPolicy</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the backup policy of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a vector collection.</p>
     * 
     * @param request DescribeCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeCollectionResponse
     */
    public DescribeCollectionResponse describeCollectionWithOptions(DescribeCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
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
            new TeaPair("action", "DescribeCollection"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a vector collection.</p>
     * 
     * @param request DescribeCollectionRequest
     * @return DescribeCollectionResponse
     */
    public DescribeCollectionResponse describeCollection(DescribeCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCollectionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>You can call this operation to query the information about coordinator and compute nodes in an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of nodes in an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBClusterNodeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterNodeResponse
     */
    public DescribeDBClusterNodeResponse describeDBClusterNodeWithOptions(DescribeDBClusterNodeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("NodeType", request.nodeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBClusterNode"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBClusterNodeResponse());
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>You can call this operation to query the information about coordinator and compute nodes in an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of nodes in an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBClusterNodeRequest
     * @return DescribeDBClusterNodeResponse
     */
    public DescribeDBClusterNodeResponse describeDBClusterNode(DescribeDBClusterNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterNodeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can query monitoring information only within the last 30 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about performance metrics of an AnalyticDB for PostgreSQL instance within a time range.</p>
     * 
     * @param request DescribeDBClusterPerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBClusterPerformanceResponse
     */
    public DescribeDBClusterPerformanceResponse describeDBClusterPerformanceWithOptions(DescribeDBClusterPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodeType)) {
            query.put("NodeType", request.nodeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nodes)) {
            query.put("Nodes", request.nodes);
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
            new TeaPair("action", "DescribeDBClusterPerformance"),
            new TeaPair("version", "2016-05-03"),
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
     * <p>You can query monitoring information only within the last 30 days.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about performance metrics of an AnalyticDB for PostgreSQL instance within a time range.</p>
     * 
     * @param request DescribeDBClusterPerformanceRequest
     * @return DescribeDBClusterPerformanceResponse
     */
    public DescribeDBClusterPerformanceResponse describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterPerformanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>You can call this operation to query the information about an AnalyticDB for PostgreSQL instance, such as the instance type, network type, and instance state.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceAttributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceAttributeResponse
     */
    public DescribeDBInstanceAttributeResponse describeDBInstanceAttributeWithOptions(DescribeDBInstanceAttributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceAttribute"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceAttributeResponse());
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>You can call this operation to query the information about an AnalyticDB for PostgreSQL instance, such as the instance type, network type, and instance state.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceAttributeRequest
     * @return DescribeDBInstanceAttributeResponse
     */
    public DescribeDBInstanceAttributeResponse describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of data bloat on an AnalyticDB for PostgreSQL instance in elastic storage mode. The minor version of the instance must be V6.3.10.1 or later. For more information about how to view and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about data bloat for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceDataBloatRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceDataBloatResponse
     */
    public DescribeDBInstanceDataBloatResponse describeDBInstanceDataBloatWithOptions(DescribeDBInstanceDataBloatRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeDBInstanceDataBloat"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceDataBloatResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of data bloat on an AnalyticDB for PostgreSQL instance in elastic storage mode. The minor version of the instance must be V6.3.10.1 or later. For more information about how to view and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about data bloat for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceDataBloatRequest
     * @return DescribeDBInstanceDataBloatResponse
     */
    public DescribeDBInstanceDataBloatResponse describeDBInstanceDataBloat(DescribeDBInstanceDataBloatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceDataBloatWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To prevent data skew from affecting your database service, you can call this operation to query the details about data skew on an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about data skew for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceDataSkewRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceDataSkewResponse
     */
    public DescribeDBInstanceDataSkewResponse describeDBInstanceDataSkewWithOptions(DescribeDBInstanceDataSkewRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeDBInstanceDataSkew"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceDataSkewResponse());
    }

    /**
     * <b>description</b> :
     * <p>To prevent data skew from affecting your database service, you can call this operation to query the details about data skew on an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about data skew for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceDataSkewRequest
     * @return DescribeDBInstanceDataSkewResponse
     */
    public DescribeDBInstanceDataSkewResponse describeDBInstanceDataSkew(DescribeDBInstanceDataSkewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceDataSkewWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the distribution and states of coordinator and compute nodes in an AnalyticDB for PostgreSQL instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about nodes in an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceDiagnosisSummaryRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceDiagnosisSummaryResponse
     */
    public DescribeDBInstanceDiagnosisSummaryResponse describeDBInstanceDiagnosisSummaryWithOptions(DescribeDBInstanceDiagnosisSummaryRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rolePreferd)) {
            query.put("RolePreferd", request.rolePreferd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startStatus)) {
            query.put("StartStatus", request.startStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.syncMode)) {
            query.put("SyncMode", request.syncMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceDiagnosisSummary"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceDiagnosisSummaryResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the distribution and states of coordinator and compute nodes in an AnalyticDB for PostgreSQL instance.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about nodes in an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceDiagnosisSummaryRequest
     * @return DescribeDBInstanceDiagnosisSummaryResponse
     */
    public DescribeDBInstanceDiagnosisSummaryResponse describeDBInstanceDiagnosisSummary(DescribeDBInstanceDiagnosisSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceDiagnosisSummaryWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the error logs of an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the error logs of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceErrorLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceErrorLogResponse
     */
    public DescribeDBInstanceErrorLogResponse describeDBInstanceErrorLogWithOptions(DescribeDBInstanceErrorLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.host)) {
            query.put("Host", request.host);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.keywords)) {
            query.put("Keywords", request.keywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.logLevel)) {
            query.put("LogLevel", request.logLevel);
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

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceErrorLog"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceErrorLogResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the error logs of an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the error logs of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceErrorLogRequest
     * @return DescribeDBInstanceErrorLogResponse
     */
    public DescribeDBInstanceErrorLogResponse describeDBInstanceErrorLog(DescribeDBInstanceErrorLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceErrorLogWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the whitelists of IP addresses that are allowed to access an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the whitelists of IP addresses that are allowed to access an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceIPArrayListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceIPArrayListResponse
     */
    public DescribeDBInstanceIPArrayListResponse describeDBInstanceIPArrayListWithOptions(DescribeDBInstanceIPArrayListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceIPArrayName)) {
            query.put("DBInstanceIPArrayName", request.DBInstanceIPArrayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceIPArrayList"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceIPArrayListResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the whitelists of IP addresses that are allowed to access an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the whitelists of IP addresses that are allowed to access an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceIPArrayListRequest
     * @return DescribeDBInstanceIPArrayListResponse
     */
    public DescribeDBInstanceIPArrayListResponse describeDBInstanceIPArrayList(DescribeDBInstanceIPArrayListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceIPArrayListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Appropriate indexes can accelerate database queries. You can call this operation to query the index usage of an AnalyticDB for PostgreSQL instance.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the index usage of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceIndexUsageRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceIndexUsageResponse
     */
    public DescribeDBInstanceIndexUsageResponse describeDBInstanceIndexUsageWithOptions(DescribeDBInstanceIndexUsageRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeDBInstanceIndexUsage"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceIndexUsageResponse());
    }

    /**
     * <b>description</b> :
     * <p>Appropriate indexes can accelerate database queries. You can call this operation to query the index usage of an AnalyticDB for PostgreSQL instance.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the index usage of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceIndexUsageRequest
     * @return DescribeDBInstanceIndexUsageResponse
     */
    public DescribeDBInstanceIndexUsageResponse describeDBInstanceIndexUsage(DescribeDBInstanceIndexUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceIndexUsageWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the connection information of an instance.</p>
     * 
     * @param request DescribeDBInstanceNetInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceNetInfoResponse
     */
    public DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfoWithOptions(DescribeDBInstanceNetInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionString)) {
            query.put("ConnectionString", request.connectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceNetInfo"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceNetInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the connection information of an instance.</p>
     * 
     * @param request DescribeDBInstanceNetInfoRequest
     * @return DescribeDBInstanceNetInfoResponse
     */
    public DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceNetInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about performance metrics of an AnalyticDB for PostgreSQL instance within a time range.</p>
     * 
     * @param request DescribeDBInstancePerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstancePerformanceResponse
     */
    public DescribeDBInstancePerformanceResponse describeDBInstancePerformanceWithOptions(DescribeDBInstancePerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstancePerformance"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstancePerformanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about performance metrics of an AnalyticDB for PostgreSQL instance within a time range.</p>
     * 
     * @param request DescribeDBInstancePerformanceRequest
     * @return DescribeDBInstancePerformanceResponse
     */
    public DescribeDBInstancePerformanceResponse describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancePerformanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of plans for an AnalyticDB for PostgreSQL instance in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about plans for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstancePlansRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstancePlansResponse
     */
    public DescribeDBInstancePlansResponse describeDBInstancePlansWithOptions(DescribeDBInstancePlansRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planCreateDate)) {
            query.put("PlanCreateDate", request.planCreateDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planDesc)) {
            query.put("PlanDesc", request.planDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planScheduleType)) {
            query.put("PlanScheduleType", request.planScheduleType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planType)) {
            query.put("PlanType", request.planType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstancePlans"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstancePlansResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of plans for an AnalyticDB for PostgreSQL instance in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about plans for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstancePlansRequest
     * @return DescribeDBInstancePlansResponse
     */
    public DescribeDBInstancePlansResponse describeDBInstancePlans(DescribeDBInstancePlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancePlansWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the SSL information about an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceSSLResponse
     */
    public DescribeDBInstanceSSLResponse describeDBInstanceSSLWithOptions(DescribeDBInstanceSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceSSL"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceSSLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the SSL information about an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceSSLRequest
     * @return DescribeDBInstanceSSLResponse
     */
    public DescribeDBInstanceSSLResponse describeDBInstanceSSL(DescribeDBInstanceSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceSSLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the maximum performance of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceSupportMaxPerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstanceSupportMaxPerformanceResponse
     */
    public DescribeDBInstanceSupportMaxPerformanceResponse describeDBInstanceSupportMaxPerformanceWithOptions(DescribeDBInstanceSupportMaxPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstanceSupportMaxPerformance"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstanceSupportMaxPerformanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the maximum performance of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBInstanceSupportMaxPerformanceRequest
     * @return DescribeDBInstanceSupportMaxPerformanceResponse
     */
    public DescribeDBInstanceSupportMaxPerformanceResponse describeDBInstanceSupportMaxPerformance(DescribeDBInstanceSupportMaxPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceSupportMaxPerformanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>You can call this operation to query the instance types, network types, and states of AnalyticDB for PostgreSQL instances within a region.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of AnalyticDB for PostgreSQL instances.</p>
     * 
     * @param tmpReq DescribeDBInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBInstancesResponse
     */
    public DescribeDBInstancesResponse describeDBInstancesWithOptions(DescribeDBInstancesRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DescribeDBInstancesShrinkRequest request = new DescribeDBInstancesShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.DBInstanceCategories)) {
            request.DBInstanceCategoriesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.DBInstanceCategories, "DBInstanceCategories", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.DBInstanceModes)) {
            request.DBInstanceModesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.DBInstanceModes, "DBInstanceModes", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.DBInstanceStatuses)) {
            request.DBInstanceStatusesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.DBInstanceStatuses, "DBInstanceStatuses", "simple");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceDeployTypes)) {
            request.instanceDeployTypesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceDeployTypes, "InstanceDeployTypes", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceCategoriesShrink)) {
            query.put("DBInstanceCategories", request.DBInstanceCategoriesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceDescription)) {
            query.put("DBInstanceDescription", request.DBInstanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceIds)) {
            query.put("DBInstanceIds", request.DBInstanceIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceModesShrink)) {
            query.put("DBInstanceModes", request.DBInstanceModesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceStatusesShrink)) {
            query.put("DBInstanceStatuses", request.DBInstanceStatusesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceDeployTypesShrink)) {
            query.put("InstanceDeployTypes", request.instanceDeployTypesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceNetworkType)) {
            query.put("InstanceNetworkType", request.instanceNetworkType);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tag)) {
            query.put("Tag", request.tag);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBInstances"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <h2></h2>
     * <p>You can call this operation to query the instance types, network types, and states of AnalyticDB for PostgreSQL instances within a region.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of AnalyticDB for PostgreSQL instances.</p>
     * 
     * @param request DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     */
    public DescribeDBInstancesResponse describeDBInstances(DescribeDBInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about resource groups.</p>
     * 
     * @param request DescribeDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBResourceGroupResponse
     */
    public DescribeDBResourceGroupResponse describeDBResourceGroupWithOptions(DescribeDBResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBResourceGroup"),
            new TeaPair("version", "2016-05-03"),
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
     * <b>summary</b> : 
     * <p>Queries the information about resource groups.</p>
     * 
     * @param request DescribeDBResourceGroupRequest
     * @return DescribeDBResourceGroupResponse
     */
    public DescribeDBResourceGroupResponse describeDBResourceGroup(DescribeDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource management mode of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBResourceManagementModeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBResourceManagementModeResponse
     */
    public DescribeDBResourceManagementModeResponse describeDBResourceManagementModeWithOptions(DescribeDBResourceManagementModeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBResourceManagementMode"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBResourceManagementModeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the resource management mode of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDBResourceManagementModeRequest
     * @return DescribeDBResourceManagementModeResponse
     */
    public DescribeDBResourceManagementModeResponse describeDBResourceManagementMode(DescribeDBResourceManagementModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBResourceManagementModeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about minor versions of AnalyticDB for PostgreSQL instances.</p>
     * 
     * @param request DescribeDBVersionInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDBVersionInfosResponse
     */
    public DescribeDBVersionInfosResponse describeDBVersionInfosWithOptions(DescribeDBVersionInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceMode)) {
            query.put("DBInstanceMode", request.DBInstanceMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBVersion)) {
            query.put("DBVersion", request.DBVersion);
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

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDBVersionInfos"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDBVersionInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about minor versions of AnalyticDB for PostgreSQL instances.</p>
     * 
     * @param request DescribeDBVersionInfosRequest
     * @return DescribeDBVersionInfosResponse
     */
    public DescribeDBVersionInfosResponse describeDBVersionInfos(DescribeDBVersionInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBVersionInfosWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query a list of backup sets and backup details only for instances in elastic storage mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of backup sets of full backup or point-in-time backup for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDataBackupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataBackupsResponse
     */
    public DescribeDataBackupsResponse describeDataBackupsWithOptions(DescribeDataBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.backupId)) {
            query.put("BackupId", request.backupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupMode)) {
            query.put("BackupMode", request.backupMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.backupStatus)) {
            query.put("BackupStatus", request.backupStatus);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataType)) {
            query.put("DataType", request.dataType);
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
            new TeaPair("action", "DescribeDataBackups"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataBackupsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query a list of backup sets and backup details only for instances in elastic storage mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of backup sets of full backup or point-in-time backup for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDataBackupsRequest
     * @return DescribeDataBackupsResponse
     */
    public DescribeDataBackupsResponse describeDataBackups(DescribeDataBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataBackupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data redistribution information about an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.</p>
     * 
     * @param request DescribeDataReDistributeInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataReDistributeInfoResponse
     */
    public DescribeDataReDistributeInfoResponse describeDataReDistributeInfoWithOptions(DescribeDataReDistributeInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataReDistributeInfo"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataReDistributeInfoResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the data redistribution information about an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.</p>
     * 
     * @param request DescribeDataReDistributeInfoRequest
     * @return DescribeDataReDistributeInfoResponse
     */
    public DescribeDataReDistributeInfoResponse describeDataReDistributeInfo(DescribeDataReDistributeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataReDistributeInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Data sharing is supported only for instances in Serverless mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the state of data sharing for AnalyticDB for PostgreSQL instances.</p>
     * 
     * @param request DescribeDataShareInstancesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataShareInstancesResponse
     */
    public DescribeDataShareInstancesResponse describeDataShareInstancesWithOptions(DescribeDataShareInstancesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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

        if (!com.aliyun.teautil.Common.isUnset(request.searchValue)) {
            query.put("SearchValue", request.searchValue);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataShareInstances"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataShareInstancesResponse());
    }

    /**
     * <b>description</b> :
     * <p>Data sharing is supported only for instances in Serverless mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the state of data sharing for AnalyticDB for PostgreSQL instances.</p>
     * 
     * @param request DescribeDataShareInstancesRequest
     * @return DescribeDataShareInstancesResponse
     */
    public DescribeDataShareInstancesResponse describeDataShareInstances(DescribeDataShareInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataShareInstancesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of data sharing performance metrics for an AnalyticDB for PostgreSQL instance in Serverless mode, such as the number of shared topics and the amount of data shared.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about data sharing performance metrics.</p>
     * 
     * @param request DescribeDataSharePerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDataSharePerformanceResponse
     */
    public DescribeDataSharePerformanceResponse describeDataSharePerformanceWithOptions(DescribeDataSharePerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataSharePerformance"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataSharePerformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of data sharing performance metrics for an AnalyticDB for PostgreSQL instance in Serverless mode, such as the number of shared topics and the amount of data shared.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about data sharing performance metrics.</p>
     * 
     * @param request DescribeDataSharePerformanceRequest
     * @return DescribeDataSharePerformanceResponse
     */
    public DescribeDataSharePerformanceResponse describeDataSharePerformance(DescribeDataSharePerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataSharePerformanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To facilitate management, you can call this operation to query all databases and database accounts on an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all databases and database accounts for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDiagnosisDimensionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnosisDimensionsResponse
     */
    public DescribeDiagnosisDimensionsResponse describeDiagnosisDimensionsWithOptions(DescribeDiagnosisDimensionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnosisDimensions"),
            new TeaPair("version", "2016-05-03"),
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
     * <p>To facilitate management, you can call this operation to query all databases and database accounts on an AnalyticDB for PostgreSQL instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries all databases and database accounts for an AnalyticDB for PostgreSQL instance.</p>
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
     * <p>You can call this operation to query the details of query execution on an AnalyticDB for PostgreSQL instance in elastic storage mode within a specified time range.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of query execution on an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDiagnosisMonitorPerformanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnosisMonitorPerformanceResponse
     */
    public DescribeDiagnosisMonitorPerformanceResponse describeDiagnosisMonitorPerformanceWithOptions(DescribeDiagnosisMonitorPerformanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCondition)) {
            query.put("QueryCondition", request.queryCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnosisMonitorPerformance"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDiagnosisMonitorPerformanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of query execution on an AnalyticDB for PostgreSQL instance in elastic storage mode within a specified time range.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the details of query execution on an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDiagnosisMonitorPerformanceRequest
     * @return DescribeDiagnosisMonitorPerformanceResponse
     */
    public DescribeDiagnosisMonitorPerformanceResponse describeDiagnosisMonitorPerformance(DescribeDiagnosisMonitorPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosisMonitorPerformanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of SQL queries on an AnalyticDB for PostgreSQL instance within a specified time range.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about SQL queries for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDiagnosisRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnosisRecordsResponse
     */
    public DescribeDiagnosisRecordsResponse describeDiagnosisRecordsWithOptions(DescribeDiagnosisRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCondition)) {
            query.put("QueryCondition", request.queryCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnosisRecords"),
            new TeaPair("version", "2016-05-03"),
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
     * <p>You can call this operation to query the details of SQL queries on an AnalyticDB for PostgreSQL instance within a specified time range.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about SQL queries for an AnalyticDB for PostgreSQL instance.</p>
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
     * <p>You can call this operation to query the information about a query for an AnalyticDB for PostgreSQL instance, including the SQL statement, execution plan text, and execution plan tree.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a query for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDiagnosisSQLInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDiagnosisSQLInfoResponse
     */
    public DescribeDiagnosisSQLInfoResponse describeDiagnosisSQLInfoWithOptions(DescribeDiagnosisSQLInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryID)) {
            query.put("QueryID", request.queryID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDiagnosisSQLInfo"),
            new TeaPair("version", "2016-05-03"),
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
     * <p>You can call this operation to query the information about a query for an AnalyticDB for PostgreSQL instance, including the SQL statement, execution plan text, and execution plan tree.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a query for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDiagnosisSQLInfoRequest
     * @return DescribeDiagnosisSQLInfoResponse
     */
    public DescribeDiagnosisSQLInfoResponse describeDiagnosisSQLInfo(DescribeDiagnosisSQLInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosisSQLInfoWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a document.</p>
     * 
     * @param request DescribeDocumentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDocumentResponse
     */
    public DescribeDocumentResponse describeDocumentWithOptions(DescribeDocumentRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
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
            new TeaPair("action", "DescribeDocument"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDocumentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a document.</p>
     * 
     * @param request DescribeDocumentRequest
     * @return DescribeDocumentResponse
     */
    public DescribeDocumentResponse describeDocument(DescribeDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDocumentWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You must call the <a href="https://help.aliyun.com/document_detail/447700.html">DownloadDiagnosisRecords</a> operation to download the query diagnostic information before you can call this operation to query the download records and download URLs.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the download records of query diagnostic information for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDownloadRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDownloadRecordsResponse
     */
    public DescribeDownloadRecordsResponse describeDownloadRecordsWithOptions(DescribeDownloadRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDownloadRecords"),
            new TeaPair("version", "2016-05-03"),
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
     * <p>You must call the <a href="https://help.aliyun.com/document_detail/447700.html">DownloadDiagnosisRecords</a> operation to download the query diagnostic information before you can call this operation to query the download records and download URLs.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the download records of query diagnostic information for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDownloadRecordsRequest
     * @return DescribeDownloadRecordsResponse
     */
    public DescribeDownloadRecordsResponse describeDownloadRecords(DescribeDownloadRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadRecordsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the last five download records of slow query logs for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDownloadSQLLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeDownloadSQLLogsResponse
     */
    public DescribeDownloadSQLLogsResponse describeDownloadSQLLogsWithOptions(DescribeDownloadSQLLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDownloadSQLLogs"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDownloadSQLLogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the last five download records of slow query logs for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeDownloadSQLLogsRequest
     * @return DescribeDownloadSQLLogsResponse
     */
    public DescribeDownloadSQLLogsResponse describeDownloadSQLLogs(DescribeDownloadSQLLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadSQLLogsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取外部数据服务详情</p>
     * 
     * @param request DescribeExternalDataServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeExternalDataServiceResponse
     */
    public DescribeExternalDataServiceResponse describeExternalDataServiceWithOptions(DescribeExternalDataServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeExternalDataService"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeExternalDataServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取外部数据服务详情</p>
     * 
     * @param request DescribeExternalDataServiceRequest
     * @return DescribeExternalDataServiceResponse
     */
    public DescribeExternalDataServiceResponse describeExternalDataService(DescribeExternalDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExternalDataServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries E-MapReduce (EMR) Hadoop clusters in a specific virtual private cloud (VPC).</p>
     * 
     * @param request DescribeHadoopClustersInSameNetRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHadoopClustersInSameNetResponse
     */
    public DescribeHadoopClustersInSameNetResponse describeHadoopClustersInSameNetWithOptions(DescribeHadoopClustersInSameNetRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHadoopClustersInSameNet"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHadoopClustersInSameNetResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries E-MapReduce (EMR) Hadoop clusters in a specific virtual private cloud (VPC).</p>
     * 
     * @param request DescribeHadoopClustersInSameNetRequest
     * @return DescribeHadoopClustersInSameNetResponse
     */
    public DescribeHadoopClustersInSameNetResponse describeHadoopClustersInSameNet(DescribeHadoopClustersInSameNetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHadoopClustersInSameNetWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取hadoop配置信息</p>
     * 
     * @param request DescribeHadoopConfigsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHadoopConfigsResponse
     */
    public DescribeHadoopConfigsResponse describeHadoopConfigsWithOptions(DescribeHadoopConfigsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.configName)) {
            query.put("ConfigName", request.configName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emrInstanceId)) {
            query.put("EmrInstanceId", request.emrInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHadoopConfigs"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHadoopConfigsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取hadoop配置信息</p>
     * 
     * @param request DescribeHadoopConfigsRequest
     * @return DescribeHadoopConfigsResponse
     */
    public DescribeHadoopConfigsResponse describeHadoopConfigs(DescribeHadoopConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHadoopConfigsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the configurations of a Hadoop data source.</p>
     * 
     * @param request DescribeHadoopDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHadoopDataSourceResponse
     */
    public DescribeHadoopDataSourceResponse describeHadoopDataSourceWithOptions(DescribeHadoopDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHadoopDataSource"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHadoopDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Obtains the configurations of a Hadoop data source.</p>
     * 
     * @param request DescribeHadoopDataSourceRequest
     * @return DescribeHadoopDataSourceResponse
     */
    public DescribeHadoopDataSourceResponse describeHadoopDataSource(DescribeHadoopDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHadoopDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is called to query the health status of an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode and its coordinator and compute nodes.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the health status of an AnalyticDB for PostgreSQL instance and its nodes.</p>
     * 
     * @param request DescribeHealthStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeHealthStatusResponse
     */
    public DescribeHealthStatusResponse describeHealthStatusWithOptions(DescribeHealthStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.key)) {
            query.put("Key", request.key);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeHealthStatus"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeHealthStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is called to query the health status of an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode and its coordinator and compute nodes.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the health status of an AnalyticDB for PostgreSQL instance and its nodes.</p>
     * 
     * @param request DescribeHealthStatusRequest
     * @return DescribeHealthStatusResponse
     */
    public DescribeHealthStatusResponse describeHealthStatus(DescribeHealthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHealthStatusWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about real-time materialized views of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeIMVInfosRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeIMVInfosResponse
     */
    public DescribeIMVInfosResponse describeIMVInfosWithOptions(DescribeIMVInfosRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.MVName)) {
            query.put("MVName", request.MVName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeIMVInfos"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeIMVInfosResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about real-time materialized views of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeIMVInfosRequest
     * @return DescribeIMVInfosResponse
     */
    public DescribeIMVInfosResponse describeIMVInfos(DescribeIMVInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIMVInfosWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a Java Database Connectivity (JDBC) data source.</p>
     * 
     * @param request DescribeJDBCDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeJDBCDataSourceResponse
     */
    public DescribeJDBCDataSourceResponse describeJDBCDataSourceWithOptions(DescribeJDBCDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeJDBCDataSource"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeJDBCDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the configurations of a Java Database Connectivity (JDBC) data source.</p>
     * 
     * @param request DescribeJDBCDataSourceRequest
     * @return DescribeJDBCDataSourceResponse
     */
    public DescribeJDBCDataSourceResponse describeJDBCDataSource(DescribeJDBCDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJDBCDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of log backups.</p>
     * 
     * @param request DescribeLogBackupsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeLogBackupsResponse
     */
    public DescribeLogBackupsResponse describeLogBackupsWithOptions(DescribeLogBackupsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeLogBackups"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeLogBackupsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of log backups.</p>
     * 
     * @param request DescribeLogBackupsRequest
     * @return DescribeLogBackupsResponse
     */
    public DescribeLogBackupsResponse describeLogBackups(DescribeLogBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogBackupsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the parameter modification logs of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeModifyParameterLogRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeModifyParameterLogResponse
     */
    public DescribeModifyParameterLogResponse describeModifyParameterLogWithOptions(DescribeModifyParameterLogRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeModifyParameterLog"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeModifyParameterLogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the parameter modification logs of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeModifyParameterLogRequest
     * @return DescribeModifyParameterLogResponse
     */
    public DescribeModifyParameterLogResponse describeModifyParameterLog(DescribeModifyParameterLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeModifyParameterLogWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a namespace.</p>
     * 
     * @param request DescribeNamespaceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeNamespaceResponse
     */
    public DescribeNamespaceResponse describeNamespaceWithOptions(DescribeNamespaceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccount)) {
            query.put("ManagerAccount", request.managerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccountPassword)) {
            query.put("ManagerAccountPassword", request.managerAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
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
            new TeaPair("action", "DescribeNamespace"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeNamespaceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about a namespace.</p>
     * 
     * @param request DescribeNamespaceRequest
     * @return DescribeNamespaceResponse
     */
    public DescribeNamespaceResponse describeNamespace(DescribeNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNamespaceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation can be called to query the details of parameters in an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about configuration parameters for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeParametersResponse
     */
    public DescribeParametersResponse describeParametersWithOptions(DescribeParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeParameters"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeParametersResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation can be called to query the details of parameters in an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about configuration parameters for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeParametersRequest
     * @return DescribeParametersResponse
     */
    public DescribeParametersResponse describeParameters(DescribeParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParametersWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you create AnalyticDB for PostgreSQL instances, you can call this operation to query the details of vSwitches within a specified region or zone.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of vSwitches.</p>
     * 
     * @param request DescribeRdsVSwitchsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRdsVSwitchsResponse
     */
    public DescribeRdsVSwitchsResponse describeRdsVSwitchsWithOptions(DescribeRdsVSwitchsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.vpcId)) {
            query.put("VpcId", request.vpcId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRdsVSwitchs"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRdsVSwitchsResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you create AnalyticDB for PostgreSQL instances, you can call this operation to query the details of vSwitches within a specified region or zone.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of vSwitches.</p>
     * 
     * @param request DescribeRdsVSwitchsRequest
     * @return DescribeRdsVSwitchsResponse
     */
    public DescribeRdsVSwitchsResponse describeRdsVSwitchs(DescribeRdsVSwitchsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsVSwitchsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available VPCs within a specified region or zone.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of VPCs.</p>
     * 
     * @param request DescribeRdsVpcsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRdsVpcsResponse
     */
    public DescribeRdsVpcsResponse describeRdsVpcsWithOptions(DescribeRdsVpcsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.zoneId)) {
            query.put("ZoneId", request.zoneId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRdsVpcs"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRdsVpcsResponse());
    }

    /**
     * <b>description</b> :
     * <p>When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available VPCs within a specified region or zone.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of VPCs.</p>
     * 
     * @param request DescribeRdsVpcsRequest
     * @return DescribeRdsVpcsResponse
     */
    public DescribeRdsVpcsResponse describeRdsVpcs(DescribeRdsVpcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsVpcsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Before you create an AnalyticDB for PostgreSQL instance, you must call this operation to query available regions and zones.</p>
     * <h2>Limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of regions and zones where AnalyticDB for PostgreSQL is available.</p>
     * 
     * @param request DescribeRegionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(DescribeRegionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.region)) {
            query.put("Region", request.region);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2016-05-03"),
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
     * <p>Before you create an AnalyticDB for PostgreSQL instance, you must call this operation to query available regions and zones.</p>
     * <h2>Limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries a list of regions and zones where AnalyticDB for PostgreSQL is available.</p>
     * 
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of roles.</p>
     * 
     * @param request DescribeRolesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRolesResponse
     */
    public DescribeRolesResponse describeRolesWithOptions(DescribeRolesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRoles"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of roles.</p>
     * 
     * @param request DescribeRolesRequest
     * @return DescribeRolesResponse
     */
    public DescribeRolesResponse describeRoles(DescribeRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRolesWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is not available for instances in reserved storage mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of audit logs for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeSQLLogCountRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSQLLogCountResponse
     */
    public DescribeSQLLogCountResponse describeSQLLogCountWithOptions(DescribeSQLLogCountRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeCost)) {
            query.put("ExecuteCost", request.executeCost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeState)) {
            query.put("ExecuteState", request.executeState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxExecuteCost)) {
            query.put("MaxExecuteCost", request.maxExecuteCost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minExecuteCost)) {
            query.put("MinExecuteCost", request.minExecuteCost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationClass)) {
            query.put("OperationClass", request.operationClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryKeywords)) {
            query.put("QueryKeywords", request.queryKeywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIP)) {
            query.put("SourceIP", request.sourceIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSQLLogCount"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSQLLogCountResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is not available for instances in reserved storage mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the number of audit logs for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeSQLLogCountRequest
     * @return DescribeSQLLogCountResponse
     */
    public DescribeSQLLogCountResponse describeSQLLogCount(DescribeSQLLogCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLLogCountWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is no longer used. To query SQL execution logs, call the <a href="https://help.aliyun.com/document_detail/453722.html">DescribeSQLLogsV2</a> operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the SQL execution logs of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeSQLLogsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSQLLogsResponse
     */
    public DescribeSQLLogsResponse describeSQLLogsWithOptions(DescribeSQLLogsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeCost)) {
            query.put("ExecuteCost", request.executeCost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeState)) {
            query.put("ExecuteState", request.executeState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxExecuteCost)) {
            query.put("MaxExecuteCost", request.maxExecuteCost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minExecuteCost)) {
            query.put("MinExecuteCost", request.minExecuteCost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationClass)) {
            query.put("OperationClass", request.operationClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryKeywords)) {
            query.put("QueryKeywords", request.queryKeywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIP)) {
            query.put("SourceIP", request.sourceIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSQLLogs"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSQLLogsResponse());
    }

    /**
     * <b>description</b> :
     * <blockquote>
     * <p>This operation is no longer used. To query SQL execution logs, call the <a href="https://help.aliyun.com/document_detail/453722.html">DescribeSQLLogsV2</a> operation.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the SQL execution logs of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeSQLLogsRequest
     * @return DescribeSQLLogsResponse
     */
    public DescribeSQLLogsResponse describeSQLLogs(DescribeSQLLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLLogsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query SQL logs of an AnalyticDB for PostgreSQL instance within a specific time range.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries SQL logs within a specific time range.</p>
     * 
     * @param request DescribeSQLLogsV2Request
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSQLLogsV2Response
     */
    public DescribeSQLLogsV2Response describeSQLLogsV2WithOptions(DescribeSQLLogsV2Request request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeCost)) {
            query.put("ExecuteCost", request.executeCost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeState)) {
            query.put("ExecuteState", request.executeState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxExecuteCost)) {
            query.put("MaxExecuteCost", request.maxExecuteCost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minExecuteCost)) {
            query.put("MinExecuteCost", request.minExecuteCost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationClass)) {
            query.put("OperationClass", request.operationClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryKeywords)) {
            query.put("QueryKeywords", request.queryKeywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIP)) {
            query.put("SourceIP", request.sourceIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSQLLogsV2"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSQLLogsV2Response());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query SQL logs of an AnalyticDB for PostgreSQL instance within a specific time range.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries SQL logs within a specific time range.</p>
     * 
     * @param request DescribeSQLLogsV2Request
     * @return DescribeSQLLogsV2Response
     */
    public DescribeSQLLogsV2Response describeSQLLogsV2(DescribeSQLLogsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLLogsV2WithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a sample dataset is loaded to an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeSampleDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSampleDataResponse
     */
    public DescribeSampleDataResponse describeSampleDataWithOptions(DescribeSampleDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSampleData"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSampleDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries whether a sample dataset is loaded to an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeSampleDataRequest
     * @return DescribeSampleDataResponse
     */
    public DescribeSampleDataResponse describeSampleData(DescribeSampleDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSampleDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a real-time data service.</p>
     * 
     * @param request DescribeStreamingDataServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStreamingDataServiceResponse
     */
    public DescribeStreamingDataServiceResponse describeStreamingDataServiceWithOptions(DescribeStreamingDataServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStreamingDataService"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStreamingDataServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a real-time data service.</p>
     * 
     * @param request DescribeStreamingDataServiceRequest
     * @return DescribeStreamingDataServiceResponse
     */
    public DescribeStreamingDataServiceResponse describeStreamingDataService(DescribeStreamingDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamingDataServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a real-time data source.</p>
     * 
     * @param request DescribeStreamingDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStreamingDataSourceResponse
     */
    public DescribeStreamingDataSourceResponse describeStreamingDataSourceWithOptions(DescribeStreamingDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeStreamingDataSource"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStreamingDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a real-time data source.</p>
     * 
     * @param request DescribeStreamingDataSourceRequest
     * @return DescribeStreamingDataSourceResponse
     */
    public DescribeStreamingDataSourceResponse describeStreamingDataSource(DescribeStreamingDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamingDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a real-time data service.</p>
     * 
     * @param request DescribeStreamingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeStreamingJobResponse
     */
    public DescribeStreamingJobResponse describeStreamingJobWithOptions(DescribeStreamingJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "DescribeStreamingJob"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeStreamingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a real-time data service.</p>
     * 
     * @param request DescribeStreamingJobRequest
     * @return DescribeStreamingJobResponse
     */
    public DescribeStreamingJobResponse describeStreamingJob(DescribeStreamingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the features that are supported by an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeSupportFeaturesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeSupportFeaturesResponse
     */
    public DescribeSupportFeaturesResponse describeSupportFeaturesWithOptions(DescribeSupportFeaturesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeSupportFeatures"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeSupportFeaturesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the features that are supported by an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeSupportFeaturesRequest
     * @return DescribeSupportFeaturesResponse
     */
    public DescribeSupportFeaturesResponse describeSupportFeatures(DescribeSupportFeaturesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSupportFeaturesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tags for AnalyticDB for PostgreSQL instances.</p>
     * 
     * @param request DescribeTagsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeTagsResponse
     */
    public DescribeTagsResponse describeTagsWithOptions(DescribeTagsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.ownerAccount)) {
            query.put("OwnerAccount", request.ownerAccount);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceType)) {
            query.put("ResourceType", request.resourceType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeTags"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeTagsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tags for AnalyticDB for PostgreSQL instances.</p>
     * 
     * @param request DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Key Management Service (KMS) keys.</p>
     * 
     * @param request DescribeUserEncryptionKeyListRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeUserEncryptionKeyListResponse
     */
    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyListWithOptions(DescribeUserEncryptionKeyListRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "DescribeUserEncryptionKeyList"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeUserEncryptionKeyListResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of Key Management Service (KMS) keys.</p>
     * 
     * @param request DescribeUserEncryptionKeyListRequest
     * @return DescribeUserEncryptionKeyListResponse
     */
    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserEncryptionKeyListWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of a lock-waiting query only for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a lock-waiting query for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeWaitingSQLInfoRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWaitingSQLInfoResponse
     */
    public DescribeWaitingSQLInfoResponse describeWaitingSQLInfoWithOptions(DescribeWaitingSQLInfoRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.PID)) {
            query.put("PID", request.PID);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWaitingSQLInfo"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWaitingSQLInfoResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the details of a lock-waiting query only for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the information about a lock-waiting query for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeWaitingSQLInfoRequest
     * @return DescribeWaitingSQLInfoResponse
     */
    public DescribeWaitingSQLInfoResponse describeWaitingSQLInfo(DescribeWaitingSQLInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWaitingSQLInfoWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the lock diagnostics records only for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the lock diagnostic records of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeWaitingSQLRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeWaitingSQLRecordsResponse
     */
    public DescribeWaitingSQLRecordsResponse describeWaitingSQLRecordsWithOptions(DescribeWaitingSQLRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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

        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            query.put("Order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryCondition)) {
            query.put("QueryCondition", request.queryCondition);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeWaitingSQLRecords"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeWaitingSQLRecordsResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to query the lock diagnostics records only for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Queries the lock diagnostic records of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DescribeWaitingSQLRecordsRequest
     * @return DescribeWaitingSQLRecordsResponse
     */
    public DescribeWaitingSQLRecordsResponse describeWaitingSQLRecords(DescribeWaitingSQLRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWaitingSQLRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation only for AnalyticDB for PostgreSQL V6.0 instances in elastic storage mode whose minor version is V6.6.1.0 or later.</p>
     * <ul>
     * <li>You can call this operation to disable resource group management only for AnalyticDB for PostgreSQL instances that are in the <strong>Running</strong> state.</li>
     * <li>**Note: When the resource management method is switched, your AnalyticDB for PostgreSQL instance restarts and becomes unavailable for approximately 5 minutes. To prevent your business from being affected, call this operation during off-peak hours.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables resource group management for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode. After you disable resource group management, the resource management method of the instance switches from resource group management to resource queue management.</p>
     * 
     * @param request DisableDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DisableDBResourceGroupResponse
     */
    public DisableDBResourceGroupResponse disableDBResourceGroupWithOptions(DisableDBResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DisableDBResourceGroup"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DisableDBResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation only for AnalyticDB for PostgreSQL V6.0 instances in elastic storage mode whose minor version is V6.6.1.0 or later.</p>
     * <ul>
     * <li>You can call this operation to disable resource group management only for AnalyticDB for PostgreSQL instances that are in the <strong>Running</strong> state.</li>
     * <li>**Note: When the resource management method is switched, your AnalyticDB for PostgreSQL instance restarts and becomes unavailable for approximately 5 minutes. To prevent your business from being affected, call this operation during off-peak hours.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Disables resource group management for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode. After you disable resource group management, the resource management method of the instance switches from resource group management to resource queue management.</p>
     * 
     * @param request DisableDBResourceGroupRequest
     * @return DisableDBResourceGroupResponse
     */
    public DisableDBResourceGroupResponse disableDBResourceGroup(DisableDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.disableDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to download the query diagnostic information of an AnalyticDB for PostgreSQL instance. After the download is complete, you can call the <a href="https://help.aliyun.com/document_detail/447712.html">DescribeDownloadRecords</a> operation to query download records and download URLs.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For more information about how to view and update the minor engine version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Downloads the query diagnostic information of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DownloadDiagnosisRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadDiagnosisRecordsResponse
     */
    public DownloadDiagnosisRecordsResponse downloadDiagnosisRecordsWithOptions(DownloadDiagnosisRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
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

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadDiagnosisRecords"),
            new TeaPair("version", "2016-05-03"),
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
     * <p>You can call this operation to download the query diagnostic information of an AnalyticDB for PostgreSQL instance. After the download is complete, you can call the <a href="https://help.aliyun.com/document_detail/447712.html">DescribeDownloadRecords</a> operation to query download records and download URLs.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For more information about how to view and update the minor engine version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Downloads the query diagnostic information of an AnalyticDB for PostgreSQL instance.</p>
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
     * <p>Download the slow query logs of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DownloadSQLLogsRecordsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return DownloadSQLLogsRecordsResponse
     */
    public DownloadSQLLogsRecordsResponse downloadSQLLogsRecordsWithOptions(DownloadSQLLogsRecordsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeCost)) {
            query.put("ExecuteCost", request.executeCost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeState)) {
            query.put("ExecuteState", request.executeState);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.lang)) {
            query.put("Lang", request.lang);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.maxExecuteCost)) {
            query.put("MaxExecuteCost", request.maxExecuteCost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minExecuteCost)) {
            query.put("MinExecuteCost", request.minExecuteCost);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationClass)) {
            query.put("OperationClass", request.operationClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryKeywords)) {
            query.put("QueryKeywords", request.queryKeywords);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sourceIP)) {
            query.put("SourceIP", request.sourceIP);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            query.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DownloadSQLLogsRecords"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DownloadSQLLogsRecordsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Download the slow query logs of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request DownloadSQLLogsRecordsRequest
     * @return DownloadSQLLogsRecordsResponse
     */
    public DownloadSQLLogsRecordsResponse downloadSQLLogsRecords(DownloadSQLLogsRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadSQLLogsRecordsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation only for AnalyticDB for PostgreSQL V6.0 instances in elastic storage mode whose minor version is V6.6.1.0 or later.</p>
     * <ul>
     * <li>You can call this operation to enable resource group management only for AnalyticDB for PostgreSQL instances that are in the <strong>Running</strong> state.</li>
     * <li>**Note: When the resource management mode is changed, your AnalyticDB for PostgreSQL instance is restarted and remains unavailable within 5 minutes. To prevent your business from being affected, call this operation during off-peak hours.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables resource group management for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode. After resource group management is enabled, the resource management mode of the instance is changed from resource queue to resource group.</p>
     * 
     * @param request EnableDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return EnableDBResourceGroupResponse
     */
    public EnableDBResourceGroupResponse enableDBResourceGroupWithOptions(EnableDBResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "EnableDBResourceGroup"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new EnableDBResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>  You can call this operation only for AnalyticDB for PostgreSQL V6.0 instances in elastic storage mode whose minor version is V6.6.1.0 or later.</p>
     * <ul>
     * <li>You can call this operation to enable resource group management only for AnalyticDB for PostgreSQL instances that are in the <strong>Running</strong> state.</li>
     * <li>**Note: When the resource management mode is changed, your AnalyticDB for PostgreSQL instance is restarted and remains unavailable within 5 minutes. To prevent your business from being affected, call this operation during off-peak hours.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Enables resource group management for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode. After resource group management is enabled, the resource management mode of the instance is changed from resource queue to resource group.</p>
     * 
     * @param request EnableDBResourceGroupRequest
     * @return EnableDBResourceGroupResponse
     */
    public EnableDBResourceGroupResponse enableDBResourceGroup(EnableDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.enableDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is related to the UploadDocumentAsync operation. You can call the UploadDocumentAsync operation to create an upload job and obtain the job ID, and then call the GetUploadDocumentJob operation to query the execution information of the job.</p>
     * <blockquote>
     * <p> Suggestions:</p>
     * </blockquote>
     * <ul>
     * <li>Determine whether the document upload job times out based on the document complexity and the number of tokens after chunking. In most cases, a job that lasts more than 2 hours is considered timeout.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the progress and result of an asynchronous document upload job based on the job ID.</p>
     * 
     * @param request GetUploadDocumentJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUploadDocumentJobResponse
     */
    public GetUploadDocumentJobResponse getUploadDocumentJobWithOptions(GetUploadDocumentJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            body.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            body.put("NamespacePassword", request.namespacePassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUploadDocumentJob"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUploadDocumentJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is related to the UploadDocumentAsync operation. You can call the UploadDocumentAsync operation to create an upload job and obtain the job ID, and then call the GetUploadDocumentJob operation to query the execution information of the job.</p>
     * <blockquote>
     * <p> Suggestions:</p>
     * </blockquote>
     * <ul>
     * <li>Determine whether the document upload job times out based on the document complexity and the number of tokens after chunking. In most cases, a job that lasts more than 2 hours is considered timeout.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Queries the progress and result of an asynchronous document upload job based on the job ID.</p>
     * 
     * @param request GetUploadDocumentJobRequest
     * @return GetUploadDocumentJobResponse
     */
    public GetUploadDocumentJobResponse getUploadDocumentJob(GetUploadDocumentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadDocumentJobWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is related to the <code>UpsertCollectionDataAsync</code> operation. You can call the <code>UpsertCollectionDataAsync</code> operation to create an upload job and obtain a job ID, and then call the GetUpsertCollectionDataJob operation to query the execution information of the job.</p>
     * <blockquote>
     * <p> We recommend that you evaluate the amount of time required for the upload job based on 1,000 data entries every second, and then query the job progress every 5 seconds. The timeout period can be set to 30 minutes after the evaluated amount of time.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the progress and result of an asynchronous vector data upload job by using a job ID.</p>
     * 
     * @param request GetUpsertCollectionDataJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetUpsertCollectionDataJobResponse
     */
    public GetUpsertCollectionDataJobResponse getUpsertCollectionDataJobWithOptions(GetUpsertCollectionDataJobRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            body.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            body.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            body.put("NamespacePassword", request.namespacePassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetUpsertCollectionDataJob"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetUpsertCollectionDataJobResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is related to the <code>UpsertCollectionDataAsync</code> operation. You can call the <code>UpsertCollectionDataAsync</code> operation to create an upload job and obtain a job ID, and then call the GetUpsertCollectionDataJob operation to query the execution information of the job.</p>
     * <blockquote>
     * <p> We recommend that you evaluate the amount of time required for the upload job based on 1,000 data entries every second, and then query the job progress every 5 seconds. The timeout period can be set to 30 minutes after the evaluated amount of time.</p>
     * </blockquote>
     * 
     * <b>summary</b> : 
     * <p>Queries the progress and result of an asynchronous vector data upload job by using a job ID.</p>
     * 
     * @param request GetUpsertCollectionDataJobRequest
     * @return GetUpsertCollectionDataJobResponse
     */
    public GetUpsertCollectionDataJobResponse getUpsertCollectionDataJob(GetUpsertCollectionDataJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUpsertCollectionDataJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grants vector collection permissions to a namespace.</p>
     * 
     * @param request GrantCollectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantCollectionResponse
     */
    public GrantCollectionResponse grantCollectionWithOptions(GrantCollectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantToNamespace)) {
            query.put("GrantToNamespace", request.grantToNamespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantType)) {
            query.put("GrantType", request.grantType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccount)) {
            query.put("ManagerAccount", request.managerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccountPassword)) {
            query.put("ManagerAccountPassword", request.managerAccountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
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
            new TeaPair("action", "GrantCollection"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantCollectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grants vector collection permissions to a namespace.</p>
     * 
     * @param request GrantCollectionRequest
     * @return GrantCollectionResponse
     */
    public GrantCollectionResponse grantCollection(GrantCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantCollectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Processes active queries.</p>
     * 
     * @param request HandleActiveSQLRecordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return HandleActiveSQLRecordResponse
     */
    public HandleActiveSQLRecordResponse handleActiveSQLRecordWithOptions(HandleActiveSQLRecordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operateType)) {
            query.put("OperateType", request.operateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pids)) {
            query.put("Pids", request.pids);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "HandleActiveSQLRecord"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new HandleActiveSQLRecordResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Processes active queries.</p>
     * 
     * @param request HandleActiveSQLRecordRequest
     * @return HandleActiveSQLRecordResponse
     */
    public HandleActiveSQLRecordResponse handleActiveSQLRecord(HandleActiveSQLRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.handleActiveSQLRecordWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Initializes vector databases.</p>
     * 
     * @param request InitVectorDatabaseRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return InitVectorDatabaseResponse
     */
    public InitVectorDatabaseResponse initVectorDatabaseWithOptions(InitVectorDatabaseRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccount)) {
            query.put("ManagerAccount", request.managerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccountPassword)) {
            query.put("ManagerAccountPassword", request.managerAccountPassword);
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
            new TeaPair("action", "InitVectorDatabase"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new InitVectorDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Initializes vector databases.</p>
     * 
     * @param request InitVectorDatabaseRequest
     * @return InitVectorDatabaseResponse
     */
    public InitVectorDatabaseResponse initVectorDatabase(InitVectorDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initVectorDatabaseWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of vector collections.</p>
     * 
     * @param request ListCollectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCollectionsResponse
     */
    public ListCollectionsResponse listCollectionsWithOptions(ListCollectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
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
            new TeaPair("action", "ListCollections"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCollectionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of vector collections.</p>
     * 
     * @param request ListCollectionsRequest
     * @return ListCollectionsResponse
     */
    public ListCollectionsResponse listCollections(ListCollectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCollectionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of document collections.</p>
     * 
     * @param request ListDocumentCollectionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDocumentCollectionsResponse
     */
    public ListDocumentCollectionsResponse listDocumentCollectionsWithOptions(ListDocumentCollectionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
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
            new TeaPair("action", "ListDocumentCollections"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDocumentCollectionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of document collections.</p>
     * 
     * @param request ListDocumentCollectionsRequest
     * @return ListDocumentCollectionsResponse
     */
    public ListDocumentCollectionsResponse listDocumentCollections(ListDocumentCollectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDocumentCollectionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of documents in a collection.</p>
     * 
     * @param request ListDocumentsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDocumentsResponse
     */
    public ListDocumentsResponse listDocumentsWithOptions(ListDocumentsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
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
            new TeaPair("action", "ListDocuments"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDocumentsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of documents in a collection.</p>
     * 
     * @param request ListDocumentsRequest
     * @return ListDocumentsResponse
     */
    public ListDocumentsResponse listDocuments(ListDocumentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDocumentsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of external data sources.</p>
     * 
     * @param request ListExternalDataServicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExternalDataServicesResponse
     */
    public ListExternalDataServicesResponse listExternalDataServicesWithOptions(ListExternalDataServicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "ListExternalDataServices"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExternalDataServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of external data sources.</p>
     * 
     * @param request ListExternalDataServicesRequest
     * @return ListExternalDataServicesResponse
     */
    public ListExternalDataServicesResponse listExternalDataServices(ListExternalDataServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExternalDataServicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例外表配置列表</p>
     * 
     * @param request ListExternalDataSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListExternalDataSourcesResponse
     */
    public ListExternalDataSourcesResponse listExternalDataSourcesWithOptions(ListExternalDataSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "ListExternalDataSources"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListExternalDataSourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取实例外表配置列表</p>
     * 
     * @param request ListExternalDataSourcesRequest
     * @return ListExternalDataSourcesResponse
     */
    public ListExternalDataSourcesResponse listExternalDataSources(ListExternalDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExternalDataSourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of extensions.</p>
     * 
     * @param request ListInstanceExtensionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListInstanceExtensionsResponse
     */
    public ListInstanceExtensionsResponse listInstanceExtensionsWithOptions(ListInstanceExtensionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extension)) {
            query.put("Extension", request.extension);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.installStatus)) {
            query.put("InstallStatus", request.installStatus);
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
            new TeaPair("action", "ListInstanceExtensions"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListInstanceExtensionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of extensions.</p>
     * 
     * @param request ListInstanceExtensionsRequest
     * @return ListInstanceExtensionsResponse
     */
    public ListInstanceExtensionsResponse listInstanceExtensions(ListInstanceExtensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceExtensionsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of namespaces.</p>
     * 
     * @param request ListNamespacesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespacesWithOptions(ListNamespacesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccount)) {
            query.put("ManagerAccount", request.managerAccount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.managerAccountPassword)) {
            query.put("ManagerAccountPassword", request.managerAccountPassword);
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
            new TeaPair("action", "ListNamespaces"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListNamespacesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of namespaces.</p>
     * 
     * @param request ListNamespacesRequest
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNamespacesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about real-time data services.</p>
     * 
     * @param request ListStreamingDataServicesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStreamingDataServicesResponse
     */
    public ListStreamingDataServicesResponse listStreamingDataServicesWithOptions(ListStreamingDataServicesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "ListStreamingDataServices"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStreamingDataServicesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries the information about real-time data services.</p>
     * 
     * @param request ListStreamingDataServicesRequest
     * @return ListStreamingDataServicesResponse
     */
    public ListStreamingDataServicesResponse listStreamingDataServices(ListStreamingDataServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStreamingDataServicesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries real-time service data sources.</p>
     * 
     * @param request ListStreamingDataSourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStreamingDataSourcesResponse
     */
    public ListStreamingDataSourcesResponse listStreamingDataSourcesWithOptions(ListStreamingDataSourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "ListStreamingDataSources"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStreamingDataSourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries real-time service data sources.</p>
     * 
     * @param request ListStreamingDataSourcesRequest
     * @return ListStreamingDataSourcesResponse
     */
    public ListStreamingDataSourcesResponse listStreamingDataSources(ListStreamingDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStreamingDataSourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries real-time data service jobs.</p>
     * 
     * @param request ListStreamingJobsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListStreamingJobsResponse
     */
    public ListStreamingJobsResponse listStreamingJobsWithOptions(ListStreamingJobsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "ListStreamingJobs"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStreamingJobsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Queries real-time data service jobs.</p>
     * 
     * @param request ListStreamingJobsRequest
     * @return ListStreamingJobsResponse
     */
    public ListStreamingJobsResponse listStreamingJobs(ListStreamingJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStreamingJobsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Queries a list of tags that are added to AnalyticDB for PostgreSQL instances.</p>
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
            new TeaPair("version", "2016-05-03"),
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
     * <p>Queries a list of tags that are added to AnalyticDB for PostgreSQL instances.</p>
     * 
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the description of a database account for an AnalyticDB for PostgreSQL instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyAccountDescription"),
            new TeaPair("version", "2016-05-03"),
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
     * <b>summary</b> : 
     * <p>Modifies the description of a database account for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Configures the backup policy of an AnalyticDB for PostgreSQL instance.</p>
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

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.enableRecoveryPoint)) {
            query.put("EnableRecoveryPoint", request.enableRecoveryPoint);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupPeriod)) {
            query.put("PreferredBackupPeriod", request.preferredBackupPeriod);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preferredBackupTime)) {
            query.put("PreferredBackupTime", request.preferredBackupTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recoveryPointPeriod)) {
            query.put("RecoveryPointPeriod", request.recoveryPointPeriod);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyBackupPolicy"),
            new TeaPair("version", "2016-05-03"),
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
     * <b>summary</b> : 
     * <p>Configures the backup policy of an AnalyticDB for PostgreSQL instance.</p>
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
     * <p>Changes the threshold of computing resources and the wait period of idle resources for an AnalyticDB for PostgreSQL instance in Serverless automatic scheduling mode.</p>
     * 
     * @param request ModifyDBInstanceConfigRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBInstanceConfigResponse
     */
    public ModifyDBInstanceConfigResponse modifyDBInstanceConfigWithOptions(ModifyDBInstanceConfigRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceDescription)) {
            query.put("DBInstanceDescription", request.DBInstanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idleTime)) {
            query.put("IdleTime", request.idleTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serverlessResource)) {
            query.put("ServerlessResource", request.serverlessResource);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBInstanceConfig"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceConfigResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the threshold of computing resources and the wait period of idle resources for an AnalyticDB for PostgreSQL instance in Serverless automatic scheduling mode.</p>
     * 
     * @param request ModifyDBInstanceConfigRequest
     * @return ModifyDBInstanceConfigResponse
     */
    public ModifyDBInstanceConfigResponse modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceConfigWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the endpoint of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyDBInstanceConnectionStringRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBInstanceConnectionStringResponse
     */
    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionStringWithOptions(ModifyDBInstanceConnectionStringRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionStringPrefix)) {
            query.put("ConnectionStringPrefix", request.connectionStringPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentConnectionString)) {
            query.put("CurrentConnectionString", request.currentConnectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBInstanceConnectionString"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceConnectionStringResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Changes the endpoint of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyDBInstanceConnectionStringRequest
     * @return ModifyDBInstanceConnectionStringResponse
     */
    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceConnectionStringWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To make it easy to identify AnalyticDB for PostgreSQL instances, you can call this operation to modify the description of instances.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the description of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyDBInstanceDescriptionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBInstanceDescriptionResponse
     */
    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescriptionWithOptions(ModifyDBInstanceDescriptionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceDescription)) {
            query.put("DBInstanceDescription", request.DBInstanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBInstanceDescription"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceDescriptionResponse());
    }

    /**
     * <b>description</b> :
     * <p>To make it easy to identify AnalyticDB for PostgreSQL instances, you can call this operation to modify the description of instances.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the description of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyDBInstanceDescriptionRequest
     * @return ModifyDBInstanceDescriptionResponse
     */
    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceDescriptionWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The system maintains AnalyticDB for PostgreSQL instances during the maintenance window that you specify. We recommend that you set the maintenance window to off-peak hours to minimize the impact on your business.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the maintenance window of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyDBInstanceMaintainTimeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBInstanceMaintainTimeResponse
     */
    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTimeWithOptions(ModifyDBInstanceMaintainTimeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.endTime)) {
            query.put("EndTime", request.endTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.startTime)) {
            query.put("StartTime", request.startTime);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBInstanceMaintainTime"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceMaintainTimeResponse());
    }

    /**
     * <b>description</b> :
     * <p>The system maintains AnalyticDB for PostgreSQL instances during the maintenance window that you specify. We recommend that you set the maintenance window to off-peak hours to minimize the impact on your business.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the maintenance window of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyDBInstanceMaintainTimeRequest
     * @return ModifyDBInstanceMaintainTimeResponse
     */
    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceMaintainTimeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>Resource Management allows you to build an organizational structure for resources based on your business requirements. You can use resource directories, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management?</a></p>
     * 
     * <b>summary</b> : 
     * <p>Moves an AnalyticDB for PostgreSQL instance to a resource group.</p>
     * 
     * @param request ModifyDBInstanceResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBInstanceResourceGroupResponse
     */
    public ModifyDBInstanceResourceGroupResponse modifyDBInstanceResourceGroupWithOptions(ModifyDBInstanceResourceGroupRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
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
            new TeaPair("action", "ModifyDBInstanceResourceGroup"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceResourceGroupResponse());
    }

    /**
     * <b>description</b> :
     * <p>Resource Management allows you to build an organizational structure for resources based on your business requirements. You can use resource directories, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see <a href="https://help.aliyun.com/document_detail/94475.html">What is Resource Management?</a></p>
     * 
     * <b>summary</b> : 
     * <p>Moves an AnalyticDB for PostgreSQL instance to a resource group.</p>
     * 
     * @param request ModifyDBInstanceResourceGroupRequest
     * @return ModifyDBInstanceResourceGroupResponse
     */
    public ModifyDBInstanceResourceGroupResponse modifyDBInstanceResourceGroup(ModifyDBInstanceResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables, disables, or updates SSL encryption for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyDBInstanceSSLRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBInstanceSSLResponse
     */
    public ModifyDBInstanceSSLResponse modifyDBInstanceSSLWithOptions(ModifyDBInstanceSSLRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionString)) {
            query.put("ConnectionString", request.connectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SSLEnabled)) {
            query.put("SSLEnabled", request.SSLEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBInstanceSSL"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyDBInstanceSSLResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables, disables, or updates SSL encryption for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyDBInstanceSSLRequest
     * @return ModifyDBInstanceSSLResponse
     */
    public ModifyDBInstanceSSLResponse modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceSSLWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a resource group.</p>
     * 
     * @param tmpReq ModifyDBResourceGroupRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyDBResourceGroupResponse
     */
    public ModifyDBResourceGroupResponse modifyDBResourceGroupWithOptions(ModifyDBResourceGroupRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyDBResourceGroupShrinkRequest request = new ModifyDBResourceGroupShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.resourceGroupItems)) {
            request.resourceGroupItemsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.resourceGroupItems, "ResourceGroupItems", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupItemsShrink)) {
            query.put("ResourceGroupItems", request.resourceGroupItemsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyDBResourceGroup"),
            new TeaPair("version", "2016-05-03"),
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
     * <b>summary</b> : 
     * <p>Modifies the configurations of a resource group.</p>
     * 
     * @param request ModifyDBResourceGroupRequest
     * @return ModifyDBResourceGroupResponse
     */
    public ModifyDBResourceGroupResponse modifyDBResourceGroup(ModifyDBResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBResourceGroupWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an external data service.</p>
     * 
     * @param request ModifyExternalDataServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyExternalDataServiceResponse
     */
    public ModifyExternalDataServiceResponse modifyExternalDataServiceWithOptions(ModifyExternalDataServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDescription)) {
            query.put("ServiceDescription", request.serviceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceSpec)) {
            query.put("ServiceSpec", request.serviceSpec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyExternalDataService"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyExternalDataServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies an external data service.</p>
     * 
     * @param request ModifyExternalDataServiceRequest
     * @return ModifyExternalDataServiceResponse
     */
    public ModifyExternalDataServiceResponse modifyExternalDataService(ModifyExternalDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyExternalDataServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a Hadoop data source.</p>
     * 
     * @param request ModifyHadoopDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyHadoopDataSourceResponse
     */
    public ModifyHadoopDataSourceResponse modifyHadoopDataSourceWithOptions(ModifyHadoopDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceDescription)) {
            query.put("DataSourceDescription", request.dataSourceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.emrInstanceId)) {
            query.put("EmrInstanceId", request.emrInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.HDFSConf)) {
            query.put("HDFSConf", request.HDFSConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hadoopCoreConf)) {
            query.put("HadoopCoreConf", request.hadoopCoreConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hadoopCreateType)) {
            query.put("HadoopCreateType", request.hadoopCreateType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hadoopHostsAddress)) {
            query.put("HadoopHostsAddress", request.hadoopHostsAddress);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hiveConf)) {
            query.put("HiveConf", request.hiveConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.mapReduceConf)) {
            query.put("MapReduceConf", request.mapReduceConf);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.yarnConf)) {
            query.put("YarnConf", request.yarnConf);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyHadoopDataSource"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyHadoopDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a Hadoop data source.</p>
     * 
     * @param request ModifyHadoopDataSourceRequest
     * @return ModifyHadoopDataSourceResponse
     */
    public ModifyHadoopDataSourceResponse modifyHadoopDataSource(ModifyHadoopDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHadoopDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a Java Database Connectivity (JDBC) data source.</p>
     * 
     * @param request ModifyJDBCDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyJDBCDataSourceResponse
     */
    public ModifyJDBCDataSourceResponse modifyJDBCDataSourceWithOptions(ModifyJDBCDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceDescription)) {
            query.put("DataSourceDescription", request.dataSourceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.JDBCConnectionString)) {
            query.put("JDBCConnectionString", request.JDBCConnectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.JDBCPassword)) {
            query.put("JDBCPassword", request.JDBCPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.JDBCUserName)) {
            query.put("JDBCUserName", request.JDBCUserName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyJDBCDataSource"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyJDBCDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the configurations of a Java Database Connectivity (JDBC) data source.</p>
     * 
     * @param request ModifyJDBCDataSourceRequest
     * @return ModifyJDBCDataSourceResponse
     */
    public ModifyJDBCDataSourceResponse modifyJDBCDataSource(ModifyJDBCDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyJDBCDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is not available for instances in reserved storage mode.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the specifications of coordinator node resources for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyMasterSpecRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyMasterSpecResponse
     */
    public ModifyMasterSpecResponse modifyMasterSpecWithOptions(ModifyMasterSpecRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceDescription)) {
            query.put("DBInstanceDescription", request.DBInstanceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterCU)) {
            query.put("MasterCU", request.masterCU);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMasterSpec"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMasterSpecResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is not available for instances in reserved storage mode.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the specifications of coordinator node resources for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyMasterSpecRequest
     * @return ModifyMasterSpecResponse
     */
    public ModifyMasterSpecResponse modifyMasterSpec(ModifyMasterSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMasterSpecWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation can be called to modify parameters of an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration parameters of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyParametersRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyParametersResponse
     */
    public ModifyParametersResponse modifyParametersWithOptions(ModifyParametersRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.forceRestartInstance)) {
            query.put("ForceRestartInstance", request.forceRestartInstance);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.parameters)) {
            query.put("Parameters", request.parameters);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyParameters"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyParametersResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation can be called to modify parameters of an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the configuration parameters of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyParametersRequest
     * @return ModifyParametersResponse
     */
    public ModifyParametersResponse modifyParameters(ModifyParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyParametersWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the SQL Explorer feature for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifySQLCollectorPolicyRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySQLCollectorPolicyResponse
     */
    public ModifySQLCollectorPolicyResponse modifySQLCollectorPolicyWithOptions(ModifySQLCollectorPolicyRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.SQLCollectorStatus)) {
            query.put("SQLCollectorStatus", request.SQLCollectorStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySQLCollectorPolicy"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySQLCollectorPolicyResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Enables or disables the SQL Explorer feature for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifySQLCollectorPolicyRequest
     * @return ModifySQLCollectorPolicyResponse
     */
    public ModifySQLCollectorPolicyResponse modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySQLCollectorPolicyWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>To ensure the security and stability of AnalyticDB for PostgreSQL instances, the system denies all external IP addresses to access AnalyticDB for PostgreSQL instances by default. Before you can use an AnalyticDB for PostgreSQL instance, you must add the IP address or CIDR block of your client to the IP address whitelist of the instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifySecurityIpsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifySecurityIpsResponse
     */
    public ModifySecurityIpsResponse modifySecurityIpsWithOptions(ModifySecurityIpsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceIPArrayAttribute)) {
            query.put("DBInstanceIPArrayAttribute", request.DBInstanceIPArrayAttribute);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceIPArrayName)) {
            query.put("DBInstanceIPArrayName", request.DBInstanceIPArrayName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.modifyMode)) {
            query.put("ModifyMode", request.modifyMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.securityIPList)) {
            query.put("SecurityIPList", request.securityIPList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifySecurityIps"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifySecurityIpsResponse());
    }

    /**
     * <b>description</b> :
     * <p>To ensure the security and stability of AnalyticDB for PostgreSQL instances, the system denies all external IP addresses to access AnalyticDB for PostgreSQL instances by default. Before you can use an AnalyticDB for PostgreSQL instance, you must add the IP address or CIDR block of your client to the IP address whitelist of the instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies the IP address whitelist of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifySecurityIpsRequest
     * @return ModifySecurityIpsResponse
     */
    public ModifySecurityIpsResponse modifySecurityIps(ModifySecurityIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityIpsWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a real-time data service.</p>
     * 
     * @param request ModifyStreamingDataServiceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyStreamingDataServiceResponse
     */
    public ModifyStreamingDataServiceResponse modifyStreamingDataServiceWithOptions(ModifyStreamingDataServiceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceDescription)) {
            query.put("ServiceDescription", request.serviceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceId)) {
            query.put("ServiceId", request.serviceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.serviceSpec)) {
            query.put("ServiceSpec", request.serviceSpec);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyStreamingDataService"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyStreamingDataServiceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a real-time data service.</p>
     * 
     * @param request ModifyStreamingDataServiceRequest
     * @return ModifyStreamingDataServiceResponse
     */
    public ModifyStreamingDataServiceResponse modifyStreamingDataService(ModifyStreamingDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyStreamingDataServiceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a real-time service data source.</p>
     * 
     * @param request ModifyStreamingDataSourceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyStreamingDataSourceResponse
     */
    public ModifyStreamingDataSourceResponse modifyStreamingDataSourceWithOptions(ModifyStreamingDataSourceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceConfig)) {
            query.put("DataSourceConfig", request.dataSourceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceDescription)) {
            query.put("DataSourceDescription", request.dataSourceDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyStreamingDataSource"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyStreamingDataSourceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies a real-time service data source.</p>
     * 
     * @param request ModifyStreamingDataSourceRequest
     * @return ModifyStreamingDataSourceResponse
     */
    public ModifyStreamingDataSourceResponse modifyStreamingDataSource(ModifyStreamingDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyStreamingDataSourceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建外部数据源配置</p>
     * 
     * @param tmpReq ModifyStreamingJobRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyStreamingJobResponse
     */
    public ModifyStreamingJobResponse modifyStreamingJobWithOptions(ModifyStreamingJobRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ModifyStreamingJobShrinkRequest request = new ModifyStreamingJobShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.destColumns)) {
            request.destColumnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.destColumns, "DestColumns", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.matchColumns)) {
            request.matchColumnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.matchColumns, "MatchColumns", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.srcColumns)) {
            request.srcColumnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.srcColumns, "SrcColumns", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.updateColumns)) {
            request.updateColumnsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.updateColumns, "UpdateColumns", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.account)) {
            query.put("Account", request.account);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.consistency)) {
            query.put("Consistency", request.consistency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destColumnsShrink)) {
            query.put("DestColumns", request.destColumnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destDatabase)) {
            query.put("DestDatabase", request.destDatabase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destSchema)) {
            query.put("DestSchema", request.destSchema);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.destTable)) {
            query.put("DestTable", request.destTable);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.errorLimitCount)) {
            query.put("ErrorLimitCount", request.errorLimitCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fallbackOffset)) {
            query.put("FallbackOffset", request.fallbackOffset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.groupName)) {
            query.put("GroupName", request.groupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobConfig)) {
            query.put("JobConfig", request.jobConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobDescription)) {
            query.put("JobDescription", request.jobDescription);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.jobId)) {
            query.put("JobId", request.jobId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.matchColumnsShrink)) {
            query.put("MatchColumns", request.matchColumnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.srcColumnsShrink)) {
            query.put("SrcColumns", request.srcColumnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tryRun)) {
            query.put("TryRun", request.tryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.updateColumnsShrink)) {
            query.put("UpdateColumns", request.updateColumnsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.writeMode)) {
            query.put("WriteMode", request.writeMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyStreamingJob"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyStreamingJobResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建外部数据源配置</p>
     * 
     * @param request ModifyStreamingJobRequest
     * @return ModifyStreamingJobResponse
     */
    public ModifyStreamingJobResponse modifyStreamingJob(ModifyStreamingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyStreamingJobWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the vector engine optimization configuration of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyVectorConfigurationRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ModifyVectorConfigurationResponse
     */
    public ModifyVectorConfigurationResponse modifyVectorConfigurationWithOptions(ModifyVectorConfigurationRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vectorConfigurationStatus)) {
            query.put("VectorConfigurationStatus", request.vectorConfigurationStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyVectorConfiguration"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyVectorConfigurationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Modifies the vector engine optimization configuration of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ModifyVectorConfigurationRequest
     * @return ModifyVectorConfigurationResponse
     */
    public ModifyVectorConfigurationResponse modifyVectorConfiguration(ModifyVectorConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVectorConfigurationWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Pauses data redistribution.</p>
     * 
     * @param request PauseDataRedistributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseDataRedistributeResponse
     */
    public PauseDataRedistributeResponse pauseDataRedistributeWithOptions(PauseDataRedistributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PauseDataRedistribute"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseDataRedistributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Pauses data redistribution.</p>
     * 
     * @param request PauseDataRedistributeRequest
     * @return PauseDataRedistributeResponse
     */
    public PauseDataRedistributeResponse pauseDataRedistribute(PauseDataRedistributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseDataRedistributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to pause an AnalyticDB for PostgreSQL instance that is in the <strong>Running</strong> state.
     * This operation is available only for AnalyticDB for PostgreSQL instances in Serverless mode that run V1.0.2.1 or later. For more information about how to view and update the minor engine version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * <blockquote>
     * <p> Before you call this operation, make sure that you are familiar with the billing methods and pricing of AnalyticDB for PostgreSQL instances. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * </blockquote>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Pauses an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request PauseInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return PauseInstanceResponse
     */
    public PauseInstanceResponse pauseInstanceWithOptions(PauseInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PauseInstance"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PauseInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to pause an AnalyticDB for PostgreSQL instance that is in the <strong>Running</strong> state.
     * This operation is available only for AnalyticDB for PostgreSQL instances in Serverless mode that run V1.0.2.1 or later. For more information about how to view and update the minor engine version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * <blockquote>
     * <p> Before you call this operation, make sure that you are familiar with the billing methods and pricing of AnalyticDB for PostgreSQL instances. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * </blockquote>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Pauses an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request PauseInstanceRequest
     * @return PauseInstanceResponse
     */
    public PauseInstanceResponse pauseInstance(PauseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves vector data.</p>
     * 
     * @param tmpReq QueryCollectionDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryCollectionDataResponse
     */
    public QueryCollectionDataResponse queryCollectionDataWithOptions(QueryCollectionDataRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryCollectionDataShrinkRequest request = new QueryCollectionDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hybridSearchArgs)) {
            request.hybridSearchArgsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hybridSearchArgs, "HybridSearchArgs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.vector)) {
            request.vectorShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.vector, "Vector", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hybridSearch)) {
            query.put("HybridSearch", request.hybridSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hybridSearchArgsShrink)) {
            query.put("HybridSearchArgs", request.hybridSearchArgsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeMetadataFields)) {
            query.put("IncludeMetadataFields", request.includeMetadataFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeValues)) {
            query.put("IncludeValues", request.includeValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            query.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.offset)) {
            query.put("Offset", request.offset);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderBy)) {
            query.put("OrderBy", request.orderBy);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            query.put("TopK", request.topK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.vectorShrink)) {
            query.put("Vector", request.vectorShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryCollectionData"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryCollectionDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Retrieves vector data.</p>
     * 
     * @param request QueryCollectionDataRequest
     * @return QueryCollectionDataResponse
     */
    public QueryCollectionDataResponse queryCollectionData(QueryCollectionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCollectionDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询</p>
     * 
     * @param tmpReq QueryContentRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return QueryContentResponse
     */
    public QueryContentResponse queryContentWithOptions(QueryContentRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        QueryContentShrinkRequest request = new QueryContentShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.hybridSearchArgs)) {
            request.hybridSearchArgsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.hybridSearchArgs, "HybridSearchArgs", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.recallWindow)) {
            request.recallWindowShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.recallWindow, "RecallWindow", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.content)) {
            query.put("Content", request.content);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            query.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hybridSearch)) {
            query.put("HybridSearch", request.hybridSearch);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.hybridSearchArgsShrink)) {
            query.put("HybridSearchArgs", request.hybridSearchArgsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeMetadataFields)) {
            query.put("IncludeMetadataFields", request.includeMetadataFields);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.includeVector)) {
            query.put("IncludeVector", request.includeVector);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metrics)) {
            query.put("Metrics", request.metrics);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.recallWindowShrink)) {
            query.put("RecallWindow", request.recallWindowShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rerankFactor)) {
            query.put("RerankFactor", request.rerankFactor);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.topK)) {
            query.put("TopK", request.topK);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.useFullTextRetrieval)) {
            query.put("UseFullTextRetrieval", request.useFullTextRetrieval);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "QueryContent"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new QueryContentResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询</p>
     * 
     * @param request QueryContentRequest
     * @return QueryContentResponse
     */
    public QueryContentResponse queryContent(QueryContentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryContentWithOptions(request, runtime);
    }

    public QueryContentResponse queryContentAdvance(QueryContentAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "gpdb"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        QueryContentRequest queryContentReq = new QueryContentRequest();
        com.aliyun.openapiutil.Client.convert(request, queryContentReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.fileUrlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            queryContentReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        QueryContentResponse queryContentResp = this.queryContentWithOptions(queryContentReq, runtime);
        return queryContentResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Rebalances an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request RebalanceDBInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RebalanceDBInstanceResponse
     */
    public RebalanceDBInstanceResponse rebalanceDBInstanceWithOptions(RebalanceDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RebalanceDBInstance"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RebalanceDBInstanceResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Rebalances an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request RebalanceDBInstanceRequest
     * @return RebalanceDBInstanceResponse
     */
    public RebalanceDBInstanceResponse rebalanceDBInstance(RebalanceDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebalanceDBInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Releases the public endpoint of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ReleaseInstancePublicConnectionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ReleaseInstancePublicConnectionResponse
     */
    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnectionWithOptions(ReleaseInstancePublicConnectionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.addressType)) {
            query.put("AddressType", request.addressType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.currentConnectionString)) {
            query.put("CurrentConnectionString", request.currentConnectionString);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ReleaseInstancePublicConnection"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ReleaseInstancePublicConnectionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Releases the public endpoint of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ReleaseInstancePublicConnectionRequest
     * @return ReleaseInstancePublicConnectionResponse
     */
    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstancePublicConnectionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the password of a database account for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ResetAccountPasswordRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetAccountPasswordResponse
     */
    public ResetAccountPasswordResponse resetAccountPasswordWithOptions(ResetAccountPasswordRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accountName)) {
            query.put("AccountName", request.accountName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.accountPassword)) {
            query.put("AccountPassword", request.accountPassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetAccountPassword"),
            new TeaPair("version", "2016-05-03"),
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
     * <b>summary</b> : 
     * <p>Resets the password of a database account for an AnalyticDB for PostgreSQL instance.</p>
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
     * <p>Resets the IMV statistics.</p>
     * 
     * @param request ResetIMVMonitorDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResetIMVMonitorDataResponse
     */
    public ResetIMVMonitorDataResponse resetIMVMonitorDataWithOptions(ResetIMVMonitorDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.database)) {
            query.put("Database", request.database);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResetIMVMonitorData"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResetIMVMonitorDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resets the IMV statistics.</p>
     * 
     * @param request ResetIMVMonitorDataRequest
     * @return ResetIMVMonitorDataResponse
     */
    public ResetIMVMonitorDataResponse resetIMVMonitorData(ResetIMVMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetIMVMonitorDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>A restart takes about 3 to 30 minutes. During the restart, services are unavailable. We recommend that you restart the instance during off-peak hours. After the instance is restarted and enters the running state, you can access the instance.</p>
     * <h2>Limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Restarts an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request RestartDBInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return RestartDBInstanceResponse
     */
    public RestartDBInstanceResponse restartDBInstanceWithOptions(RestartDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.clientToken)) {
            query.put("ClientToken", request.clientToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RestartDBInstance"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RestartDBInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>A restart takes about 3 to 30 minutes. During the restart, services are unavailable. We recommend that you restart the instance during off-peak hours. After the instance is restarted and enters the running state, you can access the instance.</p>
     * <h2>Limit</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Restarts an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     */
    public RestartDBInstanceResponse restartDBInstance(RestartDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDBInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes data redistribution.</p>
     * 
     * @param request ResumeDataRedistributeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeDataRedistributeResponse
     */
    public ResumeDataRedistributeResponse resumeDataRedistributeWithOptions(ResumeDataRedistributeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeDataRedistribute"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeDataRedistributeResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Resumes data redistribution.</p>
     * 
     * @param request ResumeDataRedistributeRequest
     * @return ResumeDataRedistributeResponse
     */
    public ResumeDataRedistributeResponse resumeDataRedistribute(ResumeDataRedistributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeDataRedistributeWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to resume an AnalyticDB for PostgreSQL instance that is in the <strong>Paused</strong> state.
     * This operation is available only for AnalyticDB for PostgreSQL instances in Serverless mode that run V1.0.2.1 or later. For more information about how to view and update the minor engine version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * <blockquote>
     * <p> Before you call this operation, make sure that you are familiar with the billing methods and pricing of AnalyticDB for PostgreSQL instances. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * </blockquote>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Resumes an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ResumeInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return ResumeInstanceResponse
     */
    public ResumeInstanceResponse resumeInstanceWithOptions(ResumeInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ResumeInstance"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ResumeInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to resume an AnalyticDB for PostgreSQL instance that is in the <strong>Paused</strong> state.
     * This operation is available only for AnalyticDB for PostgreSQL instances in Serverless mode that run V1.0.2.1 or later. For more information about how to view and update the minor engine version of an instance, see <a href="https://help.aliyun.com/document_detail/277424.html">View the minor engine version</a> and <a href="https://help.aliyun.com/document_detail/139271.html">Update the minor engine version</a>.</p>
     * <blockquote>
     * <p> Before you call this operation, make sure that you are familiar with the billing methods and pricing of AnalyticDB for PostgreSQL instances. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * </blockquote>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Resumes an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request ResumeInstanceRequest
     * @return ResumeInstanceResponse
     */
    public ResumeInstanceResponse resumeInstance(ResumeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to enable or disable a specified plan. The plan management feature is supported only for AnalyticDB for PostgreSQL instances in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables a plan for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request SetDBInstancePlanStatusRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDBInstancePlanStatusResponse
     */
    public SetDBInstancePlanStatusResponse setDBInstancePlanStatusWithOptions(SetDBInstancePlanStatusRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planStatus)) {
            query.put("PlanStatus", request.planStatus);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SetDBInstancePlanStatus"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDBInstancePlanStatusResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to enable or disable a specified plan. The plan management feature is supported only for AnalyticDB for PostgreSQL instances in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables a plan for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request SetDBInstancePlanStatusRequest
     * @return SetDBInstancePlanStatusResponse
     */
    public SetDBInstancePlanStatusResponse setDBInstancePlanStatus(SetDBInstancePlanStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDBInstancePlanStatusWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is called to enable or disable data sharing for an AnalyticDB for PostgreSQL instance in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables data sharing for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param tmpReq SetDataShareInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SetDataShareInstanceResponse
     */
    public SetDataShareInstanceResponse setDataShareInstanceWithOptions(SetDataShareInstanceRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        SetDataShareInstanceShrinkRequest request = new SetDataShareInstanceShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.instanceList)) {
            request.instanceListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.instanceList, "InstanceList", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceListShrink)) {
            query.put("InstanceList", request.instanceListShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.operationType)) {
            query.put("OperationType", request.operationType);
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
            new TeaPair("action", "SetDataShareInstance"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SetDataShareInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is called to enable or disable data sharing for an AnalyticDB for PostgreSQL instance in Serverless mode.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Enables or disables data sharing for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request SetDataShareInstanceRequest
     * @return SetDataShareInstanceResponse
     */
    public SetDataShareInstanceResponse setDataShareInstance(SetDataShareInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDataShareInstanceWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is not supported for AnalyticDB for PostgreSQL instances in elastic storage mode or Serverless mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Switches between the internal and public endpoints of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request SwitchDBInstanceNetTypeRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return SwitchDBInstanceNetTypeResponse
     */
    public SwitchDBInstanceNetTypeResponse switchDBInstanceNetTypeWithOptions(SwitchDBInstanceNetTypeRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionStringPrefix)) {
            query.put("ConnectionStringPrefix", request.connectionStringPrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.port)) {
            query.put("Port", request.port);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SwitchDBInstanceNetType"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SwitchDBInstanceNetTypeResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is not supported for AnalyticDB for PostgreSQL instances in elastic storage mode or Serverless mode.</p>
     * 
     * <b>summary</b> : 
     * <p>Switches between the internal and public endpoints of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request SwitchDBInstanceNetTypeRequest
     * @return SwitchDBInstanceNetTypeResponse
     */
    public SwitchDBInstanceNetTypeResponse switchDBInstanceNetType(SwitchDBInstanceNetTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchDBInstanceNetTypeWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and adds tags to AnalyticDB for PostgreSQL instances.</p>
     * 
     * @param request TagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResourcesWithOptions(TagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
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
            new TeaPair("action", "TagResources"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new TagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Creates and adds tags to AnalyticDB for PostgreSQL instances.</p>
     * 
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds database roles from a resource group.</p>
     * 
     * @param tmpReq UnbindDBResourceGroupWithRoleRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnbindDBResourceGroupWithRoleResponse
     */
    public UnbindDBResourceGroupWithRoleResponse unbindDBResourceGroupWithRoleWithOptions(UnbindDBResourceGroupWithRoleRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UnbindDBResourceGroupWithRoleShrinkRequest request = new UnbindDBResourceGroupWithRoleShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.roleList)) {
            request.roleListShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.roleList, "RoleList", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupName)) {
            query.put("ResourceGroupName", request.resourceGroupName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleListShrink)) {
            query.put("RoleList", request.roleListShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnbindDBResourceGroupWithRole"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnbindDBResourceGroupWithRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Unbinds database roles from a resource group.</p>
     * 
     * @param request UnbindDBResourceGroupWithRoleRequest
     * @return UnbindDBResourceGroupWithRoleResponse
     */
    public UnbindDBResourceGroupWithRoleResponse unbindDBResourceGroupWithRole(UnbindDBResourceGroupWithRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unbindDBResourceGroupWithRoleWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to release a sample dataset from an AnalyticDB for PostgreSQL instance. You must have already loaded the sample dataset.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a sample dataset from an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request UnloadSampleDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnloadSampleDataResponse
     */
    public UnloadSampleDataResponse unloadSampleDataWithOptions(UnloadSampleDataRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnloadSampleData"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnloadSampleDataResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to release a sample dataset from an AnalyticDB for PostgreSQL instance. You must have already loaded the sample dataset.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Releases a sample dataset from an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request UnloadSampleDataRequest
     * @return UnloadSampleDataResponse
     */
    public UnloadSampleDataResponse unloadSampleData(UnloadSampleDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unloadSampleDataWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from AnalyticDB for PostgreSQL instances. If the tags that you remove are not added to other instances, the tags are automatically deleted.</p>
     * 
     * @param request UntagResourcesRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResourcesWithOptions(UntagResourcesRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.all)) {
            query.put("All", request.all);
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

        if (!com.aliyun.teautil.Common.isUnset(request.tagKey)) {
            query.put("TagKey", request.tagKey);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UntagResources"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UntagResourcesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Removes tags from AnalyticDB for PostgreSQL instances. If the tags that you remove are not added to other instances, the tags are automatically deleted.</p>
     * 
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates metadata in the vector data.</p>
     * 
     * @param tmpReq UpdateCollectionDataMetadataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCollectionDataMetadataResponse
     */
    public UpdateCollectionDataMetadataResponse updateCollectionDataMetadataWithOptions(UpdateCollectionDataMetadataRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpdateCollectionDataMetadataShrinkRequest request = new UpdateCollectionDataMetadataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.ids)) {
            request.idsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.ids, "Ids", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.metadata)) {
            request.metadataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.metadata, "Metadata", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            query.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.idsShrink)) {
            query.put("Ids", request.idsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadataShrink)) {
            query.put("Metadata", request.metadataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
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
            new TeaPair("action", "UpdateCollectionDataMetadata"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCollectionDataMetadataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates metadata in the vector data.</p>
     * 
     * @param request UpdateCollectionDataMetadataRequest
     * @return UpdateCollectionDataMetadataResponse
     */
    public UpdateCollectionDataMetadataResponse updateCollectionDataMetadata(UpdateCollectionDataMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCollectionDataMetadataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify a plan for an AnalyticDB for PostgreSQL instance in Serverless mode. For example, you can modify a plan for periodically pausing and resuming an instance or scaling an instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a plan for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request UpdateDBInstancePlanRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDBInstancePlanResponse
     */
    public UpdateDBInstancePlanResponse updateDBInstancePlanWithOptions(UpdateDBInstancePlanRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planConfig)) {
            query.put("PlanConfig", request.planConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planDesc)) {
            query.put("PlanDesc", request.planDesc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planEndDate)) {
            query.put("PlanEndDate", request.planEndDate);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planId)) {
            query.put("PlanId", request.planId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planName)) {
            query.put("PlanName", request.planName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.planStartDate)) {
            query.put("PlanStartDate", request.planStartDate);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDBInstancePlan"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDBInstancePlanResponse());
    }

    /**
     * <b>description</b> :
     * <p>You can call this operation to modify a plan for an AnalyticDB for PostgreSQL instance in Serverless mode. For example, you can modify a plan for periodically pausing and resuming an instance or scaling an instance.</p>
     * <h2>Limits</h2>
     * <p>You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.</p>
     * 
     * <b>summary</b> : 
     * <p>Modifies a plan for an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request UpdateDBInstancePlanRequest
     * @return UpdateDBInstancePlanResponse
     */
    public UpdateDBInstancePlanResponse updateDBInstancePlan(UpdateDBInstancePlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDBInstancePlanWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is not available for instances in reserved storage mode.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the configurations of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request UpgradeDBInstanceRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeDBInstanceResponse
     */
    public UpgradeDBInstanceResponse upgradeDBInstanceWithOptions(UpgradeDBInstanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceClass)) {
            query.put("DBInstanceClass", request.DBInstanceClass);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceGroupCount)) {
            query.put("DBInstanceGroupCount", request.DBInstanceGroupCount);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceSpec)) {
            query.put("InstanceSpec", request.instanceSpec);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.masterNodeNum)) {
            query.put("MasterNodeNum", request.masterNodeNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.payType)) {
            query.put("PayType", request.payType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceGroupId)) {
            query.put("ResourceGroupId", request.resourceGroupId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.segDiskPerformanceLevel)) {
            query.put("SegDiskPerformanceLevel", request.segDiskPerformanceLevel);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.segNodeNum)) {
            query.put("SegNodeNum", request.segNodeNum);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.segStorageType)) {
            query.put("SegStorageType", request.segStorageType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.storageSize)) {
            query.put("StorageSize", request.storageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.upgradeType)) {
            query.put("UpgradeType", request.upgradeType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeDBInstance"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeDBInstanceResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is not available for instances in reserved storage mode.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see <a href="https://help.aliyun.com/document_detail/35406.html">Billing methods</a> and <a href="https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing">AnalyticDB for PostgreSQL pricing</a>.</p>
     * 
     * <b>summary</b> : 
     * <p>Changes the configurations of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     */
    public UpgradeDBInstanceResponse upgradeDBInstance(UpgradeDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeDBInstanceWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades the minor version of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request UpgradeDBVersionRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeDBVersionResponse
     */
    public UpgradeDBVersionResponse upgradeDBVersionWithOptions(UpgradeDBVersionRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.majorVersion)) {
            query.put("MajorVersion", request.majorVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.minorVersion)) {
            query.put("MinorVersion", request.minorVersion);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTime)) {
            query.put("SwitchTime", request.switchTime);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.switchTimeMode)) {
            query.put("SwitchTimeMode", request.switchTimeMode);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeDBVersion"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeDBVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Upgrades the minor version of an AnalyticDB for PostgreSQL instance.</p>
     * 
     * @param request UpgradeDBVersionRequest
     * @return UpgradeDBVersionResponse
     */
    public UpgradeDBVersionResponse upgradeDBVersion(UpgradeDBVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeDBVersionWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Updates extensions.</p>
     * 
     * @param request UpgradeExtensionsRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpgradeExtensionsResponse
     */
    public UpgradeExtensionsResponse upgradeExtensionsWithOptions(UpgradeExtensionsRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.extensions)) {
            query.put("Extensions", request.extensions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpgradeExtensions"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpgradeExtensionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Updates extensions.</p>
     * 
     * @param request UpgradeExtensionsRequest
     * @return UpgradeExtensionsResponse
     */
    public UpgradeExtensionsResponse upgradeExtensions(UpgradeExtensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeExtensionsWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>The server loads and chunks a document based on the file extension, performs vectorization by using the embedding model that is specified when you call the CreateDocumentCollection operation, and then writes the document to the specified document collection. This operation supports multi-modal embedding for various formats of text and images.
     * Related operations:</p>
     * <ul>
     * <li>You can call the GetUploadDocumentJob operation to query the progress and result of a document upload job.</li>
     * <li>You can call the CancelUploadDocumentJob operation to cancel a document upload job.<blockquote>
     * </blockquote>
     * </li>
     * <li>After a document upload request is submitted, the request is queued for processing. Up to 20 documents in the Pending and Running states can be processed within a Resource Access Management (RAM) user or Alibaba Cloud account.</li>
     * <li>A text document can be split into up to 100,000 chunks.</li>
     * <li>If a document collection uses the OnePeace model, each RAM user or Alibaba Cloud account can upload and query up to 10,000 images.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a document in an asynchronous manner by using an on-premises file or an Internet-accessible file URL. After a document is uploaded, the server loads, chunks, embeds, and stores the document. A document can be up to 200 MB in size.</p>
     * 
     * @param tmpReq UploadDocumentAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UploadDocumentAsyncResponse
     */
    public UploadDocumentAsyncResponse uploadDocumentAsyncWithOptions(UploadDocumentAsyncRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UploadDocumentAsyncShrinkRequest request = new UploadDocumentAsyncShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.metadata)) {
            request.metadataShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.metadata, "Metadata", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.separators)) {
            request.separatorsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.separators, "Separators", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.chunkOverlap)) {
            body.put("ChunkOverlap", request.chunkOverlap);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.chunkSize)) {
            body.put("ChunkSize", request.chunkSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            body.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.documentLoaderName)) {
            body.put("DocumentLoaderName", request.documentLoaderName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dryRun)) {
            body.put("DryRun", request.dryRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            body.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metadataShrink)) {
            body.put("Metadata", request.metadataShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            body.put("NamespacePassword", request.namespacePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.separatorsShrink)) {
            body.put("Separators", request.separatorsShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.textSplitterName)) {
            body.put("TextSplitterName", request.textSplitterName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.zhTitleEnhance)) {
            body.put("ZhTitleEnhance", request.zhTitleEnhance);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UploadDocumentAsync"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UploadDocumentAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <p>The server loads and chunks a document based on the file extension, performs vectorization by using the embedding model that is specified when you call the CreateDocumentCollection operation, and then writes the document to the specified document collection. This operation supports multi-modal embedding for various formats of text and images.
     * Related operations:</p>
     * <ul>
     * <li>You can call the GetUploadDocumentJob operation to query the progress and result of a document upload job.</li>
     * <li>You can call the CancelUploadDocumentJob operation to cancel a document upload job.<blockquote>
     * </blockquote>
     * </li>
     * <li>After a document upload request is submitted, the request is queued for processing. Up to 20 documents in the Pending and Running states can be processed within a Resource Access Management (RAM) user or Alibaba Cloud account.</li>
     * <li>A text document can be split into up to 100,000 chunks.</li>
     * <li>If a document collection uses the OnePeace model, each RAM user or Alibaba Cloud account can upload and query up to 10,000 images.</li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads a document in an asynchronous manner by using an on-premises file or an Internet-accessible file URL. After a document is uploaded, the server loads, chunks, embeds, and stores the document. A document can be up to 200 MB in size.</p>
     * 
     * @param request UploadDocumentAsyncRequest
     * @return UploadDocumentAsyncResponse
     */
    public UploadDocumentAsyncResponse uploadDocumentAsync(UploadDocumentAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.uploadDocumentAsyncWithOptions(request, runtime);
    }

    public UploadDocumentAsyncResponse uploadDocumentAsyncAdvance(UploadDocumentAsyncAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "gpdb"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        UploadDocumentAsyncRequest uploadDocumentAsyncReq = new UploadDocumentAsyncRequest();
        com.aliyun.openapiutil.Client.convert(request, uploadDocumentAsyncReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.fileUrlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            uploadDocumentAsyncReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        UploadDocumentAsyncResponse uploadDocumentAsyncResp = this.uploadDocumentAsyncWithOptions(uploadDocumentAsyncReq, runtime);
        return uploadDocumentAsyncResp;
    }

    /**
     * <b>summary</b> : 
     * <p>Splits a document into chunks and uploads the vectorized chunks to a document collection.</p>
     * 
     * @param tmpReq UpsertChunksRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertChunksResponse
     */
    public UpsertChunksResponse upsertChunksWithOptions(UpsertChunksRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpsertChunksShrinkRequest request = new UpsertChunksShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.textChunks)) {
            request.textChunksShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.textChunks, "TextChunks", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileName)) {
            query.put("FileName", request.fileName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.textChunksShrink)) {
            body.put("TextChunks", request.textChunksShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpsertChunks"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpsertChunksResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Splits a document into chunks and uploads the vectorized chunks to a document collection.</p>
     * 
     * @param request UpsertChunksRequest
     * @return UpsertChunksResponse
     */
    public UpsertChunksResponse upsertChunks(UpsertChunksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upsertChunksWithOptions(request, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads vector data to a vector collection.</p>
     * 
     * @param tmpReq UpsertCollectionDataRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertCollectionDataResponse
     */
    public UpsertCollectionDataResponse upsertCollectionDataWithOptions(UpsertCollectionDataRequest tmpReq, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        UpsertCollectionDataShrinkRequest request = new UpsertCollectionDataShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.rows)) {
            request.rowsShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.rows, "Rows", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            query.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            query.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            query.put("NamespacePassword", request.namespacePassword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.rowsShrink)) {
            body.put("Rows", request.rowsShrink);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpsertCollectionData"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpsertCollectionDataResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Uploads vector data to a vector collection.</p>
     * 
     * @param request UpsertCollectionDataRequest
     * @return UpsertCollectionDataResponse
     */
    public UpsertCollectionDataResponse upsertCollectionData(UpsertCollectionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upsertCollectionDataWithOptions(request, runtime);
    }

    /**
     * <b>description</b> :
     * <p>This operation is the asynchronous operation of <code>UpsertCollectionData</code>. The <code>UpsertCollectionData</code> operation supports up to 10 MB of data, and this operation supports up to 200 MB of data.</p>
     * <blockquote>
     * <p> Related operations:</p>
     * </blockquote>
     * <ul>
     * <li>You can call the GetUpsertCollectionDataJob operation to query the progress and result of an upload job.</li>
     * <li>You can call the CancelUpsertCollectionDataJob operation to cancel an upload job.<blockquote>
     * <p>You can upload data for the same collection only in a serial manner.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads vector data in an asynchronous manner by using an on-premises file or a password-free Internet-accessible file URL. The vector data can be up to 200 MB in size.</p>
     * 
     * @param request UpsertCollectionDataAsyncRequest
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpsertCollectionDataAsyncResponse
     */
    public UpsertCollectionDataAsyncResponse upsertCollectionDataAsyncWithOptions(UpsertCollectionDataAsyncRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ownerId)) {
            query.put("OwnerId", request.ownerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.collection)) {
            body.put("Collection", request.collection);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileUrl)) {
            body.put("FileUrl", request.fileUrl);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespace)) {
            body.put("Namespace", request.namespace);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namespacePassword)) {
            body.put("NamespacePassword", request.namespacePassword);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query)),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpsertCollectionDataAsync"),
            new TeaPair("version", "2016-05-03"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "RPC"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpsertCollectionDataAsyncResponse());
    }

    /**
     * <b>description</b> :
     * <p>This operation is the asynchronous operation of <code>UpsertCollectionData</code>. The <code>UpsertCollectionData</code> operation supports up to 10 MB of data, and this operation supports up to 200 MB of data.</p>
     * <blockquote>
     * <p> Related operations:</p>
     * </blockquote>
     * <ul>
     * <li>You can call the GetUpsertCollectionDataJob operation to query the progress and result of an upload job.</li>
     * <li>You can call the CancelUpsertCollectionDataJob operation to cancel an upload job.<blockquote>
     * <p>You can upload data for the same collection only in a serial manner.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <b>summary</b> : 
     * <p>Uploads vector data in an asynchronous manner by using an on-premises file or a password-free Internet-accessible file URL. The vector data can be up to 200 MB in size.</p>
     * 
     * @param request UpsertCollectionDataAsyncRequest
     * @return UpsertCollectionDataAsyncResponse
     */
    public UpsertCollectionDataAsyncResponse upsertCollectionDataAsync(UpsertCollectionDataAsyncRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upsertCollectionDataAsyncWithOptions(request, runtime);
    }

    public UpsertCollectionDataAsyncResponse upsertCollectionDataAsyncAdvance(UpsertCollectionDataAsyncAdvanceRequest request, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        // Step 0: init client
        String accessKeyId = _credential.getAccessKeyId();
        String accessKeySecret = _credential.getAccessKeySecret();
        String securityToken = _credential.getSecurityToken();
        String credentialType = _credential.getType();
        String openPlatformEndpoint = _openPlatformEndpoint;
        if (com.aliyun.teautil.Common.empty(openPlatformEndpoint)) {
            openPlatformEndpoint = "openplatform.aliyuncs.com";
        }

        if (com.aliyun.teautil.Common.isUnset(credentialType)) {
            credentialType = "access_key";
        }

        com.aliyun.teaopenapi.models.Config authConfig = com.aliyun.teaopenapi.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("securityToken", securityToken),
            new TeaPair("type", credentialType),
            new TeaPair("endpoint", openPlatformEndpoint),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.Client authClient = new com.aliyun.openplatform20191219.Client(authConfig);
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest authRequest = com.aliyun.openplatform20191219.models.AuthorizeFileUploadRequest.build(TeaConverter.buildMap(
            new TeaPair("product", "gpdb"),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse authResponse = new com.aliyun.openplatform20191219.models.AuthorizeFileUploadResponse();
        com.aliyun.oss.models.Config ossConfig = com.aliyun.oss.models.Config.build(TeaConverter.buildMap(
            new TeaPair("accessKeyId", accessKeyId),
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = new com.aliyun.oss.Client(ossConfig);
        com.aliyun.fileform.models.FileField fileObj = new com.aliyun.fileform.models.FileField();
        com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader ossHeader = new com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader();
        com.aliyun.oss.models.PostObjectRequest uploadRequest = new com.aliyun.oss.models.PostObjectRequest();
        com.aliyun.ossutil.models.RuntimeOptions ossRuntime = new com.aliyun.ossutil.models.RuntimeOptions();
        com.aliyun.openapiutil.Client.convert(runtime, ossRuntime);
        UpsertCollectionDataAsyncRequest upsertCollectionDataAsyncReq = new UpsertCollectionDataAsyncRequest();
        com.aliyun.openapiutil.Client.convert(request, upsertCollectionDataAsyncReq);
        if (!com.aliyun.teautil.Common.isUnset(request.fileUrlObject)) {
            authResponse = authClient.authorizeFileUploadWithOptions(authRequest, runtime);
            ossConfig.accessKeyId = authResponse.body.accessKeyId;
            ossConfig.endpoint = com.aliyun.openapiutil.Client.getEndpoint(authResponse.body.endpoint, authResponse.body.useAccelerate, _endpointType);
            ossClient = new com.aliyun.oss.Client(ossConfig);
            fileObj = com.aliyun.fileform.models.FileField.build(TeaConverter.buildMap(
                new TeaPair("filename", authResponse.body.objectKey),
                new TeaPair("content", request.fileUrlObject),
                new TeaPair("contentType", "")
            ));
            ossHeader = com.aliyun.oss.models.PostObjectRequest.PostObjectRequestHeader.build(TeaConverter.buildMap(
                new TeaPair("accessKeyId", authResponse.body.accessKeyId),
                new TeaPair("policy", authResponse.body.encodedPolicy),
                new TeaPair("signature", authResponse.body.signature),
                new TeaPair("key", authResponse.body.objectKey),
                new TeaPair("file", fileObj),
                new TeaPair("successActionStatus", "201")
            ));
            uploadRequest = com.aliyun.oss.models.PostObjectRequest.build(TeaConverter.buildMap(
                new TeaPair("bucketName", authResponse.body.bucket),
                new TeaPair("header", ossHeader)
            ));
            ossClient.postObject(uploadRequest, ossRuntime);
            upsertCollectionDataAsyncReq.fileUrl = "http://" + authResponse.body.bucket + "." + authResponse.body.endpoint + "/" + authResponse.body.objectKey + "";
        }

        UpsertCollectionDataAsyncResponse upsertCollectionDataAsyncResp = this.upsertCollectionDataAsyncWithOptions(upsertCollectionDataAsyncReq, runtime);
        return upsertCollectionDataAsyncResp;
    }
}
