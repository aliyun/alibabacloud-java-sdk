// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoIncrementUsageStatisticResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned.</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public GetAutoIncrementUsageStatisticResponseBodyData data;

    /**
     * <p>The returned message.</p>
     * <br>
     * <p>>  If the request is successful, **Successful** is returned. Otherwise, an error message such as an error code is returned.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetAutoIncrementUsageStatisticResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAutoIncrementUsageStatisticResponseBody self = new GetAutoIncrementUsageStatisticResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAutoIncrementUsageStatisticResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetAutoIncrementUsageStatisticResponseBody setData(GetAutoIncrementUsageStatisticResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAutoIncrementUsageStatisticResponseBodyData getData() {
        return this.data;
    }

    public GetAutoIncrementUsageStatisticResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetAutoIncrementUsageStatisticResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAutoIncrementUsageStatisticResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAutoIncrementUsageStatisticResponseBodyDataAutoIncrementUsageList extends TeaModel {
        /**
         * <p>The latest auto-increment ID.</p>
         */
        @NameInMap("AutoIncrementCurrentValue")
        public Long autoIncrementCurrentValue;

        /**
         * <p>The usage ratio of auto-increment IDs.</p>
         */
        @NameInMap("AutoIncrementRatio")
        public Double autoIncrementRatio;

        /**
         * <p>The column name.</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The database name.</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>The maximum auto-increment ID that is supported by the current data type.</p>
         */
        @NameInMap("MaximumValue")
        public Long maximumValue;

        /**
         * <p>The table name.</p>
         */
        @NameInMap("TableName")
        public String tableName;

        public static GetAutoIncrementUsageStatisticResponseBodyDataAutoIncrementUsageList build(java.util.Map<String, ?> map) throws Exception {
            GetAutoIncrementUsageStatisticResponseBodyDataAutoIncrementUsageList self = new GetAutoIncrementUsageStatisticResponseBodyDataAutoIncrementUsageList();
            return TeaModel.build(map, self);
        }

        public GetAutoIncrementUsageStatisticResponseBodyDataAutoIncrementUsageList setAutoIncrementCurrentValue(Long autoIncrementCurrentValue) {
            this.autoIncrementCurrentValue = autoIncrementCurrentValue;
            return this;
        }
        public Long getAutoIncrementCurrentValue() {
            return this.autoIncrementCurrentValue;
        }

        public GetAutoIncrementUsageStatisticResponseBodyDataAutoIncrementUsageList setAutoIncrementRatio(Double autoIncrementRatio) {
            this.autoIncrementRatio = autoIncrementRatio;
            return this;
        }
        public Double getAutoIncrementRatio() {
            return this.autoIncrementRatio;
        }

        public GetAutoIncrementUsageStatisticResponseBodyDataAutoIncrementUsageList setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public GetAutoIncrementUsageStatisticResponseBodyDataAutoIncrementUsageList setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public GetAutoIncrementUsageStatisticResponseBodyDataAutoIncrementUsageList setMaximumValue(Long maximumValue) {
            this.maximumValue = maximumValue;
            return this;
        }
        public Long getMaximumValue() {
            return this.maximumValue;
        }

        public GetAutoIncrementUsageStatisticResponseBodyDataAutoIncrementUsageList setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetAutoIncrementUsageStatisticResponseBodyData extends TeaModel {
        /**
         * <p>The usage details of auto-increment IDs.</p>
         */
        @NameInMap("AutoIncrementUsageList")
        public java.util.List<GetAutoIncrementUsageStatisticResponseBodyDataAutoIncrementUsageList> autoIncrementUsageList;

        /**
         * <p>The error message returned if the task fails.</p>
         */
        @NameInMap("ErrorInfo")
        public String errorInfo;

        /**
         * <p>Indicates whether the task is complete. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("Finish")
        public Boolean finish;

        /**
         * <p>The task status. Valid values:</p>
         * <br>
         * <p>*   **INIT**: The task is being initialized.</p>
         * <p>*   **RUNNING**: The task is being executed.</p>
         * <p>*   **SUCCESS**: The task succeeds.</p>
         * <p>*   **FAIL**: The task fails.</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <p>The time when the request was made. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
         */
        @NameInMap("Timestamp")
        public Long timestamp;

        public static GetAutoIncrementUsageStatisticResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAutoIncrementUsageStatisticResponseBodyData self = new GetAutoIncrementUsageStatisticResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAutoIncrementUsageStatisticResponseBodyData setAutoIncrementUsageList(java.util.List<GetAutoIncrementUsageStatisticResponseBodyDataAutoIncrementUsageList> autoIncrementUsageList) {
            this.autoIncrementUsageList = autoIncrementUsageList;
            return this;
        }
        public java.util.List<GetAutoIncrementUsageStatisticResponseBodyDataAutoIncrementUsageList> getAutoIncrementUsageList() {
            return this.autoIncrementUsageList;
        }

        public GetAutoIncrementUsageStatisticResponseBodyData setErrorInfo(String errorInfo) {
            this.errorInfo = errorInfo;
            return this;
        }
        public String getErrorInfo() {
            return this.errorInfo;
        }

        public GetAutoIncrementUsageStatisticResponseBodyData setFinish(Boolean finish) {
            this.finish = finish;
            return this;
        }
        public Boolean getFinish() {
            return this.finish;
        }

        public GetAutoIncrementUsageStatisticResponseBodyData setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public GetAutoIncrementUsageStatisticResponseBodyData setTimestamp(Long timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public Long getTimestamp() {
            return this.timestamp;
        }

    }

}
