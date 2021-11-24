// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAlarmRulesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAlarmRulesResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("HttpCode")
    public String httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAlarmRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmRulesResponseBody self = new ListAlarmRulesResponseBody();
        return TeaModel.build(map, self);
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

    public ListAlarmRulesResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListAlarmRulesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlarmRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlarmRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlarmRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlarmRulesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAlarmRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlarmRulesResponseBodyData extends TeaModel {
        @NameInMap("AlarmName")
        public String alarmName;

        @NameInMap("AlarmRuleDetail")
        public String alarmRuleDetail;

        @NameInMap("AlarmRuleId")
        public String alarmRuleId;

        @NameInMap("AlarmStatus")
        public String alarmStatus;

        @NameInMap("CreateTime")
        public String createTime;

        public static ListAlarmRulesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmRulesResponseBodyData self = new ListAlarmRulesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlarmRulesResponseBodyData setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public ListAlarmRulesResponseBodyData setAlarmRuleDetail(String alarmRuleDetail) {
            this.alarmRuleDetail = alarmRuleDetail;
            return this;
        }
        public String getAlarmRuleDetail() {
            return this.alarmRuleDetail;
        }

        public ListAlarmRulesResponseBodyData setAlarmRuleId(String alarmRuleId) {
            this.alarmRuleId = alarmRuleId;
            return this;
        }
        public String getAlarmRuleId() {
            return this.alarmRuleId;
        }

        public ListAlarmRulesResponseBodyData setAlarmStatus(String alarmStatus) {
            this.alarmStatus = alarmStatus;
            return this;
        }
        public String getAlarmStatus() {
            return this.alarmStatus;
        }

        public ListAlarmRulesResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

    }

}
