// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20171011.models;

import com.aliyun.tea.*;

public class ChatRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SessionId")
    public String sessionId;

    @NameInMap("KnowledgeId")
    public String knowledgeId;

    @NameInMap("SenderId")
    public String senderId;

    @NameInMap("SenderNick")
    public String senderNick;

    @NameInMap("Tag")
    public String tag;

    @NameInMap("Utterance")
    public String utterance;

    @NameInMap("Recommend")
    public Boolean recommend;

    @NameInMap("RecommendNum")
    public Integer recommendNum;

    @NameInMap("IntentName")
    public String intentName;

    @NameInMap("DefaultPerspective")
    public String defaultPerspective;

    @NameInMap("BusinessScope")
    public String businessScope;

    @NameInMap("VendorParam")
    public String vendorParam;

    @NameInMap("Emotion")
    public Boolean emotion;

    @NameInMap("SandBox")
    public Boolean sandBox;

    @NameInMap("Perspective")
    public java.util.List<String> perspective;

    public static ChatRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatRequest self = new ChatRequest();
        return TeaModel.build(map, self);
    }

    public ChatRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChatRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatRequest setKnowledgeId(String knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public String getKnowledgeId() {
        return this.knowledgeId;
    }

    public ChatRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

    public ChatRequest setSenderNick(String senderNick) {
        this.senderNick = senderNick;
        return this;
    }
    public String getSenderNick() {
        return this.senderNick;
    }

    public ChatRequest setTag(String tag) {
        this.tag = tag;
        return this;
    }
    public String getTag() {
        return this.tag;
    }

    public ChatRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

    public ChatRequest setRecommend(Boolean recommend) {
        this.recommend = recommend;
        return this;
    }
    public Boolean getRecommend() {
        return this.recommend;
    }

    public ChatRequest setRecommendNum(Integer recommendNum) {
        this.recommendNum = recommendNum;
        return this;
    }
    public Integer getRecommendNum() {
        return this.recommendNum;
    }

    public ChatRequest setIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }
    public String getIntentName() {
        return this.intentName;
    }

    public ChatRequest setDefaultPerspective(String defaultPerspective) {
        this.defaultPerspective = defaultPerspective;
        return this;
    }
    public String getDefaultPerspective() {
        return this.defaultPerspective;
    }

    public ChatRequest setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
        return this;
    }
    public String getBusinessScope() {
        return this.businessScope;
    }

    public ChatRequest setVendorParam(String vendorParam) {
        this.vendorParam = vendorParam;
        return this;
    }
    public String getVendorParam() {
        return this.vendorParam;
    }

    public ChatRequest setEmotion(Boolean emotion) {
        this.emotion = emotion;
        return this;
    }
    public Boolean getEmotion() {
        return this.emotion;
    }

    public ChatRequest setSandBox(Boolean sandBox) {
        this.sandBox = sandBox;
        return this;
    }
    public Boolean getSandBox() {
        return this.sandBox;
    }

    public ChatRequest setPerspective(java.util.List<String> perspective) {
        this.perspective = perspective;
        return this;
    }
    public java.util.List<String> getPerspective() {
        return this.perspective;
    }

}
