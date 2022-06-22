// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ahas20180901.models;

import com.aliyun.tea.*;

public class QueryAlarmRecordsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAlarmRecordsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static QueryAlarmRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAlarmRecordsResponseBody self = new QueryAlarmRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAlarmRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAlarmRecordsResponseBody setData(QueryAlarmRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAlarmRecordsResponseBodyData getData() {
        return this.data;
    }

    public QueryAlarmRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAlarmRecordsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAlarmRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAlarmRecordsResponseBodyDataRecords extends TeaModel {
        @NameInMap("AlarmDetail")
        public String alarmDetail;

        @NameInMap("AlarmLevel")
        public String alarmLevel;

        @NameInMap("AlarmName")
        public String alarmName;

        @NameInMap("AlarmTime")
        public String alarmTime;

        @NameInMap("AlarmType")
        public String alarmType;

        @NameInMap("Identify")
        public String identify;

        @NameInMap("OperUser")
        public String operUser;

        public static QueryAlarmRecordsResponseBodyDataRecords build(java.util.Map<String, ?> map) throws Exception {
            QueryAlarmRecordsResponseBodyDataRecords self = new QueryAlarmRecordsResponseBodyDataRecords();
            return TeaModel.build(map, self);
        }

        public QueryAlarmRecordsResponseBodyDataRecords setAlarmDetail(String alarmDetail) {
            this.alarmDetail = alarmDetail;
            return this;
        }
        public String getAlarmDetail() {
            return this.alarmDetail;
        }

        public QueryAlarmRecordsResponseBodyDataRecords setAlarmLevel(String alarmLevel) {
            this.alarmLevel = alarmLevel;
            return this;
        }
        public String getAlarmLevel() {
            return this.alarmLevel;
        }

        public QueryAlarmRecordsResponseBodyDataRecords setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public QueryAlarmRecordsResponseBodyDataRecords setAlarmTime(String alarmTime) {
            this.alarmTime = alarmTime;
            return this;
        }
        public String getAlarmTime() {
            return this.alarmTime;
        }

        public QueryAlarmRecordsResponseBodyDataRecords setAlarmType(String alarmType) {
            this.alarmType = alarmType;
            return this;
        }
        public String getAlarmType() {
            return this.alarmType;
        }

        public QueryAlarmRecordsResponseBodyDataRecords setIdentify(String identify) {
            this.identify = identify;
            return this;
        }
        public String getIdentify() {
            return this.identify;
        }

        public QueryAlarmRecordsResponseBodyDataRecords setOperUser(String operUser) {
            this.operUser = operUser;
            return this;
        }
        public String getOperUser() {
            return this.operUser;
        }

    }

    public static class QueryAlarmRecordsResponseBodyData extends TeaModel {
        @NameInMap("PageIndex")
        public Integer pageIndex;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("Records")
        public java.util.List<QueryAlarmRecordsResponseBodyDataRecords> records;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("TotalPage")
        public Long totalPage;

        public static QueryAlarmRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAlarmRecordsResponseBodyData self = new QueryAlarmRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAlarmRecordsResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryAlarmRecordsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryAlarmRecordsResponseBodyData setRecords(java.util.List<QueryAlarmRecordsResponseBodyDataRecords> records) {
            this.records = records;
            return this;
        }
        public java.util.List<QueryAlarmRecordsResponseBodyDataRecords> getRecords() {
            return this.records;
        }

        public QueryAlarmRecordsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public QueryAlarmRecordsResponseBodyData setTotalPage(Long totalPage) {
            this.totalPage = totalPage;
            return this;
        }
        public Long getTotalPage() {
            return this.totalPage;
        }

    }

}
