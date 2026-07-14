// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappMessageResponseBody extends TeaModel {
    /**
     * <p>The access denied details.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <p>The response code.</p>
     * <ul>
     * <li><p>OK: The request was successful.</p>
     * </li>
     * <li><p>For other error codes, see <a href="https://help.aliyun.com/document_detail/196974.html">Error codes</a>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The list of returned data objects.</p>
     */
    @NameInMap("Data")
    public java.util.List<ListChatappMessageResponseBodyData> data;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>608F9CCA-B5EB-3D72-8047-B25D6D75BDEC</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the call was successful. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The call was successful.</li>
     * <li><strong>false</strong>: The call failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListChatappMessageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChatappMessageResponseBody self = new ListChatappMessageResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChatappMessageResponseBody setAccessDeniedDetail(String accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public String getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public ListChatappMessageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListChatappMessageResponseBody setData(java.util.List<ListChatappMessageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListChatappMessageResponseBodyData> getData() {
        return this.data;
    }

    public ListChatappMessageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListChatappMessageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListChatappMessageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListChatappMessageResponseBodyData extends TeaModel {
        /**
         * <p>The business phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>86183********</p>
         */
        @NameInMap("BusinessNumber")
        public String businessNumber;

        /**
         * <p>The channel type.</p>
         * 
         * <strong>example:</strong>
         * <p>WHATSAPP</p>
         */
        @NameInMap("ChannelType")
        public String channelType;

        /**
         * <p>The name of the message receiving status.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ClientAcceptStatusName")
        public String clientAcceptStatusName;

        /**
         * <p>The message read status.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ClientReadStatus")
        public String clientReadStatus;

        /**
         * <p>The message read status name.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("ClientReadStatusName")
        public String clientReadStatusName;

        /**
         * <p>The conversation ID.</p>
         * 
         * <strong>example:</strong>
         * <p>805a66**************************</p>
         */
        @NameInMap("ConversationId")
        public String conversationId;

        /**
         * <p>The inbound or outbound message type.</p>
         * 
         * <strong>example:</strong>
         * <p>DOWN</p>
         */
        @NameInMap("EventAction")
        public String eventAction;

        /**
         * <p>The name of the inbound or outbound message type. Valid values:</p>
         * <ul>
         * <li><p>DOWN: outbound message.</p>
         * </li>
         * <li><p>UP: inbound message.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DOWN</p>
         */
        @NameInMap("EventActionName")
        public String eventActionName;

        /**
         * <p>The fallback content.</p>
         * 
         * <strong>example:</strong>
         * <p>None</p>
         */
        @NameInMap("FailBackContent")
        public String failBackContent;

        /**
         * <p>Indicates whether the message falls back to SMS. Valid values:</p>
         * <ul>
         * <li><p>Y: Yes.</p>
         * </li>
         * <li><p>N: No.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("FailBackFlag")
        public String failBackFlag;

        /**
         * <p>The reason for the sending failure.</p>
         * 
         * <strong>example:</strong>
         * <p>timeout</p>
         */
        @NameInMap("FailReason")
        public String failReason;

        /**
         * <p>The template language. For more languages, see <a href="https://help.aliyun.com/document_detail/463420.html">Language codes</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>en</p>
         */
        @NameInMap("LanguageCode")
        public String languageCode;

        /**
         * <p>The message content.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>202509*******************</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <p>The message source.</p>
         * 
         * <strong>example:</strong>
         * <p>api</p>
         */
        @NameInMap("MessageSource")
        public String messageSource;

        /**
         * <p>The message status.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("MessageStatus")
        public String messageStatus;

        /**
         * <p>The message status name.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("MessageStatusName")
        public String messageStatusName;

        /**
         * <p>The message type.</p>
         * 
         * <strong>example:</strong>
         * <p>INTERACTIVE</p>
         */
        @NameInMap("MessageType")
        public String messageType;

        /**
         * <p>The message type name.</p>
         * 
         * <strong>example:</strong>
         * <p>interactive</p>
         */
        @NameInMap("MessageTypeName")
        public String messageTypeName;

        /**
         * <p>The month of the message.</p>
         * 
         * <strong>example:</strong>
         * <p>202507</p>
         */
        @NameInMap("Month")
        public String month;

        /**
         * <p>The sending time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-11T01:16:49.761+00:00</p>
         */
        @NameInMap("SendTime")
        public String sendTime;

        /**
         * <p>The template code.</p>
         * 
         * <strong>example:</strong>
         * <p>1103***************</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <p>The template name.</p>
         * 
         * <strong>example:</strong>
         * <p>picture_template</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <p>The type.</p>
         * 
         * <strong>example:</strong>
         * <p>message</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The unique message ID.</p>
         * 
         * <strong>example:</strong>
         * <p>20250911******************************</p>
         */
        @NameInMap("UniqueMessageId")
        public String uniqueMessageId;

        /**
         * <p>The user phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>86177********</p>
         */
        @NameInMap("UserNumber")
        public String userNumber;

        public static ListChatappMessageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListChatappMessageResponseBodyData self = new ListChatappMessageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListChatappMessageResponseBodyData setBusinessNumber(String businessNumber) {
            this.businessNumber = businessNumber;
            return this;
        }
        public String getBusinessNumber() {
            return this.businessNumber;
        }

        public ListChatappMessageResponseBodyData setChannelType(String channelType) {
            this.channelType = channelType;
            return this;
        }
        public String getChannelType() {
            return this.channelType;
        }

        public ListChatappMessageResponseBodyData setClientAcceptStatusName(String clientAcceptStatusName) {
            this.clientAcceptStatusName = clientAcceptStatusName;
            return this;
        }
        public String getClientAcceptStatusName() {
            return this.clientAcceptStatusName;
        }

        public ListChatappMessageResponseBodyData setClientReadStatus(String clientReadStatus) {
            this.clientReadStatus = clientReadStatus;
            return this;
        }
        public String getClientReadStatus() {
            return this.clientReadStatus;
        }

        public ListChatappMessageResponseBodyData setClientReadStatusName(String clientReadStatusName) {
            this.clientReadStatusName = clientReadStatusName;
            return this;
        }
        public String getClientReadStatusName() {
            return this.clientReadStatusName;
        }

        public ListChatappMessageResponseBodyData setConversationId(String conversationId) {
            this.conversationId = conversationId;
            return this;
        }
        public String getConversationId() {
            return this.conversationId;
        }

        public ListChatappMessageResponseBodyData setEventAction(String eventAction) {
            this.eventAction = eventAction;
            return this;
        }
        public String getEventAction() {
            return this.eventAction;
        }

        public ListChatappMessageResponseBodyData setEventActionName(String eventActionName) {
            this.eventActionName = eventActionName;
            return this;
        }
        public String getEventActionName() {
            return this.eventActionName;
        }

        public ListChatappMessageResponseBodyData setFailBackContent(String failBackContent) {
            this.failBackContent = failBackContent;
            return this;
        }
        public String getFailBackContent() {
            return this.failBackContent;
        }

        public ListChatappMessageResponseBodyData setFailBackFlag(String failBackFlag) {
            this.failBackFlag = failBackFlag;
            return this;
        }
        public String getFailBackFlag() {
            return this.failBackFlag;
        }

        public ListChatappMessageResponseBodyData setFailReason(String failReason) {
            this.failReason = failReason;
            return this;
        }
        public String getFailReason() {
            return this.failReason;
        }

        public ListChatappMessageResponseBodyData setLanguageCode(String languageCode) {
            this.languageCode = languageCode;
            return this;
        }
        public String getLanguageCode() {
            return this.languageCode;
        }

        public ListChatappMessageResponseBodyData setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListChatappMessageResponseBodyData setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public ListChatappMessageResponseBodyData setMessageSource(String messageSource) {
            this.messageSource = messageSource;
            return this;
        }
        public String getMessageSource() {
            return this.messageSource;
        }

        public ListChatappMessageResponseBodyData setMessageStatus(String messageStatus) {
            this.messageStatus = messageStatus;
            return this;
        }
        public String getMessageStatus() {
            return this.messageStatus;
        }

        public ListChatappMessageResponseBodyData setMessageStatusName(String messageStatusName) {
            this.messageStatusName = messageStatusName;
            return this;
        }
        public String getMessageStatusName() {
            return this.messageStatusName;
        }

        public ListChatappMessageResponseBodyData setMessageType(String messageType) {
            this.messageType = messageType;
            return this;
        }
        public String getMessageType() {
            return this.messageType;
        }

        public ListChatappMessageResponseBodyData setMessageTypeName(String messageTypeName) {
            this.messageTypeName = messageTypeName;
            return this;
        }
        public String getMessageTypeName() {
            return this.messageTypeName;
        }

        public ListChatappMessageResponseBodyData setMonth(String month) {
            this.month = month;
            return this;
        }
        public String getMonth() {
            return this.month;
        }

        public ListChatappMessageResponseBodyData setSendTime(String sendTime) {
            this.sendTime = sendTime;
            return this;
        }
        public String getSendTime() {
            return this.sendTime;
        }

        public ListChatappMessageResponseBodyData setTemplateCode(String templateCode) {
            this.templateCode = templateCode;
            return this;
        }
        public String getTemplateCode() {
            return this.templateCode;
        }

        public ListChatappMessageResponseBodyData setTemplateName(String templateName) {
            this.templateName = templateName;
            return this;
        }
        public String getTemplateName() {
            return this.templateName;
        }

        public ListChatappMessageResponseBodyData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListChatappMessageResponseBodyData setUniqueMessageId(String uniqueMessageId) {
            this.uniqueMessageId = uniqueMessageId;
            return this;
        }
        public String getUniqueMessageId() {
            return this.uniqueMessageId;
        }

        public ListChatappMessageResponseBodyData setUserNumber(String userNumber) {
            this.userNumber = userNumber;
            return this;
        }
        public String getUserNumber() {
            return this.userNumber;
        }

    }

}
