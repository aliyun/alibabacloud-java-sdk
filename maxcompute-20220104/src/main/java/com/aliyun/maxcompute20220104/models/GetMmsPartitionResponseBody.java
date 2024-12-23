// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class GetMmsPartitionResponseBody extends TeaModel {
    @NameInMap("data")
    public GetMmsPartitionResponseBodyData data;

    /**
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
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("DbId")
        public Long dbId;

        /**
         * <strong>example:</strong>
         * <p>d1</p>
         */
        @NameInMap("dbName")
        public String dbName;

        /**
         * <strong>example:</strong>
         * <p>2323</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <p>lastDdlTime</p>
         * 
         * <strong>example:</strong>
         * <p>2024-12-17 15:44:42</p>
         */
        @NameInMap("lastDdlTime")
        public String lastDdlTime;

        /**
         * <strong>example:</strong>
         * <p>2323</p>
         */
        @NameInMap("numRows")
        public Long numRows;

        /**
         * <strong>example:</strong>
         * <p>12323</p>
         */
        @NameInMap("size")
        public Long size;

        /**
         * <strong>example:</strong>
         * <p>200018</p>
         */
        @NameInMap("sourceId")
        public Long sourceId;

        /**
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("sourceName")
        public String sourceName;

        /**
         * <strong>example:</strong>
         * <p>DONE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>23</p>
         */
        @NameInMap("tableId")
        public Long tableId;

        /**
         * <strong>example:</strong>
         * <p>t1</p>
         */
        @NameInMap("tableName")
        public String tableName;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("updated")
        public Boolean updated;

        /**
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
