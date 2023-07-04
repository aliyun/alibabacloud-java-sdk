// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class UpdateAgentStatusRequest extends TeaModel {
    /**
     * <p>坐席ID</p>
     */
    @NameInMap("AgentId")
    public Long agentId;

    /**
     * <p>坐席状态 1:在线；2:忙碌；3:小休；4:离线</p>
     */
    @NameInMap("AgentStatus")
    public Long agentStatus;

    /**
     * <p>坐席标签</p>
     */
    @NameInMap("AgentTag")
    public String agentTag;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateAgentStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAgentStatusRequest self = new UpdateAgentStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAgentStatusRequest setAgentId(Long agentId) {
        this.agentId = agentId;
        return this;
    }
    public Long getAgentId() {
        return this.agentId;
    }

    public UpdateAgentStatusRequest setAgentStatus(Long agentStatus) {
        this.agentStatus = agentStatus;
        return this;
    }
    public Long getAgentStatus() {
        return this.agentStatus;
    }

    public UpdateAgentStatusRequest setAgentTag(String agentTag) {
        this.agentTag = agentTag;
        return this;
    }
    public String getAgentTag() {
        return this.agentTag;
    }

    public UpdateAgentStatusRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateAgentStatusRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateAgentStatusRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
