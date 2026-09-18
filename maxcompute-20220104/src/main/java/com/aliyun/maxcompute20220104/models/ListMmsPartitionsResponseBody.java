// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsPartitionsResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("data")
    public ListMmsPartitionsResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D9F872FD-5DDE-30A6-8C8A-1B8C6A81059F</p>
     */
    @NameInMap("requestId")
    public String requestId;

    public static ListMmsPartitionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMmsPartitionsResponseBody self = new ListMmsPartitionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMmsPartitionsResponseBody setData(ListMmsPartitionsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListMmsPartitionsResponseBodyData getData() {
        return this.data;
    }

    public ListMmsPartitionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMmsPartitionsResponseBodyDataObjectList extends TeaModel {
        /**
         * <p>The ID of the database that contains the partition. The term &quot;database&quot; refers to different metadata layers across data sources. For example, it maps to Dataset in BigQuery, Database in Hive, Schema in Databricks, and Schema in MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>196</p>
         */
        @NameInMap("dbId")
        public Long dbId;

        /**
         * <p>The database name. The term &quot;database&quot; refers to different metadata layers across data sources. For example, it maps to Dataset in BigQuery, Database in Hive, Schema in Databricks, and Schema in MaxCompute.</p>
         * 
         * <strong>example:</strong>
         * <p>d1</p>
         */
        @NameInMap("dbName")
        public String dbName;

        /**
         * <p>The destination MaxCompute project name.</p>
         * 
         * <strong>example:</strong>
         * <p>mms_test</p>
         */
        @NameInMap("dstProjectName")
        public String dstProjectName;

        /**
         * <p>The destination MaxCompute schema name. This field is empty for MaxCompute projects that do not use schemas.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("dstSchemaName")
        public String dstSchemaName;

        /**
         * <p>The destination MaxCompute table name.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("dstTableName")
        public String dstTableName;

        /**
         * <p>The destination MaxCompute partition value. By default, this matches the source partition value.</p>
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
         * <p>The time when the DDL was last changed.</p>
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
         * <p>23223</p>
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
         * <p>Indicates whether the metadata has been updated.</p>
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

        public static ListMmsPartitionsResponseBodyDataObjectList build(java.util.Map<String, ?> map) throws Exception {
            ListMmsPartitionsResponseBodyDataObjectList self = new ListMmsPartitionsResponseBodyDataObjectList();
            return TeaModel.build(map, self);
        }

        public ListMmsPartitionsResponseBodyDataObjectList setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setDstProjectName(String dstProjectName) {
            this.dstProjectName = dstProjectName;
            return this;
        }
        public String getDstProjectName() {
            return this.dstProjectName;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setDstSchemaName(String dstSchemaName) {
            this.dstSchemaName = dstSchemaName;
            return this;
        }
        public String getDstSchemaName() {
            return this.dstSchemaName;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setDstTableName(String dstTableName) {
            this.dstTableName = dstTableName;
            return this;
        }
        public String getDstTableName() {
            return this.dstTableName;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setDstValue(String dstValue) {
            this.dstValue = dstValue;
            return this;
        }
        public String getDstValue() {
            return this.dstValue;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setLastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setNumRows(Long numRows) {
            this.numRows = numRows;
            return this;
        }
        public Long getNumRows() {
            return this.numRows;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setSourceId(Long sourceId) {
            this.sourceId = sourceId;
            return this;
        }
        public Long getSourceId() {
            return this.sourceId;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setSourceName(String sourceName) {
            this.sourceName = sourceName;
            return this;
        }
        public String getSourceName() {
            return this.sourceName;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setTableId(Long tableId) {
            this.tableId = tableId;
            return this;
        }
        public Long getTableId() {
            return this.tableId;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setUpdated(Boolean updated) {
            this.updated = updated;
            return this;
        }
        public Boolean getUpdated() {
            return this.updated;
        }

        public ListMmsPartitionsResponseBodyDataObjectList setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListMmsPartitionsResponseBodyData extends TeaModel {
        /**
         * <p>The list of partitions.</p>
         */
        @NameInMap("objectList")
        public java.util.List<ListMmsPartitionsResponseBodyDataObjectList> objectList;

        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNum")
        public Integer pageNum;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <p>The total number of partitions.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("total")
        public Integer total;

        public static ListMmsPartitionsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListMmsPartitionsResponseBodyData self = new ListMmsPartitionsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListMmsPartitionsResponseBodyData setObjectList(java.util.List<ListMmsPartitionsResponseBodyDataObjectList> objectList) {
            this.objectList = objectList;
            return this;
        }
        public java.util.List<ListMmsPartitionsResponseBodyDataObjectList> getObjectList() {
            return this.objectList;
        }

        public ListMmsPartitionsResponseBodyData setPageNum(Integer pageNum) {
            this.pageNum = pageNum;
            return this;
        }
        public Integer getPageNum() {
            return this.pageNum;
        }

        public ListMmsPartitionsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListMmsPartitionsResponseBodyData setTotal(Integer total) {
            this.total = total;
            return this;
        }
        public Integer getTotal() {
            return this.total;
        }

    }

}
