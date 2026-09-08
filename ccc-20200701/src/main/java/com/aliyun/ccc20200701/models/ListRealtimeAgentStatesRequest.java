// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListRealtimeAgentStatesRequest extends TeaModel {
    /**
     * <p>List of agent IDs, formatted as a JSON array string. The array can contain up to 20 elements. This parameter is optional and defaults to empty, which matches all agents under the current instance.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;agent1@ccc-test&quot;, &quot;agent2@ccc-test&quot;]</p>
     */
    @NameInMap("AgentIdList")
    public String agentIdList;

    /**
     * <p>Perform fuzzy matching by agent name.</p>
     * 
     * <strong>example:</strong>
     * <p>agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>Filters by a list of call types. The value is a string in JSON array format, where each array element is a call type. This parameter is optional and defaults to empty, which matches all call types.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;Inbound&quot;, &quot;Outbound&quot;]</p>
     */
    @NameInMap("CallTypeList")
    public String callTypeList;

    /**
     * <p>Instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ccc-test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Media type. The default is Audio. Other options include Chat (text), Video, and ALL.</p>
     * 
     * <strong>example:</strong>
     * <p>AUDIO</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    /**
     * <p>Filters agents who are in outbound-only mode. This parameter is optional and defaults to empty, which means no filtering by outbound-only mode is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("OutboundScenario")
    public Boolean outboundScenario;

    /**
     * <p>Page number, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, ranging from 1 to 100.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Performs fuzzy filtering based on the full or partial agent display name, agent ID, or agent extension number. This parameter is optional and defaults to empty, which means no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>agent</p>
     */
    @NameInMap("Query")
    public String query;

    /**
     * <p>Filter by skill group ID. This parameter is optional and defaults to empty, which means no filtering is applied.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    /**
     * <p>Filters by a list of statuses. This parameter is optional and defaults to empty, which matches all statuses.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;ACW&quot;, &quot;Dialing&quot;]</p>
     */
    @NameInMap("StateList")
    public String stateList;

    /**
     * <p>Filter by work mode list. This parameter is optional and defaults to empty, which means all work modes are matched.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;OFFICE_PHONE&quot;,&quot;ON_SITE&quot;]</p>
     */
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

    public ListRealtimeAgentStatesRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
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
