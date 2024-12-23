// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsPartitionsRequest extends TeaModel {
    @NameInMap("sorter")
    public ListMmsPartitionsRequestSorter sorter;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("dbId")
    public Long dbId;

    /**
     * <strong>example:</strong>
     * <p>d1</p>
     */
    @NameInMap("dbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>2024-12-17 19:44:42</p>
     */
    @NameInMap("lastDdlTimeEnd")
    public String lastDdlTimeEnd;

    /**
     * <strong>example:</strong>
     * <p>2024-12-17 15:44:42</p>
     */
    @NameInMap("lastDdlTimeStart")
    public String lastDdlTimeStart;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("status")
    public java.util.List<String> status;

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

    public static ListMmsPartitionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMmsPartitionsRequest self = new ListMmsPartitionsRequest();
        return TeaModel.build(map, self);
    }

    public ListMmsPartitionsRequest setSorter(ListMmsPartitionsRequestSorter sorter) {
        this.sorter = sorter;
        return this;
    }
    public ListMmsPartitionsRequestSorter getSorter() {
        return this.sorter;
    }

    public ListMmsPartitionsRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public ListMmsPartitionsRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListMmsPartitionsRequest setLastDdlTimeEnd(String lastDdlTimeEnd) {
        this.lastDdlTimeEnd = lastDdlTimeEnd;
        return this;
    }
    public String getLastDdlTimeEnd() {
        return this.lastDdlTimeEnd;
    }

    public ListMmsPartitionsRequest setLastDdlTimeStart(String lastDdlTimeStart) {
        this.lastDdlTimeStart = lastDdlTimeStart;
        return this;
    }
    public String getLastDdlTimeStart() {
        return this.lastDdlTimeStart;
    }

    public ListMmsPartitionsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListMmsPartitionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMmsPartitionsRequest setStatus(java.util.List<String> status) {
        this.status = status;
        return this;
    }
    public java.util.List<String> getStatus() {
        return this.status;
    }

    public ListMmsPartitionsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListMmsPartitionsRequest setUpdated(Boolean updated) {
        this.updated = updated;
        return this;
    }
    public Boolean getUpdated() {
        return this.updated;
    }

    public ListMmsPartitionsRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public static class ListMmsPartitionsRequestSorter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("lastDdlTime")
        public String lastDdlTime;

        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("numRows")
        public String numRows;

        /**
         * <strong>example:</strong>
         * <p>asc</p>
         */
        @NameInMap("size")
        public String size;

        public static ListMmsPartitionsRequestSorter build(java.util.Map<String, ?> map) throws Exception {
            ListMmsPartitionsRequestSorter self = new ListMmsPartitionsRequestSorter();
            return TeaModel.build(map, self);
        }

        public ListMmsPartitionsRequestSorter setLastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        public ListMmsPartitionsRequestSorter setNumRows(String numRows) {
            this.numRows = numRows;
            return this;
        }
        public String getNumRows() {
            return this.numRows;
        }

        public ListMmsPartitionsRequestSorter setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

}
