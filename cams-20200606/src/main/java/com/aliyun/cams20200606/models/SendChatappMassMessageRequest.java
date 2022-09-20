// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class SendChatappMassMessageRequest extends TeaModel {
    @NameInMap("ChannelType")
    public String channelType;

    @NameInMap("CustWabaId")
    public String custWabaId;

    @NameInMap("FallBackContent")
    public String fallBackContent;

    @NameInMap("FallBackId")
    public String fallBackId;

    @NameInMap("From")
    public String from;

    @NameInMap("IsvCode")
    public String isvCode;

    @NameInMap("Language")
    public String language;

    @NameInMap("SenderList")
    public java.util.List<SendChatappMassMessageRequestSenderList> senderList;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TemplateCode")
    public String templateCode;

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

    public static class SendChatappMassMessageRequestSenderList extends TeaModel {
        @NameInMap("Payload")
        public java.util.List<String> payload;

        @NameInMap("TemplateParams")
        public java.util.Map<String, String> templateParams;

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
