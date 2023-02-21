// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMassMessageRequest extends TeaModel {
    /**
     * <p>The channel type. Valid values: whatsapp, viber, and line.</p>
     */
    @NameInMap("ChannelType")
    public String channelType;

    /**
     * <p>The space ID of the user.</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The ID of the WhatApp Business account of the ISV account.</p>
     */
    @NameInMap("CustWabaId")
    @Deprecated
    public String custWabaId;

    /**
     * <p>The fallback content.</p>
     */
    @NameInMap("FallBackContent")
    public String fallBackContent;

    /**
     * <p>The ID of the fallback strategy.</p>
     */
    @NameInMap("FallBackId")
    public String fallBackId;

    /**
     * <p>The message sender.</p>
     */
    @NameInMap("From")
    public String from;

    /**
     * <p>The ISV verification code, which is used to verify whether the user is authorized by the ISV account.</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>Viber消息类型，取值：pormotion或transation。</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>The language. For more information about language codes, see [Language codes](~~463420~~).</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The list of phone numbers that receive the message.</p>
     */
    @NameInMap("SenderList")
    public java.util.List<SendChatappMassMessageRequestSenderList> senderList;

    /**
     * <p>Viber消息发送时tag信息。</p>
     */
    @NameInMap("Tag")
    public String tag;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    /**
     * <p>The code of the message template.</p>
     */
    @NameInMap("TemplateCode")
    public String templateCode;

    /**
     * <p>Viber消息发送超时时间，单位：秒，取值范围 30~1209600。</p>
     */
    @NameInMap("Ttl")
    public Long ttl;

    public static SendChatappMassMessageRequest build(java.util.Map<String, ?> map) throws Exception {
        SendChatappMassMessageRequest self = new SendChatappMassMessageRequest();
        return TeaModel.build(map, self);
    }

    public SendChatappMassMessageRequest setChannelType(String channelType) {
        this.channelType = channelType;
        return this;
    }
    public String getChannelType() {
        return this.channelType;
    }

    public SendChatappMassMessageRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public SendChatappMassMessageRequest setCustWabaId(String custWabaId) {
        this.custWabaId = custWabaId;
        return this;
    }
    public String getCustWabaId() {
        return this.custWabaId;
    }

    public SendChatappMassMessageRequest setFallBackContent(String fallBackContent) {
        this.fallBackContent = fallBackContent;
        return this;
    }
    public String getFallBackContent() {
        return this.fallBackContent;
    }

    public SendChatappMassMessageRequest setFallBackId(String fallBackId) {
        this.fallBackId = fallBackId;
        return this;
    }
    public String getFallBackId() {
        return this.fallBackId;
    }

    public SendChatappMassMessageRequest setFrom(String from) {
        this.from = from;
        return this;
    }
    public String getFrom() {
        return this.from;
    }

    public SendChatappMassMessageRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public SendChatappMassMessageRequest setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public SendChatappMassMessageRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public SendChatappMassMessageRequest setSenderList(java.util.List<SendChatappMassMessageRequestSenderList> senderList) {
        this.senderList = senderList;
        return this;
    }
    public java.util.List<SendChatappMassMessageRequestSenderList> getSenderList() {
        return this.senderList;
    }

    public SendChatappMassMessageRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public SendChatappMassMessageRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public SendChatappMassMessageRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

    public SendChatappMassMessageRequest setTtl(Long ttl) {
        this.ttl = ttl;
        return this;
    }
    public Long getTtl() {
        return this.ttl;
    }

    public static class SendChatappMassMessageRequestSenderList extends TeaModel {
        /**
         * <p>The payload.</p>
         */
        @NameInMap("Payload")
        public java.util.List<String> payload;

        /**
         * <p>The parameters of the message template.</p>
         */
        @NameInMap("TemplateParams")
        public java.util.Map<String, String> templateParams;

        /**
         * <p>The phone number that receives the message.</p>
         */
        @NameInMap("To")
        public String to;

        public static SendChatappMassMessageRequestSenderList build(java.util.Map<String, ?> map) throws Exception {
            SendChatappMassMessageRequestSenderList self = new SendChatappMassMessageRequestSenderList();
            return TeaModel.build(map, self);
        }

        public SendChatappMassMessageRequestSenderList setPayload(java.util.List<String> payload) {
            this.payload = payload;
            return this;
        }
        public java.util.List<String> getPayload() {
            return this.payload;
        }

        public SendChatappMassMessageRequestSenderList setTemplateParams(java.util.Map<String, String> templateParams) {
            this.templateParams = templateParams;
            return this;
        }
        public java.util.Map<String, String> getTemplateParams() {
            return this.templateParams;
        }

        public SendChatappMassMessageRequestSenderList setTo(String to) {
            this.to = to;
            return this;
        }
        public String getTo() {
            return this.to;
        }

    }

}
