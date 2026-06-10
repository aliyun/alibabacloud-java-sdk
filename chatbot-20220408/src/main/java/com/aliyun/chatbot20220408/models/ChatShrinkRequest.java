// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.chatbot20220408.models;

import com.aliyun.tea.*;

public class ChatShrinkRequest extends TeaModel {
    /**
     * <p>The key for the business space. If omitted, the request is routed to the default business space. You can get this key from the <strong>Business Management</strong> page of your main account.</p>
     * 
     * <strong>example:</strong>
     * <p>ac627989eb4f8a98ed05fd098bbae5_p_beebot_public</p>
     */
    @NameInMap("AgentKey")
    public String agentKey;

    /**
     * <p>The unique ID of the chatbot instance. To get this ID, log in to the Alibaba Cloud Chatbot console and go to <strong>Chatbot Details</strong> &gt; <strong>Session API</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>chatbot-cn-mp90s2lrk00050</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The name of an intent within a dialog flow. If specified, the chatbot directly activates this intent to process the user\&quot;s request.</p>
     * 
     * <strong>example:</strong>
     * <p>查天气意图</p>
     */
    @NameInMap("IntentName")
    public String intentName;

    /**
     * <p>The ID of an entry in the knowledge base. If you specify this ID, the chatbot directly returns the corresponding answer.</p>
     * 
     * <strong>example:</strong>
     * <p>30002406051</p>
     */
    @NameInMap("KnowledgeId")
    public String knowledgeId;

    /**
     * <p>An array of perspective codes. Use these codes to retrieve answers from different perspectives for the same knowledge entry. Example: <code>Perspective=[&quot;FZJBY3raWr&quot;]</code>. When using an SDK, refer to its parameter definitions.</p>
     */
    @NameInMap("Perspective")
    public String perspectiveShrink;

    /**
     * <p>Specifies the environment to use. The default value is <code>false</code>, which indicates the production environment.</p>
     * <ul>
     * <li><p><code>true</code>: The test environment. This environment is for testing only. Do not use it in production due to potential instability and QPS limitations.</p>
     * </li>
     * <li><p><code>false</code>: The production environment.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SandBox")
    public Boolean sandBox;

    /**
     * <p>The unique ID of the user in the current session.</p>
     * 
     * <strong>example:</strong>
     * <p>custumer_123456</p>
     */
    @NameInMap("SenderId")
    public String senderId;

    /**
     * <p>The nickname of the user in the current session.</p>
     * 
     * <strong>example:</strong>
     * <p>用户123456</p>
     */
    @NameInMap("SenderNick")
    public String senderNick;

    /**
     * <p>The session ID, used to identify a user session and maintain context. For a new user, omit this parameter in the first call to the <code>Chat</code> API. The chatbot automatically starts a session and returns the <code>SessionId</code> in the response. To continue the conversation, include this <code>SessionId</code> in all subsequent requests. The maximum length is 64 characters.</p>
     * 
     * <strong>example:</strong>
     * <p>9c6ebdc6e66f46ecadab3434314f6959</p>
     */
    @NameInMap("SessionId")
    public String sessionId;

    /**
     * <p>The user\&quot;s input text.</p>
     * 
     * <strong>example:</strong>
     * <p>今天天气怎么样？</p>
     */
    @NameInMap("Utterance")
    public String utterance;

    /**
     * <p>A JSON-formatted string containing custom parameters to pass to various dialog engines.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;phone&quot;:123456789}</p>
     */
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

    public ChatShrinkRequest setSandBox(Boolean sandBox) {
        this.sandBox = sandBox;
        return this;
    }
    public Boolean getSandBox() {
        return this.sandBox;
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
