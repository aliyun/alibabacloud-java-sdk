// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDownloadTaskResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Tasks")
    public java.util.List<DescribeDownloadTaskResponseBodyTasks> tasks;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDownloadTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDownloadTaskResponseBody self = new DescribeDownloadTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDownloadTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDownloadTaskResponseBody setTasks(java.util.List<DescribeDownloadTaskResponseBodyTasks> tasks) {
        this.tasks = tasks;
        return this;
    }
    public java.util.List<DescribeDownloadTaskResponseBodyTasks> getTasks() {
        return this.tasks;
    }

    public DescribeDownloadTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDownloadTaskResponseBodyTasks extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExpireTime")
        public Long expireTime;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("FileURL")
        public String fileURL;

        @NameInMap("Status")
        public String status;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        @NameInMap("TaskType")
        public String taskType;

        public static DescribeDownloadTaskResponseBodyTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeDownloadTaskResponseBodyTasks self = new DescribeDownloadTaskResponseBodyTasks();
            return TeaModel.build(map, self);
        }

        public DescribeDownloadTaskResponseBodyTasks setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribeDownloadTaskResponseBodyTasks setExpireTime(Long expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public Long getExpireTime() {
            return this.expireTime;
        }

        public DescribeDownloadTaskResponseBodyTasks setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public DescribeDownloadTaskResponseBodyTasks setFileURL(String fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public String getFileURL() {
            return this.fileURL;
        }

        public DescribeDownloadTaskResponseBodyTasks setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDownloadTaskResponseBodyTasks setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public DescribeDownloadTaskResponseBodyTasks setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public DescribeDownloadTaskResponseBodyTasks setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
