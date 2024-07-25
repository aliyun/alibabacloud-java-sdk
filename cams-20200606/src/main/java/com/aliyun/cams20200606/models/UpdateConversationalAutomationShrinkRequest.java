// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateConversationalAutomationShrinkRequest extends TeaModel {
    @NameInMap("Commands")
    public String commandsShrink;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableWelcomeMessage")
    public Boolean enableWelcomeMessage;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>86130000***</p>
     */
    @NameInMap("PhoneNumber")
    public String phoneNumber;

    @NameInMap("Prompts")
    public String promptsShrink;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static UpdateConversationalAutomationShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateConversationalAutomationShrinkRequest self = new UpdateConversationalAutomationShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateConversationalAutomationShrinkRequest setCommandsShrink(String commandsShrink) {
        this.commandsShrink = commandsShrink;
        return this;
    }
    public String getCommandsShrink() {
        return this.commandsShrink;
    }

    public UpdateConversationalAutomationShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public UpdateConversationalAutomationShrinkRequest setEnableWelcomeMessage(Boolean enableWelcomeMessage) {
        this.enableWelcomeMessage = enableWelcomeMessage;
        return this;
    }
    public Boolean getEnableWelcomeMessage() {
        return this.enableWelcomeMessage;
    }

    public UpdateConversationalAutomationShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateConversationalAutomationShrinkRequest setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public UpdateConversationalAutomationShrinkRequest setPromptsShrink(String promptsShrink) {
        this.promptsShrink = promptsShrink;
        return this;
    }
    public String getPromptsShrink() {
        return this.promptsShrink;
    }

    public UpdateConversationalAutomationShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateConversationalAutomationShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
