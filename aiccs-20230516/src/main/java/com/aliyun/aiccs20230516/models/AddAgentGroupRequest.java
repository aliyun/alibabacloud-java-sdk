// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AddAgentGroupRequest extends TeaModel {
    /**
     * <p>坐席组名称，不能为空且最大长度为20个字符</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>abc</p>
     */
    @NameInMap("AgentGroupName")
    public String agentGroupName;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static AddAgentGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddAgentGroupRequest self = new AddAgentGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddAgentGroupRequest setAgentGroupName(String agentGroupName) {
        this.agentGroupName = agentGroupName;
        return this;
    }
    public String getAgentGroupName() {
        return this.agentGroupName;
    }

    public AddAgentGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddAgentGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddAgentGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
