// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SearchResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("DatabaseResult")
    public SearchResponseBodyDatabaseResult databaseResult;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TableResult")
    public SearchResponseBodyTableResult tableResult;

    public static SearchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchResponseBody self = new SearchResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchResponseBody setDatabaseResult(SearchResponseBodyDatabaseResult databaseResult) {
        this.databaseResult = databaseResult;
        return this;
    }
    public SearchResponseBodyDatabaseResult getDatabaseResult() {
        return this.databaseResult;
    }

    public SearchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchResponseBody setTableResult(SearchResponseBodyTableResult tableResult) {
        this.tableResult = tableResult;
        return this;
    }
    public SearchResponseBodyTableResult getTableResult() {
        return this.tableResult;
    }

    public static class SearchResponseBodyDatabaseResultDatabases extends TeaModel {
        @NameInMap("Database")
        public Database database;

        @NameInMap("HighLightList")
        public java.util.List<HighLight> highLightList;

        public static SearchResponseBodyDatabaseResultDatabases build(java.util.Map<String, ?> map) throws Exception {
            SearchResponseBodyDatabaseResultDatabases self = new SearchResponseBodyDatabaseResultDatabases();
            return TeaModel.build(map, self);
        }

        public SearchResponseBodyDatabaseResultDatabases setDatabase(Database database) {
            this.database = database;
            return this;
        }
        public Database getDatabase() {
            return this.database;
        }

        public SearchResponseBodyDatabaseResultDatabases setHighLightList(java.util.List<HighLight> highLightList) {
            this.highLightList = highLightList;
            return this;
        }
        public java.util.List<HighLight> getHighLightList() {
            return this.highLightList;
        }

    }

    public static class SearchResponseBodyDatabaseResult extends TeaModel {
        @NameInMap("Databases")
        public java.util.List<SearchResponseBodyDatabaseResultDatabases> databases;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static SearchResponseBodyDatabaseResult build(java.util.Map<String, ?> map) throws Exception {
            SearchResponseBodyDatabaseResult self = new SearchResponseBodyDatabaseResult();
            return TeaModel.build(map, self);
        }

        public SearchResponseBodyDatabaseResult setDatabases(java.util.List<SearchResponseBodyDatabaseResultDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<SearchResponseBodyDatabaseResultDatabases> getDatabases() {
            return this.databases;
        }

        public SearchResponseBodyDatabaseResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class SearchResponseBodyTableResultTables extends TeaModel {
        @NameInMap("HighLightList")
        public java.util.List<HighLight> highLightList;

        @NameInMap("Table")
        public Table table;

        public static SearchResponseBodyTableResultTables build(java.util.Map<String, ?> map) throws Exception {
            SearchResponseBodyTableResultTables self = new SearchResponseBodyTableResultTables();
            return TeaModel.build(map, self);
        }

        public SearchResponseBodyTableResultTables setHighLightList(java.util.List<HighLight> highLightList) {
            this.highLightList = highLightList;
            return this;
        }
        public java.util.List<HighLight> getHighLightList() {
            return this.highLightList;
        }

        public SearchResponseBodyTableResultTables setTable(Table table) {
            this.table = table;
            return this;
        }
        public Table getTable() {
            return this.table;
        }

    }

    public static class SearchResponseBodyTableResult extends TeaModel {
        @NameInMap("Tables")
        public java.util.List<SearchResponseBodyTableResultTables> tables;

        @NameInMap("TotalCount")
        public Long totalCount;

        public static SearchResponseBodyTableResult build(java.util.Map<String, ?> map) throws Exception {
            SearchResponseBodyTableResult self = new SearchResponseBodyTableResult();
            return TeaModel.build(map, self);
        }

        public SearchResponseBodyTableResult setTables(java.util.List<SearchResponseBodyTableResultTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<SearchResponseBodyTableResultTables> getTables() {
            return this.tables;
        }

        public SearchResponseBodyTableResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
