// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAgentStateLogsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public java.util.List<ListAgentStateLogsResponseBodyData> data;

    public static ListAgentStateLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAgentStateLogsResponseBody self = new ListAgentStateLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAgentStateLogsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAgentStateLogsResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAgentStateLogsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAgentStateLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAgentStateLogsResponseBody setData(java.util.List<ListAgentStateLogsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAgentStateLogsResponseBodyData> getData() {
        return this.data;
    }

    public static class ListAgentStateLogsResponseBodyData extends TeaModel {
        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("StateCode")
        public String stateCode;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("State")
        public String state;

        public static ListAgentStateLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgentStateLogsResponseBodyData self = new ListAgentStateLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgentStateLogsResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListAgentStateLogsResponseBodyData setStateCode(String stateCode) {
            this.stateCode = stateCode;
            return this;
        }
        public String getStateCode() {
            return this.stateCode;
        }

        public ListAgentStateLogsResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListAgentStateLogsResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
