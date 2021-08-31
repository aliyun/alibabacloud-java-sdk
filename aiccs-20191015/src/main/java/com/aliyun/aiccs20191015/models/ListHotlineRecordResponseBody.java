// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20191015.models;

import com.aliyun.tea.*;

public class ListHotlineRecordResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Data")
    public java.util.List<ListHotlineRecordResponseBodyData> data;

    public static ListHotlineRecordResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListHotlineRecordResponseBody self = new ListHotlineRecordResponseBody();
        return TeaModel.build(map, self);
    }

    public ListHotlineRecordResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListHotlineRecordResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListHotlineRecordResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListHotlineRecordResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListHotlineRecordResponseBody setData(java.util.List<ListHotlineRecordResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListHotlineRecordResponseBodyData> getData() {
        return this.data;
    }

    public static class ListHotlineRecordResponseBodyData extends TeaModel {
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("Url")
        public String url;

        @NameInMap("ConnectionId")
        public String connectionId;

        @NameInMap("CallId")
        public String callId;

        public static ListHotlineRecordResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListHotlineRecordResponseBodyData self = new ListHotlineRecordResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListHotlineRecordResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListHotlineRecordResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListHotlineRecordResponseBodyData setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

        public ListHotlineRecordResponseBodyData setConnectionId(String connectionId) {
            this.connectionId = connectionId;
            return this;
        }
        public String getConnectionId() {
            return this.connectionId;
        }

        public ListHotlineRecordResponseBodyData setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

    }

}
