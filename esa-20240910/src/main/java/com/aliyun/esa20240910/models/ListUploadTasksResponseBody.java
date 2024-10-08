// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class ListUploadTasksResponseBody extends TeaModel {
    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>CB1A380B-09F0-41BB-A198-72F8FD6D****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>2023-07-26T01:56:15Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>invalid url</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>InvalidUrl,InvalidDomain</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <strong>example:</strong>
         * <p>Complete</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>file</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>159253299357****</p>
         */
        @NameInMap("UploadId")
        public String uploadId;

        /**
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
