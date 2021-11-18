// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20170705.models;

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

    public static class ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState extends TeaModel {
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

        @NameInMap("WorkingAgents")
        public Long workingAgents;

        public static ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState self = new ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState setBreakingAgents(Long breakingAgents) {
            this.breakingAgents = breakingAgents;
            return this;
        }
        public Long getBreakingAgents() {
            return this.breakingAgents;
        }

        public ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState setLoggedInAgents(Long loggedInAgents) {
            this.loggedInAgents = loggedInAgents;
            return this;
        }
        public Long getLoggedInAgents() {
            return this.loggedInAgents;
        }

        public ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState setLongestCall(Long longestCall) {
            this.longestCall = longestCall;
            return this;
        }
        public Long getLongestCall() {
            return this.longestCall;
        }

        public ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState setReadyAgents(Long readyAgents) {
            this.readyAgents = readyAgents;
            return this;
        }
        public Long getReadyAgents() {
            return this.readyAgents;
        }

        public ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState setSkillGroupId(String skillGroupId) {
            this.skillGroupId = skillGroupId;
            return this;
        }
        public String getSkillGroupId() {
            return this.skillGroupId;
        }

        public ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState setSkillGroupName(String skillGroupName) {
            this.skillGroupName = skillGroupName;
            return this;
        }
        public String getSkillGroupName() {
            return this.skillGroupName;
        }

        public ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState setTalkingAgents(Long talkingAgents) {
            this.talkingAgents = talkingAgents;
            return this;
        }
        public Long getTalkingAgents() {
            return this.talkingAgents;
        }

        public ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState setWaitingCalls(Long waitingCalls) {
            this.waitingCalls = waitingCalls;
            return this;
        }
        public Long getWaitingCalls() {
            return this.waitingCalls;
        }

        public ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState setWorkingAgents(Long workingAgents) {
            this.workingAgents = workingAgents;
            return this;
        }
        public Long getWorkingAgents() {
            return this.workingAgents;
        }

    }

    public static class ListSkillGroupStatesResponseBodyDataList extends TeaModel {
        @NameInMap("RealTimeSkillGroupState")
        public java.util.List<ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState> realTimeSkillGroupState;

        public static ListSkillGroupStatesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListSkillGroupStatesResponseBodyDataList self = new ListSkillGroupStatesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListSkillGroupStatesResponseBodyDataList setRealTimeSkillGroupState(java.util.List<ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState> realTimeSkillGroupState) {
            this.realTimeSkillGroupState = realTimeSkillGroupState;
            return this;
        }
        public java.util.List<ListSkillGroupStatesResponseBodyDataListRealTimeSkillGroupState> getRealTimeSkillGroupState() {
            return this.realTimeSkillGroupState;
        }

    }

    public static class ListSkillGroupStatesResponseBodyData extends TeaModel {
        @NameInMap("List")
        public ListSkillGroupStatesResponseBodyDataList list;

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

        public ListSkillGroupStatesResponseBodyData setList(ListSkillGroupStatesResponseBodyDataList list) {
            this.list = list;
            return this;
        }
        public ListSkillGroupStatesResponseBodyDataList getList() {
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
