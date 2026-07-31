// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class QueryFormationTasksByTypeResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The task list.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryFormationTasksByTypeResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message. OK is returned if the call was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryFormationTasksByTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFormationTasksByTypeResponseBody self = new QueryFormationTasksByTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFormationTasksByTypeResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFormationTasksByTypeResponseBody setData(java.util.List<QueryFormationTasksByTypeResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryFormationTasksByTypeResponseBodyData> getData() {
        return this.data;
    }

    public QueryFormationTasksByTypeResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryFormationTasksByTypeResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFormationTasksByTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFormationTasksByTypeResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryFormationTasksByTypeResponseBodyData extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-07-08 17:05:25</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The execution duration of the most recent task.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LastTaskInstCostTime")
        public String lastTaskInstCostTime;

        /**
         * <p>The instance ID of the most recent task.</p>
         * 
         * <strong>example:</strong>
         * <p>46872</p>
         */
        @NameInMap("LastTaskInstID")
        public String lastTaskInstID;

        /**
         * <p>The error message of the most recent task.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("LastTaskInstMessage")
        public String lastTaskInstMessage;

        /**
         * <p>The instance status of the most recent node.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCESS</p>
         */
        @NameInMap("LastTaskInstState")
        public String lastTaskInstState;

        /**
         * <p>The scheduling status.</p>
         * 
         * <strong>example:</strong>
         * <p>STOP</p>
         */
        @NameInMap("ScheduleState")
        public String scheduleState;

        /**
         * <p>The database name.</p>
         * 
         * <strong>example:</strong>
         * <p>sales_db</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The source type.</p>
         * 
         * <strong>example:</strong>
         * <p>OSSWAREHOUSE</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The scheduling frequency.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;cron\&quot;:\&quot;\&quot;,\&quot;type\&quot;:\&quot;run_on_demand\&quot;}</p>
         */
        @NameInMap("SyncTime")
        public String syncTime;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The task name.</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>CRAWLER</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static QueryFormationTasksByTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFormationTasksByTypeResponseBodyData self = new QueryFormationTasksByTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFormationTasksByTypeResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryFormationTasksByTypeResponseBodyData setLastTaskInstCostTime(String lastTaskInstCostTime) {
            this.lastTaskInstCostTime = lastTaskInstCostTime;
            return this;
        }
        public String getLastTaskInstCostTime() {
            return this.lastTaskInstCostTime;
        }

        public QueryFormationTasksByTypeResponseBodyData setLastTaskInstID(String lastTaskInstID) {
            this.lastTaskInstID = lastTaskInstID;
            return this;
        }
        public String getLastTaskInstID() {
            return this.lastTaskInstID;
        }

        public QueryFormationTasksByTypeResponseBodyData setLastTaskInstMessage(String lastTaskInstMessage) {
            this.lastTaskInstMessage = lastTaskInstMessage;
            return this;
        }
        public String getLastTaskInstMessage() {
            return this.lastTaskInstMessage;
        }

        public QueryFormationTasksByTypeResponseBodyData setLastTaskInstState(String lastTaskInstState) {
            this.lastTaskInstState = lastTaskInstState;
            return this;
        }
        public String getLastTaskInstState() {
            return this.lastTaskInstState;
        }

        public QueryFormationTasksByTypeResponseBodyData setScheduleState(String scheduleState) {
            this.scheduleState = scheduleState;
            return this;
        }
        public String getScheduleState() {
            return this.scheduleState;
        }

        public QueryFormationTasksByTypeResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public QueryFormationTasksByTypeResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public QueryFormationTasksByTypeResponseBodyData setSyncTime(String syncTime) {
            this.syncTime = syncTime;
            return this;
        }
        public String getSyncTime() {
            return this.syncTime;
        }

        public QueryFormationTasksByTypeResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryFormationTasksByTypeResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public QueryFormationTasksByTypeResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
