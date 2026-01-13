// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpcinstant20230701.models;

import com.aliyun.tea.*;

public class ListExecutorEventsResponseBody extends TeaModel {
    /**
     * <p>The list of the running event.</p>
     */
    @NameInMap("ExecutorEventList")
    public java.util.List<ListExecutorEventsResponseBodyExecutorEventList> executorEventList;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>896D338C-E4F4-41EC-A154-D605E5DE****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>40</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListExecutorEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListExecutorEventsResponseBody self = new ListExecutorEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListExecutorEventsResponseBody setExecutorEventList(java.util.List<ListExecutorEventsResponseBodyExecutorEventList> executorEventList) {
        this.executorEventList = executorEventList;
        return this;
    }
    public java.util.List<ListExecutorEventsResponseBodyExecutorEventList> getExecutorEventList() {
        return this.executorEventList;
    }

    public ListExecutorEventsResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListExecutorEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListExecutorEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListExecutorEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListExecutorEventsResponseBodyExecutorEventList extends TeaModel {
        /**
         * <p>The content of the running event.</p>
         * 
         * <strong>example:</strong>
         * <p>Executor created successfully</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The ID of the executor. The format is JobId-TaskName-ArrayIndex.</p>
         * 
         * <strong>example:</strong>
         * <p>job-xxxx-Task0-1</p>
         */
        @NameInMap("ExecutorId")
        public String executorId;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>job-xxxx</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The level of the running event. Valid values:</p>
         * <ul>
         * <li>Normal</li>
         * <li>Warning</li>
         * <li>Error</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The event of the running event.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-02-20 10:04:13</p>
         */
        @NameInMap("Time")
        public String time;

        public static ListExecutorEventsResponseBodyExecutorEventList build(java.util.Map<String, ?> map) throws Exception {
            ListExecutorEventsResponseBodyExecutorEventList self = new ListExecutorEventsResponseBodyExecutorEventList();
            return TeaModel.build(map, self);
        }

        public ListExecutorEventsResponseBodyExecutorEventList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public ListExecutorEventsResponseBodyExecutorEventList setExecutorId(String executorId) {
            this.executorId = executorId;
            return this;
        }
        public String getExecutorId() {
            return this.executorId;
        }

        public ListExecutorEventsResponseBodyExecutorEventList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListExecutorEventsResponseBodyExecutorEventList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListExecutorEventsResponseBodyExecutorEventList setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

}
