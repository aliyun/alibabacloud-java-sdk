// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.appstream_center20210901.models;

import com.aliyun.tea.*;

public class CreateExportTaskResponseBody extends TeaModel {
    /**
     * <p>The information about the newly created export task. When the task is created, Status is INIT, Progress is 0, and the download URL and error message are empty.</p>
     */
    @NameInMap("ExportTaskModel")
    public CreateExportTaskResponseBodyExportTaskModel exportTaskModel;

    /**
     * <p>The ID of the request. You can use the ID to locate call records and troubleshoot issues. The example value is partially desensitized.</p>
     * 
     * <strong>example:</strong>
     * <p>7D30C5D6-****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static CreateExportTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExportTaskResponseBody self = new CreateExportTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExportTaskResponseBody setExportTaskModel(CreateExportTaskResponseBodyExportTaskModel exportTaskModel) {
        this.exportTaskModel = exportTaskModel;
        return this;
    }
    public CreateExportTaskResponseBodyExportTaskModel getExportTaskModel() {
        return this.exportTaskModel;
    }

    public CreateExportTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateExportTaskResponseBodyExportTaskModel extends TeaModel {
        /**
         * <p>The time when the task was created. The time is in the yyyy-MM-dd HH:mm:ss format, accurate to seconds. The returned string does not include the time zone offset.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-27 19:00:00</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The download URL of the exported file. When the task is created by calling this operation, the file is not generated and this field is empty. The null in the example represents a JSON null value, not the string &quot;null&quot;. You can subsequently call DescribeExportTasks to query the latest download URL of the completed task and use it within the validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("DownloadUrl")
        public String downloadUrl;

        /**
         * <p>The error message when the task execution fails. When the task is created by calling this operation, this field is empty. The null in the example represents a JSON null value, not the string &quot;null&quot;. When you query the task status and it is FAILED, you can use this field to identify the cause of the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>null</p>
         */
        @NameInMap("ErrorMsg")
        public String errorMsg;

        /**
         * <p>The progress of the export task. The value is a percentage ranging from 0 to 100. When the task is created by calling this operation, 0 is returned. The value is updated based on the execution phase and reaches 100 when the task is completed.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Progress")
        public Float progress;

        /**
         * <p>The status of the task. When the task is created by calling this operation, INIT (initialized and waiting for execution) is returned. You can subsequently call DescribeExportTasks to query RUNNING (executing), FINISHED (completed), or FAILED (failed). Do not treat INIT as export completion.</p>
         * 
         * <strong>example:</strong>
         * <p>INIT</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the newly created export task. The value is a 32-character UUID string without hyphens. You can use this value as the TaskId parameter to query the task in DescribeExportTasks.</p>
         * 
         * <strong>example:</strong>
         * <p>8119078c29e948dba2e0a9917995332a</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The type of the export task. The value is the same as the TaskType in the request. For the meaning of each type, see the TaskType request parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>WUYING_SERVER_LIST</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static CreateExportTaskResponseBodyExportTaskModel build(java.util.Map<String, ?> map) throws Exception {
            CreateExportTaskResponseBodyExportTaskModel self = new CreateExportTaskResponseBodyExportTaskModel();
            return TeaModel.build(map, self);
        }

        public CreateExportTaskResponseBodyExportTaskModel setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateExportTaskResponseBodyExportTaskModel setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
            return this;
        }
        public String getDownloadUrl() {
            return this.downloadUrl;
        }

        public CreateExportTaskResponseBodyExportTaskModel setErrorMsg(String errorMsg) {
            this.errorMsg = errorMsg;
            return this;
        }
        public String getErrorMsg() {
            return this.errorMsg;
        }

        public CreateExportTaskResponseBodyExportTaskModel setProgress(Float progress) {
            this.progress = progress;
            return this;
        }
        public Float getProgress() {
            return this.progress;
        }

        public CreateExportTaskResponseBodyExportTaskModel setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateExportTaskResponseBodyExportTaskModel setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public CreateExportTaskResponseBodyExportTaskModel setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
