// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20240518.models;

import com.aliyun.tea.*;

public class ListCrawlerRunsResponseBody extends TeaModel {
    /**
     * <p>The pagination information.</p>
     */
    @NameInMap("PagingInfo")
    public ListCrawlerRunsResponseBodyPagingInfo pagingInfo;

    /**
     * <p>The request ID. Used for locating logs and troubleshooting issues.</p>
     * 
     * <strong>example:</strong>
     * <p>9252F32F-D855-549E-8898-61CF5A733050</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListCrawlerRunsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCrawlerRunsResponseBody self = new ListCrawlerRunsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCrawlerRunsResponseBody setPagingInfo(ListCrawlerRunsResponseBodyPagingInfo pagingInfo) {
        this.pagingInfo = pagingInfo;
        return this;
    }
    public ListCrawlerRunsResponseBodyPagingInfo getPagingInfo() {
        return this.pagingInfo;
    }

    public ListCrawlerRunsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCrawlerRunsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCrawlerRunsResponseBodyPagingInfoCrawlerRuns extends TeaModel {
        /**
         * <p>The run duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>The end time, in millisecond-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239065403</p>
         */
        @NameInMap("FinishedTime")
        public Long finishedTime;

        /**
         * <p>The start time, in millisecond-level UNIX timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1710239005403</p>
         */
        @NameInMap("StartedTime")
        public Long startedTime;

        /**
         * <p>The run status. Valid values: WAITING, RUNNING, SUCCESS, ERROR, SHUTDOWN.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The DataWorks task instance ID associated with this run.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TaskInstanceId")
        public Long taskInstanceId;

        /**
         * <p>The total number of tables involved in this run.</p>
         * 
         * <strong>example:</strong>
         * <p>42</p>
         */
        @NameInMap("TotalTableCount")
        public Long totalTableCount;

        public static ListCrawlerRunsResponseBodyPagingInfoCrawlerRuns build(java.util.Map<String, ?> map) throws Exception {
            ListCrawlerRunsResponseBodyPagingInfoCrawlerRuns self = new ListCrawlerRunsResponseBodyPagingInfoCrawlerRuns();
            return TeaModel.build(map, self);
        }

        public ListCrawlerRunsResponseBodyPagingInfoCrawlerRuns setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public ListCrawlerRunsResponseBodyPagingInfoCrawlerRuns setFinishedTime(Long finishedTime) {
            this.finishedTime = finishedTime;
            return this;
        }
        public Long getFinishedTime() {
            return this.finishedTime;
        }

        public ListCrawlerRunsResponseBodyPagingInfoCrawlerRuns setStartedTime(Long startedTime) {
            this.startedTime = startedTime;
            return this;
        }
        public Long getStartedTime() {
            return this.startedTime;
        }

        public ListCrawlerRunsResponseBodyPagingInfoCrawlerRuns setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListCrawlerRunsResponseBodyPagingInfoCrawlerRuns setTaskInstanceId(Long taskInstanceId) {
            this.taskInstanceId = taskInstanceId;
            return this;
        }
        public Long getTaskInstanceId() {
            return this.taskInstanceId;
        }

        public ListCrawlerRunsResponseBodyPagingInfoCrawlerRuns setTotalTableCount(Long totalTableCount) {
            this.totalTableCount = totalTableCount;
            return this;
        }
        public Long getTotalTableCount() {
            return this.totalTableCount;
        }

    }

    public static class ListCrawlerRunsResponseBodyPagingInfo extends TeaModel {
        /**
         * <p>The list of metadata crawler run records.</p>
         */
        @NameInMap("CrawlerRuns")
        public java.util.List<ListCrawlerRunsResponseBodyPagingInfoCrawlerRuns> crawlerRuns;

        /**
         * <p>The current page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of records that meet the query conditions.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListCrawlerRunsResponseBodyPagingInfo build(java.util.Map<String, ?> map) throws Exception {
            ListCrawlerRunsResponseBodyPagingInfo self = new ListCrawlerRunsResponseBodyPagingInfo();
            return TeaModel.build(map, self);
        }

        public ListCrawlerRunsResponseBodyPagingInfo setCrawlerRuns(java.util.List<ListCrawlerRunsResponseBodyPagingInfoCrawlerRuns> crawlerRuns) {
            this.crawlerRuns = crawlerRuns;
            return this;
        }
        public java.util.List<ListCrawlerRunsResponseBodyPagingInfoCrawlerRuns> getCrawlerRuns() {
            return this.crawlerRuns;
        }

        public ListCrawlerRunsResponseBodyPagingInfo setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListCrawlerRunsResponseBodyPagingInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCrawlerRunsResponseBodyPagingInfo setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
