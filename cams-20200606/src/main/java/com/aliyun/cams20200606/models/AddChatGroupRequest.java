// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class AddChatGroupRequest extends TeaModel {
    /**
     * <p>The phone number associated with the business account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8613800***</p>
     */
    @NameInMap("BusinessNumber")
    public String businessNumber;

    /**
     * <p>The channel type. Valid value:</p>
     * <ul>
     * <li><strong>WHATSAPP</strong></li>
     * </ul>
     * <blockquote>
     * <p>Currently, only the WhatsApp channel type is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The SpaceId or instance ID of the ISV sub-customer, which is the channel ID. Find it on the <a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-***</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The group description.</p>
     * 
     * <strong>example:</strong>
     * <p>This is a newly created group</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The link to the WhatsApp group.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://t.me/testgroup">https://t.me/testgroup</a></p>
     */
    @NameInMap("GroupLink")
    public String groupLink;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The group title.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Subject")
    public String subject;

    public static AddChatGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        AddChatGroupRequest self = new AddChatGroupRequest();
        return TeaModel.build(map, self);
    }

    public AddChatGroupRequest setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
        return this;
    }
    public String getBusinessNumber() {
        return this.businessNumber;
    }

    public AddChatGroupRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public AddChatGroupRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public AddChatGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public AddChatGroupRequest setGroupLink(String groupLink) {
        this.groupLink = groupLink;
        return this;
    }
    public String getGroupLink() {
        return this.groupLink;
    }

    public AddChatGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddChatGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddChatGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddChatGroupRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

}
