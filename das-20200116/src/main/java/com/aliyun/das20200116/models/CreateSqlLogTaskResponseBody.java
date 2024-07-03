// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateSqlLogTaskResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateSqlLogTaskResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <blockquote>
     * <p> If the request was successful, <strong>Successful</strong> is returned. If the request failed, error information such as an error code is returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>Successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>83D9D59B-057A-54A9-BFF9-CF2B42F05645</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public String success;

    public static CreateSqlLogTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSqlLogTaskResponseBody self = new CreateSqlLogTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSqlLogTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateSqlLogTaskResponseBody setData(CreateSqlLogTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateSqlLogTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateSqlLogTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateSqlLogTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSqlLogTaskResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class CreateSqlLogTaskResponseBodyData extends TeaModel {
        /**
         * <p>The time when the task was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1681363254423</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The end of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1608888296000</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>The ID of the database instance.</p>
         * 
         * <strong>example:</strong>
         * <p>pc-2ze8g2am97624****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>Export_test</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The beginning of the time range to query. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>1596177993000</p>
         */
        @NameInMap("Start")
        public Long start;

        /**
         * <p>The state of the task. Valid values:</p>
         * <ul>
         * <li><strong>INIT</strong>: The task is to be scheduled.</li>
         * <li><strong>RUNNING</strong>: The task is running.</li>
         * <li><strong>FAILED</strong>: The task failed.</li>
         * <li><strong>CANCELED</strong>: The task is canceled.</li>
         * <li><strong>COMPLETED</strong>: The task is complete.</li>
         * </ul>
         * <blockquote>
         * <p> You can view the result of a task that is in the <strong>COMPLETED</strong> state.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>COMPLETED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>54f8041743ca3a9ac5cb9342d050527c</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CreateSqlLogTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateSqlLogTaskResponseBodyData self = new CreateSqlLogTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateSqlLogTaskResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public CreateSqlLogTaskResponseBodyData setEnd(Long end) {
            this.end = end;
            return this;
        }
        public Long getEnd() {
            return this.end;
        }

        public CreateSqlLogTaskResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateSqlLogTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateSqlLogTaskResponseBodyData setStart(Long start) {
            this.start = start;
            return this;
        }
        public Long getStart() {
            return this.start;
        }

        public CreateSqlLogTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateSqlLogTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
