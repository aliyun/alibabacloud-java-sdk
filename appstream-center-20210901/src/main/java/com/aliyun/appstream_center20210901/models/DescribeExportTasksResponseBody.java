// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class DescribeExportTasksResponseBody extends TeaModel {
    /**
     * <p>The total number of tasks that meet the query conditions. This value is independent of the number of tasks returned on the current page and can be used with PageSize to calculate the total number of pages. If no tasks meet the conditions, 0 is returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The list of export tasks, sorted in descending order of task creation time, with the most recently created tasks listed first. If no tasks meet the conditions, an empty array is returned.</p>
     */
    @NameInMap("ExportTaskModel")
    public java.util.List<DescribeExportTasksResponseBodyExportTaskModel> exportTaskModel;

    /**
     * <p>The actual page number used for this query, which is the echoed value of the PageNumber request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The actual number of tasks per page used for this query, which is the echoed value of the PageSize request parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate call records and troubleshoot issues. The example value is partially masked.</p>
     * 
     * <strong>example:</strong>
     * <p>D4A13D91-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeExportTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExportTasksResponseBody self = new DescribeExportTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExportTasksResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeExportTasksResponseBody setExportTaskModel(java.util.List<DescribeExportTasksResponseBodyExportTaskModel> exportTaskModel) {
        this.exportTaskModel = exportTaskModel;
        return this;
    }
    public java.util.List<DescribeExportTasksResponseBodyExportTaskModel> getExportTaskModel() {
        return this.exportTaskModel;
    }

    public DescribeExportTasksResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeExportTasksResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeExportTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeExportTasksResponseBodyExportTaskModel extends TeaModel {
        /**
         * <p>The creation time of the task. The format is yyyy-MM-dd HH:mm:ss, accurate to seconds. The returned string does not include the time zone offset.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-27 19:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The OSS pre-signed download URL of the export file. This field is returned only for tasks whose Status is FINISHED. The default maximum validity period of the signature is 1 hour and does not exceed the 24-hour validity period after the task is created. When the remaining validity period is less than 10 minutes, the server automatically refreshes and returns a new URL. If the task is not completed, the task has expired, or the URL refresh fails, this field is empty. The domain name and path in the example URL are for demonstration purposes. The actual returned value is a complete URL with signature parameters. Use the URL returned by the most recent query for downloading.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.oss-cn-hangzhou.aliyuncs.com/">https://example.oss-cn-hangzhou.aliyuncs.com/</a>...</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The cause of the task execution failure. This field is returned only when Status is FAILED. The content is the English error description recorded by the server and can be directly displayed to users or used for troubleshooting. This field is empty in other states.</p>
         * 
         * <strong>example:</strong>
         * <p>The export sub type is not supported.</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The name of the export file. The name consists of the task type, task creation time in yyyyMMddHHmmss format, and the first 8 characters of the task ID, connected by underscores, with the .xlsx extension. If the file is not generated, this field is empty.</p>
         * 
         * <strong>example:</strong>
         * <p>WUYING_SERVER_LIST_20260727190000_8119078c.xlsx</p>
         */
        @NameInMap("ExportFileName")
        public String exportFileName;

        /**
         * <p>The progress of the export task, in percentage. Valid values: 0 to 100. This value is updated based on the execution stage of the task and is 100 when the task is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Progress")
        public Float progress;

        /**
         * <p>The status of the export task. This operation returns the following valid values:</p>
         * <ul>
         * <li>INIT: The task is created and waiting to be executed. Continue polling.</li>
         * <li>RUNNING: The export file is being generated. You can display the progress based on Progress and continue polling.</li>
         * <li>FINISHED: The export file is generated. Stop polling and use DownloadUrl to download the file.</li>
         * <li>FAILED: The task execution failed. Stop polling and check ErrorMsg.</li>
         * </ul>
         * <p>The server also has an EXPIRED state, but this operation does not return tasks in this state.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISHED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the export task, which is a 32-character UUID string without hyphens. You can use this value as the TaskId parameter for this operation to poll the task.</p>
         * 
         * <strong>example:</strong>
         * <p>8119078c29e948dba2e0a9917995332a</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The type of the export task. For the meaning of each value, see the TaskType request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>WUYING_SERVER_LIST</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static DescribeExportTasksResponseBodyExportTaskModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeExportTasksResponseBodyExportTaskModel self = new DescribeExportTasksResponseBodyExportTaskModel();
            return TeaModel.build(map, self);
        }

        public DescribeExportTasksResponseBodyExportTaskModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeExportTasksResponseBodyExportTaskModel setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public DescribeExportTasksResponseBodyExportTaskModel setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public DescribeExportTasksResponseBodyExportTaskModel setExportFileName(String exportFileName) {
            this.exportFileName = exportFileName;
            return this;
        }
        public String getExportFileName() {
            return this.exportFileName;
        }

        public DescribeExportTasksResponseBodyExportTaskModel setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public DescribeExportTasksResponseBodyExportTaskModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeExportTasksResponseBodyExportTaskModel setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeExportTasksResponseBodyExportTaskModel setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
