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
     * @summary Allocates a public endpoint for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to apply for a public endpoint for an AnalyticDB for PostgreSQL instance. Both the primary and instance endpoints of an AnalyticDB for PostgreSQL instance can be public endpoints. For more information, see [Endpoints of an instance and its primary coordinator node](https://help.aliyun.com/document_detail/204879.html).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Allocates a public endpoint for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to apply for a public endpoint for an AnalyticDB for PostgreSQL instance. Both the primary and instance endpoints of an AnalyticDB for PostgreSQL instance can be public endpoints. For more information, see [Endpoints of an instance and its primary coordinator node](https://help.aliyun.com/document_detail/204879.html).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request AllocateInstancePublicConnectionRequest
     * @return AllocateInstancePublicConnectionResponse
     */
    public AllocateInstancePublicConnectionResponse allocateInstancePublicConnection(AllocateInstancePublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.allocateInstancePublicConnectionWithOptions(request, runtime);
    }

    /**
     * @summary 取消上传文档任务
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
     * @summary 取消上传文档任务
     *
     * @param request CancelUploadDocumentJobRequest
     * @return CancelUploadDocumentJobResponse
     */
    public CancelUploadDocumentJobResponse cancelUploadDocumentJob(CancelUploadDocumentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelUploadDocumentJobWithOptions(request, runtime);
    }

    /**
     * @summary 取消上传数据任务
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
     * @summary 取消上传数据任务
     *
     * @param request CancelUpsertCollectionDataJobRequest
     * @return CancelUpsertCollectionDataJobResponse
     */
    public CancelUpsertCollectionDataJobResponse cancelUpsertCollectionDataJob(CancelUpsertCollectionDataJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.cancelUpsertCollectionDataJobWithOptions(request, runtime);
    }

    /**
     * @summary 检查hadoop数据源配置
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
     * @summary 检查hadoop数据源配置
     *
     * @param request CheckHadoopDataSourceRequest
     * @return CheckHadoopDataSourceResponse
     */
    public CheckHadoopDataSourceResponse checkHadoopDataSource(CheckHadoopDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkHadoopDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary 检查hadoop集群网络连通性
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
     * @summary 检查hadoop集群网络连通性
     *
     * @param request CheckHadoopNetConnectionRequest
     * @return CheckHadoopNetConnectionResponse
     */
    public CheckHadoopNetConnectionResponse checkHadoopNetConnection(CheckHadoopNetConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkHadoopNetConnectionWithOptions(request, runtime);
    }

    /**
     * @summary 检查jdbc连接串网络连通性
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
     * @summary 检查jdbc连接串网络连通性
     *
     * @param request CheckJDBCSourceNetConnectionRequest
     * @return CheckJDBCSourceNetConnectionResponse
     */
    public CheckJDBCSourceNetConnectionResponse checkJDBCSourceNetConnection(CheckJDBCSourceNetConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkJDBCSourceNetConnectionWithOptions(request, runtime);
    }

    /**
     * @summary Queries whether a service-linked role is created.
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
     * @summary Queries whether a service-linked role is created.
     *
     * @param request CheckServiceLinkedRoleRequest
     * @return CheckServiceLinkedRoleResponse
     */
    public CheckServiceLinkedRoleResponse checkServiceLinkedRole(CheckServiceLinkedRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.checkServiceLinkedRoleWithOptions(request, runtime);
    }

    /**
     * @summary Creates a privileged account for an AnalyticDB for PostgreSQL instance.
     *
     * @description *   Before you can use an AnalyticDB for PostgreSQL instance, you must create a privileged account for the instance.
     * *   You can call this operation to create only privileged accounts. For information about how to create other types of accounts, see [Create a database account](https://help.aliyun.com/document_detail/50206.html).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Creates a privileged account for an AnalyticDB for PostgreSQL instance.
     *
     * @description *   Before you can use an AnalyticDB for PostgreSQL instance, you must create a privileged account for the instance.
     * *   You can call this operation to create only privileged accounts. For information about how to create other types of accounts, see [Create a database account](https://help.aliyun.com/document_detail/50206.html).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request CreateAccountRequest
     * @return CreateAccountResponse
     */
    public CreateAccountResponse createAccount(CreateAccountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createAccountWithOptions(request, runtime);
    }

    /**
     * @summary 创建Collection
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
     * @summary 创建Collection
     *
     * @param request CreateCollectionRequest
     * @return CreateCollectionResponse
     */
    public CreateCollectionResponse createCollection(CreateCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createCollectionWithOptions(request, runtime);
    }

    /**
     * @summary Creates an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation when you need to create AnalyticDB for PostgreSQL instances to meet the requirements of new applications or services.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL instances. For more information, see [Billing methods](https://help.aliyun.com/document_detail/35406.html) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
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
     * @summary Creates an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation when you need to create AnalyticDB for PostgreSQL instances to meet the requirements of new applications or services.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL instances. For more information, see [Billing methods](https://help.aliyun.com/document_detail/35406.html) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds a limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limits when you call this operation.
     *
     * @param request CreateDBInstanceRequest
     * @return CreateDBInstanceResponse
     */
    public CreateDBInstanceResponse createDBInstance(CreateDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Creates a plan for an AnalyticDB for PostgreSQL instance.
     *
     * @description *   The plan management feature is supported only for pay-as-you-go instances.
     * *   When you change the compute node specifications or change the number of compute nodes, transient connections may occur. We recommend that you perform these operations during off-peak hours.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see [Billing methods](https://help.aliyun.com/document_detail/35406.html) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
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
     * @summary Creates a plan for an AnalyticDB for PostgreSQL instance.
     *
     * @description *   The plan management feature is supported only for pay-as-you-go instances.
     * *   When you change the compute node specifications or change the number of compute nodes, transient connections may occur. We recommend that you perform these operations during off-peak hours.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see [Billing methods](https://help.aliyun.com/document_detail/35406.html) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
     *
     * @param request CreateDBInstancePlanRequest
     * @return CreateDBInstancePlanResponse
     */
    public CreateDBInstancePlanResponse createDBInstancePlan(CreateDBInstancePlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDBInstancePlanWithOptions(request, runtime);
    }

    /**
     * @summary 创建知识库
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
     * @summary 创建知识库
     *
     * @param request CreateDocumentCollectionRequest
     * @return CreateDocumentCollectionResponse
     */
    public CreateDocumentCollectionResponse createDocumentCollection(CreateDocumentCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createDocumentCollectionWithOptions(request, runtime);
    }

    /**
     * @summary 安装插件
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
     * @summary 安装插件
     *
     * @param request CreateExtensionsRequest
     * @return CreateExtensionsResponse
     */
    public CreateExtensionsResponse createExtensions(CreateExtensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExtensionsWithOptions(request, runtime);
    }

    /**
     * @summary 创建外部数据服务
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
     * @summary 创建外部数据服务
     *
     * @param request CreateExternalDataServiceRequest
     * @return CreateExternalDataServiceResponse
     */
    public CreateExternalDataServiceResponse createExternalDataService(CreateExternalDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createExternalDataServiceWithOptions(request, runtime);
    }

    /**
     * @summary 创建hadoop数据源配置
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
     * @summary 创建hadoop数据源配置
     *
     * @param request CreateHadoopDataSourceRequest
     * @return CreateHadoopDataSourceResponse
     */
    public CreateHadoopDataSourceResponse createHadoopDataSource(CreateHadoopDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createHadoopDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary 创建JDBC数据源配置
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
     * @summary 创建JDBC数据源配置
     *
     * @param request CreateJDBCDataSourceRequest
     * @return CreateJDBCDataSourceResponse
     */
    public CreateJDBCDataSourceResponse createJDBCDataSource(CreateJDBCDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createJDBCDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary Creates a vector namespace.
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
     * @summary Creates a vector namespace.
     *
     * @param request CreateNamespaceRequest
     * @return CreateNamespaceResponse
     */
    public CreateNamespaceResponse createNamespace(CreateNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createNamespaceWithOptions(request, runtime);
    }

    /**
     * @summary Creates a sample dataset for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to load a sample dataset to an AnalyticDB for PostgreSQL instance. Then, you can execute query statements on the sample dataset to experience or test your instance. For more information about query statements, see [Dataset information and query examples](https://help.aliyun.com/document_detail/452277.html).
     * ## Precautions
     * - If your instance is in elastic storage mode, the sample dataset is supported only for V6.3.10.3 or later. If your instance is in Serverless mode, the sample dataset is supported only for V1.0.4.0 or later. For more information about how to update the minor engine version of an instance, see [Update the minor engine version](/help/en/analyticdb-for-postgresql/latest/upgrade-the-engine-version).
     * - The sample dataset is about 10 GB in size. Make sure that your instance has sufficient storage space.
     * - The sample dataset contains a database named `ADB_SampleData_TPCH`. Make sure that your instance does not have a database with the same name. Otherwise, the dataset may fail to be loaded.
     * - It may take 6 to 8 minutes to load the sample dataset. During this period, operations on your instance such as adding nodes or changing node specifications may be affected.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Creates a sample dataset for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to load a sample dataset to an AnalyticDB for PostgreSQL instance. Then, you can execute query statements on the sample dataset to experience or test your instance. For more information about query statements, see [Dataset information and query examples](https://help.aliyun.com/document_detail/452277.html).
     * ## Precautions
     * - If your instance is in elastic storage mode, the sample dataset is supported only for V6.3.10.3 or later. If your instance is in Serverless mode, the sample dataset is supported only for V1.0.4.0 or later. For more information about how to update the minor engine version of an instance, see [Update the minor engine version](/help/en/analyticdb-for-postgresql/latest/upgrade-the-engine-version).
     * - The sample dataset is about 10 GB in size. Make sure that your instance has sufficient storage space.
     * - The sample dataset contains a database named `ADB_SampleData_TPCH`. Make sure that your instance does not have a database with the same name. Otherwise, the dataset may fail to be loaded.
     * - It may take 6 to 8 minutes to load the sample dataset. During this period, operations on your instance such as adding nodes or changing node specifications may be affected.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request CreateSampleDataRequest
     * @return CreateSampleDataResponse
     */
    public CreateSampleDataResponse createSampleData(CreateSampleDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createSampleDataWithOptions(request, runtime);
    }

    /**
     * @summary Creates a service-linked role.
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
     * @summary Creates a service-linked role.
     *
     * @param request CreateServiceLinkedRoleRequest
     * @return CreateServiceLinkedRoleResponse
     */
    public CreateServiceLinkedRoleResponse createServiceLinkedRole(CreateServiceLinkedRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createServiceLinkedRoleWithOptions(request, runtime);
    }

    /**
     * @summary 创建外部数据源配置
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
     * @summary 创建外部数据源配置
     *
     * @param request CreateStreamingDataServiceRequest
     * @return CreateStreamingDataServiceResponse
     */
    public CreateStreamingDataServiceResponse createStreamingDataService(CreateStreamingDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStreamingDataServiceWithOptions(request, runtime);
    }

    /**
     * @summary 创建外部数据源配置
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
     * @summary 创建外部数据源配置
     *
     * @param request CreateStreamingDataSourceRequest
     * @return CreateStreamingDataSourceResponse
     */
    public CreateStreamingDataSourceResponse createStreamingDataSource(CreateStreamingDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStreamingDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary 创建外部数据源配置
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
     * @summary 创建外部数据源配置
     *
     * @param request CreateStreamingJobRequest
     * @return CreateStreamingJobResponse
     */
    public CreateStreamingJobResponse createStreamingJob(CreateStreamingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createStreamingJobWithOptions(request, runtime);
    }

    /**
     * @summary 创建向量索引
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
     * @summary 创建向量索引
     *
     * @param request CreateVectorIndexRequest
     * @return CreateVectorIndexResponse
     */
    public CreateVectorIndexResponse createVectorIndex(CreateVectorIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.createVectorIndexWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a vector collection.
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
     * @summary Deletes a vector collection.
     *
     * @param request DeleteCollectionRequest
     * @return DeleteCollectionResponse
     */
    public DeleteCollectionResponse deleteCollection(DeleteCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCollectionWithOptions(request, runtime);
    }

    /**
     * @summary Deletes vector data.
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
     * @summary Deletes vector data.
     *
     * @param request DeleteCollectionDataRequest
     * @return DeleteCollectionDataResponse
     */
    public DeleteCollectionDataResponse deleteCollectionData(DeleteCollectionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteCollectionDataWithOptions(request, runtime);
    }

    /**
     * @summary Releases a pay-as-you-go AnalyticDB for PostgreSQL instance.
     *
     * @description *   Subscription instances cannot be manually released. They are automatically released when they expire.
     * *   You can call this operation to release pay-as-you-go instances only when they are in the **Running** state.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Releases a pay-as-you-go AnalyticDB for PostgreSQL instance.
     *
     * @description *   Subscription instances cannot be manually released. They are automatically released when they expire.
     * *   You can call this operation to release pay-as-you-go instances only when they are in the **Running** state.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DeleteDBInstanceRequest
     * @return DeleteDBInstanceResponse
     */
    public DeleteDBInstanceResponse deleteDBInstance(DeleteDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a plan from an AnalyticDB for PostgreSQL instance.
     *
     * @description If you no longer need a plan, you can call this operation to delete the plan. The plan management feature is supported only for AnalyticDB for PostgreSQL instances in Serverless mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Deletes a plan from an AnalyticDB for PostgreSQL instance.
     *
     * @description If you no longer need a plan, you can call this operation to delete the plan. The plan management feature is supported only for AnalyticDB for PostgreSQL instances in Serverless mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DeleteDBInstancePlanRequest
     * @return DeleteDBInstancePlanResponse
     */
    public DeleteDBInstancePlanResponse deleteDBInstancePlan(DeleteDBInstancePlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDBInstancePlanWithOptions(request, runtime);
    }

    /**
     * @summary 删除文档
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
     * @summary 删除文档
     *
     * @param request DeleteDocumentRequest
     * @return DeleteDocumentResponse
     */
    public DeleteDocumentResponse deleteDocument(DeleteDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDocumentWithOptions(request, runtime);
    }

    /**
     * @summary 删除知识库
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
     * @summary 删除知识库
     *
     * @param request DeleteDocumentCollectionRequest
     * @return DeleteDocumentCollectionResponse
     */
    public DeleteDocumentCollectionResponse deleteDocumentCollection(DeleteDocumentCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteDocumentCollectionWithOptions(request, runtime);
    }

    /**
     * @summary 删除插件
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
     * @summary 删除插件
     *
     * @param request DeleteExtensionRequest
     * @return DeleteExtensionResponse
     */
    public DeleteExtensionResponse deleteExtension(DeleteExtensionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExtensionWithOptions(request, runtime);
    }

    /**
     * @summary 删除外部数据服务
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
     * @summary 删除外部数据服务
     *
     * @param request DeleteExternalDataServiceRequest
     * @return DeleteExternalDataServiceResponse
     */
    public DeleteExternalDataServiceResponse deleteExternalDataService(DeleteExternalDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteExternalDataServiceWithOptions(request, runtime);
    }

    /**
     * @summary 删除hadoop数据源
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
     * @summary 删除hadoop数据源
     *
     * @param request DeleteHadoopDataSourceRequest
     * @return DeleteHadoopDataSourceResponse
     */
    public DeleteHadoopDataSourceResponse deleteHadoopDataSource(DeleteHadoopDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteHadoopDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary 删除jdbc数据源
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
     * @summary 删除jdbc数据源
     *
     * @param request DeleteJDBCDataSourceRequest
     * @return DeleteJDBCDataSourceResponse
     */
    public DeleteJDBCDataSourceResponse deleteJDBCDataSource(DeleteJDBCDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteJDBCDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a namespace.
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
     * @summary Deletes a namespace.
     *
     * @param request DeleteNamespaceRequest
     * @return DeleteNamespaceResponse
     */
    public DeleteNamespaceResponse deleteNamespace(DeleteNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteNamespaceWithOptions(request, runtime);
    }

    /**
     * @summary 创建外部数据源配置
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
     * @summary 创建外部数据源配置
     *
     * @param request DeleteStreamingDataServiceRequest
     * @return DeleteStreamingDataServiceResponse
     */
    public DeleteStreamingDataServiceResponse deleteStreamingDataService(DeleteStreamingDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStreamingDataServiceWithOptions(request, runtime);
    }

    /**
     * @summary 删除外部数据源配置
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
     * @summary 删除外部数据源配置
     *
     * @param request DeleteStreamingDataSourceRequest
     * @return DeleteStreamingDataSourceResponse
     */
    public DeleteStreamingDataSourceResponse deleteStreamingDataSource(DeleteStreamingDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStreamingDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary 删除外部数据源配置
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
     * @summary 删除外部数据源配置
     *
     * @param request DeleteStreamingJobRequest
     * @return DeleteStreamingJobResponse
     */
    public DeleteStreamingJobResponse deleteStreamingJob(DeleteStreamingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteStreamingJobWithOptions(request, runtime);
    }

    /**
     * @summary Deletes a vector index.
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
     * @summary Deletes a vector index.
     *
     * @param request DeleteVectorIndexRequest
     * @return DeleteVectorIndexResponse
     */
    public DeleteVectorIndexResponse deleteVectorIndex(DeleteVectorIndexRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.deleteVectorIndexWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about database accounts for an AnalyticDB for PostgreSQL instance.
     *
     * @description This operation is called to query the information of the privileged account in an AnalyticDB for PostgreSQL instance, such as its state, description, and the instance.
     * ## Limit
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the information about database accounts for an AnalyticDB for PostgreSQL instance.
     *
     * @description This operation is called to query the information of the privileged account in an AnalyticDB for PostgreSQL instance, such as its state, description, and the instance.
     * ## Limit
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeAccountsRequest
     * @return DescribeAccountsResponse
     */
    public DescribeAccountsResponse describeAccounts(DescribeAccountsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAccountsWithOptions(request, runtime);
    }

    /**
     * @summary 获取实例活跃的SQL列表
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
     * @summary 获取实例活跃的SQL列表
     *
     * @param request DescribeActiveSQLRecordsRequest
     * @return DescribeActiveSQLRecordsResponse
     */
    public DescribeActiveSQLRecordsResponse describeActiveSQLRecords(DescribeActiveSQLRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeActiveSQLRecordsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about available resources of AnalyticDB for PostgreSQL.
     *
     * @description When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available resources within a zone.
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
     * @summary Queries the information about available resources of AnalyticDB for PostgreSQL.
     *
     * @description When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available resources within a zone.
     *
     * @param request DescribeAvailableResourcesRequest
     * @return DescribeAvailableResourcesResponse
     */
    public DescribeAvailableResourcesResponse describeAvailableResources(DescribeAvailableResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeAvailableResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the backup policy of an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the backup settings of an AnalyticDB for PostgreSQL instance in elastic storage mode. Periodically backing data can prevent data loss. For more information about how to modify backup policies, see [ModifyBackupPolicy](https://help.aliyun.com/document_detail/210095.html).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the backup policy of an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the backup settings of an AnalyticDB for PostgreSQL instance in elastic storage mode. Periodically backing data can prevent data loss. For more information about how to modify backup policies, see [ModifyBackupPolicy](https://help.aliyun.com/document_detail/210095.html).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeBackupPolicyRequest
     * @return DescribeBackupPolicyResponse
     */
    public DescribeBackupPolicyResponse describeBackupPolicy(DescribeBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeBackupPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a vector collection.
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
     * @summary Queries the information about a vector collection.
     *
     * @param request DescribeCollectionRequest
     * @return DescribeCollectionResponse
     */
    public DescribeCollectionResponse describeCollection(DescribeCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeCollectionWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of nodes in an AnalyticDB for PostgreSQL instance.
     *
     * @description ##
     * You can call this operation to query the information about coordinator and compute nodes in an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries a list of nodes in an AnalyticDB for PostgreSQL instance.
     *
     * @description ##
     * You can call this operation to query the information about coordinator and compute nodes in an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeDBClusterNodeRequest
     * @return DescribeDBClusterNodeResponse
     */
    public DescribeDBClusterNodeResponse describeDBClusterNode(DescribeDBClusterNodeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterNodeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about performance metrics of an AnalyticDB for PostgreSQL instance within a time range.
     *
     * @description You can query monitoring information only within the last 30 days.
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
     * @summary Queries the information about performance metrics of an AnalyticDB for PostgreSQL instance within a time range.
     *
     * @description You can query monitoring information only within the last 30 days.
     *
     * @param request DescribeDBClusterPerformanceRequest
     * @return DescribeDBClusterPerformanceResponse
     */
    public DescribeDBClusterPerformanceResponse describeDBClusterPerformance(DescribeDBClusterPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBClusterPerformanceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about an AnalyticDB for PostgreSQL instance.
     *
     * @description ##
     * You can call this operation to query the information about an AnalyticDB for PostgreSQL instance, such as the instance type, network type, and instance state.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the information about an AnalyticDB for PostgreSQL instance.
     *
     * @description ##
     * You can call this operation to query the information about an AnalyticDB for PostgreSQL instance, such as the instance type, network type, and instance state.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeDBInstanceAttributeRequest
     * @return DescribeDBInstanceAttributeResponse
     */
    public DescribeDBInstanceAttributeResponse describeDBInstanceAttribute(DescribeDBInstanceAttributeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceAttributeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about data bloat for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the details of data bloat on an AnalyticDB for PostgreSQL instance in elastic storage mode. The minor version of the instance must be V6.3.10.1 or later. For more information about how to view and update the minor version of an instance, see [View the minor engine version](https://help.aliyun.com/document_detail/277424.html) and [Update the minor engine version](https://help.aliyun.com/document_detail/139271.html).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the information about data bloat for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the details of data bloat on an AnalyticDB for PostgreSQL instance in elastic storage mode. The minor version of the instance must be V6.3.10.1 or later. For more information about how to view and update the minor version of an instance, see [View the minor engine version](https://help.aliyun.com/document_detail/277424.html) and [Update the minor engine version](https://help.aliyun.com/document_detail/139271.html).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeDBInstanceDataBloatRequest
     * @return DescribeDBInstanceDataBloatResponse
     */
    public DescribeDBInstanceDataBloatResponse describeDBInstanceDataBloat(DescribeDBInstanceDataBloatRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceDataBloatWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about data skew for an AnalyticDB for PostgreSQL instance.
     *
     * @description To prevent data skew from affecting your database service, you can call this operation to query the details about data skew on an AnalyticDB for PostgreSQL instance.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the information about data skew for an AnalyticDB for PostgreSQL instance.
     *
     * @description To prevent data skew from affecting your database service, you can call this operation to query the details about data skew on an AnalyticDB for PostgreSQL instance.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeDBInstanceDataSkewRequest
     * @return DescribeDBInstanceDataSkewResponse
     */
    public DescribeDBInstanceDataSkewResponse describeDBInstanceDataSkew(DescribeDBInstanceDataSkewRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceDataSkewWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about nodes in an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the distribution and states of coordinator and compute nodes in an AnalyticDB for PostgreSQL instance.
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
     * @summary Queries the information about nodes in an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the distribution and states of coordinator and compute nodes in an AnalyticDB for PostgreSQL instance.
     *
     * @param request DescribeDBInstanceDiagnosisSummaryRequest
     * @return DescribeDBInstanceDiagnosisSummaryResponse
     */
    public DescribeDBInstanceDiagnosisSummaryResponse describeDBInstanceDiagnosisSummary(DescribeDBInstanceDiagnosisSummaryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceDiagnosisSummaryWithOptions(request, runtime);
    }

    /**
     * @summary Queries the error logs of an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the error logs of an AnalyticDB for PostgreSQL instance.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the error logs of an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the error logs of an AnalyticDB for PostgreSQL instance.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeDBInstanceErrorLogRequest
     * @return DescribeDBInstanceErrorLogResponse
     */
    public DescribeDBInstanceErrorLogResponse describeDBInstanceErrorLog(DescribeDBInstanceErrorLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceErrorLogWithOptions(request, runtime);
    }

    /**
     * @summary Queries the whitelists of IP addresses that are allowed to access an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the whitelists of IP addresses that are allowed to access an AnalyticDB for PostgreSQL instance.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the whitelists of IP addresses that are allowed to access an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the whitelists of IP addresses that are allowed to access an AnalyticDB for PostgreSQL instance.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeDBInstanceIPArrayListRequest
     * @return DescribeDBInstanceIPArrayListResponse
     */
    public DescribeDBInstanceIPArrayListResponse describeDBInstanceIPArrayList(DescribeDBInstanceIPArrayListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceIPArrayListWithOptions(request, runtime);
    }

    /**
     * @summary Queries the index usage of an AnalyticDB for PostgreSQL instance.
     *
     * @description Appropriate indexes can accelerate database queries. You can call this operation to query the index usage of an AnalyticDB for PostgreSQL instance.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see [View the minor engine version](https://help.aliyun.com/document_detail/277424.html) and [Update the minor engine version](https://help.aliyun.com/document_detail/139271.html).
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
     * @summary Queries the index usage of an AnalyticDB for PostgreSQL instance.
     *
     * @description Appropriate indexes can accelerate database queries. You can call this operation to query the index usage of an AnalyticDB for PostgreSQL instance.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see [View the minor engine version](https://help.aliyun.com/document_detail/277424.html) and [Update the minor engine version](https://help.aliyun.com/document_detail/139271.html).
     *
     * @param request DescribeDBInstanceIndexUsageRequest
     * @return DescribeDBInstanceIndexUsageResponse
     */
    public DescribeDBInstanceIndexUsageResponse describeDBInstanceIndexUsage(DescribeDBInstanceIndexUsageRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceIndexUsageWithOptions(request, runtime);
    }

    /**
     * @summary Queries the connection information of an instance.
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
     * @summary Queries the connection information of an instance.
     *
     * @param request DescribeDBInstanceNetInfoRequest
     * @return DescribeDBInstanceNetInfoResponse
     */
    public DescribeDBInstanceNetInfoResponse describeDBInstanceNetInfo(DescribeDBInstanceNetInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceNetInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about performance metrics of an AnalyticDB for PostgreSQL instance within a time range.
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
     * @summary Queries the information about performance metrics of an AnalyticDB for PostgreSQL instance within a time range.
     *
     * @param request DescribeDBInstancePerformanceRequest
     * @return DescribeDBInstancePerformanceResponse
     */
    public DescribeDBInstancePerformanceResponse describeDBInstancePerformance(DescribeDBInstancePerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancePerformanceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about plans for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the details of plans for an AnalyticDB for PostgreSQL instance in Serverless mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the information about plans for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the details of plans for an AnalyticDB for PostgreSQL instance in Serverless mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeDBInstancePlansRequest
     * @return DescribeDBInstancePlansResponse
     */
    public DescribeDBInstancePlansResponse describeDBInstancePlans(DescribeDBInstancePlansRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancePlansWithOptions(request, runtime);
    }

    /**
     * @summary Queries the SSL information about an AnalyticDB for PostgreSQL instance.
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
     * @summary Queries the SSL information about an AnalyticDB for PostgreSQL instance.
     *
     * @param request DescribeDBInstanceSSLRequest
     * @return DescribeDBInstanceSSLResponse
     */
    public DescribeDBInstanceSSLResponse describeDBInstanceSSL(DescribeDBInstanceSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceSSLWithOptions(request, runtime);
    }

    /**
     * @summary 查询实例最大吞吐和IOPS
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
     * @summary 查询实例最大吞吐和IOPS
     *
     * @param request DescribeDBInstanceSupportMaxPerformanceRequest
     * @return DescribeDBInstanceSupportMaxPerformanceResponse
     */
    public DescribeDBInstanceSupportMaxPerformanceResponse describeDBInstanceSupportMaxPerformance(DescribeDBInstanceSupportMaxPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstanceSupportMaxPerformanceWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of AnalyticDB for PostgreSQL instances.
     *
     * @description ##
     * You can call this operation to query the instance types, network types, and states of AnalyticDB for PostgreSQL instances within a region.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries a list of AnalyticDB for PostgreSQL instances.
     *
     * @description ##
     * You can call this operation to query the instance types, network types, and states of AnalyticDB for PostgreSQL instances within a region.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeDBInstancesRequest
     * @return DescribeDBInstancesResponse
     */
    public DescribeDBInstancesResponse describeDBInstances(DescribeDBInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBInstancesWithOptions(request, runtime);
    }

    /**
     * @summary 获取资源管理模式
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
     * @summary 获取资源管理模式
     *
     * @param request DescribeDBResourceManagementModeRequest
     * @return DescribeDBResourceManagementModeResponse
     */
    public DescribeDBResourceManagementModeResponse describeDBResourceManagementMode(DescribeDBResourceManagementModeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBResourceManagementModeWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about minor versions of AnalyticDB for PostgreSQL instances.
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
     * @summary Queries the information about minor versions of AnalyticDB for PostgreSQL instances.
     *
     * @param request DescribeDBVersionInfosRequest
     * @return DescribeDBVersionInfosResponse
     */
    public DescribeDBVersionInfosResponse describeDBVersionInfos(DescribeDBVersionInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDBVersionInfosWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of backup sets of full backup or point-in-time backup for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query a list of backup sets and backup details only for instances in elastic storage mode.
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
     * @summary Queries a list of backup sets of full backup or point-in-time backup for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query a list of backup sets and backup details only for instances in elastic storage mode.
     *
     * @param request DescribeDataBackupsRequest
     * @return DescribeDataBackupsResponse
     */
    public DescribeDataBackupsResponse describeDataBackups(DescribeDataBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataBackupsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the data redistribution information about an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.
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
     * @summary Queries the data redistribution information about an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.
     *
     * @param request DescribeDataReDistributeInfoRequest
     * @return DescribeDataReDistributeInfoResponse
     */
    public DescribeDataReDistributeInfoResponse describeDataReDistributeInfo(DescribeDataReDistributeInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataReDistributeInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries the state of data sharing for AnalyticDB for PostgreSQL instances.
     *
     * @description Data sharing is supported only for instances in Serverless mode.
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
     * @summary Queries the state of data sharing for AnalyticDB for PostgreSQL instances.
     *
     * @description Data sharing is supported only for instances in Serverless mode.
     *
     * @param request DescribeDataShareInstancesRequest
     * @return DescribeDataShareInstancesResponse
     */
    public DescribeDataShareInstancesResponse describeDataShareInstances(DescribeDataShareInstancesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataShareInstancesWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about data sharing performance metrics.
     *
     * @description You can call this operation to query the details of data sharing performance metrics for an AnalyticDB for PostgreSQL instance in Serverless mode, such as the number of shared topics and the amount of data shared.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the information about data sharing performance metrics.
     *
     * @description You can call this operation to query the details of data sharing performance metrics for an AnalyticDB for PostgreSQL instance in Serverless mode, such as the number of shared topics and the amount of data shared.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeDataSharePerformanceRequest
     * @return DescribeDataSharePerformanceResponse
     */
    public DescribeDataSharePerformanceResponse describeDataSharePerformance(DescribeDataSharePerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDataSharePerformanceWithOptions(request, runtime);
    }

    /**
     * @summary Queries all databases and database accounts for an AnalyticDB for PostgreSQL instance.
     *
     * @description To facilitate management, you can call this operation to query all databases and database accounts on an AnalyticDB for PostgreSQL instance.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries all databases and database accounts for an AnalyticDB for PostgreSQL instance.
     *
     * @description To facilitate management, you can call this operation to query all databases and database accounts on an AnalyticDB for PostgreSQL instance.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeDiagnosisDimensionsRequest
     * @return DescribeDiagnosisDimensionsResponse
     */
    public DescribeDiagnosisDimensionsResponse describeDiagnosisDimensions(DescribeDiagnosisDimensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosisDimensionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the details of query execution on an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the details of query execution on an AnalyticDB for PostgreSQL instance in elastic storage mode within a specified time range.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the details of query execution on an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the details of query execution on an AnalyticDB for PostgreSQL instance in elastic storage mode within a specified time range.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeDiagnosisMonitorPerformanceRequest
     * @return DescribeDiagnosisMonitorPerformanceResponse
     */
    public DescribeDiagnosisMonitorPerformanceResponse describeDiagnosisMonitorPerformance(DescribeDiagnosisMonitorPerformanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosisMonitorPerformanceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about SQL queries for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the details of SQL queries on an AnalyticDB for PostgreSQL instance within a specified time range.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the information about SQL queries for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the details of SQL queries on an AnalyticDB for PostgreSQL instance within a specified time range.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeDiagnosisRecordsRequest
     * @return DescribeDiagnosisRecordsResponse
     */
    public DescribeDiagnosisRecordsResponse describeDiagnosisRecords(DescribeDiagnosisRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosisRecordsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a query for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the information about a query for an AnalyticDB for PostgreSQL instance, including the SQL statement, execution plan text, and execution plan tree.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see [View the minor engine version](https://help.aliyun.com/document_detail/277424.html) and [Update the minor engine version](https://help.aliyun.com/document_detail/139271.html).
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
     * @summary Queries the information about a query for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the information about a query for an AnalyticDB for PostgreSQL instance, including the SQL statement, execution plan text, and execution plan tree.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see [View the minor engine version](https://help.aliyun.com/document_detail/277424.html) and [Update the minor engine version](https://help.aliyun.com/document_detail/139271.html).
     *
     * @param request DescribeDiagnosisSQLInfoRequest
     * @return DescribeDiagnosisSQLInfoResponse
     */
    public DescribeDiagnosisSQLInfoResponse describeDiagnosisSQLInfo(DescribeDiagnosisSQLInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDiagnosisSQLInfoWithOptions(request, runtime);
    }

    /**
     * @summary 获取文档详情
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
     * @summary 获取文档详情
     *
     * @param request DescribeDocumentRequest
     * @return DescribeDocumentResponse
     */
    public DescribeDocumentResponse describeDocument(DescribeDocumentRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDocumentWithOptions(request, runtime);
    }

    /**
     * @summary Queries the download records of query diagnostic information for an AnalyticDB for PostgreSQL instance.
     *
     * @description You must call the [DownloadDiagnosisRecords](https://help.aliyun.com/document_detail/447700.html) operation to download the query diagnostic information before you can call this operation to query the download records and download URLs.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see [View the minor engine version](https://help.aliyun.com/document_detail/277424.html) and [Update the minor engine version](https://help.aliyun.com/document_detail/139271.html).
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
     * @summary Queries the download records of query diagnostic information for an AnalyticDB for PostgreSQL instance.
     *
     * @description You must call the [DownloadDiagnosisRecords](https://help.aliyun.com/document_detail/447700.html) operation to download the query diagnostic information before you can call this operation to query the download records and download URLs.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For information about how to view and update the minor version of an instance, see [View the minor engine version](https://help.aliyun.com/document_detail/277424.html) and [Update the minor engine version](https://help.aliyun.com/document_detail/139271.html).
     *
     * @param request DescribeDownloadRecordsRequest
     * @return DescribeDownloadRecordsResponse
     */
    public DescribeDownloadRecordsResponse describeDownloadRecords(DescribeDownloadRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadRecordsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the last five download records of slow query logs for an AnalyticDB for PostgreSQL instance.
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
     * @summary Queries the last five download records of slow query logs for an AnalyticDB for PostgreSQL instance.
     *
     * @param request DescribeDownloadSQLLogsRequest
     * @return DescribeDownloadSQLLogsResponse
     */
    public DescribeDownloadSQLLogsResponse describeDownloadSQLLogs(DescribeDownloadSQLLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeDownloadSQLLogsWithOptions(request, runtime);
    }

    /**
     * @summary 获取外部数据服务详情
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
     * @summary 获取外部数据服务详情
     *
     * @param request DescribeExternalDataServiceRequest
     * @return DescribeExternalDataServiceResponse
     */
    public DescribeExternalDataServiceResponse describeExternalDataService(DescribeExternalDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeExternalDataServiceWithOptions(request, runtime);
    }

    /**
     * @summary 获取同网络下的Hadoop集群列表
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
     * @summary 获取同网络下的Hadoop集群列表
     *
     * @param request DescribeHadoopClustersInSameNetRequest
     * @return DescribeHadoopClustersInSameNetResponse
     */
    public DescribeHadoopClustersInSameNetResponse describeHadoopClustersInSameNet(DescribeHadoopClustersInSameNetRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHadoopClustersInSameNetWithOptions(request, runtime);
    }

    /**
     * @summary 获取hadoop配置信息
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
     * @summary 获取hadoop配置信息
     *
     * @param request DescribeHadoopConfigsRequest
     * @return DescribeHadoopConfigsResponse
     */
    public DescribeHadoopConfigsResponse describeHadoopConfigs(DescribeHadoopConfigsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHadoopConfigsWithOptions(request, runtime);
    }

    /**
     * @summary 获取hadoop数据源配置信息
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
     * @summary 获取hadoop数据源配置信息
     *
     * @param request DescribeHadoopDataSourceRequest
     * @return DescribeHadoopDataSourceResponse
     */
    public DescribeHadoopDataSourceResponse describeHadoopDataSource(DescribeHadoopDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHadoopDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the health status of an AnalyticDB for PostgreSQL instance and its nodes.
     *
     * @description This operation is called to query the health status of an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode and its coordinator and compute nodes.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the health status of an AnalyticDB for PostgreSQL instance and its nodes.
     *
     * @description This operation is called to query the health status of an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode and its coordinator and compute nodes.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeHealthStatusRequest
     * @return DescribeHealthStatusResponse
     */
    public DescribeHealthStatusResponse describeHealthStatus(DescribeHealthStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeHealthStatusWithOptions(request, runtime);
    }

    /**
     * @summary 查询实时物化视图信息
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
     * @summary 查询实时物化视图信息
     *
     * @param request DescribeIMVInfosRequest
     * @return DescribeIMVInfosResponse
     */
    public DescribeIMVInfosResponse describeIMVInfos(DescribeIMVInfosRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeIMVInfosWithOptions(request, runtime);
    }

    /**
     * @summary 获取jdbc数据源配置信息
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
     * @summary 获取jdbc数据源配置信息
     *
     * @param request DescribeJDBCDataSourceRequest
     * @return DescribeJDBCDataSourceResponse
     */
    public DescribeJDBCDataSourceResponse describeJDBCDataSource(DescribeJDBCDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeJDBCDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of log backups.
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
     * @summary Queries a list of log backups.
     *
     * @param request DescribeLogBackupsRequest
     * @return DescribeLogBackupsResponse
     */
    public DescribeLogBackupsResponse describeLogBackups(DescribeLogBackupsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeLogBackupsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the parameter modification logs of an AnalyticDB for PostgreSQL instance.
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
     * @summary Queries the parameter modification logs of an AnalyticDB for PostgreSQL instance.
     *
     * @param request DescribeModifyParameterLogRequest
     * @return DescribeModifyParameterLogResponse
     */
    public DescribeModifyParameterLogResponse describeModifyParameterLog(DescribeModifyParameterLogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeModifyParameterLogWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a namespace.
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
     * @summary Queries the information about a namespace.
     *
     * @param request DescribeNamespaceRequest
     * @return DescribeNamespaceResponse
     */
    public DescribeNamespaceResponse describeNamespace(DescribeNamespaceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeNamespaceWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about configuration parameters for an AnalyticDB for PostgreSQL instance.
     *
     * @description This operation can be called to query the details of parameters in an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the information about configuration parameters for an AnalyticDB for PostgreSQL instance.
     *
     * @description This operation can be called to query the details of parameters in an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeParametersRequest
     * @return DescribeParametersResponse
     */
    public DescribeParametersResponse describeParameters(DescribeParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeParametersWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of vSwitches.
     *
     * @description When you create AnalyticDB for PostgreSQL instances, you can call this operation to query the details of vSwitches within a specified region or zone.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries a list of vSwitches.
     *
     * @description When you create AnalyticDB for PostgreSQL instances, you can call this operation to query the details of vSwitches within a specified region or zone.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeRdsVSwitchsRequest
     * @return DescribeRdsVSwitchsResponse
     */
    public DescribeRdsVSwitchsResponse describeRdsVSwitchs(DescribeRdsVSwitchsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsVSwitchsWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of VPCs.
     *
     * @description When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available VPCs within a specified region or zone.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries a list of VPCs.
     *
     * @description When you create an AnalyticDB for PostgreSQL instance, you can call this operation to query the available VPCs within a specified region or zone.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeRdsVpcsRequest
     * @return DescribeRdsVpcsResponse
     */
    public DescribeRdsVpcsResponse describeRdsVpcs(DescribeRdsVpcsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRdsVpcsWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of regions and zones where AnalyticDB for PostgreSQL is available.
     *
     * @description Before you create an AnalyticDB for PostgreSQL instance, you must call this operation to query available regions and zones.
     * ## Limit
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries a list of regions and zones where AnalyticDB for PostgreSQL is available.
     *
     * @description Before you create an AnalyticDB for PostgreSQL instance, you must call this operation to query available regions and zones.
     * ## Limit
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeRegionsRequest
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions(DescribeRegionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeRegionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries the number of audit logs for an AnalyticDB for PostgreSQL instance.
     *
     * @description This operation is not available for instances in reserved storage mode.
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
     * @summary Queries the number of audit logs for an AnalyticDB for PostgreSQL instance.
     *
     * @description This operation is not available for instances in reserved storage mode.
     *
     * @param request DescribeSQLLogCountRequest
     * @return DescribeSQLLogCountResponse
     */
    public DescribeSQLLogCountResponse describeSQLLogCount(DescribeSQLLogCountRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLLogCountWithOptions(request, runtime);
    }

    /**
     * @summary Queries the SQL execution logs of an AnalyticDB for PostgreSQL instance.
     *
     * @description > This operation is no longer used. To query SQL execution logs, call the [DescribeSQLLogsV2](https://help.aliyun.com/document_detail/453722.html) operation.
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
     * @summary Queries the SQL execution logs of an AnalyticDB for PostgreSQL instance.
     *
     * @description > This operation is no longer used. To query SQL execution logs, call the [DescribeSQLLogsV2](https://help.aliyun.com/document_detail/453722.html) operation.
     *
     * @param request DescribeSQLLogsRequest
     * @return DescribeSQLLogsResponse
     */
    public DescribeSQLLogsResponse describeSQLLogs(DescribeSQLLogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLLogsWithOptions(request, runtime);
    }

    /**
     * @summary Queries SQL logs within a specific time range.
     *
     * @description You can call this operation to query SQL logs of an AnalyticDB for PostgreSQL instance within a specific time range.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries SQL logs within a specific time range.
     *
     * @description You can call this operation to query SQL logs of an AnalyticDB for PostgreSQL instance within a specific time range.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeSQLLogsV2Request
     * @return DescribeSQLLogsV2Response
     */
    public DescribeSQLLogsV2Response describeSQLLogsV2(DescribeSQLLogsV2Request request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSQLLogsV2WithOptions(request, runtime);
    }

    /**
     * @summary Queries whether a sample dataset is loaded to an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries whether a sample dataset is loaded to an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeSampleDataRequest
     * @return DescribeSampleDataResponse
     */
    public DescribeSampleDataResponse describeSampleData(DescribeSampleDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSampleDataWithOptions(request, runtime);
    }

    /**
     * @summary 创建外部数据源配置
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
     * @summary 创建外部数据源配置
     *
     * @param request DescribeStreamingDataServiceRequest
     * @return DescribeStreamingDataServiceResponse
     */
    public DescribeStreamingDataServiceResponse describeStreamingDataService(DescribeStreamingDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamingDataServiceWithOptions(request, runtime);
    }

    /**
     * @summary 获取外部数据源配置信息
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
     * @summary 获取外部数据源配置信息
     *
     * @param request DescribeStreamingDataSourceRequest
     * @return DescribeStreamingDataSourceResponse
     */
    public DescribeStreamingDataSourceResponse describeStreamingDataSource(DescribeStreamingDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamingDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary 删除外部数据源配置
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
     * @summary 删除外部数据源配置
     *
     * @param request DescribeStreamingJobRequest
     * @return DescribeStreamingJobResponse
     */
    public DescribeStreamingJobResponse describeStreamingJob(DescribeStreamingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeStreamingJobWithOptions(request, runtime);
    }

    /**
     * @summary Queries the features that are supported by an AnalyticDB for PostgreSQL instance.
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
     * @summary Queries the features that are supported by an AnalyticDB for PostgreSQL instance.
     *
     * @param request DescribeSupportFeaturesRequest
     * @return DescribeSupportFeaturesResponse
     */
    public DescribeSupportFeaturesResponse describeSupportFeatures(DescribeSupportFeaturesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeSupportFeaturesWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of tags for AnalyticDB for PostgreSQL instances.
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
     * @summary Queries a list of tags for AnalyticDB for PostgreSQL instances.
     *
     * @param request DescribeTagsRequest
     * @return DescribeTagsResponse
     */
    public DescribeTagsResponse describeTags(DescribeTagsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeTagsWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of Key Management Service (KMS) keys.
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
     * @summary Queries a list of Key Management Service (KMS) keys.
     *
     * @param request DescribeUserEncryptionKeyListRequest
     * @return DescribeUserEncryptionKeyListResponse
     */
    public DescribeUserEncryptionKeyListResponse describeUserEncryptionKeyList(DescribeUserEncryptionKeyListRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeUserEncryptionKeyListWithOptions(request, runtime);
    }

    /**
     * @summary Queries the information about a lock-waiting query for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the details of a lock-waiting query only for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the information about a lock-waiting query for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the details of a lock-waiting query only for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeWaitingSQLInfoRequest
     * @return DescribeWaitingSQLInfoResponse
     */
    public DescribeWaitingSQLInfoResponse describeWaitingSQLInfo(DescribeWaitingSQLInfoRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWaitingSQLInfoWithOptions(request, runtime);
    }

    /**
     * @summary Queries the lock diagnostic records of an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the lock diagnostics records only for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Queries the lock diagnostic records of an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to query the lock diagnostics records only for an AnalyticDB for PostgreSQL V6.0 instance in elastic storage mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DescribeWaitingSQLRecordsRequest
     * @return DescribeWaitingSQLRecordsResponse
     */
    public DescribeWaitingSQLRecordsResponse describeWaitingSQLRecords(DescribeWaitingSQLRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.describeWaitingSQLRecordsWithOptions(request, runtime);
    }

    /**
     * @summary Downloads the query diagnostic information of an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to download the query diagnostic information of an AnalyticDB for PostgreSQL instance. After the download is complete, you can call the [DescribeDownloadRecords](https://help.aliyun.com/document_detail/447712.html) operation to query download records and download URLs.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For more information about how to view and update the minor engine version of an instance, see [View the minor engine version](https://help.aliyun.com/document_detail/277424.html) and [Update the minor engine version](https://help.aliyun.com/document_detail/139271.html).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Downloads the query diagnostic information of an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to download the query diagnostic information of an AnalyticDB for PostgreSQL instance. After the download is complete, you can call the [DescribeDownloadRecords](https://help.aliyun.com/document_detail/447712.html) operation to query download records and download URLs.
     * This operation is available only for instances of V6.3.10.1 or later in elastic storage mode. For more information about how to view and update the minor engine version of an instance, see [View the minor engine version](https://help.aliyun.com/document_detail/277424.html) and [Update the minor engine version](https://help.aliyun.com/document_detail/139271.html).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request DownloadDiagnosisRecordsRequest
     * @return DownloadDiagnosisRecordsResponse
     */
    public DownloadDiagnosisRecordsResponse downloadDiagnosisRecords(DownloadDiagnosisRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadDiagnosisRecordsWithOptions(request, runtime);
    }

    /**
     * @summary Download the slow query logs of an AnalyticDB for PostgreSQL instance.
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
     * @summary Download the slow query logs of an AnalyticDB for PostgreSQL instance.
     *
     * @param request DownloadSQLLogsRecordsRequest
     * @return DownloadSQLLogsRecordsResponse
     */
    public DownloadSQLLogsRecordsResponse downloadSQLLogsRecords(DownloadSQLLogsRecordsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.downloadSQLLogsRecordsWithOptions(request, runtime);
    }

    /**
     * @summary 查询上传文档任务的状态
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
     * @summary 查询上传文档任务的状态
     *
     * @param request GetUploadDocumentJobRequest
     * @return GetUploadDocumentJobResponse
     */
    public GetUploadDocumentJobResponse getUploadDocumentJob(GetUploadDocumentJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUploadDocumentJobWithOptions(request, runtime);
    }

    /**
     * @summary 查询上传向量任务结果
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
     * @summary 查询上传向量任务结果
     *
     * @param request GetUpsertCollectionDataJobRequest
     * @return GetUpsertCollectionDataJobResponse
     */
    public GetUpsertCollectionDataJobResponse getUpsertCollectionDataJob(GetUpsertCollectionDataJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.getUpsertCollectionDataJobWithOptions(request, runtime);
    }

    /**
     * @summary Grants vector collection permissions to a namespace.
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
     * @summary Grants vector collection permissions to a namespace.
     *
     * @param request GrantCollectionRequest
     * @return GrantCollectionResponse
     */
    public GrantCollectionResponse grantCollection(GrantCollectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.grantCollectionWithOptions(request, runtime);
    }

    /**
     * @summary 处理指定的查询SQL
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
     * @summary 处理指定的查询SQL
     *
     * @param request HandleActiveSQLRecordRequest
     * @return HandleActiveSQLRecordResponse
     */
    public HandleActiveSQLRecordResponse handleActiveSQLRecord(HandleActiveSQLRecordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.handleActiveSQLRecordWithOptions(request, runtime);
    }

    /**
     * @summary Initializes vector databases.
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
     * @summary Initializes vector databases.
     *
     * @param request InitVectorDatabaseRequest
     * @return InitVectorDatabaseResponse
     */
    public InitVectorDatabaseResponse initVectorDatabase(InitVectorDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.initVectorDatabaseWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of vector collections.
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
     * @summary Queries a list of vector collections.
     *
     * @param request ListCollectionsRequest
     * @return ListCollectionsResponse
     */
    public ListCollectionsResponse listCollections(ListCollectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listCollectionsWithOptions(request, runtime);
    }

    /**
     * @summary 获取知识库列表
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
     * @summary 获取知识库列表
     *
     * @param request ListDocumentCollectionsRequest
     * @return ListDocumentCollectionsResponse
     */
    public ListDocumentCollectionsResponse listDocumentCollections(ListDocumentCollectionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDocumentCollectionsWithOptions(request, runtime);
    }

    /**
     * @summary 查询文档列表
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
     * @summary 查询文档列表
     *
     * @param request ListDocumentsRequest
     * @return ListDocumentsResponse
     */
    public ListDocumentsResponse listDocuments(ListDocumentsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listDocumentsWithOptions(request, runtime);
    }

    /**
     * @summary 获取外部数据服务列表
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
     * @summary 获取外部数据服务列表
     *
     * @param request ListExternalDataServicesRequest
     * @return ListExternalDataServicesResponse
     */
    public ListExternalDataServicesResponse listExternalDataServices(ListExternalDataServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExternalDataServicesWithOptions(request, runtime);
    }

    /**
     * @summary 获取实例外表配置列表
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
     * @summary 获取实例外表配置列表
     *
     * @param request ListExternalDataSourcesRequest
     * @return ListExternalDataSourcesResponse
     */
    public ListExternalDataSourcesResponse listExternalDataSources(ListExternalDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listExternalDataSourcesWithOptions(request, runtime);
    }

    /**
     * @summary 获取实例插件列表
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
     * @summary 获取实例插件列表
     *
     * @param request ListInstanceExtensionsRequest
     * @return ListInstanceExtensionsResponse
     */
    public ListInstanceExtensionsResponse listInstanceExtensions(ListInstanceExtensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listInstanceExtensionsWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of namespaces.
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
     * @summary Queries a list of namespaces.
     *
     * @param request ListNamespacesRequest
     * @return ListNamespacesResponse
     */
    public ListNamespacesResponse listNamespaces(ListNamespacesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listNamespacesWithOptions(request, runtime);
    }

    /**
     * @summary 创建外部数据源配置
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
     * @summary 创建外部数据源配置
     *
     * @param request ListStreamingDataServicesRequest
     * @return ListStreamingDataServicesResponse
     */
    public ListStreamingDataServicesResponse listStreamingDataServices(ListStreamingDataServicesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStreamingDataServicesWithOptions(request, runtime);
    }

    /**
     * @summary 获取实例外表配置列表
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
     * @summary 获取实例外表配置列表
     *
     * @param request ListStreamingDataSourcesRequest
     * @return ListStreamingDataSourcesResponse
     */
    public ListStreamingDataSourcesResponse listStreamingDataSources(ListStreamingDataSourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStreamingDataSourcesWithOptions(request, runtime);
    }

    /**
     * @summary 删除外部数据源配置
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
     * @summary 删除外部数据源配置
     *
     * @param request ListStreamingJobsRequest
     * @return ListStreamingJobsResponse
     */
    public ListStreamingJobsResponse listStreamingJobs(ListStreamingJobsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listStreamingJobsWithOptions(request, runtime);
    }

    /**
     * @summary Queries a list of tags that are added to AnalyticDB for PostgreSQL instances.
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
     * @summary Queries a list of tags that are added to AnalyticDB for PostgreSQL instances.
     *
     * @param request ListTagResourcesRequest
     * @return ListTagResourcesResponse
     */
    public ListTagResourcesResponse listTagResources(ListTagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.listTagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the description of a database account for an AnalyticDB for PostgreSQL instance.
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
     * @summary Modifies the description of a database account for an AnalyticDB for PostgreSQL instance.
     *
     * @param request ModifyAccountDescriptionRequest
     * @return ModifyAccountDescriptionResponse
     */
    public ModifyAccountDescriptionResponse modifyAccountDescription(ModifyAccountDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyAccountDescriptionWithOptions(request, runtime);
    }

    /**
     * @summary Configures the backup policy of an AnalyticDB for PostgreSQL instance.
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
     * @summary Configures the backup policy of an AnalyticDB for PostgreSQL instance.
     *
     * @param request ModifyBackupPolicyRequest
     * @return ModifyBackupPolicyResponse
     */
    public ModifyBackupPolicyResponse modifyBackupPolicy(ModifyBackupPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyBackupPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Changes the threshold of computing resources and the wait period of idle resources for an AnalyticDB for PostgreSQL instance in Serverless automatic scheduling mode.
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
     * @summary Changes the threshold of computing resources and the wait period of idle resources for an AnalyticDB for PostgreSQL instance in Serverless automatic scheduling mode.
     *
     * @param request ModifyDBInstanceConfigRequest
     * @return ModifyDBInstanceConfigResponse
     */
    public ModifyDBInstanceConfigResponse modifyDBInstanceConfig(ModifyDBInstanceConfigRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceConfigWithOptions(request, runtime);
    }

    /**
     * @summary Changes the endpoint of an AnalyticDB for PostgreSQL instance.
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
     * @summary Changes the endpoint of an AnalyticDB for PostgreSQL instance.
     *
     * @param request ModifyDBInstanceConnectionStringRequest
     * @return ModifyDBInstanceConnectionStringResponse
     */
    public ModifyDBInstanceConnectionStringResponse modifyDBInstanceConnectionString(ModifyDBInstanceConnectionStringRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceConnectionStringWithOptions(request, runtime);
    }

    /**
     * @summary Changes the description of an AnalyticDB for PostgreSQL instance.
     *
     * @description To make it easy to identify AnalyticDB for PostgreSQL instances, you can call this operation to modify the description of instances.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Changes the description of an AnalyticDB for PostgreSQL instance.
     *
     * @description To make it easy to identify AnalyticDB for PostgreSQL instances, you can call this operation to modify the description of instances.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request ModifyDBInstanceDescriptionRequest
     * @return ModifyDBInstanceDescriptionResponse
     */
    public ModifyDBInstanceDescriptionResponse modifyDBInstanceDescription(ModifyDBInstanceDescriptionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceDescriptionWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the maintenance window of an AnalyticDB for PostgreSQL instance.
     *
     * @description The system maintains AnalyticDB for PostgreSQL instances during the maintenance window that you specify. We recommend that you set the maintenance window to off-peak hours to minimize the impact on your business.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Modifies the maintenance window of an AnalyticDB for PostgreSQL instance.
     *
     * @description The system maintains AnalyticDB for PostgreSQL instances during the maintenance window that you specify. We recommend that you set the maintenance window to off-peak hours to minimize the impact on your business.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request ModifyDBInstanceMaintainTimeRequest
     * @return ModifyDBInstanceMaintainTimeResponse
     */
    public ModifyDBInstanceMaintainTimeResponse modifyDBInstanceMaintainTime(ModifyDBInstanceMaintainTimeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceMaintainTimeWithOptions(request, runtime);
    }

    /**
     * @summary Moves an AnalyticDB for PostgreSQL instance to a resource group.
     *
     * @description Resource Management allows you to build an organizational structure for resources based on your business requirements. You can use resource directories, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see [What is Resource Management?](https://help.aliyun.com/document_detail/94475.html)
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
     * @summary Moves an AnalyticDB for PostgreSQL instance to a resource group.
     *
     * @description Resource Management allows you to build an organizational structure for resources based on your business requirements. You can use resource directories, folders, accounts, and resource groups to hierarchically organize and manage resources. For more information, see [What is Resource Management?](https://help.aliyun.com/document_detail/94475.html)
     *
     * @param request ModifyDBInstanceResourceGroupRequest
     * @return ModifyDBInstanceResourceGroupResponse
     */
    public ModifyDBInstanceResourceGroupResponse modifyDBInstanceResourceGroup(ModifyDBInstanceResourceGroupRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceResourceGroupWithOptions(request, runtime);
    }

    /**
     * @summary Enables, disables, or updates SSL encryption for an AnalyticDB for PostgreSQL instance.
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
     * @summary Enables, disables, or updates SSL encryption for an AnalyticDB for PostgreSQL instance.
     *
     * @param request ModifyDBInstanceSSLRequest
     * @return ModifyDBInstanceSSLResponse
     */
    public ModifyDBInstanceSSLResponse modifyDBInstanceSSL(ModifyDBInstanceSSLRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyDBInstanceSSLWithOptions(request, runtime);
    }

    /**
     * @summary 修改外部数据服务
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
     * @summary 修改外部数据服务
     *
     * @param request ModifyExternalDataServiceRequest
     * @return ModifyExternalDataServiceResponse
     */
    public ModifyExternalDataServiceResponse modifyExternalDataService(ModifyExternalDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyExternalDataServiceWithOptions(request, runtime);
    }

    /**
     * @summary 修改hadoop数据源配置
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
     * @summary 修改hadoop数据源配置
     *
     * @param request ModifyHadoopDataSourceRequest
     * @return ModifyHadoopDataSourceResponse
     */
    public ModifyHadoopDataSourceResponse modifyHadoopDataSource(ModifyHadoopDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyHadoopDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary 修改jdbc数据源配置
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
     * @summary 修改jdbc数据源配置
     *
     * @param request ModifyJDBCDataSourceRequest
     * @return ModifyJDBCDataSourceResponse
     */
    public ModifyJDBCDataSourceResponse modifyJDBCDataSource(ModifyJDBCDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyJDBCDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary 修改master规格
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
     * @summary 修改master规格
     *
     * @param request ModifyMasterSpecRequest
     * @return ModifyMasterSpecResponse
     */
    public ModifyMasterSpecResponse modifyMasterSpec(ModifyMasterSpecRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyMasterSpecWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the configuration parameters of an AnalyticDB for PostgreSQL instance.
     *
     * @description This operation can be called to modify parameters of an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
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
     * @summary Modifies the configuration parameters of an AnalyticDB for PostgreSQL instance.
     *
     * @description This operation can be called to modify parameters of an AnalyticDB for PostgreSQL instance in elastic storage mode or Serverless mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
     *
     * @param request ModifyParametersRequest
     * @return ModifyParametersResponse
     */
    public ModifyParametersResponse modifyParameters(ModifyParametersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyParametersWithOptions(request, runtime);
    }

    /**
     * @summary Enables or disables the SQL Explorer feature for an AnalyticDB for PostgreSQL instance.
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
     * @summary Enables or disables the SQL Explorer feature for an AnalyticDB for PostgreSQL instance.
     *
     * @param request ModifySQLCollectorPolicyRequest
     * @return ModifySQLCollectorPolicyResponse
     */
    public ModifySQLCollectorPolicyResponse modifySQLCollectorPolicy(ModifySQLCollectorPolicyRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySQLCollectorPolicyWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the IP address whitelist of an AnalyticDB for PostgreSQL instance.
     *
     * @description To ensure the security and stability of AnalyticDB for PostgreSQL instances, the system denies all external IP addresses to access AnalyticDB for PostgreSQL instances by default. Before you can use an AnalyticDB for PostgreSQL instance, you must add the IP address or CIDR block of your client to the IP address whitelist of the instance.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Modifies the IP address whitelist of an AnalyticDB for PostgreSQL instance.
     *
     * @description To ensure the security and stability of AnalyticDB for PostgreSQL instances, the system denies all external IP addresses to access AnalyticDB for PostgreSQL instances by default. Before you can use an AnalyticDB for PostgreSQL instance, you must add the IP address or CIDR block of your client to the IP address whitelist of the instance.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request ModifySecurityIpsRequest
     * @return ModifySecurityIpsResponse
     */
    public ModifySecurityIpsResponse modifySecurityIps(ModifySecurityIpsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifySecurityIpsWithOptions(request, runtime);
    }

    /**
     * @summary 创建外部数据源配置
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
     * @summary 创建外部数据源配置
     *
     * @param request ModifyStreamingDataServiceRequest
     * @return ModifyStreamingDataServiceResponse
     */
    public ModifyStreamingDataServiceResponse modifyStreamingDataService(ModifyStreamingDataServiceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyStreamingDataServiceWithOptions(request, runtime);
    }

    /**
     * @summary 修改外部数据源配置
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
     * @summary 修改外部数据源配置
     *
     * @param request ModifyStreamingDataSourceRequest
     * @return ModifyStreamingDataSourceResponse
     */
    public ModifyStreamingDataSourceResponse modifyStreamingDataSource(ModifyStreamingDataSourceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyStreamingDataSourceWithOptions(request, runtime);
    }

    /**
     * @summary 创建外部数据源配置
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
     * @summary 创建外部数据源配置
     *
     * @param request ModifyStreamingJobRequest
     * @return ModifyStreamingJobResponse
     */
    public ModifyStreamingJobResponse modifyStreamingJob(ModifyStreamingJobRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyStreamingJobWithOptions(request, runtime);
    }

    /**
     * @summary Modifies the vector engine optimization configuration of an AnalyticDB for PostgreSQL instance.
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
     * @summary Modifies the vector engine optimization configuration of an AnalyticDB for PostgreSQL instance.
     *
     * @param request ModifyVectorConfigurationRequest
     * @return ModifyVectorConfigurationResponse
     */
    public ModifyVectorConfigurationResponse modifyVectorConfiguration(ModifyVectorConfigurationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.modifyVectorConfigurationWithOptions(request, runtime);
    }

    /**
     * @summary Pauses an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to pause an AnalyticDB for PostgreSQL instance that is in the **Running** state.
     * This operation is available only for AnalyticDB for PostgreSQL instances in Serverless mode that run V1.0.2.1 or later. For more information about how to view and update the minor engine version of an instance, see [View the minor engine version](https://help.aliyun.com/document_detail/277424.html) and [Update the minor engine version](https://help.aliyun.com/document_detail/139271.html).
     * >  Before you call this operation, make sure that you are familiar with the billing methods and pricing of AnalyticDB for PostgreSQL instances. For more information, see [Billing methods](https://help.aliyun.com/document_detail/35406.html) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Pauses an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to pause an AnalyticDB for PostgreSQL instance that is in the **Running** state.
     * This operation is available only for AnalyticDB for PostgreSQL instances in Serverless mode that run V1.0.2.1 or later. For more information about how to view and update the minor engine version of an instance, see [View the minor engine version](https://help.aliyun.com/document_detail/277424.html) and [Update the minor engine version](https://help.aliyun.com/document_detail/139271.html).
     * >  Before you call this operation, make sure that you are familiar with the billing methods and pricing of AnalyticDB for PostgreSQL instances. For more information, see [Billing methods](https://help.aliyun.com/document_detail/35406.html) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request PauseInstanceRequest
     * @return PauseInstanceResponse
     */
    public PauseInstanceResponse pauseInstance(PauseInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.pauseInstanceWithOptions(request, runtime);
    }

    /**
     * @summary 查询向量数据
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
     * @summary 查询向量数据
     *
     * @param request QueryCollectionDataRequest
     * @return QueryCollectionDataResponse
     */
    public QueryCollectionDataResponse queryCollectionData(QueryCollectionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.queryCollectionDataWithOptions(request, runtime);
    }

    /**
     * @summary 查询
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
     * @summary 查询
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
        if (com.aliyun.teautil.Common.isUnset(openPlatformEndpoint)) {
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
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
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
     * @summary Rebalances an AnalyticDB for PostgreSQL instance.
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
     * @summary Rebalances an AnalyticDB for PostgreSQL instance.
     *
     * @param request RebalanceDBInstanceRequest
     * @return RebalanceDBInstanceResponse
     */
    public RebalanceDBInstanceResponse rebalanceDBInstance(RebalanceDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.rebalanceDBInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Releases the public endpoint of an AnalyticDB for PostgreSQL instance.
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
     * @summary Releases the public endpoint of an AnalyticDB for PostgreSQL instance.
     *
     * @param request ReleaseInstancePublicConnectionRequest
     * @return ReleaseInstancePublicConnectionResponse
     */
    public ReleaseInstancePublicConnectionResponse releaseInstancePublicConnection(ReleaseInstancePublicConnectionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.releaseInstancePublicConnectionWithOptions(request, runtime);
    }

    /**
     * @summary Resets the password of a database account for an AnalyticDB for PostgreSQL instance.
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
     * @summary Resets the password of a database account for an AnalyticDB for PostgreSQL instance.
     *
     * @param request ResetAccountPasswordRequest
     * @return ResetAccountPasswordResponse
     */
    public ResetAccountPasswordResponse resetAccountPassword(ResetAccountPasswordRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetAccountPasswordWithOptions(request, runtime);
    }

    /**
     * @summary 重置IMV统计信息
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
     * @summary 重置IMV统计信息
     *
     * @param request ResetIMVMonitorDataRequest
     * @return ResetIMVMonitorDataResponse
     */
    public ResetIMVMonitorDataResponse resetIMVMonitorData(ResetIMVMonitorDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resetIMVMonitorDataWithOptions(request, runtime);
    }

    /**
     * @summary Restarts an AnalyticDB for PostgreSQL instance.
     *
     * @description A restart takes about 3 to 30 minutes. During the restart, services are unavailable. We recommend that you restart the instance during off-peak hours. After the instance is restarted and enters the running state, you can access the instance.
     * ## Limit
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
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
     * @summary Restarts an AnalyticDB for PostgreSQL instance.
     *
     * @description A restart takes about 3 to 30 minutes. During the restart, services are unavailable. We recommend that you restart the instance during off-peak hours. After the instance is restarted and enters the running state, you can access the instance.
     * ## Limit
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered and may affect your business. We recommend that you take note of the limit when you call this operation.
     *
     * @param request RestartDBInstanceRequest
     * @return RestartDBInstanceResponse
     */
    public RestartDBInstanceResponse restartDBInstance(RestartDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.restartDBInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Resumes an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to resume an AnalyticDB for PostgreSQL instance that is in the **Paused** state.
     * This operation is available only for AnalyticDB for PostgreSQL instances in Serverless mode that run V1.0.2.1 or later. For more information about how to view and update the minor engine version of an instance, see [View the minor engine version](https://help.aliyun.com/document_detail/277424.html) and [Update the minor engine version](https://help.aliyun.com/document_detail/139271.html).
     * >  Before you call this operation, make sure that you are familiar with the billing methods and pricing of AnalyticDB for PostgreSQL instances. For more information, see [Billing methods](https://help.aliyun.com/document_detail/35406.html) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Resumes an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to resume an AnalyticDB for PostgreSQL instance that is in the **Paused** state.
     * This operation is available only for AnalyticDB for PostgreSQL instances in Serverless mode that run V1.0.2.1 or later. For more information about how to view and update the minor engine version of an instance, see [View the minor engine version](https://help.aliyun.com/document_detail/277424.html) and [Update the minor engine version](https://help.aliyun.com/document_detail/139271.html).
     * >  Before you call this operation, make sure that you are familiar with the billing methods and pricing of AnalyticDB for PostgreSQL instances. For more information, see [Billing methods](https://help.aliyun.com/document_detail/35406.html) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request ResumeInstanceRequest
     * @return ResumeInstanceResponse
     */
    public ResumeInstanceResponse resumeInstance(ResumeInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.resumeInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Enables or disables a plan for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to enable or disable a specified plan. The plan management feature is supported only for AnalyticDB for PostgreSQL instances in Serverless mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Enables or disables a plan for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to enable or disable a specified plan. The plan management feature is supported only for AnalyticDB for PostgreSQL instances in Serverless mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request SetDBInstancePlanStatusRequest
     * @return SetDBInstancePlanStatusResponse
     */
    public SetDBInstancePlanStatusResponse setDBInstancePlanStatus(SetDBInstancePlanStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDBInstancePlanStatusWithOptions(request, runtime);
    }

    /**
     * @summary Enables or disables data sharing for an AnalyticDB for PostgreSQL instance.
     *
     * @description This operation is called to enable or disable data sharing for an AnalyticDB for PostgreSQL instance in Serverless mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.
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
     * @summary Enables or disables data sharing for an AnalyticDB for PostgreSQL instance.
     *
     * @description This operation is called to enable or disable data sharing for an AnalyticDB for PostgreSQL instance in Serverless mode.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. Requests that exceed this limit are dropped and you will experience service interruptions. We recommend that you take note of this limit when you call this operation.
     *
     * @param request SetDataShareInstanceRequest
     * @return SetDataShareInstanceResponse
     */
    public SetDataShareInstanceResponse setDataShareInstance(SetDataShareInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.setDataShareInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Switches the internal or public endpoint for an AnalyticDB for PostgreSQL instance.
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
     * @summary Switches the internal or public endpoint for an AnalyticDB for PostgreSQL instance.
     *
     * @param request SwitchDBInstanceNetTypeRequest
     * @return SwitchDBInstanceNetTypeResponse
     */
    public SwitchDBInstanceNetTypeResponse switchDBInstanceNetType(SwitchDBInstanceNetTypeRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.switchDBInstanceNetTypeWithOptions(request, runtime);
    }

    /**
     * @summary Creates and adds tags to AnalyticDB for PostgreSQL instances.
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
     * @summary Creates and adds tags to AnalyticDB for PostgreSQL instances.
     *
     * @param request TagResourcesRequest
     * @return TagResourcesResponse
     */
    public TagResourcesResponse tagResources(TagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.tagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary Releases a sample dataset from an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to release a sample dataset from an AnalyticDB for PostgreSQL instance. You must have already loaded the sample dataset.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Releases a sample dataset from an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to release a sample dataset from an AnalyticDB for PostgreSQL instance. You must have already loaded the sample dataset.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request UnloadSampleDataRequest
     * @return UnloadSampleDataResponse
     */
    public UnloadSampleDataResponse unloadSampleData(UnloadSampleDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.unloadSampleDataWithOptions(request, runtime);
    }

    /**
     * @summary Removes tags from AnalyticDB for PostgreSQL instances. If the tags that you remove are not added to other instances, the tags are automatically deleted.
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
     * @summary Removes tags from AnalyticDB for PostgreSQL instances. If the tags that you remove are not added to other instances, the tags are automatically deleted.
     *
     * @param request UntagResourcesRequest
     * @return UntagResourcesResponse
     */
    public UntagResourcesResponse untagResources(UntagResourcesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.untagResourcesWithOptions(request, runtime);
    }

    /**
     * @summary 更新Collection Data的Metadata数据
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
     * @summary 更新Collection Data的Metadata数据
     *
     * @param request UpdateCollectionDataMetadataRequest
     * @return UpdateCollectionDataMetadataResponse
     */
    public UpdateCollectionDataMetadataResponse updateCollectionDataMetadata(UpdateCollectionDataMetadataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateCollectionDataMetadataWithOptions(request, runtime);
    }

    /**
     * @summary Modifies a plan for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to modify a plan for an AnalyticDB for PostgreSQL instance in Serverless mode. For example, you can modify a plan for periodically pausing and resuming an instance or scaling an instance.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
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
     * @summary Modifies a plan for an AnalyticDB for PostgreSQL instance.
     *
     * @description You can call this operation to modify a plan for an AnalyticDB for PostgreSQL instance in Serverless mode. For example, you can modify a plan for periodically pausing and resuming an instance or scaling an instance.
     * ## Limits
     * You can call this operation up to 1,000 times per second per account. If the number of the calls per second exceeds the limit, throttling is triggered. As a result, your business may be affected. We recommend that you take note of the limit when you call this operation.
     *
     * @param request UpdateDBInstancePlanRequest
     * @return UpdateDBInstancePlanResponse
     */
    public UpdateDBInstancePlanResponse updateDBInstancePlan(UpdateDBInstancePlanRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.updateDBInstancePlanWithOptions(request, runtime);
    }

    /**
     * @summary Changes the configurations of an AnalyticDB for PostgreSQL instance.
     *
     * @description This operation is not available for instances in reserved storage mode.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see [Billing methods](https://help.aliyun.com/document_detail/35406.html) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
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
     * @summary Changes the configurations of an AnalyticDB for PostgreSQL instance.
     *
     * @description This operation is not available for instances in reserved storage mode.
     * Before you call this operation, make sure that you are familiar with the billing of AnalyticDB for PostgreSQL. For more information, see [Billing methods](https://help.aliyun.com/document_detail/35406.html) and [AnalyticDB for PostgreSQL pricing](https://www.alibabacloud.com/zh/product/hybriddb-postgresql/pricing).
     *
     * @param request UpgradeDBInstanceRequest
     * @return UpgradeDBInstanceResponse
     */
    public UpgradeDBInstanceResponse upgradeDBInstance(UpgradeDBInstanceRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeDBInstanceWithOptions(request, runtime);
    }

    /**
     * @summary Upgrades the minor version of an AnalyticDB for PostgreSQL instance.
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
     * @summary Upgrades the minor version of an AnalyticDB for PostgreSQL instance.
     *
     * @param request UpgradeDBVersionRequest
     * @return UpgradeDBVersionResponse
     */
    public UpgradeDBVersionResponse upgradeDBVersion(UpgradeDBVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeDBVersionWithOptions(request, runtime);
    }

    /**
     * @summary 升级插件
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
     * @summary 升级插件
     *
     * @param request UpgradeExtensionsRequest
     * @return UpgradeExtensionsResponse
     */
    public UpgradeExtensionsResponse upgradeExtensions(UpgradeExtensionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upgradeExtensionsWithOptions(request, runtime);
    }

    /**
     * @summary 异步上传文档
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
     * @summary 异步上传文档
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
        if (com.aliyun.teautil.Common.isUnset(openPlatformEndpoint)) {
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
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
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
     * @summary 上传切分后的文本
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
     * @summary 上传切分后的文本
     *
     * @param request UpsertChunksRequest
     * @return UpsertChunksResponse
     */
    public UpsertChunksResponse upsertChunks(UpsertChunksRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upsertChunksWithOptions(request, runtime);
    }

    /**
     * @summary Uploads vector data to a vector collection.
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
     * @summary Uploads vector data to a vector collection.
     *
     * @param request UpsertCollectionDataRequest
     * @return UpsertCollectionDataResponse
     */
    public UpsertCollectionDataResponse upsertCollectionData(UpsertCollectionDataRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        return this.upsertCollectionDataWithOptions(request, runtime);
    }

    /**
     * @summary 上传向量数据异步接口
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
     * @summary 上传向量数据异步接口
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
        if (com.aliyun.teautil.Common.isUnset(openPlatformEndpoint)) {
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
            new TeaPair("accessKeySecret", accessKeySecret),
            new TeaPair("type", "access_key"),
            new TeaPair("protocol", _protocol),
            new TeaPair("regionId", _regionId)
        ));
        com.aliyun.oss.Client ossClient = null;
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
