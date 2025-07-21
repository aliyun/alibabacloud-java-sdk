// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeEcdReportTasksResponseBody extends TeaModel {
    @NameInMap("ExportTaskList")
    public java.util.List<DescribeEcdReportTasksResponseBodyExportTaskList> exportTaskList;

    /**
     * <strong>example:</strong>
     * <p>1CBAFFAB-B697-4049-A9B1-67E1FC5F****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeEcdReportTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEcdReportTasksResponseBody self = new DescribeEcdReportTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEcdReportTasksResponseBody setExportTaskList(java.util.List<DescribeEcdReportTasksResponseBodyExportTaskList> exportTaskList) {
        this.exportTaskList = exportTaskList;
        return this;
    }
    public java.util.List<DescribeEcdReportTasksResponseBodyExportTaskList> getExportTaskList() {
        return this.exportTaskList;
    }

    public DescribeEcdReportTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEcdReportTasksResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeEcdReportTasksResponseBodyExportTaskList extends TeaModel {
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>No Data.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <strong>example:</strong>
         * <p>2025-07-14T07:46:49.000+00:00</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-07-14T07:46:49.000+00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>80</p>
         */
        @NameInMap("Progress")
        public Float progress;

        /**
         * <strong>example:</strong>
         * <p>TestFileName</p>
         */
        @NameInMap("ReportFileName")
        public String reportFileName;

        /**
         * <strong>example:</strong>
         * <p>Running</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>DESKTOP</p>
         */
        @NameInMap("SubType")
        public String subType;

        /**
         * <strong>example:</strong>
         * <p>ret-asdfkjg*****</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>RESOURCE_REPORT</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static DescribeEcdReportTasksResponseBodyExportTaskList build(java.util.Map<String, ?> map) throws Exception {
            DescribeEcdReportTasksResponseBodyExportTaskList self = new DescribeEcdReportTasksResponseBodyExportTaskList();
            return TeaModel.build(map, self);
        }

        public DescribeEcdReportTasksResponseBodyExportTaskList setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeEcdReportTasksResponseBodyExportTaskList setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeEcdReportTasksResponseBodyExportTaskList setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeEcdReportTasksResponseBodyExportTaskList setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeEcdReportTasksResponseBodyExportTaskList setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public DescribeEcdReportTasksResponseBodyExportTaskList setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public DescribeEcdReportTasksResponseBodyExportTaskList setReportFileName(String reportFileName) {
            this.reportFileName = reportFileName;
            return this;
        }
        public String getReportFileName() {
            return this.reportFileName;
        }

        public DescribeEcdReportTasksResponseBodyExportTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeEcdReportTasksResponseBodyExportTaskList setSubType(String subType) {
            this.subType = subType;
            return this;
        }
        public String getSubType() {
            return this.subType;
        }

        public DescribeEcdReportTasksResponseBodyExportTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeEcdReportTasksResponseBodyExportTaskList setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
