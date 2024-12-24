// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SearchResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned db result.</p>
     */
    @NameInMap("DatabaseResult")
    public SearchResponseBodyDatabaseResult databaseResult;

    /**
     * <p>Response</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;&quot;</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>460C862F-BB91-5C04-BC3F-946EEF467862</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the information about the service was queried.</p>
     * 
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The returned table result.</p>
     */
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
        /**
         * <p>Returned Database</p>
         */
        @NameInMap("Database")
        public Database database;

        /**
         * <p>Return highlighted text</p>
         */
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
        /**
         * <p>Returned DatabaseList</p>
         */
        @NameInMap("Databases")
        public java.util.List<SearchResponseBodyDatabaseResultDatabases> databases;

        /**
         * <p>Total number of databases that meet the match conditions</p>
         * 
         * <strong>example:</strong>
         * <p>11000</p>
         */
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
        /**
         * <p>Returned highlighted text</p>
         */
        @NameInMap("HighLightList")
        public java.util.List<HighLight> highLightList;

        /**
         * <p>Returned Table</p>
         */
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
        /**
         * <p>Returned TableList</p>
         */
        @NameInMap("Tables")
        public java.util.List<SearchResponseBodyTableResultTables> tables;

        /**
         * <p>The total number of tables that meet the match conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1100</p>
         */
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
