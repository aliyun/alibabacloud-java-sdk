// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRealtimeSkillGroupStatesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListRealtimeSkillGroupStatesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ListRealtimeSkillGroupStatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeSkillGroupStatesResponseBody self = new ListRealtimeSkillGroupStatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRealtimeSkillGroupStatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRealtimeSkillGroupStatesResponseBody setData(ListRealtimeSkillGroupStatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRealtimeSkillGroupStatesResponseBodyData getData() {
        return this.data;
    }

    public ListRealtimeSkillGroupStatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRealtimeSkillGroupStatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRealtimeSkillGroupStatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRealtimeSkillGroupStatesResponseBodyDataListBreakCodeDetailList extends TeaModel {
        @NameInMap("BreakCode")
        public String breakCode;

        @NameInMap("Count")
        public Long count;

        public static ListRealtimeSkillGroupStatesResponseBodyDataListBreakCodeDetailList build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeSkillGroupStatesResponseBodyDataListBreakCodeDetailList self = new ListRealtimeSkillGroupStatesResponseBodyDataListBreakCodeDetailList();
            return TeaModel.build(map, self);
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataListBreakCodeDetailList setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataListBreakCodeDetailList setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

    }

    public static class ListRealtimeSkillGroupStatesResponseBodyDataList extends TeaModel {
        @NameInMap("BreakCodeDetailList")
        public java.util.List<ListRealtimeSkillGroupStatesResponseBodyDataListBreakCodeDetailList> breakCodeDetailList;

        @NameInMap("BreakingAgents")
        public Long breakingAgents;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LoggedInAgents")
        public Long loggedInAgents;

        @NameInMap("LongestWaitingTime")
        public Long longestWaitingTime;

        @NameInMap("OutboundScenarioReadyAgents")
        public Long outboundScenarioReadyAgents;

        @NameInMap("ReadyAgents")
        public Long readyAgents;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("TalkingAgents")
        public Long talkingAgents;

        @NameInMap("TotalAgents")
        public Long totalAgents;

        @NameInMap("WaitingCalls")
        public Long waitingCalls;

        @NameInMap("WorkingAgents")
        public Long workingAgents;

        public static ListRealtimeSkillGroupStatesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeSkillGroupStatesResponseBodyDataList self = new ListRealtimeSkillGroupStatesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setBreakCodeDetailList(java.util.List<ListRealtimeSkillGroupStatesResponseBodyDataListBreakCodeDetailList> breakCodeDetailList) {
            this.breakCodeDetailList = breakCodeDetailList;
            return this;
        }
        public java.util.List<ListRealtimeSkillGroupStatesResponseBodyDataListBreakCodeDetailList> getBreakCodeDetailList() {
            return this.breakCodeDetailList;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setBreakingAgents(Long breakingAgents) {
            this.breakingAgents = breakingAgents;
            return this;
        }
        public Long getBreakingAgents() {
            return this.breakingAgents;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setLoggedInAgents(Long loggedInAgents) {
            this.loggedInAgents = loggedInAgents;
            return this;
        }
        public Long getLoggedInAgents() {
            return this.loggedInAgents;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setLongestWaitingTime(Long longestWaitingTime) {
            this.longestWaitingTime = longestWaitingTime;
            return this;
        }
        public Long getLongestWaitingTime() {
            return this.longestWaitingTime;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setOutboundScenarioReadyAgents(Long outboundScenarioReadyAgents) {
            this.outboundScenarioReadyAgents = outboundScenarioReadyAgents;
            return this;
        }
        public Long getOutboundScenarioReadyAgents() {
            return this.outboundScenarioReadyAgents;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setReadyAgents(Long readyAgents) {
            this.readyAgents = readyAgents;
            return this;
        }
        public Long getReadyAgents() {
            return this.readyAgents;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setTalkingAgents(Long talkingAgents) {
            this.talkingAgents = talkingAgents;
            return this;
        }
        public Long getTalkingAgents() {
            return this.talkingAgents;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setTotalAgents(Long totalAgents) {
            this.totalAgents = totalAgents;
            return this;
        }
        public Long getTotalAgents() {
            return this.totalAgents;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setWaitingCalls(Long waitingCalls) {
            this.waitingCalls = waitingCalls;
            return this;
        }
        public Long getWaitingCalls() {
            return this.waitingCalls;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setWorkingAgents(Long workingAgents) {
            this.workingAgents = workingAgents;
            return this;
        }
        public Long getWorkingAgents() {
            return this.workingAgents;
        }

    }

    public static class ListRealtimeSkillGroupStatesResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListRealtimeSkillGroupStatesResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRealtimeSkillGroupStatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeSkillGroupStatesResponseBodyData self = new ListRealtimeSkillGroupStatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRealtimeSkillGroupStatesResponseBodyData setList(java.util.List<ListRealtimeSkillGroupStatesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListRealtimeSkillGroupStatesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListRealtimeSkillGroupStatesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRealtimeSkillGroupStatesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRealtimeSkillGroupStatesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
