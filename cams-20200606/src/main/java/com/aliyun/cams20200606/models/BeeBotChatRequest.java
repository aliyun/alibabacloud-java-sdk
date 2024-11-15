// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cams20200606.models;

import com.aliyun.tea.*;

public class BeeBotChatRequest extends TeaModel {
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
    public java.util.List<String> perspective;

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
