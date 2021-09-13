// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRealtimeSkillGroupStatesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public ListRealtimeSkillGroupStatesResponseBodyData data;

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

    public ListRealtimeSkillGroupStatesResponseBody setData(ListRealtimeSkillGroupStatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRealtimeSkillGroupStatesResponseBodyData getData() {
        return this.data;
    }

    public static class ListRealtimeSkillGroupStatesResponseBodyDataList extends TeaModel {
        @NameInMap("WorkingAgents")
        public Long workingAgents;

        @NameInMap("LongestWaitingTime")
        public Long longestWaitingTime;

        @NameInMap("LoggedInAgents")
        public Long loggedInAgents;

        @NameInMap("WaitingCalls")
        public Long waitingCalls;

        @NameInMap("BreakingAgents")
        public Long breakingAgents;

        @NameInMap("TalkingAgents")
        public Long talkingAgents;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("ReadyAgents")
        public Long readyAgents;

        @NameInMap("InstanceId")
        public String instanceId;

        public static ListRealtimeSkillGroupStatesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeSkillGroupStatesResponseBodyDataList self = new ListRealtimeSkillGroupStatesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setWorkingAgents(Long workingAgents) {
            this.workingAgents = workingAgents;
            return this;
        }
        public Long getWorkingAgents() {
            return this.workingAgents;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setLongestWaitingTime(Long longestWaitingTime) {
            this.longestWaitingTime = longestWaitingTime;
            return this;
        }
        public Long getLongestWaitingTime() {
            return this.longestWaitingTime;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setLoggedInAgents(Long loggedInAgents) {
            this.loggedInAgents = loggedInAgents;
            return this;
        }
        public Long getLoggedInAgents() {
            return this.loggedInAgents;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setWaitingCalls(Long waitingCalls) {
            this.waitingCalls = waitingCalls;
            return this;
        }
        public Long getWaitingCalls() {
            return this.waitingCalls;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setBreakingAgents(Long breakingAgents) {
            this.breakingAgents = breakingAgents;
            return this;
        }
        public Long getBreakingAgents() {
            return this.breakingAgents;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setTalkingAgents(Long talkingAgents) {
            this.talkingAgents = talkingAgents;
            return this;
        }
        public Long getTalkingAgents() {
            return this.talkingAgents;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setReadyAgents(Long readyAgents) {
            this.readyAgents = readyAgents;
            return this;
        }
        public Long getReadyAgents() {
            return this.readyAgents;
        }

        public ListRealtimeSkillGroupStatesResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

    public static class ListRealtimeSkillGroupStatesResponseBodyData extends TeaModel {
        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("List")
        public java.util.List<ListRealtimeSkillGroupStatesResponseBodyDataList> list;

        public static ListRealtimeSkillGroupStatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeSkillGroupStatesResponseBodyData self = new ListRealtimeSkillGroupStatesResponseBodyData();
            return TeaModel.build(map, self);
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

        public ListRealtimeSkillGroupStatesResponseBodyData setList(java.util.List<ListRealtimeSkillGroupStatesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListRealtimeSkillGroupStatesResponseBodyDataList> getList() {
            return this.list;
        }

    }

}
