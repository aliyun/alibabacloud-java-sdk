// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class AddAppAgentRequest extends TeaModel {
    /**
     * <p>Agent ID</p>
     * 
     * <strong>example:</strong>
     * <p>ag.abcxxx</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The agent name.</p>
     * 
     * <strong>example:</strong>
     * <p>Agent1</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>App ID。</p>
     * 
     * <strong>example:</strong>
     * <p>txt_check_agent_01</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>Specifies whether to enable the agent. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Enabled.</li>
     * <li><strong>false</strong>: Disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Enable")
    public Boolean enable;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource type.</p>
     * 
     * <strong>example:</strong>
     * <p>agent_text</p>
     */
    @NameInMap("ResourceType")
    public String resourceType;

    public static AddAppAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAppAgentRequest self = new AddAppAgentRequest();
        return TeaModel.build(map, self);
    }

    public AddAppAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public AddAppAgentRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public AddAppAgentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public AddAppAgentRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public AddAppAgentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddAppAgentRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
