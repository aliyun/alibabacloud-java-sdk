// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListAgentStatesRequest extends TeaModel {
    /**
     * <p>Filters by a list of agent IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>agent@ccc-test</p>
     */
    @NameInMap("AgentIds")
    public String agentIds;

    /**
     * <p>Filters out offline agents. This parameter is fixed to true and does not support false at present.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("ExcludeOfflineUsers")
    public Boolean excludeOfflineUsers;

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
     * <p>Page number, ranging from 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size, ranging from 1 to 300.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Filters by skill group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>skillgroup@ccc-test</p>
     */
    @NameInMap("SkillGroupId")
    public String skillGroupId;

    /**
     * <p>Filters agents by status. Only a single status can be specified.</p>
     * 
     * <strong>example:</strong>
     * <p>Ready</p>
     */
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
