// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappMessageShrinkRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8613800****</p>
     */
    @NameInMap("BusinessNumber")
    public String businessNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ClientAcceptStatus")
    public String clientAcceptStatus;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <strong>example:</strong>
     * <p>1727057232686</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <strong>example:</strong>
     * <p>2024-01-30 00:00:00</p>
     */
    @NameInMap("EndTimeStr")
    public String endTimeStr;

    /**
     * <strong>example:</strong>
     * <p>UP</p>
     */
    @NameInMap("EventAction")
    public String eventAction;

    /**
     * <strong>example:</strong>
     * <p>9292****</p>
     */
    @NameInMap("GroupMessageId")
    public String groupMessageId;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("MessageStatus")
    public String messageStatus;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Page")
    public String pageShrink;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <strong>example:</strong>
     * <p>1727057232686</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <strong>example:</strong>
     * <p>2024-01-01 00:00:00</p>
     */
    @NameInMap("StartTimeStr")
    public String startTimeStr;

    /**
     * <strong>example:</strong>
     * <p>9938***</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <strong>example:</strong>
     * <p>86138***</p>
     */
    @NameInMap("UserNumber")
    public String userNumber;

    public static ListChatappMessageShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatappMessageShrinkRequest self = new ListChatappMessageShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ListChatappMessageShrinkRequest setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
        return this;
    }
    public String getBusinessNumber() {
        return this.businessNumber;
    }

    public ListChatappMessageShrinkRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ListChatappMessageShrinkRequest setClientAcceptStatus(String clientAcceptStatus) {
        this.clientAcceptStatus = clientAcceptStatus;
        return this;
    }
    public String getClientAcceptStatus() {
        return this.clientAcceptStatus;
    }

    public ListChatappMessageShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListChatappMessageShrinkRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListChatappMessageShrinkRequest setEndTimeStr(String endTimeStr) {
        this.endTimeStr = endTimeStr;
        return this;
    }
    public String getEndTimeStr() {
        return this.endTimeStr;
    }

    public ListChatappMessageShrinkRequest setEventAction(String eventAction) {
        this.eventAction = eventAction;
        return this;
    }
    public String getEventAction() {
        return this.eventAction;
    }

    public ListChatappMessageShrinkRequest setGroupMessageId(String groupMessageId) {
        this.groupMessageId = groupMessageId;
        return this;
    }
    public String getGroupMessageId() {
        return this.groupMessageId;
    }

    public ListChatappMessageShrinkRequest setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }
    public String getMessageStatus() {
        return this.messageStatus;
    }

    public ListChatappMessageShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListChatappMessageShrinkRequest setPageShrink(String pageShrink) {
        this.pageShrink = pageShrink;
        return this;
    }
    public String getPageShrink() {
        return this.pageShrink;
    }

    public ListChatappMessageShrinkRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListChatappMessageShrinkRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListChatappMessageShrinkRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListChatappMessageShrinkRequest setStartTimeStr(String startTimeStr) {
        this.startTimeStr = startTimeStr;
        return this;
    }
    public String getStartTimeStr() {
        return this.startTimeStr;
    }

    public ListChatappMessageShrinkRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public ListChatappMessageShrinkRequest setUserNumber(String userNumber) {
        this.userNumber = userNumber;
        return this;
    }
    public String getUserNumber() {
        return this.userNumber;
    }

}
