// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetAgentResp extends TeaModel {
    /**
     * <p>The security code of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>6af62558-970d-4f44-8663-4e297170fd6a</p>
     */
    @NameInMap("ActivationKey")
    public String activationKey;

    /**
     * <p>The method that is used to access the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("AgentEndpoint")
    public String agentEndpoint;

    /**
     * <p>The time when the agent was created.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01T12:00:00.000Z</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <p>The deployment mode of the agent.</p>
     * 
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DeployMethod")
    public String deployMethod;

    /**
     * <p>The time when the agent was last modified.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-05-01T12:00:00.000Z</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <p>The agent name.</p>
     * 
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The agent owner.</p>
     * 
     * <strong>example:</strong>
     * <p>test_owner</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <p>The tags.</p>
     * 
     * <strong>example:</strong>
     * <p>K1:V1,K2:V2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <p>The tunnel ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test_tunnel_id</p>
     */
    @NameInMap("TunnelId")
    public String tunnelId;

    /**
     * <p>The agent ID.</p>
     * 
     * <strong>example:</strong>
     * <p>test_agent_id</p>
     */
    @NameInMap("Version")
    public String version;

    public static GetAgentResp build(java.util.Map<String, ?> map) throws Exception {
        GetAgentResp self = new GetAgentResp();
        return TeaModel.build(map, self);
    }

    public GetAgentResp setActivationKey(String activationKey) {
        this.activationKey = activationKey;
        return this;
    }
    public String getActivationKey() {
        return this.activationKey;
    }

    public GetAgentResp setAgentEndpoint(String agentEndpoint) {
        this.agentEndpoint = agentEndpoint;
        return this;
    }
    public String getAgentEndpoint() {
        return this.agentEndpoint;
    }

    public GetAgentResp setCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }
    public String getCreateTime() {
        return this.createTime;
    }

    public GetAgentResp setDeployMethod(String deployMethod) {
        this.deployMethod = deployMethod;
        return this;
    }
    public String getDeployMethod() {
        return this.deployMethod;
    }

    public GetAgentResp setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
        return this;
    }
    public String getModifyTime() {
        return this.modifyTime;
    }

    public GetAgentResp setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetAgentResp setOwner(String owner) {
        this.owner = owner;
        return this;
    }
    public String getOwner() {
        return this.owner;
    }

    public GetAgentResp setTags(String tags) {
        this.tags = tags;
        return this;
    }
    public String getTags() {
        return this.tags;
    }

    public GetAgentResp setTunnelId(String tunnelId) {
        this.tunnelId = tunnelId;
        return this;
    }
    public String getTunnelId() {
        return this.tunnelId;
    }

    public GetAgentResp setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

}
