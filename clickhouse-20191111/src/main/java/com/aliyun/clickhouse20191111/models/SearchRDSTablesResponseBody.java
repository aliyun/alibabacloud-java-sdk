// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class SearchRDSTablesResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Schemas")
    public java.util.List<SearchRDSTablesResponseBodySchemas> schemas;

    public static SearchRDSTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchRDSTablesResponseBody self = new SearchRDSTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchRDSTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchRDSTablesResponseBody setSchemas(java.util.List<SearchRDSTablesResponseBodySchemas> schemas) {
        this.schemas = schemas;
        return this;
    }
    public java.util.List<SearchRDSTablesResponseBodySchemas> getSchemas() {
        return this.schemas;
    }

    public static class SearchRDSTablesResponseBodySchemas extends TeaModel {
        @NameInMap("DbName")
        public String dbName;

        @NameInMap("Tables")
        public java.util.List<String> tables;

        public static SearchRDSTablesResponseBodySchemas build(java.util.Map<String, ?> map) throws Exception {
            SearchRDSTablesResponseBodySchemas self = new SearchRDSTablesResponseBodySchemas();
            return TeaModel.build(map, self);
        }

        public SearchRDSTablesResponseBodySchemas setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public SearchRDSTablesResponseBodySchemas setTables(java.util.List<String> tables) {
            this.tables = tables;
            return this;
        }
        public java.util.List<String> getTables() {
            return this.tables;
        }

    }

}
