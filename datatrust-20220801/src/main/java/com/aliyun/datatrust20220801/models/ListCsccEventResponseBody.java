// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccEventResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<ListCsccEventResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCsccEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCsccEventResponseBody self = new ListCsccEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCsccEventResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListCsccEventResponseBody setData(java.util.List<ListCsccEventResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListCsccEventResponseBodyData> getData() {
        return this.data;
    }

    public ListCsccEventResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCsccEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCsccEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCsccEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCsccEventResponseBodyData extends TeaModel {
        @NameInMap("EventType")
        public String eventType;

        @NameInMap("UserId")
        public String userId;

        public static ListCsccEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCsccEventResponseBodyData self = new ListCsccEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCsccEventResponseBodyData setEventType(String eventType) {
            this.eventType = eventType;
            return this;
        }
        public String getEventType() {
            return this.eventType;
        }

        public ListCsccEventResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
