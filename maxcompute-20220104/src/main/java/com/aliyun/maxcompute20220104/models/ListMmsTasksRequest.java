// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.maxcompute20220104.models;

import com.aliyun.tea.*;

public class ListMmsTasksRequest extends TeaModel {
    @NameInMap("sorter")
    public ListMmsTasksRequestSorter sorter;

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
     * <p>The ID of the migration job.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("jobId")
    public Long jobId;

    /**
     * <p>The name of the job.</p>
     * 
     * <strong>example:</strong>
     * <p>test1</p>
     */
    @NameInMap("jobName")
    public String jobName;

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
     * <p>The partition value. This parameter is used to filter migration tasks by a specific partition value.</p>
     * 
     * <strong>example:</strong>
     * <p>p1=1/p2=abc</p>
     */
    @NameInMap("partition")
    public String partition;

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
     * <p>The status of the migration task.</p>
     * 
     * <strong>example:</strong>
     * <p>DATA_DOING</p>
     */
    @NameInMap("status")
    public String status;

    public static ListMmsTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMmsTasksRequest self = new ListMmsTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListMmsTasksRequest setSorter(ListMmsTasksRequestSorter sorter) {
        this.sorter = sorter;
        return this;
    }
    public ListMmsTasksRequestSorter getSorter() {
        return this.sorter;
    }

    public ListMmsTasksRequest setDstDbName(String dstDbName) {
        this.dstDbName = dstDbName;
        return this;
    }
    public String getDstDbName() {
        return this.dstDbName;
    }

    public ListMmsTasksRequest setDstTableName(String dstTableName) {
        this.dstTableName = dstTableName;
        return this;
    }
    public String getDstTableName() {
        return this.dstTableName;
    }

    public ListMmsTasksRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public ListMmsTasksRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public ListMmsTasksRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListMmsTasksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMmsTasksRequest setPartition(String partition) {
        this.partition = partition;
        return this;
    }
    public String getPartition() {
        return this.partition;
    }

    public ListMmsTasksRequest setSrcDbName(String srcDbName) {
        this.srcDbName = srcDbName;
        return this;
    }
    public String getSrcDbName() {
        return this.srcDbName;
    }

    public ListMmsTasksRequest setSrcTableName(String srcTableName) {
        this.srcTableName = srcTableName;
        return this;
    }
    public String getSrcTableName() {
        return this.srcTableName;
    }

    public ListMmsTasksRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ListMmsTasksRequestSorter extends TeaModel {
        /**
         * <p>Sorts tasks by start time.</p>
         * 
         * <strong>example:</strong>
         * <p>desc</p>
         */
        @NameInMap("startTime")
        public String startTime;

        /**
         * <p>Sorts tasks by status.</p>
         * 
         * <strong>example:</strong>
         * <p>asc</p>
         */
        @NameInMap("status")
        public String status;

        public static ListMmsTasksRequestSorter build(java.util.Map<String, ?> map) throws Exception {
            ListMmsTasksRequestSorter self = new ListMmsTasksRequestSorter();
            return TeaModel.build(map, self);
        }

        public ListMmsTasksRequestSorter setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListMmsTasksRequestSorter setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
