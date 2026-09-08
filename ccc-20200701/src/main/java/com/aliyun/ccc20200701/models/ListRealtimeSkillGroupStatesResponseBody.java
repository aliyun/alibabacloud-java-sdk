// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRealtimeSkillGroupStatesResponseBody extends TeaModel {
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
    public ListRealtimeSkillGroupStatesResponseBodyData data;

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
     * <p>26A34338-5CD9-4C95-A7A6-5BDCE76C6B94</p>
     */
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
        /**
         * <p>Break status code</p>
         * 
         * <strong>example:</strong>
         * <p>客户自定义参数，比如午餐、会议等</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <p>The number of times the break status occurred</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>Break statistics.</p>
         */
        @NameInMap("BreakCodeDetailList")
        public java.util.List<ListRealtimeSkillGroupStatesResponseBodyDataListBreakCodeDetailList> breakCodeDetailList;

        /**
         * <p>Number of agents currently on break.</p>
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
         * <p>Number of agents currently logged in.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("LoggedInAgents")
        public Long loggedInAgents;

        /**
         * <p>Current maximum queue waiting time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("LongestWaitingTime")
        public Long longestWaitingTime;

        /**
         * <p>Number of agents in outbound-only mode and in an idle status.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OutboundScenarioReadyAgents")
        public Long outboundScenarioReadyAgents;

        /**
         * <p>Number of agents currently idle.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ReadyAgents")
        public Long readyAgents;

        /**
         * <p>Skill group ID.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup@ccc-test</p>
         */
        @NameInMap("SkillGroupId")
        public String skillGroupId;

        /**
         * <p>Skill group name.</p>
         * 
         * <strong>example:</strong>
         * <p>skillgroup</p>
         */
        @NameInMap("SkillGroupName")
        public String skillGroupName;

        /**
         * <p>Number of agents currently on a call.</p>
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
         * <p>12</p>
         */
        @NameInMap("TotalAgents")
        public Long totalAgents;

        /**
         * <p>Number of calls currently in the queue.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("WaitingCalls")
        public Long waitingCalls;

        /**
         * <p>Number of agents currently in post-processing.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
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
        /**
         * <p>List of real-time skill group status data.</p>
         */
        @NameInMap("List")
        public java.util.List<ListRealtimeSkillGroupStatesResponseBodyDataList> list;

        /**
         * <p>Page number, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Integer pageNumber;

        /**
         * <p>Page size, ranging from 1 to 100.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Integer pageSize;

        /**
         * <p>Total count.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
