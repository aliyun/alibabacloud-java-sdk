// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccJobScheduleTypesResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListCsccJobScheduleTypesResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCsccJobScheduleTypesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCsccJobScheduleTypesResponseBody self = new ListCsccJobScheduleTypesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCsccJobScheduleTypesResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListCsccJobScheduleTypesResponseBody setData(java.util.List<ListCsccJobScheduleTypesResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCsccJobScheduleTypesResponseBodyData> getData() {
        return this.data;
    }

    public ListCsccJobScheduleTypesResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCsccJobScheduleTypesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCsccJobScheduleTypesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCsccJobScheduleTypesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCsccJobScheduleTypesResponseBodyData extends TeaModel {
        @NameInMap("ScheduleName")
        public String scheduleName;

        @NameInMap("ScheduleType")
        public Integer scheduleType;

        public static ListCsccJobScheduleTypesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCsccJobScheduleTypesResponseBodyData self = new ListCsccJobScheduleTypesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCsccJobScheduleTypesResponseBodyData setScheduleName(String scheduleName) {
            this.scheduleName = scheduleName;
            return this;
        }
        public String getScheduleName() {
            return this.scheduleName;
        }

        public ListCsccJobScheduleTypesResponseBodyData setScheduleType(Integer scheduleType) {
            this.scheduleType = scheduleType;
            return this;
        }
        public Integer getScheduleType() {
            return this.scheduleType;
        }

    }

}
