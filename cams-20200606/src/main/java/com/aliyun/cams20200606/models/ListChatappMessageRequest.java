// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappMessageRequest extends TeaModel {
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
    public ListChatappMessageRequestPage page;

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

    public static ListChatappMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChatappMessageRequest self = new ListChatappMessageRequest();
        return TeaModel.build(map, self);
    }

    public ListChatappMessageRequest setBusinessNumber(String businessNumber) {
        this.businessNumber = businessNumber;
        return this;
    }
    public String getBusinessNumber() {
        return this.businessNumber;
    }

    public ListChatappMessageRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public ListChatappMessageRequest setClientAcceptStatus(String clientAcceptStatus) {
        this.clientAcceptStatus = clientAcceptStatus;
        return this;
    }
    public String getClientAcceptStatus() {
        return this.clientAcceptStatus;
    }

    public ListChatappMessageRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public ListChatappMessageRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListChatappMessageRequest setEndTimeStr(String endTimeStr) {
        this.endTimeStr = endTimeStr;
        return this;
    }
    public String getEndTimeStr() {
        return this.endTimeStr;
    }

    public ListChatappMessageRequest setEventAction(String eventAction) {
        this.eventAction = eventAction;
        return this;
    }
    public String getEventAction() {
        return this.eventAction;
    }

    public ListChatappMessageRequest setGroupMessageId(String groupMessageId) {
        this.groupMessageId = groupMessageId;
        return this;
    }
    public String getGroupMessageId() {
        return this.groupMessageId;
    }

    public ListChatappMessageRequest setMessageStatus(String messageStatus) {
        this.messageStatus = messageStatus;
        return this;
    }
    public String getMessageStatus() {
        return this.messageStatus;
    }

    public ListChatappMessageRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ListChatappMessageRequest setPage(ListChatappMessageRequestPage page) {
        this.page = page;
        return this;
    }
    public ListChatappMessageRequestPage getPage() {
        return this.page;
    }

    public ListChatappMessageRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ListChatappMessageRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ListChatappMessageRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListChatappMessageRequest setStartTimeStr(String startTimeStr) {
        this.startTimeStr = startTimeStr;
        return this;
    }
    public String getStartTimeStr() {
        return this.startTimeStr;
    }

    public ListChatappMessageRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public ListChatappMessageRequest setUserNumber(String userNumber) {
        this.userNumber = userNumber;
        return this;
    }
    public String getUserNumber() {
        return this.userNumber;
    }

    public static class ListChatappMessageRequestPage extends TeaModel {
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
         * <p>10</p>
         */
        @NameInMap("Size")
        public Long size;

        public static ListChatappMessageRequestPage build(java.util.Map<String, ?> map) throws Exception {
            ListChatappMessageRequestPage self = new ListChatappMessageRequestPage();
            return TeaModel.build(map, self);
        }

        public ListChatappMessageRequestPage setIndex(Long index) {
            this.index = index;
            return this;
        }
        public Long getIndex() {
            return this.index;
        }

        public ListChatappMessageRequestPage setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

    }

}
