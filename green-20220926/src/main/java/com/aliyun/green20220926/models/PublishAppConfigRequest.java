// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class PublishAppConfigRequest extends TeaModel {
    /**
     * <p>The agent ID. This parameter must be the AgentId returned by the AddAppAgent operation after the agent is added.</p>
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
     * <p>Agent 1</p>
     */
    @NameInMap("AgentName")
    public String agentName;

    /**
     * <p>The application ID. This parameter must be the AppId returned by the AddAppConfig operation after the application is created.</p>
     * 
     * <strong>example:</strong>
     * <p>txt_check_agent_01</p>
     */
    @NameInMap("AppId")
    public String appId;

    /**
     * <p>The configuration details. The value is a JSON string. The outer object contains the agentItemConfigs field, and its value is a re-serialized JSON array string (a double-nested structure) represented as a sequence of characters. Each array element in agentItemConfigs is an agent configuration object. Supported fields include agentId (string, the agent ID. Use the actual value returned by AddAppAgent or a clear placeholder such as <your-agent-id>), name (string, the agent name), and enable (boolean, specifies whether to enable the agent). Differences and connections with the Config parameter of ModifyAppAgent: The Config parameter of ModifyAppAgent describes the runtime configuration of a single agent (model, scene, or labelConfig), and you must first configure the agent by calling ModifyAppAgent. The Config parameter of this operation aggregates all agent entries (agentItemConfigs) under the application for overall publishing.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;agentItemConfigs&quot;: &quot;[{\&quot;agentId\&quot;:\&quot;ag.abcxxx\&quot;,\&quot;enable\&quot;:true,\&quot;name\&quot;:\&quot;Agent 1\&quot;}]&quot;}</p>
     */
    @NameInMap("Config")
    public String config;

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

    public static PublishAppConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PublishAppConfigRequest self = new PublishAppConfigRequest();
        return TeaModel.build(map, self);
    }

    public PublishAppConfigRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public PublishAppConfigRequest setAgentName(String agentName) {
        this.agentName = agentName;
        return this;
    }
    public String getAgentName() {
        return this.agentName;
    }

    public PublishAppConfigRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public PublishAppConfigRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public PublishAppConfigRequest setEnable(Boolean enable) {
        this.enable = enable;
        return this;
    }
    public Boolean getEnable() {
        return this.enable;
    }

    public PublishAppConfigRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public PublishAppConfigRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
