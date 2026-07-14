// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class UpdateChatGroupRequest extends TeaModel {
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
     * <li><strong>WHATSAPP</strong>.</li>
     * </ul>
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
     * <p>The space ID of the ISV sub-customer, which is also the instance ID. This is the channel ID, which can be viewed on the <a href="https://chatapp.console.aliyun.com/ChannelsManagement">Channel Management</a> page.</p>
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
     * <p>test</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The group ID. You can view the group ID by calling the <a href="https://help.aliyun.com/document_detail/2932629.html">ListChatGroup</a> operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EA303***</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The group profile picture.</p>
     * <blockquote>
     * <p>Image restrictions:</p>
     * <ul>
     * <li>Supported MIME type: image/jpeg</li>
     * <li>Maximum image size: 5 MB</li>
     * <li>The image must be square with a minimum dimension of 192 × 192 pixels.</li>
     * </ul>
     * </blockquote>
     */
    @NameInMap("ProfilePictureFile")
    public String profilePictureFile;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The group subject.</p>
     * 
     * <strong>example:</strong>
     * <p>test title</p>
     */
    @NameInMap("Subject")
    public String subject;

    public static UpdateChatGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateChatGroupRequest self = new UpdateChatGroupRequest();
        return TeaModel.build(map, self);
    }

    public UpdateChatGroupRequest setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
        return this;
    }
    public String getBusinessNumber() {
        return this.businessNumber;
    }

    public UpdateChatGroupRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public UpdateChatGroupRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public UpdateChatGroupRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public UpdateChatGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public UpdateChatGroupRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateChatGroupRequest setProfilePictureFile(String profilePictureFile) {
        this.profilePictureFile = profilePictureFile;
        return this;
    }
    public String getProfilePictureFile() {
        return this.profilePictureFile;
    }

    public UpdateChatGroupRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateChatGroupRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateChatGroupRequest setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

}
