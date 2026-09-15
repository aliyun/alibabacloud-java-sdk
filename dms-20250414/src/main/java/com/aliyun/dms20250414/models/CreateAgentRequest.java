// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms20250414.models;

import com.aliyun.tea.*;

public class CreateAgentRequest extends TeaModel {
    /**
     * <p>The agent name. The name must be unique within the same tenant. Maximum length: 128 characters.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>order-analysis-agent</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The permission inheritance type of the agent, which specifies the permission source. Default value: HUMAN_BOUND.</p>
     * 
     * <strong>example:</strong>
     * <p>HUMAN_BOUND</p>
     */
    @NameInMap("AgentType")
    public String agentType;

    /**
     * <p>The description of the agent. Maximum length: 512 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>An agent for querying and analyzing order data</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The validity period of the automatically issued API key, in seconds. Valid values: 1 to 31536000 (up to 1 year).</p>
     * 
     * <strong>example:</strong>
     * <p>2592000</p>
     */
    @NameInMap("ExpireAfterSeconds")
    public Integer expireAfterSeconds;

    public static CreateAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAgentRequest self = new CreateAgentRequest();
        return TeaModel.build(map, self);
    }

    public CreateAgentRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public CreateAgentRequest setAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }
    public String getAgentType() {
        return this.agentType;
    }

    public CreateAgentRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateAgentRequest setExpireAfterSeconds(Integer expireAfterSeconds) {
        this.expireAfterSeconds = expireAfterSeconds;
        return this;
    }
    public Integer getExpireAfterSeconds() {
        return this.expireAfterSeconds;
    }

}
