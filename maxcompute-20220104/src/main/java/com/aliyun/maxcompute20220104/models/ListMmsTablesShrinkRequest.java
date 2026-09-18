// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsTablesShrinkRequest extends TeaModel {
    @NameInMap("sorter")
    public ListMmsTablesShrinkRequestSorter sorter;

    /**
     * <p>The ID of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>197</p>
     */
    @NameInMap("dbId")
    public Long dbId;

    /**
     * <p>The name of the database.</p>
     * 
     * <strong>example:</strong>
     * <p>mms_test</p>
     */
    @NameInMap("dbName")
    public String dbName;

    /**
     * <p>The name of the destination MaxCompute table.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("dstName")
    public String dstName;

    /**
     * <p>The name of the destination MaxCompute project.</p>
     * 
     * <strong>example:</strong>
     * <p>mms_test</p>
     */
    @NameInMap("dstProjectName")
    public String dstProjectName;

    /**
     * <p>The name of the destination MaxCompute schema. This parameter is null if the destination MaxCompute project does not have a schema layer.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("dstSchemaName")
    public String dstSchemaName;

    /**
     * <p>The partitioned table.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("hasPartitions")
    public Boolean hasPartitions;

    /**
     * <p>The end of the time range for lastDdlTime.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-19 15:44:42</p>
     */
    @NameInMap("lastDdlTimeEnd")
    public String lastDdlTimeEnd;

    /**
     * <p>The start of the time range for lastDdlTime.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-12-17 15:44:42</p>
     */
    @NameInMap("lastDdlTimeStart")
    public String lastDdlTimeStart;

    /**
     * <p>The name of the table.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>Specifies whether to return only the names of the tables.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("onlyName")
    public Boolean onlyName;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The migration status.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("status")
    public String statusShrink;

    /**
     * <p>The table type.</p>
     * 
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

    public ListMmsTablesShrinkRequest setDstName(String dstName) {
        this.dstName = dstName;
        return this;
    }
    public String getDstName() {
        return this.dstName;
    }

    public ListMmsTablesShrinkRequest setDstProjectName(String dstProjectName) {
        this.dstProjectName = dstProjectName;
        return this;
    }
    public String getDstProjectName() {
        return this.dstProjectName;
    }

    public ListMmsTablesShrinkRequest setDstSchemaName(String dstSchemaName) {
        this.dstSchemaName = dstSchemaName;
        return this;
    }
    public String getDstSchemaName() {
        return this.dstSchemaName;
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
         * <p>The sort order for lastDdlTime.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("lastDdlTime")
        public String lastDdlTime;

        /**
         * <p>The sort order for the number of rows.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("numRows")
        public String numRows;

        /**
         * <p>The sort order for the data size.</p>
         * 
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
