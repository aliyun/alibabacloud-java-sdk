// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteChatGroupParticipantsRequest extends TeaModel {
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
    public java.util.List<DeleteChatGroupParticipantsRequestList> list;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static DeleteChatGroupParticipantsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteChatGroupParticipantsRequest self = new DeleteChatGroupParticipantsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteChatGroupParticipantsRequest setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
        return this;
    }
    public String getBusinessNumber() {
        return this.businessNumber;
    }

    public DeleteChatGroupParticipantsRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public DeleteChatGroupParticipantsRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public DeleteChatGroupParticipantsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DeleteChatGroupParticipantsRequest setList(java.util.List<DeleteChatGroupParticipantsRequestList> list) {
        this.list = list;
        return this;
    }
    public java.util.List<DeleteChatGroupParticipantsRequestList> getList() {
        return this.list;
    }

    public DeleteChatGroupParticipantsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DeleteChatGroupParticipantsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DeleteChatGroupParticipantsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public static class DeleteChatGroupParticipantsRequestList extends TeaModel {
        /**
         * <p>The participant number of the group member. You can obtain the participant numbers of group members by calling the <a href="https://help.aliyun.com/document_detail/2932628.html">ListChatGroupParticipants</a> operation.</p>
         * 
         * <strong>example:</strong>
         * <p>86138***</p>
         */
        @NameInMap("ParticipantNumber")
        public String participantNumber;

        public static DeleteChatGroupParticipantsRequestList build(java.util.Map<String, ?> map) throws Exception {
            DeleteChatGroupParticipantsRequestList self = new DeleteChatGroupParticipantsRequestList();
            return TeaModel.build(map, self);
        }

        public DeleteChatGroupParticipantsRequestList setParticipantNumber(String participantNumber) {
            this.participantNumber = participantNumber;
            return this;
        }
        public String getParticipantNumber() {
            return this.participantNumber;
        }

    }

}
