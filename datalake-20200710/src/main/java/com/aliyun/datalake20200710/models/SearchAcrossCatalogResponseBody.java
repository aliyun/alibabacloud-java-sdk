// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class SearchAcrossCatalogResponseBody extends TeaModel {
    /**
     * <p>Returned Catalog result</p>
     */
    @NameInMap("CatalogResult")
    public SearchAcrossCatalogResponseBodyCatalogResult catalogResult;

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
    public SearchAcrossCatalogResponseBodyDatabaseResult databaseResult;

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
    public SearchAcrossCatalogResponseBodyTableResult tableResult;

    public static SearchAcrossCatalogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchAcrossCatalogResponseBody self = new SearchAcrossCatalogResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchAcrossCatalogResponseBody setCatalogResult(SearchAcrossCatalogResponseBodyCatalogResult catalogResult) {
        this.catalogResult = catalogResult;
        return this;
    }
    public SearchAcrossCatalogResponseBodyCatalogResult getCatalogResult() {
        return this.catalogResult;
    }

    public SearchAcrossCatalogResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SearchAcrossCatalogResponseBody setDatabaseResult(SearchAcrossCatalogResponseBodyDatabaseResult databaseResult) {
        this.databaseResult = databaseResult;
        return this;
    }
    public SearchAcrossCatalogResponseBodyDatabaseResult getDatabaseResult() {
        return this.databaseResult;
    }

    public SearchAcrossCatalogResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchAcrossCatalogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchAcrossCatalogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchAcrossCatalogResponseBody setTableResult(SearchAcrossCatalogResponseBodyTableResult tableResult) {
        this.tableResult = tableResult;
        return this;
    }
    public SearchAcrossCatalogResponseBodyTableResult getTableResult() {
        return this.tableResult;
    }

    public static class SearchAcrossCatalogResponseBodyCatalogResultCatalogs extends TeaModel {
        /**
         * <p>Catalog details</p>
         */
        @NameInMap("Catalog")
        public Catalog catalog;

        /**
         * <p>Return highlighted text</p>
         */
        @NameInMap("HighLightList")
        public java.util.List<HighLight> highLightList;

        public static SearchAcrossCatalogResponseBodyCatalogResultCatalogs build(java.util.Map<String, ?> map) throws Exception {
            SearchAcrossCatalogResponseBodyCatalogResultCatalogs self = new SearchAcrossCatalogResponseBodyCatalogResultCatalogs();
            return TeaModel.build(map, self);
        }

        public SearchAcrossCatalogResponseBodyCatalogResultCatalogs setCatalog(Catalog catalog) {
            this.catalog = catalog;
            return this;
        }
        public Catalog getCatalog() {
            return this.catalog;
        }

        public SearchAcrossCatalogResponseBodyCatalogResultCatalogs setHighLightList(java.util.List<HighLight> highLightList) {
            this.highLightList = highLightList;
            return this;
        }
        public java.util.List<HighLight> getHighLightList() {
            return this.highLightList;
        }

    }

    public static class SearchAcrossCatalogResponseBodyCatalogResult extends TeaModel {
        /**
         * <p>Catalog details</p>
         */
        @NameInMap("Catalogs")
        public java.util.List<SearchAcrossCatalogResponseBodyCatalogResultCatalogs> catalogs;

        /**
         * <p>Total number of catalogs that meet the match conditions</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static SearchAcrossCatalogResponseBodyCatalogResult build(java.util.Map<String, ?> map) throws Exception {
            SearchAcrossCatalogResponseBodyCatalogResult self = new SearchAcrossCatalogResponseBodyCatalogResult();
            return TeaModel.build(map, self);
        }

        public SearchAcrossCatalogResponseBodyCatalogResult setCatalogs(java.util.List<SearchAcrossCatalogResponseBodyCatalogResultCatalogs> catalogs) {
            this.catalogs = catalogs;
            return this;
        }
        public java.util.List<SearchAcrossCatalogResponseBodyCatalogResultCatalogs> getCatalogs() {
            return this.catalogs;
        }

        public SearchAcrossCatalogResponseBodyCatalogResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class SearchAcrossCatalogResponseBodyDatabaseResultDatabases extends TeaModel {
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

        public static SearchAcrossCatalogResponseBodyDatabaseResultDatabases build(java.util.Map<String, ?> map) throws Exception {
            SearchAcrossCatalogResponseBodyDatabaseResultDatabases self = new SearchAcrossCatalogResponseBodyDatabaseResultDatabases();
            return TeaModel.build(map, self);
        }

        public SearchAcrossCatalogResponseBodyDatabaseResultDatabases setDatabase(Database database) {
            this.database = database;
            return this;
        }
        public Database getDatabase() {
            return this.database;
        }

        public SearchAcrossCatalogResponseBodyDatabaseResultDatabases setHighLightList(java.util.List<HighLight> highLightList) {
            this.highLightList = highLightList;
            return this;
        }
        public java.util.List<HighLight> getHighLightList() {
            return this.highLightList;
        }

    }

    public static class SearchAcrossCatalogResponseBodyDatabaseResult extends TeaModel {
        /**
         * <p>Returned DatabaseList</p>
         */
        @NameInMap("Databases")
        public java.util.List<SearchAcrossCatalogResponseBodyDatabaseResultDatabases> databases;

        /**
         * <p>Total number of databases that meet the match conditions</p>
         * 
         * <strong>example:</strong>
         * <p>11000</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static SearchAcrossCatalogResponseBodyDatabaseResult build(java.util.Map<String, ?> map) throws Exception {
            SearchAcrossCatalogResponseBodyDatabaseResult self = new SearchAcrossCatalogResponseBodyDatabaseResult();
            return TeaModel.build(map, self);
        }

        public SearchAcrossCatalogResponseBodyDatabaseResult setDatabases(java.util.List<SearchAcrossCatalogResponseBodyDatabaseResultDatabases> databases) {
            this.databases = databases;
            return this;
        }
        public java.util.List<SearchAcrossCatalogResponseBodyDatabaseResultDatabases> getDatabases() {
            return this.databases;
        }

        public SearchAcrossCatalogResponseBodyDatabaseResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

    public static class SearchAcrossCatalogResponseBodyTableResultTables extends TeaModel {
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

        public static SearchAcrossCatalogResponseBodyTableResultTables build(java.util.Map<String, ?> map) throws Exception {
            SearchAcrossCatalogResponseBodyTableResultTables self = new SearchAcrossCatalogResponseBodyTableResultTables();
            return TeaModel.build(map, self);
        }

        public SearchAcrossCatalogResponseBodyTableResultTables setHighLightList(java.util.List<HighLight> highLightList) {
            this.highLightList = highLightList;
            return this;
        }
        public java.util.List<HighLight> getHighLightList() {
            return this.highLightList;
        }

        public SearchAcrossCatalogResponseBodyTableResultTables setTable(Table table) {
            this.table = table;
            return this;
        }
        public Table getTable() {
            return this.table;
        }

    }

    public static class SearchAcrossCatalogResponseBodyTableResult extends TeaModel {
        /**
         * <p>Returned TableList</p>
         */
        @NameInMap("Tables")
        public java.util.List<SearchAcrossCatalogResponseBodyTableResultTables> tables;

        /**
         * <p>The total number of tables that meet the match conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static SearchAcrossCatalogResponseBodyTableResult build(java.util.Map<String, ?> map) throws Exception {
            SearchAcrossCatalogResponseBodyTableResult self = new SearchAcrossCatalogResponseBodyTableResult();
            return TeaModel.build(map, self);
        }

        public SearchAcrossCatalogResponseBodyTableResult setTables(java.util.List<SearchAcrossCatalogResponseBodyTableResultTables> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<SearchAcrossCatalogResponseBodyTableResultTables> getTables() {
            return this.tables;
        }

        public SearchAcrossCatalogResponseBodyTableResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
