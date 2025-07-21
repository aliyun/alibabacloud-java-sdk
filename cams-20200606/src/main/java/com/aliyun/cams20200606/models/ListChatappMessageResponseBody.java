// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class ListChatappMessageResponseBody extends TeaModel {
    @NameInMap("AccessDeniedDetail")
    public String accessDeniedDetail;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值示例值</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListChatappMessageResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
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
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("BusinessNumber")
        public String businessNumber;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ChannelType")
        public String channelType;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("ClientAcceptStatusName")
        public String clientAcceptStatusName;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ClientReadStatus")
        public String clientReadStatus;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ClientReadStatusName")
        public String clientReadStatusName;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("ConversationId")
        public String conversationId;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("EventAction")
        public String eventAction;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("EventActionName")
        public String eventActionName;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("FailBackContent")
        public String failBackContent;

        /**
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("FailBackFlag")
        public String failBackFlag;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("FailReason")
        public String failReason;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("LanguageCode")
        public String languageCode;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("MessageSource")
        public String messageSource;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("MessageStatus")
        public String messageStatus;

        /**
         * <strong>example:</strong>
         * <p>示例值</p>
         */
        @NameInMap("MessageStatusName")
        public String messageStatusName;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("MessageType")
        public String messageType;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("MessageTypeName")
        public String messageTypeName;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Month")
        public String month;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("SendTime")
        public String sendTime;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("TemplateCode")
        public String templateCode;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("TemplateName")
        public String templateName;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
         */
        @NameInMap("UniqueMessageId")
        public String uniqueMessageId;

        /**
         * <strong>example:</strong>
         * <p>示例值示例值示例值</p>
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
