// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListSkillGroupStatesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListSkillGroupStatesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListSkillGroupStatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListSkillGroupStatesResponseBody self = new ListSkillGroupStatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListSkillGroupStatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListSkillGroupStatesResponseBody setData(ListSkillGroupStatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListSkillGroupStatesResponseBodyData getData() {
        return this.data;
    }

    public ListSkillGroupStatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListSkillGroupStatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListSkillGroupStatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListSkillGroupStatesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListSkillGroupStatesResponseBodyDataList extends TeaModel {
        @NameInMap("AverageWaitingTime")
        public Long averageWaitingTime;

        @NameInMap("BreakingAgents")
        public Long breakingAgents;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LoggedInAgents")
        public Long loggedInAgents;

        @NameInMap("LongestCall")
        public Long longestCall;

        @NameInMap("ReadyAgents")
        public Long readyAgents;

        @NameInMap("SkillGroupId")
        public String skillGroupId;

        @NameInMap("SkillGroupName")
        public String skillGroupName;

        @NameInMap("TalkingAgents")
        public Long talkingAgents;

        @NameInMap("WaitingCalls")
        public Long waitingCalls;

        @NameInMap("WaitingCallsLevel10")
        public Long waitingCallsLevel10;

        @NameInMap("WaitingCallsLevel20")
        public Long waitingCallsLevel20;

        @NameInMap("WaitingCallsLevel30")
        public Long waitingCallsLevel30;

        @NameInMap("WorkingAgents")
        public Long workingAgents;

        public static ListSkillGroupStatesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupStatesResponseBodyDataList self = new ListSkillGroupStatesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupStatesResponseBodyDataList setAverageWaitingTime(Long averageWaitingTime) {
            this.averageWaitingTime = averageWaitingTime;
            return this;
        }
        public Long getAverageWaitingTime() {
            return this.averageWaitingTime;
        }

        public ListSkillGroupStatesResponseBodyDataList setBreakingAgents(Long breakingAgents) {
            this.breakingAgents = breakingAgents;
            return this;
        }
        public Long getBreakingAgents() {
            return this.breakingAgents;
        }

        public ListSkillGroupStatesResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSkillGroupStatesResponseBodyDataList setLoggedInAgents(Long loggedInAgents) {
            this.loggedInAgents = loggedInAgents;
            return this;
        }
        public Long getLoggedInAgents() {
            return this.loggedInAgents;
        }

        public ListSkillGroupStatesResponseBodyDataList setLongestCall(Long longestCall) {
            this.longestCall = longestCall;
            return this;
        }
        public Long getLongestCall() {
            return this.longestCall;
        }

        public ListSkillGroupStatesResponseBodyDataList setReadyAgents(Long readyAgents) {
            this.readyAgents = readyAgents;
            return this;
        }
        public Long getReadyAgents() {
            return this.readyAgents;
        }

        public ListSkillGroupStatesResponseBodyDataList setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillGroupStatesResponseBodyDataList setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListSkillGroupStatesResponseBodyDataList setTalkingAgents(Long talkingAgents) {
            this.talkingAgents = talkingAgents;
            return this;
        }
        public Long getTalkingAgents() {
            return this.talkingAgents;
        }

        public ListSkillGroupStatesResponseBodyDataList setWaitingCalls(Long waitingCalls) {
            this.waitingCalls = waitingCalls;
            return this;
        }
        public Long getWaitingCalls() {
            return this.waitingCalls;
        }

        public ListSkillGroupStatesResponseBodyDataList setWaitingCallsLevel10(Long waitingCallsLevel10) {
            this.waitingCallsLevel10 = waitingCallsLevel10;
            return this;
        }
        public Long getWaitingCallsLevel10() {
            return this.waitingCallsLevel10;
        }

        public ListSkillGroupStatesResponseBodyDataList setWaitingCallsLevel20(Long waitingCallsLevel20) {
            this.waitingCallsLevel20 = waitingCallsLevel20;
            return this;
        }
        public Long getWaitingCallsLevel20() {
            return this.waitingCallsLevel20;
        }

        public ListSkillGroupStatesResponseBodyDataList setWaitingCallsLevel30(Long waitingCallsLevel30) {
            this.waitingCallsLevel30 = waitingCallsLevel30;
            return this;
        }
        public Long getWaitingCallsLevel30() {
            return this.waitingCallsLevel30;
        }

        public ListSkillGroupStatesResponseBodyDataList setWorkingAgents(Long workingAgents) {
            this.workingAgents = workingAgents;
            return this;
        }
        public Long getWorkingAgents() {
            return this.workingAgents;
        }

    }

    public static class ListSkillGroupStatesResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListSkillGroupStatesResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListSkillGroupStatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupStatesResponseBodyData self = new ListSkillGroupStatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupStatesResponseBodyData setList(java.util.List<ListSkillGroupStatesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListSkillGroupStatesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListSkillGroupStatesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListSkillGroupStatesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListSkillGroupStatesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
