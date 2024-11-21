// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUploadTasksResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The file upload tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<ListUploadTasksResponseBodyTasks> tasks;

    public static ListUploadTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUploadTasksResponseBody self = new ListUploadTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUploadTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUploadTasksResponseBody setTasks(java.util.List<ListUploadTasksResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<ListUploadTasksResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public static class ListUploadTasksResponseBodyTasks extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-07-26T01:56:15Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The error message returned when the file upload task failed.</p>
         * 
         * <strong>example:</strong>
         * <p>invalid url</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The error code. Multiple error codes are separated by commas (,).</p>
         * <ul>
         * <li><strong>InvalidUrl</strong>: The URL format is incorrect.</li>
         * <li><strong>InvalidDomain</strong>: The domain ownership fails to be verified.</li>
         * <li><strong>QuotaExcess</strong>: The quota limit has been reached.</li>
         * <li><strong>OtherErrors</strong>: Other errors.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>InvalidUrl,InvalidDomain</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The task status.</p>
         * <ul>
         * <li><strong>Complete</strong>: The task is complete.</li>
         * <li><strong>Refreshing</strong>: The task is in progress.</li>
         * <li><strong>Failed</strong>: The task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task type. Valid values:</p>
         * <ul>
         * <li><strong>file</strong>: purges the cache by file URL.</li>
         * <li><strong>preload</strong>: prefetches files.</li>
         * <li><strong>directory</strong>: purges the cache by directory.</li>
         * <li><strong>ignoreparams</strong>: purges the cache by URL with specified parameters ignored.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the file upload task.</p>
         * 
         * <strong>example:</strong>
         * <p>159253299357****</p>
         */
        @NameInMap("UploadId")
        public String uploadId;

        /**
         * <p>The name of the file upload task.</p>
         * 
         * <strong>example:</strong>
         * <p>purge_file_task</p>
         */
        @NameInMap("UploadTaskName")
        public String uploadTaskName;

        public static ListUploadTasksResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            ListUploadTasksResponseBodyTasks self = new ListUploadTasksResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public ListUploadTasksResponseBodyTasks setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListUploadTasksResponseBodyTasks setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ListUploadTasksResponseBodyTasks setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListUploadTasksResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListUploadTasksResponseBodyTasks setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListUploadTasksResponseBodyTasks setUploadId(String uploadId) {
            this.uploadId = uploadId;
            return this;
        }
        public String getUploadId() {
            return this.uploadId;
        }

        public ListUploadTasksResponseBodyTasks setUploadTaskName(String uploadTaskName) {
            this.uploadTaskName = uploadTaskName;
            return this;
        }
        public String getUploadTaskName() {
            return this.uploadTaskName;
        }

    }

}
