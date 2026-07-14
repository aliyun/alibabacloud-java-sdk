// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateChatFlowLogSettingRequest extends TeaModel {
    /**
     * <p>The flow code. You can view the flow code in the <a href="https://chatapp.console.aliyun.com/ChatFlowBuilder">Flow Builder</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>9ccc41**************************</p>
     */
    @NameInMap("FlowCode")
    public String flowCode;

    /**
     * <p>The unique ID of the setting. You can obtain this ID by calling the <a href="https://help.aliyun.com/document_detail/2937212.html">ReadChatFlowLogSetting</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("Id")
    public Long id;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The log enabling status. Valid values:</p>
     * <ul>
     * <li><p>ENABLED: Enables log writing.</p>
     * </li>
     * <li><p>DISABLED: Disables log writing but retains the Simple Log Service log instance.</p>
     * </li>
     * <li><p>DELETED: Disables log writing and deletes the Simple Log Service log instance.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENABLED</p>
     */
    @NameInMap("Status")
    public String status;

    public static UpdateChatFlowLogSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChatFlowLogSettingRequest self = new UpdateChatFlowLogSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChatFlowLogSettingRequest setFlowCode(String flowCode) {
        this.flowCode = flowCode;
        return this;
    }
    public String getFlowCode() {
        return this.flowCode;
    }

    public UpdateChatFlowLogSettingRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public UpdateChatFlowLogSettingRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateChatFlowLogSettingRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateChatFlowLogSettingRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateChatFlowLogSettingRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
