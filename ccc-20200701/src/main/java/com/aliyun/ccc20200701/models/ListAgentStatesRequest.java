// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAgentStatesRequest extends TeaModel {
    @NameInMap("AgentIds")
    public String agentIds;

    @NameInMap("ExcludeOfflineUsers")
    public Boolean excludeOfflineUsers;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("SkillGroupId")
    public String skillGroupId;

    @NameInMap("State")
    public String state;

    public static ListAgentStatesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentStatesRequest self = new ListAgentStatesRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentStatesRequest setAgentIds(String agentIds) {
        this.agentIds = agentIds;
        return this;
    }
    public String getAgentIds() {
        return this.agentIds;
    }

    public ListAgentStatesRequest setExcludeOfflineUsers(Boolean excludeOfflineUsers) {
        this.excludeOfflineUsers = excludeOfflineUsers;
        return this;
    }
    public Boolean getExcludeOfflineUsers() {
        return this.excludeOfflineUsers;
    }

    public ListAgentStatesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListAgentStatesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentStatesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentStatesRequest setSkillGroupId(String skillGroupId) {
        this.skillGroupId = skillGroupId;
        return this;
    }
    public String getSkillGroupId() {
        return this.skillGroupId;
    }

    public ListAgentStatesRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
