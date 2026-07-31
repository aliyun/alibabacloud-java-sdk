// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adb20211201.models;

import com.aliyun.tea.*;

public class QueryFormationInstsByTaskIDResponseBody extends TeaModel {
    /**
     * <p>The status code. A value of 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned task list.</p>
     */
    @NameInMap("Data")
    public java.util.List<QueryFormationInstsByTaskIDResponseBodyData> data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The task list.</p>
     */
    @NameInMap("Items")
    public java.util.List<java.util.Map<String, ?>> items;

    /**
     * <p>The response message. OK is returned if the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public String pageNumber;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public String pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1AD222E9-E606-4A42-BF6D-8A4442913CEF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public String totalCount;

    public static QueryFormationInstsByTaskIDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFormationInstsByTaskIDResponseBody self = new QueryFormationInstsByTaskIDResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFormationInstsByTaskIDResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryFormationInstsByTaskIDResponseBody setData(java.util.List<QueryFormationInstsByTaskIDResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryFormationInstsByTaskIDResponseBodyData> getData() {
        return this.data;
    }

    public QueryFormationInstsByTaskIDResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryFormationInstsByTaskIDResponseBody setItems(java.util.List<java.util.Map<String, ?>> items) {
        this.items = items;
        return this;
    }
    public java.util.List<java.util.Map<String, ?>> getItems() {
        return this.items;
    }

    public QueryFormationInstsByTaskIDResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryFormationInstsByTaskIDResponseBody setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public QueryFormationInstsByTaskIDResponseBody setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public QueryFormationInstsByTaskIDResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryFormationInstsByTaskIDResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryFormationInstsByTaskIDResponseBody setTotalCount(String totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public String getTotalCount() {
        return this.totalCount;
    }

    public static class QueryFormationInstsByTaskIDResponseBodyData extends TeaModel {
        /**
         * <p>The time when the task was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-05-15T07:24:58Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The execution duration of the most recent task.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("LastTaskInstCostTime")
        public String lastTaskInstCostTime;

        /**
         * <p>The instance ID of the most recent task.</p>
         * 
         * <strong>example:</strong>
         * <p>1223</p>
         */
        @NameInMap("LastTaskInstID")
        public String lastTaskInstID;

        /**
         * <p>The error message of the most recent task.</p>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("LastTaskInstMessage")
        public String lastTaskInstMessage;

        /**
         * <p>The instance status of the most recent node.</p>
         * 
         * <strong>example:</strong>
         * <p>FINISH</p>
         */
        @NameInMap("LastTaskInstState")
        public String lastTaskInstState;

        /**
         * <p>The task status.</p>
         * 
         * <strong>example:</strong>
         * <p>NORMAL</p>
         */
        @NameInMap("ScheduleState")
        public String scheduleState;

        /**
         * <p>The schema ID assigned to the instance by the system.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("Schema")
        public String schema;

        /**
         * <p>The task source. Valid values:</p>
         * <ul>
         * <li><strong>system</strong>: system.</li>
         * <li><strong>custom</strong>: custom.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>shareScreen</p>
         */
        @NameInMap("SourceType")
        public String sourceType;

        /**
         * <p>The synchronization time, accurate to milliseconds. Format: yyyy-MM-ddTHH:mm:ssZ.</p>
         * 
         * <strong>example:</strong>
         * <p>2026-01-20t10:01:01z</p>
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
         * 
         * <strong>example:</strong>
         * <p>doc_test_daily</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>The task type.</p>
         * 
         * <strong>example:</strong>
         * <p>Update\&quot;\&quot;</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static QueryFormationInstsByTaskIDResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryFormationInstsByTaskIDResponseBodyData self = new QueryFormationInstsByTaskIDResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryFormationInstsByTaskIDResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryFormationInstsByTaskIDResponseBodyData setLastTaskInstCostTime(String lastTaskInstCostTime) {
            this.lastTaskInstCostTime = lastTaskInstCostTime;
            return this;
        }
        public String getLastTaskInstCostTime() {
            return this.lastTaskInstCostTime;
        }

        public QueryFormationInstsByTaskIDResponseBodyData setLastTaskInstID(String lastTaskInstID) {
            this.lastTaskInstID = lastTaskInstID;
            return this;
        }
        public String getLastTaskInstID() {
            return this.lastTaskInstID;
        }

        public QueryFormationInstsByTaskIDResponseBodyData setLastTaskInstMessage(String lastTaskInstMessage) {
            this.lastTaskInstMessage = lastTaskInstMessage;
            return this;
        }
        public String getLastTaskInstMessage() {
            return this.lastTaskInstMessage;
        }

        public QueryFormationInstsByTaskIDResponseBodyData setLastTaskInstState(String lastTaskInstState) {
            this.lastTaskInstState = lastTaskInstState;
            return this;
        }
        public String getLastTaskInstState() {
            return this.lastTaskInstState;
        }

        public QueryFormationInstsByTaskIDResponseBodyData setScheduleState(String scheduleState) {
            this.scheduleState = scheduleState;
            return this;
        }
        public String getScheduleState() {
            return this.scheduleState;
        }

        public QueryFormationInstsByTaskIDResponseBodyData setSchema(String schema) {
            this.schema = schema;
            return this;
        }
        public String getSchema() {
            return this.schema;
        }

        public QueryFormationInstsByTaskIDResponseBodyData setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public QueryFormationInstsByTaskIDResponseBodyData setSyncTime(String syncTime) {
            this.syncTime = syncTime;
            return this;
        }
        public String getSyncTime() {
            return this.syncTime;
        }

        public QueryFormationInstsByTaskIDResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryFormationInstsByTaskIDResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public QueryFormationInstsByTaskIDResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
