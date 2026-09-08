// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetRealtimeInstanceStatesResponseBody extends TeaModel {
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
    public GetRealtimeInstanceStatesResponseBodyData data;

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

    public static GetRealtimeInstanceStatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRealtimeInstanceStatesResponseBody self = new GetRealtimeInstanceStatesResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRealtimeInstanceStatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRealtimeInstanceStatesResponseBody setData(GetRealtimeInstanceStatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRealtimeInstanceStatesResponseBodyData getData() {
        return this.data;
    }

    public GetRealtimeInstanceStatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRealtimeInstanceStatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRealtimeInstanceStatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetRealtimeInstanceStatesResponseBodyDataBreakCodeDetailList extends TeaModel {
        /**
         * <p>Break code.</p>
         * 
         * <strong>example:</strong>
         * <p>默认</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <p>Break count.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Count")
        public Long count;

        public static GetRealtimeInstanceStatesResponseBodyDataBreakCodeDetailList build(java.util.Map<String, ?> map) throws Exception {
            GetRealtimeInstanceStatesResponseBodyDataBreakCodeDetailList self = new GetRealtimeInstanceStatesResponseBodyDataBreakCodeDetailList();
            return TeaModel.build(map, self);
        }

        public GetRealtimeInstanceStatesResponseBodyDataBreakCodeDetailList setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public GetRealtimeInstanceStatesResponseBodyDataBreakCodeDetailList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class GetRealtimeInstanceStatesResponseBodyData extends TeaModel {
        /**
         * <p>List of distributions of break code counts.</p>
         */
        @NameInMap("BreakCodeDetailList")
        public java.util.List<GetRealtimeInstanceStatesResponseBodyDataBreakCodeDetailList> breakCodeDetailList;

        /**
         * <p>Number of agents on break.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BreakingAgents")
        public Long breakingAgents;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Number of calls interacting within IVR.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("InteractiveCalls")
        public Long interactiveCalls;

        /**
         * <p>Number of logged-in agents (including agents in ready, on break, on call, or other non-unpublished statuses).</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LoggedInAgents")
        public Long loggedInAgents;

        /**
         * <p>Maximum queue waiting time among currently queued incoming calls.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LongestWaitingTime")
        public Long longestWaitingTime;

        /**
         * <p>Number of agents in ready status.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ReadyAgents")
        public Long readyAgents;

        /**
         * <p>Number of agents on calls.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TalkingAgents")
        public Long talkingAgents;

        /**
         * <p>Total number of agents.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TotalAgents")
        public Long totalAgents;

        /**
         * <p>Number of incoming calls currently queued.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WaitingCalls")
        public Long waitingCalls;

        /**
         * <p>Number of agents in post-processing status.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WorkingAgents")
        public Long workingAgents;

        public static GetRealtimeInstanceStatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRealtimeInstanceStatesResponseBodyData self = new GetRealtimeInstanceStatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRealtimeInstanceStatesResponseBodyData setBreakCodeDetailList(java.util.List<GetRealtimeInstanceStatesResponseBodyDataBreakCodeDetailList> breakCodeDetailList) {
            this.breakCodeDetailList = breakCodeDetailList;
            return this;
        }
        public java.util.List<GetRealtimeInstanceStatesResponseBodyDataBreakCodeDetailList> getBreakCodeDetailList() {
            return this.breakCodeDetailList;
        }

        public GetRealtimeInstanceStatesResponseBodyData setBreakingAgents(Long breakingAgents) {
            this.breakingAgents = breakingAgents;
            return this;
        }
        public Long getBreakingAgents() {
            return this.breakingAgents;
        }

        public GetRealtimeInstanceStatesResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetRealtimeInstanceStatesResponseBodyData setInteractiveCalls(Long interactiveCalls) {
            this.interactiveCalls = interactiveCalls;
            return this;
        }
        public Long getInteractiveCalls() {
            return this.interactiveCalls;
        }

        public GetRealtimeInstanceStatesResponseBodyData setLoggedInAgents(Long loggedInAgents) {
            this.loggedInAgents = loggedInAgents;
            return this;
        }
        public Long getLoggedInAgents() {
            return this.loggedInAgents;
        }

        public GetRealtimeInstanceStatesResponseBodyData setLongestWaitingTime(Long longestWaitingTime) {
            this.longestWaitingTime = longestWaitingTime;
            return this;
        }
        public Long getLongestWaitingTime() {
            return this.longestWaitingTime;
        }

        public GetRealtimeInstanceStatesResponseBodyData setReadyAgents(Long readyAgents) {
            this.readyAgents = readyAgents;
            return this;
        }
        public Long getReadyAgents() {
            return this.readyAgents;
        }

        public GetRealtimeInstanceStatesResponseBodyData setTalkingAgents(Long talkingAgents) {
            this.talkingAgents = talkingAgents;
            return this;
        }
        public Long getTalkingAgents() {
            return this.talkingAgents;
        }

        public GetRealtimeInstanceStatesResponseBodyData setTotalAgents(Long totalAgents) {
            this.totalAgents = totalAgents;
            return this;
        }
        public Long getTotalAgents() {
            return this.totalAgents;
        }

        public GetRealtimeInstanceStatesResponseBodyData setWaitingCalls(Long waitingCalls) {
            this.waitingCalls = waitingCalls;
            return this;
        }
        public Long getWaitingCalls() {
            return this.waitingCalls;
        }

        public GetRealtimeInstanceStatesResponseBodyData setWorkingAgents(Long workingAgents) {
            this.workingAgents = workingAgents;
            return this;
        }
        public Long getWorkingAgents() {
            return this.workingAgents;
        }

    }

}
