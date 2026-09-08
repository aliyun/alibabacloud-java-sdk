// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRealtimeAgentStatesResponseBody extends TeaModel {
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
    public ListRealtimeAgentStatesResponseBodyData data;

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
     * <p>EEEE671A-3E24-4A04-81E6-6C4F5B39DF75</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListRealtimeAgentStatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeAgentStatesResponseBody self = new ListRealtimeAgentStatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListRealtimeAgentStatesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListRealtimeAgentStatesResponseBody setData(ListRealtimeAgentStatesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListRealtimeAgentStatesResponseBodyData getData() {
        return this.data;
    }

    public ListRealtimeAgentStatesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListRealtimeAgentStatesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListRealtimeAgentStatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListRealtimeAgentStatesResponseBodyDataList extends TeaModel {
        /**
         * <p>Agent ID.</p>
         * 
         * <strong>example:</strong>
         * <p>agent1@ccc-test</p>
         */
        @NameInMap("AgentId")
        public String agentId;

        /**
         * <p>Agent name.</p>
         * 
         * <strong>example:</strong>
         * <p>坐席小王</p>
         */
        @NameInMap("AgentName")
        public String agentName;

        /**
         * <p>Break code.</p>
         * <p><strong>Enumeration values:</strong></p>
         * <ul>
         * <li><p>RingingTimeout: Break caused by agent ringing timeout.</p>
         * </li>
         * <li><p>RejectCall: Break caused by agent call rejection.</p>
         * </li>
         * <li><p>Warm-up: Temporary break state after the agent is published and before becoming idle.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Warm-up</p>
         */
        @NameInMap("BreakCode")
        public String breakCode;

        /**
         * <p>Call type.</p>
         * 
         * <strong>example:</strong>
         * <p>Outbound</p>
         */
        @NameInMap("CallType")
        public String callType;

        /**
         * <p>Used in specific three-party scenarios, primarily for listener, coaching, and consultation. In three-party scenarios, it represents the third party—for example, the agent being monitored or coached in a listener or coaching scenario, or the agent or external number to which a call is transferred in a consultation scenario.</p>
         * 
         * <strong>example:</strong>
         * <p>agent@ccc-test</p>
         */
        @NameInMap("CounterParty")
        public String counterParty;

        /**
         * <p>Duration of the current status, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>16</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The agent\&quot;s extension number.</p>
         * 
         * <strong>example:</strong>
         * <p>80317391</p>
         */
        @NameInMap("Extension")
        public String extension;

        /**
         * <p>Instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The agent\&quot;s personal phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1382114****</p>
         */
        @NameInMap("Mobile")
        public String mobile;

        /**
         * <p>Whether the agent is in outbound-only mode.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        /**
         * <p>List of skill group IDs that the agent has signed into.</p>
         */
        @NameInMap("SkillGroupIdList")
        public java.util.List<String> skillGroupIdList;

        /**
         * <p>List of skill group names that the agent has signed into.</p>
         */
        @NameInMap("SkillGroupNameList")
        public java.util.List<String> skillGroupNameList;

        /**
         * <p>Agent status.</p>
         * 
         * <strong>example:</strong>
         * <p>ACW</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>Sub-status. In some scenarios, the agent\&quot;s status cannot be fully represented by the State field alone, so a sub-status is required for clarification. For example, when an agent is being monitored, State=Talking and StateCode=Monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p>Monitored</p>
         */
        @NameInMap("StateCode")
        public String stateCode;

        /**
         * <p>Time when the status started.</p>
         * 
         * <strong>example:</strong>
         * <p>1696670640774</p>
         */
        @NameInMap("StateTime")
        public Long stateTime;

        /**
         * <p>Work mode.</p>
         * 
         * <strong>example:</strong>
         * <p>ON_SITE</p>
         */
        @NameInMap("WorkMode")
        public String workMode;

        public static ListRealtimeAgentStatesResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeAgentStatesResponseBodyDataList self = new ListRealtimeAgentStatesResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListRealtimeAgentStatesResponseBodyDataList setAgentId(String agentId) {
            this.agentId = agentId;
            return this;
        }
        public String getAgentId() {
            return this.agentId;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setAgentName(String agentName) {
            this.agentName = agentName;
            return this;
        }
        public String getAgentName() {
            return this.agentName;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setBreakCode(String breakCode) {
            this.breakCode = breakCode;
            return this;
        }
        public String getBreakCode() {
            return this.breakCode;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setCallType(String callType) {
            this.callType = callType;
            return this;
        }
        public String getCallType() {
            return this.callType;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setCounterParty(String counterParty) {
            this.counterParty = counterParty;
            return this;
        }
        public String getCounterParty() {
            return this.counterParty;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setExtension(String extension) {
            this.extension = extension;
            return this;
        }
        public String getExtension() {
            return this.extension;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setOutboundScenario(Boolean outboundScenario) {
            this.outboundScenario = outboundScenario;
            return this;
        }
        public Boolean getOutboundScenario() {
            return this.outboundScenario;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setSkillGroupIdList(java.util.List<String> skillGroupIdList) {
            this.skillGroupIdList = skillGroupIdList;
            return this;
        }
        public java.util.List<String> getSkillGroupIdList() {
            return this.skillGroupIdList;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setSkillGroupNameList(java.util.List<String> skillGroupNameList) {
            this.skillGroupNameList = skillGroupNameList;
            return this;
        }
        public java.util.List<String> getSkillGroupNameList() {
            return this.skillGroupNameList;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setStateCode(String stateCode) {
            this.stateCode = stateCode;
            return this;
        }
        public String getStateCode() {
            return this.stateCode;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setStateTime(Long stateTime) {
            this.stateTime = stateTime;
            return this;
        }
        public Long getStateTime() {
            return this.stateTime;
        }

        public ListRealtimeAgentStatesResponseBodyDataList setWorkMode(String workMode) {
            this.workMode = workMode;
            return this;
        }
        public String getWorkMode() {
            return this.workMode;
        }

    }

    public static class ListRealtimeAgentStatesResponseBodyData extends TeaModel {
        /**
         * <p>List of real-time agent status data.</p>
         */
        @NameInMap("List")
        public java.util.List<ListRealtimeAgentStatesResponseBodyDataList> list;

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
         * <p>1</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListRealtimeAgentStatesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListRealtimeAgentStatesResponseBodyData self = new ListRealtimeAgentStatesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListRealtimeAgentStatesResponseBodyData setList(java.util.List<ListRealtimeAgentStatesResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListRealtimeAgentStatesResponseBodyDataList> getList() {
            return this.list;
        }

        public ListRealtimeAgentStatesResponseBodyData setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListRealtimeAgentStatesResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListRealtimeAgentStatesResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
