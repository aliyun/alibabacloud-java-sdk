// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsPartitionsResponseBody extends TeaModel {
    @NameInMap("data")
    public ListMmsPartitionsResponseBodyData data;

    /**
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
         * <p>23223</p>
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
        @NameInMap("objectList")
        public java.util.List<ListMmsPartitionsResponseBodyDataObjectList> objectList;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageNum")
        public Integer pageNum;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
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
