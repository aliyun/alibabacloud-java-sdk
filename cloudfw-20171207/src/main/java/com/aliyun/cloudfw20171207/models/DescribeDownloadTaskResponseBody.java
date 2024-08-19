// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudfw20171207.models;

import com.aliyun.tea.*;

public class DescribeDownloadTaskResponseBody extends TeaModel {
    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>3F2BED13-F3D0-5984-80D6-D5F298CFEA88</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The tasks.</p>
     */
    @NameInMap("Tasks")
    public java.util.List<DescribeDownloadTaskResponseBodyTasks> tasks;

    /**
     * <p>The total number of tasks.</p>
     * 
     * <strong>example:</strong>
     * <p>132</p>
     */
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
        /**
         * <p>The time when the task was created. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1706595827</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The time when the task expires. The value is a UNIX timestamp. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1714371828</p>
         */
        @NameInMap("ExpireTime")
        public Long expireTime;

        /**
         * <p>The size of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>24.04KB</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The URL of the OSS file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://cfw-table-download-cn.oss-cn-hangzhou.aliyuncs.com/%E4%BA%92%E8%81%94%E7%BD%91%E8%BE%B9%E7%95%8C%E9%98%B2%E7%81%AB%E5%A2%99%E8%B5%84%E4%BA%A7-IPv4_1069.csv?Expires=1708583913&OSSAccessKeyId=****&Signature=******%3D">https://cfw-table-download-cn.oss-cn-hangzhou.aliyuncs.com/%E4%BA%92%E8%81%94%E7%BD%91%E8%BE%B9%E7%95%8C%E9%98%B2%E7%81%AB%E5%A2%99%E8%B5%84%E4%BA%A7-IPv4_1069.csv?Expires=1708583913&amp;OSSAccessKeyId=****&amp;Signature=******%3D</a></p>
         */
        @NameInMap("FileURL")
        public String fileURL;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>finish</strong></li>
         * <li><strong>start</strong></li>
         * <li><strong>error</strong></li>
         * <li><strong>expire</strong>: The task file is invalid and cannot be downloaded.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>finish</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Internet Boundary Firewall Assets - IPv4</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The type of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>InternetFirewallAsset</p>
         */
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
