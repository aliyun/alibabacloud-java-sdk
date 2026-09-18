// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsPartitionResponseBody extends TeaModel {
    /**
     * <p>The partition object.</p>
     */
    @NameInMap("data")
    public GetMmsPartitionResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9F872FD-5DDE-30A6-8C8A-1B8C6A81059F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static GetMmsPartitionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMmsPartitionResponseBody self = new GetMmsPartitionResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMmsPartitionResponseBody setData(GetMmsPartitionResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMmsPartitionResponseBodyData getData() {
        return this.data;
    }

    public GetMmsPartitionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMmsPartitionResponseBodyData extends TeaModel {
        /**
         * <p>The ID of the database that contains the partition. The name for this metadata layer depends on the data source. For example, it is a Dataset in BigQuery, a Database in Hive, or a Schema in Databricks and MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("dbId")
        public Long dbId;

        /**
         * <p>The name of the database. The name for this metadata layer depends on the data source. For example, it is a Dataset in BigQuery, a Database in Hive, or a Schema in Databricks and MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>d1</p>
         */
        @NameInMap("dbName")
        public String dbName;

        /**
         * <p>The name of the destination MaxCompute project.</p>
         * 
         * <strong>example:</strong>
         * <p>mms_test</p>
         */
        @NameInMap("dstProjectName")
        public String dstProjectName;

        /**
         * <p>The name of the destination MaxCompute schema. This parameter is null if the destination MaxCompute project does not use a schema layer.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("dstSchemaName")
        public String dstSchemaName;

        /**
         * <p>The name of the destination MaxCompute table.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("dstTableName")
        public String dstTableName;

        /**
         * <p>The value of the destination MaxCompute partition. By default, this value is the same as the source partition value.</p>
         * 
         * <strong>example:</strong>
         * <p>p1=1/p2=abc</p>
         */
        @NameInMap("dstValue")
        public String dstValue;

        /**
         * <p>The partition ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2323</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>The time of the last DDL operation.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:42</p>
         */
        @NameInMap("lastDdlTime")
        public String lastDdlTime;

        /**
         * <p>The number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>2323</p>
         */
        @NameInMap("numRows")
        public Long numRows;

        /**
         * <p>The data size in bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>12323</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <p>The data source ID.</p>
         * 
         * <strong>example:</strong>
         * <p>200018</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <p>The data source name.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("sourceName")
        public String sourceName;

        /**
         * <p>The migration status.</p>
         * 
         * <strong>example:</strong>
         * <p>DONE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The table ID.</p>
         * 
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("tableId")
        public Long tableId;

        /**
         * <p>The table name.</p>
         * 
         * <strong>example:</strong>
         * <p>t1</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <p>Indicates whether the metadata is updated.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("updated")
        public Boolean updated;

        /**
         * <p>The partition value.</p>
         * 
         * <strong>example:</strong>
         * <p>p1=1/p2=abc</p>
         */
        @NameInMap("value")
        public String value;

        public static GetMmsPartitionResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMmsPartitionResponseBodyData self = new GetMmsPartitionResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMmsPartitionResponseBodyData setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetMmsPartitionResponseBodyData setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetMmsPartitionResponseBodyData setDstProjectName(String dstProjectName) {
            this.dstProjectName = dstProjectName;
            return this;
        }
        public String getDstProjectName() {
            return this.dstProjectName;
        }

        public GetMmsPartitionResponseBodyData setDstSchemaName(String dstSchemaName) {
            this.dstSchemaName = dstSchemaName;
            return this;
        }
        public String getDstSchemaName() {
            return this.dstSchemaName;
        }

        public GetMmsPartitionResponseBodyData setDstTableName(String dstTableName) {
            this.dstTableName = dstTableName;
            return this;
        }
        public String getDstTableName() {
            return this.dstTableName;
        }

        public GetMmsPartitionResponseBodyData setDstValue(String dstValue) {
            this.dstValue = dstValue;
            return this;
        }
        public String getDstValue() {
            return this.dstValue;
        }

        public GetMmsPartitionResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetMmsPartitionResponseBodyData setLastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        public GetMmsPartitionResponseBodyData setNumRows(Long numRows) {
            this.numRows = numRows;
            return this;
        }
        public Long getNumRows() {
            return this.numRows;
        }

        public GetMmsPartitionResponseBodyData setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public GetMmsPartitionResponseBodyData setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public GetMmsPartitionResponseBodyData setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public GetMmsPartitionResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMmsPartitionResponseBodyData setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

        public GetMmsPartitionResponseBodyData setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetMmsPartitionResponseBodyData setUpdated(Boolean updated) {
            this.updated = updated;
            return this;
        }
        public Boolean getUpdated() {
            return this.updated;
        }

        public GetMmsPartitionResponseBodyData setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
