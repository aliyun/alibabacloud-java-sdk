// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.hcs_mgw20240626.models;

import com.aliyun.tea.*;

public class GetAgentResp extends TeaModel {
    @NameInMap("ActivationKey")
    public String activationKey;

    /**
     * <strong>example:</strong>
     * <p>vpc</p>
     */
    @NameInMap("AgentEndpoint")
    public String agentEndpoint;

    /**
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("CreateTime")
    public String createTime;

    /**
     * <strong>example:</strong>
     * <p>default</p>
     */
    @NameInMap("DeployMethod")
    public String deployMethod;

    /**
     * <strong>example:</strong>
     * <p>2024-05-01 12:00:00</p>
     */
    @NameInMap("ModifyTime")
    public String modifyTime;

    /**
     * <strong>example:</strong>
     * <p>test_name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <strong>example:</strong>
     * <p>test_owner</p>
     */
    @NameInMap("Owner")
    public String owner;

    /**
     * <strong>example:</strong>
     * <p>K1:V1,K2:V2</p>
     */
    @NameInMap("Tags")
    public String tags;

    /**
     * <strong>example:</strong>
     * <p>test_tunnel_id</p>
     */
    @NameInMap("TunnelId")
    public String tunnelId;

    /**
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
