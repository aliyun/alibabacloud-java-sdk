// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeUserUsageDetailDataExportTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>A91BE91F-0B34-4CBF-8E0F-A2977E15AA52</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The usage details returned per page.</p>
     */
    @NameInMap("UsageDataPerPage")
    public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPage usageDataPerPage;

    public static DescribeUserUsageDetailDataExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUserUsageDetailDataExportTaskResponseBody self = new DescribeUserUsageDetailDataExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUserUsageDetailDataExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeUserUsageDetailDataExportTaskResponseBody setUsageDataPerPage(DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPage usageDataPerPage) {
        this.usageDataPerPage = usageDataPerPage;
        return this;
    }
    public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPage getUsageDataPerPage() {
        return this.usageDataPerPage;
    }

    public static class DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig extends TeaModel {
        /**
         * <p>The end of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-08-31T15:59:59Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The start of the time range during which data was queried.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-07-31T16:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig self = new DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig();
            return TeaModel.build(map, self);
        }

        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItem extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-09T06:33:38Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The download URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://test.oss-cn-beijing.aliyuncs.com/billing_data/xxx">https://test.oss-cn-beijing.aliyuncs.com/billing_data/xxx</a></p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The status of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The configurations of the task.</p>
         */
        @NameInMap("TaskConfig")
        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig taskConfig;

        /**
         * <p>The ID of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Refresh</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The time when the task was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-10-09T06:35:46Z</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItem build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItem self = new DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItem();
            return TeaModel.build(map, self);
        }

        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItem setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItem setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItem setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItem setTaskConfig(DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig taskConfig) {
            this.taskConfig = taskConfig;
            return this;
        }
        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItemTaskConfig getTaskConfig() {
            return this.taskConfig;
        }

        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItem setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItem setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItem setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

    public static class DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageData extends TeaModel {
        @NameInMap("DataItem")
        public java.util.List<DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItem> dataItem;

        public static DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageData self = new DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageData();
            return TeaModel.build(map, self);
        }

        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageData setDataItem(java.util.List<DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItem> dataItem) {
            this.dataItem = dataItem;
            return this;
        }
        public java.util.List<DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageDataDataItem> getDataItem() {
            return this.dataItem;
        }

    }

    public static class DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPage extends TeaModel {
        /**
         * <p>The information about the task.</p>
         */
        @NameInMap("Data")
        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageData data;

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
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>The total number of entries returned.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPage build(java.util.Map<String, ?> map) throws Exception {
            DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPage self = new DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPage();
            return TeaModel.build(map, self);
        }

        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPage setData(DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageData data) {
            this.data = data;
            return this;
        }
        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPageData getData() {
            return this.data;
        }

        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPage setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPage setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeUserUsageDetailDataExportTaskResponseBodyUsageDataPerPage setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
