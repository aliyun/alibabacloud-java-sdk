// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710;

import com.aliyun.tea.*;
import com.aliyun.datalake20200710.models.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(com.aliyun.teaopenapi.models.Config config) throws Exception {
        super(config);
        this._endpointRule = "regional";
        this._endpointMap = TeaConverter.buildMap(
            new TeaPair("ap-northeast-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("ap-northeast-2-pop", "datalake-daily.aliyuncs.com"),
            new TeaPair("ap-south-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("ap-southeast-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("ap-southeast-2", "datalake-daily.aliyuncs.com"),
            new TeaPair("ap-southeast-3", "datalake-daily.aliyuncs.com"),
            new TeaPair("ap-southeast-5", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-beijing", "dlf.cn-beijing.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-beijing-finance-pop", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-beijing-gov-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-beijing-nu16-b01", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-chengdu", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-edge-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-fujian", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-haidian-cm12-c01", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-hangzhou", "dlf.cn-hangzhou.aliyuncs.com"),
            new TeaPair("cn-hangzhou-bj-b01", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-hangzhou-finance", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-prod-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-2", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-hangzhou-internal-test-3", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-hangzhou-test-306", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-hongkong", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-hongkong-finance-pop", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-huhehaote", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-huhehaote-nebula-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-north-2-gov-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-qingdao", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-qingdao-nebula", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-shanghai", "dlf.cn-shanghai.aliyuncs.com"),
            new TeaPair("cn-shanghai-et15-b01", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-shanghai-et2-b01", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-shanghai-finance-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-shanghai-inner", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-shanghai-internal-test-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-shenzhen", "dlf.cn-shenzhen.aliyuncs.com"),
            new TeaPair("cn-shenzhen-finance-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-shenzhen-inner", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-shenzhen-st4-d01", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-shenzhen-su18-b01", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-wuhan", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-wulanchabu", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-yushanfang", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-zhangbei", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-zhangbei-na61-b01", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-zhangjiakou-na62-a01", "datalake-daily.aliyuncs.com"),
            new TeaPair("cn-zhengzhou-nebula-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("eu-central-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("eu-west-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("eu-west-1-oxs", "datalake-daily.aliyuncs.com"),
            new TeaPair("me-east-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("rus-west-1-pop", "datalake-daily.aliyuncs.com"),
            new TeaPair("us-east-1", "datalake-daily.aliyuncs.com"),
            new TeaPair("us-west-1", "datalake-daily.aliyuncs.com")
        );
        this.checkConfig(config);
        this._endpoint = this.getEndpoint("datalake", _regionId, _endpointRule, _network, _suffix, _endpointMap, _endpoint);
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
     * <b>summary</b> : 
     * <p>abort lock context with the lockid</p>
     * 
     * @param request AbortLockRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return AbortLockResponse
     */
    public AbortLockResponse abortLockWithOptions(AbortLockRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lockId)) {
            query.put("LockId", request.lockId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "AbortLock"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/locks/abort"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new AbortLockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>abort lock context with the lockid</p>
     * 
     * @param request AbortLockRequest
     * @return AbortLockResponse
     */
    public AbortLockResponse abortLock(AbortLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortLockWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建分区</p>
     * 
     * @param request BatchCreatePartitionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCreatePartitionsResponse
     */
    public BatchCreatePartitionsResponse batchCreatePartitionsWithOptions(BatchCreatePartitionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ifNotExists)) {
            body.put("IfNotExists", request.ifNotExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needResult)) {
            body.put("NeedResult", request.needResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionInputs)) {
            body.put("PartitionInputs", request.partitionInputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreatePartitions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/batchcreate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreatePartitionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建分区</p>
     * 
     * @param request BatchCreatePartitionsRequest
     * @return BatchCreatePartitionsResponse
     */
    public BatchCreatePartitionsResponse batchCreatePartitions(BatchCreatePartitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchCreatePartitionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建表</p>
     * 
     * @param request BatchCreateTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchCreateTablesResponse
     */
    public BatchCreateTablesResponse batchCreateTablesWithOptions(BatchCreateTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ifNotExists)) {
            body.put("IfNotExists", request.ifNotExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableInputs)) {
            body.put("TableInputs", request.tableInputs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchCreateTables"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/batchcreate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchCreateTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量创建表</p>
     * 
     * @param request BatchCreateTablesRequest
     * @return BatchCreateTablesResponse
     */
    public BatchCreateTablesResponse batchCreateTables(BatchCreateTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchCreateTablesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>batch delete partitions</p>
     * 
     * @param request BatchDeletePartitionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeletePartitionsResponse
     */
    public BatchDeletePartitionsResponse batchDeletePartitionsWithOptions(BatchDeletePartitionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ifExists)) {
            body.put("IfExists", request.ifExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionValueList)) {
            body.put("PartitionValueList", request.partitionValueList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeletePartitions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/batchdelete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeletePartitionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>batch delete partitions</p>
     * 
     * @param request BatchDeletePartitionsRequest
     * @return BatchDeletePartitionsResponse
     */
    public BatchDeletePartitionsResponse batchDeletePartitions(BatchDeletePartitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchDeletePartitionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>BatchDeleteTableVersions</p>
     * 
     * @param request BatchDeleteTableVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteTableVersionsResponse
     */
    public BatchDeleteTableVersionsResponse batchDeleteTableVersionsWithOptions(BatchDeleteTableVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionIds)) {
            body.put("VersionIds", request.versionIds);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteTableVersions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/versions/batchdelete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteTableVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>BatchDeleteTableVersions</p>
     * 
     * @param request BatchDeleteTableVersionsRequest
     * @return BatchDeleteTableVersionsResponse
     */
    public BatchDeleteTableVersionsResponse batchDeleteTableVersions(BatchDeleteTableVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchDeleteTableVersionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>BatchDeleteTables</p>
     * 
     * @param request BatchDeleteTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchDeleteTablesResponse
     */
    public BatchDeleteTablesResponse batchDeleteTablesWithOptions(BatchDeleteTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ifExists)) {
            body.put("IfExists", request.ifExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNames)) {
            body.put("TableNames", request.tableNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchDeleteTables"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/batchdelete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchDeleteTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>BatchDeleteTables</p>
     * 
     * @param request BatchDeleteTablesRequest
     * @return BatchDeleteTablesResponse
     */
    public BatchDeleteTablesResponse batchDeleteTables(BatchDeleteTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchDeleteTablesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch Get Partition Column Statistics</p>
     * 
     * @param request BatchGetPartitionColumnStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetPartitionColumnStatisticsResponse
     */
    public BatchGetPartitionColumnStatisticsResponse batchGetPartitionColumnStatisticsWithOptions(BatchGetPartitionColumnStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnNames)) {
            body.put("ColumnNames", request.columnNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNames)) {
            body.put("PartitionNames", request.partitionNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetPartitionColumnStatistics"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/columnstatistics/batchget"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetPartitionColumnStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch Get Partition Column Statistics</p>
     * 
     * @param request BatchGetPartitionColumnStatisticsRequest
     * @return BatchGetPartitionColumnStatisticsResponse
     */
    public BatchGetPartitionColumnStatisticsResponse batchGetPartitionColumnStatistics(BatchGetPartitionColumnStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGetPartitionColumnStatisticsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>batch get partitions</p>
     * 
     * @param request BatchGetPartitionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetPartitionsResponse
     */
    public BatchGetPartitionsResponse batchGetPartitionsWithOptions(BatchGetPartitionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isShareSd)) {
            body.put("IsShareSd", request.isShareSd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionValueList)) {
            body.put("PartitionValueList", request.partitionValueList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetPartitions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/batchget"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetPartitionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>batch get partitions</p>
     * 
     * @param request BatchGetPartitionsRequest
     * @return BatchGetPartitionsResponse
     */
    public BatchGetPartitionsResponse batchGetPartitions(BatchGetPartitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGetPartitionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>batch get tables</p>
     * 
     * @param request BatchGetTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGetTablesResponse
     */
    public BatchGetTablesResponse batchGetTablesWithOptions(BatchGetTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNames)) {
            body.put("TableNames", request.tableNames);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGetTables"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/batchget"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGetTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>batch get tables</p>
     * 
     * @param request BatchGetTablesRequest
     * @return BatchGetTablesResponse
     */
    public BatchGetTablesResponse batchGetTables(BatchGetTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGetTablesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量授权</p>
     * 
     * @param request BatchGrantPermissionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchGrantPermissionsResponse
     */
    public BatchGrantPermissionsResponse batchGrantPermissionsWithOptions(BatchGrantPermissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantRevokeEntries)) {
            body.put("GrantRevokeEntries", request.grantRevokeEntries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchGrantPermissions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/permissions/batchgrant"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchGrantPermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量授权</p>
     * 
     * @param request BatchGrantPermissionsRequest
     * @return BatchGrantPermissionsResponse
     */
    public BatchGrantPermissionsResponse batchGrantPermissions(BatchGrantPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGrantPermissionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量取消授权</p>
     * 
     * @param request BatchRevokePermissionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchRevokePermissionsResponse
     */
    public BatchRevokePermissionsResponse batchRevokePermissionsWithOptions(BatchRevokePermissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.grantRevokeEntries)) {
            body.put("GrantRevokeEntries", request.grantRevokeEntries);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchRevokePermissions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/permissions/batchrevoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchRevokePermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量取消授权</p>
     * 
     * @param request BatchRevokePermissionsRequest
     * @return BatchRevokePermissionsResponse
     */
    public BatchRevokePermissionsResponse batchRevokePermissions(BatchRevokePermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchRevokePermissionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>batch update partitions</p>
     * 
     * @param request BatchUpdatePartitionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUpdatePartitionsResponse
     */
    public BatchUpdatePartitionsResponse batchUpdatePartitionsWithOptions(BatchUpdatePartitionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionInputs)) {
            body.put("PartitionInputs", request.partitionInputs);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdatePartitions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/batchupdate"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdatePartitionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>batch update partitions</p>
     * 
     * @param request BatchUpdatePartitionsRequest
     * @return BatchUpdatePartitionsResponse
     */
    public BatchUpdatePartitionsResponse batchUpdatePartitions(BatchUpdatePartitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchUpdatePartitionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新表</p>
     * 
     * @param request BatchUpdateTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return BatchUpdateTablesResponse
     */
    public BatchUpdateTablesResponse batchUpdateTablesWithOptions(BatchUpdateTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAsync)) {
            body.put("IsAsync", request.isAsync);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableInputs)) {
            body.put("TableInputs", request.tableInputs);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "BatchUpdateTables"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/batchupdate"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new BatchUpdateTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量更新表</p>
     * 
     * @param request BatchUpdateTablesRequest
     * @return BatchUpdateTablesResponse
     */
    public BatchUpdateTablesResponse batchUpdateTables(BatchUpdateTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchUpdateTablesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消查询任务</p>
     * 
     * @param request CancelQueryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CancelQueryResponse
     */
    public CancelQueryResponse cancelQueryWithOptions(CancelQueryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryId)) {
            query.put("QueryId", request.queryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CancelQuery"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/query/cancelQuery"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CancelQueryResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消查询任务</p>
     * 
     * @param request CancelQueryRequest
     * @return CancelQueryResponse
     */
    public CancelQueryResponse cancelQuery(CancelQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Check permissions</p>
     * 
     * @param request CheckPermissionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CheckPermissionsResponse
     */
    public CheckPermissionsResponse checkPermissionsWithOptions(CheckPermissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckPermissions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/permissions/check"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckPermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Check permissions</p>
     * 
     * @param request CheckPermissionsRequest
     * @return CheckPermissionsResponse
     */
    public CheckPermissionsResponse checkPermissions(CheckPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkPermissionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据湖Catalog</p>
     * 
     * @param request CreateCatalogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateCatalogResponse
     */
    public CreateCatalogResponse createCatalogWithOptions(CreateCatalogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogInput)) {
            body.put("CatalogInput", request.catalogInput);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateCatalog"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据湖Catalog</p>
     * 
     * @param request CreateCatalogRequest
     * @return CreateCatalogResponse
     */
    public CreateCatalogResponse createCatalog(CreateCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createCatalogWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>create database</p>
     * 
     * @param request CreateDatabaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabaseWithOptions(CreateDatabaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseInput)) {
            body.put("DatabaseInput", request.databaseInput);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDatabase"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>create database</p>
     * 
     * @param request CreateDatabaseRequest
     * @return CreateDatabaseResponse
     */
    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDatabaseWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create function</p>
     * 
     * @param request CreateFunctionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateFunctionResponse
     */
    public CreateFunctionResponse createFunctionWithOptions(CreateFunctionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionInput)) {
            body.put("FunctionInput", request.functionInput);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateFunction"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/functions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create function</p>
     * 
     * @param request CreateFunctionRequest
     * @return CreateFunctionResponse
     */
    public CreateFunctionResponse createFunction(CreateFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFunctionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>create lock</p>
     * 
     * @param request CreateLockRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateLockResponse
     */
    public CreateLockResponse createLockWithOptions(CreateLockRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lockObjList)) {
            body.put("LockObjList", request.lockObjList);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateLock"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/locks"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateLockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>create lock</p>
     * 
     * @param request CreateLockRequest
     * @return CreateLockResponse
     */
    public CreateLockResponse createLock(CreateLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLockWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create Partition</p>
     * 
     * @param request CreatePartitionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreatePartitionResponse
     */
    public CreatePartitionResponse createPartitionWithOptions(CreatePartitionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ifNotExists)) {
            body.put("IfNotExists", request.ifNotExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.needResult)) {
            body.put("NeedResult", request.needResult);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionInput)) {
            body.put("PartitionInput", request.partitionInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreatePartition"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreatePartitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create Partition</p>
     * 
     * @param request CreatePartitionRequest
     * @return CreatePartitionResponse
     */
    public CreatePartitionResponse createPartition(CreatePartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPartitionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据糊角色</p>
     * 
     * @param request CreateRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRoleWithOptions(CreateRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateRole"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/roles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>创建数据糊角色</p>
     * 
     * @param request CreateRoleRequest
     * @return CreateRoleResponse
     */
    public CreateRoleResponse createRole(CreateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Create tables</p>
     * 
     * @param request CreateTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return CreateTableResponse
     */
    public CreateTableResponse createTableWithOptions(CreateTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableInput)) {
            body.put("TableInput", request.tableInput);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTable"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Create tables</p>
     * 
     * @param request CreateTableRequest
     * @return CreateTableResponse
     */
    public CreateTableResponse createTable(CreateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTableWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Catalog by catalogId</p>
     * 
     * @param request DeleteCatalogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteCatalogResponse
     */
    public DeleteCatalogResponse deleteCatalogWithOptions(DeleteCatalogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAsync)) {
            query.put("IsAsync", request.isAsync);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteCatalog"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete Catalog by catalogId</p>
     * 
     * @param request DeleteCatalogRequest
     * @return DeleteCatalogResponse
     */
    public DeleteCatalogResponse deleteCatalog(DeleteCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteCatalogWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete database by catalogId and database name</p>
     * 
     * @param request DeleteDatabaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabaseWithOptions(DeleteDatabaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.async)) {
            query.put("Async", request.async);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cascade)) {
            query.put("Cascade", request.cascade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDatabase"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete database by catalogId and database name</p>
     * 
     * @param request DeleteDatabaseRequest
     * @return DeleteDatabaseResponse
     */
    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDatabaseWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Delete function</p>
     * 
     * @param request DeleteFunctionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunctionWithOptions(DeleteFunctionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("FunctionName", request.functionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteFunction"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/functions"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Delete function</p>
     * 
     * @param request DeleteFunctionRequest
     * @return DeleteFunctionResponse
     */
    public DeleteFunctionResponse deleteFunction(DeleteFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFunctionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>delete partition</p>
     * 
     * @param request DeletePartitionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePartitionResponse
     */
    public DeletePartitionResponse deletePartitionWithOptions(DeletePartitionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ifExists)) {
            body.put("IfExists", request.ifExists);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionValues)) {
            body.put("PartitionValues", request.partitionValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePartition"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/delete"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePartitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>delete partition</p>
     * 
     * @param request DeletePartitionRequest
     * @return DeletePartitionResponse
     */
    public DeletePartitionResponse deletePartition(DeletePartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePartitionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeletePartitionColumnStatistics</p>
     * 
     * @param tmpReq DeletePartitionColumnStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeletePartitionColumnStatisticsResponse
     */
    public DeletePartitionColumnStatisticsResponse deletePartitionColumnStatisticsWithOptions(DeletePartitionColumnStatisticsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeletePartitionColumnStatisticsShrinkRequest request = new DeletePartitionColumnStatisticsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columnNames)) {
            request.columnNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columnNames, "ColumnNames", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partitionNames)) {
            request.partitionNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partitionNames, "PartitionNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnNamesShrink)) {
            query.put("ColumnNames", request.columnNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNamesShrink)) {
            query.put("PartitionNames", request.partitionNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeletePartitionColumnStatistics"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/columnstatistics"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeletePartitionColumnStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeletePartitionColumnStatistics</p>
     * 
     * @param request DeletePartitionColumnStatisticsRequest
     * @return DeletePartitionColumnStatisticsResponse
     */
    public DeletePartitionColumnStatisticsResponse deletePartitionColumnStatistics(DeletePartitionColumnStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePartitionColumnStatisticsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>删除角色</p>
     * 
     * @param request DeleteRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteRoleResponse
     */
    public DeleteRoleResponse deleteRoleWithOptions(DeleteRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteRole"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/roles"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>删除角色</p>
     * 
     * @param request DeleteRoleRequest
     * @return DeleteRoleResponse
     */
    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>delete table</p>
     * 
     * @param request DeleteTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTableResponse
     */
    public DeleteTableResponse deleteTableWithOptions(DeleteTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTable"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>delete table</p>
     * 
     * @param request DeleteTableRequest
     * @return DeleteTableResponse
     */
    public DeleteTableResponse deleteTable(DeleteTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTableWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteTableColumnStatistics</p>
     * 
     * @param tmpReq DeleteTableColumnStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTableColumnStatisticsResponse
     */
    public DeleteTableColumnStatisticsResponse deleteTableColumnStatisticsWithOptions(DeleteTableColumnStatisticsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        DeleteTableColumnStatisticsShrinkRequest request = new DeleteTableColumnStatisticsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columnNames)) {
            request.columnNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columnNames, "ColumnNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnNamesShrink)) {
            query.put("ColumnNames", request.columnNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTableColumnStatistics"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/columnstatistics"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTableColumnStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DeleteTableColumnStatistics</p>
     * 
     * @param request DeleteTableColumnStatisticsRequest
     * @return DeleteTableColumnStatisticsResponse
     */
    public DeleteTableColumnStatisticsResponse deleteTableColumnStatistics(DeleteTableColumnStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTableColumnStatisticsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>delete table version</p>
     * 
     * @param request DeleteTableVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeleteTableVersionResponse
     */
    public DeleteTableVersionResponse deleteTableVersionWithOptions(DeleteTableVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteTableVersion"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/versions"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteTableVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>delete table version</p>
     * 
     * @param request DeleteTableVersionRequest
     * @return DeleteTableVersionResponse
     */
    public DeleteTableVersionResponse deleteTableVersion(DeleteTableVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTableVersionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消注册Location</p>
     * 
     * @param request DeregisterLocationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DeregisterLocationResponse
     */
    public DeregisterLocationResponse deregisterLocationWithOptions(DeregisterLocationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.locationId)) {
            query.put("LocationId", request.locationId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeregisterLocation"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/locations"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeregisterLocationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消注册Location</p>
     * 
     * @param request DeregisterLocationRequest
     * @return DeregisterLocationResponse
     */
    public DeregisterLocationResponse deregisterLocation(DeregisterLocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deregisterLocationWithOptions(request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegionsWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeRegions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/service/describeRegions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeRegionsResponse());
    }

    /**
     * @return DescribeRegionsResponse
     */
    public DescribeRegionsResponse describeRegions() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetAsyncTaskStatus</p>
     * 
     * @param request GetAsyncTaskStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetAsyncTaskStatusResponse
     */
    public GetAsyncTaskStatusResponse getAsyncTaskStatusWithOptions(GetAsyncTaskStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetAsyncTaskStatus"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/tasks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetAsyncTaskStatusResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetAsyncTaskStatus</p>
     * 
     * @param request GetAsyncTaskStatusRequest
     * @return GetAsyncTaskStatusResponse
     */
    public GetAsyncTaskStatusResponse getAsyncTaskStatus(GetAsyncTaskStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAsyncTaskStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取Catalog</p>
     * 
     * @param request GetCatalogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCatalogResponse
     */
    public GetCatalogResponse getCatalogWithOptions(GetCatalogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCatalog"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取Catalog</p>
     * 
     * @param request GetCatalogRequest
     * @return GetCatalogResponse
     */
    public GetCatalogResponse getCatalog(GetCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCatalogWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖配置</p>
     * 
     * @param request GetCatalogSettingsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetCatalogSettingsResponse
     */
    public GetCatalogSettingsResponse getCatalogSettingsWithOptions(GetCatalogSettingsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetCatalogSettings"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/settings"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetCatalogSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖配置</p>
     * 
     * @param request GetCatalogSettingsRequest
     * @return GetCatalogSettingsResponse
     */
    public GetCatalogSettingsResponse getCatalogSettings(GetCatalogSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCatalogSettingsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Database</p>
     * 
     * @param request GetDatabaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatabaseResponse
     */
    public GetDatabaseResponse getDatabaseWithOptions(GetDatabaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatabase"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Database</p>
     * 
     * @param request GetDatabaseRequest
     * @return GetDatabaseResponse
     */
    public GetDatabaseResponse getDatabase(GetDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatabaseWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取库数据概览信息</p>
     * 
     * @param request GetDatabaseProfileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetDatabaseProfileResponse
     */
    public GetDatabaseProfileResponse getDatabaseProfileWithOptions(GetDatabaseProfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDatabaseProfile"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/metastorehouse/catalog/database/databaseprofile"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDatabaseProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取库数据概览信息</p>
     * 
     * @param request GetDatabaseProfileRequest
     * @return GetDatabaseProfileResponse
     */
    public GetDatabaseProfileResponse getDatabaseProfile(GetDatabaseProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatabaseProfileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Function</p>
     * 
     * @param request GetFunctionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetFunctionResponse
     */
    public GetFunctionResponse getFunctionWithOptions(GetFunctionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            query.put("FunctionName", request.functionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetFunction"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/functions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Function</p>
     * 
     * @param request GetFunctionRequest
     * @return GetFunctionResponse
     */
    public GetFunctionResponse getFunction(GetFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取生命周期规则</p>
     * 
     * @param request GetLifecycleRuleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLifecycleRuleResponse
     */
    public GetLifecycleRuleResponse getLifecycleRuleWithOptions(GetLifecycleRuleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            query.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.resourceName)) {
            query.put("ResourceName", request.resourceName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLifecycleRule"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/metastorehouse/lifecycle/rule/getLifecycleRule"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLifecycleRuleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取生命周期规则</p>
     * 
     * @param request GetLifecycleRuleRequest
     * @return GetLifecycleRuleResponse
     */
    public GetLifecycleRuleResponse getLifecycleRule(GetLifecycleRuleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLifecycleRuleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>get lock status</p>
     * 
     * @param request GetLockRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetLockResponse
     */
    public GetLockResponse getLockWithOptions(GetLockRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lockId)) {
            query.put("LockId", request.lockId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLock"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/locks"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>get lock status</p>
     * 
     * @param request GetLockRequest
     * @return GetLockResponse
     */
    public GetLockResponse getLock(GetLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLockWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>get partition</p>
     * 
     * @param request GetPartitionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPartitionResponse
     */
    public GetPartitionResponse getPartitionWithOptions(GetPartitionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionValues)) {
            body.put("PartitionValues", request.partitionValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPartition"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/get"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPartitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>get partition</p>
     * 
     * @param request GetPartitionRequest
     * @return GetPartitionResponse
     */
    public GetPartitionResponse getPartition(GetPartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPartitionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Batch Get Partition Column Statistics</p>
     * 
     * @param tmpReq GetPartitionColumnStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetPartitionColumnStatisticsResponse
     */
    public GetPartitionColumnStatisticsResponse getPartitionColumnStatisticsWithOptions(GetPartitionColumnStatisticsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetPartitionColumnStatisticsShrinkRequest request = new GetPartitionColumnStatisticsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columnNames)) {
            request.columnNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columnNames, "ColumnNames", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partitionNames)) {
            request.partitionNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partitionNames, "PartitionNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnNamesShrink)) {
            query.put("ColumnNames", request.columnNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNamesShrink)) {
            query.put("PartitionNames", request.partitionNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetPartitionColumnStatistics"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/columnstatistics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetPartitionColumnStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Batch Get Partition Column Statistics</p>
     * 
     * @param request GetPartitionColumnStatisticsRequest
     * @return GetPartitionColumnStatisticsResponse
     */
    public GetPartitionColumnStatisticsResponse getPartitionColumnStatistics(GetPartitionColumnStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPartitionColumnStatisticsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取查询结果</p>
     * 
     * @param request GetQueryResultRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetQueryResultResponse
     */
    public GetQueryResultResponse getQueryResultWithOptions(GetQueryResultRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.queryId)) {
            query.put("QueryId", request.queryId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetQueryResult"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/query/getQueryResult"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetQueryResultResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取查询结果</p>
     * 
     * @param request GetQueryResultRequest
     * @return GetQueryResultResponse
     */
    public GetQueryResultResponse getQueryResult(GetQueryResultRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQueryResultWithOptions(request, headers, runtime);
    }

    /**
     * @param request GetRegionStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRegionStatusResponse
     */
    public GetRegionStatusResponse getRegionStatusWithOptions(GetRegionStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegionStatus"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/service/getRegionStatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegionStatusResponse());
    }

    /**
     * @param request GetRegionStatusRequest
     * @return GetRegionStatusResponse
     */
    public GetRegionStatusResponse getRegionStatus(GetRegionStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegionStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>GetRole</p>
     * 
     * @param request GetRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetRoleResponse
     */
    public GetRoleResponse getRoleWithOptions(GetRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRole"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/roles"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>GetRole</p>
     * 
     * @param request GetRoleRequest
     * @return GetRoleResponse
     */
    public GetRoleResponse getRole(GetRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRoleWithOptions(request, headers, runtime);
    }

    /**
     * @param request GetServiceStatusRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetServiceStatusResponse
     */
    public GetServiceStatusResponse getServiceStatusWithOptions(GetServiceStatusRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetServiceStatus"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/service/getServiceStatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetServiceStatusResponse());
    }

    /**
     * @param request GetServiceStatusRequest
     * @return GetServiceStatusResponse
     */
    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceStatusWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get table</p>
     * 
     * @param request GetTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableResponse
     */
    public GetTableResponse getTableWithOptions(GetTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTable"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get table</p>
     * 
     * @param request GetTableRequest
     * @return GetTableResponse
     */
    public GetTableResponse getTable(GetTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>An example of API</p>
     * 
     * @param tmpReq GetTableColumnStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableColumnStatisticsResponse
     */
    public GetTableColumnStatisticsResponse getTableColumnStatisticsWithOptions(GetTableColumnStatisticsRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        GetTableColumnStatisticsShrinkRequest request = new GetTableColumnStatisticsShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columnNames)) {
            request.columnNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columnNames, "ColumnNames", "json");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnNamesShrink)) {
            query.put("ColumnNames", request.columnNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableColumnStatistics"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/columnstatistics"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableColumnStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>An example of API</p>
     * 
     * @param request GetTableColumnStatisticsRequest
     * @return GetTableColumnStatisticsResponse
     */
    public GetTableColumnStatisticsResponse getTableColumnStatistics(GetTableColumnStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableColumnStatisticsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取表数据概况信息</p>
     * 
     * @param request GetTableProfileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableProfileResponse
     */
    public GetTableProfileResponse getTableProfileWithOptions(GetTableProfileRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableProfile"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/metastorehouse/catalog/database/tableprofile"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取表数据概况信息</p>
     * 
     * @param request GetTableProfileRequest
     * @return GetTableProfileResponse
     */
    public GetTableProfileResponse getTableProfile(GetTableProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableProfileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get table version</p>
     * 
     * @param request GetTableVersionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GetTableVersionResponse
     */
    public GetTableVersionResponse getTableVersionWithOptions(GetTableVersionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.versionId)) {
            query.put("VersionId", request.versionId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetTableVersion"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/versions"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetTableVersionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get table version</p>
     * 
     * @param request GetTableVersionRequest
     * @return GetTableVersionResponse
     */
    public GetTableVersionResponse getTableVersion(GetTableVersionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableVersionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>赋予Principal资源的权限</p>
     * 
     * @param request GrantPermissionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantPermissionsResponse
     */
    public GrantPermissionsResponse grantPermissionsWithOptions(GrantPermissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accesses)) {
            body.put("Accesses", request.accesses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delegateAccesses)) {
            body.put("DelegateAccesses", request.delegateAccesses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaResource)) {
            body.put("MetaResource", request.metaResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principal)) {
            body.put("Principal", request.principal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantPermissions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/permissions/grant"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantPermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>赋予Principal资源的权限</p>
     * 
     * @param request GrantPermissionsRequest
     * @return GrantPermissionsResponse
     */
    public GrantPermissionsResponse grantPermissions(GrantPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantPermissionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grant 单个角色给一个或多个用户</p>
     * 
     * @param request GrantRoleToUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantRoleToUsersResponse
     */
    public GrantRoleToUsersResponse grantRoleToUsersWithOptions(GrantRoleToUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantRoleToUsers"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/roles/grantusers"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantRoleToUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grant 单个角色给一个或多个用户</p>
     * 
     * @param request GrantRoleToUsersRequest
     * @return GrantRoleToUsersResponse
     */
    public GrantRoleToUsersResponse grantRoleToUsers(GrantRoleToUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantRoleToUsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Grant 一个或多个角色给一个用户</p>
     * 
     * @param request GrantRolesToUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return GrantRolesToUserResponse
     */
    public GrantRolesToUserResponse grantRolesToUserWithOptions(GrantRolesToUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleNames)) {
            body.put("RoleNames", request.roleNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            body.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GrantRolesToUser"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/roles/grantroles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GrantRolesToUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Grant 一个或多个角色给一个用户</p>
     * 
     * @param request GrantRolesToUserRequest
     * @return GrantRolesToUserResponse
     */
    public GrantRolesToUserResponse grantRolesToUser(GrantRolesToUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantRolesToUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListCatalogs</p>
     * 
     * @param request ListCatalogsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListCatalogsResponse
     */
    public ListCatalogsResponse listCatalogsWithOptions(ListCatalogsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.idPattern)) {
            query.put("IdPattern", request.idPattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCatalogs"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCatalogsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListCatalogs</p>
     * 
     * @param request ListCatalogsRequest
     * @return ListCatalogsResponse
     */
    public ListCatalogsResponse listCatalogs(ListCatalogsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCatalogsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Get Databases List</p>
     * 
     * @param request ListDatabasesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabasesWithOptions(ListDatabasesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namePattern)) {
            query.put("NamePattern", request.namePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDatabases"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDatabasesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Get Databases List</p>
     * 
     * @param request ListDatabasesRequest
     * @return ListDatabasesResponse
     */
    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDatabasesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>list function names</p>
     * 
     * @param request ListFunctionNamesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFunctionNamesResponse
     */
    public ListFunctionNamesResponse listFunctionNamesWithOptions(ListFunctionNamesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionNamePattern)) {
            query.put("FunctionNamePattern", request.functionNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctionNames"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/functions/names"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionNamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>list function names</p>
     * 
     * @param request ListFunctionNamesRequest
     * @return ListFunctionNamesResponse
     */
    public ListFunctionNamesResponse listFunctionNames(ListFunctionNamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionNamesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>list functions</p>
     * 
     * @param request ListFunctionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctionsWithOptions(ListFunctionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionNamePattern)) {
            query.put("FunctionNamePattern", request.functionNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListFunctions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/functions/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListFunctionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>list functions</p>
     * 
     * @param request ListFunctionsRequest
     * @return ListFunctionsResponse
     */
    public ListFunctionsResponse listFunctions(ListFunctionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>partition names</p>
     * 
     * @param request ListPartitionNamesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPartitionNamesResponse
     */
    public ListPartitionNamesResponse listPartitionNamesWithOptions(ListPartitionNamesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            body.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partialPartValues)) {
            body.put("PartialPartValues", request.partialPartValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPartitionNames"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/names"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPartitionNamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>partition names</p>
     * 
     * @param request ListPartitionNamesRequest
     * @return ListPartitionNamesResponse
     */
    public ListPartitionNamesResponse listPartitionNames(ListPartitionNamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPartitionNamesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>list partitions</p>
     * 
     * @param request ListPartitionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPartitionsResponse
     */
    public ListPartitionsResponse listPartitionsWithOptions(ListPartitionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isShareSd)) {
            body.put("IsShareSd", request.isShareSd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            body.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partialPartValues)) {
            body.put("PartialPartValues", request.partialPartValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPartitions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPartitionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>list partitions</p>
     * 
     * @param request ListPartitionsRequest
     * @return ListPartitionsResponse
     */
    public ListPartitionsResponse listPartitions(ListPartitionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPartitionsWithOptions(request, headers, runtime);
    }

    /**
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPartitionsByExprResponse
     */
    public ListPartitionsByExprResponse listPartitionsByExprWithOptions(java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPartitionsByExpr"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/listbyexpr"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPartitionsByExprResponse());
    }

    /**
     * @return ListPartitionsByExprResponse
     */
    public ListPartitionsByExprResponse listPartitionsByExpr() throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPartitionsByExprWithOptions(headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>list partitions by filter</p>
     * 
     * @param request ListPartitionsByFilterRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPartitionsByFilterResponse
     */
    public ListPartitionsByFilterResponse listPartitionsByFilterWithOptions(ListPartitionsByFilterRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.filter)) {
            body.put("Filter", request.filter);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isShareSd)) {
            body.put("IsShareSd", request.isShareSd);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            body.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPartitionsByFilter"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/listbyfilter"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPartitionsByFilterResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>list partitions by filter</p>
     * 
     * @param request ListPartitionsByFilterRequest
     * @return ListPartitionsByFilterResponse
     */
    public ListPartitionsByFilterResponse listPartitionsByFilter(ListPartitionsByFilterRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPartitionsByFilterWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取分区数据概况信息</p>
     * 
     * @param tmpReq ListPartitionsProfileRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPartitionsProfileResponse
     */
    public ListPartitionsProfileResponse listPartitionsProfileWithOptions(ListPartitionsProfileRequest tmpReq, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(tmpReq);
        ListPartitionsProfileShrinkRequest request = new ListPartitionsProfileShrinkRequest();
        com.aliyun.openapiutil.Client.convert(tmpReq, request);
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partitionNames)) {
            request.partitionNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partitionNames, "PartitionNames", "simple");
        }

        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNamesShrink)) {
            query.put("PartitionNames", request.partitionNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPartitionsProfile"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/metastorehouse/catalog/database/tableprofile/partitionprofile/listPartitionsProfile"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPartitionsProfileResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取分区数据概况信息</p>
     * 
     * @param request ListPartitionsProfileRequest
     * @return ListPartitionsProfileResponse
     */
    public ListPartitionsProfileResponse listPartitionsProfile(ListPartitionsProfileRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPartitionsProfileWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定资源或指定Principal的权限信息</p>
     * 
     * @param request ListPermissionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListPermissionsResponse
     */
    public ListPermissionsResponse listPermissionsWithOptions(ListPermissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isListUserRolePermissions)) {
            body.put("IsListUserRolePermissions", request.isListUserRolePermissions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaResource)) {
            body.put("MetaResource", request.metaResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaResourceType)) {
            body.put("MetaResourceType", request.metaResourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            body.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principal)) {
            body.put("Principal", request.principal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListPermissions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/permissions/list"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListPermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取指定资源或指定Principal的权限信息</p>
     * 
     * @param request ListPermissionsRequest
     * @return ListPermissionsResponse
     */
    public ListPermissionsResponse listPermissions(ListPermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPermissionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户角色列表</p>
     * 
     * @param request ListRoleUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRoleUsersResponse
     */
    public ListRoleUsersResponse listRoleUsersWithOptions(ListRoleUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userNamePattern)) {
            query.put("UserNamePattern", request.userNamePattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoleUsers"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/roles/roleusers"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRoleUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户角色列表</p>
     * 
     * @param request ListRoleUsersRequest
     * @return ListRoleUsersResponse
     */
    public ListRoleUsersResponse listRoleUsers(ListRoleUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRoleUsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>ListRoles</p>
     * 
     * @param request ListRolesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListRolesResponse
     */
    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleNamePattern)) {
            query.put("RoleNamePattern", request.roleNamePattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRoles"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/roles/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>ListRoles</p>
     * 
     * @param request ListRolesRequest
     * @return ListRolesResponse
     */
    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRolesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>list table names</p>
     * 
     * @param request ListTableNamesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTableNamesResponse
     */
    public ListTableNamesResponse listTableNamesWithOptions(ListTableNamesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNamePattern)) {
            query.put("TableNamePattern", request.tableNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableType)) {
            query.put("TableType", request.tableType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTableNames"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/names"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTableNamesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>list table names</p>
     * 
     * @param request ListTableNamesRequest
     * @return ListTableNamesResponse
     */
    public ListTableNamesResponse listTableNames(ListTableNamesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTableNamesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>List table versions</p>
     * 
     * @param request ListTableVersionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTableVersionsResponse
     */
    public ListTableVersionsResponse listTableVersionsWithOptions(ListTableVersionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTableVersions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/versions/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTableVersionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>List table versions</p>
     * 
     * @param request ListTableVersionsRequest
     * @return ListTableVersionsResponse
     */
    public ListTableVersionsResponse listTableVersions(ListTableVersionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTableVersionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>list tables</p>
     * 
     * @param request ListTablesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListTablesResponse
     */
    public ListTablesResponse listTablesWithOptions(ListTablesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableNamePattern)) {
            query.put("TableNamePattern", request.tableNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableType)) {
            query.put("TableType", request.tableType);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListTables"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/databases/tables/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListTablesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>list tables</p>
     * 
     * @param request ListTablesRequest
     * @return ListTablesResponse
     */
    public ListTablesResponse listTables(ListTablesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTablesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户角色列表</p>
     * 
     * @param request ListUserRolesRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return ListUserRolesResponse
     */
    public ListUserRolesResponse listUserRolesWithOptions(ListUserRolesRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principalArn)) {
            query.put("PrincipalArn", request.principalArn);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleNamePattern)) {
            query.put("RoleNamePattern", request.roleNamePattern);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListUserRoles"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/roles/userroles"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListUserRolesResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>查询用户角色列表</p>
     * 
     * @param request ListUserRolesRequest
     * @return ListUserRolesResponse
     */
    public ListUserRolesResponse listUserRoles(ListUserRolesRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserRolesWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>refresh to keep the lock alive</p>
     * 
     * @param request RefreshLockRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RefreshLockResponse
     */
    public RefreshLockResponse refreshLockWithOptions(RefreshLockRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lockId)) {
            query.put("LockId", request.lockId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshLock"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/locks"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshLockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>refresh to keep the lock alive</p>
     * 
     * @param request RefreshLockRequest
     * @return RefreshLockResponse
     */
    public RefreshLockResponse refreshLock(RefreshLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refreshLockWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>注册Location</p>
     * 
     * @param request RegisterLocationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RegisterLocationResponse
     */
    public RegisterLocationResponse registerLocationWithOptions(RegisterLocationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inventoryCollectEnabled)) {
            body.put("InventoryCollectEnabled", request.inventoryCollectEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.location)) {
            body.put("Location", request.location);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossLogCollectEnabled)) {
            body.put("OssLogCollectEnabled", request.ossLogCollectEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RegisterLocation"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/locations"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RegisterLocationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>注册Location</p>
     * 
     * @param request RegisterLocationRequest
     * @return RegisterLocationResponse
     */
    public RegisterLocationResponse registerLocation(RegisterLocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.registerLocationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>rename partition</p>
     * 
     * @param request RenamePartitionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenamePartitionResponse
     */
    public RenamePartitionResponse renamePartitionWithOptions(RenamePartitionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionInput)) {
            body.put("PartitionInput", request.partitionInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionValues)) {
            body.put("PartitionValues", request.partitionValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenamePartition"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/rename"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenamePartitionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>rename partition</p>
     * 
     * @param request RenamePartitionRequest
     * @return RenamePartitionResponse
     */
    public RenamePartitionResponse renamePartition(RenamePartitionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renamePartitionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>rename table</p>
     * 
     * @param request RenameTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RenameTableResponse
     */
    public RenameTableResponse renameTableWithOptions(RenameTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAsync)) {
            body.put("IsAsync", request.isAsync);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableInput)) {
            body.put("TableInput", request.tableInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RenameTable"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/rename"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RenameTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>rename table</p>
     * 
     * @param request RenameTableRequest
     * @return RenameTableResponse
     */
    public RenameTableResponse renameTable(RenameTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renameTableWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>取消Principal资源的权限</p>
     * 
     * @param request RevokePermissionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokePermissionsResponse
     */
    public RevokePermissionsResponse revokePermissionsWithOptions(RevokePermissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accesses)) {
            body.put("Accesses", request.accesses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delegateAccesses)) {
            body.put("DelegateAccesses", request.delegateAccesses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaResource)) {
            body.put("MetaResource", request.metaResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principal)) {
            body.put("Principal", request.principal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokePermissions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/permissions/revoke"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokePermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>取消Principal资源的权限</p>
     * 
     * @param request RevokePermissionsRequest
     * @return RevokePermissionsResponse
     */
    public RevokePermissionsResponse revokePermissions(RevokePermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokePermissionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量将该角色从这些用户中revoke</p>
     * 
     * @param request RevokeRoleFromUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeRoleFromUsersResponse
     */
    public RevokeRoleFromUsersResponse revokeRoleFromUsersWithOptions(RevokeRoleFromUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeRoleFromUsers"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/roles/revokeusers"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeRoleFromUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量将该角色从这些用户中revoke</p>
     * 
     * @param request RevokeRoleFromUsersRequest
     * @return RevokeRoleFromUsersResponse
     */
    public RevokeRoleFromUsersResponse revokeRoleFromUsers(RevokeRoleFromUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeRoleFromUsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>批量Revoke该用户的角色</p>
     * 
     * @param request RevokeRolesFromUserRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RevokeRolesFromUserResponse
     */
    public RevokeRolesFromUserResponse revokeRolesFromUserWithOptions(RevokeRolesFromUserRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleNames)) {
            body.put("RoleNames", request.roleNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.user)) {
            body.put("User", request.user);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RevokeRolesFromUser"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/roles/revokeroles"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RevokeRolesFromUserResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>批量Revoke该用户的角色</p>
     * 
     * @param request RevokeRolesFromUserRequest
     * @return RevokeRolesFromUserResponse
     */
    public RevokeRolesFromUserResponse revokeRolesFromUser(RevokeRolesFromUserRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeRolesFromUserWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>运行元数据迁移任务</p>
     * 
     * @param request RunMigrationWorkflowRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return RunMigrationWorkflowResponse
     */
    public RunMigrationWorkflowResponse runMigrationWorkflowWithOptions(RunMigrationWorkflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunMigrationWorkflow"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/migration/workflow/run"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunMigrationWorkflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>运行元数据迁移任务</p>
     * 
     * @param request RunMigrationWorkflowRequest
     * @return RunMigrationWorkflowResponse
     */
    public RunMigrationWorkflowResponse runMigrationWorkflow(RunMigrationWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runMigrationWorkflowWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DLF 元数据search</p>
     * 
     * @param request SearchRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchResponse
     */
    public SearchResponse searchWithOptions(SearchRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchText)) {
            body.put("SearchText", request.searchText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchType)) {
            body.put("SearchType", request.searchType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortCriteria)) {
            body.put("SortCriteria", request.sortCriteria);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "Search"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/search"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DLF 元数据search</p>
     * 
     * @param request SearchRequest
     * @return SearchResponse
     */
    public SearchResponse search(SearchRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>DLF 跨Catalog检索元数据</p>
     * 
     * @param request SearchAcrossCatalogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SearchAcrossCatalogResponse
     */
    public SearchAcrossCatalogResponse searchAcrossCatalogWithOptions(SearchAcrossCatalogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogIds)) {
            body.put("CatalogIds", request.catalogIds);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            body.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            body.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchText)) {
            body.put("SearchText", request.searchText);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.searchTypes)) {
            body.put("SearchTypes", request.searchTypes);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sortCriteria)) {
            body.put("SortCriteria", request.sortCriteria);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SearchAcrossCatalog"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/search/search-across-catalog"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SearchAcrossCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>DLF 跨Catalog检索元数据</p>
     * 
     * @param request SearchAcrossCatalogRequest
     * @return SearchAcrossCatalogResponse
     */
    public SearchAcrossCatalogResponse searchAcrossCatalog(SearchAcrossCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchAcrossCatalogWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>停止元数据迁移任务</p>
     * 
     * @param request StopMigrationWorkflowRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return StopMigrationWorkflowResponse
     */
    public StopMigrationWorkflowResponse stopMigrationWorkflowWithOptions(StopMigrationWorkflowRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopMigrationWorkflow"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/migration/workflow/stop"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopMigrationWorkflowResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>停止元数据迁移任务</p>
     * 
     * @param request StopMigrationWorkflowRequest
     * @return StopMigrationWorkflowResponse
     */
    public StopMigrationWorkflowResponse stopMigrationWorkflow(StopMigrationWorkflowRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopMigrationWorkflowWithOptions(request, headers, runtime);
    }

    /**
     * @param request SubmitQueryRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return SubmitQueryResponse
     */
    public SubmitQueryResponse submitQueryWithOptions(SubmitQueryRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("catalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            body.put("sql", request.sql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "SubmitQuery"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/query/submitQueryRequestBody"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new SubmitQueryResponse());
    }

    /**
     * @param request SubmitQueryRequest
     * @return SubmitQueryResponse
     */
    public SubmitQueryResponse submitQuery(SubmitQueryRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitQueryWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>unlock</p>
     * 
     * @param request UnLockRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UnLockResponse
     */
    public UnLockResponse unLockWithOptions(UnLockRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lockId)) {
            query.put("LockId", request.lockId);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UnLock"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/locks"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UnLockResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>unlock</p>
     * 
     * @param request UnLockRequest
     * @return UnLockResponse
     */
    public UnLockResponse unLock(UnLockRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unLockWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据湖Catalog</p>
     * 
     * @param request UpdateCatalogRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCatalogResponse
     */
    public UpdateCatalogResponse updateCatalogWithOptions(UpdateCatalogRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogInput)) {
            body.put("CatalogInput", request.catalogInput);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCatalog"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCatalogResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新数据湖Catalog</p>
     * 
     * @param request UpdateCatalogRequest
     * @return UpdateCatalogResponse
     */
    public UpdateCatalogResponse updateCatalog(UpdateCatalogRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCatalogWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖配置</p>
     * 
     * @param request UpdateCatalogSettingsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateCatalogSettingsResponse
     */
    public UpdateCatalogSettingsResponse updateCatalogSettingsWithOptions(UpdateCatalogSettingsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogSettings)) {
            body.put("CatalogSettings", request.catalogSettings);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateCatalogSettings"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/settings"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateCatalogSettingsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>获取数据湖配置</p>
     * 
     * @param request UpdateCatalogSettingsRequest
     * @return UpdateCatalogSettingsResponse
     */
    public UpdateCatalogSettingsResponse updateCatalogSettings(UpdateCatalogSettingsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCatalogSettingsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>Update database</p>
     * 
     * @param request UpdateDatabaseRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateDatabaseResponse
     */
    public UpdateDatabaseResponse updateDatabaseWithOptions(UpdateDatabaseRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseInput)) {
            body.put("DatabaseInput", request.databaseInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDatabase"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDatabaseResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>Update database</p>
     * 
     * @param request UpdateDatabaseRequest
     * @return UpdateDatabaseResponse
     */
    public UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDatabaseWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>update function</p>
     * 
     * @param request UpdateFunctionRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateFunctionResponse
     */
    public UpdateFunctionResponse updateFunctionWithOptions(UpdateFunctionRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionInput)) {
            body.put("FunctionInput", request.functionInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            body.put("FunctionName", request.functionName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateFunction"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/functions"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateFunctionResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>update function</p>
     * 
     * @param request UpdateFunctionRequest
     * @return UpdateFunctionResponse
     */
    public UpdateFunctionResponse updateFunction(UpdateFunctionRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFunctionWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>update partition columnstatistics</p>
     * 
     * @param request UpdatePartitionColumnStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePartitionColumnStatisticsResponse
     */
    public UpdatePartitionColumnStatisticsResponse updatePartitionColumnStatisticsWithOptions(UpdatePartitionColumnStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.updateTablePartitionColumnStatisticsRequest))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePartitionColumnStatistics"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/partitions/columnstatistics"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePartitionColumnStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>update partition columnstatistics</p>
     * 
     * @param request UpdatePartitionColumnStatisticsRequest
     * @return UpdatePartitionColumnStatisticsResponse
     */
    public UpdatePartitionColumnStatisticsResponse updatePartitionColumnStatistics(UpdatePartitionColumnStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePartitionColumnStatisticsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>赋予Principal资源的权限</p>
     * 
     * @param request UpdatePermissionsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdatePermissionsResponse
     */
    public UpdatePermissionsResponse updatePermissionsWithOptions(UpdatePermissionsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.accesses)) {
            body.put("Accesses", request.accesses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.delegateAccesses)) {
            body.put("DelegateAccesses", request.delegateAccesses);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metaResource)) {
            body.put("MetaResource", request.metaResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.principal)) {
            body.put("Principal", request.principal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdatePermissions"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/permissions/"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdatePermissionsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>赋予Principal资源的权限</p>
     * 
     * @param request UpdatePermissionsRequest
     * @return UpdatePermissionsResponse
     */
    public UpdatePermissionsResponse updatePermissions(UpdatePermissionsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePermissionsWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>修改Location</p>
     * 
     * @param request UpdateRegisteredLocationRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRegisteredLocationResponse
     */
    public UpdateRegisteredLocationResponse updateRegisteredLocationWithOptions(UpdateRegisteredLocationRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.inventoryCollectEnabled)) {
            body.put("InventoryCollectEnabled", request.inventoryCollectEnabled);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.locationId)) {
            body.put("LocationId", request.locationId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.ossLogCollectEnabled)) {
            body.put("OssLogCollectEnabled", request.ossLogCollectEnabled);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRegisteredLocation"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/locations"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRegisteredLocationResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>修改Location</p>
     * 
     * @param request UpdateRegisteredLocationRequest
     * @return UpdateRegisteredLocationResponse
     */
    public UpdateRegisteredLocationResponse updateRegisteredLocation(UpdateRegisteredLocationRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRegisteredLocationWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新角色</p>
     * 
     * @param request UpdateRoleRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRoleResponse
     */
    public UpdateRoleResponse updateRoleWithOptions(UpdateRoleRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleInput)) {
            body.put("RoleInput", request.roleInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRole"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/roles"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRoleResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新角色</p>
     * 
     * @param request UpdateRoleRequest
     * @return UpdateRoleResponse
     */
    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRoleWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>更新Role中的Users</p>
     * 
     * @param request UpdateRoleUsersRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateRoleUsersResponse
     */
    public UpdateRoleUsersResponse updateRoleUsersWithOptions(UpdateRoleUsersRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateRoleUsers"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/auth/updateroleusers"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateRoleUsersResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>更新Role中的Users</p>
     * 
     * @param request UpdateRoleUsersRequest
     * @return UpdateRoleUsersResponse
     */
    public UpdateRoleUsersResponse updateRoleUsers(UpdateRoleUsersRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRoleUsersWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>update table</p>
     * 
     * @param request UpdateTableRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTableResponse
     */
    public UpdateTableResponse updateTableWithOptions(UpdateTableRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.allowPartitionKeyChange)) {
            body.put("AllowPartitionKeyChange", request.allowPartitionKeyChange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isAsync)) {
            body.put("IsAsync", request.isAsync);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.skipArchive)) {
            body.put("SkipArchive", request.skipArchive);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableInput)) {
            body.put("TableInput", request.tableInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTable"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>update table</p>
     * 
     * @param request UpdateTableRequest
     * @return UpdateTableResponse
     */
    public UpdateTableResponse updateTable(UpdateTableRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTableWithOptions(request, headers, runtime);
    }

    /**
     * <b>summary</b> : 
     * <p>update table columnstatistics</p>
     * 
     * @param request UpdateTableColumnStatisticsRequest
     * @param headers map
     * @param runtime runtime options for this request RuntimeOptions
     * @return UpdateTableColumnStatisticsResponse
     */
    public UpdateTableColumnStatisticsResponse updateTableColumnStatisticsWithOptions(UpdateTableColumnStatisticsRequest request, java.util.Map<String, String> headers, com.aliyun.teautil.models.RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        com.aliyun.teaopenapi.models.OpenApiRequest req = com.aliyun.teaopenapi.models.OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(request.updateTablePartitionColumnStatisticsRequest))
        ));
        com.aliyun.teaopenapi.models.Params params = com.aliyun.teaopenapi.models.Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateTableColumnStatistics"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/api/metastore/catalogs/databases/tables/columnstatistics"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateTableColumnStatisticsResponse());
    }

    /**
     * <b>summary</b> : 
     * <p>update table columnstatistics</p>
     * 
     * @param request UpdateTableColumnStatisticsRequest
     * @return UpdateTableColumnStatisticsResponse
     */
    public UpdateTableColumnStatisticsResponse updateTableColumnStatistics(UpdateTableColumnStatisticsRequest request) throws Exception {
        com.aliyun.teautil.models.RuntimeOptions runtime = new com.aliyun.teautil.models.RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTableColumnStatisticsWithOptions(request, headers, runtime);
    }
}
