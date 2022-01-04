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

    public CheckBlueprintInstanceNameResponse checkBlueprintInstanceName(CheckBlueprintInstanceNameRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkBlueprintInstanceNameWithOptions(request, headers, runtime);
    }

    public CheckBlueprintInstanceNameResponse checkBlueprintInstanceNameWithOptions(CheckBlueprintInstanceNameRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckBlueprintInstanceName"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/checkName"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckBlueprintInstanceNameResponse());
    }

    public CheckConnectionResponse checkConnection(CheckConnectionRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkConnectionWithOptions(request, headers, runtime);
    }

    public CheckConnectionResponse checkConnectionWithOptions(CheckConnectionRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceId)) {
            query.put("DataSourceInstanceId", request.dataSourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            query.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            query.put("UserName", request.userName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckConnection"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/connectivity/connectionCheck"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckConnectionResponse());
    }

    public CheckConnectivityResponse checkConnectivity(CheckConnectivityRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.checkConnectivityWithOptions(request, headers, runtime);
    }

    public CheckConnectivityResponse checkConnectivityWithOptions(CheckConnectivityRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.bizId)) {
            body.put("BizId", request.bizId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceInstanceId)) {
            body.put("DataSourceInstanceId", request.dataSourceInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.password)) {
            body.put("Password", request.password);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.userName)) {
            body.put("UserName", request.userName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CheckConnectivity"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/connectivity/check"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CheckConnectivityResponse());
    }

    public CreateBlueprintInstanceResponse createBlueprintInstance(CreateBlueprintInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateBlueprintInstanceHeaders headers = new CreateBlueprintInstanceHeaders();
        return this.createBlueprintInstanceWithOptions(request, headers, runtime);
    }

    public CreateBlueprintInstanceResponse createBlueprintInstanceWithOptions(CreateBlueprintInstanceRequest request, CreateBlueprintInstanceHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blueprintType)) {
            body.put("BlueprintType", request.blueprintType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceConfig)) {
            body.put("DataSourceConfig", request.dataSourceConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeCapacity)) {
            body.put("ExecuteCapacity", request.executeCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeParameters)) {
            body.put("ExecuteParameters", request.executeParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeType)) {
            body.put("ExecuteType", request.executeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.preProcessingConfig)) {
            body.put("PreProcessingConfig", request.preProcessingConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDatabase)) {
            body.put("TargetDatabase", request.targetDatabase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetFormat)) {
            body.put("TargetFormat", request.targetFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetLocationUri)) {
            body.put("TargetLocationUri", request.targetLocationUri);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetPartitions)) {
            body.put("TargetPartitions", request.targetPartitions);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTable)) {
            body.put("TargetTable", request.targetTable);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.clientToken)) {
            realHeaders.put("ClientToken", com.aliyun.teautil.Common.toJSONString(headers.clientToken));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateBlueprintInstance"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateBlueprintInstanceResponse());
    }

    public CreateDataSourceResponse createDataSource(CreateDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        CreateDataSourceHeaders headers = new CreateDataSourceHeaders();
        return this.createDataSourceWithOptions(request, headers, runtime);
    }

    public CreateDataSourceResponse createDataSourceWithOptions(CreateDataSourceRequest request, CreateDataSourceHeaders headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionInfo)) {
            body.put("ConnectionInfo", request.connectionInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        java.util.Map<String, String> realHeaders = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(headers.commonHeaders)) {
            realHeaders = headers.commonHeaders;
        }

        if (!com.aliyun.teautil.Common.isUnset(headers.clientToken)) {
            realHeaders.put("ClientToken", com.aliyun.teautil.Common.toJSONString(headers.clientToken));
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", realHeaders),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateDataSource"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/datasource/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateDataSourceResponse());
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

    public CreateMetastoreCrawlerResponse createMetastoreCrawler(CreateMetastoreCrawlerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMetastoreCrawlerWithOptions(request, headers, runtime);
    }

    public CreateMetastoreCrawlerResponse createMetastoreCrawlerWithOptions(CreateMetastoreCrawlerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasourceExcludePath)) {
            body.put("DatasourceExcludePath", request.datasourceExcludePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourcePath)) {
            body.put("DatasourcePath", request.datasourcePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceType)) {
            body.put("DatasourceType", request.datasourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeCron)) {
            body.put("ExecuteCron", request.executeCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeMode)) {
            body.put("ExecuteMode", request.executeMode);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeType)) {
            body.put("ExecuteType", request.executeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFormat)) {
            body.put("FileFormat", request.fileFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFormatConfig)) {
            body.put("FileFormatConfig", request.fileFormatConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.immediatelyRun)) {
            body.put("ImmediatelyRun", request.immediatelyRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDatabase)) {
            body.put("TargetDatabase", request.targetDatabase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTablePrefix)) {
            body.put("TargetTablePrefix", request.targetTablePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUpdateStrategy)) {
            body.put("TargetUpdateStrategy", request.targetUpdateStrategy);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMetastoreCrawler"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/crawler/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMetastoreCrawlerResponse());
    }

    public CreateMetastoreMigrationResponse createMetastoreMigration(CreateMetastoreMigrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createMetastoreMigrationWithOptions(request, headers, runtime);
    }

    public CreateMetastoreMigrationResponse createMetastoreMigrationWithOptions(CreateMetastoreMigrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            body.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metastoreInfo)) {
            body.put("MetastoreInfo", request.metastoreInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metastoreType)) {
            body.put("MetastoreType", request.metastoreType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runOptions)) {
            body.put("RunOptions", request.runOptions);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateMetastoreMigration"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/migration/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateMetastoreMigrationResponse());
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

    public CreateSavedQueryResponse createSavedQuery(CreateSavedQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createSavedQueryWithOptions(request, headers, runtime);
    }

    public CreateSavedQueryResponse createSavedQueryWithOptions(CreateSavedQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.savedQueryId)) {
            body.put("SavedQueryId", request.savedQueryId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.sql)) {
            body.put("Sql", request.sql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateSavedQuery"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/query/createSavedQueryRequestBody"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateSavedQueryResponse());
    }

    public CreateStorageCollectorResponse createStorageCollector(CreateStorageCollectorRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createStorageCollectorWithOptions(request, headers, runtime);
    }

    public CreateStorageCollectorResponse createStorageCollectorWithOptions(CreateStorageCollectorRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasourceType)) {
            query.put("DatasourceType", request.datasourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateStorageCollector"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/storagecollect/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateStorageCollectorResponse());
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

    public CreateTpcdsDatabaseResponse createTpcdsDatabase(CreateTpcdsDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createTpcdsDatabaseWithOptions(request, headers, runtime);
    }

    public CreateTpcdsDatabaseResponse createTpcdsDatabaseWithOptions(CreateTpcdsDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", request.body)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateTpcdsDatabase"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/query/createTpcdsDatabase"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateTpcdsDatabaseResponse());
    }

    public CreateUserFeedbackResponse createUserFeedback(CreateUserFeedbackRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.createUserFeedbackWithOptions(request, headers, runtime);
    }

    public CreateUserFeedbackResponse createUserFeedbackWithOptions(CreateUserFeedbackRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.description)) {
            body.put("Description", request.description);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.score)) {
            body.put("Score", request.score);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tags)) {
            body.put("Tags", request.tags);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "CreateUserFeedback"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/feedback/create"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new CreateUserFeedbackResponse());
    }

    public DeleteBlueprintInstanceResponse deleteBlueprintInstance(DeleteBlueprintInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteBlueprintInstanceWithOptions(request, headers, runtime);
    }

    public DeleteBlueprintInstanceResponse deleteBlueprintInstanceWithOptions(DeleteBlueprintInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blueprintInstanceId)) {
            query.put("BlueprintInstanceId", request.blueprintInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteBlueprintInstance"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteBlueprintInstanceResponse());
    }

    public DeleteDataSourceResponse deleteDataSource(DeleteDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDataSourceWithOptions(request, headers, runtime);
    }

    public DeleteDataSourceResponse deleteDataSourceWithOptions(DeleteDataSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteDataSource"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/datasource/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteDataSourceResponse());
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

    public DeleteMetastoreCrawlerResponse deleteMetastoreCrawler(DeleteMetastoreCrawlerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMetastoreCrawlerWithOptions(request, headers, runtime);
    }

    public DeleteMetastoreCrawlerResponse deleteMetastoreCrawlerWithOptions(DeleteMetastoreCrawlerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crawlerId)) {
            query.put("CrawlerId", request.crawlerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteMetastoreCrawler"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/crawler/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetastoreCrawlerResponse());
    }

    public DeleteMetastoreMigrationResponse deleteMetastoreMigration(DeleteMetastoreMigrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteMetastoreMigrationWithOptions(request, headers, runtime);
    }

    public DeleteMetastoreMigrationResponse deleteMetastoreMigrationWithOptions(DeleteMetastoreMigrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "DeleteMetastoreMigration"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/migration/delete"),
            new TeaPair("method", "DELETE"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteMetastoreMigrationResponse());
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

    public DeleteSavedQueryResponse deleteSavedQuery(DeleteSavedQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteSavedQueryWithOptions(request, headers, runtime);
    }

    public DeleteSavedQueryResponse deleteSavedQueryWithOptions(DeleteSavedQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.savedQueryId)) {
            query.put("SavedQueryId", request.savedQueryId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DeleteSavedQuery"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/query/deleteSavedQuery"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DeleteSavedQueryResponse());
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

    public DescribeBlueprintInstanceResponse describeBlueprintInstance(DescribeBlueprintInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeBlueprintInstanceWithOptions(request, headers, runtime);
    }

    public DescribeBlueprintInstanceResponse describeBlueprintInstanceWithOptions(DescribeBlueprintInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blueprintInstanceId)) {
            query.put("BlueprintInstanceId", request.blueprintInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeBlueprintInstance"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/describe"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeBlueprintInstanceResponse());
    }

    public DescribeDataSourceResponse describeDataSource(DescribeDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeDataSourceWithOptions(request, headers, runtime);
    }

    public DescribeDataSourceResponse describeDataSourceWithOptions(DescribeDataSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeDataSource"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/datasource/describe"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeDataSourceResponse());
    }

    public DescribeMetastoreCrawlerResponse describeMetastoreCrawler(DescribeMetastoreCrawlerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.describeMetastoreCrawlerWithOptions(request, headers, runtime);
    }

    public DescribeMetastoreCrawlerResponse describeMetastoreCrawlerWithOptions(DescribeMetastoreCrawlerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crawlerId)) {
            query.put("CrawlerId", request.crawlerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "DescribeMetastoreCrawler"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/crawler/describe"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new DescribeMetastoreCrawlerResponse());
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

    public ExportQueryResultResponse exportQueryResult(ExportQueryResultRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.exportQueryResultWithOptions(request, headers, runtime);
    }

    public ExportQueryResultResponse exportQueryResultWithOptions(ExportQueryResultRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "ExportQueryResult"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/query/exportQueryResult"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ExportQueryResultResponse());
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

    public GetBlueprintInstanceResponse getBlueprintInstance(GetBlueprintInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getBlueprintInstanceWithOptions(request, headers, runtime);
    }

    public GetBlueprintInstanceResponse getBlueprintInstanceWithOptions(GetBlueprintInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blueprintInstanceId)) {
            query.put("BlueprintInstanceId", request.blueprintInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetBlueprintInstance"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/get"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetBlueprintInstanceResponse());
    }

    public GetDataSourceResponse getDataSource(GetDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getDataSourceWithOptions(request, headers, runtime);
    }

    public GetDataSourceResponse getDataSourceWithOptions(GetDataSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            query.put("DataSourceId", request.dataSourceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetDataSource"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/datasource/get"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetDataSourceResponse());
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

    public GetEtlResourceUsagesResponse getEtlResourceUsages(GetEtlResourceUsagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getEtlResourceUsagesWithOptions(request, headers, runtime);
    }

    public GetEtlResourceUsagesResponse getEtlResourceUsagesWithOptions(GetEtlResourceUsagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.months)) {
            query.put("Months", request.months);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetEtlResourceUsages"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/measure/getEtlResourceUsages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetEtlResourceUsagesResponse());
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

    public GetIndicatorDetailsResponse getIndicatorDetails(GetIndicatorDetailsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getIndicatorDetailsWithOptions(request, headers, runtime);
    }

    public GetIndicatorDetailsResponse getIndicatorDetailsWithOptions(GetIndicatorDetailsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dateRange)) {
            body.put("dateRange", request.dateRange);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.indicatorCodeList)) {
            body.put("indicatorCodeList", request.indicatorCodeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.timeUnit)) {
            body.put("timeUnit", request.timeUnit);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetIndicatorDetails"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/storageindicator/getIndicatorDetails"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetIndicatorDetailsResponse());
    }

    public GetLatestDateResponse getLatestDate() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getLatestDateWithOptions(headers, runtime);
    }

    public GetLatestDateResponse getLatestDateWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetLatestDate"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/storageindicator/getLatestDate"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetLatestDateResponse());
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

    public GetMetaDataApiCallUsagesResponse getMetaDataApiCallUsages(GetMetaDataApiCallUsagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMetaDataApiCallUsagesWithOptions(request, headers, runtime);
    }

    public GetMetaDataApiCallUsagesResponse getMetaDataApiCallUsagesWithOptions(GetMetaDataApiCallUsagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.months)) {
            query.put("Months", request.months);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaDataApiCallUsages"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/measure/getMetaDataApiCallUsages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaDataApiCallUsagesResponse());
    }

    public GetMetaDataStorageUsagesResponse getMetaDataStorageUsages(GetMetaDataStorageUsagesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMetaDataStorageUsagesWithOptions(request, headers, runtime);
    }

    public GetMetaDataStorageUsagesResponse getMetaDataStorageUsagesWithOptions(GetMetaDataStorageUsagesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.months)) {
            query.put("Months", request.months);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMetaDataStorageUsages"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/measure/getMetaDataStorageUsages"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetaDataStorageUsagesResponse());
    }

    public GetMetastoreMigrationResponse getMetastoreMigration(GetMetastoreMigrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMetastoreMigrationWithOptions(request, headers, runtime);
    }

    public GetMetastoreMigrationResponse getMetastoreMigrationWithOptions(GetMetastoreMigrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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
            new TeaPair("action", "GetMetastoreMigration"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/migration/get"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMetastoreMigrationResponse());
    }

    public GetMigrationWorkflowInstanceLogInfoResponse getMigrationWorkflowInstanceLogInfo(GetMigrationWorkflowInstanceLogInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getMigrationWorkflowInstanceLogInfoWithOptions(request, headers, runtime);
    }

    public GetMigrationWorkflowInstanceLogInfoResponse getMigrationWorkflowInstanceLogInfoWithOptions(GetMigrationWorkflowInstanceLogInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowInstanceId)) {
            query.put("FlowInstanceId", request.flowInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetMigrationWorkflowInstanceLogInfo"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/migration/workflow/log/get"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetMigrationWorkflowInstanceLogInfoResponse());
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

    public GetRdsDBInstanceAttributeResponse getRdsDBInstanceAttribute(GetRdsDBInstanceAttributeRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRdsDBInstanceAttributeWithOptions(request, headers, runtime);
    }

    public GetRdsDBInstanceAttributeResponse getRdsDBInstanceAttributeWithOptions(GetRdsDBInstanceAttributeRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.DBInstanceId)) {
            query.put("DBInstanceId", request.DBInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRdsDBInstanceAttribute"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resource/rds/getDBInstanceAttribute"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRdsDBInstanceAttributeResponse());
    }

    public GetRegionClusterInfoResponse getRegionClusterInfo() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getRegionClusterInfoWithOptions(headers, runtime);
    }

    public GetRegionClusterInfoResponse getRegionClusterInfoWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetRegionClusterInfo"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/profile/getRegionClusterInfo"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetRegionClusterInfoResponse());
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

    public GetStatisticsResponse getStatistics(GetStatisticsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStatisticsWithOptions(request, headers, runtime);
    }

    public GetStatisticsResponse getStatisticsWithOptions(GetStatisticsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.singleIndicatorList)) {
            body.put("singleIndicatorList", request.singleIndicatorList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStatistics"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/storageindicator/getStatistics"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "none")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStatisticsResponse());
    }

    public GetStorageAnalysisResponse getStorageAnalysis(GetStorageAnalysisRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStorageAnalysisWithOptions(request, headers, runtime);
    }

    public GetStorageAnalysisResponse getStorageAnalysisWithOptions(GetStorageAnalysisRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.analysisTypeList)) {
            body.put("analysisTypeList", request.analysisTypeList);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.date)) {
            body.put("date", request.date);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dbName)) {
            body.put("dbName", request.dbName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("tableName", request.tableName);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStorageAnalysis"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/storageindicator/getStorageAnalysis"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStorageAnalysisResponse());
    }

    public GetStorageRankResponse getStorageRank(GetStorageRankRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getStorageRankWithOptions(request, headers, runtime);
    }

    public GetStorageRankResponse getStorageRankWithOptions(GetStorageRankRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.order)) {
            body.put("order", request.order);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.rankType)) {
            body.put("rankType", request.rankType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetStorageRank"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/storageindicator/getStorageRank"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetStorageRankResponse());
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

    public GetWorkflowInstanceResponse getWorkflowInstance(GetWorkflowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.getWorkflowInstanceWithOptions(request, headers, runtime);
    }

    public GetWorkflowInstanceResponse getWorkflowInstanceWithOptions(GetWorkflowInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.flowInstanceId)) {
            query.put("FlowInstanceId", request.flowInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.projectId)) {
            query.put("ProjectId", request.projectId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "GetWorkflowInstance"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/getWorkflowInstance"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new GetWorkflowInstanceResponse());
    }

    public ListBlueprintInstanceCreatorsResponse listBlueprintInstanceCreators() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlueprintInstanceCreatorsWithOptions(headers, runtime);
    }

    public ListBlueprintInstanceCreatorsResponse listBlueprintInstanceCreatorsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBlueprintInstanceCreators"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/listBlueprintInstanceCreators"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBlueprintInstanceCreatorsResponse());
    }

    public ListBlueprintInstancesResponse listBlueprintInstances(ListBlueprintInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listBlueprintInstancesWithOptions(request, headers, runtime);
    }

    public ListBlueprintInstancesResponse listBlueprintInstancesWithOptions(ListBlueprintInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blueprintInstanceId)) {
            query.put("BlueprintInstanceId", request.blueprintInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.blueprintType)) {
            query.put("BlueprintType", request.blueprintType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.creatorUid)) {
            query.put("CreatorUid", request.creatorUid);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeType)) {
            query.put("ExecuteType", request.executeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.namePrefix)) {
            query.put("NamePrefix", request.namePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderCol)) {
            query.put("OrderCol", request.orderCol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListBlueprintInstances"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListBlueprintInstancesResponse());
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

    public ListCrawlerWorkflowInstanceResponse listCrawlerWorkflowInstance(ListCrawlerWorkflowInstanceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listCrawlerWorkflowInstanceWithOptions(request, headers, runtime);
    }

    public ListCrawlerWorkflowInstanceResponse listCrawlerWorkflowInstanceWithOptions(ListCrawlerWorkflowInstanceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crawlerId)) {
            query.put("CrawlerId", request.crawlerId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListCrawlerWorkflowInstance"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/crawler/workflow/listInstance"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListCrawlerWorkflowInstanceResponse());
    }

    public ListDataSourcesResponse listDataSources(ListDataSourcesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listDataSourcesWithOptions(request, headers, runtime);
    }

    public ListDataSourcesResponse listDataSourcesWithOptions(ListDataSourcesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderCol)) {
            query.put("OrderCol", request.orderCol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListDataSources"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/datasource/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListDataSourcesResponse());
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

    public ListMetastoreCrawlerResponse listMetastoreCrawler(ListMetastoreCrawlerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMetastoreCrawlerWithOptions(request, headers, runtime);
    }

    public ListMetastoreCrawlerResponse listMetastoreCrawlerWithOptions(ListMetastoreCrawlerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.creator)) {
            query.put("Creator", request.creator);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            query.put("DataSourceType", request.dataSourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeType)) {
            query.put("ExecuteType", request.executeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderCol)) {
            query.put("OrderCol", request.orderCol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMetastoreCrawler"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/crawler/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMetastoreCrawlerResponse());
    }

    public ListMetastoreCrawlerCreatorsResponse listMetastoreCrawlerCreators() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMetastoreCrawlerCreatorsWithOptions(headers, runtime);
    }

    public ListMetastoreCrawlerCreatorsResponse listMetastoreCrawlerCreatorsWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMetastoreCrawlerCreators"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/crawler/listCreators"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMetastoreCrawlerCreatorsResponse());
    }

    public ListMetastoreMigrationsResponse listMetastoreMigrations(ListMetastoreMigrationsRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMetastoreMigrationsWithOptions(request, headers, runtime);
    }

    public ListMetastoreMigrationsResponse listMetastoreMigrationsWithOptions(ListMetastoreMigrationsRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metastoreType)) {
            query.put("MetastoreType", request.metastoreType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderCol)) {
            query.put("OrderCol", request.orderCol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMetastoreMigrations"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/migration/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMetastoreMigrationsResponse());
    }

    public ListMigrationWorkflowInstancesResponse listMigrationWorkflowInstances(ListMigrationWorkflowInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listMigrationWorkflowInstancesWithOptions(request, headers, runtime);
    }

    public ListMigrationWorkflowInstancesResponse listMigrationWorkflowInstancesWithOptions(ListMigrationWorkflowInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            query.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderCol)) {
            query.put("OrderCol", request.orderCol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListMigrationWorkflowInstances"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/migration/workflow/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListMigrationWorkflowInstancesResponse());
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

    public ListQueryHistoryResponse listQueryHistory(ListQueryHistoryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listQueryHistoryWithOptions(request, headers, runtime);
    }

    public ListQueryHistoryResponse listQueryHistoryWithOptions(ListQueryHistoryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderCol)) {
            query.put("OrderCol", request.orderCol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.status)) {
            query.put("Status", request.status);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListQueryHistory"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/query/listQueryHistory"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListQueryHistoryResponse());
    }

    public ListRdsDBInstancesResponse listRdsDBInstances(ListRdsDBInstancesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listRdsDBInstancesWithOptions(request, headers, runtime);
    }

    public ListRdsDBInstancesResponse listRdsDBInstancesWithOptions(ListRdsDBInstancesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListRdsDBInstances"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/resource/rds/listDBInstances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListRdsDBInstancesResponse());
    }

    public ListSavedQueryResponse listSavedQuery(ListSavedQueryRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listSavedQueryWithOptions(request, headers, runtime);
    }

    public ListSavedQueryResponse listSavedQueryWithOptions(ListSavedQueryRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.keyword)) {
            query.put("Keyword", request.keyword);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderCol)) {
            query.put("OrderCol", request.orderCol);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.orderType)) {
            query.put("OrderType", request.orderType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListSavedQuery"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/query/listSavedQuery"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListSavedQueryResponse());
    }

    public ListStorageCollectorResponse listStorageCollector() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listStorageCollectorWithOptions(headers, runtime);
    }

    public ListStorageCollectorResponse listStorageCollectorWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListStorageCollector"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/storagecollect/list"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListStorageCollectorResponse());
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

    public ListWorkflowInstantencesResponse listWorkflowInstantences(ListWorkflowInstantencesRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkflowInstantencesWithOptions(request, headers, runtime);
    }

    public ListWorkflowInstantencesResponse listWorkflowInstantencesWithOptions(ListWorkflowInstantencesRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blueprintInstanceId)) {
            query.put("BlueprintInstanceId", request.blueprintInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageNumber)) {
            query.put("PageNumber", request.pageNumber);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.statusList)) {
            query.put("StatusList", request.statusList);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkflowInstantences"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/listWorkflowInstances"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkflowInstantencesResponse());
    }

    public ListWorkspacesResponse listWorkspaces() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.listWorkspacesWithOptions(headers, runtime);
    }

    public ListWorkspacesResponse listWorkspacesWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ListWorkspaces"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/query/listWorkspaces"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ListWorkspacesResponse());
    }

    public ModifyMetastoreCrawlerResponse modifyMetastoreCrawler(ModifyMetastoreCrawlerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyMetastoreCrawlerWithOptions(request, headers, runtime);
    }

    public ModifyMetastoreCrawlerResponse modifyMetastoreCrawlerWithOptions(ModifyMetastoreCrawlerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasourceExcludePath)) {
            body.put("DatasourceExcludePath", request.datasourceExcludePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeCron)) {
            body.put("ExecuteCron", request.executeCron);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeType)) {
            body.put("ExecuteType", request.executeType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFormat)) {
            body.put("FileFormat", request.fileFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFormatConfig)) {
            body.put("FileFormatConfig", request.fileFormatConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.id)) {
            body.put("Id", request.id);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.immediatelyRun)) {
            body.put("ImmediatelyRun", request.immediatelyRun);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUpdateStrategy)) {
            body.put("TargetUpdateStrategy", request.targetUpdateStrategy);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyMetastoreCrawler"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/crawler/modify"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyMetastoreCrawlerResponse());
    }

    public ModifyWorkflowExecuteInfoResponse modifyWorkflowExecuteInfo(ModifyWorkflowExecuteInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.modifyWorkflowExecuteInfoWithOptions(request, headers, runtime);
    }

    public ModifyWorkflowExecuteInfoResponse modifyWorkflowExecuteInfoWithOptions(ModifyWorkflowExecuteInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blueprintInstanceId)) {
            body.put("BlueprintInstanceId", request.blueprintInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeCapacity)) {
            body.put("ExecuteCapacity", request.executeCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeParameters)) {
            body.put("ExecuteParameters", request.executeParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeType)) {
            body.put("ExecuteType", request.executeType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "ModifyWorkflowExecuteInfo"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/modifyWorkflowExecuteInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new ModifyWorkflowExecuteInfoResponse());
    }

    public PreviewMetastoreCrawlerResponse previewMetastoreCrawler(PreviewMetastoreCrawlerRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.previewMetastoreCrawlerWithOptions(request, headers, runtime);
    }

    public PreviewMetastoreCrawlerResponse previewMetastoreCrawlerWithOptions(PreviewMetastoreCrawlerRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.datasourceExcludePath)) {
            body.put("DatasourceExcludePath", request.datasourceExcludePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourcePath)) {
            body.put("DatasourcePath", request.datasourcePath);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.datasourceType)) {
            body.put("DatasourceType", request.datasourceType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFormat)) {
            body.put("FileFormat", request.fileFormat);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.fileFormatConfig)) {
            body.put("FileFormatConfig", request.fileFormatConfig);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetDatabase)) {
            body.put("TargetDatabase", request.targetDatabase);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetTablePrefix)) {
            body.put("TargetTablePrefix", request.targetTablePrefix);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.targetUpdateStrategy)) {
            body.put("TargetUpdateStrategy", request.targetUpdateStrategy);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "PreviewMetastoreCrawler"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/crawler/preview"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new PreviewMetastoreCrawlerResponse());
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

    public RefreshUserSessionResponse refreshUserSession() throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.refreshUserSessionWithOptions(headers, runtime);
    }

    public RefreshUserSessionResponse refreshUserSessionWithOptions(java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers)
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RefreshUserSession"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/query/userSessionHeartbeat"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RefreshUserSessionResponse());
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

    public RunBlueprintInstanceWorkflowResponse runBlueprintInstanceWorkflow(RunBlueprintInstanceWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runBlueprintInstanceWorkflowWithOptions(request, headers, runtime);
    }

    public RunBlueprintInstanceWorkflowResponse runBlueprintInstanceWorkflowWithOptions(RunBlueprintInstanceWorkflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blueprintInstanceId)) {
            query.put("BlueprintInstanceId", request.blueprintInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunBlueprintInstanceWorkflow"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/runWorkflow"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunBlueprintInstanceWorkflowResponse());
    }

    public RunCrawlerWorkflowResponse runCrawlerWorkflow(RunCrawlerWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.runCrawlerWorkflowWithOptions(request, headers, runtime);
    }

    public RunCrawlerWorkflowResponse runCrawlerWorkflowWithOptions(RunCrawlerWorkflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crawlerId)) {
            body.put("CrawlerId", request.crawlerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "RunCrawlerWorkflow"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/crawler/workflow/run"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new RunCrawlerWorkflowResponse());
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

    public SearchResponse search(SearchRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.searchWithOptions(request, headers, runtime);
    }

    public SearchResponse searchWithOptions(SearchRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
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

        if (!com.aliyun.teautil.Common.isUnset(request.sortCriteria)) {
            body.put("SortCriteria", request.sortCriteria);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
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

    public StopBlueprintInstanceWorkflowResponse stopBlueprintInstanceWorkflow(StopBlueprintInstanceWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopBlueprintInstanceWorkflowWithOptions(request, headers, runtime);
    }

    public StopBlueprintInstanceWorkflowResponse stopBlueprintInstanceWorkflowWithOptions(StopBlueprintInstanceWorkflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blueprintInstanceId)) {
            query.put("BlueprintInstanceId", request.blueprintInstanceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopBlueprintInstanceWorkflow"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/stopWorkflow"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopBlueprintInstanceWorkflowResponse());
    }

    public StopCrawlerWorkflowResponse stopCrawlerWorkflow(StopCrawlerWorkflowRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.stopCrawlerWorkflowWithOptions(request, headers, runtime);
    }

    public StopCrawlerWorkflowResponse stopCrawlerWorkflowWithOptions(StopCrawlerWorkflowRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.crawlerId)) {
            body.put("CrawlerId", request.crawlerId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "StopCrawlerWorkflow"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/crawler/workflow/stop"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new StopCrawlerWorkflowResponse());
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
            body.put("Sql", request.sql);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            body.put("WorkspaceId", request.workspaceId);
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
            new TeaPair("reqBodyType", "formData"),
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

    public UpdateDataSourceResponse updateDataSource(UpdateDataSourceRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateDataSourceWithOptions(request, headers, runtime);
    }

    public UpdateDataSourceResponse updateDataSourceWithOptions(UpdateDataSourceRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.connectionInfo)) {
            body.put("ConnectionInfo", request.connectionInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceId)) {
            body.put("DataSourceId", request.dataSourceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.dataSourceType)) {
            body.put("DataSourceType", request.dataSourceType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateDataSource"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/datasource/update"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateDataSourceResponse());
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

    public UpdateMetastoreMigrationResponse updateMetastoreMigration(UpdateMetastoreMigrationRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateMetastoreMigrationWithOptions(request, headers, runtime);
    }

    public UpdateMetastoreMigrationResponse updateMetastoreMigrationWithOptions(UpdateMetastoreMigrationRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.desc)) {
            body.put("Desc", request.desc);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.instanceId)) {
            body.put("InstanceId", request.instanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metastoreInfo)) {
            body.put("MetastoreInfo", request.metastoreInfo);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.metastoreType)) {
            body.put("MetastoreType", request.metastoreType);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            body.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.roleName)) {
            body.put("RoleName", request.roleName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.runOptions)) {
            body.put("RunOptions", request.runOptions);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateMetastoreMigration"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/migration/update"),
            new TeaPair("method", "PUT"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateMetastoreMigrationResponse());
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

    public UpdateWorkflowExecuteInfoResponse updateWorkflowExecuteInfo(UpdateWorkflowExecuteInfoRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkflowExecuteInfoWithOptions(request, headers, runtime);
    }

    public UpdateWorkflowExecuteInfoResponse updateWorkflowExecuteInfoWithOptions(UpdateWorkflowExecuteInfoRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blueprintInstanceId)) {
            body.put("BlueprintInstanceId", request.blueprintInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeCapacity)) {
            body.put("ExecuteCapacity", request.executeCapacity);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeParameters)) {
            body.put("ExecuteParameters", request.executeParameters);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.executeType)) {
            body.put("ExecuteType", request.executeType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkflowExecuteInfo"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/updateWorkflowExecuteInfo"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "formData"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkflowExecuteInfoResponse());
    }

    public UpdateWorkflowScheduleStatusResponse updateWorkflowScheduleStatus(UpdateWorkflowScheduleStatusRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkflowScheduleStatusWithOptions(request, headers, runtime);
    }

    public UpdateWorkflowScheduleStatusResponse updateWorkflowScheduleStatusWithOptions(UpdateWorkflowScheduleStatusRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.blueprintInstanceId)) {
            query.put("BlueprintInstanceId", request.blueprintInstanceId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.underSchedule)) {
            query.put("UnderSchedule", request.underSchedule);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkflowScheduleStatus"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/blueprintinstance/updateWorkflowScheduleStatus"),
            new TeaPair("method", "GET"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkflowScheduleStatusResponse());
    }

    public UpdateWorkspaceConfigResponse updateWorkspaceConfig(UpdateWorkspaceConfigRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateWorkspaceConfigWithOptions(request, headers, runtime);
    }

    public UpdateWorkspaceConfigResponse updateWorkspaceConfigWithOptions(UpdateWorkspaceConfigRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.config)) {
            query.put("Config", request.config);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.workspaceId)) {
            query.put("WorkspaceId", request.workspaceId);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        Params params = Params.build(TeaConverter.buildMap(
            new TeaPair("action", "UpdateWorkspaceConfig"),
            new TeaPair("version", "2020-07-10"),
            new TeaPair("protocol", "HTTPS"),
            new TeaPair("pathname", "/webapi/query/updateWorkspaceConfig"),
            new TeaPair("method", "POST"),
            new TeaPair("authType", "AK"),
            new TeaPair("style", "ROA"),
            new TeaPair("reqBodyType", "json"),
            new TeaPair("bodyType", "json")
        ));
        return TeaModel.toModel(this.callApi(params, req, runtime), new UpdateWorkspaceConfigResponse());
    }
}
