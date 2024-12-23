// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsTablesShrinkRequest extends TeaModel {
    @NameInMap("sorter")
    public ListMmsTablesShrinkRequestSorter sorter;

    /**
     * <strong>example:</strong>
     * <p>197</p>
     */
    @NameInMap("dbId")
    public Long dbId;

    /**
     * <strong>example:</strong>
     * <p>mms_test</p>
     */
    @NameInMap("dbName")
    public String dbName;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasPartitions")
    public Boolean hasPartitions;

    /**
     * <strong>example:</strong>
     * <p>2024-12-19 15:44:42</p>
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
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("onlyName")
    public Boolean onlyName;

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

    @NameInMap("status")
    public String statusShrink;

    /**
     * <strong>example:</strong>
     * <p>MANAGED_TABLE</p>
     */
    @NameInMap("type")
    public String type;

    public static ListMmsTablesShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMmsTablesShrinkRequest self = new ListMmsTablesShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListMmsTablesShrinkRequest setSorter(ListMmsTablesShrinkRequestSorter sorter) {
        this.sorter = sorter;
        return this;
    }
    public ListMmsTablesShrinkRequestSorter getSorter() {
        return this.sorter;
    }

    public ListMmsTablesShrinkRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public ListMmsTablesShrinkRequest setDbName(String dbName) {
        this.dbName = dbName;
        return this;
    }
    public String getDbName() {
        return this.dbName;
    }

    public ListMmsTablesShrinkRequest setHasPartitions(Boolean hasPartitions) {
        this.hasPartitions = hasPartitions;
        return this;
    }
    public Boolean getHasPartitions() {
        return this.hasPartitions;
    }

    public ListMmsTablesShrinkRequest setLastDdlTimeEnd(String lastDdlTimeEnd) {
        this.lastDdlTimeEnd = lastDdlTimeEnd;
        return this;
    }
    public String getLastDdlTimeEnd() {
        return this.lastDdlTimeEnd;
    }

    public ListMmsTablesShrinkRequest setLastDdlTimeStart(String lastDdlTimeStart) {
        this.lastDdlTimeStart = lastDdlTimeStart;
        return this;
    }
    public String getLastDdlTimeStart() {
        return this.lastDdlTimeStart;
    }

    public ListMmsTablesShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMmsTablesShrinkRequest setOnlyName(Boolean onlyName) {
        this.onlyName = onlyName;
        return this;
    }
    public Boolean getOnlyName() {
        return this.onlyName;
    }

    public ListMmsTablesShrinkRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListMmsTablesShrinkRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMmsTablesShrinkRequest setStatusShrink(String statusShrink) {
        this.statusShrink = statusShrink;
        return this;
    }
    public String getStatusShrink() {
        return this.statusShrink;
    }

    public ListMmsTablesShrinkRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public static class ListMmsTablesShrinkRequestSorter extends TeaModel {
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

        public static ListMmsTablesShrinkRequestSorter build(java.util.Map<String, ?> map) throws Exception {
            ListMmsTablesShrinkRequestSorter self = new ListMmsTablesShrinkRequestSorter();
            return TeaModel.build(map, self);
        }

        public ListMmsTablesShrinkRequestSorter setLastDdlTime(String lastDdlTime) {
            this.lastDdlTime = lastDdlTime;
            return this;
        }
        public String getLastDdlTime() {
            return this.lastDdlTime;
        }

        public ListMmsTablesShrinkRequestSorter setNumRows(String numRows) {
            this.numRows = numRows;
            return this;
        }
        public String getNumRows() {
            return this.numRows;
        }

        public ListMmsTablesShrinkRequestSorter setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

    }

}
