// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class DiscoverEventSourceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DiscoverEventSourceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>C7043799-F4DA-5290-9249-97C35987****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DiscoverEventSourceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DiscoverEventSourceResponseBody self = new DiscoverEventSourceResponseBody();
        return TeaModel.build(map, self);
    }

    public DiscoverEventSourceResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DiscoverEventSourceResponseBody setData(DiscoverEventSourceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DiscoverEventSourceResponseBodyData getData() {
        return this.data;
    }

    public DiscoverEventSourceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DiscoverEventSourceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DiscoverEventSourceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchemaColumns extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>auto_increment</p>
         */
        @NameInMap("Extra")
        public String extra;

        /**
         * <strong>example:</strong>
         * <p>id</p>
         */
        @NameInMap("Field")
        public String field;

        /**
         * <strong>example:</strong>
         * <p>NO</p>
         */
        @NameInMap("IsNull")
        public String isNull;

        /**
         * <strong>example:</strong>
         * <p>PRI</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>int</p>
         */
        @NameInMap("Type")
        public String type;

        public static DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchemaColumns build(java.util.Map<String, ?> map) throws Exception {
            DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchemaColumns self = new DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchemaColumns();
            return TeaModel.build(map, self);
        }

        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchemaColumns setExtra(String extra) {
            this.extra = extra;
            return this;
        }
        public String getExtra() {
            return this.extra;
        }

        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchemaColumns setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchemaColumns setIsNull(String isNull) {
            this.isNull = isNull;
            return this;
        }
        public String getIsNull() {
            return this.isNull;
        }

        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchemaColumns setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchemaColumns setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchema extends TeaModel {
        @NameInMap("Columns")
        public java.util.List<DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchemaColumns> columns;

        /**
         * <strong>example:</strong>
         * <p>map</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchema build(java.util.Map<String, ?> map) throws Exception {
            DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchema self = new DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchema();
            return TeaModel.build(map, self);
        }

        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchema setColumns(java.util.List<DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchemaColumns> columns) {
            this.columns = columns;
            return this;
        }
        public java.util.List<DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchemaColumns> getColumns() {
            return this.columns;
        }

        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchema setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class DiscoverEventSourceResponseBodyDataSourceMySQLDiscovery extends TeaModel {
        @NameInMap("DatabaseNames")
        public java.util.List<String> databaseNames;

        @NameInMap("EstimatedRows")
        public Long estimatedRows;

        @NameInMap("ExpireLogsDays")
        public Integer expireLogsDays;

        /**
         * <strong>example:</strong>
         * <p>[{\&quot;is_active\&quot;:\&quot;1\&quot;,\&quot;name\&quot;:\&quot;0c0c5d1a-e844-44a8-902d-4f62cbcb0479\&quot;,\&quot;id\&quot;:\&quot;21\&quot;},{\&quot;is_active\&quot;:\&quot;1\&quot;,\&quot;name\&quot;:\&quot;18ef033e-70bb-4795-8222-6cfb54f38f26\&quot;,\&quot;id\&quot;:\&quot;22\&quot;}]</p>
         */
        @NameInMap("SimpleData")
        public String simpleData;

        @NameInMap("TableNames")
        public java.util.List<String> tableNames;

        @NameInMap("TableSchema")
        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchema tableSchema;

        @NameInMap("WaitTimeout")
        public Integer waitTimeout;

        public static DiscoverEventSourceResponseBodyDataSourceMySQLDiscovery build(java.util.Map<String, ?> map) throws Exception {
            DiscoverEventSourceResponseBodyDataSourceMySQLDiscovery self = new DiscoverEventSourceResponseBodyDataSourceMySQLDiscovery();
            return TeaModel.build(map, self);
        }

        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscovery setDatabaseNames(java.util.List<String> databaseNames) {
            this.databaseNames = databaseNames;
            return this;
        }
        public java.util.List<String> getDatabaseNames() {
            return this.databaseNames;
        }

        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscovery setEstimatedRows(Long estimatedRows) {
            this.estimatedRows = estimatedRows;
            return this;
        }
        public Long getEstimatedRows() {
            return this.estimatedRows;
        }

        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscovery setExpireLogsDays(Integer expireLogsDays) {
            this.expireLogsDays = expireLogsDays;
            return this;
        }
        public Integer getExpireLogsDays() {
            return this.expireLogsDays;
        }

        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscovery setSimpleData(String simpleData) {
            this.simpleData = simpleData;
            return this;
        }
        public String getSimpleData() {
            return this.simpleData;
        }

        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscovery setTableNames(java.util.List<String> tableNames) {
            this.tableNames = tableNames;
            return this;
        }
        public java.util.List<String> getTableNames() {
            return this.tableNames;
        }

        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscovery setTableSchema(DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchema tableSchema) {
            this.tableSchema = tableSchema;
            return this;
        }
        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscoveryTableSchema getTableSchema() {
            return this.tableSchema;
        }

        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscovery setWaitTimeout(Integer waitTimeout) {
            this.waitTimeout = waitTimeout;
            return this;
        }
        public Integer getWaitTimeout() {
            return this.waitTimeout;
        }

    }

    public static class DiscoverEventSourceResponseBodyData extends TeaModel {
        @NameInMap("SourceMySQLDiscovery")
        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscovery sourceMySQLDiscovery;

        public static DiscoverEventSourceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DiscoverEventSourceResponseBodyData self = new DiscoverEventSourceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DiscoverEventSourceResponseBodyData setSourceMySQLDiscovery(DiscoverEventSourceResponseBodyDataSourceMySQLDiscovery sourceMySQLDiscovery) {
            this.sourceMySQLDiscovery = sourceMySQLDiscovery;
            return this;
        }
        public DiscoverEventSourceResponseBodyDataSourceMySQLDiscovery getSourceMySQLDiscovery() {
            return this.sourceMySQLDiscovery;
        }

    }

}
