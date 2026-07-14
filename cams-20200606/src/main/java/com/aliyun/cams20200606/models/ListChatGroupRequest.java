// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatGroupRequest extends TeaModel {
    /**
     * <p>The business phone number.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8613800***</p>
     */
    @NameInMap("BusinessNumber")
    public String businessNumber;

    /**
     * <p>The channel type. Valid values: <strong>WHATSAPP</strong>.</p>
     * <blockquote>
     * <p>Only the WhatsApp channel type is supported.</p>
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
     * <p>The pagination information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Page")
    public ListChatGroupRequestPage page;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The group subject.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Subject")
    public String subject;

    public static ListChatGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatGroupRequest self = new ListChatGroupRequest();
        return TeaModel.build(map, self);
    }

    public ListChatGroupRequest setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
        return this;
    }
    public String getBusinessNumber() {
        return this.businessNumber;
    }

    public ListChatGroupRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ListChatGroupRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListChatGroupRequest setGroupLink(String groupLink) {
        this.groupLink = groupLink;
        return this;
    }
    public String getGroupLink() {
        return this.groupLink;
    }

    public ListChatGroupRequest setGroupStatus(String groupStatus) {
        this.groupStatus = groupStatus;
        return this;
    }
    public String getGroupStatus() {
        return this.groupStatus;
    }

    public ListChatGroupRequest setGroupType(String groupType) {
        this.groupType = groupType;
        return this;
    }
    public String getGroupType() {
        return this.groupType;
    }

    public ListChatGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListChatGroupRequest setPage(ListChatGroupRequestPage page) {
        this.page = page;
        return this;
    }
    public ListChatGroupRequestPage getPage() {
        return this.page;
    }

    public ListChatGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListChatGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListChatGroupRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public static class ListChatGroupRequestPage extends TeaModel {
        /**
         * <p>The page number.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Long index;

        /**
         * <p>The number of entries per page.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Size")
        public Long size;

        public static ListChatGroupRequestPage build(java.util.Map<String, ?> map) throws Exception {
            ListChatGroupRequestPage self = new ListChatGroupRequestPage();
            return TeaModel.build(map, self);
        }

        public ListChatGroupRequestPage setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public ListChatGroupRequestPage setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
