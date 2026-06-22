// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteChatGroupParticipantsShrinkRequest extends TeaModel {
    /**
     * <p>The business number. You can obtain the business number by calling the <a href="https://help.aliyun.com/document_detail/2932629.html">ListChatGroup</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8613800**</p>
     */
    @NameInMap("BusinessNumber")
    public String businessNumber;

    /**
     * <p>The channel type. Valid value:</p>
     * <ul>
     * <li><strong>WHATSAPP</strong></li>
     * </ul>
     * <blockquote>
     * <p>Currently, only the WhatsApp channel is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The space ID of the ISV sub-customer or the instance ID. This ID is also the channel ID. You can find the channel ID on the <a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-**</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The group ID. You can obtain the group ID by calling the <a href="https://help.aliyun.com/document_detail/2932629.html">ListChatGroup</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EA93UU****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    /**
     * <p>A list of group members to remove.</p>
     */
    @NameInMap("List")
    public String listShrink;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteChatGroupParticipantsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatGroupParticipantsShrinkRequest self = new DeleteChatGroupParticipantsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChatGroupParticipantsShrinkRequest setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
        return this;
    }
    public String getBusinessNumber() {
        return this.businessNumber;
    }

    public DeleteChatGroupParticipantsShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public DeleteChatGroupParticipantsShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public DeleteChatGroupParticipantsShrinkRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteChatGroupParticipantsShrinkRequest setListShrink(String listShrink) {
        this.listShrink = listShrink;
        return this;
    }
    public String getListShrink() {
        return this.listShrink;
    }

    public DeleteChatGroupParticipantsShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteChatGroupParticipantsShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteChatGroupParticipantsShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
