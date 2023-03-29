// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserUsageDataExportTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The usage details returned per page.</p>
     */
    @NameInMap("UsageDataPerPage")
    public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPage usageDataPerPage;

    public static DescribeUserUsageDataExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserUsageDataExportTaskResponseBody self = new DescribeUserUsageDataExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserUsageDataExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserUsageDataExportTaskResponseBody setUsageDataPerPage(DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPage usageDataPerPage) {
        this.usageDataPerPage = usageDataPerPage;
        return this;
    }
    public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPage getUsageDataPerPage() {
        return this.usageDataPerPage;
    }

    public static class DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig extends TeaModel {
        /**
         * <p>The end of the time range that was queried.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start of the time range that was queried.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig self = new DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig();
            return TeaModel.build(map, self);
        }

        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItem extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The download URL.</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The status of the task.</p>
         * <br>
         * <p>*   created: The task is being created.</p>
         * <p>*   success: The task has been created.</p>
         * <p>*   failed: The creation of the task failed.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The configurations of the task.</p>
         */
        @NameInMap("TaskConfig")
        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig taskConfig;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the task.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The last time when the task was modified.</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItem self = new DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItem setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItem setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItem setTaskConfig(DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig taskConfig) {
            this.taskConfig = taskConfig;
            return this;
        }
        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig getTaskConfig() {
            return this.taskConfig;
        }

        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItem setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItem setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItem setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageData extends TeaModel {
        @NameInMap("DataItem")
        public java.util.List<DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItem> dataItem;

        public static DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageData self = new DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageData();
            return TeaModel.build(map, self);
        }

        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageData setDataItem(java.util.List<DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItem> dataItem) {
            this.dataItem = dataItem;
            return this;
        }
        public java.util.List<DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageDataDataItem> getDataItem() {
            return this.dataItem;
        }

    }

    public static class DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPage extends TeaModel {
        /**
         * <p>The description of the task.</p>
         */
        @NameInMap("Data")
        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageData data;

        /**
         * <p>The number of the current page.</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>The number of entries returned per page.</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPage build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPage self = new DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPage();
            return TeaModel.build(map, self);
        }

        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPage setData(DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageData data) {
            this.data = data;
            return this;
        }
        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPageData getData() {
            return this.data;
        }

        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeUserUsageDataExportTaskResponseBodyUsageDataPerPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
