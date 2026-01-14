// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class JoinAgentGroupShrinkRequest extends TeaModel {
    /**
     * <p>坐席组ID</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("AgentGroupId")
    public Long agentGroupId;

    /**
     * <p>坐席ID列表</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AgentIds")
    public String agentIdsShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static JoinAgentGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        JoinAgentGroupShrinkRequest self = new JoinAgentGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public JoinAgentGroupShrinkRequest setAgentGroupId(Long agentGroupId) {
        this.agentGroupId = agentGroupId;
        return this;
    }
    public Long getAgentGroupId() {
        return this.agentGroupId;
    }

    public JoinAgentGroupShrinkRequest setAgentIdsShrink(String agentIdsShrink) {
        this.agentIdsShrink = agentIdsShrink;
        return this;
    }
    public String getAgentIdsShrink() {
        return this.agentIdsShrink;
    }

    public JoinAgentGroupShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public JoinAgentGroupShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public JoinAgentGroupShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
