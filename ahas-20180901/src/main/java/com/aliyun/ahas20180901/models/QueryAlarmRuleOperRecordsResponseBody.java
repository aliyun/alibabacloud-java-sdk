// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAlarmRuleOperRecordsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAlarmRuleOperRecordsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAlarmRuleOperRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmRuleOperRecordsResponseBody self = new QueryAlarmRuleOperRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAlarmRuleOperRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAlarmRuleOperRecordsResponseBody setData(QueryAlarmRuleOperRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAlarmRuleOperRecordsResponseBodyData getData() {
        return this.data;
    }

    public QueryAlarmRuleOperRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAlarmRuleOperRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAlarmRuleOperRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAlarmRuleOperRecordsResponseBodyDataRecords extends TeaModel {
        @NameInMap("AlarmLevel")
        public String alarmLevel;

        @NameInMap("AlarmName")
        public String alarmName;

        @NameInMap("OperTime")
        public String operTime;

        @NameInMap("OperType")
        public String operType;

        @NameInMap("OperUser")
        public String operUser;

        public static QueryAlarmRuleOperRecordsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryAlarmRuleOperRecordsResponseBodyDataRecords self = new QueryAlarmRuleOperRecordsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public QueryAlarmRuleOperRecordsResponseBodyDataRecords setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        public QueryAlarmRuleOperRecordsResponseBodyDataRecords setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public QueryAlarmRuleOperRecordsResponseBodyDataRecords setOperTime(String operTime) {
            this.operTime = operTime;
            return this;
        }
        public String getOperTime() {
            return this.operTime;
        }

        public QueryAlarmRuleOperRecordsResponseBodyDataRecords setOperType(String operType) {
            this.operType = operType;
            return this;
        }
        public String getOperType() {
            return this.operType;
        }

        public QueryAlarmRuleOperRecordsResponseBodyDataRecords setOperUser(String operUser) {
            this.operUser = operUser;
            return this;
        }
        public String getOperUser() {
            return this.operUser;
        }

    }

    public static class QueryAlarmRuleOperRecordsResponseBodyData extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Records")
        public java.util.List<QueryAlarmRuleOperRecordsResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static QueryAlarmRuleOperRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAlarmRuleOperRecordsResponseBodyData self = new QueryAlarmRuleOperRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAlarmRuleOperRecordsResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryAlarmRuleOperRecordsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAlarmRuleOperRecordsResponseBodyData setRecords(java.util.List<QueryAlarmRuleOperRecordsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<QueryAlarmRuleOperRecordsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public QueryAlarmRuleOperRecordsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryAlarmRuleOperRecordsResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
