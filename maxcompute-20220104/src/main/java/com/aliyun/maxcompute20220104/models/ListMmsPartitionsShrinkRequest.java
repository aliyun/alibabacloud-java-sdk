// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsPartitionsShrinkRequest extends TeaModel {
    @NameInMap("sorter")
    public ListMmsPartitionsShrinkRequestSorter sorter;

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
    public String statusShrink;

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

    public static ListMmsPartitionsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMmsPartitionsShrinkRequest self = new ListMmsPartitionsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMmsPartitionsShrinkRequest setSorter(ListMmsPartitionsShrinkRequestSorter sorter) {
        this.sorter = sorter;
        return this;
    }
    public ListMmsPartitionsShrinkRequestSorter getSorter() {
        return this.sorter;
    }

    public ListMmsPartitionsShrinkRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public ListMmsPartitionsShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListMmsPartitionsShrinkRequest setLastDdlTimeEnd(String lastDdlTimeEnd) {
        this.lastDdlTimeEnd = lastDdlTimeEnd;
        return this;
    }
    public String getLastDdlTimeEnd() {
        return this.lastDdlTimeEnd;
    }

    public ListMmsPartitionsShrinkRequest setLastDdlTimeStart(String lastDdlTimeStart) {
        this.lastDdlTimeStart = lastDdlTimeStart;
        return this;
    }
    public String getLastDdlTimeStart() {
        return this.lastDdlTimeStart;
    }

    public ListMmsPartitionsShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListMmsPartitionsShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMmsPartitionsShrinkRequest setStatusShrink(String statusShrink) {
        this.statusShrink = statusShrink;
        return this;
    }
    public String getStatusShrink() {
        return this.statusShrink;
    }

    public ListMmsPartitionsShrinkRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListMmsPartitionsShrinkRequest setUpdated(Boolean updated) {
        this.updated = updated;
        return this;
    }
    public Boolean getUpdated() {
        return this.updated;
    }

    public ListMmsPartitionsShrinkRequest setValue(String value) {
        this.value = value;
        return this;
    }
    public String getValue() {
        return this.value;
    }

    public static class ListMmsPartitionsShrinkRequestSorter extends TeaModel {
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

        public static ListMmsPartitionsShrinkRequestSorter build(java.util.Map<String, ?> map) throws Exception {
            ListMmsPartitionsShrinkRequestSorter self = new ListMmsPartitionsShrinkRequestSorter();
            return TeaModel.build(map, self);
        }

        public ListMmsPartitionsShrinkRequestSorter setLastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        public ListMmsPartitionsShrinkRequestSorter setNumRows(String numRows) {
            this.numRows = numRows;
            return this;
        }
        public String getNumRows() {
            return this.numRows;
        }

        public ListMmsPartitionsShrinkRequestSorter setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

}
