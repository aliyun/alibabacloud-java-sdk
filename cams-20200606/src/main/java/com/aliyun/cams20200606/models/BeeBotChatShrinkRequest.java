// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotChatShrinkRequest extends TeaModel {
    // The ID of chatbot instance.
    @NameInMap("ChatBotInstanceId")
    public String chatBotInstanceId;

    @NameInMap("CustSpaceId")
    public String custSpaceId;

    // The name of the intent in the dialog flow. When this parameter is specified, the bot will conduct a Q\&A according to the intent.
    @NameInMap("IntentName")
    public String intentName;

    // ISV verification code, which is used to verify whether the sub-account is authorized by ISV.
    @NameInMap("IsvCode")
    public String isvCode;

    // The ID of the knowledge title in the knowledge base.
    @NameInMap("KnowledgeId")
    public String knowledgeId;

    // The list of codes for answers from different perspectives.
    @NameInMap("Perspective")
    public String perspectiveShrink;

    // The ID of the visitor, which is used to identify users in the current session.
    @NameInMap("SenderId")
    public String senderId;

    // The nickname of the visitor in the current session.
    @NameInMap("SenderNick")
    public String senderNick;

    // The ID of the session, which identifies the session and context information of the visitor.
    @NameInMap("SessionId")
    public String sessionId;

    // The input of the visitor.
    @NameInMap("Utterance")
    public String utterance;

    // The user-defined parameter set in JSON format. You can specify user-defined parameters for conversation engines.
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

    public BeeBotChatShrinkRequest setCustSpaceId(String custSpaceId) {
        this.custSpaceId = custSpaceId;
        return this;
    }
    public String getCustSpaceId() {
        return this.custSpaceId;
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
