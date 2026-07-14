// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteChatGroupInviteLinkRequest extends TeaModel {
    /**
     * <p>The business phone number. You can view the business phone number by calling the <a href="https://help.aliyun.com/document_detail/2932629.html">ListChatGroup</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8613800***</p>
     */
    @NameInMap("BusinessNumber")
    public String businessNumber;

    /**
     * <p>The channel type. Valid values:</p>
     * <ul>
     * <li><strong>WHATSAPP</strong></li>
     * </ul>
     * <blockquote>
     * <p>Only WhatsApp channel type messages are supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The SpaceId or instance ID of the ISV sub-customer. This is the channel ID, which can be viewed on the <a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-8***</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The group ID. You can view the group ID by calling the <a href="https://help.aliyun.com/document_detail/2932629.html">ListChatGroup</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>E398****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteChatGroupInviteLinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatGroupInviteLinkRequest self = new DeleteChatGroupInviteLinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChatGroupInviteLinkRequest setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
        return this;
    }
    public String getBusinessNumber() {
        return this.businessNumber;
    }

    public DeleteChatGroupInviteLinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public DeleteChatGroupInviteLinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public DeleteChatGroupInviteLinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteChatGroupInviteLinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteChatGroupInviteLinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteChatGroupInviteLinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
