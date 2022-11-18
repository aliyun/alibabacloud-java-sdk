// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotChatRequest extends TeaModel {
    @NameInMap("ChatBotInstanceId")
    public String chatBotInstanceId;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    @NameInMap("IntentName")
    public String intentName;

    @NameInMap("IsvCode")
    public String isvCode;

    @NameInMap("KnowledgeId")
    public String knowledgeId;

    @NameInMap("Perspective")
    public java.util.List<String> perspective;

    @NameInMap("SenderId")
    public String senderId;

    @NameInMap("SenderNick")
    public String senderNick;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Utterance")
    public String utterance;

    @NameInMap("VendorParam")
    public java.util.Map<String, ?> vendorParam;

    public static BeeBotChatRequest build(java.util.Map<String, ?> map) throws Exception {
        BeeBotChatRequest self = new BeeBotChatRequest();
        return TeaModel.build(map, self);
    }

    public BeeBotChatRequest setChatBotInstanceId(String chatBotInstanceId) {
        this.chatBotInstanceId = chatBotInstanceId;
        return this;
    }
    public String getChatBotInstanceId() {
        return this.chatBotInstanceId;
    }

    public BeeBotChatRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
    }

    public BeeBotChatRequest setIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }
    public String getIntentName() {
        return this.intentName;
    }

    public BeeBotChatRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public BeeBotChatRequest setKnowledgeId(String knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public String getKnowledgeId() {
        return this.knowledgeId;
    }

    public BeeBotChatRequest setPerspective(java.util.List<String> perspective) {
        this.perspective = perspective;
        return this;
    }
    public java.util.List<String> getPerspective() {
        return this.perspective;
    }

    public BeeBotChatRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

    public BeeBotChatRequest setSenderNick(String senderNick) {
        this.senderNick = senderNick;
        return this;
    }
    public String getSenderNick() {
        return this.senderNick;
    }

    public BeeBotChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public BeeBotChatRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

    public BeeBotChatRequest setVendorParam(java.util.Map<String, ?> vendorParam) {
        this.vendorParam = vendorParam;
        return this;
    }
    public java.util.Map<String, ?> getVendorParam() {
        return this.vendorParam;
    }

}
