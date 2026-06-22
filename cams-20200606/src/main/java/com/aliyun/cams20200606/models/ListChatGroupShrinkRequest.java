// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatGroupShrinkRequest extends TeaModel {
    /**
     * <p>The business number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8613800***</p>
     */
    @NameInMap("BusinessNumber")
    public String businessNumber;

    /**
     * <p>The channel type. Valid value: <strong>WHATSAPP</strong>.</p>
     * <blockquote>
     * <p>Only the WhatsApp channel is supported.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The instance ID (or SpaceId) of an ISV sub-customer, which also serves as the channel ID. You can find it on the <a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a> page.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-x***</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The Telegram group link.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("GroupLink")
    public String groupLink;

    /**
     * <p>The group status. Valid values:</p>
     * <ul>
     * <li><p>ACTIVE: In use.</p>
     * </li>
     * <li><p>INACTIVE: Not activated.</p>
     * </li>
     * <li><p>SUSPENDED: Suspended.</p>
     * </li>
     * <li><p>CREATING: Being created.</p>
     * </li>
     * <li><p>DELETING: Being deleted.</p>
     * </li>
     * <li><p>UPDATING: Being updated.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ACTIVE</p>
     */
    @NameInMap("GroupStatus")
    public String groupStatus;

    /**
     * <p>The Telegram group type.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("GroupType")
    public String groupType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The paging information.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Example value</p>
     */
    @NameInMap("Page")
    public String pageShrink;

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

    public static ListChatGroupShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatGroupShrinkRequest self = new ListChatGroupShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListChatGroupShrinkRequest setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
        return this;
    }
    public String getBusinessNumber() {
        return this.businessNumber;
    }

    public ListChatGroupShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ListChatGroupShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListChatGroupShrinkRequest setGroupLink(String groupLink) {
        this.groupLink = groupLink;
        return this;
    }
    public String getGroupLink() {
        return this.groupLink;
    }

    public ListChatGroupShrinkRequest setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
        return this;
    }
    public String getGroupStatus() {
        return this.groupStatus;
    }

    public ListChatGroupShrinkRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public ListChatGroupShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListChatGroupShrinkRequest setPageShrink(String pageShrink) {
        this.pageShrink = pageShrink;
        return this;
    }
    public String getPageShrink() {
        return this.pageShrink;
    }

    public ListChatGroupShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListChatGroupShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListChatGroupShrinkRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

}
