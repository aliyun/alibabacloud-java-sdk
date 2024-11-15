// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotChatShrinkRequest extends TeaModel {
    /**
     * <p>Indicates whether the answer is in plain text or rich text.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ChatBotInstanceId")
    public String chatBotInstanceId;

    /**
     * <p>The metadata.</p>
     * 
     * <strong>example:</strong>
     * <p>293483938849493</p>
     */
    @NameInMap("CustSpaceId")
    public String custSpaceId;

    /**
     * <p>The source of the answer.</p>
     * 
     * <strong>example:</strong>
     * <p>intent</p>
     */
    @NameInMap("IntentName")
    public String intentName;

    /**
     * <p>The source of the answer.</p>
     * 
     * <strong>example:</strong>
     * <p>ksiekdki39ksks93939</p>
     */
    @NameInMap("IsvCode")
    public String isvCode;

    /**
     * <p>The hit statement.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("KnowledgeId")
    public String knowledgeId;

    /**
     * <p>Beijing</p>
     */
    @NameInMap("Perspective")
    public String perspectiveShrink;

    /**
     * <p>The information about the slot.</p>
     * 
     * <strong>example:</strong>
     * <p>861500000000</p>
     */
    @NameInMap("SenderId")
    public String senderId;

    /**
     * <p>Beijing</p>
     * 
     * <strong>example:</strong>
     * <p>nick</p>
     */
    @NameInMap("SenderNick")
    public String senderNick;

    /**
     * <p>The title of the related knowledge.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The title of the hit question.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>659216218162179</p>
     */
    @NameInMap("Utterance")
    public String utterance;

    /**
     * <p>The node name. When AnswerSource is set to BotFramework, a value is returned for this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;skills\&quot;:\&quot;chat_search\&quot;,\&quot;accessToken\&quot;:\&quot;73f4d5c8e8c334d9b538890bca68ac9a\&quot;,\&quot;senderStaffId\&quot;:\&quot;1697204021326\&quot;,\&quot;senderCorpId\&quot;:\&quot;dingee291fb2828058b9\&quot;}</p>
     */
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
