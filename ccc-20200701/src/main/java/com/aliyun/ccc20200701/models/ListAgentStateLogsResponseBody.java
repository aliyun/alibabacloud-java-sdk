// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAgentStateLogsResponseBody extends TeaModel {
    /**
     * <p>Response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Data.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListAgentStateLogsResponseBodyData> data;

    /**
     * <p>HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Response message.</p>
     * 
     * <strong>example:</strong>
     * <p>无</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>943D8EF3-3321-471F-A104-51C96FCA94D6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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

    public ListAgentStateLogsResponseBody setData(java.util.List<ListAgentStateLogsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAgentStateLogsResponseBodyData> getData() {
        return this.data;
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

    public static class ListAgentStateLogsResponseBodyData extends TeaModel {
        /**
         * <p>Break code.</p>
         * 
         * <strong>example:</strong>
         * <p>会议</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <p>Duration of the status, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>Indicates whether the agent is in outbound-only mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        /**
         * <p>Start Time of the status, in UNIX timestamp format, in milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1620259200000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <p>Status code.</p>
         * 
         * <strong>example:</strong>
         * <p>Break</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Sub-status, which provides additional details for the status code. In certain scenarios, an agent\&quot;s status is jointly identified by State and StateCode. For example, in a monitoring scenario, the State is Talking and the StateCode is Monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>CHECK_IN_BREAK</p>
         */
        @NameInMap("StateCode")
        public String stateCode;

        /**
         * <p>Work mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        @NameInMap("WorkMode")
        public String workMode;

        public static ListAgentStateLogsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAgentStateLogsResponseBodyData self = new ListAgentStateLogsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAgentStateLogsResponseBodyData setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ListAgentStateLogsResponseBodyData setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListAgentStateLogsResponseBodyData setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public ListAgentStateLogsResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListAgentStateLogsResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListAgentStateLogsResponseBodyData setStateCode(String stateCode) {
            this.stateCode = stateCode;
            return this;
        }
        public String getStateCode() {
            return this.stateCode;
        }

        public ListAgentStateLogsResponseBodyData setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

}
