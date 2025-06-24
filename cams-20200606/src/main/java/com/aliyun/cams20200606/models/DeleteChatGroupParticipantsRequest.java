// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class DeleteChatGroupParticipantsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8613800**</p>
     */
    @NameInMap("BusinessNumber")
    public String businessNumber;

    /**
     * <strong>example:</strong>
     * <p>WHATSAPP。</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-**</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>EA93UU****</p>
     */
    @NameInMap("GroupId")
    public String groupId;

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
