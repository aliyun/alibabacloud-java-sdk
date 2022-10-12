// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotChatShrinkRequest extends TeaModel {
    @NameInMap("ChatBotInstanceId")
    public String chatBotInstanceId;

    @NameInMap("IntentName")
    public String intentName;

    @NameInMap("IsvCode")
    public String isvCode;

    @NameInMap("KnowledgeId")
    public String knowledgeId;

    @NameInMap("Perspective")
    public String perspectiveShrink;

    @NameInMap("SenderId")
    public String senderId;

    @NameInMap("SenderNick")
    public String senderNick;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("Utterance")
    public String utterance;

    @NameInMap("VendorParam")
    public String vendorParamShrink;

    public static BeeBotChatShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        BeeBotChatShrinkRequest self = new BeeBotChatShrinkRequest();
        return TeaModel.build(map, self);
    }

    public BeeBotChatShrinkRequest setChatBotInstanceId(String chatBotInstanceId) {
        this.chatBotInstanceId = chatBotInstanceId;
        return this;
    }
    public String getChatBotInstanceId() {
        return this.chatBotInstanceId;
    }

    public BeeBotChatShrinkRequest setIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }
    public String getIntentName() {
        return this.intentName;
    }

    public BeeBotChatShrinkRequest setIsvCode(String isvCode) {
        this.isvCode = isvCode;
        return this;
    }
    public String getIsvCode() {
        return this.isvCode;
    }

    public BeeBotChatShrinkRequest setKnowledgeId(String knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public String getKnowledgeId() {
        return this.knowledgeId;
    }

    public BeeBotChatShrinkRequest setPerspectiveShrink(String perspectiveShrink) {
        this.perspectiveShrink = perspectiveShrink;
        return this;
    }
    public String getPerspectiveShrink() {
        return this.perspectiveShrink;
    }

    public BeeBotChatShrinkRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

    public BeeBotChatShrinkRequest setSenderNick(String senderNick) {
        this.senderNick = senderNick;
        return this;
    }
    public String getSenderNick() {
        return this.senderNick;
    }

    public BeeBotChatShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public BeeBotChatShrinkRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

    public BeeBotChatShrinkRequest setVendorParamShrink(String vendorParamShrink) {
        this.vendorParamShrink = vendorParamShrink;
        return this;
    }
    public String getVendorParamShrink() {
        return this.vendorParamShrink;
    }

}
