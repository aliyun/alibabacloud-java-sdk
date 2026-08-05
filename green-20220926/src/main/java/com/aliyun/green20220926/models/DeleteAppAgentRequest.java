// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20220926.models;

import com.aliyun.tea.*;

public class DeleteAppAgentRequest extends TeaModel {
    /**
     * <p>Agent ID。</p>
     * 
     * <strong>example:</strong>
     * <p>ag.abcxxx</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>App ID。</p>
     * 
     * <strong>example:</strong>
     * <p>txt_check_agent_01</p>
     */
    @NameInMap("AppId")
    public String appId;

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

    public static DeleteAppAgentRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAppAgentRequest self = new DeleteAppAgentRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAppAgentRequest setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DeleteAppAgentRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public DeleteAppAgentRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteAppAgentRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
