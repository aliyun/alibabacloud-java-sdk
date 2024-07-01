// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkLogAnalyzeTasksResponseBody extends TeaModel {
    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ListSparkLogAnalyzeTasksResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1DF5AF5B-C803-1861-A0FF-63666A557709</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListSparkLogAnalyzeTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSparkLogAnalyzeTasksResponseBody self = new ListSparkLogAnalyzeTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSparkLogAnalyzeTasksResponseBody setData(ListSparkLogAnalyzeTasksResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSparkLogAnalyzeTasksResponseBodyData getData() {
        return this.data;
    }

    public ListSparkLogAnalyzeTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListSparkLogAnalyzeTasksResponseBodyData extends TeaModel {
        /**
         * <p>The page number.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <p>The number of entries per page.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <p>The queried Spark log analysis tasks.</p>
         */
        @NameInMap("TaskList")
        public java.util.List<SparkAnalyzeLogTask> taskList;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListSparkLogAnalyzeTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSparkLogAnalyzeTasksResponseBodyData self = new ListSparkLogAnalyzeTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSparkLogAnalyzeTasksResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListSparkLogAnalyzeTasksResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListSparkLogAnalyzeTasksResponseBodyData setTaskList(java.util.List<SparkAnalyzeLogTask> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<SparkAnalyzeLogTask> getTaskList() {
            return this.taskList;
        }

        public ListSparkLogAnalyzeTasksResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
