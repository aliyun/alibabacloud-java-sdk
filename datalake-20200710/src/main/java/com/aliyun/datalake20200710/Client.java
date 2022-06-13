// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710;

import com.aliyun.tea.*;
import com.aliyun.datalake20200710.models.*;
import com.aliyun.teautil.*;
import com.aliyun.teautil.models.*;
import com.aliyun.teaopenapi.*;
import com.aliyun.teaopenapi.models.*;
import com.aliyun.openapiutil.*;
import com.aliyun.endpointutil.*;

public class Client extends com.aliyun.teaopenapi.Client {

    public Client(Config config) throws Exception {
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

    public AbortLockResponse abortLock(AbortLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.abortLockWithOptions(request, headers, runtime);
    }

    public AbortLockResponse abortLockWithOptions(AbortLockRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lockId)) {
            query.put("LockId", request.lockId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchCreatePartitionsResponse batchCreatePartitions(BatchCreatePartitionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchCreatePartitionsWithOptions(request, headers, runtime);
    }

    public BatchCreatePartitionsResponse batchCreatePartitionsWithOptions(BatchCreatePartitionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchCreateTablesResponse batchCreateTables(BatchCreateTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchCreateTablesWithOptions(request, headers, runtime);
    }

    public BatchCreateTablesResponse batchCreateTablesWithOptions(BatchCreateTablesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchDeletePartitionsResponse batchDeletePartitions(BatchDeletePartitionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchDeletePartitionsWithOptions(request, headers, runtime);
    }

    public BatchDeletePartitionsResponse batchDeletePartitionsWithOptions(BatchDeletePartitionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchDeleteTableVersionsResponse batchDeleteTableVersions(BatchDeleteTableVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchDeleteTableVersionsWithOptions(request, headers, runtime);
    }

    public BatchDeleteTableVersionsResponse batchDeleteTableVersionsWithOptions(BatchDeleteTableVersionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchDeleteTablesResponse batchDeleteTables(BatchDeleteTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchDeleteTablesWithOptions(request, headers, runtime);
    }

    public BatchDeleteTablesResponse batchDeleteTablesWithOptions(BatchDeleteTablesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchGetPartitionColumnStatisticsResponse batchGetPartitionColumnStatistics(BatchGetPartitionColumnStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGetPartitionColumnStatisticsWithOptions(request, headers, runtime);
    }

    public BatchGetPartitionColumnStatisticsResponse batchGetPartitionColumnStatisticsWithOptions(BatchGetPartitionColumnStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchGetPartitionsResponse batchGetPartitions(BatchGetPartitionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGetPartitionsWithOptions(request, headers, runtime);
    }

    public BatchGetPartitionsResponse batchGetPartitionsWithOptions(BatchGetPartitionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchGetTablesResponse batchGetTables(BatchGetTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGetTablesWithOptions(request, headers, runtime);
    }

    public BatchGetTablesResponse batchGetTablesWithOptions(BatchGetTablesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchGrantPermissionsResponse batchGrantPermissions(BatchGrantPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchGrantPermissionsWithOptions(request, headers, runtime);
    }

    public BatchGrantPermissionsResponse batchGrantPermissionsWithOptions(BatchGrantPermissionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchRevokePermissionsResponse batchRevokePermissions(BatchRevokePermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchRevokePermissionsWithOptions(request, headers, runtime);
    }

    public BatchRevokePermissionsResponse batchRevokePermissionsWithOptions(BatchRevokePermissionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchUpdatePartitionsResponse batchUpdatePartitions(BatchUpdatePartitionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchUpdatePartitionsWithOptions(request, headers, runtime);
    }

    public BatchUpdatePartitionsResponse batchUpdatePartitionsWithOptions(BatchUpdatePartitionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public BatchUpdateTablesResponse batchUpdateTables(BatchUpdateTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.batchUpdateTablesWithOptions(request, headers, runtime);
    }

    public BatchUpdateTablesResponse batchUpdateTablesWithOptions(BatchUpdateTablesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CancelQueryResponse cancelQuery(CancelQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.cancelQueryWithOptions(request, headers, runtime);
    }

    public CancelQueryResponse cancelQueryWithOptions(CancelQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.queryId)) {
            query.put("QueryId", request.queryId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CheckPermissionsResponse checkPermissions(CheckPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkPermissionsWithOptions(request, headers, runtime);
    }

    public CheckPermissionsResponse checkPermissionsWithOptions(CheckPermissionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateDatabaseResponse createDatabase(CreateDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createDatabaseWithOptions(request, headers, runtime);
    }

    public CreateDatabaseResponse createDatabaseWithOptions(CreateDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.databaseInput))) {
            body.put("DatabaseInput", request.databaseInput);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateFunctionResponse createFunction(CreateFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createFunctionWithOptions(request, headers, runtime);
    }

    public CreateFunctionResponse createFunctionWithOptions(CreateFunctionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.functionInput))) {
            body.put("FunctionInput", request.functionInput);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateLockResponse createLock(CreateLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createLockWithOptions(request, headers, runtime);
    }

    public CreateLockResponse createLockWithOptions(CreateLockRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lockObjList)) {
            body.put("LockObjList", request.lockObjList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreatePartitionResponse createPartition(CreatePartitionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createPartitionWithOptions(request, headers, runtime);
    }

    public CreatePartitionResponse createPartitionWithOptions(CreatePartitionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.partitionInput))) {
            body.put("PartitionInput", request.partitionInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateRoleResponse createRole(CreateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createRoleWithOptions(request, headers, runtime);
    }

    public CreateRoleResponse createRoleWithOptions(CreateRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.body)))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public CreateTableResponse createTable(CreateTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTableWithOptions(request, headers, runtime);
    }

    public CreateTableResponse createTableWithOptions(CreateTableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tableInput))) {
            body.put("TableInput", request.tableInput);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDatabaseWithOptions(request, headers, runtime);
    }

    public DeleteDatabaseResponse deleteDatabaseWithOptions(DeleteDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.cascade)) {
            query.put("Cascade", request.cascade);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteFunctionResponse deleteFunction(DeleteFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteFunctionWithOptions(request, headers, runtime);
    }

    public DeleteFunctionResponse deleteFunctionWithOptions(DeleteFunctionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeletePartitionResponse deletePartition(DeletePartitionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePartitionWithOptions(request, headers, runtime);
    }

    public DeletePartitionResponse deletePartitionWithOptions(DeletePartitionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeletePartitionColumnStatisticsResponse deletePartitionColumnStatistics(DeletePartitionColumnStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deletePartitionColumnStatisticsWithOptions(request, headers, runtime);
    }

    public DeletePartitionColumnStatisticsResponse deletePartitionColumnStatisticsWithOptions(DeletePartitionColumnStatisticsRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteRoleResponse deleteRole(DeleteRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteRoleWithOptions(request, headers, runtime);
    }

    public DeleteRoleResponse deleteRoleWithOptions(DeleteRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteTableResponse deleteTable(DeleteTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTableWithOptions(request, headers, runtime);
    }

    public DeleteTableResponse deleteTableWithOptions(DeleteTableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteTableColumnStatisticsResponse deleteTableColumnStatistics(DeleteTableColumnStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTableColumnStatisticsWithOptions(request, headers, runtime);
    }

    public DeleteTableColumnStatisticsResponse deleteTableColumnStatisticsWithOptions(DeleteTableColumnStatisticsRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DeleteTableVersionResponse deleteTableVersion(DeleteTableVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteTableVersionWithOptions(request, headers, runtime);
    }

    public DeleteTableVersionResponse deleteTableVersionWithOptions(DeleteTableVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public DescribeRegionsResponse describeRegions() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeRegionsWithOptions(headers, runtime);
    }

    public DescribeRegionsResponse describeRegionsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetAsyncTaskStatusResponse getAsyncTaskStatus(GetAsyncTaskStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getAsyncTaskStatusWithOptions(request, headers, runtime);
    }

    public GetAsyncTaskStatusResponse getAsyncTaskStatusWithOptions(GetAsyncTaskStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.taskId)) {
            query.put("TaskId", request.taskId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetCatalogSettingsResponse getCatalogSettings(GetCatalogSettingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getCatalogSettingsWithOptions(request, headers, runtime);
    }

    public GetCatalogSettingsResponse getCatalogSettingsWithOptions(GetCatalogSettingsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetDatabaseResponse getDatabase(GetDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDatabaseWithOptions(request, headers, runtime);
    }

    public GetDatabaseResponse getDatabaseWithOptions(GetDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetFunctionResponse getFunction(GetFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getFunctionWithOptions(request, headers, runtime);
    }

    public GetFunctionResponse getFunctionWithOptions(GetFunctionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetLockResponse getLock(GetLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLockWithOptions(request, headers, runtime);
    }

    public GetLockResponse getLockWithOptions(GetLockRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lockId)) {
            query.put("LockId", request.lockId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetPartitionResponse getPartition(GetPartitionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPartitionWithOptions(request, headers, runtime);
    }

    public GetPartitionResponse getPartitionWithOptions(GetPartitionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetPartitionColumnStatisticsResponse getPartitionColumnStatistics(GetPartitionColumnStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getPartitionColumnStatisticsWithOptions(request, headers, runtime);
    }

    public GetPartitionColumnStatisticsResponse getPartitionColumnStatisticsWithOptions(GetPartitionColumnStatisticsRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetQueryResultResponse getQueryResult(GetQueryResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getQueryResultWithOptions(request, headers, runtime);
    }

    public GetQueryResultResponse getQueryResultWithOptions(GetQueryResultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRegionStatusResponse getRegionStatus(GetRegionStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegionStatusWithOptions(request, headers, runtime);
    }

    public GetRegionStatusResponse getRegionStatusWithOptions(GetRegionStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetRoleResponse getRole(GetRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRoleWithOptions(request, headers, runtime);
    }

    public GetRoleResponse getRoleWithOptions(GetRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            query.put("RoleName", request.roleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetServiceStatusResponse getServiceStatus(GetServiceStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getServiceStatusWithOptions(request, headers, runtime);
    }

    public GetServiceStatusResponse getServiceStatusWithOptions(GetServiceStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.regionId)) {
            query.put("RegionId", request.regionId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetTableResponse getTable(GetTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableWithOptions(request, headers, runtime);
    }

    public GetTableResponse getTableWithOptions(GetTableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetTableColumnStatisticsResponse getTableColumnStatistics(GetTableColumnStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableColumnStatisticsWithOptions(request, headers, runtime);
    }

    public GetTableColumnStatisticsResponse getTableColumnStatisticsWithOptions(GetTableColumnStatisticsRequest tmpReq, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GetTableVersionResponse getTableVersion(GetTableVersionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getTableVersionWithOptions(request, headers, runtime);
    }

    public GetTableVersionResponse getTableVersionWithOptions(GetTableVersionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GrantPermissionsResponse grantPermissions(GrantPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantPermissionsWithOptions(request, headers, runtime);
    }

    public GrantPermissionsResponse grantPermissionsWithOptions(GrantPermissionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.metaResource))) {
            body.put("MetaResource", request.metaResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.principal))) {
            body.put("Principal", request.principal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GrantRoleToUsersResponse grantRoleToUsers(GrantRoleToUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantRoleToUsersWithOptions(request, headers, runtime);
    }

    public GrantRoleToUsersResponse grantRoleToUsersWithOptions(GrantRoleToUsersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public GrantRolesToUserResponse grantRolesToUser(GrantRolesToUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.grantRolesToUserWithOptions(request, headers, runtime);
    }

    public GrantRolesToUserResponse grantRolesToUserWithOptions(GrantRolesToUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleNames)) {
            body.put("RoleNames", request.roleNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.user))) {
            body.put("User", request.user);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListCatalogsResponse listCatalogs(ListCatalogsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCatalogsWithOptions(request, headers, runtime);
    }

    public ListCatalogsResponse listCatalogsWithOptions(ListCatalogsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListDatabasesResponse listDatabases(ListDatabasesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDatabasesWithOptions(request, headers, runtime);
    }

    public ListDatabasesResponse listDatabasesWithOptions(ListDatabasesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListFunctionNamesResponse listFunctionNames(ListFunctionNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionNamesWithOptions(request, headers, runtime);
    }

    public ListFunctionNamesResponse listFunctionNamesWithOptions(ListFunctionNamesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListFunctionsResponse listFunctions(ListFunctionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listFunctionsWithOptions(request, headers, runtime);
    }

    public ListFunctionsResponse listFunctionsWithOptions(ListFunctionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListPartitionNamesResponse listPartitionNames(ListPartitionNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPartitionNamesWithOptions(request, headers, runtime);
    }

    public ListPartitionNamesResponse listPartitionNamesWithOptions(ListPartitionNamesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListPartitionsResponse listPartitions(ListPartitionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPartitionsWithOptions(request, headers, runtime);
    }

    public ListPartitionsResponse listPartitionsWithOptions(ListPartitionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListPartitionsByExprResponse listPartitionsByExpr() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPartitionsByExprWithOptions(headers, runtime);
    }

    public ListPartitionsByExprResponse listPartitionsByExprWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListPartitionsByFilterResponse listPartitionsByFilter(ListPartitionsByFilterRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPartitionsByFilterWithOptions(request, headers, runtime);
    }

    public ListPartitionsByFilterResponse listPartitionsByFilterWithOptions(ListPartitionsByFilterRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListPermissionsResponse listPermissions(ListPermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listPermissionsWithOptions(request, headers, runtime);
    }

    public ListPermissionsResponse listPermissionsWithOptions(ListPermissionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.isListUserRolePermissions)) {
            body.put("IsListUserRolePermissions", request.isListUserRolePermissions);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.metaResource))) {
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

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.principal))) {
            body.put("Principal", request.principal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListRoleUsersResponse listRoleUsers(ListRoleUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRoleUsersWithOptions(request, headers, runtime);
    }

    public ListRoleUsersResponse listRoleUsersWithOptions(ListRoleUsersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListRolesResponse listRoles(ListRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRolesWithOptions(request, headers, runtime);
    }

    public ListRolesResponse listRolesWithOptions(ListRolesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListTableNamesResponse listTableNames(ListTableNamesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTableNamesWithOptions(request, headers, runtime);
    }

    public ListTableNamesResponse listTableNamesWithOptions(ListTableNamesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListTableVersionsResponse listTableVersions(ListTableVersionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTableVersionsWithOptions(request, headers, runtime);
    }

    public ListTableVersionsResponse listTableVersionsWithOptions(ListTableVersionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListTablesResponse listTables(ListTablesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listTablesWithOptions(request, headers, runtime);
    }

    public ListTablesResponse listTablesWithOptions(ListTablesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public ListUserRolesResponse listUserRoles(ListUserRolesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listUserRolesWithOptions(request, headers, runtime);
    }

    public ListUserRolesResponse listUserRolesWithOptions(ListUserRolesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RefreshLockResponse refreshLock(RefreshLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refreshLockWithOptions(request, headers, runtime);
    }

    public RefreshLockResponse refreshLockWithOptions(RefreshLockRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lockId)) {
            query.put("LockId", request.lockId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RenamePartitionResponse renamePartition(RenamePartitionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renamePartitionWithOptions(request, headers, runtime);
    }

    public RenamePartitionResponse renamePartitionWithOptions(RenamePartitionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.partitionInput))) {
            body.put("PartitionInput", request.partitionInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionValues)) {
            body.put("PartitionValues", request.partitionValues);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RenameTableResponse renameTable(RenameTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.renameTableWithOptions(request, headers, runtime);
    }

    public RenameTableResponse renameTableWithOptions(RenameTableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tableInput))) {
            body.put("TableInput", request.tableInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RevokePermissionsResponse revokePermissions(RevokePermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokePermissionsWithOptions(request, headers, runtime);
    }

    public RevokePermissionsResponse revokePermissionsWithOptions(RevokePermissionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.metaResource))) {
            body.put("MetaResource", request.metaResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.principal))) {
            body.put("Principal", request.principal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RevokeRoleFromUsersResponse revokeRoleFromUsers(RevokeRoleFromUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeRoleFromUsersWithOptions(request, headers, runtime);
    }

    public RevokeRoleFromUsersResponse revokeRoleFromUsersWithOptions(RevokeRoleFromUsersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RevokeRolesFromUserResponse revokeRolesFromUser(RevokeRolesFromUserRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.revokeRolesFromUserWithOptions(request, headers, runtime);
    }

    public RevokeRolesFromUserResponse revokeRolesFromUserWithOptions(RevokeRolesFromUserRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleNames)) {
            body.put("RoleNames", request.roleNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.user))) {
            body.put("User", request.user);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public RunMigrationWorkflowResponse runMigrationWorkflow(RunMigrationWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runMigrationWorkflowWithOptions(request, headers, runtime);
    }

    public RunMigrationWorkflowResponse runMigrationWorkflowWithOptions(RunMigrationWorkflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public StopMigrationWorkflowResponse stopMigrationWorkflow(StopMigrationWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopMigrationWorkflowWithOptions(request, headers, runtime);
    }

    public StopMigrationWorkflowResponse stopMigrationWorkflowWithOptions(StopMigrationWorkflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public SubmitQueryResponse submitQuery(SubmitQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.submitQueryWithOptions(request, headers, runtime);
    }

    public SubmitQueryResponse submitQueryWithOptions(SubmitQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            body.put("sql", request.sql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("workspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UnLockResponse unLock(UnLockRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.unLockWithOptions(request, headers, runtime);
    }

    public UnLockResponse unLockWithOptions(UnLockRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.lockId)) {
            query.put("LockId", request.lockId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateBlueprintInstanceResponse updateBlueprintInstance(UpdateBlueprintInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateBlueprintInstanceWithOptions(request, headers, runtime);
    }

    public UpdateBlueprintInstanceResponse updateBlueprintInstanceWithOptions(UpdateBlueprintInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.executeCapacity)) {
            body.put("ExecuteCapacity", request.executeCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeConcurrency)) {
            body.put("ExecuteConcurrency", request.executeConcurrency);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeParameters)) {
            body.put("ExecuteParameters", request.executeParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeType)) {
            body.put("ExecuteType", request.executeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateBlueprintInstance"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateBlueprintInstanceResponse());
    }

    public UpdateCatalogSettingsResponse updateCatalogSettings(UpdateCatalogSettingsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateCatalogSettingsWithOptions(request, headers, runtime);
    }

    public UpdateCatalogSettingsResponse updateCatalogSettingsWithOptions(UpdateCatalogSettingsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.catalogSettings))) {
            body.put("CatalogSettings", request.catalogSettings);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateDatabaseResponse updateDatabase(UpdateDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDatabaseWithOptions(request, headers, runtime);
    }

    public UpdateDatabaseResponse updateDatabaseWithOptions(UpdateDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.databaseInput))) {
            body.put("DatabaseInput", request.databaseInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateFunctionResponse updateFunction(UpdateFunctionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateFunctionWithOptions(request, headers, runtime);
    }

    public UpdateFunctionResponse updateFunctionWithOptions(UpdateFunctionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.functionInput))) {
            body.put("FunctionInput", request.functionInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.functionName)) {
            body.put("FunctionName", request.functionName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdatePartitionColumnStatisticsResponse updatePartitionColumnStatistics(UpdatePartitionColumnStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePartitionColumnStatisticsWithOptions(request, headers, runtime);
    }

    public UpdatePartitionColumnStatisticsResponse updatePartitionColumnStatisticsWithOptions(UpdatePartitionColumnStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.updateTablePartitionColumnStatisticsRequest)))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdatePermissionsResponse updatePermissions(UpdatePermissionsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updatePermissionsWithOptions(request, headers, runtime);
    }

    public UpdatePermissionsResponse updatePermissionsWithOptions(UpdatePermissionsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.metaResource))) {
            body.put("MetaResource", request.metaResource);
        }

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.principal))) {
            body.put("Principal", request.principal);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.type)) {
            body.put("Type", request.type);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateRoleResponse updateRole(UpdateRoleRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRoleWithOptions(request, headers, runtime);
    }

    public UpdateRoleResponse updateRoleWithOptions(UpdateRoleRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.roleInput))) {
            body.put("RoleInput", request.roleInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateRoleUsersResponse updateRoleUsers(UpdateRoleUsersRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateRoleUsersWithOptions(request, headers, runtime);
    }

    public UpdateRoleUsersResponse updateRoleUsersWithOptions(UpdateRoleUsersRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.users)) {
            body.put("Users", request.users);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateTableResponse updateTable(UpdateTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTableWithOptions(request, headers, runtime);
    }

    public UpdateTableResponse updateTableWithOptions(UpdateTableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(TeaModel.buildMap(request.tableInput))) {
            body.put("TableInput", request.tableInput);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public UpdateTableColumnStatisticsResponse updateTableColumnStatistics(UpdateTableColumnStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTableColumnStatisticsWithOptions(request, headers, runtime);
    }

    public UpdateTableColumnStatisticsResponse updateTableColumnStatisticsWithOptions(UpdateTableColumnStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(TeaModel.buildMap(request.updateTablePartitionColumnStatisticsRequest)))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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
}
