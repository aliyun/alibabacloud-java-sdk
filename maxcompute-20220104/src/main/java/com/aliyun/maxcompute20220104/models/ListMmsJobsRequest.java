// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsJobsRequest extends TeaModel {
    @NameInMap("sorter")
    public ListMmsJobsRequestSorter sorter;

    /**
     * <p>The destination MaxCompute project.</p>
     * 
     * <strong>example:</strong>
     * <p>mms_test</p>
     */
    @NameInMap("dstDbName")
    public String dstDbName;

    /**
     * <p>The destination MaxCompute table.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table_1</p>
     */
    @NameInMap("dstTableName")
    public String dstTableName;

    /**
     * <p>The name of the data source.</p>
     * 
     * <strong>example:</strong>
     * <p>demo</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>The number of the page to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNum")
    public Integer pageNum;

    /**
     * <p>The number of items to return per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The name of the source database.</p>
     * 
     * <strong>example:</strong>
     * <p>test_db_1</p>
     */
    @NameInMap("srcDbName")
    public String srcDbName;

    /**
     * <p>The name of the source table.</p>
     * 
     * <strong>example:</strong>
     * <p>test_table_1</p>
     */
    @NameInMap("srcTableName")
    public String srcTableName;

    /**
     * <p>The status of the migration job.</p>
     * 
     * <strong>example:</strong>
     * <p>DOING</p>
     */
    @NameInMap("status")
    public String status;

    /**
     * <p>Indicates whether the job is stopped.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("stopped")
    public Long stopped;

    /**
     * <p>The timer ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("timerId")
    public Long timerId;

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

    public ListMmsJobsRequest setTimerId(Long timerId) {
        this.timerId = timerId;
        return this;
    }
    public Long getTimerId() {
        return this.timerId;
    }

    public static class ListMmsJobsRequestSorter extends TeaModel {
        /**
         * <p>Sorting by status</p>
         * 
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
