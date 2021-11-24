// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class ListAlarmHistoriesResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<ListAlarmHistoriesResponseBodyData> data;

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

    public static ListAlarmHistoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAlarmHistoriesResponseBody self = new ListAlarmHistoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAlarmHistoriesResponseBody setData(java.util.List<ListAlarmHistoriesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAlarmHistoriesResponseBodyData> getData() {
        return this.data;
    }

    public ListAlarmHistoriesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListAlarmHistoriesResponseBody setHttpCode(String httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public String getHttpCode() {
        return this.httpCode;
    }

    public ListAlarmHistoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAlarmHistoriesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAlarmHistoriesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAlarmHistoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAlarmHistoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAlarmHistoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAlarmHistoriesResponseBodyData extends TeaModel {
        @NameInMap("AlarmContent")
        public String alarmContent;

        @NameInMap("AlarmDingDing")
        public String alarmDingDing;

        @NameInMap("AlarmEmail")
        public String alarmEmail;

        @NameInMap("AlarmName")
        public String alarmName;

        @NameInMap("AlarmPhone")
        public String alarmPhone;

        @NameInMap("AlarmTime")
        public String alarmTime;

        public static ListAlarmHistoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAlarmHistoriesResponseBodyData self = new ListAlarmHistoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAlarmHistoriesResponseBodyData setAlarmContent(String alarmContent) {
            this.alarmContent = alarmContent;
            return this;
        }
        public String getAlarmContent() {
            return this.alarmContent;
        }

        public ListAlarmHistoriesResponseBodyData setAlarmDingDing(String alarmDingDing) {
            this.alarmDingDing = alarmDingDing;
            return this;
        }
        public String getAlarmDingDing() {
            return this.alarmDingDing;
        }

        public ListAlarmHistoriesResponseBodyData setAlarmEmail(String alarmEmail) {
            this.alarmEmail = alarmEmail;
            return this;
        }
        public String getAlarmEmail() {
            return this.alarmEmail;
        }

        public ListAlarmHistoriesResponseBodyData setAlarmName(String alarmName) {
            this.alarmName = alarmName;
            return this;
        }
        public String getAlarmName() {
            return this.alarmName;
        }

        public ListAlarmHistoriesResponseBodyData setAlarmPhone(String alarmPhone) {
            this.alarmPhone = alarmPhone;
            return this;
        }
        public String getAlarmPhone() {
            return this.alarmPhone;
        }

        public ListAlarmHistoriesResponseBodyData setAlarmTime(String alarmTime) {
            this.alarmTime = alarmTime;
            return this;
        }
        public String getAlarmTime() {
            return this.alarmTime;
        }

    }

}
