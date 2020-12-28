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
        this._endpointRule = "";
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
        return TeaModel.toModel(this.doROARequest("BatchCreatePartitions", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/partitions/batchcreate", "json", req, runtime), new BatchCreatePartitionsResponse());
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
        return TeaModel.toModel(this.doROARequest("ListPartitionNames", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/partitions/names", "json", req, runtime), new ListPartitionNamesResponse());
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
        return TeaModel.toModel(this.doROARequest("RenamePartition", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/partitions/rename", "json", req, runtime), new RenamePartitionResponse());
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
        return TeaModel.toModel(this.doROARequest("CreateFunction", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/functions", "json", req, runtime), new CreateFunctionResponse());
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
        return TeaModel.toModel(this.doROARequest("CreateTable", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables", "json", req, runtime), new CreateTableResponse());
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
        return TeaModel.toModel(this.doROARequest("BatchCreateTables", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/batchcreate", "json", req, runtime), new BatchCreateTablesResponse());
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
        return TeaModel.toModel(this.doROARequest("UpdateTableColumnStatistics", "2020-07-10", "HTTPS", "PUT", "AK", "/api/metastore/catalogs/databases/tables/columnstatistics", "json", req, runtime), new UpdateTableColumnStatisticsResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.tableNamePattern)) {
            query.put("TableNamePattern", request.tableNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableType)) {
            query.put("TableType", request.tableType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListTableNames", "2020-07-10", "HTTPS", "GET", "AK", "/api/metastore/catalogs/databases/tables/names", "json", req, runtime), new ListTableNamesResponse());
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
        return TeaModel.toModel(this.doROARequest("UpdateDatabase", "2020-07-10", "HTTPS", "PUT", "AK", "/api/metastore/catalogs/databases", "json", req, runtime), new UpdateDatabaseResponse());
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
        return TeaModel.toModel(this.doROARequest("BatchGetPartitions", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/partitions/batchget", "json", req, runtime), new BatchGetPartitionsResponse());
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
        return TeaModel.toModel(this.doROARequest("ListDatabases", "2020-07-10", "HTTPS", "GET", "AK", "/api/metastore/catalogs/databases/list", "json", req, runtime), new ListDatabasesResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnNamesShrink)) {
            query.put("ColumnNames", request.columnNamesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetTableColumnStatistics", "2020-07-10", "HTTPS", "GET", "AK", "/api/metastore/catalogs/databases/tables/columnstatistics", "json", req, runtime), new GetTableColumnStatisticsResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            body.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNames)) {
            body.put("PartitionNames", request.partitionNames);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnNames)) {
            body.put("ColumnNames", request.columnNames);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("BatchGetPartitionColumnStatistics", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/partitions/columnstatistics/batchget", "json", req, runtime), new BatchGetPartitionColumnStatisticsResponse());
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
        return TeaModel.toModel(this.doROARequest("ListFunctionNames", "2020-07-10", "HTTPS", "GET", "AK", "/api/metastore/catalogs/databases/functions/names", "json", req, runtime), new ListFunctionNamesResponse());
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
        return TeaModel.toModel(this.doROARequest("ListPartitionsByFilter", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/partitions/listbyfilter", "json", req, runtime), new ListPartitionsByFilterResponse());
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
        return TeaModel.toModel(this.doROARequest("UpdateFunction", "2020-07-10", "HTTPS", "PUT", "AK", "/api/metastore/catalogs/databases/functions", "json", req, runtime), new UpdateFunctionResponse());
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
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partitionNames)) {
            request.partitionNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partitionNames, "PartitionNames", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columnNames)) {
            request.columnNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columnNames, "ColumnNames", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNamesShrink)) {
            query.put("PartitionNames", request.partitionNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnNamesShrink)) {
            query.put("ColumnNames", request.columnNamesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("GetPartitionColumnStatistics", "2020-07-10", "HTTPS", "GET", "AK", "/api/metastore/catalogs/databases/tables/partitions/columnstatistics", "json", req, runtime), new GetPartitionColumnStatisticsResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.tableInputs)) {
            body.put("TableInputs", request.tableInputs);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("body", com.aliyun.openapiutil.Client.parseToMap(body))
        ));
        return TeaModel.toModel(this.doROARequest("BatchUpdateTables", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/batchupdate", "json", req, runtime), new BatchUpdateTablesResponse());
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
        return TeaModel.toModel(this.doROARequest("DeleteTableVersion", "2020-07-10", "HTTPS", "DELETE", "AK", "/api/metastore/catalogs/databases/tables/versions", "json", req, runtime), new DeleteTableVersionResponse());
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
        return TeaModel.toModel(this.doROARequest("UpdatePartitionColumnStatistics", "2020-07-10", "HTTPS", "PUT", "AK", "/api/metastore/catalogs/databases/tables/partitions/columnstatistics", "json", req, runtime), new UpdatePartitionColumnStatisticsResponse());
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
        return TeaModel.toModel(this.doROARequest("CreatePartition", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/partitions", "json", req, runtime), new CreatePartitionResponse());
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
        return TeaModel.toModel(this.doROARequest("ListPartitions", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/partitions/list", "json", req, runtime), new ListPartitionsResponse());
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
        return TeaModel.toModel(this.doROARequest("CreateDatabase", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases", "json", req, runtime), new CreateDatabaseResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnNamesShrink)) {
            query.put("ColumnNames", request.columnNamesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteTableColumnStatistics", "2020-07-10", "HTTPS", "DELETE", "AK", "/api/metastore/catalogs/databases/tables/columnstatistics", "json", req, runtime), new DeleteTableColumnStatisticsResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.tableName)) {
            query.put("TableName", request.tableName);
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
        return TeaModel.toModel(this.doROARequest("ListTableVersions", "2020-07-10", "HTTPS", "GET", "AK", "/api/metastore/catalogs/databases/tables/versions/list", "json", req, runtime), new ListTableVersionsResponse());
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
        if (!com.aliyun.teautil.Common.isUnset(tmpReq.partitionNames)) {
            request.partitionNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.partitionNames, "PartitionNames", "json");
        }

        if (!com.aliyun.teautil.Common.isUnset(tmpReq.columnNames)) {
            request.columnNamesShrink = com.aliyun.openapiutil.Client.arrayToStringWithSpecifiedStyle(tmpReq.columnNames, "ColumnNames", "json");
        }

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

        if (!com.aliyun.teautil.Common.isUnset(request.partitionNamesShrink)) {
            query.put("PartitionNames", request.partitionNamesShrink);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.columnNamesShrink)) {
            query.put("ColumnNames", request.columnNamesShrink);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeletePartitionColumnStatistics", "2020-07-10", "HTTPS", "DELETE", "AK", "/api/metastore/catalogs/databases/tables/partitions/columnstatistics", "json", req, runtime), new DeletePartitionColumnStatisticsResponse());
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
        return TeaModel.toModel(this.doROARequest("BatchUpdatePartitions", "2020-07-10", "HTTPS", "PUT", "AK", "/api/metastore/catalogs/databases/tables/partitions/batchupdate", "json", req, runtime), new BatchUpdatePartitionsResponse());
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
        return TeaModel.toModel(this.doROARequest("GetPartition", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/partitions/get", "json", req, runtime), new GetPartitionResponse());
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
        return TeaModel.toModel(this.doROARequest("BatchDeleteTableVersions", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/versions/batchdelete", "json", req, runtime), new BatchDeleteTableVersionsResponse());
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
        return TeaModel.toModel(this.doROARequest("BatchDeletePartitions", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/partitions/batchdelete", "json", req, runtime), new BatchDeletePartitionsResponse());
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
        return TeaModel.toModel(this.doROARequest("ListCatalogs", "2020-07-10", "HTTPS", "GET", "AK", "/api/metastore/catalogs/list", "json", req, runtime), new ListCatalogsResponse());
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
        return TeaModel.toModel(this.doROARequest("ListFunctions", "2020-07-10", "HTTPS", "GET", "AK", "/api/metastore/catalogs/databases/functions/list", "json", req, runtime), new ListFunctionsResponse());
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
        return TeaModel.toModel(this.doROARequest("DeleteTable", "2020-07-10", "HTTPS", "DELETE", "AK", "/api/metastore/catalogs/databases/tables", "json", req, runtime), new DeleteTableResponse());
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
        return TeaModel.toModel(this.doROARequest("GetTableVersion", "2020-07-10", "HTTPS", "GET", "AK", "/api/metastore/catalogs/databases/tables/versions", "json", req, runtime), new GetTableVersionResponse());
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
        return TeaModel.toModel(this.doROARequest("GetTable", "2020-07-10", "HTTPS", "GET", "AK", "/api/metastore/catalogs/databases/tables", "json", req, runtime), new GetTableResponse());
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
        return TeaModel.toModel(this.doROARequest("BatchDeleteTables", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/batchdelete", "json", req, runtime), new BatchDeleteTablesResponse());
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
        return TeaModel.toModel(this.doROARequest("RenameTable", "2020-07-10", "HTTPS", "PUT", "AK", "/api/metastore/catalogs/databases/tables/rename", "json", req, runtime), new RenameTableResponse());
    }

    public UpdateTableResponse updateTable(UpdateTableRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.updateTableWithOptions(request, headers, runtime);
    }

    public UpdateTableResponse updateTableWithOptions(UpdateTableRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> body = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            body.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            body.put("DatabaseName", request.databaseName);
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
        return TeaModel.toModel(this.doROARequest("UpdateTable", "2020-07-10", "HTTPS", "PUT", "AK", "/api/metastore/catalogs/databases/tables", "json", req, runtime), new UpdateTableResponse());
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
        return TeaModel.toModel(this.doROARequest("DeletePartition", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/partitions/delete", "json", req, runtime), new DeletePartitionResponse());
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

        if (!com.aliyun.teautil.Common.isUnset(request.tableNamePattern)) {
            query.put("TableNamePattern", request.tableNamePattern);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.nextPageToken)) {
            query.put("NextPageToken", request.nextPageToken);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.pageSize)) {
            query.put("PageSize", request.pageSize);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.databaseName)) {
            query.put("DatabaseName", request.databaseName);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.tableType)) {
            query.put("TableType", request.tableType);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("ListTables", "2020-07-10", "HTTPS", "GET", "AK", "/api/metastore/databases/tables/list", "json", req, runtime), new ListTablesResponse());
    }

    public DeleteDatabaseResponse deleteDatabase(DeleteDatabaseRequest request) throws Exception {
        RuntimeOptions runtime = new RuntimeOptions();
        java.util.Map<String, String> headers = new java.util.HashMap<>();
        return this.deleteDatabaseWithOptions(request, headers, runtime);
    }

    public DeleteDatabaseResponse deleteDatabaseWithOptions(DeleteDatabaseRequest request, java.util.Map<String, String> headers, RuntimeOptions runtime) throws Exception {
        com.aliyun.teautil.Common.validateModel(request);
        java.util.Map<String, Object> query = new java.util.HashMap<>();
        if (!com.aliyun.teautil.Common.isUnset(request.catalogId)) {
            query.put("CatalogId", request.catalogId);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.name)) {
            query.put("Name", request.name);
        }

        if (!com.aliyun.teautil.Common.isUnset(request.cascade)) {
            query.put("Cascade", request.cascade);
        }

        OpenApiRequest req = OpenApiRequest.build(TeaConverter.buildMap(
            new TeaPair("headers", headers),
            new TeaPair("query", com.aliyun.openapiutil.Client.query(query))
        ));
        return TeaModel.toModel(this.doROARequest("DeleteDatabase", "2020-07-10", "HTTPS", "DELETE", "AK", "/api/metastore/catalogs/databases", "json", req, runtime), new DeleteDatabaseResponse());
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
        return TeaModel.toModel(this.doROARequest("BatchGetTables", "2020-07-10", "HTTPS", "POST", "AK", "/api/metastore/catalogs/databases/tables/batchget", "json", req, runtime), new BatchGetTablesResponse());
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
        return TeaModel.toModel(this.doROARequest("DeleteFunction", "2020-07-10", "HTTPS", "DELETE", "AK", "/api/metastore/catalogs/databases/functions", "json", req, runtime), new DeleteFunctionResponse());
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
        return TeaModel.toModel(this.doROARequest("GetDatabase", "2020-07-10", "HTTPS", "GET", "AK", "/api/metastore/catalogs/databases", "json", req, runtime), new GetDatabaseResponse());
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
        return TeaModel.toModel(this.doROARequest("GetFunction", "2020-07-10", "HTTPS", "GET", "AK", "/api/metastore/catalogs/databases/functions", "json", req, runtime), new GetFunctionResponse());
    }
}
