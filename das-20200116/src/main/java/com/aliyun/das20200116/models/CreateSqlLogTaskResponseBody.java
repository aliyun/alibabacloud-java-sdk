// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class CreateSqlLogTaskResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>SqlLogTask</p>
     */
    @NameInMap("Data")
    public CreateSqlLogTaskResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request is successful, **Successful** is returned. If the request fails, an error message that contains information such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
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
         * <p>The time when the task was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The end of the time range to query.</p>
         */
        @NameInMap("End")
        public Long end;

        /**
         * <p>The instance ID.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The task name.</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The beginning of the time range to query.</p>
         */
        @NameInMap("Start")
        public Long start;

        /**
         * <p>The status of the task.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The task ID.</p>
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
