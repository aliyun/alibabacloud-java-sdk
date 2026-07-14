// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappMessageShrinkRequest extends TeaModel {
    /**
     * <p>The business phone number.</p>
     * <ul>
     * <li>For WhatsApp channels, view the business phone number in the <a href="https://chatapp.console.aliyun.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>WABA Management</strong> &gt; <strong>Phone Number Management</strong> console.</li>
     * </ul>
     * <p>&lt;props=&quot;intl&quot;&gt;- For Viber channels, view the Service ID in the <a href="https://chatapp.console.aliyun.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Service Account Management</strong> console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>8613800****</p>
     */
    @NameInMap("BusinessNumber")
    public String businessNumber;

    /**
     * <p>The channel type. Valid values:</p>
     * <ul>
     * <li><p><strong>whatsapp</strong></p>
     * </li>
     * <li><p><strong>viber</strong></p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>WHATSAPP</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The message receiving status of the user.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("ClientAcceptStatus")
    public String clientAcceptStatus;

    /**
     * <p>The space ID of the ISV sub-customer or the instance ID of the direct customer. View the Space ID in the <a href="https://chatapp.console.aliyun.com/CustomerList">Channel Management</a> console.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cams-************</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The end time. This value is a UNIX timestamp in milliseconds.</p>
     * 
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
     * <p>The message type. Valid values:</p>
     * <ul>
     * <li>DOWN: outbound message.</li>
     * <li>UP: inbound message.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>UP</p>
     */
    @NameInMap("EventAction")
    public String eventAction;

    /**
     * <p>The bulk message ID. View the bulk message ID in the <a href="https://chatapp.console.alibabacloud.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Message List</strong> &gt; <strong>Bulk Sending List</strong> console.</p>
     * 
     * <strong>example:</strong>
     * <p>9292****</p>
     */
    @NameInMap("GroupMessageId")
    public String groupMessageId;

    /**
     * <p>The message status.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("MessageStatus")
    public String messageStatus;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The pagination object.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Page")
    public String pageShrink;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time. This value is a UNIX timestamp in milliseconds.</p>
     * 
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
     * <p>The template code. View the template code in the <a href="https://chatapp.console.aliyun.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Template Design</strong> console.</p>
     * 
     * <strong>example:</strong>
     * <p>9938***</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>The user phone number. This is the phone number that you imported when sending messages in the <a href="https://chatapp.console.aliyun.com/CustomerList"><strong>Channel Management</strong></a> &gt; <strong>Management</strong> &gt; <strong>Message Sending</strong> console.</p>
     * 
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
