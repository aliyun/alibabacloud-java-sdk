// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ddoscoo20200101.models;

import com.aliyun.tea.*;

public class DescribeAsyncTasksResponseBody extends TeaModel {
    /**
     * <p>An array that consists of the details of the asynchronous export tasks.</p>
     */
    @NameInMap("AsyncTasks")
    public java.util.List<DescribeAsyncTasksResponseBodyAsyncTasks> asyncTasks;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>6623EA1F-30FB-5BC8-BEC9-74D55F6F08F1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of asynchronous export tasks that are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeAsyncTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAsyncTasksResponseBody self = new DescribeAsyncTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAsyncTasksResponseBody setAsyncTasks(java.util.List<DescribeAsyncTasksResponseBodyAsyncTasks> asyncTasks) {
        this.asyncTasks = asyncTasks;
        return this;
    }
    public java.util.List<DescribeAsyncTasksResponseBodyAsyncTasks> getAsyncTasks() {
        return this.asyncTasks;
    }

    public DescribeAsyncTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAsyncTasksResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeAsyncTasksResponseBodyAsyncTasks extends TeaModel {
        /**
         * <p>The end time of the task. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>157927362000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <p>The start time of the task. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>156927362000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        /**
         * <p>The task parameter. The value is a JSON string. The returned field in the value varies based on the value of <strong>TaskType</strong>.</p>
         * <p>If <strong>TaskType</strong> is set to <strong>1</strong>, <strong>3</strong>, <strong>4</strong>, <strong>5</strong>, or <strong>6</strong>, the following filed is returned:</p>
         * <ul>
         * <li><strong>instanceId</strong>: the ID of the instance. Data type: string.</li>
         * </ul>
         * <p>If <strong>TaskType</strong> is set to <strong>2</strong>, the following field is returned:</p>
         * <ul>
         * <li><strong>domain</strong>: the domain name of the website. Data type: string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;instanceId&quot;: &quot;ddoscoo-cn-mp91j1ao****&quot;}</p>
         */
        @NameInMap("TaskParams")
        public String taskParams;

        /**
         * <p>The execution result of the task. The value is a JSON string. The returned fields in the value vary based on the value of <strong>TaskType</strong>.</p>
         * <p>If <strong>TaskType</strong> is set to <strong>1</strong>, <strong>3</strong>, <strong>4</strong>, <strong>5</strong>, or <strong>6</strong>, the following fields are returned:</p>
         * <ul>
         * <li><strong>instanceId</strong>: the ID of the instance. Data type: string.</li>
         * <li><strong>url</strong>: the URL to download the exported file from Object Storage Service (OSS). Data type: string.</li>
         * </ul>
         * <p>If <strong>TaskType</strong> is set to <strong>2</strong>, the following fields are returned:</p>
         * <ul>
         * <li><strong>domain</strong>: the domain name of the website. Data type: string.</li>
         * <li><strong>url</strong>: the URL to download the exported file from OSS. Data type: string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;instanceId&quot;: &quot;ddoscoo-cn-mp91j1ao****&quot;,&quot;url&quot;: &quot;https://<strong><strong>.oss-cn-beijing.aliyuncs.com/heap.bin?Expires=1584785140&amp;OSSAccessKeyId=TMP.3KfzD82FyRJevJdEkRX6JEFHhbvRBBb75PZJnyJmksA2QkMm47xFAFDgMhEV8Nm6Vxr8xExMfiy9LsUFAcLcTBrN3r</strong></strong>&amp;Signature=Sj8BNcsxJLE8l5qm4cjNlDt8gv****&quot;}</p>
         */
        @NameInMap("TaskResult")
        public String taskResult;

        /**
         * <p>The status of the task. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: indicates that the task is being initialized.</li>
         * <li><strong>1</strong>: indicates that the task is in progress.</li>
         * <li><strong>2</strong>: indicates that the task is successful.</li>
         * <li><strong>3</strong>: indicates that the task failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <p>The type of the task. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: the task to export the port forwarding rules of an instance</li>
         * <li><strong>2</strong>: the task to export the forwarding rules of a website protected by an instance</li>
         * <li><strong>3</strong>: the task to export the sessions and health check settings of an instance</li>
         * <li><strong>4</strong>: the task to export the mitigation policies of an instance</li>
         * <li><strong>5</strong>: the task to download the blacklist for destination IP addresses of an instance</li>
         * <li><strong>6</strong>: the task to download the whitelist for destination IP addresses of an instance</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        public static DescribeAsyncTasksResponseBodyAsyncTasks build(java.util.Map<String, ?> map) throws Exception {
            DescribeAsyncTasksResponseBodyAsyncTasks self = new DescribeAsyncTasksResponseBodyAsyncTasks();
            return TeaModel.build(map, self);
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskParams(String taskParams) {
            this.taskParams = taskParams;
            return this;
        }
        public String getTaskParams() {
            return this.taskParams;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public DescribeAsyncTasksResponseBodyAsyncTasks setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

}
