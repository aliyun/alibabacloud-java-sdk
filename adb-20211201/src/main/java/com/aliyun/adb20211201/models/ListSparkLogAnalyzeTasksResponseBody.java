// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class ListSparkLogAnalyzeTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public ListSparkLogAnalyzeTasksResponseBodyData data;

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
        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("TaskList")
        public java.util.List<SparkAnalyzeLogTask> taskList;

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
