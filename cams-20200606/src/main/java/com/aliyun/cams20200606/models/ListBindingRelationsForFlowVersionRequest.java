// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListBindingRelationsForFlowVersionRequest extends TeaModel {
    /**
     * <p>Channel type. Values:</p>
     * <ul>
     * <li>INSTAGRAM</li>
     * <li>WHATSAPP</li>
     * <li>MESSENGER</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;- VIBER</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>Process code. View the process code in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Editor</a> interface.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>9ccc41**************************</p>
     */
    @NameInMap("FlowCode")
    public String flowCode;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ListBindingRelationsForFlowVersionRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBindingRelationsForFlowVersionRequest self = new ListBindingRelationsForFlowVersionRequest();
        return TeaModel.build(map, self);
    }

    public ListBindingRelationsForFlowVersionRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ListBindingRelationsForFlowVersionRequest setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public ListBindingRelationsForFlowVersionRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListBindingRelationsForFlowVersionRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListBindingRelationsForFlowVersionRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
