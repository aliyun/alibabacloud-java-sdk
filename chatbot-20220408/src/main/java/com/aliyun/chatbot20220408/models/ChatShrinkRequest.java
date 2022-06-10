// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ChatShrinkRequest extends TeaModel {
    // 业务空间key,不设置则访问默认业务空间，key值在主账号业务管理页面获取
    @NameInMap("AgentKey")
    public String agentKey;

    // 机器人实例ID。登录云小蜜控制台，机器人详情->会话接口，查看机器人实例信息，可获得该实例ID。
    @NameInMap("InstanceId")
    public String instanceId;

    // 对话流中意图名称。 若指定此名称，机器人会直接进入此意图做问答
    @NameInMap("IntentName")
    public String intentName;

    // 知识库中知识标题的ID。若指定此ID，那么机器人会直接返回指定知识标题的答案
    @NameInMap("KnowledgeId")
    public String knowledgeId;

    // 视角编码，用于调用同一知识标题下不同视角的答案。如：Perspective=["FZJBY3raWr"]。使用SDK时以SDK中定义的参数为准
    @NameInMap("Perspective")
    public String perspectiveShrink;

    // 访问者ID。用于识别当前会话中的用户
    @NameInMap("SenderId")
    public String senderId;

    // 当前会话中访问的昵称
    @NameInMap("SenderNick")
    public String senderNick;

    // 会话ID，用于标识一个访问者的会话和保持上下文信息。对于一个新的访问者，首次调用Chat接口时无需传递此字段，机器人会开启一个会话，并在Chat接口的响应中返回该会话的SessionId。对于该访问者的后续轮次的会话，调用Chat接口时传递当前会话的SessionId，机器人即可基于SessionId继续该轮次会话。长度限制是64个字符
    @NameInMap("SessionId")
    public String sessionId;

    // 机器人访问者的输入
    @NameInMap("Utterance")
    public String utterance;

    @NameInMap("VendorParam")
    public String vendorParam;

    public static ChatShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ChatShrinkRequest self = new ChatShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ChatShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public ChatShrinkRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ChatShrinkRequest setIntentName(String intentName) {
        this.intentName = intentName;
        return this;
    }
    public String getIntentName() {
        return this.intentName;
    }

    public ChatShrinkRequest setKnowledgeId(String knowledgeId) {
        this.knowledgeId = knowledgeId;
        return this;
    }
    public String getKnowledgeId() {
        return this.knowledgeId;
    }

    public ChatShrinkRequest setPerspectiveShrink(String perspectiveShrink) {
        this.perspectiveShrink = perspectiveShrink;
        return this;
    }
    public String getPerspectiveShrink() {
        return this.perspectiveShrink;
    }

    public ChatShrinkRequest setSenderId(String senderId) {
        this.senderId = senderId;
        return this;
    }
    public String getSenderId() {
        return this.senderId;
    }

    public ChatShrinkRequest setSenderNick(String senderNick) {
        this.senderNick = senderNick;
        return this;
    }
    public String getSenderNick() {
        return this.senderNick;
    }

    public ChatShrinkRequest setSessionId(String sessionId) {
        this.sessionId = sessionId;
        return this;
    }
    public String getSessionId() {
        return this.sessionId;
    }

    public ChatShrinkRequest setUtterance(String utterance) {
        this.utterance = utterance;
        return this;
    }
    public String getUtterance() {
        return this.utterance;
    }

    public ChatShrinkRequest setVendorParam(String vendorParam) {
        this.vendorParam = vendorParam;
        return this;
    }
    public String getVendorParam() {
        return this.vendorParam;
    }

}
