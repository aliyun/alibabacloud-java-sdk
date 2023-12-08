// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.das20200116.models;

import com.aliyun.tea.*;

public class GetAutoIncrementUsageStatisticResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetAutoIncrementUsageStatisticResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("AutoIncrementCurrentValue")
        public Long autoIncrementCurrentValue;

        @NameInMap("AutoIncrementRatio")
        public Double autoIncrementRatio;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("MaximumValue")
        public Long maximumValue;

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
        @NameInMap("AutoIncrementUsageList")
        public java.util.List<GetAutoIncrementUsageStatisticResponseBodyDataAutoIncrementUsageList> autoIncrementUsageList;

        @NameInMap("ErrorInfo")
        public String errorInfo;

        @NameInMap("Finish")
        public Boolean finish;

        @NameInMap("TaskStatus")
        public String taskStatus;

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
