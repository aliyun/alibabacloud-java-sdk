// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetRealtimeInstanceStatesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetRealtimeInstanceStatesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("BreakCode")
        public String breakCode;

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
        @NameInMap("BreakCodeDetailList")
        public java.util.List<GetRealtimeInstanceStatesResponseBodyDataBreakCodeDetailList> breakCodeDetailList;

        @NameInMap("BreakingAgents")
        public Long breakingAgents;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InteractiveCalls")
        public Long interactiveCalls;

        @NameInMap("LoggedInAgents")
        public Long loggedInAgents;

        @NameInMap("LongestWaitingTime")
        public Long longestWaitingTime;

        @NameInMap("ReadyAgents")
        public Long readyAgents;

        @NameInMap("TalkingAgents")
        public Long talkingAgents;

        @NameInMap("TotalAgents")
        public Long totalAgents;

        @NameInMap("WaitingCalls")
        public Long waitingCalls;

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
