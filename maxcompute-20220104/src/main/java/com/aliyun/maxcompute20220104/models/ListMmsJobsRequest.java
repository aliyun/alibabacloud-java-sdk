// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsJobsRequest extends TeaModel {
    @NameInMap("sorter")
    public ListMmsJobsRequestSorter sorter;

    /**
     * <strong>example:</strong>
     * <p>mms_test</p>
     */
    @NameInMap("dstDbName")
    public String dstDbName;

    /**
     * <strong>example:</strong>
     * <p>test_table_1</p>
     */
    @NameInMap("dstTableName")
    public String dstTableName;

    /**
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("name")
    public String name;

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
     * <p>test_db_1</p>
     */
    @NameInMap("srcDbName")
    public String srcDbName;

    /**
     * <strong>example:</strong>
     * <p>test_table_1</p>
     */
    @NameInMap("srcTableName")
    public String srcTableName;

    /**
     * <strong>example:</strong>
     * <p>DOING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("stopped")
    public Long stopped;

    public static ListMmsJobsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMmsJobsRequest self = new ListMmsJobsRequest();
        return TeaModel.build(map, self);
    }

    public ListMmsJobsRequest setSorter(ListMmsJobsRequestSorter sorter) {
        this.sorter = sorter;
        return this;
    }
    public ListMmsJobsRequestSorter getSorter() {
        return this.sorter;
    }

    public ListMmsJobsRequest setDstDbName(String dstDbName) {
        this.dstDbName = dstDbName;
        return this;
    }
    public String getDstDbName() {
        return this.dstDbName;
    }

    public ListMmsJobsRequest setDstTableName(String dstTableName) {
        this.dstTableName = dstTableName;
        return this;
    }
    public String getDstTableName() {
        return this.dstTableName;
    }

    public ListMmsJobsRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ListMmsJobsRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListMmsJobsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMmsJobsRequest setSrcDbName(String srcDbName) {
        this.srcDbName = srcDbName;
        return this;
    }
    public String getSrcDbName() {
        return this.srcDbName;
    }

    public ListMmsJobsRequest setSrcTableName(String srcTableName) {
        this.srcTableName = srcTableName;
        return this;
    }
    public String getSrcTableName() {
        return this.srcTableName;
    }

    public ListMmsJobsRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ListMmsJobsRequest setStopped(Long stopped) {
        this.stopped = stopped;
        return this;
    }
    public Long getStopped() {
        return this.stopped;
    }

    public static class ListMmsJobsRequestSorter extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("status")
        public String status;

        public static ListMmsJobsRequestSorter build(java.util.Map<String, ?> map) throws Exception {
            ListMmsJobsRequestSorter self = new ListMmsJobsRequestSorter();
            return TeaModel.build(map, self);
        }

        public ListMmsJobsRequestSorter setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
