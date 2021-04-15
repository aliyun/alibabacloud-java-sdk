// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAlarmRulesResponseBody extends TeaModel {
    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("TotalCount")
    public Integer totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("Data")
    public java.util.List<ListAlarmRulesResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    public static ListAlarmRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmRulesResponseBody self = new ListAlarmRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlarmRulesResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListAlarmRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListAlarmRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlarmRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlarmRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlarmRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlarmRulesResponseBody setData(java.util.List<ListAlarmRulesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAlarmRulesResponseBodyData> getData() {
        return this.data;
    }

    public ListAlarmRulesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAlarmRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListAlarmRulesResponseBodyData extends TeaModel {
        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("AlarmRuleId")
        public String alarmRuleId;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("AlarmRuleDetail")
        public String alarmRuleDetail;

        @NameInMap("AlarmName")
        public String alarmName;

        public static ListAlarmRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmRulesResponseBodyData self = new ListAlarmRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlarmRulesResponseBodyData setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public ListAlarmRulesResponseBodyData setAlarmRuleId(String alarmRuleId) {
            this.alarmRuleId = alarmRuleId;
            return this;
        }
        public String getAlarmRuleId() {
            return this.alarmRuleId;
        }

        public ListAlarmRulesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAlarmRulesResponseBodyData setAlarmRuleDetail(String alarmRuleDetail) {
            this.alarmRuleDetail = alarmRuleDetail;
            return this;
        }
        public String getAlarmRuleDetail() {
            return this.alarmRuleDetail;
        }

        public ListAlarmRulesResponseBodyData setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

    }

}
