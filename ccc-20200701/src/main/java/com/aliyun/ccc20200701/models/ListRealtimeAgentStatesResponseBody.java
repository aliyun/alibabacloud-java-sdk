// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRealtimeAgentStatesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListRealtimeAgentStatesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("AgentId")
        public String agentId;

        @NameInMap("AgentName")
        public String agentName;

        @NameInMap("CounterParty")
        public String counterParty;

        @NameInMap("Extension")
        public String extension;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OutboundScenario")
        public Boolean outboundScenario;

        @NameInMap("SkillGroupIdList")
        public java.util.List<String> skillGroupIdList;

        @NameInMap("SkillGroupNameList")
        public java.util.List<String> skillGroupNameList;

        @NameInMap("State")
        public String state;

        @NameInMap("StateCode")
        public String stateCode;

        @NameInMap("StateTime")
        public Long stateTime;

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

        public ListRealtimeAgentStatesResponseBodyDataList setCounterParty(String counterParty) {
            this.counterParty = counterParty;
            return this;
        }
        public String getCounterParty() {
            return this.counterParty;
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
        @NameInMap("List")
        public java.util.List<ListRealtimeAgentStatesResponseBodyDataList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

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
