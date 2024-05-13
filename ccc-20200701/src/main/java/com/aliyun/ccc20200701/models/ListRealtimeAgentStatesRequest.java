// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRealtimeAgentStatesRequest extends TeaModel {
    @NameInMap("AgentIdList")
    public String agentIdList;

    @NameInMap("AgentName")
    public String agentName;

    @NameInMap("CallTypeList")
    public String callTypeList;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("OutboundScenario")
    public Boolean outboundScenario;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("Query")
    public String query;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    @NameInMap("StateList")
    public String stateList;

    @NameInMap("WorkModeList")
    public String workModeList;

    public static ListRealtimeAgentStatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListRealtimeAgentStatesRequest self = new ListRealtimeAgentStatesRequest();
        return TeaModel.build(map, self);
    }

    public ListRealtimeAgentStatesRequest setAgentIdList(String agentIdList) {
        this.agentIdList = agentIdList;
        return this;
    }
    public String getAgentIdList() {
        return this.agentIdList;
    }

    public ListRealtimeAgentStatesRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public ListRealtimeAgentStatesRequest setCallTypeList(String callTypeList) {
        this.callTypeList = callTypeList;
        return this;
    }
    public String getCallTypeList() {
        return this.callTypeList;
    }

    public ListRealtimeAgentStatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListRealtimeAgentStatesRequest setOutboundScenario(Boolean outboundScenario) {
        this.outboundScenario = outboundScenario;
        return this;
    }
    public Boolean getOutboundScenario() {
        return this.outboundScenario;
    }

    public ListRealtimeAgentStatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListRealtimeAgentStatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListRealtimeAgentStatesRequest setQuery(String query) {
        this.query = query;
        return this;
    }
    public String getQuery() {
        return this.query;
    }

    public ListRealtimeAgentStatesRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public ListRealtimeAgentStatesRequest setStateList(String stateList) {
        this.stateList = stateList;
        return this;
    }
    public String getStateList() {
        return this.stateList;
    }

    public ListRealtimeAgentStatesRequest setWorkModeList(String workModeList) {
        this.workModeList = workModeList;
        return this;
    }
    public String getWorkModeList() {
        return this.workModeList;
    }

}
